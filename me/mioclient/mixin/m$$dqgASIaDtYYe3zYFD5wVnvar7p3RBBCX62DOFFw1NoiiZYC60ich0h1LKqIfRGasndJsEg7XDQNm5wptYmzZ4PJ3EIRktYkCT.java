package me.mioclient.mixin;

import java.util.Optional;
import net.minecraft.class_2664;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2664.class})
public interface m$$dqgASIaDtYYe3zYFD5wVnvar7p3RBBCX62DOFFw1NoiiZYC60ich0h1LKqIfRGasndJsEg7XDQNm5wptYmzZ4PJ3EIRktYkCT {
    @Mutable
    @Accessor(value="playerKnockback")
    public void setVelocity(Optional var1);
}

