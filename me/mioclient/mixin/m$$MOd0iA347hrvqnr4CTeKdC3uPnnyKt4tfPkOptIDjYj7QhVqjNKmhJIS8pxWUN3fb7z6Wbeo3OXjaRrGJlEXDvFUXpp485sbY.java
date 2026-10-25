package me.mioclient.mixin;

import me.mioclient.m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$9NFH4EUHl8oPJ7PQb9O53MXTzJw4cAzBSg2Utl5roVK9YFPjFttRqx9guvXWFS8s1qhSwjeGtvAenEofIhyOnjqTUdEvhUPyO;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb;
import me.mioclient.m$$i2CswpEpUFXqIhC1UG4rnMhlSFUaEy6zBcg2FaUerrBEh86Cv5NKUdX1WmsoXFyYKTO1nS6T0sQ2BJbyp5mBe1EyEiOx2pKyo;
import me.mioclient.m$$o5Ym7YA3l6kqQzpgFcFW1QohtbfmeKt79Xp0rNwE3ZcHsXCpBoM7ENC2VTFBWIcVHYvhXdkNMb8ls60ditGQfnIpoRYq5PQfm;
import net.minecraft.class_4668;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_4668.class})
public class m$$MOd0iA347hrvqnr4CTeKdC3uPnnyKt4tfPkOptIDjYj7QhVqjNKmhJIS8pxWUN3fb7z6Wbeo3OXjaRrGJlEXDvFUXpp485sbY {
    private static final m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb m$$jKE8rPfAyHwfawN6Z7OubGQhbpRDN61kYdsrUpp4lmIFyMFVGHYoRWVBWiL2W3KrqQnQRKs3or6w0hdJlqBsYwtcvGIiLLrC7 = (m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.class);
    private static final String m$$ib2tfkMQCI0JJ7WxMKaNF7vnVldsBXwdZmF6K0wQtu1cCqvH8DdqkDvF6Vj0Y6A4ewvEjeDEveQDYlElGuKRTiK87fDgppJp7 = "glint_texturing";
    @Unique
    private boolean m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A;

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(String string, Runnable runnable, Runnable runnable2, CallbackInfo callbackInfo) {
        this.m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A = string.contains(m$$ib2tfkMQCI0JJ7WxMKaNF7vnVldsBXwdZmF6K0wQtu1cCqvH8DdqkDvF6Vj0Y6A4ewvEjeDEveQDYlElGuKRTiK87fDgppJp7);
    }

