package me.mioclient;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL20;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD {
    public static final long m$$PG5Mc03FWSywEwuf4bGDIGWIYDWzBLXFVtTKPonw9qnXtnBwbuTpwhHmvvfxetwRuKyboxzgNhkkvFSnpz07SHbOcYzNfoZhu;
    public final int m$$svfo8KkcOrI7TA6Gz7eSncykqTDjiKBaByTrMbDsGoGWDbQqrJWhL36kixEoIm6GS9nr7g3b3UDyxyZQZRbdovJ4P01kRvIx7 = GL20.glCreateProgram();
    public final int m$$R6tnhqMNL5jiOtVX8tIcFoaru9Cob5tksXHXfAeFTtdv2baH8V1F89IyhHzxkoV5G7aPHNjIu9oVKSKW8gJf8zdL40w7NYoMt;
    public final int m$$GO9FHyTZ288pk9DX6aBBSSAIdFXYO3az6YnlC3bNB2d6nZ95olalpk5vZ8c2hFCo7dP5q8YKnPoaQRwmGtEIeZ584U0zdAJln;
    public final m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W m$$PYQNxqeP9m01LGXM7NGNUY0cw9CQ4QAhnooWjzlpvdCVPAHjfRdxfiUYOJn4mQrxuyvGqAZ5gjkelPCVUyeSmP72WgmfILr7L;
    public static final /* synthetic */ boolean m$$9IjIArk4dMmdk4lpPjjPrxY6hRqML14mQ7HMUN8LfgQ4qZfy5lHLSc7pj5N7MhkvgHJKKN6iaWyg8aaJ6GgHilJSSi6afUaEP;

    public m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD(String string, String string2) {
        this.m$$R6tnhqMNL5jiOtVX8tIcFoaru9Cob5tksXHXfAeFTtdv2baH8V1F89IyhHzxkoV5G7aPHNjIu9oVKSKW8gJf8zdL40w7NYoMt = m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(string, 35633, 213422243);
        this.m$$GO9FHyTZ288pk9DX6aBBSSAIdFXYO3az6YnlC3bNB2d6nZ95olalpk5vZ8c2hFCo7dP5q8YKnPoaQRwmGtEIeZ584U0zdAJln = m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(string2, 35632, 213422243);
        this.m$$PYQNxqeP9m01LGXM7NGNUY0cw9CQ4QAhnooWjzlpvdCVPAHjfRdxfiUYOJn4mQrxuyvGqAZ5gjkelPCVUyeSmP72WgmfILr7L = new m$$UUOX040pYn09qHYHCkuRsrR3lT9dpwgXsfXTgRCVkEJeaJ7BPQBiEC00Dm3v9pXgSXzLZcJeSfGiRWawQx7UlyzpgCzSYfe7W(this.m$$svfo8KkcOrI7TA6Gz7eSncykqTDjiKBaByTrMbDsGoGWDbQqrJWhL36kixEoIm6GS9nr7g3b3UDyxyZQZRbdovJ4P01kRvIx7);
        m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$svfo8KkcOrI7TA6Gz7eSncykqTDjiKBaByTrMbDsGoGWDbQqrJWhL36kixEoIm6GS9nr7g3b3UDyxyZQZRbdovJ4P01kRvIx7, this.m$$R6tnhqMNL5jiOtVX8tIcFoaru9Cob5tksXHXfAeFTtdv2baH8V1F89IyhHzxkoV5G7aPHNjIu9oVKSKW8gJf8zdL40w7NYoMt, this.m$$GO9FHyTZ288pk9DX6aBBSSAIdFXYO3az6YnlC3bNB2d6nZ95olalpk5vZ8c2hFCo7dP5q8YKnPoaQRwmGtEIeZ584U0zdAJln);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.q = new Object[42];
                        m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.r = new String[42];
                        m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.a();
                        var17 = new String[3];
                        var15_1 = 0;
                        var14_2 =  /* dynamic constant */ (String)m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.m$$InhlxqaQrbKNMU4Ql7kGh8Uul5ioPfxqyUIqX1trNcTaGWsMG2V2s71MrNqtr2IBgiykqSQxqXXz7axtSTGgqvgaXUo46Cr70("GOThSMZVbrYuwBQGc4Yp", MethodHandles.lookup(), "m$$InhlxqaQrbKNMU4Ql7kGh8Uul5ioPfxqyUIqX1trNcTaGWsMG2V2s71MrNqtr2IBgiykqSQxqXXz7axtSTGgqvgaXUo46Cr70", m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.class, 1846116939);
                        var16_3 = var14_2.length();
                        var13_4 = 9;
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
                            break block23;
                            break;
                        }
                        v1 = ++var12_5;
                        v2 = var14_2.substring(v1, v1 + var13_4).toCharArray();
                        v3 = v2.length;
                        var18_6 = 0;
                        v4 = 106;
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
                                        v11 = 77;
                                        break;
                                    }
                                    case 1: {
                                        v11 = 100;
                                        break;
                                    }
                                    case 2: {
                                        v11 = 80;
                                        break;
                                    }
                                    case 3: {
                                        v11 = 53;
                                        break;
                                    }
                                    case 4: {
                                        v11 = 56;
                                        break;
                                    }
                                    case 5: {
                                        v11 = 40;
                                        break;
                                    }
                                    default: {
                                        v11 = 97;
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
                    m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.a = var17;
                    m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.b = new String[3];
                    var4_7 = 5266746889041600888L;
                    var10_8 = new long[41];
                    var7_9 = 0;
                    var8_10 =  /* dynamic constant */ (String)m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.m$$InhlxqaQrbKNMU4Ql7kGh8Uul5ioPfxqyUIqX1trNcTaGWsMG2V2s71MrNqtr2IBgiykqSQxqXXz7axtSTGgqvgaXUo46Cr70("Il0zbSgHbzPyTDo0No6k", MethodHandles.lookup(), "m$$InhlxqaQrbKNMU4Ql7kGh8Uul5ioPfxqyUIqX1trNcTaGWsMG2V2s71MrNqtr2IBgiykqSQxqXXz7axtSTGgqvgaXUo46Cr70", m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.class, 1894744402);
                    var9_11 = var8_10.length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.m$$InhlxqaQrbKNMU4Ql7kGh8Uul5ioPfxqyUIqX1trNcTaGWsMG2V2s71MrNqtr2IBgiykqSQxqXXz7axtSTGgqvgaXUo46Cr70("rcq79XmKzwiHO4aaNUJh", MethodHandles.lookup(), "m$$InhlxqaQrbKNMU4Ql7kGh8Uul5ioPfxqyUIqX1trNcTaGWsMG2V2s71MrNqtr2IBgiykqSQxqXXz7axtSTGgqvgaXUo46Cr70", m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.class, 470318978));
                        v12 = var10_8;
                        v13 = var7_9++;
                        v14 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                        v15 = -1;
                        break block24;
                        break;
                    }
