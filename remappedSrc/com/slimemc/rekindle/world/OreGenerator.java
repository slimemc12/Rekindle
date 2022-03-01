package com.slimemc.rekindle.world;

import com.slimemc.rekindle.Rekindle;
import com.slimemc.rekindle.registery.ModBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class OreGenerator {

    private static final ConfiguredFeature<?, ?> ALUMINUM_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.ALUMINUM_ORE.getDefaultState(), 9))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(20), YOffset.fixed(48)))).spreadHorizontally().repeat(4));
    private static final ConfiguredFeature<?, ?> SALT_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.SALT_ORE.getDefaultState(), 8))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(48), YOffset.fixed(80)))).spreadHorizontally().repeat(8));
    private static final ConfiguredFeature<?, ?> LIMESTONE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.LIMESTONE.getDefaultState(), 22))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(20), YOffset.fixed(45)))).spreadHorizontally().repeat(10));
    public static void registerOres() {
        RegistryKey<ConfiguredFeature<?,?>> aluminumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(Rekindle.MOD_ID,"aluminum_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, aluminumOreOverworld.getValue(), ALUMINUM_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, aluminumOreOverworld);
        RegistryKey<ConfiguredFeature<?,?>> saltOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(Rekindle.MOD_ID,"salt_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, saltOreOverworld.getValue(), SALT_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, saltOreOverworld);
        RegistryKey<ConfiguredFeature<?,?>> limestoneOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(Rekindle.MOD_ID,"limestone"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, limestoneOverworld.getValue(), LIMESTONE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, limestoneOverworld);
    }
}
