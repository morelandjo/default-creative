package com.vodmordia.defaultcreative.mixin;

import net.minecraft.client.gui.screens.worldselection.CreateWorldScreen;
import net.minecraft.client.gui.screens.worldselection.WorldCreationUiState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// Client-only: the world-creation screen never exists on a dedicated server.
// When a fresh CreateWorldScreen is constructed, default its UI game mode to Creative.
// The player can still switch back to Survival/Hardcore before creating the world.
@Mixin(CreateWorldScreen.class)
public abstract class CreateWorldScreenMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void defaultcreative$setCreativeDefault(CallbackInfo ci) {
        CreateWorldScreen self = (CreateWorldScreen) (Object) this;
        self.getUiState().setGameMode(WorldCreationUiState.SelectedGameMode.CREATIVE);
    }
}
