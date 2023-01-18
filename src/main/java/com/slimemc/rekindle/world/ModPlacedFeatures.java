package com.slimemc.rekindle.world;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> ALUMINUM_ORE_PLACED = PlacedFeatures.register("aluminum_ore_placed",
            RekindleConfiguredFeature.ALUMINUM_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-40), YOffset.aboveBottom(20))));
    public static final RegistryEntry<PlacedFeature> SALT_ORE_PLACED = PlacedFeatures.register("salt_ore_placed",
            RekindleConfiguredFeature.SALT_ORE, ModOreFeatures.modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(35), YOffset.aboveBottom(128))));
}
