package com.slimemc.rekindle.fluid;

import com.slimemc.rekindle.Rekindle;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluids {
    public static final FlowableFluid DISTILLED_WATER_STILL = register("distilled_water_still", new DistilledWaterFluid.Still());
    public static final FlowableFluid DISTILLED_WATER_FLOWING = register("distilled_water_flowing", new DistilledWaterFluid.Flowing());

    public static final FlowableFluid MILK_STILL = register("milk_still", new MilkFluid.Still());
    public static final FlowableFluid MILK_FLOWING = register("milk_flowing", new MilkFluid.Flowing());

    public static final FlowableFluid OIL_STILL = register("oil_still", new OilFluid.Still());
    public static final FlowableFluid OIL_FLOWING = register("oil_flowing", new OilFluid.Flowing());


    private static FlowableFluid register(String name, FlowableFluid flowableFluid) {
        return Registry.register(Registry.FLUID, new Identifier(Rekindle.MOD_ID, name), flowableFluid);
    }
}
