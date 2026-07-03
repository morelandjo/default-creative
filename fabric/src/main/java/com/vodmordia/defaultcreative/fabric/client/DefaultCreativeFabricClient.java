package com.vodmordia.defaultcreative.fabric.client;

import net.fabricmc.api.ClientModInitializer;

public final class DefaultCreativeFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // The create-world default is handled entirely by the CreateWorldScreen mixin.
    }
}
