package me.mioclient.mixin;

import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$X168TAQmeEnvt0xCkDJ0P4E2o4G3BWCvQTnRlhZSCEAL51BN2xNYSD5GOWm2R5PkpMnjfcQdyRNcXMxVVq3vvnR33OVT1kWVJ;
import me.mioclient.m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR;
import me.mioclient.m$$mLAkRmscdf3d0QVIY25jllCt0TRMc9LZRM7StkWKq0Oq9b6UYYH2I2jbQ6t4GAMP1DUjRq8tilQJamyz9hx3WSwqHEZOB5cPC;
import me.mioclient.m$$qUF76UOqemc9FkFUspw8Dhz0fbbJPuh5IZIZnCvNPrPCpJySWpIid4iX5dMG4j3QwUIeB3w5lvgeavbg0WsEekdTNHCWRIkVk;
import net.minecraft.class_2558;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_437.class})
public abstract class m$$gkNYEpwpZGLHbqxKJ4NkFDjLhm7njMR502jCopALMT6ZQL7gT9aWk4Icu0GRqtOOZnzVNtR2CnA4wuMRD52TzCv6mCzYFyHNi {
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$c6TSnEypOYudIfT2T5LmvcqH9hkyjmlk8CbiN3Q652kUFpeJcikwD0W2ea7BBDd0TUlj1puGrK2JdTjjM3LfBzwJbeAUDkrz4 = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    private static final m$$mLAkRmscdf3d0QVIY25jllCt0TRMc9LZRM7StkWKq0Oq9b6UYYH2I2jbQ6t4GAMP1DUjRq8tilQJamyz9hx3WSwqHEZOB5cPC m$$RvUgnN57x76VSpPhrGhFTSMVfDFluAfff9YBQepyQe3ooqLcvGTVSUyLTtwpiTjPtgriYLRgaS48dSYI8vKk7Z9nQcqt7sQ0M = (m$$mLAkRmscdf3d0QVIY25jllCt0TRMc9LZRM7StkWKq0Oq9b6UYYH2I2jbQ6t4GAMP1DUjRq8tilQJamyz9hx3WSwqHEZOB5cPC)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$mLAkRmscdf3d0QVIY25jllCt0TRMc9LZRM7StkWKq0Oq9b6UYYH2I2jbQ6t4GAMP1DUjRq8tilQJamyz9hx3WSwqHEZOB5cPC.class);
    @Shadow
    @Nullable
    protected class_310 field_22787;
    @Shadow
    public int field_22789;
    @Shadow
    public int field_22790;

    @Shadow
    protected abstract void method_57735(class_332 var1);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Inject(method={"handleTextClick"}, at={@At(value="INVOKE", target="Ljava/lang/String;startsWith(Ljava/lang/String;)Z", shift=At.Shift.BEFORE)})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2583 class_25832, CallbackInfoReturnable callbackInfoReturnable) {
        String string;
        if (this.field_22787.method_1562() == null) {
            return;
        }
        class_2558 class_25582 = class_25832.method_10970();
        if (!(class_25582 instanceof class_2558.class_10609)) return;
        class_2558.class_10609 class_106092 = (class_2558.class_10609)class_25582;
        try {
            String string2;
            string = string2 = class_106092.comp_3506();
            if (!string.startsWith(m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR.m$$TRdDqBJgjZ1fw9rIVfhStjcPOPjNzy6jg68DukqXu2g24StbWqoO7VTCIgO8JxiARBFlRnv98GgLAhEyYbNiJhiID7o3hu0OB(-1241911330))) return;
        } catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        this.field_22787.method_1562().method_45729(string);
    }

    @Inject(method={"renderInGameBackground"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$si2aX2X8Dch8BrpPv8C89mK3tHVjy6by3nrWOWcgTRS3w0VNjCaT6TzOK1vZM0JWisN0y7s9j2U6LywGMjYOWySMMEgPZT7WH(class_332 class_3322, CallbackInfo callbackInfo) {
        if (m$$c6TSnEypOYudIfT2T5LmvcqH9hkyjmlk8CbiN3Q652kUFpeJcikwD0W2ea7BBDd0TUlj1puGrK2JdTjjM3LfBzwJbeAUDkrz4.m$$vH92i4ZhKWclFDskBRvO0mUNeKPQBhAJJB4ZRu28MJupyeizOClWDVYi1TE9OaNRdbx8JvDTHuSXEHwvM0qSSWCcJVwwYjKYP(1312988141)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderBackground"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/screen/Screen;applyBlur()V", shift=At.Shift.BEFORE)}, cancellable=true)
    private void m$$C7jwyCZGOGmxYHR6CinqHYKGpwwojfCUt8uyzjRA2awICUF3ogkSBtJt9OZZ5TwdqY7XMH0WNbqisrPkOMONx1NLAAWZsoOL0(class_332 class_3322, int n, int n2, float f, CallbackInfo callbackInfo) {
        if (m$$RvUgnN57x76VSpPhrGhFTSMVfDFluAfff9YBQepyQe3ooqLcvGTVSUyLTtwpiTjPtgriYLRgaS48dSYI8vKk7Z9nQcqt7sQ0M.isToggled() && this.field_22787.field_1687 != null && this.field_22787.field_1724 != null) {
            this.method_57735(class_3322);
            callbackInfo.cancel();
            return;
        }
        if (!(class_310.method_1551().field_1755 instanceof m$$qUF76UOqemc9FkFUspw8Dhz0fbbJPuh5IZIZnCvNPrPCpJySWpIid4iX5dMG4j3QwUIeB3w5lvgeavbg0WsEekdTNHCWRIkVk)) {
            return;
        }
        float f2 = this.field_22787.field_1690.method_57703();
        this.method_57735(class_3322);
        m$$X168TAQmeEnvt0xCkDJ0P4E2o4G3BWCvQTnRlhZSCEAL51BN2xNYSD5GOWm2R5PkpMnjfcQdyRNcXMxVVq3vvnR33OVT1kWVJ.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(() -> m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$zk9yJWy8Cs7ANpEvtMQRvXlCNCRZxhr8NIJq4X4tBdUww03OfaeRoPvEO3Lsg2nQnPW0c4J89vLKpg6dBYgD5lOlMLOn22lUv.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_3322.method_51448(), 0.0f, 0.0f, (float)this.field_22789, (float)this.field_22790, -1), f2);
        callbackInfo.cancel();
    }
}

