package me.mioclient.mixin;

import net.minecraft.class_315;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value={class_315.class})
public class m$$YcIk0d5zEr1E3gPx8bKssJDaP7bKiqf6MFq2o9TQ8oOVUNnwOsh3aOpV69cLEwDW9EtvicX0SBW36A9dvLLzkY6VZ0eM4ty7o {
    @ModifyConstant(method={"<init>"}, constant={@Constant(intValue=110)})
    private int m$$C7jwyCZGOGmxYHR6CinqHYKGpwwojfCUt8uyzjRA2awICUF3ogkSBtJt9OZZ5TwdqY7XMH0WNbqisrPkOMONx1NLAAWZsoOL0(int n) {
        return 150;
    }
}

