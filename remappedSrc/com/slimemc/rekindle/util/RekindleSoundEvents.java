package com.slimemc.rekindle.util;

import com.slimemc.rekindle.Rekindle;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RekindleSoundEvents {

    public static final SoundEvent MUSIC_DISC_PILLAGED = register("music_disc.pillaged");

    private static SoundEvent register(String name) {
        Identifier id = new Identifier(Rekindle.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSoundEvents() {
        System.out.println("Registering SoundEvents for Rekindle");
    }

}
