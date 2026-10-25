package me.mioclient;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN;
import me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP;
import me.mioclient.m$$SyNr9C8dWqJg6VdbHL7kYfVmVwglSAxJTcs9lCtOM56jL280GMTyIe5Ii91cPIxP1TvSSDHgebxECtkpqaG12L2IZ5liKPIZf;
import me.mioclient.m$$V97y9Rf5S3WnCfOVfssyr4BMdl6mR3hnnna1kC0C1Yp8SUjJAxmgzFhzZl1oHZRfMsAOmoGufdzXBSm0srL5HacHxRard0p8L$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_238;
import net.minecraft.class_243;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs
extends m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP {
    public static final Color m$$8FgLT83LQ2ugERjuMOFRMXBRhLGsxipIQLTTA3bSv3qtBnbyb7hbfcyAQggMfsZAGjQdwniiLTzQ3WAftozqrjuRl9XRjcwoh;
    public static final Color m$$0tP9c2IsfzpfSz44URX598Gn4UemlEO2MdIvrk9wsdbehD5fONSMhyQ7cFFpOQK8qBVVp3WYMgrNOGtO7PGZaPUKxSQXhpqTE;

    public m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs() {
        super("highlight");
        m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$uVIFkBgj8JoqhMxROywPx1r6LVZQKRc19yxBxNEqHA3Ps2EGBaj5ZlnsgvmZkKvPCpkSf7XRCRxqq4elhgeVa6Stb431yyTUN.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(new m$$V97y9Rf5S3WnCfOVfssyr4BMdl6mR3hnnna1kC0C1Yp8SUjJAxmgzFhzZl1oHZRfMsAOmoGufdzXBSm0srL5HacHxRard0p8L$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this, () -> m$$8FgLT83LQ2ugERjuMOFRMXBRhLGsxipIQLTTA3bSv3qtBnbyb7hbfcyAQggMfsZAGjQdwniiLTzQ3WAftozqrjuRl9XRjcwoh, () -> m$$0tP9c2IsfzpfSz44URX598Gn4UemlEO2MdIvrk9wsdbehD5fONSMhyQ7cFFpOQK8qBVVp3WYMgrNOGtO7PGZaPUKxSQXhpqTE, () -> Float.valueOf(1.0f), () -> Float.valueOf(5.0f), () -> true, () -> true, 1000));
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
                                m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.k = new Object[46];
                                m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.l = new String[46];
                                m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.e();
                                var21 = new String[4];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn("4vze8gNCAEKBLReFRsIH", MethodHandles.lookup(), "m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn", m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.class, 758040694);
                                var20_3 = var18_2.length();
                                var17_4 = 9;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn("jBkVW4iEv6xVJBZlqawY", MethodHandles.lookup(), "m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn", m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.class, 1507920102);
                                    var20_3 = var18_2.length();
                                    var17_4 = 3;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 113;
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
                                            v15 = 78;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 86;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 121;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 93;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 52;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 109;
                                            break;
                                        }
                                        default: {
                                            v15 = 18;
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
                        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.c = var21;
                        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.d = new String[4];
                        var8_7 = 4748560515169913910L;
                        var14_8 = new long[22];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn("3nxCLsJXKruvfycVlsNB", MethodHandles.lookup(), "m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn", m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.class, 28884593);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn("ak7tBKTA8CzOgMuhmshg", MethodHandles.lookup(), "m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn", m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.class, 1627545072));
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
                            var12_10 =  /* dynamic constant */ (String)m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn("muUQ4wq3v5OD7kBGvdzA", MethodHandles.lookup(), "m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn", m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.class, 1299485373);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn("EoszWvVKXrY0Js8Z1evr", MethodHandles.lookup(), "m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn", m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.class, 336797441));
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
                m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.e = var14_8;
                m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.f = new Integer[22];
                m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 599288;
                var0_14 = 4778397176567137436L;
                var6_15 = new long[5];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn("dNn80bsAaIn9yXHtgrAi", MethodHandles.lookup(), "m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn", m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.class, 439956318);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn("uX0dXKoBtGnvBWSC2tKl", MethodHandles.lookup(), "m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn", m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.class, 1500294207));
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
                    var4_17 =  /* dynamic constant */ (String)m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn("3aKEp2SllphVw2Uisa5f", MethodHandles.lookup(), "m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn", m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.class, 697121145);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn("Q9VFulgszcB403KUdqjQ", MethodHandles.lookup(), "m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn", m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.class, 799785960));
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
        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.i = var6_15;
        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.j = new Long[5];
        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)8608848693763463967L);
        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$8FgLT83LQ2ugERjuMOFRMXBRhLGsxipIQLTTA3bSv3qtBnbyb7hbfcyAQggMfsZAGjQdwniiLTzQ3WAftozqrjuRl9XRjcwoh = new Color(255, 0, 0, 120);
        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$0tP9c2IsfzpfSz44URX598Gn4UemlEO2MdIvrk9wsdbehD5fONSMhyQ7cFFpOQK8qBVVp3WYMgrNOGtO7PGZaPUKxSQXhpqTE = new Color(0, 0, 0, 0);
    }

    public static void e() {
        Object[] objectArray = k;
        k[0] = "]r\u001aRh*S{]Zo1\u001ez\u0010\u001bN|fsSHR|GO\u007fo2(^\\n\u000eJ!jBbE8\u0013G}\u0007se'fc_le,Bxz|7why\u0000rW}JQaS[#SB\\lW)rZLgQ}wrC\\4\u001f[.q|h,YZWhT0g\u007fGSS|WoziQ";
        objectArray[1] = "QwBJ 2ZxS\u0005]*I\u007fZL";
        objectArray[2] = "\\>\u007fu\u0010bU0|<SoM8u:\u0019dZ#<:\u000fjJ<w5\t~\u0011\u0010`<\b`Z?f\u000f\u0004}Z";
        objectArray[3] = "\u0016MWI0j\u001fCT\u0000sg\u0007K]\u00069l\u0010P\u0014\u0005(l\u0019F_\u0015sW\u0010SO\u000e/`\u0011cH\u0000(h\u0010LN%(l\u0019F_\u0015";
        objectArray[4] = "\u0017\u0017k\rCq\u001e\u0019hD\u0000|\u0006\u0011aBJw\u0011\n(A[w\u0018\u001ccQ\u0000R\u001d\fcQOr5\naVC{\u001a\fDVGr\u0010\u001dt";
        objectArray[5] = "r$$K\u000b\u0019{*'\u0002H\u0014c\".\u0004\u0002\u001ft9g&\t\u001b|*'\u0001";
        objectArray[6] = "g(\b]Wfn&\u000b\u0014\u0014kv.\u0002\u0012^`a5K\u0011O`h#\u0000\u0001\u0014Hv \u0010\u001e_gp\u0005\u0010\u001aVma5";
        objectArray[7] = "W'\u000eZ0R\\(\u001f\u0015\\QR*\u001dZp";
        objectArray[8] = Boolean.TYPE;
        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.l[8] = "java/lang/Boolean";
        objectArray[9] = "EZjMJ\u0015LTi\u0004\t\u0018T\\`\u0002C\u0013CG)\u0000H\u0014RP\u007f\u0017\t9IXj\u0002I\u001eeZi\u0017B\u0002R";
        objectArray[10] = "!`\u0019\u0012\b|*o\b]e|*r\u001c";
        objectArray[11] = "?_\u0012 1T4P\u0003oPZ?[\u00075";
        objectArray[12] = "\u0011yq:q,\u001fp62v7Rq{sK:2nf\u0014 '+m\u00150.\u0015\u0018~\u0017\u001b/(%z\t:N4\u001bp\f\u0016`\t(\u007f,nt\u0000\bS\u0012b.)0.gg_\u000e(e\u00162-\n\u0015%n4H\n\u0004Ln\u0003n\u0010/X\u00170}!\u0004Y\u001c#s3\r}\u0018f*\u000fNU\u0005bt*7L\u0016\r~";
        objectArray[13] = Integer.TYPE;
        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.l[13] = "java/lang/Integer";
        objectArray[14] = Float.TYPE;
        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.l[14] = "java/lang/Float";
        objectArray[15] = "<\"_z\u000fD<\"H&\u0003K&iH8\u0003^!\u0018\u001dgZ";
        objectArray[16] = "`Udyban\\#qez#]n0]7:IsFm;^\u0003\u001dzHhBf,gxw\u007f\u0004\bYob;]\u0018'c`c^+%`M=s{M{6^e ^Jv`W0RctW\\{{CT_V\u0007gJA`_\ramjwh\bGf>~B\u0006!Conx2Fj|i\u0000:,G";
        objectArray[17] = "la\u0019@\u0018\u0003bh^H\u001f\u0018/i\u0013\t'\"T|qI\u001c8j}dJ2Y4Wb@I-tA\u0003\u001e6\u0007n]SY\u001e)eRtt+Ts^`x+!`1zDB\u0001bWxY\u0006\\`R\u0003U\u0019)yw~A\b6gaZt8\u0003ybSNE\u0018fl}Z8#d3zh'ZObcj&";
        objectArray[18] = "YX\u0019h\u001d\nYX\u000e4\u0011\u0005C\u0013\u000e*\u0011\u0010Db_uH";
        objectArray[19] = Void.TYPE;
        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.l[19] = "java/lang/Void";
        objectArray[20] = Double.TYPE;
        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.l[20] = "java/lang/Double";
        objectArray[21] = "p(q1po{'`~\u001alo+k5";
        objectArray[22] = Long.TYPE;
        m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.l[22] = "java/lang/Long";
        objectArray[23] = ">\u0010VXc5>\u0010A\u0004o:$[A\u001ao/#*\u0010B=";
        objectArray[24] = "\u0017\\V\rpd\u0019U\u0011\u0005w\u007fTT\\DO2M@A2\u007f>)\n/\u000eZm5o\u001e\u0013jr\b\r:-}gLT*Sqe\u0014W\u0019QrHJzI9i3)l\u0012*Xs\u0017^\u0002&qq UI\u000fQQ(_5\u0013XD\u0017V?\u0015\u007fo\u0000a:3t;\tK4UQj\u0019q\u00002xy\u001e\t\bXU/\u0017\u001d\\\u001alr\u001d| SKr=MK6uz-\n@\u000eqf\r\u0001,#nj\u000b\b:\u0005pD\u0003u9Ss=\"x\u001a\u0016AB\u0015\\;SW9\"\u0001\u000f5!g\u001e_!\u0013)aLS\u000f\u0007+_\u0010K\u0019SUS\u001f\u000e\u000f5CG?|\u0019\u001ahxLW;PA3-\u0000>X";
        objectArray[25] = "Z?oh\u007f\u001fQ0~'\u0017\u001f_?m";
        objectArray[26] = "[P}~v,UY:vq7\u0018Xw7~\u0012cG=[x\u0012\u0002ef~J-^]\nth1sG\u0016IV5~\f\u0017_v\u0014\u0006g!Fvp@~eiy\u0015\u0005\u007f\u0003!]&\u0002fcIW\u0005Yb`Vt\u000fc|7t^\u0002d@#%H+_{\"`M\fW\u00071gr\u0017S\r+b+2^\u0001\"[r";
        objectArray[27] = "y\\\u000fY[Bx^YAj\u0014*M\u007fA\u0005\u0006\"\\PGjBv\bN\u0004\u0015\u0005x\u0000F;U@ ]DQVJ~Q6\u0004\f\u001d{XK\u0000\u000fG>1";
        objectArray[28] = "\f\tXZ\bK\f\u0018K\u001a3O\u0005\u0015K\u000et_l@O\u000eULVLK\u0012J1\f\tXZ\bK\f\u0018K\u001a3";
        objectArray[29] = "X\u001ajGI)\u0007\u0018yA%!DMOaU\b\u000f]@\u0019y\u00157;ilk\b\u0010\u0002H\u001b`{\u000f\"Geu\u0015&Yb_|\u001e\u0012Yud`.Q\u0002Hk|\u0002)8i\u0011\u0018\bR\u0005Ilj\u00024\u001fcY[\u0001\u00108FbZ-\u0015$~\u001eN\u001dS9WGa\u0001\u000f zYc\u000f\n!toJz\u0006\f^ \u0014|\n\u0010c\u0019OxYY\u0005\u0011\\)\u000e\u001c?\u001dX5\u0011a";
        objectArray[30] = "R2\u00061\u007f'\u0004<Ed\u00052V/\u0019mi\u0000\u0000jG2:W\nk\u001b{cnQoH2\u0005";
        objectArray[31] = "d3\u007f\u0013'f0tg\u001f\u001dx\"fw\tlrC\u001a>.lRrq[\u0010dB5zc\u0014xb>\u0016N\u000btd7\u0000h\u0015ZlJ\u0003>\u0016#MG {$\\zc\u0001>2'M>5XDyq`\u001b~L\u007f#l5jNA\u007ft#>0Mp15X&YPC#w\rf#h\u0001=$-B?\u00045tv#1:eM#bb8\u0005\u001ffdc6y\u0004sdiJi\u001e}vr-x\u001exg\u000e";
        objectArray[32] = "\u000f UM\u000fL\u000e!\u0012\u0012o\u0003[zWE(\u00132 \u0016Z\u0002AU.\u0017L\n}\u000f UM\u000fL\u000e!\u0012\u0012o";
        objectArray[33] = "E3g\u000b;F^&g\u0001G_C4~\u0001+m\u0015u#Yz:C%\"W*YK6a\tGQU1s\u001a;J@1yf";
        objectArray[34] = "\u0012gm\u001aM\n\u0012f>\u0005s_\u0018zo?\u0012G\u0004@g9\u0014F\u0015xmu\u001d]E\u007fl\u0010\u001cVGp\u0000\u0018\u001e\u0007Nqc\u0010\rD\u0010\u001c";
        objectArray[35] = "<+%B\u0015\u0010<:6\u0002.\u000b:/\u0001\u001aR\u0011\u00004\u0005\u001fI\u0003 SzCL\u001b:j!G\u001fR\\b2\u0016H\u0017fn6\nWj";
        objectArray[36] = "\t\u001d\u0000;\u001e'\\\u0015\u0013T\u001d6\u0003\u000e\u001c9\u00120lJHm\fs\u0013\rFe\u0004LU\u001c\bm\u0016|]\u0002\u00078tv\u0014N\u0016$Du\u000fNET";
        objectArray[37] = "\u0004VRt\u001e\u0003\u001fCR~b\u001a\u0002QK~\u000e(T\u0010\u0016&R\u007f\u0002@\u0017(\u000f\u001c\nSTvb\u0014\u0014TFe\u001e\u000f\u0001TL\u0019";
        objectArray[38] = "\"T6]<C9A6W@Z$S/W,hr\u0017w\fp?&KqM-\u0001*B\u007fS@R$\u0013~]#Z7P 0-Ru\u001e\"S%A6@O]-\u0003xB,U>@&/$K9R5S?^9XI";
        objectArray[39] = "'&\u0010\fv\u0016{mLS\u0012-wg\u001bE*\u0001\u0004wj\tXB\u0001qYHtN%}azT\u001a<Xk\u000eh4?jNpu-\u0006.N\rqL,K\u0010\u000e/7=yWtV\u001fy}FVK!&vtv#\u0014\u0007}l\b`\nv}`O@0\u0000zaWC8\u001aD\u0012Sv4\u0014kgFhK$-y4|\u0015|uGQ}\u001e~z+\u0005*\u00117p\u0012^.B~\u0016";
        objectArray[40] = ";\u0000P~\u0006>?\b\u0005eg0q\u001c^c\u001b0zq\u000enX/eN\n'\u0019a\u0001M\u0004#[70\u001fX&]]";
        objectArray[41] = "1g\u0019144e \u0001=\u000e*w2\u0011+\u007f \u0016NX\f\u007f\u0000'%=2w\u0010`.\u00056k0kB()g6bT\u000e7I>\u001fWX40\u001f\u0012t\u001d\u0006O(6UX\u00104\u001fka>fj#5O\u0018nlq9a\flR-!wX\u0012^\"da>\u0004J\u0002\u0016w\u0011/uq=U[\u0006>\u0010jPSVa)e\u007f\u00195\u007f>$ech2=6\"\u0004f3+>\u001e";
        objectArray[42] = "o\u001a\u001axa\u000bl\u0001\u001a+\u0011G5\u000fA\u0017-\nh^M&\u007fVmX'+ \u0006i\b\u0016y|\u0003ob";
        objectArray[43] = "\u001a\u0019\r\u001d#$O\u0011\u001er-.\u0003\u001a\u000e\u001b-OFFM\nv0\u0001HE\u0002Iu\u000e\u0012\u0014\u0013*q\u0006G\u000fr";
        objectArray[44] = "tH[[:.p@\u000e@[1.TX;g|s\u0005T\n5 v\u0003>\u0007jprS\u000fU6ut9";
        Object[] objectArray2 = objectArray;
        objectArray[45] = "XN}>/\b[U}m_U\u0012[+,#U\u00196{!`J\u0006\t\u007fh!\u0004b\nqlcRSX-ie8";
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7EE3;
        if (f[n2] == null) {
            m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }

    public static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x575E) & Short.MAX_VALUE;
        if (j[n2] == null) {
            m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.j[n2] = i[n2] ^ l;
        }
        return j[n2];
    }

    @Override
    public void exec(LiteralArgumentBuilder literalArgumentBuilder) {
        literalArgumentBuilder.then(((RequiredArgumentBuilder)me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("pos", new m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN()).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("beam").executes(commandContext -> {
            class_243 class_2432 = (class_243)commandContext.getArgument("pos", class_243.class);
            class_238 class_2383 = class_238.method_30048((class_243)class_2432, (double)0.25, (double)0.25, (double)0.25);
            class_2383 = class_2383.method_35578((double)m$$SyNr9C8dWqJg6VdbHL7kYfVmVwglSAxJTcs9lCtOM56jL280GMTyIe5Ii91cPIxP1TvSSDHgebxECtkpqaG12L2IZ5liKPIZf.m$$BIxDo4M1TYWRdDFDpkE3M7oKJMXYF0owQRr0xLMb1kECQNIQd95D2lDDGNTvnqvMpQKJwauMs6cQ3PZoLMoIwqNCjHyGg6feS(82375308)).method_35575((double)m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687.method_31607());
            m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$uVIFkBgj8JoqhMxROywPx1r6LVZQKRc19yxBxNEqHA3Ps2EGBaj5ZlnsgvmZkKvPCpkSf7XRCRxqq4elhgeVa6Stb431yyTUN.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW)this, class_2383);
            return 1;
        }))).executes(commandContext -> {
            class_243 class_2432 = (class_243)commandContext.getArgument("pos", class_243.class);
            class_238 class_2383 = class_238.method_30048((class_243)class_2432, (double)0.25, (double)0.25, (double)0.25);
            m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$uVIFkBgj8JoqhMxROywPx1r6LVZQKRc19yxBxNEqHA3Ps2EGBaj5ZlnsgvmZkKvPCpkSf7XRCRxqq4elhgeVa6Stb431yyTUN.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW)this, class_2383);
            return 1;
        }));
    }

    public static String m$$YxWGtiUnrB8IUkQHgn998hm7AtRdJIadWdIanNmU1RghNHvCIfg74LmctGTpeUzDWVDBs39XW4ZpFISeYiX8GpEDfMQQvyxVn(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-104, 59, 61, -52, 12, -79, 41, -89, -71, -85, 19, 16, 64, 89, 28, 95, 89, -102, -55};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 19]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

