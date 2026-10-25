package me.mioclient.mixin;

import net.minecraft.class_10185;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_10185.class})
public interface m$$jKE8rPfAyHwfawN6Z7OubGQhbpRDN61kYdsrUpp4lmIFyMFVGHYoRWVBWiL2W3KrqQnQRKs3or6w0hdJlqBsYwtcvGIiLLrC7 {
    @Mutable
    @Accessor(value="right")
    public void mio$setRight(boolean var1);

    @Mutable
    @Accessor(value="jump")
    public void mio$setJump(boolean var1);

    @Mutable
    @Accessor(value="forward")
    public void mio$setForward(boolean var1);

    @Mutable
    @Accessor(value="backward")
    public void mio$setBack(boolean var1);

    @Mutable
    @Accessor(value="left")
    public void mio$setLeft(boolean var1);

    @Mutable
    @Accessor(value="sneak")
    public void mio$setSneak(boolean var1);

    @Mutable
    @Accessor(value="sprint")
    public void mio$setSprint(boolean var1);
}

