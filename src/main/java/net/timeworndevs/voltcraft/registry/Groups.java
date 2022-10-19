package net.timeworndevs.voltcraft.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.timeworndevs.voltcraft.Main;

public class Groups {
    public static final ItemGroup MATERIALS = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID), ()-> new ItemStack(Common.MATERIALS_ICON));

}