package me.mioclient;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.FixedRecvByteBufAllocator;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$PZOgFnIazptFkr7llGIJSpT7V9ijpTYbb0svlApk3Gdd5HW5qN4sU4Zvo7kFeRwjKAvpoWlUTKYm0SLCgmDDzDgjtrVQ98AhM;
import me.mioclient.m$$S0TWcnDKeYyIvPhPpNLFt35wIZtaD646BMTkvgR9EoPYVBxnLu6hchRWlAR5JtTxYa3r3CS0NPuntYFS1dOOkVzRrXQ3nBitx;
import me.mioclient.m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$tv0CpJeekzpkRW6hWEhoeqYhlyFiaOtfITJsYkNrwAVB6uMWB3rlNKU4enSjLlPCWyDDtoQYkRbpKDuuhh0xRXx5d11DWnXCg;
import me.mioclient.m$$wGubmqMqmrtXZWX0NqXKXPN0ncXxmsgTbriPsGXdpw1HT0JRzONAMJGZSxpBqYL56aBaZgfaZ79khy5ZrCiAMYxcbyvRyHc18;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ
extends ChannelInitializer {
    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    block14: {
                        m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.e = new Object[20];
                        m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.f = new String[20];
                        m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.a();
                        var8 = 7160904393242996074L;
                        var14_1 = new long[27];
                        var11_2 = 0;
                        var12_3 =  /* dynamic constant */ (String)m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou("DcFcrcb98lYXjD1Yz3Q8", MethodHandles.lookup(), "m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou", m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.class, 1837112832);
                        var13_4 = var12_3.length();
                        var10_5 = 0;
                        while (true) {
                            var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes( /* dynamic constant */ (String)m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou("IXlJvB9rGRzMmV9I0fVb", MethodHandles.lookup(), "m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou", m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.class, 2026363416));
                            v0 = var14_1;
                            v1 = var11_2++;
                            v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                            v3 = -1;
                            break block14;
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            var12_3 =  /* dynamic constant */ (String)m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou("bq4u71F3lBwoU3cYGKT3", MethodHandles.lookup(), "m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou", m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.class, 785978570);
                            var13_4 = var12_3.length();
                            var10_5 = 0;
                            while (true) {
                                var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes( /* dynamic constant */ (String)m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou("R5XW4HUlitJH81M7Fc69", MethodHandles.lookup(), "m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou", m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.class, 1818115150));
                                v0 = var14_1;
                                v1 = var11_2++;
                                v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                                v3 = 0;
                                break block14;
                                break;
                            }
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            break block15;
                            break;
                        }
                    }
                    v4 = v2 ^ var8;
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl41:
                        // 1 sources

                        ** continue;
                    }
                }
                m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.a = var14_1;
                m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.b = new Integer[27];
                m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 981162;
                var0_7 = 6680367342779678755L;
                var6_8 = new long[5];
                var3_9 = 0;
                var4_10 =  /* dynamic constant */ (String)m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou("j7CD6UbJZQs5xD9Krakn", MethodHandles.lookup(), "m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou", m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.class, 1064936149);
                var5_11 = var4_10.length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes( /* dynamic constant */ (String)m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou("wKVYUBQzMZIRoCLG1H3u", MethodHandles.lookup(), "m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou", m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.class, 295089723));
                    v5 = var6_8;
                    v6 = var3_9++;
                    v7 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v8 = -1;
                    break block16;
                    break;
                }
lbl59:
                // 1 sources

                while (true) {
                    v5[v6] = v9;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 =  /* dynamic constant */ (String)m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou("KAwgPGmkkO1uuOc9k0Gu", MethodHandles.lookup(), "m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou", m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.class, 187765029);
                    var5_11 = var4_10.length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes( /* dynamic constant */ (String)m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou("bOfkR09N4FGzL0MGvCGr", MethodHandles.lookup(), "m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou", m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.class, 2118214830));
                        v5 = var6_8;
                        v6 = var3_9++;
                        v7 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v8 = 0;
                        break block16;
                        break;
                    }
                    break;
                }
