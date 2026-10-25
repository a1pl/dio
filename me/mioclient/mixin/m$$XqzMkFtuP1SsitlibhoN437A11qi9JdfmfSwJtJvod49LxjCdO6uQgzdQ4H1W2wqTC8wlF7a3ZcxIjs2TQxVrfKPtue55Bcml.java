package me.mioclient.mixin;

import com.mojang.brigadier.ParseResults;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_4717;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_4717.class})
public interface m$$XqzMkFtuP1SsitlibhoN437A11qi9JdfmfSwJtJvod49LxjCdO6uQgzdQ4H1W2wqTC8wlF7a3ZcxIjs2TQxVrfKPtue55Bcml {
    @Accessor(value="window")
    public class_4717.class_464 getWindow();

    @Accessor(value="parse")
    public ParseResults getParse();

    @Accessor(value="pendingSuggestions")
    public CompletableFuture getSuggestion();
}

