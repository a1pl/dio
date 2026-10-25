package me.mioclient.mixin;

import net.minecraft.class_1309;
import net.minecraft.class_1671;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1671.class})
public interface m$$x4y1blatyyRVyXKM0YH6DiW6dcPNAbce9T1RZS3afbLJqHdKjpD3P5JoNnbi1OEW1hLRvtHViNpJIdzyY2me08v7lhkJ7JZG3 {
    @Accessor(value="life")
    public void setLife(int var1);

    @Accessor(value="life")
    public int getLife();

    @Accessor(value="lifeTime")
    public int getLifeTime();

    @Accessor(value="shooter")
    public class_1309 mio$getShooter();
}

