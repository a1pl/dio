package me.mioclient.mixin;

import net.minecraft.class_2637;
import net.minecraft.class_4076;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2637.class})
public interface m$$P49vLWkAEayAKx7gjdklEZKDj6QRGoF0oxYGuHl3MdSdMI14q5XfLk8HYoZ6Fr3gI7z22sAWu8ZbsrgYxywTZB093IeSYHYJw {
    @Accessor(value="sectionPos")
    public class_4076 getSection();
}

