package com.slimemc.rekindle.features;

import com.mojang.serialization.Codec;
import com.slimemc.rekindle.registery.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.Random;

public class BushFeature extends Feature {
    public BushFeature(Codec configCodec) {
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
