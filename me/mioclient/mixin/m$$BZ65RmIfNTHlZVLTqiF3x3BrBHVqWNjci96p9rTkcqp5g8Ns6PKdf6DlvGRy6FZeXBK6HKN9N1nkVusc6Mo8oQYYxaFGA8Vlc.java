package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$ZvbGDU4FN1YoSkxBe0OdwnjmnR9qyYvRdtMLelcnSCZB3VLlrO8ECzTvegv29XaCBhfmoT9Q55ldP8akM3c21IQJaWxlmjLao;
import net.minecraft.class_333;
import net.minecraft.class_4065;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Mixin(value={class_333.class})
public class m$$BZ65RmIfNTHlZVLTqiF3x3BrBHVqWNjci96p9rTkcqp5g8Ns6PKdf6DlvGRy6FZeXBK6HKN9N1nkVusc6Mo8oQYYxaFGA8Vlc {
    private static m$$ZvbGDU4FN1YoSkxBe0OdwnjmnR9qyYvRdtMLelcnSCZB3VLlrO8ECzTvegv29XaCBhfmoT9Q55ldP8akM3c21IQJaWxlmjLao m$$nPOv40VwqbKwal7iXnfBZnLO7uxT1UUy4s8On2O1x1lDN1E2KgSimXS0RjZ94eRWtg4XuRmJOPvSzq2d5d35yKY3QBAUlMQOM = (m$$ZvbGDU4FN1YoSkxBe0OdwnjmnR9qyYvRdtMLelcnSCZB3VLlrO8ECzTvegv29XaCBhfmoT9Q55ldP8akM3c21IQJaWxlmjLao)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$ZvbGDU4FN1YoSkxBe0OdwnjmnR9qyYvRdtMLelcnSCZB3VLlrO8ECzTvegv29XaCBhfmoT9Q55ldP8akM3c21IQJaWxlmjLao.class);
    private static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 2017805594;

    @Inject(method={"getNarratorMode"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$yDK4FTzT0i2VDZNDh5GziSLpLFnovzLlp04OMlyk2IbrNPsl5ZAX8OxCoTUJrTJ1PmqFEP1mlK8KKb9bceSGkNjoKEghmz29t(CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$nPOv40VwqbKwal7iXnfBZnLO7uxT1UUy4s8On2O1x1lDN1E2KgSimXS0RjZ94eRWtg4XuRmJOPvSzq2d5d35yKY3QBAUlMQOM.isToggled()) {
            callbackInfoReturnable.setReturnValue((Object)class_4065.field_18176);
        }
    }

    @Inject(method={"onModeChange"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$qtpdMhw2QlSmCHxorxwgF6r42fzxc39tGpqEUu6AYtSnEhUSsUW8rmA5qHGTxhzR0G72uLnBdFuHnO6kryAFghi7OxJn6VmFo(CallbackInfo callbackInfo) {
        if (m$$nPOv40VwqbKwal7iXnfBZnLO7uxT1UUy4s8On2O1x1lDN1E2KgSimXS0RjZ94eRWtg4XuRmJOPvSzq2d5d35yKY3QBAUlMQOM.isToggled()) {
            callbackInfo.cancel();
        }
    }
}

