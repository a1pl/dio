package me.mioclient.mixin;

import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_636.class})
public interface m$$picqd9GpMczLq1X5snvuRPJGAXTe4hyoHzw5FhwPiIDmJmJDVWI6Qc1WV4A7xQZLxoTnBAzuuPeKubRJgFUDVGD64VewbZS0D {
    @Invoker(value="syncSelectedSlot")
    public void sync();
}

