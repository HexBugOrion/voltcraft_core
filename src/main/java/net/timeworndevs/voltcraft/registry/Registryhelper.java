package net.timeworndevs.voltcraft.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.timeworndevs.voltcraft.Main;

public class Registryhelper {

    public static void registerMaterialBlock(Identifier id, Block block) {
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, new FabricItemSettings().group(Groups.MATERIALS)));
    }
    public static void registerMaterialItem(Identifier id) {
        Registry.register(Registry.ITEM, id, new Item(new Item.Settings().group(Groups.MATERIALS)));
    }
}
