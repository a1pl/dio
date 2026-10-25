package me.mioclient;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$;
import me.mioclient.m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ;
import me.mioclient.m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1297;
import net.minecraft.class_151;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_591;
import net.minecraft.class_630;
import net.minecraft.class_742;
import net.minecraft.class_7833;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3
extends m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM {
    public static m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF m$$LB8GocoEEtUIwNSavwJCrcj06IjKi4zBa63SW6fRDujippKQhN11UpmpfUCptIXB8YVSUZTz7q0kcjcaWpCGB4SbMUIy9j4Pp;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$0cQZzd4pwn6bU5W6nXDGrXtigyGUUFvOpyowI4nsnPofLjvHxdAG4z5NkpLBIJE7B7ujWbCkaiwC5yhGL6bLmL8OJFJviqcRh;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$FJxxEyJRXqjTtaepeoPkPwBHkQm7TU7syHAkaHddETgnZbZYaDU92LYVl7ySZwBxOcZKbZuwI2PS8hqZdOXyueuEKqnU9iDCL;

    public m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3() {
        super("Skeleton", "Draws skeletons for players.", m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ.m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr, new String[0]);
        m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.Xx3bJrDrRb9yiyRyGdbDeP54LarzgFWfCZfTLoRwpO8Unt9v2uefnlVtxpsFnGNmh763TSApbXpcY9ELTWzI4uurJwUuJUC6zT1l(this);
        this.setDrawn(false, 1704271651);
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
                            m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m = new Object[75];
                            m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.n = new String[75];
                            m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.f();
                            var21 = new String[2];
                            var19_1 = 0;
                            var18_2 =  /* dynamic constant */ (String)m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G("2WvVQjSLmCtIlVCrkV2x", MethodHandles.lookup(), "m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G", m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.class, 1845178823);
                            var20_3 = var18_2.length();
                            var17_4 = 28;
                            var16_5 = -1;
lbl10:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl12:
                            // 1 sources

                            while (true) {
                                var21[var19_1++] = new String(v0).intern();
                                if ((var16_5 += var17_4) < var20_3) {
                                    var17_4 = var18_2.charAt(var16_5);
                                    ** continue;
                                }
                                break block27;
                                break;
                            }
                            v1 = ++var16_5;
                            v2 = var18_2.substring(v1, v1 + var17_4).toCharArray();
                            v3 = v2.length;
                            var22_6 = 0;
                            v4 = 76;
                            v5 = v2;
                            v6 = v3;
                            if (v3 > 1) ** GOTO lbl70
                            do {
                                v7 = v4;
                                v5 = v5;
                                v8 = v5;
                                v9 = v4;
                                v10 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v11 = 58;
                                            break;
                                        }
                                        case 1: {
                                            v11 = 117;
                                            break;
                                        }
                                        case 2: {
                                            v11 = 82;
                                            break;
                                        }
                                        case 3: {
                                            v11 = 111;
                                            break;
                                        }
                                        case 4: {
                                            v11 = 73;
                                            break;
                                        }
                                        case 5: {
                                            v11 = 96;
                                            break;
                                        }
                                        default: {
                                            v11 = 25;
                                        }
                                    }
                                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                                    ++var22_6;
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
                            } while (v6 > var22_6);
                            ** while (true)
                        }
                        m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.e = var21;
                        m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.f = new String[2];
                        var8_7 = 4572268983475670993L;
                        var14_8 = new long[59];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G("ijzqZGOOMTgtRzrXoCFc", MethodHandles.lookup(), "m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G", m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.class, 1873303453);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G("P5fu1IDGcpw7vjPLWKf3", MethodHandles.lookup(), "m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G", m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.class, 746363599));
                            v12 = var14_8;
                            v13 = var11_9++;
                            v14 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v15 = -1;
                            break block28;
                            break;
                        }
lbl93:
                        // 1 sources

                        while (true) {
                            v12[v13] = v16;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 =  /* dynamic constant */ (String)m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G("4Xmecha4X1Jo6jbgdSuU", MethodHandles.lookup(), "m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G", m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.class, 832996877);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G("FSBOsGaWMGDKNq7OG2Zy", MethodHandles.lookup(), "m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G", m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.class, 1382217744));
                                v12 = var14_8;
                                v13 = var11_9++;
                                v14 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v15 = 0;
                                break block28;
                                break;
                            }
                            break;
                        }
