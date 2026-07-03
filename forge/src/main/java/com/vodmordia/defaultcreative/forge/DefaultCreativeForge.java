package com.vodmordia.defaultcreative.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.vodmordia.defaultcreative.DefaultCreative;

@Mod(DefaultCreative.MOD_ID)
public final class DefaultCreativeForge {
    public DefaultCreativeForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(DefaultCreative.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        DefaultCreative.init();
    }
}
