package me.mioclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.awt.Desktop;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import me.mioclient.m$$1jOWsTPtmbJw41RuZ4W3HsnOh1UrckOKRyWBrJ2dTlnNzMWmXIoAwZsov6KCypcHhvjIkeyolQqDs34vtSdJ8oD9yR8jOJlp0;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$CuxPDbeLNAusVP7lqYtDMb84xFpfVpDCqKX0mYwKMg4JWoQwSF3fWsPlLY5qC1a61Q0bLiZTxRe5vHWbKsnSLINXdBbSPlgad;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n$m$;
import me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_2561;
import net.minecraft.class_5250;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n
extends m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP {
    public final String m$$3LI3R6Ucd120MKUDKkOE52iELxVUMkyDTaOUlscgxdoUU70VbRgiz7RLm0JUgcOY4zAttkv9Ak13r20d3t89ALJjRBeU7WQWC;
    public final String m$$wgANyjxCgtBC4gBQhvI8MjEqRT87KpI3L7cZUz0qdNoTQJIups4tqoWybNzYpwaUbSWWVYScZLDtordma24Ssugl78znkGNHj;
    public CompletableFuture m$$L4eZLVx4AdETYEDABW59MkLtO8njojfpktnnNjE15Tg4MgX0sCgU4aeBbTluUcy2DGHzd1eJdWVpZnSflIqib7iiTIDDwuAsU;

    public m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n() {
        super("namehistory");
        this.m$$3LI3R6Ucd120MKUDKkOE52iELxVUMkyDTaOUlscgxdoUU70VbRgiz7RLm0JUgcOY4zAttkv9Ak13r20d3t89ALJjRBeU7WQWC = "https://api.minecraftservices.com/minecraft/profile/lookup/name/";
        this.m$$wgANyjxCgtBC4gBQhvI8MjEqRT87KpI3L7cZUz0qdNoTQJIups4tqoWybNzYpwaUbSWWVYScZLDtordma24Ssugl78znkGNHj = "https://laby.net/api/user/%s/get-names";
        this.m$$3LI3R6Ucd120MKUDKkOE52iELxVUMkyDTaOUlscgxdoUU70VbRgiz7RLm0JUgcOY4zAttkv9Ak13r20d3t89ALJjRBeU7WQWC = "https://api.minecraftservices.com/minecraft/profile/lookup/name/";
        this.m$$wgANyjxCgtBC4gBQhvI8MjEqRT87KpI3L7cZUz0qdNoTQJIups4tqoWybNzYpwaUbSWWVYScZLDtordma24Ssugl78znkGNHj = "https://laby.net/api/user/%s/get-names";
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
                                m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.k = new Object[110];
                                m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.l = new String[110];
                                m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.e();
                                var21 = new String[16];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ("d9Emr0EnEX9Hw3vMVVTn", MethodHandles.lookup(), "m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ", m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.class, 821608602);
                                var20_3 = var18_2.length();
                                var17_4 = 4;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 60;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ("UeXorXALyndhigDv31vO", MethodHandles.lookup(), "m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ", m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.class, 2146776895);
                                    var20_3 = var18_2.length();
                                    var17_4 = 4;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 90;
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
                                            v15 = 11;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 11;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 71;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 124;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 30;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 79;
                                            break;
                                        }
                                        default: {
                                            v15 = 78;
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
                        m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.c = var21;
                        m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.d = new String[16];
                        var8_7 = 3272076653840244181L;
                        var14_8 = new long[46];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ("VXJOlVE59WuMGG73jwAo", MethodHandles.lookup(), "m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ", m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.class, 1919898129);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ("CBXUVbbb8mXE0Dom2iRy", MethodHandles.lookup(), "m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ", m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.class, 1049780527));
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
                            var12_10 =  /* dynamic constant */ (String)m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ("bQV9D7AlR5nmUx25IEbp", MethodHandles.lookup(), "m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ", m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.class, 1607600400);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ("kov7I3y3R4A1q5VfYRG5", MethodHandles.lookup(), "m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ", m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.class, 1494437461));
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
                m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.e = var14_8;
                m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.f = new Integer[46];
                m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -868128;
                var0_14 = 8505872532174964318L;
                var6_15 = new long[7];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ("0FmzLg9uJN12rJz7TESH", MethodHandles.lookup(), "m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ", m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.class, 392691970);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ("KFeKeunbUdQnxvmv87hi", MethodHandles.lookup(), "m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ", m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.class, 91451793));
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
                    var4_17 =  /* dynamic constant */ (String)m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ("1aQvEqzCbZbin6FK4IFm", MethodHandles.lookup(), "m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ", m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.class, 1356010489);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ("NDMWCCxFx06GFuGawoTy", MethodHandles.lookup(), "m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ", m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.class, 74515034));
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
        m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.i = var6_15;
        m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.j = new Long[7];
        m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)3960623974246916106L);
    }

    public static void e() {
        Object[] objectArray = k;
        k[0] = "F|*\u0019E\u000bXt0V\b\u0011B~)\n\u0019\u001bBir;\u0004\u0013\\q9\f\n\u001c@x\u001a\r\u001f\u000b^x";
        objectArray[1] = "C&=\u0003\u000fv].'LGvG$?\u000bNm\u0007\u0014>\u0012Qo@\"9";
        objectArray[2] = "u^];DWkVGt\tMq\\^(\u0018GqK\u0005\u001f\u0012G|J_5\u0018";
        objectArray[3] = "^c3\u001f1\nUl\"PL\u0012Fk+\u0019";
        objectArray[4] = "p;0%k8\u0005\u001b;*zwd\u00150!~-\u0010";
        objectArray[5] = "gY\u0000$&ryQ\u001akDn~L";
        objectArray[6] = Integer.TYPE;
        m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.l[6] = "java/lang/Integer";
        objectArray[7] = "^L)#P)UC8l1'^H<6";
        objectArray[8] = "Zx\u00129\u0007YTqU1\u0000B\u0019p\u0018p\"quD]\u0013&WvVe>+\u0005asSd\u000f[uRR8\\Q`k\u00040\u001cG\u0003eS#\u000bNt|v\u0005$Nq~\u0005\u001d\f\u0003bgn\u001d!wq[ng4u\u0007OF\u0011!N]mieZG\u000enoc\u0014R}pRd\u0005{QPu\u0007 fU$j`\u0000\u0012Z9\u0018.\u001bOPXdg<Opi\u000f\u0002\u0002G`.\u0004:\u0006[@%h\u0017\u0019WF,~1\u0007yNQ}g\u0004\u0000o\\^\"6\u007fXx\u007fg \u0004o%K\u0001VZS{e'^\\\u0001wK3\\b]o]g\"nR*K\u00014zrX].\u001fE\u0001s\u007fd6\u000e`$zl";
        objectArray[9] = "X\u001f\u000e \u0019nS\u0010\u001fo~lF\u001b\u001f$E";
        objectArray[10] = "&\u000f;5\u001a\u007f-\u0000*zgg>\u0007#3vf%\u0002)1F";
        objectArray[11] = "\u001c%G!5K\u0012,\u0000)2P_-Mh\u0013\u001d'$\u000e;\u000f\u001d\u0006\u0018\"\u001coI\u001f\u000b3}\u0017@+\u0015?6er\u0006*Z\u00008F'4\u0002\u001f8M\u0003/'\u000fj\u0016).]\u0001\n\u001c\u000b\u0006< \u0006B\u0012\u0015\u0001\u001f\nH3\r\u0011\u0014\f\u001c6%\u001e/i~\u001ay,\u000f5M\u0018\r\n\u001b\tQ&(\u001a \u000e\u001d\u00168'\u001a\f";
        objectArray[12] = "N\u001b\bdR5N\u001b\u001f8^:TP\u001f&^/S!Ix\nl";
        objectArray[13] = Character.TYPE;
        m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.l[13] = "java/lang/Character";
        objectArray[14] = "4r\u000e\u007ft\u001a4r\u0019#x\u0015.9\u0019=x\u0000)HHd/B";
        objectArray[15] = "\fgO\u0010e.\u0002n\b\u0018b5OoEYE8\u000eP\u0007\u001ci\u0006R{\u000e\u000bz\")M\u00196;\u0003Pr8\u0010c3\u0019e-\u000e8;\u0018rT5d\u0003\u001bi\t\u001c:+RaQ\u001fI#\u0013L\u001b%urVk7\nmp\u0016sQ4ty\u0003c+\u0013mp9a\u0003$F\nQeQ\u001c9;&w\"2>v'm\u0018\u001e{";
        objectArray[16] = "e\u0018Q'\nJe\u0018F{\u0006E\u007fSFe\u0006Px\"\u0012=Q\u001a";
        objectArray[17] = Void.TYPE;
        m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.l[17] = "java/lang/Void";
        objectArray[18] = "\u0012%\u000fh]<\u0019*\u001e'6(\u001b!\t}\u001a?\u0016";
        objectArray[19] = "\u007f;s-% q24%\";<3yd\u0000\bP\u0007<\u0007\u0004.S\u0015\u0004*\t|D02p-\"P\u00113,~(E(e$>>&&27)7Q?\u0017\u0011\u00067T=d\t.zG$\u000f\t\u0003\u000eT\u0018\u000fs\u0016\f\"\f'\u0005\u00037x.\bqx>+-\u000ew6+X33p'\u0002t\u0013\u0014\u0013\u0002\u001fpg\u000bt\"";
        objectArray[20] = "i\u00166]\u0007bb\u0019'\u0012}fq\u00187]Kbf";
        objectArray[21] = "\u0013E[</\u0019\u001dL\u001c4(\u0002PMQu\u000b\u001b1w,\u0002\t09Z\u0011f\u000b0)JD\u0012\bB\u001cQ1\u001d\u007f\u0015JUG?\u0007:\u001bC\u001fi!\u0010MPB\u0015\u0001\u0006\rV\u0004>,\u0007\u0018v<\u000b\u0011\u0017\u0019B@7\bC+N/\u001b!''j\u00054$\u001b\u000e\u0018,?%\f\u0013c1\u0006\u0011\u000f\u0006n\u000f>.9Fv': ";
        objectArray[22] = "Y+\u0004}ueR$\u00152\t|]$\u0013~7l";
        objectArray[23] = "a\u0002Z.qZo\u000b\u001d&vA\"\nPgydY\u0015\u001a\u000b\u007fd87A.M[d\u000f-$oGI\u00151\u0019QCD^0\u000fqb<5\u0006\u0016q\u0006z,B9~c?-$qZP84D\u0019Psc0G\u0006syY.\u0010$Yt^\u0012\u0004uO]e)\u00050JzmU\u00167uai_\f2,DdS\u0005\u000bu";
        objectArray[24] = Long.TYPE;
        m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.l[24] = "java/lang/Long";
        objectArray[25] = "aQ(:c:\u007fY2u+:eS*2\"!%s15>:fU,";
        objectArray[26] = "CSDo/YJ]G&lTRUN &_EN\u0007\"-XTYQ5luOQD ,RcSG5'NT";
        objectArray[27] = "(H\u0000U3\u001b#G\u0011\u001a^\u001b#Z\u0005";
        objectArray[28] = Boolean.TYPE;
        m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.l[28] = "java/lang/Boolean";
        objectArray[29] = "b}@%R[|uZj\u001a[f\u007fB-\u0013@&ZC*\u001fZasX";
        objectArray[30] = "2V~nR}<_9fUfq^t'rk0a6b^UlJ?uMq\u0017|(H\fPnC\tnT`'T\u001cp\u000fh&CeKSP%X8b\rxlP`a~p-}*[B!hZ\u0006tZ#(B`JC*=R\u001amZ#\u0007P2ZqYoT`b\u000eh\u0018F\u0013L\t%\u0019\\)`L62\u0017tyNk8v\b0ik\u0018GcUWc\b\u0000hmS\u007f(\u000b\u0004@Ls.\u0002\u0012fR]&\u007f\u00110Q$\u0007r2uc[0V\u00130u \u0007\u000b'V\u0003~;U\tp\u000bxiY'd\tF5A10wJ:\u0004'Va^\u001av1yJai]\u00133c*\b\n\u0016;";
        objectArray[31] = "/8\u000f*s} -W\u001e\u000f_";
        objectArray[32] = "5L\u0006^{f:Y^j\u0007A";
        objectArray[33] = "1h\u0017RU\b,}Ow\u001e\u001a0}\u000eC";
        objectArray[34] = "\u000e\u0019\u0002;R\f\u0007\u0017\u0001r\u0011\u0001\u001f\u001f\bt[\n\b\u0004AtM\u0004\u0018\u001b\n{K\u0010C7\u001drJ\u000e\b\u0018\u001bAF\u0013\b";
        objectArray[35] = "h8RB/\u000ea6Q\u000bl\u0003y>X\r&\bn%\u0011\u000e7\bg3Z\u001el3n&J\u00050\u0004o\u0016M\u000b7\fn9K.7\bg3Z\u001e";
        objectArray[36] = "@jj\u001eQ\u007fIdiW\u0012rQl`QXyFw)RIyOabB\u0012\\JqbB]|bw`EQuMqEEU|G`u";
        objectArray[37] = "pk8\u0013\u00001ye;ZC<am2\\\t7vv{_\u00187\u007f`0OC\u001fac P\b0gF T\u0001:vv";
        objectArray[38] = "k^g`\u007f\u001bbPd)<\u0016zXm/v\u001dmC$\r}\u0019ePd*";
        objectArray[39] = "O\n\u0017\u0016ceC\u0002\u0016]*m_\n\u0014\u0016NyC\u000b?TagI\u000b\u000e";
        objectArray[40] = "r|7\u001fv\u0012~t6T?\u001ab|4\u001f[\u000e~}\u0015S{\u0018rg";
        objectArray[41] = "\u001cep%1/\u0013p(,k5\u0006*N0k1$aw1z2\u0002 D1v-\u0012at";
        objectArray[42] = "V\u0012\u0019sL\u0003Y\u0007Az\u0016\u0019L]'f\u0016\u001dn\u0016\u001eg\u0007\u001eH";
        objectArray[43] = "\t$\n{;[\u0005,\u000b0rS\u0019$\t{\u0016G\u0005%74.G\u000f9";
        objectArray[44] = "\fF!O{}\u0003SyF!g\u0016\t\u001fZ!c4B$^:}\u0015B";
        objectArray[45] = "\u0010\u0007;?6\r\u001e\u000e|71\u0016S\u000f1v\u001c\u0017\u00052Q0:.3#`!\t2J\u000ed\u000b+&0\u0000-f'$\r\u0004C\"\u001b!\f)Mb2;\n)X5k(*\rD%\f$N\u0004B!\u000f\u000e1; #\u001cS\u001cT$\u0003o\u00001\u000bO\u0006'0\u0018Wc\u001a\b\u00006\u0011{\u0001\u0013+3:q\u0010=1-\u000er3;";
        objectArray[46] = "$=lj\u0011\u0016(5m!X\u001e4=oj<\n(<@6\u0004\u0018>";
        objectArray[47] = "\u0014~ZH<\u007f\nv@\u0007a~\fzMD<I\u0011s@Lq~\u0011m_";
        objectArray[48] = "\u0012\u000b\u0014k/h\f\u0003\u000e$ri\n\u000f\u0003g/^\u0017\u0006\u000eobi\u0017\u0018";
        objectArray[49] = "6!hK\u0014q()r\u0004Ip.%\u007fG\u0014W(2{KW";
        objectArray[50] = "8pd\u001c3\\4xeWzT(pg\u001c\u0013@4q";
        objectArray[51] = "%\u000fC\u000f`RpH\u001bS]\b7\u001d[U3&bSP{\u001c4ZuY[;\u0006b{\u007fk\u0010\\[\nCug\u0001&\nZG\u0011\u0013|p|Z\u00030I\rDV\u001f-%\\Xr&*uL\u001b[\u0007\u0004dseM`T[l\u0019{\u0011\u0002a\r\u001eq\u0007\u0006rx\u0013\u007f\u0011,'Z^Z\u0004\u0006CNp_\u00195tmh5g\u000f*\t\\\u0004-\u0002b\\\"";
        objectArray[52] = "zx\tb\u0013Af!UttO:7\u000eN%U-*\n9\bmwu]|\u0010XZ^\u000bo\u001bCmazb)[dIk^H\u001bgKZm\u0017{Ka\u000fX\u0006\u0015l[D5D\u0011k!Rn&ezuH{%txz\u000bz\nZ(Z\nX=tpJZ:\u000bJICkg\toGCGJICHTo\u0004NH'#H5\u0004Eov68\u001f\u0017ziL{E\u0010\u007f\u001bTn\u0005PqwSzE*";
        objectArray[53] = "9\u000bY\bFCu@\u001d\u0015{\u0012#\u001cTyFC$AZ\u0012C\n9I%";
        objectArray[54] = "Is3xVtHbi<ocQ~k\u0007\u0016#Jjpw\u0003nA(\r~SdHn}k\u001eo\n\u0013";
        objectArray[55] = "\n^y\u0003>F_Mi\nG\u0006Y_o\u000b<\u0011~P~\u001c<|\bJ?\u001d5\u0006K\u00108\u0018G@_\u001cn\u0003=\u0003\u0005\u001bkq";
        objectArray[56] = "\u0001=a\u0015\u000ewW=f\fr|\\=o\t\u001eN\u000b~1_I\u0019\u000b#>V\f(A.v\u0003r)M/t\u0012\u001c\u007fM(mn";
        objectArray[57] = "@^1Yv?\u0011\u00186\u0012N9\u001d\u00108br)A\u000e'\u00181sF\u000bU";
        objectArray[58] = "c27n\u001d\u0019d&w\u0014\u001b\u000eM? yz\u0017}b:t\u001fIy2:\u0014";
        objectArray[59] = "\u0018\u0018\bo]\u0001N[\u0006s>\\\u001c_\nyRnM\u0018V!\u00069KA[&@\b\u0001L\u0013s>\t\rM\u0011bP_\rJ\b\u001e";
        objectArray[60] = "T~\u000f.s\u001cVgAsN\u0011Xk62!\u0003Pz\u00194NDW&G6\u007f\u000eZn\u0012H,B^~\u00103s\u0007\nk\u007fuu\u001e\u0004h\u0014p<\u0003\f\u0017";
        objectArray[61] = "H0k\nm:O$+pq+R\"~\u0001C-[<qp3oZ?q@wkV%\u001aIzoD!h\u0000jlDZx\u001a{,M6\u007f\u000e;V";
        objectArray[62] = "+7h\u0001\u0011_<h|F)\t<,P\u0000k\u001d66^\u0011K\u000b:,\u0019\u0000\u0013\u00023mg\u0007\u0010\b/P";
        objectArray[63] = "h\u000fd7\u001e9r\u0010i,{8n\u0015d){.|\n{\"Kmh\u001d0E";
        objectArray[64] = "=Is\u0003Z,*\u0016gDbz*RK\u00029i=Od\u0016b/%\u001f:\u0007Se(Woy";
        objectArray[65] = "6<jXW]!c~\u001fo\u000b!'RY-\u001f+=RX\u0015\r=[d\u0012\u0014\b=gd\u001e\u001f\u0003L";
        objectArray[66] = ":j\u001a\r\brk,\u001dF0`k*:_Ks\u0006kEV\u0001pmn\fK\t\u000f";
        objectArray[67] = "Z\u0002EH4.\u000e\u000bV\u0018T'IIzc\t2+\tAy73>\no\u0018i\u00198\u0000\u0014l)\u000fY^kF3\u0013\t\u0019Ch8\u001c.4v\u0015.\u0010:8v`=\u007f \u0004\u001f@?\u0019\"\u0019[\u001d=\u001cY\u0015Dh$9$\u0001Uw:/\u00004eB$,\t\u000e\u0018Y;\"'\u001aeb9} (z\u001b\u0012,9*{%n T]Z\u0014$-\u001c\b$\u0019?\u007f\t\u0017^Zex\fe\u0014Y:9\u0019\u000bBY= e";
        objectArray[68] = "WYzJl|\u0018\u000e`P\f#_\u0003fyw*Cdy\\}7\u001d]n\u0003ip%\u0006?Pe\"^Yz\u0004pM\u0018_c\ns&\u001d\u0016~\u0002\f";
        objectArray[69] = "8vY%v\u0014?uS9K\u0005.0=})[{2\f7$\u0013.LG :\u0010{uP\u007f.WC";
        objectArray[70] = "Hz^ma\u0002IdLv\\\u0000Pf0v7\u0015I \u000b)\"\n\t\u001eAq2\u001d\u0004y@o \u00069";
        objectArray[71] = "\u0005>\u0012\u001f\r'\u000f!\u0014\u0006gr@c\u0006\u0005\u0016x!\u001fO\"\u0016X\u0010t*\u001c\u001eHW\u007f\u0012\u0018\u0002h\\\u0013?\u0007\u000enU\u0005\u0019\u0019 f(\u0006O\u001aYG%%\n(&p\u0001\u0004O>]G\\0)H\u0003{\u0002\u001e\u000f@\u0005)\u000e0\u001bB;u\u0016&O<7zS0)*#Z!&\u0006\u0001\u001c)\n\u0004L(WH]\u0001Dx\u000e,\u000e>\u0017@Xo\u0000\"t\u0012\u0007q\b,\u0017\u0002\u001bk\u0012O\u001e\t\u0015&\u000f)\u0019\u001d\u001a-l";
        objectArray[72] = "=(\u0010e*\b!qLsM\u0006}g\u00179\r\u001d*\u0012H_3\u00077:CY\u0013\"\u000ep\u0011O\n\ro\nOe\n\r0's;}3.2@O\u0015;\u001a\u0019\u0015\\1\f2&D~rYa\u0014@\u007f\u0011\u0006`{Fz|\r\u0013\u0010t_\u0010<\u0017\u0017iZ-\u00065\u0004\u0012es\u0018\u001e$\u0016S.\u001d\u0000vl?\u0001\u0002\u000b\fV\u0003w\u0001`sQ2=\f(&/?q\u0007jsRn7\u0000!K";
        objectArray[73] = "RE\u0007\u0012v:XZ\u0001\u000b\u001co\u0017\u0018\u0013\bmevdZ/mEG\u000f?\u0011eU\u0000\u0004\u0007\u0015yu\u000bh*\nus\u0002~\f\u0014[{\u007f}Z\u0017\"Zr^\u001f%]mV\u007fZ3&Z\u000bK<ExfUe\u001aM~4YK\u000eO@hA]Z1Lg\u0004K<'XGv]\u0013\fg4]\u007fY%,U\nzQuu1YE\u0002M#rWYa\u001f|l_W\u0002\u000f`vE4\u0002\u000be;\\\u000b]\u000fvd;^\u0010\u0007-i]Y\u0004\b&\n";
        objectArray[74] = "Y.q\u001e\u0012\u0016\u000f.v\u0007n\u001d\u0004.\u007f\u0002\u0002/Pj/XTx\u0000i}\u0014\r@V*s\bnH\u0015<d\u0019\u0000\u001e\u0015;}e";
        objectArray[75] = "h4;U\u0007)<=(\u0005g!6/7B\u000e!Wi8\t_;f#5A\nE/3dG^..\">\u0003g";
        objectArray[76] = "\f,uV\u0016\u0000C$6Jn\u0014^0n`\tN1-FV'\u0003I\"cw\u0004\u00010\"m\u0014\u000b=\u0017Goo\u0007A8nsq>N\u0019uMlT\b\u0014c<S\u0001\u00163qr|\u000f\n#~VH?\u001d9\u007fuVQ\u0015#\\n\u0012\u0007\u001d,ak\\\u001161ecvSN5c7\u0017^\n;XV\u0017\n\u001b5^U-T\u0013C$r\u001c\u001e\u001e\u000bq\f\u0011\u0005L\u001envR_K\u001b\u001cwV\n\u0003\u0017wmI\u0007\u0018r";
        objectArray[77] = "G0db\u0010\u001eG<oiaKCD~u\u001d\"\u0004<{5Y_Uz|~a";
        objectArray[78] = "x\u001c[q\u00113t\\\\e|1xQzi\u0001%x-\\1\u0016/x@Pq\u0011;\u0015";
        objectArray[79] = "x0Y#6'-#I*Oc/+_<\bsFsIl#o<0\u0013k&\u001dx0Y#6'-#I*O";
        objectArray[80] = "S\u0010s\u0015h_T\u00043onHz\u001dg\u0017k^M\u0017n\"\u007fX\\\u0002~\u000ehUX\u001ef\u001e\u000fQM@~\u000fj\u000fI\u0010~o";
        objectArray[81] = "<5\u0015N!4;!U4+(52\u001cH'?86\u0000P7X=4\u0014Dxcb!\u000b\u0004F:4.\u001eS*= nd";
        objectArray[82] = "-M\u001f\u001bkBx\nGGV\u0018?_@D\u0011Mp# q5 K#\u0014hf\u0004*L\u000e\\j'h\u0018!pj$m#%E*Bk(\u001coh\u0016C\u0017\u0015A-\u001buIDn?$C*\u0002\u001c\u0018AT\u0002Oci/Z3\u0010\u0011$6n\u0013NYi\u0003+23m\n\u0013b*G\u0011\u0019\u0012WI;\u007f9G->&!l\u001f\"K\u0000\u0010&\u0012j\u001e~";
        objectArray[83] = "+,FB.j\u007f%U\u0012Non$ZJ#`hK\u001dM\u007f>jzW@7k\u0014,\u0018Rsj.5LW!\u0006s1YKwtw{VWN";
        objectArray[84] = "#vU(^M7-UinCb9\u001ce\u001fI\u0003EUB\u001fi2.0|\u0017yu%\bx\u000bY~I%g\u0007_w_\u0003y)W\n\\UzPv\u0007\u007f\u0010H/A#^U^Tv~j3(\nJ D\u0015 \f\u0018,j\u0001\"2D4|U\\>Kqj3J*k\u0003|\u001ca\u0015\u0018(^VH^y\u007f[^\u0018\u0000B1|\u0001~V[w%n$\u0005\u001b\"g\u0014g_\u001c'\u0015\u0004i\u001c\u0017-s\u0003}\u0013\u001cN";
        objectArray[85] = "}Li\u001c\u001b)a\u00155\n|'=\u0003$\u0007\r-\\\u007fm \r\rm\u0014\b\u001e\u0005\u001d*\u001f0\u001a\u0019=!s\u001d\u0005\u0015;(e;\u001b;3Ufm\u0018B\u0012XE(*=%|dm<F\u0012!P\u000bJ\u0018.\u007f~-B\u001e|sP9@  kFm>,/.P\u000b(8\u000f\\F$\u0003\u0007|wdn*L\u001d afz\u0011s{^;\u0017\u001d3|JV\u0010\r0 L0\u0017\u0019?+/";
        objectArray[86] = "Skwi|/D4c.DwRN}t\"QCnkx8\u0016Kp<o$s\u0015tloD";
        objectArray[87] = "A0N*^KEzA6gTV'[3\u001bT]JI/\u001c\bT{Kt\u0003V&3\f5\u001eDV&A>\\9";
        objectArray[88] = "_H\u0014/\u000f\u0001^V\u000642\rIH\u001e:Y\u001a.\\K/Q\u0014OMC9Hf\u0013\u0017\u001afM\r\u0016^\u0007n2";
        objectArray[89] = "'\u0018j~2{h\u0010)bJou\u0004ax;e\u0014x(_;E%\u0013Ma3Ub\u0018ue/uitXz#s`b~d\r{\u001da(gtZ\u0010BmU\u000bm4c(CpZiWN5.f7yh=(4;W|?\u0016h#A(A\u001agfWNW\u000eG\u0014Aa|14?c+UzUhf#\u00056e'St5uq0\u0018\u0013x1v(\u0015(4z25(";
        objectArray[90] = "5 n!hT24.[sX:,V0dU/6\u001f;}V3,`40\u0003;J}1~B0&z%>8";
        objectArray[91] = "* >)\u00007`-v|~hw8jx\u0002z}.\u000f*Ev/|>|\u0006y+B5sO>ns\u007f~\u0007k\u0010";
        objectArray[92] = "G.m\n\fH\u0016hjA4Z\u0016n\t\r_\b\u0017`sN\u0005\u000f\u0012\u00124\nT\u0004\u0004y1CI\f{";
        objectArray[93] = "\u001f\"C/A\u007f\b}Why'\u001e\u0007I2\u001f\u000f\u001f?[$y$\u0019\u007fN5\u001cz\u001d/NU";
        objectArray[94] = "\u0015{{6e/J-(7\t&R;}leO\u0010!!2w~Z,ig\tp\u0012(,fi/D{-\n";
        objectArray[95] = "|\u0002U\u000f\u0001rsXI\u0005}jkzP\u001b\u0001\u0016|\u000fI\u0003\u000fwm\u0007_\u001a}";
        objectArray[96] = "\u0017S}E`\r\u0011P \u001f\u0011\u0013\u0014rEe\u0011\n\u0013A/U|^JQz$";
        objectArray[97] = "#=\u0018Q\u000ba?dDGlocr\u001cOSvwagy\u0002S/>\u007fZ-x(c\u001ei\u0016c%fex\u0016u#a\u001cl\"pp\u0013@n\u0013z5gbY\u001dg\u007f!ZT3`\f,c\u000e3F\n<Ni\u001cj\u001d\u0004iZ\u00175)8^m\u000fW\u0001!_J\u0003Q\u0015%XM\nzs7\u0018J\u0011V\u001ee{7P6+e\u001fJ\u0001p,.'\u000b\u00077#,]H]0&^MF\u001e;,8JR\u00110O";
        objectArray[98] = "mO(m6?!\u0013+2\nyyYl:Q}jBq8\n;r\u0012/);q\u007fZzWpfaY/ng9u\u001e\u0017";
        objectArray[99] = "L`sh^Q\u00136 i2M\u0014\u0003d.SW\u001cX\"6\u0003\t\rih;K\\s";
        objectArray[100] = "\u0016=q_(XIk\"^DQQ}w\u0005(8\u0018fs\u0013/\u0005Fz#_D\u0007\u0011n&\u000f$XG='c";
        objectArray[101] = ")[OW8O\u007f\u0018AK[\u0012-\u001cMA7 |[\u0011\u0019`wp\u001cC]'\u0019&\u001cDD[";
        objectArray[102] = "o%1K\u001b\u0012>c6\u0000#\u0014/c8\u0019Fo\"};\b\u001e\b#c)\u0013#";
        objectArray[103] = "E\u0010ghX,\u0012Gbh2\u001d\u001bP>e\n1h@O)xrmF|hT~IJDZt*PoN.H\u0004S]kPU\u001dj\u0019k-Q|@|5.\u000f\u0007QNrTv/\u0015Jcvk\u0011JAQV\u0003$kJI(@:\u001aJEo`\u0000lMDwc\bvs7sV\u0004x\\BfH{H\u001a\\\u0014]?MOn%[>[\u001c\u000e(Y~FStk\u0003yC!";
        objectArray[104] = "y`g\u0014\u0018\"s\u007fa\rrw<=?\u001d0@h c\u001f4^L)B\u0011#~s)K\u0014\u0017My.`O Cptg9/mbcY\u0003\u001dLaPs60s^/b\u0015\u0002ij\\|\u001f\u001fysIX\u0003\"ooH]\u001c\u000fMvhM\u000f\u000eXouF1.WR+Y\r7\u007f\u007f.s\r=Hu.XsNy-}s\t\r#*x\u0001\u0019\u0012ttrb\t\u000enn\u0011";
        objectArray[105] = "\u0012R\u0006?F:\u0004Y]47i\u000eZ\u001c&Z\u0003\u0011]\rmFnE\u0004\u001d87i\u0005OR>Qn\u0011@Y]";
        objectArray[106] = "fgp=IWadz!tIt&\u0014e\u0016\u0018%#%/\u001bPp]v#NU}8('\u001eU\u001d";
        objectArray[107] = "<\u000fIU}',\fI\u0003\u0001\"-\u000e\u001f\u0015Z&>\u0004\u001a5{3<\u0002y\u0003p(f\f\u001f\u0004d'mo";
        objectArray[108] = "T>t\u0016u{X~s\u0002\u0018yTs[\ncmP`sg\"t\b7`Vhy@b\u001e";
        Object[] objectArray2 = objectArray;
        objectArray[109] = "{\u0003Uz@^m\b\u000eq1\bp\u0010|uJ\u0004a\u000bH\u0018W\bx\u000eA!A\u0003#\u00050";
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5F1D;
        if (f[n2] == null) {
            m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }

    public static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x7DC9) & Short.MAX_VALUE;
        if (j[n2] == null) {
            m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.j[n2] = i[n2] ^ l;
        }
        return j[n2];
    }

    public static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void exec(LiteralArgumentBuilder literalArgumentBuilder) {
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("name", new m$$1jOWsTPtmbJw41RuZ4W3HsnOh1UrckOKRyWBrJ2dTlnNzMWmXIoAwZsov6KCypcHhvjIkeyolQqDs34vtSdJ8oD9yR8jOJlp0()).executes(commandContext -> {
            block6: {
                try {
                    try {
                        try {
                            if (this.m$$L4eZLVx4AdETYEDABW59MkLtO8njojfpktnnNjE15Tg4MgX0sCgU4aeBbTluUcy2DGHzd1eJdWVpZnSflIqib7iiTIDDwuAsU == null || this.m$$L4eZLVx4AdETYEDABW59MkLtO8njojfpktnnNjE15Tg4MgX0sCgU4aeBbTluUcy2DGHzd1eJdWVpZnSflIqib7iiTIDDwuAsU.isDone()) break block6;
                        } catch (RuntimeException runtimeException) {
                            throw m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.a(runtimeException);
                        }
                        if (this.m$$L4eZLVx4AdETYEDABW59MkLtO8njojfpktnnNjE15Tg4MgX0sCgU4aeBbTluUcy2DGHzd1eJdWVpZnSflIqib7iiTIDDwuAsU.isCompletedExceptionally()) break block6;
                    } catch (RuntimeException runtimeException) {
                        throw m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.a(runtimeException);
                    }
                    return 1;
                } catch (RuntimeException runtimeException) {
                    throw m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.a(runtimeException);
                }
            }
            String string = (String)commandContext.getArgument("name", String.class);
            this.m$$L4eZLVx4AdETYEDABW59MkLtO8njojfpktnnNjE15Tg4MgX0sCgU4aeBbTluUcy2DGHzd1eJdWVpZnSflIqib7iiTIDDwuAsU = this.m$$0BYw3945tOifcplzDM5cgasrDnUyzZUR49yXdakYUr1Tz7rHz983u2lbZGdfvwYVfi5vvx6I4TAVnYd6whWPUkuMYPyF5aVGQ(string, -1598078363);
            this.m$$L4eZLVx4AdETYEDABW59MkLtO8njojfpktnnNjE15Tg4MgX0sCgU4aeBbTluUcy2DGHzd1eJdWVpZnSflIqib7iiTIDDwuAsU.thenAccept(list -> m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$0vQbZqUtpzH4dC5ha5T4zYvR5f7CLwBqCGSXbL0fuZzrL6FO0FFeXmuzn3U6ToSea1JUghd7nBKayU5jJa31OblbR72M0JvlZ.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(() -> this.m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T((List)list, 714417407), 0));
            this.m$$L4eZLVx4AdETYEDABW59MkLtO8njojfpktnnNjE15Tg4MgX0sCgU4aeBbTluUcy2DGHzd1eJdWVpZnSflIqib7iiTIDDwuAsU.exceptionally(throwable -> {
                m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$0vQbZqUtpzH4dC5ha5T4zYvR5f7CLwBqCGSXbL0fuZzrL6FO0FFeXmuzn3U6ToSea1JUghd7nBKayU5jJa31OblbR72M0JvlZ.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(() -> this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Throwable)throwable), 0);
                return null;
            });
            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.b((int)24035, (int)10760)).method_10852((class_2561)this.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(string, -1125606836)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-3));
            return 1;
        }));
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("open").then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("name", new m$$1jOWsTPtmbJw41RuZ4W3HsnOh1UrckOKRyWBrJ2dTlnNzMWmXIoAwZsov6KCypcHhvjIkeyolQqDs34vtSdJ8oD9yR8jOJlp0()).executes(commandContext -> {
            try {
                Desktop.getDesktop().browse(new URL(new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)((String)commandContext.getArgument("name", String.class))).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("https://namemc.com/profile/\u0001")).toURI());
            } catch (Throwable throwable) {
                // empty catch block
            }
            return 1;
        })));
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Throwable throwable) {
        m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)throwable.getCause().getMessage()), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-3), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$k1LAUjGNBZC1k3oLW1qJRTG6syW3ZlxEir5j5DXnrkWoseyEnu41QyoRtX59OR0rxI7Ro0GwjmKgsGQ9xtvvl1isGfvKVqZEc);
    }

    public void m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T(List list, int n) {
        try {
            if (list == null) {
                return;
            }
        } catch (Exception exception) {
            throw m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.a(exception);
        }
        try {
            class_5250 class_52502 = class_2561.method_43473();
            class_52502.method_10852((class_2561)this.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(((m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8)list.getLast()).m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB(), (-1125541815 + (n & 3) ^ 0x200) - (n & 0x10000) ^ 0));
            class_52502.method_27693("'s Name History: \n");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < list.size(); ++i) {
                m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82 = (m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8)list.get(i);
                try {
                    Object[] objectArray = new Object[(-1144367100 + (~n & \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) ^ n >>> 3) - 983617432];
                    objectArray[0] = i + 1;
                    objectArray[1] = zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82.m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB();
                    objectArray[((((0x5360B54A ^ m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) >>> 7 | (0x5360B54A ^ m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) << 25) ^ n) >>> 3 | (((0x5360B54A ^ m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) >>> 7 | (0x5360B54A ^ m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) << 25) ^ n) << 29) ^ m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01] = zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82.m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP();
                    stringBuilder.append("%d. %s (%s)".formatted(objectArray));
                    if (i == list.size() - 1) continue;
                    stringBuilder.append((char)(Integer.reverseBytes(((-1722660028 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) >>> 6 | -1722660028 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) << 26) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) - n) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01));
                    continue;
                } catch (Exception exception) {
                    throw m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.a(exception);
                }
            }
            class_52502.method_27693(stringBuilder.toString());
            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_52502, m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q((((0x3368625B ^ n + 31) + 15 >>> 15 | (0x3368625B ^ n + 31) + 15 << 17) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) - 31));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public List m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq(String string) {
        JsonElement jsonElement2 = JsonParser.parseString((String)string);
        try {
            if (!jsonElement2.isJsonArray()) {
                return null;
            }
        } catch (RuntimeException runtimeException) {
            throw m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.a(runtimeException);
        }
        return jsonElement2.getAsJsonArray().asList().stream().map(jsonElement -> (m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8)m$$VqDc0eTAgzOPC4IU6WwZsiqEa0qk7QNmclpi6XPMtzLLBOqLUU9iWXMcrWVjw6jLdGlqrsVBwx7XuPXLTWk6HGDHuk8aGSTUx.fromJson(jsonElement, m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.class)).collect(Collectors.toList());
    }

    public CompletableFuture m$$0BYw3945tOifcplzDM5cgasrDnUyzZUR49yXdakYUr1Tz7rHz983u2lbZGdfvwYVfi5vvx6I4TAVnYd6whWPUkuMYPyF5aVGQ(String string, int n) {
        return CompletableFuture.supplyAsync(() -> {
            JsonElement jsonElement;
            block4: {
                String string2 = (String)m$$CuxPDbeLNAusVP7lqYtDMb84xFpfVpDCqKX0mYwKMg4JWoQwSF3fWsPlLY5qC1a61Q0bLiZTxRe5vHWbKsnSLINXdBbSPlgad.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$CuxPDbeLNAusVP7lqYtDMb84xFpfVpDCqKX0mYwKMg4JWoQwSF3fWsPlLY5qC1a61Q0bLiZTxRe5vHWbKsnSLINXdBbSPlgad.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ(new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("https://api.minecraftservices.com/minecraft/profile/lookup/name/\u0001"), -1486180170).build()).body();
                jsonElement = JsonParser.parseString((String)string2);
                try {
                    try {
                        if (jsonElement.isJsonObject() && jsonElement.getAsJsonObject().has("id")) break block4;
                    } catch (RuntimeException runtimeException) {
                        throw m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.a(runtimeException);
                    }
                    throw new RuntimeException("Player not found");
                } catch (RuntimeException runtimeException) {
                    throw m$$LGBYaGHaAKYjE3Vno0amBOnl2gWv8drq4xowexCaJQJxFc9Ib5UzRIOAFFR3ZC0RzEOxjpU14q9sS7zdJmn0kMfMISNPb9V4n.a(runtimeException);
                }
            }
            String string3 = jsonElement.getAsJsonObject().get("id").getAsString();
            return this.m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq((String)m$$CuxPDbeLNAusVP7lqYtDMb84xFpfVpDCqKX0mYwKMg4JWoQwSF3fWsPlLY5qC1a61Q0bLiZTxRe5vHWbKsnSLINXdBbSPlgad.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$CuxPDbeLNAusVP7lqYtDMb84xFpfVpDCqKX0mYwKMg4JWoQwSF3fWsPlLY5qC1a61Q0bLiZTxRe5vHWbKsnSLINXdBbSPlgad.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ("https://laby.net/api/user/%s/get-names".formatted(string3), -1486180170).build()).body());
        }, m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB);
    }

    public static String m$$HNywJ2RngRyq5IEDAk9S4ApjKl5oSeGp22UspXwvkBHjOYwxEHjja1mwWyodCLMw6t44F5C5bI5VPNWyUwnAk63y8m0dkmZwQ(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-17, -79, 127, -99, -76, -100, -67, 46, 113, 8, -39, 74, 94, 125, -94, 7, 40, 29, -85};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 19]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

