package me.mioclient.mixin;

import net.minecraft.class_1728;
import net.minecraft.class_1915;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1728.class})
public interface m$$RpOUkrOwQoqCDyuZFSh9uM8wQPDbwb0tZaEHBUSEQ6Xj8q0sn0EwEPcEssNPMUjwi1oyI5EYgeYlqKduEaHoeuB6JyH1CTQNN {
    @Accessor(value="merchant")
    public class_1915 mio$getMerchant();
}

