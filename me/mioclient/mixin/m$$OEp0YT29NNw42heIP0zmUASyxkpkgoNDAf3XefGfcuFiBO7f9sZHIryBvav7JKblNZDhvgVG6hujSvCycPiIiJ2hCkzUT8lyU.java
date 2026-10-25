package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import java.awt.Color;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN;
import me.mioclient.m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj;
import me.mioclient.mixin.m$$jB8bUegGwiX8os37EncQWhICHXYVjygCQp93SeCB3P1zux2vbMaCUPdV5NoOzuZ5zP13WH7VvDLBAfcOGhBaBi7uFbmswRJqq;
import net.minecraft.class_243;
import net.minecraft.class_758;
import net.minecraft.class_9958;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={class_758.class})
public class m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU {
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$NtFIT6zaieEXzonXBenBHliG2woXkNgJjt4X3OkMyxQvkprFTKxt7G9OnHROZGaijRc67jurn4oNhpQ3ClXIfJPZ6vQ1PDJfh = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    private static final m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL = (m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj.class);

    @ModifyReturnValue(method={"applyFog"}, at={@At(value="RETURN")})
    private static class_9958 m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_9958 class_99582, @Local(argsOnly=true, ordinal=0) float f, @Local(argsOnly=true) class_758.class_4596 class_45962) {
        if (class_99582 == class_9958.field_53065) {
            return class_99582;
        }
        if (m$$NtFIT6zaieEXzonXBenBHliG2woXkNgJjt4X3OkMyxQvkprFTKxt7G9OnHROZGaijRc67jurn4oNhpQ3ClXIfJPZ6vQ1PDJfh.isToggled() && ((Boolean)m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU.m$$NtFIT6zaieEXzonXBenBHliG2woXkNgJjt4X3OkMyxQvkprFTKxt7G9OnHROZGaijRc67jurn4oNhpQ3ClXIfJPZ6vQ1PDJfh.m$$HNX3yVAotRmdmIURPjBCm2GlNXMQYdYQVUm3x1EVE56tnw3zFPJTCBok5ObJZenwgncON2oeJrSLxqAe6lS4TTm4H435AH1sk.getValue()).booleanValue() && (class_45962 == class_758.class_4596.field_20946 || ((Boolean)m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU.m$$NtFIT6zaieEXzonXBenBHliG2woXkNgJjt4X3OkMyxQvkprFTKxt7G9OnHROZGaijRc67jurn4oNhpQ3ClXIfJPZ6vQ1PDJfh.m$$OqGxEA4VPIC1sXtAiTRlyHsB2AJfbeOWUeoHazWpDkyCrxAAYZLGXie3ltZenXkHpMiQYomVNYbRu7MNy5WO4IIj994HkNtgA.getValue()).booleanValue())) {
            ((m$$jB8bUegGwiX8os37EncQWhICHXYVjygCQp93SeCB3P1zux2vbMaCUPdV5NoOzuZ5zP13WH7VvDLBAfcOGhBaBi7uFbmswRJqq)class_99582).mio$setStart(0.0f);
            ((m$$jB8bUegGwiX8os37EncQWhICHXYVjygCQp93SeCB3P1zux2vbMaCUPdV5NoOzuZ5zP13WH7VvDLBAfcOGhBaBi7uFbmswRJqq)class_99582).mio$setEnd(f * ((Float)m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU.m$$NtFIT6zaieEXzonXBenBHliG2woXkNgJjt4X3OkMyxQvkprFTKxt7G9OnHROZGaijRc67jurn4oNhpQ3ClXIfJPZ6vQ1PDJfh.m$$WkoLSkFRjLRBW12sx10VcIaegN0rr83auaOQp4QzokDaWV0DqNiDPu4v93yHKC5BURrPPU9cu54VWEGkv5xG547DOTORs9qKX.getValue()).floatValue() * 0.5f);
        }
        if (m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.isToggled() && m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.m$$zU3wePhNR4gmSuXzKZZl8MJPvE75SFwu6DM1S0RmUS6TFJv4yFXEX74euvRKlwnmPQogu0iOp00I9KMyOosXY4mmfFK8Z2FPf(711981443) && class_45962 != class_758.class_4596.field_20945) {
            Color color = (Color)m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU.m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.m$$HOWeaIUbl58qmTB6hojod5EZrMmQ3PMbD8DH2djaPkx90unRq8DGP7pM8HlxgOI1RcXs10kQ74sxVazadtzfKfWXtuDcv6ePl.getValue();
            ((m$$jB8bUegGwiX8os37EncQWhICHXYVjygCQp93SeCB3P1zux2vbMaCUPdV5NoOzuZ5zP13WH7VvDLBAfcOGhBaBi7uFbmswRJqq)class_99582).mio$setRed((float)color.getRed() / 255.0f);
            ((m$$jB8bUegGwiX8os37EncQWhICHXYVjygCQp93SeCB3P1zux2vbMaCUPdV5NoOzuZ5zP13WH7VvDLBAfcOGhBaBi7uFbmswRJqq)class_99582).mio$setGreen((float)color.getGreen() / 255.0f);
            ((m$$jB8bUegGwiX8os37EncQWhICHXYVjygCQp93SeCB3P1zux2vbMaCUPdV5NoOzuZ5zP13WH7VvDLBAfcOGhBaBi7uFbmswRJqq)class_99582).mio$setBlue((float)color.getBlue() / 255.0f);
            ((m$$jB8bUegGwiX8os37EncQWhICHXYVjygCQp93SeCB3P1zux2vbMaCUPdV5NoOzuZ5zP13WH7VvDLBAfcOGhBaBi7uFbmswRJqq)class_99582).mio$setAlpha((float)color.getAlpha() / 255.0f);
        }
        return class_99582;
    }

    @ModifyExpressionValue(method={"getFogColor"}, at={@At(value="INVOKE", target="Lnet/minecraft/util/CubicSampler;sampleColor(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/CubicSampler$RgbFetcher;)Lnet/minecraft/util/math/Vec3d;")})
    private static class_243 m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_243 class_2432) {
        if (!m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.isToggled() || !m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.m$$zU3wePhNR4gmSuXzKZZl8MJPvE75SFwu6DM1S0RmUS6TFJv4yFXEX74euvRKlwnmPQogu0iOp00I9KMyOosXY4mmfFK8Z2FPf(711981443)) {
            return class_2432;
        }
        Color color = (Color)m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU.m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.m$$Bz0A4vqW2dZ2RoLMdmqxwiglqZ2G1xFgazndVFxi5NK4AQdqc5FesDDXohpcX4QiuATPewPF5wEnMh40eaImCwVgjWEWLoWl7.getValue();
        Color color2 = new Color((float)class_2432.field_1352, (float)class_2432.field_1351, (float)class_2432.field_1350);
        return m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG(m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(color, color2, (float)color.getAlpha() / 255.0f));
    }
}

