package me.mioclient.mixin;

import net.minecraft.class_304;
import net.minecraft.class_3675;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_304.class})
public interface m$$eBa87i2SOiKLAoeT3VEMXrClW6Fx4WytLGlhf2SKSZfzhb4YmigAkXEyCuECJ62Fic92B6IkSgtv0dOZ7JwQZnaLQbghEwB4Q {
    @Accessor(value="boundKey")
    public class_3675.class_306 getKey();
}

