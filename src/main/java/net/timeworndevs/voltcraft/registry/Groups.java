package net.timeworndevs.voltcraft.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.timeworndevs.voltcraft.Main;

public class Groups {
    public static final ItemGroup MATERIALS =  FabricItemGroupBuilder.create(new Identifier(Main.MOD_ID, "materials")).icon(()-> new ItemStack(Items.IRON_INGOT)).build();
    public static final ItemGroup BLOCKS = FabricItemGroupBuilder.create(new Identifier(Main.MOD_ID, "blocks")).icon(()-> new ItemStack(Items.IRON_ORE)).build();
    public static final ItemGroup MACHINES = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "machines"), ()-> new ItemStack(Common.POWERED_FURNACE_BLOCK));

}