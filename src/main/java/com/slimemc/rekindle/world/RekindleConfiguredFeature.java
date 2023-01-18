package com.slimemc.rekindle.world;

import com.slimemc.rekindle.registery.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class RekindleConfiguredFeature {
    public static final List<OreFeatureConfig.Target> OVERWORLD_ALUMINUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.ALUMINUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.ALUMINUM_BLOCK.getDefaultState()));
    public static final List<OreFeatureConfig.Target> OVERWORLD_SALT_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.SALT_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ALUMINUM_ORE =
            ConfiguredFeatures.register("aluminum_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_ALUMINUM_ORES, 8));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SALT_ORE =
            ConfiguredFeatures.register("salt_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_SALT_ORES, 8));


    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for Rekindle");
    }
}
