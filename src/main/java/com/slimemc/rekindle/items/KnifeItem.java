package com.slimemc.rekindle.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class KnifeItem extends Item {
    public KnifeItem(Item.Settings settings) {
        super(settings);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, null);
        return super.postHit(stack, target, attacker);
    }
}
