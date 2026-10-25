package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import me.mioclient.m$$42OWXSR5Yih6hneQ878uLJwwojSiZ4CkjtZQZgyVRHzCiXa9sCwQP7dciFOSRUPr1v3nLTEj5BTAKjvt5Wc67HcEnCeW9ZnkM;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import net.minecraft.class_1835;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_1835.class})
public class m$$cblqmEE1hcVmLJvHdYGNPtr8PgXRzl7NfP6bXzgd7JI2O5fcLN5mHP1p2z0mwdId0N7l4Bq088oBmf5CTb01ZOqXOHTfrKR0t {
    private static final m$$42OWXSR5Yih6hneQ878uLJwwojSiZ4CkjtZQZgyVRHzCiXa9sCwQP7dciFOSRUPr1v3nLTEj5BTAKjvt5Wc67HcEnCeW9ZnkM m$$0W63uHd1BeZ3Ygq8l2KNLd3s4Yl6J12tly650PmTzC0w3P9zhVfQkgI5z0jN3VZmflIHBAbr9QImLyUprqdftkw77L5HVCcQM = (m$$42OWXSR5Yih6hneQ878uLJwwojSiZ4CkjtZQZgyVRHzCiXa9sCwQP7dciFOSRUPr1v3nLTEj5BTAKjvt5Wc67HcEnCeW9ZnkM)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$42OWXSR5Yih6hneQ878uLJwwojSiZ4CkjtZQZgyVRHzCiXa9sCwQP7dciFOSRUPr1v3nLTEj5BTAKjvt5Wc67HcEnCeW9ZnkM.class);

    @ModifyExpressionValue(method={"onStoppedUsing"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;isTouchingWaterOrRain()Z")})
    private boolean m$$fIHJjiNpd5FbKFtiMTTHoTvq5ynbCGuLvof5U0yGEfvBR3Ktg9NLo5x0TXsHGIMYCNnNvySKTnJ90rPAostsVBFMSioVkQMh3(boolean bl) {
        return bl || m$$0W63uHd1BeZ3Ygq8l2KNLd3s4Yl6J12tly650PmTzC0w3P9zhVfQkgI5z0jN3VZmflIHBAbr9QImLyUprqdftkw77L5HVCcQM.m$$8CRT6HAHSZADDcKRDF1CloKb7HbzDutE1P7jgqLt5uehfMImANiJWxksjX6doOxnyMDuHCEbpqGN3xb16bPaxdvSM4V7yY9FO(1482484289);
    }

    @ModifyExpressionValue(method={"use"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;isTouchingWaterOrRain()Z")})
    private boolean m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x(boolean bl) {
        return bl || m$$0W63uHd1BeZ3Ygq8l2KNLd3s4Yl6J12tly650PmTzC0w3P9zhVfQkgI5z0jN3VZmflIHBAbr9QImLyUprqdftkw77L5HVCcQM.m$$8CRT6HAHSZADDcKRDF1CloKb7HbzDutE1P7jgqLt5uehfMImANiJWxksjX6doOxnyMDuHCEbpqGN3xb16bPaxdvSM4V7yY9FO(1482484289);
    }

    @ModifyArgs(method={"onStoppedUsing"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;addVelocity(DDD)V"))
    private void m$$yDK4FTzT0i2VDZNDh5GziSLpLFnovzLlp04OMlyk2IbrNPsl5ZAX8OxCoTUJrTJ1PmqFEP1mlK8KKb9bceSGkNjoKEghmz29t(Args args) {
        args.set(0, (Object)((Double)args.get(0) * (double)m$$0W63uHd1BeZ3Ygq8l2KNLd3s4Yl6J12tly650PmTzC0w3P9zhVfQkgI5z0jN3VZmflIHBAbr9QImLyUprqdftkw77L5HVCcQM.m$$xJwOkoukUhKKGOmcTSzDdSu8LW9jg2OAz7L7ce4yu7LFu6ZEX5CjNNUHnLZYCSKvYSvE80smohX6AGuGSf9GwpJM4XiRZzhVf(-948608455)));
        args.set(1, (Object)((Double)args.get(1) * (double)m$$0W63uHd1BeZ3Ygq8l2KNLd3s4Yl6J12tly650PmTzC0w3P9zhVfQkgI5z0jN3VZmflIHBAbr9QImLyUprqdftkw77L5HVCcQM.m$$xJwOkoukUhKKGOmcTSzDdSu8LW9jg2OAz7L7ce4yu7LFu6ZEX5CjNNUHnLZYCSKvYSvE80smohX6AGuGSf9GwpJM4XiRZzhVf(-948608455)));
        args.set(2, (Object)((Double)args.get(2) * (double)m$$0W63uHd1BeZ3Ygq8l2KNLd3s4Yl6J12tly650PmTzC0w3P9zhVfQkgI5z0jN3VZmflIHBAbr9QImLyUprqdftkw77L5HVCcQM.m$$xJwOkoukUhKKGOmcTSzDdSu8LW9jg2OAz7L7ce4yu7LFu6ZEX5CjNNUHnLZYCSKvYSvE80smohX6AGuGSf9GwpJM4XiRZzhVf(-948608455)));
    }

    @ModifyConstant(method={"onStoppedUsing"}, constant={@Constant(intValue=10)})
    private int m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL(int n) {
        if (m$$0W63uHd1BeZ3Ygq8l2KNLd3s4Yl6J12tly650PmTzC0w3P9zhVfQkgI5z0jN3VZmflIHBAbr9QImLyUprqdftkw77L5HVCcQM.isToggled()) {
            return 0;
        }
        return n;
    }
}

