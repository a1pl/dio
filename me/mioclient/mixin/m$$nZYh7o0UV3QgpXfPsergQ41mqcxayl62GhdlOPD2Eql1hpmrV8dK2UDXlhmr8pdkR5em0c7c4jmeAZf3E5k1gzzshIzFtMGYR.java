package me.mioclient.mixin;

import me.mioclient.m$$52ZWf5d2CsP7zDPm81MiBiVAZG3WqWkx7ge7dmEtqnRj3aS52x2UJxFmC5hV8RUVVJTX1xtT4AOT9F6iv9b85jQyeU8aVOIql;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9;
import me.mioclient.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml;
import me.mioclient.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_10017;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Mixin(value={class_897.class})
public abstract class m$$nZYh7o0UV3QgpXfPsergQ41mqcxayl62GhdlOPD2Eql1hpmrV8dK2UDXlhmr8pdkR5em0c7c4jmeAZf3E5k1gzzshIzFtMGYR {
    private static final m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9 m$$wd7DcbNEgU13KaqguDUw0pmNyf2nV8wClFYTcpZMJXhfqYh4SSx8TsHUnqZYgualovFWJFiAxApeLCutPJA7lJG74OgN1z8bq = (m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$Ynr1vFJawXYMkUv0PPNZoYAd10uLHoV0KI6XuNwFMfo5S8p1WNkG38mbJGZfc7qyD833g3OPhvXPdOYhqYE89KlU7HSX1pRY9.class);
    private static final m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml m$$Eptpbrf8OJi8ylJn4vw42SuYHtUUwMIVPNZgEwnmlW8On8xML48lY1XaokifHYUo9LzRM2w5zTCwTvwLlePpCcFrYcjrmZg5W = (m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml.class);
    private static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 1562902114;

    @Inject(method={"renderLabelIfPresent"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_10017 class_100172, class_2561 class_25612, class_4587 class_45872, class_4597 class_45972, int n, CallbackInfo callbackInfo) {
        if (m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$JtS6y3OKtFrQBGPhp1gae1DLvN1o1q0CdA2l8YvkOM7MOgIwqYlQCSkJtW7xplPv6MutK1dKT8LRXJ59kItBpnJbycC0MEz7C.m$$a3qcWmacuu2a0vwsi4RmEzyQiHzp11joDO1Au10HYlzWmTi190jlMmGksXtwEoS0Xwa30eShEpoVX5zKeDnZ5HRhYLkYky0Pt) {
            callbackInfo.cancel();
            return;
        }
        class_1297 class_12972 = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_100172);
        m$$52ZWf5d2CsP7zDPm81MiBiVAZG3WqWkx7ge7dmEtqnRj3aS52x2UJxFmC5hV8RUVVJTX1xtT4AOT9F6iv9b85jQyeU8aVOIql m$$52ZWf5d2CsP7zDPm81MiBiVAZG3WqWkx7ge7dmEtqnRj3aS52x2UJxFmC5hV8RUVVJTX1xtT4AOT9F6iv9b85jQyeU8aVOIql = new m$$52ZWf5d2CsP7zDPm81MiBiVAZG3WqWkx7ge7dmEtqnRj3aS52x2UJxFmC5hV8RUVVJTX1xtT4AOT9F6iv9b85jQyeU8aVOIql(class_45872, class_12972);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$52ZWf5d2CsP7zDPm81MiBiVAZG3WqWkx7ge7dmEtqnRj3aS52x2UJxFmC5hV8RUVVJTX1xtT4AOT9F6iv9b85jQyeU8aVOIql);
        if (m$$52ZWf5d2CsP7zDPm81MiBiVAZG3WqWkx7ge7dmEtqnRj3aS52x2UJxFmC5hV8RUVVJTX1xtT4AOT9F6iv9b85jQyeU8aVOIql.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"hasLabel"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1297 class_12972, double d, CallbackInfoReturnable callbackInfoReturnable) {
        if (class_12972 instanceof class_1657 && m$$wd7DcbNEgU13KaqguDUw0pmNyf2nV8wClFYTcpZMJXhfqYh4SSx8TsHUnqZYgualovFWJFiAxApeLCutPJA7lJG74OgN1z8bq.isToggled()) {
            callbackInfoReturnable.cancel();
            callbackInfoReturnable.setReturnValue((Object)class_12972.method_16914());
        }
    }

    @Inject(method={"getSkyLight"}, at={@At(value="RETURN")}, cancellable=true)
    private void m$$fR6eEarIPxvybR1zV4KkcbhQRgMmTBM3M3Em5rMRZPJBe6vWUTmeR70l4mHSeN304bm1lz8s4uMydpwWnakD21Fe6wibSyEN1(CallbackInfoReturnable callbackInfoReturnable) {
        if (!m$$Eptpbrf8OJi8ylJn4vw42SuYHtUUwMIVPNZgEwnmlW8On8xML48lY1XaokifHYUo9LzRM2w5zTCwTvwLlePpCcFrYcjrmZg5W.isToggled() || m$$nZYh7o0UV3QgpXfPsergQ41mqcxayl62GhdlOPD2Eql1hpmrV8dK2UDXlhmr8pdkR5em0c7c4jmeAZf3E5k1gzzshIzFtMGYR.m$$Eptpbrf8OJi8ylJn4vw42SuYHtUUwMIVPNZgEwnmlW8On8xML48lY1XaokifHYUo9LzRM2w5zTCwTvwLlePpCcFrYcjrmZg5W.m$$VHJ6p64N24N0M25oyuhth5vzwp83ziTyyxtiPXTsRRYz63S3H5rRbVf1KmmwdabnyipEibARObKwHJqz6E0vTnIG1T3sVglTQ.getValue() != m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$nbZFmHgYw3NH1NdZLJBaLgaMxB0PPWDFaRoqFOiOiI0BEWQJSgXJmnn2jNyYjNL1IdPart28XsNZMSxJLydPC4AuSv4YY0xrZ) {
            return;
        }
        callbackInfoReturnable.setReturnValue((Object)Math.max((Integer)m$$nZYh7o0UV3QgpXfPsergQ41mqcxayl62GhdlOPD2Eql1hpmrV8dK2UDXlhmr8pdkR5em0c7c4jmeAZf3E5k1gzzshIzFtMGYR.m$$Eptpbrf8OJi8ylJn4vw42SuYHtUUwMIVPNZgEwnmlW8On8xML48lY1XaokifHYUo9LzRM2w5zTCwTvwLlePpCcFrYcjrmZg5W.m$$jVxShk5rXRDfargPoj3rXr6HiV6s7n8LJQwj2QuEjOIjD2Ixc5jKkKeOUO0nzpPpAcn2OynscJX8eqb7ROYkNjbw4O3xgzx7b.getValue(), callbackInfoReturnable.getReturnValueI()));
    }

    @Inject(method={"updateRenderState"}, at={@At(value="HEAD")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1297 class_12972, class_10017 class_100172, float f, CallbackInfo callbackInfo) {
        m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_100172, class_12972);
    }
}

