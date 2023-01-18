package com.slimemc.rekindle;

import com.slimemc.rekindle.fluid.ModFluids;
import com.slimemc.rekindle.screen.AlloyFurnaceScreen;
import com.slimemc.rekindle.screen.CrateScreen;
import com.slimemc.rekindle.screen.RekindleScreenHandlers;
import com.slimemc.rekindle.util.BlockRenders;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class RekindleClient implements ClientModInitializer {



    @Override
    public void onInitializeClient() {
        BlockRenders.definedRenders();
        ScreenRegistry.register(RekindleScreenHandlers.ALLOY_FURNACE_SCREEN_HANDLER, AlloyFurnaceScreen::new);
        ScreenRegistry.register(RekindleScreenHandlers.CRATE_SCREEN_HANDLER, CrateScreen::new);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.DISTILLED_WATER_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x60A1FE));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.DISTILLED_WATER_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x60A1FE));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MILK_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0xF7FFFF));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MILK_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0xF7FFFF));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.OIL_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x2E2E33));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.OIL_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x2E2E33));
    }
}
