package me.mioclient.mixin;

import me.mioclient.m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9;
import net.minecraft.class_1059;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_918;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_918.class})
public class m$$gfNr3CiZiDjM6C9Dr0poKuxAtlKUotV73RoBkMR1HzpeuELQFwKujESpRa62A5zUM1p22TON1uywt9tUnfx9N273v64avm0G0 {
    private static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -1667301624;

    @ModifyArgs(method={"renderItem(Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;II[ILjava/util/List;Lnet/minecraft/client/render/RenderLayer;Lnet/minecraft/client/render/item/ItemRenderState$Glint;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/item/ItemRenderer;getItemGlintConsumer(Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/render/RenderLayer;ZZ)Lnet/minecraft/client/render/VertexConsumer;"))
    private static void m$$9vFcpqa5eflTL0srBkFm1bU8MypCAaM5v14ItjdillmOT6Gglf4WzP03KAcJZpQ9VHDpKjp1jdtAMWZogLj82wQy1haS76Knc(Args args) {
        if (m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9.m$$ewujVcVQaVxPR5QbTMH8bZtWjk2oDcdalXNCrDhqngTEPNyNgmX8dQ1ZYLugSC2oOAsUchu8vMD5vLjbCZKO6s4tkyJh13v1u) {
            class_1921 class_19212 = class_1921.method_62277((class_2960)class_1059.field_5275);
            args.set(1, (Object)class_19212);
        }
    }

    @ModifyArgs(method={"renderItem(Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;II[ILjava/util/List;Lnet/minecraft/client/render/RenderLayer;Lnet/minecraft/client/render/item/ItemRenderState$Glint;)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/item/ItemRenderer;getDynamicDisplayGlintConsumer(Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/render/RenderLayer;Lnet/minecraft/client/util/math/MatrixStack$Entry;)Lnet/minecraft/client/render/VertexConsumer;"))
    private static void m$$Bt2WCJQeHB4TyQsfZ992xBi26LbuV49cmrW6MFWw9l1Egjv10qEiHq87PKmGfmR1VNpWkJ6EsNCj7kXVm13P8hfE82mIMwLjf(Args args) {
        if (m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9.m$$ewujVcVQaVxPR5QbTMH8bZtWjk2oDcdalXNCrDhqngTEPNyNgmX8dQ1ZYLugSC2oOAsUchu8vMD5vLjbCZKO6s4tkyJh13v1u) {
            class_1921 class_19212 = class_1921.method_62277((class_2960)class_1059.field_5275);
            args.set(1, (Object)class_19212);
        }
    }
}

