package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import me.mioclient.m$$1a8TOY0wPcIsr5H3HtBQ2WvrIQ2rUPCAI6O8qIdOJihaZYw5Qf0bEzMEhbWsHio4ZYsjaJbUbgdwONbQqne5qR6W0fVb8bOwY;
import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$RniRWXtiAdcmHO4jrec9gSarj6wyTj5Bwm29YZKcItrovIEz2vuqLuswtM62XBOfGpz7J9Je6C21IoEgaK2wxnq7BDMwVLmuo;
import me.mioclient.m$$Sa9EL6x1Z9Ql7bo36MeQFajuM94KyzDMfXUXVs4dWApHaRVWxAcRnYD1iRGv2o9XopoaJ0Ja6zJqvtysSRryk9tfO32Fqz1Cg;
import me.mioclient.m$$ZeEUXHK66sCSvCQMVk2oHAkYZqLdByGCipi2GY5SBb4SYtqq8nK4e0k2eLAMgas9055SZunXPK4WwySQNoqEBlK8na4IAbpv2;
import me.mioclient.m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5;
import me.mioclient.m$$cIZ2QRLMfPhWL8xVV5Rtbm1aSo0yWp6il50Bu13CmyzSBn7zVsGUPgESkLsJRn4Z3iEQa50HhRW7r0NhVn5KmJb7gzv6cTKsE;
import me.mioclient.m$$cr1cUwlXRwlij0FDPBwDumNZtQe5dZUYMwStzZlYNBu9dRJEQrtYU22mu3knmGhhSAobASlR6ckvjozWrz8lteaYivYVxYUry;
import me.mioclient.m$$qPHGOo3wMyWQeREOHiDuEDzS586KuvKmsC9DAfNcv3vSjh9EcEnczg66Mkk73WjFhnxTQHoiyRLonDDkij7EwIoJy7oUWMLPR;
import me.mioclient.m$$vmsK0ZMm7FMCXgM9rp3AZZmVfWGAXd5Kdi9AD1s2rbUFLxCYhxUqG2PIGb7jAdzHjj3RroXag2fEbexQpH6aZWU3jF9w6xBZr;
import me.mioclient.m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8;
import me.mioclient.m$$zT1UgsJzzIatZSESgG7E7Yo3y3xWh8PI4OEM7rvhiTcMAeI7EEQfffo9ZTFd6Zn8RxMOGLpXiKQtxerKQ8JIl9n6AwvWk2FCn;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_310;
import net.minecraft.class_3300;
import net.minecraft.class_3532;
import net.minecraft.class_3695;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4599;
import net.minecraft.class_757;
import net.minecraft.class_759;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_757.class})
public abstract class m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v {
    private static m$$cIZ2QRLMfPhWL8xVV5Rtbm1aSo0yWp6il50Bu13CmyzSBn7zVsGUPgESkLsJRn4Z3iEQa50HhRW7r0NhVn5KmJb7gzv6cTKsE m$$bxS775zr0dPkyXIqkzgB7c1f7dx2GGeftjTTYr5C8eKPfEvS1d9A1jpXe3DzuRasS9VlczIFc9PeBvRDA2KN9M6oCYoJnyUrq = (m$$cIZ2QRLMfPhWL8xVV5Rtbm1aSo0yWp6il50Bu13CmyzSBn7zVsGUPgESkLsJRn4Z3iEQa50HhRW7r0NhVn5KmJb7gzv6cTKsE)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$cIZ2QRLMfPhWL8xVV5Rtbm1aSo0yWp6il50Bu13CmyzSBn7zVsGUPgESkLsJRn4Z3iEQa50HhRW7r0NhVn5KmJb7gzv6cTKsE.class);
    private static m$$Sa9EL6x1Z9Ql7bo36MeQFajuM94KyzDMfXUXVs4dWApHaRVWxAcRnYD1iRGv2o9XopoaJ0Ja6zJqvtysSRryk9tfO32Fqz1Cg reach = (m$$Sa9EL6x1Z9Ql7bo36MeQFajuM94KyzDMfXUXVs4dWApHaRVWxAcRnYD1iRGv2o9XopoaJ0Ja6zJqvtysSRryk9tfO32Fqz1Cg)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$Sa9EL6x1Z9Ql7bo36MeQFajuM94KyzDMfXUXVs4dWApHaRVWxAcRnYD1iRGv2o9XopoaJ0Ja6zJqvtysSRryk9tfO32Fqz1Cg.class);
    private static m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG norender = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    private static m$$vmsK0ZMm7FMCXgM9rp3AZZmVfWGAXd5Kdi9AD1s2rbUFLxCYhxUqG2PIGb7jAdzHjj3RroXag2fEbexQpH6aZWU3jF9w6xBZr m$$JCDqBI1tV8LshiexopvdlS4qtAdze1vKYofHIuiW7yp0DNcKtsqbxbQXGLrJaRhmOVrygCB2CgXkRgiKUgEEmvhdlDb9i6Tbz = (m$$vmsK0ZMm7FMCXgM9rp3AZZmVfWGAXd5Kdi9AD1s2rbUFLxCYhxUqG2PIGb7jAdzHjj3RroXag2fEbexQpH6aZWU3jF9w6xBZr)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$vmsK0ZMm7FMCXgM9rp3AZZmVfWGAXd5Kdi9AD1s2rbUFLxCYhxUqG2PIGb7jAdzHjj3RroXag2fEbexQpH6aZWU3jF9w6xBZr.class);
    private static m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv freecam = (m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv.class);
    private static m$$1a8TOY0wPcIsr5H3HtBQ2WvrIQ2rUPCAI6O8qIdOJihaZYw5Qf0bEzMEhbWsHio4ZYsjaJbUbgdwONbQqne5qR6W0fVb8bOwY freelook = (m$$1a8TOY0wPcIsr5H3HtBQ2WvrIQ2rUPCAI6O8qIdOJihaZYw5Qf0bEzMEhbWsHio4ZYsjaJbUbgdwONbQqne5qR6W0fVb8bOwY)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$1a8TOY0wPcIsr5H3HtBQ2WvrIQ2rUPCAI6O8qIdOJihaZYw5Qf0bEzMEhbWsHio4ZYsjaJbUbgdwONbQqne5qR6W0fVb8bOwY.class);
    private static m$$RniRWXtiAdcmHO4jrec9gSarj6wyTj5Bwm29YZKcItrovIEz2vuqLuswtM62XBOfGpz7J9Je6C21IoEgaK2wxnq7BDMwVLmuo viewmodel = (m$$RniRWXtiAdcmHO4jrec9gSarj6wyTj5Bwm29YZKcItrovIEz2vuqLuswtM62XBOfGpz7J9Je6C21IoEgaK2wxnq7BDMwVLmuo)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$RniRWXtiAdcmHO4jrec9gSarj6wyTj5Bwm29YZKcItrovIEz2vuqLuswtM62XBOfGpz7J9Je6C21IoEgaK2wxnq7BDMwVLmuo.class);
    private static m$$ZeEUXHK66sCSvCQMVk2oHAkYZqLdByGCipi2GY5SBb4SYtqq8nK4e0k2eLAMgas9055SZunXPK4WwySQNoqEBlK8na4IAbpv2 m$$mhvh85mY6niNMEtyNVaUbcAivPcazOkS3RGfwgVYGOhMvOObJ82u75swZ3fibgYUKJT6AHFKpgbqnshFgkPKIh43gnQpeoSPh = (m$$ZeEUXHK66sCSvCQMVk2oHAkYZqLdByGCipi2GY5SBb4SYtqq8nK4e0k2eLAMgas9055SZunXPK4WwySQNoqEBlK8na4IAbpv2)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$ZeEUXHK66sCSvCQMVk2oHAkYZqLdByGCipi2GY5SBb4SYtqq8nK4e0k2eLAMgas9055SZunXPK4WwySQNoqEBlK8na4IAbpv2.class);
    @Unique
    private boolean m$$npTGZKi9FNUMb5xmgTX1UJGy4ekcszA1JH3RWvBQNlcpyu5fCsNId9oHdPVvx4zrnyWyZzqzZ1iLKUhS85uQA7LsJjLytcMkM;
    @Final
    @Shadow
    class_310 field_4015;
    @Shadow
    private boolean field_3992;
    private boolean m$$Md98Ck06Z0qvMdZsdhnA9mbnHu1irP8giawgjPL7LnvrCyTxQwYdg7IApGJSVL39S2wr7aXBNJzqOgpdvkhomYnhxgSwTEyMC = false;

    @Shadow
    public abstract void method_3182();

    @Shadow
    public abstract void method_3190(float var1);

    @Inject(method={"bobView"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_4587 class_45872, float f, CallbackInfo callbackInfo) {
        if (m$$qPHGOo3wMyWQeREOHiDuEDzS586KuvKmsC9DAfNcv3vSjh9EcEnczg66Mkk73WjFhnxTQHoiyRLonDDkij7EwIoJy7oUWMLPR.m$$O2cV3NVCvIOmlIYg0Cw9ezc05YGGUeG5VGCA1CLjoeKVEDupXn9zApW1D5cQwdkkueHzLoLXbgnSXslhArBKOUYLl6ZzgTom5(-1482391418) && m$$qPHGOo3wMyWQeREOHiDuEDzS586KuvKmsC9DAfNcv3vSjh9EcEnczg66Mkk73WjFhnxTQHoiyRLonDDkij7EwIoJy7oUWMLPR.m$$J9D4TqnFiml8HyBRc6s3OsS2VRbx3r9TVIkHLvy6c7cXdv1Qhdcpl43sfEvKwYdXD0JV6ekWAF0Tl50fpknbiOqPNP9Ddp9gj(1894284182)) {
            return;
        }
        if (!this.m$$npTGZKi9FNUMb5xmgTX1UJGy4ekcszA1JH3RWvBQNlcpyu5fCsNId9oHdPVvx4zrnyWyZzqzZ1iLKUhS85uQA7LsJjLytcMkM) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    public void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_310 class_3102, class_759 class_7593, class_3300 class_33002, class_4599 class_45992, CallbackInfo callbackInfo) {
        m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$JtS6y3OKtFrQBGPhp1gae1DLvN1o1q0CdA2l8YvkOM7MOgIwqYlQCSkJtW7xplPv6MutK1dKT8LRXJ59kItBpnJbycC0MEz7C = new m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5();
    }

    @Inject(method={"tiltViewWhenHurt"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_4587 class_45872, float f, CallbackInfo callbackInfo) {
        if (norender.isToggled() && ((Boolean)m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.norender.m$$I8FKHqXAYTxlV7UUhcTEdgtvdfYlNwOCH950W7IRW5DoEKc4MpLqxDd8Qx6rzMuzBMbpvragPz8Pwgr7eXJMbHX5MaPzbIKgM.getValue()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"showFloatingItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1799 class_17992, CallbackInfo callbackInfo) {
        if (class_17992.method_7909() == class_1802.field_8288 && norender.isToggled() && ((Boolean)m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.norender.m$$duMTIMotc6QLdxvCqCjsvhguguO7tOqOUXX9RNH2Sv7dEHWgHHTztProJc3TO6oWSrFf373pdzrCnujaf76nReqJ0wJyKPmRz.getValue()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @WrapOperation(method={"renderWorld"}, at={@At(value="INVOKE", target="Lnet/minecraft/util/math/MathHelper;lerp(FFF)F")}, require=0)
    private float m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(float f, float f2, float f3, Operation operation) {
        if (norender.isToggled() && ((Boolean)m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.norender.m$$8CV8a85SDAGQio9hjG9UlxmwRlH15JeGS2zjcAGXUngaSadL0HbsuMX4F5QqsMrNaavgjkIoPILl6ufPhLHoMp4RGvJ4KG5Qq.getValue()).booleanValue()) {
            return 0.0f;
        }
        return class_3532.method_16439((float)f, (float)f2, (float)f3);
    }

    @Inject(method={"findCrosshairTarget"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/projectile/ProjectileUtil;raycast(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Box;Ljava/util/function/Predicate;D)Lnet/minecraft/util/hit/EntityHitResult;")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1297 class_12972, double d, double d2, float f, CallbackInfoReturnable callbackInfoReturnable, @Local class_239 class_2392) {
        if (reach.m$$Jgo2D1LKsQfvB2rvxgxIzY3s8AmdISwCcNXxD921aJ3vNyyxnsVNaKaDeYTkLdktHRuD2Z2uqQKsIAGDgLxB9HKTFk7Yk4wSd(-2147228731) && class_2392.method_17783() == class_239.class_240.field_1332) {
            callbackInfoReturnable.setReturnValue((Object)class_2392);
        }
    }

    @Inject(method={"renderWorld"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/GameRenderer;renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V", shift=At.Shift.BEFORE)}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_9779 class_97792, CallbackInfo callbackInfo, @Local(ordinal=1) Matrix4f matrix4f, @Local(ordinal=0) float f, @Local(ordinal=0) Quaternionf quaternionf, @Local class_3695 class_36952) {
        if (this.field_3992 && m$$JCDqBI1tV8LshiexopvdlS4qtAdze1vKYofHIuiW7yp0DNcKtsqbxbQXGLrJaRhmOVrygCB2CgXkRgiKUgEEmvhdlDb9i6Tbz.isToggled() && ((Boolean)m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.m$$JCDqBI1tV8LshiexopvdlS4qtAdze1vKYofHIuiW7yp0DNcKtsqbxbQXGLrJaRhmOVrygCB2CgXkRgiKUgEEmvhdlDb9i6Tbz.m$$A8Ysf0JKpMLfuzCFbRTrvwDl4pGf9uMadyAsGSuLdOGB3MpE0CdcA16PP2dSAZD1Q3uRCLJExCmsUlt8p52K3J1lgjtFIxdL2.getValue()).booleanValue()) {
            callbackInfo.cancel();
            class_36952.method_15407();
        }
    }

    @WrapWithCondition(method={"bobView"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/util/math/MatrixStack;translate(FFF)V")})
    private boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_4587 class_45872, float f, float f2, float f3) {
        if (!m$$mhvh85mY6niNMEtyNVaUbcAivPcazOkS3RGfwgVYGOhMvOObJ82u75swZ3fibgYUKJT6AHFKpgbqnshFgkPKIh43gnQpeoSPh.isToggled()) {
            return true;
        }
        float f4 = ((Float)m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.m$$mhvh85mY6niNMEtyNVaUbcAivPcazOkS3RGfwgVYGOhMvOObJ82u75swZ3fibgYUKJT6AHFKpgbqnshFgkPKIh43gnQpeoSPh.m$$05DgqiNMLO2LuDbHoLhZ4ixT9CzYceCOH9W7ylm72lgK8xQHFLmkOrX7mgbwKVC6oIBGkcXfD1mWCoRT3GAguPFvp5nna61UI.getValue()).floatValue();
        class_45872.method_46416(f * f4, f2 * f4, f3 * f4);
        return false;
    }

    @WrapOperation(method={"renderHand"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/GameRenderer;getFov(Lnet/minecraft/client/render/Camera;FZ)F")}, require=0)
    private float m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_757 class_7572, class_4184 class_41842, float f, boolean bl, Operation operation) {
        float f2 = 1.0f - m$$bxS775zr0dPkyXIqkzgB7c1f7dx2GGeftjTTYr5C8eKPfEvS1d9A1jpXe3DzuRasS9VlczIFc9PeBvRDA2KN9M6oCYoJnyUrq.m$$VzEsk93iklrDH3YAjoM15ir1Ge3wfZ3EPYGlH1w73qq8E4YIvEfiC2D2RxEsjB3cUdYSIabinDAqoRD88H5zxg0Op5u4MRhfy(1203636250);
        if (!viewmodel.isToggled() || !((Boolean)m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.viewmodel.m$$MCYiRrU73i7mcuJM1Pe913cGK0psOY7Yd32lCSE1uObotVgO0Cgj8SNCfzLPAxJcjhU3Xe26KiklsRDzPvC0CeIDvKiQBFRgn.getValue()).booleanValue()) {
            return ((Float)operation.call(new Object[]{class_7572, class_41842, Float.valueOf(f), bl})).floatValue() * f2;
        }
        return (float)((Integer)m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.viewmodel.m$$sUCqJcxEuUVWuILaPVwP9XPb0JMwtLgC8luzPEcbJV9R3IeQQaF0gMZv0quLaOZP2RVXjkmhTMR8JJxgzFecJ3Aptz3z7ODLC.getValue()).intValue() * f2;
    }

    @Inject(method={"renderHand"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_4184 class_41842, float f, Matrix4f matrix4f, CallbackInfo callbackInfo) {
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(1.0f, 1.0f, 1.0f, norender.m$$vmT7k0MWDRXjMriNX6IaDN65AvjzfJj4kvtEJE5uCDB7qwZ8OnjrfoaHufObEe1a4MiQY9eJDLdqzlk2lQZSWUBXj70bnqEB7(-845063330));
        this.m$$npTGZKi9FNUMb5xmgTX1UJGy4ekcszA1JH3RWvBQNlcpyu5fCsNId9oHdPVvx4zrnyWyZzqzZ1iLKUhS85uQA7LsJjLytcMkM = true;
        if (freecam.m$$c8VtOwAEWqbnoE3tu6rdJn0fvDDKX0QL0C2IPdgINlPGbpEJjBlXKnZZEAdc1echpkpOAX2NSbPBtYDgj1cPMs0NdpPNBcmvE(1083385902)) {
            this.m$$npTGZKi9FNUMb5xmgTX1UJGy4ekcszA1JH3RWvBQNlcpyu5fCsNId9oHdPVvx4zrnyWyZzqzZ1iLKUhS85uQA7LsJjLytcMkM = false;
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderHand"}, at={@At(value="RETURN")})
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_4184 class_41842, float f, Matrix4f matrix4f, CallbackInfo callbackInfo) {
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(1.0f, 1.0f, 1.0f, 1.0f);
        this.m$$npTGZKi9FNUMb5xmgTX1UJGy4ekcszA1JH3RWvBQNlcpyu5fCsNId9oHdPVvx4zrnyWyZzqzZ1iLKUhS85uQA7LsJjLytcMkM = false;
    }

    @ModifyExpressionValue(method={"renderHand"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/entity/EntityRenderDispatcher;getLight(Lnet/minecraft/entity/Entity;F)I")})
    private int m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU(int n) {
        if (viewmodel.isToggled() && ((Boolean)m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.viewmodel.m$$N5tJjrDXG7yFKTLHkUKkNnaGMSJbB0eXCBYdW80HoUKzxcvuosYhYSLETHef5mK7ha2nCjvyk0VsoScKZSHiu2qDiAwtW6nPp.getValue()).booleanValue()) {
            return 0xF000F0;
        }
        return n;
    }

    @WrapWithCondition(method={"renderHand"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/hud/InGameOverlayRenderer;renderOverlays(Lnet/minecraft/client/MinecraftClient;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;)V")})
    private boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_310 class_3102, class_4587 class_45872, class_4597 class_45972) {
        return !m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$JtS6y3OKtFrQBGPhp1gae1DLvN1o1q0CdA2l8YvkOM7MOgIwqYlQCSkJtW7xplPv6MutK1dKT8LRXJ59kItBpnJbycC0MEz7C.m$$a3qcWmacuu2a0vwsi4RmEzyQiHzp11joDO1Au10HYlzWmTi190jlMmGksXtwEoS0Xwa30eShEpoVX5zKeDnZ5HRhYLkYky0Pt;
    }

    @Inject(method={"updateCrosshairTarget"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(float f, CallbackInfo callbackInfo) {
        if (freecam.isToggled() && this.field_4015.method_1560() != null && !this.m$$Md98Ck06Z0qvMdZsdhnA9mbnHu1irP8giawgjPL7LnvrCyTxQwYdg7IApGJSVL39S2wr7aXBNJzqOgpdvkhomYnhxgSwTEyMC) {
            callbackInfo.cancel();
            class_1297 class_12972 = this.field_4015.method_1560();
            double d = class_12972.method_23317();
            double d2 = class_12972.method_23318();
            double d3 = class_12972.method_23321();
            double d4 = class_12972.field_6014;
            double d5 = class_12972.field_6036;
            double d6 = class_12972.field_5969;
            float f2 = class_12972.method_36454();
            float f3 = class_12972.method_36455();
            float f4 = class_12972.field_5982;
            float f5 = class_12972.field_6004;
            class_12972.field_6014 = m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.freecam.m$$P7Fqr16nDzT350dm9VrOcRZli0TMohKayYWi0VCEv8XEeBAfNZhAu7JOyndiDpdercjAUZNKFEWjKogtdlVxGuuDFuygcXu5A.field_1352;
            class_12972.field_6036 = m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.freecam.m$$P7Fqr16nDzT350dm9VrOcRZli0TMohKayYWi0VCEv8XEeBAfNZhAu7JOyndiDpdercjAUZNKFEWjKogtdlVxGuuDFuygcXu5A.field_1351 - (double)class_12972.method_18381(class_12972.method_18376());
            class_12972.field_5969 = m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.freecam.m$$P7Fqr16nDzT350dm9VrOcRZli0TMohKayYWi0VCEv8XEeBAfNZhAu7JOyndiDpdercjAUZNKFEWjKogtdlVxGuuDFuygcXu5A.field_1350;
            class_12972.method_36456(m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.freecam.m$$51ElhQGUWcJQrwWAgBifUKD3E8l5AYrcRFZC8itakM8L8Qvij6s6azKcdnDcso4ezuvGfCDcPLwCZjM6g3qH6FR7eI1xwAH26);
            class_12972.method_5847(m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.freecam.m$$51ElhQGUWcJQrwWAgBifUKD3E8l5AYrcRFZC8itakM8L8Qvij6s6azKcdnDcso4ezuvGfCDcPLwCZjM6g3qH6FR7eI1xwAH26);
            class_12972.method_36457(m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.freecam.m$$G6EOLUOUexrDhnrMldvV14zDjfoidzxCtrNakZGHvGqah7AatLpDpExZNLRDWFmu7fsmBOHDgocLKoFe8NdK7Nl1IziEUcVy3);
            class_12972.field_5982 = m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.freecam.m$$FtbHz1rl89tuee0bxixPzqLUQ8gLpm07Mao73LIV60IJnwFjdKytqme87GaTovy697KAhdPVMELtJuA94fCGT8KA5hAVU8Qij;
            class_12972.field_6004 = m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.freecam.m$$LBuVhq3LgB2SlKXYNLodmUj8UdXBLpC0qr8NGWmjhorIQtHTEhfWpMuoTrGBpDGQcs9RHfRVJDBN4GbLiFIX32pgYW0lNiGYt;
            this.m$$Md98Ck06Z0qvMdZsdhnA9mbnHu1irP8giawgjPL7LnvrCyTxQwYdg7IApGJSVL39S2wr7aXBNJzqOgpdvkhomYnhxgSwTEyMC = true;
            m$$cr1cUwlXRwlij0FDPBwDumNZtQe5dZUYMwStzZlYNBu9dRJEQrtYU22mu3knmGhhSAobASlR6ckvjozWrz8lteaYivYVxYUry.m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(() -> {
                m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_12972.method_19538(), m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.freecam.m$$7vQEgAJ8QIf9IJXlCYDOUBBRupOK3h5zth9E05pjzcHlMDSgpZ4WjrrmAMFomRlSVYspLzvP3g9YjyU9VKkpFWvkbHVUlVTPn.field_1352, m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.freecam.m$$7vQEgAJ8QIf9IJXlCYDOUBBRupOK3h5zth9E05pjzcHlMDSgpZ4WjrrmAMFomRlSVYspLzvP3g9YjyU9VKkpFWvkbHVUlVTPn.field_1351 - (double)class_12972.method_18381(class_12972.method_18376()), m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.freecam.m$$7vQEgAJ8QIf9IJXlCYDOUBBRupOK3h5zth9E05pjzcHlMDSgpZ4WjrrmAMFomRlSVYspLzvP3g9YjyU9VKkpFWvkbHVUlVTPn.field_1350);
                this.method_3190(f);
                m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_12972.method_19538(), d, d2, d3);
            }, -1214275703);
            this.m$$Md98Ck06Z0qvMdZsdhnA9mbnHu1irP8giawgjPL7LnvrCyTxQwYdg7IApGJSVL39S2wr7aXBNJzqOgpdvkhomYnhxgSwTEyMC = false;
            class_12972.field_6014 = d4;
            class_12972.field_6036 = d5;
            class_12972.field_5969 = d6;
            class_12972.method_36456(f2);
            class_12972.method_36457(f3);
            class_12972.field_5982 = f4;
            class_12972.field_6004 = f5;
        }
        if (freelook.isToggled() && !freecam.isToggled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/screen/Screen;renderWithTooltip(Lnet/minecraft/client/gui/DrawContext;IIF)V", shift=At.Shift.BEFORE)})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_9779 class_97792, boolean bl, CallbackInfo callbackInfo) {
        m$$zT1UgsJzzIatZSESgG7E7Yo3y3xWh8PI4OEM7rvhiTcMAeI7EEQfffo9ZTFd6Zn8RxMOGLpXiKQtxerKQ8JIl9n6AwvWk2FCn.m$$SJ9Rt5MncvMPewN442Tk7LhHhGf1JxLH6BglOSX4v6efaTTjauH3kWs03UPLWXNsfGUVQeSdodpLorjsEnq6VsvlcYXuuaeBS = true;
    }

    @Inject(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/screen/Screen;renderWithTooltip(Lnet/minecraft/client/gui/DrawContext;IIF)V", shift=At.Shift.AFTER)})
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_9779 class_97792, boolean bl, CallbackInfo callbackInfo) {
        m$$zT1UgsJzzIatZSESgG7E7Yo3y3xWh8PI4OEM7rvhiTcMAeI7EEQfffo9ZTFd6Zn8RxMOGLpXiKQtxerKQ8JIl9n6AwvWk2FCn.m$$SJ9Rt5MncvMPewN442Tk7LhHhGf1JxLH6BglOSX4v6efaTTjauH3kWs03UPLWXNsfGUVQeSdodpLorjsEnq6VsvlcYXuuaeBS = false;
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void m$$si2aX2X8Dch8BrpPv8C89mK3tHVjy6by3nrWOWcgTRS3w0VNjCaT6TzOK1vZM0JWisN0y7s9j2U6LywGMjYOWySMMEgPZT7WH(class_9779 class_97792, boolean bl, CallbackInfo callbackInfo) {
        m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$Hf7ZpgvqxbEQ9wxGWYXkKk1c25WgKlOZgaM1QH85Rx7GTvPyD54y8wH3GslSnAZwvj0WfKaNLbpSJnzWJlhZG1oMD1jOlA5qi.m$$JiQQn7Ia19jeA7HASGKaYEFfSCz7FeuCUNhxPpBUMN0HCPWBfnYuJAzQxZFhxSmgWI6WruhngkGtKz4S1QzLeAWDtSXOLCvkd(991022210);
    }
}

