package me.mioclient.mixin;

import net.minecraft.class_638;
import net.minecraft.class_7202;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_638.class})
public interface m$$g9iom1a5HxHr7ggP82zPej9ccxFBC5tHDRCJ4J2vHzchDHZz5H1ChLuJNqubkT3Xm7KpcwOUHNOoUdGempREUUQAASW2kKB3T {
    @Accessor(value="pendingUpdateManager")
    public class_7202 getPendingUpdateManager();
}

