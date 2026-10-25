package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import java.awt.Color;
import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8;
import net.minecraft.class_332;
import net.minecraft.class_342;
import net.minecraft.class_4587;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_342.class})
public class m$$xR8fdWn9zYGJGIHZIUIJhKbIk8c0QGJQMjQcLsIVzBu9Lpf57BNW0GIQjau7wmHiviCAXCxhuU3JHuWhCEjs1fzwzy2HlZvAZ {
    private class_4587 m$$LTZ2wgJIvYPUOPJqRPKqew7InjIQBH2aprc6FBjW2C3JLyvQHyZlAeS7GEX4DxSDNUNGmX74rHDG2vqz8XvpHwYHNYqRKVHFQ;

    @Inject(method={"renderWidget"}, at={@At(value="HEAD")})
    public void m$$To3vhJ3WNHdOvPenZy6hBvuDgvoeXq6w8509uDqfBHJUZabEDFnEF0ubsZKnh9UBXReXrwigjnISrN3BxsODfNDDLhjE5DEVb(class_332 class_3322, int n, int n2, float f, CallbackInfo callbackInfo) {
        this.m$$LTZ2wgJIvYPUOPJqRPKqew7InjIQBH2aprc6FBjW2C3JLyvQHyZlAeS7GEX4DxSDNUNGmX74rHDG2vqz8XvpHwYHNYqRKVHFQ = class_3322.method_51448();
    }

    @ModifyExpressionValue(method={"renderWidget"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/widget/TextFieldWidget;drawsBackground()Z", ordinal=0)})
    public boolean m$$Bt2WCJQeHB4TyQsfZ992xBi26LbuV49cmrW6MFWw9l1Egjv10qEiHq87PKmGfmR1VNpWkJ6EsNCj7kXVm13P8hfE82mIMwLjf(boolean bl) {
        class_342 class_3422 = (class_342)this;
        if (class_3422 == m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$lqzJeHL7FKMPUNnLxhiX8btidr1azeFdVcgoNpYsgtzjLy3rFMz6rzZS7Z9gSjzEP58ql1fg3RV0nwXJguKBFlZHftmlARxwZ) {
            int n = class_3422.method_46426() - 1;
            int n2 = class_3422.method_46427() - 1;
            int n3 = class_3422.method_25368() + 1;
            int n4 = class_3422.method_25364() + 1;
            m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$zk9yJWy8Cs7ANpEvtMQRvXlCNCRZxhr8NIJq4X4tBdUww03OfaeRoPvEO3Lsg2nQnPW0c4J89vLKpg6dBYgD5lOlMLOn22lUv.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$LTZ2wgJIvYPUOPJqRPKqew7InjIQBH2aprc6FBjW2C3JLyvQHyZlAeS7GEX4DxSDNUNGmX74rHDG2vqz8XvpHwYHNYqRKVHFQ, (float)n, (float)n2, (float)(n + n3), (float)(n2 + n4), new Color(135, 135, 135, 255).getRGB());
            m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$zk9yJWy8Cs7ANpEvtMQRvXlCNCRZxhr8NIJq4X4tBdUww03OfaeRoPvEO3Lsg2nQnPW0c4J89vLKpg6dBYgD5lOlMLOn22lUv.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$LTZ2wgJIvYPUOPJqRPKqew7InjIQBH2aprc6FBjW2C3JLyvQHyZlAeS7GEX4DxSDNUNGmX74rHDG2vqz8XvpHwYHNYqRKVHFQ, (float)n, (float)n2, (float)(n + n3 - 1), (float)(n2 + 1), new Color(85, 85, 85, 255).getRGB());
            m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$zk9yJWy8Cs7ANpEvtMQRvXlCNCRZxhr8NIJq4X4tBdUww03OfaeRoPvEO3Lsg2nQnPW0c4J89vLKpg6dBYgD5lOlMLOn22lUv.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$LTZ2wgJIvYPUOPJqRPKqew7InjIQBH2aprc6FBjW2C3JLyvQHyZlAeS7GEX4DxSDNUNGmX74rHDG2vqz8XvpHwYHNYqRKVHFQ, (float)n, (float)n2, (float)(n + 1), (float)(n2 + n4 - 1), new Color(85, 85, 85, 255).getRGB());
            m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$zk9yJWy8Cs7ANpEvtMQRvXlCNCRZxhr8NIJq4X4tBdUww03OfaeRoPvEO3Lsg2nQnPW0c4J89vLKpg6dBYgD5lOlMLOn22lUv.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$LTZ2wgJIvYPUOPJqRPKqew7InjIQBH2aprc6FBjW2C3JLyvQHyZlAeS7GEX4DxSDNUNGmX74rHDG2vqz8XvpHwYHNYqRKVHFQ, (float)(n + 1), (float)(n2 + n4 - 1), (float)(n + n3 - 1), (float)(n2 + n4), -1);
            m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$zk9yJWy8Cs7ANpEvtMQRvXlCNCRZxhr8NIJq4X4tBdUww03OfaeRoPvEO3Lsg2nQnPW0c4J89vLKpg6dBYgD5lOlMLOn22lUv.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$LTZ2wgJIvYPUOPJqRPKqew7InjIQBH2aprc6FBjW2C3JLyvQHyZlAeS7GEX4DxSDNUNGmX74rHDG2vqz8XvpHwYHNYqRKVHFQ, (float)(n + n3 - 1), (float)(n2 + 1), (float)(n + n3), (float)(n2 + n4), -1);
            return false;
        }
        return bl;
    }
}

