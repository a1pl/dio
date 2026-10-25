package me.mioclient;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw;
import me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP;
import me.mioclient.m$$QvRaL3MEcHB7Zw6LGTIHIgvyXHcz8dO9xk0sWjrde2rwFR60mWOLQMrTPpwb4OJmQcdBNqDjLnGqj0kB8VPJVjAK0CML3JdS2;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm;
import me.mioclient.m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc;
import net.minecraft.class_151;
import net.minecraft.class_2172;
import net.minecraft.class_2561;
import net.minecraft.class_642;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f
extends m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP {
    public m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f() {
        super("autopreset");
        this.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("autoconfig", "autocfg");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.k = new Object[58];
                                m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.l = new String[58];
                                m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.e();
                                var21 = new String[15];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1("21SDrPk72ZWpJuHkyZtg", MethodHandles.lookup(), "m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1", m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.class, 918716516);
                                var20_3 = var18_2.length();
                                var17_4 = 41;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 65;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block28;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 =  /* dynamic constant */ (String)m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1("220gyYCk3NgAjKKuRplA", MethodHandles.lookup(), "m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1", m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.class, 2068027519);
                                    var20_3 = var18_2.length();
                                    var17_4 = 6;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 127;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block28;
                                        break;
                                    }
                                    break;
                                }
lbl31:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block29;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl88
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 18;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 77;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 105;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 16;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 39;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 112;
                                            break;
                                        }
                                        default: {
                                            v15 = 16;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
                                    v8 = v11;
                                    if (v11 != 0) break;
                                    v11 = v8;
                                    v9 = v9;
                                    v14 = v8;
                                    v12 = v9;
                                    v13 = v8;
                                }
lbl88:
                                // 2 sources

                                v16 = v9;
                                v10 = v10;
                            } while (v10 > var22_6);
                            v4 = new String(v16);
                            switch (v3) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl98:
                                // 1 sources

                                ** continue;
                            }
                        }
                        m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.c = var21;
                        m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.d = new String[15];
                        var8_7 = 3613539775434107409L;
                        var14_8 = new long[17];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1("edfuCL9140eP5dF7PYVW", MethodHandles.lookup(), "m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1", m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.class, 287070219);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1("BaLcj0EaFN33XnItLai5", MethodHandles.lookup(), "m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1", m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.class, 474089728));
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block30;
                            break;
                        }
lbl115:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 =  /* dynamic constant */ (String)m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1("sje1CpByRqgpl83NVw11", MethodHandles.lookup(), "m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1", m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.class, 1162294322);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1("zImtPxe2WbKG1htISdhL", MethodHandles.lookup(), "m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1", m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.class, 366089637));
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block30;
                                break;
                            }
                            break;
                        }
lbl128:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block31;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
                    switch (v20) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl139:
                        // 1 sources

                        ** continue;
                    }
                }
                m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.e = var14_8;
                m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.f = new Integer[17];
                m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 654435;
                var0_14 = 9012178677398317888L;
                var6_15 = new long[3];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1("rw5M97AHwjtA2EPbrjQy", MethodHandles.lookup(), "m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1", m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.class, 1622246344);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    break block32;
                    break;
                }
