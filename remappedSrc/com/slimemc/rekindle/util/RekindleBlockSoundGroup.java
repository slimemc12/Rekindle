package com.slimemc.rekindle.util;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class RekindleBlockSoundGroup extends BlockSoundGroup {

    public RekindleBlockSoundGroup(float volume, float pitch, SoundEvent breakSound, SoundEvent stepSound, SoundEvent placeSound, SoundEvent hitSound, SoundEvent fallSound) {
        super(volume, pitch, breakSound, stepSound, placeSound, hitSound, fallSound);
    }

    public static final BlockSoundGroup COBBLED_DIRT = new BlockSoundGroup(1.0F, 1.0F,
            SoundEvents.BLOCK_SOUL_SOIL_BREAK,
            SoundEvents.BLOCK_STONE_STEP,
            SoundEvents.BLOCK_SOUL_SOIL_PLACE,
            SoundEvents.BLOCK_STONE_HIT,
            SoundEvents.BLOCK_SOUL_SOIL_FALL);
}
