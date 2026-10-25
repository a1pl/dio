package me.mioclient.mixin;

import net.minecraft.class_1921;
import net.minecraft.class_4668;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1921.class_4688.class})
public interface m$$68QlsrW0NU63MatZBtDDTOYv0z0I8aaS9PViDComI9KQ5VQOCaLCdlj46ob3FMDn4LUdhEfkoIiB41x2gcOsItJ9vqtL1RZqg {
    @Accessor(value="target")
    public class_4668.class_4678 mio$getTarget();
}

