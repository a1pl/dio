package me.mioclient.mixin;

import net.minecraft.class_1735;
import net.minecraft.class_465;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_465.class})
public interface m$$TWtoeQN2KKrVMfzCyoKCK5hXpn7fU6GUdUAC7SwZRnDUEowRxxNCFCbkt67IAWGLyHpkWeN8KDwpZFggiRPPyU2YEAquD0bl5 {
    @Accessor(value="y")
    public int getY();

    @Accessor(value="x")
    public int getX();

    @Accessor(value="focusedSlot")
    public class_1735 mio$getFocusedSlot();

    @Accessor(value="backgroundHeight")
    public int getBgHeight();

    @Accessor(value="backgroundWidth")
    public int getBgWidth();
}

