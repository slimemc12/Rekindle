package com.slimemc.rekindle.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ChilliItem extends Item{
    public ChilliItem(Settings settings) {
        super(settings);
    }
    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if(!world.isClient){
            user.setOnFireFor(15);
        }
        return super.finishUsing(stack, world, user);
    }
}
