package me.mioclient;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw;
import me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP;
import me.mioclient.m$$TRdDqBJgjZ1fw9rIVfhStjcPOPjNzy6jg68DukqXu2g24StbWqoO7VTCIgO8JxiARBFlRnv98GgLAhEyYbNiJhiID7o3hu0OB;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR;
import me.mioclient.m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn;
import me.mioclient.m$$q60MFbe6wdivWp4kRCKnlZZPlYEn3tV4kfyfYvLxmOjTDK7AxLlTtFsQ579mT62x8LKzvOCLsSewKyc0PBtW1vCddwE5OeN7R;
import me.mioclient.m$$ubtRL2B50mwv9Qoc27rHxIiwkjONOXo3lVednyIWERRzfpYRJMiC43UXQcv8ykEwqaQ6FPCTK0g6EruPNdPRzSSl6TZqehUeS;
import me.mioclient.m$$usnzfPeWGy6iAn1uPJLR6UgsJVhf38ORt1lPLe11bmnTdwQdPcmX3d47CHJiqfOhVCdu73R8QDlxYkQQkQDkuxD5AsqWq6mRg;
import me.mioclient.m$$v33dzTTzUOqpVDvK0GWgM9Jgtd96JFMDcdvE6O3juNUgjeUfkxgFaRHjaaFXwZ4ijj2JxNRD9T5sbDEXlmk3Oz6LEO98jAk0I;
import net.minecraft.class_1792;
import net.minecraft.class_2378;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2564;
import net.minecraft.class_2568;
import net.minecraft.class_2583;
import net.minecraft.class_5250;
import net.minecraft.class_7923;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg
extends m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP {
    public m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg() {
        super("trade");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.i = new Object[82];
                            m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.j = new String[82];
                            m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.e();
                            var17 = new String[29];
                            var15_1 = 0;
                            var14_2 =  /* dynamic constant */ (String)m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql("OuMeihxS2tWmXIvJmKlw", MethodHandles.lookup(), "m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql", m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.class, 1557289345);
                            var16_3 = var14_2.length();
                            var13_4 = 4;
                            var12_5 = -1;
lbl10:
                            // 2 sources

                            while (true) {
                                v0 = 115;
                                v1 = ++var12_5;
                                v2 = var14_2.substring(v1, v1 + var13_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v4.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                var14_2 =  /* dynamic constant */ (String)m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql("Hq557zYefGqTwqdtqPMF", MethodHandles.lookup(), "m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql", m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.class, 946181641);
                                var16_3 = var14_2.length();
                                var13_4 = 30;
                                var12_5 = -1;
lbl25:
                                // 2 sources

                                while (true) {
                                    v0 = 59;
                                    v5 = ++var12_5;
                                    v2 = var14_2.substring(v5, v5 + var13_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v4.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                break block28;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var18_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl88
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var18_6;
                            while (true) {
                                switch (var18_6 % 7) {
                                    case 0: {
                                        v15 = 35;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 21;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 105;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 82;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 35;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 101;
                                        break;
                                    }
                                    default: {
                                        v15 = 89;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var18_6;
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
                        } while (v10 > var18_6);
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
                    m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.c = var17;
                    m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.d = new String[29];
                    var4_7 = 2399939157779874352L;
                    var10_8 = new long[50];
                    var7_9 = 0;
                    var8_10 =  /* dynamic constant */ (String)m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql("S5gqRhfZCEU2ExzQXV6l", MethodHandles.lookup(), "m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql", m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.class, 821948004);
                    var9_11 = var8_10.length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql("VTA9gQp3eZvTd3MckZgI", MethodHandles.lookup(), "m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql", m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.class, 302847090));
                        v17 = var10_8;
                        v18 = var7_9++;
                        v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                        v20 = -1;
                        break block29;
                        break;
                    }
lbl115:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        var8_10 =  /* dynamic constant */ (String)m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql("sTbOuCUKWWe1tUS3vFNO", MethodHandles.lookup(), "m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql", m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.class, 468611785);
                        var9_11 = var8_10.length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql("37UGEUyYDLaXyoyA0tCM", MethodHandles.lookup(), "m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql", m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.class, 914015975));
                            v17 = var10_8;
                            v18 = var7_9++;
                            v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                            v20 = 0;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl128:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        break block30;
                        break;
                    }
                }
                v21 = v19 ^ var4_7;
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
            m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.e = var10_8;
            m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.f = new Integer[50];
            m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -281993;
            break block31;
lbl145:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 3882190210620356039L;
        ** while (true)
        var0_15 = 8207235504711630963L ^ var2_14;
        m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_15);
    }

    public static void e() {
        Object[] objectArray = i;
        i[0] = "IM E~CGDgMyX\nE*\fS\u0018]\u0019eL$YT\u001bZJDH]ziY]u`{Z[bU\u001d|cxS\u0018R\u001bw\u001f ZCf7l~h}\u0010bX~g`x=eyEW}`Pvz\u0017IZ|EEA\u001f9^Y]\u0011p?\\pKqmDja\\NyDRbi\u0010i9\u007f ";
        objectArray[1] = "K\u0005A/\u0016i@\nP`kqS\rY)";
        objectArray[2] = "\th\u001co\t\u0019|H\u0017`\u0018V\u001dF\u001ck\u001c\fi";
        objectArray[3] = "Y0\u0018?\u00172P>\u001bvT?H6\u0012p\u001e4_-[r\u00153N:\reT\u001eU2\u0018p\u00149y0\u001be\u001f%N";
        objectArray[4] = " \u0017\rwfY+\u0018\u001c8\u000bY+\u0005\b";
        objectArray[5] = "\u007fk[TKvtdJ\u001b*x\u007foNA";
        objectArray[6] = "&f)_D08n3\u0010&,?s";
        objectArray[7] = Void.TYPE;
        m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.j[7] = "java/lang/Void";
        objectArray[8] = "~,\u0018p\"sp%_x%h=$\u00129\u0002e|\u001bP|.[ 0Yk=\u007f[\u0006NV|^\"9op$nk.zn\u007ffj9\u0003U#^i\"^|}v *\u0006\u007f\u000e~a\u0007LE2/$ `j*-d8\u0006T3$q(|s*-K*TD\u0001W#.\u0006|~fT<uRy+U&O~<";
        objectArray[9] = "T\u0003eu]\nT\u0003r)Q\u0005NHr7Q\u0010I9#n\u0006R";
        objectArray[10] = "hYy9rdhYne~kr\u0012n{~~uc:#)4";
        objectArray[11] = Integer.TYPE;
        m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.j[11] = "java/lang/Integer";
        objectArray[12] = "\u0012\u001a\tw! \u0012\u001a\u001e+-/\bQ\u001e5-:\u000f Hkyy";
        objectArray[13] = "L[\u001b\u0005/nBR\\\r(u\u000fS\u0011L\t8wZR\u001f\u00158Vf~8ulOuoY\re{kc\u0012\u007fWVT\u0006$\"cwJ^;\"hSQ{+p3yP\u0001%\u00109[x`\u0004\u001cgBk];\u0010mcsM0\u00169f[B\u000bs[J\u0007p+/hHsV?\u0013tvVF\u0004\u00148FF{>\u0016";
        objectArray[14] = "fm\u0012z=\u0012fm\u0005&1\u001d|&\u000581\b{WRgg";
        objectArray[15] = "![\u0007pvU/R@xqNbS\r9qY*tS_}\u000f\nIbLG|uL\\ToW%\u000bpL{m\tIpoX}\u0005xZ(}\u000b\u0019U\u001bo|\u0002{HP/*B&S]{&c}]c[zc8]SYrr=]Cz~~'_[SJ`\n\tAwpu4\u000eb--\u007f\u0014V\u0010Mq";
        objectArray[16] = "q4km\fEq4|1\u0000Jk\u007f|/\u0000_l\u000e-pV\u0014";
        objectArray[17] = ">\u0000\u001dZ\u000e\u001a7\u000e\u001e\u0013M\u0017/\u0006\u0017\u0015\u0007\u001c8\u001d^\u0015\u0011\u0012(\u0002\u0015\u001a\u0017\u0006s<\u0004\u0006\n\u001b:.\u0002\u0013\u0016\u00188\u0001\u0004 \u001a\u00058";
        objectArray[18] = "\u0007\r4`}B\t\u0004shzYD\u0005>)a^\u0004\u0012|]qz-\u0011,dUC[\u001dJGX\u007f\\=}~^{\u0002\u000e)5[\u007f\u001eYv]XH[Yx`zy\u000e\u001fKiDN\u00070)i \u001a) PdeK%\u0000LNpX][H5Ei\u0006\u0010CfE|\u00019^faU.][~ez\u001b^w_s";
        objectArray[19] = "'W4k(\u0016)^sc/\rd_>\"'\t\r~-er\u0011\"\u000bMwq> h]d\u0014.9\u007f]I0\u0001 C}e3<z\u0007R2\u000e,&\u0002\\v(>\u0013]Rh+\u001a\u000e@bl\n\f8TbK70\u001cy{Lu>\u000bG{T&/\u0005~~4\u00006&p^~;7\u0002cpB\u000f\t\u000fXlq\u0004";
        objectArray[20] = "T].;Q9]S-r\u00124E[$tX?R@mtN1B_&{H%\u0019{-aY1R@\u0002g[#ZW-ah/GW";
        objectArray[21] = "\u000b{pW=\u0005\u0002us\u001e~\b\u001a}z\u00184\u0003\rf3\u0018\"\r\u001dyx\u0017$\u0019FUo\u001e%\u0007\rzi-)\u001a\r";
        objectArray[22] = "R=+U\u0002\u0005[3(\u001cA\bC;!\u001a\u000b\u0003T h\u0019\u001a\u0003]6#\tA8T#3\u0012\u001d\u000fU\u00134\u001c\u001a\u0007T<29\u001a\u0003]6#\t";
        objectArray[23] = "W\u00141l\n@^\u001a2%IMF\u0012;#\u0003FQ\tr \u0012FX\u001f90Ic]\u000f90\u0006Cu\t;7\nJZ\u000f\u001e7\u000eCP\u001e.";
        objectArray[24] = "|3\u000fQo\u0006u=\f\u0018,\u000bm5\u0005\u001ef\u0000z.L<m\u0004r=\f\u001b";
        objectArray[25] = "O\rH[F%F\u0003K\u0012\u0005(^\u000bB\u0014O#I\u0010\u000b\u0017^#@\u0006@\u0007\u0005\u000b^\u0005P\u0018N$X P\u001cG.I\u0010";
        objectArray[26] = "3\u0016\u0000)Yy=\u001fG!^bp\u001e\n`QG\u000b\u0001@\fWGj#\u001b)ex6\u001bw#Gd\u001b\u0001k\u001ey`\u0016Jj\bYAn!\\\u0011Y%(8\u0018>V@m9~vrsj \u001e\u001exP1$\u001d\u0001[Z\u000b:J#qW\f\u0006^rg~7=_7bY?AL0]B;KV5\u0004g6G_\f]";
        objectArray[27] = Long.TYPE;
        m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.j[27] = "java/lang/Long";
        objectArray[28] = "|sFU\u00151w|W\u001ar3bwWQI";
        objectArray[29] = Boolean.TYPE;
        m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.j[29] = "java/lang/Boolean";
        objectArray[30] = "5y\u0014\r<.;pS\u0005;5vq\u001eD\u001c\" *T94.\rnY-';*eL\u0010\u000f\u0011lVhP\u0006ro$v!\u0000\u0005\u0016Oy5-p\nMqX'\u000e0uRY;1,I^\r\u001a3\u001a}i\b\u0001\b\u0001*h4\u001c\u0002(XJ\"\f\u0000.*J\u0014\u0011;\u001f$S.\u001d\u0016.xt.\u0017\u0012mMo*a";
        objectArray[31] = "p\u0010Cb\u007f\u0000~\u0019\u0004jx\u001b3\u0018I+w\u0006/:=bU\u0019,<\u0006;T\t$8\u0000B_\u0007J\u0011,My\u0002e\u001186PX%\u0013\bLr_i!\u0015?y]Q\u0016\u0001}q)YA\u000b_t<y9 cl;[\u0001\u0017|L6~\u0018>ZE,*,\u000b6Q$[\u0000/HA\u001e|\u001a76s\")F\nL#";
        objectArray[32] = "sI\u001agjTsI\r;f[i\u0002\r%fNns\\|1\t";
        objectArray[33] = "c?}9\"9}7gvO#e2n;x%f0";
        objectArray[34] = "+\u0011\u0018Vg}%\u0018_^`fh\u0019\u0012\u001f7[\u000e\u0011^pi`(3\u0005h9^\u0005#\u0002N}W\u0007\u001fC}T$p\u0019\u0000V<!#CRamw\u0002=NrW#/\u0015rjWk\u0016ECo}}\u0010LY\u0003oF\u007f\u0013xVI \u00036n\u000b:a6Da^8]\u000e<XmW+10W\tiq!\u0003`KD";
        objectArray[35] = "*r\u0013GX_4z\t\b\u0005^2v\u0004KXy4a\u0000G\u001b";
        objectArray[36] = "}\u0013j?rwc\u001bpp:wy\u0011h73l94i0?v~\u001dr";
        objectArray[37] = "87_,_\u001c87HpS\u0013\"|HnS\u0006%\r\u00197\nF";
        objectArray[38] = ",H\"3W+,H5o[$6\u00035q[11rd(\fz";
        objectArray[39] = "\u0018@5fdO\u0018@\":h@\u0002\u000b\"$hU\u0005zs}<\u001e";
        objectArray[40] = "<p4#O\u00062ys+H\u001d\u007fx>jJ+\u001cx@}c/\u0016fS\u0001@\u00010CK4\u0016YiLl}h\u001c\u001c#c=`\u0013\u0002@l)\u0014,bsL\u001e\u001e%gtj\u000ba#6@)wi\u0018\u0003Sh\u0003C9g-[\u001c\u0010ZaRH\n^-+#x'p\u001c\u0004#Y8j!\"$~'e;\u0002B{\u0005t";
        objectArray[41] = "/7:OQ\"1? \u0000\u0019\"+58G\u00109k\u0003\"O\r.\n&)\\\u001e#*$";
        objectArray[42] = "%\u001a#k~a%K!d\u001d\u007f!\u0007\u0014nyc*{uv$n(\u0012'xalG";
        objectArray[43] = "4w~K\u0006\u0010.(11\u000e\u001f*P(T\fro|$O[\u00142,#Oa";
        objectArray[44] = "(\")Z \u001e|8!ZJ\u0004 ;/T&6vxv\npa+x1W)[=#$TJ_ }uJt\u000f2,v3t\fw}6\r$\u001e&~O";
        objectArray[45] = "&aC\u001a2[e9\\\u0017\u0003@;uK\u001arJZ\t\u0002=rjkbg\u0003zz,i_\u0007fZ'\u0005r\u0018j\\.\u0013T\u0006DTS\u0010\u0002\u0005=u^3G7BBz\u0012\u0002!9u'&dWgIy\bB_a\u001bu&V]_Gm0\u0002#SH(&d5GhZ0K\u001ex\u001bq\u0012\u000173z&\u0017\tgj\u0018z`SYb\u001ch;9Xr\u001cg6P\n|YeY";
        objectArray[46] = "q#<)\u0013\u0017i/j1q\\u*77\r\\iE<w\u0001\\)}5w\u0014\u0017\u0018z'u\u0001Iq()0\u0003&q#<)\u0013\u0017i/j1q";
        objectArray[47] = "\u0007n\u0005\u000f_z\u000eq\u001d\t;~\f`=\u0000Tp\u001a`\u001d\u001c;w^b\u0003\u000e\u0001a\u0005w\u0000m";
        objectArray[48] = "\u0017E\"8&\u0010G\u0002\";\u0019H\u0005Pk*hBd,\"\rhbUGG3`r\u0012L\u007f7|R\u0019 R(pT\u00106t6^\\m5\"5'}`\u0016g\u0007XJD7\"\u0011#}\u0019\u0003Dg}AG-bo{\u0013K\u0003vmEOS\u0015\"\u0013I@\u0016\u0003D\u0005]`d\u0015k.b\u0013O7!\u0007)r\u00182)W'@\u0013F`iwRBE\u0019hh\u0014Y\u0013p:fQ[|$gy\u0017\u0016\u0013`,pD)";
        objectArray[49] = "5P\u001be\u0019)5\u0001\u0019jz(>U\u000fd=8W\u000e\u00030\n9>\\\ru\bV5P\u001be\u0019)5\u0001\u0019jz";
        objectArray[50] = "~O\u000fV\f+dO\u0002\u0006`ni\rS\u0000\u000f\u0015~O\u000fV\f+dO\u0002\u0006`";
        objectArray[51] = "M]AYqsW\u0010X\u0000\u0000jX\\BXlX\f\u0018\u0013\u00031\u000fLZ\u0013A?l\u000fYS\u000e\u0000wHCDN|m\u0005Z\u001d?";
        objectArray[52] = "C`\u0001<hn\u0010`@2\u0012{\u001blS!\u0012-Oa\u0000d}i\u0004hS[";
        objectArray[53] = "Ve 2\u0019G\u0015=??(P\u001d2'*E_\u001b]c%MG];>uJGg0!u\u0012WWg&,\u00169\t\"(3BI\u0006!0>(";
        objectArray[54] = "t\u0007\u001cv\u0018-%R]jy%4@{4F\u001abVAb\u001b\u001as\t{EG\u0019x4T\\\u0002$H*aB\u0004.g\u0010cm6\u0002W\\z^\u0012 Y\"te&0|WFI\u0019\u0007\"=tv\u0002\tc*oR8)B'Oj\u0006\u0011G\u0011GJ(/G\u0000\u0018q4='R``\u0004\u0000\u007f.js2$\",E\f\u001d8e\u0005Xc\u0015;u\u0016&o\u00192}\u0016E0\u0014'!l";
        objectArray[55] = "\"/Ea\u001apw:C1\u007f-=(\u0015-\u0003-6E\u00116\u001f| *@<\u0002~M%\u0007,\u00119v%C<\u0004@";
        objectArray[56] = "=\u0000B)}w2\u0003Z$\u0017{3\u0012VUw~/\u0011Inw:?\u000405n{=\u0006\u000b5*k(\u007f";
        objectArray[57] = "4e\"\u0019iRap$I\f\u001e;b\u007f(l\u001b'a`\u0013l_7t\u0019Hu\u001e5v\"H1\u000e \u000f";
        objectArray[58] = "=r\u0007Du72q\u001fI\u001f*#`\u001eEc*(\r\u001a^\u007f{>bKTbySm\fDq>hmHTdG";
        objectArray[59] = "!:(P6O}$,CMX|*wO!j+i)\u0019q=j1,D-Fi.jEM\r}ioS?Qcm|(";
        objectArray[60] = "y\fFs\\)%\u0012B`'>$\u001c\u0019lK\fs_G:\u001c[p\n\u001cu\u001d=-Z\u001bu'k%_\u0001pU7;[\u0012\u000b";
        objectArray[61] = "\f\u000b#<E\u0017\\\u0019r?<L_\u001ayaP~\u000e]%9\u0004)\u000b\f|x\u0006OV\\{x<\u0019^Ya}NE@]r\u0006";
        objectArray[62] = "\u00059IljEXiNlPM[)I{,_Q?,+ X\u00001\u0017w>BRS\u0015x5]\u00065H(2]<";
        objectArray[63] = "\u000f-:h#\nD#y'N\u001dXa\tb!\u000fPp&dNK_x>\"(\u0016\u000f\u007f>\u0018uCGppa-\u000e\u000bd@#6\u0013\u0005-#su\u0013H\u001d";
        objectArray[64] = "\b9%\u000f3=HdzSW*_xD1;\u0003\n\u001eZ\u00045\u001dJ:gZ-\u000e-:x0+-\u0018\f_35\t\u0001%&\t8qC\u0018e\b.\u001f\u000enwQk\u0014\u000f>G\u00120\bL\nD \u0016 4dZ\u001b6\u0006)\u001eV\u000f\r)\re($8\u000b:4U\u001a\u0006%55Z\u000b6\u000e?k\u007fP72K\u0013Rkh>J$w\u0002:0\u000f&\u0018R=*\rn~\u000fm-\rT";
        objectArray[65] = "[L\rAa6W\u0017R\u0013\u0013!QID\u001b~Z\\G\u0006\u0005r7\r\u0012G\u0019\u0013eA\u0015L\u0010z7OPN\u007fx:\u0001\u0012N\u0013ta^@<";
        objectArray[66] = "s\u007f\"f7N#mseN\u0015 nx;\"'q)$cup}~'$5\u0002!`#7N";
        objectArray[67] = "W\u0014!d\u0007Y\u0004\u0014`j}\\\u0017\u000fwj\u0018'\f\u0017j3\u0002WTHg|}";
        objectArray[68] = "u\u0005O8\u0018T(E@y$\u0005~H\\)I\u001e\u0018Y\u00008ZX(\u0004@7\u001bd";
        objectArray[69] = "\u001dX\u0004IO5E\u0007\t\u00060 \u0013Bt\u0001\t8\u001a\u0003\u001f\u0001B8C:\u0013\u001b@u\u0005JKDM:z";
        objectArray[70] = "O\n_,{R\u001fW\u0000*\u00040\u001f\u0019Td<\u001cl\t%(N_i\u000f\u0016ibSM\u0003.[B\u0007T&$/~)W\u0014\u0001Qc0nP\u0001,gQD5_/9*U\u0007\u0018U@\u0002\u0011\u0003\tw]<N\b;W5\to\u0003#)v\u0017\u001e\u0003/nV-h\u0004.vU%r:]r`)|\u0015(g~VLS6\u0015e\u001fAY\u0000zy\f_Rd*uW^\u0007\rx{\u0012\\h";
        objectArray[71] = "?f-\u001c\r8%+4E|!*g.\u001d\u0010\u0013~#\u007fGLD=y!\u0013\u00066+'/\b|<:x(\u000b\u0000&waqz";
        objectArray[72] = "ew\u000fS6\u00176wN]L\b\"[QL0\u0018YuTF)\u0013:*YSui";
        objectArray[73] = "8?1>GChx1=x\u001b**x,\t\u0011KV1\u000b\t1z=T5\u0001!=6l1\u001d\u00016ZA.\u0011\u0007?Lg0?\u000fBO13F.Olt\u00019\u0019kM1\u0017B.6yWa\u001c\u0012hWqi\u001a@dyek$\u001c|o1\u0015(\u00139yW\u0003<3Kox(\u0003@`M2\u0001H!7H:QF\u0013<<so\u0016\u0001m?\nn\u0013Bhoq`\u0015\u00026\u00067a\u0018D9is*\u0011\u0017\u0006";
        objectArray[74] = "\u0015*1\u0010\u0014\u001dEm1\u0013+E\u0007?4\u0011irS\"h\u0013mlw+I\u001dzLH+@\u0018N\u007fB,kCyqKvl5v_YaR\u000fD~ZRx:iAe-i\u0019[[Q^w\u0013FKHKS\u000f{]TJV\u0010V\u007fMjF\u0003WjTwM=wei)R\u0001nMD,x\u0001dzN,S\u007f\u0014Q\u0012ce\u0016F_Wa\n@@\u001cEzqNF\\\u001b\u0013";
        objectArray[75] = "5Ul\u001f;\u000eh\u0015c^\u0007_>\u0018\u007f\u000ejDX[cXwQ1\tm\u001du>g\u0015+\u0011hW5\u001bn\u0013\u0007Si\u001al]7\u000e)\u0015-a";
        objectArray[76] = "@5je\u00058D(9a;-\u000fd\ra\u0004\u0012Yr77Y\u0012H-\r\u0010\u0005\u0011C\u0010\"\t@,s\u000e\u0017\u0017F&\\4\u00158t\nlx\f\u000bP(b\u0006\u00020d8Gs0\u001c[\u000f\u0019\u0019\u0002#@\u0001X\u000e\u0019\u0007z!y\u00039?D\u0019|51\u001fj'|$n$v5\u001cv\u00165F\bD\n\u001c&p,\u0019\b3YY)\u001c27;CvSHo(\u00028L!=&G:#+0+^2@t=>\u0002H";
        objectArray[77] = "8/\rR;2{w\u0012_\n(hk\u001aUc(\t.\u001dJtvosMMtLf}L\u001eo|3hJN\n";
        objectArray[78] = ",TL\u000e\u000e)pJH\u001du>qD\u0013\u0011\u0019\f%\u0000CKO[\"UIL\ferG\u0018Oukp\u0007\u000b\r\u00077n\u0003\u0018v";
        objectArray[79] = "+eB\u001c\nns:OSub+CSW\t\u001epf\tK\u000f`#fHEu";
        objectArray[80] = "Z1sEdr@n<?f<\u0014.vy\u007fjJa\u0000`9BT uQe@b0=\u000eM-ja\u0017y_o}?0AS_@\u001b=D\u007fVQ>\u0016|a@`<\u0012qNsv<)\u000fIwI\u0000pVYBU\t\u0005cR_{:|\u000fzYs5=\u007fdOR\">d:Sb\u001a+\\M+`\u0001L\u0003b+_*2PbjQP";
        Object[] objectArray2 = objectArray;
        objectArray[81] = "\u001bo0\u001fIkHoq\u00113|Kb\u000bCKt\u0017>h\u0013\btZ\u000eh\u0018Ap]m7\u0015T,'";
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4D34;
        if (f[n2] == null) {
            m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }

    public static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public void exec(LiteralArgumentBuilder literalArgumentBuilder) {
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("new").then(((RequiredArgumentBuilder)me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("name", (ArgumentType)StringArgumentType.string()).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("from", m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.registry((class_2378)class_7923.field_41178, -299569604)).then(((RequiredArgumentBuilder)me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("to", m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.registry((class_2378)class_7923.field_41178, -299569604)).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("max_price", (ArgumentType)IntegerArgumentType.integer((int)1, (int)64)).executes(this::m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G))).executes(this::m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G)))).executes(this::m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN)));
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("edit").then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("trade", m$$usnzfPeWGy6iAn1uPJLR6UgsJVhf38ORt1lPLe11bmnTdwQdPcmX3d47CHJiqfOhVCdu73R8QDlxYkQQkQDkuxD5AsqWq6mRg.simple(m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml, -1763539417)).executes(this::m$$7tjAleuL4xab6jbtqR5tlyOX9AzvmaYR4Eg6nSqAg9bsbrzBT9Y89kNtF2fBeCa1EOn2kv3g0u8fRk949bbmVH03mPGLUp6As)));
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("delete").then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("trade", m$$usnzfPeWGy6iAn1uPJLR6UgsJVhf38ORt1lPLe11bmnTdwQdPcmX3d47CHJiqfOhVCdu73R8QDlxYkQQkQDkuxD5AsqWq6mRg.simple(m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml, -1763539417)).executes(this::m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi)));
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("enchant").then(((RequiredArgumentBuilder)me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("trade", m$$usnzfPeWGy6iAn1uPJLR6UgsJVhf38ORt1lPLe11bmnTdwQdPcmX3d47CHJiqfOhVCdu73R8QDlxYkQQkQDkuxD5AsqWq6mRg.simple(m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml, -1763539417)).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("clear").executes(this::m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ))).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("enchantment", new m$$q60MFbe6wdivWp4kRCKnlZZPlYEn3tV4kfyfYvLxmOjTDK7AxLlTtFsQ579mT62x8LKzvOCLsSewKyc0PBtW1vCddwE5OeN7R()).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("lvl", (ArgumentType)IntegerArgumentType.integer()).executes(this::m$$fpGL7c3hh9Wq0GjZGbUWsMGOqxjqgcrE05H4OUl0FpiGYoHnjcDrxjKurfxMvIVKaJ4GAuaRgVOLd2AOlBDxzNHQjDNpEjvwE)))));
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("list").executes(this::m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ));
        literalArgumentBuilder.executes(commandContext -> this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(new m$$v33dzTTzUOqpVDvK0GWgM9Jgtd96JFMDcdvE6O3juNUgjeUfkxgFaRHjaaFXwZ4ijj2JxNRD9T5sbDEXlmk3Oz6LEO98jAk0I()));
    }

    public static /* synthetic */ class_2583 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2568 class_25682, class_2558 class_25582, class_2583 class_25832) {
        return class_25832.method_10949(class_25682).method_10958(class_25582);
    }

    public class_2561 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7 m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7) {
        String string = new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7.getName()).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR.m$$TRdDqBJgjZ1fw9rIVfhStjcPOPjNzy6jg68DukqXu2g24StbWqoO7VTCIgO8JxiARBFlRnv98GgLAhEyYbNiJhiID7o3hu0OB(-1241911330)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\u0001trade edit \u0001");
        class_5250 class_52502 = class_2561.method_43470((String)m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7.getName());
        class_2568.class_10613 class_106132 = new class_2568.class_10613((class_2561)class_2561.method_43470((String)"Click to edit"));
        class_2558.class_10609 class_106092 = new class_2558.class_10609(string);
        class_52502.method_27694(arg_0 -> m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2568)class_106132, (class_2558)class_106092, arg_0));
        return class_52502;
    }

    public int m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G(CommandContext commandContext) {
        int n;
        String string = (String)commandContext.getArgument("name", String.class);
        class_1792 class_17922 = (class_1792)commandContext.getArgument("from", class_1792.class);
        class_1792 class_17923 = (class_1792)commandContext.getArgument("to", class_1792.class);
        try {
            n = (Integer)commandContext.getArgument("max_price", Integer.class);
        } catch (IllegalArgumentException illegalArgumentException) {
            n = 64;
        }
        m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7 m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7 = new m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7(string, class_17922, class_17923, n, new ArrayList());
        m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7, -664116469);
        m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.b((int)-1630, (int)22547).formatted(string)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1));
        return 1;
    }

    public int m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi(CommandContext commandContext) {
        m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7 m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7 = (m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7)commandContext.getArgument("trade", m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7.class);
        m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7);
        m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.b((int)-1620, (int)-15056).formatted(m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7.getName())), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1));
        return 1;
    }

    public static String m$$WUcqezVi4nhnbvC3kstQYFyXBkwoU5qcTI4yGPYGJ9LBDZct58bA0hhsaI9V618SZdaheJHBPj2Si2aJSpTxxTSqKrY5s0qql(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{61, -70, 123, 33, -81, 114, -66, 120, 78, -31, -87, 57, 70, -17};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 14]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public int m$$fpGL7c3hh9Wq0GjZGbUWsMGOqxjqgcrE05H4OUl0FpiGYoHnjcDrxjKurfxMvIVKaJ4GAuaRgVOLd2AOlBDxzNHQjDNpEjvwE(CommandContext commandContext) {
        m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7 m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7 = (m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7)commandContext.getArgument("trade", m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7.class);
        String string = (String)commandContext.getArgument("enchantment", String.class);
        int n = (Integer)commandContext.getArgument("lvl", Integer.class);
        m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7.m$$v2Ntrz9DW2Zdx1fnXRhy9F5Z9SNTwMgtvXGpCystNafRKjXPdVFEkFdm8BoyX4aRZeQATYGKb88qACmyHoWbzzS1KRBokF3PY().add(new m$$TRdDqBJgjZ1fw9rIVfhStjcPOPjNzy6jg68DukqXu2g24StbWqoO7VTCIgO8JxiARBFlRnv98GgLAhEyYbNiJhiID7o3hu0OB(string, n));
        m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.b((int)-1615, (int)6251).formatted(string, n, m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7.getName())), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1));
        return 1;
    }

    public int m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ(CommandContext commandContext) {
        List<class_2561> list = ((List)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml.getRegistry()).stream().map(this::m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8).toList();
        try {
            if (list.isEmpty()) {
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)"You don't have any trades yet."), -1);
                return 1;
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            throw m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.a(illegalArgumentException);
        }
        class_5250 class_52502 = class_2561.method_43473();
        class_52502.method_27693("Trades list: ");
        class_52502.method_10852(class_2564.method_37112(list, (class_2561)class_2561.method_43470((String)", ")));
        m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_52502, -1);
        return 1;
    }

    public int m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ(CommandContext commandContext) {
        m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7 m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7 = (m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7)commandContext.getArgument("trade", m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7.class);
        m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7.m$$v2Ntrz9DW2Zdx1fnXRhy9F5Z9SNTwMgtvXGpCystNafRKjXPdVFEkFdm8BoyX4aRZeQATYGKb88qACmyHoWbzzS1KRBokF3PY().clear();
        m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)m$$3JcajtbThPHohIomLk13yVXfISXGkrqyZ6Rmpcw9IBJvovUjk6OLE2iLQfWqX8RCFxD8jirmqckSWViBbwgcgRTCCuuYYzaHg.b((int)-1632, (int)30398).formatted(m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7.getName())), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1));
        return 1;
    }

    public int m$$7tjAleuL4xab6jbtqR5tlyOX9AzvmaYR4Eg6nSqAg9bsbrzBT9Y89kNtF2fBeCa1EOn2kv3g0u8fRk949bbmVH03mPGLUp6As(CommandContext commandContext) {
        m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7 m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7 = (m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7)commandContext.getArgument("trade", m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7.class);
        return this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(new m$$ubtRL2B50mwv9Qoc27rHxIiwkjONOXo3lVednyIWERRzfpYRJMiC43UXQcv8ykEwqaQ6FPCTK0g6EruPNdPRzSSl6TZqehUeS(m$$D4y1kd3up3TbSdyRgqJYDSTsuy9TmPD4v3y77vgN9DiDY8lpiKDP3MnisUnxaV3aTTRie77vNq5X1tggUEJBvpjQJzuE4A7W7));
    }

    public int m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN(CommandContext commandContext) {
        String string = (String)commandContext.getArgument("name", String.class);
        return this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(new m$$ubtRL2B50mwv9Qoc27rHxIiwkjONOXo3lVednyIWERRzfpYRJMiC43UXQcv8ykEwqaQ6FPCTK0g6EruPNdPRzSSl6TZqehUeS(string));
    }
}

