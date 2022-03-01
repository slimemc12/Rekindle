package com.slimemc.rekindle.features;

import com.mojang.serialization.Codec;
import com.slimemc.rekindle.registery.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class BushFeature extends Feature<DefaultFeatureConfig> {
    public BushFeature(Codec<DefaultFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean generate(FeatureContext context) {
        BlockPos topPos = context.getWorld().getTopPosition(Heightmap.Type.WORLD_SURFACE, context.getOrigin());
        BlockPos belowPos = topPos.down();
        if (context.getWorld().getBlockState(belowPos).getBlock() == Blocks.GRASS_BLOCK)
            context.getWorld().setBlockState(topPos, ModBlocks.BUSH.getDefaultState(), 1);
        return true;
    }
}
