package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$Wb8hOEYql7hFXfKif2c28sSoflnOPhbHKQrr4g4eFuNaz8uYQ1U9k4I6btRoGptwM6jK6DxR8cNuVKuViEQv1O2tTtyUDhn8N;
import net.minecraft.class_10774;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2560;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_2560.class})
public class m$$LGLFak5nbFECYdITscFpInQHGvLyjB6pb6cOAakiO2zDGdLGYbKOMcrVV59Rx3dlrn0ekrR2pTy57miCyeGRkPm0O0rFavrAH {
    private static final m$$Wb8hOEYql7hFXfKif2c28sSoflnOPhbHKQrr4g4eFuNaz8uYQ1U9k4I6btRoGptwM6jK6DxR8cNuVKuViEQv1O2tTtyUDhn8N m$$aQ4q1TxdQKz4BFU6nT1XmNv63cqaPCoFaXeROTZ8XJtEho1HFOqgyAuiJpYGMBe8xwxAqDbtldokjhP7Dp7ngOmSKWBhpNCM8 = (m$$Wb8hOEYql7hFXfKif2c28sSoflnOPhbHKQrr4g4eFuNaz8uYQ1U9k4I6btRoGptwM6jK6DxR8cNuVKuViEQv1O2tTtyUDhn8N)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$Wb8hOEYql7hFXfKif2c28sSoflnOPhbHKQrr4g4eFuNaz8uYQ1U9k4I6btRoGptwM6jK6DxR8cNuVKuViEQv1O2tTtyUDhn8N.class);

    @Inject(method={"onEntityCollision"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2680 class_26802, class_1937 class_19372, class_2338 class_23382, class_1297 class_12972, class_10774 class_107742, CallbackInfo callbackInfo) {
        if (m$$aQ4q1TxdQKz4BFU6nT1XmNv63cqaPCoFaXeROTZ8XJtEho1HFOqgyAuiJpYGMBe8xwxAqDbtldokjhP7Dp7ngOmSKWBhpNCM8.m$$Hwnm86yb11ID3LcoFwvDQd0gnYKIYI8FRZeSbZjAgIWWO2GU9VpZNwPBTFdQYlvF3k6C3GVoZZ961hUknoZ6b39BLf0bQLxcK(1962883327)) {
            callbackInfo.cancel();
        }
    }
}

