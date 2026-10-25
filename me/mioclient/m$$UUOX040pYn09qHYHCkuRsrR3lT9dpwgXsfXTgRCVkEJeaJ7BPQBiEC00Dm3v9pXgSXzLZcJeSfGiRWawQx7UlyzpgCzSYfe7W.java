package me.mioclient;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_151;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W {
    public static final FloatBuffer m$$2bFgBrx2UigNUBYtepNatQpmEydfXTJw5DfuRcysOzj38ar9soIgfNMBTUd3Q1SD59ejEKSfEX5J5UUcBUYzVbBrOfXckO4hr;
    public final Object2IntMap m$$N8W57siNc8zdS42PFQmKQ2x1jm5dPt1wL1BG8R8fwYSmx6rkwXnnsFCcbItQ4dvoYt9Ie5kFezXC6pN4hx7tSHLpsMZS6TreS = new Object2IntOpenHashMap();
    public final int m$$JqJVdnc2KBGNNAQ0Z2oQ8GOWpN4CGLpMTWxtEBi10YcQvhqVO63qdqnYurterePI7euA2H3fVy6OkkVP6xmTYkHSULdqPRr8L;

    public m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W(int n) {
        this.m$$JqJVdnc2KBGNNAQ0Z2oQ8GOWpN4CGLpMTWxtEBi10YcQvhqVO63qdqnYurterePI7euA2H3fVy6OkkVP6xmTYkHSULdqPRr8L = n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    block14: {
                        m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.e = new Object[36];
                        m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.f = new String[36];
                        m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.a();
                        var8 = 7806689103038437525L;
                        var14_1 = new long[31];
                        var11_2 = 0;
                        var12_3 =  /* dynamic constant */ (String)m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90("7KigZPdL7lHuGkUy5GT1", MethodHandles.lookup(), "m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90", m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.class, 2135801243);
                        var13_4 = var12_3.length();
                        var10_5 = 0;
                        while (true) {
                            var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes( /* dynamic constant */ (String)m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90("3sHcFonx488DpiqEGu1D", MethodHandles.lookup(), "m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90", m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.class, 1338326004));
                            v0 = var14_1;
                            v1 = var11_2++;
                            v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                            v3 = -1;
                            break block14;
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            var12_3 =  /* dynamic constant */ (String)m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90("2A3VQBpix0VpwgMZ8Krx", MethodHandles.lookup(), "m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90", m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.class, 719024013);
                            var13_4 = var12_3.length();
                            var10_5 = 0;
                            while (true) {
                                var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes( /* dynamic constant */ (String)m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90("qx0Rh1El0Z2a7YPsuhut", MethodHandles.lookup(), "m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90", m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.class, 1579777140));
                                v0 = var14_1;
                                v1 = var11_2++;
                                v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                                v3 = 0;
                                break block14;
                                break;
                            }
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            break block15;
                            break;
                        }
                    }
                    v4 = v2 ^ var8;
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl41:
                        // 1 sources

                        ** continue;
                    }
                }
                m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.a = var14_1;
                m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.b = new Integer[31];
                m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -411982;
                var0_7 = 6490014004845311700L;
                var6_8 = new long[4];
                var3_9 = 0;
                var4_10 =  /* dynamic constant */ (String)m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90("vdiBFeZTp53scbgFpn4p", MethodHandles.lookup(), "m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90", m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.class, 1143510095);
                var5_11 = var4_10.length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes( /* dynamic constant */ (String)m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90("JLYPLgJWiuI9p3ZFvtkW", MethodHandles.lookup(), "m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90", m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.class, 201309655));
                    v5 = var6_8;
                    v6 = var3_9++;
                    v7 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v8 = -1;
                    break block16;
                    break;
                }
lbl59:
                // 1 sources

                while (true) {
                    v5[v6] = v9;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 =  /* dynamic constant */ (String)m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90("BU96U640VIBVPbV863UR", MethodHandles.lookup(), "m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90", m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.class, 469842140);
                    var5_11 = var4_10.length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes( /* dynamic constant */ (String)m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90("3DP0rG2MJM404BTG2t7g", MethodHandles.lookup(), "m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90", m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.class, 1915870182));
                        v5 = var6_8;
                        v6 = var3_9++;
                        v7 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v8 = 0;
                        break block16;
                        break;
                    }
                    break;
                }
