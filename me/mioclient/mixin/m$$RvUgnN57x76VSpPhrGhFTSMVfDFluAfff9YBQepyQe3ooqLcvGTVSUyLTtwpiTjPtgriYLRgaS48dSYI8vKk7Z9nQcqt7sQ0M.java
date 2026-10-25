package me.mioclient.mixin;

import java.util.List;
import net.minecraft.class_279;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_279.class})
public interface m$$RvUgnN57x76VSpPhrGhFTSMVfDFluAfff9YBQepyQe3ooqLcvGTVSUyLTtwpiTjPtgriYLRgaS48dSYI8vKk7Z9nQcqt7sQ0M {
    @Accessor
    public List getPasses();
}

