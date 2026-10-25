package me.mioclient.mixin;

import net.minecraft.class_7472;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_7472.class})
public interface m$$liKv1lX7t0QZHrkATapCQwYbCJp1g01m5bxy36JKHG1RVHezfeYqbWbAZtvWolF3KduPeODOLMomaBpekhsfagxYhlK7Z2yBZ {
    @Mutable
    @Accessor(value="command")
    public void setCommand(String var1);
}

