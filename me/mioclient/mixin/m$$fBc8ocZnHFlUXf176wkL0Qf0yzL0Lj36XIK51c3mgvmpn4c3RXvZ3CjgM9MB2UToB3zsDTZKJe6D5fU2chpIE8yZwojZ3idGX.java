package me.mioclient.mixin;

import java.io.File;
import java.util.function.Consumer;
import me.mioclient.m$$6YtGSCnL6yFCmH9E2J2PQ6nRIh3TcWcKBrvRKP7hQWhPufaCIvOACnioXeKW4MwNbxprfyl6CloypMSWUqhOZVmUQs2PsbauM;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import net.minecraft.class_1011;
import net.minecraft.class_156;
import net.minecraft.class_318;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_318.class})
public class m$$fBc8ocZnHFlUXf176wkL0Qf0yzL0Lj36XIK51c3mgvmpn4c3RXvZ3CjgM9MB2UToB3zsDTZKJe6D5fU2chpIE8yZwojZ3idGX {
    private static m$$6YtGSCnL6yFCmH9E2J2PQ6nRIh3TcWcKBrvRKP7hQWhPufaCIvOACnioXeKW4MwNbxprfyl6CloypMSWUqhOZVmUQs2PsbauM m$$08cuMjQxoB9d8J2FISY4uE4gYNQl7GM6ejGCVDG4WKlrXTLzxYtL1f1UbUwgDi5CBozym28wBNsOfCjAPiJhGWABPhrg4ntdu = (m$$6YtGSCnL6yFCmH9E2J2PQ6nRIh3TcWcKBrvRKP7hQWhPufaCIvOACnioXeKW4MwNbxprfyl6CloypMSWUqhOZVmUQs2PsbauM)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$6YtGSCnL6yFCmH9E2J2PQ6nRIh3TcWcKBrvRKP7hQWhPufaCIvOACnioXeKW4MwNbxprfyl6CloypMSWUqhOZVmUQs2PsbauM.class);

    @Inject(method={"method_22691"}, at={@At(value="HEAD")}, cancellable=true)
    private static void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1011 class_10112, File file, Consumer consumer, CallbackInfo callbackInfo) {
        if (m$$08cuMjQxoB9d8J2FISY4uE4gYNQl7GM6ejGCVDG4WKlrXTLzxYtL1f1UbUwgDi5CBozym28wBNsOfCjAPiJhGWABPhrg4ntdu.isToggled()) {
            class_156.method_27958().execute(() -> m$$08cuMjQxoB9d8J2FISY4uE4gYNQl7GM6ejGCVDG4WKlrXTLzxYtL1f1UbUwgDi5CBozym28wBNsOfCjAPiJhGWABPhrg4ntdu.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_10112));
            if (m$$08cuMjQxoB9d8J2FISY4uE4gYNQl7GM6ejGCVDG4WKlrXTLzxYtL1f1UbUwgDi5CBozym28wBNsOfCjAPiJhGWABPhrg4ntdu.m$$FtbHz1rl89tuee0bxixPzqLUQ8gLpm07Mao73LIV60IJnwFjdKytqme87GaTovy697KAhdPVMELtJuA94fCGT8KA5hAVU8Qij(229563001)) {
                callbackInfo.cancel();
            }
        }
    }

    @ModifyVariable(method={"saveScreenshot(Ljava/io/File;Ljava/lang/String;Lnet/minecraft/client/gl/Framebuffer;Ljava/util/function/Consumer;)V"}, at=@At(value="HEAD"), ordinal=0, argsOnly=true)
    private static Consumer m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(Consumer consumer) {
        if (m$$08cuMjQxoB9d8J2FISY4uE4gYNQl7GM6ejGCVDG4WKlrXTLzxYtL1f1UbUwgDi5CBozym28wBNsOfCjAPiJhGWABPhrg4ntdu.isToggled() && !m$$08cuMjQxoB9d8J2FISY4uE4gYNQl7GM6ejGCVDG4WKlrXTLzxYtL1f1UbUwgDi5CBozym28wBNsOfCjAPiJhGWABPhrg4ntdu.m$$LBuVhq3LgB2SlKXYNLodmUj8UdXBLpC0qr8NGWmjhorIQtHTEhfWpMuoTrGBpDGQcs9RHfRVJDBN4GbLiFIX32pgYW0lNiGYt(-1502613073)) {
            return class_25612 -> {};
        }
        return consumer;
    }
}

