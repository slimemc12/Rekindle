package com.slimemc.rekindle.util.tags;

import com.slimemc.rekindle.Rekindle;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class RekindleTags {
    public static class Blocks {
        public static final Tag<Block> STEEL_BLOCKS = createCommonTag("steel_blocks");
        public static final Tag<Block> ALUMINUM_ORES = createCommonTag("aluminum_ores");
        public static final Tag<Block> ALUMINUM_BLOCKS = createCommonTag("aluminum_blocks");

        private static Tag<Block> createTag(String name) {
            return TagRegistry.block(new Identifier(Rekindle.MOD_ID, name));
        }

        private static Tag<Block> createCommonTag(String name) {
            return TagRegistry.block(new Identifier("c", name));
        }
    }

    public static class Items {
        public static final Tag<Item> STEEL_INGOTS = createCommonTag("steel_ingots");
        public static final Tag<Item> STEEL_NUGGETS = createCommonTag("steel_nuggets");
        public static final Tag<Item> ALUMINUM_INGOTS = createCommonTag("aluminum_ingots");
        public static final Tag<Item> ALUMINUM_NUGGETS = createCommonTag("aluminum_nuggets");

        private static Tag<Item> createTag(String name) {
            return TagRegistry.item(new Identifier(Rekindle.MOD_ID, name));
        }

        private static Tag<Item> createCommonTag(String name) {
            return TagRegistry.item(new Identifier("c", name));
        }
    }
}