lbl72:
                // 1 sources

                while (true) {
                    v5[v6] = v9;
                    if (var2_12 < var5_11) ** continue;
                    break block17;
                    break;
                }
            }
            v9 = v7 ^ var0_7;
            switch (v8) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl83:
                // 1 sources

                ** continue;
            }
        }
        m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.c = var6_8;
        m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.d = new Long[4];
        m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)7816794695474900120L);
        m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.m$$2bFgBrx2UigNUBYtepNatQpmEydfXTJw5DfuRcysOzj38ar9soIgfNMBTUd3Q1SD59ejEKSfEX5J5UUcBUYzVbBrOfXckO4hr = BufferUtils.createFloatBuffer((int)16);
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x1375) & Short.MAX_VALUE;
        if (d[n2] == null) {
            m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.d[n2] = c[n2] ^ l;
        }
        return d[n2];
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "\u000eOB\u0004t&\u000bZI\u0004w!\u0004SBF6\u0016-\u000f\u0015";
        objectArray[1] = Integer.TYPE;
        m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.f[1] = "java/lang/Integer";
        objectArray[2] = "T7\u001eg\u0000z_8\u000f(m~_$;c_c[8\u000bc";
        objectArray[3] = "_\u000fJ9\u0003\u0003Q\u0006\r1\u0004\u0018\u001c\u0007@p?9}2T`Z\u001ck\u0004Tm\u001b$k\"'?\u001f>A\u00186g\u00068\u000b\u000e\u0014#\r4A\f<\u0000\r>q<\u000f\u0011 \tS S\u0016:=p\u0003!\u0017Z\\v\u0007W\"S\u001cj\r7\f\u0010 h\t.19\nu\u00036\u0003\u000b\u001bc\u0012S\u0001\u0006\u0015H\u001a\u0003\u0017\u0010?k\f\u0001c=";
        objectArray[4] = "=IQ\u0002]z6F@M b%AI\u0004";
        objectArray[5] = "\u0004 }K_\u0017\u00015vK\\\u0010\u000e<}\t\u001d''a(";
        objectArray[6] = Void.TYPE;
        m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.f[6] = "java/lang/Void";
        objectArray[7] = "v(\u0005\u001f\u001a<x!B\u0017\u001d'5 \u000fV\u0012\u0002N?E:\u0014\u0002/\u001d\u001e\u001f&=s%r\u0015\u0004!^?n(:%Sto>\u001a\u0004+\u001fY'\u001a`m\u0006\u001d\b\u0015\u0005(\u0007{@16/\u001e\u001b(;\u0015t\u001a\u00187\u0018\u001fN\u0004O\u00152\u0012I8[D$;r\u0003Z\u0001!\u001cz\u007fI\u0006\u001e\u0007~uS\u0003G\"syZ:\u001e";
        objectArray[8] = Long.TYPE;
        m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.f[8] = "java/lang/Long";
        objectArray[9] = ">Mr\t~i;Xy\tPk7YpUGj8Sf";
        objectArray[10] = "^Z0^@\u0000]Thy\u0002\u0001UO\u0004J\b\bQI";
        objectArray[11] = "*5\u001eQb\u00017 Fs#\f/&";
        objectArray[12] = "*-XL)c!\"I\u0003Ac/-Z";
        objectArray[13] = Float.TYPE;
        m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.f[13] = "java/lang/Float";
        objectArray[14] = "WpSB{uSmSSfu\u0010b\u001cDaiJm\u0011\u0019z~Ta\u001eCf2qf\u0017Rvh\fM\u0013CX}N";
        objectArray[15] = "\r\u001aF+\u001c\u001e\u0006\u0015Wd}\u0010\r\u001eS>";
        objectArray[16] = "]'H$%7Y:H587\u001a5\u0007\"?+@:\n\u007f$<^6\u0005%8p{1\f4(*\u0006\u001a\b%\r+Z0\u00128$0";
        objectArray[17] = "q\tyQ*`s\u001702!{l\u0012fK&";
        objectArray[18] = Boolean.TYPE;
        m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.f[18] = "java/lang/Boolean";
        objectArray[19] = "^E\u000f\fPV\u000f\u001f[A:B\u0003Sd\u0010V-W\u0017S\u001bXM\u0011L\u000eL:";
        objectArray[20] = "Nv\u0015_3\u0012\u001clZ\\\f\u0011\u0011HN\u0004b\u0019\u000fp\u0012\u000b\fGMxN\u0007l\u0001\u0016%\u0019e=\u0017\u0014|P^k\u0012\n\u007f(Te\u001f\u001cm\u0013\u0002`\u0001\u001f\u0015\u0014\t3B\u001avF\u001d=\u0017u";
        objectArray[21] = "\u001cq&NlxOa$Q\u000eh\u001b\u007f\u001d\u0011d7N>a^q6\u0006\u0003\"D>?K\u007fmQ?wv";
        objectArray[22] = "7JUR\u0002x7WI\u001apq!\u001eu\u0011\u0001S2\u000ff<9TVCi\u001b3T3U\u0013&MXucR\u0003\u0002f3\u007fm-\u0014estK\u0013(^o\u000bJ-\u0000.VRk,-yfcR$/Fojj\u00064Ea_\u00111\u0002vhuv\u0013<i@P\u0016$\u0013}Doi\u0013-TTT^//DGlgcK+cVV\u0012\u001b-o\u0002,ZHykPL\u001c\u0013$<2\u0015[\u001droRS\u0000@%\r";
        objectArray[23] = "Cx?r^%\u0011bpqa&\u001cFd)\u000f.\u0002~;&ap@vd*\u00016\u001b+3HP \u0019rzs\u0006%\u0007q\u0002t\rvDta&\u0019x\u0011\u001b";
        objectArray[24] = "8\u000f\u0001s.G8K@3AU<Lp)=:8OA5#\u00036LS+A\u0003i]W-!E2\u0000\u0000O";
        objectArray[25] = "\u0013\u0006')E%B\\sd/1N\u0010Y\"B3El/`B8A\fi;\u001fo#";
        objectArray[26] = "s/\f8=p}8N7\u0001l%5~$}v\u001f.z!fd?I\r}lk!)K&1<Cx]$hux.X:k\r";
        objectArray[27] = "F]!})\u001a\u0013C9bS&KRxtk\n8B\t8\u0019I=D:y5E\u0019H\u0002K\u0015\u0011\u0000m\b?)?\u0003_-A4&:\u001b-<0G\u0010~s?n<\u0001L4E\u0017\u0014EH%g\n*\u001aC\u0017Gb\u001f;H\u000f9!\u0001JH\u0003~\u0001;<O\u0002f\u00023&qqb7?(^\u0004w)@\u0018\u0018\u001a\u0005mG\bY%|j\bKOH<k\u0015\u001cA(z0HK#";
        objectArray[28] = "1.\u0016\u0019 \u0019;e\u0019v \u0012\u00193\u0017+)\u001789\u0011\u0013\u000b\u0011=7\u0017\u0017(\u0010VgS\u001b)\u00146!\bF~vo%\u0017\u001bqF)\"\u0000\u0006OOn3\r\u0014/\t5nZv";
        objectArray[29] = "\u001aiv\u001e3HC`e\u0003OR^db\u001f\"w@nb\u001f\u0005DJgf\u0019O\u0000\u001cdm\u0001/FG9:cpS\u001416\u001f?F\u0015y\u000b";
        objectArray[30] = "~\u0004\u0004)W@,\u001eK*hC!:_r\u0006K?\u0002\u0005}h\u0015}\n_q\bS&W\b\u0013YE$\u000eA(\u000f@:\r9\"\u0001M,\u001f\u0002t\u0004S/g\bz\tE=\\^\u007f\u0017FEVPr\u0001T~\u0000Ul\u0002,y\u000b\u0006/\u0007O+\u001f\bzh";
        objectArray[31] = " DH\u00158Bq\u001e\u001cXRV}R0\u0000*Yy.@\\?_rN\u0006\u0007b\b\u0010";
        objectArray[32] = "ahZm\u000f_3r\u0015n0\\>V\u00016^T n\">LI;{[9N3c3\n1RS%hWf0_gd\\j\\\fgl\u0001W\u000fYj3Z+@Lk{gk\\\ffd\u00049H\u00023\u000b";
        objectArray[33] = "l\"s\u0018\u0005\u0006>8<\u001b:\u00053\u001c(CT\r-$wC:So,(@Z\u00154q\u007f\"\u0003R:',BE\tgpN\u001eVUk.-LB[>A";
        objectArray[34] = "*#27Wd{yfz=pw5I\"@r\u001ap;+[}z6`v\f\u001f";
        Object[] objectArray2 = objectArray;
        objectArray[35] = "$\u0012KbT.$V\n\";8*H\u0003#G>\fC24@>+Q{7D#7OB9G1)-\u0011<E*+P\u0016d\u00050M\u0014C3]1-R\u0018n\nS";
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x56EE;
        if (b[n2] == null) {
            m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(String string, float f, float f2) {
        GL20.glUniform2f((int)this.m$$QzyO75BWAHSyMpKH6o7M5DpYvhzz6EIFlyvNoxPBj1nFx2ShOGUecYvOWZjPNmLYde5ZzjmORxDuEj2OkaAUMxUHQnzDWXBVC(string, 1249417128), (float)f, (float)f2);
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(String string, Matrix4f matrix4f) {
        matrix4f.get(m$$2bFgBrx2UigNUBYtepNatQpmEydfXTJw5DfuRcysOzj38ar9soIgfNMBTUd3Q1SD59ejEKSfEX5J5UUcBUYzVbBrOfXckO4hr);
        GL20.glUniformMatrix4fv((int)this.m$$QzyO75BWAHSyMpKH6o7M5DpYvhzz6EIFlyvNoxPBj1nFx2ShOGUecYvOWZjPNmLYde5ZzjmORxDuEj2OkaAUMxUHQnzDWXBVC(string, 1249417128), (boolean)false, (FloatBuffer)m$$2bFgBrx2UigNUBYtepNatQpmEydfXTJw5DfuRcysOzj38ar9soIgfNMBTUd3Q1SD59ejEKSfEX5J5UUcBUYzVbBrOfXckO4hr);
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(String string, float f) {
        GL20.glUniform1f((int)this.m$$QzyO75BWAHSyMpKH6o7M5DpYvhzz6EIFlyvNoxPBj1nFx2ShOGUecYvOWZjPNmLYde5ZzjmORxDuEj2OkaAUMxUHQnzDWXBVC(string, 1249417128), (float)f);
    }

    public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(String string, boolean bl, int n) {
        int n2;
        int n3;
        try {
            n3 = this.m$$QzyO75BWAHSyMpKH6o7M5DpYvhzz6EIFlyvNoxPBj1nFx2ShOGUecYvOWZjPNmLYde5ZzjmORxDuEj2OkaAUMxUHQnzDWXBVC(string, (int)(0x4A31BF46L ^ (long)(n >>> 8)));
            n2 = bl ? 1 : 0;
        } catch (class_151 class_1512) {
            throw m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W.a(class_1512);
        }
        GL20.glUniform1i((int)n3, (int)n2);
    }

    public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(String string, Color color, int n) {
        GL20.glUniform4f((int)this.m$$QzyO75BWAHSyMpKH6o7M5DpYvhzz6EIFlyvNoxPBj1nFx2ShOGUecYvOWZjPNmLYde5ZzjmORxDuEj2OkaAUMxUHQnzDWXBVC(string, 1593349898 - (0xDD96267A | n) ^ n >>> 1), (float)((float)color.getRed() / Float.intBitsToFloat((-932252580 + (~n & \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) ^ n >>> 3) - -1985518060)), (float)((float)color.getGreen() / Float.intBitsToFloat(((1273251732 - (((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF) << 2) ^ n) - (((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF) << 1) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) - ((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF))), (float)((float)color.getBlue() / Float.intBitsToFloat((0xD5D71809 ^ n >>> 4) - 1985518056 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & n)), (float)((float)color.getAlpha() / Float.intBitsToFloat(1442647458 - (0xDD96267A | n) ^ n >>> 1)));
    }

    public static String m$$wJtQGcrs8RNgRPmQtsb3ppJBMtWJBsQdswahDCZdgNvypNCicSvWiFsjpm62KmZJZ5Q8L3gZjqfClGickzCqaZt0kY9VUnx90(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{8, 22, 116, 78, -122, -128, 118, -46};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 8]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public void m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(String string, int n, int n2) {
        GL20.glUniform1i((int)this.m$$QzyO75BWAHSyMpKH6o7M5DpYvhzz6EIFlyvNoxPBj1nFx2ShOGUecYvOWZjPNmLYde5ZzjmORxDuEj2OkaAUMxUHQnzDWXBVC(string, ((-1966437173 + n2 >>> 5 | -1966437173 + n2 << 27) ^ n2 >>> 8) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01), (int)n);
    }

    public int m$$QzyO75BWAHSyMpKH6o7M5DpYvhzz6EIFlyvNoxPBj1nFx2ShOGUecYvOWZjPNmLYde5ZzjmORxDuEj2OkaAUMxUHQnzDWXBVC(String string, int n) {
        this.m$$N8W57siNc8zdS42PFQmKQ2x1jm5dPt1wL1BG8R8fwYSmx6rkwXnnsFCcbItQ4dvoYt9Ie5kFezXC6pN4hx7tSHLpsMZS6TreS.computeIfAbsent((Object)string, object -> GL20.glGetUniformLocation((int)this.m$$JqJVdnc2KBGNNAQ0Z2oQ8GOWpN4CGLpMTWxtEBi10YcQvhqVO63qdqnYurterePI7euA2H3fVy6OkkVP6xmTYkHSULdqPRr8L, (CharSequence)string));
        return this.m$$N8W57siNc8zdS42PFQmKQ2x1jm5dPt1wL1BG8R8fwYSmx6rkwXnnsFCcbItQ4dvoYt9Ie5kFezXC6pN4hx7tSHLpsMZS6TreS.getInt((Object)string);
    }
}

