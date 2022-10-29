package com.slimemc.rekindle.status_effects;

import com.slimemc.rekindle.util.RekindleDamageSources;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ElectrocutionStatusEffect extends StatusEffect {
    public ElectrocutionStatusEffect() {
        super(StatusEffectCategory.HARMFUL, 0xFFE433);
    }
    public static final StatusEffect ELECTROCUTION = new ElectrocutionStatusEffect();
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity != null) {
            entity.damage(RekindleDamageSources.ELECTROCUTED, 0.6f);
        }
    }

}
