package me.mioclient.mixin;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.awt.Color;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Consumer;
import me.mioclient.m$$UD7ROvfds8eSLXTG6vFB5dMAk03jHsUBu1KaB53SssE88CDOeckX81eRT6PjPm2YrQ9SGBl2MktJN9NQCcSyIDqosm1lM6S7x;
import net.minecraft.class_156;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4011;
import net.minecraft.class_4071;
import net.minecraft.class_425;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_425.class})
public abstract class m$$NgFs7hcxUI7N06BV9oOVeofUPo3WEq3xfns0tB7GGPJyjQ4tgrlGZAyiYPyNAJuwssYzZuVc6qN98S292dAZt5Z2G3raqZDcd
extends class_4071 {
    @Shadow
    private long field_17771;
    @Shadow
    @Final
    private class_310 field_18217;
    @Unique
    private m$$UD7ROvfds8eSLXTG6vFB5dMAk03jHsUBu1KaB53SssE88CDOeckX81eRT6PjPm2YrQ9SGBl2MktJN9NQCcSyIDqosm1lM6S7x m$$Df9Mg3BbxceCzqoSw6iaRMouqL7Orq3FY3id4P3AWIr2hPW3EUiCumTI7jGMbJRqsd4W6UY3rfwICdzgiPPDuLio9QMVnYjnZ;
    @Unique
    private static boolean m$$aEFkM2ccLPcDl3X3IpiEYHjbIzIcSgnNRmDhHH7OcFgTofXAVRC2gqk28Tta9A0Fu14TX3Fqfabz4V7wWaKFd3CbKSpDz4JBV;
    @Unique
    private static boolean m$$v6OpYJxV3vMbnhU2UeqSXrGxqgpybzwPIKtqWyEaTxn8tva8vvPPadGTe9UEIZrOIqSW0VnpkpNCrslmaeDN2yma9oZskTVoC;

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_310 class_3102, class_4011 class_40112, Consumer consumer, boolean bl, CallbackInfo callbackInfo) {
        Object object;
        try {
            if (Boolean.getBoolean("mio.disableBackgroundFlag")) {
                throw new RuntimeException();
            }
            object = HttpRequest.newBuilder().uri(new URI("https://api.country.is/")).timeout(Duration.of(3L, ChronoUnit.SECONDS)).GET().build();
            HttpResponse<String> httpResponse = HttpClient.newHttpClient().send((HttpRequest)object, HttpResponse.BodyHandlers.ofString());
            String string = httpResponse.body();
            JsonObject jsonObject = JsonParser.parseString((String)string).getAsJsonObject();
            if (jsonObject.has("country")) {
                this.m$$Df9Mg3BbxceCzqoSw6iaRMouqL7Orq3FY3id4P3AWIr2hPW3EUiCumTI7jGMbJRqsd4W6UY3rfwICdzgiPPDuLio9QMVnYjnZ = m$$UD7ROvfds8eSLXTG6vFB5dMAk03jHsUBu1KaB53SssE88CDOeckX81eRT6PjPm2YrQ9SGBl2MktJN9NQCcSyIDqosm1lM6S7x.m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM(jsonObject.get("country").getAsString());
            }
        } catch (Throwable throwable) {
            this.m$$Df9Mg3BbxceCzqoSw6iaRMouqL7Orq3FY3id4P3AWIr2hPW3EUiCumTI7jGMbJRqsd4W6UY3rfwICdzgiPPDuLio9QMVnYjnZ = m$$UD7ROvfds8eSLXTG6vFB5dMAk03jHsUBu1KaB53SssE88CDOeckX81eRT6PjPm2YrQ9SGBl2MktJN9NQCcSyIDqosm1lM6S7x.m$$NZHRg5d0rm56HQtulA07c8vvktPmjN8V7EmSIQZ8CSFc7WrC7lPiS83oh6HzAT7g2I23bIuPHm975NKgqHKIFrLoaKzUwvSms;
        }
        object = Calendar.getInstance();
        ((Calendar)object).setTime(new Date());
        int n = ((Calendar)object).get(2);
        int n2 = ((Calendar)object).get(5);
        if (n == 1 && n2 == 23 || n == 4 && n2 == 9) {
            this.m$$Df9Mg3BbxceCzqoSw6iaRMouqL7Orq3FY3id4P3AWIr2hPW3EUiCumTI7jGMbJRqsd4W6UY3rfwICdzgiPPDuLio9QMVnYjnZ = m$$UD7ROvfds8eSLXTG6vFB5dMAk03jHsUBu1KaB53SssE88CDOeckX81eRT6PjPm2YrQ9SGBl2MktJN9NQCcSyIDqosm1lM6S7x.m$$gBZrJHVB95uSF86fYGkSXayDfoy6524TpXYJtg8PqOd8PtNe1p2LOC9DGsUio8RzZC0QLPbvE9jb0ZloygzRVH4QKihpogQHC;
        }
    }

    @Shadow
    private static int method_35732(int n, int n2) {
        return 0;
    }

    @Inject(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawTexture(Ljava/util/function/Function;Lnet/minecraft/util/Identifier;IIFFIIIIIII)V", ordinal=0, shift=At.Shift.BEFORE)})
    private void m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU(class_332 class_3322, int n, int n2, float f, CallbackInfo callbackInfo) {
        if (!m$$aEFkM2ccLPcDl3X3IpiEYHjbIzIcSgnNRmDhHH7OcFgTofXAVRC2gqk28Tta9A0Fu14TX3Fqfabz4V7wWaKFd3CbKSpDz4JBV && m$$v6OpYJxV3vMbnhU2UeqSXrGxqgpybzwPIKtqWyEaTxn8tva8vvPPadGTe9UEIZrOIqSW0VnpkpNCrslmaeDN2yma9oZskTVoC) {
            long l;
            if (Boolean.getBoolean("mio.maximizedWindow") && GLFW.glfwGetWindowMonitor((long)(l = this.field_18217.method_22683().method_4490())) == 0L) {
                GLFW.glfwMaximizeWindow((long)l);
            }
            m$$aEFkM2ccLPcDl3X3IpiEYHjbIzIcSgnNRmDhHH7OcFgTofXAVRC2gqk28Tta9A0Fu14TX3Fqfabz4V7wWaKFd3CbKSpDz4JBV = true;
        }
        m$$v6OpYJxV3vMbnhU2UeqSXrGxqgpybzwPIKtqWyEaTxn8tva8vvPPadGTe9UEIZrOIqSW0VnpkpNCrslmaeDN2yma9oZskTVoC = true;
        GlStateManager._enableDepthTest();
        int n3 = this.field_18217.method_22683().method_4486();
        int n4 = this.field_18217.method_22683().method_4502();
        int n5 = class_3532.method_15386((float)((1.0f - class_3532.method_15363((float)((this.field_17771 > -1L ? (float)(class_156.method_658() - this.field_17771) / 1000.0f : -1.0f) - 1.0f), (float)0.0f, (float)1.0f)) * 255.0f));
        for (int i = 0; i < this.m$$Df9Mg3BbxceCzqoSw6iaRMouqL7Orq3FY3id4P3AWIr2hPW3EUiCumTI7jGMbJRqsd4W6UY3rfwICdzgiPPDuLio9QMVnYjnZ.m$$tv0CpJeekzpkRW6hWEhoeqYhlyFiaOtfITJsYkNrwAVB6uMWB3rlNKU4enSjLlPCWyDDtoQYkRbpKDuuhh0xRXx5d11DWnXCg().size(); ++i) {
            class_3322.method_51737(0, i * (n4 / this.m$$Df9Mg3BbxceCzqoSw6iaRMouqL7Orq3FY3id4P3AWIr2hPW3EUiCumTI7jGMbJRqsd4W6UY3rfwICdzgiPPDuLio9QMVnYjnZ.m$$tv0CpJeekzpkRW6hWEhoeqYhlyFiaOtfITJsYkNrwAVB6uMWB3rlNKU4enSjLlPCWyDDtoQYkRbpKDuuhh0xRXx5d11DWnXCg().size()), n3, (i + 1) * (n4 / this.m$$Df9Mg3BbxceCzqoSw6iaRMouqL7Orq3FY3id4P3AWIr2hPW3EUiCumTI7jGMbJRqsd4W6UY3rfwICdzgiPPDuLio9QMVnYjnZ.m$$tv0CpJeekzpkRW6hWEhoeqYhlyFiaOtfITJsYkNrwAVB6uMWB3rlNKU4enSjLlPCWyDDtoQYkRbpKDuuhh0xRXx5d11DWnXCg().size()), -100, m$$NgFs7hcxUI7N06BV9oOVeofUPo3WEq3xfns0tB7GGPJyjQ4tgrlGZAyiYPyNAJuwssYzZuVc6qN98S292dAZt5Z2G3raqZDcd.method_35732(((Color)this.m$$Df9Mg3BbxceCzqoSw6iaRMouqL7Orq3FY3id4P3AWIr2hPW3EUiCumTI7jGMbJRqsd4W6UY3rfwICdzgiPPDuLio9QMVnYjnZ.m$$tv0CpJeekzpkRW6hWEhoeqYhlyFiaOtfITJsYkNrwAVB6uMWB3rlNKU4enSjLlPCWyDDtoQYkRbpKDuuhh0xRXx5d11DWnXCg().get(i)).hashCode(), n5));
        }
        class_3322.method_51452();
    }
}

