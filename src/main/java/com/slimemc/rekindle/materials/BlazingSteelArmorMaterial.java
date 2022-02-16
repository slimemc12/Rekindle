package com.slimemc.rekindle.materials;

import com.slimemc.rekindle.registery.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class BlazingSteelArmorMaterial implements ArmorMaterial {

    private static final int[] DURABILITY = {370, 500, 600, 520};
    private static final int[] PROTECTION = {3, 6, 7, 4};
    public static final BlazingSteelArmorMaterial INSTANCE = new BlazingSteelArmorMaterial();

    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.BLAZING_STEEL_INGOT);
    }

    @Override
    public String getName() {
        return "blazing_steel";
    }

    @Override
    public float getToughness() {
        return 2.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.5F;
    }
}
