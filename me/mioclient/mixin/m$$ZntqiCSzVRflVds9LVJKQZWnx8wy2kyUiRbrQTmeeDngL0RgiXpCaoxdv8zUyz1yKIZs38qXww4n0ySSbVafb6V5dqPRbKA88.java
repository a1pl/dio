package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.blaze3d.opengl.GlStateManager;
import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$WwQmUVX7Le3ePN8a2a0b1E0J37wg7z9FYdtyhZbiXe6k3FMVY2VQYqvnghErDo8D1Nvpep69xk3D4QJUmHejfOozrJizRJDHT;
import me.mioclient.m$$e16XvkpNf6Fs3Nt21SiZ6ZZXlNwBJkhswnIcMGZQn67hRisqZrXNSSFBYqIeBVwEBCyJVaYAYkDEZHlB9ADbzbPyjLgjaRMTy;
import me.mioclient.m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD;
import me.mioclient.m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA;
import me.mioclient.m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju;
import me.mioclient.m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q;
import me.mioclient.m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_266;
import net.minecraft.class_269;
import net.minecraft.class_310;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_355;
import net.minecraft.class_4061;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import net.minecraft.class_8646;
import net.minecraft.class_9779;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL32C;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_329.class})
public class m$$ZntqiCSzVRflVds9LVJKQZWnx8wy2kyUiRbrQTmeeDngL0RgiXpCaoxdv8zUyz1yKIZs38qXww4n0ySSbVafb6V5dqPRbKA88 {
    private static final m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD m$$7emIro5K2PXykkbOsnlNITjYj2SMJjua8O8MPLXtG9rZHEfZJp6GYlkWuFvIKlg8N2lhydPkccQ2fJAmhympzc0Cg3sGzyzav = (m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$lQ217AfKWaAhR0KRkEt7xfbDyZKa5Nejm95MFzSUs2HZhJUCsyGyloaXDhXBU4O44imbY6pHmmhSj9gbAkeHrHESbinreqKZD.class);
    private static final m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT = (m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q.class);
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$gbEaAjsJFgW8RuGxDwo6RVkSCVEd1WxJs7IihPQETaZ8QapHmqHlQkwHUWxMqQv8y82n5xGw6hk8cASfV5glygd0PsIl4ulTH = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    private static final m$$e16XvkpNf6Fs3Nt21SiZ6ZZXlNwBJkhswnIcMGZQn67hRisqZrXNSSFBYqIeBVwEBCyJVaYAYkDEZHlB9ADbzbPyjLgjaRMTy m$$hvhnTqjAhB4fbfcnxTG5LN3wOzfeEXoNPbdyIwfCorKLISMvb9G61KVAxAAoxCLtjb7QVmzOgfxSeYRlv4FPg7atgBdw1bGqD = (m$$e16XvkpNf6Fs3Nt21SiZ6ZZXlNwBJkhswnIcMGZQn67hRisqZrXNSSFBYqIeBVwEBCyJVaYAYkDEZHlB9ADbzbPyjLgjaRMTy)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$e16XvkpNf6Fs3Nt21SiZ6ZZXlNwBJkhswnIcMGZQn67hRisqZrXNSSFBYqIeBVwEBCyJVaYAYkDEZHlB9ADbzbPyjLgjaRMTy.class);
    private static final m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju m$$RN3bsUqkEaQjiBIPJeYmHHPuQqeH98Ix9VInB0dKw8Nzgh8kNZeI1cY7I42usNv4IsRh3Dl5z73XTODW9KhYZYyOmaoAO2bPd = (m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju.class);
    @Shadow
    @Final
    private class_355 field_2015;
    @Shadow
    @Final
    private class_310 field_2035;

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_332 class_3322, class_9779 class_97792, CallbackInfo callbackInfo) {
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Inject(method={"renderPlayerList"}, at={@At(value="HEAD")})
    public void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_332 class_3322, class_9779 class_97792, CallbackInfo callbackInfo) {
        m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR(class_310.method_1551().field_1755 instanceof class_408 ? 12.0f : 0.0f, 890069639);
        if (class_310.method_1551().field_1705.method_53531().method_53536() || class_310.method_1551().field_1690.field_1842) {
            return;
        }
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(1.0f, 1.0f, 1.0f, 1.0f);
        class_3322.method_25294(-1, -1, 0, 0, 0);
        GlStateManager._disableDepthTest();
        GlStateManager._enableBlend();
        GlStateManager._disableCull();
        GL32C.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        m$$WwQmUVX7Le3ePN8a2a0b1E0J37wg7z9FYdtyhZbiXe6k3FMVY2VQYqvnghErDo8D1Nvpep69xk3D4QJUmHejfOozrJizRJDHT m$$WwQmUVX7Le3ePN8a2a0b1E0J37wg7z9FYdtyhZbiXe6k3FMVY2VQYqvnghErDo8D1Nvpep69xk3D4QJUmHejfOozrJizRJDHT = m$$WwQmUVX7Le3ePN8a2a0b1E0J37wg7z9FYdtyhZbiXe6k3FMVY2VQYqvnghErDo8D1Nvpep69xk3D4QJUmHejfOozrJizRJDHT.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_3322.method_51448(), class_3322, m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge());
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$WwQmUVX7Le3ePN8a2a0b1E0J37wg7z9FYdtyhZbiXe6k3FMVY2VQYqvnghErDo8D1Nvpep69xk3D4QJUmHejfOozrJizRJDHT);
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB();
        GlStateManager._enableDepthTest();
        GL11.glDisable((int)2848);
    }

    @Inject(method={"renderHeldItemTooltip(Lnet/minecraft/client/gui/DrawContext;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_332 class_3322, CallbackInfo callbackInfo) {
        if (m$$gbEaAjsJFgW8RuGxDwo6RVkSCVEd1WxJs7IihPQETaZ8QapHmqHlQkwHUWxMqQv8y82n5xGw6hk8cASfV5glygd0PsIl4ulTH.isToggled() && ((Boolean)m$$ZntqiCSzVRflVds9LVJKQZWnx8wy2kyUiRbrQTmeeDngL0RgiXpCaoxdv8zUyz1yKIZs38qXww4n0ySSbVafb6V5dqPRbKA88.m$$gbEaAjsJFgW8RuGxDwo6RVkSCVEd1WxJs7IihPQETaZ8QapHmqHlQkwHUWxMqQv8y82n5xGw6hk8cASfV5glygd0PsIl4ulTH.m$$ZeCKs8Xc8vUwzmun5CXqilPCqqShg0f3AlpgdLou0uzlfIZsQpdGggYhDeCMu1rjKae8AICbcWM1yKbQVMaontKmi1gQn8cdW.getValue()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderStatusEffectOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$si2aX2X8Dch8BrpPv8C89mK3tHVjy6by3nrWOWcgTRS3w0VNjCaT6TzOK1vZM0JWisN0y7s9j2U6LywGMjYOWySMMEgPZT7WH(class_332 class_3322, class_9779 class_97792, CallbackInfo callbackInfo) {
        if (m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.isToggled() && m$$ZntqiCSzVRflVds9LVJKQZWnx8wy2kyUiRbrQTmeeDngL0RgiXpCaoxdv8zUyz1yKIZs38qXww4n0ySSbVafb6V5dqPRbKA88.m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$RI78TtZeK47V7fKOfZ8cTgdzDQ2KMuVwzZW5xHxi7Q1yCev8bHgPcXlqWZtEgaJHyJwDNXxndlNrBdVUVwVJGryz6vN2UK3tU.getValue() == m$$zqZ6ERKL8aNGtzuf4dz8cXvw1rv61SI8tVP4RFCtUjd1oOwgjk4FRksEeuka79ESNZP2gjSkdVXIgTFoS1Tpsem3IMKZ4Ul4q$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$XhlRfteULgTwKLPQEZiEgBbgIHjxlAGeRwXtZT8E6PHzl8v0kme1pDQ8zrVvabEwAXkdZYUQKENXdFN1QtmCiZllNwwcjBIke) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderCrosshair"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$C7jwyCZGOGmxYHR6CinqHYKGpwwojfCUt8uyzjRA2awICUF3ogkSBtJt9OZZ5TwdqY7XMH0WNbqisrPkOMONx1NLAAWZsoOL0(class_332 class_3322, class_9779 class_97792, CallbackInfo callbackInfo) {
        if (m$$hvhnTqjAhB4fbfcnxTG5LN3wOzfeEXoNPbdyIwfCorKLISMvb9G61KVAxAAoxCLtjb7QVmzOgfxSeYRlv4FPg7atgBdw1bGqD.isToggled()) {
            callbackInfo.cancel();
        }
    }

    @ModifyExpressionValue(method={"renderCrosshair"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/option/SimpleOption;getValue()Ljava/lang/Object;", ordinal=1)})
    public Object m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(Object object) {
        if (m$$RN3bsUqkEaQjiBIPJeYmHHPuQqeH98Ix9VInB0dKw8Nzgh8kNZeI1cY7I42usNv4IsRh3Dl5z73XTODW9KhYZYyOmaoAO2bPd.isToggled()) {
            return class_4061.field_18151;
        }
        return object;
    }

    @Inject(method={"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_332 class_3322, class_266 class_2662, CallbackInfo callbackInfo) {
        if (m$$gbEaAjsJFgW8RuGxDwo6RVkSCVEd1WxJs7IihPQETaZ8QapHmqHlQkwHUWxMqQv8y82n5xGw6hk8cASfV5glygd0PsIl4ulTH.isToggled() && ((Boolean)m$$ZntqiCSzVRflVds9LVJKQZWnx8wy2kyUiRbrQTmeeDngL0RgiXpCaoxdv8zUyz1yKIZs38qXww4n0ySSbVafb6V5dqPRbKA88.m$$gbEaAjsJFgW8RuGxDwo6RVkSCVEd1WxJs7IihPQETaZ8QapHmqHlQkwHUWxMqQv8y82n5xGw6hk8cASfV5glygd0PsIl4ulTH.m$$LiYZa5aXEqw01cLBmwbNh8mw8ZwFUeRKbpbEEST5zVhAMTagU9sZOAHk2IOLXWe6vkLbWPbmkUNqOn0cejedbJwaSmY9cjbUY.getValue()).booleanValue()) {
            callbackInfo.cancel();
        }
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416((float)(-Math.max(m$$VcPWjgvlrp1fLa2WRXNtpH3ZGhycwHMbiAOYIpqHkHyVWkplfHtQaLgZxMQENPXZkEfSDCq2Ln4ndWrsOop2DD5FilfB62RRT.m$$XNjI4qTMOGw7jbW2N5fRxDQEtQR1shDnrvowi5A5jk4fWW555ygWHEonPF4Yv4AEwgwr6XAAwEX7CSi2zcv3K88lccpZ8HqIS(2047110165) - 1, 0)), 0.0f, 0.0f);
    }

    @Inject(method={"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"}, at={@At(value="TAIL")}, cancellable=true)
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_332 class_3322, class_266 class_2662, CallbackInfo callbackInfo) {
        class_3322.method_51448().method_22909();
    }

    @Inject(method={"renderOverlayMessage"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU(class_332 class_3322, class_9779 class_97792, CallbackInfo callbackInfo) {
        if (m$$gbEaAjsJFgW8RuGxDwo6RVkSCVEd1WxJs7IihPQETaZ8QapHmqHlQkwHUWxMqQv8y82n5xGw6hk8cASfV5glygd0PsIl4ulTH.isToggled() && ((Boolean)m$$ZntqiCSzVRflVds9LVJKQZWnx8wy2kyUiRbrQTmeeDngL0RgiXpCaoxdv8zUyz1yKIZs38qXww4n0ySSbVafb6V5dqPRbKA88.m$$gbEaAjsJFgW8RuGxDwo6RVkSCVEd1WxJs7IihPQETaZ8QapHmqHlQkwHUWxMqQv8y82n5xGw6hk8cASfV5glygd0PsIl4ulTH.m$$RnGUx5HTx5hbGEDkSc3Z0bVO6Iglk6GTzdD2KGSplX3ELDvm3rjMgO9sxCsyUWwDxV8zzwUDbScpkI3LQTNKb37arqgfOwD39.getValue()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderPlayerList"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$To3vhJ3WNHdOvPenZy6hBvuDgvoeXq6w8509uDqfBHJUZabEDFnEF0ubsZKnh9UBXReXrwigjnISrN3BxsODfNDDLhjE5DEVb(class_332 class_3322, class_9779 class_97792, CallbackInfo callbackInfo) {
        if (!m$$7emIro5K2PXykkbOsnlNITjYj2SMJjua8O8MPLXtG9rZHEfZJp6GYlkWuFvIKlg8N2lhydPkccQ2fJAmhympzc0Cg3sGzyzav.isToggled() || !((Boolean)m$$ZntqiCSzVRflVds9LVJKQZWnx8wy2kyUiRbrQTmeeDngL0RgiXpCaoxdv8zUyz1yKIZs38qXww4n0ySSbVafb6V5dqPRbKA88.m$$7emIro5K2PXykkbOsnlNITjYj2SMJjua8O8MPLXtG9rZHEfZJp6GYlkWuFvIKlg8N2lhydPkccQ2fJAmhympzc0Cg3sGzyzav.m$$gyLYgWdG98Ossbr9YmHHXFVSEzSNXMF5HS6nzYk5OlMVXb1KmTfXOZj6h0QOliILaHL7z5QmznA2nSQoWPYJlohNjeUnsvoqq.getValue()).booleanValue()) {
            return;
        }
        callbackInfo.cancel();
        class_269 class_2694 = this.field_2035.field_1687.method_8428();
        class_266 class_2662 = class_2694.method_1189(class_8646.field_45156);
        class_4587 class_45872 = class_3322.method_51448();
        float f = m$$7emIro5K2PXykkbOsnlNITjYj2SMJjua8O8MPLXtG9rZHEfZJp6GYlkWuFvIKlg8N2lhydPkccQ2fJAmhympzc0Cg3sGzyzav.m$$N8hPbzSKJDwZwZthJwbfaM24AvC70nl3El3HHTzMAEAGlBtFp45XcT6f5EFOOFZ0Mqdp3c720J6FkHhvl28jeS09TGvbARDnm(-2021088531);
        if (f == 0.0f) {
            return;
        }
        class_45872.method_22903();
        class_45872.method_46416(0.0f, (1.0f - f) * (float)(-class_3322.method_51443()), 0.0f);
        this.field_2015.method_1919(class_3322, class_3322.method_51421(), class_2694, class_2662);
        class_45872.method_22909();
    }

    @ModifyArgs(method={"renderMiscOverlays"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/hud/InGameHud;renderOverlay(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/util/Identifier;F)V", ordinal=0))
    private void m$$bhjmIQJ3z9GdMzjNLx0s0qiWLozkMDSSmjPx8lqlfaVFoMnTejLBQyrZKbp8kinqb4190vFHMH2GRYh4QHxskU6uUoO0z66vW(Args args) {
        if (m$$gbEaAjsJFgW8RuGxDwo6RVkSCVEd1WxJs7IihPQETaZ8QapHmqHlQkwHUWxMqQv8y82n5xGw6hk8cASfV5glygd0PsIl4ulTH.isToggled() && ((Boolean)m$$ZntqiCSzVRflVds9LVJKQZWnx8wy2kyUiRbrQTmeeDngL0RgiXpCaoxdv8zUyz1yKIZs38qXww4n0ySSbVafb6V5dqPRbKA88.m$$gbEaAjsJFgW8RuGxDwo6RVkSCVEd1WxJs7IihPQETaZ8QapHmqHlQkwHUWxMqQv8y82n5xGw6hk8cASfV5glygd0PsIl4ulTH.m$$8CV8a85SDAGQio9hjG9UlxmwRlH15JeGS2zjcAGXUngaSadL0HbsuMX4F5QqsMrNaavgjkIoPILl6ufPhLHoMp4RGvJ4KG5Qq.getValue()).booleanValue()) {
            args.set(2, (Object)Float.valueOf(0.0f));
        }
    }
}

