package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import java.awt.Color;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$JlYob76ykoMYqistvhNZuEP7xnUGSAcaXHGcexagaXNJtTSNPFeKBxUddkfGqw5q7ABj6BYiKfSRBFu6wCjSPV2OCqELITSzy;
import me.mioclient.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml;
import me.mioclient.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_765.class})
public class m$$PR2Fo7Mb2GWYmXp7UwylQBDUxCEav32r5ubtrBrW8aVRDP8Dz9IRcTyheyl2fHrzdzu1KrShskNJ7nnN426W0NrwYhNJYFeGS {
    private static final m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml m$$fBc8ocZnHFlUXf176wkL0Qf0yzL0Lj36XIK51c3mgvmpn4c3RXvZ3CjgM9MB2UToB3zsDTZKJe6D5fU2chpIE8yZwojZ3idGX = (m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml.class);

    @ModifyExpressionValue(method={"update"}, at={@At(value="FIELD", target="Lnet/minecraft/client/gl/RenderPipelines;BILT_SCREEN_LIGHTMAP:Lcom/mojang/blaze3d/pipeline/RenderPipeline;")})
    private RenderPipeline m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(RenderPipeline renderPipeline) {
        if (m$$fBc8ocZnHFlUXf176wkL0Qf0yzL0Lj36XIK51c3mgvmpn4c3RXvZ3CjgM9MB2UToB3zsDTZKJe6D5fU2chpIE8yZwojZ3idGX.isToggled() && m$$PR2Fo7Mb2GWYmXp7UwylQBDUxCEav32r5ubtrBrW8aVRDP8Dz9IRcTyheyl2fHrzdzu1KrShskNJ7nnN426W0NrwYhNJYFeGS.m$$fBc8ocZnHFlUXf176wkL0Qf0yzL0Lj36XIK51c3mgvmpn4c3RXvZ3CjgM9MB2UToB3zsDTZKJe6D5fU2chpIE8yZwojZ3idGX.m$$VHJ6p64N24N0M25oyuhth5vzwp83ziTyyxtiPXTsRRYz63S3H5rRbVf1KmmwdabnyipEibARObKwHJqz6E0vTnIG1T3sVglTQ.getValue() == m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$35IYj66qXK2jgdDqFG72BB7DISPreoadTbWPKXa0Qtf00v9D74PG7l2KyxU0ByTBY2n65hOE1feaWnFMp79LDOltAHfV9qvqc) {
            return m$$JlYob76ykoMYqistvhNZuEP7xnUGSAcaXHGcexagaXNJtTSNPFeKBxUddkfGqw5q7ABj6BYiKfSRBFu6wCjSPV2OCqELITSzy.m$$MmOWYSOFGzd7MFWj1CN4bqDL9c4u2nALecj8gf3p7DGpsvqojqfVIZWagb5fN5UnZJgQYJpebmp8YnczmCDWWyxNzohO8VRkf;
        }
        return renderPipeline;
    }

    @Inject(method={"update"}, at={@At(value="INVOKE", target="Lcom/mojang/blaze3d/systems/RenderPass;setUniform(Ljava/lang/String;[F)V", ordinal=0)})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(float f, CallbackInfo callbackInfo, @Local RenderPass renderPass) {
        if (m$$fBc8ocZnHFlUXf176wkL0Qf0yzL0Lj36XIK51c3mgvmpn4c3RXvZ3CjgM9MB2UToB3zsDTZKJe6D5fU2chpIE8yZwojZ3idGX.isToggled() && m$$PR2Fo7Mb2GWYmXp7UwylQBDUxCEav32r5ubtrBrW8aVRDP8Dz9IRcTyheyl2fHrzdzu1KrShskNJ7nnN426W0NrwYhNJYFeGS.m$$fBc8ocZnHFlUXf176wkL0Qf0yzL0Lj36XIK51c3mgvmpn4c3RXvZ3CjgM9MB2UToB3zsDTZKJe6D5fU2chpIE8yZwojZ3idGX.m$$VHJ6p64N24N0M25oyuhth5vzwp83ziTyyxtiPXTsRRYz63S3H5rRbVf1KmmwdabnyipEibARObKwHJqz6E0vTnIG1T3sVglTQ.getValue() == m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$35IYj66qXK2jgdDqFG72BB7DISPreoadTbWPKXa0Qtf00v9D74PG7l2KyxU0ByTBY2n65hOE1feaWnFMp79LDOltAHfV9qvqc) {
            Color color = (Color)m$$PR2Fo7Mb2GWYmXp7UwylQBDUxCEav32r5ubtrBrW8aVRDP8Dz9IRcTyheyl2fHrzdzu1KrShskNJ7nnN426W0NrwYhNJYFeGS.m$$fBc8ocZnHFlUXf176wkL0Qf0yzL0Lj36XIK51c3mgvmpn4c3RXvZ3CjgM9MB2UToB3zsDTZKJe6D5fU2chpIE8yZwojZ3idGX.m$$VZT2g5vCCpdSNw529PZWpffosSl91HtBGarT2s9q9gu14DWBAOaCrfUDDdh8OcL6tFsIc3Bd9bMDe5iZ3s4uCXZISuz5rAfAi.getValue();
            float f2 = (float)color.getRed() / 255.0f;
            float f3 = (float)color.getGreen() / 255.0f;
            float f4 = (float)color.getBlue() / 255.0f;
            renderPass.setUniform("AmbienceColor", new float[]{f2, f3, f4});
        }
    }

    @Inject(method={"pack"}, at={@At(value="HEAD")}, cancellable=true)
    private static void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(int n, int n2, CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$fBc8ocZnHFlUXf176wkL0Qf0yzL0Lj36XIK51c3mgvmpn4c3RXvZ3CjgM9MB2UToB3zsDTZKJe6D5fU2chpIE8yZwojZ3idGX.isToggled() && m$$PR2Fo7Mb2GWYmXp7UwylQBDUxCEav32r5ubtrBrW8aVRDP8Dz9IRcTyheyl2fHrzdzu1KrShskNJ7nnN426W0NrwYhNJYFeGS.m$$fBc8ocZnHFlUXf176wkL0Qf0yzL0Lj36XIK51c3mgvmpn4c3RXvZ3CjgM9MB2UToB3zsDTZKJe6D5fU2chpIE8yZwojZ3idGX.m$$VHJ6p64N24N0M25oyuhth5vzwp83ziTyyxtiPXTsRRYz63S3H5rRbVf1KmmwdabnyipEibARObKwHJqz6E0vTnIG1T3sVglTQ.getValue() == m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$35IYj66qXK2jgdDqFG72BB7DISPreoadTbWPKXa0Qtf00v9D74PG7l2KyxU0ByTBY2n65hOE1feaWnFMp79LDOltAHfV9qvqc) {
            callbackInfoReturnable.setReturnValue((Object)0);
            callbackInfoReturnable.cancel();
        }
    }
}

