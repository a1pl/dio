package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$Ukv0Bo29jyLAefxSUeHHYVxg6eQiVaQCRiS2MUgD38SNAL8tn6uxJ8ZusP4GYoKpHtFifbk3Pmi4yqW1PJDXPtZkF9qd6s7YT;
import net.minecraft.class_2382;
import net.minecraft.class_2586;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_824;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_824.class})
public class m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL {
    private static final m$$Ukv0Bo29jyLAefxSUeHHYVxg6eQiVaQCRiS2MUgD38SNAL8tn6uxJ8ZusP4GYoKpHtFifbk3Pmi4yqW1PJDXPtZkF9qd6s7YT m$$fR6eEarIPxvybR1zV4KkcbhQRgMmTBM3M3Em5rMRZPJBe6vWUTmeR70l4mHSeN304bm1lz8s4uMydpwWnakD21Fe6wibSyEN1 = (m$$Ukv0Bo29jyLAefxSUeHHYVxg6eQiVaQCRiS2MUgD38SNAL8tn6uxJ8ZusP4GYoKpHtFifbk3Pmi4yqW1PJDXPtZkF9qd6s7YT)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$Ukv0Bo29jyLAefxSUeHHYVxg6eQiVaQCRiS2MUgD38SNAL8tn6uxJ8ZusP4GYoKpHtFifbk3Pmi4yqW1PJDXPtZkF9qd6s7YT.class);
    private static m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG norender = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);

    @Inject(method={"render(Lnet/minecraft/block/entity/BlockEntity;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2586 class_25862, float f, class_4587 class_45872, class_4597 class_45972, CallbackInfo callbackInfo) {
        if (((Boolean)m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.norender.m$$z9VB6etm2oHxD8EGpio8ZeC9sTuNWxIWFyvoQ3saO1ey7zLirlQ1YBfjHscYRar3URNq8oFOVc7WRIb8SdBCfJdXzjFZpW1rO.getValue()).booleanValue() && m$$fR6eEarIPxvybR1zV4KkcbhQRgMmTBM3M3Em5rMRZPJBe6vWUTmeR70l4mHSeN304bm1lz8s4uMydpwWnakD21Fe6wibSyEN1.m$$VQCEqRDVeXcU87Asf8sbMURXfgFCXpMFONnNYXDivbBwIiT9wreXeiSsMQIousxAUQ3u3C3KTMY7avZSkuyHh1nypDtfTHKl2(-1520820562)) {
            return;
        }
        if (norender.isToggled() && ((Boolean)m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.norender.m$$lRNLz7Mlhrfl7iItdIMJAU2FPgTYuRECEJqRRNp304pZaPKdta6m59KcjOXsaLWypQ9JCJeyOxaqR8XftlUWb6oWDzwjIUoRw.getValue()).booleanValue() && class_25862.method_11016().method_10262((class_2382)class_310.method_1551().field_1773.method_19418().method_19328()) > (double)((Integer)m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.norender.m$$ZMNSPStN70vGj4OKBj0yHz2ZUHd8La2ZkqeSPMc7iWAI0HHPL7E6TMwDwwO6xPWtQRiRfZNOxS565t7aMIQxLdAV5v7GRE9g7.getValue() * (Integer)m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL.norender.m$$ZMNSPStN70vGj4OKBj0yHz2ZUHd8La2ZkqeSPMc7iWAI0HHPL7E6TMwDwwO6xPWtQRiRfZNOxS565t7aMIQxLdAV5v7GRE9g7.getValue())) {
            callbackInfo.cancel();
        }
    }
}

