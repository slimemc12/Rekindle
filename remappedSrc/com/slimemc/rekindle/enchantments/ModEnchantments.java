package com.slimemc.rekindle.enchantments;

import com.slimemc.rekindle.Rekindle;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {
    public static final Enchantment VENOM_ENCHANTMENT =register("venom", new VenomEnchantment(
            Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{
            EquipmentSlot.MAINHAND}));
    public static final Enchantment VITALITY_ENCHANTMENT =register("vitality", new VitalityEnchantment(
            Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{
            EquipmentSlot.MAINHAND}));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(Rekindle.MOD_ID, name), enchantment);
    }


    public static void registerEnchantments() {
        System.out.println("Registering ModEnchantments for " + Rekindle.MOD_ID);
    }
}
