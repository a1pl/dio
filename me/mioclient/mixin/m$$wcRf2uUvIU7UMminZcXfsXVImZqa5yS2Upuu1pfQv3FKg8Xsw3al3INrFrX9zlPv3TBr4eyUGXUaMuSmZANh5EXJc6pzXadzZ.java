package me.mioclient.mixin;

import me.mioclient.m$$xQ8jgx5howJKGmMwgMbM6XY1HDJnKjLumWj5cbrlxmQsb1iu27roC6c5V6l60cyfcejJAI13OkEqUwU9B2XRuHuFcczhTmBIi;
import net.minecraft.class_10124;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_5819;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_10124.class})
public class m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ {
    @Inject(method={"spawnParticlesAndPlaySound"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_5819 class_58192, class_1309 class_13092, class_1799 class_17992, int n, CallbackInfo callbackInfo) {
        if (m$$xQ8jgx5howJKGmMwgMbM6XY1HDJnKjLumWj5cbrlxmQsb1iu27roC6c5V6l60cyfcejJAI13OkEqUwU9B2XRuHuFcczhTmBIi.m$$xQ8jgx5howJKGmMwgMbM6XY1HDJnKjLumWj5cbrlxmQsb1iu27roC6c5V6l60cyfcejJAI13OkEqUwU9B2XRuHuFcczhTmBIi(-318670466)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"shouldSpawnParticlesAndPlaySounds"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(int n, CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$xQ8jgx5howJKGmMwgMbM6XY1HDJnKjLumWj5cbrlxmQsb1iu27roC6c5V6l60cyfcejJAI13OkEqUwU9B2XRuHuFcczhTmBIi.m$$xQ8jgx5howJKGmMwgMbM6XY1HDJnKjLumWj5cbrlxmQsb1iu27roC6c5V6l60cyfcejJAI13OkEqUwU9B2XRuHuFcczhTmBIi(-318670466)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
}

