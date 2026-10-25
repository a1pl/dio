package me.mioclient.mixin;

import net.minecraft.class_4970;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_4970.class})
public interface m$$8ThfDQHSFd6C3u6wzYae6DSpyKgempIifKwaALYHqkNsDw8CyzEPO8KNL0zsZ5XQyfXdt7kUksVVD8SC1WaHDqLJ11mVjJJcO {
    @Accessor(value="collidable")
    public boolean isCollidable();
}

