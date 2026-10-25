package me.mioclient.mixin;

import me.mioclient.m$$jcKf9e8ZKbRbtG4fejguzjnQPOLE2P0AhgAiwwxdhNs0kuZVO814jJ8GSn4gU8EUh88Og81Fl1HzogjfgmmEK4tTKaJnQK9Qb;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_4970;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_4970.class_4971.class})
public class m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S {
    @Inject(method={"getAmbientOcclusionLightLevel"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1922 class_19222, class_2338 class_23382, CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$jcKf9e8ZKbRbtG4fejguzjnQPOLE2P0AhgAiwwxdhNs0kuZVO814jJ8GSn4gU8EUh88Og81Fl1HzogjfgmmEK4tTKaJnQK9Qb.m$$LbBbHK0KTD1lNcnreKhT7Pg7lO2M4fmadW2B2FgiHxDuegM3prPJUJmjhr8rxBmUyBuEq0ceZTupnzoiDAfqwWd5h6LJYiD7n(1647008851).isToggled()) {
            callbackInfoReturnable.cancel();
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(1.0f));
        }
    }
}

