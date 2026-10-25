package me.mioclient.mixin;

import java.util.Map;
import net.minecraft.class_1060;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1060.class})
public interface m$$v6OpYJxV3vMbnhU2UeqSXrGxqgpybzwPIKtqWyEaTxn8tva8vvPPadGTe9UEIZrOIqSW0VnpkpNCrslmaeDN2yma9oZskTVoC {
    @Accessor(value="textures")
    public Map getAllTextures();
}

