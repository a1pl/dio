package me.mioclient.mixin;

import com.mojang.jtracy.MemoryPool;
import net.minecraft.class_1011;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1011.class})
public interface m$$82TNt4E1QByuGXv3IHLRKCDMJ3qCrST5yJsR4kTStENmf32qULGrkMiNkMDkOqNMKXHz5UR7itvhM7aIuOrgoqDZGnoRCdJBi {
    @Accessor(value="sizeBytes")
    public long mio$getSize();

    @Accessor(value="pointer")
    public long mio$getPointer();

    @Accessor(value="MEMORY_POOL")
    public static MemoryPool mio$getPool() {
        return null;
    }
}

