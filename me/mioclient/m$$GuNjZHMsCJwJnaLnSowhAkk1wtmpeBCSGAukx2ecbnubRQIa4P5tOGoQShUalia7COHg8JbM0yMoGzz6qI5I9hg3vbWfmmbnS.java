package me.mioclient;

import baritone.api.pathing.goals.GoalXZ;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0;
import me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_151;
import net.minecraft.class_243;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS
extends m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP {
    public m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS() {
        super("walk");
    }

    @Override
    public void exec(LiteralArgumentBuilder literalArgumentBuilder) {
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("name", (ArgumentType)StringArgumentType.string()).suggests((commandContext, suggestionsBuilder) -> m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(commandContext, suggestionsBuilder, m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO(-1435993114))).executes(commandContext -> {
            class_243 class_2432 = m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$ZaD3M0jv7OKLL5o46rdCtPy8hIHUWkQwHiymBJrAs8Rx7AkYyizdJsbYM7bheQ2XDJQqqsI7QTERMWze3ESAiWCzZZRMyzfVV(commandContext, 826898665);
            try {
                if (class_2432 == null) {
                    return 0;
                }
            } catch (class_151 class_1512) {
                throw m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.a(class_1512);
            }
            CallSite callSite = m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.e("\u00f6", (Object)m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.e("\u00c8", (long)2597610162950618L), (long)1978341544108694L);
            GoalXZ goalXZ = new GoalXZ((int)class_2432.method_10216(), (int)class_2432.method_10215());
            m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.e("\u00f6", (Object)m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.e("\u00f6", (Object)callSite, (long)2621610965399242L), (Object)goalXZ, (long)1933893829565998L);
            return 1;
        }));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.i = new Object[40];
                        m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.j = new String[40];
                        m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.e();
                        var17 = new String[2];
                        var15_1 = 0;
                        var14_2 =  /* dynamic constant */ (String)m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.m$$oNKgPQgnjIi8grRgbJvmsnAX9VWV8nOdH0QveCeEDS6Evd2EfyY4oBz4pBPxdbB2pssDBU9lDQM7D8iAxWCsa0pYhTU5rjGBX("Gng4lYpe5HQJzt8XUhoU", MethodHandles.lookup(), "m$$oNKgPQgnjIi8grRgbJvmsnAX9VWV8nOdH0QveCeEDS6Evd2EfyY4oBz4pBPxdbB2pssDBU9lDQM7D8iAxWCsa0pYhTU5rjGBX", m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.class, 1058041445);
                        var16_3 = var14_2.length();
                        var13_4 = 4;
                        var12_5 = -1;
lbl10:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var17[var15_1++] = new String(v0).intern();
                            if ((var12_5 += var13_4) < var16_3) {
                                var13_4 = var14_2.charAt(var12_5);
                                ** continue;
                            }
                            break block21;
                            break;
                        }
                        v1 = ++var12_5;
                        v2 = var14_2.substring(v1, v1 + var13_4).toCharArray();
                        v3 = v2.length;
                        var18_6 = 0;
                        v4 = 26;
                        v5 = v2;
                        v6 = v3;
                        if (v3 > 1) ** GOTO lbl70
                        do {
                            v7 = v4;
                            v5 = v5;
                            v8 = v5;
                            v9 = v4;
                            v10 = var18_6;
                            while (true) {
                                switch (var18_6 % 7) {
                                    case 0: {
                                        v11 = 6;
                                        break;
                                    }
                                    case 1: {
                                        v11 = 80;
                                        break;
                                    }
                                    case 2: {
                                        v11 = 25;
                                        break;
                                    }
                                    case 3: {
                                        v11 = 49;
                                        break;
                                    }
                                    case 4: {
                                        v11 = 5;
                                        break;
                                    }
                                    case 5: {
                                        v11 = 110;
                                        break;
                                    }
                                    default: {
                                        v11 = 93;
                                    }
                                }
                                v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                                ++var18_6;
                                v4 = v7;
                                if (v7 != 0) break;
                                v7 = v4;
                                v5 = v5;
                                v10 = v4;
                                v8 = v5;
                                v9 = v4;
                            }
lbl70:
                            // 2 sources

                            v0 = v5;
                            v6 = v6;
                        } while (v6 > var18_6);
                        ** while (true)
                    }
                    m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.c = var17;
                    m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.d = new String[2];
                    var4_7 = 1919796090660854250L;
                    var10_8 = new long[12];
                    var7_9 = 0;
                    var8_10 =  /* dynamic constant */ (String)m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.m$$oNKgPQgnjIi8grRgbJvmsnAX9VWV8nOdH0QveCeEDS6Evd2EfyY4oBz4pBPxdbB2pssDBU9lDQM7D8iAxWCsa0pYhTU5rjGBX("XHMwlfP8PWFfJIvTn6AY", MethodHandles.lookup(), "m$$oNKgPQgnjIi8grRgbJvmsnAX9VWV8nOdH0QveCeEDS6Evd2EfyY4oBz4pBPxdbB2pssDBU9lDQM7D8iAxWCsa0pYhTU5rjGBX", m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.class, 1137404394);
                    var9_11 = var8_10.length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.m$$oNKgPQgnjIi8grRgbJvmsnAX9VWV8nOdH0QveCeEDS6Evd2EfyY4oBz4pBPxdbB2pssDBU9lDQM7D8iAxWCsa0pYhTU5rjGBX("NR6oFPIiH9Ku5xtZCOZd", MethodHandles.lookup(), "m$$oNKgPQgnjIi8grRgbJvmsnAX9VWV8nOdH0QveCeEDS6Evd2EfyY4oBz4pBPxdbB2pssDBU9lDQM7D8iAxWCsa0pYhTU5rjGBX", m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.class, 117207568));
                        v12 = var10_8;
                        v13 = var7_9++;
                        v14 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                        v15 = -1;
                        break block22;
                        break;
                    }
