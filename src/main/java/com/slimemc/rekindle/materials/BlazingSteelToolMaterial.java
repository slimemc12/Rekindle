package com.slimemc.rekindle.materials;

import com.slimemc.rekindle.registery.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BlazingSteelToolMaterial implements ToolMaterial {
    public static final BlazingSteelToolMaterial INSTANCE = new BlazingSteelToolMaterial();

    public int getDurability() {
        return 1600;
    }

    public float getMiningSpeedMultiplier() {
        return 8.5f;
    }

    public float getAttackDamage() {
        return 3f;
    }

    public int getMiningLevel() {
        return 4;
    }

    public int getEnchantability() {
        return 12;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.BLAZING_STEEL_INGOT);
    }

}
