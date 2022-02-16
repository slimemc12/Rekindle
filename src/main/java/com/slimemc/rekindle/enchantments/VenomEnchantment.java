package com.slimemc.rekindle.enchantments;

import com.slimemc.rekindle.Rekindle;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VenomEnchantment extends Enchantment {

    protected VenomEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot[] equipmentSlots) {
        super(weight, target, equipmentSlots);
    }

    @Override
    public int getMinPower(int level) {
        return 12;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    public void onTargetDamaged(LivingEntity user, LivingEntity target, int level) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 2));

        super.onTargetDamaged(user, target, level);
    }


    public static final Enchantment VENOM_ENCHANTMENT = new VenomEnchantment(
            Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{
            EquipmentSlot.MAINHAND});

    public static void registerEnchantments() {
        Registry.register(Registry.ENCHANTMENT, new Identifier(Rekindle.MOD_ID, "venom"), VENOM_ENCHANTMENT);
    }

}
