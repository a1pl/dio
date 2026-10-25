package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import me.mioclient.m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh;
import me.mioclient.m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45;
import me.mioclient.m$$gecJhhZ5bqsyAmY1nCyDbpcflBo5co5nSuBpV58RsYFIwQvpmrPVCePYqvctZ54LDWestqhB64wMl84nltFiv4eMa7ymqLzqd;
import me.mioclient.m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF;
import net.minecraft.class_10017;
import net.minecraft.class_10042;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_5617;
import net.minecraft.class_583;
import net.minecraft.class_591;
import net.minecraft.class_742;
import net.minecraft.class_7833;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_1007.class})
public abstract class m$$EOjNslxDicSrPv2Pcu8ZewlDwv4HlMfwnmOfdjq3GtE2vs9FhB90OJTHSRLpyRebQ1e8Cl4QqTUzKWFc73biVF3MZ7aXfLiOc
extends class_922 {
    private static final m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF m$$hJf6ZDyP4YffwCzULm1zccaHSp5Br6o9dfwlEsr1iZYU2T1oa9HHdEoPLhBrOxwo4Ngm5vGo4kluwJDkgZzV6CBT9R01yr51J = (m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF.class);
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$LqZXWVZeOMTF9ZjDE7T5J9mTn8CoKJ1zKenr576hKBMt1YRtqBFRB7mb7XWO1K4J52OhQy6IGjYxWlPczaFZhpwKRGIfvrehY = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    private static final m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh m$$RpOUkrOwQoqCDyuZFSh9uM8wQPDbwb0tZaEHBUSEQ6Xj8q0sn0EwEPcEssNPMUjwi1oyI5EYgeYlqKduEaHoeuB6JyH1CTQNN = (m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh.class);
    @Unique
    class_742 m$$lUTO7T7jJ7WLEvdxQxOMTA8XsxmWzk6dLoweLkhmh35FeQ2bHRiU4F9KPC86bE2dCPsfSYxTX0BDpmNvhnCAQvv6veMSrldqv;

    public m$$EOjNslxDicSrPv2Pcu8ZewlDwv4HlMfwnmOfdjq3GtE2vs9FhB90OJTHSRLpyRebQ1e8Cl4QqTUzKWFc73biVF3MZ7aXfLiOc(class_5617.class_5618 class_56182, class_591 class_5912, float f) {
        super(class_56182, (class_583)class_5912, f);
    }

    @Inject(method={"getPositionOffset(Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;)Lnet/minecraft/util/math/Vec3d;"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_10055 class_100552, CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$hJf6ZDyP4YffwCzULm1zccaHSp5Br6o9dfwlEsr1iZYU2T1oa9HHdEoPLhBrOxwo4Ngm5vGo4kluwJDkgZzV6CBT9R01yr51J.m$$bC7v2Cok1UHoyTGqNwY0cWKP7ZPo2eH9CSAV1ZENjjmmlJHDRTXW6LrZHpjOziK6Q3ygxOFQor2pSAUGPtnGLzFMpLxl6BplV(1559246842) && !m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI(m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_10017)class_100552))) {
            callbackInfoReturnable.setReturnValue((Object)new class_243(0.0, (double)(class_100552.field_53453 * -2.0f) / 16.0, 0.0));
        }
    }

    @Inject(method={"scale(Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;)V"}, at={@At(value="HEAD")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_10055 class_100552, class_4587 class_45872, CallbackInfo callbackInfo) {
        this.m$$lUTO7T7jJ7WLEvdxQxOMTA8XsxmWzk6dLoweLkhmh35FeQ2bHRiU4F9KPC86bE2dCPsfSYxTX0BDpmNvhnCAQvv6veMSrldqv = (class_742)m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_10017)class_100552);
    }

    @ModifyArgs(method={"scale(Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/util/math/MatrixStack;scale(FFF)V"))
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(Args args, @Local(argsOnly=true) class_10055 class_100552) {
        if (m$$hJf6ZDyP4YffwCzULm1zccaHSp5Br6o9dfwlEsr1iZYU2T1oa9HHdEoPLhBrOxwo4Ngm5vGo4kluwJDkgZzV6CBT9R01yr51J.isToggled() && m$$hJf6ZDyP4YffwCzULm1zccaHSp5Br6o9dfwlEsr1iZYU2T1oa9HHdEoPLhBrOxwo4Ngm5vGo4kluwJDkgZzV6CBT9R01yr51J.m$$2FOkFuheGW6BJCienxgkLiqQhpR3MVn2nfyrdBwOq4Y5Wm0hkM64T5Wl0enmqVgsIrybYtfsKHD3DaHX3x1HhAdlICCND4SUz(-2053625046) && this.m$$lUTO7T7jJ7WLEvdxQxOMTA8XsxmWzk6dLoweLkhmh35FeQ2bHRiU4F9KPC86bE2dCPsfSYxTX0BDpmNvhnCAQvv6veMSrldqv != class_310.method_1551().field_1724) {
            args.set(0, (Object)Float.valueOf(((Float)args.get(0)).floatValue() * ((Float)m$$EOjNslxDicSrPv2Pcu8ZewlDwv4HlMfwnmOfdjq3GtE2vs9FhB90OJTHSRLpyRebQ1e8Cl4QqTUzKWFc73biVF3MZ7aXfLiOc.m$$hJf6ZDyP4YffwCzULm1zccaHSp5Br6o9dfwlEsr1iZYU2T1oa9HHdEoPLhBrOxwo4Ngm5vGo4kluwJDkgZzV6CBT9R01yr51J.m$$pHXQVRlsKx0iVOgQvCNEHW8NzMcPC6btCwIwwGYpS64aoYOj5ZX3PmP5tNrgAnyQadfSp2WZycFqvwSjAylLLxA6sUpgbwYci.getValue()).floatValue()));
            args.set(1, (Object)Float.valueOf(((Float)args.get(1)).floatValue() * ((Float)m$$EOjNslxDicSrPv2Pcu8ZewlDwv4HlMfwnmOfdjq3GtE2vs9FhB90OJTHSRLpyRebQ1e8Cl4QqTUzKWFc73biVF3MZ7aXfLiOc.m$$hJf6ZDyP4YffwCzULm1zccaHSp5Br6o9dfwlEsr1iZYU2T1oa9HHdEoPLhBrOxwo4Ngm5vGo4kluwJDkgZzV6CBT9R01yr51J.m$$pHXQVRlsKx0iVOgQvCNEHW8NzMcPC6btCwIwwGYpS64aoYOj5ZX3PmP5tNrgAnyQadfSp2WZycFqvwSjAylLLxA6sUpgbwYci.getValue()).floatValue()));
            args.set(2, (Object)Float.valueOf(((Float)args.get(2)).floatValue() * ((Float)m$$EOjNslxDicSrPv2Pcu8ZewlDwv4HlMfwnmOfdjq3GtE2vs9FhB90OJTHSRLpyRebQ1e8Cl4QqTUzKWFc73biVF3MZ7aXfLiOc.m$$hJf6ZDyP4YffwCzULm1zccaHSp5Br6o9dfwlEsr1iZYU2T1oa9HHdEoPLhBrOxwo4Ngm5vGo4kluwJDkgZzV6CBT9R01yr51J.m$$pHXQVRlsKx0iVOgQvCNEHW8NzMcPC6btCwIwwGYpS64aoYOj5ZX3PmP5tNrgAnyQadfSp2WZycFqvwSjAylLLxA6sUpgbwYci.getValue()).floatValue()));
        }
        if (m$$hJf6ZDyP4YffwCzULm1zccaHSp5Br6o9dfwlEsr1iZYU2T1oa9HHdEoPLhBrOxwo4Ngm5vGo4kluwJDkgZzV6CBT9R01yr51J.m$$bC7v2Cok1UHoyTGqNwY0cWKP7ZPo2eH9CSAV1ZENjjmmlJHDRTXW6LrZHpjOziK6Q3ygxOFQor2pSAUGPtnGLzFMpLxl6BplV(1559246842) && !m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI(this.m$$lUTO7T7jJ7WLEvdxQxOMTA8XsxmWzk6dLoweLkhmh35FeQ2bHRiU4F9KPC86bE2dCPsfSYxTX0BDpmNvhnCAQvv6veMSrldqv)) {
            class_100552.field_53410 = true;
            class_100552.field_53334 = true;
        }
    }

    @ModifyArgs(method={"setupTransforms(Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;FF)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/util/math/MatrixStack;multiply(Lorg/joml/Quaternionfc;)V"))
    private void m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x(Args args) {
        if (!m$$RpOUkrOwQoqCDyuZFSh9uM8wQPDbwb0tZaEHBUSEQ6Xj8q0sn0EwEPcEssNPMUjwi1oyI5EYgeYlqKduEaHoeuB6JyH1CTQNN.isToggled()) {
            return;
        }
        if (m$$EOjNslxDicSrPv2Pcu8ZewlDwv4HlMfwnmOfdjq3GtE2vs9FhB90OJTHSRLpyRebQ1e8Cl4QqTUzKWFc73biVF3MZ7aXfLiOc.m$$RpOUkrOwQoqCDyuZFSh9uM8wQPDbwb0tZaEHBUSEQ6Xj8q0sn0EwEPcEssNPMUjwi1oyI5EYgeYlqKduEaHoeuB6JyH1CTQNN.m$$XllnuTY2kO7g28STWd7xPc2rdZWa1U9P2KWG708Dj6nYph2kkP9ur7vb68Kvg60QnxljDG9VYLD4y0oAB10OVr5M2vqGfw9oh.getValue() == m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$0QzhjyGoDpdx3ZH0rQve5ItuikubsGknIJAO1ExKjaX0wEa7SbHd0jm3kWgYCZXXO88B5zDt9CxJpkQ7NUHVSONwkgTB1XDWb && m$$RpOUkrOwQoqCDyuZFSh9uM8wQPDbwb0tZaEHBUSEQ6Xj8q0sn0EwEPcEssNPMUjwi1oyI5EYgeYlqKduEaHoeuB6JyH1CTQNN.m$$Jgo2D1LKsQfvB2rvxgxIzY3s8AmdISwCcNXxD921aJ3vNyyxnsVNaKaDeYTkLdktHRuD2Z2uqQKsIAGDgLxB9HKTFk7Yk4wSd(1586059750) && ((Boolean)m$$EOjNslxDicSrPv2Pcu8ZewlDwv4HlMfwnmOfdjq3GtE2vs9FhB90OJTHSRLpyRebQ1e8Cl4QqTUzKWFc73biVF3MZ7aXfLiOc.m$$RpOUkrOwQoqCDyuZFSh9uM8wQPDbwb0tZaEHBUSEQ6Xj8q0sn0EwEPcEssNPMUjwi1oyI5EYgeYlqKduEaHoeuB6JyH1CTQNN.m$$MLuwdqSbzNs9Zr6dnAE0YRi4m0H15OryPsjf1YEKID3fSefqV8b3Bs8gvHWJzUv7qZhIx7bJ6SO0MrlOWFMhLdnKcdXbngypP.getValue()).booleanValue() && ((Boolean)m$$EOjNslxDicSrPv2Pcu8ZewlDwv4HlMfwnmOfdjq3GtE2vs9FhB90OJTHSRLpyRebQ1e8Cl4QqTUzKWFc73biVF3MZ7aXfLiOc.m$$RpOUkrOwQoqCDyuZFSh9uM8wQPDbwb0tZaEHBUSEQ6Xj8q0sn0EwEPcEssNPMUjwi1oyI5EYgeYlqKduEaHoeuB6JyH1CTQNN.m$$XX7aIFk9ORRsYUbNdPFJbhhc7fJOxyMqdRtqK9GLe1zfapMjOjaNS0ikclI1dvoIa7Y87IRpZYO1QdfRGlnKgh2kvbx1uKYhY.getValue()).booleanValue()) {
            args.set(0, (Object)class_7833.field_40714.rotationDegrees((float)(-m$$gecJhhZ5bqsyAmY1nCyDbpcflBo5co5nSuBpV58RsYFIwQvpmrPVCePYqvctZ54LDWestqhB64wMl84nltFiv4eMa7ymqLzqd.m$$6W17VFzuds5T6cOVlT6zM6SJ20NYsxBnu0W5C71qEWI2FZFLkPhmeFTdwgqshSYKE7KOMYsV3zArc6IWsLcjb7k7DuYfgI08d)));
        }
    }

    @ModifyExpressionValue(method={"renderArm"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/RenderLayer;getEntityTranslucent(Lnet/minecraft/util/Identifier;)Lnet/minecraft/client/render/RenderLayer;")})
    private class_1921 m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_1921 class_19212, @Local(argsOnly=true) class_2960 class_29602) {
        if (m$$LqZXWVZeOMTF9ZjDE7T5J9mTn8CoKJ1zKenr576hKBMt1YRtqBFRB7mb7XWO1K4J52OhQy6IGjYxWlPczaFZhpwKRGIfvrehY.isToggled() && ((Boolean)m$$EOjNslxDicSrPv2Pcu8ZewlDwv4HlMfwnmOfdjq3GtE2vs9FhB90OJTHSRLpyRebQ1e8Cl4QqTUzKWFc73biVF3MZ7aXfLiOc.m$$LqZXWVZeOMTF9ZjDE7T5J9mTn8CoKJ1zKenr576hKBMt1YRtqBFRB7mb7XWO1K4J52OhQy6IGjYxWlPczaFZhpwKRGIfvrehY.m$$q8iRgPuX9FUu5OZSyOsiDcSjtgCweC22zLLwwjHoVObb9GE0a16Ur4gOEHwuJhB9RxuGHDuHj8XCtoiJQ3bawaxOrUZajgvnx.getValue()).booleanValue() && m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$JtS6y3OKtFrQBGPhp1gae1DLvN1o1q0CdA2l8YvkOM7MOgIwqYlQCSkJtW7xplPv6MutK1dKT8LRXJ59kItBpnJbycC0MEz7C.m$$a3qcWmacuu2a0vwsi4RmEzyQiHzp11joDO1Au10HYlzWmTi190jlMmGksXtwEoS0Xwa30eShEpoVX5zKeDnZ5HRhYLkYky0Pt) {
            return class_1921.method_23572((class_2960)class_29602);
        }
        return class_19212;
    }

    @ModifyExpressionValue(method={"renderArm"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/RenderLayer;getEntityTranslucent(Lnet/minecraft/util/Identifier;)Lnet/minecraft/client/render/RenderLayer;")})
    private class_1921 m$$si2aX2X8Dch8BrpPv8C89mK3tHVjy6by3nrWOWcgTRS3w0VNjCaT6TzOK1vZM0JWisN0y7s9j2U6LywGMjYOWySMMEgPZT7WH(class_1921 class_19212, @Local(argsOnly=true) class_2960 class_29602) {
        if (m$$LqZXWVZeOMTF9ZjDE7T5J9mTn8CoKJ1zKenr576hKBMt1YRtqBFRB7mb7XWO1K4J52OhQy6IGjYxWlPczaFZhpwKRGIfvrehY.m$$vmT7k0MWDRXjMriNX6IaDN65AvjzfJj4kvtEJE5uCDB7qwZ8OnjrfoaHufObEe1a4MiQY9eJDLdqzlk2lQZSWUBXj70bnqEB7(-845063330) != 1.0f) {
            return m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_29602);
        }
        return class_19212;
    }

    protected /* synthetic */ float method_55831(class_10017 class_100172) {
        return super.method_55832((class_10042)class_100172);
    }
}

