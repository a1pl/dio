package me.mioclient.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import java.util.List;
import java.util.Optional;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$LseN3gBbProNpiYF8rpQAGW8IvyAOilp1rxGFsjebeii9JzwbtI3sJlEAdzxR2DsO2inDsAxFgtMCvzeltg8UPFAmEhdFuOWb;
import me.mioclient.m$$m94zvEqXzHSYregQvagpruxiQ9XgnDxwdKSR3zCAwXFCE08TOlxOp579rx7JSsp5JAGvPsuv45gtBjOHih7tifJUK9ehZ3NRz;
import me.mioclient.m$$qSKPLudNE0CMQXAKDlros2m4T9mWvOVMWZK9EXLZBb5woWSYuajlpo8HgQxO3B2DIJkGR3cEo9ne8PMQn9mTM9sdU01cwp4to;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_332.class})
public abstract class m$$qr3LBrHryrjUuQLS0VRd7OfCfWptYkMOQcEGibJx9GtrbrZEob20lm4FDCbF6bd6yzd7v8UA0a3uKyeHZWS771Nfm6fvZ1Sjp {
    @Unique
    private static m$$qSKPLudNE0CMQXAKDlros2m4T9mWvOVMWZK9EXLZBb5woWSYuajlpo8HgQxO3B2DIJkGR3cEo9ne8PMQn9mTM9sdU01cwp4to tooltips = (m$$qSKPLudNE0CMQXAKDlros2m4T9mWvOVMWZK9EXLZBb5woWSYuajlpo8HgQxO3B2DIJkGR3cEo9ne8PMQn9mTM9sdU01cwp4to)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$qSKPLudNE0CMQXAKDlros2m4T9mWvOVMWZK9EXLZBb5woWSYuajlpo8HgQxO3B2DIJkGR3cEo9ne8PMQn9mTM9sdU01cwp4to.class);
    @Unique
    private boolean m$$bcaK3OZSsUg0voEcdoYEomkE8oTiMBJ7hzVSCKByTR9IOwD6QpOj9dDD2798xHzBlX7HtBjAAIFBmqbzwsxgTw5ha1ErUxrD1 = false;

    @Shadow
    public abstract void method_51427(class_1799 var1, int var2, int var3);

    @Shadow
    public abstract class_4587 method_51448();

    @Inject(at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawItemBar(Lnet/minecraft/item/ItemStack;II)V")}, method={"drawStackOverlay(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V"})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_327 class_3272, class_1799 class_17992, int n, int n2, @Nullable String string, CallbackInfo callbackInfo) {
        if (!tooltips.isToggled() || !((Boolean)m$$qr3LBrHryrjUuQLS0VRd7OfCfWptYkMOQcEGibJx9GtrbrZEob20lm4FDCbF6bd6yzd7v8UA0a3uKyeHZWS771Nfm6fvZ1Sjp.tooltips.m$$QlwDWVKVtNK9ftCR9L9rFeSoNvMwids9n7NxH3O48SAonwGkt7DO2vuLg5OVA2QqlGGR41t5VEyvsGj4e6fOxrP3kVuJNKrav.getValue()).booleanValue()) {
            return;
        }
        for (m$$m94zvEqXzHSYregQvagpruxiQ9XgnDxwdKSR3zCAwXFCE08TOlxOp579rx7JSsp5JAGvPsuv45gtBjOHih7tifJUK9ehZ3NRz m$$m94zvEqXzHSYregQvagpruxiQ9XgnDxwdKSR3zCAwXFCE08TOlxOp579rx7JSsp5JAGvPsuv45gtBjOHih7tifJUK9ehZ3NRz : m$$qr3LBrHryrjUuQLS0VRd7OfCfWptYkMOQcEGibJx9GtrbrZEob20lm4FDCbF6bd6yzd7v8UA0a3uKyeHZWS771Nfm6fvZ1Sjp.tooltips.m$$6whdJEbqMx7h8KAh1pulvhOIkUebPIvdEOCPwsTJ8RpA7xRwK57ZnvQaafXNxvLfQxSFr6HBdmUNZE8pTMhIIgxHZXT93nXZJ) {
            if (m$$m94zvEqXzHSYregQvagpruxiQ9XgnDxwdKSR3zCAwXFCE08TOlxOp579rx7JSsp5JAGvPsuv45gtBjOHih7tifJUK9ehZ3NRz.m$$i8tz9CMjndZyinEnLrXq9AqFaZngn3s9PIZ6KSbJRWvwpe5CqvmWl5bevDt3jO1g8pw44K00ZoEA9p82MMI79K0ovw7kGAcwd(690498199) != class_17992 || m$$m94zvEqXzHSYregQvagpruxiQ9XgnDxwdKSR3zCAwXFCE08TOlxOp579rx7JSsp5JAGvPsuv45gtBjOHih7tifJUK9ehZ3NRz.m$$LUzwaJxPgnEVDqdOinfhXUbNQeBQJvadQfIYuMtsL99DFmdoPdochYo1XD08htIzDU3gLt5C8mFKa4z0q6kD5X6wLKemUYFj7(-883848153) == null) continue;
            this.m$$bcaK3OZSsUg0voEcdoYEomkE8oTiMBJ7hzVSCKByTR9IOwD6QpOj9dDD2798xHzBlX7HtBjAAIFBmqbzwsxgTw5ha1ErUxrD1 = true;
            this.method_51427(m$$m94zvEqXzHSYregQvagpruxiQ9XgnDxwdKSR3zCAwXFCE08TOlxOp579rx7JSsp5JAGvPsuv45gtBjOHih7tifJUK9ehZ3NRz.m$$LUzwaJxPgnEVDqdOinfhXUbNQeBQJvadQfIYuMtsL99DFmdoPdochYo1XD08htIzDU3gLt5C8mFKa4z0q6kD5X6wLKemUYFj7(-883848153), n, n2);
            this.m$$bcaK3OZSsUg0voEcdoYEomkE8oTiMBJ7hzVSCKByTR9IOwD6QpOj9dDD2798xHzBlX7HtBjAAIFBmqbzwsxgTw5ha1ErUxrD1 = false;
        }
    }

    @ModifyArgs(method={"drawItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;IIII)V"}, at=@At(value="INVOKE", target="net/minecraft/client/util/math/MatrixStack.translate(FFF)V"))
    private void m$$C7jwyCZGOGmxYHR6CinqHYKGpwwojfCUt8uyzjRA2awICUF3ogkSBtJt9OZZ5TwdqY7XMH0WNbqisrPkOMONx1NLAAWZsoOL0(Args args) {
        if (this.m$$bcaK3OZSsUg0voEcdoYEomkE8oTiMBJ7hzVSCKByTR9IOwD6QpOj9dDD2798xHzBlX7HtBjAAIFBmqbzwsxgTw5ha1ErUxrD1) {
            args.set(0, (Object)Float.valueOf(((Float)args.get(0)).floatValue() + 3.5f));
            args.set(1, (Object)Float.valueOf(((Float)args.get(1)).floatValue() - 4.0f));
            args.set(2, (Object)Float.valueOf(((Float)args.get(2)).floatValue() + 100.0f));
        }
    }

    @ModifyArgs(method={"drawItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;IIII)V"}, at=@At(value="INVOKE", target="net/minecraft/client/util/math/MatrixStack.scale(FFF)V"))
    private void m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU(Args args) {
        if (this.m$$bcaK3OZSsUg0voEcdoYEomkE8oTiMBJ7hzVSCKByTR9IOwD6QpOj9dDD2798xHzBlX7HtBjAAIFBmqbzwsxgTw5ha1ErUxrD1) {
            args.set(0, (Object)Float.valueOf(10.0f));
            args.set(1, (Object)Float.valueOf(-10.0f));
        }
    }

    @Inject(method={"drawTooltip(Lnet/minecraft/client/font/TextRenderer;Ljava/util/List;Ljava/util/Optional;IILnet/minecraft/util/Identifier;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawTooltip(Lnet/minecraft/client/font/TextRenderer;Ljava/util/List;IILnet/minecraft/client/gui/tooltip/TooltipPositioner;Lnet/minecraft/util/Identifier;)V", shift=At.Shift.BEFORE)}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_327 class_3272, List list, Optional optional, int n, int n2, class_2960 class_29602, CallbackInfo callbackInfo, @Local(ordinal=1) List list2) {
        if (!m$$LseN3gBbProNpiYF8rpQAGW8IvyAOilp1rxGFsjebeii9JzwbtI3sJlEAdzxR2DsO2inDsAxFgtMCvzeltg8UPFAmEhdFuOWb.m$$xPAgWgsVZRNsGQmmJaUieSNuoLS8nuBvirud8Y4KHtb4082WIhVZkeG3GkHIJnuX4etlo80tv3oBhGo92ijd7NYO2Z28h1Uio(-442880530)) {
            return;
        }
        m$$LseN3gBbProNpiYF8rpQAGW8IvyAOilp1rxGFsjebeii9JzwbtI3sJlEAdzxR2DsO2inDsAxFgtMCvzeltg8UPFAmEhdFuOWb.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP(list2);
        callbackInfo.cancel();
    }
}

