package com.slimemc.rekindle.registery;

import com.slimemc.rekindle.Rekindle;
import com.slimemc.rekindle.blocks.*;
import com.slimemc.rekindle.util.*;
import com.slimemc.rekindle.util.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block STEEL_BLOCK;
    public static final Block ALUMINUM_BLOCK;
    public static final Block ALUMINUM_ORE;
    public static final Block ANDESITE_BRICKS;
    public static final Block ANDESITE_LARGE_BRICKS;
    public static final Block ANDESITE_FANCY_BRICKS;
    public static final Block ANDESITE_TILES;
    public static final Block ANDESITE_PAVING;
    public static final Block ANDESITE_PILLAR;
    public static final Block DIORITE_BRICKS;
    public static final Block DIORITE_LARGE_BRICKS;
    public static final Block DIORITE_FANCY_BRICKS;
    public static final Block DIORITE_TILES;
    public static final Block DIORITE_PAVING;
    public static final Block DIORITE_PILLAR;
    public static final Block GRANITE_BRICKS;
    public static final Block GRANITE_LARGE_BRICKS;
    public static final Block GRANITE_FANCY_BRICKS ;
    public static final Block GRANITE_TILES;
    public static final Block GRANITE_PAVING;
    public static final Block GRANITE_PILLAR;
    public static final Block LIMESTONE;
    public static final Block POLISHED_LIMESTONE;
    public static final Block POLISHED_LIMESTONE_SLAB;
    public static final Block LIMESTONE_SLAB;
    public static final Block LIMESTONE_STAIRS;
    public static final Block POLISHED_LIMESTONE_STAIRS;
    public static final Block LIMESTONE_BRICKS;
    public static final Block LIMESTONE_LARGE_BRICKS;
    public static final Block LIMESTONE_FANCY_BRICKS;
    public static final Block LIMESTONE_TILES;
    public static final Block LIMESTONE_PAVING;
    public static final Block LIMESTONE_PILLAR;
    public static final Block COBBLED_DIRT;
    public static final Block STEEL_TRAPDOOR;
    public static final Block STEEL_DOOR;
    public static final Block STEEL_BARS;
    public static final Block TOMATO_CROP;
    public static final Block KIWI_CROP;
    public static final Block RASPBERRY_CROP;
    public static final Block STRAWBERRY_CROP;
    public static final Block PEANUT_CROP;
    public static final Block CORN_CROP;
    public static final Block RICE_CROP;
    public static final Block BUSH;
    public static final Block SALT_ORE;
    public static final Block ALLOY_FURNACE;

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for Rekindle");
    }
    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK,new Identifier(Rekindle.MOD_ID, id) , block);
    }

    static {
        ALUMINUM_BLOCK = register("aluminum_block", new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(5.0f, 30.0f).sounds(BlockSoundGroup.METAL)));
        STEEL_BLOCK = register("steel_block", new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0f, 30.0f).sounds(BlockSoundGroup.METAL)));
        ALUMINUM_ORE = register("aluminum_ore", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.0f, 15.0f).sounds(BlockSoundGroup.STONE)));
        ANDESITE_BRICKS = register("andesite_bricks", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f, 7.0f).sounds(BlockSoundGroup.STONE)));
        ANDESITE_LARGE_BRICKS = register("andesite_large_bricks", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        ANDESITE_FANCY_BRICKS = register("andesite_fancy_bricks", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        ANDESITE_TILES = register("andesite_tiles", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        ANDESITE_PAVING = register("andesite_paving", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        ANDESITE_PILLAR = register("andesite_pillar", new PillarBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        DIORITE_BRICKS = register("diorite_bricks", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        DIORITE_LARGE_BRICKS = register("diorite_large_bricks", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        DIORITE_FANCY_BRICKS = register("diorite_fancy_bricks", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        DIORITE_TILES = register("diorite_tiles", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        DIORITE_PAVING = register("diorite_paving", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        DIORITE_PILLAR = register("diorite_pillar", new PillarBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        GRANITE_BRICKS = register("granite_bricks", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        GRANITE_LARGE_BRICKS = register("granite_large_bricks", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        GRANITE_FANCY_BRICKS = register("granite_fancy_bricks",new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        GRANITE_TILES = register("granite_tiles", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        GRANITE_PAVING = register("granite_paving", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        GRANITE_PILLAR = register("granite_pillar", new PillarBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        LIMESTONE = register("limestone", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        POLISHED_LIMESTONE = register("polished_limestone", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        POLISHED_LIMESTONE_SLAB = register("polished_limestone_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        LIMESTONE_SLAB = register("limestone_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        LIMESTONE_STAIRS = register("limestone_stairs", new RekindleStairsBlock(ModBlocks.LIMESTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        POLISHED_LIMESTONE_STAIRS = register("polished_limestone_stairs", new RekindleStairsBlock(ModBlocks.POLISHED_LIMESTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        LIMESTONE_BRICKS = register("limestone_bricks", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,6.0f).sounds(BlockSoundGroup.STONE)));
        LIMESTONE_LARGE_BRICKS = register("limestone_large_bricks", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        LIMESTONE_FANCY_BRICKS = register("limestone_fancy_bricks", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,6.5f).sounds(BlockSoundGroup.STONE)));
        LIMESTONE_TILES = register("limestone_tiles", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,6.5f).sounds(BlockSoundGroup.STONE)));
        LIMESTONE_PAVING = register("limestone_paving", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        LIMESTONE_PILLAR = register("limestone_pillar", new PillarBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(2.2f,7.0f).sounds(BlockSoundGroup.STONE)));
        COBBLED_DIRT = register("cobbled_dirt", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).breakByHand(true).strength(2.5f, 2F).sounds(RekindleBlockSoundGroup.COBBLED_DIRT)));
        STEEL_TRAPDOOR = register("steel_trapdoor", new RekindleTrapdoorBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
        STEEL_DOOR = register("steel_door", new RekindleDoorBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));
        STEEL_BARS = register("steel_bars", new RekindlePaneBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).nonOpaque())) ;
        SALT_ORE = register("salt_ore", new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool().strength(3F,12F).sounds(BlockSoundGroup.STONE)));
        TOMATO_CROP = register("tomato_crop", new TomatoBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().strength(0F,0F).sounds(BlockSoundGroup.CROP).noCollision()));
        KIWI_CROP = register("kiwi_crop", new KiwiBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().strength(0F,0F).sounds(BlockSoundGroup.CROP).noCollision()));
        RASPBERRY_CROP = register("raspberry_crop", new RaspberryBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().strength(0F,0F).sounds(BlockSoundGroup.CROP).noCollision()));
        STRAWBERRY_CROP = register("strawberry_crop", new StrawberryBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().strength(0F,0F).sounds(BlockSoundGroup.CROP).noCollision()));
        PEANUT_CROP = register("peanut_crop", new PeanutBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().strength(0F,0F).sounds(BlockSoundGroup.CROP).noCollision()));
        CORN_CROP = register("corn_crop", new CornBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().strength(0F,0F).sounds(BlockSoundGroup.CROP).noCollision()));
        RICE_CROP = register("rice_crop", new RiceBlock(FabricBlockSettings.of(Material.REPLACEABLE_UNDERWATER_PLANT).breakInstantly().strength(0F,0F).sounds(BlockSoundGroup.CROP).noCollision()));
        BUSH = register("bush", new BushBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().strength(0f,0f).sounds(BlockSoundGroup.GRASS).noCollision()));
        ALLOY_FURNACE = register("alloy_furnace", new AlloyFurnaceBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0f, 30.0f).sounds(BlockSoundGroup.NETHER_BRICKS)));
    }
}
