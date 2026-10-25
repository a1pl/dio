package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT;
import me.mioclient.m$$JWkE1vFfNBqsaajSliM41PCH12JzaVx7aOFnkJ8MGcJusUH5vklvWPh36kE7OpUjZt6VAgAWcOqtHPG9t22Y4WDHmf4U3vtyX;
import me.mioclient.m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb;
import me.mioclient.m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45;
import me.mioclient.m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF;
import me.mioclient.m$$lnDF2xI8YidbRK8zBib8oQvfxCnz43Uhz3dOw8j4F2C4YWOxfO5UE5QjNx4ZhiXBvIDFC1Y5ip7irevRiUZ7hWpHoF9cwCqQL;
import me.mioclient.m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U;
import net.minecraft.class_10014;
import net.minecraft.class_10017;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_630;
import net.minecraft.class_892;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_892.class})
public class m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU {
    private static final m$$JWkE1vFfNBqsaajSliM41PCH12JzaVx7aOFnkJ8MGcJusUH5vklvWPh36kE7OpUjZt6VAgAWcOqtHPG9t22Y4WDHmf4U3vtyX m$$0FAdap2jg7q2ZeRaQ2iT9bKmaD3ATKYQGn7Kflp7sD2N9h97eQkLTPlRoCFVfOeBYuL1ry6YOr7ZJfyCN1e2WnSeStGHoIFYy = (m$$JWkE1vFfNBqsaajSliM41PCH12JzaVx7aOFnkJ8MGcJusUH5vklvWPh36kE7OpUjZt6VAgAWcOqtHPG9t22Y4WDHmf4U3vtyX)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$JWkE1vFfNBqsaajSliM41PCH12JzaVx7aOFnkJ8MGcJusUH5vklvWPh36kE7OpUjZt6VAgAWcOqtHPG9t22Y4WDHmf4U3vtyX.class);
    private static final m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb m$$Phd4PITzdOGnz9tu0gQI9c2gi4cYbZfyg23rfyHwtR7h3afxCyEA1IzOmDMibybWznU2DECjHkWuIoqltAGQXSLEsZ4h5d0Ij = (m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.class);
    private static final m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1 = (m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF.class);
    @Shadow
    @Final
    private static class_2960 field_4663;
    @Unique
    private static class_1511 m$$T7kqf5nxAXDABAbzvuHY1Ht2CtHnT5niDVYUVT4zyOyBn0cd08tErvgwd404GiBTv40eLmrcOq0VUP3SEYS0DCG3UaWw3gtHh;

    @ModifyArgs(method={"render*"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/util/math/MatrixStack;scale(FFF)V", ordinal=0))
    private void m$$To3vhJ3WNHdOvPenZy6hBvuDgvoeXq6w8509uDqfBHJUZabEDFnEF0ubsZKnh9UBXReXrwigjnISrN3BxsODfNDDLhjE5DEVb(Args args) {
        if (m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1.isToggled() && ((Boolean)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1.m$$aledMj3EVojCvJqDfo2trqdWNBeytdwr8EPWWlCD7yLjPLVBK7wGdFafsd4MO1iN6GDjp6VYBn67YAMrcr6cfHr5tVyItb2bn.getValue()).booleanValue()) {
            args.set(0, (Object)Float.valueOf(((Float)args.get(0)).floatValue() * ((Float)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1.m$$D22KbWl8jkhHH12LfNiUI82fQTv4J1z1F6XA60t31yQlrcdC0ueWb2OpyPjiBOJtq2qOqvyiB3KCzLEmIXpYOe3omUM30657q.getValue()).floatValue()));
            args.set(1, (Object)Float.valueOf(((Float)args.get(1)).floatValue() * ((Float)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1.m$$D22KbWl8jkhHH12LfNiUI82fQTv4J1z1F6XA60t31yQlrcdC0ueWb2OpyPjiBOJtq2qOqvyiB3KCzLEmIXpYOe3omUM30657q.getValue()).floatValue()));
            args.set(2, (Object)Float.valueOf(((Float)args.get(2)).floatValue() * ((Float)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1.m$$D22KbWl8jkhHH12LfNiUI82fQTv4J1z1F6XA60t31yQlrcdC0ueWb2OpyPjiBOJtq2qOqvyiB3KCzLEmIXpYOe3omUM30657q.getValue()).floatValue()));
        }
    }

    @ModifyExpressionValue(method={"render(Lnet/minecraft/client/render/entity/state/EndCrystalEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="FIELD", target="Lnet/minecraft/client/render/entity/EndCrystalEntityRenderer;END_CRYSTAL:Lnet/minecraft/client/render/RenderLayer;")})
    private class_1921 m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1921 class_19212) {
        if (m$$Phd4PITzdOGnz9tu0gQI9c2gi4cYbZfyg23rfyHwtR7h3afxCyEA1IzOmDMibybWznU2DECjHkWuIoqltAGQXSLEsZ4h5d0Ij.isToggled() && m$$Phd4PITzdOGnz9tu0gQI9c2gi4cYbZfyg23rfyHwtR7h3afxCyEA1IzOmDMibybWznU2DECjHkWuIoqltAGQXSLEsZ4h5d0Ij.m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr((class_1297)m$$T7kqf5nxAXDABAbzvuHY1Ht2CtHnT5niDVYUVT4zyOyBn0cd08tErvgwd404GiBTv40eLmrcOq0VUP3SEYS0DCG3UaWw3gtHh, 1940432090) && ((Boolean)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$Phd4PITzdOGnz9tu0gQI9c2gi4cYbZfyg23rfyHwtR7h3afxCyEA1IzOmDMibybWznU2DECjHkWuIoqltAGQXSLEsZ4h5d0Ij.m$$3K94576xuXyWABHKtxDca7XfojrQN6LIX3AIYXS7ipfZTSfYhi0aztZrjDe5BvDs5nXFh5lbk81f3HP7eYliUBXeuiQEmii3k.getValue()).booleanValue()) {
            return m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(field_4663);
        }
        return class_19212;
    }

    @Inject(method={"render(Lnet/minecraft/client/render/entity/state/EndCrystalEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_10014 class_100142, class_4587 class_45872, class_4597 class_45972, int n, CallbackInfo callbackInfo) {
        m$$T7kqf5nxAXDABAbzvuHY1Ht2CtHnT5niDVYUVT4zyOyBn0cd08tErvgwd404GiBTv40eLmrcOq0VUP3SEYS0DCG3UaWw3gtHh = (class_1511)m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_10017)class_100142);
        if (System.currentTimeMillis() - ((m$$lnDF2xI8YidbRK8zBib8oQvfxCnz43Uhz3dOw8j4F2C4YWOxfO5UE5QjNx4ZhiXBvIDFC1Y5ip7irevRiUZ7hWpHoF9cwCqQL)m$$T7kqf5nxAXDABAbzvuHY1Ht2CtHnT5niDVYUVT4zyOyBn0cd08tErvgwd404GiBTv40eLmrcOq0VUP3SEYS0DCG3UaWw3gtHh).getSpawnTime() > (long)Math.max(m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$DCP1OlK4mrMuNMJyUpCBlLFJQ81dBHrl0cZcBgVGZpr3d373310DEuHUxX0CvLmbBDaYlaHoPTqGrarUJAnNKVoN4EPgTL5j8.m$$8C3cvTbViS4XQEogRFnO4VdistdFImHENy8CjWIVZlk9vRYO0ZQq21dZ1moCxOwmW48uVIoDdyLbMqLl8VhopyY0LP4bz3Rma(-1728696158), 50) && m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$T7kqf5nxAXDABAbzvuHY1Ht2CtHnT5niDVYUVT4zyOyBn0cd08tErvgwd404GiBTv40eLmrcOq0VUP3SEYS0DCG3UaWw3gtHh.field_6012 < 10 && m$$0FAdap2jg7q2ZeRaQ2iT9bKmaD3ATKYQGn7Kflp7sD2N9h97eQkLTPlRoCFVfOeBYuL1ry6YOr7ZJfyCN1e2WnSeStGHoIFYy.isToggled() && ((Boolean)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$0FAdap2jg7q2ZeRaQ2iT9bKmaD3ATKYQGn7Kflp7sD2N9h97eQkLTPlRoCFVfOeBYuL1ry6YOr7ZJfyCN1e2WnSeStGHoIFYy.m$$3Ya1pqTVjg27Z8BuNxVGkcrYXm80AyAzy6PRUjrDwa1Hs76Wxj9Vx1HELXGyO4zj9LewiRHznhIPJak5Fr6RHWwbWoe0MDVtp.getValue()).booleanValue() && ((m$$lnDF2xI8YidbRK8zBib8oQvfxCnz43Uhz3dOw8j4F2C4YWOxfO5UE5QjNx4ZhiXBvIDFC1Y5ip7irevRiUZ7hWpHoF9cwCqQL)m$$T7kqf5nxAXDABAbzvuHY1Ht2CtHnT5niDVYUVT4zyOyBn0cd08tErvgwd404GiBTv40eLmrcOq0VUP3SEYS0DCG3UaWw3gtHh).isMioAttacked()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"getYOffset"}, at={@At(value="HEAD")}, cancellable=true)
    private static void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(float f, CallbackInfoReturnable callbackInfoReturnable) {
        if (!m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1.isToggled() || !((Boolean)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1.m$$aledMj3EVojCvJqDfo2trqdWNBeytdwr8EPWWlCD7yLjPLVBK7wGdFafsd4MO1iN6GDjp6VYBn67YAMrcr6cfHr5tVyItb2bn.getValue()).booleanValue()) {
            return;
        }
        float f2 = class_3532.method_15374((float)(f * 0.2f)) / 2.0f + 0.5f;
        float f3 = 1.0f;
        if (m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1.isToggled() && ((Boolean)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1.m$$aledMj3EVojCvJqDfo2trqdWNBeytdwr8EPWWlCD7yLjPLVBK7wGdFafsd4MO1iN6GDjp6VYBn67YAMrcr6cfHr5tVyItb2bn.getValue()).booleanValue()) {
            f3 = ((Float)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1.m$$3MjWaBdXnLojzedLoJQqVdF8pXIta1RX8s40TMMf1rvsi23jNqY1rgy4JzhSa4jeSFvB5AhWVG2o3Nds2LVhnnY9jAMhhXVux.getValue()).floatValue();
        }
        if (m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$T7kqf5nxAXDABAbzvuHY1Ht2CtHnT5niDVYUVT4zyOyBn0cd08tErvgwd404GiBTv40eLmrcOq0VUP3SEYS0DCG3UaWw3gtHh.field_6012 < 10 && m$$0FAdap2jg7q2ZeRaQ2iT9bKmaD3ATKYQGn7Kflp7sD2N9h97eQkLTPlRoCFVfOeBYuL1ry6YOr7ZJfyCN1e2WnSeStGHoIFYy.isToggled() && ((Float)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1.m$$3MjWaBdXnLojzedLoJQqVdF8pXIta1RX8s40TMMf1rvsi23jNqY1rgy4JzhSa4jeSFvB5AhWVG2o3Nds2LVhnnY9jAMhhXVux.getValue()).floatValue() != 0.0f && ((Boolean)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$0FAdap2jg7q2ZeRaQ2iT9bKmaD3ATKYQGn7Kflp7sD2N9h97eQkLTPlRoCFVfOeBYuL1ry6YOr7ZJfyCN1e2WnSeStGHoIFYy.m$$3Ya1pqTVjg27Z8BuNxVGkcrYXm80AyAzy6PRUjrDwa1Hs76Wxj9Vx1HELXGyO4zj9LewiRHznhIPJak5Fr6RHWwbWoe0MDVtp.getValue()).booleanValue() && ((m$$lnDF2xI8YidbRK8zBib8oQvfxCnz43Uhz3dOw8j4F2C4YWOxfO5UE5QjNx4ZhiXBvIDFC1Y5ip7irevRiUZ7hWpHoF9cwCqQL)m$$T7kqf5nxAXDABAbzvuHY1Ht2CtHnT5niDVYUVT4zyOyBn0cd08tErvgwd404GiBTv40eLmrcOq0VUP3SEYS0DCG3UaWw3gtHh).isMioAttacked()) {
            f3 *= ((m$$lnDF2xI8YidbRK8zBib8oQvfxCnz43Uhz3dOw8j4F2C4YWOxfO5UE5QjNx4ZhiXBvIDFC1Y5ip7irevRiUZ7hWpHoF9cwCqQL)m$$T7kqf5nxAXDABAbzvuHY1Ht2CtHnT5niDVYUVT4zyOyBn0cd08tErvgwd404GiBTv40eLmrcOq0VUP3SEYS0DCG3UaWw3gtHh).getSpawnTime() % 2L == 0L ? 0.0f : 1.0f;
        }
        f2 = (f2 * f2 + f2) * f3;
        callbackInfoReturnable.cancel();
        callbackInfoReturnable.setReturnValue((Object)Float.valueOf(f2 - 1.4f));
    }

    @Unique
    private boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_630 class_6302, class_4587 class_45872, class_4588 class_45882, int n, int n2, int n3) {
        if (m$$q789jLrnl9JsUidhwlmqhDlKFRkhnoFaeVgNks4rVE5gOll3oLvee7khVGrNxrYTg5jESj9WlmGUQlCmmaJH3UBtPje0PctJ1.m$$ngwg8fTtoOoDXHuvM7rQ6l7gngZbp1iZUdtAfFU14IzEqfuGgJFAdZPT3KarwIDr7AGhdLNcCUrLz0FBv5C6tAEQ7NAYSEl2T(n3, -624792181)) {
            return false;
        }
        if (!m$$Phd4PITzdOGnz9tu0gQI9c2gi4cYbZfyg23rfyHwtR7h3afxCyEA1IzOmDMibybWznU2DECjHkWuIoqltAGQXSLEsZ4h5d0Ij.isToggled() || !((m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$Phd4PITzdOGnz9tu0gQI9c2gi4cYbZfyg23rfyHwtR7h3afxCyEA1IzOmDMibybWznU2DECjHkWuIoqltAGQXSLEsZ4h5d0Ij.m$$rTOS04ae67t6wfkSdDcSCBW9SsvYyZSjOx42Fg4ZpBGu0MhZgKwIGVZr5ashkXknRzjzgEJmxQO7RZgzmREUlEej95z8tAIex.getValue()).m$$QNmhDM27eGY3w8yYdwou28pZAnxCe9LFLNaHTHzwlcF31i6PiUkv81WirfqrEuGVY4yJyJ7NbYNaqzecc1yCQ6HqRujo02ujU() || class_310.method_1551().field_1773.method_19418().method_19326().method_1022(m$$T7kqf5nxAXDABAbzvuHY1Ht2CtHnT5niDVYUVT4zyOyBn0cd08tErvgwd404GiBTv40eLmrcOq0VUP3SEYS0DCG3UaWw3gtHh.method_19538()) > (double)((Integer)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$Phd4PITzdOGnz9tu0gQI9c2gi4cYbZfyg23rfyHwtR7h3afxCyEA1IzOmDMibybWznU2DECjHkWuIoqltAGQXSLEsZ4h5d0Ij.m$$WvcxJgPBQicOv1yrEJBItsutWkKZ6Mw6mK5Rfe6wggv4J6EHJJSJsHfiE8DTM4gKpOnxdP6Pp20PE3YcK8OvR5keXpX6o5hIe.getValue()).intValue()) {
            return true;
        }
        if (m$$Phd4PITzdOGnz9tu0gQI9c2gi4cYbZfyg23rfyHwtR7h3afxCyEA1IzOmDMibybWznU2DECjHkWuIoqltAGQXSLEsZ4h5d0Ij.m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr((class_1297)m$$T7kqf5nxAXDABAbzvuHY1Ht2CtHnT5niDVYUVT4zyOyBn0cd08tErvgwd404GiBTv40eLmrcOq0VUP3SEYS0DCG3UaWw3gtHh, 1940432090)) {
            m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_6302, class_45872, n2);
            if (m$$Phd4PITzdOGnz9tu0gQI9c2gi4cYbZfyg23rfyHwtR7h3afxCyEA1IzOmDMibybWznU2DECjHkWuIoqltAGQXSLEsZ4h5d0Ij.m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus((class_1297)m$$T7kqf5nxAXDABAbzvuHY1Ht2CtHnT5niDVYUVT4zyOyBn0cd08tErvgwd404GiBTv40eLmrcOq0VUP3SEYS0DCG3UaWw3gtHh, -1609117443)) {
                return false;
            }
        }
        return true;
    }

    private static void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_630 class_6302, class_4587 class_45872, int n) {
        if (!(m$$Phd4PITzdOGnz9tu0gQI9c2gi4cYbZfyg23rfyHwtR7h3afxCyEA1IzOmDMibybWznU2DECjHkWuIoqltAGQXSLEsZ4h5d0Ij.isToggled() && ((m$$zqSfxIqFVyScRoXeWJSM5d5cvvNryzSlsR1jQl7uLTeqeEamcFiBHsMAQjsxRRzr1FC737Kb2IjMsNgukWz8bAKteOURTVO3U)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$Phd4PITzdOGnz9tu0gQI9c2gi4cYbZfyg23rfyHwtR7h3afxCyEA1IzOmDMibybWznU2DECjHkWuIoqltAGQXSLEsZ4h5d0Ij.m$$rTOS04ae67t6wfkSdDcSCBW9SsvYyZSjOx42Fg4ZpBGu0MhZgKwIGVZr5ashkXknRzjzgEJmxQO7RZgzmREUlEej95z8tAIex.getValue()).m$$QNmhDM27eGY3w8yYdwou28pZAnxCe9LFLNaHTHzwlcF31i6PiUkv81WirfqrEuGVY4yJyJ7NbYNaqzecc1yCQ6HqRujo02ujU() && ((Boolean)m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU.m$$Phd4PITzdOGnz9tu0gQI9c2gi4cYbZfyg23rfyHwtR7h3afxCyEA1IzOmDMibybWznU2DECjHkWuIoqltAGQXSLEsZ4h5d0Ij.m$$taA0SOPIKwG7H5PiCCUORcQ0n1Zr3BvWU3rrpAAs42ipo2J52drB4My2xcKdndYvATshB1umvCf8CGzP5mBbIYAzM9xTI6qRt.getValue()).booleanValue() && m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.m$$dGYcRLFI24LZN4QtTvULJkQEBOXpr5mDGCnPMtBo0sbBPDg0yHMn0jvpWBFWVpXtgp0ZlbfoQszcf9J3cbv6W6ppR6j18Sx57)) {
            return;
        }
        class_45872.method_22903();
        class_45872.method_22909();
    }
}

