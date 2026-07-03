package com.vodmordia.defaultcreative;

import net.minecraft.client.gui.screens.worldselection.CreateWorldScreen;
import net.minecraft.client.gui.screens.worldselection.WorldCreationUiState;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ScreenEvent;

// Client-only: the world creation screen never exists on a dedicated server.
// Registers every static @SubscribeEvent method in this class on the game event bus, client side only.
@EventBusSubscriber(modid = DefaultCreative.MODID, value = Dist.CLIENT)
public class DefaultCreativeClient {

    // Fires once each time a screen is opened (not on window resize, so the player's choice is preserved).
    // When the screen being opened is the "Create New World" screen, default its game mode to Creative.
    @SubscribeEvent
    static void onScreenOpening(ScreenEvent.Opening event) {
        if (event.getNewScreen() instanceof CreateWorldScreen createWorldScreen) {
            createWorldScreen.getUiState().setGameMode(WorldCreationUiState.SelectedGameMode.CREATIVE);
        }
    }
}
