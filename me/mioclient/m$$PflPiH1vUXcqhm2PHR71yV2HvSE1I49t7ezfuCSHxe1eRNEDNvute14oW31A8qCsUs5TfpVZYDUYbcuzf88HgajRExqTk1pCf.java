package me.mioclient;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$e6ZUo1gOVrqaQwJ3mTe8it7nWuyGBy2wVcjlmcttb6btkD3Uwp23KdNBYATfgoJ2KD6TRQcQPXfB8FtrMqROVuuliljDkfElJ;
import net.minecraft.class_151;
import net.minecraft.class_2172;
import net.minecraft.class_2561;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf
implements ArgumentType {
    public static final String a;

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block20: {
                block19: {
                    block21: {
                        break block21;
lbl1:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.d = new Object[38];
                    m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.e = new String[38];
                    m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.a();
                    v0 = ( /* dynamic constant */ (String)m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.m$$jUAHskACb8w12yxUozLgagz1VOTmouSuqff6NZf2oduQgG1veapK74kX2NjfqYtS5fM0v3ECphjMo5XyGxTMOO7qzCqsC1nN2("W3LqcTGkRGjT8kPX6sA5", MethodHandles.lookup(), "m$$jUAHskACb8w12yxUozLgagz1VOTmouSuqff6NZf2oduQgG1veapK74kX2NjfqYtS5fM0v3ECphjMo5XyGxTMOO7qzCqsC1nN2", m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.class, 836829102)).toCharArray();
                    v1 = v0.length;
                    var12 = 0;
                    v2 = 52;
                    v3 = v0;
                    v4 = v1;
                    if (v1 > 1) ** GOTO lbl58
                    do {
                        v5 = v2;
                        v3 = v3;
                        v6 = v3;
                        v7 = v2;
                        v8 = var12;
                        while (true) {
                            switch (var12 % 7) {
                                case 0: {
                                    v9 = 82;
                                    break;
                                }
                                case 1: {
                                    v9 = 35;
                                    break;
                                }
                                case 2: {
                                    v9 = 20;
                                    break;
                                }
                                case 3: {
                                    v9 = 94;
                                    break;
                                }
                                case 4: {
                                    v9 = 41;
                                    break;
                                }
                                case 5: {
                                    v9 = 92;
                                    break;
                                }
                                default: {
                                    v9 = 20;
                                }
                            }
                            v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                            ++var12;
                            v2 = v5;
                            if (v5 != 0) break;
                            v5 = v2;
                            v3 = v3;
                            v8 = v2;
                            v6 = v3;
                            v7 = v2;
                        }
lbl58:
                        // 2 sources

                        v10 = v3;
                        v4 = v4;
                    } while (v4 > var12);
                    ** while (true)
                    m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.a = new String(v10).intern();
                    var4_1 = 1774696664525342434L;
                    var10_2 = new long[12];
                    var7_3 = 0;
                    var8_4 =  /* dynamic constant */ (String)m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.m$$jUAHskACb8w12yxUozLgagz1VOTmouSuqff6NZf2oduQgG1veapK74kX2NjfqYtS5fM0v3ECphjMo5XyGxTMOO7qzCqsC1nN2("ztfBX0hsljQbMNisTlz9", MethodHandles.lookup(), "m$$jUAHskACb8w12yxUozLgagz1VOTmouSuqff6NZf2oduQgG1veapK74kX2NjfqYtS5fM0v3ECphjMo5XyGxTMOO7qzCqsC1nN2", m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.class, 1607435093);
                    var9_5 = var8_4.length();
                    var6_6 = 0;
                    while (true) {
                        var11_7 = var8_4.substring(var6_6, var6_6 += 8).getBytes( /* dynamic constant */ (String)m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.m$$jUAHskACb8w12yxUozLgagz1VOTmouSuqff6NZf2oduQgG1veapK74kX2NjfqYtS5fM0v3ECphjMo5XyGxTMOO7qzCqsC1nN2("4cIXqxzs3oJ5PhyrKHDG", MethodHandles.lookup(), "m$$jUAHskACb8w12yxUozLgagz1VOTmouSuqff6NZf2oduQgG1veapK74kX2NjfqYtS5fM0v3ECphjMo5XyGxTMOO7qzCqsC1nN2", m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.class, 1224969213));
                        v11 = var10_2;
                        v12 = var7_3++;
                        v13 = ((long)var11_7[0] & 255L) << 56 | ((long)var11_7[1] & 255L) << 48 | ((long)var11_7[2] & 255L) << 40 | ((long)var11_7[3] & 255L) << 32 | ((long)var11_7[4] & 255L) << 24 | ((long)var11_7[5] & 255L) << 16 | ((long)var11_7[6] & 255L) << 8 | (long)var11_7[7] & 255L;
                        v14 = -1;
                        break block19;
                        break;
                    }
lbl79:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var6_6 < var9_5) ** continue;
                        var8_4 =  /* dynamic constant */ (String)m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.m$$jUAHskACb8w12yxUozLgagz1VOTmouSuqff6NZf2oduQgG1veapK74kX2NjfqYtS5fM0v3ECphjMo5XyGxTMOO7qzCqsC1nN2("aJpWlXgMJ1rP3IsowmKM", MethodHandles.lookup(), "m$$jUAHskACb8w12yxUozLgagz1VOTmouSuqff6NZf2oduQgG1veapK74kX2NjfqYtS5fM0v3ECphjMo5XyGxTMOO7qzCqsC1nN2", m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.class, 2125794115);
                        var9_5 = var8_4.length();
                        var6_6 = 0;
                        while (true) {
                            var11_7 = var8_4.substring(var6_6, var6_6 += 8).getBytes( /* dynamic constant */ (String)m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.m$$jUAHskACb8w12yxUozLgagz1VOTmouSuqff6NZf2oduQgG1veapK74kX2NjfqYtS5fM0v3ECphjMo5XyGxTMOO7qzCqsC1nN2("VoIuSJJu1vVj1ImhiJjB", MethodHandles.lookup(), "m$$jUAHskACb8w12yxUozLgagz1VOTmouSuqff6NZf2oduQgG1veapK74kX2NjfqYtS5fM0v3ECphjMo5XyGxTMOO7qzCqsC1nN2", m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.class, 800465119));
                            v11 = var10_2;
                            v12 = var7_3++;
                            v13 = ((long)var11_7[0] & 255L) << 56 | ((long)var11_7[1] & 255L) << 48 | ((long)var11_7[2] & 255L) << 40 | ((long)var11_7[3] & 255L) << 32 | ((long)var11_7[4] & 255L) << 24 | ((long)var11_7[5] & 255L) << 16 | ((long)var11_7[6] & 255L) << 8 | (long)var11_7[7] & 255L;
                            v14 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl92:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var6_6 < var9_5) ** continue;
                        break block20;
                        break;
                    }
                }
                v15 = v13 ^ var4_1;
                switch (v14) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl103:
                    // 1 sources

                    ** continue;
                }
            }
            m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.b = var10_2;
            m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.c = new Integer[12];
            m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -396078;
            break block22;
