package com.slimemc.rekindle.status_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class FreezeStatusEffect extends StatusEffect {
    protected FreezeStatusEffect() {
        super(StatusEffectCategory.NEUTRAL, 0x3273a8);
    }
    public static final StatusEffect FREEZE = new FreezeStatusEffect();
    @Override
    public void applyUpdateEffect(LivingEntity livingEntity, int amplifier) {
        if (!livingEntity.world.isClient) {
            double x = livingEntity.getX();
            double y = livingEntity.getY();
            double z = livingEntity.getZ();

            livingEntity.teleport(x, y, z);
            livingEntity.setMovementSpeed(0f);
        }
        super.applyUpdateEffect(livingEntity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
