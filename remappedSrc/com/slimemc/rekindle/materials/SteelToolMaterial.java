package com.slimemc.rekindle.materials;

import com.slimemc.rekindle.registery.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SteelToolMaterial implements ToolMaterial {

    public static final SteelToolMaterial INSTANCE = new SteelToolMaterial();

    public int getDurability() {
        return 1200;
    }

    public float getMiningSpeedMultiplier() {
        return 7.0f;
    }

    public float getAttackDamage() {
        return 2f;
    }

    public int getMiningLevel() {
        return 3;
    }

    public int getEnchantability() {
        return 24;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.STEEL_INGOT);
    }
}
