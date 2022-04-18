package com.slimemc.rekindle.status_effects;

import com.slimemc.rekindle.Rekindle;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RekindleStatusEffects {

    public static void registerElectrocutionEffect() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Rekindle.MOD_ID, "electrocution"),
                ElectrocutionStatusEffect.ELECTROCUTION);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Rekindle.MOD_ID, "freeze"),
                FreezeStatusEffect.FREEZE);
    }
}
