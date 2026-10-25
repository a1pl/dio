package me.mioclient.mixin;

import net.minecraft.class_2828;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2828.class})
public interface m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A {
    @Accessor(value="changePosition")
    public boolean isChangePosition();

    @Mutable
    @Accessor(value="onGround")
    public void setOnGround(boolean var1);

    @Mutable
    @Accessor(value="yaw")
    public void setYaw(float var1);

    @Mutable
    @Accessor(value="pitch")
    public void setPitch(float var1);

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

