package me.mioclient;

import com.google.gson.JsonObject;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ
extends m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP {
    public final ExecutorService m$$x06Q8HEQswVSiKf27YJjNDBB1NrpDWcqUTOP29vkDqJJHIy7RX4JnMmz0BpZSwwxAWTAntB7DuFmWGIIBfaFGM5L6AWYKsw4k = Executors.newCachedThreadPool();
    public final HttpClient m$$XmHbvm7SEd11AalaLva6Zkl7ND4f1a0yu5RgoibWo2b6tEwZxoZqo3Ueiw6dDgLhclu0I7fS2PglFjD1TvLgOfQ94zEDxqO7W = HttpClient.newHttpClient();
    public static final Pattern m$$FoAdowZ5zokiAfqIy4MYaxP17Hbv0BuhFAMy1LU65pbsv2vK3qQ5Z1NPrDDeDGfD7XBPL5zf378MRcZ6BYX507E6vAWbR7Ac1;

    public m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ(String string) {
        super(string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block37: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.s = new Object[62];
                                m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.t = new String[62];
                                m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.e();
                                var21 = new String[18];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK("vQtSZeIWtt29LuqCPNe3", MethodHandles.lookup(), "m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK", m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.class, 2043577460);
                                var20_3 = var18_2.length();
                                var17_4 = 13;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 45;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK("O0XZie7zm6CVv51ITbeF", MethodHandles.lookup(), "m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK", m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.class, 789272649);
                                    var20_3 = var18_2.length();
                                    var17_4 = 18;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 21;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
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
                                    break block34;
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
                                            v15 = 20;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 16;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 126;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 1;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 115;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 10;
                                            break;
                                        }
                                        default: {
                                            v15 = 38;
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
                        m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.c = var21;
                        m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.d = new String[18];
                        var8_7 = 5574109235469069491L;
                        var14_8 = new long[65];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK("Lah6XiDunoBBJPUCnsZ5", MethodHandles.lookup(), "m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK", m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.class, 1341308251);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK("XMFHedz0KHzfZ8JTcuzf", MethodHandles.lookup(), "m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK", m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.class, 910798478));
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block35;
                            break;
                        }
lbl115:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 =  /* dynamic constant */ (String)m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK("v5CcTGCqAxmmR6GHbRTT", MethodHandles.lookup(), "m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK", m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.class, 1381344732);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK("IATOjgNpHrISstqQCRVQ", MethodHandles.lookup(), "m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK", m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.class, 974444473));
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block35;
                                break;
                            }
                            break;
                        }
lbl128:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block36;
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
                m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.i = var14_8;
                m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.j = new Integer[65];
                m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -140988;
                var0_14 = 3806977801066528210L;
                var6_15 = new long[5];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK("LVKRojJ73HogtqVkhemO", MethodHandles.lookup(), "m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK", m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.class, 436111037);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK("VQgS92dMPSCydk8GAw0J", MethodHandles.lookup(), "m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK", m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.class, 1101475520));
                    v22 = var6_15;
                    v23 = var3_16++;
                    v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v25 = -1;
                    break block37;
                    break;
                }
lbl157:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 =  /* dynamic constant */ (String)m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK("QZLVD6NlsRE9TKGmGSM7", MethodHandles.lookup(), "m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK", m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.class, 1696580656);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK("bUBM7o3QdSYsGvlc7kIL", MethodHandles.lookup(), "m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK", m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.class, 1493489586));
                        v22 = var6_15;
                        v23 = var3_16++;
                        v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v25 = 0;
                        break block37;
                        break;
                    }
                    break;
                }
