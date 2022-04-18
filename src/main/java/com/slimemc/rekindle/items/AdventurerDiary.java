package com.slimemc.rekindle.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class AdventurerDiary extends Item {
    public AdventurerDiary(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("item.rekindle.adventurer_diary.desc"));
        super.appendTooltip(stack, world, tooltip, context);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        if (new Random().nextFloat() > 0.8) { //20%
            user.addExperience(30);
        } else if (new Random().nextFloat() > 0.6) { //40%
            user.addExperience(25);
        } else if (new Random().nextFloat() > 0.4) { //60%
            user.addExperience(20);
        } else { //80%
            user.addExperience(15);
        }
        stack.decrement(1);
        return super.use(world, user, hand);
    }

}
