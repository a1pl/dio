package me.mioclient.mixin;

import net.minecraft.class_2824;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2824.class})
public interface m$$ib2tfkMQCI0JJ7WxMKaNF7vnVldsBXwdZmF6K0wQtu1cCqvH8DdqkDvF6Vj0Y6A4ewvEjeDEveQDYlElGuKRTiK87fDgppJp7 {
    @Accessor(value="entityId")
    public int getEntityId();
}

