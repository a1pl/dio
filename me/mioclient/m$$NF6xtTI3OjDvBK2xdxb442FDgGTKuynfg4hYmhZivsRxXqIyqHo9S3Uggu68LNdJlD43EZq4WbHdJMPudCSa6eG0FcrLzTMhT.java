package me.mioclient;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.runtime.SwitchBootstraps;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import me.mioclient.m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI;
import me.mioclient.m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR;
import me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP;
import me.mioclient.m$$Sc5Y8o1OuTYi4MLSAIzNFnbvTemFJeRD22TFG7uOgMnyNPvZDugsMZ660XsEQfte53ZKf9nmzu99eawHc57GerNGzGULX3ff9;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC;
import me.mioclient.m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN;
import me.mioclient.m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp;
import me.mioclient.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB;
import me.mioclient.m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import me.mioclient.m$$tQzKMxUjFH9uRZjhKMcY8q3DfZQwOe8agGk67vEKJw2wSstcz0mKFZVYsuXcd2YFZodE1Ei2NQ5XNaRInXnVLJh5iWz2Xs1sd;
import me.mioclient.m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM;
import net.minecraft.class_124;
import net.minecraft.class_151;
import net.minecraft.class_2172;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2564;
import net.minecraft.class_2568;
import net.minecraft.class_2583;
import net.minecraft.class_5250;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT
extends m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP {
    public final m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX;

    public m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT(m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM) {
        super(m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.getName());
        this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX = m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
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
                                m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.k = new Object[139];
                                m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.l = new String[139];
                                m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.e();
                                var21 = new String[25];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c("5GVRdSLkFRyYaNnpt9LJ", MethodHandles.lookup(), "m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c", m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.class, 1020429496);
                                var20_3 = var18_2.length();
                                var17_4 = 2;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 81;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c("7EDtE93xuIOw3S1Wfh3A", MethodHandles.lookup(), "m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c", m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.class, 1503070292);
                                    var20_3 = var18_2.length();
                                    var17_4 = 5;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 38;
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
                                            v15 = 106;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 12;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 79;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 92;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 102;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 15;
                                            break;
                                        }
                                        default: {
                                            v15 = 67;
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
                        m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.c = var21;
                        m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.d = new String[25];
                        var8_7 = 136306468706735317L;
                        var14_8 = new long[67];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c("hz6IUWZXRjOQ43oIRAca", MethodHandles.lookup(), "m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c", m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.class, 1168944162);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c("CbOgPtkkOL43RObV7CH7", MethodHandles.lookup(), "m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c", m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.class, 65288090));
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
                            var12_10 =  /* dynamic constant */ (String)m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c("GhAOyLrnDn92num6A3N0", MethodHandles.lookup(), "m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c", m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.class, 1377396426);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c("5xXEDwE2dGiZiGiv8Lgx", MethodHandles.lookup(), "m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c", m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.class, 658416298));
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
                m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.e = var14_8;
                m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.f = new Integer[67];
                m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -391732;
                var0_14 = 2778353730863176884L;
                var6_15 = new long[7];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c("Qfoo5YC2cx31deNvgmMl", MethodHandles.lookup(), "m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c", m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.class, 324771783);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c("uu7sXuMij0Xs4FcASLgn", MethodHandles.lookup(), "m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c", m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.class, 1605484586));
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
                    var4_17 =  /* dynamic constant */ (String)m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c("RUfTeU0qmN2TtOOHvUcK", MethodHandles.lookup(), "m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c", m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.class, 611052475);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c("ISwXbhZ9f7iXvqu2khq8", MethodHandles.lookup(), "m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c", m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.class, 669009405));
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
        m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.i = var6_15;
        m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.j = new Long[7];
        m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)1030604116988314991L);
    }

    public static void e() {
        Object[] objectArray = k;
        k[0] = "\u001f\u0014Ry\"\u0004\u0011\u001d\u0015q%\u001f\\\u001cX0*:'\u0003\u0012\\,:F!Iy\u001e\u0005\u001a\u0019%s<\u00197\u00039N\u0002\u001d:H8X\"<B#\u000eA\"X\u0004:Jn-=A;,&\t\u000eF\"LN\u0003-\u001d&OQ ''8\u0018s\n* \u0004\f\"\u001c\u0003\u001b?\rg\u0019$\u0013C\u001e`&?\u0017I\u0004e\u007f\u001a\u001aE\r\\&";
        objectArray[1] = Long.TYPE;
        m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.l[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.l[2] = "java/lang/Integer";
        objectArray[3] = "SB\"kN\u000b]KecI\u0010\u0010J(\"R0]\u0011mmj\u0001_R<Mi#\u000fs:Ja\u001e\u007f~t`\u0012#lkD@U.hDOEVQ\fso?WRy\u0012xdP'k}D^}\u000elP_Vk(k\u0016FC\u0016\u001d\u000f_N>\u001f\toB4~c\u0014Reh0T\rylYKq-JFNaj";
        objectArray[4] = "2TW}vI;ZT45D#R]2\u007fO4I\u00140tH%^B'5e>VW2uB\u0012TT'~^%";
        objectArray[5] = "fk*\\\u0006shbmT\u0001h%c \u00155s~gQw\u0004d:v|W\u001f^HxQf'(Dj\\S\\mq?2^\bx_C@U\u0002/?dVU#Sc|fe<dQTpT\u000eX[{5y\u0017*=TQD\u0015yO\u007fOs(fiZTI&.EOgC\u0002f=GIw>kZzev\"";
        objectArray[6] = "%y],c?.vLc\u001e'=qE*";
        objectArray[7] = "+),_s4% kWt/h!&\u0016w<,{n}]1$\"RY}\u001e\u000b-`s\u007f7\u000e8Szr7\b\u001fI_.)\u0004{gBJ4!&DTw3%\bQC/\u001f)$4dIb~\bla\"11\u0018w\u0005|j\u007f}F]So3zpVr(54sJN=3\u000eLCB\"\u000f/kt/";
        objectArray[8] = Void.TYPE;
        m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.l[8] = "java/lang/Void";
        objectArray[9] = "\t_&>T\u0006\t_1bX\t\u0013\u00141|X\u001c\u0014ec\"\r";
        objectArray[10] = "^h\nK\u0018LUg\u001b\u0004\u007fN@l\u001bOD";
        objectArray[11] = Boolean.TYPE;
        m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.l[11] = "java/lang/Boolean";
        objectArray[12] = "i\u001an2t\bg\u0013):s\u0013*\u0012d{^-I=44g\u0002p+\u0001\u0013S!h04k/\u000205\u0005\u001eqTK\u001b$>t\u0001p\u00165<u-a\u0011u\u000fv\u0006K\u0015\u0016o,)q)v\u000ez/N\u001ey\f-)N\u0013%\u0019y\u0006fL\u000f-\\(a\u001e.>l\u0011\\\u00150.)+6\r2n.\u0006N;\u0013\tp";
        objectArray[13] = "\u001by3[iR\u0006lky(_\u001ej";
        objectArray[14] = "g:_\u000bg7g:HWk8}qHIk-z\u0000\u0019\u00102m";
        objectArray[15] = "+5\"^z#%<eV}8h=(\u0017E\u0002\u0013(JW~\u0018-)_TPys\u0003Y^+\r3\u00158\u0000T')\thG|\t\"\u0006OjIt4\n[fI\u0001'eAZ !%\u0003CGd|'\u00068K{\t>#E_j\u0016 5ajZ#>6hP'8!8FDZ\u0003#gAvEz\b6XtD";
        objectArray[16] = "Jc:*\u0017ZDj}\"\u0010A\tk0c7LHTr&\u001br\u0014\u007f{1\bVoIl\fIw\u0016vM*\u0011G_aX4JO^v!\u000f\u0016w]m|&H_\u0014e$%;WUHn\u001f\u0007\u0006\u0010oB0\u001f\u0004Pw$\u000e\u0006\rEg^)\u001f\u0004\u007fev\u001e4~\u0017a$&KO`sW\bL\u0002aim$\t";
        objectArray[17] = "\u001f\u0018\u0003c~F\u001f\u0018\u0014?rI\u0005S\u0014!r\\\u0002\"@y%\u0016";
        objectArray[18] = "E}\bM\u000bZNr\u0019\u0002jTEy\u001dX";
        objectArray[19] = "\u0002\u0012\u007f8Go\u0002\u0012hdK`\u0018YhzKu\u001f(9#\u001c7";
        objectArray[20] = "N@\u001eLS\u0018@IYDT\u0003\rH\u0014\u0005s\u000eLwV@_0\u0010\\_WL\u0014kjHj\r5\u0012UiLU\u0005[B|R\u000e\rZU\u0005iR5YNX@\f\u001d\u0010F\u0000C\u007f\u0015QkJyCD\u0014LfV[FTT\u0000hBOADzO[F{FRxp<\u0013B\u0000@\u000f\rdPsn\b@eJIBMSN\u0001\u0014[O\u000eD`h\u0012h\u000edQ\u0003wV\u0006t\u0016\bOR\u001aT\u001ddbM\u0016R\u0014rDS8Ziq\u0012PA{dRWb>L@s\u0012tE{\u001dGt\u0002\u001bGCiR\n\u001d\u0015OGF\b#IWQ\u0012v/F\u0012Gt`;f`Q[K\u0004\u0015Ks\u0011bOt\u001cv\u0019";
        objectArray[21] = "0oD4%e0oSh)j*$Sv)\u007f-U\u0005(}<";
        objectArray[22] = "g[\\#\u0016|ySFlkly";
        objectArray[23] = "w~uOz\u000fivo\u00002\u000fs|wG;\u00143JmO&\u0003Rof\\5\u000erm";
        objectArray[24] = "k\u0006sBm:u\u000ei\r\n;d\u0015dW,=";
        objectArray[25] = "fb\u0003\u0007';xj\u0019HE'\u007fw";
        objectArray[26] = "\u0019\u0007C\u001a2Q\u0017\u000e\u0004\u00125JZ\u000fIS\u0014\u0007\"\u0006\n\u0000\b\u0007\u0003:&'hS\u001a)7F\u0010Z.7;\rbh\u0003\b^;?\\\"\u0016\u0006$?W\u0006\r#4m\f,\fY:\r\u0006\u000e$8\u001b\u0001X\u00177\u0005$\rR6/\u0015/\u000b\u00063\u0007\u001a\u0014nd\u001f[(42W\u001d/\u000e \u000eK#\n\u001e\u001b\t\u0007\u0013\u001a#!\u000b";
        objectArray[27] = "\u0006d\fx|\u0013sD\u0007wm\\\u000e\\\u0014pd\u0015f";
        objectArray[28] = "R-s={6[#pt8;C+yrr0T00qc0]&{a8\u000bT3kzd<U\u0003ltc4T,jQc0]&{a";
        objectArray[29] = "L\u001f\t5Y\u001dE\u0011\n|\u001a\u0010]\u0019\u0003zP\u001bJ\u0002JhA\u0015H\u0015\u0017o]\u001dA^7nS\u0015J\u0003\u0010r[\u001c\u007f\u0002\u000bm]\u0016J\u0002";
        objectArray[30] = "\u0019S\u0000B\u0016)\u0010]\u0003\u000bU$\bU\n\r\u001f/\u001fNC\r\t!\u000fQ\b\u0002\u000f5T}\u001f\u000b\u000e+\u001fR\u00198\u00026\u001f";
        objectArray[31] = ",t\u00028bE%z\u0001q!H=r\bwkC*iAw}M:v\nx{YaY\u0000yck=|\u001a{jD;O\u0016fj";
        objectArray[32] = "\u0015nwcM'\u001c`t*\u000e*\u0004h},D!\u0013s4/U!\u001ae\u007f?\u000e\u0004\u001fu\u007f?A$7s}8M-\u0018uX8I$\u0012dh";
        objectArray[33] = "\u0002XX12y\u000bV[xqt\u0013^R~;\u007f\u0004E\u001b\\0{\fV[{";
        objectArray[34] = "p#tYc]y-w\u0010 Pa%~\u0016j[v>7\u0015{[\u007f(|\u0005 sa+l\u001ak\\g\u000el\u001ebVv>";
        objectArray[35] = "44c\u0002{y:=$\n|bw<iKG[#\u0004/\u001ba/l\u001b&!An;9\u001a<f@a\u0014)]{T?g57v~:\u001c\u0007\u0016vb\u001ad\u000b\u0015tO#2\u0018!q_\u0010\u0019\u000f$}[)\b/\bxw \u001bt\u001c'z3$\u001a5WT\u0013\u0018\n\\QR\u001b5\u0003WAuj\u001b{(prkh\"\u0016j";
        objectArray[36] = "\u0002\u0006\u0005Nt1\f\u000fBFs*A\u000e\u000f\u0007H\u0013\u00156IWngZ)@mN&\r\u000b|pi\bW&O\u0011t\u001c\tUS{y6\f.aZy*,VmY{\u0007\u0015\u0000~m~\u0017&+ihr\u0013\u001f:IDw?\u0016)\u0012P(2\u0005\u0016|yX\u001c%*l\u0010^\u001a-\u0007e\u001bN=\\)\u001dd\u007f:]ZDZez\u0002G\u000fYh'\b&s\u0010O'(\u0017\u0018uq/8P\u0013Mu3\u0018[\u007f`j?\u001eRiFt\u0011\u0016/j\u0010wh7\"IUE\u0017\u0000\u0006h\u0010Sl7[\\v%2\u000b\u0005rP-4Y\t\\D/\n\u0005\u0011J\u0010Q\u0006\nT\\vG\u0012*&JYl-Y\rh\u0013Ef8Zm\u001b";
        objectArray[37] = "\u0004\u001do\u000fx]\u000f\u0012~@\u0013_\u001b\u0011";
        objectArray[38] = "\u001b\u000b\r\u001fTm\u0005\u0003\u0017P5z\u001b\u000f\u0018\n\t";
        objectArray[39] = "Q)WkMW$\t\\d\\\u0018E\u0007WoXB1";
        objectArray[40] = "1Nft\u001fZ?G!|\u0018ArFl=\u001aw\u0011F\u0012*3s\u001bX\u0001V\u0010]=}\u0019cF\u0005dr>*8@\u0011\u001d1j0O\u000f~>~DpoM\u001eINyjJ8\\1\u007f;~{ 9D\u000em:T\u0013ej\u0013\tK@\u0006ll\u001a]\u000eq&\u001d*p @\t\u001d\u000bo:}/\u001a,p5g\u000f|)R$";
        objectArray[41] = "\fhys i\u0002a>{'rO`s:\u0011r\u0006G\u001em\bp\u000bto(,7W~>F\u001aw\u0005i\u000ff\u0007K&a`k$i b\u0019u\u000bV\u0019a8RxD\u0011>#F\u0013b%c.W.5\f_\u0000.\u0019R\u001782L\fd\u0013L?n;D\u000fO![\u0006~0N6p\u0003R\u0013X'WztYY5T;";
        objectArray[42] = "=Lw\tI\u00143E0\u0001N\u000f~D}@n=fQ-0iH\u001fC\u001d\u0012b0bQ=\u001cBOd\u001b\u001f G<\u0004b,\u001dN\u001d7\u001d1=M\u0013\n@/\u0017r\u0003\bX\u0010\u001dQ3?\u0010\nWu\u001c7\\o\\l54c5 \u0014H\u0015s(Pw\u0019\u0018M\u0013)p\u000e4j\n\u0005\u0016\u001e\u0017\u0019\u001f\u0007R7*}\u0014\ft";
        objectArray[43] = "\u007f\u001b'G6vt\u00146\b[rt\b\u0002Ciop\u00142C";
        objectArray[44] = "\u000fKf01f\u0004Dw\u007fV~\u0000Xq3so";
        objectArray[45] = "\u000e4Ff\u001a-{\u0014Mi\u000bb\u0006\f^n\u0002+n";
        objectArray[46] = "*ApRS9*Ag\u000e_60\ng\u0010_#7{6I\bh";
        objectArray[47] = "+\\R<E\u0019%U\u00154B\u0002hTXuE5\u0002\u007f\u0019\u0002M2,}MfN$\u0001\f8\u0006g$\u007f]\u0015!\u001f#\u001el/?[\u001c?t07j\u00172\u0001\u0016cV\u0018\u0001\u0001>(n\f\u0013\u0001\u001b']43\b1!\u001a\u0018%\u007f\u001bdf\u001d\u0005^8\u001dJ@\u0017N9c\u007fG\bK\u00135|\u0006\u0014N\u0015!t\u0003\u000bP7\u0010\\";
        objectArray[48] = "#\u0004\u0001J\u0005\t#\u0004\u0016\u0016\t\u00069O\u0016\b\t\u0013>>GQ^T";
        objectArray[49] = "`[\u00048R;~S\u001ew?!fV\u0017:\b'eT";
        objectArray[50] = "!oo\u0005f|?guJ.|%mm\r'geHl\n+}\"aw";
        objectArray[51] = "`J,N!\u0019iD/\u0007b\u0014qL&\u0001(\u001ffWo\u00139\u0011d@2\u0014%\u0019m\u000b\u0012\u0015+\u0011fV5\t#\u0018pg4\t \u0012fW";
        objectArray[52] = "'hM\u0016@J9`WY\rP#jN\u0005\u001cZ#}\u00154\u0001R=e^\u0003\u000f]!l}\u0002\u001aJ?l";
        objectArray[53] = "QD\u007f=7xXJ|ttu@Bur>~WY<`/pUNag3x\\\u0005Af=pWXfz5yA";
        objectArray[54] = "([W\u000fyw([@Sux2\u0010@Mum5a\u0011\u0010#,";
        objectArray[55] = "2T\u00145\u00156Gt\u001f:\u0004y:l\f=\r0R";
        objectArray[56] = "~o\u0016IM5u`\u0007\u0006 5u}\u0013";
        objectArray[57] = "FOX,\u0006vHF\u001f$\u0001m\u0005GRe\u0001^De\u0011y\bwmd\u0015\u0016[-Ee\"\u0013\bh[p\u0001\t_)\u0018n,\u0003\u001b_fn\u0004\u0000\r/D\u0018\u00146\u000bhoa\u0018.)w{c\u0003\u000f)MCD% \u0003rdc\u0017t\",|G\u0005\u00037!LP4\u0017Wj{_\u0001\u0011\bQAoG\b\u0002a\u001b~A\u0006!";
        objectArray[58] = "V?_\u0004di]0NK\bjS2L\u0004$";
        objectArray[59] = "cx}<V2mq:4Q) pwuK\ftV\u001e)j7HUj$m\u0007du\u0018\u001c\\\u00046l`\u0015Y\u0007_j\u001c4\u0007<iZ8g\b+KV\u0019&\r*]n'2EmcV\u0015\u000bi\u0004}h\u000b2[oW[\t>[\u0018?X:cq\f;E\u001d0m\u0014`E=\u0007s\u0017f(:\u0006EoVnb\"[";
        objectArray[60] = "\u0005y\u0005\t\u0002\u0010\u000bpB\u0001\u0005\u000bFq\u000f@<=\u0018t\u001b\u0007\\=QEM\tS\u0016\u001dM~*Z\u0007P+F<3\u0011%)}!\u001b\b'vo\u0011Y\u001a\u0006(E1?/Q-]<9\u0007\u001b{g\u0002Z\u000f\"uz]\r/;/}\r*>\\_S\\1+P*@\u0013*8%{I\u000b3\u000b<{@\u0002\u00011ZJ@\b(";
        objectArray[61] = "\u001bn&Z#%\u001bn1\u0006/*\u0001%1\u0018/?\u0006T`Gyt";
        objectArray[62] = "\u000f\u001c*\u0016\u0000U\u0011\u00140Y]T\u0017\u0018=\u001a\u0000s\u0011\u000f9\u0016C";
        objectArray[63] = "y)\u001dmY\\g!\u0007\"\u0011\\}+\u001fe\u0018G=\u0018\u0019i\u0013@p)\u001fi";
        objectArray[64] = "L.Jxs1R&P7;1H,Hp2*\b\fSw.1K*N";
        objectArray[65] = "8\u001f\"\u0012/\n&\u00178]g\n<\u001d \u001an\u0011|-!\u0003q\u0013;\u001b&";
        objectArray[66] = "CY{;C\u0007CYlgO\bY\u0012lyO\u001d^c= \u001bV";
        objectArray[67] = "<z`x\u0011cs&hy|?oco\u007f\u0010\r?$5\u0018Ckf%6rA<2&\u000f";
        objectArray[68] = "9-\rr5zzj\u0013*Dib\u0014\u000e0)oN9\u0012\"D)x4T>+j?*\fO";
        objectArray[69] = "f\u0015\fA`\fkNHO\u0011\u001eb\n}Kj\u001au\u0017IZp\u0016iv\bTv\u001bi\r\u0000E(\u0012\u000fJLB,\u0000`\t\u000b\\tq";
        objectArray[70] = "M :R\u0005A\u0007ejUzY\u0011$6\u000b\u0016kE`gPK<\u000399T\bW\u000eb;\nz\r\u00044h\u0013\u0007GAdol";
        objectArray[71] = "e?!?_\u0005c#\u007f 3\u001133G*\\\u001f%3g63G,(w!HO=v~GS\u0012<>#~NC4p\u001d";
        objectArray[72] = "\u001dC7Yw\"\u001d\u0013g\f}NAS\"k&q~\u00054Qp,~\u0014kkWp}\u001fVDN5@/HqP3J\u0000rs\u007f\u0001f0>jL%D>@dw\u0011T\u001b5V[.cE_dd5m\u0004H\u007f@\u000fM%E_x1u sWX\u001fK b\bc\u0003Y@0pr3d\u0018Lza\u0005@ENU\u001eq\\\u00072SysT\u000e76#)\u001a\u0019q\u000fruB\u000f\u000e";
        objectArray[73] = "\rRI1_K\u001bW\u001a/dMK\u0019V(\u0015G*e\u001f\u000f\u0015g\u001b\u000ez1\u001dw\\\u0005B5\u0001WWio*\rQ^\u007fI4#Y#|\u001f7Zx._Z\u0005%O\n~\u001f\u0013^xWJye\u0000D\td_m\u0006\u0016\u0005JKo8J\u001d\\\u001f\u00114EXJy\u0007 e*\\V,\u001f\u0016\u0001~\u001c\u0005TwV{\u0014UUP\u000b\u000b[(\u001f\u0015[\f$lU\u0015\u0016[H8\u001aM\nZ$d\u001cDYJY.Y\u0014^5";
        objectArray[74] = "=\u00054)>C\u007f\u000b%tEB)\u00031x?U\u0002\u001d*_8\\ z'z;X4\u0014vt;QD\u0011/g%H*@!g,8";
        objectArray[75] = "dV%5\u007f^aR.(\u0002TqX+3~Tz5& xC>Y 3`\u0007\u0001S=wf_?\u000e~+e9";
        objectArray[76] = "V(<s=+J+e0C,K*f*/\u001e\u001dh=vyIWm=$>p\u001c+e<C%\u0016(t\"-6W$>M23Yo9s(wXj\u0006 '#\u001e4m}:6\u0016V";
        objectArray[77] = "w'`\u0018Zy4y}\u000f#e'7[J\u001cZq!a\u001cAZ`~[;\u001dYkCt\"Xd[]A<^ntgC\u0013lBD+Z H`JUT\u001b|po f7CG1JT\bXIp]O,biQPo\u0014\\QTfg4roTw8\u000fn}4%@\u001e^@lYJ\rhd1[er\u001e1kfyBI;b \u0006KQga}}C@9h\u001bjB]rduy\u0003Q8\u000b";
        objectArray[78] = "3&,X\u0005\u0007.w$\u0016;_/'4@GY)J!QDT<$\"P[]S";
        objectArray[79] = "w\\A\u0018/@rXJ\u0005R[rRBc4Z+[B]i\u0019wX$\u0005/\u001evY\u001aXlBu?";
        objectArray[80] = "\u0015\u0013\u001f)L8_VO.3 I\u0017\u0013p_\u0012\u001eTL/\rE\u001a\u000e\u001cw^|UR\u0014v3t\\\u0007MhN>\u0019WJ\u0017";
        objectArray[81] = "\u0017>N~Q\u0018J#[v3\u0016\u0017&D!_$@e\u001aw\u000fs\u0014(C6]\u001c\u001b$\\-3\u001e\u001e0\u001c$XC\u0003%\u0014F";
        objectArray[82] = "42@g[:i/Uo944*J8U\u0006ci\u0014n\u0002Qe+NbH>&lP:9<=<\u0012=Ra )\u001a_";
        objectArray[83] = "KxI\u0006TKX9EL;@J4W\u0013Wr\u001bs\u000bK\u0003%\u001b5SIJJXrM\u0011;HC\"\u000f\u0016P\u0015^7\u0007t";
        objectArray[84] = "^)NuB\u0003U9I(&\\BheqtW38kbJa\"\u0002\u0014\\G\t38cIb\u0003\r\u0006@,\u0018fV|z}\u0018s\u0003-u[]_\u0011\u0001LQi\u0001\u0016!KhfW7%\u0011(\u0017V\u0007>m\u007fJt\"\u0007mOw~U>xTAd\n\bfoXT7\u001cn~bc\u001e\u001cz]y\\\u00144O\u0010\u001fK\t.Lk\u0017ZW'*!CT\fx\u0013.]A\bD";
        objectArray[85] = "UC\u0011,\rhE@T~<w\u0018\u0005\u001c<M}yyU\u001bM]H\u00120%EM\u000f\u0019\b!Ym\u0004u%>Uk\rc\u0003 {cp`U#\u0002B}C\u0010\u0011}uYbU\u0007\u0006B\u0004V3qX~Zx\u0015y^,VV\u0001{`pN@U\u0005l\u007f\u000bV3\u0013x_y@\u001c8G,RbV\u0011\fM\u0005g^A\u0005(\u0004FT$CbV@\u0004A^nP\u0011\u0005.[hX\u0011n";
        objectArray[86] = "9Ti\r0p?H7\u0012\\jyx2\u001a3ooHUJ$s>A2H,z;$";
        objectArray[87] = "*+\u000e\b&f\u007fw\u0015\t\u00183|;#\u0010w!t*\f\u0016\u0018`l#W\u001bw#+=\u000fj!g/,R\u000ey9s.Rjs?o'\u001a\u0004\"1o.j";
        objectArray[88] = "=pH{})8v@{\u0016=\"cC.m:$\fO..'$sA8vw_nP'.-0kV/.F";
        objectArray[89] = "U\\\u0002eY\u000e\u0003\u0010Rr\u00005\tMCE\"G1\u000b\u0013cV\b.\u0002)C\u0017_\f>4d9\u0005!\rUy-[R\u0011?t\u0007^)#\u001et\u001b~Q/\u001dv6G\u0007<)s&t,+,\u007f\"M=\u000b\u0000z\u000eD.P\u0014%\u0003W\u0011>=U-w-.TS+\u007f\u0000'_C\f\u000e._ r\u000b\u000f]\u0006\u001ehg\t\u0011\u0005Ri\bJV\u001b\n\u0018\u0016\u000eW\b\u0012!]H\u000f\u0010o";
        objectArray[90] = "Tn%]F \u0003d,\u001b9uEstkWP\u000b5?DV+\r8'^KU\"\"?\u001bALX`:ZB-%..`Il\u0018\u0010\tCfQ8.)[UI)\u0005|\u001aUyP=\u0001cTJV\u0019%Ya`/\u0011'mek$\u0013\"la\u007f+\u0006,i\tkUg\u0007rD{2\u0002%\\ZNW\"| \u0000b\u000e5#[\bsP<E\u001d^.\u000f |L\u0002v\u0019_";
        objectArray[91] = "\u0016 =\u001e`|U\"'\u001f\u0003\u007fA~\u0007\u000elX,)\u001e\fak]l:K=a\f\u0002\f\u000bov=\"\u00117L~R/2\u0015J}+1\u001d*s~\n\u0016n8{!\u0011\u0002\u0005\u001eO|\u001c\u00138If@2j\u000f.}'\u0000\b\u001a\u0018yS\r*-8eP\u0013\u001f\u0010\u0002ZQ\u00044\u0015.yG\u0015\u0013l\b3F\u0007\u0010-r:h\n81\t2yT1W\u001cgy\u00133;\fr'QR";
        objectArray[92] = "<JjE=}k@c\u0003B(-W4V\u0000\u001fyJhT\u0004\u0001]CIZ\u0013!bC@_'\u0012hDk\u0004\u0010\u001ca\u001elr\u001f2s\tRH-\u0013p:x}\u0000,OEi^26{6wT/&b#SH\u00120~\"VW?\u0012g\u0002FD>\u0007~\u001fMz\u001e\bCARF\u0007 nDxF\r\u0017dDS8~0eF{W=w{\u001e\n\u0005%sg\u00043Ty+q{";
        objectArray[93] = "o?63 %bdr=Q7k M=45\u0006`v0l)i#1.4X";
        objectArray[94] = "#fuT\u0003\u0007 gj]l\u000f!nv>\u0007\n2~zPV\u00042w\n";
        objectArray[95] = "<-[H,O*(\bV\u0017IzfDQfC\u001b\u001a\rvfc*qhHnsmzPLrSf\u0016}S~Uo\u0000[MP]\u0012\u0003\rN)|\u001f H|VK;\u0001\rj-|f5k\u001cs@8\u001bM\u0014u\u001245Y\u0016KN,#\rhGAi5k~Sa\u001b#DUl\u00120\u0001\u000e|'sg\u0004\u0006,,\\j2ZW*@4-6G)E28P]eF5J";
        objectArray[96] = "!+\tNX\u0002fl\u0015ZD~}:@zd\u001fzo\u000frc'Vr.Th'b]4jIDa_\u0001Fe\u0006 R\ry\u0019\"VMQG|\u0011Ju1\u0010B% Y\rLF&\\O\u001eN\u001fNw|\u0002Pk'f|\u0007mj1IO]F`'R.\u0006dc\u0014{u\n\u0014\u001c\u000f!XV[\\\u0007fu!W'Gjq\u0006M\\O{/\u000f+\u001e@cu\u0001\u0011^Ews\n+";
        objectArray[97] = "D;v\u0005]\u001aR>%\u001bf\u001c\u0002pi\u001c\u0017\u0016c\f ;\u00176RgE\u0005\u001f&\u0015l}\u0001\u0003\u0006\u001e\u0000P\u001e\u000f\u0000\u0017\u0016v\u0000!\bj\u0015 \u0003X)g6e1'\u001eC\u0017 '\\)\u001e#FQ\u0002\u0015@\r`Y\u0004GL#t[:\u001bT5 %6\u0014\u0011#F3\"4c5i\u0018\u001dGH\u0017#1V&\u001f\u0012+a\nIP.t\u000f\u0019\b\\d\u001b\nX\u0010J.}\u0010\u0014\u0013M\\&\u0006X\u001fQewZ\u0000\t.";
        objectArray[98] = "<\nE\u0001g\u0019wL\u001d\u0019\u001aN*K3\u0001q@M\bOPzZ#\u000e\u0011V}GM\f\u0019V|_t]E\u000ej ";
        objectArray[99] = "p2\u001e\u0016\u00192f7M\b\"46y\u0001\u000fS>W\u0005H(S\u001efn-\u0016[\u000e!e\u0015\u0012G.*\t8\rK(#\u001f\u001e\u0013e ^\u001cH\u0010\u001c\u0001S?\r\"c6w\u001eH4\u0018\u0001**.BF=t\u0004\bJ@ox*\u001cH~3`<H6r<%*. f\u001cW<\u0001\u000bYo|\u001eK\"\u0012\u000e+\u001bCrNad'\u001c\u001c] hms\u0019\u001c8~'\u0015\u0003P;yU\u001f\u0002F##-\u0012OS*\u001ah\u0014LD.#9H\u0014RQ";
        objectArray[100] = "j\f<\u0018q)7\u0011)\u0010\u0013'j\u00146G\u007f\u0015>Pf\u001d)BkX(R|,x\u0019$\u0018\u0013/c\u0002nBxr~\u0017f ";
        objectArray[101] = "\u001fup\u0019\f;\u000fv5K=%\u001fcb\u000eT%~#r\u0010\u00000\u0011`5\u000eXA\u001b|j\u000f@&\u001exa\u0012=";
        objectArray[102] = "=3=b?I`.(j]G=+7=1ujhikg\"n28:0\u001b!n0;]O4=o86\u0012)(gZ";
        objectArray[103] = "C\fD=\u001e$\u0003\u000e\u00102y/\u0014\t:5\u0005!\u001e\u0013}v\u0015$\u001bKG#I?\u001auF=E8\u0015\u000e@!\u001b'yI\u0000)D1\u0016\nG7\u001c@@\u0007\u001a'\u001f;H\u0016D.y}H\u0015\u00002I*B\u001cFM";
        objectArray[104] = "F5/0 1@)q/L%\u00109P%= \u001c#\u007fH+$L*./'&\u001a.\u0013";
        objectArray[105] = "ph!2~].:u5oc$4h4ocpi|/l\u0001'h,!{c";
        objectArray[106] = "|2\\IzN>rL\\y7 fZC`[\u0012:\u001c\u001e<7|1\u0016L=R:{DJm77pOE?W&jBN\u0007\u000e}gAQeY|7OF\u0007";
        objectArray[107] = "qU\u0011RYl}WGVdn:\u0017\u001eS&Yn\nBQ\"GJ\u0003c_5gu\u0003jZ\u0001T\u007f\u0004A\u00016Zv^Fw9tdIxM\u000bUgzRx&jX\u0005C[\u0014plv]Q\t`ucyM4vib|R\u0019TpBlA\u0018Ai_g\u007f8NT\u0001xC!fy\u0004RC+Qs\u0004y=\u001c;i\u0004[\u0005\u0019j+A ";
        objectArray[108] = "Y\u0002\u0013\u0003n\u0001\\\u0004\u0017\u0000_WH\u0000\u001fmcLEX\u0003\u0002 \u000b[\u0000r";
        objectArray[109] = "\u0017da~QwFjaw!e\u001b\\cd@\u007f\u0013\u0007#cE$\rh`$[||";
        objectArray[110] = "\n^bI\u0001X\u0006\\4M<ZA\u001ch^\u0003CU\u000f\u0013hRf\rP\u000bK}M\n\rjxFV\u0007\b\u0011iF@\u0001\u000fh}rER}4\u007fCO\u0017\t\u0016HMR]O.EcU.B\u0017\u001fcs(R:xL_?j\u001dKG\u0000\u000bV*|_b#O+[Sd7K,\\ZOQYl[Ac<\u000b\u000f&\u0005M\nZ5]\r\\TSS\u001aA[PA<Y\u0006E\b0";
        objectArray[111] = "1i)Y\r4!jl\u000b<'*l+QQ(,\u0003jIXs!l)\u000eF+PgmN\u000319d:D\u0007N2\u007f2\fW!7y:\f<";
        objectArray[112] = " {_9n2k=\u0007!\u0013j*\r\u0001(ozQ\u007f\u001c(/n6}\u0014!*\u000b";
        objectArray[113] = "Ayw\u001bzc\t$pN?R\u0011 m3(.\u0013&\u001cOqj\u001f/\u007f\u0012{*E(\u001cI9*D#{K1#AF";
        objectArray[114] = "5Z*Gtf0\u000bh\u0002\u000f1 \u0016\u0013\u0011j3MV(\u001c2/\"\u0015o\u0002j^";
        objectArray[115] = ",s\fJrK)u\u0004J\u0019X.b\u000er\u007fYwk\u000eL\"\u001a+hh\u0014d\u001d*iVI'A)\u000f";
        objectArray[116] = "H\u0018]~:\u0002G\u0006Hz\u0006[\u0010\u0006PWaW\u0014}\tnaQ\u001f\u0006\u0001\u007f?Xy";
        objectArray[117] = "\u0013\u0014\u0007x#2\u0016\u0012\u000fxH0\u0001\u0005\b=40\nh\u0005.2'N\u0004\u0003=*cq\u000e\u001ey,;OS]%/]";
        objectArray[118] = "U\u0018-\fv>V\u00192\u0005\u00190S\u001b\u0014\u000bi,:_*\u001e%5]]\"\u0017 P";
        objectArray[119] = "YKNBvJ\u001a\fP\u001a\u0007K\u0002LO\u0016{Y\bZ*\u00059\u001f\u000fPO\u001b`K]6\u0016\u0002c\u0018\u0014YUE}@e";
        objectArray[120] = "nT-\u00125&g\u0004\"SDus\u0014TF!w\u001eQ`H.|eYq\u0016'\u001a\"\u0015v\u00125uaRhJD";
        objectArray[121] = "3G$\u0006D@p\u0000:^5Tw^!G5\u0013r^}JZP5@%;\f\u0015?Uz^J_mS*;";
        objectArray[122] = ";$\u0003 c\u001d}=E?\u0002Emwg\nnl8\u0011y?`rx5Daxa\u001f5[\u000b~B*\u0003|\b`f3*\u00052m\u001eq\u0017F3{p<aTj>{=1d)eg~\u0005g\u001bCO\u0006ky ci\u001b\u0011u4XF?j\u000b\u001fmd\b;v!SJ\u0007:y0ca\rd\\kb]y\u001cqP;R&1]+3Cx8;l\u007fD|*T/8Z$[";
        objectArray[123] = "I$)7[v\nz4 \"j\u001941m\\?hF2,\u0012rT$\u000b\u0004MFXZt PoP%u`oanC\u00141\\`\bX1gy4uu\"\u001aKOK \u0011\u0000L4Ih\u0010\u0000EpQr\f3moM]t&\u0013hd \u00114\\iQ\u007f2\u0014M`M)\u001d\u0006K]sHr\u000f^vuW\u0017]\u001b}Rr)&\u0013l\f{O0Fe\rz$m[p\u0005\u0018";
        objectArray[124] = "cv 2\u001e(p7,xq#b:>'\u001d\u00113}b\u007fJFb\"4x\u0013-??!pq";
        objectArray[125] = "\u0006,gh,8E.}iO;QrSN0=\u00125i<5\u0011\u001d91I\u0014a\u0018\u0001u~4\u0000G\u0019\u007f@7>\u0012o|@\u0016\u0018'\u000fh\\=5&>Oy%;\u00075kt\u0004`3:GHt\u0019=\u000eT_-bC\u0006_\u007f5\u0017\u0019/3B\u0012$9\u00120A\u0014\u001b$7wh\f\u001b'\u00121u\r\u0012;\u0012\u007f\u0004s#\u0019c|k0d\u0007;\r;7&A;j9?/D^";
        objectArray[126] = "\u0013\\\u001c\f\u001et\u0004\u0013\u0002a'|\u0004\\\u001fY\u000b\u000f\u0014-S+H\n\u0012\u001e\u0012\u0007D.\u001e& '\u00107;,T\u001b>4\t\t*\u0006'\rM\tW\u0002F'(WT\\=6\u001a\u0010.%\u0015r\u001e\u0001\f8+-\u00153,P\u001e\f\u001e+R\u0013\u0000}\u001e'\u00153:\u000b\u0019&\r02\u0011'U\t\u0005>\u001f\b \u001c\u001bA/N>n\u0018\u001a7\u001c\u001dW\u001e\u0004.uU\u001c\u0006\u0013+\u000e]\rX\u001aM";
        objectArray[127] = "r[Be\u0000\u0011%QK#\u007fN\"\u0016|q\u001b\\\"jI{\u0001A?\u0004\u0018u\u0001HO";
        objectArray[128] = "\u001dn<\u000670W+l\u0001H(Aj0_$\u001a\u0015.a\u0005xM\u0015\u007fjS*'MviW&M\u001dn<\u000670W+l\u0001H";
        objectArray[129] = "YHKV?\u0019HRF]\u0007\u0013VRF\\I\u0004WNX]\u0007@\u0013_EBe\u0017\u0012\u000fKU\u0007";
        objectArray[130] = "E)a\u0012\tMAw9\u0016uMGu9\u007f\u0010\u001c\u001c\u007f!\u0015\u0014BD{]";
        objectArray[131] = "c;<j9#u>ot\u0002%%po`@\u0012qm3bD\fUd\u0012lS,jd\u001big\u001f`c02P\u0011i97D_?{.\t~m\u001ex\u001d#K@!Gb2hr;s\u0011,bo+j\u0004\b~R=v\u0005\ra\u007f\u001fo%\u001dr~\nv8\u0016L^\u0005Kf\tpG-fc#pM\u001alc\b\u000e;2n67u3#0?Qe<)m.7\u007fp*j\\";
        objectArray[132] = "NR9\u001a!M\u0005\u0014a\u0002\\\u000fC\u0013o\u001a9t\u0006Vi\u001egEN\u000bnK\"t";
        objectArray[133] = "\"\u001e}\u0013TJtR-\u0004\rq~\u000f<\u001c\u0017\u0000tn@U0\u0000T_+0\u000e\bD\u0018 \b\n\u0014d\u0013L%\u0015\u0018b\u001aZ\u0003\u000b6jgYU\bOKjz\u0010:0|N[U,KK\u0013o3Z\u0015wMA\u0015R\u0013%Ao\u0001P-yYyU.!v\u001co385Vny\u001c\u0013\n%E[V:AD\u0012^^jH%Xs\u0003P\b Lu\bjH&NmPQ\u001ej\u001ez\tj";
        objectArray[134] = "\\$C\u0004qS\u0016a\u0013\u0003\u000eK\u0000 O]byVb\u0016\u0001?.T.HPhU\\?\u0016Y\u000e\u001f\u00150\u0011EsUP`\u0016:";
        objectArray[135] = "\u0016\u0017ye&o\u0006\u0002''Gh\u001c\u001esaG>\u001fM|d~oC\u0015j\u001b";
        objectArray[136] = "3+4\u001f\u0018\u0010pl*Gi\u001dh76\"\u0014Gu8iA\u0017\u001fcoP\\W\u0013rk3\u001cY\u0007vVl_\rB~9/\u0018\u0013\u001a\u000f";
        objectArray[137] = "p1\u0017$?tpw\u001937\u0015#j\u0019;c|/S\u0017;sxI2\u0006'2p.0\u000e.7\u0015";
        Object[] objectArray2 = objectArray;
        objectArray[138] = "\u000b[2f=\u0014\\Q; B^[\u0011?gB\u001dD\r8}9\u0015US1\u001b\u007fC\b\f-\".\u001fP\u001aR";
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A2;
        if (f[n2] == null) {
            m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }

    public static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x553A) & Short.MAX_VALUE;
        if (j[n2] == null) {
            m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.j[n2] = i[n2] ^ l;
        }
        return j[n2];
    }

    public static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void exec(LiteralArgumentBuilder literalArgumentBuilder) {
        ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("state", (ArgumentType)BoolArgumentType.bool()).suggests((commandContext, suggestionsBuilder) -> suggestionsBuilder.buildFuture()).executes(commandContext -> {
            this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((Boolean)commandContext.getArgument("state", Boolean.class));
            return 1;
        }))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("setting", new m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM(this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX)).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8("clear").suggests(this::m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP).executes(commandContext -> {
            m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 = m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM.getOption(commandContext, this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX, "setting", 448615424);
            if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr) {
                m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr = (m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
                ((Set)m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr.getValue()).clear();
                m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr.m$$9CfHjbrlg3lojvzMCur3pT97wrs5DycHxtyGDkWIYydsdQHR12da1jLKeR7NhqPxNFjETsEDoDPgJQaA8s40JZucSUhtkV6u1(-1400563560);
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.getName()).method_10852((class_2561)class_2561.method_43470((String)" ").method_27693(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.getName()).method_27694(class_25832 -> class_25832.method_27706(class_124.field_1080))).method_27693(": Cleared"), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$c1YNZKIre9gha2PNXbjm2rL0bzZp8E5g5prysSUtCYmEx3s7kIMTKClUco1iXIJiAjIYkbL0q1wjtfH7ltIhAh8GLO8gPQEeU);
            }
            return 1;
        }))).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("value", new m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI(this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX, "setting")).executes(commandContext -> {
            m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 = m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM.getOption(commandContext, this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX, "setting", 448615424);
            String string = (String)commandContext.getArgument("value", String.class);
            try {
                m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC;
                block17: {
                    Collection collection;
                    class_124 class_1242;
                    block14: {
                        class_124 class_1243;
                        block16: {
                            block15: {
                                Object object;
                                block12: {
                                    class_1242 = null;
                                    if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC) {
                                        block13: {
                                            m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC = (m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
                                            object = m$$tQzKMxUjFH9uRZjhKMcY8q3DfZQwOe8agGk67vEKJw2wSstcz0mKFZVYsuXcd2YFZodE1Ei2NQ5XNaRInXnVLJh5iWz2Xs1sd.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC.m$$YKijqkQLQFlJwGQrCPIf2qAeeJp0LiZ6TFS5dSgZkU3mS0GioiPLQzm08gbfsDQvbcNEGYQ9eOQB0bGLbkkn73y1F2xsqvkEt(-1186601045));
                                            collection = object.m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx(string);
                                            try {
                                                if (collection.isEmpty()) break block12;
                                                if (!collection.stream().anyMatch(m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC::m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz)) break block13;
                                            } catch (Throwable throwable) {
                                                throw m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.a(throwable);
                                            }
                                            collection.forEach(m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC::m$$q60MFbe6wdivWp4kRCKnlZZPlYEn3tV4kfyfYvLxmOjTDK7AxLlTtFsQ579mT62x8LKzvOCLsSewKyc0PBtW1vCddwE5OeN7R);
                                            class_1242 = class_124.field_1061;
                                            break block12;
                                        }
                                        collection.forEach(m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC::m$$0a6satRcVmfiZwanl0RgzcMCb0erhZREX3tKsob6XE1D4QKMc68LuPqxPdhcvQymN439ibhFWuDkCK4ezfpJrVIkGLaGWuoTq);
                                        class_1242 = class_124.field_1060;
                                    }
                                }
                                try {
                                    if (class_1242 == null) {
                                        m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(string);
                                    }
                                } catch (Throwable throwable) {
                                    throw m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.a(throwable);
                                }
                                m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC = this.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, 2045927369);
                                if (!(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr)) break block17;
                                object = (m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
                                if (class_1242 != null) break block14;
                                try {
                                    block18: {
                                        if (!((m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr)object).m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz(string)) break block15;
                                        break block18;
                                        catch (Throwable throwable) {
                                            throw m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.a(throwable);
                                        }
                                    }
                                    class_1243 = class_124.field_1060;
                                    break block16;
                                } catch (Throwable throwable) {
                                    throw m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.a(throwable);
                                }
                            }
                            class_1243 = class_124.field_1061;
                        }
                        class_1242 = class_1243;
                    }
                    collection = class_1242;
                    m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC = class_2561.method_43470((String)string).method_27694(arg_0 -> m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_124)collection, arg_0));
                }
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.getName()).method_10852((class_2561)class_2561.method_43470((String)" ").method_27693(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.getName()).method_27694(class_25832 -> class_25832.method_27706(class_124.field_1080))).method_27693(": ").method_10852((class_2561)m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$c1YNZKIre9gha2PNXbjm2rL0bzZp8E5g5prysSUtCYmEx3s7kIMTKClUco1iXIJiAjIYkbL0q1wjtfH7ltIhAh8GLO8gPQEeU);
            } catch (Throwable throwable) {
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)"Invalid value: ").method_27693(string), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$k1LAUjGNBZC1k3oLW1qJRTG6syW3ZlxEir5j5DXnrkWoseyEnu41QyoRtX59OR0rxI7Ro0GwjmKgsGQ9xtvvl1isGfvKVqZEc);
            }
            return 1;
        }))).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("reset").executes(commandContext -> {
            m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 = m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM.getOption(commandContext, this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX, "setting", 448615424);
            m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.reset(1165022422);
            return 1;
        }))).executes(commandContext -> {
            m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 = m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM.getOption(commandContext, this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX, "setting", 448615424);
            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.getName()).method_10852((class_2561)class_2561.method_43470((String)" ").method_27693(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.getName()).method_27694(class_25832 -> class_25832.method_27706(class_124.field_1080))).method_27693(": ").method_10852(this.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, 2045927369)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX));
            return 1;
        }))).then(((LiteralArgumentBuilder)me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("Enabled").then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("state", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> {
            this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((Boolean)commandContext.getArgument("state", Boolean.class));
            return 1;
        }))).executes(commandContext -> {
            String string;
            class_5250 class_52502;
            try {
                class_52502 = class_2561.method_43470((String)"Module ").method_10852((class_2561)class_2561.method_43470((String)this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.getName()).method_27694(class_25832 -> class_25832.method_27706(class_124.field_1080))).method_27693(" is ");
                string = this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.isToggled() ? "enabled" : "disabled";
            } catch (class_151 class_1512) {
                throw m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.a(class_1512);
            }
            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_52502.method_10852((class_2561)class_2561.method_43470((String)string).method_27694(class_25832 -> {
                class_2583 class_25833;
                try {
                    class_25833 = this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.isToggled() ? class_25832.method_27706(class_124.field_1060) : class_25832.method_27706(class_124.field_1061);
                } catch (class_151 class_1512) {
                    throw m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.a(class_1512);
                }
                return class_25833;
            })), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX));
            return 1;
        }))).executes(commandContext -> {
            class_5250 class_52502 = class_2561.method_43473();
            class_5250 class_52503 = this.m$$v8v8UVuy8ui4LQgAeJ3uzhm525EfSSSdvg5Hv2S3HeeOaHv0VUf3txWUowlbKfGhpM3s9oY0VavnlouAggp9ZSaZNX5ZtqHGP(1657148431);
            class_52502.method_10852((class_2561)class_52503).method_27693(" [%s - %s]".formatted(this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.getKeybind().m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T(867598444), this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.getKeybind().m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q().getName()));
            for (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 : this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.getRegistry(2052655641)) {
                class_5250 class_52504 = class_2561.method_43470((String)new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.getName()).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\n\u0001: "));
                m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF52 = m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
                Objects.requireNonNull(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF52);
                Object object = m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF52;
                int n = 0;
                switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR.class, m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr.class, m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm.class}, (Object)object, n)) {
                    case 0: {
                        m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR = (m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR)object;
                        class_52504.method_10852((class_2561)class_2561.method_43470((String)m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.m$$kTxNO7bxOV7y8wK9SPrd5LIxH5FNuf0Ft3pd0g4UJb31q1GzlkxuhREyKEVW4hQbIzBrXCkIpsREzH7FxtYlJ7vjanvefIL3i(((Enum)m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR.getValue()).name())).method_27692(class_124.field_1080));
                        break;
                    }
                    case 1: {
                        m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr = (m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr)object;
                        class_52504.method_10852((class_2561)class_2561.method_43470((String)String.join((CharSequence)", ", m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr.m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr(938950176))).method_27692(class_124.field_1080));
                        break;
                    }
                    case 2: {
                        boolean bl;
                        Color color;
                        m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm = (m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm)object;
                        try {
                            color = m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm.m$$GiZfUtIzdPDN6Di8UtAQL2kJb46W00Xe6BeaWCsnwMnIG0pmipHfQi309garOgdEDKOWYO3rZLoUlDDwveQPLfLRxPXEWmrxm(-83630264);
                            bl = !m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm.m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1;
                        } catch (class_151 class_1512) {
                            throw m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.a(class_1512);
                        }
                        String string = m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(color, bl);
                        class_52504.method_10852((class_2561)class_2561.method_43470((String)string).method_27694(class_25832 -> class_25832.method_36139(m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm.m$$GiZfUtIzdPDN6Di8UtAQL2kJb46W00Xe6BeaWCsnwMnIG0pmipHfQi309garOgdEDKOWYO3rZLoUlDDwveQPLfLRxPXEWmrxm(-83630264).hashCode())));
                        break;
                    }
                    default: {
                        class_52504.method_10852((class_2561)class_2561.method_43470((String)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.getValue().toString()).method_27692(class_124.field_1080));
                    }
                }
                object = new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.getName()).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.getName().toLowerCase()).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR.m$$TRdDqBJgjZ1fw9rIVfhStjcPOPjNzy6jg68DukqXu2g24StbWqoO7VTCIgO8JxiARBFlRnv98GgLAhEyYbNiJhiID7o3hu0OB(-1241911330)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\u0001\u0001 \u0001 ");
                class_52504.method_27694(arg_0 -> m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((String)object, arg_0));
                class_52502.method_10852((class_2561)class_52504);
            }
            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_52502, m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1));
            return 1;
        });
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("reset").executes(commandContext -> {
            for (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 : this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.getRegistry(2052655641)) {
                m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.reset(1165022422);
            }
            return 1;
        }));
    }

    public static /* synthetic */ class_2583 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_124 class_1242, class_2583 class_25832) {
        return class_25832.method_27706(class_1242);
    }

    public static /* synthetic */ class_2583 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(String string, class_2583 class_25832) {
        return class_25832.method_10958((class_2558)new class_2558.class_10610(string));
    }

    public CompletableFuture m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        try {
            m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 = m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM.getOption(commandContext, this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX, "setting", 448615424);
            if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr) {
                return class_2172.method_9253((String[])new String[]{"clear"}, (SuggestionsBuilder)suggestionsBuilder);
            }
        } catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return Suggestions.empty();
    }

    public class_2561 m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, int n) {
        class_5250 class_52502 = class_2561.method_43470((String)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.getValue().toString());
        if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm) {
            m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm = (m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
            class_52502 = class_2561.method_43470((String)m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm.m$$GiZfUtIzdPDN6Di8UtAQL2kJb46W00Xe6BeaWCsnwMnIG0pmipHfQi309garOgdEDKOWYO3rZLoUlDDwveQPLfLRxPXEWmrxm((((0x6225DF5C ^ n + 17) + 17 >>> 17 | (0x6225DF5C ^ n + 17) + 17 << 15) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) - 17), true)).method_27694(class_25832 -> class_25832.method_36139(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.getValue().hashCode()));
        } else if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr) {
            m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr = (m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
            class_52502 = class_2564.method_36332((Collection)m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr.m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr((922172447 + (n & 3) ^ 0x200) - (n & 0x10000) ^ 0x1000000), (class_2561)class_2561.method_43470((String)", ").method_27694(class_25832 -> class_25832.method_27706(class_124.field_1080)), class_2561::method_43470);
        } else if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$Sc5Y8o1OuTYi4MLSAIzNFnbvTemFJeRD22TFG7uOgMnyNPvZDugsMZ660XsEQfte53ZKf9nmzu99eawHc57GerNGzGULX3ff9) {
            m$$Sc5Y8o1OuTYi4MLSAIzNFnbvTemFJeRD22TFG7uOgMnyNPvZDugsMZ660XsEQfte53ZKf9nmzu99eawHc57GerNGzGULX3ff9 m$$Sc5Y8o1OuTYi4MLSAIzNFnbvTemFJeRD22TFG7uOgMnyNPvZDugsMZ660XsEQfte53ZKf9nmzu99eawHc57GerNGzGULX3ff9 = (m$$Sc5Y8o1OuTYi4MLSAIzNFnbvTemFJeRD22TFG7uOgMnyNPvZDugsMZ660XsEQfte53ZKf9nmzu99eawHc57GerNGzGULX3ff9)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
            class_52502 = class_2561.method_43470((String)((m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp)((Object)m$$Sc5Y8o1OuTYi4MLSAIzNFnbvTemFJeRD22TFG7uOgMnyNPvZDugsMZ660XsEQfte53ZKf9nmzu99eawHc57GerNGzGULX3ff9.getValue())).getName(((-1381386965 + n >>> 5 | -1381386965 + n << 27) ^ n >>> 8) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01));
        }
        return class_52502;
    }

    public class_5250 m$$v8v8UVuy8ui4LQgAeJ3uzhm525EfSSSdvg5Hv2S3HeeOaHv0VUf3txWUowlbKfGhpM3s9oY0VavnlouAggp9ZSaZNX5ZtqHGP(int n) {
        class_5250 class_52502 = class_2561.method_43470((String)this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.getName());
        class_52502.method_27694(class_25832 -> m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_25832, () -> {
            Integer n;
            try {
                n = this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.isToggled() ? class_124.field_1060.method_532() : class_124.field_1061.method_532();
            } catch (class_151 class_1512) {
                throw m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT.a(class_1512);
            }
            return n;
        }));
        class_52502.method_27694(class_25832 -> class_25832.method_10949((class_2568)new class_2568.class_10613((class_2561)class_2561.method_43470((String)this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.getDescription(270386090).split("\n")[0]))));
        class_52502.method_27694(class_25832 -> class_25832.method_10958((class_2558)new class_2558.class_10609(new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)this.m$$WIMUmuqPxV7adU86wZwBfu2dtr974BJtKVmN2SdXQR1QoUf6tDQQhosobH47teOOLiezGrzQetS3WL5oBFaPFYctLKn3dK3OX.getName()).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR.m$$TRdDqBJgjZ1fw9rIVfhStjcPOPjNzy6jg68DukqXu2g24StbWqoO7VTCIgO8JxiARBFlRnv98GgLAhEyYbNiJhiID7o3hu0OB(-1241911330)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\u0001toggle \u0001"))));
        return class_52502;
    }

    public static String m$$wvAc9KCX0sGZYFLHosUDmkeQQv635jCThlEImFq1aXUhIDm2GaiQTNg55YCG8CiUAl5QoZPGqzx4A0KdeeyBpZenPXXBDl32c(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{75, 55, -80, -104, -127, -119, 34, -104, 75, -78, -55, 7, -114, -96, 80, -28};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 16]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