lbl93:
                    // 1 sources

                    while (true) {
                        v12[v13] = v16;
                        if (var6_12 < var9_11) ** continue;
                        var8_10 =  /* dynamic constant */ (String)m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.m$$InhlxqaQrbKNMU4Ql7kGh8Uul5ioPfxqyUIqX1trNcTaGWsMG2V2s71MrNqtr2IBgiykqSQxqXXz7axtSTGgqvgaXUo46Cr70("0tcbQdMdw8FbGZ8MNP7i", MethodHandles.lookup(), "m$$InhlxqaQrbKNMU4Ql7kGh8Uul5ioPfxqyUIqX1trNcTaGWsMG2V2s71MrNqtr2IBgiykqSQxqXXz7axtSTGgqvgaXUo46Cr70", m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.class, 1104761261);
                        var9_11 = var8_10.length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.m$$InhlxqaQrbKNMU4Ql7kGh8Uul5ioPfxqyUIqX1trNcTaGWsMG2V2s71MrNqtr2IBgiykqSQxqXXz7axtSTGgqvgaXUo46Cr70("ek178KK0QbgJlwnvReRA", MethodHandles.lookup(), "m$$InhlxqaQrbKNMU4Ql7kGh8Uul5ioPfxqyUIqX1trNcTaGWsMG2V2s71MrNqtr2IBgiykqSQxqXXz7axtSTGgqvgaXUo46Cr70", m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.class, 378194969));
                            v12 = var10_8;
                            v13 = var7_9++;
                            v14 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                            v15 = 0;
                            break block24;
                            break;
                        }
                        break;
                    }