lbl93:
                    // 1 sources

                    while (true) {
                        v12[v13] = v16;
                        if (var6_12 < var9_11) ** continue;
                        var8_10 =  /* dynamic constant */ (String)m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.m$$oNKgPQgnjIi8grRgbJvmsnAX9VWV8nOdH0QveCeEDS6Evd2EfyY4oBz4pBPxdbB2pssDBU9lDQM7D8iAxWCsa0pYhTU5rjGBX("0z19Evhtx1C1uxx7Gwxn", MethodHandles.lookup(), "m$$oNKgPQgnjIi8grRgbJvmsnAX9VWV8nOdH0QveCeEDS6Evd2EfyY4oBz4pBPxdbB2pssDBU9lDQM7D8iAxWCsa0pYhTU5rjGBX", m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.class, 854605498);
                        var9_11 = var8_10.length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.m$$oNKgPQgnjIi8grRgbJvmsnAX9VWV8nOdH0QveCeEDS6Evd2EfyY4oBz4pBPxdbB2pssDBU9lDQM7D8iAxWCsa0pYhTU5rjGBX("ghUqeBzAOtlGXy3cfNG3", MethodHandles.lookup(), "m$$oNKgPQgnjIi8grRgbJvmsnAX9VWV8nOdH0QveCeEDS6Evd2EfyY4oBz4pBPxdbB2pssDBU9lDQM7D8iAxWCsa0pYhTU5rjGBX", m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.class, 1439450369));
                            v12 = var10_8;
                            v13 = var7_9++;
                            v14 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                            v15 = 0;
                            break block22;
                            break;
                        }
                        break;
                    }
lbl106:
                    // 1 sources

                    while (true) {
                        v12[v13] = v16;
                        if (var6_12 < var9_11) ** continue;
                        break block23;
                        break;
                    }
                }
                v16 = v14 ^ var4_7;
                switch (v15) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl117:
                    // 1 sources

                    ** continue;
                }
            }
            m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.e = var10_8;
            m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.f = new Integer[12];
            m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 257737;
            break block24;
