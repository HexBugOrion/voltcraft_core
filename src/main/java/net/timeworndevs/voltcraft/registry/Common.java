package net.timeworndevs.voltcraft.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.timeworndevs.voltcraft.Main;
import net.timeworndevs.voltcraft.block.PoweredFurnaceBlock;

public class Common {

    public static final Item PLACEHOLDERITEM1 = Registryhelper.makeItem("placeholderitem1", new Item(new FabricItemSettings()));
    public static final Item PLACEHOLDERITEM2 = Registryhelper.makeItem("placeholderitem2", new Item(new FabricItemSettings()));
    /*Machines*/
    public static final Block POWERED_FURNACE_BLOCK = Registryhelper.makeBlock("powered_furnace", new PoweredFurnaceBlock(AbstractBlock.Settings.of(Material.METAL).strength(3.5f,3.5f).sounds(BlockSoundGroup.ANVIL)), Groups.MACHINES);

    //todo: Re-order the resources based on type rather than position

    /*Ores*/

    public static final Block LEAD_ORE = Registryhelper.makeBlock("lead_ore", new Block(AbstractBlock.Settings.of(Material.STONE).strength(5.0f,6.0f).sounds(BlockSoundGroup.STONE)), Groups.MATERIALS);
    public static final Block NICKEL_ORE = Registryhelper.makeBlock("nickel_ore", new Block(AbstractBlock.Settings.of(Material.STONE).strength(5.0f,6.0f).sounds(BlockSoundGroup.STONE)), Groups.MATERIALS);
    public static final Block SILVER_ORE = Registryhelper.makeBlock("silver_ore", new Block(AbstractBlock.Settings.of(Material.STONE).strength(5.0f,6.0f).sounds(BlockSoundGroup.STONE)), Groups.MATERIALS);

    /*Deepslate Ores*/

    public static final Block DEEPSLATE_LEAD_ORE = Registryhelper.makeBlock("deepslate_lead_ore", new Block(AbstractBlock.Settings.of(Material.STONE).strength(5.0f,6.0f).sounds(BlockSoundGroup.DEEPSLATE)), Groups.MATERIALS);
    public static final Block DEEPSLATE_NICKEL_ORE = Registryhelper.makeBlock("deepslate_nickel_ore", new Block(AbstractBlock.Settings.of(Material.STONE).strength(5.0f,6.0f).sounds(BlockSoundGroup.DEEPSLATE)), Groups.MATERIALS);
    public static final Block DEEPSLATE_SILVER_ORE = Registryhelper.makeBlock("deepslate_silver_ore", new Block(AbstractBlock.Settings.of(Material.STONE).strength(5.0f,6.0f).sounds(BlockSoundGroup.DEEPSLATE)), Groups.MATERIALS);

