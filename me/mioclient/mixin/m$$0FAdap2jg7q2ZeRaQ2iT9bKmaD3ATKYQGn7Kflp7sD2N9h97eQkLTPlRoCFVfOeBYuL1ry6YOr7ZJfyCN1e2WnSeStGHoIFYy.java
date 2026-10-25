package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$J9D4TqnFiml8HyBRc6s3OsS2VRbx3r9TVIkHLvy6c7cXdv1Qhdcpl43sfEvKwYdXD0JV6ekWAF0Tl50fpknbiOqPNP9Ddp9gj;
import me.mioclient.m$$Sa9EL6x1Z9Ql7bo36MeQFajuM94KyzDMfXUXVs4dWApHaRVWxAcRnYD1iRGv2o9XopoaJ0Ja6zJqvtysSRryk9tfO32Fqz1Cg;
import net.minecraft.class_1747;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2404;
import net.minecraft.class_243;
import net.minecraft.class_259;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_2404.class})
public class m$$0FAdap2jg7q2ZeRaQ2iT9bKmaD3ATKYQGn7Kflp7sD2N9h97eQkLTPlRoCFVfOeBYuL1ry6YOr7ZJfyCN1e2WnSeStGHoIFYy {
    private static m$$Sa9EL6x1Z9Ql7bo36MeQFajuM94KyzDMfXUXVs4dWApHaRVWxAcRnYD1iRGv2o9XopoaJ0Ja6zJqvtysSRryk9tfO32Fqz1Cg reach = (m$$Sa9EL6x1Z9Ql7bo36MeQFajuM94KyzDMfXUXVs4dWApHaRVWxAcRnYD1iRGv2o9XopoaJ0Ja6zJqvtysSRryk9tfO32Fqz1Cg)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$Sa9EL6x1Z9Ql7bo36MeQFajuM94KyzDMfXUXVs4dWApHaRVWxAcRnYD1iRGv2o9XopoaJ0Ja6zJqvtysSRryk9tfO32Fqz1Cg.class);

    @Inject(method={"getOutlineShape"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2680 class_26802, class_1922 class_19222, class_2338 class_23382, class_3726 class_37262, CallbackInfoReturnable callbackInfoReturnable) {
        class_310 class_3102 = class_310.method_1551();
        if (reach.isToggled() && ((Boolean)m$$0FAdap2jg7q2ZeRaQ2iT9bKmaD3ATKYQGn7Kflp7sD2N9h97eQkLTPlRoCFVfOeBYuL1ry6YOr7ZJfyCN1e2WnSeStGHoIFYy.reach.m$$7nd7AUkh0bCo79PfWSs68OOMNSsMIBvWML7ZrCZqXOPEgFi6GpshFZQtspcZZEF3gG1JOIJlweQP3nYpip3BdtLC1HHZ2aqqk.getValue()).booleanValue() && (class_3102.field_1724.method_6047().method_7909() instanceof class_1747 || class_3102.field_1724.method_6079().method_7909() instanceof class_1747)) {
            boolean bl = false;
            for (class_2350 class_23502 : class_2350.values()) {
                if (!class_19222.method_8320(class_23382.method_10093(class_23502)).method_26215()) continue;
                bl = true;
                break;
            }
            class_238 class_2383 = new class_238(class_23382);
            class_243 class_2432 = class_310.method_1551().field_1773.method_19418().method_19326();
            class_243 class_2433 = m$$J9D4TqnFiml8HyBRc6s3OsS2VRbx3r9TVIkHLvy6c7cXdv1Qhdcpl43sfEvKwYdXD0JV6ekWAF0Tl50fpknbiOqPNP9Ddp9gj.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_2432.method_1021(-1.0), class_2383, -1698367464);
            double d = class_2433.method_1025(class_2432);
            if (class_2383.method_1006(class_2432)) {
                return;
            }
            if (d < (double)(((Float)m$$0FAdap2jg7q2ZeRaQ2iT9bKmaD3ATKYQGn7Kflp7sD2N9h97eQkLTPlRoCFVfOeBYuL1ry6YOr7ZJfyCN1e2WnSeStGHoIFYy.reach.m$$AWSXdzEcwmycYJOgN1dcDFhFCu9RVljNZAdPI8FFn2m4VSZedtxzuxtRHeeLV8NgQ2LBNdJg9GXa9N2Ucixg2ZFeeGqd1sF5m.getValue()).floatValue() * ((Float)m$$0FAdap2jg7q2ZeRaQ2iT9bKmaD3ATKYQGn7Kflp7sD2N9h97eQkLTPlRoCFVfOeBYuL1ry6YOr7ZJfyCN1e2WnSeStGHoIFYy.reach.m$$AWSXdzEcwmycYJOgN1dcDFhFCu9RVljNZAdPI8FFn2m4VSZedtxzuxtRHeeLV8NgQ2LBNdJg9GXa9N2Ucixg2ZFeeGqd1sF5m.getValue()).floatValue()) && !bl) {
                return;
            }
            callbackInfoReturnable.setReturnValue((Object)class_259.method_1077());
            callbackInfoReturnable.cancel();
        }
    }
}

