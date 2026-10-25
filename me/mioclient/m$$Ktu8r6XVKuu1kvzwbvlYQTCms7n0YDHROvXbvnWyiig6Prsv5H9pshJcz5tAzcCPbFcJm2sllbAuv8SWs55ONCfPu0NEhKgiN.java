package me.mioclient;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_151;
import net.minecraft.class_2170;
import net.minecraft.class_2172;
import net.minecraft.class_2277;
import net.minecraft.class_2278;
import net.minecraft.class_243;
import net.minecraft.class_310;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN
implements ArgumentType {
    public static final Collection m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI;

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.c = new Object[55];
                            m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.d = new String[55];
                            m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.a();
                            var12 = new String[6];
                            var16_1 = 0;
                            var15_2 =  /* dynamic constant */ (String)m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q("ZRANPkcLXxhUqctrA3dR", MethodHandles.lookup(), "m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q", m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.class, 399741014);
                            var17_3 = var15_2.length();
                            var14_4 = 5;
                            var13_5 = -1;
lbl10:
                            // 2 sources

                            while (true) {
                                v0 = 60;
                                v1 = ++var13_5;
                                v2 = var15_2.substring(v1, v1 + var14_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var12[var16_1++] = v4.intern();
                                if ((var13_5 += var14_4) < var17_3) {
                                    var14_4 = var15_2.charAt(var13_5);
                                    ** continue;
                                }
                                var15_2 =  /* dynamic constant */ (String)m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q("IqMjt8PJv5kDWoWLpqDp", MethodHandles.lookup(), "m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q", m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.class, 1970097982);
                                var17_3 = var15_2.length();
                                var14_4 = 11;
                                var13_5 = -1;
lbl25:
                                // 2 sources

                                while (true) {
                                    v0 = 117;
                                    v5 = ++var13_5;
                                    v2 = var15_2.substring(v5, v5 + var14_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                var12[var16_1++] = v4.intern();
                                if ((var13_5 += var14_4) < var17_3) {
                                    var14_4 = var15_2.charAt(var13_5);
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
                                        v15 = 21;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 38;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 38;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 115;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 68;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 19;
                                        break;
                                    }
                                    default: {
                                        v15 = 84;
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
                    var4_7 = 5949060200155715405L;
                    var10_8 = new long[40];
                    var7_9 = 0;
                    var8_10 =  /* dynamic constant */ (String)m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q("HFTGkdOOGXVnO0udFoBN", MethodHandles.lookup(), "m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q", m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.class, 1693134743);
                    var9_11 = var8_10.length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q("zRhX3iTuLIjz9ytwRK5U", MethodHandles.lookup(), "m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q", m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.class, 462189727));
                        v17 = var10_8;
                        v18 = var7_9++;
                        v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                        v20 = -1;
                        break block29;
                        break;
                    }
lbl113:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        var8_10 =  /* dynamic constant */ (String)m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q("4kh3yVxTxIS4w9a6OFvS", MethodHandles.lookup(), "m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q", m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.class, 1493026004);
                        var9_11 = var8_10.length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q("rsyjWsnXppD2zEIMACrO", MethodHandles.lookup(), "m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q", m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.class, 525463233));
                            v17 = var10_8;
                            v18 = var7_9++;
                            v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                            v20 = 0;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl126:
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
lbl137:
                    // 1 sources

                    ** continue;
                }
            }
            m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.a = var10_8;
            m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.b = new Integer[40];
            m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -432577;
            break block31;
lbl143:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 175293756077881462L;
        ** while (true)
        var0_15 = 1237574846964567374L ^ var2_14;
        m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_15);
        m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI = Arrays.asList(new String[]{var12[1], var12[0], var12[2], var12[3], var12[5], var12[4]});
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x53D8;
        if (b[n2] == null) {
            m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    public static void a() {
        Object[] objectArray = c;
        c[0] = "O%\u0006\u00001\u0018Q-\u001cO^\u001fW%\t\u0012";
        objectArray[1] = "\u0012~a\u0019+\u0012g^j\u0016:]\u0006Pa\u001d>\u0007r";
        objectArray[2] = "3v^k~\u000e-~D$\u001c\u0012*c";
        objectArray[3] = "\u0019;^_\u0012d\u00172\u0019W\u0015\u007fZ3T\u0016\u001aZ!,\u001ez\u001cZ@\u000eE_.e\u001c6)U\fy1,5h2}<g4~\u0012\\D\f\u0002g\u00128\u0002\u0015FH\u001d]G\u0014 \u00009n@\r@h3M\u001b\tCw\u0010G!\u0017\u0014U:J&+\u0000\u0004,c\u001d\u0010\u0001A)D\u0015l\u0012F\u0016_\u0011f\bCOz\u001cj\u0001z\u0016";
        objectArray[4] = Long.TYPE;
        m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.d[4] = "java/lang/Long";
        objectArray[5] = Integer.TYPE;
        m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.d[5] = "java/lang/Integer";
        objectArray[6] = ":\u001da,]\u00124\u0014&$Z\ty\u0015ke\u007f\t\"@=wl+\u001c\r:p_\u000b-\u000f-7X$\u0006,\f,GJ9H\u0016\u0005|/\u0018\u000e\u0017#B\u0013\u0000\u0001&(SK\u0007\n<7\u00015n\b<)~\u001e-M;\u0000N\u001e\u0014(-\u0007W7:J<-X\u001f\u0016\r9yg*$Mz\u000ez>1(:qz8?3((z";
        objectArray[7] = "#M\u0000\u00101\u0003*C\u0003Yr\u000e2K\n_8\u0005%PCm(\u001e)L\nl9\r$G\u001f";
        objectArray[8] = ")5[Z\u00154)5L\u0006\u0019;3~L\u0018\u0019.4\u000f\u001d@K";
        objectArray[9] = "4Z\u0011M~5=T\u0012\u0004=8%\\\u001b\u0002w32GR\u0010f=0P\u000f\u0017z59\u001b/\u0016t=2F\b\n|4$";
        objectArray[10] = "\u0011\fT1S2\u000f\u0004N~\u001e(\u0015\u000eW\"\u000f\"\u0015\u0019\f\u0013\u0012*\u000b\u0001G$\u001c%\u0017\bd%\t2\t\b";
        objectArray[11] = "\u0007X/~e\u001e\fW>1\u0018\u0006\u001fP7x";
        objectArray[12] = Boolean.TYPE;
        m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.d[12] = "java/lang/Boolean";
        objectArray[13] = "R~C#,\u000eR~T\u007f \u0001H5Ta \u0014OD\u0005<vU";
        objectArray[14] = "%w\u0005?jw;\u007f\u001fp\u0007m#z\u0016=0k x";
        objectArray[15] = "l\n\"G'\u0004e\u0004!\u000ed\t}\f(\b.\u0002j\u0017a\u001a?\fh\u0000<\u001d#\u0004aK\u001c\u001c-\fj\u0016;\u0000%\u0005|':\u0000&\u000fj\u0017";
        objectArray[16] = "mp\u0001\u001eRrsx\u001bQ\u001arir\u0003\u0016\u0013i)A\u0005\u001a\u0018ndp\u0003\u001a";
        objectArray[17] = "\u00148Rz=\u0005\n0H5P\u001f\u00125Axg\u0019\u00117W";
        objectArray[18] = "\u0007\u000eO],\u0000\f\u0001^\u0012M\u000e\u0007\nZH";
        objectArray[19] = "\\\u001feSkYB\u0017\u007f\u001c\u0016IB";
        objectArray[20] = Character.TYPE;
        m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.d[20] = "java/lang/Character";
        objectArray[21] = "\u0003{q~Ol\u0003{f\"Cc\u00190f<Cv\u001eA7a\u00155";
        objectArray[22] = "^\u001f8a\u0014@^\u001f/=\u0018ODT/#\u0018ZC%~~N\u0019\u0014\u0019 .\nZoH}xH";
        objectArray[23] = "T9w9Z\u0007]7tp\u0019\nE?}vS\u0001R$4tX\u0006C3bc\u0019+X;wvY\ft9tcR\u0010C";
        objectArray[24] = "+u\u0012\u001fE5+u\u0005CI:1>\u0005]I/6OT\u0003\u001fd";
        objectArray[25] = Void.TYPE;
        m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.d[25] = "java/lang/Void";
        objectArray[26] = "VXh3>}VX\u007fo2rL\u0013\u007fq2gKb/,c";
        objectArray[27] = "A\u001fgt\u0017*A\u001fp(\u001b%[Tp6\u001b0\\%$nL";
        objectArray[28] = "GuRBBSN{Q\u000b\u0001^VsX\rKUAh\u0011\tW_AjK\u0005@RW4l\u0005BLH\u007f|\u0003BQEt[)W_AjK\u0005@RpcO\t";
        objectArray[29] = "\r \u000by\u000fq\u0004.\b0L|\u001c&\u00016\u0006w\u000b=H\u001e\u000fs\u001b;\u00075\u000e{=;\u0014>\fy<*\u00073\u0007l";
        objectArray[30] = "Y5[#CtP;Xj\u0000yH3QlJr_(\u0018hVx_*BdAuItubCv[4R^WuN;NHVx_*BdAu";
        objectArray[31] = Double.TYPE;
        m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.d[31] = "java/lang/Double";
        objectArray[32] = "5Q\u0011\u0017P^sJ\u001a\u00123SnO\u001c\b3\u0000z\u000f\u001e\u0019QOjT\u000by";
        objectArray[33] = "WRnxQ/SRo)./UI7\u007fB\u001d\t\nl).w\u0004Oj`UwIMf\u0018A-\u0001U(}E-\u0000\u0004W";
        objectArray[34] = "\"bNp1e\"/L|Ie|?LM)gabR6yqe>4";
        objectArray[35] = "h\\RG\u001c]`LP[zL#{\f^\u0006\\X\u0006\u000fXG\u00165MV\u001b\u0000-";
        objectArray[36] = "\u0006\u001f!NhpO\u001b6\u001b\u0001qZ\n:\u0019mC\u000eIeA;\u0014\u0006\ba\u000fn/]JfA\u0001";
        objectArray[37] = "\u000fN~8?D\u000f\u0003|4GT[\u0014^h.S2Bb{z\u0004_\t;8=?";
        objectArray[38] = "Ewi>\u001ecGdq?~ \u0010gt7~eEg2\"\u0005e\be>Z@c\u0010pf:Nd\u0000'\u000f";
        objectArray[39] = "1\u0000M\u0001m\u0006=[L\u0017\r\u0000=ES\ba2i\u0004\u000eV\r\u0004iG]\u000fn\b2FKo";
        objectArray[40] = "#4DN)\u0019\u007f0OWD\r/6\u0014P(?{{I\fth|q\u001dZ-\brv\r\rD";
        objectArray[41] = "Gq\b?acG<\n3\u0019`\u0017 \u0011\u0002tzBt\u0003s|{F3r";
        objectArray[42] = "*a \u0017#\u001f4<\"\u001d\u001e\u00052h\"\u0006s1)y+1y\b4h;\u0006\u001e\r.a1\u001d`\u0011vc+z}\u001368-DnU.;K";
        objectArray[43] = "*w\u0001!'K (\u0010A!Z\u000bt\u0005=H\u0018vt\u0013=q^~pOAqF sN{1\u001d?d~";
        objectArray[44] = "^&FW\u0017?^kD[o?\u000efw\u0017\u0015?\u0004`<VT*XbR\u0011\u0017|\u001a\u001a\\\u0013\u0011x\u0005a\f\u0005\u0015$c";
        objectArray[45] = "TNuN\u0014AWMn[)\u0010S\u000bVHL\u0016_\u0011mCF\u007f\u000e\u001d7DO\u000f\u0006\r5X)";
        objectArray[46] = "\u0001'\u001f'\u0013FG5]:bt\n.\u00149ZXy>eu(\u001b|8V4\u0004\u0017X4n\u0006$CA\u0011dr\u0018mB#A\f\u0005t{gAq\u0001\u0015Q\u0002\u001fr_n@0X\b&F\u00044I*;x[?{\nSMz4ct\u0010S\u000b4o30i}3n+3ag\r\u001d/\u0006mi\"h:\u0018\u0012YdvHY\u0010\u00052\u0015)^\u001a\u0000?$tYD\u0000'J3\u001a\u0012B_";
        objectArray[47] = "-\u0013p\bKEd\u0017g]\"Dq\u0006k_Nv-@5\u0000\"\u0011vAj^R\u0019fCv8\u0013_'\u000bd\u0003H\u001d E\u000bR\u001bXwG5Q\u0018Cbza]\u001b_cBeGSJ\u001cDz\u0000\\A~\u000bj[I!";
        objectArray[48] = "?,\"j\u0001-j,,h`*5#=7\r-3#R?\\?&%;*\u0011o8E>?]j2&#9\u00180T";
        objectArray[49] = "pX\u0016!3ttX\u0017pLtrCO& F.\u0000\u0013yLt!\u0005Vqq~t\u0001^A)/%F\u001f|#z!N/";
        objectArray[50] = "/z\u0011*\u0013m'j\u00136uv\u007fyP\u0002\t\u001d#+Dp\rsdh\u00122up}(\u0013:\u0004x|,TK";
        objectArray[51] = ")qqHf+)<sD\u001e?y1@\bd+s7\u000bI%>/5e\u000efhmM";
        objectArray[52] = "*\n1\bC<y\u001c=\u0003%d*\u0012=_IVvTf\b%o?\u00162XF<(\u0012>8Od~\u0010\"\u0000K~6\u0005]";
        objectArray[53] = "\u000bI\\{aY\u000fI]*\u001eY\tR\u0005|rkU\u0011Y \u001e\u0001XTXce\u0001\u0015VT\u001b.Z\u001a\u0013^ve\u0003YTety\u0005\u0004Q\u0000py\u0004U.";
        Object[] objectArray2 = objectArray;
        objectArray[54] = "i3/\u0019Y\u0004ix.\u001b'\u000ek~\u001aFZ\u001bmoAM\u001b\u000ftb(XV_j\u0002";
    }

    public class_243 parse(StringReader stringReader) {
        int n;
        block4: {
            block5: {
                n = stringReader.getCursor();
                class_2278 class_22782 = class_2278.method_9739((StringReader)stringReader);
                try {
                    if (!stringReader.canRead() || stringReader.peek() != ' ') break block4;
                } catch (class_151 class_1512) {
                    throw m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.a(class_1512);
                }
                stringReader.skip();
                class_2278 class_22783 = class_2278.method_9743((StringReader)stringReader, (boolean)false);
                try {
                    if (!stringReader.canRead() || stringReader.peek() != ' ') break block5;
                } catch (class_151 class_1513) {
                    throw m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.a(class_1513);
                }
                stringReader.skip();
                class_243 class_2432 = class_310.method_1551().field_1724.method_19538();
                class_2278 class_22784 = class_2278.method_9739((StringReader)stringReader);
                return new class_243(class_22782.method_9740(class_2432.field_1352), class_22783.method_9740(class_2432.field_1351), class_22784.method_9740(class_2432.field_1350));
            }
            stringReader.setCursor(n);
            throw class_2277.field_10755.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.setCursor(n);
        throw class_2277.field_10755.createWithContext((ImmutableStringReader)stringReader);
    }

    public static String m$$YiHkdYA5Nx4Bbga3TKsNtG1oCiRj0zDhgrhvl61pm53c8snhBlASQQzX8jRlPmDi22y8ml8kcGnfu6SyKM7LlPyju2MVAyp0q(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-118, -70, -23, -48, 86, -67, 93, 24, 54};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 9]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public Collection getExamples() {
        return m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI;
    }

    public CompletableFuture listSuggestions(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        Set<class_2172.class_2173> set;
        String string;
        block6: {
            block5: {
                try {
                    if (!(commandContext.getSource() instanceof class_2172)) {
                        return Suggestions.empty();
                    }
                } catch (class_151 class_1512) {
                    throw m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.a(class_1512);
                }
                string = suggestionsBuilder.getRemaining();
                try {
                    if (string.isEmpty() || string.charAt(0) != '^') break block5;
                } catch (class_151 class_1513) {
                    throw m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN.a(class_1513);
                }
                set = Collections.singleton(class_2172.class_2173.field_9834);
                break block6;
            }
            set = ((class_2172)commandContext.getSource()).method_17772();
        }
        return class_2172.method_9260((String)string, set, (SuggestionsBuilder)suggestionsBuilder, (Predicate)class_2170.method_9238(this::parse));
    }
}

