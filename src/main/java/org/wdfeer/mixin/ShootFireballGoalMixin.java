package org.wdfeer.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "net/minecraft/entity/mob/BlazeEntity$ShootFireballGoal")
public class ShootFireballGoalMixin {
    @Shadow private int fireballsFired;

    @Inject(method = "tick", at = @At("RETURN"))
    private void injectTick(CallbackInfo ci) {
        fireballsFired = fireballsFired % 3 + 1;
    }
}