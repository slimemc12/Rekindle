package com.slimemc.rekindle.screen;

import com.slimemc.rekindle.Rekindle;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class RekindleScreenHandlers {
    public static ScreenHandlerType<AlloyFurnaceScreenHandler> ALLOY_FURNACE_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Rekindle.MOD_ID, "alloy_furnace"),
                    AlloyFurnaceScreenHandler::new);
    public static ScreenHandlerType<CrateScreenHandler> CRATE_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Rekindle.MOD_ID, "crate"),
                    CrateScreenHandler::new);
}
