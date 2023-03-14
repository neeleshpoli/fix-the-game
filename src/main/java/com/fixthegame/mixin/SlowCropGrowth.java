package com.fixthegame.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.fixthegame.FixTheGame;

@Mixin(net.minecraft.block.CropBlock.class)
public class SlowCropGrowth {
    @Inject(method = "getGrowthAmount", at = @At("RETURN"))
    private void getGrowthAmount(CallbackInfoReturnable<Integer> info) {
        info.setReturnValue((int) (info.getReturnValue() * FixTheGame.cropGrowthSlownessMultiplier));
    }
}
