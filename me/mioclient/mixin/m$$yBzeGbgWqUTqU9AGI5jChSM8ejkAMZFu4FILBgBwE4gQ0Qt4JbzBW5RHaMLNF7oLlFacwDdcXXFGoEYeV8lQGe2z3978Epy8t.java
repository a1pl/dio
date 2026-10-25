package me.mioclient.mixin;

import net.minecraft.class_1921;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1921.class_4687.class})
public interface m$$yBzeGbgWqUTqU9AGI5jChSM8ejkAMZFu4FILBgBwE4gQ0Qt4JbzBW5RHaMLNF7oLlFacwDdcXXFGoEYeV8lQGe2z3978Epy8t {
    @Accessor(value="phases")
    public class_1921.class_4688 mio$getParams();
}

