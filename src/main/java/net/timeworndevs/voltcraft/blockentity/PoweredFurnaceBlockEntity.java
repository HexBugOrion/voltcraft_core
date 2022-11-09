package net.timeworndevs.voltcraft.blockentity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.timeworndevs.voltcraft.registry.BlockEntities;
import net.timeworndevs.voltcraft.registry.Common;
import net.timeworndevs.voltcraft.screen.PoweredFurnaceScreenHandler;
import org.jetbrains.annotations.Nullable;

public class PoweredFurnaceBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    public PoweredFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntities.POWERED_FURNACE,pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index){
                    case 0: return PoweredFurnaceBlockEntity.this.progress;
                    case 1: return PoweredFurnaceBlockEntity.this.maxProgress;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0:PoweredFurnaceBlockEntity.this.progress = value;break;
                    case 1:PoweredFurnaceBlockEntity.this.maxProgress = value;break;
                }
            }
            public int size() {
                return 2;
            }
        };
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("container.voltcraft.powered-furnace");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new PoweredFurnaceScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("powered_furnace.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("powered_furnace.progress");
    }


    private void resetProgress() {
        this.progress = 0;
    }


    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    public static void tick(World world, BlockPos blockPos, BlockState blockState, PoweredFurnaceBlockEntity entity) {
        if (world.isClient()){
            return;
        }
        if (hasRecipe(entity)){
            entity.progress++;
            markDirty(world, blockPos, blockState);
            if (entity.progress >= entity.maxProgress){
                craftItem(entity);
            }
        }
        else {
           entity.resetProgress();
           markDirty(world,blockPos, blockState);
        }
    }


    private static void craftItem(PoweredFurnaceBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++){
            inventory.setStack(i, entity.getStack(i));

            if (hasRecipe(entity)) {
                entity.removeStack(1,1);

                entity.setStack(2, new ItemStack(Common.PLACEHOLDERITEM2, entity.getStack(2).getCount() + 1));
            }
        }
    }

    private static boolean hasRecipe(PoweredFurnaceBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++){
            inventory.setStack(i, entity.getStack(i));
        }
        /*Will replace with furnace recipes soon*/

        boolean hasItem1InFirstSlot = entity.getStack(1).getItem() == Common.PLACEHOLDERITEM1;

        return hasItem1InFirstSlot && canInsertAmountIntoOutputSlot(inventory, 1) && canInsertItemIntoOutputSlot(inventory, Common.PLACEHOLDERITEM2);
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(2).getItem() == output || inventory.getStack(2).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory, int count) {
        return inventory.getStack(2).getMaxCount() > inventory.getStack(2).getCount() + count;
    }
}

