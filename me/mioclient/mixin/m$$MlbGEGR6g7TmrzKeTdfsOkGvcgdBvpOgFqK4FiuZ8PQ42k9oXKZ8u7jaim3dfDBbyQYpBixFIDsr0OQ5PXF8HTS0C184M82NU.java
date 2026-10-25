package me.mioclient.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_2338;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_1297.class})
public interface m$$MlbGEGR6g7TmrzKeTdfsOkGvcgdBvpOgFqK4FiuZ8PQ42k9oXKZ8u7jaim3dfDBbyQYpBixFIDsr0OQ5PXF8HTS0C184M82NU {
    @Invoker(value="getVelocityAffectingPos")
    public class_2338 mio$getVelocityAffectingPos();
}

