package com.slimemc.rekindle;

import com.slimemc.rekindle.screen.AlloyFurnaceScreen;
import com.slimemc.rekindle.screen.RekindleScreenHandlers;
import com.slimemc.rekindle.util.BlockRenders;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class RekindleClient implements ClientModInitializer {



    @Override
    public void onInitializeClient() {
        BlockRenders.definedRenders();
        ScreenRegistry.register(RekindleScreenHandlers.ALLOY_FURNACE_SCREEN_HANDLER, AlloyFurnaceScreen::new);
    }
}
