package me.mioclient.mixin;

import java.util.List;
import net.minecraft.class_2960;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_8000;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_332.class})
public interface m$$HCLYffB2xUi9kRIvzPbYXEPDkBbgRzyasQROo8LRzCqiAbVpDalp3fff8DYFEgqSZjoXERFYAYzuYkJ3MfejjwbPcRkL3wwdd {
    @Invoker(value="drawTooltip")
    public void drawTooltipsHook(class_327 var1, List var2, int var3, int var4, class_8000 var5, class_2960 var6);
}

