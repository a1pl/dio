package me.mioclient;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Pattern;
import me.mioclient.m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$IpKDgL50X5zra0qdTzpiJpf7b5QBM9ae6HD1Laz0qa63VploDYwdMWESRsxVmw5j5sVnZqW1Vfi8Zu2VWjSJLwPBzeU4833kF;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN;
import me.mioclient.mixin.m$$TWtoeQN2KKrVMfzCyoKCK5hXpn7fU6GUdUAC7SwZRnDUEowRxxNCFCbkt67IAWGLyHpkWeN8KDwpZFggiRPPyU2YEAquD0bl5;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_1074;
import net.minecraft.class_124;
import net.minecraft.class_1293;
import net.minecraft.class_151;
import net.minecraft.class_1703;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1844;
import net.minecraft.class_1887;
import net.minecraft.class_308;
import net.minecraft.class_332;
import net.minecraft.class_342;
import net.minecraft.class_437;
import net.minecraft.class_4587;
import net.minecraft.class_465;
import net.minecraft.class_5250;
import net.minecraft.class_6880;
import net.minecraft.class_9276;
import net.minecraft.class_9288;
import net.minecraft.class_9304;
import net.minecraft.class_9334;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8 {
    public static final String m$$1yLiiqGkahm1jp78jUr95UMLgRcgIXaCxU1eI4ZSsq8vrmB79KKlyi6EtQ45mTUOPzLuAoHU05qMu5eoDYqvStwUF9NJVoFY3;
    public static final boolean m$$JJ9h98FlsJMrwRJSZJmQNNUQnNGG7LkLK4a4VIIco5oh0WPqa7hnsENYfLCTkMeH1CKuQltRajqUVYEwRjcam3XLwuKLuheYW;
    public static final m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8 m$$VhH2OEBF3WNRPg2tWFid6kri1c7r5mjsrRnhDsvBbK0sGjRFIZx7IR721WIpHmAgquwv8jG14YX7kWq8saGPmRdvfgsMFKpMs;
    public static m$$IpKDgL50X5zra0qdTzpiJpf7b5QBM9ae6HD1Laz0qa63VploDYwdMWESRsxVmw5j5sVnZqW1Vfi8Zu2VWjSJLwPBzeU4833kF m$$30ck3T3nwD1Uo4Z00I6iHWW6HZogm2gLRokPNLIKPmud0Z6ATb5TRWsF0pu9WxQGUf4MfvkPcTXDXrfkXqgyXBc0MhEsqYnXO;
    public static class_342 m$$lqzJeHL7FKMPUNnLxhiX8btidr1azeFdVcgoNpYsgtzjLy3rFMz6rzZS7Z9gSjzEP58ql1fg3RV0nwXJguKBFlZHftmlARxwZ;
    public static String text;
    public static int m$$pIsl4oyZZfFIwpvIcZHe5RcHyePnAgmoOuAacjoeq7XhCGfOWvs1gEP74zefrB8m7hG6WtsJOmlinssS33D8cRjxUtLULIn59;

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.e = new Object[115];
                            m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.f = new String[115];
                            m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a();
                            var17 = new String[4];
                            var15_1 = 0;
                            var14_2 =  /* dynamic constant */ (String)m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX("fjPYeCbm4yEOR3WqFz6V", MethodHandles.lookup(), "m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX", m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.class, 1543288298);
                            var16_3 = var14_2.length();
                            var13_4 = 11;
                            var12_5 = -1;
lbl10:
                            // 2 sources

                            while (true) {
                                v0 = 83;
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
                                var14_2 =  /* dynamic constant */ (String)m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX("iNXO2PpX8JpIktN25Q5W", MethodHandles.lookup(), "m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX", m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.class, 1099768833);
                                var16_3 = var14_2.length();
                                var13_4 = 9;
                                var12_5 = -1;
lbl25:
                                // 2 sources

                                while (true) {
                                    v0 = 21;
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
                                        v15 = 86;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 26;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 108;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 38;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 32;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 14;
                                        break;
                                    }
                                    default: {
                                        v15 = 121;
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
                    m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a = var17;
                    m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.b = new String[4];
                    var4_7 = 5576684407465104472L;
                    var10_8 = new long[71];
                    var7_9 = 0;
                    var8_10 =  /* dynamic constant */ (String)m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX("YkzGSy6PxHS7biIyTsj3", MethodHandles.lookup(), "m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX", m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.class, 1550136510);
                    var9_11 = var8_10.length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX("urueNJ5N7QI9pYxyzr4Q", MethodHandles.lookup(), "m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX", m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.class, 1119631777));
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
                        var8_10 =  /* dynamic constant */ (String)m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX("Fg6qbolHOByyd7ub7XJH", MethodHandles.lookup(), "m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX", m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.class, 927663319);
                        var9_11 = var8_10.length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX("RFXKfb23NstHjz1IhbH0", MethodHandles.lookup(), "m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX", m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.class, 1120256022));
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
            m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.c = var10_8;
            m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.d = new Integer[71];
            m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -674753;
            break block31;
lbl145:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 416159488730467416L;
        ** while (true)
        var0_15 = 579356759241377099L ^ var2_14;
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_15);
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$1yLiiqGkahm1jp78jUr95UMLgRcgIXaCxU1eI4ZSsq8vrmB79KKlyi6EtQ45mTUOPzLuAoHU05qMu5eoDYqvStwUF9NJVoFY3 = "com.replaymod.lib.de.johni0702.minecraft.gui.container";
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$VhH2OEBF3WNRPg2tWFid6kri1c7r5mjsrRnhDsvBbK0sGjRFIZx7IR721WIpHmAgquwv8jG14YX7kWq8saGPmRdvfgsMFKpMs = new m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8();
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$30ck3T3nwD1Uo4Z00I6iHWW6HZogm2gLRokPNLIKPmud0Z6ATb5TRWsF0pu9WxQGUf4MfvkPcTXDXrfkXqgyXBc0MhEsqYnXO = (m$$IpKDgL50X5zra0qdTzpiJpf7b5QBM9ae6HD1Laz0qa63VploDYwdMWESRsxVmw5j5sVnZqW1Vfi8Zu2VWjSJLwPBzeU4833kF)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$IpKDgL50X5zra0qdTzpiJpf7b5QBM9ae6HD1Laz0qa63VploDYwdMWESRsxVmw5j5sVnZqW1Vfi8Zu2VWjSJLwPBzeU4833kF.class);
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.text = "";
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$pIsl4oyZZfFIwpvIcZHe5RcHyePnAgmoOuAacjoeq7XhCGfOWvs1gEP74zefrB8m7hG6WtsJOmlinssS33D8cRjxUtLULIn59 = 0;
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$JJ9h98FlsJMrwRJSZJmQNNUQnNGG7LkLK4a4VIIco5oh0WPqa7hnsENYfLCTkMeH1CKuQltRajqUVYEwRjcam3XLwuKLuheYW = FabricLoader.getInstance().isModLoaded("replaymod");
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "\u0007\u000f_\u007f\u0005.\u000b\u0018B2\u000e,G\fJ3\u0011&\nDJ!\na\f\u001cN?\u0017a,\u001cN?\u0017";
        objectArray[1] = "o^\u0012'\b\u0007dQ\u0003hi\toZ\u00072";
        objectArray[2] = Void.TYPE;
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.f[2] = "java/lang/Void";
        objectArray[3] = "\n]\u001f\u0002g|\u0001R\u000eM\u001ad\u0012U\u0007\u0004";
        objectArray[4] = "p$\u000elQmn,\u0014#3wy$\u0014h";
        objectArray[5] = "o>\u0014\u0010M\"o>\u0003LA-uu\u0003RA8r\u0004Q\u0006\u0018|";
        objectArray[6] = "\u0000\u001cs\u0018\u0013X\u0000\u001cdD\u001fW\u001aWdZ\u001fB\u001d&1\u000eF\u0001";
        objectArray[7] = Integer.TYPE;
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.f[7] = "java/lang/Integer";
        objectArray[8] = "DzR\u001d\u0016rDzEA\u001a}^1E_\u001ahY@\u0014\u0006M*";
        objectArray[9] = "7m|\r`\u00113p|\u001c}\u0011p\u007f3\u000bz\r*p>Va\u001a4|1\f}V\u0011{8\u001dm\flP<\fC\u0019.=\u0017\u0016z\n'";
        objectArray[10] = "L=!\u0001\u0013<L=6]\u001f3Vv6C\u001f&Q\u0007`\u001dKe";
        objectArray[11] = "V\u0015\u000375>X\u001cD?2%\u0015\u001d\t~h7yHd.\u0015eN@\u0014+h\u0019C\u0017h\u0012l$\t\u001dg-\u000b\u001aR>\u001c;\t\u0014L\u0004\u001d\u0018,\u0014H>\u007f#h6c#Y\r\r$p2y\u0018?8U\u0005I89\u0016\f\n\u0014\u00140(x1\u001e\u0013ihyEA\n)&W\u0017j*(5_\u0014u,\u0012f\u0002\u0007x2duVT\t\u000flfi\u0002\u001f5:;i\u0013@\u000f\u001dgj\u0018} \u0004\"W(c\u0015\u001a$]\u0007Y\u00175\u0016q7\u0015\u000e\u00062S9k\u0000=\u0006C\u001c\u001e2\u00119tBt\u0000.\"z\u0003c\u001b\n\u0018Z\"n;2&b'X3\u0012\b\\'Il)\u0014NG\u001b\u00148$s\u001fg\u001e+\u0012WBe1";
        objectArray[12] = Boolean.TYPE;
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.f[12] = "java/lang/Boolean";
        objectArray[13] = "\n\u001c\u0001Sz\u000b\u0014\u0014\u001b\u001c\u0007\u001b\u0014";
        objectArray[14] = "s),-D;m!6b#:|:;8\u0005<";
        objectArray[15] = "8-\u0001JZD8-\u0016\u0016VK\"f\u0016\bV^%\u0017DS\u000e\u0014";
        objectArray[16] = "Ja5\u000f^(Ja\"SR'P*\"MR2W[p\u0011\u0004u";
        objectArray[17] = "+$!\u0007w\u0010^\u0004*\bf_?\n!\u0003b\u0005K";
        objectArray[18] = "\u000f? _s6\u00016gWt-L7*\u0016.? bGFSm\u0017j7C.\u0011\u001a=Kz*,P7DEM\u0012\u000b\u0014?SO\u001c\u0015.>pj\u001c\u0011\u0014\\K.>:\tzeK,)\u0018Zpy0\f/jP\u007f\u001eU 7|v !\u001b={/` obbo.\u000e=IBn=\u0006>VDTn[-[Z\"";
        objectArray[19] = "7RU\u000f@\u00177RBSL\u0018-\u0019BML\r*h\u0010\u0019\u0019J";
        objectArray[20] = "\u007f\u0015m-h/t\u001a|b\u000f7p\u0006z.*&";
        objectArray[21] = "\u0000\t\u0004!9~\u0000\t\u0013}5q\u001aB\u0013c5d\u001d3A8m%";
        objectArray[22] = "WQXBfNWQO\u001ejAM\u001aO\u0000jTJk\u0015_;\u0013";
        objectArray[23] = "+\fV\u0007\u0002I+\fA[\u000eF1GAE\u000eS66\u0013\u001bV\u0013";
        objectArray[24] = "F\"9X.)F\".\u0004\"&\\i.\u001a\"3[\u0018tEpq";
        objectArray[25] = "l_sGuCl_d\u001byLv\u0014d\u0005yYqe6[,";
        objectArray[26] = "9E\u0018:&.2J\tuA,'A\t>z";
        objectArray[27] = "\u0017*`37S\u0017*wo;\\\rawq;I\n\u0010-/m\f";
        objectArray[28] = "!_KV%\u0013?WQ\u0019y\u0003,[E\u0019[\u0007?JXEe";
        objectArray[29] = "N_\u0006O;AEP\u0017\u0000VEEL#KdXAP\u0013K";
        objectArray[30] = "+\nZL|\u00185\u0002@\u0003 \b&\u000eT\u0003\u001f\f5\bDH ";
        objectArray[31] = "pAZX\u001aJpAM\u0004\u0016Ej\nM\u001a\u0016Pm{\u0017DO\u001b";
        objectArray[32] = " 3\u0000J\u000bx>;\u001a\u0005Vy87\u0017F\u000b^> \u0013JH";
        objectArray[33] = "FhW\u00067\"Ha\u0010\u000e09\u0005`]O3*A:\u0015$\u0019'Ic)\u00009\bfl\u001b*;!cy(#6!e^2\u0006j?i:\u001c\u001b\u000e\"Lg?\r3%HI*\u001ak\tDeO=\rt\u0013I\u00178f'\\Y\f\\8|\u0012<=\u0004\u0017y^;\u000b\u000f6>Xu\b\u0013\n+^O7\u001a\u00064bn\u0010-k";
        objectArray[34] = "0^stR0.Vi;0,)K";
        objectArray[35] = "yvnyO\u0019ry\u007f6#\u001a|{}y\u000f";
        objectArray[36] = "ma)1\u007fgav4|te-h2~}cq*<op(Ee?mpeOk<{|t";
        objectArray[37] = "0}v\u0018\u001d&>t1\u0010\u001a=su|Q\u0015\u0018\bj6=\u0013\u0018iHm\u0018!'5p\u0001\u0012\u0003;\u0018j\u001d/=?\u0015!\u001c9\u001d\u001emJ* \u001dz+Sn\u000f\u0012\u001fnR\bG6,iKh/<\u000f2Ok0\u001f\u0005\bQ<\u00125\b\u000fm(C#!4V)\u0006&\u0006<*:\u0001\u0019\u001d8  \u0004@85,)=\u0019";
        objectArray[38] = Long.TYPE;
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.f[38] = "java/lang/Long";
        objectArray[39] = "dj7h\"\"dj 4.-~! *.8yPpvw";
        objectArray[40] = "b6\u0000r\r+l?Gz\n0!>\n;>+z:{Y\u000f<>+Vy\u0014\u0006L%{H,p@7v}W5ub\u0018p\u0003 [\u001ej{\tw;9|{(\u000bg!LK7<U\tZz\u0005\u0000_&\u001fW\u001cr9\t{j\u001e!K\"e]#>m\u0007~g-vA\u0012Mm\t>9\u001acY53^'OX)";
        objectArray[41] = "W\u001b}Z}DW\u001bj\u0006qKMPj\u0018q^J!:@\"";
        objectArray[42] = "\u001e0M0\u0016~\u001e0Zl\u001aq\u0004{Zr\u001ad\u0003\n\n-I";
        objectArray[43] = Float.TYPE;
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.f[43] = "java/lang/Float";
        objectArray[44] = ")[\u0016\u0002q[)[\u0001^}T3\u0010\u0001@}A4aV\u0019$\u0005";
        objectArray[45] = "\u0011/\u0015si1\u0011/\u0002/e>\u000bd\u00021e+\f\u0015Pj7m";
        objectArray[46] = "\u0011\u000eZa2p\u0011\u000eM=>\u007f\u000bEM#>j\f4\u001c|h(";
        objectArray[47] = "f\u001a!$\u001e5f\u001a6x\u0012:|Q6f\u0012/{ a<F";
        objectArray[48] = "HtZ4i#HtMhe,R?Mve9UN\u001f-4y";
        objectArray[49] = "\u0015\u0017Z6\u000e3Y\u0017\u0010mt*X\u001eZe\b,^sI6M9U\u0001\u001b1I%$";
        objectArray[50] = "=T9\"\b\t.Qb!w\b6Vk{\u001a\u0017_Ig'\u0016\u001fbZat\u0017m<X\u007fw\u0011\u0006;Xy w";
        objectArray[51] = "\u000b4\u0003wH]Ug\u0001#$I\\>\t;D-\f4\u0004=[PU>\rw$";
        objectArray[52] = ":X>\u0007JBd\u000b<S&Ngp<HKHK] Z&\t;\ngTXLc\rb7\u001c^e\u00047GB\rgP[";
        objectArray[53] = "}5-1a%\"m))_q+-*.3Cvhux_(y)u;&ew+'Ibx$+54;r-aJwcov(%t2zzQ";
        objectArray[54] = "%E<\b\u001a1=T#\u0007b24A3\u0012\u000e\u0000d\u0004oHXW`EcK\u000f*$]4\u0005b";
        objectArray[55] = "pr\u000182/)rQ.V:#j\u007f4*\u000b'rC?Vh\"tD-+1(}\u000eR";
        objectArray[56] = "\u00141%q\n&\u00180b=i&\u00101:f\u0005\u0014B|f;is\u00116d0U.\u0007?$\u0001";
        objectArray[57] = "kjnlL)d1~+}1n3m-8>{=`V\u0014+x&c3\u0018*?j\u0000l\u001127:p2B0cV=:\u001f-x+d0\u0016g\u0007fl-Cf;;z$\u0003W";
        objectArray[58] = "j<\u0004B\u0012'a2C)\u001apn1GU\rg\u0001(U[\u0003&e=PG`$y`\u0002D\u001d`a7L)";
        objectArray[59] = "\u0011\u0001>C E\u001b\f;\tRI\u0016\u00172\u0015>{GUlHR\u0016\u0017\u000eb\u001e\"HD\f6r8]\u001fS)\u0016,M\u001e\u001aRH>IK\u0007\"\u0016mK\u001fk";
        objectArray[60] = "M&X7\u001c\u0015[l\u0001h}\b]!\u0003n\u0011:\ngR1Fm\t%S7\u0010\u0010M=\u0004y}";
        objectArray[61] = "1w\u000b\f^\u0018>,\u001bKo\u001a00\u0019{\t\r=\"\u0003JoVb/\\H\t\u001ff)Z6U\n8{\tF\u000bY:/e\b\u000bY7/\u001fQ\u000b\t!KXZ\r\u001c\"6\u0001P\u0004V]{\tMQWa&\u001fD\u0011f";
        objectArray[62] = "a_\u0018s\u0002GhD\u0019h2@bs\u001dovFpZ\u0017o2\u001buSJoBE&Q\u001e\u0003\u0002Mb\bK?_[kHz";
        objectArray[63] = "!3\tj0~:$\u0001{J%7>\u0005c&\u0017cr[4J}6 \u001f{7$<)U\u0004s8j|\by7 =2e";
        objectArray[64] = "\u0012\u007f<Z\u0003\u0003L,>\u000eo\tEk=\u0003\u0004\u001eaw=jU\u001fM#5\u001a\u000bLOwYP\u0003\u0016\u0018\u007f)\u000eP\u0014L\u0013c\u0006\nCDc=U\b\u0017(";
        objectArray[65] = "Kyws*>\u0015*u'F5\f\u007fi?</\u0017z\u0012~*,\u000bjo' %A\u0015//$4\u000ehv%-~q/~&v\"\u0001q-$\"N";
        objectArray[66] = "pw4*\u007f(.$6~\u0013#6r+fh\u0007+g1\u001a)4/+=jwg-\u007fQ*\u007f#t*mwi*4\u001b";
        objectArray[67] = "\u0010x;^4\u007f\tvk\\Sx\nvpU/~\f\u001bc\u0006jk\u0007i1\u0001nwv";
        objectArray[68] = "9ZCt\r+c[\b\u007f335\u001e\u001e\u007fH$\u0012\u0011\u000fhHIe\f\u0011\u007fL4<\u0006\u001853t4\u0002\tzN->\u000bC\u0005";
        objectArray[69] = "^\b|BK+G\u0006,@,6Y\u0019  \u0011!Z\u00112]H+S[M";
        objectArray[70] = "jt;w\nAei\"?qVih% \u001dd9+x|@35p?}\u000bKypu&q";
        objectArray[71] = "-^~\u000bqi,S%H\u0017e,~x\u001dx`:N\u001fB{\u007fi\u0013#\u001fmv)\"";
        objectArray[72] = "0evS\n5?>f\u0014;71\"d\"\\- 4~\u0015;\" &h\n^.!a$i\u0001'9it\u0019_t;=\u0018TW)&&e\r] lY(\u0005@umeu\u0013I5\\";
        objectArray[73] = "\u001bTd\u0001\"b\u0014\u000ftF\u0013`\u001a\u0013vqnz\u001b\fg;z`\b\u0018i^vaOT\n\u0001\u007fyG\u0004z_,{\u0013h7Wqf\b\u0015n]x,wXf@--K\u0005pIm\u001c";
        objectArray[74] = "rv.(a)~wid\u0002)vv1?n\u001b$;ii\u0002\"%x)&mwak/X";
        objectArray[75] = "S\nyJ\u00192_\u000b>\u0006z2W\nf]\u0016\u0000\u0007F8\u0007EWT\u0016x\n\u0001%[\u000baBz";
        objectArray[76] = "JRXSv$FS\u001f\u001f\u0015$NRGDy\u0016\u001e\u001e\u0019\u0012)ACGV^y,GEKL\u00159J\\D\u0018q,O@'";
        objectArray[77] = "\u001a\u0006d\n\u0013~\u0002\u0017{\u0005k}\u000b\u0002k\u0010\u0007O[G4LT\u0018[\u0012i\r\u0014e\u0002\u0018`Gk%\n\u001cq\b\u0016|\u0000\u0015;wVt\u0004\u0004t\n\u000f~\rN\u000bJ\u0007z\u001c\u0001v\u0013\rsV~6\u001b\tb\u0019\u0003o\u0011\u0000(fCg\u0015\u0011g\u001b\u001am\u001c[\u0018_\u0006;I\u0006e\u001b\u001el\u0007k";
        objectArray[78] = "rMww{Gd\u0007.(\u001aZbJ,.vh5\f}q+?6N|wwBrV+9\u001a";
        objectArray[79] = "sSGdQ;!TCx /w\u0019\u0002\u0016X h\nErM%ti";
        objectArray[80] = "kqt\u000emgq-t\u001d\tzfl\u007f\u0018eH6+.\u007f3sn s\u000fm lt\u001fEez;|o\u001b6xo\u0010";
        objectArray[81] = "8\u0014)6$#mO2#O(1\b9?#\u001aaKeh~M9\u0019)!678I&`O";
        objectArray[82] = "\rO\u0006y=TS\u001c\u0004-QOPE\u001f 0BL#\u0000.mEE\u001e\u0013(>D7\u0013\u000f2o\u0015\u000bN\u0019;/$";
        objectArray[83] = "qng2>\u0006(n7$Z\u0013\"v\u001b5+|7c*;a\u0018\"f6X";
        objectArray[84] = "*\u0000\u0016`\bEh\r\u0010bu\u001d(\u001d\nf\t\u001b.p\u00195L\u000e%\u0002K2H\u0012T";
        objectArray[85] = "!=]N\u001b^8:@Mf\u00023\"G\u0017\n0ga\u001aOYg.!\u0016\u000b\u001c\u001a39C\u001df";
        objectArray[86] = "'\nY4:\u0013+\u000b\u001exY\u0013#\nF#5!qG\u0018xYHr\r\u0016=6K#\u0018\u001aD";
        objectArray[87] = "Po\u00001\u001a\u0012\\nG}y\u0012To\u001f&\u0015 \u0006\"AyyGUhApE\u001aCa\u0001A";
        objectArray[88] = "MLW`}W\u001eWLaFM\\AK3:KZ,X`\u007f^Q^\ng{B ";
        objectArray[89] = "(<5)\u0019y-i;yfw'p</\nEw=cpV\u0012'l:r]itw!sf";
        objectArray[90] = "GxU\u0005\u0018y\u0019+WQth\u0006YUM\bx}$\\NJ8AyJG\n\t";
        objectArray[91] = "\u0000\u001am\u000b:]\u0013\u001f6\bER\u0005\u0001,S!Tb^8WuU\u0012\u0000kU!9\u0000\u001am\u000b:]\u0013\u001f6\bE";
        objectArray[92] = "`\u0015'xa{5N<m\npi\t7qfB9Dh/6\u0015i\u00151,1n:\u000e*-\n";
        objectArray[93] = "\tpS~>!W#Q*R0HVR'423,Z5l`\u000fqL<,Q";
        objectArray[94] = "p\u0004\u000e\u0005P&s\u0012\u001fF6{q\u0000\u0011\u0018ZI!CJN\t\u001eq\u001c\u0017E\re\"\u0007\fD6";
        objectArray[95] = "RjA~%!\u0016hW%D8AnN$(\n\u0013,\u0011|D4Pm^ !8Q*\u0012C";
        objectArray[96] = "\u0016\u00148\u0015lO_\u0010>\u0013\u0012UKP ,j@THgH\u007fEH+$E`J\u001dO1@|)\u0016G'\u0012#\u0015KQ.R\u0012";
        objectArray[97] = "k\u0019\u0019\u000bAH>]\n\r?Bh[\u000b\u0014Sp:\u0017TM?\u001diB[\u001fOC:@\u000fs";
        objectArray[98] = "oFW\u0000iP.UH\b\u0004Px[L\u001ehb/\u001b\u0016@=5,_\u001cGiHhGK\t\u0004";
        objectArray[99] = "w-h!\u0017\u007f%*l=fmwl\u0017>\u0016q\u001e'=(X<\"z+!\u0018\r";
        objectArray[100] = "\u0000=\u0011E`D^p\b\u001bX[\u00030\fA4iSq\\\u0018X\u0004\u0002)\\J(ZQ+\b&";
        objectArray[101] = ",G\u0016\u001a\b\u0019%\\\u0017\u00018\u00109R5\fC\u0003=H\u001f\u00078\u0007=L\u0004Z^\u000e&M\u001fj";
        objectArray[102] = "}1Pwx f&Xf\u0002{k<\\~nI<}\u0007(>\u001ez8Sdzxb)Lk\u0002#j\"Ff\u007fz`+\f\u0019?rd:Cdfxmp<dku;=L%;~a@\u0005a2 k=Ayen\u0006";
        objectArray[103] = "]Ek\u000fZzR\u001e{HkeJ7xQ\u000f\u0004X\u0005zE\baT\u0004=\tk>]\u001c5Y\u001b`\u000e\u001ea5VhS\u0003zH\u000fbZI\u0005\u0005\u0007\u007f\u000fH9X\u0011vOy";
        objectArray[104] = "\f\u0004-KM\u0003RW/\u001f!\u001eP\u00043$@\u000fVhr\u0017DCZ\u0018,DF\u00176X$\u0000\u001fB\n\u00052\t_s";
        objectArray[105] = "\u0000Z'\u00131CZ[l\u0018\u000f[\f\u001ez\u0018tLa]{\u0000u^\u001c\u0004q\t?!\\\fu\u0018p\\\u0005\u0006|R\u000f";
        objectArray[106] = "`VlqC\u001b<Hll\u007fV8c|y\u001eL08:o\u001a\u001a3Hd<\u0018N_";
        objectArray[107] = "e\u0016S1n.zUWx\u0007-nQj)c?n-L)u!8IY,iB";
        objectArray[108] = "\"(?\u001bk\u0002c7#\u0018\u001a?k!w\u0014\"\u0013\u00181\u0006XPP\u001d75\u0019|\\9;\r+\\\b \u001e\u0007_`&#,\"!}?\u001ah\"\\y^0\r|_'%!?;%^\re;*\u0007C3:0\u0018'+\u0006\u001b;\u0000Yh\u0018j;\f\u001eH\"\u001c<\r\u0006K*\u0006\u0002~\u0002~&\b-\u000b\u0017`Y8k\u0015ec\u0019+19\u0006v]$.GXv\u0003 /:\u0001|\njP";
        objectArray[109] = "\u0004\u000fj6\u0016\u0004\u0007^\u007f:o\u0004WOJz\u0015\n\\\\\u0011<\u0003\u000e\n_abP\f^3";
        objectArray[110] = "\f<`\u000bM:Rob_!6L1`;\u001b&S`iKEuQ4\u0005";
        objectArray[111] = "jm\u0007\b|5k=\bI\u00053hD\u0016\nyOicF\u0013b)pm\u0016\u0011\u0005";
        objectArray[112] = "CG\u007f,\u0012b\u001bVq&.eCM*pGizC*`C\u000f\u0014F5#\u001f3IP<c.";
        objectArray[113] = "TN\t\bA\nSN\u000f_'\u000fVZ\u001ad\u0017\rL\u0002GXJ\u001bEBv";
        Object[] objectArray2 = objectArray;
        objectArray[114] = "*\u0006{%_K1\u0011s4%\u0010<\u000bw,I\"hG'q%O=\u0012''U\u0011n\u0010sK";
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2F3E;
        if (d[n2] == null) {
            m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }

    public void init() {
        m$$lqzJeHL7FKMPUNnLxhiX8btidr1azeFdVcgoNpYsgtzjLy3rFMz6rzZS7Z9gSjzEP58ql1fg3RV0nwXJguKBFlZHftmlARxwZ = null;
        text = "";
        ScreenEvents.AFTER_INIT.register((Object)new m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8());
    }

    public static boolean isFull(class_1799 class_17992, String string, int n) {
        block22: {
            try {
                if (!((Boolean)m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.m$$30ck3T3nwD1Uo4Z00I6iHWW6HZogm2gLRokPNLIKPmud0Z6ATb5TRWsF0pu9WxQGUf4MfvkPcTXDXrfkXqgyXBc0MhEsqYnXO.m$$AbbYvIZLf7BExpfJQW7xu0ICYTreulwtfUaeVjmpZigDpCDoiQcNGUE1RCgC4xlPK3OtmYjVAZHPrqrS5xeSygiPQF0L0Rr2t.getValue()).booleanValue()) {
                    return false;
                }
            } catch (class_151 class_1512) {
                throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1512);
            }
            string = class_124.method_539((String)string.trim().toLowerCase(Locale.ROOT));
            try {
                try {
                    if (string != null && !string.isEmpty()) break block22;
                } catch (class_151 class_1513) {
                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1513);
                }
                return false;
            } catch (class_151 class_1514) {
                throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1514);
            }
        }
        try {
            if (class_17992.method_7960()) {
                return false;
            }
        } catch (class_151 class_1515) {
            throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1515);
        }
        class_1792 class_17922 = class_17992.method_7909();
        try {
            if (!class_17922.method_7876().contains("shulker_box")) {
                return false;
            }
        } catch (class_151 class_1516) {
            throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1516);
        }
        class_9288 class_92882 = (class_9288)class_17992.method_58694(class_9334.field_49622);
        try {
            if (class_92882 == null) {
                return false;
            }
        } catch (class_151 class_1517) {
            throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1517);
        }
        try {
            if (class_92882.method_57489().toList().size() != (1327914455 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & ~n) ^ ~n) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & n)) {
                return false;
            }
        } catch (class_151 class_1518) {
            throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1518);
        }
        for (class_1799 class_17993 : class_92882.method_57489().toList()) {
            try {
                if (m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.namesMatch(class_17993, string, Integer.reverseBytes(((511756611 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) >>> 6 | 511756611 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) << 26) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) - n) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01)) continue;
                return false;
            } catch (class_151 class_1519) {
                throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1519);
            }
        }
        return true;
    }

    public static String m$$z4AMkh9qfFW3ARWbA5wfYyAQvVPM0Tfo55A7Yc0DyB8wXd0dBR4IqGz3oD7PmA9cJxkyRrgo5mvYEqvXy9bC80FPQzqIcxcvX(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{78, 102, 85, 126, -29, 36, 36, -22, -43, -80, -24, -47, -21, -56, 113, -29, 32};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 17]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public static boolean testContent(class_1799 class_17992, String string, int n) {
        class_9288 class_92882 = (class_9288)class_17992.method_58694(class_9334.field_49622);
        if (class_92882 != null) {
            for (class_1799 class_17993 : class_92882.method_59714()) {
                try {
                    if (!m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.namesMatch(class_17993, string, (1196433155 + (n & 3) ^ 0) - (n & 0x10000) ^ 0x1000000)) continue;
                    return true;
                } catch (class_151 class_1512) {
                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1512);
                }
            }
        }
        return false;
    }

    public static boolean testEnchant(m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk, String string, Object2IntMap.Entry entry, int n) {
        try {
            if (entry == null) {
                return false;
            }
        } catch (class_151 class_1512) {
            throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1512);
        }
        class_5250 class_52502 = (class_5250)class_1887.method_8179((class_6880)((class_6880)entry.getKey()), (int)entry.getIntValue());
        String string2 = class_52502.toString().toLowerCase(Locale.ROOT);
        string2 = string2.replaceAll("enchantment", "");
        return m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.test(string2, string);
    }

    public void onDrawGui(class_332 class_3322, class_437 class_4372, class_4587 class_45872, float f, float f2, float f3, int n) {
        block20: {
            block19: {
                block16: {
                    block15: {
                        try {
                            try {
                                if (m$$30ck3T3nwD1Uo4Z00I6iHWW6HZogm2gLRokPNLIKPmud0Z6ATb5TRWsF0pu9WxQGUf4MfvkPcTXDXrfkXqgyXBc0MhEsqYnXO.isToggled() && m$$lqzJeHL7FKMPUNnLxhiX8btidr1azeFdVcgoNpYsgtzjLy3rFMz6rzZS7Z9gSjzEP58ql1fg3RV0nwXJguKBFlZHftmlARxwZ != null) break block15;
                            } catch (class_151 class_1512) {
                                throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1512);
                            }
                            return;
                        } catch (class_151 class_1513) {
                            throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1513);
                        }
                    }
                    class_45872.method_22903();
                    m$$lqzJeHL7FKMPUNnLxhiX8btidr1azeFdVcgoNpYsgtzjLy3rFMz6rzZS7Z9gSjzEP58ql1fg3RV0nwXJguKBFlZHftmlARxwZ.method_25394(class_3322, (int)f, (int)f2, f3);
                    class_3322.method_51452();
                    m$$TWtoeQN2KKrVMfzCyoKCK5hXpn7fU6GUdUAC7SwZRnDUEowRxxNCFCbkt67IAWGLyHpkWeN8KDwpZFggiRPPyU2YEAquD0bl5 m$$TWtoeQN2KKrVMfzCyoKCK5hXpn7fU6GUdUAC7SwZRnDUEowRxxNCFCbkt67IAWGLyHpkWeN8KDwpZFggiRPPyU2YEAquD0bl5 = (m$$TWtoeQN2KKrVMfzCyoKCK5hXpn7fU6GUdUAC7SwZRnDUEowRxxNCFCbkt67IAWGLyHpkWeN8KDwpZFggiRPPyU2YEAquD0bl5)class_4372;
                    try {
                        if (m$$lqzJeHL7FKMPUNnLxhiX8btidr1azeFdVcgoNpYsgtzjLy3rFMz6rzZS7Z9gSjzEP58ql1fg3RV0nwXJguKBFlZHftmlARxwZ.method_1882().isBlank() || !(class_4372 instanceof class_465)) break block16;
                    } catch (class_151 class_1514) {
                        throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1514);
                    }
                    class_465 class_4652 = (class_465)class_4372;
                    class_1703 class_17032 = class_4652.method_17577();
                    int n2 = m$$TWtoeQN2KKrVMfzCyoKCK5hXpn7fU6GUdUAC7SwZRnDUEowRxxNCFCbkt67IAWGLyHpkWeN8KDwpZFggiRPPyU2YEAquD0bl5.getX();
                    int n3 = m$$TWtoeQN2KKrVMfzCyoKCK5hXpn7fU6GUdUAC7SwZRnDUEowRxxNCFCbkt67IAWGLyHpkWeN8KDwpZFggiRPPyU2YEAquD0bl5.getY();
                    m$$pIsl4oyZZfFIwpvIcZHe5RcHyePnAgmoOuAacjoeq7XhCGfOWvs1gEP74zefrB8m7hG6WtsJOmlinssS33D8cRjxUtLULIn59 = 0;
                    for (class_1735 class_17352 : class_17032.field_7761) {
                        class_1799 class_17992;
                        int n4;
                        int n5;
                        block18: {
                            block17: {
                                n5 = n2 + class_17352.field_7873;
                                n4 = n3 + class_17352.field_7872;
                                class_17992 = class_17352.method_7677();
                                try {
                                    if (m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.namesMatch(class_17992, m$$lqzJeHL7FKMPUNnLxhiX8btidr1azeFdVcgoNpYsgtzjLy3rFMz6rzZS7Z9gSjzEP58ql1fg3RV0nwXJguKBFlZHftmlARxwZ.method_1882(), (0x854FE083 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & n) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) ^ (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 | n))) break block17;
                                    class_3322.method_51737(n5, n4, n5 + ((-1666900126 + (~n & \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) ^ n >>> 3) - -1401764924), n4 + ((0x101000D + (n & 3) ^ 0) - (n & 0x10000) ^ 0x1000000), Integer.reverse(((0x3FC1E5FF ^ n - 37) + 43 << 16 | (0x3FC1E5FF ^ n - 37) + 43 >>> 16) ^ 0x2B1CB11A) - 37, Integer.reverse((0x777023F0 ^ n << 3) + 2825392 ^ n) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01);
                                    break block18;
                                } catch (class_151 class_1515) {
                                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1515);
                                }
                            }
                            ++m$$pIsl4oyZZfFIwpvIcZHe5RcHyePnAgmoOuAacjoeq7XhCGfOWvs1gEP74zefrB8m7hG6WtsJOmlinssS33D8cRjxUtLULIn59;
                        }
                        try {
                            if (!m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.isFull(class_17992, m$$lqzJeHL7FKMPUNnLxhiX8btidr1azeFdVcgoNpYsgtzjLy3rFMz6rzZS7Z9gSjzEP58ql1fg3RV0nwXJguKBFlZHftmlARxwZ.method_1882(), ((2019774737 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) ^ n + 31) >>> 13 | (2019774737 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) ^ n + 31) << 19) ^ 0x2B1CB102)) continue;
                            class_3322.method_51737(n5, n4, n5 + (644424072 - (0xD4E34F0E | n) ^ n >>> 1), n4 + ((((0x3E3B48B8 ^ n + 1) + 16 >>> 16 | (0x3E3B48B8 ^ n + 1) + 16 << 16) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) - 1), 0, m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(Color.green, ((-186929595 + n >>> 15 | -186929595 + n << 17) ^ n >>> 4) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01));
                        } catch (class_151 class_1516) {
                            throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1516);
                        }
                    }
                }
                try {
                    try {
                        if (m$$pIsl4oyZZfFIwpvIcZHe5RcHyePnAgmoOuAacjoeq7XhCGfOWvs1gEP74zefrB8m7hG6WtsJOmlinssS33D8cRjxUtLULIn59 != 0 || m$$lqzJeHL7FKMPUNnLxhiX8btidr1azeFdVcgoNpYsgtzjLy3rFMz6rzZS7Z9gSjzEP58ql1fg3RV0nwXJguKBFlZHftmlARxwZ.method_1882().isEmpty()) break block19;
                    } catch (class_151 class_1517) {
                        throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1517);
                    }
                    m$$lqzJeHL7FKMPUNnLxhiX8btidr1azeFdVcgoNpYsgtzjLy3rFMz6rzZS7Z9gSjzEP58ql1fg3RV0nwXJguKBFlZHftmlARxwZ.method_1868((-1683692241 + (~n & \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) ^ n >>> 3) - -1401764924);
                    break block20;
                } catch (class_151 class_1518) {
                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1518);
                }
            }
            m$$lqzJeHL7FKMPUNnLxhiX8btidr1azeFdVcgoNpYsgtzjLy3rFMz6rzZS7Z9gSjzEP58ql1fg3RV0nwXJguKBFlZHftmlARxwZ.method_1868(Integer.reverse(((0x3F416D7F ^ n - 37) + 43 << 16 | (0x3F416D7F ^ n - 37) + 43 >>> 16) ^ 0x2B1CB11A) - 37);
        }
        class_308.method_24211();
        class_45872.method_22909();
    }

    public static boolean namesMatch(class_1799 class_17992, String string3, int n) {
        class_9304 class_93042;
        m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
        String string4;
        class_1792 class_17922;
        block41: {
            block40: {
                block39: {
                    string3 = class_124.method_539((String)string3.trim().toLowerCase(Locale.ROOT));
                    try {
                        try {
                            if (string3 != null && !string3.isEmpty()) break block39;
                        } catch (class_151 class_1512) {
                            throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1512);
                        }
                        return true;
                    } catch (class_151 class_1513) {
                        throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1513);
                    }
                }
                try {
                    if (class_17992.method_7960()) {
                        return false;
                    }
                } catch (class_151 class_1514) {
                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1514);
                }
                class_17922 = class_17992.method_7909();
                try {
                    if (m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.testContent(class_17992, string3, ((1681692572 - (((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF) << 2) ^ n) - (((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF) << 1) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) - ((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF))) {
                        return true;
                    }
                } catch (class_151 class_1515) {
                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1515);
                }
                try {
                    if (m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.testBundle(class_17992, string3, ((((0x91332047 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) >>> 7 | (0x91332047 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) << 25) ^ n) >>> 3 | (((0x91332047 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) >>> 7 | (0x91332047 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) << 25) ^ n) << 29) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01)) {
                        return true;
                    }
                } catch (class_151 class_1516) {
                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1516);
                }
                string4 = class_17992.method_7964().getString();
                string4 = class_124.method_539((String)string4.trim().toLowerCase(Locale.ROOT));
                m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk = String::contains;
                try {
                    try {
                        if (string3.length() < (-98865519 - (0xD4E34F0E | n) ^ n >>> 1) || !string3.startsWith("\"")) break block40;
                    } catch (class_151 class_1517) {
                        throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1517);
                    }
                    if (!string3.endsWith("\"")) break block40;
                } catch (class_151 class_1518) {
                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1518);
                }
                string3 = string3.substring(1, string3.length() - 1);
                m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk = String::equals;
            }
            try {
                try {
                    if (string3.length() < (-98865519 - (0xD4E34F0E | n) ^ n >>> 1) || !string3.startsWith("/")) break block41;
                } catch (class_151 class_1519) {
                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1519);
                }
                if (!string3.endsWith("/")) break block41;
            } catch (class_151 class_15110) {
                throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_15110);
            }
            string3 = string3.substring(1, string3.length() - 1);
            m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk = (string, string2) -> Pattern.compile(string2).matcher((CharSequence)string).find();
        }
        if ((class_93042 = (class_9304)class_17992.method_58694(class_9334.field_49643)) != null) {
            for (Object object : class_93042.method_57539()) {
                try {
                    if (!m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.testEnchant(m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk, string3, (Object2IntMap.Entry)object, Integer.reverse((0x4D9A5BA6 ^ n << 3) + 2825392 ^ n) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01)) continue;
                    return true;
                } catch (class_151 class_15111) {
                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_15111);
                }
            }
        }
        if (class_17992.method_7942()) {
            for (Object object : class_17992.method_58657().method_57539()) {
                try {
                    if (!m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.testEnchant(m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk, string3, (Object2IntMap.Entry)object, ((241580620 + n >>> 15 | 241580620 + n << 17) ^ n >>> 4) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01)) continue;
                    return true;
                } catch (class_151 class_15112) {
                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_15112);
                }
            }
        }
        try {
            if (m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.test(class_1074.method_4662((String)class_17922.method_7876(), (Object[])new Object[0]).toLowerCase(Locale.ROOT), string3)) {
                return true;
            }
        } catch (class_151 class_15113) {
            throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_15113);
        }
        class_1844 class_18442 = (class_1844)class_17992.method_58694(class_9334.field_49651);
        if (class_18442 != null) {
            for (class_1293 class_12932 : class_18442.method_57397()) {
                String string5 = class_1074.method_4662((String)class_12932.method_5586(), (Object[])new Object[0]);
                try {
                    if (!m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.test(string5.toLowerCase(Locale.ROOT), string3)) continue;
                    return true;
                } catch (class_151 class_15114) {
                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_15114);
                }
            }
        }
        try {
            if (m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.test(string4, string3)) {
                return true;
            }
        } catch (class_151 class_15115) {
            throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_15115);
        }
        return false;
    }

    public static boolean testBundle(class_1799 class_17992, String string, int n) {
        class_9276 class_92762 = (class_9276)class_17992.method_58694(class_9334.field_49650);
        if (class_92762 != null) {
            for (class_1799 class_17993 : class_92762.method_59708()) {
                try {
                    if (!m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.namesMatch(class_17993, string, Integer.reverse((0xF9C752E4 ^ n << 3) + 2825392 ^ n) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01)) continue;
                    return true;
                } catch (class_151 class_1512) {
                    throw m$$4fB8ItI4u09q4HxgEH0u2mJwWKiN1aUEwt0BpEsNRy4gXStWQuKBTBcinudbeG7z9NlyCA3I59B5lPuwlgGptdddXvN79wUh8.a(class_1512);
                }
            }
        }
        return false;
    }
}