lbl106:
                    // 1 sources

                    while (true) {
                        v12[v13] = v16;
                        if (var6_12 < var9_11) ** continue;
                        break block25;
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
            m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.g = var10_8;
            m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.h = new Integer[41];
            m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 667648;
            break block26;
lbl123:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 6377247443471410359L;
        ** while (true)
        var0_15 = 1246179327643728965L ^ var2_14;
        try {
            m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_15);
            v17 = m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.class.desiredAssertionStatus() == false;
        } catch (RuntimeException v18) {
            throw m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.a(v18);
        }
        m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.m$$9IjIArk4dMmdk4lpPjjPrxY6hRqML14mQ7HMUN8LfgQ4qZfy5lHLSc7pj5N7MhkvgHJKKN6iaWyg8aaJ6GgHilJSSi6afUaEP = v17;
        m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.m$$PG5Mc03FWSywEwuf4bGDIGWIYDWzBLXFVtTKPonw9qnXtnBwbuTpwhHmvvfxetwRuKyboxzgNhkkvFSnpz07SHbOcYzNfoZhu = System.currentTimeMillis();
    }

    public static void a() {
        Object[] objectArray = q;
        q[0] = "#OA6b0(@Py\u001f%:ZR:";
        objectArray[1] = Long.TYPE;
        m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.r[1] = "java/lang/Long";
        objectArray[2] = "r]\u0015i\u001d0yR\u0004&p0yO\u0010";
        objectArray[3] = Boolean.TYPE;
        m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.r[3] = "java/lang/Boolean";
        objectArray[4] = "\u0006Gg#vw\bN +qlEOmj~I>P'\u0006xI_r|#Jv\u0003J\u0010)hj.P\f\u0014Vn#\u001b\r\u0002vO[p;\u001bv+\u001di\u007f4yNXh\u0019|]}_qy\u0014W^\u0004uz\u000btT>k-)^Y9W9xHp\u0002l8=MW\n\u0010+:rL\u000e\u001a1?+i\u0003\u00168\u0006r";
        objectArray[5] = Integer.TYPE;
        m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.r[5] = "java/lang/Integer";
        objectArray[6] = "B\u0002zDQ=L\u000b=LV&\u0001\np\rz<\u0019\u0016\u0005N~#\u007f\u000f\r|\u000fdY\"mp[\u0017m3\u001bK{'AW$]z(m\n3ZM\u0002m \u001edv8@\u001ea]^5HP\u0015GT \u0017\u0015\u001ess\u0018I4=bS+@.%pt<k$!a\u0000;@_\u001a\u007fZ<\u0019\u0013$a|&B\u0005\u0013f|";
        objectArray[7] = Void.TYPE;
        m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.r[7] = "java/lang/Void";
        objectArray[8] = "-l{\u0019R<&cjV/$5dc\u001f";
        objectArray[9] = "\u0019R\u0012]Yk\u001cG\u0019]Zl\u0013N\u0012\u001f\u001b[:\u0013G";
        objectArray[10] = "[~0\u0019:FUo?RuU[a:X5E\u001ae8\u0019\u0012yax>[(";
        objectArray[11] = "$Y@.22!\u0016\u007f!l.:kB=y:#";
        objectArray[12] = "/\u0013l<o(,\u001d4>)'7\u0001\u007f)o\u0005-\u0013h.$2";
        objectArray[13] = "\u0003\u0007\u0007\u001aW\n\b\b\u0016U-\u000e\u001b\t\u0006\u001a\u001b\n\f";
        objectArray[14] = "+2A`f\u0014 =P/\u001b\f3:Yf\n\r(?Sd:";
        objectArray[15] = "$iK:ju/fZu\rw:mZ>6";
        objectArray[16] = "\\\u00015Z\u0006cW\u000e$\u0015kgW\u0012\u0010^YzS\u000e ^";
        objectArray[17] = "\u000e\u001a\u001bu:X\u0005\u0015\n:FA\n\u0015\fvxQ";
        objectArray[18] = "VO\rZT\u001c]@\u001c\u00155\u0012VK\u0018O";
        objectArray[19] = "C}+MSV\u0001~-V3_S,bNBU2P+iBu\u0003;NWJeD0vSVEO\\[LZCFJ}RtK;I+Q\rj6jncr]\u0012K+u\tjO\u007fM\u0003WV\u0011Qk\u000bQ\u0004\u001d\u007f\u007f\toX\u0005i+wcW@\u007fMaww2ibJH\u0004\u0019K(c\u0003eNN 3\bG\u00148/\u000bNC\u001cy\u0010\bNQG?(NJY\u0006\u0000+NX\u0002@8mJPC\u007f=!]\n\u0004\u0002b*\u0002\u000b:";
        objectArray[20] = "pr,qK(2q*j+!`#JC\u0014\u001e\u000bqycPt!TS_w\u000brqYE\u0016(\tFt7\u0010&\ftJEV}\u000ff]2\u0010\u001f7tZ?\u001b\u000f\u0000HzdH\u0014|6zUwz\u0014mOj\u0011\u00156V&Td\u000e(5RlW\u0006\n>QV`/\u0017~VCR#7j.knz\u00170g\u000f\u0015yw3s\u007fW\"us\u00174V/t0/rR'5\u000f)2\u0010x(\u007fki\u00128L";
        objectArray[21] = "}kP\u001c\n*\"6ICp?'JJK\u0013\b9iDW\u00195C5VFHo{sRN\tP~?E\u0014N-!4\u001a\u0015p";
        objectArray[22] = "\u0007R?-6NF\u001c`oMP_6\"+,JWmnh\"\u001dH\u0017#(4U8]==-^\u0003T# u,\u0006Pem)\\D\u000bg-M";
        objectArray[23] = "}k_b\u0006l3p@v`*6mK{;.%gN[\u001a;'a-:Q<u2PeZct\f";
        objectArray[24] = "[-F\u000et\"Uz\u000e\u0011\u001b*Th\u0011\tgK\tn\u0017K$sOj\u001f\n\u001bu\u000f(@\u0017k7T*\u0000sru\bn\u0013\u001a|\"@q|";
        objectArray[25] = "O\u0017(],AA\u0018m\u001fTAYO\u0014XeU\u001d\u0017i\u0007n\n\u001c)";
        objectArray[26] = "]#Bv>m\u0002~[)Dx\u0007\u000fE;-|\u0003\u001dY.(z\u0019F\u0002://\\~D>'nc}D,|([;@$=\u0017^wW~zj\u0001|\b\u007fD";
        objectArray[27] = "H6\r\u001f4\u0002Cu\t.b\u0002\b5\u001fHu#\u0013*\u001fkh\u001b\u0016.\t.0D\u0000u\u001b\u0016g\u0014\u001d/r";
        objectArray[28] = ";e?<uX52w#\u001aM5\u0000y;{W=[;|!\r6+y'#MR";
        objectArray[29] = "z`\u0004,9\u0002%=\u001dsC\u0017 N\u0005p*\u0004)^\u001ft/\u0015>\u0005D`(@{=\u0002d \u0001D>\u0002v{G|x\u0006~:x";
        objectArray[30] = "\u0007\u000e\u0000t\t\nXS\u0019+s\u001f]'\u0016!\u001e\fT0\u001b,\u001f\u001dCk@8\u0018H\u0006S\u0006<\u0010\t9VJ+JND\tAtKp";
        objectArray[31] = "(K7\u0002eGjH1\u0019\u0005N8\u001aR:X[ZZi fZOYGA8pIS<5xf(\rC\u001fbzxJk1iu_g^L\u007fyKk^9l\u0016QW7\u0019npSJsDlu(Fl1uPUR}.kFqgM\u001buEx]0\u0000jKVIM;h\u0014Q{RBCEHyS|;\u0016/\nh\fyM-J\fGx@,\t4\u0001|Hm67\u0001n\u0013+\u000eq\u0005fR\u0014\rq\u0017=\u0014,Ku\u001f|+";
        objectArray[32] = "_\u000fT\u0014uT\\\u0011\u0003\u0017\n\\\u000b\u000e?EqT\u001b\b\u000eECH=\u000e\u001fEcVfLX\u00136W\u0016\u000e\u0003\u0011v3VK\n\u0019zI\u001b\u000b\u001cQ\n";
        objectArray[33] = "9(L,ac7\u007f\u00043\u000ek6z\u001b!IdP(Kj2n j\u0010hr\nkk\u001di12-o\u0015(\u000e";
        objectArray[34] = "eyBpZ\u0004fg\u0015s%\u000f1\u007f\u00126H\u000f\u0015\u007f\b!_\u001f=c\u0015\u0017Y\n y\bL\u001f\u0004-o\u0013<\u001cS'8s";
        objectArray[35] = "XP(Jf\u0010OW Y\n\u0015\\@tRq\u00021\u0005dC2P\tC`Kso\nCr\u00105WLGzQ\n";
        objectArray[36] = "bXzw\u0013\u0003=\u0005c(i\u00168rl:2\u00195Ql<\byg@j~VA!Db?iB!V9yQ\u0004%^xFR\u00047\u0005>~\u0014\u0000?D\u0001";
        objectArray[37] = "\u0015\f<E\u0000eD\u0017,_}A\u001e\u0001`UEmm\u0011\u0011\u00197.h\u0017\"X\u001b\"L\u001b\u001aj;vU>\u0010\u001e\u0007XV\f5`\u001aAoH5\u001d\u001e E-k\u001e@[T\u001f,d9s\u0010\u001b=F$MO\u0010\u000ffLxn\u001b\u0017\u0018\u000ff\u001f\u001b\u001b_/\\i\u001c\u001aG,Ts\"iC\u0019X}\r\u001cV\u0007'MK\u0002$D$]J9\u001c\u0013t@\u0010P\u001f\u0000t\u0017OhY\u0004|Vp";
        objectArray[38] = "$@c\u0011\b\n{\u001dzNr\u001f~xcM*\n}JbI\u0017p!Xs\u0018MHg\\{YrM+K!\u001e\u000f\u0012 \u0014  ";
        objectArray[39] = "RP{\u00144\u0006\r\rbKN\u0013\b~g@6\u001d\bX[E'\u0010\u0001O\u0000\u001e3\u0017T\n8X7\u001f\u00155=\u0014 ERHb\u001f\u007fDl";
        objectArray[40] = "\u0006\u000eCJ7\u001eYSZ\u0015M\u000b\\0X\u0012!\tB0_\u00067\u000fUk\u0003\u0006&\\\u0007SE\u0002.\u001d8\u0001W\u001b1X\u0006\u000bF\u0012&d\u0005ZVBs\u0019ZQ\tCM";
        Object[] objectArray2 = objectArray;
        objectArray[41] = "2w\u001b^\u000e?m*\u0002\u0001t*hY\u001a\u0002\u001d9aJ\u001a\b\u001b?ew`T\t.4-X\u0012\r&u\u0012";
    }

    public static Exception a(Exception exception) {
        return exception;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x372D;
        if (h[n2] == null) {
            m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.h[n2] = (int)(g[n2] ^ l);
        }
        return h[n2];
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(int n, int n2, int n3) {
        GL20.glAttachShader((int)n, (int)n2);
        GL20.glAttachShader((int)n, (int)n3);
        GL20.glLinkProgram((int)n);
        GL20.glDeleteShader((int)n2);
        GL20.glDeleteShader((int)n3);
    }

    public static int m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(String string, int n, int n2) {
        int n3 = GL20.glCreateShader((int)n);
        StringBuilder stringBuilder = new StringBuilder(m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.m$$UD7ROvfds8eSLXTG6vFB5dMAk03jHsUBu1KaB53SssE88CDOeckX81eRT6PjPm2YrQ9SGBl2MktJN9NQCcSyIDqosm1lM6S7x(string, ((1684144596 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n2) ^ n2 + 31) >>> 13 | (1684144596 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n2) ^ n2 + 31) << 19) ^ 0xBAB69F8E));
        int n4 = stringBuilder.indexOf("\n") + 1;
        try {
            if (n == Integer.reverse((0xDCF54247 ^ n2 << 3) + 12236447 ^ n2) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) {
                stringBuilder.insert(n4, m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.m$$UD7ROvfds8eSLXTG6vFB5dMAk03jHsUBu1KaB53SssE88CDOeckX81eRT6PjPm2YrQ9SGBl2MktJN9NQCcSyIDqosm1lM6S7x("util.frag", ((85822369 - (((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n2) & 0xFF) << 2) ^ n2) - (((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n2) & 0xFF) << 1) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) - ((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n2) & 0xFF)));
            }
        } catch (RuntimeException runtimeException) {
            throw m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.a(runtimeException);
        }
        GL20.glShaderSource((int)n3, (CharSequence)stringBuilder.toString());
        GL20.glCompileShader((int)n3);
        int n5 = GL20.glGetShaderi((int)n3, (int)((35198 + (n2 & 3) ^ 0x200) - (n2 & 0x10000) ^ 0));
        try {
            if (n5 == 0) {
                throw new RuntimeException(new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("Failed to compile shader \u0001"));
            }
        } catch (RuntimeException runtimeException) {
            throw m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.a(runtimeException);
        }
        return n3;
    }

    public void m$$usnzfPeWGy6iAn1uPJLR6UgsJVhf38ORt1lPLe11bmnTdwQdPcmX3d47CHJiqfOhVCdu73R8QDlxYkQQkQDkuxD5AsqWq6mRg(Runnable runnable) {
        GL20.glUseProgram((int)this.m$$svfo8KkcOrI7TA6Gz7eSncykqTDjiKBaByTrMbDsGoGWDbQqrJWhL36kixEoIm6GS9nr7g3b3UDyxyZQZRbdovJ4P01kRvIx7);
        runnable.run();
    }

    public static String m$$InhlxqaQrbKNMU4Ql7kGh8Uul5ioPfxqyUIqX1trNcTaGWsMG2V2s71MrNqtr2IBgiykqSQxqXXz7axtSTGgqvgaXUo46Cr70(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{73, -35, 70, 59, -46, 107, -52, -91, 90, -111, 69, 25};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 12]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public void m$$3i5J2fl4fjYuFi9jC1MwJTBH18yjBjk4oLCW1HEl8sqNGAHOm8SZgV8qb86ohOPmMJIz6gvOfsPwHAplsyRc8Hbwy2YUO5r9w() {
    }

    /*
     * Loose catch block
     */
    public static String m$$UD7ROvfds8eSLXTG6vFB5dMAk03jHsUBu1KaB53SssE88CDOeckX81eRT6PjPm2YrQ9SGBl2MktJN9NQCcSyIDqosm1lM6S7x(String string, int n) {
        try {
            InputStream inputStream;
            block6: {
                inputStream = m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.class.getResourceAsStream(new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("/assets/mio/shaders/\u0001"));
                if (m$$9IjIArk4dMmdk4lpPjjPrxY6hRqML14mQ7HMUN8LfgQ4qZfy5lHLSc7pj5N7MhkvgHJKKN6iaWyg8aaJ6GgHilJSSi6afUaEP) break block6;
                try {
                    block7: {
                        if (inputStream != null) break block6;
                        break block7;
                        catch (IOException iOException) {
                            throw m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.a(iOException);
                        }
                    }
                    throw new AssertionError();
                } catch (IOException iOException) {
                    throw m$$Bn6qQgFqPhYU76vE9YcEBTObCun0ptBzBmgsuPBGJMNjoy5tfgg7Anlr8rJZKJfSiKkyoIqYLnDCuH8io8NVbn6tpHDtmbGOD.a(iOException);
                }
            }
            return IOUtils.toString((InputStream)inputStream, (Charset)StandardCharsets.UTF_8);
        } catch (IOException | AssertionError object) {
            ((Throwable)object).printStackTrace();
            return "";
        }
    }
}

