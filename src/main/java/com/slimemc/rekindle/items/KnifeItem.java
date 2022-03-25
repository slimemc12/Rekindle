package com.slimemc.rekindle.items;

import net.minecraft.item.Item;

public class KnifeItem extends Item {
    public KnifeItem(Item.Settings settings) {
        super(settings);
    }

    public boolean hasRecipeRemainder() {
        return true;
    }

}
