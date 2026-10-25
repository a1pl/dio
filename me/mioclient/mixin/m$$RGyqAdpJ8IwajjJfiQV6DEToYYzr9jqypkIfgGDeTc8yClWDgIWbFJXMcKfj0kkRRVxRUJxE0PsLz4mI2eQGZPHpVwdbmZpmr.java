package me.mioclient.mixin;

import net.minecraft.class_2761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2761.class})
public interface m$$RGyqAdpJ8IwajjJfiQV6DEToYYzr9jqypkIfgGDeTc8yClWDgIWbFJXMcKfj0kkRRVxRUJxE0PsLz4mI2eQGZPHpVwdbmZpmr {
    @Mutable
    @Accessor(value="time")
    public void setTime(long var1);

    @Mutable
    @Accessor(value="timeOfDay")
    public void setTimeOfDay(long var1);
}

