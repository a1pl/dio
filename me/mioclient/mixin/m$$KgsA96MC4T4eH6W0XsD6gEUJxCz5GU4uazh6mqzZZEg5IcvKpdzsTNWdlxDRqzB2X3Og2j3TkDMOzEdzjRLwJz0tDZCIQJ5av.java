package me.mioclient.mixin;

import me.mioclient.m$$7asR1m6msy4qQ8giUQRI0c3QXEtnOWwZKmmsr7wSAfbWgaqWaCsxFxVeK9qeZV7eQNtgorblQKOvkRA51a5EgMlPYM8jR8qJS;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$xEte45wk0NIx0JPzdqpWIzMz2VtkITqCOJ7246Cle0S0BrOBmjQZzC6MFtHg7GvEpErQES6dUOvzeqo0hzaYmRuiwCbdBRFFJ;
import me.mioclient.m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8;
import net.minecraft.class_10255;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1937;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Mixin(value={class_10255.class})
public abstract class m$$KgsA96MC4T4eH6W0XsD6gEUJxCz5GU4uazh6mqzZZEg5IcvKpdzsTNWdlxDRqzB2X3Og2j3TkDMOzEdzjRLwJz0tDZCIQJ5av
extends class_1297
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    private static final m$$7asR1m6msy4qQ8giUQRI0c3QXEtnOWwZKmmsr7wSAfbWgaqWaCsxFxVeK9qeZV7eQNtgorblQKOvkRA51a5EgMlPYM8jR8qJS m$$KgsA96MC4T4eH6W0XsD6gEUJxCz5GU4uazh6mqzZZEg5IcvKpdzsTNWdlxDRqzB2X3Og2j3TkDMOzEdzjRLwJz0tDZCIQJ5av = (m$$7asR1m6msy4qQ8giUQRI0c3QXEtnOWwZKmmsr7wSAfbWgaqWaCsxFxVeK9qeZV7eQNtgorblQKOvkRA51a5EgMlPYM8jR8qJS)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$7asR1m6msy4qQ8giUQRI0c3QXEtnOWwZKmmsr7wSAfbWgaqWaCsxFxVeK9qeZV7eQNtgorblQKOvkRA51a5EgMlPYM8jR8qJS.class);
    @Unique
    private m$$xEte45wk0NIx0JPzdqpWIzMz2VtkITqCOJ7246Cle0S0BrOBmjQZzC6MFtHg7GvEpErQES6dUOvzeqo0hzaYmRuiwCbdBRFFJ m$$bhjmIQJ3z9GdMzjNLx0s0qiWLozkMDSSmjPx8lqlfaVFoMnTejLBQyrZKbp8kinqb4190vFHMH2GRYh4QHxskU6uUoO0z66vW;
    private static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 1433174308;

    public m$$KgsA96MC4T4eH6W0XsD6gEUJxCz5GU4uazh6mqzZZEg5IcvKpdzsTNWdlxDRqzB2X3Og2j3TkDMOzEdzjRLwJz0tDZCIQJ5av(class_1299 class_12992, class_1937 class_19372) {
        super(class_12992, class_19372);
    }

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/vehicle/AbstractBoatEntity;move(Lnet/minecraft/entity/MovementType;Lnet/minecraft/util/math/Vec3d;)V", shift=At.Shift.BEFORE)})
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(CallbackInfo callbackInfo) {
        if (!m$$xEte45wk0NIx0JPzdqpWIzMz2VtkITqCOJ7246Cle0S0BrOBmjQZzC6MFtHg7GvEpErQES6dUOvzeqo0hzaYmRuiwCbdBRFFJ.m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn(this)) {
            return;
        }
        this.m$$bhjmIQJ3z9GdMzjNLx0s0qiWLozkMDSSmjPx8lqlfaVFoMnTejLBQyrZKbp8kinqb4190vFHMH2GRYh4QHxskU6uUoO0z66vW = new m$$xEte45wk0NIx0JPzdqpWIzMz2VtkITqCOJ7246Cle0S0BrOBmjQZzC6MFtHg7GvEpErQES6dUOvzeqo0hzaYmRuiwCbdBRFFJ(this.method_18798());
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(this.m$$bhjmIQJ3z9GdMzjNLx0s0qiWLozkMDSSmjPx8lqlfaVFoMnTejLBQyrZKbp8kinqb4190vFHMH2GRYh4QHxskU6uUoO0z66vW);
        m$$y1NeDwBNVf6QMfsBUh5os8X6rTXj6uOk2CUNcGLesVvEhrbZtj1y5vxYwO6JUfFdFNhlJsIZBiJyfnczBOWg37TCW5flHeoc8.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.method_18798(), this.m$$bhjmIQJ3z9GdMzjNLx0s0qiWLozkMDSSmjPx8lqlfaVFoMnTejLBQyrZKbp8kinqb4190vFHMH2GRYh4QHxskU6uUoO0z66vW.m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ(), this.m$$bhjmIQJ3z9GdMzjNLx0s0qiWLozkMDSSmjPx8lqlfaVFoMnTejLBQyrZKbp8kinqb4190vFHMH2GRYh4QHxskU6uUoO0z66vW.m$$zfldNZWJSxHy0Alw9Cqa3yNZ8WZ8yoJ6Drozs6MdqpmH0pR8ir3ZWdNM4n98DoQnCWQ1nIIZZy9nbFt2sNJRCEqD17MNg5oGe(), this.m$$bhjmIQJ3z9GdMzjNLx0s0qiWLozkMDSSmjPx8lqlfaVFoMnTejLBQyrZKbp8kinqb4190vFHMH2GRYh4QHxskU6uUoO0z66vW.m$$Q2ERdZ3xRYod7FvlIkKynPG6KHLWrQoM5iordEXbaZEYXfQkcOqvxAKQyLvVZJCMKlr1nUMmH78xV93T7xzST9gkbYpDYQGwm());
    }
}

