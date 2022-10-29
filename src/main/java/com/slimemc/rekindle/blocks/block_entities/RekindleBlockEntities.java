package com.slimemc.rekindle.blocks.block_entities;

import com.slimemc.rekindle.Rekindle;
import com.slimemc.rekindle.registery.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RekindleBlockEntities {
    public static BlockEntityType<AlloyFurnaceBlockEntity> ALLOY_FURNACE_BLOCK_ENTITY;
    public static BlockEntityType<CrateBlockEntity> CRATE_BLOCK_ENTITY;
    public static void registerAllBlockEntities() {
        ALLOY_FURNACE_BLOCK_ENTITY =
                Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Rekindle.MOD_ID, "alloy_furnace"),
                        FabricBlockEntityTypeBuilder.create(AlloyFurnaceBlockEntity::new,
                                ModBlocks.ALLOY_FURNACE).build(null));
        CRATE_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Rekindle.MOD_ID, "crate"),
                        FabricBlockEntityTypeBuilder.create(CrateBlockEntity::new,
                                ModBlocks.CRATE).build(null));
    }
}
