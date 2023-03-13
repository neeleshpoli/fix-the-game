package com.fixthegame.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.fixthegame.FixTheGame;

/* 
 * This class disables villager breeding by changing the isReadyToBreed method
 * to always return false. 
 */
@Mixin(net.minecraft.entity.passive.VillagerEntity.class)
public class DisableVillagerBreeding {
	@Inject(at = @At("HEAD"), method = "isReadyToBreed", cancellable = true)
	void isReadyToBreed(CallbackInfoReturnable<Boolean> returner) {
		if (FixTheGame.disableVillagerBreeding) {
			returner.setReturnValue(true);
			returner.cancel();
		}
	}
}