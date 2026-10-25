package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import java.awt.Color;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN;
import net.minecraft.class_10186;
import net.minecraft.class_10197;
import net.minecraft.class_1799;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_3879;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_5321;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_10197.class})
public class m$$9lGG9WYzVF2yt0GJdbVwfVXPUedl4C0LlAOAJTX1wiHk50HGeayDzsixIAgcxZO7ykBLYENudqLwh0agpq77ICuaWCkA5zEME {
    @Unique
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$9vbTFJerlvcXWS73AGXSiHW3CqUHF9KEmBuQASCbJJrsTDUX2VzhFsGtNxg64vcVOKMR6PzEwZWY1NKBAgWIMvN6utUze16C3 = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    @Unique
    private class_10186.class_10190 m$$gfNr3CiZiDjM6C9Dr0poKuxAtlKUotV73RoBkMR1HzpeuELQFwKujESpRa62A5zUM1p22TON1uywt9tUnfx9N273v64avm0G0;

    @Inject(method={"render(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$LayerType;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/client/model/Model;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Identifier;)V"}, at={@At(value="HEAD")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_10186.class_10190 class_101902, class_5321 class_53212, class_3879 class_38792, class_1799 class_17992, class_4587 class_45872, class_4597 class_45972, int n, class_2960 class_29602, CallbackInfo callbackInfo) {
        this.m$$gfNr3CiZiDjM6C9Dr0poKuxAtlKUotV73RoBkMR1HzpeuELQFwKujESpRa62A5zUM1p22TON1uywt9tUnfx9N273v64avm0G0 = class_101902;
    }

    @ModifyArgs(method={"render(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$LayerType;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/client/model/Model;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Identifier;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/model/Model;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"))
    private void m$$a8nwcIEz33qkF56tQDYbl9rprqGd3Tsn4GoVo2pwzYrCRocxTQNsPP2ZDLImj5yUznS6ZqjdgoLbaTpHDaufClBvXzXoNsQlo(Args args) {
        if (this.m$$C7jwyCZGOGmxYHR6CinqHYKGpwwojfCUt8uyzjRA2awICUF3ogkSBtJt9OZZ5TwdqY7XMH0WNbqisrPkOMONx1NLAAWZsoOL0()) {
            return;
        }
        Color color = new Color((Integer)args.get(4));
        float f = m$$9vbTFJerlvcXWS73AGXSiHW3CqUHF9KEmBuQASCbJJrsTDUX2VzhFsGtNxg64vcVOKMR6PzEwZWY1NKBAgWIMvN6utUze16C3.m$$U1Q9B9uo6gt06X3NAAJVVbyKBPnygd3jLibTRyFvPpZ1ntDxIcUt3sLBnadFJx5UsJADllIUsCS1UsxWw2360egsnJIMTdDue(-1531561833) * m$$9vbTFJerlvcXWS73AGXSiHW3CqUHF9KEmBuQASCbJJrsTDUX2VzhFsGtNxg64vcVOKMR6PzEwZWY1NKBAgWIMvN6utUze16C3.m$$wK20vt7lib6X4QXpPNYokVs6bL87PhV6BypnsmV71xcQeejSIovO5l8dVkSxOW8kcSyG8X9hsvxZaRT1mTrnijgOIFcwGmcTv(-1931073786);
        args.set(4, (Object)m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(color, f).hashCode());
    }

    @ModifyExpressionValue(method={"render(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$LayerType;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/client/model/Model;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Identifier;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/RenderLayer;getArmorCutoutNoCull(Lnet/minecraft/util/Identifier;)Lnet/minecraft/client/render/RenderLayer;")})
    private class_1921 m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1921 class_19212, @Local(ordinal=1) class_2960 class_29602) {
        if (this.m$$C7jwyCZGOGmxYHR6CinqHYKGpwwojfCUt8uyzjRA2awICUF3ogkSBtJt9OZZ5TwdqY7XMH0WNbqisrPkOMONx1NLAAWZsoOL0()) {
            return class_19212;
        }
        float f = m$$9vbTFJerlvcXWS73AGXSiHW3CqUHF9KEmBuQASCbJJrsTDUX2VzhFsGtNxg64vcVOKMR6PzEwZWY1NKBAgWIMvN6utUze16C3.m$$U1Q9B9uo6gt06X3NAAJVVbyKBPnygd3jLibTRyFvPpZ1ntDxIcUt3sLBnadFJx5UsJADllIUsCS1UsxWw2360egsnJIMTdDue(-1531561833) * m$$9vbTFJerlvcXWS73AGXSiHW3CqUHF9KEmBuQASCbJJrsTDUX2VzhFsGtNxg64vcVOKMR6PzEwZWY1NKBAgWIMvN6utUze16C3.m$$wK20vt7lib6X4QXpPNYokVs6bL87PhV6BypnsmV71xcQeejSIovO5l8dVkSxOW8kcSyG8X9hsvxZaRT1mTrnijgOIFcwGmcTv(-1931073786);
        if (f == 1.0f) {
            return class_19212;
        }
        return class_1921.method_23580((class_2960)class_29602);
    }

    @ModifyExpressionValue(method={"render(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$LayerType;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/client/model/Model;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Identifier;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/item/ItemStack;get(Lnet/minecraft/component/ComponentType;)Ljava/lang/Object;")})
    private Object m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(Object object) {
        if (m$$9vbTFJerlvcXWS73AGXSiHW3CqUHF9KEmBuQASCbJJrsTDUX2VzhFsGtNxg64vcVOKMR6PzEwZWY1NKBAgWIMvN6utUze16C3.isToggled() && ((Boolean)m$$9lGG9WYzVF2yt0GJdbVwfVXPUedl4C0LlAOAJTX1wiHk50HGeayDzsixIAgcxZO7ykBLYENudqLwh0agpq77ICuaWCkA5zEME.m$$9vbTFJerlvcXWS73AGXSiHW3CqUHF9KEmBuQASCbJJrsTDUX2VzhFsGtNxg64vcVOKMR6PzEwZWY1NKBAgWIMvN6utUze16C3.m$$XFmJe3wnxKzfPWjEo7O0eCtfnJRX25WBilSlUA8rUAw9jElATcpk1o8Fk2zIzr3AuZw2Ton3qnNIesUA0drfdzijVyd0XwAiY.getValue()).booleanValue()) {
            return null;
        }
        return object;
    }

    @Unique
    private boolean m$$C7jwyCZGOGmxYHR6CinqHYKGpwwojfCUt8uyzjRA2awICUF3ogkSBtJt9OZZ5TwdqY7XMH0WNbqisrPkOMONx1NLAAWZsoOL0() {
        if (this.m$$gfNr3CiZiDjM6C9Dr0poKuxAtlKUotV73RoBkMR1HzpeuELQFwKujESpRa62A5zUM1p22TON1uywt9tUnfx9N273v64avm0G0 == null) {
            return false;
        }
        return this.m$$gfNr3CiZiDjM6C9Dr0poKuxAtlKUotV73RoBkMR1HzpeuELQFwKujESpRa62A5zUM1p22TON1uywt9tUnfx9N273v64avm0G0 == class_10186.class_10190.field_54127;
    }
}