lbl123:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 8537372457186293433L;
        ** while (true)
        var0_15 = 4565215607113624240L ^ var2_14;
        m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_15);
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2D1F;
        if (f[n2] == null) {
            m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }

    public static void e() {
        Object[] objectArray = i;
        i[0] = "l6%FD\u0012b?bNC\t/>/\u000fL,T!ecJ,5\u0003>Fx\u0013i;RLZ\u000fD!Nqd\u000bIjOgD*1\u0001y~DNw\u0018=QK+2\u0019[\u0019o\u00185\u0000;qe;n\u00048nF1T\u001aoLl<S&{\u001dz\u0015h\u001dzX\u007f2`ai_@)dksZ\u0019\figzc@";
        objectArray[1] = Long.TYPE;
        m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.j[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.j[2] = "java/lang/Integer";
        objectArray[3] = "eVWD93k_\u0010L>(&^]\rd:[Z\bY\u0011\u000elV F\u0013n{\u007f\rKd\u001brb*qh:Pz\u000f\\1\fL\u0001\u0010[\u0005:AgKO2\u0018it\u0013\u001f\u0006,{\u0002H`&+CbON?oRD.@\u0002\nru3L\u001f/}G4_#\u0011FX*e\t0FQ?F#\u0014K\u0003\u001a``";
        objectArray[4] = "ZpZ\u0017ecQ\u007fKX\u0018{BxB\u0011";
        objectArray[5] = "7ZfrdW>Te;'Z&\\l=mQ1G%?fV Ps('{;Xf=g\\\u0017Ze(l@ ";
        objectArray[6] = "\u001b2l)\u0015\u000f\u0012<o`V\u0002\n4ff\u001c\t\u001d//t\r\u0007\u001f8rs\u0011\u000f\u0016sRr\u001f\u0007\u001d.un\u0017\u000e\u000b\u001ftn\u0014\u0004\u001d/";
        objectArray[7] = "\u000e=~j_U\u00105d%\u0012O\n?}y\u0003E\n(&H\u001eM\u00140m\u007f\u0010B\b9N~\u0005U\u00169";
        objectArray[8] = "_xB%\u001d#VvAl^.N~Hj\u0014%Ye\u0001i\u0005%PsJy^\u001eYfZb\u0002)XV]l\u0005!Yy[I\u0005%PsJy";
        objectArray[9] = "A[2\u0013\u00141HU1ZW<P]8\\\u001d7GFqN\f9EQ,I\u00101L\u001a\fH\u001e9GG+T\u00160rF0K\u0010:GF";
        objectArray[10] = "37l%p#:9ol3.\"1fjy%5*/jo+%5dei?~\u000buyt\"7\u0019slh!56u_d<5";
        objectArray[11] = "r\u0002\u0006u}\u0013|\u000bA}z\b1\n\f<[EI\u0003OoGEh?cH'\u0011q,r)_\u0018E2~b-*h\r\u001bTp\u001eI\u0013CKp\u0015m\bf[\"NG\t\u001cUBDe!}tN\u001a|2@KB\u0010]*P@DDX\u0002_{!&t^m[}\u0015v*KOA\tH\u000f[tFEx\u001ffND";
        objectArray[12] = "7\u001d\u001bqT\u001c>\u0013\u00188\u0017\u0011&\u001b\u0011>]\u001a1\u0000X>K\u0014!\u001f\u00131M\u0000z3\u00048L\u001e1\u001c\u0002\u000b@\u00031";
        objectArray[13] = "Bg^:45Ki]sw8SaTu=3Dz\u001dv,3MlVfw\u0016H|Vf86`zTa4?O|qa06EmA";
        objectArray[14] = "'KLs\u001ax.EO:Yu6MF<\u0013~!V\u000f?\u0002~(@D/YV6CT0\u0012y0fT4\u001bs!V";
        objectArray[15] = "n\u000biNiOg\u0005j\u0007*B\u007f\rc\u0001`Ih\u0016*#kM`\u0005j\u0004";
        objectArray[16] = "2|\u000bKZg2|\u001c\u0017Vh(7\u001c\tV}/FMQ\u0004";
        objectArray[17] = "A|\u0010\u0000\u000f MxL\b\u000b&\rm\u0010\u0006\u0018*PnL 8:Pi\r\u0004< Bq2\u001b\u0014,Fn\u0011";
        objectArray[18] = "=S\u001f\"\u0019\u00051WC*\u001d\u0003qB\f?\u0005\u00031UC,\u0002\u000b3AC\f\u0002\u000b3";
        objectArray[19] = Void.TYPE;
        m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.j[19] = "java/lang/Void";
        objectArray[20] = "\u0018\u001dp\u0016\u0003!\u0014\u0019,\u001e\u0007'T5@\u001e\u0005'\u000e\u0013l\u001a'<\u0015\nk\u001b\u0012<";
        objectArray[21] = "Ut8\u0002\u0002\u0016Ypd\n\u0006\u0010\u0019\\\b\n\u0004\u0010Cz$\u000e";
        objectArray[22] = Double.TYPE;
        m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS.j[22] = "java/lang/Double";
        objectArray[23] = "\u001e\\}\u00144+\u0012X!\u001c0-R\u007fn\u000f)0\u0013Sj<\u0010\r";
        objectArray[24] = "x|4\u001dwFss%R\u0016Hxx!\b";
        objectArray[25] = "NO\u0014AfLM\u0003\u0013^\u0001\u0013X^xWMM1JH@>176n\u0003fJJ\bFu}.\u0005BJ\u007fA++\u0011sAA\u0017\u0005\u0017`|{?\u000fBpN>?\u0017#[_s\u001a6\t@oDI\u001e\u0012Gg;&80sGx\r5MsbL,1-XS:;/;KaJ\u0004& p{p\u0004\u001a,t>=L\u0011ND\u0004p\f\u001a\u000e*\u0007qN\u0013\u000fN@z\u001a\u0016r@Wa\rL\u001d\u0010@y\nt";
        objectArray[26] = "*\u0014&#\u0006a)X!<a><\u0005`\u0013\u001f0n\u0014T\u0017\u0001\nSwf8\u000b0n\u0011y3Q0,W@g\u001e\u0001[Bee\u001af+g',\u0004jllJ\u0017(+K\u0017^d\u000b\u001bqVr\u0013-9YuA>\u001b7*\u0016e&!!hMg;Y\u0018M`j`\u0019 hyI0\u001a\u0003,Of\u001d\r8Zm_\\X+(Ne8\u001f |K\u0018f\u00118kY!'\fe+)";
        objectArray[27] = "|k\nH\u0019\u0001/*\n_w\u0002{j\u007fR\u001e\u001d_p\\m\u001e\u0005v\u0016[IL@kg\u0000TJ\u001e\u0016zS[J\u000bu/U\u0005\u0010y";
        objectArray[28] = ">,\u0001i\u0003<6-\tf?o>ni,^e:h@\u001cVz2nV0R\u0000>iV=\u0003b*+\n*?";
        objectArray[29] = "\u0005US;?YYT[\u007fDFEJS,?AC%\u0002=zCS\u001fX\"'S8\u0018L.>F\\DM&z=";
        objectArray[30] = "on\tzzi5>\u0007c\u0004l,*\u000f|k\u0017on\tzzi5>\u0007c\u0004";
        objectArray[31] = "s'P16u#0H6\u000e\u007ft2P-bM v\ns0\u001aw/Vz6 ywYv\u000e";
        objectArray[32] = ">\u001d\t'\"\u0011=Q\u000e8EN(\fE%4DIp\f\u00024dx\u001bi<<t?\u0010Q8 T4||',R=jZ9\u0002Z@i\f:{{MJI\b\u0004Lik\f\u001e\u007f{4_jh!GjqL`'\u0015f_Xb\u0019I~I\f\u001c\u0015F;_j\n\u0001fIIE!>\u0015bk\u000f\but5n\u0007Xy\u0011a\u001cYb4Qj\\7dzD4RT={Ai \r(&Pt\u0019L5{\u0010\u0004\u001d\u00077uUzR]h>+";
        objectArray[33] = "\u001d7\u0018\u0006;\u0001_=Go\u0004Z\\=\fW()LL@%k,J\u007f\u0001\tg\bFG3)3\u0011cMG\u0015\u001d\u0012Qh9\b\u0004+\u0015hD\fe\u0001p6GR\u001e\u0010Bq=+6TF`\u001f6\b\u000bMR?^=*FJA\u001d#[FF\u0006=\u0019-AG\u001e>\u00117\u007f4\u001a\u000b\u001d9PA\u000f\u0015b\t\u0016_}\u0014(\u001a\u001cf\f\u0005aR-4\rW=\u0016Is\u0006\u00038k";
        objectArray[34] = "\u0006N(l],@Mpxm.C[3x\u0000!E4tm\u000e<I\r5pS|9\u0004-p\u00078\u0004K4,\u000eG\u0004D!g\u0016#XE)#m";
        objectArray[35] = "\u0001v\u0004zMAQa\u001c}uK\u0006c\u0004f\u0019yR'^8H.\u0005~\u00021M\u0014\u000b&\r=u";
        objectArray[36] = "E02\u0003\u000fMHm}\u0018}KGq\u001a\u001c\u001aZKa/\u001c}I\u0014=}ZAA\u00155rf";
        objectArray[37] = "g\u001e\u0005(Q(s\\Y?m%g\u0019)>\u00166m\u0000-$\u0004.R\u001f\u0005(\u00001qe\b>W7d\u001d[\u007fW \n";
        objectArray[38] = "!A$W\u0003\u001ejR%_jRpGs.\u0003C-E~G\u0000\u0014+\u0014\u0015G\u0007\u0013\u007fA|DP\u0015.*";
        Object[] objectArray2 = objectArray;
        objectArray[39] = "!n2k4g}o:/Onls6l3ng\u001e4atz~&&+w=\u001cw0, hutg*q\u0003";
    }

    public static String m$$oNKgPQgnjIi8grRgbJvmsnAX9VWV8nOdH0QveCeEDS6Evd2EfyY4oBz4pBPxdbB2pssDBU9lDQM7D8iAxWCsa0pYhTU5rjGBX(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{37, 116, 27, -110, -35, -65, -28, 31, -43, -34, -39, -20, -85, -46, 90, -85, 101, -44, -79, 28, -89};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 21]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

