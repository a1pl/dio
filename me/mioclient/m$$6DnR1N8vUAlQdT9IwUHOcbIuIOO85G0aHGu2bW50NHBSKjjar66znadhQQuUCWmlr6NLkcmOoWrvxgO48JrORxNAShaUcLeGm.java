package me.mioclient;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ;
import net.minecraft.class_124;
import net.minecraft.class_2561;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm
extends m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ {
    public final DateTimeFormatter m$$IoqZd5c8lhRKRmrIyLwzACAybjxgQ4rXUTtQ5Nnp2QD5Pt5yIADlg4U3GwlDECBMYm0tqc6gnWGTAsZwQyTElk1mYEUMTL8FV = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss", Locale.ENGLISH);

    public m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm() {
        super("seen");
        this.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("lastseen");
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
                            m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.o = new Object[66];
                            m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.p = new String[66];
                            m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.f();
                            var17 = new String[16];
                            var15_1 = 0;
                            var14_2 =  /* dynamic constant */ (String)m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL("RkGphxypxoOQUV3UXiTd", MethodHandles.lookup(), "m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL", m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.class, 1240221472);
                            var16_3 = var14_2.length();
                            var13_4 = 4;
                            var12_5 = -1;
lbl10:
                            // 2 sources

                            while (true) {
                                v0 = 85;
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
                                var14_2 =  /* dynamic constant */ (String)m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL("Vy6KlGCQLVrMA2GWidun", MethodHandles.lookup(), "m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL", m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.class, 1626868779);
                                var16_3 = var14_2.length();
                                var13_4 = 19;
                                var12_5 = -1;
lbl25:
                                // 2 sources

                                while (true) {
                                    v0 = 6;
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
                                        v15 = 75;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 124;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 31;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 126;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 105;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 24;
                                        break;
                                    }
                                    default: {
                                        v15 = 35;
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
                    m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.e = var17;
                    m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.f = new String[16];
                    var4_7 = 1617745202758725669L;
                    var10_8 = new long[12];
                    var7_9 = 0;
                    var8_10 =  /* dynamic constant */ (String)m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL("2uxcJesuco8AlxxzSzIs", MethodHandles.lookup(), "m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL", m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.class, 913492033);
                    var9_11 = var8_10.length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL("gCPTr0qzNXyQ6Qf753Il", MethodHandles.lookup(), "m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL", m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.class, 999424846));
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
                        var8_10 =  /* dynamic constant */ (String)m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL("mv9kbRQ08NiHnrmcXHXt", MethodHandles.lookup(), "m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL", m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.class, 1233015704);
                        var9_11 = var8_10.length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL("kvYnPVSBdenQ1GMqoXXW", MethodHandles.lookup(), "m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL", m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.class, 1195869786));
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
            m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.k = var10_8;
            m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.l = new Integer[12];
            m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 580961;
            break block31;
lbl145:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 4192173616309057970L;
        ** while (true)
        var0_15 = 1736946862291478719L ^ var2_14;
        m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_15);
    }

    public static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xBD6;
        if (m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.l[n2] == null) {
            m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.l[n2] = (int)(k[n2] ^ l);
        }
        return m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.l[n2];
    }

    public static void f() {
        Object[] objectArray = o;
        o[0] = "Y\fUl\u0016(P\u0002V%U%H\n_#\u001f._\u0011\u0016!\u0014)N\u0006@6U\u0004U\u000eU#\u0015#y\fV6\u001e?N";
        objectArray[1] = "\u001a\u0007@h\u000f\t\u0011\bQ'r\u0011\u0002\u000fXn";
        objectArray[2] = "f,U]c]m#D\u0012\u000e]m>P";
        objectArray[3] = "R\u0007Z{$CY\bK4EMR\u0003On";
        objectArray[4] = "rdsc`\nrdd?l\u0005h/d!l\u0010o^5x;R";
        objectArray[5] = "\u000b\"H2+J\u0005+\u000f:,QH*B{)k#\u0000\u0005-8\u0014\r\u000f\"\u0007\u0013B\u001fu\u0004n)R\r\u0012\u0015h-n\u0014+\u001f'!N\u0007\u0003\to,`\u000e0\u001c\u0016\u0005N\f\n<\u0018zp\u0003s-\rq\\'457$K\u0007\u0014Q\u0010zP\u0000w2j:m\u0014t6\r5I3\u0004\u001e*\b\u00125\u000f2\u000e\u0018`\b\u00067(\b";
        objectArray[6] = "\u0010d]4T\u0006\u000elG{\u0019\u001c\u0014f^'\b\u0016\u0014q\u0005\u0016\u0015\u001e\niN!\u001b\u0011\u0016`m \u000e\u0006\b`";
        objectArray[7] = "\u0016C&fTM\u0018JanSVUK,/t[\u0014tnjXeH_g}KA3ip@\n`JVQfRP\u0003ADx\tX\u0002V=CU`\u0001M`j\u000bHHE8ix@\thrSD\u0011LO^|\\\u0013\fW8BE\u001a\u0019GBe\\\u0013#EjRwiKA8j\bX<SKD\u000f\u0015=IqhJ";
        objectArray[8] = "_~3@\u000b]_~$\u001c\u0007RE5$\u0002\u0007GBDpZP\r";
        objectArray[9] = Void.TYPE;
        m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.p[9] = "java/lang/Void";
        objectArray[10] = "H7REA V?H\n\t L5PM\u0000;\f\u0014Mg\u0000;Q#IA\u001d";
        objectArray[11] = "\"\u001agh\u0018\u001e!\u0016t'r\u001f:\u001ae`Y\u0004";
        objectArray[12] = "\u0015:@g\u001ar\u00166S(@c\u0012+YtUjQ\u000fSkDi\r:Z";
        objectArray[13] = "[pkfxfWxj-1nKphfUzWqC$zd]qr";
        objectArray[14] = Boolean.TYPE;
        m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.p[14] = "java/lang/Boolean";
        objectArray[15] = "02\u0006U=m3>\u0015\u001a\\\u007f< \u0015@Wx.6$]~|";
        objectArray[16] = "#\u0006Kb\u0011_ \nX-eD'\u0002tg";
        objectArray[17] = "&?o\u0016{\u001b-0~Y\u0010\u000f/;i\u0003<\u0018\"";
        objectArray[18] = "P[\bp=\u0005SW\u001b?u\u001eHW\u001fe=5[N\u001bEz\u001c_|\u0011c~\u0010NN\u001bc";
        objectArray[19] = "\u0003o6\u0017U7\u0000c%X\u000f&\u0004~/\u0004\u001a/GZ%\u001b\u000b,\u001bo,7\u0018 \f}3\u0019\t";
        objectArray[20] = "~!\u0019&24u.\biO,f)\u0001 ^-},\u000b\"n";
        objectArray[21] = Long.TYPE;
        m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.p[21] = "java/lang/Long";
        objectArray[22] = ",\u0011+) + \u0019*bi#<\u0011()\r7 \u0010\te-!,\n";
        objectArray[23] = "h\u0005s-\u000f6f\f4%\b-+\ryd/ j2;!\u0003\u001e6\u001926\u0010:M/%\u000bQ\u001b4\u0010\u0004-\t+}\u0007\u00113R#|\u0010h\b\u000e\u001b\u007f\u000b5!P36\u0003m\"#;w.'\u0018\u001fj2\t\u000b7\u0007hr\u0011m\t\u001eag\u0001\u0017.\u0007h]\u0003?\u0019,\u00125\u0007m!S#B\u0015\u001e\u000fTnC\u000f$#\u0011}hDy:\u0013 b%\u0005s4 B\u0014n\u0016\n(RSe.\u000e4rX\t\u0003\u00118tQ\u001f%\u000f\u0016|,\u001cs\fo]!?6>\u0010j\u0005\u001es(k]X*\u0015^5a\u0006\u00043V33\n*'T\ro\u0012<s*\u0001`W*\u0015<\u0015@%<:\u0017*3\u000e\u001ep>aRY\u001bx";
        objectArray[24] = "n\fs\u0004\tZe\u0003bKd^e\u001fV\u0000VCa\u0003f\u0000";
        objectArray[25] = Integer.TYPE;
        m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.p[25] = "java/lang/Integer";
        objectArray[26] = "\u0018/Qm=/\u0013 @\"G+\u0000!Pmq/\u0017";
        objectArray[27] = "a-O#[\u001fh#Lj\u0018\u0012p+ElR\u0019g0\flD\u0017w/GcB\u0003,\u0011V\u007f_\u001ee\u0003PjC\u001dg,VYO\u0000g";
        objectArray[28] = "'gt`_^)n3hXEdo~)y\b\u001cf=ze\b=Z\u0011]\u0005\\$I\u0000<}U\u0010W\fw\u000fg=hiARS\u001cv1^RX8m\u0014N\u0000\u0003\u0012ln@`\t0D\u000falW)W2^`]\bO\"Uf\t\rg-n\u0003k!;\u001fN_X#O9ZcD\u001dj)ad\b-z\u0014[f";
        objectArray[29] = "ym/\u0013N4pc,Z\r9hk%\\G2\u007fpl\\Q<oo'SW(4C0ZV6\u007fl6iZ+\u007f";
        objectArray[30] = "\u0015d\u0003A.D\u001cj\u0000\bmI\u0004b\t\u000e'B\u0013y@\r6B\u001ao\u000b\u001dmy\u0013z\u001b\u00061N\u0012J\u001c\b6F\u0013e\u001a-6B\u001ao\u000b\u001d";
        objectArray[31] = "``\\~x\u0013in_7;\u001eqfV1q\u0015f}\u001f2`\u0015okT\";0j{T\"t\u0010B}V%x\u0019m{s%|\u0010gjC";
        objectArray[32] = "\u0007W\u0007sA3\u000eY\u0004:\u0002>\u0016Q\r<H5\u0001JD?Y5\b\\\u000f/\u0002\u001d\u0016_\u001f0I2\u0010z\u001f4@8\u0001J";
        objectArray[33] = "s\u0002\u007f\u001e_\tz\f|W\u001c\u0004b\u0004uQV\u000fu\u001f<s]\u000b}\f|T";
        objectArray[34] = "U>\fF!}K6\u0016\tCg\\>\u0016B";
        objectArray[35] = "B\u001bk\u0007IS7;`\bX\u001cJ#s\u000fQU\"";
        objectArray[36] = ";uB\u0013`'5|\u0005\u001bg<x}HZh\u0019\u0003b\u00026n\u0019b@Y\u0013\\&>x5\u0019~:\u0013b)$@>\u001e)(2`\u001ffB\u001e+`{ [Z\u0004o\u001eeZ<LK-bC\\$A\u000e9G_;b\u0004\u0003Y\b\u0019H\t\u0004e\u001cH^ ?^\u001d\r[\u00077\"\u000e\nd\u001c3(\u0014\u000f=9>$\u001d6d";
        objectArray[37] = "bkgl\u000fO$:{(lZ21z\u007f+J[ogbR]j'am\u0011$bkgl\u000fO$:{(l";
        objectArray[38] = "~#\u001d?G)-(\u001e%*\"4\u0003\u0000\"L\u00052%\u001fE\u001b=\"#\u0010xP<,0{";
        objectArray[39] = "Em';E\u000eCc\"}4\u000fKp\u001d(\nVC6g)O\f\u001d\u000ft \u000e\u0010]hr.\u000bV,";
        objectArray[40] = "\u0002O`*Yu\u000f\u0017a'e \u0004\b\u001d!\u001e4\u0000\u001b5L\\q\t\n;'\u001a \u0015NX";
        objectArray[41] = "!m1\u007fC4$m;exd**5h\u0004\n!,>|\u0015c0+5jx3s0.b\u0013u\",j\u0001";
        objectArray[42] = "\u001a\u007f0T=\u0003\u0003g|PZ\u000bT*\u001c\u000fe4\u0002<&Y84\u0013c\u001c~d7\u0018^3g!\n(@\u0006y'\u0000\u0007z\u0004V\u0015,76\u001de1\u000e9H\u0013^\u0005\u001e\u001c=!r:)BW\u0013M!'\u0003@\bi\u001b\u0007\"M(Q%?'{ q\u000b\u0001'j\u007fJ\u0017\u0013G8\u0007['.\u001fD\rH\u0011\nBF\"7=\u000b\u0011i&K3\u0004A;A\t!\u001c\u00056/\u000fe\u0011B\u0006";
        objectArray[43] = "B<\u000eCdV@)QV^_Y.ZA/k_9VK10B<\u000eCdV@)QV^";
        objectArray[44] = " sdv\u0017\u00049k(rp\u00008ehp\u001d\u000f>\n,+\u0010\u0017!ajz\fSBil)\f\u0014+v|%\u001di&:\u007f-\u0013\u0007):dxp";
        objectArray[45] = "kWO\u0007jYiR[E\u000f\u00187SMvh\u0002/ZFAbghQM\u0004m\u000e6ADG\u000f[>Z\u0011X1Y;NS=";
        objectArray[46] = "p\u000b*ojpv\u0005/)\u001bop\u0013k{\u001bw$\u0007kt*)s\b(\u0016ru#\u0010aqt{&V\u0010";
        objectArray[47] = "Nz[o\u0005\u0006\u001bo_au\u0006JiE^\u0010\u0003O|O#\r\u0007T5#;\f\u001fRh^&\b\u0004\u001b\u0004";
        objectArray[48] = "gly950gj{d\n0v,Ejn\r;@$zW\u00051y}a0\r\u001aZ\"={\u000b`@c_Gl\u001b<,x58(n`OQ\u0015*m$iP\u0013\u0017L[zw)79!cUncI-}A.\u0007{ Xd-\u0004RLHW\u00040k`vdej@rmh\u000f\u0017pdXil\"Ks\u000405*>d5x3%}\u001d9t5=k\"|t%a\u0000";
        objectArray[49] = "*C\u0007^\\H%C\u001c\u000b?K>\u001e\u0006\u001bCK5s\u000b]T\u001a~\u0010\u0016\rT\u0018N\u0016\u0014\u0003GJ3\u000b\u0010\u0018\u000e&";
        objectArray[50] = "y^2NY$zOuE7*+S5AZ&F\u001f-M\nq\"VzUO@vH+\u0011\u0006$?\u001f3T7\u007f7W(BS|&\u0010#,";
        objectArray[51] = "<S|(u\u0007?X}Wy\u000e$z?8k\u00065U9W/]8M&<i\f$\tEnx\u0018gCtmz\u0000'3\u007f7f]!\u000271i\u001eX";
        objectArray[52] = "_|\b\u001b\u001e\u0000Z|\u0002\u0001%Y]\u0019\u0000\u0019YSI'i\\\u001b^M\"\u0002\u001aJB\tA\u000eXICX-\f\u0001\u0014\u000f3-T\u0004[\u0005\r(T\u000eA>";
        objectArray[53] = "acLqI\u001fwvInvIue\\g\u001a 4#Q\u007f\u0015KrrM;vLs`A>IZfe^\u0001";
        objectArray[54] = "\u0016%8}x$\u00154\u007fv\u0016<N\u000f-tq&E/@q,-@0p&zz[T";
        objectArray[55] = ".b\u001c>9~}i\u001f$T{r|3?\u000fhea\u001c+T-!`\u0004'?kp|@D";
        objectArray[56] = "B\u0016\u0002?mg\u0000\fGy\u0010>\u0014\u0001\u001c&|\fBEE\u007f+[@C\u001c?s0\u0006\u0012\u0000{\u0010`\u0012\u0003\u0002<,\"\bFDA";
        objectArray[57] = "3(f,fV%=c3Y\u00158\rg&8\u000f0V\"b9\u0017<=d3%S_";
        objectArray[58] = "\"J\u0003\u0001*wwL\u000eA\u0016e!Lh\u0005(j2S\u0003Cyvv0Y^pp!Z\nUsjL";
        objectArray[59] = "7H\u001b|q.0\u0010\u0004t\u0003\u0017~\u0004Ud;;\r\u0014$(Ix\b\u0012\u0017iet,\u001e/[E 5;%/y\u000e6\t\u0000Qd\u0017\u000fM\u0000,`v%(^/>\r4\u001a\u0019UG%p\u001e\bwZ\u001b/\u0015:W2.\u000e\u001e\")q0\u007f\u001e.nQ\n\t\u0019/vR\u0002\u0013'\\rg\u000e\u001d\b)gyq-N7\u0015ms\"\u001c\u0001%:%u\u0007eu~5-\u0016\bv\u007f3$u";
        objectArray[60] = "\\1L\u0005?\"\u0003 RV_-KahZ\u0001$\b2tZ \u0018$\u0015\u0014\u000e9\u000b5tl\u0007\r\u00159?\u001e5 *\\\tC\u0001\u00014\u0004\u0016C\n%/!\u0006\u0011Q\u000f.[\bq[-\u0006:)}\u00054\u0015\u0007\u0016q\u000f\u0015\r\u0017\u001dw[\u0010%\u0018&\u00129<y*\u0006N\n>\r\f\u0012r\u0016\u0000(\u001c)uZ08!\u0013wkfv\u00073L\u0000 '\u001bw/Ra(\u0019.D\u001404]M\u0013\u0002;r\u0002s\u0011\u0007/0g";
        objectArray[61] = "B\u007f]\\V\u0011By_\u0001i\u0011S?K\u001c\u0018\u001b2C\u0002;\u0018;\u0003(g\u0005\u0010+D#_\u0001\f\u000bOOr\u001e\u0000\rFYT\u0000.\u0005;Z\u0002\u0003W$6yG1(\u0013\u0012X\u0002'S$OldQ\r\u0018\u0011BBY\u000bJ\u001dlV[5\u0016\u0005z\u0002%9\u0019@ld3-92zK\u0018\u0012J\u0019X\u00011Y+N]\taR\u001f\u0001mD]\u0010\u0005D+9\\\u0017\u0014\u0018x\u0006\u0019\u0017\u0004D\u0013\u0007\u001a\u001b\tO}\u0001^\u0016N\u007f";
        objectArray[62] = "-\b\u0006\b&,-\u000e\u0004U\u0019,<H\u0010Hh&]4Yoh\u0006l_<Q`\u0016+T\u0004U|6 8)Jp0).\u000fT^8T-YW'\u0019Y\u000e\u001ceX.}/Ys#\u0019 \u001b?\u0005}%~5\u0019\r{wr\u001b\r\u000fE+j\rYqI$/\u001b?g]\u0004]\r\u0010Lbwv/Ze)\u0016!*R5\"\"n\u001a\u001f\t`8+\\b\bg)w\u000f]Mg9+d\r\n(qq\u000f\bNu'\u0010Z\u0019Gdy~\\]J#I";
        objectArray[63] = "E-\u001d\u0018NH\u0010+\u0010XrUB,v\u001cLUU4\u001dZ\u001dI\u0011WG[\u001fW@j\fZ\u0011D+";
        objectArray[64] = "_\u001di89\r\u0000\fwkY\u0002HMk79\u0015\u0006>q1b(\u0000!p8\b\u001b*%O2=\u001d6\u001fD\u001d\u001a,\u0016\u0002k&h)\u000e;ki`6\u0006\u0001J\u000e$\fU(Q\u000eh\u0017:P;08>\u0000\u001f{\u0004\u001e?);Wf6\u0015\u0001'p\u0014\u001a;\u001b9H\u0012\u0000Z\u0002=qm\u001b\u00014\u001cZ\u001f\u001e<6/kV9\u001a\u0018\u0003i;:\u001b\u001e\n\n6$\u001b\u0006\u0002g5%\u001d\u000fa3h9\u0019\u0007\nu9%]d";
        Object[] objectArray2 = objectArray;
        objectArray[65] = "j\u0019%\u0018uWp\u001e?FMYf\u0003\u001fN6Mb\u00107#t\bk\u00019H2YwEZ";
    }

    public static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void exec(LiteralArgumentBuilder literalArgumentBuilder) {
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("name", (ArgumentType)StringArgumentType.greedyString()).executes(commandContext -> {
            String string = (String)commandContext.getArgument("name", String.class);
            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2561.method_30163((String)"Fetching data..."), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf(this));
            this.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP("seen", string).whenComplete((jsonObject, throwable) -> {
                String string2 = null;
                if (throwable != null) {
                    string2 = throwable.getMessage();
                } else {
                    try {
                        if (jsonObject.has("lastSeen")) {
                            StringBuilder stringBuilder;
                            block14: {
                                Duration duration;
                                OffsetDateTime offsetDateTime;
                                block13: {
                                    try {
                                        if (jsonObject.get("lastSeen").isJsonNull()) {
                                            throw new RuntimeException("No data for player.");
                                        }
                                    } catch (Exception exception) {
                                        throw m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.a(exception);
                                    }
                                    String string3 = jsonObject.get("lastSeen").getAsString();
                                    offsetDateTime = OffsetDateTime.parse(string3);
                                    OffsetDateTime offsetDateTime2 = OffsetDateTime.now(ZoneOffset.UTC);
                                    duration = Duration.between(offsetDateTime, offsetDateTime2);
                                    stringBuilder = new StringBuilder(string);
                                    int n = (int)duration.toSeconds();
                                    try {
                                        if (n != 0) break block13;
                                        stringBuilder.append(" is online right now.");
                                        break block14;
                                    } catch (Exception exception) {
                                        throw m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.a(exception);
                                    }
                                }
                                stringBuilder.append(" was seen ");
                                stringBuilder.append(m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ.m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi((int)((int)duration.toSeconds()), (int)-787160799));
                                stringBuilder.append(" ago (");
                                stringBuilder.append(this.m$$IoqZd5c8lhRKRmrIyLwzACAybjxgQ4rXUTtQ5Nnp2QD5Pt5yIADlg4U3GwlDECBMYm0tqc6gnWGTAsZwQyTElk1mYEUMTL8FV.format(offsetDateTime));
                                stringBuilder.append(").");
                            }
                            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2561.method_30163((String)stringBuilder.toString()), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf(this));
                            return;
                        }
                        string2 = "Response data doesn't have a required field: lastSeen.";
                    } catch (Exception exception) {
                        string2 = exception.getMessage();
                    }
                }
                try {
                    if (string2 != null) {
                        m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2561.method_30163((String)new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string2).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)String.valueOf(class_124.field_1061)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\u0001\u0001")), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf(this), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$xl5oci6Q66riRzaB2EDPl9sjMwxQ8s0lVDeGE5lsadU5l0PkCAypJJ8X8UqeXmm6OstQzM7XZJtALatPLsQBgSKQHuXgVCfWU);
                    }
                } catch (Exception exception) {
                    throw m$$6DnR1N8vUAlQdT9IwUHOcbIuIOO85G0aHGu2bW50NHBSKjjar66znadhQQuUCWmlr6NLkcmOoWrvxgO48JrORxNAShaUcLeGm.a(exception);
                }
            });
            return 1;
        }));
    }

    public static String m$$nE6otV3FEi1mkamv0vpqQTBtxPkHo4u46xXTCCjqFzlMrdKhbXaB0kBwiMaHkbPcR7V5csrnA25Sub8B8k42APr6b77htdlZL(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{12, 83, 125, 78, 25, 24, 102, -21, 72, -125, -52, 83, 34, -20, 106, 6, -40, -19, -123};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 19]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

