package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import net.minecraft.class_379;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_379.class})
public interface m$$9W1PyZ9oPpdD08Uwy238j1iZ3I7C9XOBTTMWLtDOlbpAoaEvC8I37FQysx5i45SKsXkUApfKzWMyNwMwig8PrUwbaiyWwS1BS {
    @Inject(method={"getShadowOffset"}, at={@At(value="HEAD")}, cancellable=true)
    default public void m$$KgsA96MC4T4eH6W0XsD6gEUJxCz5GU4uazh6mqzZZEg5IcvKpdzsTNWdlxDRqzB2X3Og2j3TkDMOzEdzjRLwJz0tDZCIQJ5av(CallbackInfoReturnable callbackInfoReturnable) {
        m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$pjpeQua4PAB6Zbpcv5B1EK6PACkuUkszPZ6igJ4EheKtCpGOS5rhssN6LeWpAJuyJeZRtolTY1xU3jouBuH7hlh4UdEG0zCIQ.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
        if (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.isToggled() && ((Boolean)m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.m$$02LkEZbyHet6qJxCQS7OxoOv8djPl12kdHXPtnLBEk9XfmKr2oKOJ2FgND7evPEQVnbf3K7Zs5nRKVgiUlVM5kuQQJAKflHMF.getValue()).booleanValue()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.6f));
        } else {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(1.0f));
        }
    }
}

