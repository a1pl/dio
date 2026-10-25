package me.mioclient;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.concurrent.CompletableFuture;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw;
import me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud;
import me.mioclient.mixin.m$$v6OpYJxV3vMbnhU2UeqSXrGxqgpybzwPIKtqWyEaTxn8tva8vvPPadGTe9UEIZrOIqSW0VnpkpNCrslmaeDN2yma9oZskTVoC;
import net.minecraft.class_1049;
import net.minecraft.class_10537;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2960;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF
extends m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP {
    public static final byte[] m$$EPkkXEysRLWIx3KimJ9pdmLR8lhNeDYlZA0xnS0jwd85lREHIsVN02e1tfO102BCpAD3Zb2P3s4zi1o5oPsXycIhuDVoILVM8;
    public CompletableFuture m$$L4eZLVx4AdETYEDABW59MkLtO8njojfpktnnNjE15Tg4MgX0sCgU4aeBbTluUcy2DGHzd1eJdWVpZnSflIqib7iiTIDDwuAsU = CompletableFuture.completedFuture(null);

    public m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF() {
        super("reload");
        this.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("rl");
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
                                m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.k = new Object[65];
                                m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.l = new String[65];
                                m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.e();
                                var21 = new String[8];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c("2IcgcWssarFcON4WudY4", MethodHandles.lookup(), "m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c", m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.class, 967870558);
                                var20_3 = var18_2.length();
                                var17_4 = 32;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 65;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c("HzKXC83MLxCr8f4lh9PU", MethodHandles.lookup(), "m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c", m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.class, 1834156658);
                                    var20_3 = var18_2.length();
                                    var17_4 = 6;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 81;
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
                                            v15 = 62;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 96;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 73;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 105;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 39;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 35;
                                            break;
                                        }
                                        default: {
                                            v15 = 116;
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
                        m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.c = var21;
                        m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.d = new String[8];
                        var8_7 = 3037621214228732053L;
                        var14_8 = new long[57];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c("AIH27NXqk33tMZU7bSWd", MethodHandles.lookup(), "m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c", m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.class, 1100813599);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c("WJYxhvfvjRf2guPfzQW9", MethodHandles.lookup(), "m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c", m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.class, 1265759229));
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
                            var12_10 =  /* dynamic constant */ (String)m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c("cWTB7gGiqbhDL81UuYVu", MethodHandles.lookup(), "m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c", m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.class, 715657924);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c("uer5QdAwlsWQe6RqViWX", MethodHandles.lookup(), "m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c", m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.class, 152091221));
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
                m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.e = var14_8;
                m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.f = new Integer[57];
                m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 286866;
                var0_14 = 7777550386585423738L;
                var6_15 = new long[11];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c("gznu9sZK3vxOVIJI3ytA", MethodHandles.lookup(), "m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c", m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.class, 714358379);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c("Uf87XSAD3TceR6KCOiOL", MethodHandles.lookup(), "m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c", m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.class, 1414493267));
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
                    var4_17 =  /* dynamic constant */ (String)m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c("4lmDhkxmm7auIN2f61Yn", MethodHandles.lookup(), "m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c", m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.class, 1985702209);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c("HjoCC9wE1VJ4Snbl90lf", MethodHandles.lookup(), "m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c", m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.class, 734896940));
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
        m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.i = var6_15;
        m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.j = new Long[11];
        m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)5521764072322433351L);
        m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.m$$EPkkXEysRLWIx3KimJ9pdmLR8lhNeDYlZA0xnS0jwd85lREHIsVN02e1tfO102BCpAD3Zb2P3s4zi1o5oPsXycIhuDVoILVM8 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
    }

    public static void e() {
        Object[] objectArray = k;
        k[0] = "iI _bEwA:\u0010\u0005DfZ7J#B";
        objectArray[1] = Boolean.TYPE;
        m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.l[1] = "java/lang/Boolean";
        objectArray[2] = ";\\[d I%TA+]Y%";
        objectArray[3] = "HAgQ\bGFH Y\u000f\\\u000bIm\u0018\u0003rh@9FP\u0018\u0014g$\r/EBc\u000bE\r\u007fC\u001c&_\u000e\\qL\u0002o;JU~\u0007w\u0010\u0011O@\u001d\u0005+g\u0011A&j\u0013yA\u0016}v%Bd}}^Q\u001fse\u0011z\u0014_\u0012O/\n4RI|%\t\u0012r\u0012\\\u000eMV\u001b\u0017S\u0010Z\u0016\\Qkyt\b";
        objectArray[4] = Integer.TYPE;
        m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.l[4] = "java/lang/Integer";
        objectArray[5] = Void.TYPE;
        m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.l[5] = "java/lang/Void";
        objectArray[6] = "CWe0+\u007f@Y=7l}L\u0018C0qy";
        objectArray[7] = "a-n3\fNj\"\u007f|qVy%v5";
        objectArray[8] = "6\u0004\u00167@\u00196\u0004\u0001kL\u0016,O\u0001uL\u0003+>P \u001b@";
        objectArray[9] = "\f\f6\u007fw+\u0007\u0003'0\u001c?\u0005\b0j0(\b";
        objectArray[10] = "bLCk`YbLT7lVx\u0007T)lC\u007fv\u0004t=";
        objectArray[11] = "v\u0010[2\u0016Gv\u0010Ln\u001aHl[Lp\u001a]k*\u001e,M\u001e";
        objectArray[12] = "\u0005-[\u0005#6\u001b%AJ@\"\u001f";
        objectArray[13] = " |\u001b&zM+s\ni\u001bC x\u000e3";
        objectArray[14] = ")VzP2\u000b'_=X5\u0010j^p\u0019\u0012\u001d+a2\\>#wJ;K-\u0007\f|,vl&uC\rP4\u0016<T\u0018No\u001e=Cau3&>X<\\m\u000ewPd_\u001e\u00066}.e\"WsZ\u0002J:U3Bdt#\\&R\u001eS:U\u001cP6d\u0011/tTd\\n\u001e\u0003F\u0017riS\u0002\\-^,";
        objectArray[15] = "\u0017xghOF\u0017xp4CI\r3p*C\\\nB!s\u0014\u001e";
        objectArray[16] = ")\rpFT*)\rg\u001aX%3Fg\u0004X0473\\\u000fz";
        objectArray[17] = "8(\u000fFz|;&WA=~7g?N8w!";
        objectArray[18] = "=\u001f";
        objectArray[19] = "o`R\u0003\u0005cdoCLyzkoE\u0000Gj";
        objectArray[20] = "\u0015yd/ke\u0015yssgj\u000f2smg\u007f\bC%33<";
        objectArray[21] = "FV.X\u000fqX^4\u0017GqBT,PNj\u0002b6XS}cG=K@pCE";
        objectArray[22] = "\u0003x+jc4\rqlbd/@p!#s6?uj\u007fL\n mPac7\u0004GNK>k+.7nX:\u0006-\\j<7&Kno37\\g\u007frE\u0013\u0004E]P|*#oWWS*4Zdoh\u0013$-QFkm\u0017PMuz\u0013\u0005m\u007f]x=\"*hu:!\u0006XmEf)\\-6rn";
        objectArray[23] = "\u0017Oj[W\u0004\u0019F-SP\u001fTG`\u0012qR,N#AmR\rr\u000ff\r\u0006\u0014a\u001e\u0007u\u000f \u007f\u0012L\u0007=\r@wzZ\t,^/eZ\u0002\bE\nu\bY\"Dp{hS\u0000l\u0011Zd\r\u0019\u007f,eh\u00078g<nnS=O3U\u000b1\u0011\u0013\u0001uW\u0002\u0013g'ak\u001e-B7ZlR\u001dR\n`n";
        objectArray[24] = "-M3!{\u0013Xm8.j\\%u+)c\u0015M";
        objectArray[25] = "%\u000f_}8J;\u0007E2uP!\r\\ndZ!\u001a\u0007_yR?\u0002Lhw]#\u000boibJ=\u000b";
        objectArray[26] = "Dn=t(!Dn*($.^%*6$;YT{o}{";
        objectArray[27] = "ZU\f\u0007Y]ZU\u001b[UR@\u001e\u001bEUGGoI\u001b\u0000";
        objectArray[28] = "\nLo\t\u0015{\u0004E(\u0001\u0012`IDe@\u001dE2[/,\u001bESyt\t)z\u000fA\u0018\u0003\u000bf\"[\u0004>5b/\u0010\u0005(\u0015CW{31\u0015'\u0011bw\u001e\u001aBTc\u0011V>qSzq>4R\b~r!\u0017X2`%\u0003=U5\\1R+|\u000eg0\u0017.[\u0006\u001b#\u0010\u0011@\u0002\u00119\u0015He\u000f\u001d0,\u0011";
        objectArray[29] = Long.TYPE;
        m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.l[29] = "java/lang/Long";
        objectArray[30] = "\u0019&\u0003aK<\u0019&\u0014=G3\u0003m\u0014#G&\u0004\u001cF\u007f\u0013f@";
        objectArray[31] = "8\u000f\"NZ 1\u0001!\u0007\u0019-)\t(\u0001S&>\u0012a\u0002B&7\u0004*\u0012\u0019\u00032\u0014*\u0012V#\u001a\u0012(\u0015Z*5\u0014\r\u0015^#?\u0005=";
        objectArray[32] = ".Q\r\f*X'_\u000eEiU?W\u0007C#^(LNa(Z _\u000eF";
        objectArray[33] = "M\u0018\u0002'ADD\u0016\u0001n\u0002I\\\u001e\bhHBK\u0005AkYBB\u0013\n{\u0002j\\\u0010\u001adIEZ5\u001a`@OK\u0005";
        objectArray[34] = "[\u0014x(BxE\u001cbg\u000fb_\u0016{;\u001eh_\u0001 \f\u0014hR\u0000z&\u001e";
        objectArray[35] = "&VHF\u0011.8^R\tY.\"TJNP5buWdP5?BSBM";
        objectArray[36] = "yi\u0014V!\u001b1xB\u0002\u0011\u001e<u_Pm\u0018:\u0018\u001cFt\u001dxqHP(\u007f";
        objectArray[37] = "8\u000eDo%n3L\u001f\u007fJ~%\u00156o;b3s\u0013\u007f;b8\r\rr jX\u0014Df.n<\u0012\u001bw7\u00048\u000eDo%n3L\u001f\u007fJ";
        objectArray[38] = "'J\rrh[}RS\"\r\u001bvQ\u000f\u007fs\f\u001b\u0017Uij\b\u007fM\fr0a'J\rrh[}RS\"\r";
        objectArray[39] = "\u001f/\u0002r1\u0017Qk\u0001pN@L(!s5TH;\t\u001es\u0012S3\rz)KHid";
        objectArray[40] = "aM.7a\\l\r.m\u0001B#\u0011\fl>}u\u00076:c}dX\f\u001d?~oe#\u0004zC_{\u0016\u001a|IpA\u00145Ne@\r\r\u0006jGNs\u0003=^Wk\u00061\u0011a`5l\u0003.znt{\u0018\n@NUv82~vP@0\u0012PHPQo)LZ0\u0003\u00178|gh\u007f\u001d+JC5}2TaN5\u0007)9mGv\u0003Qo}\u0019aVa5`Xl=";
        objectArray[41] = "n**\"6\u0004&;|v\u0006\t;7\u001b|b\u0003i$q0k\u000b-[\"pb\u0010h6 u;[W";
        objectArray[42] = "[`%%[i\u0015'/ gp\b'7&\u000bB\\agz]\u0015Xf%&\u000eq\u0002?>|g";
        objectArray[43] = "_hk\u0012&LXiaN\u0019\u001bKfl\u0003e\u001b@\u000bb\u0017pHVbl\u0018\u007f\u001a;mg\u0002#\u0019@{d\u0011#v";
        objectArray[44] = "b6\u0015\u0006MEitN\u0016\"Pb&H6EJz/C\u0001O/e'LFO\u0012~3\u001e\u0012\"O\u007fpU\u0012HD=+E}";
        objectArray[45] = "\u0007j\u0007,R~\u0001*]>;+\u000b'V W\u0019\\d\t\u007f\u0005N\u0007'Q=I7\u001f)S';/Wj].\u000b)\u00170OG";
        objectArray[46] = "Yoldwr\f|$b\u001bwY}uxwE\u000e>+.'\u0012Z:$q$#Qan|\u001b\u007fZxns{*I0h\u001f";
        objectArray[47] = "I10!#N\u0007tj:XRTeY&<o\u0019\t86\u0005g\u00130a-bo8\u0013>q)iB\t\u007f\u0013\u0015\u000e9u04gZ\n'|\u0003\u0003w\b$8%\u0002q5\u0005G6%K\u0015p=/\u0007\fA\u000011\u0013L%2<\u00146O&\u001bP\u0004\u0005f\u0012\"|:6\u0007H\tn!:m59x\u0014;\u000e\u0000\u0002oHiS\u001bw~\"%Z\u00133\u0001\"4W\ttm-2]\u001cI";
        objectArray[48] = "36_kn=8t\u0004{\u00016(\u0007\u0003vlWjv\u0000`>:hsY+\u0001";
        objectArray[49] = "e:(%d&1dp|\u0007%b|q$k\u00173;-|?@2=c$n$hdx~\u0007-ayj/gxr1lC";
        objectArray[50] = "V|\u001f-[u\u0002jCO\u0003u\u0014E\u0017?\u001f\u001cV>\u001e?\\qT;Gtc";
        objectArray[51] = "6\b\u0014\u001c\u000f>sLB\u0011m) ^D\u0014<\u001d0+NK\u0011|7=H.\f!54j\u001bW!<)\u001f;]/L?@IT\b3\u001fL3?\u000fQ\u001el;\u0006\rOBz,\b\u0007A\u0018b='\u001e=\u0000DK\"\u001cC\u001fo\u001a\u0000<6O\u007fF/\u0005n\u0018}2\u0012>U,C\u0017\u0016%@\u0016DK\r\u000fB(evVvcJ^\u0016\u0016-=\f%M\u0011rb\u0019\u0015\u0017\f3or";
        objectArray[52] = "?\u0005Euj4;D\u0016$\u0007#m\u0006\u001cyk\u0011<DE#\u0007x;\b\u0018\"{6|\u0002\u001d\u001e<:>\u0014\u0017.f'\u007f\u0019|";
        objectArray[53] = "\u0019MA6\u0018zW\nK3$cJ\nS5HQ\u001eL\u0003i\u001a\u0006\u001aKA5Mb@\u0012Zo$";
        objectArray[54] = "\b\u000b4yCj[Qa'x\u007fZFmp\u0014M\u000e\u00076.x%H\u0003fz\n!\tP7\u0017";
        objectArray[55] = "XU|G\u0015SS\u0017'WzR_M?X\u0017EUD\tA\u0006DBEG\r\u001eZ\u0006W-A\u0017RB('AABWB,\u0003\u001aR8";
        objectArray[56] = "so{];\u001b3x8\b\\\b.uRU kzu8Wl\u000f2dn\u0003\\";
        objectArray[57] = "{B\u0019Y31/TE;m52A|\no;|B\u0016Ff38=";
        objectArray[58] = "G\u0013|r\u001d2B\u0011m|p\\\u0014\f>aHpg\u001cO-:3b\u001a|l\u0016?F\u0016D^6k_3N*\nE\\\u0001kT\u0017\\eEk)\u0013=O 5*MF^\u0012rP4n\u001a\u0016cr)PE\u001dQRAed\u0016I,\u0002{\u0015\u0016Ek\"Ac\u0011Ds!Iy/7w\u0014Ew\u0000Bb\n:GF\\\u0010\u0013?W\u0017c~\b>\u0019\u0001\u000e+Jm\u001d\u0006nk\u00113[}";
        objectArray[59] = " \u0002Mm^tnG\u0017v%h=V\u000eyTb\\*G^TBmA\"`\\R*J\u001ad@r!&7{Lt(0\u0011eb|U3Gf\u001b]X\u0010\u0002Tdj|1GB\u001f]!\u0005!4Aa\u007f+\u0007<G3s\u0005\u0013>yok\u0013G@u`.\u0005!Va@\\\u0013\u000e}^3w1DT\u0015R 4L\u0004O7(\u001c\u001fb\u001bipE|nIm`G\u0010aOguzGx\u001bczJ\u001deZn\u0011";
        objectArray[60] = "-\u0018@\u001aI\u0001c]\u001a\u00012\u001d0LO\u001dp*dQ\u0013\u001ft4@X2\u0011c\u0014\u007fX;\u0014W'u_\u0010O`)|\u0005\u00179o\u0007n\u0012)\u0003]&m!\u00036p\u0019R^\u0012\u0015B\u0003f-\f\u001f_\u0013\u007f8(\u0003b\u0005c9-\u001cO'z\u0019=\u000fN2c\u000461n=^Z)\rw\u0015s_\u0003\r}\"y_(s\tBsX\n\u0013I\u0019-\u001eq\u0019^\u0018m]\u001d\u0016X\u0012x`";
        objectArray[61] = "-\u0011\f\nB2&\u0010\u0018M~1+E\u001f>\u001a/\f]\u000f\u001a\u0005KzL\u0016\u001e\u001bq THN~ 7C\n\u0019\u00113%@\u001ew";
        objectArray[62] = "%\u0019yF[ovC,\u0018`zwT O\fH&\u0010x\u0010X\u001fvC1N\u0000ahN*F`$f\u0016.CP~{W#(";
        objectArray[63] = "!K\u0010XKI%\nC\t&^sHITJl \t\u0019\f\u0018; \u000f[W\u001aGnHQR&_%RQMK\ngQ\u00183\u001dG ZB\u0003GZaW)";
        Object[] objectArray2 = objectArray;
        objectArray[64] = "=c>}Ds3m8s)z\u007f#2vtQ!^>CFN1T\u0018jC&l?\u001fJd@\u001dt\u0016xTc\u000e]?^P`i2\u0011Ltc\u0011k\u0006yY\\\u001cq;ouP?h8SWF?2?BMs7S b\u0017s<>cM\u0013u\u0017O Kiv\u000fa%Alr=a0~gu4v0\u0013\u0012%<7'sR~bq\\(U!=dlrH`0\u000f";
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x561A;
        if (f[n2] == null) {
            m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }

    public static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x5B14) & Short.MAX_VALUE;
        if (j[n2] == null) {
            m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.j[n2] = i[n2] ^ l;
        }
        return j[n2];
    }

    public static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void exec(LiteralArgumentBuilder literalArgumentBuilder) {
        literalArgumentBuilder.executes(commandContext -> {
            try {
                if (!this.m$$L4eZLVx4AdETYEDABW59MkLtO8njojfpktnnNjE15Tg4MgX0sCgU4aeBbTluUcy2DGHzd1eJdWVpZnSflIqib7iiTIDDwuAsU.isDone()) {
                    return 0;
                }
            } catch (RuntimeException runtimeException) {
                throw m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.a(runtimeException);
            }
            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)"Reloading Mio resources..."), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf(this));
            this.m$$L4eZLVx4AdETYEDABW59MkLtO8njojfpktnnNjE15Tg4MgX0sCgU4aeBbTluUcy2DGHzd1eJdWVpZnSflIqib7iiTIDDwuAsU = CompletableFuture.runAsync(this::m$$ijYY4Qc5t83GePie1NGe2e8S2E8kHEm71L7eaMZKUdAEcIK8WRmCEbOCBZ9zi5GXGeBdex25R8JAjbPLwzQVnisaDli5hKFRH, m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB);
            this.m$$L4eZLVx4AdETYEDABW59MkLtO8njojfpktnnNjE15Tg4MgX0sCgU4aeBbTluUcy2DGHzd1eJdWVpZnSflIqib7iiTIDDwuAsU.whenComplete((void_, throwable) -> m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)"Reload complete!").method_27694(class_25832 -> class_25832.method_27706(class_124.field_1060)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf(this)));
            return 1;
        });
    }

    public static String m$$0fJ3rvACJ7aCmNAeMBgfY6FSnq5gBTjA180ZkdUrochkzJOBT4FCvainWyTbC9QlfAMShlcr4hDPZXieLyNcr18cuNm7EKU6c(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-83, 34, 43, 110, 115, -62, 115, 34};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 8]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    /*
     * Loose catch block
     */
    public void m$$ijYY4Qc5t83GePie1NGe2e8S2E8kHEm71L7eaMZKUdAEcIK8WRmCEbOCBZ9zi5GXGeBdex25R8JAjbPLwzQVnisaDli5hKFRH() {
        m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$HAOsLBln67ivaO05OnnNGcKBhsRJUSgJDKvKWsdSjDfYhVLWwp217mEcD1XbMfZvXQ0OHszvhVyEuQzElIpaUNNUIup75goW4.m$$fmUFzYjXgYjSLqb178KQEWFsBcutUZkEqw25EWUtJlRbxKGvotTGdolHvQd5kYldlTty6dg97V2bLHtPHaTfqZMeffdeFboqd(1407052148);
        m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$lhgqNl4i4mXKiRzhmhaAi40WDXpYdKYKzosFsaZpYCQJZVWpMhosyal5uH8Ig5NS1asLmTIHewmVGCAmz4wAvYouvSoIr1y4v.m$$ijYY4Qc5t83GePie1NGe2e8S2E8kHEm71L7eaMZKUdAEcIK8WRmCEbOCBZ9zi5GXGeBdex25R8JAjbPLwzQVnisaDli5hKFRH(2023929891);
        HashSet<class_2960> hashSet = new HashSet<class_2960>();
        for (class_2960 class_29602 : ((m$$v6OpYJxV3vMbnhU2UeqSXrGxqgpybzwPIKtqWyEaTxn8tva8vvPPadGTe9UEIZrOIqSW0VnpkpNCrslmaeDN2yma9oZskTVoC)m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1531()).getAllTextures().keySet()) {
            try {
                if (!class_29602.method_12836().equals("mio-mount")) continue;
                hashSet.add(class_29602);
            } catch (IOException iOException) {
                throw m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.a(iOException);
            }
        }
        for (class_2960 class_29602 : hashSet) {
            block14: {
                Path path = m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud.m$$dJRHlW2HKSnwTj3TMuuIfuHE1Fjk45tSF2PZfCUi5KhtXbEEYHvJf3JsC56nRF5QlgkEak3Gr2Ll3WzaExURuC4S3CWlC5SCS.resolve(class_29602.method_12832());
                try {
                    byte[] byArray = Files.readAllBytes(path);
                    try {
                        if (byArray.length < 8) {
                            throw new RuntimeException("File size is too small to be png");
                        }
                    } catch (IOException iOException) {
                        throw m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.a(iOException);
                    }
                    int n = 0;
                    while (true) {
                        block15: {
                            if (n >= 8) break block14;
                            try {
                                block16: {
                                    if (byArray[n] == m$$EPkkXEysRLWIx3KimJ9pdmLR8lhNeDYlZA0xnS0jwd85lREHIsVN02e1tfO102BCpAD3Zb2P3s4zi1o5oPsXycIhuDVoILVM8[n]) break block15;
                                    break block16;
                                    catch (IOException iOException) {
                                        throw m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.a(iOException);
                                    }
                                }
                                throw new RuntimeException("File is not a png");
                            } catch (IOException iOException) {
                                throw m$$j91WW6Ae3426cxosDRtWTOUMUdf2CZGudb7WfBG7KYCBXIAxUBoWQngeDKQrZfVCmHHMZlabUCzZp8nQCdbzcmLDaOk6SyTaF.a(iOException);
                            }
                        }
                        ++n;
                        continue;
                        break;
                    }
                } catch (IOException | RuntimeException exception) {
                    m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)exception.getMessage()).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("Invalid Image! \u0001")).method_27694(class_25832 -> class_25832.method_27706(class_124.field_1061)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-999));
                    continue;
                }
            }
            m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_40000(() -> {
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1531().method_4615(class_29602);
                m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1531().method_65876(class_29602, (class_10537)new class_1049(class_29602));
            });
        }
    }
}

