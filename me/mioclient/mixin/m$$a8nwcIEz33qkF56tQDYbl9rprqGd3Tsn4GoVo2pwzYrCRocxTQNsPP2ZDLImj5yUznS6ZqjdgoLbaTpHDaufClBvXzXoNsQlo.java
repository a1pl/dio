package me.mioclient.mixin;

import me.mioclient.m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$jcKf9e8ZKbRbtG4fejguzjnQPOLE2P0AhgAiwwxdhNs0kuZVO814jJ8GSn4gU8EUh88Og81Fl1HzogjfgmmEK4tTKaJnQK9Qb;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_2248.class})
public class m$$a8nwcIEz33qkF56tQDYbl9rprqGd3Tsn4GoVo2pwzYrCRocxTQNsPP2ZDLImj5yUznS6ZqjdgoLbaTpHDaufClBvXzXoNsQlo {
    private static m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb noslow = (m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb.class);

    @Inject(method={"shouldDrawSide"}, at={@At(value="HEAD")}, cancellable=true)
    private static void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2680 class_26802, class_2680 class_26803, class_2350 class_23502, CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$jcKf9e8ZKbRbtG4fejguzjnQPOLE2P0AhgAiwwxdhNs0kuZVO814jJ8GSn4gU8EUh88Og81Fl1HzogjfgmmEK4tTKaJnQK9Qb.m$$LbBbHK0KTD1lNcnreKhT7Pg7lO2M4fmadW2B2FgiHxDuegM3prPJUJmjhr8rxBmUyBuEq0ceZTupnzoiDAfqwWd5h6LJYiD7n(1647008851).isToggled()) {
            callbackInfoReturnable.cancel();
            callbackInfoReturnable.setReturnValue((Object)m$$jcKf9e8ZKbRbtG4fejguzjnQPOLE2P0AhgAiwwxdhNs0kuZVO814jJ8GSn4gU8EUh88Og81Fl1HzogjfgmmEK4tTKaJnQK9Qb.m$$LbBbHK0KTD1lNcnreKhT7Pg7lO2M4fmadW2B2FgiHxDuegM3prPJUJmjhr8rxBmUyBuEq0ceZTupnzoiDAfqwWd5h6LJYiD7n(1647008851).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2338.field_10980, class_26802.method_26204()));
        }
    }

    @Inject(method={"getSlipperiness"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(CallbackInfoReturnable callbackInfoReturnable) {
        if (noslow.isToggled()) {
            class_2248 class_22482 = (class_2248)this;
            if (((Boolean)m$$a8nwcIEz33qkF56tQDYbl9rprqGd3Tsn4GoVo2pwzYrCRocxTQNsPP2ZDLImj5yUznS6ZqjdgoLbaTpHDaufClBvXzXoNsQlo.noslow.m$$QyjDsYQwByOzxHQcXz6lhZJeqfC9KDo4o4aGScTT1fBUrMDpTvGus1ItO5Z5ExB4asApGNk8IDuKs64CriKMO5JhebIkecay6.getValue()).booleanValue() && (class_22482 == class_2246.field_10295 || class_22482 == class_2246.field_10225 || class_22482 == class_2246.field_10384)) {
                callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.6f));
            }
            if (((Boolean)m$$a8nwcIEz33qkF56tQDYbl9rprqGd3Tsn4GoVo2pwzYrCRocxTQNsPP2ZDLImj5yUznS6ZqjdgoLbaTpHDaufClBvXzXoNsQlo.noslow.m$$uWrKirUiLnTKAUBqNVfYd6g4zsI0vcaNCGZV7xwcqHMP58vCRROIdkQ3fHCG1vIvleCYO8QPPR7krBQZPB7KMEoqENUplHT2s.getValue()).booleanValue() && class_22482 == class_2246.field_10030) {
                callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.6f));
            }
            if (((Boolean)m$$a8nwcIEz33qkF56tQDYbl9rprqGd3Tsn4GoVo2pwzYrCRocxTQNsPP2ZDLImj5yUznS6ZqjdgoLbaTpHDaufClBvXzXoNsQlo.noslow.m$$3xKxwWz1pZMqSOJvYIKAoHB2gKXYRK30ZNXs4pF7v18ACkGxnANm3S5uMEsp9nZajAbw1LwTFZOuMInG1jJy5RUhGIFum2dl7.getValue()).booleanValue() && class_22482 == class_2246.field_21211) {
                callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.6f));
            }
        }
    }
}

