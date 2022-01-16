package com.slimemc.rekindle.world;

import com.slimemc.rekindle.Rekindle;
import com.slimemc.rekindle.features.BushFeature;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class FeatureGenerator {
    private static final Feature<DefaultFeatureConfig> BUSH_FEATURE = new BushFeature(DefaultFeatureConfig.CODEC);
    public static final ConfiguredFeature<?, ?> BUSH_FEATURE_CONFIGURED = BUSH_FEATURE.configure(FeatureConfig.DEFAULT)
            .decorate(Decorator.CHANCE.configure(new ChanceDecoratorConfig(1)));

    public static void registerFeatures() {
        Registry.register(Registry.FEATURE, new Identifier(Rekindle.MOD_ID, "bush_feature"), BUSH_FEATURE);
        RegistryKey<ConfiguredFeature<?, ?>> bushFeature = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("rekindle", "bush_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, bushFeature.getValue(), BUSH_FEATURE_CONFIGURED);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.VEGETAL_DECORATION, bushFeature);
    }
}
