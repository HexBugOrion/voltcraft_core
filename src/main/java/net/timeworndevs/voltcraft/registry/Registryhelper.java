package net.timeworndevs.voltcraft.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.timeworndevs.voltcraft.Main;

public class Registryhelper {

    public static Block makeBlock(String id, Block block, ItemGroup group) {
        makeBlockItem(id,block,group);
        return Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, id), block);
    }

    public static Item makeBlockItem(String id, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, id), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static Item makeItem(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, id), item);
    }

    public static void register() {
    }
}
