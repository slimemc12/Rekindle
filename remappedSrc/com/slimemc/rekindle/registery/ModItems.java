package com.slimemc.rekindle.registery;


import com.slimemc.rekindle.Rekindle;
import com.slimemc.rekindle.items.BlazingSteelArmorItem;
import com.slimemc.rekindle.items.BlazingSteelSwordItem;
import com.slimemc.rekindle.items.ChilliItem;
import com.slimemc.rekindle.materials.BlazingSteelArmorMaterial;
import com.slimemc.rekindle.materials.BlazingSteelToolMaterial;
import com.slimemc.rekindle.util.item.RekindleAxe;
import com.slimemc.rekindle.util.item.RekindleHoe;
import com.slimemc.rekindle.util.item.RekindlePickaxe;
import com.slimemc.rekindle.materials.SteelArmorMaterial;
import com.slimemc.rekindle.materials.SteelToolMaterial;
import com.slimemc.rekindle.util.RekindleMusicDiscItem;
import com.slimemc.rekindle.util.RekindleSoundEvents;
import com.slimemc.rekindle.items.SteelArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item CARBONISED_IRON;
    public static final Item STEEL_INGOT;
    public static final Item STEEL_NUGGET;
    public static final Item ALUMINUM_INGOT;
    public static final Item ALUMINUM_NUGGET;
    public static final Item STEEL_SHOVEL;
    public static final Item STEEL_HOE;
    public static final Item STEEL_SWORD;
    public static final Item STEEL_AXE;
    public static final Item STEEL_PICKAXE;
    public static final Item STEEL_HELMET;
    public static final Item STEEL_CHESTPLATE;
    public static final Item STEEL_LEGGINGS;
    public static final Item STEEL_BOOTS;
    public static final Item STEEL_BLOCK;
    public static final Item STEEL_TRAPDOOR;
    public static final Item STEEL_DOOR;
    public static final Item STEEL_BARS;
    public static final Item ALUMINUM_BLOCK;
    public static final Item ALUMINUM_ORE;
    public static final Item SALT_ORE;
    public static final Item ANDESITE_BRICKS;
    public static final Item ANDESITE_LARGE_BRICKS;
    public static final Item ANDESITE_FANCY_BRICKS;
    public static final Item ANDESITE_TILES;
    public static final Item ANDESITE_PAVING;
    public static final Item ANDESITE_PILLAR;
    public static final Item DIORITE_BRICKS;
    public static final Item DIORITE_LARGE_BRICKS;
    public static final Item DIORITE_FANCY_BRICKS;
    public static final Item DIORITE_TILES;
    public static final Item DIORITE_PAVING;
    public static final Item DIORITE_PILLAR;
    public static final Item GRANITE_BRICKS;
    public static final Item GRANITE_LARGE_BRICKS;
    public static final Item GRANITE_FANCY_BRICKS;
    public static final Item GRANITE_TILES;
    public static final Item GRANITE_PAVING;
    public static final Item GRANITE_PILLAR;
    public static final Item LIMESTONE;
    public static final Item POLISHED_LIMESTONE;
    public static final Item POLISHED_LIMESTONE_SLAB;
    public static final Item LIMESTONE_SLAB;
    public static final Item LIMESTONE_STAIRS;
    public static final Item POLISHED_LIMESTONE_STAIRS;
    public static final Item LIMESTONE_BRICKS;
    public static final Item LIMESTONE_LARGE_BRICKS;
    public static final Item LIMESTONE_FANCY_BRICKS;
    public static final Item LIMESTONE_TILES;
    public static final Item LIMESTONE_PAVING;
    public static final Item LIMESTONE_PILLAR;
    public static final Item COBBLED_DIRT;
    public static final Item COOKED_BACON;
    public static final Item ICE_CREAM;
    public static final Item NOODLES;
    public static final Item MEATBALLS;
    public static final Item RAW_BACON;
    public static final Item MEATBALL_SANDWHICH;
    public static final Item PASTA;
    public static final Item SPAGHETTI;
    public static final Item TOMATO;
    public static final Item KIWI;
    public static final Item RASPBERRY;
    public static final Item STRAWBERRY;
    public static final Item PEANUT;
    public static final Item CORN;
    public static final Item ROASTED_CORN;
    public static final Item PEANUT_BUTTER_BREAD;
    public static final Item SALMON_SUSHI;
    public static final Item CHICKEN_SUSHI;
    public static final Item CHILLI;
    public static final Item PEPPER_POWDER;
    public static final Item TOMATO_SEEDS;
    public static final Item KIWI_SEEDS;
    public static final Item RASPBERRY_SEEDS;
    public static final Item STRAWBERRY_SEEDS;
    public static final Item PEANUT_SEEDS;
    public static final Item CORN_SEEDS;
    public static final Item RICE;
    public static final Item SALT;
    public static final Item PEANUT_BUTTER;
    public static final Item BUTTER;
    public static final Item CREAM;
    public static final Item LARGE_BOTTLE;
    public static final Item BUSH;
    public static final Item MUSIC_DISC_PILLAGED;
    public static final Item ALLOY_FURNACE;
    public static final Item KNIFE;
    public static final Item BLAZING_STEEL_INGOT;
    public static final Item UNPROCESSED_BLAZING_STEEL;
    public static final Item BLAZING_STEEL_SWORD;
    public static final Item BLAZING_STEEL_AXE;
    public static final Item BLAZING_STEEL_PICKAXE;
    public static final Item BLAZING_STEEL_HELMET;
    public static final Item BLAZING_STEEL_CHESTPLATE;
    public static final Item BLAZING_STEEL_LEGGINGS;
    public static final Item BLAZING_STEEL_BOOTS;

    public static void registerModItems() {
        System.out.println("Registering ModItems for Rekindle");
    }
    private static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Rekindle.MOD_ID, id), item);
    }

    static {
        CARBONISED_IRON =register("carbonised_iron", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_INGOT = register("steel_ingot", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_NUGGET = register("steel_nugget", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP)));
        ALUMINUM_INGOT = register("aluminum_ingot", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP)));
        ALUMINUM_NUGGET = register("aluminum_nugget", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_HOE = register("steel_hoe", new RekindleHoe(SteelToolMaterial.INSTANCE, 0, -1F, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_SHOVEL = register("steel_shovel", new ShovelItem(SteelToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_SWORD = register("steel_sword", new SwordItem(SteelToolMaterial.INSTANCE, 4, -2.4F, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_AXE = register("steel_axe", new RekindleAxe(SteelToolMaterial.INSTANCE, 6.5F, -3.0F, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_PICKAXE = register("steel_pickaxe", new RekindlePickaxe(SteelToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_HELMET = register("steel_helmet", new SteelArmorItem(SteelArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_CHESTPLATE = register("steel_chestplate", new ArmorItem(SteelArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_LEGGINGS = register("steel_leggings", new ArmorItem(SteelArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_BOOTS = register("steel_boots", new ArmorItem(SteelArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_BLOCK = register("steel_block", new BlockItem(ModBlocks.STEEL_BLOCK, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_TRAPDOOR = register("steel_trapdoor", new BlockItem(ModBlocks.STEEL_TRAPDOOR, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_DOOR = register("steel_door", new TallBlockItem(ModBlocks.STEEL_DOOR, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STEEL_BARS = register("steel_bars", new BlockItem(ModBlocks.STEEL_BARS, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        ALUMINUM_BLOCK = register("aluminum_block", new BlockItem(ModBlocks.ALUMINUM_BLOCK, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        ALUMINUM_ORE = register("aluminum_ore", new BlockItem(ModBlocks.ALUMINUM_ORE, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        SALT_ORE = register("salt_ore", new BlockItem(ModBlocks.SALT_ORE, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        ANDESITE_BRICKS = register("andesite_bricks", new BlockItem(ModBlocks.ANDESITE_BRICKS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        ANDESITE_LARGE_BRICKS = register("andesite_large_bricks", new BlockItem(ModBlocks.ANDESITE_LARGE_BRICKS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        ANDESITE_FANCY_BRICKS = register("andesite_fancy_bricks", new BlockItem(ModBlocks.ANDESITE_FANCY_BRICKS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        ANDESITE_TILES = register("andesite_tiles", new BlockItem(ModBlocks.ANDESITE_TILES, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        ANDESITE_PAVING = register("andesite_paving", new BlockItem(ModBlocks.ANDESITE_PAVING, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        ANDESITE_PILLAR = register("andesite_pillar", new BlockItem(ModBlocks.ANDESITE_PILLAR, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        DIORITE_BRICKS = register("diorite_bricks", new BlockItem(ModBlocks.DIORITE_BRICKS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        DIORITE_LARGE_BRICKS = register("diorite_large_bricks", new BlockItem(ModBlocks.DIORITE_LARGE_BRICKS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        DIORITE_FANCY_BRICKS = register("diorite_fancy_bricks", new BlockItem(ModBlocks.DIORITE_FANCY_BRICKS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        DIORITE_TILES = register("diorite_tiles", new BlockItem(ModBlocks.DIORITE_TILES, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        DIORITE_PAVING = register("diorite_paving", new BlockItem(ModBlocks.DIORITE_PAVING, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        DIORITE_PILLAR = register("diorite_pillar", new BlockItem(ModBlocks.DIORITE_PILLAR, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        GRANITE_BRICKS = register("granite_bricks", new BlockItem(ModBlocks.GRANITE_BRICKS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        GRANITE_LARGE_BRICKS = register("granite_large_bricks", new BlockItem(ModBlocks.GRANITE_LARGE_BRICKS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        GRANITE_FANCY_BRICKS = register("granite_fancy_bricks", new BlockItem(ModBlocks.GRANITE_FANCY_BRICKS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        GRANITE_TILES = register("granite_tiles", new BlockItem(ModBlocks.GRANITE_TILES, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        GRANITE_PAVING = register("granite_paving", new BlockItem(ModBlocks.GRANITE_PAVING, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        GRANITE_PILLAR = register("granite_pillar", new BlockItem(ModBlocks.GRANITE_PILLAR, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        LIMESTONE = register("limestone", new BlockItem(ModBlocks.LIMESTONE, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        POLISHED_LIMESTONE = register("polished_limestone", new BlockItem(ModBlocks.POLISHED_LIMESTONE, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        POLISHED_LIMESTONE_SLAB = register("polished_limestone_slab", new BlockItem(ModBlocks.POLISHED_LIMESTONE_SLAB, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        LIMESTONE_SLAB = register("limestone_slab", new BlockItem(ModBlocks.LIMESTONE_SLAB, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        LIMESTONE_STAIRS = register("limestone_stairs", new BlockItem(ModBlocks.LIMESTONE_STAIRS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        POLISHED_LIMESTONE_STAIRS = register("polished_limestone_stairs", new BlockItem(ModBlocks.POLISHED_LIMESTONE_STAIRS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        LIMESTONE_BRICKS = register("limestone_bricks", new BlockItem(ModBlocks.LIMESTONE_BRICKS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        LIMESTONE_LARGE_BRICKS = register("limestone_large_bricks", new BlockItem(ModBlocks.LIMESTONE_LARGE_BRICKS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        LIMESTONE_FANCY_BRICKS = register("limestone_fancy_bricks", new BlockItem(ModBlocks.LIMESTONE_FANCY_BRICKS, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        LIMESTONE_TILES = register("limestone_tiles", new BlockItem(ModBlocks.LIMESTONE_TILES, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        LIMESTONE_PAVING = register("limestone_paving", new BlockItem(ModBlocks.LIMESTONE_PAVING, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        LIMESTONE_PILLAR = register("limestone_pillar", new BlockItem(ModBlocks.LIMESTONE_PILLAR, new Item.Settings().group(Rekindle.ITEM_GROUP_PALETTES)));
        COBBLED_DIRT = register("cobbled_dirt", new BlockItem(ModBlocks.COBBLED_DIRT, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        COOKED_BACON = register("cooked_bacon", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(6f).meat().build())));
        ICE_CREAM = register("ice_cream", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(4f).build())));
        NOODLES = register("noodles", new MushroomStewItem(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).build())));
        MEATBALLS = register("meatballs", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(2f).build())));
        RAW_BACON = register("raw_bacon", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(10f).build())));
        MEATBALL_SANDWHICH = register("meatball_sandwhich", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(7).saturationModifier(9f).build())));
        PASTA = register("pasta", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(3f).build())));
        SPAGHETTI = register("spaghetti", new MushroomStewItem(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(6f).build())));
        TOMATO = register("tomato", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(2f).build())));
        KIWI = register("kiwi", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(2.5f).build())));
        RASPBERRY = register("raspberry", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(2.5f).build())));
        STRAWBERRY = register("strawberry", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(2.5f).build())));
        PEANUT = register("peanut", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(2.5f).build())));
        CORN = register("corn", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(2.5f).build())));
        ROASTED_CORN = register("roasted_corn", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(4.5f).build())));
        PEANUT_BUTTER_BREAD = register("peanut_butter_bread", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(5f).build())));
        SALMON_SUSHI = register("salmon_sushi", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(5f).build())));
        CHICKEN_SUSHI = register("chicken_sushi", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(5f).build())));
        CHILLI = register("chilli", new ChilliItem(new Item.Settings().group(Rekindle.ITEM_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 2), 1F).snack().alwaysEdible().build())));
        PEPPER_POWDER = register("pepper_powder", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP)));
        TOMATO_SEEDS = register("tomato_seeds", new AliasedBlockItem(ModBlocks.TOMATO_CROP, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        KIWI_SEEDS = register("kiwi_seeds", new AliasedBlockItem(ModBlocks.KIWI_CROP, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        RASPBERRY_SEEDS = register("raspberry_seeds", new AliasedBlockItem(ModBlocks.RASPBERRY_CROP, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        STRAWBERRY_SEEDS = register("strawberry_seeds", new AliasedBlockItem(ModBlocks.STRAWBERRY_CROP, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        PEANUT_SEEDS = register("peanut_seeds", new AliasedBlockItem(ModBlocks.PEANUT_CROP, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        CORN_SEEDS = register("corn_seeds", new AliasedBlockItem(ModBlocks.CORN_CROP, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        RICE = register("rice", new AliasedBlockItem(ModBlocks.RICE_CROP, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        SALT = register("salt", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP)));
        PEANUT_BUTTER = register("peanut_butter", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).recipeRemainder(ModItems.LARGE_BOTTLE)));
        BUTTER = register("butter", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP)));
        CREAM = register("cream", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).recipeRemainder(Items.BOWL)));
        LARGE_BOTTLE = register("large_bottle", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP)));
        BUSH = register("bush", new BlockItem(ModBlocks.BUSH, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        MUSIC_DISC_PILLAGED = register("music_disc_pillaged", new RekindleMusicDiscItem(14, RekindleSoundEvents.MUSIC_DISC_PILLAGED, (new Item.Settings()).maxCount(1).group(Rekindle.ITEM_GROUP).rarity(Rarity.RARE)));
        ALLOY_FURNACE = register("alloy_furnace", new BlockItem(ModBlocks.ALLOY_FURNACE, new Item.Settings().group(Rekindle.ITEM_GROUP)));
        KNIFE = register("knife", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).maxCount(1).recipeRemainder(ModItems.KNIFE)));
        BLAZING_STEEL_INGOT = register("blazing_steel_ingot", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).fireproof().rarity(Rarity.UNCOMMON)));
        UNPROCESSED_BLAZING_STEEL = register("unprocessed_blazing_steel", new Item(new Item.Settings().group(Rekindle.ITEM_GROUP).rarity(Rarity.UNCOMMON)));
        BLAZING_STEEL_SWORD = register("blazing_steel_sword", new BlazingSteelSwordItem(BlazingSteelToolMaterial.INSTANCE, 5, -2.0F, new Item.Settings().group(Rekindle.ITEM_GROUP).fireproof().rarity(Rarity.UNCOMMON)));
        BLAZING_STEEL_AXE = register("blazing_steel_axe", new RekindleAxe(BlazingSteelToolMaterial.INSTANCE, 6.5F, -2.0F, new Item.Settings().group(Rekindle.ITEM_GROUP).fireproof().rarity(Rarity.UNCOMMON)));
        BLAZING_STEEL_PICKAXE = register("blazing_steel_pickaxe", new RekindlePickaxe(BlazingSteelToolMaterial.INSTANCE, 1, -1.8F, new Item.Settings().group(Rekindle.ITEM_GROUP).fireproof().rarity(Rarity.UNCOMMON)));
        BLAZING_STEEL_HELMET = register("blazing_steel_helmet", new BlazingSteelArmorItem(BlazingSteelArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(Rekindle.ITEM_GROUP).fireproof().rarity(Rarity.UNCOMMON)));
        BLAZING_STEEL_CHESTPLATE = register("blazing_steel_chestplate", new ArmorItem(BlazingSteelArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(Rekindle.ITEM_GROUP).fireproof().rarity(Rarity.UNCOMMON)));
        BLAZING_STEEL_LEGGINGS = register("blazing_steel_leggings", new ArmorItem(BlazingSteelArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(Rekindle.ITEM_GROUP).fireproof().rarity(Rarity.UNCOMMON)));
        BLAZING_STEEL_BOOTS = register("blazing_steel_boots", new ArmorItem(BlazingSteelArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(Rekindle.ITEM_GROUP).fireproof().rarity(Rarity.UNCOMMON)));
    }

}

