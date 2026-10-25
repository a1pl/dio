package me.mioclient.mixin;

import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_243.class})
public interface m$$KfU4wmORgpQ6cabALSklcHjBla1N7EhnqqIeqSUhN4Y1MAAmwwYsRy2eDVBtrxhR5ufh9paJsh8w9b59sEnczp8OFyboADzL2 {
    @Mutable
    @Accessor(value="x")
    public void setX(double var1);

    @Mutable
    @Accessor(value="y")
    public void setY(double var1);

    @Mutable
    @Accessor(value="z")
    public void setZ(double var1);
}

