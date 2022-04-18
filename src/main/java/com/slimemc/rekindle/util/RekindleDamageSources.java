package com.slimemc.rekindle.util;

import net.minecraft.entity.damage.DamageSource;

public class RekindleDamageSources extends DamageSource {
    protected RekindleDamageSources(String name) {
        super(name);
    }
    public static final DamageSource ELECTROCUTED = (new RekindleDamageSources("electrocuted")).setBypassesArmor();
}
