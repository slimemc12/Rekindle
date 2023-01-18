package com.slimemc.rekindle.items;

import net.minecraft.fluid.Fluid;
import net.minecraft.item.*;


public class CellItem extends Item {
    private final Fluid fluid;

    public CellItem(Fluid fluid, Item.Settings settings) {
        super(settings);
        this.fluid = fluid;
    }
}
