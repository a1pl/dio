package me.mioclient.mixin;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.class_3675;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_3675.class_307.class})
public interface m$$gl3EfLevy2HeXfmH3nGBAdrJgvseio5Dg5ySK0uWKWMcq2TqrBI7zUspmnI48A87k5xeRsaIk77R8tNALW9TMZhOs90axM5Zf {
    @Accessor(value="map")
    public Int2ObjectMap getKeyMap();
}

