package net.timeworndevs.voltcraft.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class PlacedOreFeatures {

    public static final RegistryEntry<PlacedFeature> NICKEL_ORE_UPPER;
    public static final RegistryEntry<PlacedFeature> NICKEL_ORE_MIDDLE;
    public static final RegistryEntry<PlacedFeature> NICKEL_ORE_SMALL;
    public static final RegistryEntry<PlacedFeature> LEAD_ORE;
    public static final RegistryEntry<PlacedFeature> LEAD_ORE_FOREST;

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }

    static {

        NICKEL_ORE_UPPER = PlacedFeatures.register("nickel_ore_upper", FeatureRegistry.ORE_NICKEL, modifiersWithCount(72, HeightRangePlacementModifier.trapezoid(YOffset.fixed(72), YOffset.fixed(376))));
        NICKEL_ORE_MIDDLE = PlacedFeatures.register("nickel_ore_middle", FeatureRegistry.ORE_NICKEL, modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-32), YOffset.fixed(48))));
        NICKEL_ORE_SMALL = PlacedFeatures.register("nickel_ore_small", FeatureRegistry.ORE_NICKEL_SMALL, modifiersWithCount(8, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

        LEAD_ORE = PlacedFeatures.register("lead_ore", FeatureRegistry.ORE_LEAD, modifiersWithCount(50, HeightRangePlacementModifier.trapezoid(YOffset.getBottom(), YOffset.fixed(50))));
        LEAD_ORE_FOREST = PlacedFeatures.register("lead_ore_forest", FeatureRegistry.ORE_LEAD_FOREST, modifiersWithCount(20, HeightRangePlacementModifier.uniform(YOffset.fixed(50), YOffset.fixed(80))));
    }
}