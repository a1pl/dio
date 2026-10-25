package me.mioclient.mixin;

import net.minecraft.class_2797;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2797.class})
public interface m$$nieyLzekvrijjghRe2mKX51miWlhke3SK26gO3qA8vQcf5oQdLA7CAnbO83DaKkDwrqFTJgXNOkvvtcQGeiuvO8z308jEHILV {
    @Mutable
    @Accessor(value="chatMessage")
    public void setChatMessage(String var1);
}

