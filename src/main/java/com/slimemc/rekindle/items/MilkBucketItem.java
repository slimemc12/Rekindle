package com.slimemc.rekindle.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MilkBucketItem extends BucketItem {

    public MilkBucketItem(Fluid fluid, Settings settings) {
        super(fluid, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("item.rekindle.milk_bucket.desc"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
