package me.mioclient;

import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiPredicate;
import me.mioclient.m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$cr1cUwlXRwlij0FDPBwDumNZtQe5dZUYMwStzZlYNBu9dRJEQrtYU22mu3knmGhhSAobASlR6ckvjozWrz8lteaYivYVxYUry;
import me.mioclient.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ;
import me.mioclient.m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import me.mioclient.m$$qDWCNwcPOHSNNyFhzEE62NH0CTlvD5qHHzxZLBAYIt1fo2VwQ0e367BmA79PmCmz3KtxD0EqmIahdRqT75CXEkeOFoSCGa5B0;
import me.mioclient.m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62;
import net.minecraft.class_2561;
import net.minecraft.class_2703;
import net.minecraft.class_640;
import net.minecraft.class_7828;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8
extends m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM {
    public static final Lock m$$5a10Pyz0UH2GGLRX6Wnp458NcpxcI5lJcauY9Fg9B4jfN3lSbyEUPgORcUzz3O02Or3MZuca18hKA0tXc2kZbIRBwdkuCDqyI;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$EbvZPobuZ009SanpSI4SbvS9J9BPPgzyinZl6sZXyJGjt7q6GWgi18LaCoDmaN6To4UzpJvkzjRfEj7IpUn3TJUHBA3SZgSO4;
    public final Map m$$KmyS5nM1NrDSxKBJaTc6SC5c3PHmFppqdG85KQpOpTE6qrp4nGjQWY6OM1l24w5zihtHAnxf5nNn75qW4DgN4Mh5uUich8qDf;

    public m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8() {
        super("AntiVanish", "Makes invisible players visible.", m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ.m$$ZaD3M0jv7OKLL5o46rdCtPy8hIHUWkQwHiymBJrAs8Rx7AkYyizdJsbYM7bheQ2XDJQqqsI7QTERMWze3ESAiWCzZZRMyzfVV, new String[0]);
        m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.Xx3bJrDrRb9yiyRyGdbDeP54LarzgFWfCZfTLoRwpO8Unt9v2uefnlVtxpsFnGNmh763TSApbXpcY9ELTWzI4uurJwUuJUC6zT1l(this);
        this.m$$KmyS5nM1NrDSxKBJaTc6SC5c3PHmFppqdG85KQpOpTE6qrp4nGjQWY6OM1l24w5zihtHAnxf5nNn75qW4DgN4Mh5uUich8qDf = new ConcurrentHashMap();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.i = new Object[80];
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.j = new String[80];
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f();
            var17 = new String[3];
            var15_1 = 0;
            var14_2 =  /* dynamic constant */ (String)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.m$$ykpUNc2bwm1GtvjJVXKvckiKl4Pa0AiarGilAehmEWIy6ZaqzRidezktpv3vYIJcYcIeLT4jLSEKMmZA7h9ISnPJCwdvzH12E("0mKXcUBaYEZQt6xFxFpv", MethodHandles.lookup(), "m$$ykpUNc2bwm1GtvjJVXKvckiKl4Pa0AiarGilAehmEWIy6ZaqzRidezktpv3vYIJcYcIeLT4jLSEKMmZA7h9ISnPJCwdvzH12E", m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.class, 1416794761);
            var16_3 = var14_2.length();
            var13_4 = 32;
            var12_5 = -1;
lbl10:
            // 2 sources

            while (true) {
                v0 = ++var12_5;
                v1 = var14_2.substring(v0, v0 + var13_4).toCharArray();
                v2 = v1.length;
                var18_6 = 0;
                v3 = 84;
                v4 = v1;
                v5 = v2;
                if (v2 > 1) ** GOTO lbl93
                break block12;
                break;
            }
            var13_4 = var14_2.charAt(var12_5);
            ** while (true)
lbl26:
            // 1 sources

            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.e = var17;
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.f = new String[3];
            var10_7 = 8977136312049512050L;
            var8_8 = -8489007016796900707L ^ var10_7;
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)var8_8;
            var0_9 = 2459806492984382239L;
            var6_10 = new long[2];
            var3_11 = 0;
            var4_12 =  /* dynamic constant */ (String)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.m$$ykpUNc2bwm1GtvjJVXKvckiKl4Pa0AiarGilAehmEWIy6ZaqzRidezktpv3vYIJcYcIeLT4jLSEKMmZA7h9ISnPJCwdvzH12E("VNCnD3aMSjZvVyqtpaou", MethodHandles.lookup(), "m$$ykpUNc2bwm1GtvjJVXKvckiKl4Pa0AiarGilAehmEWIy6ZaqzRidezktpv3vYIJcYcIeLT4jLSEKMmZA7h9ISnPJCwdvzH12E", m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.class, 392466935);
            var5_13 = var4_12.length();
            var2_14 = 0;
            do {
                var7_15 = var4_12.substring(var2_14, var2_14 += 8).getBytes( /* dynamic constant */ (String)m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.m$$ykpUNc2bwm1GtvjJVXKvckiKl4Pa0AiarGilAehmEWIy6ZaqzRidezktpv3vYIJcYcIeLT4jLSEKMmZA7h9ISnPJCwdvzH12E("996H8MuCs6BLQPkmIkRb", MethodHandles.lookup(), "m$$ykpUNc2bwm1GtvjJVXKvckiKl4Pa0AiarGilAehmEWIy6ZaqzRidezktpv3vYIJcYcIeLT4jLSEKMmZA7h9ISnPJCwdvzH12E", m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.class, 1405419603));
                v6 = var3_11++;
                var6_10[v6] = (((long)var7_15[0] & 255L) << 56 | ((long)var7_15[1] & 255L) << 48 | ((long)var7_15[2] & 255L) << 40 | ((long)var7_15[3] & 255L) << 32 | ((long)var7_15[4] & 255L) << 24 | ((long)var7_15[5] & 255L) << 16 | ((long)var7_15[6] & 255L) << 8 | (long)var7_15[7] & 255L) ^ var0_9;
            } while (var2_14 < var5_13);
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.g = var6_10;
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.h = new Long[2];
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)1071808968552972763L);
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.m$$5a10Pyz0UH2GGLRX6Wnp458NcpxcI5lJcauY9Fg9B4jfN3lSbyEUPgORcUzz3O02Or3MZuca18hKA0tXc2kZbIRBwdkuCDqyI = new ReentrantLock();
            return;
        }
        do {
            v7 = v3;
            v4 = v4;
            v8 = v4;
            v9 = v3;
            v10 = var18_6;
            while (true) {
                switch (var18_6 % 7) {
                    case 0: {
                        v11 = 116;
                        break;
                    }
                    case 1: {
                        v11 = 39;
                        break;
                    }
                    case 2: {
                        v11 = 5;
                        break;
                    }
                    case 3: {
                        v11 = 15;
                        break;
                    }
                    case 4: {
                        v11 = 58;
                        break;
                    }
                    case 5: {
                        v11 = 40;
                        break;
                    }
                    default: {
                        v11 = 111;
                    }
                }
                v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                ++var18_6;
                v3 = v7;
                if (v7 != 0) break;
                v7 = v3;
                v4 = v4;
                v10 = v3;
                v8 = v4;
                v9 = v3;
            }
lbl93:
            // 2 sources

            v12 = v4;
            v5 = v5;
        } while (v5 > var18_6);
        var17[var15_1++] = new String(v12).intern();
        if ((var12_5 += var13_4) >= var16_3) ** GOTO lbl26
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x5FE4) & Short.MAX_VALUE;
        if (h[n2] == null) {
            m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.h[n2] = g[n2] ^ l;
        }
        return h[n2];
    }

    public static void f() {
        Object[] objectArray = i;
        i[0] = "%rm\u0003\u0010^;zwLw_*az\u0016QY";
        objectArray[1] = Boolean.TYPE;
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.j[1] = "java/lang/Boolean";
        objectArray[2] = "k\\\u007f\\\u000b\u0014uTe\u0013h\u0000q";
        objectArray[3] = "\u001d9][#\u0007\u00166L\u0014B\t\u001d=HN";
        objectArray[4] = "S1(n+bM92!cbW3*fjy\u0017\u00127LjyJ%3jw";
        objectArray[5] = Void.TYPE;
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.j[5] = "java/lang/Void";
        objectArray[6] = "q t8;oo(nwYsh5";
        objectArray[7] = "]Zi\\NcSS.TIx\u001eRc\u0015njv^$hWNTN\bb\u0013hZR#UVy^i$~LbEL\u001fVfB}O*P\u001f9\u0002mvFStCV2CvO`\u0006\u0010{bJ{[)wq\u007fjm\u007f\u007f]o]l!fwihT\u0005{\u0013Beh*G\u0014=B\u0007*dp5So\u0014}\u001f";
        objectArray[8] = "0VeUS\u0010.^\u007f\u001a\u001b\u00104Tg]\u0012\u000btuzd\u000f\u0000>^pU\t\u0000";
        objectArray[9] = "=d6gN_=d!;BP'/!%BE ^tz\u001b";
        objectArray[10] = "TF\u001e<cyJN\u0004s+yPD\u001c4\"b\u0010d\u00073>ySB\u001a";
        objectArray[11] = "s\u001b,1)<x\u0014=~K?w\u001d";
        objectArray[12] = Long.TYPE;
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.j[12] = "java/lang/Long";
        objectArray[13] = "\u001f\",\u0006\u0014|\u0014-=Iii\u00067?\n";
        objectArray[14] = "!'i+\u001a8/..#\u001d#b/cb\u0010%}!\u00121\u001f\u000f\u001e5+/\u0019g\n\u0006\u0017\u0004\u0004\u00139/\t\u001c\u0007\u0006)w#\u001c&\u000e\u00015\u00142\t\r \u001b\t\u0004\u0006n(\u0010\r\u0003\"%8\u001b\u0012tA:9q,(\u001e\u0010$*\u0014\u0007\u001c5\r\u0011+\u0014E4'4-)\t\u0000>8\u007f*\u00072-\u001b.0*\u00014\u001b\u00124\n";
        objectArray[15] = "\u0018\u00077+PG\u0006\u000f-d\u001d]\u001c\u000548\fW\u001c\u0012o&\u0011Q\u0019\u0015o\u0006\u0011Q\u0019";
        objectArray[16] = "n\u001c2)\u0019\\e\u0013#feEj\u0013%*[U";
        objectArray[17] = "\u0002>H@\u0010 \u0002>_\u001c\u001c/\u0018u_\u0002\u001c:\u001f\u0004\u000f_M";
        objectArray[18] = "d/\u000b\u0012\u001fYd/\u001cN\u0013V~d\u001cP\u0013Cy\u0015I\u000fF";
        objectArray[19] = "\u00060But\u0002\u00060U)x\r\u001c{U7x\u0018\u001b\n\u0004l)XL6Z:j\u00187g\u0001k,";
        objectArray[20] = "U\u001ast\u0011P\\\u0014p=R^C\u0001v6\u0015]\u00182\u007f7\u0019oD\u001ax3\u0010Z";
        objectArray[21] = "p'Fg\u000bH~.\u0001o\fS3/L.\bs{;89 j\\\u0012\u000bf0N_\u0015\u0012\u007f2M[\u0014$[U\u0013w8.d,_s7\u000er6pwv\u000fG(VGz\\B0qK\f1\\*st\u000b\u0012D\u0010A,*'k\u0011R~+\u001f}/\u0010Z\u0014_O.Fv3Z`-bh&*l;lq\u0003'd$";
        objectArray[22] = "g\u0013\u0019\u0006\u001f\u007fg\u0013\u000eZ\u0013p}X\u000eD\u0013ez)_\u001dK ";
        objectArray[23] = "\r^\u0017~\u007f%\u0006Q\u00061\u0002=\u0015V\u000fx";
        objectArray[24] = "\u0003{:Pi'\u0003{-\fe(\u00190-\u0012e=\u001eAyF6v";
        objectArray[25] = ".PxL \u0000%_i\u0003Z\u00046^yLl\u0000!";
        objectArray[26] = "&DIuvs&D^)z|<\u000f^7zi;~\u000fl+)";
        objectArray[27] = "\u001c*'\u001cWa\u0002\"=S,A?\u000f";
        objectArray[28] = "?&N\nuR?&YVy]%mYHyH\"\u001c\f\u0010(";
        objectArray[29] = "\u0012}sJZ\u000b\u001ct4B]\u0010Quy\u0003R5*j3oT5KHhJf\n\u0017p\u0004@D\u0016:j\u0018}z\u00127!\u0019kZ3OJ/rZW\tSk]U2LR\r\u0015q\u0001KKm}{\"\u0010OnbX(*Q9@r%-m-\u0011d\f\u0016V,Ta+\u001e*?S^0\u001a %V\u0007\u0015\u0017,,o^";
        objectArray[30] = "\"\bT7fM\"\bCkjB8CCujW?2\u0017-9";
        objectArray[31] = "XS\u000e#/OVZI+(T\u001b[\u0004j7dbun9%pz~s\u0000\bYs^Z\u000b\u0003\u0016\u0007xh~\u0005tY@d{7h}LX\u0014\nbtoi:wFZ\u0004v9\u0017\u0010P\u0005\u0016y\u0004Mt\u0001\u0019\u001e+cXL\u0013\u00052Xq\u0006e?+iT^D\u001c7t\u0002\u0003c\u0016\u0003KPyf!\u0015crW\u0015\fv";
        objectArray[32] = "\u000e$Bm\u0019n\u0005+S\"tj\u00057giFw\u0001+Wi";
        objectArray[33] = Integer.TYPE;
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.j[33] = "java/lang/Integer";
        objectArray[34] = "RJk.T)\\C,&S2\u0011Bag\u000b>|au%G\u000f\rip6S%eW\u0017\u000bEu~D\u000f*^<onsr^q\u0006j}\u0000su|\u0018}(_\bOC/&r\rs\u001631Osl{1,q4\\Gv'W-yk,\u0000\u000e#w]\u0000\u0016y-r\u0017+;i(\f|\u000f\u0005\u000e\u0016gB'\u0019H";
        objectArray[35] = "\"\u000f&*\u0010\u000eW/-%\u0001A6!&.\u0005\u001bB";
        objectArray[36] = "}E\u000f\u0013V\u0013sLH\u001bQ\b>M\u0005Zv\u0005\u007frG\u001fZ;#YN\bI\u001fXoY5\b>!Px\u0013P\u000ehGm\r\u000b\u0006iP\u00146W>jKI\u001f\t\u0016#C\u0011\u001cz\u001ebn[&FO'Iw\t^MgQ\u00117GDrAk\u0010^MHCC'u7 G\u0011\u001f\n\u0006WUb1\rKVOX\u001dH";
        objectArray[37] = "\u001bTN>G\u000b\u0015]\t6@\u0010X\\Dwt\u000b\u0003X5\u0015E\u001cGI\u00185^&5G5\u0004fP9U81\u001d\u0015\f\u0000V<I\u0000\"|$7CWB[27b+\u001eC\u0002\u0007}\u001c,k\u00146O &DQ\u001bVR@k5&T\u00012@+\u0011i\u001e\u0014e0+gV8p\u0003!C\u001e@x-\u0015\u007f\u0013'E\u0001\u0014c";
        objectArray[38] = "(!sR\u000bh(!d\u000e\u0007g2jd\u0010\u0007r5\u001b0HP8";
        objectArray[39] = "W1OB\u000b\u0012Y8\bJ\f\t\u00149E\u000b\u000f\u001aPc\r`%\u0017X:1D\u00058w5\u0003n\u0007\u0011r 0g\n\u0011t\u0007*BV\u000fxc\u0004_2\u0012]>'I\u000f\u0015Y\u00102^W9U<Wy1D\u0002\u0010\u000f|Z\u0017M\u0000\u0014\u0018\u0004L\u0003e%@+IOb\u0013K\n\u000eI,\u0010W6\u001bO\u0016/^:\u0004s7\biW";
        objectArray[40] = "XO-/.\u0016XO:s\"\u0019B\u0004:m\"\fEuk4uN";
        objectArray[41] = "3\fUq{\t=\u0005\u0012y|\u0012p\u0004_8[\u001f1;\u001d}w!m\u0010\u0014jd\u0005\u0016&\u0003W%$o\u0019\"q}\u0014&\u000e7o&\u001c'\u0019NTz$$\u0002\u0013}$\fm\nK~W\u0004,'\u0001DkUi\u0000-ksW)\u0018KUj^<\b1rsW\u0006\n\u0019EX-n\u000eK}'\u001c\u0019\u001c8S Q\u0018\u0006\u0002\u007feB3M_fg\u001f9,#/@\u001f\u0019\u001dHJ~\u0017\tZCrz\u000b)Q/_e\u0007/X9y{)'%:/xP\u0006(\u0019jJ/1\f8/\\T\u0006Q\fI*\n:\u000f\"o\"\fh\u0003\f{ 24\u001b\u001a/^>;^\fIH*\u001b,\u001afc\u0015h\u00078,J^\tP=$";
        objectArray[42] = "p\b\u001e>\t\"{\u0007\u000fqe!u\u0005\r>I";
        objectArray[43] = "I.f6%\u0007I.qj)\bSeqt)\u001dT\u0014'*}^";
        objectArray[44] = "\u0012\u0013(+\u0003\u001c@Ow1=\tF\u0016-(Ps\u0011\u0015-3Q\u001fW\u0012!5=IM\u0014/:Q\u000fJ\u0018)V";
        objectArray[45] = "\"n;rv\t#ge\"I\u0003%i4,%1q(jqI\r9g&/-_qm,K";
        objectArray[46] = "!Q(BKJ{\u0015u\u0001q\\v\r&-\u0018\\l\u0006IC\u0010W(\u000et\u0017\u000bZmk";
        objectArray[47] = "\u0012}WTI4\u001c=\u001e]qY\u0001z\u0005&\u000bE\u000b\u001b\u0005U\u0000h\u0000\u001b\u001e+\u001dc=,7YMM\u0018;\u001d\u000b?V\u001f\n=\n-M\u0016\u001b\u0010\u001c69,'\u0013U\u000f3\f,\u0001\u0002\u0015W\r1\u0017\u001f?o>\u0007\n\u0004N7J\u001d4-\tc!9\u00045@D5\u001d0\u001605\f<\u0015&\u000eT\f\u00032/O{-x\u000bdKo\u0016$\u0003\b\rh\u001a\"oXIr\b(\u000b\tHm\u001aA";
        objectArray[48] = "C\\\u001adDfKZ\u0013w{nOC\u0015h\u0017\\\u001e\u0001N4C\u000b\u001eF\fvB0YF\n\u007f{";
        objectArray[49] = ")r_FvEnrYOO\u001fif\\V3\u0019o\u000b\u001f]0\fz5OZ=~";
        objectArray[50] = "xCwI\tAdDl\u0004v\u001boD~\u001f\u001a)>\u0003\"GN~lJg\u001a\rBkTg\u0017v\u0003mDx\u001d\u001d\u0018i\\fx";
        objectArray[51] = "jU$f.|0\u0011y%\u0014p3\u000b8:S`Z_$8-kg\u000b?5h\u000ejU$f.|0\u0011y%\u0014";
        objectArray[52] = "oL\u0016\u0019s\rr\rZ\u0001\u000fW&YfX4\u000eJ0G1mk5Hn\u0011ev;,\u0014\u0005s`n\u001e\u0018R1Y22g\"3qU;lZ6_oIf\u0000U\fg\u000e\u0012\u0004bBEJM'A|`Hv\u0004mW:6H>eXU\u0014k\u001c6[r\u000bq\u0001TyH$k-^RR(K'_X4DZca@s\u0017S_f^s\u001a(";
        objectArray[53] = "$?\u00130B\r9~_(>Wm*s\u0013gi\u001e7b nV%dt\u0015tu\u0001va\u0007}k%|\u0010p\u007fX!zS4|\r+w\u0011vBJ!y\u0015\u001aG_*Ba\u0004g\n\u0006Gm\bCJ<{G5b\u000f{XSwpt1eo2R\\z<\u00177R\nxgP\bz_\u00116\u001d;n\t\u000fA]JY\n\">D#Q\b$`-";
        objectArray[54] = "QW\u001f,8@\u0001P\u0012^7\u0017\u0013s\r.+~Q\b\u000e&(\u0001\u000fU[`W";
        objectArray[55] = "Ai+\u001bB\u001eFw+\u00169LHa7\u0010E^BwR\u001e^XUe6\u0002W\u001e\u0015\u001b<\u000b@@T';\u0015@M/";
        objectArray[56] = "OQ'z~7\u001d\rx`@6\u0011K\bn+8v\n/i?#\u0006Hx=#XJ\t>~)<\u001b\b!l@";
        objectArray[57] = "<I\u0007d1\u001e%\r\u00057H\u0014yX\br9\u001e\u0018$AU9>)O$k1.nD\u001co-\u000ee(1p!\bl>\u0017n\u000f\u0000\u0011=Amv!\u001c\u001e\u0004_\t\u00168?AIr!e\u000b'?,\u001d;%\u00017*O7\u000b\u00155\u0014\u0013/\u001dAK\u0018\u001cj\u000b']\f<\u0018\u001d\bv3O3?B_x.d:J\u000f!\r)\u0019\u001easO%Mze)\u0003>\u0011\nc2\u0012itF73\b<\u0010\u00176,\u001aU";
        objectArray[58] = "&\u001d?D\fB.\u0013z[<G-\u0011?j\u0005\u0015rKGP\u0001E&\r>[\u0001Vvt";
        objectArray[59] = "9D|rSP=@)4/\u000e(Se6^\u0004I/,\u0011^$xDI/V4?Oq+J\u00144#\\4F\u0012=5z*h\u001a@6,)\u0011;M\u0015i\u001bn\fi4,\r\u0015;4\u0000J{K\u0007j.lsMUf\u0000xqs\t~\u0016,\u000f\u007f\u0006;\u0000J\u0019k&I\u0016e2TUb4/\u001b\u001f451'K\u0011PaA{sD\u0011o\u0006\u0017w\u0017\u0010}\u0016s&\u0016\u000fo\u007f";
        objectArray[60] = "\u0001&q\u0019<SYyo\u0016CCM<eD%Tl'zD\u0006IT\"~RC\u0018Q)&L~LJ$c)";
        objectArray[61] = "6 s\u0012\u0011i`=j\u0000qfw~DX5@262\u0012.a\u0002\u001fh_(N;\u00034[\u001a3\u001a\u0000U\u000fAI\u001a\b},\u0018A1\br\u001e\rq\u0018\u0014J\u0012 :\t>|\u0012\u0013y<,<\u000b\u0015Ej\u0003@0Ka\u0017\n]!\u0003?\u001b9Q;\f:\u0016;32\u000fD\u0019=I\u001c\u0010a1\u001cl!A_8\u001c=`\u001fg+-q\u0010\u001f9*,\r";
        objectArray[62] = "VmZ-Pu\naO,1tXcE!]F\b!\u0019v1(\bq]9NvU$\u001bF\r)NfL\"\\(Qt%";
        objectArray[63] = "+6\u001f'\u0004R{1\u0012U\r\u0001b(`o\r\u000bw8\f)\n\u0007qT";
        objectArray[64] = "{V\u001c\n\u0011apV\u000fZhw{\u00173\u000f\ru\u0016\u0005\u0007\u001f\nc*\u0002\u0019\u001f\u0007\u0018";
        objectArray[65] = "P`6BQ[Pd:A8^\u0004w%UITe\u000blrItT`\tLAd\u0013k1H]D\u0018\u0007\u001cWQB\u0011\u0011:I\u007fJl\u0012lJ\u0006ka1)xy\\E\u0010ln\u0002k\u0018$\n\u0018\\WF\n,\u0010Z\u0005J$8\u0012dYR2llhV\u0017$\nz|ve2%QC\u0005N\u0010ox\bd\u0019\u0015g(@B\u0014$*HYDZ2WQURD+%WQWE[";
        objectArray[66] = "Ja\u001e'\u0001\u001e\u0015lApa\u0003\u0019~\u001bz\r1M2G _fH{\u0002dX]\u000f{\u0004ma";
        objectArray[67] = "@\u007f\u001a0\u000bCH~NhnZHj\u0007\u0005W\b\u00172\u007fn\u0017HV6D)\u0017N_\u000f";
        objectArray[68] = "pW~\"!6%\u0016peMr#\u0017g\u001cwh)\twp1o%\u000f\u001b&+i+\u0000w`,e-l\"!#v1\u0013||v0N";
        objectArray[69] = "+&XuG*9?^sx=,\u0002_b\u0019'$YMj\u0001#0eJt\u0001.K";
        objectArray[70] = "o\u0015jfA}h\u000bjk:*f\u0001om['zgvi\u000b8{\by{V>\u0001^.jB>~\u0000s?\u0004A";
        objectArray[71] = "\b\u0012K[*I\u0006R\u0002R\u0012*Z_C\u001a*\u0006)O2VXE,I\u0001\u0017tI\bE9%T\u001d\u0011`3Qh3\u0012R\u0016/u*+\u0016\u0016RqK\u0001sHQ/0\u0010A\u000f+V\u0018TE\u001e\tK&\u000bN,)#\u0013*E4W`\r[E8\u0010@7-B9\bC?7|J\fv39S?\u0019hL\t\u0015!k\"\u0015\u0004\u0017\u0016Vv\u000e\tRs\rp\u0006\r\u0014HZ`\f\u0007.";
        objectArray[72] = "t 4,vAq\"0l\nEc<\u0001znWc@eumOb,#raI\u000e";
        objectArray[73] = "@$\u001dG\u001e\b\u0012l\u0017Mz\tF)\u000fR\u0016;\u0011eP\fz\u000e\u0015+^X\u0017\u0013Zj\u000b5\u0018\u001dG2\u0010H\u000bTV2o";
        objectArray[74] = "\u0001\"\"0%{\u0012k30Zc\u000e/.06QYbpiZk^:\".#`^)rW";
        objectArray[75] = "S\u00180H\u0007AS\u001c<KnD\u0007\u000f#_\u001fNfsjx\u001fnW\u0018\u000fF\u0017~\u0010\u00137B\u000b^\u001b\u007f\u001a]\u0007X\u0012i<C)Pojj@PqbI/r/FFhjdTq\u001b\\\f\u0012\nMEr*\u001a\f\u001fI\\>\u00182CQJjf>L\u0014\\\fp*lfJ#[\u0015\u001fMhir^~\u001ama\"\u0014ZB\u0012.\u001d\b]Y_Q[\u0003HGS#]\u0007MF#*@PE\u0011XlL\bJ+\u001fiY\u0017HONhF\u0005!";
        objectArray[76] = "<:M\u001ex nf\u0012\u0004F7x&/Y (`6C\u001f'$fZ\u0015\u0005!*i6S\u0002-,\u0005`I\u0004##i&N\b%O";
        objectArray[77] = "0Yo)Q-.O;#*-+S2/C!\u0012]2?GGu\t8:U8+Tm|*";
        objectArray[78] = "Kn?a\n}\fn9h3(\u0010m\u000bqX&w(vqZz\u0015x-'XFK/=aZ\"\u001a.\"s3";
        Object[] objectArray2 = objectArray;
        objectArray[79] = "q?\u0006\\s\u00056?\u0000UJW!*\u007f\u001f,Y(*\u0013Y+U.FF\u0018$F29\u0018Eq\u0000M";
    }

    public static Throwable a(Throwable throwable) {
        return throwable;
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(BiPredicate biPredicate) {
        m$$cr1cUwlXRwlij0FDPBwDumNZtQe5dZUYMwStzZlYNBu9dRJEQrtYU22mu3knmGhhSAobASlR6ckvjozWrz8lteaYivYVxYUry.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$5a10Pyz0UH2GGLRX6Wnp458NcpxcI5lJcauY9Fg9B4jfN3lSbyEUPgORcUzz3O02Or3MZuca18hKA0tXc2kZbIRBwdkuCDqyI, () -> {
            ArrayList arrayList = new ArrayList();
            this.m$$KmyS5nM1NrDSxKBJaTc6SC5c3PHmFppqdG85KQpOpTE6qrp4nGjQWY6OM1l24w5zihtHAnxf5nNn75qW4DgN4Mh5uUich8qDf.forEach((string, l) -> {
                try {
                    if (biPredicate.test(string, l)) {
                        arrayList.add(string);
                    }
                } catch (MatchException matchException) {
                    throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(matchException);
                }
            });
            for (String string2 : arrayList) {
                this.m$$KmyS5nM1NrDSxKBJaTc6SC5c3PHmFppqdG85KQpOpTE6qrp4nGjQWY6OM1l24w5zihtHAnxf5nNn75qW4DgN4Mh5uUich8qDf.remove(string2);
            }
        });
    }

    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$qDWCNwcPOHSNNyFhzEE62NH0CTlvD5qHHzxZLBAYIt1fo2VwQ0e367BmA79PmCmz3KtxD0EqmIahdRqT75CXEkeOFoSCGa5B0 m$$qDWCNwcPOHSNNyFhzEE62NH0CTlvD5qHHzxZLBAYIt1fo2VwQ0e367BmA79PmCmz3KtxD0EqmIahdRqT75CXEkeOFoSCGa5B0) {
        block4: {
            try {
                try {
                    if (m$$qDWCNwcPOHSNNyFhzEE62NH0CTlvD5qHHzxZLBAYIt1fo2VwQ0e367BmA79PmCmz3KtxD0EqmIahdRqT75CXEkeOFoSCGa5B0.m$$VQQSW9GbXlljQWBOHxDEKQlr52IbhtvvJ7by44tphw0XqecLDFQ0OIHJupuubwT52Vv5FNxkJpdf322ud01iuJLeX88yX3FOx() != m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$cLoz4UwY1GSOQzXYErRtEVYBhrEoLPlj4BbRpZV1TLY7qk3wQNZabEq1LQPwG2CSYkgd7XrSLVNpuykeq21bMvSkKk4Fe5RrY && m$$qDWCNwcPOHSNNyFhzEE62NH0CTlvD5qHHzxZLBAYIt1fo2VwQ0e367BmA79PmCmz3KtxD0EqmIahdRqT75CXEkeOFoSCGa5B0.m$$F334HMgZjQ75NzbL9Q4ntZlc896c0OGI4KWFL11em4FkR6es2oexG7mLFFb5Vojm8KhUbbWiKw1apvQjSCJYKFYhPUkLXb69z() != null) break block4;
                } catch (MatchException matchException) {
                    throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(matchException);
                }
                return;
            } catch (MatchException matchException) {
                throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(matchException);
            }
        }
        this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((T string, U l) -> m$$qDWCNwcPOHSNNyFhzEE62NH0CTlvD5qHHzxZLBAYIt1fo2VwQ0e367BmA79PmCmz3KtxD0EqmIahdRqT75CXEkeOFoSCGa5B0.m$$F334HMgZjQ75NzbL9Q4ntZlc896c0OGI4KWFL11em4FkR6es2oexG7mLFFb5Vojm8KhUbbWiKw1apvQjSCJYKFYhPUkLXb69z().contains((CharSequence)string));
    }

    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2 m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2) {
        this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((T string, U l) -> {
            try {
                if (l < System.currentTimeMillis()) {
                    return false;
                }
            } catch (MatchException matchException) {
                throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(matchException);
            }
            String string2 = "%s just vanished.".formatted(string);
            try {
                if (((Boolean)this.m$$EbvZPobuZ009SanpSI4SbvS9J9BPPgzyinZl6sZXyJGjt7q6GWgi18LaCoDmaN6To4UzpJvkzjRfEj7IpUn3TJUHBA3SZgSO4.getValue()).booleanValue()) {
                    m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)string2), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$c1YNZKIre9gha2PNXbjm2rL0bzZp8E5g5prysSUtCYmEx3s7kIMTKClUco1iXIJiAjIYkbL0q1wjtfH7ltIhAh8GLO8gPQEeU);
                }
            } catch (MatchException matchException) {
                throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(matchException);
            }
            return true;
        });
        m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687.method_18456().forEach(class_7422 -> class_7422.method_5648(false));
    }

    public /* synthetic */ void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(GameProfile gameProfile) {
        this.m$$KmyS5nM1NrDSxKBJaTc6SC5c3PHmFppqdG85KQpOpTE6qrp4nGjQWY6OM1l24w5zihtHAnxf5nNn75qW4DgN4Mh5uUich8qDf.remove(gameProfile.getName());
    }

    public static String m$$ykpUNc2bwm1GtvjJVXKvckiKl4Pa0AiarGilAehmEWIy6ZaqzRidezktpv3vYIJcYcIeLT4jLSEKMmZA7h9ISnPJCwdvzH12E(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{7, 33, 127, -21, 91, 9, 103, -21, -126, -31, -127, -95, -102, -35, -60, -41, 63, -117, -46, -18};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 20]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk) {
        Object object;
        Object object22;
        class_2703 class_27032;
        Object object3 = m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8();
        if (object3 instanceof class_2703) {
            class_27032 = (class_2703)object3;
            for (Object object22 : class_27032.method_46330()) {
                object = object22.comp_1107();
                try {
                    if (object == null) {
                        continue;
                    }
                } catch (Throwable throwable) {
                    throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(throwable);
                }
                m$$cr1cUwlXRwlij0FDPBwDumNZtQe5dZUYMwStzZlYNBu9dRJEQrtYU22mu3knmGhhSAobASlR6ckvjozWrz8lteaYivYVxYUry.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$5a10Pyz0UH2GGLRX6Wnp458NcpxcI5lJcauY9Fg9B4jfN3lSbyEUPgORcUzz3O02Or3MZuca18hKA0tXc2kZbIRBwdkuCDqyI, () -> this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((GameProfile)object));
            }
        }
        if ((object22 = m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8()) instanceof class_7828) {
            class_27032 = (class_7828)object22;
            try {
                object3 = object = class_27032.comp_1105();
                object22 = object3.iterator();
            } catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
            while (object22.hasNext()) {
                object = (UUID)object22.next();
                class_640 class_6402 = m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1562().method_2871((UUID)object);
                try {
                    if (class_6402 == null) {
                        continue;
                    }
                } catch (Throwable throwable) {
                    throw m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8.a(throwable);
                }
                String string = class_6402.method_2966().getName();
                m$$cr1cUwlXRwlij0FDPBwDumNZtQe5dZUYMwStzZlYNBu9dRJEQrtYU22mu3knmGhhSAobASlR6ckvjozWrz8lteaYivYVxYUry.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$5a10Pyz0UH2GGLRX6Wnp458NcpxcI5lJcauY9Fg9B4jfN3lSbyEUPgORcUzz3O02Or3MZuca18hKA0tXc2kZbIRBwdkuCDqyI, () -> this.m$$KmyS5nM1NrDSxKBJaTc6SC5c3PHmFppqdG85KQpOpTE6qrp4nGjQWY6OM1l24w5zihtHAnxf5nNn75qW4DgN4Mh5uUich8qDf.put(string, System.currentTimeMillis() + 5000L));
            }
        }
    }
}

