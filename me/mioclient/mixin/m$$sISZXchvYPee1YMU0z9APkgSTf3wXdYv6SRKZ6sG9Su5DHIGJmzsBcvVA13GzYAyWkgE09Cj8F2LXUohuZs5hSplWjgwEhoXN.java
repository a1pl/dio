package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$QKLItOxhSKFN1fKKF0jqlSIiPHI5Y8z9XJRGeLHkK8Qd4WF4a08Xa1sxAys4sZyD2j8RLgbAaNtkwTJ80KpAxqnzJSbnCAgar;
import net.minecraft.class_2561;
import net.minecraft.class_418;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_418.class})
public class m$$sISZXchvYPee1YMU0z9APkgSTf3wXdYv6SRKZ6sG9Su5DHIGJmzsBcvVA13GzYAyWkgE09Cj8F2LXUohuZs5hSplWjgwEhoXN {
    private static m$$QKLItOxhSKFN1fKKF0jqlSIiPHI5Y8z9XJRGeLHkK8Qd4WF4a08Xa1sxAys4sZyD2j8RLgbAaNtkwTJ80KpAxqnzJSbnCAgar m$$nziqpqkcISpC8fxrLl4fuc0sNpcFmP6KIebZwq2VhTKMPJe3aAyBWuQXb3LiHRT9OxoKPbDHT8JTtDK2oj8khY8sYPWiMC57N = (m$$QKLItOxhSKFN1fKKF0jqlSIiPHI5Y8z9XJRGeLHkK8Qd4WF4a08Xa1sxAys4sZyD2j8RLgbAaNtkwTJ80KpAxqnzJSbnCAgar)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$QKLItOxhSKFN1fKKF0jqlSIiPHI5Y8z9XJRGeLHkK8Qd4WF4a08Xa1sxAys4sZyD2j8RLgbAaNtkwTJ80KpAxqnzJSbnCAgar.class);
    @Mutable
    @Shadow
    @Final
    private class_2561 field_2450;

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    public void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2561 class_25612, boolean bl, CallbackInfo callbackInfo) {
        if (m$$nziqpqkcISpC8fxrLl4fuc0sNpcFmP6KIebZwq2VhTKMPJe3aAyBWuQXb3LiHRT9OxoKPbDHT8JTtDK2oj8khY8sYPWiMC57N != null && m$$nziqpqkcISpC8fxrLl4fuc0sNpcFmP6KIebZwq2VhTKMPJe3aAyBWuQXb3LiHRT9OxoKPbDHT8JTtDK2oj8khY8sYPWiMC57N.isToggled()) {
            this.field_2450 = m$$nziqpqkcISpC8fxrLl4fuc0sNpcFmP6KIebZwq2VhTKMPJe3aAyBWuQXb3LiHRT9OxoKPbDHT8JTtDK2oj8khY8sYPWiMC57N.m$$AvqdUsHbZJWqAACK89PLlCRgwoMILSJ9WAp9rBl0GXpzzG0W3RrDkP8WqUHPUyFBO0yy2oR4qlQ0aMmfc7CyK265Kt1vv7RQw(1703013044);
        }
    }
}

