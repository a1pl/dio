package me.mioclient.mixin;

import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_746.class})
public interface m$$zw04xeL3ShLbqoLCMc8Km1ycMqxehHqSheS7x66X8jQBpRtFm7SqL481m26L5zbJsruAxO1N1yi929Sx2L7Fr53NiBRzgHI7F {
    @Accessor(value="lastYawClient")
    public float lastYaw();

    @Accessor(value="lastOnGround")
    public boolean lastOnGround();
}

