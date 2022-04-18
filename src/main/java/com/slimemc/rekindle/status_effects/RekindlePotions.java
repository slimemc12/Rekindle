package com.slimemc.rekindle.status_effects;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.registry.Registry;

public class RekindlePotions {
    public static final Potion FREEZE;
    public static final Potion FREEZE_LONG;

    static {
        FREEZE = register("freeze", new Potion(new StatusEffectInstance(FreezeStatusEffect.FREEZE, 3600)));
        FREEZE_LONG = register("long_freeze", new Potion(new StatusEffectInstance(FreezeStatusEffect.FREEZE, 9600)));
    }
    public static void registerPotions() {
        System.out.println("Registering Potions For Rekindle");
    }
    private static Potion register(String name, Potion potion) {
        return Registry.register(Registry.POTION, name, potion);
    }
}
