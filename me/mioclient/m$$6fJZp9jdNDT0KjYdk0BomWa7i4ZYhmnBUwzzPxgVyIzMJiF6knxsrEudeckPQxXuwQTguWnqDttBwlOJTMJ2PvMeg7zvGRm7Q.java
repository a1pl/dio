package me.mioclient;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$hn7VeD1Knn6e2RiKjgdLVBztu5wgfP99ezY6n4TYcWiKneUTVX6Rdp5axip4P1KaAQjlUUWQAcQ59bAHu0iUOEUPCG1kYWzl0;
import net.minecraft.class_151;
import net.minecraft.class_2172;
import net.minecraft.class_2561;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q
implements ArgumentType {
    public static final String a;

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                block21: {
                    block20: {
                        block24: {
                            break block24;
lbl1:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.f = new Object[32];
                        m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.g = new String[32];
                        m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.a();
                        v0 = ( /* dynamic constant */ (String)m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn("DgzQA4WsxYdhIQOjMzDD", MethodHandles.lookup(), "m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn", m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.class, 300985660)).toCharArray();
                        v1 = v0.length;
                        var16 = 0;
                        v2 = 55;
                        v3 = v0;
                        v4 = v1;
                        if (v1 > 1) ** GOTO lbl58
                        do {
                            v5 = v2;
                            v3 = v3;
                            v6 = v3;
                            v7 = v2;
                            v8 = var16;
                            while (true) {
                                switch (var16 % 7) {
                                    case 0: {
                                        v9 = 61;
                                        break;
                                    }
                                    case 1: {
                                        v9 = 106;
                                        break;
                                    }
                                    case 2: {
                                        v9 = 25;
                                        break;
                                    }
                                    case 3: {
                                        v9 = 127;
                                        break;
                                    }
                                    case 4: {
                                        v9 = 81;
                                        break;
                                    }
                                    case 5: {
                                        v9 = 79;
                                        break;
                                    }
                                    default: {
                                        v9 = 50;
                                    }
                                }
                                v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                                ++var16;
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
                        } while (v4 > var16);
                        ** while (true)
                        m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.a = new String(v10).intern();
                        var8_1 = 6415414615863629034L;
                        var14_2 = new long[21];
                        var11_3 = 0;
                        var12_4 =  /* dynamic constant */ (String)m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn("G0I4DDsvhs1j9LTRWJH2", MethodHandles.lookup(), "m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn", m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.class, 351084353);
                        var13_5 = var12_4.length();
                        var10_6 = 0;
                        while (true) {
                            var15_7 = var12_4.substring(var10_6, var10_6 += 8).getBytes( /* dynamic constant */ (String)m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn("ArJdEoiWSxeASDeYVnRd", MethodHandles.lookup(), "m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn", m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.class, 1912078583));
                            v11 = var14_2;
                            v12 = var11_3++;
                            v13 = ((long)var15_7[0] & 255L) << 56 | ((long)var15_7[1] & 255L) << 48 | ((long)var15_7[2] & 255L) << 40 | ((long)var15_7[3] & 255L) << 32 | ((long)var15_7[4] & 255L) << 24 | ((long)var15_7[5] & 255L) << 16 | ((long)var15_7[6] & 255L) << 8 | (long)var15_7[7] & 255L;
                            v14 = -1;
                            break block20;
                            break;
                        }
lbl79:
                        // 1 sources

                        while (true) {
                            v11[v12] = v15;
                            if (var10_6 < var13_5) ** continue;
                            var12_4 =  /* dynamic constant */ (String)m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn("ookQynn7ScYRgAGesIcB", MethodHandles.lookup(), "m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn", m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.class, 2034511907);
                            var13_5 = var12_4.length();
                            var10_6 = 0;
                            while (true) {
                                var15_7 = var12_4.substring(var10_6, var10_6 += 8).getBytes( /* dynamic constant */ (String)m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn("pKQCC5I2wr7MSMByBcAz", MethodHandles.lookup(), "m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn", m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.class, 2136200805));
                                v11 = var14_2;
                                v12 = var11_3++;
                                v13 = ((long)var15_7[0] & 255L) << 56 | ((long)var15_7[1] & 255L) << 48 | ((long)var15_7[2] & 255L) << 40 | ((long)var15_7[3] & 255L) << 32 | ((long)var15_7[4] & 255L) << 24 | ((long)var15_7[5] & 255L) << 16 | ((long)var15_7[6] & 255L) << 8 | (long)var15_7[7] & 255L;
                                v14 = 0;
                                break block20;
                                break;
                            }
                            break;
                        }
lbl92:
                        // 1 sources

                        while (true) {
                            v11[v12] = v15;
                            if (var10_6 < var13_5) ** continue;
                            break block21;
                            break;
                        }
                    }
                    v15 = v13 ^ var8_1;
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
                m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.b = var14_2;
                m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.c = new Integer[21];
                m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 461469;
                var0_8 = 4730771813237251249L;
                var6_9 = new long[3];
                var3_10 = 0;
                var4_11 =  /* dynamic constant */ (String)m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn("aOXtbNvPdzSePisJWA8E", MethodHandles.lookup(), "m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn", m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.class, 1075427340);
                var5_12 = var4_11.length();
                var2_13 = 0;
                while (true) {
                    break block22;
                    break;
                }
lbl116:
                // 1 sources

                while (true) {
                    var6_9[v16] = (((long)var7_14[0] & 255L) << 56 | ((long)var7_14[1] & 255L) << 48 | ((long)var7_14[2] & 255L) << 40 | ((long)var7_14[3] & 255L) << 32 | ((long)var7_14[4] & 255L) << 24 | ((long)var7_14[5] & 255L) << 16 | ((long)var7_14[6] & 255L) << 8 | (long)var7_14[7] & 255L) ^ var0_8;
                    if (var2_13 < var5_12) ** continue;
                    break block23;
                    break;
                }
            }
            var7_14 = var4_11.substring(var2_13, var2_13 += 8).getBytes( /* dynamic constant */ (String)m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn("KQYg2CWsJwn0JvSkZK5Y", MethodHandles.lookup(), "m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn", m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.class, 1333801004));
            v16 = var3_10++;
            ** while (true)
        }
        m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.d = var6_9;
        m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.e = new Long[3];
        m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)5700997234148304025L);
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x76C5) & Short.MAX_VALUE;
        if (e[n2] == null) {
            m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.e[n2] = d[n2] ^ l;
        }
        return e[n2];
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static void a() {
        Object[] objectArray = f;
        f[0] = "HV-i\tiF_ja\u000er\u000b^' \u0010plEEI8TpgI<\u0004aNipj\u001a~d\u0003G^\u0015q\u0011Drp2uTul^YkKem0\nBdAYoRHRj5t\fwJvU5'r`\u0004RI9ACuKV2NC\u0007Vi'2PGBH\u0002oL\u0006Bl\u0010Qtkz4\u001a";
        objectArray[1] = Integer.TYPE;
        m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.g[1] = "java/lang/Integer";
        objectArray[2] = "h O\u001890v(UWd1p$X\u00149\u0016v3\\\u0018z";
        objectArray[3] = "PB\u001f%$\u0000PB\by(\u000fJ\t\bg(\u001aMxY:~[";
        objectArray[4] = "XP(y7\u001aQ^+0t\u0017IV\"6>\u001c^Mk$/\u0012\\Z6#3\u001aU\u0011\u0016\"=\u0012^L1>5\u001bH}0>6\u0011^M";
        objectArray[5] = "HBq&v:VJki; L@r5**LW)\u00047\"ROb39-NFA2,:PF";
        objectArray[6] = "\fgu\r|\u0000\u0002n2\u0005{\u001bOo\u007fDt>4p5(r>URn\r@\u0001\tj\u0002\u0007b\u001d$p\u001e:\\\u0019);\u001f,|8QP)5|\\\u0017Im\u001as9RH\u000bRW\nUQk:])\u000eUh%~#4K?\u0007T.3w+VB\u0007\bL*\u0013G \u000009\u0014x;\u0004:#\u0011!\u001e\t6*(x";
        objectArray[7] = Long.TYPE;
        m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.g[7] = "java/lang/Long";
        objectArray[8] = "\u0015\\[\u001e8C\u001bU\u001c\u0016?XVTQWgJ2c\u0005J;H6}!C\u001aF!]\u001eC\u0013C\u0015n\u0014D8\u0018\"`\u001d\u001e?n-N\u000f\t\u0001T\u001fo\f:+a2P3E:B\u0000J\u00076$H\u001dZ\u001e#\u0000T L\u0002\"\u0005K\rn\u001b\u0002\u0015X\f{\u0002\u001f\u001ef,t?A\u0001Z5\\\u0012D+Z?k\u0018D\u0000";
        objectArray[9] = "\"bw\u0004\u007ft+ltM<y3d}Kvr$\u007f4yfi(c}xwz%hh";
        objectArray[10] = "uZq\n1 {S6\u00026;6R{C0!/i:#i\u0004vQi\u0002j\u001dqt5\u0000<\u0003N}%\u0013-zoX97av}E\u0006Q6{Lf<01\u0004vZ\n3\u000e\u0017.m;\u0017m.`V/S\b~S^\u001e62#Mj\b6\u0019,I\nf\u0005\u0019\u0007m\u000f62\u0017\nMo\u001c i$Ah%\u000bh";
        objectArray[11] = "y%B\"L1r*Sm1)a-Z$";
        objectArray[12] = "+^j.\u0018T Q{ayZ+Z\u007f;";
        objectArray[13] = "$~'c9:$~0?55>50!5 9Daxbb";
        objectArray[14] = ">T4pU\u0001 \\.?4\u0004 \\-\u007f\u001a\u0018";
        objectArray[15] = "\u001e.\u0003e\u0005|\u0015!\u0012*b~\u0000*\u0012aY";
        objectArray[16] = "}b\r\u001aa`tl\u000eS\"mld\u0007Uhf{\u007fNQtl{}\u0014]cam#$Mbnsd\u0003wcbsl\u000ePIw}h\u0010@e`pY\u0019Di";
        objectArray[17] = "ac:\u0002\rGhm9KNJpe0M\u0004Ag~yI\u0018Kg|#E\u000fFq\"\u0014C\rEcb3\u007f\u0019Fvm/i\u0018Kg|#E\u000fF";
        objectArray[18] = Boolean.TYPE;
        m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.g[18] = "java/lang/Boolean";
        objectArray[19] = "?v\u0014\u0010\u0015e?{L\u0016(gib\f\u001bow\u00006\r\u0010V%nt\u001eJ\u0018\u0019?v\u0014\u0010\u0015e?{L\u0016(";
        objectArray[20] = "\u001e}\u0006\f\u0000rN\u007f\b_mq\u001a?mQ\u0011x\t\u007f\u0003\u0013\u0002\"GC";
        objectArray[21] = "\u0018we\u001d\fdTvs\u0014cyDki\n\u000fK\u0012/0SX\u001c\u0016gl\u000b^`\u0016j4\rc-I{y\u0002\u001baHmpm";
        objectArray[22] = "*u?0G#cx,\t\u001dd6c;E6rjFmX\u0019$p]\u001e9\n\u0002{mmn!6tw\u0016o\nt!Z={C$]xmkD\u0006 LaX'\u000fji\u001a4%\u0005'^?O\btHg<Y26[K\u0013BA\u0019'f%6\u00192wy\u0007h%\u001a%g\u0002q8/T66v31CC]6\b-|:!6\u0005uz\u0007d8A3gxbyI9\u001ancb\u0015%v>alFH";
        objectArray[23] = "\u007f\u0003\b\fgM6\u000e\u001b5=\nc\r\u0001XiC5M8\u007f\n`2AVg\u0003x2# x=[w@\u0015u8y7\fPkizp2\u000bh\u0001t&\u000fPg$\u007f=/\u0011\t&A\u0002.6thO\r*Pg*\u001a\u0003\u0010\f\t5LwO\rn%C34&w\u001dh=5\u0013\u007f\"D17\u000bv\u0007d\r,j\fi\u001f4\f\u0015\n(\u0017>qSP`\u0017-\u001aU\u000e*\u001fO";
        objectArray[24] = "Sg\u000e\u0001\\ERf\f\u00012Y\u0000u\u000f1NY\fz\fj\rS\bz^\u0016\r^P|c";
        objectArray[25] = "~uQtV*jg]5(+zd\u00016S<\u0017#]uS,h%\u001c}YQ.+U7U.(j]=(";
        objectArray[26] = "{y/\u0016Tfyt}FhCvos\tPo\u0005\u007f\u0002E\",\u0000y1\u0004\u000e $u\t6.t=P\u0003B\u0012Z>b&<\u000fC\u0007&&A\u000b\"-CxBUY<q?8,qxu.\u001a1O'~\u001c:Yz\u0006u\u0004D\u001adwu\b\u0003:^\u0001r\t\u001b9V\u001bLz\u001f\fZ\u0015c\u000f\n\u0012%%%\u0011xTc}\":\u0006\u000f$|!CAY$<c<G\u0018,6\u001e";
        objectArray[27] = "\u000bFb\u0012l2\u0004E=O\u000f0\u001bJ:\tb[Q[5\u000b35\u0013HoE\u000f1\u001d^2\u0007>+\nW?u";
        objectArray[28] = "v \u001f\u0000h8!.\u0019\u0015\u0002|\"%X\u001c\u0002:02H\u001fd;10Hq;5r$^\u000e=tz.#Nht\".]\ra5,_";
        objectArray[29] = "A0\u001c\u001da\u0004U\"\u0010\\\u001f\u0005E!L_d\u0012b.]Hd\u007f\u0011n\u0018^b\u0000\u0017/\u0010T\u001fF\u0019fZX`@XnP%";
        objectArray[30] = "vp\u000bXJ7&r\u0005\u000b':d\u0003\u0005M[*\u001f%\u001f\t\u001f6v/\u0000Z\u001b[";
        Object[] objectArray2 = objectArray;
        objectArray[31] = "_?;\u000fX9\u0004$=F)-\b# \u0019E\u001fTe~B)q\u0000gq\u001cBw^-y~\u0012!\\0<\u0013H2\t?@EIt\u001b%?\u0003@&\u0007_";
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6E31;
        if (c[n2] == null) {
            m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.c[n2] = (int)(b[n2] ^ l);
        }
        return c[n2];
    }

    public m$$hn7VeD1Knn6e2RiKjgdLVBztu5wgfP99ezY6n4TYcWiKneUTVX6Rdp5axip4P1KaAQjlUUWQAcQ59bAHu0iUOEUPCG1kYWzl0 parse(StringReader stringReader, int n) {
        String string = stringReader.readString();
        Optional optional = m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$ANJNd4tqNUsLaeebaxAs9nKNVxO0rG555Xcg1XVFYiMsPLG6rt9Y8OuCCNV5RYtBVeSN0GQHe10DeupkyfZPo2aFBtQzQXtMW.m$$lnDF2xI8YidbRK8zBib8oQvfxCnz43Uhz3dOw8j4F2C4YWOxfO5UE5QjNx4ZhiXBvIDFC1Y5ip7irevRiUZ7hWpHoF9cwCqQL(string, Integer.reverse(((0x604FBB95 ^ n - 37) + 43 << 16 | (0x604FBB95 ^ n - 37) + 43 >>> 16) ^ 0x893FB8C1) - 37);
        try {
            if (optional.isEmpty()) {
                throw new DynamicCommandExceptionType(object -> class_2561.method_30163((String)new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)String.valueOf(object)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(a))).create((Object)string);
            }
        } catch (class_151 class_1512) {
            throw m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q.a(class_1512);
        }
        return (m$$hn7VeD1Knn6e2RiKjgdLVBztu5wgfP99ezY6n4TYcWiKneUTVX6Rdp5axip4P1KaAQjlUUWQAcQ59bAHu0iUOEUPCG1kYWzl0)optional.get();
    }

    public static String m$$tKqeRZZsCaphCAhYEuVYQVKfa86GA9Ix20FpwEvEgEf9FkLEcMMmmx7WPzpJwn8GjPI3I7IjBRfppAUvxrpRJt5UirUywL9Wn(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-120, 31, 6, -125, 34, -61, -88, -98, 114, 79, -30, -104};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 12]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public CompletableFuture listSuggestions(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class_2172.method_9264((Stream)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$ANJNd4tqNUsLaeebaxAs9nKNVxO0rG555Xcg1XVFYiMsPLG6rt9Y8OuCCNV5RYtBVeSN0GQHe10DeupkyfZPo2aFBtQzQXtMW.m$$tce9mr4ZBZNu84ZSVuZBEmu09wHhWpu2V9T7KiUQZav2ZtQzVs4voEWTI8aJS2Zz4Din4eb06oSumtMDJMFzLqBrjvNiKWJJU(-12197951), (SuggestionsBuilder)suggestionsBuilder);
    }
}

