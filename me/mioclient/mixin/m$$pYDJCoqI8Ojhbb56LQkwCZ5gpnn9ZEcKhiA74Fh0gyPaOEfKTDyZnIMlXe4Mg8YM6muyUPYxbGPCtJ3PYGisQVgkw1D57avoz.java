package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.authlib.GameProfile;
import me.mioclient.m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb;
import me.mioclient.m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh;
import me.mioclient.m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$2K3zzNd19VaLubcyoZMt6nsMA8gm9Ks6At7rvsRqMxLt7v713niT88Z6Fkd4aFOChAUuRTJP19UDho4x3RfyUFqVsI45JjxVi;
import me.mioclient.m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu;
import me.mioclient.m$$7asR1m6msy4qQ8giUQRI0c3QXEtnOWwZKmmsr7wSAfbWgaqWaCsxFxVeK9qeZV7eQNtgorblQKOvkRA51a5EgMlPYM8jR8qJS;
import me.mioclient.m$$7dBQtMll6jPXZNNL0JKdy4p8eVbJZI7oOTeXRzLBqSEEEcap1JnngIGWGk1FEqPXsknugaL3HnAmbnnwAQwHFkcn4wsLUZFKH;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2;
import me.mioclient.m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R;
import me.mioclient.m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC;
import me.mioclient.m$$drRamKEFYoNSWn0JcXquuSBLpOaARQW8WLek4wXjdGqZ11chwckYWLP1yq7bvtgeiiKRjyAFITgP6m6MBuANqykfdttjGVbNa;
import me.mioclient.m$$ngwg8fTtoOoDXHuvM7rQ6l7gngZbp1iZUdtAfFU14IzEqfuGgJFAdZPT3KarwIDr7AGhdLNcCUrLz0FBv5C6tAEQ7NAYSEl2T;
import me.mioclient.m$$oRHJQWTrcmf8p7S7OrClvPCdl9sx2m3MiyV6YTaqEn1Mg8ahUxfHzfKu1iPlYTVDBpohy3N9exkz7FvKMSZgpqJCaBMKRYLbq;
import me.mioclient.m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$v8v8UVuy8ui4LQgAeJ3uzhm525EfSSSdvg5Hv2S3HeeOaHv0VUf3txWUowlbKfGhpM3s9oY0VavnlouAggp9ZSaZNX5ZtqHGP;
import net.minecraft.class_1268;
import net.minecraft.class_1313;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2879;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_744;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_746.class})
public abstract class m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz
extends class_742
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82,
m$$ngwg8fTtoOoDXHuvM7rQ6l7gngZbp1iZUdtAfFU14IzEqfuGgJFAdZPT3KarwIDr7AGhdLNcCUrLz0FBv5C6tAEQ7NAYSEl2T {
    private static m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh elytrafly = (m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh.class);
    private static m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R swing = (m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R.class);
    private static m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb noslow = (m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb.class);
    private static m$$7asR1m6msy4qQ8giUQRI0c3QXEtnOWwZKmmsr7wSAfbWgaqWaCsxFxVeK9qeZV7eQNtgorblQKOvkRA51a5EgMlPYM8jR8qJS entitycontrol = (m$$7asR1m6msy4qQ8giUQRI0c3QXEtnOWwZKmmsr7wSAfbWgaqWaCsxFxVeK9qeZV7eQNtgorblQKOvkRA51a5EgMlPYM8jR8qJS)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$7asR1m6msy4qQ8giUQRI0c3QXEtnOWwZKmmsr7wSAfbWgaqWaCsxFxVeK9qeZV7eQNtgorblQKOvkRA51a5EgMlPYM8jR8qJS.class);
    private static m$$7dBQtMll6jPXZNNL0JKdy4p8eVbJZI7oOTeXRzLBqSEEEcap1JnngIGWGk1FEqPXsknugaL3HnAmbnnwAQwHFkcn4wsLUZFKH sprint = (m$$7dBQtMll6jPXZNNL0JKdy4p8eVbJZI7oOTeXRzLBqSEEEcap1JnngIGWGk1FEqPXsknugaL3HnAmbnnwAQwHFkcn4wsLUZFKH)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$7dBQtMll6jPXZNNL0JKdy4p8eVbJZI7oOTeXRzLBqSEEEcap1JnngIGWGk1FEqPXsknugaL3HnAmbnnwAQwHFkcn4wsLUZFKH.class);
    @Shadow
    public class_744 field_3913;
    @Unique
    private m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ = new m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC();

    public m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz(class_638 class_6382, GameProfile gameProfile) {
        super(class_6382, gameProfile);
    }

    @Shadow
    protected abstract void method_3148(float var1, float var2);

    @Shadow
    public abstract float method_5695(float var1);

    @Shadow
    public abstract float method_5705(float var1);

    @Shadow
    public abstract void method_33689();

    @Shadow
    public abstract boolean method_6115();

    @Shadow
    private void method_3136() {
    }

    @Inject(method={"swingHand"}, at={@At(value="HEAD")}, cancellable=true)
    public void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1268 class_12682, CallbackInfo callbackInfo) {
        if (swing.isToggled() && m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.swing.m$$sfvr8lWm1SI80MN5pOhSG6xXdTjzrzYWoVIfZXJtZY7aZMbvQVjtEGl1OA8WFT2TFocEeCAaUUfm2JljSG1kCG1Et49lhFlLZ.getValue() != m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$tuhSsAeADU2PNcMoWYGnDs2XbyZkovDgZqDybzohwQZfRN4DcRtu4tSwwFIzq5R0SKtWiOaVlkDIXPiBlyQrOmsDtLmmeEk3b) {
            if (m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.swing.m$$sfvr8lWm1SI80MN5pOhSG6xXdTjzrzYWoVIfZXJtZY7aZMbvQVjtEGl1OA8WFT2TFocEeCAaUUfm2JljSG1kCG1Et49lhFlLZ.getValue() != m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$6Lfk03pfDt1oXLUEqwGtnzEf84oQucu0KxnOcZdg0FaPnr9YivIZ4zrjmvQMlpd7FlvY4niTL4Tgnx5WamCdqhyt8y00p83SZ) {
                super.method_6104(((m$$TrTFkzOB4Fo0w8SGr0aNe1Dz8TkTtUjfstLJ2T5OpfoBWT3SM57Rvf0Mme81BzLZnZW0doUODjgPVVgw6KWv6eBZfrD3j371R$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8)m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.swing.m$$sfvr8lWm1SI80MN5pOhSG6xXdTjzrzYWoVIfZXJtZY7aZMbvQVjtEGl1OA8WFT2TFocEeCAaUUfm2JljSG1kCG1Et49lhFlLZ.getValue()).m$$x8h2gtxr5tQRlrgmF9m9DWDKA206pnEeSWRf8GU3AtV7oVA2DVclr9pdJMSBFysvbtA8jaXyGECBHm1Mo73N8lXL38ZHt9CxO());
            }
            m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_3944.method_52787((class_2596)new class_2879(class_12682));
            callbackInfo.cancel();
        }
    }

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/AbstractClientPlayerEntity;tick()V", shift=At.Shift.BEFORE)})
    public void m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU(CallbackInfo callbackInfo) {
        if (m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724 != null && m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687 != null) {
            m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(new m$$drRamKEFYoNSWn0JcXquuSBLpOaARQW8WLek4wXjdGqZ11chwckYWLP1yq7bvtgeiiKRjyAFITgP6m6MBuANqykfdttjGVbNa());
        }
    }

    @Inject(method={"tick"}, at={@At(value="RETURN")})
    public void m$$To3vhJ3WNHdOvPenZy6hBvuDgvoeXq6w8509uDqfBHJUZabEDFnEF0ubsZKnh9UBXReXrwigjnISrN3BxsODfNDDLhjE5DEVb(CallbackInfo callbackInfo) {
        if (m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724 != null && m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687 != null) {
            m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(new m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2());
        }
    }

    @Inject(method={"move"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1313 class_13132, class_243 class_2432, CallbackInfo callbackInfo) {
        class_243 class_2433 = new class_243(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350);
        m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT = new m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT(class_2432, class_13132);
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT);
        if (!m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            if (class_2433.equals((Object)m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT.m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG())) {
                return;
            }
            callbackInfo.cancel();
            double d = this.method_23317();
            double d2 = this.method_23321();
            super.method_5784(m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT.m$$oRsPOxEzXI6zmMx5y4AhbH8XQspiGNTZrZp22tezksjg6xH1VDe0ZHN8tz3FKPV7qXncaUBLPYjrkF1plyEPXtHYjxCgzwHP5(), m$$RHys9TOooD3zF1cHGY7ucPFtNFKeacnS8W0qJ6Op5GrdRvSJ6xvs7jWpVCGEDkRr4cgrcKgQdij0gE18yBm8OiQtUjCV4WLsT.m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG());
            this.method_3148((float)(this.method_23317() - d), (float)(this.method_23321() - d2));
        } else {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/AbstractClientPlayerEntity;tick()V", shift=At.Shift.AFTER)}, cancellable=true)
    private void m$$a8nwcIEz33qkF56tQDYbl9rprqGd3Tsn4GoVo2pwzYrCRocxTQNsPP2ZDLImj5yUznS6ZqjdgoLbaTpHDaufClBvXzXoNsQlo(CallbackInfo callbackInfo) {
        this.resetEvent();
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ);
        this.method_5814(this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ(), this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$zfldNZWJSxHy0Alw9Cqa3yNZ8WZ8yoJ6Drozs6MdqpmH0pR8ir3ZWdNM4n98DoQnCWQ1nIIZZy9nbFt2sNJRCEqD17MNg5oGe(), this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$Q2ERdZ3xRYod7FvlIkKynPG6KHLWrQoM5iordEXbaZEYXfQkcOqvxAKQyLvVZJCMKlr1nUMmH78xV93T7xzST9gkbYpDYQGwm());
        this.method_36456(this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR());
        this.method_36457(this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$Q60NwpX5crKBVe0NTEFmRtXQsQdVCRv8mQ8MvNe16Xe87e9OQDmFLZ3doXEg0Y7Zs8SYeknLpvH924iqybOnJEKKCKrgOhxKI());
        this.method_24830(this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$4L5KTnheMI6QUOjrIDkrPZEcxntKRmN8AyP52YBY3mSo05j5J7oNv6XDIT1GMBNDtOIWqet0f76wAm9ddTRhp3UcE9HZfzt33());
        if (this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Ljava/util/List;iterator()Ljava/util/Iterator;", shift=At.Shift.BEFORE)}, cancellable=true)
    private void m$$NtFIT6zaieEXzonXBenBHliG2woXkNgJjt4X3OkMyxQvkprFTKxt7G9OnHROZGaijRc67jurn4oNhpQ3ClXIfJPZ6vQ1PDJfh(CallbackInfo callbackInfo) {
        if (this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ() != this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl() || this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$zfldNZWJSxHy0Alw9Cqa3yNZ8WZ8yoJ6Drozs6MdqpmH0pR8ir3ZWdNM4n98DoQnCWQ1nIIZZy9nbFt2sNJRCEqD17MNg5oGe() != this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$i6zAWzvAvxtGBakAMZhDHKw70Tg5GbQLWyljf1ChJ6oLfTfGLogiAAkU7ealKKP3OQekQcvv9gJHSnt6BxOnxEaEOs2YcyDpB() || this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$Q2ERdZ3xRYod7FvlIkKynPG6KHLWrQoM5iordEXbaZEYXfQkcOqvxAKQyLvVZJCMKlr1nUMmH78xV93T7xzST9gkbYpDYQGwm() != this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$ITvaiL89DphIfe0Epjfanx98bHBBVd8yseRP7GMWIfjXyZbkVy0t9xaVUfxXjpt5jEwR13pKYBfQPhhjSYDlZc0h0zOwb0S5t()) {
            this.method_33574(new class_243(this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl(), this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$i6zAWzvAvxtGBakAMZhDHKw70Tg5GbQLWyljf1ChJ6oLfTfGLogiAAkU7ealKKP3OQekQcvv9gJHSnt6BxOnxEaEOs2YcyDpB(), this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$ITvaiL89DphIfe0Epjfanx98bHBBVd8yseRP7GMWIfjXyZbkVy0t9xaVUfxXjpt5jEwR13pKYBfQPhhjSYDlZc0h0zOwb0S5t()));
        }
        this.resetRotations();
        if (this.method_24828() == this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$4L5KTnheMI6QUOjrIDkrPZEcxntKRmN8AyP52YBY3mSo05j5J7oNv6XDIT1GMBNDtOIWqet0f76wAm9ddTRhp3UcE9HZfzt33()) {
            this.method_24830(this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$JlXT0s5U4zTOmVfzlSAwEPBRd8FtaQtMLSTZC8r5abmvtUnYqfI4FhsEQ5H4pVnUyeB5K3qK1z0yYM3XXWNCDpLBQsgjENMG9());
        }
    }

    @Inject(method={"sendMovementPackets"}, at={@At(value="RETURN")})
    private void m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL(CallbackInfo callbackInfo) {
        m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC = new m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC(m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$cLoz4UwY1GSOQzXYErRtEVYBhrEoLPlj4BbRpZV1TLY7qk3wQNZabEq1LQPwG2CSYkgd7XrSLVNpuykeq21bMvSkKk4Fe5RrY, this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ);
        if (this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC.m$$lCJ99GNF5nE0KyGBDwkn9VbCwKXGYLSNfZD9coSpBtt28mlPmW1LuZEfvB3rbiOrL185Py6Q0aa3MwQYIknccd4mN3rbCY0Tb();
        }
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC);
    }

    @ModifyExpressionValue(method={"sendMovementPackets"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;getX()D")})
    private double m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(double d) {
        return this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ();
    }

    @ModifyExpressionValue(method={"sendMovementPackets"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;getY()D")})
    private double m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(double d) {
        return this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$zfldNZWJSxHy0Alw9Cqa3yNZ8WZ8yoJ6Drozs6MdqpmH0pR8ir3ZWdNM4n98DoQnCWQ1nIIZZy9nbFt2sNJRCEqD17MNg5oGe();
    }

    @ModifyExpressionValue(method={"sendMovementPackets"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;getZ()D")})
    private double m$$si2aX2X8Dch8BrpPv8C89mK3tHVjy6by3nrWOWcgTRS3w0VNjCaT6TzOK1vZM0JWisN0y7s9j2U6LywGMjYOWySMMEgPZT7WH(double d) {
        return this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$Q2ERdZ3xRYod7FvlIkKynPG6KHLWrQoM5iordEXbaZEYXfQkcOqvxAKQyLvVZJCMKlr1nUMmH78xV93T7xzST9gkbYpDYQGwm();
    }

    @ModifyExpressionValue(method={"sendMovementPackets"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;getYaw()F")})
    private float m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(float f) {
        if (this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$89KUPBmglFbIumfZDBkDSS2a0yQdgUClluONpCxgKE83LeqP1ZnyE51hLsyEVrfDfsoebC3LYvayFzSxY68lBgIniiJXSMQFs() != f) {
            return f;
        }
        if (this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$89KUPBmglFbIumfZDBkDSS2a0yQdgUClluONpCxgKE83LeqP1ZnyE51hLsyEVrfDfsoebC3LYvayFzSxY68lBgIniiJXSMQFs() == this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$H0dofC6i8YL1T7EMLSCVr8Ydy8GyPJBYnVdSoq6ICGlBb0G2mFnwcO2WC8c6R1T6MGCeWw37tS1aDOgTIti2YKMJqMxI9iGzy()) {
            return f;
        }
        return this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$H0dofC6i8YL1T7EMLSCVr8Ydy8GyPJBYnVdSoq6ICGlBb0G2mFnwcO2WC8c6R1T6MGCeWw37tS1aDOgTIti2YKMJqMxI9iGzy();
    }

    @ModifyExpressionValue(method={"sendMovementPackets"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;getPitch()F")})
    private float m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(float f) {
        if (this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$pvIvFMXRUTJ8dgkZsnzxA0DZuw4wqtRsqFoZ9mnVn4jDArZk2NwY6plqoEV1GtE7QMYGfFHRRHf4UmG4utALbii5AhpWQXy0z() != f) {
            return f;
        }
        if (this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$pvIvFMXRUTJ8dgkZsnzxA0DZuw4wqtRsqFoZ9mnVn4jDArZk2NwY6plqoEV1GtE7QMYGfFHRRHf4UmG4utALbii5AhpWQXy0z() == this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$V97y9Rf5S3WnCfOVfssyr4BMdl6mR3hnnna1kC0C1Yp8SUjJAxmgzFhzZl1oHZRfMsAOmoGufdzXBSm0srL5HacHxRard0p8L()) {
            return f;
        }
        return this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$V97y9Rf5S3WnCfOVfssyr4BMdl6mR3hnnna1kC0C1Yp8SUjJAxmgzFhzZl1oHZRfMsAOmoGufdzXBSm0srL5HacHxRard0p8L();
    }

    @ModifyExpressionValue(method={"sendMovementPackets"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isOnGround()Z")})
    private boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(boolean bl) {
        return this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$4L5KTnheMI6QUOjrIDkrPZEcxntKRmN8AyP52YBY3mSo05j5J7oNv6XDIT1GMBNDtOIWqet0f76wAm9ddTRhp3UcE9HZfzt33();
    }

    @ModifyExpressionValue(method={"tickMovement"}, at={@At(value="INVOKE", target="Lnet/minecraft/util/PlayerInput;sprint()Z")})
    private boolean m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(boolean bl) {
        if (sprint.isToggled() && sprint.m$$ZkiUAEUQwoGWSfLpQIs0pr7PjotS8Z0b2tSkOEAzcwCLuNfin2fBAAD1y3zQUJOYtPz3DQwg6VLtxsYvHGe1bO3q0Tov45FVc((~((0xD383 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF) & 0xFFFF) + 1 & 0xFFFF) << 16 | (0xE570 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFFFF) & 0xFFFF)) {
            return true;
        }
        return bl;
    }

    @ModifyArgs(method={"tickMovement"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;setSprinting(Z)V"), require=0)
    private void m$$si2aX2X8Dch8BrpPv8C89mK3tHVjy6by3nrWOWcgTRS3w0VNjCaT6TzOK1vZM0JWisN0y7s9j2U6LywGMjYOWySMMEgPZT7WH(Args args) {
        if (sprint.isToggled() && sprint.m$$hJejIIy30k9dvIqbtuR8qxsPXMM81zRi5PA6PBN1VI2tX7958oQjdWKfKZrxhCLDaQ8jO9PbTsDXXB5GsJgtLl2gKbBCnfwLF((~(-906102073 - (~\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF)) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFFFF) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF))) {
            args.set(0, (Object)true);
        }
    }

    @Inject(method={"tickMovement"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;canStartSprinting()Z")})
    private void m$$h6YK9QjDoMTr6MXOhtlGTjBp7y0YtqKAgZLe07Ls67QzPUmzRr17jYrMRTv0uHNS5s8YWDE9aAK2nmZbLbd8ZKM3Ox497EJfz(CallbackInfo callbackInfo) {
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(new m$$v8v8UVuy8ui4LQgAeJ3uzhm525EfSSSdvg5Hv2S3HeeOaHv0VUf3txWUowlbKfGhpM3s9oY0VavnlouAggp9ZSaZNX5ZtqHGP());
    }

    @ModifyExpressionValue(method={"applyMovementSpeedFactors"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z")})
    private boolean m$$si2aX2X8Dch8BrpPv8C89mK3tHVjy6by3nrWOWcgTRS3w0VNjCaT6TzOK1vZM0JWisN0y7s9j2U6LywGMjYOWySMMEgPZT7WH(boolean bl) {
        if (m$$oRHJQWTrcmf8p7S7OrClvPCdl9sx2m3MiyV6YTaqEn1Mg8ahUxfHzfKu1iPlYTVDBpohy3N9exkz7FvKMSZgpqJCaBMKRYLbq.m$$XftmB67EIcBOopmHasfYf4J5CMrNHnLr6BuJmzAcoBHw9rM3EIg4HDsVlSp5sWpefAcfg3jE3VY621853YWALj2be5DbIx3za((0xD6C75F9B ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >> 16 & 0xFFFF))) {
            return bl;
        }
        m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk = new m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk();
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk);
        if (m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            return false;
        }
        return bl;
    }

    @Inject(method={"pushOutOfBlocks"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(double d, double d2, CallbackInfo callbackInfo) {
        m$$2K3zzNd19VaLubcyoZMt6nsMA8gm9Ks6At7rvsRqMxLt7v713niT88Z6Fkd4aFOChAUuRTJP19UDho4x3RfyUFqVsI45JjxVi m$$2K3zzNd19VaLubcyoZMt6nsMA8gm9Ks6At7rvsRqMxLt7v713niT88Z6Fkd4aFOChAUuRTJP19UDho4x3RfyUFqVsI45JjxVi = new m$$2K3zzNd19VaLubcyoZMt6nsMA8gm9Ks6At7rvsRqMxLt7v713niT88Z6Fkd4aFOChAUuRTJP19UDho4x3RfyUFqVsI45JjxVi();
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$2K3zzNd19VaLubcyoZMt6nsMA8gm9Ks6At7rvsRqMxLt7v713niT88Z6Fkd4aFOChAUuRTJP19UDho4x3RfyUFqVsI45JjxVi);
        if (m$$2K3zzNd19VaLubcyoZMt6nsMA8gm9Ks6At7rvsRqMxLt7v713niT88Z6Fkd4aFOChAUuRTJP19UDho4x3RfyUFqVsI45JjxVi.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"getMountJumpStrength"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$To3vhJ3WNHdOvPenZy6hBvuDgvoeXq6w8509uDqfBHJUZabEDFnEF0ubsZKnh9UBXReXrwigjnISrN3BxsODfNDDLhjE5DEVb(CallbackInfoReturnable callbackInfoReturnable) {
        if (entitycontrol.isToggled() && ((Boolean)m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.entitycontrol.m$$5sfmmFX9PSzuzakNMSrGraP6OsGkxEV3Mhdbgb9pvMpF2TzgbUN3BtSU1yMBcoLDHm1ygMedPpCWxPK8LyC4tYIrPcdhpOFDG.getValue()).booleanValue()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(1.0f));
        }
    }

    @Inject(method={"tickNausea"}, at={@At(value="HEAD")})
    private void m$$fR6eEarIPxvybR1zV4KkcbhQRgMmTBM3M3Em5rMRZPJBe6vWUTmeR70l4mHSeN304bm1lz8s4uMydpwWnakD21Fe6wibSyEN1(CallbackInfo callbackInfo) {
        if (noslow.isToggled() && this.field_51994 != null) {
            this.field_51994.method_60705(false);
        }
    }

    @Inject(method={"tickMovement"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isGliding()Z", shift=At.Shift.BEFORE)})
    private void m$$KgsA96MC4T4eH6W0XsD6gEUJxCz5GU4uazh6mqzZZEg5IcvKpdzsTNWdlxDRqzB2X3Og2j3TkDMOzEdzjRLwJz0tDZCIQJ5av(CallbackInfo callbackInfo) {
        if (!elytrafly.isToggled() || !elytrafly.m$$LseN3gBbProNpiYF8rpQAGW8IvyAOilp1rxGFsjebeii9JzwbtI3sJlEAdzxR2DsO2inDsAxFgtMCvzeltg8UPFAmEhdFuOWb(((int)(99833L - (long)(\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFFFF) - (long)(\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF)) & 0xFFFF) << 16 | (int)(31981L - (long)(\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFFFF) + (long)(\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF)) & 0xFFFF)) {
            return;
        }
        boolean bl = m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_3913.field_54155.comp_3163();
        if ((m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.elytrafly.m$$XllnuTY2kO7g28STWd7xPc2rdZWa1U9P2KWG708Dj6nYph2kkP9ur7vb68Kvg60QnxljDG9VYLD4y0oAB10OVr5M2vqGfw9oh.getValue() != m$$0mCWVtpihU5GSPj5gylZY14ZMz9vniNg1E7vWfFJ5niTTp8p8jrrtg4M3Z8CqPRXCBjfshVRalMpyNfktZLRTKIkSrnMSuHFh$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$m6kBUyXiVyLjgrWjII6Uuxkt3ES7yiuoT8LslqZUYihjTjfjnBGYFmY3swJ8Y4H5GmsGhErbqpxf8DxAwZLm4MNMz1lDsBRcG || ((Boolean)m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.elytrafly.m$$d4tTmnjmCkFfWRXS8xAuqDiNmDOjtcIk9iuPL8zWTxlMf8zey5pPCbPbjlSGSvzkW9uRJKvbqiLoyWcZCOXpY8QHwpqQBNnGB.getValue()).booleanValue() && m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_3913.field_54155.comp_3163()) && bl) {
            elytrafly.m$$IIZdnPWN4OUIzHUCS7SVLSgvpwboCyz161a2ICRwBI0V7TIFlu3BALprZ8VlzUH1pDnvoOtajj7XGQgVOSeIlUSoTFv8MFQqt(0xC8681C2 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 << 2 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 1 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 << 1);
        } else {
            m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$q3dcwnjlRefRR8b0gk7kdxMgDFJ5LXHRRbofHRb8ZE2GEOJRbIC22rYC6BOfvtJTSTNd4jGS2IFIaV87GR9zHVWcUnLK6i7Ul.m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG(elytrafly);
        }
    }

    @Inject(method={"shouldSlowDown"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$a8nwcIEz33qkF56tQDYbl9rprqGd3Tsn4GoVo2pwzYrCRocxTQNsPP2ZDLImj5yUznS6ZqjdgoLbaTpHDaufClBvXzXoNsQlo(CallbackInfoReturnable callbackInfoReturnable) {
        boolean bl;
        boolean bl2 = m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_20448() && (Boolean)m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.noslow.m$$qKP1jbGuljJ3TZxYSXc7Jj3J750QCPRHT9Ewe2PjeMVO5opWyS2EQ4m5ECo7TF9MAiqJMK3MFIFp0bKYc8Xj723cqvCuQw4ej.getValue() != false;
        boolean bl3 = bl = !bl2 && m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_5715() && (Boolean)m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.noslow.m$$yxsmAl9DnQ0qaxDzqP11RWQreaWCmjTIjNLd3kbpcNYyT3DsWxAmz6edn92G7WJCp50tZHxK7QnD0FZlyAa3W7mFEDNhtpXi5.getValue() != false;
        if (noslow.isToggled() && (bl2 || bl)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @ModifyExpressionValue(method={"canStartSprinting"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z")})
    private boolean m$$C7jwyCZGOGmxYHR6CinqHYKGpwwojfCUt8uyzjRA2awICUF3ogkSBtJt9OZZ5TwdqY7XMH0WNbqisrPkOMONx1NLAAWZsoOL0(boolean bl) {
        if (noslow.isToggled() && ((Boolean)m$$pYDJCoqI8Ojhbb56LQkwCZ5gpnn9ZEcKhiA74Fh0gyPaOEfKTDyZnIMlXe4Mg8YM6muyUPYxbGPCtJ3PYGisQVgkw1D57avoz.noslow.m$$wBSi6baukivfrHeNtIHu8u56hPx2fgo06hOOjTmir8bqFN112wZB6YtrkhR60h1iBjNbYcxwoeaPgSMRgBHkZHszlnkeTyH8O.getValue()).booleanValue()) {
            return false;
        }
        return bl;
    }

    @Override
    public void sendMovementPacketsWrapper() {
        this.method_3136();
    }

    @Override
    public void superTick() {
        super.method_5773();
    }

    @Override
    public void resetEvent() {
        this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ = new m$$Xxt0vZAUlCIG3cnWnf6fY0lpqcv1AZ9XGFCFR538DkKdZHi99BU6Z2pKPug7rKnGUa0ugRieg2b5BYSliyG2ixSDDZfleK2cC(m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$sQwB8Gn4SsL46dO2Upi4yBLYPCnKWOlOaSGrxKbwA1RWaIibNyrn6OSioUC20gJrJQ0HrgfZY1nKYe7wPwvGZ4a6oZ3eJBH69, this.method_23317(), this.method_5829().field_1322, this.method_23321(), this.method_36454(), this.method_36455(), this.method_24828());
    }

    @Override
    public void resetRotations() {
        m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$NW5KakVlfezmaCceGB5sGcQTFfBRJenL6UbwHurDyMOJp1R5e1HUex9HMsqvCe2SmZJF7BEBnPp6nhp4FvhDpYq5Qjkj6Xkyi.m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T(this.method_5765() && !this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$vH1bMafUTTX3QAasWwLMJrZi9QyXNVJIotlHjxRoHmYR2hp5TXuCYZhSGyEq2RqChjQiawX0OcoDlJ1HPSo8r3XnmY9dTcvia() ? this.method_5854().method_36454() : this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$H0dofC6i8YL1T7EMLSCVr8Ydy8GyPJBYnVdSoq6ICGlBb0G2mFnwcO2WC8c6R1T6MGCeWw37tS1aDOgTIti2YKMJqMxI9iGzy(), this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$V97y9Rf5S3WnCfOVfssyr4BMdl6mR3hnnna1kC0C1Yp8SUjJAxmgzFhzZl1oHZRfMsAOmoGufdzXBSm0srL5HacHxRard0p8L(), ((0xA081115E ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 << 7) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF) >>> 11 | (0xA081115E ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 << 7) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF) << 21) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16);
        if (this.method_36454() == this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR()) {
            this.method_36456(this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$89KUPBmglFbIumfZDBkDSS2a0yQdgUClluONpCxgKE83LeqP1ZnyE51hLsyEVrfDfsoebC3LYvayFzSxY68lBgIniiJXSMQFs());
        }
        if (this.method_36455() == this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$Q60NwpX5crKBVe0NTEFmRtXQsQdVCRv8mQ8MvNe16Xe87e9OQDmFLZ3doXEg0Y7Zs8SYeknLpvH924iqybOnJEKKCKrgOhxKI()) {
            this.method_36457(this.m$$wcRf2uUvIU7UMminZcXfsXVImZqa5yS2Upuu1pfQv3FKg8Xsw3al3INrFrX9zlPv3TBr4eyUGXUaMuSmZANh5EXJc6pzXadzZ.m$$pvIvFMXRUTJ8dgkZsnzxA0DZuw4wqtRsqFoZ9mnVn4jDArZk2NwY6plqoEV1GtE7QMYGfFHRRHf4UmG4utALbii5AhpWQXy0z());
        }
    }
}

