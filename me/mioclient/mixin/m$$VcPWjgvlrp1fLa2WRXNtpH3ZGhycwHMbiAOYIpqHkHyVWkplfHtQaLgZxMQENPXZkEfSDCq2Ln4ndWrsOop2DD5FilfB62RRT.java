package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.mojang.authlib.GameProfile;
import java.awt.Color;
import java.util.Comparator;
import java.util.List;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD;
import me.mioclient.m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$zT1UgsJzzIatZSESgG7E7Yo3y3xWh8PI4OEM7rvhiTcMAeI7EEQfffo9ZTFd6Zn8RxMOGLpXiKQtxerKQ8JIl9n6AwvWk2FCn;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_269;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_355;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_355.class})
public class m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT {
    @Shadow
    @Final
    private class_310 field_2155;
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$yBzeGbgWqUTqU9AGI5jChSM8ejkAMZFu4FILBgBwE4gQ0Qt4JbzBW5RHaMLNF7oLlFacwDdcXXFGoEYeV8lQGe2z3978Epy8t = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    private static final m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg = (m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD.class);
    private static final m$$zT1UgsJzzIatZSESgG7E7Yo3y3xWh8PI4OEM7rvhiTcMAeI7EEQfffo9ZTFd6Zn8RxMOGLpXiKQtxerKQ8JIl9n6AwvWk2FCn m$$82TNt4E1QByuGXv3IHLRKCDMJ3qCrST5yJsR4kTStENmf32qULGrkMiNkMDkOqNMKXHz5UR7itvhM7aIuOrgoqDZGnoRCdJBi = (m$$zT1UgsJzzIatZSESgG7E7Yo3y3xWh8PI4OEM7rvhiTcMAeI7EEQfffo9ZTFd6Zn8RxMOGLpXiKQtxerKQ8JIl9n6AwvWk2FCn)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$zT1UgsJzzIatZSESgG7E7Yo3y3xWh8PI4OEM7rvhiTcMAeI7EEQfffo9ZTFd6Zn8RxMOGLpXiKQtxerKQ8JIl9n6AwvWk2FCn.class);

    @ModifyExpressionValue(method={"collectPlayerEntries"}, at={@At(value="FIELD", target="Lnet/minecraft/client/gui/hud/PlayerListHud;ENTRY_ORDERING:Ljava/util/Comparator;")})
    private Comparator m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(Comparator comparator) {
        if (m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.isToggled() && ((Boolean)m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$TiVC0r6LaFQ82TyZN3P03e9UdwwsjiU2d6hc3GQIwkLNxcDm3CSdMKpvT2zS5HJSLgmgY6VxIu0bvbHU1Th3OZRaUuiijFbdC.getValue()).booleanValue()) {
            return m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$BE9WpOFutcj1hqs2LtpKg2tCrKSgOHTNYFYJkC06oIjWQomeR7WfHAy2CHY8ZFnRrDFQKItCkzZTMYRaLenJkGV0DcnbBJeAG(1965594241);
        }
        return comparator;
    }

    @ModifyArg(method={"collectPlayerEntries"}, at=@At(value="INVOKE", target="Ljava/util/stream/Stream;limit(J)Ljava/util/stream/Stream;"))
    private long m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(long l) {
        if (m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.isToggled()) {
            return m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$EZ30IzvreyyCiQx5fOFhxh7pTGOTI33JeOgAOXVshH7HPgp3SoAdA6h7CP1JhvSerK1yNZnxijT1rbi5TrPctBq989LM37aHu.m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC(1968833760) ? Long.MAX_VALUE : (long)((Integer)m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$EZ30IzvreyyCiQx5fOFhxh7pTGOTI33JeOgAOXVshH7HPgp3SoAdA6h7CP1JhvSerK1yNZnxijT1rbi5TrPctBq989LM37aHu.getValue()).intValue();
        }
        return l;
    }

    @ModifyExpressionValue(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/PlayerListEntry;shouldShowHat()Z")})
    private boolean m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9(boolean bl) {
        if (m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.isToggled() && ((Boolean)m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$yp6zVGYa4n4eDGsuTK7vQFIOYQnIHYBxQSjsXzBGuLNgZ4LEwRmHU8s0tgYYBMNh2YrTb8a4lpkhLs4vYle2FSMIevCSzzCpm.getValue()).booleanValue()) {
            return true;
        }
        return bl;
    }

    @Inject(method={"getPlayerName"}, at={@At(value="RETURN")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_640 class_6402, CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.isToggled() && ((Boolean)m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$MZilhmQjgrIODiuK7LNpiawhvswLNMPNSg7LxmEjuRhQFVgrT13WVRKbzGNLijr7vqqK09nJM08BGtrMi269FRxxYt43zl5Fl.getValue()).booleanValue()) {
            Color color;
            String string = class_124.method_539((String)((class_2561)callbackInfoReturnable.getReturnValue()).getString());
            if (string == null) {
                return;
            }
            String string2 = class_6402.method_2966().getName();
            if (((Boolean)m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$Puav6DKuCIVhfGZlRj9NzY0rbbPCr0eJkQ3153wysfNx5Xp3O6tSjoDAQOjI1OLPCBlRED5diMLDScI6yquihAN73ysrEnUum.getValue()).booleanValue() && (color = m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(string2, (Color)null)) != null) {
                callbackInfoReturnable.setReturnValue((Object)class_2561.method_43470((String)string).method_27694(class_25832 -> class_25832.method_36139(color.hashCode())));
            }
            if (class_310.method_1551().method_1548().method_1676().equals(string2)) {
                callbackInfoReturnable.setReturnValue((Object)class_2561.method_43470((String)string).method_27694(class_25832 -> class_25832.method_36139(((Color)m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$6waAmJjHREcO9ExTGWhpdBZuC5hMu8UH4motEpLHWITy1ZNsgHSvS6ZhzYoCENw0dbYpkXVzTd29IO6wI8nupBXXgCOZIVvVa.getValue()).hashCode())));
            }
        }
    }

    @Inject(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/MinecraftClient;isInSingleplayer()Z")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_332 class_3322, int n, class_269 class_2692, class_266 class_2662, CallbackInfo callbackInfo, @Local(ordinal=4) LocalIntRef localIntRef, @Local(ordinal=5) LocalIntRef localIntRef2, @Local(ordinal=6) LocalIntRef localIntRef3, @Local(ordinal=0) List list) {
        if (m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.isToggled()) {
            int n2;
            int n3 = n2 = list.size();
            int n4 = 1;
            while (n3 > 40) {
                n3 = (n2 + ++n4 - 1) / n4;
            }
            localIntRef3.set(n4);
            localIntRef2.set(n3);
            localIntRef.set(n2);
        }
    }

    @Inject(method={"renderLatencyIcon"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_332 class_3322, int n, int n2, int n3, class_640 class_6402, CallbackInfo callbackInfo) {
        if (!m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.isToggled() || m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$zhezBFpzADrJb4iauZHV5HIhFihR5XMy9zFcx09upLtGn3CVdeFbyh4PwUzfmx3GxnX6XxXamTFR8u6UjY4CzPYgO6uckl0HZ.getValue() == m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$x3OYz9hnK0rFUFsH8pXXs4k9PqadTlnp3SxeDt9mCzJ9ZEZll13p0m4RFEf3acvDCKJPInKfKR3FYAZRuhpVWmk5Bewozr7Ch) {
            return;
        }
        if (m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$zhezBFpzADrJb4iauZHV5HIhFihR5XMy9zFcx09upLtGn3CVdeFbyh4PwUzfmx3GxnX6XxXamTFR8u6UjY4CzPYgO6uckl0HZ.getValue() == m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$QdVxAdwac8ahnnjxxJhZBQAyPd6p7Ojs4dDUlpbS87lX64WffI0KmsYfuAwY1BaFnJ5i9RaVC7wX1HcmOXxLsW8o7rhEHl4nb) {
            callbackInfo.cancel();
            return;
        }
        String string = String.valueOf(class_124.field_1054) + String.valueOf(class_6402.method_2959());
        class_3322.method_25303(this.field_2155.field_1772, string, n2 + n - this.field_2155.field_1772.method_1727(string), n3, 0xFFFFFF);
        callbackInfo.cancel();
    }

    @ModifyConstant(method={"render"}, constant={@Constant(intValue=13)})
    private int m$$a8nwcIEz33qkF56tQDYbl9rprqGd3Tsn4GoVo2pwzYrCRocxTQNsPP2ZDLImj5yUznS6ZqjdgoLbaTpHDaufClBvXzXoNsQlo(int n) {
        if (m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.isToggled() && m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$zhezBFpzADrJb4iauZHV5HIhFihR5XMy9zFcx09upLtGn3CVdeFbyh4PwUzfmx3GxnX6XxXamTFR8u6UjY4CzPYgO6uckl0HZ.getValue() != m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$x3OYz9hnK0rFUFsH8pXXs4k9PqadTlnp3SxeDt9mCzJ9ZEZll13p0m4RFEf3acvDCKJPInKfKR3FYAZRuhpVWmk5Bewozr7Ch) {
            return 0;
        }
        return n;
    }

    @ModifyArgs(method={"render"}, at=@At(value="INVOKE", target="Ljava/lang/Math;max(II)I", ordinal=0))
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(Args args, @Local class_640 class_6402) {
        if (m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.isToggled() && m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$zhezBFpzADrJb4iauZHV5HIhFihR5XMy9zFcx09upLtGn3CVdeFbyh4PwUzfmx3GxnX6XxXamTFR8u6UjY4CzPYgO6uckl0HZ.getValue() == m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$LdIO4JDFH8x0ksZZKqZ4rmarpvfaZLHM8mlTzzYWHlPRpPYxpCxm871auv6aWjUFvdkuheCBi3iRlSdzNSYegRKyNetdLr7AS) {
            args.set(1, (Object)((Integer)args.get(1) + this.field_2155.field_1772.method_1727(" " + class_6402.method_2959())));
        }
    }

    @ModifyArgs(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/hud/PlayerListHud;renderScoreboardObjective(Lnet/minecraft/scoreboard/ScoreboardObjective;ILnet/minecraft/client/gui/hud/PlayerListHud$ScoreDisplayEntry;IILjava/util/UUID;Lnet/minecraft/client/gui/DrawContext;)V"))
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(Args args, @Local class_640 class_6402) {
        if (m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.isToggled() && m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$zhezBFpzADrJb4iauZHV5HIhFihR5XMy9zFcx09upLtGn3CVdeFbyh4PwUzfmx3GxnX6XxXamTFR8u6UjY4CzPYgO6uckl0HZ.getValue() == m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$LdIO4JDFH8x0ksZZKqZ4rmarpvfaZLHM8mlTzzYWHlPRpPYxpCxm871auv6aWjUFvdkuheCBi3iRlSdzNSYegRKyNetdLr7AS) {
            int n = this.field_2155.field_1772.method_1727("" + class_6402.method_2959()) + 2;
            int n2 = (Integer)args.get(3);
            int n3 = (Integer)args.get(4);
            args.set(3, (Object)(n2 - n));
            args.set(4, (Object)(n3 - n));
        }
    }

    @ModifyExpressionValue(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/ClientConnection;isEncrypted()Z")})
    private boolean m$$9vFcpqa5eflTL0srBkFm1bU8MypCAaM5v14ItjdillmOT6Gglf4WzP03KAcJZpQ9VHDpKjp1jdtAMWZogLj82wQy1haS76Knc(boolean bl) {
        return bl && !m$$yBzeGbgWqUTqU9AGI5jChSM8ejkAMZFu4FILBgBwE4gQ0Qt4JbzBW5RHaMLNF7oLlFacwDdcXXFGoEYeV8lQGe2z3978Epy8t.m$$6mMlXYdnHLQ9YHIKkDeSauCICYLAgR1LidujHLDK6n9Vg4IPECd9JPOXmfnIvIGB62FlrCfepYBstO3VoGQLyFMc5ihmXqYf3(-225291882);
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_332 class_3322, int n, class_269 class_2692, class_266 class_2662, CallbackInfo callbackInfo) {
        if (m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$NkSfW8yldQWRaD8XPdPR7aeLqWqwH6jcI99BAgV5Ra92goTBqn1rUVin8vHyxni16cTgL4y16FIf5YSpEpVQHJ1qrVzYRXu8n(-399256866) == 1.0f) {
            return;
        }
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_22905(m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$NkSfW8yldQWRaD8XPdPR7aeLqWqwH6jcI99BAgV5Ra92goTBqn1rUVin8vHyxni16cTgL4y16FIf5YSpEpVQHJ1qrVzYRXu8n(-399256866), m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$NkSfW8yldQWRaD8XPdPR7aeLqWqwH6jcI99BAgV5Ra92goTBqn1rUVin8vHyxni16cTgL4y16FIf5YSpEpVQHJ1qrVzYRXu8n(-399256866), 1.0f);
    }

    @Inject(method={"render"}, at={@At(value="TAIL")})
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_332 class_3322, int n, class_269 class_2692, class_266 class_2662, CallbackInfo callbackInfo) {
        if (m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$NkSfW8yldQWRaD8XPdPR7aeLqWqwH6jcI99BAgV5Ra92goTBqn1rUVin8vHyxni16cTgL4y16FIf5YSpEpVQHJ1qrVzYRXu8n(-399256866) == 1.0f) {
            return;
        }
        class_3322.method_51448().method_22909();
    }

    @ModifyVariable(method={"render"}, at=@At(value="HEAD"), argsOnly=true)
    private int m$$NtFIT6zaieEXzonXBenBHliG2woXkNgJjt4X3OkMyxQvkprFTKxt7G9OnHROZGaijRc67jurn4oNhpQ3ClXIfJPZ6vQ1PDJfh(int n) {
        if (m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$NkSfW8yldQWRaD8XPdPR7aeLqWqwH6jcI99BAgV5Ra92goTBqn1rUVin8vHyxni16cTgL4y16FIf5YSpEpVQHJ1qrVzYRXu8n(-399256866) == 1.0f) {
            return n;
        }
        return (int)((float)n / m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg.m$$NkSfW8yldQWRaD8XPdPR7aeLqWqwH6jcI99BAgV5Ra92goTBqn1rUVin8vHyxni16cTgL4y16FIf5YSpEpVQHJ1qrVzYRXu8n(-399256866));
    }

    @Inject(method={"method_46511"}, at={@At(value="HEAD")}, cancellable=true)
    private static void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_640 class_6402, CallbackInfoReturnable callbackInfoReturnable) {
        GameProfile gameProfile = class_310.method_1551().field_1724.method_7334();
        if (m$$82TNt4E1QByuGXv3IHLRKCDMJ3qCrST5yJsR4kTStENmf32qULGrkMiNkMDkOqNMKXHz5UR7itvhM7aIuOrgoqDZGnoRCdJBi.isToggled()) {
            if (class_6402.method_2966().equals((Object)gameProfile)) {
                callbackInfoReturnable.setReturnValue((Object)m$$82TNt4E1QByuGXv3IHLRKCDMJ3qCrST5yJsR4kTStENmf32qULGrkMiNkMDkOqNMKXHz5UR7itvhM7aIuOrgoqDZGnoRCdJBi.m$$ozdxC89bIRlmzFY5Xo64TYegkcdD8GgGkou3Oef7njtcbZBXUtO9JYySLDbdq4GUB8Ttx9J579g1teDDOxuum32jd7xllYbyn(1100930786));
            } else if (((Boolean)m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$82TNt4E1QByuGXv3IHLRKCDMJ3qCrST5yJsR4kTStENmf32qULGrkMiNkMDkOqNMKXHz5UR7itvhM7aIuOrgoqDZGnoRCdJBi.m$$U3DzgCmGQ57IV0VJpsEizWIkalG6GHRCCWBrKVs0wxaBy0TNVoyM0yt0zJx9fTT2gu0ao2xuops3UeI9Jrd9UvydtfKBItJ0Z.getValue()).booleanValue()) {
                callbackInfoReturnable.setReturnValue((Object)"redacted");
            }
        }
    }
}

