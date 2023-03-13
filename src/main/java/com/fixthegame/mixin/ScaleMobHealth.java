package com.fixthegame.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.fixthegame.FixTheGame;

/* 
 * This class increases the health of all mobs.
 */
@Mixin(net.minecraft.entity.LivingEntity.class)
public class ScaleMobHealth {
    @Inject(method = "getMaxHealth", at = @At("RETURN"), cancellable = true)
    private void getMaxHealth(CallbackInfoReturnable<Float> info) {
        info.setReturnValue(info.getReturnValueF() * FixTheGame.scalehealth);
    }
}