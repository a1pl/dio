package me.mioclient.mixin;

import net.minecraft.class_1041;
import net.minecraft.class_323;
import net.minecraft.class_3678;
import net.minecraft.class_543;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1041.class})
public class m$$ffyF2sIwahbr8mRvOeFhNtfgCohG6tjkYNqlOpTENSV71htzXs6ySYH6tIUNV11IIPhqEQh10X6hq5euDnL6I1PLPg0bXGtdQ {
    @Inject(method={"<init>"}, at={@At(value="INVOKE_ASSIGN", target="Lorg/lwjgl/glfw/GLFW;glfwCreateWindow(IILjava/lang/CharSequence;JJ)J", shift=At.Shift.BEFORE, remap=false)})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_3678 class_36782, class_323 class_3232, class_543 class_5432, String string, String string2, CallbackInfo callbackInfo) {
        GLFW.glfwWindowHint((int)139270, (int)0);
    }
}

