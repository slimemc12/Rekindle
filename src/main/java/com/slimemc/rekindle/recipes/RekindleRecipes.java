package com.slimemc.rekindle.recipes;

import com.slimemc.rekindle.Rekindle;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RekindleRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Rekindle.MOD_ID, AlloyFurnaceRecipe.Serializer.ID),
                AlloyFurnaceRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Rekindle.MOD_ID, AlloyFurnaceRecipe.Type.ID),
                AlloyFurnaceRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Rekindle.MOD_ID, "advanced_recipe"),
                AdvancedRecipeSerializer.INSTANCE);
        System.out.println("Registering Recipes for Rekindle");
    }
}
