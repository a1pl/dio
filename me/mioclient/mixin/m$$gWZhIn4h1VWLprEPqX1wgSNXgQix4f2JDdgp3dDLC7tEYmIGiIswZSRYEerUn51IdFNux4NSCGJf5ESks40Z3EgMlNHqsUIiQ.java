package me.mioclient.mixin;

import net.minecraft.class_1102;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1102.class})
public interface m$$gWZhIn4h1VWLprEPqX1wgSNXgQix4f2JDdgp3dDLC7tEYmIGiIswZSRYEerUn51IdFNux4NSCGJf5ESks40Z3EgMlNHqsUIiQ {
    @Accessor(value="volume")
    public void setVolume(float var1);
}

