package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv;
import me.mioclient.m$$jcKf9e8ZKbRbtG4fejguzjnQPOLE2P0AhgAiwwxdhNs0kuZVO814jJ8GSn4gU8EUh88Og81Fl1HzogjfgmmEK4tTKaJnQK9Qb;
import net.minecraft.class_2338;
import net.minecraft.class_852;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_852.class})
public class m$$O9moVzDFftN5fRrs8mFeaispr2yW59EvwjyNQ4XMz90mYxUR017bEu7UaiqSOBcQMeVzS2x7KPBEzxFG12JkV7LnelYHuu0Bu {
    private static m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv freecam = (m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv.class);

    @Inject(method={"markClosed"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2338 class_23382, CallbackInfo callbackInfo) {
        if (m$$jcKf9e8ZKbRbtG4fejguzjnQPOLE2P0AhgAiwwxdhNs0kuZVO814jJ8GSn4gU8EUh88Og81Fl1HzogjfgmmEK4tTKaJnQK9Qb.m$$LbBbHK0KTD1lNcnreKhT7Pg7lO2M4fmadW2B2FgiHxDuegM3prPJUJmjhr8rxBmUyBuEq0ceZTupnzoiDAfqwWd5h6LJYiD7n(1647008851).isToggled() || freecam.isToggled()) {
            callbackInfo.cancel();
        }
    }
}

