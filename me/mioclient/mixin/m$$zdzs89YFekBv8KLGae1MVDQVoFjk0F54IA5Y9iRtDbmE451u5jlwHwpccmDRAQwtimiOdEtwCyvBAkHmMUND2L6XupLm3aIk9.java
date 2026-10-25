package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj;
import net.minecraft.class_332;
import net.minecraft.class_337;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_337.class})
public class m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9 {
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9 = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    private static final m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj m$$9vFcpqa5eflTL0srBkFm1bU8MypCAaM5v14ItjdillmOT6Gglf4WzP03KAcJZpQ9VHDpKjp1jdtAMWZogLj82wQy1haS76Knc = (m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj.class);

    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_332 class_3322, CallbackInfo callbackInfo) {
        if (m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9.isToggled() && ((Boolean)me.mioclient.mixin.m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9.m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9.m$$0rO2qukI60HrtcheJ0l9VKjq4uSW8CIQO8pLIa869OfzJCUJeVdQY7SB1EAaQ3nrnZWvZy6EyMs1Z1CPHmkyQ6Re9I5D7C9yg.getValue()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"shouldDarkenSky"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$C7jwyCZGOGmxYHR6CinqHYKGpwwojfCUt8uyzjRA2awICUF3ogkSBtJt9OZZ5TwdqY7XMH0WNbqisrPkOMONx1NLAAWZsoOL0(CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9.isToggled() && ((Boolean)me.mioclient.mixin.m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9.m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9.m$$0rO2qukI60HrtcheJ0l9VKjq4uSW8CIQO8pLIa869OfzJCUJeVdQY7SB1EAaQ3nrnZWvZy6EyMs1Z1CPHmkyQ6Re9I5D7C9yg.getValue()).booleanValue() || m$$9vFcpqa5eflTL0srBkFm1bU8MypCAaM5v14ItjdillmOT6Gglf4WzP03KAcJZpQ9VHDpKjp1jdtAMWZogLj82wQy1haS76Knc.isToggled() && m$$9vFcpqa5eflTL0srBkFm1bU8MypCAaM5v14ItjdillmOT6Gglf4WzP03KAcJZpQ9VHDpKjp1jdtAMWZogLj82wQy1haS76Knc.m$$zU3wePhNR4gmSuXzKZZl8MJPvE75SFwu6DM1S0RmUS6TFJv4yFXEX74euvRKlwnmPQogu0iOp00I9KMyOosXY4mmfFK8Z2FPf(711981443)) {
            callbackInfoReturnable.setReturnValue((Object)false);
            callbackInfoReturnable.cancel();
        }
    }
}

