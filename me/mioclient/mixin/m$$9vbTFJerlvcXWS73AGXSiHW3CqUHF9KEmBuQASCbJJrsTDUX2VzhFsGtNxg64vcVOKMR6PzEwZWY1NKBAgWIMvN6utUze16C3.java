package me.mioclient.mixin;

import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$VCHpUNUWWDCidVH9LGEGGy3c73wKiwojWTRqg6BjeAcwplkw15hF1pr29h8eKrKXw3Qak6pr08a5lM5OFDfU4IVVMGOau2PTs;
import me.mioclient.m$$lugwKEAkepvIkrXqpUkFMdVEN3sZ2ztK5iojUJE7vjUrw995IWHMQauwypMhCZ6WOopNWC1e0QJHlh6N3wIUS1WRvfKzrzZ0X;
import net.minecraft.class_1309;
import net.minecraft.class_332;
import net.minecraft.class_490;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_490.class})
public class m$$9vbTFJerlvcXWS73AGXSiHW3CqUHF9KEmBuQASCbJJrsTDUX2VzhFsGtNxg64vcVOKMR6PzEwZWY1NKBAgWIMvN6utUze16C3 {
    private static m$$lugwKEAkepvIkrXqpUkFMdVEN3sZ2ztK5iojUJE7vjUrw995IWHMQauwypMhCZ6WOopNWC1e0QJHlh6N3wIUS1WRvfKzrzZ0X m$$gkNYEpwpZGLHbqxKJ4NkFDjLhm7njMR502jCopALMT6ZQL7gT9aWk4Icu0GRqtOOZnzVNtR2CnA4wuMRD52TzCv6mCzYFyHNi = (m$$lugwKEAkepvIkrXqpUkFMdVEN3sZ2ztK5iojUJE7vjUrw995IWHMQauwypMhCZ6WOopNWC1e0QJHlh6N3wIUS1WRvfKzrzZ0X)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$lugwKEAkepvIkrXqpUkFMdVEN3sZ2ztK5iojUJE7vjUrw995IWHMQauwypMhCZ6WOopNWC1e0QJHlh6N3wIUS1WRvfKzrzZ0X.class);

    @Inject(method={"drawEntity(Lnet/minecraft/client/gui/DrawContext;IIIIIFFFLnet/minecraft/entity/LivingEntity;)V"}, at={@At(value="HEAD")})
    private static void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_332 class_3322, int n, int n2, int n3, int n4, int n5, float f, float f2, float f3, class_1309 class_13092, CallbackInfo callbackInfo) {
        m$$VCHpUNUWWDCidVH9LGEGGy3c73wKiwojWTRqg6BjeAcwplkw15hF1pr29h8eKrKXw3Qak6pr08a5lM5OFDfU4IVVMGOau2PTs.m$$SJ9Rt5MncvMPewN442Tk7LhHhGf1JxLH6BglOSX4v6efaTTjauH3kWs03UPLWXNsfGUVQeSdodpLorjsEnq6VsvlcYXuuaeBS = true;
    }

    @Inject(method={"drawEntity(Lnet/minecraft/client/gui/DrawContext;IIIIIFFFLnet/minecraft/entity/LivingEntity;)V"}, at={@At(value="RETURN")})
    private static void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_332 class_3322, int n, int n2, int n3, int n4, int n5, float f, float f2, float f3, class_1309 class_13092, CallbackInfo callbackInfo) {
        m$$VCHpUNUWWDCidVH9LGEGGy3c73wKiwojWTRqg6BjeAcwplkw15hF1pr29h8eKrKXw3Qak6pr08a5lM5OFDfU4IVVMGOau2PTs.m$$SJ9Rt5MncvMPewN442Tk7LhHhGf1JxLH6BglOSX4v6efaTTjauH3kWs03UPLWXNsfGUVQeSdodpLorjsEnq6VsvlcYXuuaeBS = false;
    }

    @ModifyArgs(method={"method_64045"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/entity/EntityRenderDispatcher;render(Lnet/minecraft/entity/Entity;DDDFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"))
    private static void m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9(Args args) {
        if (m$$lugwKEAkepvIkrXqpUkFMdVEN3sZ2ztK5iojUJE7vjUrw995IWHMQauwypMhCZ6WOopNWC1e0QJHlh6N3wIUS1WRvfKzrzZ0X.m$$bDMmmZcltuyXfovSUu765dRWp5rW590XFrpJxTJe8f9eNAOqSuOVg2XN6TcHSveE8xU6IP9CgwsMPtFDduYC6tUASKU9QOCTH) {
            args.set(4, (Object)Float.valueOf(m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge()));
        }
    }
}

