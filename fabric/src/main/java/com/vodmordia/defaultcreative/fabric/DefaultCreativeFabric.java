package com.vodmordia.defaultcreative.fabric;

import net.fabricmc.api.ModInitializer;

import com.vodmordia.defaultcreative.DefaultCreative;

public final class DefaultCreativeFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // Run our common setup.
        DefaultCreative.init();
    }
}
