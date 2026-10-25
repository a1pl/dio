package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import net.minecraft.class_10090;
import net.minecraft.class_330;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_330.class})
public class m$$BafPcD8AyD2MxXCHArfiCLTbqv9N7335ridGEjFLST2cJfkaaIo7O1bdEHqK9N48w9lm81dN53DiMQHFEc1fhjD2qvi4sfOxS {
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$ffyF2sIwahbr8mRvOeFhNtfgCohG6tjkYNqlOpTENSV71htzXs6ySYH6tIUNV11IIPhqEQh10X6hq5euDnL6I1PLPg0bXGtdQ = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);

    @Inject(method={"draw"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_10090 class_100902, class_4587 class_45872, class_4597 class_45972, boolean bl, int n, CallbackInfo callbackInfo) {
        if (m$$ffyF2sIwahbr8mRvOeFhNtfgCohG6tjkYNqlOpTENSV71htzXs6ySYH6tIUNV11IIPhqEQh10X6hq5euDnL6I1PLPg0bXGtdQ.m$$TdOLoj1tMyuVfco7bU1q9mdFuRbGZMriVhPgEPdql13meCyVJKhWC4E5uz2ApRFZtH6VZj0pcYJ6m3pbPJJqgBFiBcHwy6kSu(-190570007)) {
            callbackInfo.cancel();
        }
    }
}

