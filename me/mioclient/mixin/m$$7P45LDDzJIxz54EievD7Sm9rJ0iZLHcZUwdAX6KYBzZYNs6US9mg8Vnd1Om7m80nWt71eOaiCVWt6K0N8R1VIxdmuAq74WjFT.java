package me.mioclient.mixin;

import net.minecraft.class_1917;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1917.class})
public interface m$$7P45LDDzJIxz54EievD7Sm9rJ0iZLHcZUwdAX6KYBzZYNs6US9mg8Vnd1Om7m80nWt71eOaiCVWt6K0N8R1VIxdmuAq74WjFT {
    @Accessor(value="spawnDelay")
    public int getSpawnDelay();
}

