package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA;
import me.mioclient.m$$RniRWXtiAdcmHO4jrec9gSarj6wyTj5Bwm29YZKcItrovIEz2vuqLuswtM62XBOfGpz7J9Je6C21IoEgaK2wxnq7BDMwVLmuo;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R;
import me.mioclient.m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5;
import me.mioclient.m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5;
import me.mioclient.m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1812;
import net.minecraft.class_1819;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_742;
import net.minecraft.class_759;
import net.minecraft.class_7833;
import net.minecraft.class_9334;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_759.class}, priority=9999)
public abstract class m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v {
    private static final m$$RniRWXtiAdcmHO4jrec9gSarj6wyTj5Bwm29YZKcItrovIEz2vuqLuswtM62XBOfGpz7J9Je6C21IoEgaK2wxnq7BDMwVLmuo m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR = (m$$RniRWXtiAdcmHO4jrec9gSarj6wyTj5Bwm29YZKcItrovIEz2vuqLuswtM62XBOfGpz7J9Je6C21IoEgaK2wxnq7BDMwVLmuo)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$RniRWXtiAdcmHO4jrec9gSarj6wyTj5Bwm29YZKcItrovIEz2vuqLuswtM62XBOfGpz7J9Je6C21IoEgaK2wxnq7BDMwVLmuo.class);
    private static final m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R m$$bSHfTqaRAlkoBdiDlsWt9yCTLLEKW9392P9ZC6gfotNQyadQWoNUEYGJYXxIoW960z3Fq0BTLz2x9UYAjxluAyUh16krrQ07x = (m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R.class);
    private static final m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju m$$zoIj6nB6rifoF4BDikqp3Sdg2DS01OuaeZOXtmEN3AAy4QpZI0fybejCe82bx1TKZBLdDp5DwtmDEYnkxtsLPBO8QJeOsHh5d = (m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju.class);
    @Unique
    private static final Vector3f m$$IdmPNGPYzocKrxl7NEZGAyTI52O49JPj6YU8mLBjmECVkiw8EP7PIFNrEDm8DArZyBQLZgQFtBqoJ4W25T2LTvQLb4y9a4WXX = new Vector3f(120.0f, 15.0f, 100.0f);
    @Unique
    private static final Vector3f m$$leYwXIljOaLYaNeEGyA54E2YEMbFTbYDpJLSNylC7dynMleyeFitraQh1ogQ5WIgT8UaHXyAkpoLwQqE94LFXVpPxr9Gz1aA7 = new Vector3f(0.15f, 0.05f, 0.0f);
    @Shadow
    private class_1799 field_4047;
    @Shadow
    private float field_4043;
    @Shadow
    @Final
    private class_310 field_4050;
    @Shadow
    private class_1799 field_4048;
    @Shadow
    private float field_4052;

    @Shadow
    protected abstract void method_3228(class_742 var1, float var2, float var3, class_1268 var4, float var5, class_1799 var6, float var7, class_4587 var8, class_4597 var9, int var10);

    @Inject(method={"renderFirstPersonItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/item/HeldItemRenderer;renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_742 class_7422, float f, float f2, class_1268 class_12682, float f3, class_1799 class_17992, float f4, class_4587 class_45872, class_4597 class_45972, int n, CallbackInfo callbackInfo) {
        boolean bl = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        Vector3f vector3f = new Vector3f(0.0f, 0.0f, 0.0f);
        if (m$$zoIj6nB6rifoF4BDikqp3Sdg2DS01OuaeZOXtmEN3AAy4QpZI0fybejCe82bx1TKZBLdDp5DwtmDEYnkxtsLPBO8QJeOsHh5d.isToggled() && m$$zoIj6nB6rifoF4BDikqp3Sdg2DS01OuaeZOXtmEN3AAy4QpZI0fybejCe82bx1TKZBLdDp5DwtmDEYnkxtsLPBO8QJeOsHh5d.m$$YsXNhQ7xCZVKwqTEQDjU3IULYhwMUtShwWKmtnE03pp8J2HmsN6t6yvCXj8TY2M4sTpzceyZAZEmcxBpeGeZlPP5vz4VJnzfl(1085325415) && (!m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_6115() || m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_6079().method_7909() instanceof class_1819) && m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI(m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_6047(), -267734700)) {
            if (m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_6068() == class_1306.field_6182) {
                vector3f = this.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(m$$IdmPNGPYzocKrxl7NEZGAyTI52O49JPj6YU8mLBjmECVkiw8EP7PIFNrEDm8DArZyBQLZgQFtBqoJ4W25T2LTvQLb4y9a4WXX);
                f5 += m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$leYwXIljOaLYaNeEGyA54E2YEMbFTbYDpJLSNylC7dynMleyeFitraQh1ogQ5WIgT8UaHXyAkpoLwQqE94LFXVpPxr9Gz1aA7.x;
            } else {
                vector3f = m$$IdmPNGPYzocKrxl7NEZGAyTI52O49JPj6YU8mLBjmECVkiw8EP7PIFNrEDm8DArZyBQLZgQFtBqoJ4W25T2LTvQLb4y9a4WXX;
                f5 -= m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$leYwXIljOaLYaNeEGyA54E2YEMbFTbYDpJLSNylC7dynMleyeFitraQh1ogQ5WIgT8UaHXyAkpoLwQqE94LFXVpPxr9Gz1aA7.x;
            }
            f6 += m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$leYwXIljOaLYaNeEGyA54E2YEMbFTbYDpJLSNylC7dynMleyeFitraQh1ogQ5WIgT8UaHXyAkpoLwQqE94LFXVpPxr9Gz1aA7.y;
            bl = true;
        }
        if (m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.isToggled()) {
            boolean bl2;
            boolean bl3 = class_17992.method_57826(class_9334.field_50075) || class_17992.method_7909() instanceof class_1812;
            boolean bl4 = bl2 = m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_6030().method_7909() == class_17992.method_7909();
            if (bl3 && bl2 && m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_6115() && !((Boolean)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$NfV0gwXRHBy73NvYl3L9eWY4NynqD76rwEyUrHmLa19x5hAjmzuH0GP8gQ8UmlCcMptDVcLNNk7i9lVRYhufNnikHA5me9Em8.getValue()).booleanValue()) {
                return;
            }
            if (class_12682 == class_1268.field_5808) {
                f5 += bl3 && bl2 ? 0.0f : -((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$mNHwjdLflNvFXAGoMl84LAt8orbBHj9u4rzx4HyuDVNTmrNELlBfcHeWZrdxGHpAmZ5GmTEXyFST9KgjgLa9VFPkL4NaYcOqd.getValue()).floatValue();
                f6 += ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$5rYhEntpqLVkJuW52dFXGayWP8VzXUhXXsqvHCGzEHBT658wtN9xBB8ohLLCKzXRhgHxXeKTvFoGYWXrwoUvgem6zochhUZ47.getValue()).floatValue();
                float f8 = f7 = bl3 && bl2 ? 0.0f : ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$DTL5CubOrmiiU2ZDxXaecwRQfHHrYea0L7C5iJzte7E2Y8y20HDJH6S4OSlJCCJ67n7VJfLn2rQCmW94BbSInLIPDbhs7hX0X.getValue()).floatValue();
                if (!bl) {
                    vector3f = new Vector3f(((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$88Tz8ktBHHy9RFZdibdA5Bko2UenxKrrtq5ReeoM38TUktIcrGY2WrghzmJFS2gtPM9l4p3OsK9uFhdI00V3T9rUCkQatjNL9.getValue()).floatValue(), ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$ZkKhgZjbadeAp0DFZ7UINxxY718OFGkek9v4HJjgSh3ELMCfmdUqSR6cahqA7PDMFj4ZKey6m8kMJToiQdIj8AsENyLlt21oZ.getValue()).floatValue(), ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$CCWTIqGf8ERCP5Fqd3rfKV17yGIbErizuQOkgKSCupdkHwPgMSznNNQyprLTtAAV9iGlnSkCRnubpY36waouPOXsZ4SosjqTS.getValue()).floatValue());
                }
                class_45872.method_22905(((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$TfOIHD9gPv1zDdk4gCNj7N8JTGJNPd0f6jaAeqkRDWffgaiLN0vV47ZOEbTUKlDU8DINYOjnAVn3M9SrElqE8BL7H8r8DRuNs.getValue()).floatValue(), ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$Fg3OyIjILPDfYNaTXBTtTC6cOWXyMjZAtARjhFIJ24NpRdrSNTonBJ1a3qcNwB9FhA3Y06dpa0mm51g7k6UckyTLdbmzdXde4.getValue()).floatValue(), ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$a3nmk0vrertVRXxTetiYl5Ewb8xWbux0qXNzKGwbl4aSgmOwEUR85pE8apkZMfUx6zthu6Cpi0qvyoHu7WR3Bav3ZfeHHnTxc.getValue()).floatValue());
            } else {
                f5 += bl3 && bl2 ? 0.0f : ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$2Lp5TBfgGPjJnnx8QZx05kplgIEvfLk6ZARHRQJ86RoRL7jkLA7CoLXi5QJuNmaBWZKgMVdOLktPzG5eum3uCo5mXED59pYob.getValue()).floatValue();
                f6 = ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$PB7bmToWj9e1OPnR5lmRNa6OIg6ehPeJnRmIprSss1XM8EuGpdE028bAiDVzw2NLss9heUD2cuEWwC3HzZsdmIboaLXejBzJ9.getValue()).floatValue();
                f7 = bl3 && bl2 ? 0.0f : ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$diJkxbxjt4xXnk9zMLZSrpJOX6DcE13MfXi9GoXMQ42piDDCT95cUyDnH49jegxqxMt2KXhd0l8jmXoSVe3DeGP8LE24EgfX6.getValue()).floatValue();
                vector3f = new Vector3f(((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$eL0DNsuy5eoykvLJClbaxz2iClAugFewxcX7OwvAp75ihK06IavtioJbxoY8ulzLIUt5tGSZKmMIRd1lqWSsJleeryDEQVrA4.getValue()).floatValue(), ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$vTxvvcPfxI7IMF0cA7aOxzfVJs18kARjpt2kARUjFZlhp3kKxg6L7bPowbIfoVtCm52xP3aOzBZXeyvj6jGsFi6yr0av7606H.getValue()).floatValue(), ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$JElFngglx3P3AI5RBPEoyD8YhGNHNCsbaQWU7GTHoirr2wtwHgeGf2O3MprajYtTUeWTImDMLY6e1xjf4RDUMmObQuRRKuLSs.getValue()).floatValue());
                class_45872.method_22905(((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$1BeNXj4lIbI4DlomDTS4hkOtJlJm5XejcwhdmSrO75uHhr5bySLNC1lL4hRC6v2IxjtA6ZcYcya0vLeIogYfU3XnBLFOZLlnA.getValue()).floatValue(), ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$dK6lvP6Ll2wMJaplYusogtQ8k2OPnRzkcL0pf5c4rxpJRADcs1rls7ziBgR571RMkLyz8pLHgXmjRQYt7DAXsudRi5sCv246a.getValue()).floatValue(), ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$X1MOyWPGPvVdS971QTn6gTxEvAqTo5SXhXHLeT62uT5e0R3bPiydLXawm384WTgPM5MnvsC1xC4nNnvk31RYukQOTLHwtQh2z.getValue()).floatValue());
            }
        }
        if (m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_6068() == class_1306.field_6182) {
            f5 = -f5;
        }
        class_45872.method_46416(f5, f6, f7);
        class_45872.method_22907((Quaternionfc)class_7833.field_40713.rotationDegrees(vector3f.x));
        class_45872.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(vector3f.y));
        class_45872.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees(vector3f.z));
    }

    @Inject(method={"renderArmHoldingItem"}, at={@At(value="HEAD")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_4587 class_45872, class_4597 class_45972, int n, float f, float f2, class_1306 class_13062, CallbackInfo callbackInfo) {
        if (!m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.isToggled() || !((Boolean)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$pDp8pYK1VeisQ3pcTsJLPWJLbkP6gVNZG7CBUKltGtZwNk7A6WclipbDD8AyHiKuEkSH5U7saA9DgZ85hhvedaeS5Zp5ihCuy.getValue()).booleanValue()) {
            return;
        }
        float f3 = -((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$mNHwjdLflNvFXAGoMl84LAt8orbBHj9u4rzx4HyuDVNTmrNELlBfcHeWZrdxGHpAmZ5GmTEXyFST9KgjgLa9VFPkL4NaYcOqd.getValue()).floatValue();
        if (m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_6068() == class_1306.field_6182) {
            f3 = -f3;
        }
        class_45872.method_46416(f3, ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$5rYhEntpqLVkJuW52dFXGayWP8VzXUhXXsqvHCGzEHBT658wtN9xBB8ohLLCKzXRhgHxXeKTvFoGYWXrwoUvgem6zochhUZ47.getValue()).floatValue(), ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$DTL5CubOrmiiU2ZDxXaecwRQfHHrYea0L7C5iJzte7E2Y8y20HDJH6S4OSlJCCJ67n7VJfLn2rQCmW94BbSInLIPDbhs7hX0X.getValue()).floatValue());
        class_45872.method_22905(((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$TfOIHD9gPv1zDdk4gCNj7N8JTGJNPd0f6jaAeqkRDWffgaiLN0vV47ZOEbTUKlDU8DINYOjnAVn3M9SrElqE8BL7H8r8DRuNs.getValue()).floatValue(), ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$Fg3OyIjILPDfYNaTXBTtTC6cOWXyMjZAtARjhFIJ24NpRdrSNTonBJ1a3qcNwB9FhA3Y06dpa0mm51g7k6UckyTLdbmzdXde4.getValue()).floatValue(), ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$a3nmk0vrertVRXxTetiYl5Ewb8xWbux0qXNzKGwbl4aSgmOwEUR85pE8apkZMfUx6zthu6Cpi0qvyoHu7WR3Bav3ZfeHHnTxc.getValue()).floatValue());
    }

    @ModifyArgs(method={"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/item/HeldItemRenderer;renderFirstPersonItem(Lnet/minecraft/client/network/AbstractClientPlayerEntity;FFLnet/minecraft/util/Hand;FLnet/minecraft/item/ItemStack;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"), require=0)
    private void m$$h6YK9QjDoMTr6MXOhtlGTjBp7y0YtqKAgZLe07Ls67QzPUmzRr17jYrMRTv0uHNS5s8YWDE9aAK2nmZbLbd8ZKM3Ox497EJfz(Args args) {
        class_1268 class_12682 = (class_1268)args.get(3);
        float f = ((Float)args.get(4)).floatValue();
        args.set(4, (Object)Float.valueOf(m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_12682, f)));
    }

    @Inject(method={"renderFirstPersonItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_742 class_7422, float f, float f2, class_1268 class_12682, float f3, class_1799 class_17992, float f4, class_4587 class_45872, class_4597 class_45972, int n, CallbackInfo callbackInfo) {
        if (m$$zoIj6nB6rifoF4BDikqp3Sdg2DS01OuaeZOXtmEN3AAy4QpZI0fybejCe82bx1TKZBLdDp5DwtmDEYnkxtsLPBO8QJeOsHh5d.isToggled() && class_12682 == class_1268.field_5810 && class_17992.method_31574(class_1802.field_8255)) {
            callbackInfo.cancel();
        }
    }

    @ModifyVariable(method={"renderFirstPersonItem"}, at=@At(value="HEAD"), argsOnly=true)
    private class_4597 m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_4597 class_45972) {
        if (m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$JtS6y3OKtFrQBGPhp1gae1DLvN1o1q0CdA2l8YvkOM7MOgIwqYlQCSkJtW7xplPv6MutK1dKT8LRXJ59kItBpnJbycC0MEz7C.m$$a3qcWmacuu2a0vwsi4RmEzyQiHzp11joDO1Au10HYlzWmTi190jlMmGksXtwEoS0Xwa30eShEpoVX5zKeDnZ5HRhYLkYky0Pt) {
            m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5 m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5 = m$$bKvYSCMB2xLm5a3SyAUQBdb3esV2gUrZXuh7tJYmyQBIi0PFMYyU2HgfLQM4xUgyFQtWOdSNY84aj1XD660ZZV3NK5ImvNRC5.m$$xQhInQr7unM5DvCMmuPmDYlV59KeN2i3zI6UTwEHrPvguP2HNlDUFl5Z0EHp9hYBinKhWhMcthEgNawUMhguoryJDSiEvZUWf(-853261753);
            m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5.method_23286(255, 255, 255, 255);
            return m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5;
        }
        return class_45972;
    }

    @WrapWithCondition(method={"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/util/math/MatrixStack;multiply(Lorg/joml/Quaternionfc;)V")})
    private boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_4587 class_45872, Quaternionfc quaternionfc) {
        return !m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.isToggled() || (Boolean)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$ZMtbbuutPn9wUA4wn2pMIrd81unmz2GbgbY3bWg1kDUewJT0ms0reg2RsWDns2g8mMiAKNBoXr84qGh4am8xbIsBFsJ3LgnnJ.getValue() == false;
    }

    @ModifyExpressionValue(method={"updateHeldItems"}, at={@At(value="INVOKE", target="Lnet/minecraft/util/math/MathHelper;clamp(FFF)F", ordinal=2)})
    private float m$$To3vhJ3WNHdOvPenZy6hBvuDgvoeXq6w8509uDqfBHJUZabEDFnEF0ubsZKnh9UBXReXrwigjnISrN3BxsODfNDDLhjE5DEVb(float f) {
        if (!m$$bSHfTqaRAlkoBdiDlsWt9yCTLLEKW9392P9ZC6gfotNQyadQWoNUEYGJYXxIoW960z3Fq0BTLz2x9UYAjxluAyUh16krrQ07x.isToggled() || m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$bSHfTqaRAlkoBdiDlsWt9yCTLLEKW9392P9ZC6gfotNQyadQWoNUEYGJYXxIoW960z3Fq0BTLz2x9UYAjxluAyUh16krrQ07x.m$$ICSUSNU7yfYAFc3rsIw1MfKwYPIPexA2rCKGrOSw6BOn9MgtsXaAENvnWB6PdxpeeT992VpSImOin8solyr34rha8z7MvbMCc.getValue() == m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$UqkaSNtCEOoy36V1AwGxoVUTRkK9UKMHeP5CMs3mfSCr9r5C3cTWKqdwe5NeHodr3cJgRUIrdrtH4FBgiKR6qyhfCGxKNys8y) {
            return f;
        }
        boolean bl = m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$bSHfTqaRAlkoBdiDlsWt9yCTLLEKW9392P9ZC6gfotNQyadQWoNUEYGJYXxIoW960z3Fq0BTLz2x9UYAjxluAyUh16krrQ07x.m$$ICSUSNU7yfYAFc3rsIw1MfKwYPIPexA2rCKGrOSw6BOn9MgtsXaAENvnWB6PdxpeeT992VpSImOin8solyr34rha8z7MvbMCc.getValue() == m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$NAPnM2mi90GWWen2OZQmwPpjkdPJAYM5Ed6obgnxWSVCbUTiLEyd66UJkhVuGH97GnZ2VJ1ciSQDYfKrlfmljrxHWvKjvpqrG;
        float f2 = this.field_4050.field_1724.method_7261(1.0f);
        if (bl) {
            f2 = 1.0f;
        }
        boolean bl2 = !class_1799.method_31577((class_1799)this.field_4047, (class_1799)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_6047());
        float f3 = bl ? -0.6f : -0.4f;
        return class_3532.method_15363((float)((bl2 ? 0.0f : f2 * f2 * f2) - this.field_4043), (float)f3, (float)0.4f);
    }

    @ModifyExpressionValue(method={"updateHeldItems"}, at={@At(value="INVOKE", target="Lnet/minecraft/util/math/MathHelper;clamp(FFF)F", ordinal=3)})
    private float m$$a8nwcIEz33qkF56tQDYbl9rprqGd3Tsn4GoVo2pwzYrCRocxTQNsPP2ZDLImj5yUznS6ZqjdgoLbaTpHDaufClBvXzXoNsQlo(float f) {
        if (!m$$bSHfTqaRAlkoBdiDlsWt9yCTLLEKW9392P9ZC6gfotNQyadQWoNUEYGJYXxIoW960z3Fq0BTLz2x9UYAjxluAyUh16krrQ07x.isToggled() || m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$bSHfTqaRAlkoBdiDlsWt9yCTLLEKW9392P9ZC6gfotNQyadQWoNUEYGJYXxIoW960z3Fq0BTLz2x9UYAjxluAyUh16krrQ07x.m$$ICSUSNU7yfYAFc3rsIw1MfKwYPIPexA2rCKGrOSw6BOn9MgtsXaAENvnWB6PdxpeeT992VpSImOin8solyr34rha8z7MvbMCc.getValue() == m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$UqkaSNtCEOoy36V1AwGxoVUTRkK9UKMHeP5CMs3mfSCr9r5C3cTWKqdwe5NeHodr3cJgRUIrdrtH4FBgiKR6qyhfCGxKNys8y) {
            return f;
        }
        boolean bl = !class_1799.method_31577((class_1799)this.field_4048, (class_1799)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_6079());
        return class_3532.method_15363((float)((float)(!bl ? 1 : 0) - this.field_4052), (float)-0.4f, (float)0.4f);
    }

    @ModifyExpressionValue(method={"renderFirstPersonItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/AbstractClientPlayerEntity;isUsingRiptide()Z")})
    private boolean m$$To3vhJ3WNHdOvPenZy6hBvuDgvoeXq6w8509uDqfBHJUZabEDFnEF0ubsZKnh9UBXReXrwigjnISrN3BxsODfNDDLhjE5DEVb(boolean bl) {
        if (m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.isToggled() && ((Boolean)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$YzNijrvLyYXCaSCVYAndNJgklD6quuhzstymJfj55PVu5jf86hlXCtYxA94FzvxAgL6JL4VMNL4g3CvZ06ytJ1tKtrnGciyke.getValue()).booleanValue()) {
            return false;
        }
        return bl;
    }

    @ModifyArgs(method={"applyEquipOffset"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/util/math/MatrixStack;translate(FFF)V"))
    private void m$$fR6eEarIPxvybR1zV4KkcbhQRgMmTBM3M3Em5rMRZPJBe6vWUTmeR70l4mHSeN304bm1lz8s4uMydpwWnakD21Fe6wibSyEN1(Args args) {
        if (m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.isToggled() && ((Boolean)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$JM7cMRwSCL8HlOZt9pBGfMjOhH5SkS52sHB3tlFEhUFe26mVtd2TXO14uXvkKCK6PtBHk3RJPxKoA412PxIKlluKsrerz3eAd.getValue()).booleanValue()) {
            args.set(1, (Object)Float.valueOf(-0.52f));
        }
    }

    @ModifyArgs(method={"applyEatOrDrinkTransformation"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/util/math/MatrixStack;translate(FFF)V", ordinal=0))
    private void m$$KgsA96MC4T4eH6W0XsD6gEUJxCz5GU4uazh6mqzZZEg5IcvKpdzsTNWdlxDRqzB2X3Og2j3TkDMOzEdzjRLwJz0tDZCIQJ5av(Args args) {
        if (!m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.isToggled()) {
            return;
        }
        args.set(1, (Object)Float.valueOf(((Float)args.get(1)).floatValue() * ((Float)m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$Q8TciJAqOtxGwL3cDs0NibvdTHPoJzdaUbQQy292sU10r0RpZgX3aCq06ow81DaijKvS2f2qpbjEuDLggQrsUAjqM4W7WbdnR.m$$wOQxdtmJ6qfFmx7uQK3y3DpRBFJS1d4On6U8fgWrykbcEv8VPfoPPm7e6nLdr7BNWqZ75kjbTlAHy1Bssi1eKEmykBu3zFFIz.getValue()).floatValue()));
    }

    @Unique
    private Vector3f m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(Vector3f vector3f) {
        return new Vector3f(vector3f.x, -vector3f.y, -vector3f.z);
    }
}

