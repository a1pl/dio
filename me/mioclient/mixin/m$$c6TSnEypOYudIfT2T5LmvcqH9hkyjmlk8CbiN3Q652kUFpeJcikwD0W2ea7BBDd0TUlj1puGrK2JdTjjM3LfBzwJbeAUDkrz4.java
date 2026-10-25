package me.mioclient.mixin;

import net.minecraft.class_10182;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_10182.class})
public interface m$$c6TSnEypOYudIfT2T5LmvcqH9hkyjmlk8CbiN3Q652kUFpeJcikwD0W2ea7BBDd0TUlj1puGrK2JdTjjM3LfBzwJbeAUDkrz4 {
    @Mutable
    @Accessor(value="pitch")
    public void mio$setPitch(float var1);

    @Mutable
    @Accessor(value="yaw")
    public void mio$setYaw(float var1);
}

