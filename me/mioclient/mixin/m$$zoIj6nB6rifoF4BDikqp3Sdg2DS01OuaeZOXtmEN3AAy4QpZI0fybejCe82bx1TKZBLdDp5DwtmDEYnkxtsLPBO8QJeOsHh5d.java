package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$Q2ERdZ3xRYod7FvlIkKynPG6KHLWrQoM5iordEXbaZEYXfQkcOqvxAKQyLvVZJCMKlr1nUMmH78xV93T7xzST9gkbYpDYQGwm;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2394;
import net.minecraft.class_2680;
import net.minecraft.class_702;
import net.minecraft.class_703;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_702.class})
public abstract class m$$zoIj6nB6rifoF4BDikqp3Sdg2DS01OuaeZOXtmEN3AAy4QpZI0fybejCe82bx1TKZBLdDp5DwtmDEYnkxtsLPBO8QJeOsHh5d {
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$HCLYffB2xUi9kRIvzPbYXEPDkBbgRzyasQROo8LRzCqiAbVpDalp3fff8DYFEgqSZjoXERFYAYzuYkJ3MfejjwbPcRkL3wwdd = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);

    @Shadow
    @Nullable
    protected abstract class_703 method_3055(class_2394 var1, double var2, double var4, double var6, double var8, double var10, double var12);

    @Inject(method={"addParticle(Lnet/minecraft/client/particle/Particle;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_703 class_7032, CallbackInfo callbackInfo) {
        m$$Q2ERdZ3xRYod7FvlIkKynPG6KHLWrQoM5iordEXbaZEYXfQkcOqvxAKQyLvVZJCMKlr1nUMmH78xV93T7xzST9gkbYpDYQGwm m$$Q2ERdZ3xRYod7FvlIkKynPG6KHLWrQoM5iordEXbaZEYXfQkcOqvxAKQyLvVZJCMKlr1nUMmH78xV93T7xzST9gkbYpDYQGwm = new m$$Q2ERdZ3xRYod7FvlIkKynPG6KHLWrQoM5iordEXbaZEYXfQkcOqvxAKQyLvVZJCMKlr1nUMmH78xV93T7xzST9gkbYpDYQGwm(class_7032);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$Q2ERdZ3xRYod7FvlIkKynPG6KHLWrQoM5iordEXbaZEYXfQkcOqvxAKQyLvVZJCMKlr1nUMmH78xV93T7xzST9gkbYpDYQGwm);
        if (m$$Q2ERdZ3xRYod7FvlIkKynPG6KHLWrQoM5iordEXbaZEYXfQkcOqvxAKQyLvVZJCMKlr1nUMmH78xV93T7xzST9gkbYpDYQGwm.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"addParticle(Lnet/minecraft/particle/ParticleEffect;DDDDDD)Lnet/minecraft/client/particle/Particle;"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2394 class_23942, double d, double d2, double d3, double d4, double d5, double d6, CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$HCLYffB2xUi9kRIvzPbYXEPDkBbgRzyasQROo8LRzCqiAbVpDalp3fff8DYFEgqSZjoXERFYAYzuYkJ3MfejjwbPcRkL3wwdd.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_23942)) {
            callbackInfoReturnable.setReturnValue((Object)this.method_3055(class_23942, d, d2, d3, d4, d5, d6));
            callbackInfoReturnable.cancel();
        }
    }

    @Inject(method={"addBlockBreakingParticles"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2338 class_23382, class_2350 class_23502, CallbackInfo callbackInfo) {
        if (m$$HCLYffB2xUi9kRIvzPbYXEPDkBbgRzyasQROo8LRzCqiAbVpDalp3fff8DYFEgqSZjoXERFYAYzuYkJ3MfejjwbPcRkL3wwdd.m$$3iTd7NIqbrZUVQa0VjZWy5HXwLwpjvrC0YKJjtBCndj0FFtE2AWephh7PKhvhdm1w8joIdXYL2JBvaqtJsfkU8THz5IxFRhb1(630617921)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"addBlockBreakParticles"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2338 class_23382, class_2680 class_26802, CallbackInfo callbackInfo) {
        if (m$$HCLYffB2xUi9kRIvzPbYXEPDkBbgRzyasQROo8LRzCqiAbVpDalp3fff8DYFEgqSZjoXERFYAYzuYkJ3MfejjwbPcRkL3wwdd.m$$3iTd7NIqbrZUVQa0VjZWy5HXwLwpjvrC0YKJjtBCndj0FFtE2AWephh7PKhvhdm1w8joIdXYL2JBvaqtJsfkU8THz5IxFRhb1(630617921)) {
            callbackInfo.cancel();
        }
    }
}

