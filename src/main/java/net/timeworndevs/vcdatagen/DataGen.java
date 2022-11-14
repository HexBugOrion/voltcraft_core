package net.timeworndevs.vcdatagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.timeworndevs.voltcraft.registry.Common;

public class DataGen implements DataGeneratorEntrypoint {

   //todo: use this sometime

   //public static String MOD_ID = "voltcraft";

   //private static class ModelGenerator extends FabricModelProvider {

   //    public ModelGenerator(FabricDataGenerator dataGenerator) {
   //        super(dataGenerator);
   //    }

   //    @Override
   //    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.LEAD_BLOCK);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.LEAD_ORE);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.DEEPSLATE_LEAD_ORE);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.RAW_LEAD_BLOCK);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.NICKEL_BLOCK);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.NICKEL_ORE);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.DEEPSLATE_NICKEL_ORE);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.RAW_NICKEL_BLOCK);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.SILVER_BLOCK);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.SILVER_ORE);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.DEEPSLATE_SILVER_ORE);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.RAW_SILVER_BLOCK);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.BRONZE_BLOCK);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.INVAR_BLOCK);
   //        blockStateModelGenerator.registerSimpleCubeAll(Common.STEEL_BLOCK);
   //    }

   //    @Override
   //    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
   //        itemModelGenerator.register(Item.fromBlock(Common.LEAD_BLOCK), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.LEAD_ORE), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.DEEPSLATE_LEAD_ORE), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.RAW_LEAD_BLOCK), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.NICKEL_BLOCK), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.NICKEL_ORE), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.DEEPSLATE_NICKEL_ORE), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.RAW_NICKEL_BLOCK), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.SILVER_BLOCK), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.SILVER_ORE), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.DEEPSLATE_SILVER_ORE), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.RAW_SILVER_BLOCK), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.BRONZE_BLOCK), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.INVAR_BLOCK), Models.GENERATED);
   //        itemModelGenerator.register(Item.fromBlock(Common.STEEL_BLOCK), Models.GENERATED);

   //    }
    //}
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        //fabricDataGenerator.addProvider(ModelGenerator::new);
    }
}
