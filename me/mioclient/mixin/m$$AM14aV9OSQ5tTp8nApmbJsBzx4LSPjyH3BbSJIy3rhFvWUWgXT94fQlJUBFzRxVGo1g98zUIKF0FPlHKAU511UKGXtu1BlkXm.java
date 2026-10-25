package me.mioclient.mixin;

import net.minecraft.class_276;
import net.minecraft.class_4604;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_761.class})
public interface m$$AM14aV9OSQ5tTp8nApmbJsBzx4LSPjyH3BbSJIy3rhFvWUWgXT94fQlJUBFzRxVGo1g98zUIKF0FPlHKAU511UKGXtu1BlkXm {
    @Accessor
    public void setEntityOutlineFramebuffer(class_276 var1);

    @Accessor(value="frustum")
    public class_4604 getFrustum();
}

