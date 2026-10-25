package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import net.minecraft.class_1058;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4603;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Mixin(value={class_4603.class})
public class m$$wd7DcbNEgU13KaqguDUw0pmNyf2nV8wClFYTcpZMJXhfqYh4SSx8TsHUnqZYgualovFWJFiAxApeLCutPJA7lJG74OgN1z8bq {
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$MOd0iA347hrvqnr4CTeKdC3uPnnyKt4tfPkOptIDjYj7QhVqjNKmhJIS8pxWUN3fb7z6Wbeo3OXjaRrGJlEXDvFUXpp485sbY = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    private static final m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv m$$cQZc5oKdvasPVXiXL6WcUUxbeF3bP86qUnqQAa2oNXmeC69dD470gkmO3NdrpFTKLBtOUS9fQt35eCnE2vu6sCxhvg7dQLCAm = (m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv.class);
    private static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 824960173;

    @Inject(method={"renderFireOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private static void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_4587 class_45872, class_4597 class_45972, CallbackInfo callbackInfo) {
        if (m$$MOd0iA347hrvqnr4CTeKdC3uPnnyKt4tfPkOptIDjYj7QhVqjNKmhJIS8pxWUN3fb7z6Wbeo3OXjaRrGJlEXDvFUXpp485sbY.isToggled() && ((Boolean)m$$wd7DcbNEgU13KaqguDUw0pmNyf2nV8wClFYTcpZMJXhfqYh4SSx8TsHUnqZYgualovFWJFiAxApeLCutPJA7lJG74OgN1z8bq.m$$MOd0iA347hrvqnr4CTeKdC3uPnnyKt4tfPkOptIDjYj7QhVqjNKmhJIS8pxWUN3fb7z6Wbeo3OXjaRrGJlEXDvFUXpp485sbY.m$$tPvXj3kNeRYQm2WjSmRDnwDcK6qCHa8hfmqpfZwqO4XZI4ex1JksUcEvmo77iC0WLPttrBTpvfmYCuMfqY5ZNgTnMpUqhp8WE.getValue()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderUnderwaterOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private static void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_310 class_3102, class_4587 class_45872, class_4597 class_45972, CallbackInfo callbackInfo) {
        if (m$$MOd0iA347hrvqnr4CTeKdC3uPnnyKt4tfPkOptIDjYj7QhVqjNKmhJIS8pxWUN3fb7z6Wbeo3OXjaRrGJlEXDvFUXpp485sbY.isToggled() && ((Boolean)m$$wd7DcbNEgU13KaqguDUw0pmNyf2nV8wClFYTcpZMJXhfqYh4SSx8TsHUnqZYgualovFWJFiAxApeLCutPJA7lJG74OgN1z8bq.m$$MOd0iA347hrvqnr4CTeKdC3uPnnyKt4tfPkOptIDjYj7QhVqjNKmhJIS8pxWUN3fb7z6Wbeo3OXjaRrGJlEXDvFUXpp485sbY.m$$8CV8a85SDAGQio9hjG9UlxmwRlH15JeGS2zjcAGXUngaSadL0HbsuMX4F5QqsMrNaavgjkIoPILl6ufPhLHoMp4RGvJ4KG5Qq.getValue()).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderInWallOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private static void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1058 class_10582, class_4587 class_45872, class_4597 class_45972, CallbackInfo callbackInfo) {
        if (m$$MOd0iA347hrvqnr4CTeKdC3uPnnyKt4tfPkOptIDjYj7QhVqjNKmhJIS8pxWUN3fb7z6Wbeo3OXjaRrGJlEXDvFUXpp485sbY.isToggled() && ((Boolean)m$$wd7DcbNEgU13KaqguDUw0pmNyf2nV8wClFYTcpZMJXhfqYh4SSx8TsHUnqZYgualovFWJFiAxApeLCutPJA7lJG74OgN1z8bq.m$$MOd0iA347hrvqnr4CTeKdC3uPnnyKt4tfPkOptIDjYj7QhVqjNKmhJIS8pxWUN3fb7z6Wbeo3OXjaRrGJlEXDvFUXpp485sbY.m$$8CV8a85SDAGQio9hjG9UlxmwRlH15JeGS2zjcAGXUngaSadL0HbsuMX4F5QqsMrNaavgjkIoPILl6ufPhLHoMp4RGvJ4KG5Qq.getValue()).booleanValue() || m$$cQZc5oKdvasPVXiXL6WcUUxbeF3bP86qUnqQAa2oNXmeC69dD470gkmO3NdrpFTKLBtOUS9fQt35eCnE2vu6sCxhvg7dQLCAm.isToggled()) {
            callbackInfo.cancel();
        }
    }
}