lbl72:
                // 1 sources

                while (true) {
                    v5[v6] = v9;
                    if (var2_12 < var5_11) ** continue;
                    break block17;
                    break;
                }
            }
            v9 = v7 ^ var0_7;
            switch (v8) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl83:
                // 1 sources

                ** continue;
            }
        }
        m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.c = var6_8;
        m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.d = new Long[5];
        m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)7349968231084143665L);
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x5C96) & Short.MAX_VALUE;
        if (d[n2] == null) {
            m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.d[n2] = c[n2] ^ l;
        }
        return d[n2];
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4582;
        if (b[n2] == null) {
            m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "+OUh2l6YUe?y,N\u001ejyk-C\u0010c#6\u0011O\u0018m2l\u0001H\u001ah9}.";
        objectArray[1] = "9-]h)U$;]e$@>,\u0016jbR?!\u0018c8\u000f\u0003-\u0010m)U\u0013*\u0012h\"D<\u0001\u001ch*H7";
        objectArray[2] = "\u001ba-v1y\u0006w-{<l\u001c`ftz_\u0017muZ-y\u0017Lv~\u0015a\u001ea`y b\u0000";
        objectArray[3] = "`~{*SY}h{'^Lg\u007f0(\u0018nap;*SAYx%!ZDgt";
        objectArray[4] = "=\r\u0013jsM\u00035\u000e|s@\u000e \u0014k8OH\u0002\u0012d3M\u0003-2d3G\n$\b>";
        objectArray[5] = "^O]I!IPF\u001aA&R\u001dGW\u0000)wfX\u001dl/w\u0007zFI\u001dH[B*C?TvX6~\u0001P{\u00137h!q\u0003x\u0001q!\u0015EaE^.p\u0000`#\u0016\nC\u0007yC~\u0000`\\}@a#jfc\u0017C\tga_\u0003\u0012\u001fNZd\u0002W\u001aiR\u0018\u0011P%rV\u0012\u000bU|W[\u001e\u0002l%";
        objectArray[6] = Long.TYPE;
        m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.f[6] = "java/lang/Long";
        objectArray[7] = Integer.TYPE;
        m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.f[7] = "java/lang/Integer";
        objectArray[8] = "8\b\u0000k_76\u0001GcX,{\u0000\n\"\u000e\u0013`(xlg\t\u0007+ObY\u000b\u0001_\u001cTu e\u0003yQw\u001a?\u0017\u0016DA(\u001a\u001fzsT!\u0002\"\u00191\u007f\u0016=Y\u001eRf\u0015:&c>li 7TeWamYl_Y\nm\u0003@KNi\"\u0000@U\u0006\u001a-=VP^\u0002\u0011_\\n\\\r\u001a\u0002\u0019IU";
        objectArray[9] = Boolean.TYPE;
        m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.f[9] = "java/lang/Boolean";
        objectArray[10] = Void.TYPE;
        m$$GDDEFcpScm7P0DeqGkwbujBkOgDrBvBm7lxdulYdrB7RZVGkzBxmQEisHbw8Dfn3dHd69lCP0c2uftaMMvNtpqtp2xlyS5kuJ.f[10] = "java/lang/Void";
        objectArray[11] = "@x\r~z\u0000NqJv}\u001b\u0003p\u00077T+iXepc<Np\u0014C#+Hldxd\rXwax\\\bioaeQ\u0002\u001aq[wf\u0003tyQQ$=wKdxi-UprVz\u001ce\u007fT+W\tC.G[wY\u0014q`C#\f\u001fhEgr\"`kmgc\u001eYm\u0011k\u007f\u0016~(HfY";
        objectArray[12] = "\u0010uA\u0000\u0002\u0007\u001bzPOc\t\u0010qT\u0015";
        objectArray[13] = "\t\u007f{O&\u001e\u000efv>#G\u000erzQH\u0019T$\u007fP,\u001e\u0010dz>";
        objectArray[14] = "\u0006S$\u001e\u0011\u0011\u0001\u0017d\u001b\u007f\u000eR\u0013F\u0017\u0014\u000bu\u001e`\u00175\bQ&x\u001e\u0018\u001eV\u0013{\u0000\u007fLRVw\u0013\u0015IE\u000f~zFI\u0007\u000br\u001eA\rG\u000e\u001c";
        objectArray[15] = "\u000fB\u000e\rsT\u000eIS\u0013O[YTs\u00194N5\u0002IJqKHH\n\u0000*2\u000fB\u000e\rsT\u000eIS\u0013O";
        objectArray[16] = "Q\u0011\u000fg\u00173\u0018\u0013\u00103qP[\u0003Z}I|(\u0013+1;?-\u0015\u0018p\u00173\t\u0019 B7g\u0010<*6\u000bI\u0013\u000e\u000fH\u0016P*J\u000f5\u00121\u0000/Q6LJ\u0011\u001d\u0016L5bU\u0019\u0007n(\\\n\u00125N@i+\u0019-0\u0003wZ\u0019!w#M,\u001e o E6 Sk\u0015I8\u000f&~\u000b6\bI8\fMh\u001a\u000fS2\rq\u0006\u0019j1\u0010\u007f\fC\u0001l\u000fm\u0000r";
        objectArray[17] = "\u0006RW \b\u0001\t\\Nwr\u001d\u001aOGg\u0003\u0017{3\u000e@\u00037JXk~\u000b'\rSSz\u0017\u0007\u0006?~e\u001b\u0001\u000f)X{5\tr*\u000exL(\u007f\tKJ3\u001f[(\u000e\\H(\u0006\u001ch*\u0016\u0014X2N\"\u0010FT\u001cZ .\u001aL\n\u000e^\"\u0015\t\u001chH65{\nGc\tFP(\rJB'\u0007-\u0005\u001a\u0013\u001bV\u0012[$\u0014\u0002[c\nt\u0011IL\u0001L%\t\u00036";
        objectArray[18] = "\u001cGB;%\u0010\u001b^OJ3O\u0005IF+-C}\u001eXs6\u0012\u001b\u001fS.(.";
        Object[] objectArray2 = objectArray;
        objectArray[19] = "&|Rjz|teP|\u0001c7.GX0jzpMK;\u007f}XPo1Ac`LRLFz=\u007fI:yuH\u001az@wrNFL\u007ffz2Lkp?y9AZ<F@X{RKK\\HOyn^]mfI\u007fye<LM^FbCGT{YThg*xOIM[tlAqg`\u0013?m\u007f=[i:y~z\".`w}3Is\u007feq\u0002\u001d}b7a`[,z}\u001b";
    }

    public /* synthetic */ void initChannel(Channel channel) {
        this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((SocketChannel)channel);
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(SocketChannel socketChannel) {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        socketChannel.config().setRecvByteBufAllocator((RecvByteBufAllocator)new FixedRecvByteBufAllocator(65536));
        channelPipeline.addLast(new ChannelHandler[]{new LengthFieldBasedFrameDecoder(65536, 0, 4, 0, 4)});
        channelPipeline.addLast(new ChannelHandler[]{new LengthFieldPrepender(4)});
        channelPipeline.addLast(new ChannelHandler[]{new m$$S0TWcnDKeYyIvPhPpNLFt35wIZtaD646BMTkvgR9EoPYVBxnLu6hchRWlAR5JtTxYa3r3CS0NPuntYFS1dOOkVzRrXQ3nBitx()});
        channelPipeline.addLast(new ChannelHandler[]{new m$$PZOgFnIazptFkr7llGIJSpT7V9ijpTYbb0svlApk3Gdd5HW5qN4sU4Zvo7kFeRwjKAvpoWlUTKYm0SLCgmDDzDgjtrVQ98AhM(), new m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N()});
        channelPipeline.addLast(new ChannelHandler[]{new m$$wGubmqMqmrtXZWX0NqXKXPN0ncXxmsgTbriPsGXdpw1HT0JRzONAMJGZSxpBqYL56aBaZgfaZ79khy5ZrCiAMYxcbyvRyHc18()});
        channelPipeline.addLast(new ChannelHandler[]{new m$$tv0CpJeekzpkRW6hWEhoeqYhlyFiaOtfITJsYkNrwAVB6uMWB3rlNKU4enSjLlPCWyDDtoQYkRbpKDuuhh0xRXx5d11DWnXCg()});
    }

    public static String m$$nGZVza4GNIpPvBlefDY5ZWwSmfZGHccKVFgLwEunEqT6x30KPzhNTJ7mr2fp5ZneJK6Qhb024SmCCdCYo3X35K5tFG1XD6Aou(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{92, -25, -113, -84, -102, -51, 82, -75, -34, -18};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 10]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM.m$$mC9dizgP2qnRzt8OpjfIEHi7UR3wfB0aIyaDlWvhi8fpy1j3kA5HSRQIBEOBebgPNgLRvwv6fVWHqImOrWGbM1qAZGqoeObmJ(true, 402403663);
    }
}

