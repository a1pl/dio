package me.mioclient.mixin;

import net.minecraft.class_243;
import net.minecraft.class_2833;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2833.class})
public interface m$$DiLZAKZ96LNDjmIj5jQfBFZOHjqtVCj1XikArRWCf0abUMhC414F4eifZrmK6Y4B7pP1Py64BMf4DTxlkDnqxYjoJLrWlcExD {
    @Accessor(value="position")
    @Mutable
    public void mio$setPos(class_243 var1);
}

