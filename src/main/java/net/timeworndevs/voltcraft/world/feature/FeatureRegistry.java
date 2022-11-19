package net.timeworndevs.voltcraft.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.timeworndevs.voltcraft.registry.Common;

import java.util.List;

public class FeatureRegistry {

    public static final List<OreFeatureConfig.Target> OVERWORLD_NICKEL_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, Common.NICKEL_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, Common.DEEPSLATE_NICKEL_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_LEAD_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, Common.LEAD_ORE.getDefaultState()), OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, Common.DEEPSLATE_LEAD_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig,?>> ORE_NICKEL = ConfiguredFeatures.register("nickel_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_NICKEL_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig,?>> ORE_NICKEL_SMALL = ConfiguredFeatures.register("nickel_ore_small", Feature.ORE, new OreFeatureConfig(OVERWORLD_NICKEL_ORES, 4));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig,?>> ORE_LEAD = ConfiguredFeatures.register("lead_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_LEAD_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig,?>> ORE_LEAD_FOREST = ConfiguredFeatures.register("lead_ore_forest", Feature.ORE, new OreFeatureConfig(OVERWORLD_LEAD_ORES, 9));

    public static void Register() {

    }
}