    @ModifyArgs(method={"setupGlintTexturing"}, at=@At(value="INVOKE", target="Lorg/joml/Matrix4f;scale(F)Lorg/joml/Matrix4f;"))
    private static void m$$aaBlY2kZSTnSIK1CuOck1jRFfz4npfVQgapsxmjpEOH3k3140z22GhCd9BxFH0wp65wK68VXMkP80vOeJVZORXkiMwdLCa3DZ(Args args) {
        m$$i2CswpEpUFXqIhC1UG4rnMhlSFUaEy6zBcg2FaUerrBEh86Cv5NKUdX1WmsoXFyYKTO1nS6T0sQ2BJbyp5mBe1EyEiOx2pKyo m$$i2CswpEpUFXqIhC1UG4rnMhlSFUaEy6zBcg2FaUerrBEh86Cv5NKUdX1WmsoXFyYKTO1nS6T0sQ2BJbyp5mBe1EyEiOx2pKyo = m$$i2CswpEpUFXqIhC1UG4rnMhlSFUaEy6zBcg2FaUerrBEh86Cv5NKUdX1WmsoXFyYKTO1nS6T0sQ2BJbyp5mBe1EyEiOx2pKyo.m$$7zIhH8pDMLUqya95tmYRyqaN0uNzh62dzgYC22TCv4yHyse6OvmAYbPMn8DeE5eUQ8rEGCJXephJAmokN4Io39BQBLLCscm6s();
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$i2CswpEpUFXqIhC1UG4rnMhlSFUaEy6zBcg2FaUerrBEh86Cv5NKUdX1WmsoXFyYKTO1nS6T0sQ2BJbyp5mBe1EyEiOx2pKyo);
        args.set(0, (Object)Float.valueOf(((Float)args.get(0)).floatValue() * m$$i2CswpEpUFXqIhC1UG4rnMhlSFUaEy6zBcg2FaUerrBEh86Cv5NKUdX1WmsoXFyYKTO1nS6T0sQ2BJbyp5mBe1EyEiOx2pKyo.m$$e6ZUo1gOVrqaQwJ3mTe8it7nWuyGBy2wVcjlmcttb6btkD3Uwp23KdNBYATfgoJ2KD6TRQcQPXfB8FtrMqROVuuliljDkfElJ()));
    }

    @ModifyArgs(method={"setupGlintTexturing"}, at=@At(value="INVOKE", target="Lorg/joml/Matrix4f;translation(FFF)Lorg/joml/Matrix4f;", remap=false))
    private static void m$$Ak2eHYNVXPpGK8pnbRug4YxH1DLIhPJTEbYJxGY0mpn9PkRvhXgzLebzvirC4RkacUFYgacnWBiWLqbtiUmwVe7wD2qf4mg8K(Args args) {
        if (m$$MOd0iA347hrvqnr4CTeKdC3uPnnyKt4tfPkOptIDjYj7QhVqjNKmhJIS8pxWUN3fb7z6Wbeo3OXjaRrGJlEXDvFUXpp485sbY.m$$jKE8rPfAyHwfawN6Z7OubGQhbpRDN61kYdsrUpp4lmIFyMFVGHYoRWVBWiL2W3KrqQnQRKs3or6w0hdJlqBsYwtcvGIiLLrC7.m$$fbkZRCcwyPCACa5QbgpmGM54HzTnb3D8O5v6klYzZVK5W9xIi6qU145sPIx3k9CnQIhSUPoCE8sGz6qWpo0hOT6RfG2MDq5zv.m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q(-778424060) && m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.m$$3gAvoKHheKqBNavJhpWc8US32intTsPUmtMkceNfqfYJKX2l6CODwm1YTbXQZDhT8obUpZhcU3fGPiy46wk4ePNd91B32OwXw) {
            float f = (float)((Integer)m$$MOd0iA347hrvqnr4CTeKdC3uPnnyKt4tfPkOptIDjYj7QhVqjNKmhJIS8pxWUN3fb7z6Wbeo3OXjaRrGJlEXDvFUXpp485sbY.m$$jKE8rPfAyHwfawN6Z7OubGQhbpRDN61kYdsrUpp4lmIFyMFVGHYoRWVBWiL2W3KrqQnQRKs3or6w0hdJlqBsYwtcvGIiLLrC7.m$$hqYZPnDpGV176MgMZFQIXW3QqFXnmJGlgeOboXjZSdinwLAZ6EOOG4kSKQ9XNjGR8Zd4RsaAlvo5VZVocpcjG6IwPAZsiFOIO.getValue()).intValue() / 100.0f;
            args.set(0, (Object)Float.valueOf(-f));
            args.set(1, (Object)Float.valueOf(f));
        }
    }

    @Inject(method={"startDrawing"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$hKuz3sHyuVZTnb8n7ABrLHrsTSpr9CGUTJkn3dUOLdFBQSBiesoMkHtEjYtPndsXLjP4Ct7pWevav93v7X3SJcWl0SnnB9RGH(CallbackInfo callbackInfo) {
        if (m$$o5Ym7YA3l6kqQzpgFcFW1QohtbfmeKt79Xp0rNwE3ZcHsXCpBoM7ENC2VTFBWIcVHYvhXdkNMb8ls60ditGQfnIpoRYq5PQfm.m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8 && m$$o5Ym7YA3l6kqQzpgFcFW1QohtbfmeKt79Xp0rNwE3ZcHsXCpBoM7ENC2VTFBWIcVHYvhXdkNMb8ls60ditGQfnIpoRYq5PQfm.m$$usnzfPeWGy6iAn1uPJLR6UgsJVhf38ORt1lPLe11bmnTdwQdPcmX3d47CHJiqfOhVCdu73R8QDlxYkQQkQDkuxD5AsqWq6mRg(this)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"endDrawing"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz(CallbackInfo callbackInfo) {
        if (m$$o5Ym7YA3l6kqQzpgFcFW1QohtbfmeKt79Xp0rNwE3ZcHsXCpBoM7ENC2VTFBWIcVHYvhXdkNMb8ls60ditGQfnIpoRYq5PQfm.m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8 && m$$o5Ym7YA3l6kqQzpgFcFW1QohtbfmeKt79Xp0rNwE3ZcHsXCpBoM7ENC2VTFBWIcVHYvhXdkNMb8ls60ditGQfnIpoRYq5PQfm.m$$usnzfPeWGy6iAn1uPJLR6UgsJVhf38ORt1lPLe11bmnTdwQdPcmX3d47CHJiqfOhVCdu73R8QDlxYkQQkQDkuxD5AsqWq6mRg(this)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"startDrawing"}, at={@At(value="TAIL")})
    private void m$$pYiEn7YpSQwtOdZQNVwHwRCnqbsaCV5kwkpxcYDBuVzHYWZ76HB1P2RYchodxXvVdrY5vNBaQWT6SiJ3eLt72CXanPHJTS0Qx(CallbackInfo callbackInfo) {
        if (!this.m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A) {
            return;
        }
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(new m$$9NFH4EUHl8oPJ7PQb9O53MXTzJw4cAzBSg2Utl5roVK9YFPjFttRqx9guvXWFS8s1qhSwjeGtvAenEofIhyOnjqTUdEvhUPyO(m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$sQwB8Gn4SsL46dO2Upi4yBLYPCnKWOlOaSGrxKbwA1RWaIibNyrn6OSioUC20gJrJQ0HrgfZY1nKYe7wPwvGZ4a6oZ3eJBH69));
    }

    @Inject(method={"endDrawing"}, at={@At(value="TAIL")})
    private void m$$923zeYSFHVmChhRqd9bXSv42QHyCYnFZBY0Q444Tbq3eOtbF7eNgkqzgD1WTtbLdHfknIm4XLR0jf5dOxUfYqyObAXruX8D11(CallbackInfo callbackInfo) {
        if (!this.m$$2cYMky39mwndptegkjLw70A3j9PH3hRKx5DC9AeB5wbxGpRRMnubaRojwfJK4VmCwQgW5MVKmZwQItLeUL8WA4rUxGj5bRf9A) {
            return;
        }
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(new m$$9NFH4EUHl8oPJ7PQb9O53MXTzJw4cAzBSg2Utl5roVK9YFPjFttRqx9guvXWFS8s1qhSwjeGtvAenEofIhyOnjqTUdEvhUPyO(m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$cLoz4UwY1GSOQzXYErRtEVYBhrEoLPlj4BbRpZV1TLY7qk3wQNZabEq1LQPwG2CSYkgd7XrSLVNpuykeq21bMvSkKk4Fe5RrY));
    }
}

