package me.mioclient.mixin;

import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_1309.class})
public interface m$$hJf6ZDyP4YffwCzULm1zccaHSp5Br6o9dfwlEsr1iZYU2T1oa9HHdEoPLhBrOxwo4Ngm5vGo4kluwJDkgZzV6CBT9R01yr51J {
    @Accessor(value="leaningPitch")
    public float mio$getLeaningPitch();

    @Accessor(value="glidingTicks")
    public void mio$setGlidingTicks(int var1);

    @Accessor(value="leaningPitch")
    public void mio$setLeaningPitch(float var1);

    @Accessor(value="lastLeaningPitch")
    public float mio$getLastLeaningPitch();

    @Accessor(value="lastLeaningPitch")
    public void mio$setLastLeaningPitch(float var1);

    @Accessor(value="itemUseTimeLeft")
    public void setItemUseTimeLeft(int var1);

    @Invoker(value="getHandSwingDuration")
    public int getSwingDuration();
}

