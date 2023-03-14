package com.fixthegame.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.fixthegame.FixTheGame;

import net.minecraft.entity.passive.PassiveEntity;

@Mixin(PassiveEntity.class)
public class ScaleBabyTimeOfPassiveMobs{
    @Inject(method = "setBaby", at = @At("HEAD"), cancellable = true)
    private void setBaby(boolean baby, CallbackInfo info) {
        ((PassiveEntity)(Object)this).setBreedingAge(baby ? (int) (-24000 * FixTheGame.scaleBabyTime) : 0);
    }
}
