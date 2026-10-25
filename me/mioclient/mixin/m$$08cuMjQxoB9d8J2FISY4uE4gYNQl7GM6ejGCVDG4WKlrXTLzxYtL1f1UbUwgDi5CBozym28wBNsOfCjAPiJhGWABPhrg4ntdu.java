package me.mioclient.mixin;

import java.util.List;
import net.minecraft.class_364;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_437.class})
public interface m$$08cuMjQxoB9d8J2FISY4uE4gYNQl7GM6ejGCVDG4WKlrXTLzxYtL1f1UbUwgDi5CBozym28wBNsOfCjAPiJhGWABPhrg4ntdu {
    @Invoker(value="addDrawableChild")
    public class_364 addDrawableChildHook(class_364 var1);

    @Accessor
    public void setDrawables(List var1);

    @Accessor
    public List getDrawables();
}

