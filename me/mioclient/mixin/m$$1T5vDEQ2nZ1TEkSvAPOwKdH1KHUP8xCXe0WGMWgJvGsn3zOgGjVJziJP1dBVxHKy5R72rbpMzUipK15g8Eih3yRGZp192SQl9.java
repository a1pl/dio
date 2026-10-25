package me.mioclient.mixin;

import net.minecraft.class_4597;
import net.minecraft.class_4618;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_4618.class})
public interface m$$1T5vDEQ2nZ1TEkSvAPOwKdH1KHUP8xCXe0WGMWgJvGsn3zOgGjVJziJP1dBVxHKy5R72rbpMzUipK15g8Eih3yRGZp192SQl9 {
    @Accessor(value="plainDrawer")
    public class_4597.class_4598 getParent();
}

