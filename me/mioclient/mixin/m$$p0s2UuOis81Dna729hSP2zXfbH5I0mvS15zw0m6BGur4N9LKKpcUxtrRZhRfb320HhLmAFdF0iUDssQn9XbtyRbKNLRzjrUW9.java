package me.mioclient.mixin;

import io.netty.channel.Channel;
import net.minecraft.class_2535;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2535.class})
public interface m$$p0s2UuOis81Dna729hSP2zXfbH5I0mvS15zw0m6BGur4N9LKKpcUxtrRZhRfb320HhLmAFdF0iUDssQn9XbtyRbKNLRzjrUW9 {
    @Accessor(value="channel")
    public Channel getChannel();
}

