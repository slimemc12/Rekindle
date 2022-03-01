package com.slimemc.rekindle.status_effects;

import com.slimemc.rekindle.Rekindle;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ElectrocutionStatusEffect extends StatusEffect {
    public ElectrocutionStatusEffect() {
        super(
                StatusEffectType.HARMFUL,
                0xFFE433);
    }
    public static final StatusEffect ELECTROCUTION = new ElectrocutionStatusEffect();
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity != null) {
            entity.damage(DamageSource.MAGIC, 0.6f);
        }
    }

    public static void registerElectrocutionEffect() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Rekindle.MOD_ID, "electrocution"), ELECTROCUTION);
    }
}
