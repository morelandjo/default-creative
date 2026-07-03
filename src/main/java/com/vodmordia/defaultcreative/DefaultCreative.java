package com.vodmordia.defaultcreative;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

// The value here must match the modId in the META-INF/neoforge.mods.toml file.
@Mod(DefaultCreative.MODID)
public class DefaultCreative {
    // Define the mod id in a common place for everything to reference.
    public static final String MODID = "defaultcreative";

    // FML recognizes some parameter types like IEventBus or ModContainer and passes them in automatically.
    public DefaultCreative(IEventBus modEventBus, ModContainer modContainer) {
        // Nothing to register here: all the behavior lives in the client-only event handler,
        // since the "create world" screen only exists on the client.
    }
}
