package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT;
import me.mioclient.m$$JWkE1vFfNBqsaajSliM41PCH12JzaVx7aOFnkJ8MGcJusUH5vklvWPh36kE7OpUjZt6VAgAWcOqtHPG9t22Y4WDHmf4U3vtyX;
import me.mioclient.m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF;
import me.mioclient.m$$lnDF2xI8YidbRK8zBib8oQvfxCnz43Uhz3dOw8j4F2C4YWOxfO5UE5QjNx4ZhiXBvIDFC1Y5ip7irevRiUZ7hWpHoF9cwCqQL;
import net.minecraft.class_10014;
import net.minecraft.class_10017;
import net.minecraft.class_1297;
import net.minecraft.class_630;
import net.minecraft.class_9946;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={class_9946.class})
public class m$$PjcpaOoCllt7z1H6dQL3rUihYA0cavBJ6aUiKTF9aI4zibTEqXvGvIuz9nuV70CJP76AmQ2AviW7xb3dUgUQZmZaiwHnwCwrF {
    private static final m$$JWkE1vFfNBqsaajSliM41PCH12JzaVx7aOFnkJ8MGcJusUH5vklvWPh36kE7OpUjZt6VAgAWcOqtHPG9t22Y4WDHmf4U3vtyX m$$YcIk0d5zEr1E3gPx8bKssJDaP7bKiqf6MFq2o9TQ8oOVUNnwOsh3aOpV69cLEwDW9EtvicX0SBW36A9dvLLzkY6VZ0eM4ty7o = (m$$JWkE1vFfNBqsaajSliM41PCH12JzaVx7aOFnkJ8MGcJusUH5vklvWPh36kE7OpUjZt6VAgAWcOqtHPG9t22Y4WDHmf4U3vtyX)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$JWkE1vFfNBqsaajSliM41PCH12JzaVx7aOFnkJ8MGcJusUH5vklvWPh36kE7OpUjZt6VAgAWcOqtHPG9t22Y4WDHmf4U3vtyX.class);
    private static final m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF m$$hcsj8NG3KtwSoxcYVG1ZxsafrVLvKZ1CP76Z0GTJEvxCG9JRfM2W3mVAgt0pBmaRrdq8APIH7AFOCezfPDVxNiEVcZu2J7DJH = (m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF.class);
    @Shadow
    @Final
    public class_630 field_52899;
    @Shadow
    @Final
    public class_630 field_52901;
    @Shadow
    @Final
    public class_630 field_52900;
    @Shadow
    @Final
    public class_630 field_52902;

    @ModifyExpressionValue(method={"setAngles(Lnet/minecraft/client/render/entity/state/EndCrystalEntityRenderState;)V"}, at={@At(value="FIELD", target="Lnet/minecraft/client/render/entity/state/EndCrystalEntityRenderState;age:F", ordinal=0)}, require=0)
    private float m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(float f, @Local(argsOnly=true) class_10014 class_100142) {
        return f * this.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_100142);
    }

    @Unique
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_630 class_6302, boolean bl) {
        class_6302.field_38456 = bl;
    }

    @Unique
    private float m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_10014 class_100142) {
        class_1297 class_12972 = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_10017)class_100142);
        float f = 1.0f;
        if (class_12972.field_6012 < 10 && m$$YcIk0d5zEr1E3gPx8bKssJDaP7bKiqf6MFq2o9TQ8oOVUNnwOsh3aOpV69cLEwDW9EtvicX0SBW36A9dvLLzkY6VZ0eM4ty7o.isToggled() && ((Boolean)m$$PjcpaOoCllt7z1H6dQL3rUihYA0cavBJ6aUiKTF9aI4zibTEqXvGvIuz9nuV70CJP76AmQ2AviW7xb3dUgUQZmZaiwHnwCwrF.m$$YcIk0d5zEr1E3gPx8bKssJDaP7bKiqf6MFq2o9TQ8oOVUNnwOsh3aOpV69cLEwDW9EtvicX0SBW36A9dvLLzkY6VZ0eM4ty7o.m$$3Ya1pqTVjg27Z8BuNxVGkcrYXm80AyAzy6PRUjrDwa1Hs76Wxj9Vx1HELXGyO4zj9LewiRHznhIPJak5Fr6RHWwbWoe0MDVtp.getValue()).booleanValue() && ((m$$lnDF2xI8YidbRK8zBib8oQvfxCnz43Uhz3dOw8j4F2C4YWOxfO5UE5QjNx4ZhiXBvIDFC1Y5ip7irevRiUZ7hWpHoF9cwCqQL)class_12972).isMioAttacked()) {
            f *= 1.5f;
        }
        if (!m$$hcsj8NG3KtwSoxcYVG1ZxsafrVLvKZ1CP76Z0GTJEvxCG9JRfM2W3mVAgt0pBmaRrdq8APIH7AFOCezfPDVxNiEVcZu2J7DJH.isToggled() || !((Boolean)m$$PjcpaOoCllt7z1H6dQL3rUihYA0cavBJ6aUiKTF9aI4zibTEqXvGvIuz9nuV70CJP76AmQ2AviW7xb3dUgUQZmZaiwHnwCwrF.m$$hcsj8NG3KtwSoxcYVG1ZxsafrVLvKZ1CP76Z0GTJEvxCG9JRfM2W3mVAgt0pBmaRrdq8APIH7AFOCezfPDVxNiEVcZu2J7DJH.m$$aledMj3EVojCvJqDfo2trqdWNBeytdwr8EPWWlCD7yLjPLVBK7wGdFafsd4MO1iN6GDjp6VYBn67YAMrcr6cfHr5tVyItb2bn.getValue()).booleanValue()) {
            return f;
        }
        this.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(this.field_52899, m$$hcsj8NG3KtwSoxcYVG1ZxsafrVLvKZ1CP76Z0GTJEvxCG9JRfM2W3mVAgt0pBmaRrdq8APIH7AFOCezfPDVxNiEVcZu2J7DJH.m$$ngwg8fTtoOoDXHuvM7rQ6l7gngZbp1iZUdtAfFU14IzEqfuGgJFAdZPT3KarwIDr7AGhdLNcCUrLz0FBv5C6tAEQ7NAYSEl2T(0, -624792181));
        this.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(this.field_52900, m$$hcsj8NG3KtwSoxcYVG1ZxsafrVLvKZ1CP76Z0GTJEvxCG9JRfM2W3mVAgt0pBmaRrdq8APIH7AFOCezfPDVxNiEVcZu2J7DJH.m$$ngwg8fTtoOoDXHuvM7rQ6l7gngZbp1iZUdtAfFU14IzEqfuGgJFAdZPT3KarwIDr7AGhdLNcCUrLz0FBv5C6tAEQ7NAYSEl2T(1, -624792181));
        this.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(this.field_52901, m$$hcsj8NG3KtwSoxcYVG1ZxsafrVLvKZ1CP76Z0GTJEvxCG9JRfM2W3mVAgt0pBmaRrdq8APIH7AFOCezfPDVxNiEVcZu2J7DJH.m$$ngwg8fTtoOoDXHuvM7rQ6l7gngZbp1iZUdtAfFU14IzEqfuGgJFAdZPT3KarwIDr7AGhdLNcCUrLz0FBv5C6tAEQ7NAYSEl2T(2, -624792181));
        this.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(this.field_52902, m$$hcsj8NG3KtwSoxcYVG1ZxsafrVLvKZ1CP76Z0GTJEvxCG9JRfM2W3mVAgt0pBmaRrdq8APIH7AFOCezfPDVxNiEVcZu2J7DJH.m$$ngwg8fTtoOoDXHuvM7rQ6l7gngZbp1iZUdtAfFU14IzEqfuGgJFAdZPT3KarwIDr7AGhdLNcCUrLz0FBv5C6tAEQ7NAYSEl2T(3, -624792181));
        return f *= ((Float)m$$PjcpaOoCllt7z1H6dQL3rUihYA0cavBJ6aUiKTF9aI4zibTEqXvGvIuz9nuV70CJP76AmQ2AviW7xb3dUgUQZmZaiwHnwCwrF.m$$hcsj8NG3KtwSoxcYVG1ZxsafrVLvKZ1CP76Z0GTJEvxCG9JRfM2W3mVAgt0pBmaRrdq8APIH7AFOCezfPDVxNiEVcZu2J7DJH.m$$xQ2ABiW76D6QQmuDk4HLbkEOJuV1wuqNijozjhYfnhjVD5gpG3cqhS2HscQJnesX4Cs7mqokwofRCuW5e3sexNjF1lsYxZTDr.getValue()).floatValue();
    }
}

