package me.mioclient.mixin;

import java.util.List;
import me.mioclient.m$$jcKf9e8ZKbRbtG4fejguzjnQPOLE2P0AhgAiwwxdhNs0kuZVO814jJ8GSn4gU8EUh88Og81Fl1HzogjfgmmEK4tTKaJnQK9Qb;
import net.minecraft.class_1920;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_778;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_778.class})
public class m$$fR6eEarIPxvybR1zV4KkcbhQRgMmTBM3M3Em5rMRZPJBe6vWUTmeR70l4mHSeN304bm1lz8s4uMydpwWnakD21Fe6wibSyEN1 {
    @Inject(method={"renderSmooth", "renderFlat"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1920 class_19202, List list, class_2680 class_26802, class_2338 class_23382, class_4587 class_45872, class_4588 class_45882, boolean bl, int n, CallbackInfo callbackInfo) {
        if (m$$jcKf9e8ZKbRbtG4fejguzjnQPOLE2P0AhgAiwwxdhNs0kuZVO814jJ8GSn4gU8EUh88Og81Fl1HzogjfgmmEK4tTKaJnQK9Qb.m$$LbBbHK0KTD1lNcnreKhT7Pg7lO2M4fmadW2B2FgiHxDuegM3prPJUJmjhr8rxBmUyBuEq0ceZTupnzoiDAfqwWd5h6LJYiD7n(1647008851).isToggled() && !m$$jcKf9e8ZKbRbtG4fejguzjnQPOLE2P0AhgAiwwxdhNs0kuZVO814jJ8GSn4gU8EUh88Og81Fl1HzogjfgmmEK4tTKaJnQK9Qb.m$$LbBbHK0KTD1lNcnreKhT7Pg7lO2M4fmadW2B2FgiHxDuegM3prPJUJmjhr8rxBmUyBuEq0ceZTupnzoiDAfqwWd5h6LJYiD7n(1647008851).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_23382, class_26802.method_26204())) {
            callbackInfo.cancel();
        }
    }
}

