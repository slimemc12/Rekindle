package com.slimemc.rekindle.world.biomes;

import com.slimemc.rekindle.Rekindle;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.block.Blocks;
import net.minecraft.client.sound.MusicType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class LostLandsBiome {
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> LOST_SURFACE_BUILDER = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    Blocks.SMOOTH_BASALT.getDefaultState(),
                    Blocks.STONE.getDefaultState(),
                    Blocks.GRAVEL.getDefaultState()));
    private static final Biome LOST_LANDS = createLostLands();

    private static Biome createLostLands() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder()
                .spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 1, 1, 4))
                .spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.WITHER_SKELETON, 1, 1, 2))
                .spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SKELETON, 1, 4, 3));
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);

        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(LOST_SURFACE_BUILDER);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDefaultLakes(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);

        return (new Biome.Builder())
                .precipitation(Biome.Precipitation.RAIN)
                .category(Biome.Category.NONE)
                .depth(1F)
                .scale(1.8F)
                .temperature(0.8F)
                .downfall(0.004F)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x588BC0)
                        .waterFogColor(0x2A517A)
                        .fogColor(0xC8C8C8)
                        .skyColor(0x999999)
                        .particleConfig(new BiomeParticleConfig(ParticleTypes.WHITE_ASH, 0.07F))
                        .loopSound(SoundEvents.AMBIENT_BASALT_DELTAS_LOOP)
                        .moodSound(new BiomeMoodSound(SoundEvents.AMBIENT_CAVE, 600, 8, 2.0))
                        .music(MusicType.createIngameMusic(SoundEvents.MUSIC_NETHER_BASALT_DELTAS)).foliageColor(10387789)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }

    public static final RegistryKey<Biome> LOST_LANDS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(Rekindle.MOD_ID, "lost_lands"));
    public static void registerLostLands() {
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier(Rekindle.MOD_ID, "lost_lands"), LOST_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.BIOME, LOST_LANDS_KEY.getValue(), LOST_LANDS);
        OverworldBiomes.addContinentalBiome(LOST_LANDS_KEY, OverworldClimate.TEMPERATE, 0.2D);
        OverworldBiomes.addContinentalBiome(LOST_LANDS_KEY, OverworldClimate.COOL, 0.3D);
    }
}
