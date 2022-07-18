package com.slimemc.rekindle;

import com.slimemc.rekindle.fluid.ModFluids;
import com.slimemc.rekindle.screen.AlloyFurnaceScreen;
import com.slimemc.rekindle.screen.CrateScreen;
import com.slimemc.rekindle.screen.RekindleScreenHandlers;
import com.slimemc.rekindle.util.BlockRenders;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRendererHookContainer;
import net.minecraft.client.render.block.FluidRenderer;
import net.minecraft.fluid.Fluids;

public class RekindleClient implements ClientModInitializer {



    @Override
    public void onInitializeClient() {
        BlockRenders.definedRenders();
        ScreenRegistry.register(RekindleScreenHandlers.ALLOY_FURNACE_SCREEN_HANDLER, AlloyFurnaceScreen::new);
        ScreenRegistry.register(RekindleScreenHandlers.CRATE_SCREEN_HANDLER, CrateScreen::new);
    }
}
