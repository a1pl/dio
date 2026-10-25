package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import java.awt.Color;
import java.util.function.Function;
import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45;
import me.mioclient.m$$qSKPLudNE0CMQXAKDlros2m4T9mWvOVMWZK9EXLZBb5woWSYuajlpo8HgQxO3B2DIJkGR3cEo9ne8PMQn9mTM9sdU01cwp4to;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_8002;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={class_8002.class})
public class m$$yjCVZcCt6yxJspwcDIRUm4MqtXo5JenJhw9IyMEm1YvWpRoXrc5iYsxSxqCGwLEBi4wQs4GB8itigwfqDQiAfifsxkmoSZmKL {
    private static final m$$qSKPLudNE0CMQXAKDlros2m4T9mWvOVMWZK9EXLZBb5woWSYuajlpo8HgQxO3B2DIJkGR3cEo9ne8PMQn9mTM9sdU01cwp4to m$$3wRZOIfpiitBMkot8wr5PhqBWOk7ToBQ6rSpiUjwPxdsli1dhnGUH4YAwKboPc4NgYO9MtyYGLCYQccASQmUpN5Ob46sK1Z5W = (m$$qSKPLudNE0CMQXAKDlros2m4T9mWvOVMWZK9EXLZBb5woWSYuajlpo8HgQxO3B2DIJkGR3cEo9ne8PMQn9mTM9sdU01cwp4to)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$qSKPLudNE0CMQXAKDlros2m4T9mWvOVMWZK9EXLZBb5woWSYuajlpo8HgQxO3B2DIJkGR3cEo9ne8PMQn9mTM9sdU01cwp4to.class);

    @WrapWithCondition(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawGuiTexture(Ljava/util/function/Function;Lnet/minecraft/util/Identifier;IIII)V", ordinal=1)})
    private static boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_332 class_3322, Function function, class_2960 class_29602, int n, int n2, int n3, int n4) {
        Color color = m$$3wRZOIfpiitBMkot8wr5PhqBWOk7ToBQ6rSpiUjwPxdsli1dhnGUH4YAwKboPc4NgYO9MtyYGLCYQccASQmUpN5Ob46sK1Z5W.m$$lbZeIWI9Nq5EhvMiScMED8aYnzep3s6QGg1n2mOvLOA5renWIbFbo66awxZggaloOvKQfUOQZTWUiHefpRLIkkOXPxA4Lidzy(1754026692);
        if (!m$$3wRZOIfpiitBMkot8wr5PhqBWOk7ToBQ6rSpiUjwPxdsli1dhnGUH4YAwKboPc4NgYO9MtyYGLCYQccASQmUpN5Ob46sK1Z5W.isToggled() || color == null) {
            return true;
        }
        class_3322.method_51452();
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((float)color.getRed() / 255.0f * 3.0f, (float)color.getGreen() / 255.0f * 3.0f, (float)color.getBlue() / 255.0f * 3.0f, 1.0f);
        class_3322.method_52706(m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45::m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW, class_29602, n, n2, n3, n4);
        class_3322.method_51452();
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(1.0f, 1.0f, 1.0f, 1.0f);
        return false;
    }
}

