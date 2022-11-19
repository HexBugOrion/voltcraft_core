package net.timeworndevs.vcdatagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;
import net.timeworndevs.voltcraft.Main;
import net.timeworndevs.voltcraft.registry.Common;

import java.util.function.BiConsumer;

public class LootTableGen extends SimpleFabricLootTableProvider {
    public LootTableGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        identifierBuilderBiConsumer.accept(new Identifier(Main.MOD_ID, "blocks/lead_block"), BlockLootTableGenerator.drops(Common.LEAD_BLOCK ));
    }
}
