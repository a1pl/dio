package me.mioclient.mixin;

import net.minecraft.class_4717;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_4717.class_464.class})
public interface m$$aEFkM2ccLPcDl3X3IpiEYHjbIzIcSgnNRmDhHH7OcFgTofXAVRC2gqk28Tta9A0Fu14TX3Fqfabz4V7wWaKFd3CbKSpDz4JBV {
    @Accessor(value="completed")
    public boolean isCompleted();

    @Accessor(value="typedText")
    public String getTypedText();

    @Accessor(value="selection")
    public int getSelection();
}

