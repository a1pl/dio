package me.mioclient.mixin;

import net.minecraft.class_276;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_310.class})
public interface m$$lUTO7T7jJ7WLEvdxQxOMTA8XsxmWzk6dLoweLkhmh35FeQ2bHRiU4F9KPC86bE2dCPsfSYxTX0BDpmNvhnCAQvv6veMSrldqv {
    @Accessor(value="itemUseCooldown")
    public void setItemUseCooldown(int var1);

    @Accessor(value="itemUseCooldown")
    public int getItemUseCooldown();

    @Accessor(value="disconnecting")
    public boolean mio$isDisconnecting();

    @Invoker(value="doItemUse")
    public void interact();

    @Invoker(value="doAttack")
    public boolean attack();

    @Mutable
    @Accessor(value="framebuffer")
    public void mio$setFramebuffer(class_276 var1);

    @Accessor(value="framebuffer")
    public class_276 mio$getFrambuffer();
}

