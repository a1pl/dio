package me.mioclient.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import me.mioclient.m$$47intHn7pQnresgcjyBQNFrnG2bD6It91S8u1EoxsBu535T0LYjAaSqlAJUNjhygU6PE8KATWamVaUs9km1zRS5zfxULalLbb;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR;
import me.mioclient.m$$vq4Gf3p5NneECPZa5nb9VlOLw74XMrreULq15BLVTlqhKjD7cbzenbuazSCw0HdFOaIbFFEtCBXAzPBSn6bUyZJ6HQ6FK9Fg9;
import me.mioclient.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_2692;
import net.minecraft.class_2761;
import net.minecraft.class_634;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_634.class})
public class m$$FRUoLijfpaF0AscB8mUhrhNdNEblEiPOZuoJxqug1epMQkvhce1Jg2Cq3ct30g7xTvsaqo4EG8Syw6bOlNV2NSj6wmJMo13uj {
    private static final m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml m$$LGLFak5nbFECYdITscFpInQHGvLyjB6pb6cOAakiO2zDGdLGYbKOMcrVV59Rx3dlrn0ekrR2pTy57miCyeGRkPm0O0rFavrAH = (m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml.class);
    @Shadow
    private class_638 field_3699;
    @Unique
    private m$$vq4Gf3p5NneECPZa5nb9VlOLw74XMrreULq15BLVTlqhKjD7cbzenbuazSCw0HdFOaIbFFEtCBXAzPBSn6bUyZJ6HQ6FK9Fg9 m$$sDfBUB57ouivweuHLH0AkyZGGSZCOoj7uAj59L3zxUSG4hxeSRKrvIVVkOIQqp6KMxFVguu083EKPY4lilAbF2WOdYsiTMCNt;

