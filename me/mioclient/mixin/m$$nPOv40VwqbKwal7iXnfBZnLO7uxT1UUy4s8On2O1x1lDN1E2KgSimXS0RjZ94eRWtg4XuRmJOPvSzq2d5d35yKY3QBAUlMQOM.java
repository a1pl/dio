package me.mioclient.mixin;

import net.minecraft.class_2817;
import net.minecraft.class_8710;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2817.class})
public interface m$$nPOv40VwqbKwal7iXnfBZnLO7uxT1UUy4s8On2O1x1lDN1E2KgSimXS0RjZ94eRWtg4XuRmJOPvSzq2d5d35yKY3QBAUlMQOM {
    @Mutable
    @Accessor(value="payload")
    public void setCustomPayload(class_8710 var1);
}

