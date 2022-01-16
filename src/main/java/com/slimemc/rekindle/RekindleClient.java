package com.slimemc.rekindle;

import com.slimemc.rekindle.util.BlockRenders;
import net.fabricmc.api.ClientModInitializer;

public class RekindleClient implements ClientModInitializer {



    @Override
    public void onInitializeClient() {
        BlockRenders.definedRenders();
    }
}
