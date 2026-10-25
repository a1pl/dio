package me.mioclient;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$Vur9adbRCqvxTgULAJyE3dNz3IAmfrfUNDtB2FxsFuY4cPYHLtTZcodf2xac7SMMEgud72NrjNrKUCB6VYasuDePTvG1wniwO;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$cFy0S2bS7U2m7bzc3O5IB0USk2GXplPOWMwkPbtlcMqUPwZdqWrImGD45wOTIHxHoiuNbH5qx8JEe1cGK4OtWr7Feso78ZhRo;
import me.mioclient.m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud;
import net.minecraft.class_124;
import net.minecraft.class_151;
import net.minecraft.class_2561;
import org.apache.commons.io.FileUtils;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk {
    public static final m$$Vur9adbRCqvxTgULAJyE3dNz3IAmfrfUNDtB2FxsFuY4cPYHLtTZcodf2xac7SMMEgud72NrjNrKUCB6VYasuDePTvG1wniwO m$$3zc8Zq22xcaMFUP7SFv3DhjgmbXGZB8JiLCuLCTCNZwtdBcPIiShNgXFdqlAdyDIOmWzJ5yeKvm8rw3a8NVMFZ8jwmSWfONE4;
    public final m$$cFy0S2bS7U2m7bzc3O5IB0USk2GXplPOWMwkPbtlcMqUPwZdqWrImGD45wOTIHxHoiuNbH5qx8JEe1cGK4OtWr7Feso78ZhRo m$$h5410bvoOTbCZUMTB6bEn66OSLrdlefUJd5JRCi5vsFEUe7SDJrX3TL9ijpbNMjwgzaBgc0vEROdvFNC0XjBOeXBgVrSHMGKS;
    public final List m$$r73E3JgLvakLF9G1ZeepTDcjKBEmJRHX9CJ0EGRRNrLMbb3gbzrYRlBNOnhqB50d7AToZe1xTfO4DiJQUDvjDoLM2dY8ZM0Ky = Collections.synchronizedList(new ArrayList());
    public int current = 0;

    public m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk(m$$cFy0S2bS7U2m7bzc3O5IB0USk2GXplPOWMwkPbtlcMqUPwZdqWrImGD45wOTIHxHoiuNbH5qx8JEe1cGK4OtWr7Feso78ZhRo m$$cFy0S2bS7U2m7bzc3O5IB0USk2GXplPOWMwkPbtlcMqUPwZdqWrImGD45wOTIHxHoiuNbH5qx8JEe1cGK4OtWr7Feso78ZhRo) {
        this.m$$h5410bvoOTbCZUMTB6bEn66OSLrdlefUJd5JRCi5vsFEUe7SDJrX3TL9ijpbNMjwgzaBgc0vEROdvFNC0XjBOeXBgVrSHMGKS = m$$cFy0S2bS7U2m7bzc3O5IB0USk2GXplPOWMwkPbtlcMqUPwZdqWrImGD45wOTIHxHoiuNbH5qx8JEe1cGK4OtWr7Feso78ZhRo;
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
                                m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.g = new Object[71];
                                m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.h = new String[71];
                                m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.a();
                                var21 = new String[4];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz("DNVpsD5omZvSKNhOF6St", MethodHandles.lookup(), "m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz", m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.class, 1934320609);
                                var20_3 = var18_2.length();
                                var17_4 = 33;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 100;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz("mz8fRTNSLntMfxBfEdLn", MethodHandles.lookup(), "m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz", m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.class, 695593824);
                                    var20_3 = var18_2.length();
                                    var17_4 = 25;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 108;
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
                                            v15 = 2;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 84;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 120;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 71;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 1;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 47;
                                            break;
                                        }
                                        default: {
                                            v15 = 92;
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
                        m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.a = var21;
                        m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.b = new String[4];
                        var8_7 = 4001122452355489047L;
                        var14_8 = new long[20];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz("KrUV5HZkOmtMlMVYHVRk", MethodHandles.lookup(), "m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz", m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.class, 524578712);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz("nMlvNexWIvxsXAoSpFxE", MethodHandles.lookup(), "m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz", m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.class, 2011446243));
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
                            var12_10 =  /* dynamic constant */ (String)m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz("OJCww7O1TgyxBX7nTxjd", MethodHandles.lookup(), "m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz", m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.class, 826169800);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz("pVIKyMuJwYXI7ezNJvjv", MethodHandles.lookup(), "m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz", m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.class, 261645843));
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
                m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.c = var14_8;
                m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.d = new Integer[20];
                m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -960624;
                var0_14 = 259374601995656810L;
                var6_15 = new long[3];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz("vXceObjD2ovtQfUdnrWS", MethodHandles.lookup(), "m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz", m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.class, 1325265682);
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
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz("2uFzZIRXuXlDcpyaMPvs", MethodHandles.lookup(), "m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz", m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.class, 1801095329));
            v22 = var3_16++;
            ** while (true)
        }
        m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.e = var6_15;
        m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.f = new Long[3];
        m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)1951882023076066318L);
        m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.m$$3zc8Zq22xcaMFUP7SFv3DhjgmbXGZB8JiLCuLCTCNZwtdBcPIiShNgXFdqlAdyDIOmWzJ5yeKvm8rw3a8NVMFZ8jwmSWfONE4 = (m$$Vur9adbRCqvxTgULAJyE3dNz3IAmfrfUNDtB2FxsFuY4cPYHLtTZcodf2xac7SMMEgud72NrjNrKUCB6VYasuDePTvG1wniwO)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$Vur9adbRCqvxTgULAJyE3dNz3IAmfrfUNDtB2FxsFuY4cPYHLtTZcodf2xac7SMMEgud72NrjNrKUCB6VYasuDePTvG1wniwO.class);
    }

    public void reset() {
        this.current = 0;
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x5044) & Short.MAX_VALUE;
        if (f[n2] == null) {
            m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.f[n2] = e[n2] ^ l;
        }
        return f[n2];
    }

    public static Exception a(Exception exception) {
        return exception;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2669;
        if (d[n2] == null) {
            m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }

    public static void a() {
        Object[] objectArray = g;
        g[0] = "\u0000m[H}N\u001eeA\u0007\u0010T\u0006`HJ'R\u0005b^";
        objectArray[1] = "+\tpC\u001025\u0001j\fr.2\u001c";
        objectArray[2] = "t14\u0005>Kt1#Y2Dnz#G2Qi\u000br\u001ek\u0011";
        objectArray[3] = "s/D\u000f!8s/SS-7idSM-\"n\u0015\u0001\u0013x";
        objectArray[4] = "7D%j:&9Mbb==tL/#\u001a05smf6\u000eiXdq%*\u0012nsLd\u000bkQRj<;\"FGtg3#Q>O;\u000b Jcfe#iB;e\u0016+(oq_*zmH]p2x-P;N+q8@Ai2x\u0002Bi^\u0019\u0002jF;ff3\u001dTHHa~\u001cNrd$";
        objectArray[5] = "nL8Nd&eC)\u0001\u0019>vD H";
        objectArray[6] = Integer.TYPE;
        m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.h[6] = "java/lang/Integer";
        objectArray[7] = Void.TYPE;
        m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.h[7] = "java/lang/Void";
        objectArray[8] = "I\u0000/7BgW\b5x\u000f}M\u0002,$\u001ewM\u0015w\u0002\u0004`F\u0000=\u001a\u0003qB\r\u000b7\u0002vL\f";
        objectArray[9] = "Etr2}^N{c}\u001cPEpg'";
        objectArray[10] = "\u0019P!-\u0014\u000f\u0017Yf%\u0013\u0014ZX+d\u0010\u0007\u001e\u0002c\u000f:\n\u0016[_+\u001a%9Tm\u0001\u0018\f<A^\b\u0015\f:fD-I\u00126\u0002j0-\u000f\u0013_I&\u0010\b\u0017q\\1H$\u001b]9\u0016.YLqa\u0013E\n\u0003azw\u001bQM\u0004K/4T\u0001\u0003}$\u0015\u0013\u0007M~8)\u0006\u0001wA1%\u0019=Vf\u0006H";
        objectArray[11] = Boolean.TYPE;
        m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.h[11] = "java/lang/Boolean";
        objectArray[12] = "\u0000dL b8\u000bk]o\u000e;\u0005i_ \"";
        objectArray[13] = "\u0013f\u0019>YcfF\u00121H,\u0007H\u0019:Lvs";
        objectArray[14] = "@\u001e{}&8C\u0010#za:OQ]}|>";
        objectArray[15] = "YCP ?z\\\f`(}v";
        objectArray[16] = "E Os\u001aNK1@8U]E?E2\u0015M\u0004;Gs=WF7})\u0012RY";
        objectArray[17] = "R%*I\u000foQ+rKI`J79\\\u000fBP%.[Du";
        objectArray[18] = "\u0000\u0001]oDT\u0003\u000f\u0005h\u0003V\u000fNmg\u0006_\u0019";
        objectArray[19] = "\u0016?\u001a<jRc\u001d\u001922U$\u001f\u0015s}G9\u0001\u0019?iG(]64pV\f\u0007\u0004/uQ8\u0007\u0015f";
        objectArray[20] = "/K\u001b0F(1C\u0001\u007f+2)F\b2\u001c4*D";
        objectArray[21] = "\u001fY0\n5Q\u001fY'V9^\u0005\u0012'H9K\u0002cs\u0010n\u0001";
        objectArray[22] = "il\u001a4\fIil\rh\u0000Fs'\rv\u0000StV\\/W\u0011";
        objectArray[23] = "kwo\u0014@\u0005e~(\u001cG\u001e(\u007fe]`\u0013i@'\u0018L-5k.\u000f_\tN]92\u001e(7b\u0018\u0014F\u0018~u\r\n\u001d\u0010\u007fbt1A(|y)\u0018\u001f\u00005qq\u001bl\bt\\;!PY1{\u0017\u000eH[qcq0QRds\u000b\u0017H[^q# c!6uq\u0018\u001c\u0010Ag\u00026\u001b]@}8\u001a^Nk6e\u0003\\\u0013aW\u0019J{\u0013Afr/E\u001bQ!y\u0017A\u0007q*\u0015:^\u000bw#\u0003\u001c@%\u007f^\u0000JC\\^S#\u000fq#iw\u0002JgX^*6,\u0011\u0006bt\u0018\n\u0019\u00000x6\u001e\u001b>l` Je2c%6,s&CW \u0003X\u00190|\u0002IqRQ+\u0007A";
        objectArray[24] = "S\u001baNqr]\u0012&Fvi\u0010\u0013k\u0007IJsK*e(V\u0006G\u001fyNTj\u001d,hi)|HyUH/qG\u0002SlLI\u0019'\u0017WH\bL\u001dvr+gKvV[.y9:\u0014ZSH0,rh.KFvp(T|\u000b\u007feRrD7#N,mO\u0019;aLKX?\u0004evIYK\"M^";
        objectArray[25] = "bX~D]t\u0017xuKL;j`fLEr\u0002";
        objectArray[26] = "HiWOT}Hi@\u0013XrR\"@\rXgUS\u0016S\f$";
        objectArray[27] = "I;\u0013Po\u0000W3\t\u001f'\u0000M9\u0011X.\u001b\r\u000f\u000bP3\fl*\u0000C \u0001L(";
        objectArray[28] = "pjH*|\u0011~c\u000f\"{\n3bBct/H}\b\u000fr/)_S*@\u0010ug? b\fX}#\u001d\\\bU6\"\u000b|)-]\u0014\u0012|MkDP=s(.E6uW\u001b)\\V\u001d]8rXU\u0002~2HF\u0002 T?Oz\u0016qB\u0016tA\u00174G1|=\u00043x*x7\u001e6!\u000fu;\u0017\u000fx";
        objectArray[29] = Long.TYPE;
        m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.h[29] = "java/lang/Long";
        objectArray[30] = "xa\u0013[]\u0011vhTSZ\n;i\u0019\u0012n\u0011`mhp_\u0006$|EPD<Vrha|JZ`eT\u0007\u000fo5\u000bYS\u001aAIyRYM!noRx1}v_bg\u0006O^ISU:Eq\f~LH#^hCN\u001bQuvts\u0004wPmN}L[E^DY\u0004#Mppe\tDp\\qy";
        objectArray[31] = "\u000b\u0003<(\u0002y\u0000\f-g~`\u000f\f++@p";
        objectArray[32] = "- \u0014Vr!#)S^u:n(\u001e\u001fa\f\f\u0013b]-z\u0016\u0001rc~&\u0005<]\u000e+\u0001)\u0001j_]\u0005s#\nyK\u00176wOj*:t\u0012W\n]%\u0013\u0007`c.\u001b7?TSX\t\r\u0010Y~I\u0017\u001a\"~PBv7.\\A#-34MkKz\f lY\u007f>/2cIo\u001c\u0005unAp";
        objectArray[33] = "\u0015}p {\r\u001erao\u0013\r\u0010}r";
        objectArray[34] = Float.TYPE;
        m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.h[34] = "java/lang/Float";
        objectArray[35] = "N\u007fUw%\u001d@v\u0012\u007f\"\u0006\rw_>\u0001\u001flM\"I\u00034d`\u001f-\u00014tpJY\u0002FAk?Vu\u0011\u0017oIt\r>Fy\u0011\"+\u0014\u0010jL^\u000b\u0002Pl\nu&\u0003EL2@\u001b\u0013DxN|\u0002Gvt!P+#zP\u000b\u007f.\u001fS\"\"t/\bNY?M\u001b\u000b[T\u0001u$=\u001bL)q*";
        objectArray[36] = "(l@\u001949#cQVY=#\u007fe\u001dk 'cU\u001d";
        objectArray[37] = "YNO\t0_[G\u001d\bAUN\f\u001f\u0016#y\u0006M].}@\u000bJ\u001e\b+L\u001bz\u001d\u0016%A%p\u0011#3N\u0007Iq0}}\r\u001eF18y\r\u0011J\u0011+J\u0010j|[\u0010\u0000SCf\u0016\u000f\n\fjM!(\t/gFP\"NYO\u0018\u0017q^8C\u0011VpZ\bE~*y\u000b\u0007xo.\u001cH\\i[j}\n\u0007LN\u0014}\u000e\u0018_ Vq_[MA\u0006|U\b \u001d\u00063TY\u001fJ\u0001?\u0001b";
        objectArray[38] = "GC\u0011nkeGG\u000e}\u0005e\u0012\u001d\toBu{G\u001am:c\u001eF\u0004ax\u001bGC\u0011nkeGG\u000e}\u0005";
        objectArray[39] = "\u0002[\tyh\"BP\u000bw\u0001'BGL$g0?\u0000Pv1%Q@[t?L";
        objectArray[40] = "#tbts1w6wbHj0haz%I\u007f\u001fRm*in/ZZ4o  HS:~X)3]+DX*5b*Ow\tNV\u0014JM=gzvf@&G_0>,\u0016{p\u0017Ueyd}\u00160d\u0004D~\u0001Ps5@pr7S>Ky\u00102v?Y[(\u007fR\u001eqA\u0005LE|r\u0010t?s}fq$2y.\u000b/7?,!y++vrD";
        objectArray[41] = "<\fwkNh7[si3*2(hi^V<\u0019q=Vo<\u001dmp3";
        objectArray[42] = ")\u0018&\u0019\u0002i\"O\"\u001b\u007f--\t?\u001b\u0001:@Nb\u001a\u00139>Nf\u0005\u0000W)\u0018&\u0019\u0002i\"O\"\u001b\u007f";
        objectArray[43] = "9>\u000e\r\u0017.,\"\u001d[m) #d\u0001\u0001!9~[V\u0006-lE";
        objectArray[44] = "\u0000x=\u0002RYS\u007f=\u001a>S]-,\u0007>\u0005U2!F\u0001RR>t}";
        objectArray[45] = "\u0016&frgvL't+\u0017\u007f\u0014yfgIx\u0014cb\u001bqa\u0012pck},Ho\u000f";
        objectArray[46] = "7MQ&1)7IMkT}.SRj/\u0010aM\u0019&1beQPxT";
        objectArray[47] = "*t6\u001a\u007f\u0002-(7[\u0012\u001da:(\u0017c\u0017\u0000Fa0c71-\u0004\u000ek'v&<\nw\u0007}J\u0011\u0015{\u0001t\\7\u000bU\t\t_a\b,(\u0004|$:S\u001f ]a,((}i\u0007Zv\u0014#G!RpF/i5PN\u001a7\u007fa.B\u0015ri\u00078V5\u0000\u007f(\u0013iF+]b:\"'|Xjjv\u0003'' \u0017c\u001f4qZV\"\u0017t{;\u0006/\u001d'\u0016g\u0006`\u001cv)0\u0001lIM";
        objectArray[48] = "M7N \u0011\u0015M3Q3\u007f\u0010\rdQ0\u00044\u0010qKLCQ\u0014aE2CU\u000br+s\u0000[AhYw\u001c\u0012\u001f\r";
        objectArray[49] = "\u001a\u0004 \u001c#!\u0007Yt\u0013GxV\u0015;\n6r7ir-6R\u0006\u0002\u0017\u0013>BA\t/\u0017\"bJe\u0002\b.dCs$\u0016\u0000l>pr\u0015yM3S7'\u0006z\u0017rr1}MJF\u0014G#q\u0014h2O%#\u0018F&M\u001b\u007f\u0000Pr3\u0017pEF\u0014%\u0003P7P;\u000e<#\u001crq'wBKwyw.w\u0004_4I% \u0000]I\u0017's\nE;\u00106%\u00019 \u001d9{\u0007\u0007+J=yz";
        objectArray[50] = "$3j\u00017\"*-8\bV=(!1\u001e:\u000f\u007fboHjX'g/\u001bg&t`j\bV9+f)\u0018,754 y";
        objectArray[51] = "\u001b WIzdH'WQ\u0016~CjB6*5M!BWz8Gr/";
        objectArray[52] = "h\u0015u\u00116*8^3FVvk\u0013oN:D:T3\u0016n\u0013:UjE8m:QuVVrhTwH,|v\u0006~)";
        objectArray[53] = "b+\u0018F+\u0001f6\u0005LI\u001c6:\u0014M%.b~E\u0015vya{\u0019D$\u0015:{\u001f\u0014I@6*\u0018H1D+7\u0012*";
        objectArray[54] = "0@Tk7kcGTs[ed\u0004,(ke0\u0015Mxfocx\u0012z45q\u001d\u0013d8w\t";
        objectArray[55] = "N\u0018s9&MN\u001cl*H]\u0015Xs<4O\u001fN\u0016d!B\f\u001dg8wXB\"*o-_\u001c\\*k2Lr";
        objectArray[56] = "\u0014O,pA[\f\u001fxk-Q\u000b|!`BT\u001dLF0R\u0000@E44NI\u001e ";
        objectArray[57] = "36D_po8$\u001fcur3#B\u0019ie4:O\u000fJb.4\"Z6{*$C\t1{2H\u001b[v|9)H\\vdU";
        objectArray[58] = " A\r2i\u001fzAM \u0007\u0014'D_\u0016f\b'V3;x\u0016zH\n;|\n7-Y/~\u0004-BZ0|SJ\u0014\u000b*x\u0002+G\f*`n";
        objectArray[59] = "Ve-u\u0019\u001e\u0016n/{p\u0016\u0006sn\u0004\u0016\fk?\"*I\u001d\no/ \u001apW3}|\u001d\u0011\u0007>w/p";
        objectArray[60] = "9[2H4\u0001cT(GYUp\u0018\u000bb3r?Z0b!\\aRmdbP\u001em\u0000\u00109[1\n\u0015V Q1E\u0002s\"Ami\u0002g(Z\u0007\u0005aL>z`u!v\u001cHe\f\u001eJ\u0010@\u001co\u001dm$B0_7W\u0005i6Y\u0012T\u0006q5w\u0013D\u001et\u001b\u0004(h!u\u000e\u000b\u000ev+\u0000\u0002U\u001a-e\u00003\r=L5\r9^P\u0011cU0Z.\u0011gJ#4";
        objectArray[61] = "< \u0001jnL4>K>\u0001[-)\u0012}l~6 \u0016\u0001hZ)\"\u0006?c\r- {m>Q3x@>bA(D\u0012k\u007fV*z\u0019<{TW";
        objectArray[62] = "N\u0006\r\"hZ\u001d\u0001\r:\u0004R\u001bR<9`;\u001a\u000e\t64R\u001b\\\u001ba\u0004\u0004\b\u000eE8v\u0000\u0014G\u001b]";
        objectArray[63] = "\u0011\u001a\u0019qP[K\u001b\u000b( ]\u0011^:y\\G+E>|GU\u000b\"L(O\u0005\u001aC\u001c%EVwD\u0000zNP\u0007HM Q<";
        objectArray[64] = "/\rwb\u0002\"{Obt9s}A@o]a}= hV#hX!vZa\u0010";
        objectArray[65] = "\u0004p.}kRZ{dy\rrWg%05^$wT|G\u001d!qg=k\u0011\u0005}_\u000fKE\u001cXU{wk\u001fjp\u0005jr&.pxn\u0013\fK.{0h\u001dyi\u0001I@Y}x#T~\u0006vJ\u0003<K'}R}\u007fUV}^:_o z_\"\\g:D,&ik4kY3w\u0014\u0004-GAn\u0011\u0002*z,=L\u0004x\u0015}=C_{t-0I\f\u0016";
        objectArray[66] = "3uIF\u00061`rI^j1q\u0000TA\u0016!\nrN\tZ5xvR@\u0004P";
        objectArray[67] = "\u007f|\raEw}u_`4}h>\\lvJ<#\u0000nrT\u0018*!`et'*(eQG--\u0003>fI$w\u0004Hig6`:r[F5S\u0010Gvy\n,\u0001dDc>_\u001fnYs'J;rde;K>mIG\"k.~HR;v%@h]\u0006(:|qu+-\u0010|{B!-;\u0002\b(++\u000fcX%!xbl\u000e\u007f:\u007f\u001f>I\u007f'\u0012";
        objectArray[68] = "\u0015\f\u0001$rH\u0017\u0005S%\u0003B\u0002N\u001c:rHc2U\u001drhRY0#zx\u0015R\b'fX\u001e>%8j^\u0017(\u0003&DVj+U%=wg\b\u0010\u0017B@C)U\u00019w\u001e\u001d3wgK@3\u0015\u007fa\u0019L\u001d\u0001}_ET\u000bU\u0003SJ\u0011\u001d3\u0015Gjc\u000b\u001c>x\u0019H)V\u00173x\u001f,^Gm]TZ\u000e~=\u0016\u0012\rn)9@P\u000f\u0013{~@Mb\u00005qDM^W8`I._\u00025g\u001c\u0011\b\u000592'";
        objectArray[69] = "\u001ckT\u001cn\u001f\u001coK\u000f\u0000\u001bM)U\u0019k\f )\b\u0002x\u0010L M\u0002paXhC\bq\rQ-C\u0000\u0000]\u001a4]\u001e~]\u001e+Np";
        Object[] objectArray2 = objectArray;
        objectArray[70] = ":*Jw\u0005Ps~Ks:Vm!\u0010#SZT/\u00103W<59D~_N1%\r :";
    }

    public static String m$$yDi77rh1FpMT9YssznDdsa006M3XFhBL43WeOiYAf8n4VPgBb3cyXTR4sbVCm7XolBxbqyw71VNsD7SoocZwU8UWT7Y7V1nvz(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-64, -28, 118, 43, 114, -112, 56, 62, 70, -27, -34, 42, 80, -62, -47, -50, 117, -42, -54, 82, -113};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 21]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public String m$$SGbJkfhGpd5n5A3hJQX5hce6MsqieyZVsy9UZBybS99ioB4IySMp10FoAxHSEHuzdcorTQbeJqWIaKKaOLO8pMpMZ7VSz8ViB(int n) {
        try {
            if (this.m$$r73E3JgLvakLF9G1ZeepTDcjKBEmJRHX9CJ0EGRRNrLMbb3gbzrYRlBNOnhqB50d7AToZe1xTfO4DiJQUDvjDoLM2dY8ZM0Ky.isEmpty()) {
                return null;
            }
            if (((Boolean)this.m$$h5410bvoOTbCZUMTB6bEn66OSLrdlefUJd5JRCi5vsFEUe7SDJrX3TL9ijpbNMjwgzaBgc0vEROdvFNC0XjBOeXBgVrSHMGKS.m$$MPa3XRAaNMxaPQ8XziCCg2WBBxASFZf8kLSMz6taFTRq0Pmaf0tgvvVCS5vjLqNxSt8EpJXgFrRoIwu4SsLU05aHAF6XhxfMd.getValue()).booleanValue()) {
                return (String)this.m$$r73E3JgLvakLF9G1ZeepTDcjKBEmJRHX9CJ0EGRRNrLMbb3gbzrYRlBNOnhqB50d7AToZe1xTfO4DiJQUDvjDoLM2dY8ZM0Ky.get(ThreadLocalRandom.current().nextInt(this.m$$r73E3JgLvakLF9G1ZeepTDcjKBEmJRHX9CJ0EGRRNrLMbb3gbzrYRlBNOnhqB50d7AToZe1xTfO4DiJQUDvjDoLM2dY8ZM0Ky.size()));
            }
            return (String)this.m$$r73E3JgLvakLF9G1ZeepTDcjKBEmJRHX9CJ0EGRRNrLMbb3gbzrYRlBNOnhqB50d7AToZe1xTfO4DiJQUDvjDoLM2dY8ZM0Ky.get(this.current++ % this.m$$r73E3JgLvakLF9G1ZeepTDcjKBEmJRHX9CJ0EGRRNrLMbb3gbzrYRlBNOnhqB50d7AToZe1xTfO4DiJQUDvjDoLM2dY8ZM0Ky.size());
        } catch (Exception exception) {
            return null;
        }
    }

    public void m$$8JpYmgybiNGebvVqjTbUiQLS2FPMbXX9lngoIuY8L3HZxzqYnN5rexlIrvWw6cL9DcAhNKJWkiVM4sZgKaVUhUVFTQ4aDg1z0(String string, int n) {
        block8: {
            try {
                if (!((Boolean)this.m$$h5410bvoOTbCZUMTB6bEn66OSLrdlefUJd5JRCi5vsFEUe7SDJrX3TL9ijpbNMjwgzaBgc0vEROdvFNC0XjBOeXBgVrSHMGKS.m$$QtS7S0VREHLrTZ3s56BesbgJgXa5QkLCGr1IV0iiwd2MNFDRSkjeNUCeiMZm5z1GnpsNMcPWbxTDzjV0IzZgDQBozzbadUPS4.getValue()).booleanValue()) {
                    return;
                }
            } catch (class_151 class_1512) {
                throw m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.a((Exception)((Object)class_1512));
            }
            String string2 = this.m$$SGbJkfhGpd5n5A3hJQX5hce6MsqieyZVsy9UZBybS99ioB4IySMp10FoAxHSEHuzdcorTQbeJqWIaKKaOLO8pMpMZ7VSz8ViB((-968844958 + (~n & \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) ^ n >>> 3) - 344998540);
            if (string2 != null) {
                Runnable runnable;
                block9: {
                    string2 = string2.replace("{name}", string);
                    try {
                        if (m$$3zc8Zq22xcaMFUP7SFv3DhjgmbXGZB8JiLCuLCTCNZwtdBcPIiShNgXFdqlAdyDIOmWzJ5yeKvm8rw3a8NVMFZ8jwmSWfONE4.isToggled() && string2.startsWith((String)m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.m$$3zc8Zq22xcaMFUP7SFv3DhjgmbXGZB8JiLCuLCTCNZwtdBcPIiShNgXFdqlAdyDIOmWzJ5yeKvm8rw3a8NVMFZ8jwmSWfONE4.m$$kilrjY1P3wK7jREKfEoEIXZR4Z9mfcDIREqetgn5IoRZqx7BX4fMjwWuvUWvJxd7wHQhddJgIdSzxP8qVRkVzm4wJkOMRqlmr.getValue())) break block8;
                    } catch (class_151 class_1513) {
                        throw m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.a((Exception)((Object)class_1513));
                    }
                    String string3 = string2;
                    runnable = () -> m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$7tjAleuL4xab6jbtqR5tlyOX9AzvmaYR4Eg6nSqAg9bsbrzBT9Y89kNtF2fBeCa1EOn2kv3g0u8fRk949bbmVH03mPGLUp6As(string3, 25045421);
                    try {
                        if (!this.m$$h5410bvoOTbCZUMTB6bEn66OSLrdlefUJd5JRCi5vsFEUe7SDJrX3TL9ijpbNMjwgzaBgc0vEROdvFNC0XjBOeXBgVrSHMGKS.m$$ojKqblNjF6nIpnWxbENX3kk5fPmHyNcacHmVSlZYaYE5mkZyy4yC1X9CX9O1bV4muwqOqGAtz80UHKA2qK8ckBVBjaUDtTNGc.m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q((-265850189 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & ~n) ^ ~n) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & n))) break block9;
                        runnable.run();
                        break block8;
                    } catch (class_151 class_1514) {
                        throw m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.a((Exception)((Object)class_1514));
                    }
                }
                m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$0vQbZqUtpzH4dC5ha5T4zYvR5f7CLwBqCGSXbL0fuZzrL6FO0FFeXmuzn3U6ToSea1JUghd7nBKayU5jJa31OblbR72M0JvlZ.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(runnable, (int)(((Float)this.m$$h5410bvoOTbCZUMTB6bEn66OSLrdlefUJd5JRCi5vsFEUe7SDJrX3TL9ijpbNMjwgzaBgc0vEROdvFNC0XjBOeXBgVrSHMGKS.m$$ojKqblNjF6nIpnWxbENX3kk5fPmHyNcacHmVSlZYaYE5mkZyy4yC1X9CX9O1bV4muwqOqGAtz80UHKA2qK8ckBVBjaUDtTNGc.getValue()).floatValue() / Float.intBitsToFloat(((-116493363 - (((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF) << 2) ^ n) - (((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF) << 1) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) - ((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF))));
            }
        }
    }

    /*
     * Loose catch block
     */
    public void m$$9CfHjbrlg3lojvzMCur3pT97wrs5DycHxtyGDkWIYydsdQHR12da1jLKeR7NhqPxNFjETsEDoDPgJQaA8s40JZucSUhtkV6u1(boolean bl, int n) {
        block14: {
            block13: {
                if (((Boolean)this.m$$h5410bvoOTbCZUMTB6bEn66OSLrdlefUJd5JRCi5vsFEUe7SDJrX3TL9ijpbNMjwgzaBgc0vEROdvFNC0XjBOeXBgVrSHMGKS.m$$QtS7S0VREHLrTZ3s56BesbgJgXa5QkLCGr1IV0iiwd2MNFDRSkjeNUCeiMZm5z1GnpsNMcPWbxTDzjV0IzZgDQBozzbadUPS4.getValue()).booleanValue()) break block13;
                try {
                    block15: {
                        if (bl) break block13;
                        break block15;
                        catch (Exception exception) {
                            throw m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.a(exception);
                        }
                    }
                    return;
                } catch (Exception exception) {
                    throw m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.a(exception);
                }
            }
            Path path = m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud.m$$1Jocco1AD2WpOiJ1ofUNSpw4PU8F6VhnJKQEZKGeY0mlEf83hXpjklLPkIy1R3SiA26QxcQMUj7r4zwElxRhnvUc0buooY5Sv.resolve((String)this.m$$h5410bvoOTbCZUMTB6bEn66OSLrdlefUJd5JRCi5vsFEUe7SDJrX3TL9ijpbNMjwgzaBgc0vEROdvFNC0XjBOeXBgVrSHMGKS.m$$88rDF6sB0uUiuG9GM4LGroUwV2y9uzB8TvK2UZftqsa05xj03gSNYrjMKNl2ZsSFzJDcwqjnxTbsbg82GIb2YNHeTYwRgGO0P.getValue()), new String[]{".txt"});
            try {
                try {
                    if (!path.toFile().exists()) {
                        throw new IOException("KillSay file %s not found".formatted(this.m$$h5410bvoOTbCZUMTB6bEn66OSLrdlefUJd5JRCi5vsFEUe7SDJrX3TL9ijpbNMjwgzaBgc0vEROdvFNC0XjBOeXBgVrSHMGKS.m$$88rDF6sB0uUiuG9GM4LGroUwV2y9uzB8TvK2UZftqsa05xj03gSNYrjMKNl2ZsSFzJDcwqjnxTbsbg82GIb2YNHeTYwRgGO0P.getValue()));
                    }
                } catch (Exception exception) {
                    throw m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.a(exception);
                }
                this.m$$r73E3JgLvakLF9G1ZeepTDcjKBEmJRHX9CJ0EGRRNrLMbb3gbzrYRlBNOnhqB50d7AToZe1xTfO4DiJQUDvjDoLM2dY8ZM0Ky.clear();
                this.m$$r73E3JgLvakLF9G1ZeepTDcjKBEmJRHX9CJ0EGRRNrLMbb3gbzrYRlBNOnhqB50d7AToZe1xTfO4DiJQUDvjDoLM2dY8ZM0Ky.addAll(FileUtils.readLines((File)path.toFile(), (Charset)StandardCharsets.UTF_8));
                this.current = 0;
            } catch (Exception exception) {
                try {
                    if (!((Boolean)this.m$$h5410bvoOTbCZUMTB6bEn66OSLrdlefUJd5JRCi5vsFEUe7SDJrX3TL9ijpbNMjwgzaBgc0vEROdvFNC0XjBOeXBgVrSHMGKS.m$$QtS7S0VREHLrTZ3s56BesbgJgXa5QkLCGr1IV0iiwd2MNFDRSkjeNUCeiMZm5z1GnpsNMcPWbxTDzjV0IzZgDQBozzbadUPS4.getValue()).booleanValue()) break block14;
                    m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)String.valueOf(exception)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("Failed to update KillSay lines: \u0001")).method_27694(class_25832 -> class_25832.method_10977(class_124.field_1061)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q((-26411699 + (n & 3) ^ 0) - (n & 0x10000) ^ 0x1000000), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$c1YNZKIre9gha2PNXbjm2rL0bzZp8E5g5prysSUtCYmEx3s7kIMTKClUco1iXIJiAjIYkbL0q1wjtfH7ltIhAh8GLO8gPQEeU);
                    Files.createFile(path, new FileAttribute[0]);
                } catch (class_151 class_1512) {
                    throw m$$zBLVXf64VDHXehEyg50OiDPdFK3f0BPYv2uQ1t4Wm1FkSBZX5UwznhCGMUcERYZgDkY8wkfz8csqwPP4LeVbdpowYrtRE0Tzk.a((Exception)((Object)class_1512));
                }
                {
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
            }
        }
    }
}

