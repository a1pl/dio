package me.mioclient.mixin;

import net.minecraft.class_2743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2743.class})
public interface m$$LuORSP6e5Zf8YQ3DBBij0z6SFEHm2YktdZDCJNooNetKoXEGM3xmQbRPxzV4kmmBdeKAsfmagJjHdr30J1iPFd4IdJ72Ry3rW {
    @Mutable
    @Accessor(value="velocityX")
    public void setX(int var1);

    @Mutable
    @Accessor(value="velocityY")
    public void setY(int var1);

    @Mutable
    @Accessor(value="velocityZ")
    public void setZ(int var1);
}

