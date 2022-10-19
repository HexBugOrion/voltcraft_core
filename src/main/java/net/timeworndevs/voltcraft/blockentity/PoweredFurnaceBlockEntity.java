package net.timeworndevs.voltcraft.blockentity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.timeworndevs.voltcraft.registry.BlockEntities;
import org.jetbrains.annotations.Nullable;

public class PoweredFurnaceBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxprogress = 72;

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(3, ItemStack.EMPTY);

    public PoweredFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntities.POWERED_FURNACE,pos, state);
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Powered Furnace");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    public static void tick(World world, BlockPos blockPos, BlockState blockState, PoweredFurnaceBlockEntity entity) {
    }
}
