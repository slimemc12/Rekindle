package com.slimemc.rekindle.util.tags;

import com.slimemc.rekindle.Rekindle;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class RekindleTags {
    public static class Blocks {
        public static final TagKey<Block> STEEL_BLOCKS = createCommonTag("steel_blocks");
        public static final TagKey<Block> ALUMINUM_ORES = createCommonTag("aluminum_ores");
        public static final TagKey<Block> ALUMINUM_BLOCKS = createCommonTag("aluminum_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(Rekindle.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY,new Identifier("c", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> STEEL_INGOTS = createCommonTag("steel_ingots");
        public static final TagKey<Item> STEEL_NUGGETS = createCommonTag("steel_nuggets");
        public static final TagKey<Item> ALUMINUM_INGOTS = createCommonTag("aluminum_ingots");
        public static final TagKey<Item> ALUMINUM_NUGGETS = createCommonTag("aluminum_nuggets");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Rekindle.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
