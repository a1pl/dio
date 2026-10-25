package me.mioclient.mixin;

import java.awt.Color;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$VQeBiYQFF92st4KpYnl7JJZWvgzGjBP4Dd9SFTh4QWYtzxAIcX5Qp3MUZowrwkKm0ljNF9ZAlkex9P3KyEVeoeW2idm8qJEa8;
import me.mioclient.m$$cFy0S2bS7U2m7bzc3O5IB0USk2GXplPOWMwkPbtlcMqUPwZdqWrImGD45wOTIHxHoiuNbH5qx8JEe1cGK4OtWr7Feso78ZhRo;
import net.minecraft.class_10041;
import net.minecraft.class_1538;
import net.minecraft.class_919;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_919.class})
public final class m$$JCDqBI1tV8LshiexopvdlS4qtAdze1vKYofHIuiW7yp0DNcKtsqbxbQXGLrJaRhmOVrygCB2CgXkRgiKUgEEmvhdlDb9i6Tbz {
    private static final m$$cFy0S2bS7U2m7bzc3O5IB0USk2GXplPOWMwkPbtlcMqUPwZdqWrImGD45wOTIHxHoiuNbH5qx8JEe1cGK4OtWr7Feso78ZhRo m$$xbVJWJOyjNr1BqadTIPOYNPG0Ttk7J3TnKteY6lg3Yps6IVpMUgLI35MB9uKbW9C09IdVqtjYzpHOIWEt4DTTb0iVOZKnlcHx = (m$$cFy0S2bS7U2m7bzc3O5IB0USk2GXplPOWMwkPbtlcMqUPwZdqWrImGD45wOTIHxHoiuNbH5qx8JEe1cGK4OtWr7Feso78ZhRo)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$cFy0S2bS7U2m7bzc3O5IB0USk2GXplPOWMwkPbtlcMqUPwZdqWrImGD45wOTIHxHoiuNbH5qx8JEe1cGK4OtWr7Feso78ZhRo.class);
    @Unique
    private static class_1538 m$$pMxhF1goXxE8bmgzembjphp2ukq3bvQ8eKEaniFnPERmudxeO9UWGC8DQilhGbGwMl1Z8fqu6KwefmVHOxS5q54XFygC3PSwX;

    @Inject(method={"updateRenderState(Lnet/minecraft/entity/LightningEntity;Lnet/minecraft/client/render/entity/state/LightningEntityRenderState;F)V"}, at={@At(value="HEAD")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1538 class_15382, class_10041 class_100412, float f, CallbackInfo callbackInfo) {
        m$$pMxhF1goXxE8bmgzembjphp2ukq3bvQ8eKEaniFnPERmudxeO9UWGC8DQilhGbGwMl1Z8fqu6KwefmVHOxS5q54XFygC3PSwX = class_15382;
    }

    @ModifyArgs(method={"drawBranch"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/VertexConsumer;color(FFFF)Lnet/minecraft/client/render/VertexConsumer;"))
    private static void m$$fIHJjiNpd5FbKFtiMTTHoTvq5ynbCGuLvof5U0yGEfvBR3Ktg9NLo5x0TXsHGIMYCNnNvySKTnJ90rPAostsVBFMSioVkQMh3(Args args) {
        if (m$$pMxhF1goXxE8bmgzembjphp2ukq3bvQ8eKEaniFnPERmudxeO9UWGC8DQilhGbGwMl1Z8fqu6KwefmVHOxS5q54XFygC3PSwX == null) {
            return;
        }
        if (((m$$VQeBiYQFF92st4KpYnl7JJZWvgzGjBP4Dd9SFTh4QWYtzxAIcX5Qp3MUZowrwkKm0ljNF9ZAlkex9P3KyEVeoeW2idm8qJEa8)m$$pMxhF1goXxE8bmgzembjphp2ukq3bvQ8eKEaniFnPERmudxeO9UWGC8DQilhGbGwMl1Z8fqu6KwefmVHOxS5q54XFygC3PSwX).mio$isClient() && m$$xbVJWJOyjNr1BqadTIPOYNPG0Ttk7J3TnKteY6lg3Yps6IVpMUgLI35MB9uKbW9C09IdVqtjYzpHOIWEt4DTTb0iVOZKnlcHx.isToggled() && ((Boolean)m$$JCDqBI1tV8LshiexopvdlS4qtAdze1vKYofHIuiW7yp0DNcKtsqbxbQXGLrJaRhmOVrygCB2CgXkRgiKUgEEmvhdlDb9i6Tbz.m$$xbVJWJOyjNr1BqadTIPOYNPG0Ttk7J3TnKteY6lg3Yps6IVpMUgLI35MB9uKbW9C09IdVqtjYzpHOIWEt4DTTb0iVOZKnlcHx.m$$WxK9iIPaELgaSeZP0b3sp7BfNlK1xpodmnkM2lz0mFNqbxgNOvgZUz29trB7ukMp9wBO9u16b63qJu3WJgHojITxiGL2hlPS8.getValue()).booleanValue()) {
            Color color = (Color)m$$JCDqBI1tV8LshiexopvdlS4qtAdze1vKYofHIuiW7yp0DNcKtsqbxbQXGLrJaRhmOVrygCB2CgXkRgiKUgEEmvhdlDb9i6Tbz.m$$xbVJWJOyjNr1BqadTIPOYNPG0Ttk7J3TnKteY6lg3Yps6IVpMUgLI35MB9uKbW9C09IdVqtjYzpHOIWEt4DTTb0iVOZKnlcHx.m$$YEcBiTH07FwXTcairuVfF8ZTd0VMmwxEAmnu7GYwzgP6efSUhsYqiBkm88ARJgKmvemIF6Z7qRE3Gs0EflBmR49qXOl7eWPOr.getValue();
            args.set(0, (Object)Float.valueOf((float)color.getRed() / 255.0f));
            args.set(1, (Object)Float.valueOf((float)color.getGreen() / 255.0f));
            args.set(2, (Object)Float.valueOf((float)color.getBlue() / 255.0f));
        }
    }
}

