package com.slimemc.rekindle.recipes;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;


public class AlloyFurnaceRecipe implements Recipe<SimpleInventory> {

    private final Identifier id;
    private final ItemStack output;
    private final int outputCount;
    private final int processTime;
    private final DefaultedList<Ingredient> recipeItems;

    public AlloyFurnaceRecipe(Identifier id, ItemStack output, int outputCount, int processTime,
                                    DefaultedList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.outputCount = outputCount;
        this.processTime = processTime;
        this.recipeItems = recipeItems;
    }

    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if(recipeItems.get(0).test(inventory.getStack(0))) {
            return recipeItems.get(1).test(inventory.getStack(1));
        }

        return false;
    }

    @Override
    public ItemStack craft(SimpleInventory inventory) {
        return output;
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    public int getProcessTime() {
        return processTime;
    }

    public int getOutputCount() {
        return outputCount;
    }

    @Override
    public ItemStack getOutput() {
        return output.copy();
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<AlloyFurnaceRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "alloying";
    }

    public static class Serializer implements RecipeSerializer<AlloyFurnaceRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "alloying";
        // this is the name given in the json file

        @Override
        public AlloyFurnaceRecipe read(Identifier id, JsonObject json) {
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "output"));
            int outputCount = JsonHelper.getInt(json, "count", 1);
            int processTime = JsonHelper.getInt(json, "processTime", 200);

            JsonArray ingredients = JsonHelper.getArray(json, "ingredients");
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new AlloyFurnaceRecipe(id, output, outputCount, processTime,
                    inputs);
        }

        @Override
        public AlloyFurnaceRecipe read(Identifier id, PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            int outputCount = buf.readInt();
            int processTime = buf.readInt();
            return new AlloyFurnaceRecipe(id, output, outputCount, processTime,
                    inputs);
        }

        @Override
        public void write(PacketByteBuf buf, AlloyFurnaceRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.write(buf);
            }
            buf.writeItemStack(recipe.getOutput());
        }
    }
}