lbl106:
                        // 1 sources

                        while (true) {
                            v12[v13] = v16;
                            if (var10_12 < var13_11) ** continue;
                            break block29;
                            break;
                        }
                    }
                    v16 = v14 ^ var8_7;
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
                m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.g = var14_8;
                m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.h = new Integer[59];
                m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -91443;
                var0_14 = 4663104748733489436L;
                var6_15 = new long[36];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G("ZE8nja3vCjGr61VjWp62", MethodHandles.lookup(), "m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G", m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.class, 1239520520);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G("IHoB5nhcmDgd4RPVMQFw", MethodHandles.lookup(), "m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G", m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.class, 992733988));
                    v17 = var6_15;
                    v18 = var3_16++;
                    v19 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v20 = -1;
                    break block30;
                    break;
                }
lbl135:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 =  /* dynamic constant */ (String)m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G("VRnNB6RRJwSIi7PhPhtP", MethodHandles.lookup(), "m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G", m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.class, 181470688);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G("5MXqCeTxVb1wJxsEmnXg", MethodHandles.lookup(), "m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G", m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.class, 1750240394));
                        v17 = var6_15;
                        v18 = var3_16++;
                        v19 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v20 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl148:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_19 < var5_18) ** continue;
                    break block31;
                    break;
                }
            }
            v21 = v19 ^ var0_14;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl159:
                // 1 sources

                ** continue;
            }
        }
        m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.i = var6_15;
        m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.j = new Long[36];
        m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)5045765878082098443L);
        m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$LB8GocoEEtUIwNSavwJCrcj06IjKi4zBa63SW6fRDujippKQhN11UpmpfUCptIXB8YVSUZTz7q0kcjcaWpCGB4SbMUIy9j4Pp = (m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$l8eust5OcvMfpcih8qOxNw6Eysrk560MuM2YP8ywtOrJgc2C04xDCwZks5q4A1aHdOjJNDuetsRhG3KTtdu8RPorqi4ZuEsDF.class);
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2ED2;
        if (h[n2] == null) {
            m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.h[n2] = (int)(g[n2] ^ l);
        }
        return h[n2];
    }

    public static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x18E3) & Short.MAX_VALUE;
        if (j[n2] == null) {
            m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.j[n2] = i[n2] ^ l;
        }
        return j[n2];
    }

    public static void f() {
        Object[] objectArray = m;
        m[0] = "j\u000b\u007fJ>}d\u00028B9f)\u0003u\u0003\r}r\u0007\u0004a<j6\u0016)A'PD\u0018\u0004p\u001f&H\n\tEdc}_gH0vS#\u0015C:!3\u0004\u0003C\u001b]o\u001c3s\u0004j]4%B6VW\u001b`o/$14\u0004R-wC\u001f\u001ae\u0010he:\u0001_\u001e I/2U:h1'\u001ca\u0006eV\u001a0`\u001a";
        objectArray[1] = Boolean.TYPE;
        m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.n[1] = "java/lang/Boolean";
        objectArray[2] = Integer.TYPE;
        m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.n[2] = "java/lang/Integer";
        objectArray[3] = Void.TYPE;
        m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.n[3] = "java/lang/Void";
        objectArray[4] = "\u0002g[K\u000bn\fn\u001cC\fuAoQ\u0002\u0003P:p\u001bn\u0005P[R@K7o\u0007j,A\u0015s*p0|+w';1j\u000bV_P\u0007s\u000b2\u0019IC\\\u0004W\\H%\u0014 d[QE|*G\u0000UFc\tM:K\u0011A#@=w\u0005\u00105i\u0006L\u0004U0N\u000e0\u0017R\u000fU\n:\rWVp\u00076\u0004n\u000f";
        objectArray[5] = "\"0s,`\u0012)?bc\u0001\u001c\"4f9";
        objectArray[6] = "}k]LSM}kJ\u0010_Bg J\u000e_W`Q\u001aW\r\u0016";
        objectArray[7] = Float.TYPE;
        m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.n[7] = "java/lang/Float";
        objectArray[8] = "\u0019N&\u0003W#\u0019N1_[,\u0003\u00051A[9\u0004tf\u0018\u0002}";
        objectArray[9] = "K\u001a\u001e^+]I\u0004W!4SP\r\u000b\u001e(]J\u000e\u001a";
        objectArray[10] = "\t\u0007B-5S\u0007\u000e\u0005%2HJ\u000fHdmVR.\n43TQ4+(\fn]\u0005\u0014x\rI\u0001:<\u0006j{'U[\u000b\u0013\u0004\u0003Z?0\u0012\u0004%3\\\u0006\fr-[\n'kP<\u0012<0>z70\u000e\u000bh\r=\u0014\u001b/\u0019k7#\\\u0015)Y\u0003+\u001d/>l\u0013S \u000b5{\u0013%?\u0001\u0012I7\t?\u00073";
        objectArray[11] = "\u0018-\u0018_r:\u0018-\u000f\u0003~5\u0002f\u000f\u001d~ \u0005\u0017TH'";
        objectArray[12] = "0BOl{.0BX0w!*\tX.w4-x\np/p";
        objectArray[13] = "\r,Y&\u001b=\r,Nz\u00172\u0017gNd\u0017'\u0010\u0016\u00151A";
        objectArray[14] = "\r\b\u000e\u000e\">\r\b\u0019R.1\u0017C\u0019L.$\u00102K\u0010\u007f`";
        objectArray[15] = "\f\t:|\u0005\u000e\f\t- \t\u0001\u0016B->\t\u0014\u00113\u007fbXVU";
        objectArray[16] = "Q&\n S5_/M(T.\u0012.\u0000il\u0019z \u0013\"HnT9L\u000eX\u0013N\u0016M#r\bi\f\u0015\u0014L\to%n.K<w\u0010b\tR,\t.e\u001aH\u001d\u0004\u0017\u0014|S,X{| U(Jp\u0016\u001bX2J\tK\u0003\b3u\u000fk#qnM7a,nn_(\u001c,_i\u000b ^\u0003C,_\u0001\\\u0000\t";
        objectArray[17] = "\u0019\u000bEi\b\u007f\u0019\u000bR5\u0004p\u0003@R+\u0004e\u00041\u0007tU";
        objectArray[18] = "\u0005^\u0014Ev\u0018\u0005^\u0003\u0019z\u0017\u001f\u0015\u0003\u0007z\u0002\u0018dUS(";
        objectArray[19] = "g%\f\u007f(,l*\u001d0@,b%\u000e";
        objectArray[20] = "+A\u000elf~+A\u00190jq1\n\u0019.jd6{Is;";
        objectArray[21] = "\u0002\u001f\u001dr4 \u0002\u001f\n.8/\u0018T\n08:\u001f%^djz";
        objectArray[22] = "\u0007gl:a(\u0005y%E~&\u001cpyzb(\u0006s";
        objectArray[23] = "\u0006!,\u0001m\u0013\u0018)6N\u000f\u000f\u001f4";
        objectArray[24] = "\u0001\u000b\r-2B\u001f\u0003\u0017bUC\u000e\u0018\u001a8sE";
        objectArray[25] = Double.TYPE;
        m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.n[25] = "java/lang/Double";
        objectArray[26] = "%d\u000f&gG%d\u0018zkH?/\u0018dk]8^I<9";
        objectArray[27] = "f\u0003~\u001c}/f\u0003i@q |Hi^q5{9=\u0006\"";
        objectArray[28] = "q\u0016A\u0018Tvq\u0016VDXyk]VZXll,\u0004\u0006\t**";
        objectArray[29] = "\u0014V\u0002x\u0005[\u0014V\u0015$\tT\u000e\u001d\u0015:\tA\tl@eP";
        objectArray[30] = "qn.8}uza?w\u0017vnm4<";
        objectArray[31] = Long.TYPE;
        m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.n[31] = "java/lang/Long";
        objectArray[32] = "X$An|\u001dV-\u0006f{\u0006\u001b,K'x\u0015_v\u0003LR\u0018W/?hr7x \rBp\u001e}5>K}\u001e{\u0012$n!\u0000wv\nsE\u001dR+)ex\u001aV\u0005<r 6Z)YUFK\r\u0005\u0001P-\u0018B\u0015\u001a4sC\fp+l\\F@w\u001dg}\u0001F9\u001e{A\u0014@\u0003!rM\u000b|\"\u0006E ";
        objectArray[33] = "\r\u0012\f?k$\r\u0012\u001bcg+\u0017Y\u001b}g>\u0010(M(7";
        objectArray[34] = "DUS{EFDUD'II^\u001eD9I\\Yo\u0013d\u0010\u001b";
        objectArray[35] = "\u0010i\"\f9\u001c\u0010i5P5\u0013\n\"5N5\u0006\rSa\u0017c";
        objectArray[36] = "!gX\u001ev{l7GK\u001dwprBFqE$1\u0012\u001b$\u0012 bBH`ooc^J\u001d/qnK\\``prI! ~}g_\\o\u007fae\"\u001cqrts_Spnv\u000e";
        objectArray[37] = "SN\u0000tU[\u000f\bK\u0005QHC<\u000blUC?IHj\u0012]\u0005\u001f\u0012iA%\u0006\u0010\u0015`RN\u0000\n\u001f=*\u001f[\u001fN?IHM\u001a\u0012\u0005";
        objectArray[38] = ";/I; \fz1[bQ\u0015k5Be='<s\u0013:np8'\u0013:#Kz,\u001aeQJb&\u001d82\u001dt#A\u0002";
        objectArray[39] = ".eaKelab2\u0014\u0014u= fWOqhJ\u0007S(!/~%Rx Pn0f,_Aq'lnMu|\u0015vR\u007fv~!ow*im\u001aWy{P]\u001fSPlR`\u0005DL.Hg+lj{`u\u0005\\v\\)Ihljw~o=QW*{tgji_(1c\u001cZQTh\"-)|qe$Pf}mgY";
        objectArray[40] = "#\u001d#\u001a\u0010e\"\u0007%\u0015z=q\u0006}\u001d\u0016\u000f'K Azhe\u0003|K\u0015=u\nxzKc \u001am\u001c\u0005\"y\u0018\u001d";
        objectArray[41] = "ArU\nZv\u0000lGS+o\u0011h^TG]F.\u000f\u000b\u0010\nFpQ\f\u0011i\u0011fTP+";
        objectArray[42] = "g)Ut\\}?\"\u0016m2\";,Gk^\u0010hj\u001b6\u000fGf)^m\u0003(39Wi2z:0NqO5;,L\f[9h2LkX\"9*'";
        objectArray[43] = "H'v\u0000.q\u001199\u0018\u001ejB?g\u001brX\u0016r;E.\u000fH{f\u0006/oH n\r\u001e";
        objectArray[44] = "m\u007fH>y\":o\u00176\u0010\u0018&.\u001b\u0016j\u0004,O\u001bea)'O\u0000\u001b|\"\u001ax)i,\f?o\u0003;^\u00178^#:L\f1O\u000e,Wx\u000bs\renr+x\u001f2t\u0016*e\t/^.\u0019S\u00144/vmI*\u001dh\"\u0006m\u001a\u0005!\u0005\u0012I.&Qt+h\u000b\u0016o\u0015+W,\u001f.:\n,\u0015T,qomM%a3?wqnt'i/\u00129b\"5\u0015";
        objectArray[45] = "\f.@\fN%M0RU?<\\4KRS\u000e\rv\u0017\f\u0001Y\f$K\\B$C%W^?d](BHB+\\4@5\u00025Q!VHM4M#+\u000f[6\u000erHXM3RH";
        objectArray[46] = "H_;\u0019b\rP\\dK\u001fQ\u000e\u0012r\u0007n[on; n{^\u0005^\u001efk\u0019\u000ef\u001azK\u0012bK\u0005vM\u001btm\u001bXEfw;\u0018!dkT~*^SOu;<%d\u0012A]J{XLo{B}\n@Ao@CVXW;>OY\u001dA]([yoWr\u0003d\nDu8*/k\u0013p0z\"RI\u0007q\u0006cL[^\u0000\u0010d^D\u00058\u0017nPS>:\u001ep\u000b\u0018]m\buW\"";
        objectArray[47] = "\u0019b+xgsVex'\u0016j\n'MgZd\u001efOWy}aSX\"WR\u0018TlLmn_Fz&ol\u0019RU{}k^j-NNJZyWZ\\H_ONC'ny[VulPxil tKJDwgltxAln)_[SCZJPE5SQZO[h#wYTzVc\u001e+iM2bbjw_k\u0013";
        objectArray[48] = "j\u001a-\rW(2\u0011n\u00149w6\u001f?\u0012UEg[dE9~b\u000f%\nZya\u0018gu";
        objectArray[49] = ":$\u0013\"5O;3\u000b US2%\u001b1\u000bT2?\u001fMhQ6+\u000f0'P*)r";
        objectArray[50] = "am\u0003\u001e@`c$A\u001e\u007fia*\u001a\u0015\u0013[5kDK\u007f3kh\u001a\u0018B2qn\u0015r";
        objectArray[51] = "N5\"B\u001dTLx+\u0018lOD9:\u0004\rRE\t>\u0017\u0016XN>SE\u0000UJ8.\n\u0001IHE=\u0007\u0000_L:-\u0012\u0005M#";
        objectArray[52] = "o\u0005z0*ciV, P~|\u0004i$,xzi|=?!b\u000fp1nf\u0000";
        objectArray[53] = "Tjw\u000f)dD\u007fr\u001dF`WiR\u0003)\u007fW\\k\u0004=\u001bZs\u007fY+zZ|!\u000eF{\\q'\b'{S/pe&}^)v\u0004&r\u0000~\u001b\u0005 \u007f\u0006xz\u0005/!Q\u0015u\u001a*qUje\u000f/c:";
        objectArray[54] = "?gJR]\r'd\u0015\u0000 Qy*,\t\u001fn/<\u0016_Bn>c,x\u001em5^\u0003a[P\u0005@6\u007f]Z*z4Pov\u001a6-cKT\u0014H#X\u007fD1=\u0011t@soW#K[}.@8oa]\u000fM\u0018W_e\n{\u0010wq[\njOLmIj87]]t2D=NkPoF\u00121\u0010M,g@^E]%cq\fLT<{\fCMH>\u0006HQDQ-mNKN\fUgHHILne\u000bM\u00194";
        objectArray[55] = "0\u0010^\u0015VB}@A@=Na\u0005DMQ|5G\u0018\u0011\f+1\u0015DC@V~\u0014XA=\u0016`\u0019MW@Ya\u0005O*\u0000Gl\u0010YWOFp\u0012$\u0017QKe\u0004YXPWgy";
        objectArray[56] = "n{/]\u0003wbw~\u001aaqhp\u0006\u000e\u0011m\u00012y\fYi;d#\u000f\n\u0011";
        objectArray[57] = "!:'f<9;ov0M>./-n!\f}jw9Mbz<uqw4 ?&\t";
        objectArray[58] = "\u001a\u001e:\u007fk\f\u001aE2tZ\t\u0010Z;b6;D\u0017`?dl\u001c\u001f\"l\"W\u001e\\'<Z";
        objectArray[59] = "\u0016I';x@\f\u001cvm\tG\u0019\\-3euN\u0011pl5\"M\u0019\"lq\u0018\u001bC!?\t";
        objectArray[60] = "F;\u0011Gfe\u0007%\u0003\u001e\u0017|\u0016!\u001a\u0019{NAgKF&\u0019A9\u0015A-z\u0016/\u0010\u001d\u0017";
        objectArray[61] = "9;ellj\"900\u0012u655j~Geuo0#\u0010f%5dom)$)f\u0012";
        objectArray[62] = "sv3!0?\u007fzbfR?qv \u001fn`%~`n#\"ud\\";
        objectArray[63] = "(f\u0005Mb657\u001b\u0012\u0004+&w\u0018\u0011h\u0019r;DK:N$g\u0011\u000b~2\"4G\u001b\u0004";
        objectArray[64] = "\u0014;\u0018yc@\u000enI/\u0012G\u001b.\u0012q~uKmK+\u0012\u001bO=Jn(M\u0015>\u0019\u0016";
        objectArray[65] = "GXd<J\u001eFO|>*\rMBO2V\u0017wYK7M\u0005W><3N\tSU:)DT+\u0003i3C\u0011VLh/Al";
        objectArray[66] = "9\u001d(B'2&B/PY;:F$c8#&|,e>\"7D&)=&-L9\u00138c'ZKI?;aM*I0e6 ";
        objectArray[67] = "N\u000e\f7\u000f(P\u0016Ure%F\u0016ng\u00017Fj\f7\\2\u0017\u001bAu\f(+";
        objectArray[68] = "V]M9+2\u0001M\u00121B\u0006\\FD\"z*/V5n\bi*P\u0006/$e\u000e\\>\u001d\u00041\u0017y4i8\u001f\u0014K\u0011\u0017%\u0006-\u000f\u0011j!g\u0007jOi\u007f\u001c\u0016X\b\u0013\u00064R\\\u00191\u001b\n\rW+\u0011s?,\\3o0!]\\?(\u0010\u001b+[>0\u0013\u00131eM4&\u001f?J8!8`\u000f\f&S&!\u001d[\u0006i#d\u0017Mtj\"<\bO\u001fl86U7";
        objectArray[69] = "2|^\u0019*\u001fglW\u001d\u001b\u0015oyG\u001fw'9=\u0016E#p?iG\u0011f\rph[\u0013\u001b\u0011;|N\u0000 \u0013xy\u001ex";
        objectArray[70] = "C#(\r((An!WY3I/0K8.HSd[9 S.+Z%\".=&[3&Q-3^!I";
        objectArray[71] = "%\u001dOUjC'^J\u0005\u0012\u001d)XV[~/}\u001c\f\u0004\u0012\u0019}]_D)\u001b>X\u000f<sA=MN\u0007q\u00028\u001d6";
        objectArray[72] = "p=\u001f\tEU1#\rP4L '\u0014WX~waE\b\b)-=\u0010\fYH-2N[4I+?H]UI$a\u001f0TO)g\u0019QT@w0t\nPFra\u0017]FC.[";
        objectArray[73] = "#\f\u000evdh9Y_ \u0015o,\u0019\u0004~y]{]^\"/\nx\\\u000b!m0.\u0006\br\u0015";
        Object[] objectArray2 = objectArray;
        objectArray[74] = "E.>=u*\u0018|ev\u000b)Nn`!g\u001b\u001d(9\u007f3LA`0'u6Zbe{\u000bvG}?|h!QxcF";
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4587 class_45872, class_630 class_6302) {
        try {
            if (class_6302.field_3674 != 0.0f) {
                class_45872.method_22907((Quaternionfc)class_7833.field_40718.rotation(class_6302.field_3674));
            }
        } catch (class_151 class_1512) {
            throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(class_1512);
        }
        try {
            if (class_6302.field_3675 != 0.0f) {
                class_45872.method_22907((Quaternionfc)class_7833.field_40715.rotation(class_6302.field_3675));
            }
        } catch (class_151 class_1513) {
            throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(class_1513);
        }
        try {
            if (class_6302.field_3654 != 0.0f) {
                class_45872.method_22907((Quaternionfc)class_7833.field_40713.rotation(class_6302.field_3654));
            }
        } catch (class_151 class_1514) {
            throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(class_1514);
        }
    }

    public class_243 m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_1297 class_12972, float f, int n) {
        return class_12972.method_30950(f).method_1020(m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1773.method_19418().method_19326());
    }

    /*
     * Unable to fully structure code
     */
    @m$.zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk var1_1) {
        var2_2 = var1_1.m$$VqDc0eTAgzOPC4IU6WwZsiqEa0qk7QNmclpi6XPMtzLLBOqLUU9iWXMcrWVjw6jLdGlqrsVBwx7XuPXLTWk6HGDHuk8aGSTUx();
        var3_3 = var1_1.m$$7rSiqNVv496ztwd8IjaC0GXuvIrUlxDSNgozpJk2piKrecIYNvLtKdTaP6QczIvcyqTyjD0M9IvogkltK2bp6OuG1529FIMls();
        m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(var2_2);
        for (class_742 var5_5 : m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687.method_18456()) {
            block49: {
                if (var5_5.method_29504()) continue;
                try {
                    if (var5_5 == m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724) {
                        continue;
                    }
                } catch (class_151 v0) {
                    throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v0);
                }
                var6_6 = (Color)this.m$$FJxxEyJRXqjTtaepeoPkPwBHkQm7TU7syHAkaHddETgnZbZYaDU92LYVl7ySZwBxOcZKbZuwI2PS8hqZdOXyueuEKqnU9iDCL.getValue();
                var7_7 = this.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((class_1297)var5_5, var3_3, -1847765872);
                var8_8 = (class_1007)m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().method_3953((class_1297)var5_5);
                var9_9 = (class_591)var8_8.method_4038();
                var10_10 = class_3532.method_17821((float)var3_3, (float)var5_5.field_6220, (float)var5_5.field_6283);
                var11_11 = (class_10055)var8_8.method_62425((class_1297)var5_5, var1_1.m$$7rSiqNVv496ztwd8IjaC0GXuvIrUlxDSNgozpJk2piKrecIYNvLtKdTaP6QczIvcyqTyjD0M9IvogkltK2bp6OuG1529FIMls());
                try {
                    var9_9.method_62110(var11_11);
                    v1 = var11_11.field_53458 != false ? -90.0f - var11_11.field_53448 : -90.0f;
                } catch (class_151 v2) {
                    throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v2);
                }
                var12_12 = v1;
                var13_13 = class_3532.method_16439((float)var11_11.field_53403, (float)0.0f, (float)var12_12);
                var14_14 = var5_5.method_20232();
                var15_15 = var5_5.method_5715();
                var16_16 = var5_5.method_6128();
                var17_17 = var9_9.field_3398;
                var18_18 = var9_9.field_27433;
                var19_19 = var9_9.field_3401;
                var20_20 = var9_9.field_3397;
                var21_21 = var9_9.field_3392;
                var2_2.method_22903();
                var2_2.method_22904(var7_7.field_1352, var7_7.field_1351, var7_7.field_1350);
                var2_2.method_22907((Quaternionfc)new Quaternionf().setAngleAxis((double)(var10_10 + 180.0f) * 3.141592653589793 / 180.0, 0.0, -1.0, 0.0));
                if (var16_16) {
                    var12_12 = var11_11.method_64259();
                    try {
                        if (!var11_11.field_53459) {
                            var2_2.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(var12_12 * (-90.0f - var11_11.field_53448)));
                        }
                    } catch (class_151 v3) {
                        throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v3);
                    }
                    try {
                        if (!var11_11.field_53535) ** GOTO lbl62
                        var2_2.method_22907((Quaternionfc)class_7833.field_40716.rotation(var11_11.field_53521));
                    } catch (class_151 v4) {
                        throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v4);
                    }
                } else {
                    try {
                        try {
                            if (!(var11_11.field_53403 > 0.0f)) break block49;
                            var2_2.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(var13_13));
                            if (!var14_14) break block49;
                        } catch (class_151 v5) {
                            throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v5);
                        }
                        var2_2.method_46416(0.0f, -1.0f, 0.3f);
                    } catch (class_151 v6) {
                        throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v6);
                    }
                }
            }
            try {
                v7 = 0.0;
                v8 = var15_15 != false ? 0.6 : 0.699999988079071;
            } catch (class_151 v9) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v9);
            }
            try {
                v10 = var15_15 != false ? 0.23000000417232513 : 0.0;
            } catch (class_151 v11) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v11);
            }
            try {
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(v7, v8, v10, var6_6);
                v12 = 0.0;
                v13 = var15_15 != false ? 1.05 : 1.399999976158142;
            } catch (class_151 v14) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v14);
            }
            try {
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(v12, v13, 0.0, var6_6);
                v15 = -0.3700000047683716;
                v16 = var15_15 != false ? 1.0499999523162842 : 1.350000023841858;
            } catch (class_151 v17) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v17);
            }
            try {
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(v15, v16, 0.0, var6_6);
                v18 = 0.3700000047683716;
                v19 = var15_15 != false ? 1.0499999523162842 : 1.350000023841858;
            } catch (class_151 v20) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v20);
            }
            try {
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(v18, v19, 0.0, var6_6);
                v21 = -0.15000000596046448;
                v22 = var15_15 != false ? 0.6000000238418579 : 0.699999988079071;
            } catch (class_151 v23) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v23);
            }
            try {
                v24 = var15_15 != false ? 0.23000000417232513 : 0.0;
            } catch (class_151 v25) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v25);
            }
            try {
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(v21, v22, v24, var6_6);
                v26 = 0.15000000596046448;
                v27 = var15_15 != false ? 0.6000000238418579 : 0.699999988079071;
            } catch (class_151 v28) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v28);
            }
            try {
                v29 = var15_15 != false ? 0.23000000417232513 : 0.0;
            } catch (class_151 v30) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v30);
            }
            try {
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(v26, v27, v29, var6_6);
                var2_2.method_22903();
                v31 = var2_2;
                v32 = 0.0f;
                v33 = var15_15 != false ? 1.05f : 1.4f;
            } catch (class_151 v34) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v34);
            }
            try {
                v31.method_46416(v32, v33, 0.0f);
                this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(var2_2, var17_17);
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(0.0, 0.0, 0.0, var6_6);
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(0.0, 0.15000000596046448, 0.0, var6_6);
                var2_2.method_22909();
                var2_2.method_22903();
                v35 = var2_2;
                v36 = 0.15f;
                v37 = var15_15 != false ? 0.6f : 0.7f;
            } catch (class_151 v38) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v38);
            }
            try {
                v39 = var15_15 != false ? 0.23f : 0.0f;
            } catch (class_151 v40) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v40);
            }
            try {
                v35.method_46416(v36, v37, v39);
                this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(var2_2, var21_21);
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(0.0, 0.0, 0.0, var6_6);
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(0.0, -0.6000000238418579, 0.0, var6_6);
                var2_2.method_22909();
                var2_2.method_22903();
                v41 = var2_2;
                v42 = -0.15f;
                v43 = var15_15 != false ? 0.6f : 0.7f;
            } catch (class_151 v44) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v44);
            }
            try {
                v45 = var15_15 != false ? 0.23f : 0.0f;
            } catch (class_151 v46) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v46);
            }
            try {
                v41.method_46416(v42, v43, v45);
                this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(var2_2, var20_20);
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(0.0, 0.0, 0.0, var6_6);
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(0.0, -0.6000000238418579, 0.0, var6_6);
                var2_2.method_22909();
                var2_2.method_22903();
                v47 = var2_2;
                v48 = 0.37f;
                v49 = var15_15 != false ? 1.05f : 1.35f;
            } catch (class_151 v50) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v50);
            }
            try {
                v47.method_46416(v48, v49, 0.0f);
                this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(var2_2, var19_19);
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(0.0, 0.0, 0.0, var6_6);
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(0.0, -0.550000011920929, 0.0, var6_6);
                var2_2.method_22909();
                var2_2.method_22903();
                v51 = var2_2;
                v52 = -0.37f;
                v53 = var15_15 != false ? 1.05f : 1.35f;
            } catch (class_151 v54) {
                throw m$$VCFc7or4hzhCbIrUinHRUO1YvSSfJcqfKSFDhv5mAWrG8T01ivd8Xmorv32VbhvJoN2iILOnK4qtEaT4ck8ae37czNyvcBxM3.a(v54);
            }
            v51.method_46416(v52, v53, 0.0f);
            this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(var2_2, var18_18);
            m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(0.0, 0.0, 0.0, var6_6);
            m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(0.0, -0.550000011920929, 0.0, var6_6);
            var2_2.method_22909();
            var2_2.method_22909();
        }
        m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI(((Float)this.m$$0cQZzd4pwn6bU5W6nXDGrXtigyGUUFvOpyowI4nsnPofLjvHxdAG4z5NkpLBIJE7B7ujWbCkaiwC5yhGL6bLmL8OJFJviqcRh.getValue()).floatValue());
    }

    public static String m$$5P5JzrimcR2s672DbR2stzTuUpa8t2rNWtH50ENXF1d22n9bnlQegKaBbxxB0vmkct2zrVsXrzTi7x1512WcKSYDhrLoik88G(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{6, 23, 27, -120, -42, 68, -28, -55, 82, 80, 83, -94, 102};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 13]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