lbl170:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    break block38;
                    break;
                }
            }
            v26 = v24 ^ var0_14;
            switch (v25) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl181:
                // 1 sources

                ** continue;
            }
        }
        m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m = var6_15;
        m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.n = new Long[5];
        m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)2343422405672841730L);
        m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$FoAdowZ5zokiAfqIy4MYaxP17Hbv0BuhFAMy1LU65pbsv2vK3qQ5Z1NPrDDeDGfD7XBPL5zf378MRcZ6BYX507E6vAWbR7Ac1 = Pattern.compile(m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12725, (int)-9368));
    }

    public static void e() {
        Object[] objectArray = s;
        s[0] = "7\u001b):\u0017\r<\u00148uj\u0015/\u00131<";
        objectArray[1] = "lr}E.Q\u0019RvJ?\u001ex\\}A;D\f";
        objectArray[2] = "\u0006+k\u001e_Z\r$zQ\"B\u001e#s\u00183C\u0005&y\u001a\u0003";
        objectArray[3] = "\u00148\u001a+7\u000f\u001a1]#0\u0014W0\u0010b5.<\u001aW4$Q\u0012\u0015p\u001e\u000f\u0007\u0000oVw5\u0017\u0012\bGq1+\u000b1M>=\u000b\u0018\u0019[v0%\u0011*N\u000f\u0019\u000b\u0013\u0010n\u0001f5\u001ci\u007f\u0014m\u00198.g.8\u000e\u0018\u000e\u0003\tf\u0015\u001fm`s&(\u000bnd\u0014)\f,\u001eL3\u0014W*\u0015`\u0017\u0004%\u0017\u001ce1\u0014";
        objectArray[4] = Integer.TYPE;
        m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.t[4] = "java/lang/Integer";
        objectArray[5] = "\u0007TGH\u0017\u0004\f[V\u0007p\u0006\u0019PVLK";
        objectArray[6] = "g}Y=:9yuCrw#c\u007fZ.f)ch\u0001\u0019l)ni[3f?";
        objectArray[7] = "\u007fR*~\u007f\u0017aZ012\r{P)m#\u0007{GrZ)\u0007vF(p#1pA*v2\u0007";
        objectArray[8] = ".\u0010$0Y]!\u0005|9\u0003G4_\u001a%\u0003C\u0007\u001d;4\u0019G";
        objectArray[9] = "k\u0010fNtlu\u0018|\u0001(|f\u0014h\u0001\nxu\u0005u]4";
        objectArray[10] = "cu\b|Xkm|Ot_p }\u00025PU[bHYVU:@\u0013|djfx\u007fvFvKbcKxrF)b]XS>BTDX7x[\u0010kWR=Zv#sa:C\u0016KyBaG\u0015TZH[YBvpE\\eV'flg^WbcKo\"De\\Pk(^`\u0005uf$WY\\";
        objectArray[11] = Long.TYPE;
        m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.t[11] = "java/lang/Long";
        objectArray[12] = "r6K$I\u000by9Zk$\u000fy%n \u0016\u0012}9^ ";
        objectArray[13] = "eI09)B{A*vuRhM>vJV{K.=u";
        objectArray[14] = ";\u001b3\n\u0018i4\u000ek\u0003Bs!T\r\u001fBw\u0003\u001f4\u001eSt%^\u0007\u001e_k5\u001f7";
        objectArray[15] = Boolean.TYPE;
        m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.t[15] = "java/lang/Boolean";
        objectArray[16] = "0x#:L\"?m{3\u00168*7\u001d/\u0016<\b|&+\r\")|";
        objectArray[17] = "<m+\u0018s)3xs\u0011)3&\"\u0015\r)7\u0004i,\f84\"";
        objectArray[18] = "6\u001b;vBI(\u0013!9\u000fS2\u00198e\u001eY2\u000ecT\u0003Q,\u0016(c\r^0\u001f\u000bb\u0018I.\u001f";
        objectArray[19] = "\u0003_I'z}\bPXh\u0000y\u001bQH'6}\f";
        objectArray[20] = "\u0015\fz\u00074[\u001e\u0003kHUU\u0015\bo\u0012";
        objectArray[21] = "8Y7\u0013\u007f\u001e7Lo'\u00039";
        objectArray[22] = "\u0002 6\n\u001f9\r5n\u0003E#\u0018o\b\u001fE':$3\u001b^9\u001b$d)^3\u0011\t!\u0005U;\r33";
        objectArray[23] = "pt )\u0019-\u007fax C7j;\u001e<C3Hp%8X-ipr\nX'c]7&S/\u007fg";
        objectArray[24] = "ih\u0002*\u007f\u001cjd\u0011e\u0015\u001dqh\u0000\">\u0006";
        objectArray[25] = "\u0000\u0014<{!\u0007\f\u001c=0h\u000f\u0010\u0014?{\u0001\u001b\f\u0015";
        objectArray[26] = "SJ!)/@XE0fB@XX$";
        objectArray[27] = "\u0000K/[s<\u000bD>\u0014\t8\u0018O8^";
        objectArray[28] = Void.TYPE;
        m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.t[28] = "java/lang/Void";
        objectArray[29] = "kk=Y<\u0010`d,\u0016@\tod*Z~\u0019";
        objectArray[30] = "\u0011wMO\u007f0\u000f\u007fW\u00002*\u0015uN\\# \u0015b\u0015h$1\u000ed^";
        objectArray[31] = "BkNtKFD3Nw/F\u0015vN/BY|:G*K[\u00151B!T#MeO6AE\u0002g\\q/";
        objectArray[32] = "70{\u0005xUo~&\u0002IwK\u0013\u0019\b6Z:~tPx\u0007=O";
        objectArray[33] = "Dh]@ rV}\u0018~upBh\u001b\u001e\u0011'Tc\u0007Ba#C`\r~";
        objectArray[34] = ",KJ~\u0017**\u0013J}s$uOY$\u0017\"\u0012JN\u007fM~}X[:sqsA\u001a!\u0016w+A\u0019E";
        objectArray[35] = ")\u000e\u0003tFQ;\u001bFJ\u0016E\u0004\u0004A6\u0006> \u0006^t\u0006\u0000&\fH w";
        objectArray[36] = "\u0011Dq~,\n\u001eD~pNH\u0007Jm`5x\u001cO|\u001dtC\u001fC-mpT\u001cI\u0011";
        objectArray[37] = ",jYhR}'j_k3{~o\u001fatk\u00171\u0012hS9g5\u0005kY\u0005,jYhR}'j_k3";
        objectArray[38] = "W+ N^.\u001c# \u000f7:Ad!7w2\r\u000b\u007f\fQ\u0010V\u0013/2|\u0000Q5k;~<\u0010\u0006BH\t:S-*MZ`\u0001\u001a{\u001b{\u001e\u001d\tAOV6!\u0011A\u0007of\u0010\u0014k\u0011io\nxy*\u00060+-_Lz\u0015=p,\rOg2%.1w\u001f\u000b\u0016AGH\u0013\u0004r\u007f\u001dX 30Rv\r/\t(,\u0006\t8\n\"\u0010LG;\rt`HP8\u0007Hp\u0019\ra\\'b\fH_";
        objectArray[39] = "\u0015c?r6%I=7\u007f\u000esW\"*pb\u001a\u0015*#v2j\u0011= |\u000e \u0016\"#.1|H*.\u0016";
        objectArray[40] = "\t9%7* \u00069*9Hs\u000424T%%\u00180/n-~\u0019'E";
        objectArray[41] = "x<!;L\\}$7q1Pt+2o\\G~N'7JUyt/lKB\u0013'-l\u000fJ-!'z[;";
        objectArray[42] = "VD\u000boNFV\u001e\u0017v\u007fGV{\u001ah\u001eFW \t,D\u001d\u0007K\u0004+\u001bD8";
        objectArray[43] = "r[M\u00101l*\u0015\u0010\u0017\u0000}\"ABK}}CK]E:;x\u0019\u0014S:\u0001r[M\u00101l*\u0015\u0010\u0017\u0000";
        objectArray[44] = "\b$8\u0002;\u0018Pje\u0005\n\u0015T26SpuY4`\u0000;\u001aK!%>j\u001a\u0003ekQx\u000fF[kAhI\b63\u000f5N9";
        objectArray[45] = "\u0001\u0018\nc\u0002c\n\r\u0006u9w\u001b\u0006\u001f[B~\u0007a\u001av\u0003'P\u000e\bcF\u0019\u0000\n\u0006{Dx\\\u000e\u0014&9t]\u001a\u0014s\u0003|\u0006\u001b\u0003\u0019";
        objectArray[46] = "\u0015\u0010\u000bW0?J\u001b\u0013AS}E\f\r18h\u0017\u000e_Q+:\u0019\u0010a^m=\u0015U\nSjbLj\u000bV3eJS\u0004V<k(";
        objectArray[47] = "wpGb_mee\u0002\\\u0000emz\u0014 \u0012o{\u001f\u0005;TohdD2^\u0002wpGb_mee\u0002\\";
        objectArray[48] = "\u0019\u00144,_0O\u001djh<2H\rE\u007fW4H\u001eRvF9L\u001eVq[0%O0z\ro\u0018\u0019anQT";
        objectArray[49] = "\u001e2@_Kc\r`NAue\u0018#5F\u0014g\u00191\u0005;D|\u0017`NV\u001c2Jg\u007f";
        objectArray[50] = "i4\u0006\u001dE=1z[\u001at:%*\u0000Mt;6t\u0000\u001f\u0014(dz\u001e!";
        objectArray[51] = "@g8y\u001eE\u001c90t&\u0013\u0002&-{Jz\u001a1z#\u0017\u0015\b$?\u001d\u001cC\u0002:x\"@\u001d\n7@";
        objectArray[52] = "\u0010MZdyQ_OI#\u0017RH^[}zL!KWz)F\u001fM]l}7";
        objectArray[53] = "\u001f||l{7\u001adj&\u0006;\u0013ko8k,\u0019Cg7k(\bop:o4\u0010\u007f\u00170h9Mcs#w+\u0012\u000e~;an\u00050x1w:t";
        objectArray[54] = "Aq\u0019\u0017q@\u001d/\u0011\u001aI\u0003\u001c\u0013\u001d\t(\u0019\u0014H\u0001\u001csAJ'\u0013\t6\u007f";
        objectArray[55] = "cJsk!khJuh@i5U%u;~X\u00118k /(\u0015/h*\u0013b[,o|cfL/e@";
        objectArray[56] = "\tCb$2aQ\r?#\u0003qB]\u0000uz4WA?\u007fz~U<1ga0\tQi)<78";
        objectArray[57] = "\u001eNWB?~S\u0004\u0002\u0019\\A\u0010\u0005\u0003Ydmc\u0015r\u0015\u0016.f\u0013AT:\"B\u001fyf\u001av[:s\u0012&XX\bVl;AaLV\u0011? K)\b\u0012a[Z\u001bOh\u0018s\u001e\u001f^J\u0005MA\u0014ljmx`\u001ft\u0014.f\u0011\u001fxS\u000e\\g\u0018yK\rT}&\nO8Xs\t\u007fZ&'COa(cbXDI\u0012={\u001a\u00123\u0012,{AHC\u0016;xKt";
        objectArray[58] = "P8.4~P\u000f36\"\u001d\u000f\u0000=\u0004.a\u0011&&%?{\u0015m\u007f>8{\nT 5 mi";
        objectArray[59] = "9/h\u0003\u0002do~|_9\"y{aSEYg*j_T(5ao\n9==c{\f_9\u007f}d2";
        objectArray[60] = "/<N\u001d\u0002i}uX\u001d85.\u0015JL_4,5'\u0018E+p4\u001dF\\i&NHUQhzu\u001a\u001cGh@";
        Object[] objectArray2 = objectArray;
        objectArray[61] = "\r'pF|\u0013\u001em \u001f\u0002R\b: [\u0002\u0016\u0011.}Y8H\bl+#`MW7-F=T\u0002kM";
    }

    public static Exception b(Exception exception) {
        return exception;
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x599A;
        if (j[n2] == null) {
            m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.j[n2] = (int)(i[n2] ^ l);
        }
        return j[n2];
    }

    public static long d(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x73F1) & Short.MAX_VALUE;
        if (m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.n[n2] == null) {
            m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.n[n2] = m[n2] ^ l;
        }
        return m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.n[n2];
    }

    @Override
    public void exec(LiteralArgumentBuilder literalArgumentBuilder) {
    }

    /*
     * Unable to fully structure code
     */
    public /* synthetic */ void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(String var1_1, CompletableFuture var2_2, String var3_3) {
        block25: {
            block24: {
                block28: {
                    try {
                        if (var1_1 == null || var1_1.isEmpty()) break block24;
                    } catch (Exception v0) {
                        throw m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b(v0);
                    }
                    var4_4 = var1_1.length();
                    if (var4_4 < 3) ** GOTO lbl20
                    if (var4_4 > 16) ** GOTO lbl20
                    break block28;
                    catch (Exception v1) {
                        throw m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b(v1);
                    }
                }
                try {
                    block29: {
                        if (m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$FoAdowZ5zokiAfqIy4MYaxP17Hbv0BuhFAMy1LU65pbsv2vK3qQ5Z1NPrDDeDGfD7XBPL5zf378MRcZ6BYX507E6vAWbR7Ac1.matcher(var1_1).matches()) break block24;
                        break block29;
                        catch (Exception v2) {
                            throw m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b(v2);
                        }
                    }
                    var2_2.completeExceptionally(new RuntimeException(m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12704, (int)-30548)));
                    return;
                } catch (Exception v3) {
                    throw m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b(v3);
                }
            }
            var4_5 = var3_3;
            try {
                if (var1_1 == null || var1_1.isEmpty()) break block25;
            } catch (Exception v4) {
                throw m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b(v4);
            }
            var4_5 = new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)var4_5).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12709, (int)-3731));
            var4_5 = new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)var1_1).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)var4_5).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12711, (int)5445));
        }
        var5_6 = false;
        for (var6_7 = 0; var6_7 < 2; ++var6_7) {
            try {
                block26: {
                    block31: {
                        block27: {
                            var7_8 = HttpRequest.newBuilder().uri(new URI(new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)var4_5).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12715, (int)26332)))).GET().header(m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12716, (int)-19266), m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12713, (int)7455)).header(m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12705, (int)-1093), m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12710, (int)-802)).timeout(Duration.ofSeconds(10L)).build();
                            var8_11 = this.m$$XmHbvm7SEd11AalaLva6Zkl7ND4f1a0yu5RgoibWo2b6tEwZxoZqo3Ueiw6dDgLhclu0I7fS2PglFjD1TvLgOfQ94zEDxqO7W.send(var7_8, HttpResponse.BodyHandlers.ofString());
                            if (var8_11.statusCode() != 204) break block26;
                            try {
                                block30: {
                                    v5 = var2_2;
                                    v6 = v7;
                                    v8 = v7;
                                    v9 = m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12718, (int)-32523);
                                    v10 = new Object[1];
                                    v11 = v10;
                                    v12 = v10;
                                    v13 = 0;
                                    if (var1_1 == null) break block27;
                                    break block30;
                                    catch (Exception v14) {
                                        throw m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b(v14);
                                    }
                                }
                                if (var1_1.isEmpty()) break block27;
                            } catch (Exception v15) {
                                throw m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b(v15);
                            }
                            v16 = m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12714, (int)-8450);
                            break block31;
                        }
                        v16 = "";
                    }
                    v11[v13] = v16;
                    v6(v9.formatted(v12));
                    v5.completeExceptionally(v8);
                    return;
                }
                if (var8_11.statusCode() == 429) {
                    var2_2.completeExceptionally(new RuntimeException(m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12712, (int)31549)));
                    return;
                }
                if (var8_11.statusCode() != 200) {
                    var2_2.completeExceptionally(new RuntimeException(m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12724, (int)29922).formatted(new Object[]{var8_11.statusCode()})));
                    return;
                }
                var9_12 = (JsonObject)m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$VqDc0eTAgzOPC4IU6WwZsiqEa0qk7QNmclpi6XPMtzLLBOqLUU9iWXMcrWVjw6jLdGlqrsVBwx7XuPXLTWk6HGDHuk8aGSTUx.fromJson(var8_11.body(), JsonObject.class);
                var5_6 = true;
                var2_2.complete(var9_12);
                return;
            } catch (Exception var7_9) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception var7_10) {
                    // empty catch block
                }
                continue;
            }
        }
        try {
            if (!var5_6) {
                var2_2.completeExceptionally(new RuntimeException(m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b((int)12708, (int)16613)));
            }
        } catch (Exception v17) {
            throw m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.b(v17);
        }
    }

    public CompletableFuture m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP(String string, String string2) {
        CompletableFuture completableFuture = new CompletableFuture();
        this.m$$x06Q8HEQswVSiKf27YJjNDBB1NrpDWcqUTOP29vkDqJJHIy7RX4JnMmz0BpZSwwxAWTAntB7DuFmWGIIBfaFGM5L6AWYKsw4k.submit(() -> this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(string2, completableFuture, string));
        return completableFuture;
    }

    public static String m$$dmZblLEQFNvRdKN4dq1j8nBm7vktDVIVz360a8LuNOt5XvfskqtbFVv331kI7XmENmR0dMjj4b5snocFIbLsxEMSAjSLvadfK(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{77, -108, -37, 104, 73, 69, -101, -79, -73, -36, -19, 7, 118, 82};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 14]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

