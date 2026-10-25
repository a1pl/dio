package me.mioclient.mixin;

import net.minecraft.class_492;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_492.class})
public interface m$$LqZXWVZeOMTF9ZjDE7T5J9mTn8CoKJ1zKenr576hKBMt1YRtqBFRB7mb7XWO1K4J52OhQy6IGjYxWlPczaFZhpwKRGIfvrehY {
    @Accessor(value="selectedIndex")
    public void mio$setSelected(int var1);

    @Invoker(value="syncRecipeIndex")
    public void mio$syncRecipe();
}

