package net.timeworndevs.voltcraft.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.timeworndevs.voltcraft.Main;

public class Groups {
    public static final ItemGroup MATERIALS = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "materials"), ()-> new ItemStack(Common.IRON_GEAR));
    public static final ItemGroup MACHINES = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "machines"), ()-> new ItemStack(Common.POWERED_FURNACE_BLOCK));

}