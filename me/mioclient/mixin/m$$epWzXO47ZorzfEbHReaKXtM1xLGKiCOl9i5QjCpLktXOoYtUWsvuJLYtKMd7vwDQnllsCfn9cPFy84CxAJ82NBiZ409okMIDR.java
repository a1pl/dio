package me.mioclient.mixin;

import net.minecraft.class_2663;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2663.class})
public interface m$$epWzXO47ZorzfEbHReaKXtM1xLGKiCOl9i5QjCpLktXOoYtUWsvuJLYtKMd7vwDQnllsCfn9cPFy84CxAJ82NBiZ409okMIDR {
    @Accessor(value="entityId")
    public int getId();
}

