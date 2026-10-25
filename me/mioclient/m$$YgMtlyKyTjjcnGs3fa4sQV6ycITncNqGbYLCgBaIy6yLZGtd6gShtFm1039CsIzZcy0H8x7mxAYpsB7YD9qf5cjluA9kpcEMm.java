package me.mioclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import me.mioclient.m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa;
import me.mioclient.m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$fpGL7c3hh9Wq0GjZGbUWsMGOqxjqgcrE05H4OUl0FpiGYoHnjcDrxjKurfxMvIVKaJ4GAuaRgVOLd2AOlBDxzNHQjDNpEjvwE;
import me.mioclient.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm;
import net.minecraft.class_151;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm
extends m$$fpGL7c3hh9Wq0GjZGbUWsMGOqxjqgcrE05H4OUl0FpiGYoHnjcDrxjKurfxMvIVKaJ4GAuaRgVOLd2AOlBDxzNHQjDNpEjvwE
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public static final String m$$tjDoDKGBRFtDb6HpKAsk6y6ZvyUIojlGSaqyAMrgAI2ivBFqg5cuJq0knuPIkBkU90YbV4AjOOM0WxeUYJY7grkb6fqYaaANs;
    public final m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm m$$E5bIDs51FSsbWcGBlQHLlcX3dSKTj5imC7BoQortI51DOud4Qmodv5bWXznszHsvDOHJtlFr03LjniP2gwDFwr1hd35eDWkHq;
    public final Path m$$g1Rd442dAyKIjK6CHoSgBSdOgs2XoKiMV2ENyZYMuhUn9booZpzgFvg2oGQYSMHDU722qaG5SeWo570cEk9QL1m5t0BjYzme7;

    public m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm(m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm) {
        this.m$$g1Rd442dAyKIjK6CHoSgBSdOgs2XoKiMV2ENyZYMuhUn9booZpzgFvg2oGQYSMHDU722qaG5SeWo570cEk9QL1m5t0BjYzme7 = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm.m$$PJQdW37m52fpjzycMUJyg804GAFRYIRRKOHlHyOl1Y7deLpst8QlnKyuG96krCnZwFxCC09wYupTK5RgNmgt7mOe2QTTu4fPv();
        this.m$$E5bIDs51FSsbWcGBlQHLlcX3dSKTj5imC7BoQortI51DOud4Qmodv5bWXznszHsvDOHJtlFr03LjniP2gwDFwr1hd35eDWkHq = m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm;
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
                                m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.o = new Object[71];
                                m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.p = new String[71];
                                m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.d();
                                var21 = new String[4];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1("vqDgQadk6c6K76hixw3r", MethodHandles.lookup(), "m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1", m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.class, 418736314);
                                var20_3 = var18_2.length();
                                var17_4 = 6;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 35;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1("FBPX0u7l7o3r3DNrXkZn", MethodHandles.lookup(), "m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1", m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.class, 447231590);
                                    var20_3 = var18_2.length();
                                    var17_4 = 5;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 64;
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
                                            v15 = 88;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 53;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 67;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 22;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 123;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 4;
                                            break;
                                        }
                                        default: {
                                            v15 = 49;
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
                        m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.c = var21;
                        m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.d = new String[4];
                        var8_7 = 924154471587061396L;
                        var14_8 = new long[23];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1("P3h1P8QeGqSwdWhTGK0n", MethodHandles.lookup(), "m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1", m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.class, 1872942227);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1("eBQHfh5PGz0fhZPhmiXF", MethodHandles.lookup(), "m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1", m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.class, 914359885));
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
                            var12_10 =  /* dynamic constant */ (String)m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1("hLxZy2MnJBnrum0Zsf5Y", MethodHandles.lookup(), "m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1", m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.class, 1178302160);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1("o3okBM73WX1dzdTJO2rg", MethodHandles.lookup(), "m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1", m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.class, 1387344050));
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
                m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.g = var14_8;
                m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.h = new Integer[23];
                m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -856380;
                var0_14 = 8068115724074014129L;
                var6_15 = new long[4];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1("TazloWDNBiTAEDrAcnqU", MethodHandles.lookup(), "m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1", m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.class, 1080110565);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1("7cVtUF5zS2R0gSEvz3F8", MethodHandles.lookup(), "m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1", m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.class, 1211758473));
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
                    var4_17 =  /* dynamic constant */ (String)m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1("wkr21OS6HduefhfBaL1B", MethodHandles.lookup(), "m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1", m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.class, 673652671);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1("U1iHFE1U1HwxrtJTXgCr", MethodHandles.lookup(), "m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1", m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.class, 1013433033));
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
        m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.i = var6_15;
        m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.j = new Long[4];
        m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)5801921649186114194L);
        m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.m$$tjDoDKGBRFtDb6HpKAsk6y6ZvyUIojlGSaqyAMrgAI2ivBFqg5cuJq0knuPIkBkU90YbV4AjOOM0WxeUYJY7grkb6fqYaaANs = ".json";
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x175E;
        if (h[n2] == null) {
            m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.h[n2] = (int)(g[n2] ^ l);
        }
        return h[n2];
    }

    public static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x49A) & Short.MAX_VALUE;
        if (j[n2] == null) {
            m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.j[n2] = i[n2] ^ l;
        }
        return j[n2];
    }

    public static void d() {
        Object[] objectArray = o;
        o[0] = "{\u0005@s9gx\u000b\u0018t~etJfsca";
        objectArray[1] = "\u0004\u0003i$C\r\u000f\fxk>\u0015\u001c\u000bq\"";
        objectArray[2] = "a\u0003o\u0005\u001bjo\n(\r\u001cq\"\u000beL#RAS$.BN4_\u00112$LX\u0005\"#\u00031NPw\u001e\"7C_\f\u0018\u0006T{\u0001)\\=P:T\u0013=\u00183USx\u001d16K!4_0Kz(\"9\u00026y^x;BLN\u0013q.8jv/-\u0005Fu}\u00015*&Sj'\n.\u001cQkS,\u00064";
        objectArray[3] = Void.TYPE;
        m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.p[3] = "java/lang/Void";
        objectArray[4] = "OJ\u001cGY\u000eQB\u0006\b>\u000f@Y\u000bR\u0018\t";
        objectArray[5] = Boolean.TYPE;
        m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.p[5] = "java/lang/Boolean";
        objectArray[6] = "$@4d)\b*Isl.\u0013gH>-r\u0004%svc\n5\ntPk*\u000e/\u0012ud$\u0004!RRe\u0002\u000b\u000b|PJu)+Qx>\u0004Tzf\u007f^6\u0000<c||\u00182\u001eWrq\u0010QyAP@\u0018=\u0013]`H%\u0011y\u0010V8q\u001f\u0006JYa\u000f6\u000f\u0012ud#%<v`Sy.&F\"f!";
        objectArray[7] = "\rh4@~K\u0003asHyPN`>\t.m(hrfpV\u000eJ)~ h#Z.Xda!fokM\u0012V`,@%\u0017\u0005:~wtA$DbdN\u0015\tl^|N]0<oydK65u\u0015vpYjT@P\u0016%OB\u001d#W\u0010=MH!k(Et{N\u001d\u0017I{\u001fpG\u0007zL]]";
        objectArray[8] = "DJKD\n\u0017ZBQ\u000bg\rBGXFP\u000bAE";
        objectArray[9] = "!sMyQ{*|\\60u!wXl";
        objectArray[10] = ")gc\u0018\u0014m7oyWvq0r";
        objectArray[11] = Integer.TYPE;
        m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.p[11] = "java/lang/Integer";
        objectArray[12] = "\u001b[\n::\u0016\u0017S\u000bqs\u001e\u000b[\t:\u0017\n\u0017Z(v7\u001c\u001b@";
        objectArray[13] = ".6\"{{j ?es|qm>(2d5\u000f&JeeC\b\u0002_|Jq\u000e\u0010Kb`D\u0015\u00024PG4.\u0000?a]b \u0012Ax@S\u0015ahu%p0\u0014K/cU\u001b\u0002{Cqb.\u0019<Ycw&)t\u007f*b\u0007\u0003hRCq\f5BU]n1\u001eIrBM\u00018JDF=\u00130gx\u007f";
        objectArray[14] = "\u0011=QrR\u0001\u001d5P9\u001b\t\u0001=Rr\u007f\u001d\u001d<y0P\u0003\u0017<H";
        objectArray[15] = "i\u001ap0WQlU@8\u0015]";
        objectArray[16] = "c\u0019\u0001z({h\u0016\u00105R\u007f{\u0017\u0000zd{l";
        objectArray[17] = "\tz0P\u000b.|_5\u001f;&>Sa";
        objectArray[18] = "=\u001e\u0011\u0017C\u00061\u0016\u0010\\\n\u000e-\u001e\u0012\u0017n\u001a1\u001f,XV\u001a;\u0003";
        objectArray[19] = Long.TYPE;
        m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.p[19] = "java/lang/Long";
        objectArray[20] = "\u0014[te\\d\nSn*=s\u0014_ap\u0001";
        objectArray[21] = "6\u0019|mB)=\u0016m\"/-=\nYi\u001d09\u0016ii";
        objectArray[22] = "fJ\u0010b\u0005*mE\u0001-n>oN\u0016wB)b";
        objectArray[23] = "\u001dn G*N\u0013ggO-U^f*\u000es\u00138}}{,u\u0006g`S's&BY\u0019ue?m8c+O?mgN\u0017\u0011HSy[$e [Mpqv\u0004leO TG96}$U$f7\u0012\"PImDy\u0010u%\\@~\rp\u0018fbmvOFxIMry\u001b}W\u001f\b\u00154b\\e2";
        objectArray[24] = "q__>g2oWEq/2u]]6&)5n[:-.x_]:";
        objectArray[25] = ":\\\nSFG?\u00135}-V3X\fF\u0001A>";
        objectArray[26] = "\bJcF\u0018~\u0006C$N\u001feKBi\u000f(v([!R:h1E'H\u001fV\u0016\u001c+JEb4y{R\u0012X1A.e\u0000V\u0007v\u0001h\u0016S\u0004f4\u001d\b]?h9OGv6G9m\u001c U\u001cth\u0002X\u001fu.RAY]WzF\tP<_>iFH!\u0016<MDr\u000fC8jHz\u0015L\bf\u001c";
        objectArray[27] = "t\u0011%sTaj\u0019?<\u001cap\u0013'{\u0015z03<|\tas\u0015!";
        objectArray[28] = "*9I(\u001a\\&1HcST:9J(:@&8";
        objectArray[29] = "+g9n/\u0013 h(!H\u00115c(js";
        objectArray[30] = "&m( %C(do(\"Xee\"i-}\u001ezh\u0005+}\u007fX3 \u0019B#`_*;^\u000ezC\u0017\u0005Z\u00031B\u0001%{{Zt\u0018%\u001f=C07*zxBV\u007f\u000eI\u007f[6\u0017\u0004j$_5\b'`\u001eAb*\rm\u0019}v{\u001bD\"Fw>\u001ec*:d9!x.0~<x]#<w\u0005!";
        objectArray[31] = "u\u0004$\r^\nd\\(Pb\u0016}{#\b\u0004j+KaW\u0004S\"E)\u0006b";
        objectArray[32] = "5}&5/P(.)\t<D,#sw+)(!+i*Fn~x\t$\u0010fx~p9CiD";
        objectArray[33] = "}{\u0011\f\u0013B`(\u001e0\u0006\\Q#D]zQ'x[HCAa=L0";
        objectArray[34] = "*Vif\u0015>p\njfd%:U6 ?!)_3\u0000\u001e4+YPfU3=LkdU4y4";
        objectArray[35] = "=n|p\u000e\"<fz+7('}!ll,4w$LM96qG*\u0006> d|(\u00069d\u001c";
        objectArray[36] = "_V1\u0017r\u0013O\u0010t\u0000\nEX\u0012M\u0005oG5\u0011nPjFZW1\u0003\n";
        objectArray[37] = "\u000b]\u0000Gh)F[[D\u0001>[\u0018`Wn0M\u0018@K\u0001o\t\u001cU\u0000m`Q\u0018D:";
        objectArray[38] = "J\u0013du;\u0018W\u0015)(\n\u001cO/\".l`\u0019\u001f`qlY\u0010\u0011( \n\u001fMQ9%eY\u0012\u0002Y";
        objectArray[39] = "SB|7G3\u000eB=5)q\u0000Vf3DJ\u00033n+\u00181\u0016\rz)\u0012{m\u000f96\u0014o\u0003W<'H\u000b";
        objectArray[40] = "\n\u0013$`\u001d|\u001aUawe!\u0001PbU\u0004!\rP\u001epT,\tSdz\u0015%\u000f+";
        objectArray[41] = "/\u0017WF\u0002!'HGG={b[IWLq\u0003'\u0000pLQ2LeNDAuG]JXa~+pUTgw=VKzo\n>\u0000H\u0003N\u0007\u001dEz|y#<\u0000l\u0007N~\bf\u001aYr &@\u0012_ ,\bT\u0010a|4\u001e\u0000nmsq\bfxyS\u0003\u001eISF (<\u0003z\rA\u007f9\u000b*_'\u007fKRSBtpwDO\u0001~\"\u0018\u0002\u0010R\u001e1\u0012\u0007JQqwMT*\u0007/ \nC\u0011\u0005/'N;";
        objectArray[42] = "\u0006\u001f8B\u0016\f[\u001fy@x_\\\u0003,Bx\u000e\t\u00008@C\f\t\u0007|8";
        objectArray[43] = "\u0012Ai\u0013\u0016m\u0004N=Vx*\u0012V$\b\u0002=9H?/\u00054\u001b/g\f\u001c9\u0000P9Q\u0019a\u007f\u0011<\r\u0011/\u0000Oa\bIP";
        objectArray[44] = "\u00133KdW6\u0014d\u0018=5:\u0003u|\u0019h/a5G\u0003V.t6ib\b\u0004r<\u0012\u0016H\u0012\u0013bm<R\u000eC%E\u0012Y\u0001d\bpoO\rp\u0004p\u001a\\bj8\u0019:^\u0004h%]g\\\u0001\u0013)B\u0012E$n=S\r[2J\bc8E1C2\u001e#Z?m&c\u0018X`j\u0014|as1s\u0016}_Wf\u001eeK&J5\u0011Y\u001d'I2LcE1R4/c\u00131H'\u0014a\u00136\f_";
        objectArray[45] = "~\u0015d)\u001a3nS!>bgdL%.\u0019\n(\u0015%o\u0006dp\u001043b";
        objectArray[46] = "]5?\u0014\u0000^\u00005~\u0016n\u0007\u001f)8\u0007\u0012\u0001\u0019Dy\u0004W\u001e\u0005$?Q\u0012^c";
        objectArray[47] = "0u$#<57\"wz^9 3v|`\u0002hC\u000fy\u0003c3x\u0002)\u0018-}D )%\u0019=m(`\u0011\u0011pG\u0001Tn1LX\u0013e:\u001b~C\u001dsc\u00065d+_\u0002'Ib*E0$]B'\u007f,\"^R\u0001`d `| Co\u0011m\\7X:ghOrY3\u001eJ'\u0007R8:wN/\u0018a$pr.\"92ktM(=:tep$b%j\u001f";
        objectArray[48] = "7\u001f~^I/'Y;I1z0C)Y\\\u0016a\u001f?\u0018Ux9\u001a.D1";
        objectArray[49] = "\u0005\u001c\u0006Ou\fI\nZ\u0018\u0014\u0002N\u001f\u0004ao\u000bRxPQ-TRAY_e\u00054BPMi\u0014\u000f@PJ-l";
        objectArray[50] = "c\u0003j.aTsE/9\u0019\u0011nc9)ymk\u0002aip\u0014vQnU";
        objectArray[51] = "SPV$T\u0013\u0015\u0005\u0013d2\u0013\u0001A)1B\u000fh\u0006W'\u000f\u0017\u0006^R6Ss";
        objectArray[52] = "jeh&E`z#-1=#m;;8P\u0005g]8e\u0007\"xd(#B5\u0000aj&\u0000=n9o7\\Y";
        objectArray[53] = "\b9\u0000\u001bFG\u000fnSB$AY//IAC4,\f\u001cDB[jSO$";
        objectArray[54] = "{_2:3{rQzkU-'QBy\u00179-KLh7/!Q\u000b26$2W6>i;,-";
        objectArray[55] = "y\u0014iOK\t~C:\u0016)\u0005iRG.U/\u0014;y8B *BD\u0017D\u0007\u000e qOGP\u000fAq\u0016U,;@q0c;\u000f\u0013a\fK9|!C+K;\u0000\u001cr\u0018n\u0011\u0015\u0005RJU9:8=\u001d\u0015\t\u0002&n\u0010OZ$\u0010F\f\u0014\u000b,\u0000a\u0015w\u001f$'J\tbXy'y\u0015\u0019Z#\u0003~t\u0016\u00189\u0013cNN\u000e\"\u0015\u0000\u000bL\\%\u0012oM\u0013\u000fE";
        objectArray[56] = "2\u0017\r-,\u0001~\u0001QzM\u0004/_2\u0003\u0014\r\\HU$p[m\u000b\b3<\nF.(0\"Q;O%\b\u0003;R20\u001b\u000e&C\u0017*0\n\u0005:\"U- %{\b\u0016q\u0014\u0005e0\u001b<\u0002P=\u0010\u0010\n+3|=\u001a\n\u0006Y2\f;<5=@N0.\u000b\u0004l\u000fU$\n\f9*6\u001d0]m+\u0014A/X2O\u000382\u000b=s";
        objectArray[57] = ".\u001c|m(o\u007f\n~9J/,\u001fd0\u0011+?\u0004y2J( Y\u007f1%n\u007f\n\u001fl8n}\u0003&e6&,e";
        objectArray[58] = "6gRjN'&!\u0017}6z19\u0007mV\u001e0o\u0018!K!\"-\u0015\u007f6";
        objectArray[59] = "%X\u0001K7\u0019n\u000b\u0014\b\u000b\u00130\u001a\fOz\u0019QfEhz9`\r Vr)'\u0006\u0018Rn\t,j5Mb\u000f%|\u0013SL\u0007X\u007fEP5&U\\\u0000bJ\u0011q}Et1&,I#\u0002o\u001arg\u0005\niH~I\u0011\bW\u0014f_Ev[\u001b#I#`O;Q_\fKpHz}Fb;)-xN2iO-\n\u0017Kt\u001c\"6\u0001W7\u0016pYG\bdv&\u0007\u0010OsM$\u0007\u0017\u000b\u000b";
        objectArray[60] = "\b\u0019_\u0013p?NL\u001aS\u00169^\u0003\u001ak(:W\u001a\u0019\u0014vgRBf";
        objectArray[61] = "^OTjE\u001a\u0018\u0010\u0007\nD\u0013MQ7kU\u0015!U\r6I\u0019N\u0013Re)I\u0019QUnG\u0011\u001c@\t\n";
        objectArray[62] = "nQ\u001665V%\u0002\u0003u\t\\{\u00134w6c-\u0005\u000e!kc<Z4\u00067`7g\u001b\u001fr]\u0007y.\u0001tW(C,.F{\u0018\u000f5\u001dbY\u0016q;&VI3\u0004\t\ni~mn;5rp,y \u0011HP\rt\u0000)vh\bB\b\tXV\bSW2DDh\u0001/#ty0}%0B]m\u007f\nOk\u0000f\u0003\u00006vSi?V7uT4\u0005\u000e!nRW@\fsiU8\u0006S \t";
        objectArray[63] = "CZ\u001f_\u001bOAYD\u000fe\tM\u0018\u0014N\u001e\u001e Y\u0001H\b\u0010\u001a\u0001\u0017S\u000es\u001f\u001e\u0005Y\u0006IG\b\u001e_e";
        objectArray[64] = "XX\b'\n\u0011R\u001d\f+c0\r\u0016Z<[\u001c~\u0006+p)_{\u0000\u00181\u0005S_\f \u0003%\u0007F)*w\u0019)E\u001b\u000f\t\u00040|_\u000ft\u0000QV:Qw^*G\b\u0016\r'\u0002\u0003\f\u0007/:<\\\u00075\u000fR\t}\f-q\u0011\u0017\f\f!61-z\u000b .2%`5S*\u0007)n\u001a&?\u0019V^\\8M\u000f^LW\u0017r\u001d\u001cA\tjr\u001b\u0012Q\u0004P*\r\tWg";
        objectArray[65] = "\nB^\t0'\u0002\u001dN\b\u000f}G\u000e\n\f1c\u0002^h\u000eQ}\u0005C`\u001af~\u000f\u001ah\n}s.iX]bb\u000bph(_#\u0017aI\u0002e&;o\u000b)3A(gY[?\\\u0016zK\u0015Wt\u000bIL<~}-\u001e\tTnr\u000blm\u0018C{ a\u000e\b}v\u0013`H;N{$f[*Pe\f~Kep}WB^\n6\"\u0004\"M\u00003x\u0007M\u000b_`\u0018TZN\bl\"\fLU\u000e\u000f$SY\u000f\u0001a|VHSe";
        objectArray[66] = "h=\u007f\u0002*t.b,b<vo<*\t+\u001bz=2\\,a'):\u0013Fvr)}\b<+f!2b9~+8/\r\u007f!xX";
        objectArray[67] = "!#S1\t0g|\u0000Q\b&#/\u000b*$08!\u0015<.6%+o.\u0000c>*\u0000h_0^zW*X;0\"R;\u0004_";
        objectArray[68] = "&!B\u0018E5'zGIzv2+AT!r!!Dt\u0000g#''\u0012K`52\u001c\u0010KgqJ";
        objectArray[69] = "x;lSdC%;-Q\n\u0015!0\\@a\u001bF+hJv\u0006x5(\u0010q{|{\u007fTr@~{x\u0010\n";
        Object[] objectArray2 = objectArray;
        objectArray[70] = "@X!\u0019K\u0002\u001dX`\u001b%S\u0012E\\]@^\u0017V#\u0003\u001d[O)`[^\u0007\u001aG8^O[~";
    }

    public static Throwable a(Throwable throwable) {
        return throwable;
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Path path, String string, String string2) {
        m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(path.resolve(string), string2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean m$$oHEzCXIwH2KBoXSOqmxyt4IzePMDDaXTkMwGH1nkmXEeVV72AntsTEbJZWi3JPlkNQtgHNZ6Spv3ueaE9Il92kdvJoF454xhW(String string, int n) {
        List list = (List)this.getRegistry();
        synchronized (list) {
            for (m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa : (List)this.getRegistry()) {
                if (!m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa.getName().equalsIgnoreCase(string)) continue;
                this.m$$E5bIDs51FSsbWcGBlQHLlcX3dSKTj5imC7BoQortI51DOud4Qmodv5bWXznszHsvDOHJtlFr03LjniP2gwDFwr1hd35eDWkHq.fromJson((JsonElement)m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa.m$$3l6VlTJiU77oG9NyySe9sM9zmpGEtPDD8eHOVulOzTXc5R1snOTsMuoUfpYUbozvZEDp2tdkeS9EiKrHl3lX7IeJN0BBnnsYj((int)(0x2CA84FA0L ^ (long)(n >>> 8))));
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(Consumer consumer, int n) {
        List list = (List)this.getRegistry();
        synchronized (list) {
            ((List)this.getRegistry()).forEach(consumer);
        }
    }

    public static String m$$pymU6OPYm1V9ZbKslPVaCTJKc0PAllzhQdrT6VofzQqejSz8LbgNfocJXWAPeV1p8VlJWTJrRcfOYl1ogR1B4kxUBX8Uxwmj1(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-114, 25, 107, 15, -117, -56, 43, -90, -26, -69, 40, 125, -46, 92, -100, -93, 127};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 17]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public boolean m$$q60MFbe6wdivWp4kRCKnlZZPlYEn3tV4kfyfYvLxmOjTDK7AxLlTtFsQ579mT62x8LKzvOCLsSewKyc0PBtW1vCddwE5OeN7R(String string, String string2, int n) {
        boolean bl;
        block11: {
            block10: {
                try {
                    if (string.equalsIgnoreCase(string2)) {
                        return false;
                    }
                } catch (class_151 class_1512) {
                    throw m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.a((Throwable)class_1512);
                }
                try {
                    if (this.m$$g1Rd442dAyKIjK6CHoSgBSdOgs2XoKiMV2ENyZYMuhUn9booZpzgFvg2oGQYSMHDU722qaG5SeWo570cEk9QL1m5t0BjYzme7.resolve(new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\u0001.json")).toFile().exists()) {
                        this.m$$g1Rd442dAyKIjK6CHoSgBSdOgs2XoKiMV2ENyZYMuhUn9booZpzgFvg2oGQYSMHDU722qaG5SeWo570cEk9QL1m5t0BjYzme7.resolve(new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\u0001.json")).toFile().renameTo(this.m$$g1Rd442dAyKIjK6CHoSgBSdOgs2XoKiMV2ENyZYMuhUn9booZpzgFvg2oGQYSMHDU722qaG5SeWo570cEk9QL1m5t0BjYzme7.resolve(new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string2).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\u0001.json")).toFile());
                    }
                } catch (class_151 class_1513) {
                    throw m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.a((Throwable)class_1513);
                }
                try {
                    try {
                        if (!this.m$$0a6satRcVmfiZwanl0RgzcMCb0erhZREX3tKsob6XE1D4QKMc68LuPqxPdhcvQymN439ibhFWuDkCK4ezfpJrVIkGLaGWuoTq(string, string2, ((1285193848 + n >>> 15 | 1285193848 + n << 17) ^ n >>> 4) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) || !((List)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB).removeIf(m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa -> m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa.getName().equalsIgnoreCase(string))) break block10;
                    } catch (class_151 class_1514) {
                        throw m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.a((Throwable)class_1514);
                    }
                    bl = true;
                    break block11;
                } catch (class_151 class_1515) {
                    throw m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.a((Throwable)class_1515);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void m$$VQeBiYQFF92st4KpYnl7JJZWvgzGjBP4Dd9SFTh4QWYtzxAIcX5Qp3MUZowrwkKm0ljNF9ZAlkex9P3KyEVeoeW2idm8qJEa8(String string, int n) {
        for (m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa : (List)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB) {
            try {
                if (!m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa.m$$ORtGYMqDcHg4LkeoCVy3f8B7yjtDv6yLBSBeipjQ1WKWjSMjzdOyXsZ6tQwN5a4aOPfln2ifNp5caviiVwiQBuC04Qqi82nuv(-2040557839).equals(string)) continue;
                m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(this.m$$g1Rd442dAyKIjK6CHoSgBSdOgs2XoKiMV2ENyZYMuhUn9booZpzgFvg2oGQYSMHDU722qaG5SeWo570cEk9QL1m5t0BjYzme7, 1945476692);
            } catch (class_151 class_1512) {
                throw m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.a((Throwable)class_1512);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void m$$GVi082ZtuEf8HvU28bmo8vuJJ2ogvK9ZsjiWtW5jTpeariq0hk8tgtKxHEJlV6kK4tFsZ0HwXSUC9ifqvBsXGhUxCu6cAsYaj(int n) {
        List list = (List)this.getRegistry();
        synchronized (list) {
            ((List)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB).clear();
            try {
                for (File file : Objects.requireNonNull(this.m$$g1Rd442dAyKIjK6CHoSgBSdOgs2XoKiMV2ENyZYMuhUn9booZpzgFvg2oGQYSMHDU722qaG5SeWo570cEk9QL1m5t0BjYzme7.toFile().listFiles())) {
                    try {
                        if (!file.getName().endsWith(".json") || file.length() <= 0L) continue;
                    } catch (Throwable throwable) {
                        throw m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.a(throwable);
                    }
                    try {
                        JsonObject jsonObject = JsonParser.parseString((String)m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(file.toPath(), -1978391217 - (0xDA45A520 | n) ^ n >>> 1)).getAsJsonObject();
                        try {
                            if (jsonObject == null) continue;
                            ((List)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB).add(new m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa(file.getName().replace(".json", ""), jsonObject));
                        } catch (Throwable throwable) {
                            throw m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.a(throwable);
                        }
                    } catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /*
     * Loose catch block
     */
    public boolean m$$0a6satRcVmfiZwanl0RgzcMCb0erhZREX3tKsob6XE1D4QKMc68LuPqxPdhcvQymN439ibhFWuDkCK4ezfpJrVIkGLaGWuoTq(String string, String string2, int n) {
        for (m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa : (List)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB) {
            block5: {
                try {
                    if (!m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa.getName().equalsIgnoreCase(string)) continue;
                    this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$g1Rd442dAyKIjK6CHoSgBSdOgs2XoKiMV2ENyZYMuhUn9booZpzgFvg2oGQYSMHDU722qaG5SeWo570cEk9QL1m5t0BjYzme7, string2, m$$VqDc0eTAgzOPC4IU6WwZsiqEa0qk7QNmclpi6XPMtzLLBOqLUU9iWXMcrWVjw6jLdGlqrsVBwx7XuPXLTWk6HGDHuk8aGSTUx.toJson((JsonElement)m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa.m$$3l6VlTJiU77oG9NyySe9sM9zmpGEtPDD8eHOVulOzTXc5R1snOTsMuoUfpYUbozvZEDp2tdkeS9EiKrHl3lX7IeJN0BBnnsYj(414054653 - (0xDA45A520 | n) ^ n >>> 1)));
                    ((List)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB).add(new m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa(string2, m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa.m$$3l6VlTJiU77oG9NyySe9sM9zmpGEtPDD8eHOVulOzTXc5R1snOTsMuoUfpYUbozvZEDp2tdkeS9EiKrHl3lX7IeJN0BBnnsYj(Integer.reverse((0x998195DA ^ n << 3) + 2472538 ^ n) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01)));
                    break block5;
                } catch (class_151 class_1512) {
                    throw m$$YgMtlyKyTjjcnGs3fa4sQV6ycITncNqGbYLCgBaIy6yLZGtd6gShtFm1039CsIzZcy0H8x7mxAYpsB7YD9qf5cjluA9kpcEMm.a((Throwable)class_1512);
                }
                {
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public void m$$sG1kYme00hRMtILzdLCYk1TAIRecxTRj7gTK3VlZgOXTy42ELPkTAkpFc8XUwUtARcGeseqFXe2lEcVU2V2E90oP7poPlndEn(int n) {
        for (m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa : (List)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB) {
            try {
                m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(this.m$$g1Rd442dAyKIjK6CHoSgBSdOgs2XoKiMV2ENyZYMuhUn9booZpzgFvg2oGQYSMHDU722qaG5SeWo570cEk9QL1m5t0BjYzme7, 1945476692);
            } catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public boolean m$$oVmiiCFr6u7QXJ0RuVoXFbTs2ijeW5BdxFF0rPLBgoZ6eAvbjBRKJP47q08yik5JvhMqsETskETWWaRgfy7quFHhECiTyu4FG(String string, int n) {
        this.m$$g1Rd442dAyKIjK6CHoSgBSdOgs2XoKiMV2ENyZYMuhUn9booZpzgFvg2oGQYSMHDU722qaG5SeWo570cEk9QL1m5t0BjYzme7.resolve(new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\u0001.json")).toFile().delete();
        return ((List)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB).removeIf(m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa -> m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa.getName().equalsIgnoreCase(string));
    }

    public void m$$hMTBTUjMqExxvG5onCLFCGdCJAEZnuiCgBOlbCY7Hj7Pq4xgpywXm76h4tTUpcnqt5P775xvu3X5CCEZ7o5riE6AWY4V8FmUJ(String string, int n) {
        ((List)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB).removeIf(m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa -> m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa.getName().equalsIgnoreCase(string));
        m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa2 = new m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa(string, this.m$$E5bIDs51FSsbWcGBlQHLlcX3dSKTj5imC7BoQortI51DOud4Qmodv5bWXznszHsvDOHJtlFr03LjniP2gwDFwr1hd35eDWkHq.toJson().getAsJsonObject());
        m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa2.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(this.m$$g1Rd442dAyKIjK6CHoSgBSdOgs2XoKiMV2ENyZYMuhUn9booZpzgFvg2oGQYSMHDU722qaG5SeWo570cEk9QL1m5t0BjYzme7, (171148752 + (~n & \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) ^ n >>> 3) - -1763087492);
        ((List)this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB).add(m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa2);
    }
}