    /*Ingots*/
    public static final Item LEAD_INGOT = Registryhelper.makeItem("lead_ingot", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item NICKEL_INGOT = Registryhelper.makeItem("nickel_ingot", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item SILVER_INGOT = Registryhelper.makeItem("silver_ingot", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item BRONZE_INGOT = Registryhelper.makeItem("bronze_ingot", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item INVAR_INGOT = Registryhelper.makeItem("invar_ingot", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item STEEL_INGOT = Registryhelper.makeItem("steel_ingot", new Item(new FabricItemSettings().group(Groups.MATERIALS)));


    /*Storage Blocks*/

    public static final Block LEAD_BLOCK = Registryhelper.makeBlock("lead_block", new Block(AbstractBlock.Settings.of(Material.METAL).strength(5.0f,6.0f).sounds(BlockSoundGroup.METAL)), Groups.MATERIALS);
    public static final Block NICKEL_BLOCK = Registryhelper.makeBlock("nickel_block", new Block(AbstractBlock.Settings.of(Material.METAL).strength(5.0f,6.0f).sounds(BlockSoundGroup.METAL)), Groups.MATERIALS);
    public static final Block SILVER_BLOCK = Registryhelper.makeBlock("silver_block", new Block(AbstractBlock.Settings.of(Material.METAL).strength(5.0f,6.0f).sounds(BlockSoundGroup.METAL)), Groups.MATERIALS);
    public static final Block BRONZE_BLOCK = Registryhelper.makeBlock("bronze_block", new Block(AbstractBlock.Settings.of(Material.METAL).strength(5.0f,6.0f).sounds(BlockSoundGroup.METAL)), Groups.MATERIALS);
    public static final Block INVAR_BLOCK = Registryhelper.makeBlock("invar_block", new Block(AbstractBlock.Settings.of(Material.METAL).strength(5.0f,6.0f).sounds(BlockSoundGroup.METAL)), Groups.MATERIALS);
    public static final Block STEEL_BLOCK = Registryhelper.makeBlock("steel_block", new Block(AbstractBlock.Settings.of(Material.METAL).strength(5.0f,6.0f).sounds(BlockSoundGroup.METAL)), Groups.MATERIALS);

    /*Nuggets*/

    public static final Item COPPER_NUGGET = Registryhelper.makeItem("copper_nugget", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item LEAD_NUGGET = Registryhelper.makeItem("lead_nugget", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item NICKEL_NUGGET = Registryhelper.makeItem("nickel_nugget", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item SILVER_NUGGET = Registryhelper.makeItem("silver_nugget", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item BRONZE_NUGGET = Registryhelper.makeItem("bronze_nugget", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item INVAR_NUGGET = Registryhelper.makeItem("invar_nugget", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item STEEL_NUGGET = Registryhelper.makeItem("steel_nugget", new Item(new FabricItemSettings().group(Groups.MATERIALS)));

    /*Plates*/

    public static final Item IRON_PLATE = Registryhelper.makeItem("iron_plate", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item GOLD_PLATE = Registryhelper.makeItem("gold_plate", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item COPPER_PLATE = Registryhelper.makeItem("copper_plate", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item NICKEL_PLATE = Registryhelper.makeItem("nickel_plate", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item SILVER_PLATE = Registryhelper.makeItem("silver_plate", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item BRONZE_PLATE = Registryhelper.makeItem("bronze_plate", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item INVAR_PLATE = Registryhelper.makeItem("invar_plate", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item STEEL_PLATE = Registryhelper.makeItem("steel_plate", new Item(new FabricItemSettings().group(Groups.MATERIALS)));

    /*Gears*/

    public static final Item IRON_GEAR = Registryhelper.makeItem("iron_gear", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item GOLD_GEAR = Registryhelper.makeItem("gold_gear", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item COPPER_GEAR = Registryhelper.makeItem("copper_gear", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item LEAD_GEAR = Registryhelper.makeItem("lead_gear", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item NICKEL_GEAR = Registryhelper.makeItem("nickel_gear", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item SILVER_GEAR = Registryhelper.makeItem("silver_gear", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item BRONZE_GEAR = Registryhelper.makeItem("bronze_gear", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item INVAR_GEAR = Registryhelper.makeItem("invar_gear", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item STEEL_GEAR = Registryhelper.makeItem("steel_gear", new Item(new FabricItemSettings().group(Groups.MATERIALS)));

    /*Rods*/

    public static final Item IRON_ROD = Registryhelper.makeItem("iron_rod", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item GOLD_ROD = Registryhelper.makeItem("gold_rod", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item COPPER_ROD = Registryhelper.makeItem("copper_rod", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item LEAD_ROD = Registryhelper.makeItem("lead_rod", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item NICKEL_ROD = Registryhelper.makeItem("nickel_rod", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item SILVER_ROD = Registryhelper.makeItem("silver_rod", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item BRONZE_ROD = Registryhelper.makeItem("bronze_rod", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item INVAR_ROD = Registryhelper.makeItem("invar_rod", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item STEEL_ROD = Registryhelper.makeItem("steel_rod", new Item(new FabricItemSettings().group(Groups.MATERIALS)));

    /*Dusts*/

    public static final Item IRON_DUST = Registryhelper.makeItem("iron_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item GOLD_DUST = Registryhelper.makeItem("gold_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item COPPER_DUST = Registryhelper.makeItem("copper_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item LEAD_DUST = Registryhelper.makeItem("lead_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item NICKEL_DUST = Registryhelper.makeItem("nickel_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item SILVER_DUST = Registryhelper.makeItem("silver_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item BRONZE_DUST = Registryhelper.makeItem("bronze_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item INVAR_DUST = Registryhelper.makeItem("invar_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item STEEL_DUST = Registryhelper.makeItem("steel_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));

    /*Ore Dusts*/

    public static final Item RAW_IRON_DUST = Registryhelper.makeItem("raw_iron_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item RAW_GOLD_DUST = Registryhelper.makeItem("raw_gold_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item RAW_COPPER_DUST = Registryhelper.makeItem("raw_copper_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item RAW_LEAD_DUST = Registryhelper.makeItem("raw_lead_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item RAW_NICKEL_DUST = Registryhelper.makeItem("raw_nickel_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));
    public static final Item RAW_SILVER_DUST = Registryhelper.makeItem("raw_silver_dust", new Item(new FabricItemSettings().group(Groups.MATERIALS)));

    /*Raw Ore Blocks*/

    public static final Block RAW_LEAD_BLOCK = Registryhelper.makeBlock("raw_lead_block", new Block(AbstractBlock.Settings.of(Material.METAL).strength(5.0f,6.0f).sounds(BlockSoundGroup.STONE)), Groups.MATERIALS);
    public static final Block RAW_NICKEL_BLOCK = Registryhelper.makeBlock("raw_nickel_block", new Block(AbstractBlock.Settings.of(Material.METAL).strength(5.0f,6.0f).sounds(BlockSoundGroup.STONE)), Groups.MATERIALS);
    public static final Block RAW_SILVER_BLOCK = Registryhelper.makeBlock("raw_silver_block", new Block(AbstractBlock.Settings.of(Material.METAL).strength(5.0f,6.0f).sounds(BlockSoundGroup.STONE)), Groups.MATERIALS);

}
