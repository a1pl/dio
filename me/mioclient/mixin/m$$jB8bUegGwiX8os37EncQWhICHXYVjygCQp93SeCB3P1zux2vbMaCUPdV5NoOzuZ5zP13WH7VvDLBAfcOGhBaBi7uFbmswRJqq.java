package me.mioclient.mixin;

import net.minecraft.class_9958;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_9958.class})
public interface m$$jB8bUegGwiX8os37EncQWhICHXYVjygCQp93SeCB3P1zux2vbMaCUPdV5NoOzuZ5zP13WH7VvDLBAfcOGhBaBi7uFbmswRJqq {
    @Mutable
    @Accessor(value="end")
    public void mio$setEnd(float var1);

    @Mutable
    @Accessor(value="red")
    public void mio$setRed(float var1);

    @Mutable
    @Accessor(value="green")
    public void mio$setGreen(float var1);

    @Mutable
    @Accessor(value="blue")
    public void mio$setBlue(float var1);

    @Mutable
    @Accessor(value="start")
    public void mio$setStart(float var1);

    @Mutable
    @Accessor(value="alpha")
    public void mio$setAlpha(float var1);
}

