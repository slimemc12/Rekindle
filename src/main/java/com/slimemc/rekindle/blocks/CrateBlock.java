package com.slimemc.rekindle.blocks;

import com.slimemc.rekindle.blocks.block_entities.CrateBlockEntity;
import com.slimemc.rekindle.blocks.block_entities.RekindleBlockEntities;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class CrateBlock extends BlockWithEntity implements BlockEntityProvider {
    public CrateBlock(Settings settings) {
        super(settings);
    }
    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(1, 0, 0, 15, 1, 1),
            Block.createCuboidShape(1, 15, 0, 15, 16, 1),
            Block.createCuboidShape(1, 0, 15, 15, 1, 16),
            Block.createCuboidShape(1, 15, 15, 15, 16, 16),
            Block.createCuboidShape(15, 15, 1, 16, 16, 15),
            Block.createCuboidShape(0, 0, 1, 1, 1, 15),
            Block.createCuboidShape(15, 0, 1, 16, 1, 15),
            Block.createCuboidShape(0, 15, 1, 1, 16, 15),
            Block.createCuboidShape(15, 0, 15, 16, 16, 16),
            Block.createCuboidShape(15, 0, 0, 16, 16, 1),
            Block.createCuboidShape(0, 0, 15, 1, 16, 16),
            Block.createCuboidShape(0, 0, 0, 1, 16, 1),
            Block.createCuboidShape(1, 1, 1, 15, 15, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        double d = (double)pos.getX() + 0.5D;
        double e = pos.getY();
        double f = (double)pos.getZ() + 0.5D;
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);

            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
            }
        }
        world.playSound(d, e, f, SoundEvents.BLOCK_BARREL_OPEN, SoundCategory.BLOCKS, 1.0F, 1.0F, true);

        return ActionResult.SUCCESS;
    }
    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof CrateBlockEntity) {
                ItemScatterer.spawn(world, pos, (CrateBlockEntity)blockEntity);
                world.updateComparators(pos,this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }

    }
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, RekindleBlockEntities.CRATE_BLOCK_ENTITY, CrateBlockEntity::tick);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CrateBlockEntity(pos, state);
    }
}
