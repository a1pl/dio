package me.mioclient.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalFloatRef;
import me.mioclient.m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh;
import me.mioclient.m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$0rBUCLb4z9PRTb0kePvQAdhlPPJQEuWVVa3PpJJftIx31cd4y02fUIQoScUSHQB25VerK5lacGGhPoCrPkUe0SD2h4x1452PM;
import me.mioclient.m$$1a8TOY0wPcIsr5H3HtBQ2WvrIQ2rUPCAI6O8qIdOJihaZYw5Qf0bEzMEhbWsHio4ZYsjaJbUbgdwONbQqne5qR6W0fVb8bOwY;
import me.mioclient.m$$3gcpf9Ky33GcHWHq8tC78GGNMP1b1SdSd4tJEWjtLYR5QEQWvbWMzkHm7ShyBZXB35NGoqKr7JkeLhefQi7LXJgZhpznIzsqN;
import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$YWy5rBMpCuklbD3zTDnAybzKc0J7hpyOXTaG60VfHc1FEg1c0D46MZech44YFFDwCV2u1bWgleXLHZeqzwT2axHZRxigVhwi9;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1922;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4050;
import net.minecraft.class_4184;
import net.minecraft.class_746;
import org.joml.Vector3f;
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

@Mixin(value={class_4184.class})
public abstract class m$$Bt2WCJQeHB4TyQsfZ992xBi26LbuV49cmrW6MFWw9l1Egjv10qEiHq87PKmGfmR1VNpWkJ6EsNCj7kXVm13P8hfE82mIMwLjf {
    private static m$$0rBUCLb4z9PRTb0kePvQAdhlPPJQEuWVVa3PpJJftIx31cd4y02fUIQoScUSHQB25VerK5lacGGhPoCrPkUe0SD2h4x1452PM m$$fIHJjiNpd5FbKFtiMTTHoTvq5ynbCGuLvof5U0yGEfvBR3Ktg9NLo5x0TXsHGIMYCNnNvySKTnJ90rPAostsVBFMSioVkQMh3 = (m$$0rBUCLb4z9PRTb0kePvQAdhlPPJQEuWVVa3PpJJftIx31cd4y02fUIQoScUSHQB25VerK5lacGGhPoCrPkUe0SD2h4x1452PM)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$0rBUCLb4z9PRTb0kePvQAdhlPPJQEuWVVa3PpJJftIx31cd4y02fUIQoScUSHQB25VerK5lacGGhPoCrPkUe0SD2h4x1452PM.class);
    private static m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG norender = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    private static m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh elytrafly = (m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh.class);
    private static m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv freecam = (m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv.class);
    private static m$$1a8TOY0wPcIsr5H3HtBQ2WvrIQ2rUPCAI6O8qIdOJihaZYw5Qf0bEzMEhbWsHio4ZYsjaJbUbgdwONbQqne5qR6W0fVb8bOwY m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x = (m$$1a8TOY0wPcIsr5H3HtBQ2WvrIQ2rUPCAI6O8qIdOJihaZYw5Qf0bEzMEhbWsHio4ZYsjaJbUbgdwONbQqne5qR6W0fVb8bOwY)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$1a8TOY0wPcIsr5H3HtBQ2WvrIQ2rUPCAI6O8qIdOJihaZYw5Qf0bEzMEhbWsHio4ZYsjaJbUbgdwONbQqne5qR6W0fVb8bOwY.class);
    @Final
    @Shadow
    private Vector3f field_18714;
    @Final
    @Shadow
    private Vector3f field_18715;
    @Final
    @Shadow
    private Vector3f field_18716;
    @Shadow
    private class_243 field_18712;
    @Shadow
    private float field_18721;
    @Shadow
    private float field_18722;
    @Shadow
    private class_1297 field_18711;
    @Unique
    private boolean hold = true;

    @Shadow
    protected void method_19322(class_243 class_2432) {
    }

    @Shadow
    protected abstract void method_19325(float var1, float var2);

    @Inject(method={"clipToSpace"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(float f, CallbackInfoReturnable callbackInfoReturnable, @Local(argsOnly=true) LocalFloatRef localFloatRef) {
        if (m$$fIHJjiNpd5FbKFtiMTTHoTvq5ynbCGuLvof5U0yGEfvBR3Ktg9NLo5x0TXsHGIMYCNnNvySKTnJ90rPAostsVBFMSioVkQMh3.isToggled()) {
            float f2 = ((Double)m$$Bt2WCJQeHB4TyQsfZ992xBi26LbuV49cmrW6MFWw9l1Egjv10qEiHq87PKmGfmR1VNpWkJ6EsNCj7kXVm13P8hfE82mIMwLjf.m$$fIHJjiNpd5FbKFtiMTTHoTvq5ynbCGuLvof5U0yGEfvBR3Ktg9NLo5x0TXsHGIMYCNnNvySKTnJ90rPAostsVBFMSioVkQMh3.m$$bH2EPeR4dX2NAm4xsRwRgWQfAhXjZF0skMR5jWDFJcnSAYGIHGeJrvEhZ9rGOu8PVhVAdhrlbTm9kOly6pBVkkLNIj6J9y4xp.getValue()).floatValue();
            if (m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x.m$$p8XG8fmE3orEWlIwznkmXHh3UdO5m4KrpG4Fe6G8Pb07XjQDyGn7e6Kky7RQ7alI5t2kdadZFVpDCrCDxtW21xyTasVEOQF85(-2140944246)) {
                f2 += m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x.m$$aKToTKznYpynuxkMAqwC92FIRjpRhIxd6e8ni9z8XJ8rADioTq1HO5vCc8ossW9ofpA6plo9nlQJDB7DqyKiUqWD8LdSeRqGc(-942623499);
                f2 = class_3532.method_15363((float)f2, (float)1.0f, (float)12.0f);
            }
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(f2));
            return;
        }
        if (m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x.m$$p8XG8fmE3orEWlIwznkmXHh3UdO5m4KrpG4Fe6G8Pb07XjQDyGn7e6Kky7RQ7alI5t2kdadZFVpDCrCDxtW21xyTasVEOQF85(-2140944246)) {
            localFloatRef.set(class_3532.method_15363((float)(localFloatRef.get() + m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x.m$$aKToTKznYpynuxkMAqwC92FIRjpRhIxd6e8ni9z8XJ8rADioTq1HO5vCc8ossW9ofpA6plo9nlQJDB7DqyKiUqWD8LdSeRqGc(-942623499)), (float)1.0f, (float)12.0f));
        }
    }

    @Inject(method={"updateEyeHeight"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$si2aX2X8Dch8BrpPv8C89mK3tHVjy6by3nrWOWcgTRS3w0VNjCaT6TzOK1vZM0JWisN0y7s9j2U6LywGMjYOWySMMEgPZT7WH(CallbackInfo callbackInfo) {
        if (!norender.isToggled() || !((Boolean)m$$Bt2WCJQeHB4TyQsfZ992xBi26LbuV49cmrW6MFWw9l1Egjv10qEiHq87PKmGfmR1VNpWkJ6EsNCj7kXVm13P8hfE82mIMwLjf.norender.m$$SrXzepvX8GanjxvprDBCgDOMqEquydMenNwj2AJq9yRTehLvS1AFhUHxg8w5d7H9hYsWAVtDTRj987Y2wdIlPQZqum43adH0f.getValue()).booleanValue() || this.field_18711 == null) {
            return;
        }
        callbackInfo.cancel();
        this.field_18722 = this.field_18721;
        class_1297 class_12972 = this.field_18711;
        if (class_12972 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_12972;
            if (class_16572.method_41328(class_4050.field_18081)) {
                this.field_18721 = 1.54f;
            } else if (this.field_18721 < 1.62f && class_16572.method_41328(class_4050.field_18076)) {
                float f = 1.62f - this.field_18721;
                f = (float)((double)f * 0.4);
                this.field_18721 = 1.62f - f;
            } else {
                this.field_18721 += (this.field_18711.method_5751() - this.field_18721) * 0.5f;
            }
        }
    }

    @Inject(method={"moveBy"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(float f, float f2, float f3, CallbackInfo callbackInfo) {
        if (m$$fIHJjiNpd5FbKFtiMTTHoTvq5ynbCGuLvof5U0yGEfvBR3Ktg9NLo5x0TXsHGIMYCNnNvySKTnJ90rPAostsVBFMSioVkQMh3.isToggled() && ((Boolean)m$$Bt2WCJQeHB4TyQsfZ992xBi26LbuV49cmrW6MFWw9l1Egjv10qEiHq87PKmGfmR1VNpWkJ6EsNCj7kXVm13P8hfE82mIMwLjf.m$$fIHJjiNpd5FbKFtiMTTHoTvq5ynbCGuLvof5U0yGEfvBR3Ktg9NLo5x0TXsHGIMYCNnNvySKTnJ90rPAostsVBFMSioVkQMh3.m$$TDYVU0WqCsWqhtXL9SDMjqJ67MKWsRhuU9cO6msELqx5INZ8gZC85MIH1ZdbuS7wWN4koHx1MxKXFwwawMFLKOT82mD5krFg8.getValue()).booleanValue()) {
            double d = (double)this.field_18714.x() * (double)f + (double)this.field_18715.x() * (double)f2 + (double)this.field_18716.x() * (double)f3;
            double d2 = (double)this.field_18714.y() * (double)f + (double)this.field_18715.y() * (double)f2 + (double)this.field_18716.y() * (double)f3;
            double d3 = (double)this.field_18714.z() * (double)f + (double)this.field_18715.z() * (double)f2 + (double)this.field_18716.z() * (double)f3;
            float f4 = m$$Bt2WCJQeHB4TyQsfZ992xBi26LbuV49cmrW6MFWw9l1Egjv10qEiHq87PKmGfmR1VNpWkJ6EsNCj7kXVm13P8hfE82mIMwLjf.m$$fIHJjiNpd5FbKFtiMTTHoTvq5ynbCGuLvof5U0yGEfvBR3Ktg9NLo5x0TXsHGIMYCNnNvySKTnJ90rPAostsVBFMSioVkQMh3.m$$zzj2tIrEfgloDZ4aCbddvaZy9ZwgJVdTixGDK6i3Ow80uTS8hnHY3WpAsOAeuTrH2xXFLWr9eRUt0vauJ3e3GuHsbyQLsUzDy.m$$Cazp19oS8kw4yCtiEMq82HY6TA1uKvtsknEfeXiuL7qDlSttpvSvJa6f6Xy64eoYPoEfF4IbQgHNiJCLLTGS5FZI66syvRA7y();
            this.method_19322(new class_243(this.field_18712.field_1352 + d * (double)f4, this.field_18712.field_1351 + d2 * (double)f4, this.field_18712.field_1350 + d3 * (double)f4));
            callbackInfo.cancel();
        }
    }

    @ModifyArgs(method={"update"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;setPos(DDD)V"))
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(Args args) {
        m$$3gcpf9Ky33GcHWHq8tC78GGNMP1b1SdSd4tJEWjtLYR5QEQWvbWMzkHm7ShyBZXB35NGoqKr7JkeLhefQi7LXJgZhpznIzsqN m$$3gcpf9Ky33GcHWHq8tC78GGNMP1b1SdSd4tJEWjtLYR5QEQWvbWMzkHm7ShyBZXB35NGoqKr7JkeLhefQi7LXJgZhpznIzsqN = new m$$3gcpf9Ky33GcHWHq8tC78GGNMP1b1SdSd4tJEWjtLYR5QEQWvbWMzkHm7ShyBZXB35NGoqKr7JkeLhefQi7LXJgZhpznIzsqN((Double)args.get(0), (Double)args.get(1), (Double)args.get(2));
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$3gcpf9Ky33GcHWHq8tC78GGNMP1b1SdSd4tJEWjtLYR5QEQWvbWMzkHm7ShyBZXB35NGoqKr7JkeLhefQi7LXJgZhpznIzsqN);
        if (m$$3gcpf9Ky33GcHWHq8tC78GGNMP1b1SdSd4tJEWjtLYR5QEQWvbWMzkHm7ShyBZXB35NGoqKr7JkeLhefQi7LXJgZhpznIzsqN.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            args.set(0, (Object)m$$3gcpf9Ky33GcHWHq8tC78GGNMP1b1SdSd4tJEWjtLYR5QEQWvbWMzkHm7ShyBZXB35NGoqKr7JkeLhefQi7LXJgZhpznIzsqN.m$$MmOWYSOFGzd7MFWj1CN4bqDL9c4u2nALecj8gf3p7DGpsvqojqfVIZWagb5fN5UnZJgQYJpebmp8YnczmCDWWyxNzohO8VRkf().field_1352);
            args.set(1, (Object)m$$3gcpf9Ky33GcHWHq8tC78GGNMP1b1SdSd4tJEWjtLYR5QEQWvbWMzkHm7ShyBZXB35NGoqKr7JkeLhefQi7LXJgZhpznIzsqN.m$$MmOWYSOFGzd7MFWj1CN4bqDL9c4u2nALecj8gf3p7DGpsvqojqfVIZWagb5fN5UnZJgQYJpebmp8YnczmCDWWyxNzohO8VRkf().field_1351);
            args.set(2, (Object)m$$3gcpf9Ky33GcHWHq8tC78GGNMP1b1SdSd4tJEWjtLYR5QEQWvbWMzkHm7ShyBZXB35NGoqKr7JkeLhefQi7LXJgZhpznIzsqN.m$$MmOWYSOFGzd7MFWj1CN4bqDL9c4u2nALecj8gf3p7DGpsvqojqfVIZWagb5fN5UnZJgQYJpebmp8YnczmCDWWyxNzohO8VRkf().field_1350);
        }
    }

    @ModifyArgs(method={"update"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;setRotation(FF)V"))
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(Args args) {
        if (elytrafly.isToggled() && m$$Bt2WCJQeHB4TyQsfZ992xBi26LbuV49cmrW6MFWw9l1Egjv10qEiHq87PKmGfmR1VNpWkJ6EsNCj7kXVm13P8hfE82mIMwLjf.elytrafly.m$$XllnuTY2kO7g28STWd7xPc2rdZWa1U9P2KWG708Dj6nYph2kkP9ur7vb68Kvg60QnxljDG9VYLD4y0oAB10OVr5M2vqGfw9oh.getValue() == m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$0QzhjyGoDpdx3ZH0rQve5ItuikubsGknIJAO1ExKjaX0wEa7SbHd0jm3kWgYCZXXO88B5zDt9CxJpkQ7NUHVSONwkgTB1XDWb && ((Boolean)m$$Bt2WCJQeHB4TyQsfZ992xBi26LbuV49cmrW6MFWw9l1Egjv10qEiHq87PKmGfmR1VNpWkJ6EsNCj7kXVm13P8hfE82mIMwLjf.elytrafly.m$$MLuwdqSbzNs9Zr6dnAE0YRi4m0H15OryPsjf1YEKID3fSefqV8b3Bs8gvHWJzUv7qZhIx7bJ6SO0MrlOWFMhLdnKcdXbngypP.getValue()).booleanValue() && !((Boolean)m$$Bt2WCJQeHB4TyQsfZ992xBi26LbuV49cmrW6MFWw9l1Egjv10qEiHq87PKmGfmR1VNpWkJ6EsNCj7kXVm13P8hfE82mIMwLjf.elytrafly.m$$XX7aIFk9ORRsYUbNdPFJbhhc7fJOxyMqdRtqK9GLe1zfapMjOjaNS0ikclI1dvoIa7Y87IRpZYO1QdfRGlnKgh2kvbx1uKYhY.getValue()).booleanValue()) {
            args.set(1, (Object)((Float)m$$Bt2WCJQeHB4TyQsfZ992xBi26LbuV49cmrW6MFWw9l1Egjv10qEiHq87PKmGfmR1VNpWkJ6EsNCj7kXVm13P8hfE82mIMwLjf.elytrafly.m$$iunK2JeWBlIIa1o0afg7wqEOvmFQiw8LkYHrGGSXm4RS4YXjgBmLdpc5WQqp2DO8UvQZGOeMGkVbE1nscFpQWCcoGSCaxKv8i.getValue()));
        }
        float f = m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge();
        if (freecam.isToggled()) {
            args.set(0, (Object)Float.valueOf((float)freecam.m$$ngwg8fTtoOoDXHuvM7rQ6l7gngZbp1iZUdtAfFU14IzEqfuGgJFAdZPT3KarwIDr7AGhdLNcCUrLz0FBv5C6tAEQ7NAYSEl2T(f, 1623835320)));
            args.set(1, (Object)Float.valueOf((float)freecam.m$$hDMsM3tDFnD4jD14XsgHo5oPy6uUllEoQeWknfaChhCiKma3TJQlpjRShkHrE44MJDmjpsTbFUQf5NX3NcSeqPWQDRMiIzUXA(f, -1838528032)));
        }
    }

    @Inject(method={"update"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;setRotation(FF)V", ordinal=1, shift=At.Shift.AFTER)})
    public void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1922 class_19222, class_1297 class_12972, boolean bl, boolean bl2, float f, CallbackInfo callbackInfo) {
        if (freecam.isToggled()) {
            return;
        }
        if (m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x.isToggled() && class_12972 instanceof class_746) {
            class_310 class_3102 = class_310.method_1551();
            m$$YWy5rBMpCuklbD3zTDnAybzKc0J7hpyOXTaG60VfHc1FEg1c0D46MZech44YFFDwCV2u1bWgleXLHZeqzwT2axHZRxigVhwi9 m$$YWy5rBMpCuklbD3zTDnAybzKc0J7hpyOXTaG60VfHc1FEg1c0D46MZech44YFFDwCV2u1bWgleXLHZeqzwT2axHZRxigVhwi9 = (m$$YWy5rBMpCuklbD3zTDnAybzKc0J7hpyOXTaG60VfHc1FEg1c0D46MZech44YFFDwCV2u1bWgleXLHZeqzwT2axHZRxigVhwi9)class_12972;
            if (class_3102.field_1724 != null && this.hold) {
                m$$YWy5rBMpCuklbD3zTDnAybzKc0J7hpyOXTaG60VfHc1FEg1c0D46MZech44YFFDwCV2u1bWgleXLHZeqzwT2axHZRxigVhwi9.setCameraYaw(class_3102.field_1724.method_36454());
                m$$YWy5rBMpCuklbD3zTDnAybzKc0J7hpyOXTaG60VfHc1FEg1c0D46MZech44YFFDwCV2u1bWgleXLHZeqzwT2axHZRxigVhwi9.setCameraPitch(class_3102.field_1724.method_36455());
                this.hold = false;
            }
            this.method_19325(m$$YWy5rBMpCuklbD3zTDnAybzKc0J7hpyOXTaG60VfHc1FEg1c0D46MZech44YFFDwCV2u1bWgleXLHZeqzwT2axHZRxigVhwi9.getCameraYaw(), m$$YWy5rBMpCuklbD3zTDnAybzKc0J7hpyOXTaG60VfHc1FEg1c0D46MZech44YFFDwCV2u1bWgleXLHZeqzwT2axHZRxigVhwi9.getCameraPitch());
        }
        if (!m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x.isToggled() && class_12972 instanceof class_746) {
            this.hold = true;
        }
    }
}

