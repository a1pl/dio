package me.mioclient.mixin;

import java.util.OptionalLong;
import net.minecraft.class_2874;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2874.class})
public interface m$$PEGBaEOAvl7reQhiGC2oQxd3vO4wuP9uqEfogjHIaRqVks1pR7N1EgbPI5yyNX8uMhdBy8pXRQLfkZSHEC5cahVen75riHykf {
    @Accessor(value="fixedTime")
    @Mutable
    public void mio$setFixedTime(OptionalLong var1);
}

