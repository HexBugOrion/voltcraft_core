package net.timeworndevs.voltcraft.world.generation;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.timeworndevs.voltcraft.world.feature.PlacedOreFeatures;

public class OreGeneration {

    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, PlacedOreFeatures.NICKEL_ORE_UPPER.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, PlacedOreFeatures.NICKEL_ORE_MIDDLE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, PlacedOreFeatures.NICKEL_ORE_SMALL.getKey().get());
    }
}