lbl152:
                // 1 sources

                while (true) {
                    var6_15[v22] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block33;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1("jBCI4UUGGxgKMtY8J5n2", MethodHandles.lookup(), "m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1", m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.class, 289688580));
            v22 = var3_16++;
            ** while (true)
        }
        m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.i = var6_15;
        m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.j = new Long[3];
        m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)5745084463168770207L);
    }

    public static void e() {
        Object[] objectArray = k;
        k[0] = "su|\u001f\u0019%xzmPd=k}d\u0019";
        objectArray[1] = "Wd\rl\u000f\\\"D\u0006c\u001e\u0013CJ\rh\u001aI7";
        objectArray[2] = "K\r?\u001fX=B\u0003<V\u001b0Z\u000b5PQ;M\u0010|RZ<\\\u0007*E\u001b\u0011G\u000f?P[6k\r<EP*\\";
        objectArray[3] = "[Rj\u001df8P]{R\u000b8P@o";
        objectArray[4] = "\u001eE,/WQ\u0015J=`6_\u001eA9:";
        objectArray[5] = "\"\u007f~$\"\u001d,v9,%\u0006awtm??\u001dWgy.\u0007wthx:\u0019\u0006w\"\r|E:wb&?:yha/{<\u0016}c,,\u00157V\u0011:~\u0017\u001aYh\u0010\u0006B8[\u001d 2\u0001't\u0007{\u0001\u0002-bf\u0005/:$r5/:\u0003\u0015*9{\u001d\" w3;\r'$k*=,\u001b\u007f@>\u000b\u0005";
        objectArray[6] = ",\u0003h\u0000$J\"\n/\b#Qo\u000bbI;\u0015\r\u0013\u0000\u001e:c\n7\u0015\u0007\u0015Q\f%\u0001\u0019?d\u00177~+\u0018\u0014,5u\u001a\u0002B\"'\u000b\u0003\u001fs\u0017T\"\u000ezP2!\u0001T<u\u0019718.B,,v\"<W$\u001c>\u0004uB\u00056\")\u001cQ\u000e\u0000\b.\u0002N3+\u0003\t\u001dm\u0003\r\u0000?\u0019\u001d\u0011\u0005-\u0003 ";
        objectArray[7] = Boolean.TYPE;
        m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.l[7] = "java/lang/Boolean";
        objectArray[8] = "h_)\u0016\u0002\u0006fVn\u001e\u0005\u001d+W#_\"\u0010jha\u001a\u000e.6Ch\r\u001d\nMu\u007f0\\+4J^\u0016\u0004\u001b}]K\b_\u0013|J23\u0003+\u007fQo\u001a]\u00036Y7\u0019.\u000bwt}#\u0012Z2SQ\f\nXrK72\u0013Qg[M\u0015\nX]Ye\"!\"5]7\u001a^\u0013BOD4Y^CU~\u0018\u001c";
        objectArray[9] = "3\u0017i!#m3\u0017~}/b)\\~c/w.-/:x5";
        objectArray[10] = " ilE;v i{\u00197y:\"{\u00077l=S/_`&";
        objectArray[11] = Void.TYPE;
        m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.l[11] = "java/lang/Void";
        objectArray[12] = "A~i>I\tA~~bE\u0006[5~|E\u0013\\D(\"\u0011P";
        objectArray[13] = Integer.TYPE;
        m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.l[13] = "java/lang/Integer";
        objectArray[14] = "|5t8eur<30bn?=~qmKD\"4\u001dkK%\u0000o8Yty8\u00032{hT\"\u001f\u000fElYi\u001e\u0019eM!\u0002(\u0000e)g\u001bl/jL\"\u001a\ngN\u007f%\u0003j\u000fD\\~\u0007i\u0010gVD\u0019>2M[C%*c[rx\u001e+&^Upb8!aNth\"$8kyd+\u001da";
        objectArray[15] = Long.TYPE;
        m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.l[15] = "java/lang/Long";
        objectArray[16] = "k\t]r<wu\u0001G=^mb\tGv";
        objectArray[17] = "\u0007ZL-QN\u000eTOd\u0012C\u0016\\FbXH\u0001G\u000faIH\bQDq\u0012s\u0001DTjND\u0000tSdIL\u0001[UAIH\bQDq";
        objectArray[18] = "u\u0005*l\u0002n|\u000b)%Acd\u0003 #\u000bhs\u0018i1\u001afq\u000f46\u0006nxD\u00147\bfs\u00193+\u0000oF\u0018(4\u0006es\u0018";
        objectArray[19] = "]IyPZ\fTGz\u0019\u0019\u0001LOs\u001fS\n[T:\u001fE\u0004KKq\u0010C\u0010\u0010u`\f^\rYgf\u0019B\u000e[H`*N\u0013[";
        objectArray[20] = "8>\u0011\u0014u\u000767V\u001cr\u001c{6\u001b]SQ\u0003?X\u000eOQ\"\u0003t)/\u0005;\u0010eHW\f\u000f\u000ei\u0003%>\"1\f5x\n\u0003/T*x\u0001'4q:*Z\r5\u000b4JP/\u001dj\u0015F\u000e6\u000eW*J\u0004\u0017\u0016G!LP\u0012>H\u001a)2>bz:u\u0001<\u0016\\.I\u001d\u00023L\u0015NQ2#q/L";
        objectArray[21] = "\u001ah*\u001f}S\u0013f)V>^\u000bn PtU\u001cuiPb[\fj\"_dOWF5VeQ\u001ci3eiL\u001c";
        objectArray[22] = "3`$<9\u001a:n'uz\u0017\"f.s0\u001c5}gp!\u001c<k,`z4\"h<\u007f1\u001b$M<{8\u00115}";
        objectArray[23] = "b\f:n\u00191k\u00029'Z<s\n0!\u00107d\u0011y\"\u00017m\u000722Z\u0012h\u001722\u00152@\u001105\u0019;o\u0017\u00155\u001d2e\u0006%";
        objectArray[24] = "\u0002\b86zm\u000b\u0006;\u007f9`\u0013\u000e2ysk\u0004\u0015{[xo\f\u0006;|";
        objectArray[25] = ",\u0012\u000fQl\fY2\u0004^}C$*\u0017Yt\nL";
        objectArray[26] = "\u0003|U\nOG\u0003|BVCH\u00197BHC]\u001eF\u0013\u0015\u0015\u001c";
        objectArray[27] = "$YV\u000bD`/VGD#x+JA\b\u0006i";
        objectArray[28] = "4JMa2.=DN(q#%LG.;(2W\u000e<*&0@S;6.9\u000bs:8&2VT&0/$gU&3%2W";
        objectArray[29] = "J|&yz\"Tt<678N~%j&2Ni~[;:Pq5l55Lx\u0016m \"Rx";
        objectArray[30] = "\u0006\u0011<QM]\u0018\u0019&\u001e G\u0000\u001c/S\u0017A\u0003\u001e";
        objectArray[31] = "\u001c\r-\u00070J\u0012\u0004j\u000f7Q_\u0005'NhQ%\u0002A\r3G82I2\u0012\u00125\u000fj\u00062U\u0000/v'aG%!M\u001d\u000e]I\u000bm?\u0010oG\u0002L3=J$QB\"\u0017rB\u001bE\u0000\u001e\u001cI&7$2@C\u0002U]iU\u0015\u0004h\u000elf3\u00183%?|&\\S2 W\u001d\u001e`\u0013\u0015\u0010<\u000fW\u0000\u001e";
        objectArray[32] = "<fXB\u000fQ<fO\u001e\u0003^&-O\u0000\u0003K!\\\u001aXP";
        objectArray[33] = "g\u001f\u001e'0\u0000y\u0017\u0004h]\u001aa\u0012\r%j\u001cb\u0010\u001b";
        objectArray[34] = "_rqyo\tAzk6\u0012\u0019A";
        objectArray[35] = "\u0000%q\u0015h\u0019Y4vjl\u001cJ.$\u0016~\u0016\\Kt\u0000=\u0003Y5?Uz\u000b0{#V}\u0011R\"2Q\u0002";
        objectArray[36] = "z\u007f8r;N1}?:DMm7\u0002\u0000%J8x\n\u0007\u001df%Y,\f\u001dR\nC\u0012-~Q\bv>\u0001<\u0010\u0005z\u0001}\u0018f\u001a&?\u0018+z\"Fh&\u001f\u0010\u000ez4\"\u001cl\u0018i6{tG+u(\u000f\u001dV+p\u0015\u000e\u000by\u0018*>\u0004\u001dbyq\u001c\u0007.K\"}lx5\u0011\u000f!#8=V\"V/CtF}d9!-Wz\u001bb*;Mp+m(\u007fZA&28;V'w0)'(";
        objectArray[37] = "\bG9N^\u000fXBnO/\u000e\\C\u001c^@\u001cTR3X/Q_\u0003*NM\bN\u0004U\u001eCX\fR%]M\u0003Z?n\u0019R\u0011]Aj\u001bN\u00051";
        objectArray[38] = "]F\u001eR8B\u0004W\u0019-.G)O]@(k\u0004SO-8@\u0006INV>X]Y\"\u001d<\u001c\u0012B@D-\u001bm";
        objectArray[39] = "QF(q]=H\r)31f]\u000b0,]T\u0001Mnv1bKL()\u0001`ZI<KS`\u000eF,s\n`M\u001eP(\nrK\b1%Cn\bw";
        objectArray[40] = "q\u0015\u00131\u0006d:\u0017\u0014yygf]\n}\bm\u0007!CZ\bM6J&d\u0000]qA\u001e`\u001c}z-3\u007f\u0010{s;\u0015a>s\u000e8CbGR\u0003\u001b\u0006P8e':CFCRz\u000e%0\u001dn$ \u00038\u001b<(\u000e\u0017:%`0\u0018CD)ou\u000e%R=O\u0007\u0018\ny\u0002<,:@PI]{?H\u0000Ilv\u000e\u0012b\u0010}qqDx\u0013:.\u0018\tg@iJL\u0019{\u0006|,\u001d\u001bj\u001a\u0002";
        objectArray[41] = "qO;,m\u0001&Nfp\u000b^0\u0002Vy4af\u0014l/iawKV\b5b|vy\u0011p_LhL\u000fvUcRN DyS\u001eW\u0013`[]`Y(TKx\u0015k\u0004k|&\u007fY;prghB\u001fJRFeb'tjCSj\u0007ZTCB5<FF#\u0010M-v{{lG>@_&nhAk^sW0{5QlS\u000bq7J{\u0017393Dq.";
        objectArray[42] = "\fdKmx2\u001b~Yd\u0007u\u001bwYy|r\u001d\u0018Z/l~\u001d}K/g2frJi~qZeP{w\u000e";
        objectArray[43] = "7)4hmQ$+&/]Z'+'q2!7)4hmQ$+&/]";
        objectArray[44] = "N\u0001.^1s\u0003\u001e}\rUu\u001f\u0005\u0002\u000f0wrI*Z*p\u0010\u0010;]U";
        objectArray[45] = "{C*\u001dN9n^$\u0015$13\u000f\u000e4\u001f,~~6\fv1f{\u001a:Y;b\u0012&\u0016d\u0016eq\b\bc&_\u00186+E:`O\u000f3~\u001fr\u001cj\u001d\u00191fJi3\u0014;y\u00135\u0017j\u0019EN\u00064mj!\u001f\u000e\u001dt\u0017&o\t\u0001t\u001e_q5\u0014\u001djO\u00198;{(}{3,]6nm'p\u0015=`Fg@\u001a?$QV\u0015@+'J+\u001aA;r#";
        objectArray[46] = "{\u0010S\t\\\f0\u0012TA#\u000flXy\u0006_U~\u0018\u0006Gg\u0013\u001b\u0018\u0006C\u001cQyIF\b\u0013'\u0019)\u0007]\u001e:#.^\u0001JT\u0000;F[^5\u001e=\u007fBZ\u000e\u0010\tWG\u001d\u0001'7|A}.\u001c\r\u0002aR\tx\t`\\Y2pKC\u0005J\u00170\u001dQJhT)\u0017j[l.0\r|b@81I\u00008\u0012\u0003?\u0011\t\b\u001d\u0001{\u00068[]\u0003{NT^FU\"t";
        objectArray[47] = "\u0005b.{|LVwl|@}\u0005o\"axQv\u007fS-\n\u0012sy`l&\u001eWuX^\u0006JNPR*:dMbwT'}t&w)#\u001c^C)*}gOqnP\u0004O\u000bu\u007fr\u0019qT~MRqDuuU,2Z\u0004uYk\u0012`rrXs\u0011hhL+w$dfc^b:\u001bV%@\u0010)SSr)s?\u001f\te\u0012!)\\Q/\".+\u0018F\u001e";
        objectArray[48] = "\f\u0014:5(9[\u0015giNj\u001b\u001aw=#e\u001du:6r|\u000b\u0017c'u\u0003\u000fOo` a[\u001ah%Ni\u001d\bs'r~\u0007\u001azX";
        objectArray[49] = " \u0006\u000br\u001a?y\u0006H*fm?\u0004Q/(z>\u0018O.fdy\u0014N<\u0007i0\b\rC";
        objectArray[50] = "I>;!\u001b[\u00179? pYNbm>\u001d^Hb\u0002aM__h|eOCK\u0004ej\u0012\u001cSa~\"\n\u0018/";
        objectArray[51] = "\u0010i\u0018O\u0007pG1\u0014Ows\u0001\"\u0003C\u0006y`^Jd\u0006YQ5/Z\u000eI\u0016>\u0017^\u0012i\u001dR:A\u001eo\u0014D\u001c_0giGJ\\IFdd\u000fn6q@EJxMF\u001dq,\u000e\u0013zC_\n\u0006\u0015(Oq\u001e\u0004+tWgJz'{\u0012q,l3[`g\u0003G\f(KEInGI\u001c@A>I|T7\u0018Z\np\u0014uq\u0001\u001d{Qk\u000bE\u0006o\u0011\u000eA\u0002\u0006q\u00146\t\u0006\b{-";
        objectArray[52] = "R!\u001c8</\u0019#\u001bpC,Ei\u0005t2&$\u0015LS2\u0006\u0015~)m:\u0016Ru\u0011i&6Y\u0019<v*0P\u000f\u001ah\u00048-\fLk}\u0019 /\tY\u0002.\u0004\u000eLOy\u0019Y:*9'%\u0007\u0014\f1!w\u000b:\u00183\u001f+\u0013,LM\u0013$V:*[\u0007\u0004$,\u0005p8w\u000f\u000eOYs\u0016X\u000bG\ts'U:\u001dk*6REKq)q\r,\u0006nz\"iu\u00195<#\u000b,\b2CyU4\u00100{1Q:\u001a\t";
        objectArray[53] = "\r{\u007f>O\u007f\u001aam70?\u0007jdG^ \u001e?<5\u000b2\u001fa\u0002)S:_9p|A;\u0001\u0007";
        objectArray[54] = "]]\u0018'Q\u007f\n\\E{7!Q@E0^!0\fFvH/RUWq7*\u000fVO6P*BZ\u0016J";
        objectArray[55] = "7\u0002fhM\u00027Oj11\u00198Pj\u000f_\u0006!\u00052}\n\u0014 [\faR\u001c`\u0003~4@\u001d>=";
        objectArray[56] = "@U%U+}WO7\\T,ZD3Q(,Q)8\u0016n-\u001bH&Q/{*G;Ul\u007fX\u0012)T2A";
        Object[] objectArray2 = objectArray;
        objectArray[57] = "n\u0015IdTD-\u0019\t&=E=\u0003P:QwlD\fb\u0005 `\u0011\f\"WB9\u0000\u000b]\rN?\u000e\u000e,DY.N0";
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A8E;
        if (f[n2] == null) {
            m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }

    public static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x1376) & Short.MAX_VALUE;
        if (j[n2] == null) {
            m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.j[n2] = i[n2] ^ l;
        }
        return j[n2];
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    @Override
    public void exec(LiteralArgumentBuilder literalArgumentBuilder) {
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("add").then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("server", (ArgumentType)StringArgumentType.string()).suggests(this::m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("category", new m$$QvRaL3MEcHB7Zw6LGTIHIgvyXHcz8dO9xk0sWjrde2rwFR60mWOLQMrTPpwb4OJmQcdBNqDjLnGqj0kB8VPJVjAK0CML3JdS2()).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("preset", new m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc()).executes(this::m$$I4tGAkMgP4uziHR1AQaFxemvamllvew3nCIgtVCCNjmCdDiGKbF5EaUcEYPWOKswpA7wtKsIwA006FnIr7irVrRsmDr8PuAsI)))));
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("delete").then(((RequiredArgumentBuilder)me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("server", (ArgumentType)StringArgumentType.string()).suggests(this::m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("category", new m$$QvRaL3MEcHB7Zw6LGTIHIgvyXHcz8dO9xk0sWjrde2rwFR60mWOLQMrTPpwb4OJmQcdBNqDjLnGqj0kB8VPJVjAK0CML3JdS2()).executes(this::m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N))).executes(this::m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr)));
    }

    public static String m$$XGHC8UTKgysywGMuxq0r5Bu4xBWxNGFeHfJhNGPAGwYI1nKK6gfbGXGm4QXUEgMJA0V4YLyU6AY1goEc2jnHFP3S6aOdhZ5S1(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{26, -65, -108, -73, -17, -122, -68, -85, -71, -78, -26, 97};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 12]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public CompletableFuture m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        class_642 class_6422 = m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$DCP1OlK4mrMuNMJyUpCBlLFJQ81dBHrl0cZcBgVGZpr3d373310DEuHUxX0CvLmbBDaYlaHoPTqGrarUJAnNKVoN4EPgTL5j8.m$$PL3piUhtZmqPDBugu9xnHJrZVpOzH3hSifwdQKRCe74e5mqa7K8gn8koFEReXLA664PeXK1DWyXBHZkl16X2fCWtjPmTqjyFy(-528041693);
        try {
            if (class_6422 == null) {
                return suggestionsBuilder.buildFuture();
            }
        } catch (class_151 class_1512) {
            throw m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.a(class_1512);
        }
        return class_2172.method_9265(Collections.singleton(class_6422.field_3761), (SuggestionsBuilder)suggestionsBuilder);
    }

    public CompletableFuture m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class_2172.method_9265((Iterable)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$mLAkRmscdf3d0QVIY25jllCt0TRMc9LZRM7StkWKq0Oq9b6UYYH2I2jbQ6t4GAMP1DUjRq8tilQJamyz9hx3WSwqHEZOB5cPC.m$$I6t76d6wLqSd6s7315v88EQU7m5XkRn1a6HGvkuWVAOrqlXugw6coKLqVLTq2Qyk0uPlrP87s5auxaazC6akZkGLxqLRkZy50(-1327625152), (SuggestionsBuilder)suggestionsBuilder);
    }

    public int m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N(CommandContext commandContext) {
        block3: {
            block2: {
                String string = (String)commandContext.getArgument("server", String.class);
                m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm = (m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm)commandContext.getArgument("category", m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.class);
                boolean bl = m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$mLAkRmscdf3d0QVIY25jllCt0TRMc9LZRM7StkWKq0Oq9b6UYYH2I2jbQ6t4GAMP1DUjRq8tilQJamyz9hx3WSwqHEZOB5cPC.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(string, m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm);
                try {
                    if (!bl) break block2;
                    m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)"Preset %s removed from auto-preset system".formatted(m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.getName())), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$8Bm4UPmKd41vpxP368fjeVYfJ9YwShsr4iIJwWY4SMjndAIm2xvRPBBgVkbMv9lml1qBune9KLTTjGcYlyFP53Aa8pgUXJipU);
                    break block3;
                } catch (class_151 class_1512) {
                    throw m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.a(class_1512);
                }
            }
            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)"Failed to remove preset from auto-preset system"), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$8Bm4UPmKd41vpxP368fjeVYfJ9YwShsr4iIJwWY4SMjndAIm2xvRPBBgVkbMv9lml1qBune9KLTTjGcYlyFP53Aa8pgUXJipU);
        }
        return 1;
    }

    public int m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr(CommandContext commandContext) {
        block3: {
            block2: {
                String string = (String)commandContext.getArgument("server", String.class);
                boolean bl = m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$mLAkRmscdf3d0QVIY25jllCt0TRMc9LZRM7StkWKq0Oq9b6UYYH2I2jbQ6t4GAMP1DUjRq8tilQJamyz9hx3WSwqHEZOB5cPC.m$$YKijqkQLQFlJwGQrCPIf2qAeeJp0LiZ6TFS5dSgZkU3mS0GioiPLQzm08gbfsDQvbcNEGYQ9eOQB0bGLbkkn73y1F2xsqvkEt(string, 1718183908);
                try {
                    if (!bl) break block2;
                    m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)"Server %s removed from auto-preset system".formatted(string)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$8Bm4UPmKd41vpxP368fjeVYfJ9YwShsr4iIJwWY4SMjndAIm2xvRPBBgVkbMv9lml1qBune9KLTTjGcYlyFP53Aa8pgUXJipU);
                    break block3;
                } catch (class_151 class_1512) {
                    throw m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f.a(class_1512);
                }
            }
            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)"Failed to remove server from auto-preset system"), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$8Bm4UPmKd41vpxP368fjeVYfJ9YwShsr4iIJwWY4SMjndAIm2xvRPBBgVkbMv9lml1qBune9KLTTjGcYlyFP53Aa8pgUXJipU);
        }
        return 1;
    }

    public int m$$I4tGAkMgP4uziHR1AQaFxemvamllvew3nCIgtVCCNjmCdDiGKbF5EaUcEYPWOKswpA7wtKsIwA006FnIr7irVrRsmDr8PuAsI(CommandContext commandContext) {
        String string = (String)commandContext.getArgument("server", String.class);
        m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm = (m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm)commandContext.getArgument("category", m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.class);
        String string2 = (String)commandContext.getArgument("preset", String.class);
        m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$mLAkRmscdf3d0QVIY25jllCt0TRMc9LZRM7StkWKq0Oq9b6UYYH2I2jbQ6t4GAMP1DUjRq8tilQJamyz9hx3WSwqHEZOB5cPC.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(string.toLowerCase(Locale.ROOT), m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm, string2);
        return 1;
    }
}

