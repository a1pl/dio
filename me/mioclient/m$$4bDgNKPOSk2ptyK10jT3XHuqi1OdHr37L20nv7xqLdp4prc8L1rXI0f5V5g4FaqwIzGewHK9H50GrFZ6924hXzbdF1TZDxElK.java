package me.mioclient;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import me.mioclient.m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$7asR1m6msy4qQ8giUQRI0c3QXEtnOWwZKmmsr7wSAfbWgaqWaCsxFxVeK9qeZV7eQNtgorblQKOvkRA51a5EgMlPYM8jR8qJS;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2;
import me.mioclient.m$$Siqxdw60dnxHxOD8uuwYiX8PVK89Zxq606yoos2T2hm2o8ThAcHt6SwQbcU63ih2Pt3VG9BWl8FAWK96c3J8pfnMWQwW1wzAb;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$XzrXBqKQqN2Jn0GNFcniHao8p0sbRlcWsU1p4AVPJBMJwQgpgIRINokrwRnEPCrC2tvlIWnSSJ7MI9P55R8rWrHJbi7ijnqSz;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ;
import me.mioclient.m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import me.mioclient.m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62;
import net.minecraft.class_124;
import net.minecraft.class_151;
import net.minecraft.class_2596;
import net.minecraft.class_2670;
import net.minecraft.class_2708;
import net.minecraft.class_2720;
import net.minecraft.class_2729;
import net.minecraft.class_2827;
import net.minecraft.class_2856;
import net.minecraft.class_2859;
import net.minecraft.class_2960;
import net.minecraft.class_6373;
import net.minecraft.class_6374;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK
extends m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM {
    public static final m$$7asR1m6msy4qQ8giUQRI0c3QXEtnOWwZKmmsr7wSAfbWgaqWaCsxFxVeK9qeZV7eQNtgorblQKOvkRA51a5EgMlPYM8jR8qJS entitycontrol;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$JgHxlKUyKpBZww9UkovtfxyM9QYpv0xvyZAJN4MTpJUPLriXLaqWiGrcHJqV2AaavVMSXQk6IWqeLumJtR0uq3LA5MgzoanPY;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$VN8ij0MZfa4VJFc4Co8zpiycK6VibTuW8wKOzhUVojpwjYmNPCaWi4LFHW7xgQjsZwrPamCMCopUcJpld3jK1Z9eiv5IfLkoN;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$m6afN5vCZhFLuzFjJ2D2Y6QtWoU7l3gDkT5A6Fpc1eJdhDVHjtU3cJbHV2qof6ePtw9uy9fdXhF21MZ3Xc4uqafHsbNrfSoCQ;
    public static final class_2960[] m$$0S8nUkr7lZaVZw2A9VONEfscFcpjlppBvyGvFM9A8ZuW53NITaofCGdmGjx4Yu01aF74aWWJS7sXGCdU8JYALlA3QwzSW3fKb;
    public final AtomicInteger m$$o7KhjXG8xxPsFOvjGa9NdOGlRINzPvy65PSSPrRE9u2JwIfDCdHsYsmvNH2hV0hwcmvSVz6G5BpBoAm5wxJviJdvsUydpMXa7;
    public m$$XzrXBqKQqN2Jn0GNFcniHao8p0sbRlcWsU1p4AVPJBMJwQgpgIRINokrwRnEPCrC2tvlIWnSSJ7MI9P55R8rWrHJbi7ijnqSz m$$boSDDsnld9fpfI2CRgKHgbDs8IDUChFQx4u41dIxUQqbHFB7q7U49ZQqHgtfyR92qixZIWZtzmz4QKTOg7Px7NCDSmsciXVvN;
    public int m$$bo6pWsywVkSWANkV45fJEIkNFDa2psGZU9s31SAK1YcpFuY4xDNWLthlVO4qXtC91oWHwFl3kD5txGQAflmQbCntt1CjmNxiB;
    public int m$$G1CsPMqm7ApUki6LIBOR03o1UlR3ROHIhoyfpukLpkg6oBp5QaQ9YN0DvVXic9AVn4WYbHQ3whq59TzSQDAMPKaTHDKIXpwqP;
    public long m$$QEsSRz71CJU4SaYqM3lQBYB59Rk0TgVLDEoYkg2EbQt3BtasbJGIpOXT48lelIy18aQuPQ5FykXP1anRuc7AL2A6Qp3aqGccT;
    public boolean m$$4plkXH9wxWJDEtobnQ2FdD6yWd7882h4InqwOcVZnQhkg9O0YoQmLJZnwQsREe67a5G1WT9yLl50lY3uJiD5Uh07N5GkbgX3x;

    public m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK() {
        super("FastLatency", new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)String.valueOf(class_124.field_1054)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("Resolves your ping faster than the vanilla minecraft method.\n\u0001The FastResponse setting may cause packet kicks."), m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ.m$$ZaD3M0jv7OKLL5o46rdCtPy8hIHUWkQwHiymBJrAs8Rx7AkYyizdJsbYM7bheQ2XDJQqqsI7QTERMWze3ESAiWCzZZRMyzfVV, new String[0]);
        m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.Xx3bJrDrRb9yiyRyGdbDeP54LarzgFWfCZfTLoRwpO8Unt9v2uefnlVtxpsFnGNmh763TSApbXpcY9ELTWzI4uurJwUuJUC6zT1l(this);
        this.m$$o7KhjXG8xxPsFOvjGa9NdOGlRINzPvy65PSSPrRE9u2JwIfDCdHsYsmvNH2hV0hwcmvSVz6G5BpBoAm5wxJviJdvsUydpMXa7 = new AtomicInteger();
        this.m$$boSDDsnld9fpfI2CRgKHgbDs8IDUChFQx4u41dIxUQqbHFB7q7U49ZQqHgtfyR92qixZIWZtzmz4QKTOg7Px7NCDSmsciXVvN = new m$$XzrXBqKQqN2Jn0GNFcniHao8p0sbRlcWsU1p4AVPJBMJwQgpgIRINokrwRnEPCrC2tvlIWnSSJ7MI9P55R8rWrHJbi7ijnqSz();
        this.m$$bo6pWsywVkSWANkV45fJEIkNFDa2psGZU9s31SAK1YcpFuY4xDNWLthlVO4qXtC91oWHwFl3kD5txGQAflmQbCntt1CjmNxiB = 0;
        this.m$$G1CsPMqm7ApUki6LIBOR03o1UlR3ROHIhoyfpukLpkg6oBp5QaQ9YN0DvVXic9AVn4WYbHQ3whq59TzSQDAMPKaTHDKIXpwqP = 0;
        this.m$$QEsSRz71CJU4SaYqM3lQBYB59Rk0TgVLDEoYkg2EbQt3BtasbJGIpOXT48lelIy18aQuPQ5FykXP1anRuc7AL2A6Qp3aqGccT = 0L;
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
                                m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m = new Object[77];
                                m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.n = new String[77];
                                m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.f();
                                var21 = new String[7];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA("5ywJkkTi3lW7sT1ZQX19", MethodHandles.lookup(), "m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA", m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.class, 2076633615);
                                var20_3 = var18_2.length();
                                var17_4 = 24;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 106;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA("Z3Me4tXE5XLe4RxkVco0", MethodHandles.lookup(), "m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA", m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.class, 867957401);
                                    var20_3 = var18_2.length();
                                    var17_4 = 24;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 57;
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
                                            v15 = 4;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 62;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 55;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 42;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 47;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 105;
                                            break;
                                        }
                                        default: {
                                            v15 = 28;
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
                        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.e = var21;
                        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.f = new String[7];
                        var8_7 = 8054591626738528051L;
                        var14_8 = new long[36];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA("4lI5hp7xBBQwW0pSt3ny", MethodHandles.lookup(), "m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA", m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.class, 940498245);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA("aCJJTzX4HKmUCOoF5KIN", MethodHandles.lookup(), "m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA", m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.class, 1945921674));
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
                            var12_10 =  /* dynamic constant */ (String)m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA("jRciXSaRMq9hcSc76HFg", MethodHandles.lookup(), "m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA", m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.class, 649642099);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA("MSgBV6VO8cxC49XRN7W4", MethodHandles.lookup(), "m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA", m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.class, 862987793));
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
                m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.g = var14_8;
                m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.h = new Integer[36];
                m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 58147;
                var0_14 = 8659794704235209232L;
                var6_15 = new long[6];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA("pM0L9hynTJfhjY4rUFPW", MethodHandles.lookup(), "m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA", m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.class, 358021582);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA("R6JHtk4o0du8OAfIOciN", MethodHandles.lookup(), "m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA", m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.class, 72708124));
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
                    var4_17 =  /* dynamic constant */ (String)m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA("t5sY5G0m2kJGqs7oRFJh", MethodHandles.lookup(), "m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA", m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.class, 1388021035);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA("MFKt3zMSSkhKUBIZsRx5", MethodHandles.lookup(), "m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA", m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.class, 1202867777));
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
        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.i = var6_15;
        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.j = new Long[6];
        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)8784859076960740018L);
        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.entitycontrol = (m$$7asR1m6msy4qQ8giUQRI0c3QXEtnOWwZKmmsr7wSAfbWgaqWaCsxFxVeK9qeZV7eQNtgorblQKOvkRA51a5EgMlPYM8jR8qJS)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$7asR1m6msy4qQ8giUQRI0c3QXEtnOWwZKmmsr7wSAfbWgaqWaCsxFxVeK9qeZV7eQNtgorblQKOvkRA51a5EgMlPYM8jR8qJS.class);
        v27 = new class_2960[m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.b(21894, 3606698563531456085L) - 52509 + 24570 ^ m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01];
        v27[0] = class_2960.method_60654((String)"minecraft:adventure/root");
        v27[1] = class_2960.method_60654((String)"minecraft:husbandry/root");
        v27[2] = class_2960.method_60654((String)"minecraft:nether/root");
        v27[3] = class_2960.method_60654((String)"minecraft:end/root");
        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$0S8nUkr7lZaVZw2A9VONEfscFcpjlppBvyGvFM9A8ZuW53NITaofCGdmGjx4Yu01aF74aWWJS7sXGCdU8JYALlA3QwzSW3fKb = v27;
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6BDB;
        if (h[n2] == null) {
            m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.h[n2] = (int)(g[n2] ^ l);
        }
        return h[n2];
    }

    public static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x718F) & Short.MAX_VALUE;
        if (j[n2] == null) {
            m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.j[n2] = i[n2] ^ l;
        }
        return j[n2];
    }

    public static void f() {
        Object[] objectArray = m;
        m[0] = "Jr3n\u0012\bD{tf\u0015\u0013\tz9'#\u001dUO_r06VY/I\u0015W`Y[`\u0015\u000eovr;\u000bWTuOo\u00180TB,sO&qGWA6-PFzs\u001c.u^Sl\u0010\u0015PEsF+$UT/w\r\u000bn@sP(-\u0010ZT:+R\u0012E%q,\u0015o]\u007fjL\u000eMylP\u0001";
        objectArray[1] = Integer.TYPE;
        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.n[1] = "java/lang/Integer";
        objectArray[2] = Void.TYPE;
        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.n[2] = "java/lang/Void";
        objectArray[3] = "#u;3{h-||;|s`}1z&e\nw[\u0015BH\u001d{'.f~\u0005!%4F4\u0016X`/{6\u0001t],!0\u0002\"%0d06aY:b3>bvf^6<H\\nt2\u0018%rjTf?g\\$Ub9X^gZ2~Wg\u0018H1w\"!6J},tSoF]\nhP2Y";
        objectArray[4] = Long.TYPE;
        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.n[4] = "java/lang/Long";
        objectArray[5] = "\u0004\u0017A*\u0010\u0011\u000f\u0018Pem\t\u001c\u001fY,";
        objectArray[6] = "xL\u007f6t\bsCny\b\u0011|Ch56\u0001";
        objectArray[7] = "EM%kD~[E?$\tdAO&x\u0018nAX}k\u001edBE0$+\u007f@A:i#e[I4o\u0018";
        objectArray[8] = "l$o,\u0012|b-($\u0015g/,ee\u0016tkv-\u000e<yc/\u0011*\u001cVL #\u0000\u001e\u007fI5\u0010\t\u0013\u007fO\u0012\n,OaCv$1+|f+\u0007'\u0016{b\u0005\u00120NWn)w\u0017(*9\u0005/\u0012Cyv\u00154v\u001d\"8p\u0005.2'tw3%\u0013`r909/ut\u0003\u000f0#jH\"(\u0007N";
        objectArray[9] = "|i\u001bie|wf\n&\u0004r|m\u000e|";
        objectArray[10] = "?(P?X\u00134'Ap4\u0010:%C?\u0018";
        objectArray[11] = Boolean.TYPE;
        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.n[11] = "java/lang/Boolean";
        objectArray[12] = "\u0007hD\u000b\u000b\u0013\ta\u0003\u0003\f\bD`NB1\u0015\u001bu\u000e\u0011TL\u000ec\u0012.\u001a3.5\u001f\u0013\u0015%\u0003UR647R40\u001e\u0013JZ;\u0013\t\r\u000fXYX\u000e\u000fN\u00055>\u000e#\u001f\"y\\5\u0015-\bn?PQ\u0015\u0002?:\u0012Q*-4(1\u000eD,L=-[J\t> ^\u0012\u001a\u0004@=7\u0015+[z\u0010'\u0000";
        objectArray[13] = "\u0007.#K}{\u0007.4\u0017qt\u001de4\tqa\u001a\u0014eP)$";
        objectArray[14] = "sfo[G\u0012}o(S@\t0ne\u0012C1Ww\u0017_\u001a1}Y\u0016p\u001b0GMu\\\u0018\u001c[t\u0002\u0006iJVH6b{\u000b|i#\u000ff1\u007fbuNX\u0017JNx@y*He\u0002\u0000`\u000e{K1Wg\u0018[G\r`\u001e\t'T\u001be^EGA\u0010DcN&q\u000fyo+ju\tr\u001c4\\v(rv";
        objectArray[15] = "FN5\rJ!FN\"QF.\\\u0005\"OF;[ts\u0014\u0015x";
        objectArray[16] = "\u0013\u0014{fxz\r\u001ca)\u0003Z01";
        objectArray[17] = "n\u001eo<'(e\u0011~sZ=w\u000b|0";
        objectArray[18] = "LCI]U0BJ\u000eUR+\u000fKC\u0014V\u000bG_7\u0003~\u0012`v\u0004\\n6cq\u001dEl5gp+a\u000bkK\\!^r'OS\u0001Hh\bK\u0012\u0000}v.{\u001eSxn\twh>ft\u000bHo\u001d~N9\u0010N(QO*BO\u0010GqhfpPup>JWUZs\u001aTB%Ve\u0014Mg(^z";
        objectArray[19] = "Q\\\u001cX%J_U[P\"Q\u0012T\u0016\u0011\u0001Hsnkf\u0003c{CV\u0002\u0001ckS\u0003v\u0002\u0011^HvyuF\bL\u0000[\riYZX\r+C\u000fI\u0005q\u000bUOOCZ&TZo{o\u001bD[[\u0007S\u0002\u0010iWh\u007f+tesBP.HL\u0001k[/_Qzvb\u001b\\DwHZ$j\u0004o`^*";
        objectArray[20] = "V\u00147\u000ezpV\u0014 Rv\u007fL_ LvjK.u\u0013 *";
        objectArray[21] = "en\u001bE\f\u0001kg\\M\u000b\u001a&f\u0011\f\u0004?]y[`\u0002?<[\u0000E0\u0000`clO\u0012\u001cMypr,\u0018@2qd\f98YG}\f]~@\u0003R\u00038;Ae\u001a'\u000b<X\u0005r-(g\\\u0006m\u000e\"]BQO$/Z~E\u001e2\u0006aED[7!i9W\\\b:m3MYQ\u001f`?D`\b";
        objectArray[22] = "m\u0016JW\u001d+m\u0016]\u000b\u0011$w]]\u0015\u00111p,\rH@";
        objectArray[23] = "aP&&\tjnE~\u000eIa\u007fp4#UaxB";
        objectArray[24] = "<\u001douGd<\u001dx)Kk&Vx7K~!')n\u00198";
        objectArray[25] = "UM\u001e\u0014P'ZXF&\u0011*TI\u001c4\u001a-MI\u001b\u0006";
        objectArray[26] = "-5\u001a>wK-5\rb{D7~\r|{Q0\u000fX#.";
        objectArray[27] = "n!H/\r\u000ba4\u0010\u0007M\u0000p\u0013Q-H\u0000p\u0001Z*Q\u0000w3";
        objectArray[28] = "i\ta>u\rf\u001c9\f4\u0000h\rc";
        objectArray[29] = "\u000b\"@\u0002<B\u000em\u007f\rb^\u0015\u0010B\u0011wJ\f";
        objectArray[30] = "\u0011iY\u0016ZY\u0011iNJVV\u000b\"NTVC\fS\u001f\u000e\u0000\u0000";
        objectArray[31] = " ~d\u0005\u0001M ~sY\rB:5sG\rW=D\"\u0012Z\u0014";
        objectArray[32] = "\u000b\u0000h9\u0004\u001f\u000b\u0000\u007fe\b\u0010\u0011K\u007f{\b\u0005\u0016:*#[";
        objectArray[33] = Double.TYPE;
        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.n[33] = "java/lang/Double";
        objectArray[34] = "\u001b{n\n\ba\u0005stEE{\u001fym\u0019Tq\u001fn6?Oy\u0014Ov\u0002R";
        objectArray[35] = "{\u0006=^ULp\t,\u0011=L~\u0006?";
        objectArray[36] = Float.TYPE;
        m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.n[36] = "java/lang/Float";
        objectArray[37] = "\u0019:\u001ctIR\u00173[|NIZ2\u0016=rH\u00032eQvo=+DaMp\u0015\u001b\u007f!IZ&iA]b\u000f>\u0019CQn~\u001b\u0006\u0007`\u0011s\u0006\f[Isn,\u001c|_Q\f\u000e\u0010@ \u0016e8-Hn\u0013X9\u0010_]\u0010\u000e\u00057zp\u0019\r\u000e\u0005[rpQ\u0000\ts\u007fA\u007f1%bkJN:1y!\u0012";
        objectArray[38] = "cx\u000e7\u0002l}p\u0014xOvgz\r$^|gmV\u0013T|jl\f9^Jlk\u000e?O|";
        objectArray[39] = "5TN\nu\u0017+\\TE8\r1VM\u0019)\u00071A\u0016-.\u0016*G]";
        objectArray[40] = "d\u0017\u0010\u0003\u0003\u0001k\u0016QTo\u0001xX<\u000bP>.N\u0006]\r>?\u0011<zQ=4,\u0013c\u0014\u0000\u00042&}\u0012\n+\b$R &\u001bD=a\u0004\u0004\u0015:3Z0\u00140O\u0001v\u000f#n%3I\u0014-/2(m.\r\u000e?\bU\u00105\u000b\t\u0000u>\u000b\u000b\u0018_N\"\u0019kJ'_\u0012$36-L$\u0000n4\u00023^\u00074\u001f\u0019P\u0014\t2DaL\u0006\u001ceD\u0006C\u001dZTM\u0006L\u0004\u000b-\u001e\u0000\u000e\u0015d";
        objectArray[41] = "\u007f7N\u001f\u0000\f\u007f{Z~\u000b\u0018cdC~\u000e\u001c`8\u000f\u0019\u0001\u0007&\t\u0006\u0019\u000e\u001ewpU\u001fL\u000f\u0018";
        objectArray[42] = "B\u0013\bE-\u0019^Q\u001fLPBC\u001d\u0004Y<p\u0015_U\u0003h'Q\b\u001c\u000f`@^\u0013Z>";
        objectArray[43] = "EU5s;%\u0017^13U}FH;/9O\u0012\tgrU(\u0015V1!:\u007f\u0012S*H";
        objectArray[44] = "\u001b\u0003Y\u007f/j\u001a\u0010\u001cwDqZ\f'?#tL\u0005^l%6]j";
        objectArray[45] = "@Ewof\u0007\u001eI~,ZX\u0011H\u001ak3OM\u0004}d(\t|";
        objectArray[46] = "(@h\u0017BjvLaT~;rZ\u007f\u0001\u001b7rML\n\u0012\u0015yM\u0005\u0013\u0017\"%\u0001b\u001c\fd\u0014";
        objectArray[47] = "\n\r\u0016:?\u0017\nA\u0002[+BAA\u001a*!#=\b=*\u0001\u0012Vm\u0003\"\u0011U]U\u0007>1^1x\u001827W'^\u0006\u001c?*$\b\u0005e\u001e'\u0007M7\u001a)\u0003&\b!a\u001e^\u0012nW?\"\u0000<H_9p\f\u0012\\]\u0007,\u0014\u0004\b#\u000b#Q\u0012n5\u001f\u0003#\u0004A\u001e p\b&\u000b7k\u0011_#\u0003g=$W\u0006_W66\u0014\u001d3\u0000g(\u0015\u001dRV!tRm\u0003Y9$\u0007\u0002T^<?n";
        objectArray[48] = "u[\u0011^d+'P\u0015\u001e\n{kW\u0014\u0018v{\u001b\u0006\u0016\u001bs}z\u0007\u0005^{\u0016\"]\u0000\u000eeoq[B\u001f\n";
        objectArray[49] = "5%\r\u00033-#\u007fIZB/;'N5x}ar6\b(z5<O\u001a\"(mB";
        objectArray[50] = "\u0018kYK_i\u00118\u0007\u001en4\u0015*V\u0014\u0002\u0006An\tNSQ\u00184Z\u001f\u0016>F$L\u0018n";
        objectArray[51] = "m{\f\u0002h\u0006?9MW\u001a7p2\u0016~`+zS\u0016\rk\u0006qS\rsv\rLd$\u0001&#is\u000eST8nB.RF#gS\u0003D]W]o\u0000\rd]}d\u0012Z~9|y\u0004GT\u0001OO\u0019\\%Y;U'ub\rPq\u0017m+*DU#N[[}t\u0006~e:}K!w$\u0015\\0\u0018<$\u000eqh\u001d@c\u0007nn|\u0005}\u0018kf\u0005V{Zz\t";
        objectArray[52] = "n\n?2Wxw\u000b8`+xm\u00115su\u007fm\u000b1\u000fSrj\u0017c~Mfd\u001b\\";
        objectArray[53] = "0\u0010Q6N\u001c,\f\u001e>6@p]\u001c GJ\u0011!U\u0007Gj J09OzgA\b=SZl-%\"_\\e;\u0003<qT\u00188U?\bu\u0015\u001b\u0010\rwB1:U\u001b\ful\u000e3mRI2 \u0015eT\u001b>\u000e\u0001gjG&\u0018U\u0019fHc\u000e3\u000frh\u0011\u0018\u001c$M\u001b::V\r\u0006zm?^]\nL\"\b\u0005<\u000b_g\u0000n\"_]mA\t-D\u001b\\H\t\"]J%\u001b\u000f`L%";
        objectArray[54] = "\u000eb4\tHh\f-)Xy7[s&\u0000\"\u001e;$*\u0003\u0015c\u0019'\"&C\u0019-0\u000f'\u00168;$|&5\u000f<?\u0002>\tn\ncu\u000b8\"*\u00065\r9\u001c=`5X$nF\r\u0015\u001e9=\u000b1==Hh\u000e><58\r%#>\u0002\u000bn.\u001c\u0010 \u0016m//s!2\u001e,:7\f\u0018\u0002)!\ngIl\u00155%\b\u001ek\u0010.L";
        objectArray[55] = "1 \u0011{QRjo\r-3R>,,wK@/\u000b\u0011k^T6P\u000e}\nDh0Ua_\u0005S";
        objectArray[56] = "z=J:\u0017\u007f\"lV:y lp\u001b)\u0007\u001b;\u0012V=\u0018++!\u0014\u001f8\n\u001ad\u001c\u000e\u0013%~b\u0019\b\u00067/7G.\u0015$\u000f'~?;\f<\u0019j?>|\u00195Z\bE5$\u001dh=>,/bJ7#'\n\f]\n<\u0005).]\u0007\b\u000b#3])\u001du'9j\u0015H#\u0007e\u0018\u0013G\u0006\u0003%\u0019V\u0006,8m\u00141\t7~\\\u001f9\u001c!|3]$\u00035@";
        objectArray[57] = "\t1AY\u0004WR~]\u000ffS\u000f&F^f\u0001\f>V\\\u001fR\n|G3";
        objectArray[58] = "\u00032\u0010*it^e\u00151\u0006(\n(\u0019&j\u001aYlG|:M\\0\t9:)\u00056\u0016+\u0006)\u0001=\u0012.?tV8\tA";
        objectArray[59] = "[\u0001~&G\u0016@U5k5\u0014W\u0010$pY&\u0006Q{,\tq_\u000fuf\b\u0012T\u001d*o5";
        objectArray[60] = "eko\u0001fix~xC\u001fhgs^Vd{CcrKr|q\u000f%Uo\u007f6k|Spm\n";
        objectArray[61] = "^Ov\u000bgQ\u0000C\u007fH[\r\u000fUa\u001d>\f\u0004BR\u00167.\u000fB\u001b\u000f2\u0019S\u000e|\u0000)_b";
        objectArray[62] = "\u0011\u0004\u0019XsM\u001cPI\u0010\u001aM\u0007CZ\f|Z&XE\f_G\u001e]A\u001a\u001a\u001d\u0015\\D]u_\bCPa";
        objectArray[63] = "\u001f\u0015n\u0000$\u0018J\u0011j\u001eV\rXAZZ\u0012+\u001d\t,\u0010\t\n- v]\u000f%\u0014<*Y=X5?K\rf\"57c.?*\u001e7l\u001c*\u001a7+T\u0010\u0007Q&\u0001b\u00104\u0012\u0013\u0013\"\t2.E<^2l\n85C#$T4\u0006O9+Q9\u0004-0(/6\u0002W\u001e7\n\u001e#r#f4\u0017##bg\u000b\u0014\u0006k\u0001-\u0005\u0012]\u0013";
        objectArray[64] = "\u001fn]}tZMgX(\u0004M\u00020\u0006\tF\u0019\u001fS$\f9Nc$!3Kbbc\u0001$5vDW\u001d\u0001Tg\u007fX9\u0004jzb-\t%_Pd`\u001ex4MJD\u0007\u001d=lSN/,zb\u0015f\b#CRj%R\u007f\\Y\u0010EZ+m\u0013kc;\u0013EKHw\t.8Mh'\u0018(Oy\u0016@\bB=OQw\r;nI\u0013fb";
        objectArray[65] = "ZH3D*\u0005\u0002\u0019/DDZL\u0005>y>\u0002\u0003Q\u0007xyE\u001cYaZ\u0004\u0004-TeM;}\u0019B\u0002e\u0016ZXM\u0010s\u0006}\u0002\u0013\u0019Ly_\"J\u0006\u0018\u001c]\nJ6Z\u0001R\u0011Q!L6|Zu\u001fA\u0000x\u0001taY.@[C\u0002r\u000fX!K\u0014\u00168~XE<k\u0004\u0000\r\u0017\u0013N\u001e\u0002\u001fs\u0014(xV\u001eP6IyE[X]W-GQ\u0019:X6\u0001`\u0010:W/P\u0019C<\u0015>?";
        objectArray[66] = "qrm\u0010s\u0003j&&]\u0001\u0001}c7Fm3,/m\u0010?dp\"8\u00190\\yqfL\u0001";
        objectArray[67] = "9\u0004Sv)\t:F\u0005.\u0018\u00006A ~t\u00156F\u0012\u0012w\u000b*\r\u0010|j\u001e=Oi";
        objectArray[68] = "\u0016kH\u0001S[\u0010~B\u001c9^\u0018gA\u0002UlL\"\u001c\\\u0006;NtD\u0001\u0005T\fi[\u00159";
        objectArray[69] = "\u0015(w=<E\u001a)6jPE\tgtp!Oh\u001b=W!oYpXi)\u007f\u001e{`m5_\u0015\u0017Mr9Y\u001c\u0001kl\u0017Qa\u0002=onpl!x]\u0011GH\u0000=Kjp\u00154[=4LK\u001a}52\u001eG4i7\fB_\"=I\u0000M\u001a4[_\u0014mh\"tt+\u001eC\u0000>]`\u007f\u0014\u00056\raCE ~n+MC{\u000647_N$\u007fg1\u001d_K";
        objectArray[70] = "b/\u0003\u001b\u0018&>n\u000e\u001cx01n:\u0018\u001c\"1\u0012Z\u0018\t>=n\u001d\u0011\u00168\\";
        objectArray[71] = "\bnDE\"\u0017Z,\u0005\u0010P(Tm\u0004\nh\u0004'}uF\u001aG\"{F\u00076K\u0006w~5\u0016\u001f\u001fRtA*1\u001c`Q?7(%$QB3I\u000fA\u000fAm2\u001esH;\u0014\u001aZwY\u0019\t$\u0005|k9a\u0011$wsG\"\u000fUw\u007f\u0000\u00025#p~\u0018\u0001=9N\r\u001c417ax\t*N\u0007'f{k\u0019\u0000x\b\u0014)\u0004\u001fl4\u00049\u000eT,S\u000b\"He";
        objectArray[72] = "\u000b~\u0015IPf\u000e~\u001cJ?z\u000fz\u0014QC\u0001Ny\u000fIT`OjJA?{\u001ft\u000fS\\g\nq\u00160";
        objectArray[73] = ";mvW=\\bkiE\u0001Fim{BFV\u0000voW0\bgyt\u0011\u0001\u0003dy~\u0013eZbfl/";
        objectArray[74] = "]'5!\u0004R^ecy5[RbW\"OH?af=\u0004\u0004Xn}{5";
        objectArray[75] = "@UK,!\u0011\u0018\u0004W,ONV\u0018\u0015\u000bt@\u0004hO\u001e.pFd|\r(D zC\u0007su\u0016U^<#e;Qe\r\tZJ\u007fG\u001f\u000eu(PFq1q+s\u001d\u0012\u0016R@\rI\u0012vN\u001d\u007fU\u00070N%\b\u0015=\u0011j\u001dxI1\u000bA?Ma$\u007fu\u001aS]1\u001e\u0013>l\u0019*=\u0010 QL@0B\u0002\u0005\u0015'?YD4Z)7\u001aJSU2q+";
        Object[] objectArray2 = objectArray;
        objectArray[76] = "#F}\"5;}\u0016&5K!{\u0011\"(\"-B\u001f\"8&K,H$/\"${O!4K";
    }

    public static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String getInfo() {
        String string = String.valueOf(this.m$$8C3cvTbViS4XQEogRFnO4VdistdFImHENy8CjWIVZlk9vRYO0ZQq21dZ1moCxOwmW48uVIoDdyLbMqLl8VhopyY0LP4bz3Rma(1170134002));
        return new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\u0001ms");
    }

    public static /* synthetic */ void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_6373 class_63732, m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk) {
        m$$Siqxdw60dnxHxOD8uuwYiX8PVK89Zxq606yoos2T2hm2o8ThAcHt6SwQbcU63ih2Pt3VG9BWl8FAWK96c3J8pfnMWQwW1wzAb.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((class_2596)new class_6374(class_63732.method_36950()), -1002562043);
        m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$lCJ99GNF5nE0KyGBDwkn9VbCwKXGYLSNfZD9coSpBtt28mlPmW1LuZEfvB3rbiOrL185Py6Q0aa3MwQYIknccd4mN3rbCY0Tb();
    }

    public static /* synthetic */ void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2720 class_27202, m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk) {
        m$$Siqxdw60dnxHxOD8uuwYiX8PVK89Zxq606yoos2T2hm2o8ThAcHt6SwQbcU63ih2Pt3VG9BWl8FAWK96c3J8pfnMWQwW1wzAb.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((class_2596)new class_2856(class_27202.comp_2158(), class_2856.class_2857.field_13015), -1002562043);
        m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$lCJ99GNF5nE0KyGBDwkn9VbCwKXGYLSNfZD9coSpBtt28mlPmW1LuZEfvB3rbiOrL185Py6Q0aa3MwQYIknccd4mN3rbCY0Tb();
    }

    /*
     * Unable to fully structure code
     */
    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2 var1_1) {
        block23: {
            block26: {
                block25: {
                    block24: {
                        block22: {
                            block27: {
                                try {
                                    if (this.m$$boSDDsnld9fpfI2CRgKHgbDs8IDUChFQx4u41dIxUQqbHFB7q7U49ZQqHgtfyR92qixZIWZtzmz4QKTOg7Px7NCDSmsciXVvN()) {
                                        return;
                                    }
                                } catch (Exception v0) {
                                    throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a(v0);
                                }
                                var2_2 = m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_3944.method_45734();
                                if (m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1542()) ** GOTO lbl21
                                if (var2_2 == null) ** GOTO lbl21
                                break block27;
                                catch (Exception v1) {
                                    throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a(v1);
                                }
                            }
                            try {
                                block28: {
                                    if (var2_2.field_3761 != null) break block22;
                                    break block28;
                                    catch (Exception v2) {
                                        throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a(v2);
                                    }
                                }
                                this.m$$bo6pWsywVkSWANkV45fJEIkNFDa2psGZU9s31SAK1YcpFuY4xDNWLthlVO4qXtC91oWHwFl3kD5txGQAflmQbCntt1CjmNxiB = 0;
                                return;
                            } catch (Exception v3) {
                                throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a(v3);
                            }
                        }
                        if (!this.m$$boSDDsnld9fpfI2CRgKHgbDs8IDUChFQx4u41dIxUQqbHFB7q7U49ZQqHgtfyR92qixZIWZtzmz4QKTOg7Px7NCDSmsciXVvN.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(((Float)this.m$$VN8ij0MZfa4VJFc4Co8zpiycK6VibTuW8wKOzhUVojpwjYmNPCaWi4LFHW7xgQjsZwrPamCMCopUcJpld3jK1Z9eiv5IfLkoN.getValue()).floatValue(), TimeUnit.SECONDS)) break block23;
                        try {
                            block29: {
                                this.m$$boSDDsnld9fpfI2CRgKHgbDs8IDUChFQx4u41dIxUQqbHFB7q7U49ZQqHgtfyR92qixZIWZtzmz4QKTOg7Px7NCDSmsciXVvN.reset(-486632718);
                                if (this.m$$JgHxlKUyKpBZww9UkovtfxyM9QYpv0xvyZAJN4MTpJUPLriXLaqWiGrcHJqV2AaavVMSXQk6IWqeLumJtR0uq3LA5MgzoanPY.getValue() != m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$D6Ov2lhd9jbzjz8jjaFTa4229QpF6qrDRNJQGzDaLBk65p3SZqGht3zHJueHXpUdWEIJbZ0m9Yktxk8RQ3AAvTMNQIWs04YoW) break block24;
                                break block29;
                                catch (Exception v4) {
                                    throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a(v4);
                                }
                            }
                            m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.submit((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, m$$3OSOUXV1mARFwilf3JzbDSkYT6RyFr86ZD7uIQKSIGkFazIebsAZWEcs2isRVzAvvhQz5roOrL4iIDSQrXCRpRbr2Dj913M58(), ()V)((m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK)this));
                            break block23;
                        } catch (Exception v5) {
                            throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a(v5);
                        }
                    }
                    if (this.m$$JgHxlKUyKpBZww9UkovtfxyM9QYpv0xvyZAJN4MTpJUPLriXLaqWiGrcHJqV2AaavVMSXQk6IWqeLumJtR0uq3LA5MgzoanPY.getValue() != m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$0fINBhfgG16gDlFpqbVDOwi6PWcN1UAdmbYu5ExPki1HD040r8BcwoUNUJ4E6igGl7G3M3y4iaWEo4DlbcKVcFn9copuiYzku) break block23;
                    try {
                        block30: {
                            if (!this.m$$4plkXH9wxWJDEtobnQ2FdD6yWd7882h4InqwOcVZnQhkg9O0YoQmLJZnwQsREe67a5G1WT9yLl50lY3uJiD5Uh07N5GkbgX3x) break block25;
                            break block30;
                            catch (Exception v6) {
                                throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a(v6);
                            }
                        }
                        return;
                    } catch (Exception v7) {
                        throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a(v7);
                    }
                }
                if (this.m$$QEsSRz71CJU4SaYqM3lQBYB59Rk0TgVLDEoYkg2EbQt3BtasbJGIpOXT48lelIy18aQuPQ5FykXP1anRuc7AL2A6Qp3aqGccT == 0L) break block26;
                var3_3 = System.currentTimeMillis() - this.m$$QEsSRz71CJU4SaYqM3lQBYB59Rk0TgVLDEoYkg2EbQt3BtasbJGIpOXT48lelIy18aQuPQ5FykXP1anRuc7AL2A6Qp3aqGccT;
                try {
                    if (var3_3 < 3000L) {
                        return;
                    }
                } catch (Exception v8) {
                    throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a(v8);
                }
            }
            try {
                var3_4 = m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$0S8nUkr7lZaVZw2A9VONEfscFcpjlppBvyGvFM9A8ZuW53NITaofCGdmGjx4Yu01aF74aWWJS7sXGCdU8JYALlA3QwzSW3fKb[this.m$$G1CsPMqm7ApUki6LIBOR03o1UlR3ROHIhoyfpukLpkg6oBp5QaQ9YN0DvVXic9AVn4WYbHQ3whq59TzSQDAMPKaTHDKIXpwqP++ % m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$0S8nUkr7lZaVZw2A9VONEfscFcpjlppBvyGvFM9A8ZuW53NITaofCGdmGjx4Yu01aF74aWWJS7sXGCdU8JYALlA3QwzSW3fKb.length];
                var4_6 = new class_2859(class_2859.class_2860.field_13024, var3_4);
                this.m$$4plkXH9wxWJDEtobnQ2FdD6yWd7882h4InqwOcVZnQhkg9O0YoQmLJZnwQsREe67a5G1WT9yLl50lY3uJiD5Uh07N5GkbgX3x = true;
                m$$Siqxdw60dnxHxOD8uuwYiX8PVK89Zxq606yoos2T2hm2o8ThAcHt6SwQbcU63ih2Pt3VG9BWl8FAWK96c3J8pfnMWQwW1wzAb.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2596)var4_6);
            } catch (Exception var3_5) {
                // empty catch block
            }
        }
    }

    public static /* synthetic */ void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2670 class_26702, m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk) {
        m$$Siqxdw60dnxHxOD8uuwYiX8PVK89Zxq606yoos2T2hm2o8ThAcHt6SwQbcU63ih2Pt3VG9BWl8FAWK96c3J8pfnMWQwW1wzAb.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((class_2596)new class_2827(class_26702.method_11517()), -1002562043);
        m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$lCJ99GNF5nE0KyGBDwkn9VbCwKXGYLSNfZD9coSpBtt28mlPmW1LuZEfvB3rbiOrL185Py6Q0aa3MwQYIknccd4mN3rbCY0Tb();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62(m$$V2Krh115dTil6CiDCChVxOfigKboUspdAAlSAGlM4OpVZIlKf1g2UO0CWiplcxxbxwWvjLygNFDkENfQ5lr9gS5JL6cOWS6qa=9999)
    public void m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk) {
        Object object;
        class_2596 class_25962;
        block13: {
            block14: {
                if (this.m$$JgHxlKUyKpBZww9UkovtfxyM9QYpv0xvyZAJN4MTpJUPLriXLaqWiGrcHJqV2AaavVMSXQk6IWqeLumJtR0uq3LA5MgzoanPY.getValue() != m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$0fINBhfgG16gDlFpqbVDOwi6PWcN1UAdmbYu5ExPki1HD040r8BcwoUNUJ4E6igGl7G3M3y4iaWEo4DlbcKVcFn9copuiYzku) break block13;
                if (!(m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8() instanceof class_2729)) break block13;
                break block14;
                catch (class_151 class_1512) {
                    throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a((Exception)((Object)class_1512));
                }
            }
            try {
                block15: {
                    if (this.m$$QEsSRz71CJU4SaYqM3lQBYB59Rk0TgVLDEoYkg2EbQt3BtasbJGIpOXT48lelIy18aQuPQ5FykXP1anRuc7AL2A6Qp3aqGccT == 0L) break block13;
                    break block15;
                    catch (class_151 class_1513) {
                        throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a((Exception)((Object)class_1513));
                    }
                }
                this.m$$bo6pWsywVkSWANkV45fJEIkNFDa2psGZU9s31SAK1YcpFuY4xDNWLthlVO4qXtC91oWHwFl3kD5txGQAflmQbCntt1CjmNxiB = (int)(System.currentTimeMillis() - this.m$$QEsSRz71CJU4SaYqM3lQBYB59Rk0TgVLDEoYkg2EbQt3BtasbJGIpOXT48lelIy18aQuPQ5FykXP1anRuc7AL2A6Qp3aqGccT);
                this.m$$QEsSRz71CJU4SaYqM3lQBYB59Rk0TgVLDEoYkg2EbQt3BtasbJGIpOXT48lelIy18aQuPQ5FykXP1anRuc7AL2A6Qp3aqGccT = 0L;
                m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$lCJ99GNF5nE0KyGBDwkn9VbCwKXGYLSNfZD9coSpBtt28mlPmW1LuZEfvB3rbiOrL185Py6Q0aa3MwQYIknccd4mN3rbCY0Tb();
            } catch (class_151 class_1514) {
                throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a((Exception)((Object)class_1514));
            }
        }
        if ((class_25962 = m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8()) instanceof class_6373) {
            object = (class_6373)class_25962;
            this.m$$kYr5kpRX5rtx4zH3Eu0mwJqcWEZm0lESJJj2Ll5hJkS8PjbkczMeyptlzK2TJaLOiU4ybw3bWRCoIjA6tI0diKH7e6FnR5wRA(() -> m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_6373)object, m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk), -316011069);
        }
        if ((class_25962 = m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8()) instanceof class_2670) {
            object = (class_2670)class_25962;
            this.m$$kYr5kpRX5rtx4zH3Eu0mwJqcWEZm0lESJJj2Ll5hJkS8PjbkczMeyptlzK2TJaLOiU4ybw3bWRCoIjA6tI0diKH7e6FnR5wRA(() -> m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2670)object, m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk), -316011069);
        }
        if ((class_25962 = m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8()) instanceof class_2720) {
            object = (class_2720)class_25962;
            this.m$$kYr5kpRX5rtx4zH3Eu0mwJqcWEZm0lESJJj2Ll5hJkS8PjbkczMeyptlzK2TJaLOiU4ybw3bWRCoIjA6tI0diKH7e6FnR5wRA(() -> m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2720)object, m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk), -316011069);
        }
        if (m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8() instanceof class_2708) {
            object = this.m$$o7KhjXG8xxPsFOvjGa9NdOGlRINzPvy65PSSPrRE9u2JwIfDCdHsYsmvNH2hV0hwcmvSVz6G5BpBoAm5wxJviJdvsUydpMXa7;
            synchronized (object) {
                this.m$$o7KhjXG8xxPsFOvjGa9NdOGlRINzPvy65PSSPrRE9u2JwIfDCdHsYsmvNH2hV0hwcmvSVz6G5BpBoAm5wxJviJdvsUydpMXa7.incrementAndGet();
            }
            m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$0vQbZqUtpzH4dC5ha5T4zYvR5f7CLwBqCGSXbL0fuZzrL6FO0FFeXmuzn3U6ToSea1JUghd7nBKayU5jJa31OblbR72M0JvlZ.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(() -> m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.execute(() -> {
                AtomicInteger atomicInteger = this.m$$o7KhjXG8xxPsFOvjGa9NdOGlRINzPvy65PSSPrRE9u2JwIfDCdHsYsmvNH2hV0hwcmvSVz6G5BpBoAm5wxJviJdvsUydpMXa7;
                synchronized (atomicInteger) {
                    this.m$$o7KhjXG8xxPsFOvjGa9NdOGlRINzPvy65PSSPrRE9u2JwIfDCdHsYsmvNH2hV0hwcmvSVz6G5BpBoAm5wxJviJdvsUydpMXa7.decrementAndGet();
                }
            }), 0);
        }
    }

    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8) {
        try {
            if (m$$jTfyP3BMAPclRiBWzuPjFVLQ74jzFnNxnufxTWj4gMJqZ84HRVVNYVHTiIzNrf1hOasuciwwM7GV7ELakq2jOEudBfYKlAOnF$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8() instanceof class_2859) {
                this.m$$QEsSRz71CJU4SaYqM3lQBYB59Rk0TgVLDEoYkg2EbQt3BtasbJGIpOXT48lelIy18aQuPQ5FykXP1anRuc7AL2A6Qp3aqGccT = System.currentTimeMillis();
                this.m$$4plkXH9wxWJDEtobnQ2FdD6yWd7882h4InqwOcVZnQhkg9O0YoQmLJZnwQsREe67a5G1WT9yLl50lY3uJiD5Uh07N5GkbgX3x = false;
            }
        } catch (class_151 class_1512) {
            throw m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.a((Exception)((Object)class_1512));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void m$$kYr5kpRX5rtx4zH3Eu0mwJqcWEZm0lESJJj2Ll5hJkS8PjbkczMeyptlzK2TJaLOiU4ybw3bWRCoIjA6tI0diKH7e6FnR5wRA(Runnable runnable, int n) {
        AtomicInteger atomicInteger = this.m$$o7KhjXG8xxPsFOvjGa9NdOGlRINzPvy65PSSPrRE9u2JwIfDCdHsYsmvNH2hV0hwcmvSVz6G5BpBoAm5wxJviJdvsUydpMXa7;
        synchronized (atomicInteger) {
            if (((Boolean)this.m$$m6afN5vCZhFLuzFjJ2D2Y6QtWoU7l3gDkT5A6Fpc1eJdhDVHjtU3cJbHV2qof6ePtw9uy9fdXhF21MZ3Xc4uqafHsbNrfSoCQ.getValue()).booleanValue() && this.m$$o7KhjXG8xxPsFOvjGa9NdOGlRINzPvy65PSSPrRE9u2JwIfDCdHsYsmvNH2hV0hwcmvSVz6G5BpBoAm5wxJviJdvsUydpMXa7.get() == 0) {
                try {
                    runnable.run();
                } catch (Throwable throwable) {
                    // empty catch block
                }
            }
        }
    }

    public /* synthetic */ void m$$3OSOUXV1mARFwilf3JzbDSkYT6RyFr86ZD7uIQKSIGkFazIebsAZWEcs2isRVzAvvhQz5roOrL4iIDSQrXCRpRbr2Dj913M58() {
        this.m$$bo6pWsywVkSWANkV45fJEIkNFDa2psGZU9s31SAK1YcpFuY4xDNWLthlVO4qXtC91oWHwFl3kD5txGQAflmQbCntt1CjmNxiB = (int)this.m$$7wvVsFzcifcu8AIGR00Pbh665VwzgckpdiGsRaJAtMFaO1QavV4xlIDcOag6fiRjBXqTMHazqYyFkgqwl8omFK9nO14M6KKq5(775226133);
        this.m$$boSDDsnld9fpfI2CRgKHgbDs8IDUChFQx4u41dIxUQqbHFB7q7U49ZQqHgtfyR92qixZIWZtzmz4QKTOg7Px7NCDSmsciXVvN.reset(-486632718);
    }

    @Override
    public void onEnable() {
        this.m$$G1CsPMqm7ApUki6LIBOR03o1UlR3ROHIhoyfpukLpkg6oBp5QaQ9YN0DvVXic9AVn4WYbHQ3whq59TzSQDAMPKaTHDKIXpwqP = 0;
        this.m$$QEsSRz71CJU4SaYqM3lQBYB59Rk0TgVLDEoYkg2EbQt3BtasbJGIpOXT48lelIy18aQuPQ5FykXP1anRuc7AL2A6Qp3aqGccT = 0L;
    }

    public long m$$7wvVsFzcifcu8AIGR00Pbh665VwzgckpdiGsRaJAtMFaO1QavV4xlIDcOag6fiRjBXqTMHazqYyFkgqwl8omFK9nO14M6KKq5(int n) {
        try {
            InetSocketAddress inetSocketAddress = (InetSocketAddress)m$$4bDgNKPOSk2ptyK10jT3XHuqi1OdHr37L20nv7xqLdp4prc8L1rXI0f5V5g4FaqwIzGewHK9H50GrFZ6924hXzbdF1TZDxElK.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_3944.method_48296().method_10755();
            if (inetSocketAddress == null) {
                return 0L;
            }
            InetAddress inetAddress = inetSocketAddress.getAddress();
            if (inetAddress == null) {
                return 0L;
            }
            long l = System.currentTimeMillis();
            Socket socket = new Socket(inetAddress.getHostAddress(), inetSocketAddress.getPort());
            socket.getInputStream();
            long l2 = System.currentTimeMillis();
            socket.close();
            return l2 - l;
        } catch (Exception exception) {
            return 0L;
        }
    }

    public static String m$$w5bjZZp8j2ZC76LU49ETsUPSarWvV07dyv8IfcTKbfQ1hCkaI2OghDbwMnUuP13MKitGhnVLcsdwsozucrZoxSV7p7OGRHZPA(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-108, -104, 62, 83, -47, 17, -43, -112, 104, 73, -19, 102, -87, 61, -115, 27, -50, 7};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 18]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public int m$$8C3cvTbViS4XQEogRFnO4VdistdFImHENy8CjWIVZlk9vRYO0ZQq21dZ1moCxOwmW48uVIoDdyLbMqLl8VhopyY0LP4bz3Rma(int n) {
        return this.m$$bo6pWsywVkSWANkV45fJEIkNFDa2psGZU9s31SAK1YcpFuY4xDNWLthlVO4qXtC91oWHwFl3kD5txGQAflmQbCntt1CjmNxiB;
    }
}

