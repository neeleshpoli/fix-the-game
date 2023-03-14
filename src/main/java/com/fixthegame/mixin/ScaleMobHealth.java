package com.fixthegame.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.fixthegame.FixTheGame;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

/* 
 * This class increases the health of all mobs.
 */
@Mixin(LivingEntity.class)
public class ScaleMobHealth {
    @Inject(method = "getMaxHealth", at = @At("RETURN"), cancellable = true)
    private void getMaxHealth(CallbackInfoReturnable<Float> info) {
        if (!(((LivingEntity)(Object)this) instanceof PlayerEntity)) info.setReturnValue(info.getReturnValueF() * FixTheGame.scalehealth);
        info.setReturnValue(info.getReturnValueF());
    }
}