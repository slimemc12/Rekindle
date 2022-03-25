package com.slimemc.rekindle.util.item;

import com.slimemc.rekindle.Rekindle;
import com.slimemc.rekindle.registery.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class RekindleRegistries {
    public static void registerFuels() {
        System.out.println("Registering Fuels for " + Rekindle.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.BLAST_FUEL, 20000);
    }
}
