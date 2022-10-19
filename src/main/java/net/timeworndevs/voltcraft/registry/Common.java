package net.timeworndevs.voltcraft.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.timeworndevs.voltcraft.Main;

public class Common {
    public static final Item MATERIALS_ICON = new Item(new Item.Settings());
    public static final Block POWERED_FURNACE_BLOCK = new Block(AbstractBlock.Settings.of(Material.METAL).strength(3.5f,3.5f).sounds(BlockSoundGroup.ANVIL));
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "materials_icon"), MATERIALS_ICON);
        basicMaterialList();

    }
    public static void basicMaterialList() {
        appendSurrogateNugget("copper");
        makeSurrogateList("gold");
        makeSurrogateList("iron");
        appendOres("nickel");
        appendOres("silver");
        appendOres("lead");
        makeList("bronze");
        makeList("invar");
        makeList("steel");
    }
    public static void makeList(String id) {
        Registryhelper.registerMaterialBlock(new Identifier(Main.MOD_ID, id + "_block"), new Block(AbstractBlock.Settings.of(Material.METAL).strength(5.0f,6.0f).sounds(BlockSoundGroup.METAL)));
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, id + "_ingot"));
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, id + "_nugget"));
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, id + "_rod"));
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, id + "_plate"));
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, id + "_gear"));
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, id + "_dust"));
    }
    public static void appendOres(String id){
        Registryhelper.registerMaterialBlock(new Identifier(Main.MOD_ID, id + "_ore"), new Block(AbstractBlock.Settings.of(Material.STONE).strength(3.0f,3.0f).sounds(BlockSoundGroup.STONE)));
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, "raw_" + id));
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, "raw_" + id + "_dust"));
        Registryhelper.registerMaterialBlock(new Identifier(Main.MOD_ID, "raw_" + id + "_block"), new Block(AbstractBlock.Settings.of(Material.METAL).strength(5.0f,6.0f).sounds(BlockSoundGroup.METAL)));
        makeList(id);
    }
    public static void appendSurrogateNugget(String id){
        makeSurrogateList(id);
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, id + "_nugget"));
    }
    public static void makeSurrogateList(String id) {
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, id + "_rod"));
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, id + "_plate"));
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, id + "_gear"));
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, "raw_" + id + "_dust"));
        Registryhelper.registerMaterialItem(new Identifier(Main.MOD_ID, id + "_dust"));
    }
}