lbl109:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_8 = 2641649628467921603L;
        ** while (true)
        var0_9 = 3621014009786967196L ^ var2_8;
        m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_9);
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x32F3;
        if (c[n2] == null) {
            m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }

    public static void a() {
        Object[] objectArray = d;
        d[0] = "h\u0003Zrzjf\n\u001dz}q+\u000bP;Cci6\u001dW\"sP>\u0017n{h76<M$4|0FWeV@W=+*q2\u0003\u000eyfFV.\fz\"`W(1[]sp\u0012\u0011.'jRUE^+tF\u0015!l&Qc\u0016\"EJAP?\u0016|f\u007fc^LWtdo41gbQnW\u0004\\u";
        objectArray[1] = "/@b4\u0000\u0012&Na}C\u001f>Fh{\t\u0014)]!I\u0019\u000f%AhH\b\u001c(J}";
        objectArray[2] = Integer.TYPE;
        m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.e[2] = "java/lang/Integer";
        objectArray[3] = "Bb!5r\u0004Lkf=u\u001f\u0001j+|~]uR`i|$yu~9J\u001ce4b\f~SFs86L\u001eV@M!)\u001cyde4v\b[smny\u001fDC<\rl\u001b\u001d4D<U)vF[>|\u0004e5D\u001c-?}Vl\tK3IE7\u001eo\u0019bv]\u0017M\u001eZkf4q/DaJ4Q";
        objectArray[4] = "$,\u00134o\u0011:$\t{\b\u0010+?\u0004!.\u0016";
        objectArray[5] = Boolean.TYPE;
        m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.e[5] = "java/lang/Boolean";
        objectArray[6] = "\f.\u0006/\u001eV\u0002'A'\u0019MO&\ffNp).@\t\u0010K\u000f\f\u001b\u0011@u\"\u001c\u001c7\u0004|  ]\u0004-\u000fW&\u001e/E\n\u0004|L\u0018\u0014\\%\u0002P\u000b.\b\b*l\u0013.@1z]\u0016\u0004V7sGz\u0016mX,f/0\u000b$\tprCJ\u0011{\u007f'Av)\u0003F\u0014.\u0000\u0016\u000fIp\u0010Z\u0006<~2=";
        objectArray[7] = "\u000b/rf\u001f\u0007\u0015'h)r\u001d\r\"adE\u001b\u000e ";
        objectArray[8] = "\u0002Fld6G\tI}+K_\u001aNtb";
        objectArray[9] = "H\u001a%\u000e\u000e\u0007C\u00154Ao\tH\u001e0\u001b";
        objectArray[10] = "w\u0012\u0012\u0017\u0019!~\u001c\u0011^Z,f\u0014\u0018X\u0010'q\u000fQ\\\f-q\r\u000bP\u001b gS;@\u001a/y\u0014\u001cz\u001b#y\u001c\u0011]16w\u0018\u000fM\u001d!z)\u0006I\u0011";
        objectArray[11] = ".JPg8}'DS.{p?LZ(1{(W\u0013,-q(UI :|>\u000b~&8\u007f,KY\u001a,|9DE\f-q(UI :|";
        objectArray[12] = "/\u0013XA(\b1\u001bB\u000eJ\u00146\u0006";
        objectArray[13] = "`Ed\u0019\u001d<~M~V@=xAs\u0015\u001d\u001a~Vw\u0019^";
        objectArray[14] = "cb[2;o}jA}sog`Y:zt'EX=vn`lC";
        objectArray[15] = "\fnK0%A\fn\\l)N\u0016%\\r)[\u0011T\r/\u007f\u001a";
        objectArray[16] = "]bC67\u0016Tl@\u007ft\u001bLdIy>\u0010[\u007f\u0000k/\u001eYh]l3\u0016P#}m=\u001e[~Zq5\u0017MO[q6\u001d[\u007f";
        objectArray[17] = "S\u0010\u00141U M\u0018\u000e~\u0018:W\u0012\u0017\"\t0W\u0005L\u0013\u00148I\u001d\u0007$\u001a7U\u0014$%\u000f K\u0014";
        objectArray[18] = "%!#9!\u0004P\u0001(60K1\u000f#=4\u0011E";
        objectArray[19] = "\u0016ui\"b%\u0016u~~n*\f>~`n?\u000bO/99}";
        objectArray[20] = "\u0011M\u001d8p1\u0011M\nd|>\u000b\u0006\nz|+\fw\\$(h";
        objectArray[21] = "\u0013[\u001aQf|\u001dR]YagPS\u0010\u0018nB+LZthBJn\u0001QZ}\u0016Vm[xa;LqfFe6\u0007ppfDNlFif \bu\u0002FiEMtd\u000eMvJm\u0004fGU\u0011i\u0007yd_+wP[NR,KD\nX{\u0017pEO]\\\u001f\fVHbG\u001b\u0006LM;b\u0016\nEtb";
        objectArray[22] = Long.TYPE;
        m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.e[22] = "java/lang/Long";
        objectArray[23] = "\u0003k%,*XH+9~EDPm\u0006,5X9*}y:\u0014Sk <$$";
        objectArray[24] = "L#hfHR\u0012t(\u0002\u000e]Y4x\u0002O\u0004[$miGXJ!\u0015;\u000b\fB+t;\rNCO/i\u0004\u0004G\u007fv|IT#";
        objectArray[25] = "<bf_.\"84'\fA mqG\u000e..{qg\u0012Arj}e\u0005059k\u007fc";
        objectArray[26] = "[\u000byK\u001c`\u0002M\"\u0000e5\u0002L#S\u0019[[\u000byK\u001c`\u0002M\"\u0000e0\u001f\u000e9X\u0002%\f\u000f<:[fZG?\u0001\u0002 \u0001\fF";
        objectArray[27] = "\u0017S\u000e\r(\u0018\u001f\u000f\u001f\bP\tC\n\u001a=,\tO\u0005\u0019fnN\u0011\u0012\u000f]7\bJYv";
        objectArray[28] = "\"\u0001 \u0003/fiA<Q@|u\f9n~z!\u0019.\u0010=hw\u001aE";
        objectArray[29] = "bJ>GytcR|\u0003\u00022.L.\u0011gIc\u0006!Div<T'A\u0002";
        objectArray[30] = " F&$3|\u007f\u0014 !X&x\u000eDqd{+\u0006)\"'2.vu(:\u007fzI*z<z\u0011";
        objectArray[31] = "\u0005\u00074b|\u0003\u001a^9mF\"ZKbx~\u000e)[\u00134\fM,] u A\bQ\u0018G\u0000\u0015\u0011t\u00123<;\u0012F7M!\"+\u000270%C\u0001gi3{8\u0010U.I\u0002\u0010TQ?k\u001f.\u000bZ\rKw\u001b*Q\u001554\u0005[Q\u0019r\u0014?-V\u0018j\u001777hkn\";9G\u001e{<D\t\u0001\u0000\t(\u0018UQ<v8A\b\u0005R0;D\n^30=\u0006\u000b:";
        objectArray[32] = "Cul\u0017n~L&~I\u000b{\u0006\"xQf\u0010B/(H`n\u0001=~K\u000b F=n\u001c1}\u0019\u007fi-";
        objectArray[33] = "\u0017M=Hz!NXp\u0018\u001e~@Z\t\u0011{|-\u0018rGoh\u0016A4\u001c$\u0011";
        objectArray[34] = "@|BBT\u0002Ad\u0000\u0006/^\fmE\u0014SX\n\u0000\u0005\u0000JR\u001f|N@V\u0000p";
        objectArray[35] = "y2arwT t:9\u000e\u0002>r7gu.(i9yc$.t3\u00030Rx~'8i\u0014#5^?3W8?4~n\u0012&\u000f";
        objectArray[36] = "\u0001@\bR2-\u0017\\\tTCu\u0005^WO/GY\u0018\t\u0014C!X@\u000bC|~\nF\u000e(){\u0005Y\fLsv\u0018P7C.t\b]\u000fW|wW\"";
        Object[] objectArray2 = objectArray;
        objectArray[37] = "\u0019Zs\u0019`d\b\\qE\u001b:\u0018M|@w\bI\n \u0018#_K\f#Vbd\u0012Jx\u001d\u001b3\u0004Z\"H$%\u000b\f|'";
    }

    public m$$e6ZUo1gOVrqaQwJ3mTe8it7nWuyGBy2wVcjlmcttb6btkD3Uwp23KdNBYATfgoJ2KD6TRQcQPXfB8FtrMqROVuuliljDkfElJ parse(StringReader stringReader, int n) {
        String string = stringReader.readString();
        for (m$$e6ZUo1gOVrqaQwJ3mTe8it7nWuyGBy2wVcjlmcttb6btkD3Uwp23KdNBYATfgoJ2KD6TRQcQPXfB8FtrMqROVuuliljDkfElJ m$$e6ZUo1gOVrqaQwJ3mTe8it7nWuyGBy2wVcjlmcttb6btkD3Uwp23KdNBYATfgoJ2KD6TRQcQPXfB8FtrMqROVuuliljDkfElJ : (List)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$mpZcUBXY0sWOVoOaq1ub89VTi1Ex2ZLyoc549QOk77mcn92cFd42wwEFkDIwZfEdQEMTYT3ULVJENvPtVIrvQQjOuds5z0DXa.getRegistry()) {
            try {
                if (!m$$e6ZUo1gOVrqaQwJ3mTe8it7nWuyGBy2wVcjlmcttb6btkD3Uwp23KdNBYATfgoJ2KD6TRQcQPXfB8FtrMqROVuuliljDkfElJ.getName().equalsIgnoreCase(string)) continue;
                return m$$e6ZUo1gOVrqaQwJ3mTe8it7nWuyGBy2wVcjlmcttb6btkD3Uwp23KdNBYATfgoJ2KD6TRQcQPXfB8FtrMqROVuuliljDkfElJ;
            } catch (class_151 class_1512) {
                throw m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf.a(class_1512);
            }
        }
        throw new DynamicCommandExceptionType(object -> class_2561.method_43470((String)String.format(a, object))).create((Object)string);
    }

    public static String m$$jUAHskACb8w12yxUozLgagz1VOTmouSuqff6NZf2oduQgG1veapK74kX2NjfqYtS5fM0v3ECphjMo5XyGxTMOO7qzCqsC1nN2(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{32, -50, 114, 120, 66, 17, 125, -87, 62, -114, 87, 125, 34, 65, 53, -40, -76, 48};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 18]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public CompletableFuture listSuggestions(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class_2172.method_9264(((List)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$mpZcUBXY0sWOVoOaq1ub89VTi1Ex2ZLyoc549QOk77mcn92cFd42wwEFkDIwZfEdQEMTYT3ULVJENvPtVIrvQQjOuds5z0DXa.getRegistry()).stream().map(m$$e6ZUo1gOVrqaQwJ3mTe8it7nWuyGBy2wVcjlmcttb6btkD3Uwp23KdNBYATfgoJ2KD6TRQcQPXfB8FtrMqROVuuliljDkfElJ::getName), (SuggestionsBuilder)suggestionsBuilder);
    }
}

