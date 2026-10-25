package me.mioclient.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import java.awt.Color;
import java.util.Random;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$HF6xcp0tb4bRXiB1EXcTEHaNi5cBmGg2yStyyaxeBxioFrqtzkvHzkRpLiE7Erm19nrVaCKZMYCFGdtMDhWoWvb2QbVp1mQv2;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$SyNr9C8dWqJg6VdbHL7kYfVmVwglSAxJTcs9lCtOM56jL280GMTyIe5Ii91cPIxP1TvSSDHgebxECtkpqaG12L2IZ5liKPIZf;
import me.mioclient.m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc;
import me.mioclient.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml;
import me.mioclient.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj;
import me.mioclient.m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$zfldNZWJSxHy0Alw9Cqa3yNZ8WZ8yoJ6Drozs6MdqpmH0pR8ir3ZWdNM4n98DoQnCWQ1nIIZZy9nbFt2sNJRCEqD17MNg5oGe;
import net.minecraft.class_1297;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_243;
import net.minecraft.class_4761;
import net.minecraft.class_5294;
import net.minecraft.class_5819;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_638.class})
public abstract class m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11
implements m$$HF6xcp0tb4bRXiB1EXcTEHaNi5cBmGg2yStyyaxeBxioFrqtzkvHzkRpLiE7Erm19nrVaCKZMYCFGdtMDhWoWvb2QbVp1mQv2 {
    private static m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL = (m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj.class);
    private static m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml m$$h6YK9QjDoMTr6MXOhtlGTjBp7y0YtqKAgZLe07Ls67QzPUmzRr17jYrMRTv0uHNS5s8YWDE9aAK2nmZbLbd8ZKM3Ox497EJfz = (m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml.class);
    @Shadow
    @Final
    private class_5294 field_24606;
    @Unique
    private final class_5294 m$$q2Nv01hurOmN05aWsuAUu6HgxiwRHZQFFxMx2B9OFCFcoeqvvvxqZeiMBvegYWGpEsUZYuSaKIkJVTinkE4lVykq8hP4aIXZ9 = new class_5294.class_5295();
    @Unique
    private final class_5294 m$$JHUQQvBBRGW2a7dHn0HsX575yQpeZUxhQnpnFdnXlCUPUJTu7TSjAVhmJdNWT5PeNVS5JiVmpCGVelFlrHcTiInvputupI0aq = new class_5294.class_5297();
    @Unique
    private final class_5294 m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU = new class_5294(this, Float.NaN, true, class_5294.class_5401.field_25639, false, false){
        private static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 127563327;

        public class_243 method_28112(class_243 class_2432, float f) {
            return class_243.method_24457((int)((Color)m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11.m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.m$$Vuihn15CBMy32zTrgIEhkYjzXMtmsTPj4xWQX7I5CytAPIcQq2j6wH4tecdl6hklpiOLfNxTyjJZcX8Wz2ZJE8mc9GJvShpuT.getValue()).getRGB());
        }

        public boolean method_28110(int n, int n2) {
            return (Boolean)m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11.m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.m$$hj794Lq0SJO8X1cWnbPfHFHXBZU0vWPxAkV77c0xaEqKB7aCJ9UFWv4MpKzXKMIGWsTgrsluqasYYjIxqgpkAyE39ukLz1vQt.getValue();
        }
    };
    @Unique
    private final Random m$$PjcpaOoCllt7z1H6dQL3rUihYA0cavBJ6aUiKTF9aI4zibTEqXvGvIuz9nuV70CJP76AmQ2AviW7xb3dUgUQZmZaiwHnwCwrF = new Random();

    @Shadow
    public abstract void method_8466(class_2394 var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14);

    @Shadow
    public abstract void method_8406(class_2394 var1, double var2, double var4, double var6, double var8, double var10, double var12);

    @ModifyArg(method={"method_24462"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/world/ClientWorld;addParticleClient(Lnet/minecraft/particle/ParticleEffect;DDDDDD)V"))
    private class_2394 m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2394 class_23942, @Local(argsOnly=true) class_2338.class_2339 class_23392) {
        double d = m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1773.method_19418().method_19326().method_1028((double)class_23392.method_10263(), (double)class_23392.method_10264(), (double)class_23392.method_10260());
        if (m$$h6YK9QjDoMTr6MXOhtlGTjBp7y0YtqKAgZLe07Ls67QzPUmzRr17jYrMRTv0uHNS5s8YWDE9aAK2nmZbLbd8ZKM3Ox497EJfz.isToggled() && m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11.m$$h6YK9QjDoMTr6MXOhtlGTjBp7y0YtqKAgZLe07Ls67QzPUmzRr17jYrMRTv0uHNS5s8YWDE9aAK2nmZbLbd8ZKM3Ox497EJfz.m$$vtCWz9XU0vMTxua666oju82FNje2LIVGxb4Hi3tdjvS13M1Ht4rewhSCXse8f1z62XW3mbW3Q2Nvd4tUomwXKlhNCZ368Nzwh.getValue() == m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$g9yEoSxO6K4zl3WHOuw1nWtm6zYLkxskpChwYLHfD6gYJUhHGaZQOoJfpQJDb6YIfbAfeup9LW0l0UygK86gwGwASGuTK6eEQ && ((Boolean)m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11.m$$h6YK9QjDoMTr6MXOhtlGTjBp7y0YtqKAgZLe07Ls67QzPUmzRr17jYrMRTv0uHNS5s8YWDE9aAK2nmZbLbd8ZKM3Ox497EJfz.m$$xIB8ZP0NNYt4DdM8FOaBVlSHEUH2NdTbw8Mzp7LV82kZCT43w7UHMWFUULqsU5yD7LNnwXuG4z4UO8LT1LHyctOYearqD1uIX.getValue()).booleanValue() && d < 25.0) {
            return new class_4761((class_2394)(this.m$$PjcpaOoCllt7z1H6dQL3rUihYA0cavBJ6aUiKTF9aI4zibTEqXvGvIuz9nuV70CJP76AmQ2AviW7xb3dUgUQZmZaiwHnwCwrF.nextBoolean() ? class_2398.field_23956 : class_2398.field_22247), 0.1f).method_24369();
        }
        return class_23942;
    }

    @Inject(method={"randomBlockDisplayTick"}, at={@At(value="INVOKE", target="Ljava/util/Optional;ifPresent(Ljava/util/function/Consumer;)V", shift=At.Shift.BEFORE)})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(int n, int n2, int n3, int n4, class_5819 class_58192, class_2248 class_22482, class_2338.class_2339 class_23392, CallbackInfo callbackInfo) {
        if (m$$h6YK9QjDoMTr6MXOhtlGTjBp7y0YtqKAgZLe07Ls67QzPUmzRr17jYrMRTv0uHNS5s8YWDE9aAK2nmZbLbd8ZKM3Ox497EJfz.isToggled() && m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11.m$$h6YK9QjDoMTr6MXOhtlGTjBp7y0YtqKAgZLe07Ls67QzPUmzRr17jYrMRTv0uHNS5s8YWDE9aAK2nmZbLbd8ZKM3Ox497EJfz.m$$vtCWz9XU0vMTxua666oju82FNje2LIVGxb4Hi3tdjvS13M1Ht4rewhSCXse8f1z62XW3mbW3Q2Nvd4tUomwXKlhNCZ368Nzwh.getValue() == m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$g9yEoSxO6K4zl3WHOuw1nWtm6zYLkxskpChwYLHfD6gYJUhHGaZQOoJfpQJDb6YIfbAfeup9LW0l0UygK86gwGwASGuTK6eEQ && ((Boolean)m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11.m$$h6YK9QjDoMTr6MXOhtlGTjBp7y0YtqKAgZLe07Ls67QzPUmzRr17jYrMRTv0uHNS5s8YWDE9aAK2nmZbLbd8ZKM3Ox497EJfz.m$$xIB8ZP0NNYt4DdM8FOaBVlSHEUH2NdTbw8Mzp7LV82kZCT43w7UHMWFUULqsU5yD7LNnwXuG4z4UO8LT1LHyctOYearqD1uIX.getValue()).booleanValue()) {
            class_4761 class_47612 = new class_4761((class_2394)(class_58192.method_43056() ? class_2398.field_23956 : class_2398.field_22247), 0.2f * ((Float)m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11.m$$h6YK9QjDoMTr6MXOhtlGTjBp7y0YtqKAgZLe07Ls67QzPUmzRr17jYrMRTv0uHNS5s8YWDE9aAK2nmZbLbd8ZKM3Ox497EJfz.m$$6QoVjCyltB64Q4eFUVh4pY4Vm9VymirbSdrjvnvb5XRA8OHAxzurhimykV7iTeL7Vr3OaK8K2lPnafOtHZkLA2XDjZIOMvmwc.getValue()).floatValue());
            if (!class_47612.method_24370(class_58192)) {
                return;
            }
            this.method_8406(class_47612.method_24369(), (double)class_23392.method_10263() + this.m$$PjcpaOoCllt7z1H6dQL3rUihYA0cavBJ6aUiKTF9aI4zibTEqXvGvIuz9nuV70CJP76AmQ2AviW7xb3dUgUQZmZaiwHnwCwrF.nextDouble(), (double)class_23392.method_10264() + this.m$$PjcpaOoCllt7z1H6dQL3rUihYA0cavBJ6aUiKTF9aI4zibTEqXvGvIuz9nuV70CJP76AmQ2AviW7xb3dUgUQZmZaiwHnwCwrF.nextDouble(), (double)class_23392.method_10260() + this.m$$PjcpaOoCllt7z1H6dQL3rUihYA0cavBJ6aUiKTF9aI4zibTEqXvGvIuz9nuV70CJP76AmQ2AviW7xb3dUgUQZmZaiwHnwCwrF.nextDouble(), 0.0, 0.0, 0.0);
        }
    }

    @Inject(method={"removeEntity"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(int n, class_1297.class_5529 class_55292, CallbackInfo callbackInfo) {
        m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc = new m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc(n);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc);
        if (m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"addEntity"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1297 class_12972, CallbackInfo callbackInfo) {
        m$$zfldNZWJSxHy0Alw9Cqa3yNZ8WZ8yoJ6Drozs6MdqpmH0pR8ir3ZWdNM4n98DoQnCWQ1nIIZZy9nbFt2sNJRCEqD17MNg5oGe m$$zfldNZWJSxHy0Alw9Cqa3yNZ8WZ8yoJ6Drozs6MdqpmH0pR8ir3ZWdNM4n98DoQnCWQ1nIIZZy9nbFt2sNJRCEqD17MNg5oGe = new m$$zfldNZWJSxHy0Alw9Cqa3yNZ8WZ8yoJ6Drozs6MdqpmH0pR8ir3ZWdNM4n98DoQnCWQ1nIIZZy9nbFt2sNJRCEqD17MNg5oGe(class_12972);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$zfldNZWJSxHy0Alw9Cqa3yNZ8WZ8yoJ6Drozs6MdqpmH0pR8ir3ZWdNM4n98DoQnCWQ1nIIZZy9nbFt2sNJRCEqD17MNg5oGe);
        if (m$$zfldNZWJSxHy0Alw9Cqa3yNZ8WZ8yoJ6Drozs6MdqpmH0pR8ir3ZWdNM4n98DoQnCWQ1nIIZZy9nbFt2sNJRCEqD17MNg5oGe.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"getSkyColor"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_243 class_2432, float f, CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.isToggled() && m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.m$$zU3wePhNR4gmSuXzKZZl8MJPvE75SFwu6DM1S0RmUS6TFJv4yFXEX74euvRKlwnmPQogu0iOp00I9KMyOosXY4mmfFK8Z2FPf(711981443)) {
            callbackInfoReturnable.setReturnValue((Object)((Color)m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11.m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.m$$Vuihn15CBMy32zTrgIEhkYjzXMtmsTPj4xWQX7I5CytAPIcQq2j6wH4tecdl6hklpiOLfNxTyjJZcX8Wz2ZJE8mc9GJvShpuT.getValue()).getRGB());
            callbackInfoReturnable.cancel();
        }
    }

    @Inject(method={"getDimensionEffects"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$NtFIT6zaieEXzonXBenBHliG2woXkNgJjt4X3OkMyxQvkprFTKxt7G9OnHROZGaijRc67jurn4oNhpQ3ClXIfJPZ6vQ1PDJfh(CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687 == null) {
            return;
        }
        class_5294 class_52942 = null;
        if (m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11.m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.m$$fdeyorJDfWSPYgPfze1WG7M5msEhhRmuOmtJTmrGPLAMpMZbHaIaobbcOuRPE1FRhExDNpPA5kzRZhYRLaKkJjs5a4oRwv4ry.getValue() == m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$FrpOOmyQUppp2LWzPQiPWOc5KEn3SsJ3LxuuqcvkWBVQWcpluIJ8lCAUrDwrymBfv6Q77ZCRgHliLYGHufMfw9tF19KHX9V7K) {
            class_52942 = this.m$$q2Nv01hurOmN05aWsuAUu6HgxiwRHZQFFxMx2B9OFCFcoeqvvvxqZeiMBvegYWGpEsUZYuSaKIkJVTinkE4lVykq8hP4aIXZ9;
        } else if (m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11.m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.m$$fdeyorJDfWSPYgPfze1WG7M5msEhhRmuOmtJTmrGPLAMpMZbHaIaobbcOuRPE1FRhExDNpPA5kzRZhYRLaKkJjs5a4oRwv4ry.getValue() == m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$LTSWMRpC62tlreZSgY7l5QOJJYrAI7R26jNlhtwEDVWnez2T6KvyPRFPILdduoKSu7sA9Wv1hSd5zcTSloA4RZnC3hhvvaepz) {
            class_52942 = this.m$$JHUQQvBBRGW2a7dHn0HsX575yQpeZUxhQnpnFdnXlCUPUJTu7TSjAVhmJdNWT5PeNVS5JiVmpCGVelFlrHcTiInvputupI0aq;
        } else if (!m$$SyNr9C8dWqJg6VdbHL7kYfVmVwglSAxJTcs9lCtOM56jL280GMTyIe5Ii91cPIxP1TvSSDHgebxECtkpqaG12L2IZ5liKPIZf.m$$qPHGOo3wMyWQeREOHiDuEDzS586KuvKmsC9DAfNcv3vSjh9EcEnczg66Mkk73WjFhnxTQHoiyRLonDDkij7EwIoJy7oUWMLPR(441516802).m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig() || m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11.m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.m$$fdeyorJDfWSPYgPfze1WG7M5msEhhRmuOmtJTmrGPLAMpMZbHaIaobbcOuRPE1FRhExDNpPA5kzRZhYRLaKkJjs5a4oRwv4ry.getValue() == m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$nEDsW3Vj2pcV5ran8pyv63EGz52e5N33DiKgs5SB6gJtLCmJ9WEMpZnHOYV72rZAGqol1q2yyT2716bbz0U5x0g1ncy0dMEv2) {
            class_52942 = this.m$$Wz4K4AacT2Fw1R0jKffd4e44esucMmff6flSG1xQGQcutJSM8vSVwGeQHKJ203SSeVV0w8mutEjJo218KFK55vxhqUvE3jANU;
        }
        if (m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.isToggled() && m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.m$$zU3wePhNR4gmSuXzKZZl8MJPvE75SFwu6DM1S0RmUS6TFJv4yFXEX74euvRKlwnmPQogu0iOp00I9KMyOosXY4mmfFK8Z2FPf(711981443) && class_52942 != null) {
            callbackInfoReturnable.setReturnValue((Object)class_52942);
            callbackInfoReturnable.cancel();
        }
    }

    @Override
    public class_5294 mio$getOriginalEffects() {
        return this.field_24606;
    }
}

