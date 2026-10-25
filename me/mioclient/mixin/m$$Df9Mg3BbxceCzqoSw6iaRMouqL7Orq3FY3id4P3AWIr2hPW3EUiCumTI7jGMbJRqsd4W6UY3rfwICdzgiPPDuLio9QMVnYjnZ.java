package me.mioclient.mixin;

import net.minecraft.class_320;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_320.class})
public interface m$$Df9Mg3BbxceCzqoSw6iaRMouqL7Orq3FY3id4P3AWIr2hPW3EUiCumTI7jGMbJRqsd4W6UY3rfwICdzgiPPDuLio9QMVnYjnZ {
    @Mutable
    @Accessor(value="username")
    public void setUsername(String var1);
}

