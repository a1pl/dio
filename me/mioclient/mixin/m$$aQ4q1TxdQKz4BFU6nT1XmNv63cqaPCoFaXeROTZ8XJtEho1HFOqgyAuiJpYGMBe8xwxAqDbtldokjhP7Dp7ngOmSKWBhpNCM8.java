package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReceiver;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import me.mioclient.m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb;
import me.mioclient.m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh;
import me.mioclient.m$$1a8TOY0wPcIsr5H3HtBQ2WvrIQ2rUPCAI6O8qIdOJihaZYw5Qf0bEzMEhbWsHio4ZYsjaJbUbgdwONbQqne5qR6W0fVb8bOwY;
import me.mioclient.m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A;
import me.mioclient.m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$YWy5rBMpCuklbD3zTDnAybzKc0J7hpyOXTaG60VfHc1FEg1c0D46MZech44YFFDwCV2u1bWgleXLHZeqzwT2axHZRxigVhwi9;
import me.mioclient.m$$dCZTfMRVfeYPXsQeXSgP82nfd4ik2eYhWMntsOvAPNzaKYWGiQ9Sqmfu4Y8s7YKzCxysFYeRLCLO0gQ6XwtJw62fTTTmt4ofQ;
import me.mioclient.m$$dGYcRLFI24LZN4QtTvULJkQEBOXpr5mDGCnPMtBo0sbBPDg0yHMn0jvpWBFWVpXtgp0ZlbfoQszcf9J3cbv6W6ppR6j18Sx57;
import me.mioclient.m$$npo9ZIOxvhCAIq7Gt2An5ScxwuD2xBWuUMLn0fD1Z1CIwIXLoTanEyY5tbqpFWOVjaPzcMwsrDsn0WYD0ceUnm2aHHF3B3nUO;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1313;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_243;
import net.minecraft.class_2487;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4050;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1297.class})
public abstract class m$$aQ4q1TxdQKz4BFU6nT1XmNv63cqaPCoFaXeROTZ8XJtEho1HFOqgyAuiJpYGMBe8xwxAqDbtldokjhP7Dp7ngOmSKWBhpNCM8
implements m$$YWy5rBMpCuklbD3zTDnAybzKc0J7hpyOXTaG60VfHc1FEg1c0D46MZech44YFFDwCV2u1bWgleXLHZeqzwT2axHZRxigVhwi9 {
    private static final m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v = (m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb.class);
    private static final m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh m$$AoRrg8flyPjKkEDvtoux1Vn4guiNtpFcod0txof9fxQxcKaFAb8ZXJKlw5c80MYnQV8qQlGiGYx1nzrhrYhXDvI47jyp09cRD = (m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh.class);
    private static final m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv m$$9W1PyZ9oPpdD08Uwy238j1iZ3I7C9XOBTTMWLtDOlbpAoaEvC8I37FQysx5i45SKsXkUApfKzWMyNwMwig8PrUwbaiyWwS1BS = (m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv.class);
    @Shadow
    private float field_6031;
    @Shadow
    private float field_5965;
    private static m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A m$$tBNzbY3OG1NsdcFb3lAXBsv1MyTCnsnqIeYXTzYdeHh6FgosTdSt45lSU8WXBVNiZEmJPSFeIOfQkEXKljzKooNOC2WTXjfSt = (m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A.class);
    private static m$$1a8TOY0wPcIsr5H3HtBQ2WvrIQ2rUPCAI6O8qIdOJihaZYw5Qf0bEzMEhbWsHio4ZYsjaJbUbgdwONbQqne5qR6W0fVb8bOwY m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x = (m$$1a8TOY0wPcIsr5H3HtBQ2WvrIQ2rUPCAI6O8qIdOJihaZYw5Qf0bEzMEhbWsHio4ZYsjaJbUbgdwONbQqne5qR6W0fVb8bOwY)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$1a8TOY0wPcIsr5H3HtBQ2WvrIQ2rUPCAI6O8qIdOJihaZYw5Qf0bEzMEhbWsHio4ZYsjaJbUbgdwONbQqne5qR6W0fVb8bOwY.class);
    private static m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG norender = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    @Unique
    private float m$$lE4q6UXCGETJFOIh7C2KhJceFPUrQh80YcKPsAVtuHtXK4sLETESxc8eqWYePoGE9vlTvKIhg5djHWvuMzbEcLJAcIYY7139Q;
    @Unique
    private float m$$80XAo1PYHJQGj6ke7Pf4Hq1APdDU8jZ79qYxXHYBHywPfjM3foFt15ZDykEMKNgJYTscSz4F0K8LXDnMSv6rhQxI3P7GwqOi1;
    @Unique
    private class_243 m$$PIlKSGgnnbQVrP6j2HzyS60vt19FFlOzKrijS9LZ6rPDQoT1thdcrw800ukwOEBm6AFDbVTlbCPH0DiXAvtZzcIdEUDvvMlAO;

    @Shadow
    private class_243 method_17835(class_243 class_2432) {
        return null;
    }

    @Shadow
    public abstract void method_5784(class_1313 var1, class_243 var2);

    @Shadow
    public abstract boolean equals(Object var1);

    @Shadow
    public abstract void method_33574(class_243 var1);

    @Shadow
    public abstract void method_5814(double var1, double var3, double var5);

    @Shadow
    protected abstract void method_5710(float var1, float var2);

    @Shadow
    public abstract class_243 method_18798();

    @Shadow
    public abstract boolean method_41328(class_4050 var1);

    @ModifyReceiver(method={"getVelocityMultiplier"}, at={@At(value="INVOKE", target="Lnet/minecraft/block/Block;getVelocityMultiplier()F")}, require=0)
    private class_2248 m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2248 class_22482) {
        if (this != class_310.method_1551().field_1724) {
            return class_22482;
        }
        if (m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.isToggled() && ((Boolean)m$$aQ4q1TxdQKz4BFU6nT1XmNv63cqaPCoFaXeROTZ8XJtEho1HFOqgyAuiJpYGMBe8xwxAqDbtldokjhP7Dp7ngOmSKWBhpNCM8.m$$V4lyxrRQY4hbEfdVgOkJT1UkKYxRiHNCyoyIx38U3wc0auWoQX6QQEF2DcWL13dgJmqWIo9jPBqnLHQxpJlcFsPHiPwWTaR0v.m$$3Hif2jrocBZ33RhnpMaRtIvP34XghmkuwAHwHAmM8zpde9J9UiFLCC1isS4TAFcZpgo0tHYE6KusofLgQ6qCm3nUwOBjoOtK9.getValue()).booleanValue()) {
            return class_2246.field_10340;
        }
        return class_22482;
    }

    @Inject(method={"pushAwayFrom"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_1297 class_12972, CallbackInfo callbackInfo) {
        if (this.equals(class_310.method_1551().field_1724) && m$$tBNzbY3OG1NsdcFb3lAXBsv1MyTCnsnqIeYXTzYdeHh6FgosTdSt45lSU8WXBVNiZEmJPSFeIOfQkEXKljzKooNOC2WTXjfSt.isToggled() && ((Boolean)m$$aQ4q1TxdQKz4BFU6nT1XmNv63cqaPCoFaXeROTZ8XJtEho1HFOqgyAuiJpYGMBe8xwxAqDbtldokjhP7Dp7ngOmSKWBhpNCM8.m$$tBNzbY3OG1NsdcFb3lAXBsv1MyTCnsnqIeYXTzYdeHh6FgosTdSt45lSU8WXBVNiZEmJPSFeIOfQkEXKljzKooNOC2WTXjfSt.m$$jfJUO4ZO1UBaJ7rSO9lWEOTMMkav7WbT45QtWtgylfP4VSekbHFbaXYOcz82taU7OsUHTNAOeutaVICIfY5muyL9Pbw48Lmo8.getValue()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @ModifyExpressionValue(method={"updateMovementInFluid"}, at={@At(value="INVOKE", target="Lnet/minecraft/fluid/FluidState;getVelocity(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;")})
    private class_243 m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_243 class_2432) {
        if (m$$tBNzbY3OG1NsdcFb3lAXBsv1MyTCnsnqIeYXTzYdeHh6FgosTdSt45lSU8WXBVNiZEmJPSFeIOfQkEXKljzKooNOC2WTXjfSt.isToggled() && ((Boolean)m$$aQ4q1TxdQKz4BFU6nT1XmNv63cqaPCoFaXeROTZ8XJtEho1HFOqgyAuiJpYGMBe8xwxAqDbtldokjhP7Dp7ngOmSKWBhpNCM8.m$$tBNzbY3OG1NsdcFb3lAXBsv1MyTCnsnqIeYXTzYdeHh6FgosTdSt45lSU8WXBVNiZEmJPSFeIOfQkEXKljzKooNOC2WTXjfSt.m$$kLvxl9e6G1Q8OVTkFtp2DEGTfDozdkpiu2g7b7EsrSfpotOYKWwpUR0tn1BQAulX1hxBXSAvjpQsOLQscMq5pbOgBat9NdIxS.getValue()).booleanValue()) {
            return class_243.field_1353;
        }
        return class_2432;
    }

    @ModifyExpressionValue(method={"move"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;adjustMovementForCollisions(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;")})
    private class_243 m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_243 class_2432, @Local(argsOnly=true) class_243 class_2433) {
        if (this != class_310.method_1551().field_1724) {
            return this.method_17835(class_2433);
        }
        m$$dGYcRLFI24LZN4QtTvULJkQEBOXpr5mDGCnPMtBo0sbBPDg0yHMn0jvpWBFWVpXtgp0ZlbfoQszcf9J3cbv6W6ppR6j18Sx57 m$$dGYcRLFI24LZN4QtTvULJkQEBOXpr5mDGCnPMtBo0sbBPDg0yHMn0jvpWBFWVpXtgp0ZlbfoQszcf9J3cbv6W6ppR6j18Sx57 = new m$$dGYcRLFI24LZN4QtTvULJkQEBOXpr5mDGCnPMtBo0sbBPDg0yHMn0jvpWBFWVpXtgp0ZlbfoQszcf9J3cbv6W6ppR6j18Sx57(m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$sQwB8Gn4SsL46dO2Upi4yBLYPCnKWOlOaSGrxKbwA1RWaIibNyrn6OSioUC20gJrJQ0HrgfZY1nKYe7wPwvGZ4a6oZ3eJBH69, 0.6f);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$dGYcRLFI24LZN4QtTvULJkQEBOXpr5mDGCnPMtBo0sbBPDg0yHMn0jvpWBFWVpXtgp0ZlbfoQszcf9J3cbv6W6ppR6j18Sx57);
        m$$dCZTfMRVfeYPXsQeXSgP82nfd4ik2eYhWMntsOvAPNzaKYWGiQ9Sqmfu4Y8s7YKzCxysFYeRLCLO0gQ6XwtJw62fTTTmt4ofQ.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((class_1309)this, m$$dGYcRLFI24LZN4QtTvULJkQEBOXpr5mDGCnPMtBo0sbBPDg0yHMn0jvpWBFWVpXtgp0ZlbfoQszcf9J3cbv6W6ppR6j18Sx57.m$$Namit6arBE9jZPXFh1prfRb2p1xvaBNLpPqjae0JGh5Qj4UYsmhdJ6LuJEb7BZcYbK7P6iWubxA4Cnm4D52RebVBjMfyEnpXE(), 2133978111);
        class_243 class_2434 = this.method_17835(class_2433);
        if (class_2434 != null) {
            m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(new m$$dGYcRLFI24LZN4QtTvULJkQEBOXpr5mDGCnPMtBo0sbBPDg0yHMn0jvpWBFWVpXtgp0ZlbfoQszcf9J3cbv6W6ppR6j18Sx57(m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$cLoz4UwY1GSOQzXYErRtEVYBhrEoLPlj4BbRpZV1TLY7qk3wQNZabEq1LQPwG2CSYkgd7XrSLVNpuykeq21bMvSkKk4Fe5RrY, (float)class_2434.field_1351));
        }
        return class_2434;
    }

    @Inject(method={"getPose"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$h6YK9QjDoMTr6MXOhtlGTjBp7y0YtqKAgZLe07Ls67QzPUmzRr17jYrMRTv0uHNS5s8YWDE9aAK2nmZbLbd8ZKM3Ox497EJfz(CallbackInfoReturnable callbackInfoReturnable) {
        if (this != class_310.method_1551().field_1724) {
            return;
        }
        if (m$$AoRrg8flyPjKkEDvtoux1Vn4guiNtpFcod0txof9fxQxcKaFAb8ZXJKlw5c80MYnQV8qQlGiGYx1nzrhrYhXDvI47jyp09cRD.m$$2wZDWnm1TYZ5uUsiU4rfVCfBEnrJxhd8aKVphBl3tICdQQuOwBt5l8epefOB0dH1pTXJNObdHgIVbKMsGI4rK2fbX8FhlBp0m(-59906499) || m$$AoRrg8flyPjKkEDvtoux1Vn4guiNtpFcod0txof9fxQxcKaFAb8ZXJKlw5c80MYnQV8qQlGiGYx1nzrhrYhXDvI47jyp09cRD.m$$xqUE15VO1U9WselpAdsK3l70mpkouLGgVwX9dOtwcCEEE8YfWcFEnaOz10ZWiMr1XHBTFwCNWoabfNPJ5XK8BVX8NvjdsgWEf(354432050)) {
            callbackInfoReturnable.setReturnValue((Object)class_4050.field_18076);
            callbackInfoReturnable.cancel();
        }
    }

    @Inject(method={"changeLookDirection"}, at={@At(value="HEAD")}, cancellable=true)
    public void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(double d, double d2, CallbackInfo callbackInfo) {
        if (m$$9W1PyZ9oPpdD08Uwy238j1iZ3I7C9XOBTTMWLtDOlbpAoaEvC8I37FQysx5i45SKsXkUApfKzWMyNwMwig8PrUwbaiyWwS1BS.isToggled()) {
            return;
        }
        if (m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x.isToggled() && this.equals(class_310.method_1551().field_1724)) {
            double d3 = d2 * 0.15;
            double d4 = d * 0.15;
            this.m$$lE4q6UXCGETJFOIh7C2KhJceFPUrQh80YcKPsAVtuHtXK4sLETESxc8eqWYePoGE9vlTvKIhg5djHWvuMzbEcLJAcIYY7139Q = class_3532.method_15363((float)(this.m$$lE4q6UXCGETJFOIh7C2KhJceFPUrQh80YcKPsAVtuHtXK4sLETESxc8eqWYePoGE9vlTvKIhg5djHWvuMzbEcLJAcIYY7139Q + (float)d3), (float)(-m$$npo9ZIOxvhCAIq7Gt2An5ScxwuD2xBWuUMLn0fD1Z1CIwIXLoTanEyY5tbqpFWOVjaPzcMwsrDsn0WYD0ceUnm2aHHF3B3nUO.m$$HFQ0smLtvSwyGa2hEBvL56Zxp3uWwg9lJFUFylnrLaTmeDVV8C8aBUZHkL3c28grvcpZ2XWoyZDjwyAY9lxTLrHl81jQivuhn), (float)m$$npo9ZIOxvhCAIq7Gt2An5ScxwuD2xBWuUMLn0fD1Z1CIwIXLoTanEyY5tbqpFWOVjaPzcMwsrDsn0WYD0ceUnm2aHHF3B3nUO.m$$HFQ0smLtvSwyGa2hEBvL56Zxp3uWwg9lJFUFylnrLaTmeDVV8C8aBUZHkL3c28grvcpZ2XWoyZDjwyAY9lxTLrHl81jQivuhn);
            this.m$$80XAo1PYHJQGj6ke7Pf4Hq1APdDU8jZ79qYxXHYBHywPfjM3foFt15ZDykEMKNgJYTscSz4F0K8LXDnMSv6rhQxI3P7GwqOi1 += (float)d4;
            callbackInfo.cancel();
        }
    }

    @ModifyExpressionValue(method={"getCameraPosVec"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;getStandingEyeHeight()F")})
    private float m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU(float f) {
        if (norender.isToggled() && ((Boolean)m$$aQ4q1TxdQKz4BFU6nT1XmNv63cqaPCoFaXeROTZ8XJtEho1HFOqgyAuiJpYGMBe8xwxAqDbtldokjhP7Dp7ngOmSKWBhpNCM8.norender.m$$SrXzepvX8GanjxvprDBCgDOMqEquydMenNwj2AJq9yRTehLvS1AFhUHxg8w5d7H9hYsWAVtDTRj987Y2wdIlPQZqum43adH0f.getValue()).booleanValue() && this.method_41328(class_4050.field_18081)) {
            return 1.54f;
        }
        return f;
    }

    @WrapOperation(method={"writeNbt"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;writeCustomDataToNbt(Lnet/minecraft/nbt/NbtCompound;)V")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1297 class_12972, class_2487 class_24872, Operation operation) {
        if (class_24872.method_10545("mio_side_player")) {
            try {
                operation.call(new Object[]{class_12972, class_24872});
            } catch (Throwable throwable) {
                // empty catch block
            }
            return;
        }
        operation.call(new Object[]{class_12972, class_24872});
    }

    @Inject(method={"baseTick"}, at={@At(value="INVOKE", target="Lnet/minecraft/util/profiler/Profiler;push(Ljava/lang/String;)V", ordinal=0, shift=At.Shift.AFTER)})
    private void m$$9vFcpqa5eflTL0srBkFm1bU8MypCAaM5v14ItjdillmOT6Gglf4WzP03KAcJZpQ9VHDpKjp1jdtAMWZogLj82wQy1haS76Knc(CallbackInfo callbackInfo) {
        this.m$$PIlKSGgnnbQVrP6j2HzyS60vt19FFlOzKrijS9LZ6rPDQoT1thdcrw800ukwOEBm6AFDbVTlbCPH0DiXAvtZzcIdEUDvvMlAO = this.method_18798();
    }

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1299 class_12992, class_1937 class_19372, CallbackInfo callbackInfo) {
        this.m$$PIlKSGgnnbQVrP6j2HzyS60vt19FFlOzKrijS9LZ6rPDQoT1thdcrw800ukwOEBm6AFDbVTlbCPH0DiXAvtZzcIdEUDvvMlAO = class_243.field_1353;
    }

    @Override
    @Unique
    public float getCameraPitch() {
        return this.m$$lE4q6UXCGETJFOIh7C2KhJceFPUrQh80YcKPsAVtuHtXK4sLETESxc8eqWYePoGE9vlTvKIhg5djHWvuMzbEcLJAcIYY7139Q;
    }

    @Override
    @Unique
    public float getCameraYaw() {
        return this.m$$80XAo1PYHJQGj6ke7Pf4Hq1APdDU8jZ79qYxXHYBHywPfjM3foFt15ZDykEMKNgJYTscSz4F0K8LXDnMSv6rhQxI3P7GwqOi1;
    }

    @Override
    @Unique
    public void setCameraPitch(float f) {
        this.m$$lE4q6UXCGETJFOIh7C2KhJceFPUrQh80YcKPsAVtuHtXK4sLETESxc8eqWYePoGE9vlTvKIhg5djHWvuMzbEcLJAcIYY7139Q = f;
    }

    @Override
    @Unique
    public void setCameraYaw(float f) {
        this.m$$80XAo1PYHJQGj6ke7Pf4Hq1APdDU8jZ79qYxXHYBHywPfjM3foFt15ZDykEMKNgJYTscSz4F0K8LXDnMSv6rhQxI3P7GwqOi1 = f;
    }

    @Override
    public class_243 mio$getPrevVelocity() {
        return this.m$$PIlKSGgnnbQVrP6j2HzyS60vt19FFlOzKrijS9LZ6rPDQoT1thdcrw800ukwOEBm6AFDbVTlbCPH0DiXAvtZzcIdEUDvvMlAO;
    }
}