    @Inject(method={"sendChatMessage"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(String string, CallbackInfo callbackInfo) {
        if (string.startsWith(m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR.m$$TRdDqBJgjZ1fw9rIVfhStjcPOPjNzy6jg68DukqXu2g24StbWqoO7VTCIgO8JxiARBFlRnv98GgLAhEyYbNiJhiID7o3hu0OB(-1241911330))) {
            m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR.m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(string.substring(m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR.m$$TRdDqBJgjZ1fw9rIVfhStjcPOPjNzy6jg68DukqXu2g24StbWqoO7VTCIgO8JxiARBFlRnv98GgLAhEyYbNiJhiID7o3hu0OB(-1241911330).length()), -1517991297);
            callbackInfo.cancel();
        }
    }

    @ModifyVariable(method={"sendChatMessage"}, at=@At(value="INVOKE", target="Ljava/time/Instant;now()Ljava/time/Instant;", shift=At.Shift.BEFORE), argsOnly=true)
    private String m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(String string) {
        this.m$$sDfBUB57ouivweuHLH0AkyZGGSZCOoj7uAj59L3zxUSG4hxeSRKrvIVVkOIQqp6KMxFVguu083EKPY4lilAbF2WOdYsiTMCNt = new m$$vq4Gf3p5NneECPZa5nb9VlOLw74XMrreULq15BLVTlqhKjD7cbzenbuazSCw0HdFOaIbFFEtCBXAzPBSn6bUyZJ6HQ6FK9Fg9(string);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(this.m$$sDfBUB57ouivweuHLH0AkyZGGSZCOoj7uAj59L3zxUSG4hxeSRKrvIVVkOIQqp6KMxFVguu083EKPY4lilAbF2WOdYsiTMCNt);
        return this.m$$sDfBUB57ouivweuHLH0AkyZGGSZCOoj7uAj59L3zxUSG4hxeSRKrvIVVkOIQqp6KMxFVguu083EKPY4lilAbF2WOdYsiTMCNt.m$$2LqcC9xdmICn9YlLUBcW10ZLhkMgoeefsjWkNKU4tHvplcdK1UVa8rX3HoyPnJUJURjS8XjlbGIjuQVFAbuTZhmXBSl7Z4d5o();
    }

    @Inject(method={"sendChatMessage"}, at={@At(value="INVOKE", target="Ljava/time/Instant;now()Ljava/time/Instant;", shift=At.Shift.AFTER)}, cancellable=true)
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(String string, CallbackInfo callbackInfo) {
        if (this.m$$sDfBUB57ouivweuHLH0AkyZGGSZCOoj7uAj59L3zxUSG4hxeSRKrvIVVkOIQqp6KMxFVguu083EKPY4lilAbF2WOdYsiTMCNt != null && this.m$$sDfBUB57ouivweuHLH0AkyZGGSZCOoj7uAj59L3zxUSG4hxeSRKrvIVVkOIQqp6KMxFVguu083EKPY4lilAbF2WOdYsiTMCNt.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"onWorldTimeUpdate"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/util/thread/ThreadExecutor;)V", shift=At.Shift.AFTER)}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2761 class_27612, CallbackInfo callbackInfo) {
        if (m$$LGLFak5nbFECYdITscFpInQHGvLyjB6pb6cOAakiO2zDGdLGYbKOMcrVV59Rx3dlrn0ekrR2pTy57miCyeGRkPm0O0rFavrAH.isToggled() && ((Boolean)m$$FRUoLijfpaF0AscB8mUhrhNdNEblEiPOZuoJxqug1epMQkvhce1Jg2Cq3ct30g7xTvsaqo4EG8Syw6bOlNV2NSj6wmJMo13uj.m$$LGLFak5nbFECYdITscFpInQHGvLyjB6pb6cOAakiO2zDGdLGYbKOMcrVV59Rx3dlrn0ekrR2pTy57miCyeGRkPm0O0rFavrAH.m$$fU1MEiEvc0sPQ7MIKDmcIIfyN8XRRt2FkKrCGZKxwzgUgEiVphHGxyPH8PT6cXui3vOj3o9hzQnoN1H3ppd0v3hB6Jx5wZT00.getValue()).booleanValue()) {
            this.field_3699.method_29089(m$$LGLFak5nbFECYdITscFpInQHGvLyjB6pb6cOAakiO2zDGdLGYbKOMcrVV59Rx3dlrn0ekrR2pTy57miCyeGRkPm0O0rFavrAH.m$$TrHR531QcWwroecEar4IjZPzVFeCimldr5AfQVsGU1VvzkymVbVAUIICoSIlqfhFVPyUWXXdfESAqAxJcGnVLsTKNSe7vniGT(-18992924), m$$LGLFak5nbFECYdITscFpInQHGvLyjB6pb6cOAakiO2zDGdLGYbKOMcrVV59Rx3dlrn0ekrR2pTy57miCyeGRkPm0O0rFavrAH.m$$TrHR531QcWwroecEar4IjZPzVFeCimldr5AfQVsGU1VvzkymVbVAUIICoSIlqfhFVPyUWXXdfESAqAxJcGnVLsTKNSe7vniGT(-18992924), false);
            callbackInfo.cancel();
        }
    }

    @Inject(method={"onVehicleMove"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;updatePositionAndAngles(DDDFF)V")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2692 class_26922, CallbackInfo callbackInfo, @Local class_1297 class_12972) {
        class_243 class_2432 = class_26922.comp_3347();
        m$$47intHn7pQnresgcjyBQNFrnG2bD6It91S8u1EoxsBu535T0LYjAaSqlAJUNjhygU6PE8KATWamVaUs9km1zRS5zfxULalLbb m$$47intHn7pQnresgcjyBQNFrnG2bD6It91S8u1EoxsBu535T0LYjAaSqlAJUNjhygU6PE8KATWamVaUs9km1zRS5zfxULalLbb = new m$$47intHn7pQnresgcjyBQNFrnG2bD6It91S8u1EoxsBu535T0LYjAaSqlAJUNjhygU6PE8KATWamVaUs9km1zRS5zfxULalLbb(class_2432);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$47intHn7pQnresgcjyBQNFrnG2bD6It91S8u1EoxsBu535T0LYjAaSqlAJUNjhygU6PE8KATWamVaUs9km1zRS5zfxULalLbb);
        if (m$$47intHn7pQnresgcjyBQNFrnG2bD6It91S8u1EoxsBu535T0LYjAaSqlAJUNjhygU6PE8KATWamVaUs9km1zRS5zfxULalLbb.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }
}

