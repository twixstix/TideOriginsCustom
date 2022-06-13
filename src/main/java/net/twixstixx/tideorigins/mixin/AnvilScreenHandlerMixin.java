package net.twixstixx.tideorigins.mixin;

import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AnvilScreenHandler.class)
public class AnvilScreenHandlerMixin {

    @Inject(method = "canUse", at = @At("HEAD"), cancellable = true)
    private void allowUsingViaPower(CallbackInfoReturnable<Boolean> cir) {
            cir.setReturnValue(true);
    }
}