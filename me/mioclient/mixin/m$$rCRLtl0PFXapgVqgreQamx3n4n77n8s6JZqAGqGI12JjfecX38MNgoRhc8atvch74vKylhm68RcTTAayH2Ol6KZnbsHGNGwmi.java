package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$zT1UgsJzzIatZSESgG7E7Yo3y3xWh8PI4OEM7rvhiTcMAeI7EEQfffo9ZTFd6Zn8RxMOGLpXiKQtxerKQ8JIl9n6AwvWk2FCn;
import net.minecraft.class_310;
import net.minecraft.class_5223;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value={class_5223.class})
public class m$$rCRLtl0PFXapgVqgreQamx3n4n77n8s6JZqAGqGI12JjfecX38MNgoRhc8atvch74vKylhm68RcTTAayH2Ol6KZnbsHGNGwmi {
    private static final m$$zT1UgsJzzIatZSESgG7E7Yo3y3xWh8PI4OEM7rvhiTcMAeI7EEQfffo9ZTFd6Zn8RxMOGLpXiKQtxerKQ8JIl9n6AwvWk2FCn m$$2BLr9gnA4PfldZrnhNHzm6mdgW9q28mrn1WT8BE2T9fFWisKT9BGcpqpHlsfQA9L9gJaQlcHJsX1r3yFtPfkadyM3RLFgGAyt = (m$$zT1UgsJzzIatZSESgG7E7Yo3y3xWh8PI4OEM7rvhiTcMAeI7EEQfffo9ZTFd6Zn8RxMOGLpXiKQtxerKQ8JIl9n6AwvWk2FCn)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$zT1UgsJzzIatZSESgG7E7Yo3y3xWh8PI4OEM7rvhiTcMAeI7EEQfffo9ZTFd6Zn8RxMOGLpXiKQtxerKQ8JIl9n6AwvWk2FCn.class);

    @ModifyArg(method={"visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z"}, at=@At(value="INVOKE", target="Lnet/minecraft/text/TextVisitFactory;visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z", ordinal=0), index=0)
    private static String m$$si2aX2X8Dch8BrpPv8C89mK3tHVjy6by3nrWOWcgTRS3w0VNjCaT6TzOK1vZM0JWisN0y7s9j2U6LywGMjYOWySMMEgPZT7WH(String string) {
        if (m$$2BLr9gnA4PfldZrnhNHzm6mdgW9q28mrn1WT8BE2T9fFWisKT9BGcpqpHlsfQA9L9gJaQlcHJsX1r3yFtPfkadyM3RLFgGAyt.isToggled() && class_310.method_1551().field_1687 != null) {
            string = m$$2BLr9gnA4PfldZrnhNHzm6mdgW9q28mrn1WT8BE2T9fFWisKT9BGcpqpHlsfQA9L9gJaQlcHJsX1r3yFtPfkadyM3RLFgGAyt.m$$nzR3wXErOwP5iHDKzPT3jmlGr1Yaslxb7NBs2Lp69aJ7ToKjT9binuwLUi7gNokYiLO7NyMw6xaWma9uJniZVXR081lDCwW6S(string, 1767529281);
        }
        return string;
    }
}

