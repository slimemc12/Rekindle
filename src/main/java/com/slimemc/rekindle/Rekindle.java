package com.slimemc.rekindle;


import com.slimemc.rekindle.enchantments.ModEnchantments;
import com.slimemc.rekindle.loot_tables.LootTableModifiers;
import com.slimemc.rekindle.recipes.RekindleRecipes;
import com.slimemc.rekindle.registery.ModBlocks;
import com.slimemc.rekindle.registery.ModItems;
import com.slimemc.rekindle.status_effects.RekindlePotions;
import com.slimemc.rekindle.status_effects.RekindleStatusEffects;
import com.slimemc.rekindle.util.RekindleSoundEvents;
import com.slimemc.rekindle.util.item.RekindleRegistries;
import com.slimemc.rekindle.world.ModWorldGen;
import com.slimemc.rekindle.world.RekindleConfiguredFeature;
import com.slimemc.rekindle.world.biomes.LostLandsBiome;
import com.slimemc.rekindle.world.biomes.OasisBiome;
import com.slimemc.rekindle.world.OreGenerator;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Rekindle implements ModInitializer {

    public static final String MOD_ID = "rekindle";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "rekindle"),
            () -> new ItemStack(ModBlocks.STEEL_BLOCK));
    public static final ItemGroup ITEM_GROUP_PALETTES = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "rekindle_palette"),
            () -> new ItemStack(ModBlocks.LIMESTONE_FANCY_BRICKS));

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        RekindleRegistries.registerFuels();
        RekindleRecipes.registerRecipes();
        ModEnchantments.registerEnchantments();
        OreGenerator.registerOres();
        LostLandsBiome.registerLostLands();
        OasisBiome.registerOasis();
        RekindleStatusEffects.registerElectrocutionEffect();
        RekindlePotions.registerPotions();
        LootTableModifiers.modifyLootTables();
        RekindleSoundEvents.registerSoundEvents();
        ModWorldGen.registerModWorldGen();
        RekindleConfiguredFeature.registerConfiguredFeatures();
        System.out.println("Rekindle mod was loaded successfully");
    }

}

