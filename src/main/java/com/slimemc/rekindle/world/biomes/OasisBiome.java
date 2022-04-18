package com.slimemc.rekindle.world.biomes;

import com.slimemc.rekindle.Rekindle;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class OasisBiome {
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> OASIS_SURFACE_BUILDER = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    Blocks.SAND.getDefaultState(),
                    Blocks.SANDSTONE.getDefaultState(),
                    Blocks.STONE.getDefaultState()));
    private static final Biome OASIS = createLostLands();

    private static Biome createLostLands() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 20, 5, 10);

        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(OASIS_SURFACE_BUILDER);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDefaultLakes(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
        DefaultBiomeFeatures.addJungleTrees(generationSettings);
        DefaultBiomeFeatures.addDesertMobs(spawnSettings);
        DefaultBiomeFeatures.addDesertFeatures(generationSettings);
        DefaultBiomeFeatures.addDesertVegetation(generationSettings);
        DefaultBiomeFeatures.addEmeraldOre(generationSettings);
        return (new Biome.Builder())
                .precipitation(Biome.Precipitation.RAIN)
                .category(Biome.Category.BEACH)
                .depth(0.4F)
                .scale(0.05F)
                .temperature(0.7F)
                .downfall(0.7F)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x18C7F2)
                        .waterFogColor(0x17A9F1)
                        .fogColor(0xD8F0F1)
                        .skyColor(0x1190CE)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }
    public static final RegistryKey<Biome> OASIS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(Rekindle.MOD_ID, "oasis"));
    public static void registerOasis() {
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier(Rekindle.MOD_ID, "oasis"), OASIS_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.BIOME, OASIS_KEY.getValue(), OASIS);
        OverworldBiomes.addContinentalBiome(OASIS_KEY, OverworldClimate.DRY, 0.25D);
        OverworldBiomes.addContinentalBiome(OASIS_KEY, OverworldClimate.TEMPERATE, 0.003D);
    }

}
