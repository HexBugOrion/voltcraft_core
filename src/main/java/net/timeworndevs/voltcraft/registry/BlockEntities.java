package net.timeworndevs.voltcraft.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.timeworndevs.voltcraft.Main;
import net.timeworndevs.voltcraft.blockentity.PoweredFurnaceBlockEntity;

public class BlockEntities {

    public static BlockEntityType<PoweredFurnaceBlockEntity> POWERED_FURNACE;

    public static void register(){
        POWERED_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Main.MOD_ID, "powered_furnace_entity"), FabricBlockEntityTypeBuilder.create(PoweredFurnaceBlockEntity::new, Common.POWERED_FURNACE_BLOCK).build(null));
    }
}
