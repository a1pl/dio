package me.mioclient;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.io.FileNotFoundException;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import me.mioclient.m$$1jOWsTPtmbJw41RuZ4W3HsnOh1UrckOKRyWBrJ2dTlnNzMWmXIoAwZsov6KCypcHhvjIkeyolQqDs34vtSdJ8oD9yR8jOJlp0;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP;
import me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$ai2OPmCv1Ik4Bf9MmMIhWdABomxdU9F78feCd0tTx0o2LclrgFD4fPbSdLMlzTFtzsZYcmSUSC7Yf9GKFuBGWqaoZ9eM43gC5;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB;
import me.mioclient.m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4;
import net.minecraft.class_124;
import net.minecraft.class_151;
import net.minecraft.class_2172;
import net.minecraft.class_2561;
import net.minecraft.class_2564;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ
extends m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP {
    public final m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4 m$$tYPCqVTEwMHSL5qKxLiYhldokGzlMNeiNGBEB1zIT52A6PRFVcAOnt31hzq5jJFpcXnfmstTgVcRfzXy3WjSOcGi4CsN2w8sJ;

    public m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ(m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4 m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4) {
        super(m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4.name().toLowerCase());
        this.m$$tYPCqVTEwMHSL5qKxLiYhldokGzlMNeiNGBEB1zIT52A6PRFVcAOnt31hzq5jJFpcXnfmstTgVcRfzXy3WjSOcGi4CsN2w8sJ = m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4;
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
                                m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.k = new Object[92];
                                m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.l = new String[92];
                                m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.e();
                                var21 = new String[21];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8("UgR1dEkEQjK0Po8G6z6z", MethodHandles.lookup(), "m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8", m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.class, 921718471);
                                var20_3 = var18_2.length();
                                var17_4 = 2;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 84;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8("CmHEr4vp9j8BVpTRJDxI", MethodHandles.lookup(), "m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8", m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.class, 1625728154);
                                    var20_3 = var18_2.length();
                                    var17_4 = 27;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 111;
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
                                            v15 = 56;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 99;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 22;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 87;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 43;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 76;
                                            break;
                                        }
                                        default: {
                                            v15 = 62;
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
                        m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.c = var21;
                        m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.d = new String[21];
                        var8_7 = 8188819166583893412L;
                        var14_8 = new long[59];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8("jJF6zMHQg85BOe2mktDh", MethodHandles.lookup(), "m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8", m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.class, 1081048923);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8("jcK6WLQICoF000Q6F3Oh", MethodHandles.lookup(), "m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8", m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.class, 498287442));
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
                            var12_10 =  /* dynamic constant */ (String)m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8("J1qJGWG9yzeZX1z4Fso3", MethodHandles.lookup(), "m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8", m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.class, 1018586848);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8("cCIt2WX7AOKkJ7FYijIE", MethodHandles.lookup(), "m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8", m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.class, 177329821));
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
                m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.e = var14_8;
                m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.f = new Integer[59];
                m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -888762;
                var0_14 = 5312562090169393197L;
                var6_15 = new long[5];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8("7uxhfLSe21cpGO59dq4N", MethodHandles.lookup(), "m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8", m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.class, 1620591850);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8("CVIcNx0u4UfhZoqZ4OFP", MethodHandles.lookup(), "m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8", m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.class, 308567173));
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
                    var4_17 =  /* dynamic constant */ (String)m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8("jxpz9jB81S7WDlzwv7Ij", MethodHandles.lookup(), "m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8", m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.class, 1094286835);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8("6zHRmb1bl3m5TzJHeUq2", MethodHandles.lookup(), "m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8", m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.class, 1902889861));
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
        m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.i = var6_15;
        m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.j = new Long[5];
        m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)5136094871706321709L);
    }

    public static void e() {
        Object[] objectArray = k;
        k[0] = ")-yCDa)-n\u001fHn3fn\u0001H{4\u0017?X\u0011;";
        objectArray[1] = "\\xJ>\u001b\u0017\\x]b\u0017\u0018F3]|\u0017\rAB\u000f\"B";
        objectArray[2] = "*z\u001almA$s]djZir\u0010%oi~l\u0005vvB&IPcQ\u001c$YS@1H![eU2]?r\u0006tMY j\u0004Cm\u001b\u0015H}hWA/\\Ym\\_!rgyND*K\u0000mmv*TlNOH2RGXlc5y}c`E#EBJp_(Xutne2szb0";
        objectArray[3] = "[R\u0001}s[P]\u00102\u000eCCZ\u0019{";
        objectArray[4] = "&:.^{\u0007-5?\u0011\u0016\u0003-)\u000bZ$\u001e)5;Z";
        objectArray[5] = ":5wP\u001e::5`\f\u00125 ~`\u0012\u0012 '\u000f1KEb";
        objectArray[6] = "T\u0017tuAxZ\u001e3}Fc\u0017\u001f~<mOQ=+NEq~7<b^y`G1^egN',J\u001eBx\u001b\u0002ufz\u000f=(}Zx\u007f ,KG$o\u00115n\\EV\u00107sxyX\u00137BIMj\u0004\u0013rjE]\u000b*nIcq\n\u0017lQRA\u0010\u0019,p{o\u0010h}GYQ\u0004?rk";
        objectArray[7] = "S\u0000R{oUM\bH4\bT\\\u0013En.R";
        objectArray[8] = Boolean.TYPE;
        m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.l[8] = "java/lang/Boolean";
        objectArray[9] = "}\u0002\u001e{oet\f\u001d2,hl\u0004\u00144fc{\u001f]6mdj\b\u000b!,Iq\u0000\u001e4ln]\u0002\u001d!grj";
        objectArray[10] = "Q\u001e\b\u001e'=Z\u0011\u0019QJ=Z\f\r";
        objectArray[11] = "PfihC7[ix'\"9Pb|}";
        objectArray[12] = "yRhl<\u001a\frcc-Um|hh)\u000f\u0019";
        objectArray[13] = "\u001ciEA\u000f\u0007\u0017fT\u000eh\u0005\u0002mTES";
        objectArray[14] = Integer.TYPE;
        m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.l[14] = "java/lang/Integer";
        objectArray[15] = "\u001a *w\u0002\u0010\u0014)m\u007f\u0005\u000bY( >/\u0017\u000f\u0002b_]44&Gc[-\u0004)^m\u0000\u000f\u001a0jO.F;\u000bNB\u0018)\u00067lS\"\u001e\u0000\u000b2q\u001fF$4hx\r\u001e\u0018#HO\u0003\u0015=\u0007r]Z'-\u00065~S\u0006=.|R-H>$rj]\u000f9\u0016`Q\u0007\u0018O\u000e6q\u0006\u001a\u0016\u001dph>";
        objectArray[16] = "%d('\u0003u+mo/\u0004nfl\"n\u0000(.9p?[{?hR\r!}\u001e1B\u0000+]xN\u007f\u001e\u0010h\u001fYl\u0006\u0003\u007fyxb\u000f<B\tDt SX\u001ei6\u0003&\\>L0\u0006$`q6T\u000b\u001f{?DT\f\\p\u0002nV\r\u0003l\u0011de!\u000e+\tdw=3n\u0018{e\fYS\u007fJhz!";
        objectArray[17] = Void.TYPE;
        m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.l[17] = "java/lang/Void";
        objectArray[18] = "A^aT};OW&\\z \u0002Vk\u001d]-Ci)Xq\u0013\u001fB Ob7dt7r#\u0016\u001dK\u0016T{&T\\\u0003J .UKzq|\u0016VP'X\">\u001fX\u007f[Q6^u5amg\u001bR\u0019Nue[J\u007fpllNZ\u0005WuetX-`^\u001f\u001c\\\u007fX!.kN\fv&cjT6Zc";
        objectArray[19] = "#$Tw,##$C+ ,9oC5 9>\u001e\u0017mws";
        objectArray[20] = "M_Z\b\u0005#SW@Gg?TJ";
        objectArray[21] = "+]\u0001JLu%TFBKnhU\u000b\u0003lc)jIF@]uA@QSy\u000ewWl\u0012XwHvJJh>_cT\u0011`?H\u001aoMX<SGF\u0013pu[\u001fE`x4vU\u007f\\)qQyPD+1I\u001fn]\"$YeID+\u001e[M~oQv_\u001fF\u0010`\u0001Mlh\u0017-\u0000WVDR>+\u001c\u000b]Pc!}w\u0014wc\u0001L\u001cqIk\u0011\u000b\u0017IMw1\u0000{dR{7\tmBLU?tn\u0014O,\u001eyMQ}S)]l\u0014k(\u001e\u0000Xr\u001dv\"^vT\u0015ppRX@\u0017N,JN\u0014iB#\u000fXr\u007fV\u0003}N]TipVl\u0017}\"\u0011\u0001i\u001f";
        objectArray[22] = "\u0019%V\u001b(U\u0012*GTCA\u0010!P\u000eoV\u001d";
        objectArray[23] = "\\%Ww~D\\%@+rKFn@5r^A\u001f\u0016k&\u001d";
        objectArray[24] = "\n\u0016[\b\u0007\u0019\u0014\u001eAGO\u0019\u000e\u0014Y\u0000F\u0002N\"C\b[\u0015/\u0007H\u001bH\u0018\u000f\u0005";
        objectArray[25] = "\u0007Yc|F'\tP$tA<DQi5`q<X*f|q\u001dd\u0006A\u001c%\u0004w\u0017 d,0i\u001bk\u0016\u001e\u001dV~]K*<H&BK!\u0018S\u0003R\u0019z2Ry\\yp\u0010z\u0018}u.\ti%By$(q5I\u007fp-Y:r\u001a\u0012\u0001\u0005\bRF!\u0003q.Fz==T>}}q\rD\u0003G\u007f";
        objectArray[26] = "t\u0013L$\u0004:\u00013G+\u0015u|+T,\u001c<\u0014";
        objectArray[27] = "x|7\u0000]rqr4I\u001e\u007fiz=OTt~atLEtww?\\\u001eO~b/GBx\u007fR(IEp~}.lEtww?\\";
        objectArray[28] = "\u001f Pu?\u001e\u0016.S<|\u0013\u000e&Z:6\u0018\u0019=\u0013: \u0016\t\"X5&\u0002R\u001cI);\u001f\u001b\u000eO<'\u001c\u0019!I\u000f+\u0001\u0019";
        objectArray[29] = "l8\u001d\u0011q\u001de6\u001eX2\u0010}>\u0017^x\u001bj%^Li\u0015h2\u0003Ku\u001day#J{\u0015j$\u0004Vs\u001c_%\u001fIu\u0016j%";
        objectArray[30] = "\u0016-\u001c\u0007AM\u001f#\u001fN\u0002@\u0007+\u0016HHK\u00100_H^E\u0000/\u0014GXQ[\u0003\u0003NYO\u0010,\u0005}UR\u0010";
        objectArray[31] = "kTVN\u0006QbZU\u0007E\\zR\\\u0001\u000fWmI\u0015\u0002\u001eWd_^\u0012EraO^\u0012\nRII\\\u0015\u0006[fOy\u0015\u0002Rl^I";
        objectArray[32] = "9i,\u0015>\\0g/\\}Q(o&Z7Z?tox<^7g/_";
        objectArray[33] = ",Okq\u0019\t%Ah8Z\u0004=Ia>\u0010\u000f*R(=\u0001\u000f#Dc-Z'=Gs2\u0011\b;bs6\u0018\u0002*R";
        objectArray[34] = "\tw+(\f\u0004\u0007~l \u000b\u001fJ\u007f!a\u001c,SD\u007f+R>-!w\u001dV*3#T \u0011%>#Bt\b\u001c\tpVv#=VjT\u00102)1Ams\u0017-'+F\u000fS!\nKF\u0013T/T[i#\u00103\u0005Qo}\u0000=Uwj\n\u0012\u0012=eT$S\f,`t)\\_\u000b%l\u001d\u000b\u000e*J6\u00154";
        objectArray[35] = "T1kjSPT1|6__Nz|(_JI\u000b-q\b\r";
        objectArray[36] = "S\r\u001d<\u000bKM\u0005\u0007sfQU\u0000\u000e>QWV\u0002";
        objectArray[37] = "\u001f\u0012N1q2\u0011\u001b\t9v)\\\u001aDx!\u0014:\u0012\b\u0017\u007f/\u001c0S\u000f/\u00111 T)k\u00183\u001c\u0015\u001aBkD\u001aV1*n\u0017@\u0004\u0006{86>\u0018\u0015Al\u001b\u0016$\rA$\"F\u0015\bk2$O\u000fdy\tK\u0010.1_o758l,.\u0002G79.\u0012:?\u000e\nAd\u00053\u0001n\u007f>\u0015\u00006,R";
        objectArray[38] = "u3<;`/k;&t=.m7+7`\tk /;#";
        objectArray[39] = "X0\u0013z\u001aQF8\t5RQ\\2\u0011r[J\u001c\u0001\u0017~PMQ0\u0011~";
        objectArray[40] = "\u001b\nKI\u0002\u0016\u0005\u0002Q\u0006J\u0016\u001f\bIAC\r_-HFO\u0017\u0018\u0004S";
        objectArray[41] = "[^1\u0006f\u0000[^&Zj\u000fA\u0015&Dj\u001aFdw\u0019<[";
        objectArray[42] = "T!\u00130\u0001Q]/\u0010yB\\E'\u0019\u007f\bWR<Pm\u0019YP+\rj\u0005QY`-k\u000bYR=\nw\u0003PD\f\u000bw\u0000ZR<";
        objectArray[43] = "mL#KK|sD9\u0004\u0006fiN X\u0017liY{i\ndwA0^\u0004kkH\u0013_\u0011|uH";
        objectArray[44] = "\tsZ\u0003\u001c\u0010\u0007z\u001d\u000b\u001b\u000bJ{PJ\u0014.1d\u001a&\u0012.PFA\u0003 \u0011\f~-\t\u0002\r!d14<\t,/0\"\u001c(TD\u0006;\u001cL\u0012]B\u0014\u0013)W\\$\\7\u001aPED4=9\u000bAG+\u001e31_\u0010\t4>6c\u0004X\"\u0017\rX\u0005\u001d'0\u0005$\u0016\u001a\u0018+\u0001.\f\u001fA\u000e\f\"\u0005&\u0018";
        objectArray[45] = Long.TYPE;
        m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.l[45] = "java/lang/Long";
        objectArray[46] = "^gPaWX\u0004i\u0007i.OTq^aB}\u00022\u0007?\u0014*A4A=HPGl]c.\u0011Kb\u00016NWP3\u000e\u0006\u0015XV2\u000efSC\u0007=>";
        objectArray[47] = "VXny\u001f|\u000e\u0007>j'3SMm\u0014E#[Z9$\u001d|\u000bI\u0001";
        objectArray[48] = "\t).B\u001bAWn0\u0013 @Tm2D\\.\t).B\u001bAWn0\u0013 \u001eQk9RR\u0014\b{:-\u001a\u0010JxlBDWT)W";
        objectArray[49] = "C6p\t_\u0014J,*\u001f2GV-O\b]I@-o\u00142P\u0002..\u0003HVZ2pe";
        objectArray[50] = "W\u0019>FHE\u0004E<\u0004q\\\u0011Y\u001e\u0002?DLHi_\u0015w\u007f\u0012\u0015L,c\u0000\u0007\u0016v=fx7(\f)cv\u0017>D\t\u007f\u0004\u001a1rACl9\nq-F\u0004\u0005gg\rIO\u0017\bx\u0018\tr:)\u0001\t\tL1\n\u0007\bKq\t7\u00057f~)fO\u0001ilO\u0014X\u0001\u0007\u0000\u001e7]/b}+h=K\u0007D\u001acR\u0015@ZKXTN\b@\u001a<M\u000fCWu3QJ[\u0005\r%PH]=";
        objectArray[51] = "'\u0014?|\u00165oT=nqq\u007fJzo6a\u0016G83\f`r^yx\u001b\u000f'\u0014?|\u00165oT=nq";
        objectArray[52] = "\u00163TZ\u0014\fQ7H^j\u0007\u0006|n\u0007+\u0010u(r]W\u001bW\"\bu\u0013Zk\u001dOl%\u000bL2n\t\u0016\u0004x5v^\t$um~|.\u001fj2MF\u0014\u0012i\tdG\u0016)L ]k\u0016=V/LL\u00013U*\t~4 `\u000bU~1\u0019m\u0017_K5[\u0014\u0016uN3%p<\u000e\u000f)\u000bH\u001dZ7S\u0010F4U\r\u001bZE:4";
        objectArray[53] = "2\r-p.\u001b'K>zM\u0000t\u0019\nH.\u0006\bx6k\u0017!\u0007t7+\u000e\u0004=wvh!\u0000\u001cowt-#5y\u0016t\u001f,`E!Ku\u0007'Yw-)?\u0015u\u0006k\u0013#`\u000f*)1\u000b\u001f\f\u007f*\u0007. |\u000b+\u001f\u000fbm|kq\u00179\f -*=#e6{\f\u0005%y\u0019w\f!\u0006pw\u0010w[!Z|\u007f)\u001c?\u000bG";
        objectArray[54] = "a`\u000fC~iifOC\u0014ny\u007fLVn\u0000bvQ_y8hj]\u0003\u0014yc$HQ}qedH;";
        objectArray[55] = "r^l[U3!\u0002n\u0019l*4\u001e`G7\u0003TIlD\u0000~vJdaV\u0004B]I`\u0003%TI:a \u0012SRDy\u001cse\u000e3L-?EksJ,\u0001R\rs\u001f1s)`SY, d\\{z]uaSzr-\u0010JNxE\u001esAqVg\u0003p@B5f'\u0003CWqK\r\u001fFLL Vqa]1O\b6\u007f\f\nIS~e]nP\u00125r2aLW- JwMU+\u0018";
        objectArray[56] = "\u0005Q*Dy]\b\u0010\"FEN\u001fE/E(A\u0019*h\u001e<H^E6Y\"\u0019eN?N<\u001e\fA<Cx'\u0007FcE)\u0016\u001aX \u001fE";
        objectArray[57] = "VrR\t+\u0005\u001e8Q\u0007JZC,\u0001\u0001-Z\u000eEn\u0001\u0012\u0007&jL\b\u0018}P\u007f\\\f'c?Q\u0003\u0013/q\u0010Qn\u00160B7>L.\u0014\u0006RJc$#Y\u000b}n$3r(M\u0003S1g,n\u0005'0\u0007>En\u0000\u001a|\u0013@{<\u0015g0MC\u0011\u0014S\u0012Md'\u0013\u0002\bm}\u0004-\u0000.1smp\u0001\u0016o\u0005\u0002.F\b>>";
        objectArray[58] = "\\x&\\ .];{U\u001d(I-!Ja(B@/Sa.\t;#\to+9&s\u000ec<H|{E%E";
        objectArray[59] = "4D\u0015x| )ZV\"\u0010m6EB\u001dv(oV]l, $\u0010${)((QU!!cn(";
        objectArray[60] = "%\u001dXFOR+_\u0000\u001ev\f4IFH\n\n2$\u0001\u0010\tQ#H\u0001[\u0015\u0000H";
        objectArray[61] = "!xISoZ ;\u0014ZRM$-C84\b}>\\In\u00006x%^k\b:9T\u0004cC|@";
        objectArray[62] = "T\u001dggM\u000e\u0005\u0004<awWV\u0001l8\u001be\u0001B2nK2[D|c\u0019\n\u0005\u0014j;w][\u00164eK\fBM2_";
        objectArray[63] = "\u001a\nt\u0011\u0016q\u0007\u00147Kz-\b\u000b.\t\u0006-\u0003f \u0010\u0006+H\u001d,J\b.x\u0000|M\u00049\tZt\u0006B@";
        objectArray[64] = "h1\u001aMPv9(AKj/j-\u0011\u0012\u0006\u001d=nODQJ=o\b\u001aQ%c(\u0016Kj%g:IOVt~aOu";
        objectArray[65] = "=5o@ \u001f{.>O\u0010\u001ak;`\u0018|(:|<@(\u007f<yy\u0010+\u0010b>gA\u0010\u0010f,8E,A\u007fw>\u007f";
        objectArray[66] = "q\u0011C8c%u\u001aZw[&g\u0014S!7\u0014;R\rz[:qWK,22w\u0017KF'-{\nP<*|g\n3;drg\u0013\t8$85h";
        objectArray[67] = "?@\u001d\u0015/&?\u000b\u0001DD*k\n$D46\u0002OX\u0015$0oLXT?J";
        objectArray[68] = "4g[Ou$;!C*b1#9@FPegh\u0018\u0015\u0007efdCPcdfi\u0019*lb#<URc$;Y";
        objectArray[69] = "I\u0006;\u001fL\tDG3\u001dp\u0016\u0005Q1\u0006\u0001\u001cd-x!\u0001<UF\u001d\u001f\t,\u0012M%\u001b\u0015\f\u0019!\b\u0004\u0019\n\u00107.\u001a7\u0002m4x\u0019N#`\u0017=+1\u0014D6x=J#\u0019\u0002\u001eK\u0014\u001fG,8C\u0012MK\u0002,A,\u0011S\u0014x? \u001e\u0016\u0002\u001e)4>d\u00141\u0002\u000bMO6{+@,\u00183s{\u0011\u001e\u0010\u001c$\u0001M\u000bL\u0005C\u0019\u001cBL\u0011r\u0004\u0002\u0001\u0016}";
        objectArray[70] = "\u0010\u0004\u0010\th{\u0011\u0001\b\nVqC\u0013:\n9cK\u0002\u0015\fV$\u0010\u0016\u001cK9zW\bMpi'U\u0013\u0014L,oD\u0000s@mu\u001e\u0004J\u00156!\u0013o";
        objectArray[71] = "3\nE$Xh`VGfaquJN2$e0\u0016Sa,h#%z0\bl?\u0019X\u0015\u000fE$\u001d\u0019\u0003\u000f(;4O/')$\u001bh\u0004ZP'_m\u0016(Pe9g%'L);\u001f`\u0002]\u0005\u001ax\u0005\u0018McVM\u0015\u0001D)(Z\"^i\u001f)_\u0005/o\u0010=}\u0006-x4_m5\\[\u0017Y\u001e_[* \t\u00180\u0005m>X#6^%$\tG/\u001fn3f\u001a-\rp8\\Rg\u000e~Y";
        objectArray[72] = "TbWmS{Ro^3*q\u001e1hBex}Z\feGp\tP_~FOSliT{INZ\ntHW@_uQvEu%\u0000QP~XZ]lztps@a{o\bV_~KOW&L>dPY&kSnhSxIB\u0016ZyR\u000b~k.b\\o3NiNV`5\u001ao\nY_\u000e\u0010*Kr\u000baNmU#0g\u0015%OrT~TnX\u001d\n0S{\trTwM*2";
        objectArray[73] = "fba89N{|\"bU\u0004ya?0.\u0003\u007f\u000e3'jB\u007f5m\"(\u0011\u0004l<l0\u00135q\"/j\u007f";
        objectArray[74] = "\u0002X\u0005+\u001b;DCT$+>TV\nsG\f\u0002\u0012S*\u0010[\u0003\u0014\u0013{\u00104]S\r*+`KEU$K&P\u0014Z\u0014";
        objectArray[75] = "=8'::5nd%x\u0003,{x\u0010\u0002b+.7\u0018\u0005Z\u00073\u0016>\u000eZ3\u001c\f\u0000/90\u001e9,\u0003{q\u00135\u0013\u007f_\u0007\fi-\u001al\u001b4\tz$Xq\u00185& [\r\u000e&$y3&=::\rZ7=?\u0007\fL\u0018\u000ee,\u0006Z\u0003o>\u000e\u0005i*42~zrp\u0019n1:z74\u0019=A9w.;z.g00jA(<x*;%1}3=T\u007f{?)-9|{~2W";
        objectArray[76] = "xB\u0010Z\n*u\u0003\u0018X654\u00156xk VU\rbU!CV#\u0003\u000b\u000bE\\XwK\u001d$\u0002']Q\u0001tE\u000fsZ\u000eSh:\u000eL\u0002Gd:{_m]XS[]\u000b_E\u0017\u0006_\u000e$I\bsF+Y]\u0019lX=}h)YF>tRTBY0ZF)y[o]t6\u0000p>Dv7>\fnaVSQR)\u007f\u0007hW\taeV\fNH*r9\u0007^]h\"\u0005VG\u0006n\u0018";
        objectArray[77] = "}hcf\u0007\u000b}#\u007f7l\u0001-)`Z\\\\+iwc\t\u0007\u007fd\u001c";
        objectArray[78] = "\u0010Ju~16WNizO7AUSz*5,\u0013+j cCMltqX";
        objectArray[79] = "`\u0003xKy_nA \u0013@\u001bq@qE%`tA#T*\t|GcT@";
        objectArray[80] = "2\u007fG&Tt:y\u0007&>x\"|x%\u000fl-i\n=[f7\u0004\u0001%\u0001e!m\t#AeK";
        objectArray[81] = "jy\u001f9\u001aH9%\u001d{#Q,9<}\u0012\u00041T )R\u0005A\u007f\u001c\u0012\u001ftZM\u0012\b\u001ek]r\u0002$xIDK>\u0013qnZ\u007f;\u0005OTg% \u0007\u001aL]Q\u0001\u0007YV8K\u0000-C~iM\u0018yr]1s\u001e~YpN%\u0000r]\tbd\u001e\u0018Y\u000b=~\u001c3Yzk{>-GDLw6B\u0019\nyzB-GMg+y+\u001c\u0005}z\u001d2]Nj\u0015Gx\u001fTzxDx^O\u0000";
        objectArray[82] = "7(iC(|44vWF]{=(\\~q\b-Y\u0010\f2\r+jQ >)'Rc\u0000j0\u0002X\u0017<D30}i!]\nt}\u0014%< \u0011#\u0017{G1#dm\u0002ou'uO\u001fQ*,Gowd\u000b'_\u00114zz'SV\u0014@\f RN\u0017H\u0016\u001e!J\"D\u00181T_<;(wJ-8=5%&\u001583zu\u0018Dy27#|]8y L";
        objectArray[83] = "Zj\u0001\u001aDF\u000b6\u0001X%X\u001d!\u0018WTR|]QpTrM64N\\b\n=\fJ@B\u0001Q!ULD\bG\u0007KbLuDQH\u001bmxg\u0014zdZ\\FQl\u001fm\u0001r7\u001aAQ_\\\u0011\u0012G\u0003Sr\u0005\u0010y_KdQnuP\u000er7xap|d\u0018S^\u0003WFRz\u0015b\u0000CZ*\u001eO^2ZJXT\u000f=jFA^\\i\u000e\u0010\u001c\u0003V\r\u0001F\u001e_\tu\u0017G\u001cY1";
        objectArray[84] = "\u0004pON \"\u00116\\DC9BdY\u007f\u001b\u0017\u0017\u0016yc<\u0019.\u0013a\u0013:\u001f\u001e\fD\u007f#8\u0002/Fa18+\u000eHO\u0005\u0013$\u0005o\u00171\u001d2u\u001fg}\u00044\u0006{E\n\u001b\b4\u001e\u0017#.\u0017uGl\r$\u0005\u0018C@&'\u0012\u0014Jp(\u0006\u0000:u_x\u0003\f\u0013bE\f=R\u0003^hy#^3g..e\n/\u001c\u0011 'Rw%";
        objectArray[85] = "t\u0001&M,\u001e%]&\u000fM\u00003Js\u0013\u000f7gW/\u0011\u000b)C^\u000e\u001f\u001c\t|^\u0007\u001a(:vY,A\u001f4\u007f\u0003+7\u0010\u001am\u0014\u0015\r\";n'?8\u000f\u0004QX.\u001b=\u001ee+0\u0011 \u000e|>\u0014\r\u001d\u0018`?\u0011\u00120:y\u001f\u0001\u00011/`\u0002\n?\u0011 ]\\\u0015\u0003\b\bpY?\u0003\u0002?zY\u0014}$Z.\u001b\"\u0019=\u001be\fM\u0011)\u0006r\u0002)Gt[xf";
        objectArray[86] = "GSk'\b \u0016\u000fkei>\u0000\u0018rj\u00184ad;M\u0018\u0014P\u000f^s\u0010\u0004\u0017\u0004fw\f$\u001chKh\u0000\"\u0015~mv.*h};uW\u000be^~G(<A\u007f;QS\u000b\u001cK]'\r7Be{/\u000beNKo-59V];S96\u0013K]E-\u0016a]rn\u0012eJ\u007f8GY\u0004\u001dz0\u0017R)C\u000b0w\u00142\u0012\u0004\u0000{\r8APd-PeK4mr\u000b%^OcsS ,_l,\u000bcTIm.\r[";
        objectArray[87] = "\u000b!\u0003K\u0000MUf\u001d\u001a;X\\g\u001eMPO1%\nGJFM`\u001a^E\"\u000bo\u0019U_^N\u007f\u0000Z;\u0018\u000ff\u0015\u001fTFHxD$";
        objectArray[88] = " #e\nU\f-bm\bi\u0012!$p\u0014\u0000\u0012@b#\u0017\u0006M/<d\tWv%`q\u0005T\u001d$#,\fi";
        objectArray[89] = "\nJf\u001a/\n[S=\u001c\u0015S\bVmEya\\\u0012=\u001f/6^Xb\u001d%V\u0018C3\u0012\u0015Y\u0005A5\u0018)\b\u001c\u001a3\"";
        objectArray[90] = "P^G05FXX\u00070_SNa\u00193#/D\u001c\u001c/f\u0010J^Dw_";
        Object[] objectArray2 = objectArray;
        objectArray[91] = "\u001e<\u0003hba\u0001f\u001b(\u001e{\n<\u0000dE\u007f\u00196\u0005Ddj\u001b0fsr8\u0012e\u001ees:\u0014]";
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A76;
        if (f[n2] == null) {
            m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }

    public static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0xB) & Short.MAX_VALUE;
        if (j[n2] == null) {
            m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.j[n2] = i[n2] ^ l;
        }
        return j[n2];
    }

    public static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void exec(LiteralArgumentBuilder literalArgumentBuilder) {
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("add").then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("name", new m$$1jOWsTPtmbJw41RuZ4W3HsnOh1UrckOKRyWBrJ2dTlnNzMWmXIoAwZsov6KCypcHhvjIkeyolQqDs34vtSdJ8oD9yR8jOJlp0()).executes(commandContext -> {
            block5: {
                String string;
                block7: {
                    block6: {
                        block4: {
                            string = (String)commandContext.getArgument("name", String.class);
                            try {
                                if (m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc.m$$eeMyaxx6EtrKQgapnwsBfYus2Tf4jZdxN5uuCS3Lv1FAAL4WLrNPxU47kATtSRqQ28fBhXxFqu7uNGtRFsASVQDde1Fb5GF75(string, -1158416209) != this.m$$tYPCqVTEwMHSL5qKxLiYhldokGzlMNeiNGBEB1zIT52A6PRFVcAOnt31hzq5jJFpcXnfmstTgVcRfzXy3WjSOcGi4CsN2w8sJ) break block4;
                                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)this.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(string, -1125606836).method_27693(this.m$$PDGdGO4cel3EgxdSiyQRYUtO2rjKzJMWTYO08WrbbOejXhJfxgYs2CgxiSm3t8FLc3SULtimqD4FCG3xI2XIW5lutCX38s0Lg(" is already in your %s list", 226439224)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1));
                                break block5;
                            } catch (class_151 class_1512) {
                                throw m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.a((Exception)((Object)class_1512));
                            }
                        }
                        try {
                            if (this.m$$tYPCqVTEwMHSL5qKxLiYhldokGzlMNeiNGBEB1zIT52A6PRFVcAOnt31hzq5jJFpcXnfmstTgVcRfzXy3WjSOcGi4CsN2w8sJ != m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4.m$$trJrfBZ4DSqFTJgfxJeAPEFwL9IFusafG32M3XGweDAP8P95xMjmPz5apbpszqFF3c3nOtSAkTDfn4gJ809acikpqOJNiCs2R) break block6;
                            m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc.m$$N7Fuy59jlFJoEyUR5zFCDWMJx9PRCjnqpN1gaG8rYDZDTw1x7RtxzjXMa8GGy4p8yLZ2qzDtg0NWKT6zxXY2Dmx65cghVSHV8(string, -209598813);
                            break block7;
                        } catch (class_151 class_1513) {
                            throw m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.a((Exception)((Object)class_1513));
                        }
                    }
                    m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc.m$$boSDDsnld9fpfI2CRgKHgbDs8IDUChFQx4u41dIxUQqbHFB7q7U49ZQqHgtfyR92qixZIWZtzmz4QKTOg7Px7NCDSmsciXVvN(string, 70784950);
                }
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)this.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(string, -1125606836).method_27693(this.m$$PDGdGO4cel3EgxdSiyQRYUtO2rjKzJMWTYO08WrbbOejXhJfxgYs2CgxiSm3t8FLc3SULtimqD4FCG3xI2XIW5lutCX38s0Lg(" has been added to your %s list", 226439224)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1));
            }
            return 1;
        })));
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8("remove", "delete", "del").then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("name", (ArgumentType)StringArgumentType.word()).suggests(this::m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW).executes(commandContext -> {
            block3: {
                String string;
                block2: {
                    string = (String)commandContext.getArgument("name", String.class);
                    try {
                        if (m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc.m$$eeMyaxx6EtrKQgapnwsBfYus2Tf4jZdxN5uuCS3Lv1FAAL4WLrNPxU47kATtSRqQ28fBhXxFqu7uNGtRFsASVQDde1Fb5GF75(string, -1158416209) != this.m$$tYPCqVTEwMHSL5qKxLiYhldokGzlMNeiNGBEB1zIT52A6PRFVcAOnt31hzq5jJFpcXnfmstTgVcRfzXy3WjSOcGi4CsN2w8sJ) break block2;
                        m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc.m$$YKijqkQLQFlJwGQrCPIf2qAeeJp0LiZ6TFS5dSgZkU3mS0GioiPLQzm08gbfsDQvbcNEGYQ9eOQB0bGLbkkn73y1F2xsqvkEt(string, 662049094);
                        m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)this.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(string, -1125606836).method_27693(this.m$$PDGdGO4cel3EgxdSiyQRYUtO2rjKzJMWTYO08WrbbOejXhJfxgYs2CgxiSm3t8FLc3SULtimqD4FCG3xI2XIW5lutCX38s0Lg(" has been removed from your %s list", 226439224)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1));
                        break block3;
                    } catch (class_151 class_1512) {
                        throw m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.a((Exception)((Object)class_1512));
                    }
                }
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)this.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(string, -1125606836).method_27693(this.m$$PDGdGO4cel3EgxdSiyQRYUtO2rjKzJMWTYO08WrbbOejXhJfxgYs2CgxiSm3t8FLc3SULtimqD4FCG3xI2XIW5lutCX38s0Lg(" is not your %s", 226439224)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1));
            }
            return 1;
        })));
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("list").executes(commandContext -> {
            List<class_2561> list = ((List)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc.getRegistry()).stream().filter(m$$EXhOqVmfGEfzvnY5kFMpwUvR6UAiXmNm6OreroFRvSo3VcovtRobmkPnaamZaZSvIjBRdypvatHxMtyExbC4XlVb2eoNhvejC -> {
                boolean bl;
                try {
                    bl = m$$EXhOqVmfGEfzvnY5kFMpwUvR6UAiXmNm6OreroFRvSo3VcovtRobmkPnaamZaZSvIjBRdypvatHxMtyExbC4XlVb2eoNhvejC.m$$R8IzWpNb5quz4Jq0IEsSGanjR6tnZmJakNW5BCLuHjqyvxKQXxtCnxaTtWtwpscYwr5AVJBSiASsOOctW16NIqQORd20KajEf() == this.m$$tYPCqVTEwMHSL5qKxLiYhldokGzlMNeiNGBEB1zIT52A6PRFVcAOnt31hzq5jJFpcXnfmstTgVcRfzXy3WjSOcGi4CsN2w8sJ;
                } catch (class_151 class_1512) {
                    throw m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.a((Exception)((Object)class_1512));
                }
                return bl;
            }).map(m$$EXhOqVmfGEfzvnY5kFMpwUvR6UAiXmNm6OreroFRvSo3VcovtRobmkPnaamZaZSvIjBRdypvatHxMtyExbC4XlVb2eoNhvejC -> class_2561.method_30163((String)m$$EXhOqVmfGEfzvnY5kFMpwUvR6UAiXmNm6OreroFRvSo3VcovtRobmkPnaamZaZSvIjBRdypvatHxMtyExbC4XlVb2eoNhvejC.getName())).toList();
            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)this.m$$PDGdGO4cel3EgxdSiyQRYUtO2rjKzJMWTYO08WrbbOejXhJfxgYs2CgxiSm3t8FLc3SULtimqD4FCG3xI2XIW5lutCX38s0Lg("%S list: ", 226439224)).method_10852(class_2564.method_37112(list, (class_2561)class_2561.method_30163((String)", "))), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1));
            return 1;
        }));
        literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("sync").then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("importer", new m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz(m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.class, "importer")).executes(commandContext -> {
            List list;
            m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU = (m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU)((Object)((Object)commandContext.getArgument("importer", m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.class)));
            try {
                list = m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.m$$tYPCqVTEwMHSL5qKxLiYhldokGzlMNeiNGBEB1zIT52A6PRFVcAOnt31hzq5jJFpcXnfmstTgVcRfzXy3WjSOcGi4CsN2w8sJ();
            } catch (Exception exception) {
                block8: {
                    block7: {
                        try {
                            if (!(exception instanceof FileNotFoundException)) break block7;
                            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)String.format("Couldn't find %s friends file", m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.m$$EPkkXEysRLWIx3KimJ9pdmLR8lhNeDYlZA0xnS0jwd85lREHIsVN02e1tfO102BCpAD3Zb2P3s4zi1o5oPsXycIhuDVoILVM8())).method_27694(class_25832 -> class_25832.method_10977(class_124.field_1061)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$c1YNZKIre9gha2PNXbjm2rL0bzZp8E5g5prysSUtCYmEx3s7kIMTKClUco1iXIJiAjIYkbL0q1wjtfH7ltIhAh8GLO8gPQEeU);
                            break block8;
                        } catch (Exception exception2) {
                            throw m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.a(exception2);
                        }
                    }
                    exception.printStackTrace();
                    m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)String.format("Couldn't import friends from %s due to an unknown error, check your log file", m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.m$$EPkkXEysRLWIx3KimJ9pdmLR8lhNeDYlZA0xnS0jwd85lREHIsVN02e1tfO102BCpAD3Zb2P3s4zi1o5oPsXycIhuDVoILVM8())).method_27694(class_25832 -> class_25832.method_10977(class_124.field_1061)), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$c1YNZKIre9gha2PNXbjm2rL0bzZp8E5g5prysSUtCYmEx3s7kIMTKClUco1iXIJiAjIYkbL0q1wjtfH7ltIhAh8GLO8gPQEeU);
                }
                return 1;
            }
            int n = 0;
            for (String string : list) {
                try {
                    if (m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc.m$$M7989IQcy9IbmX4HRPcB5WUosnSuLVOYZRRbJOdho8QM1pULpMrj0VqghBaPi3Ya9no4rLF8q8v5jyoRr75cmyrFcfOglxDjG(string, 2037109409)) continue;
                    m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc.m$$boSDDsnld9fpfI2CRgKHgbDs8IDUChFQx4u41dIxUQqbHFB7q7U49ZQqHgtfyR92qixZIWZtzmz4QKTOg7Px7NCDSmsciXVvN(string, 70784950);
                    ++n;
                } catch (Exception exception) {
                    throw m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.a(exception);
                }
            }
            m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)String.format("Added %d new friends from %s", n, m$$DhxGfE6KCcCy0RslZwkpmunUE9LNJXsVqrhIIawN6kt9SqlbfaofLUhjJBvG1XZC1d8yJkxHF7Iavp6pNSdKlg8K2kmeaXtrU.m$$EPkkXEysRLWIx3KimJ9pdmLR8lhNeDYlZA0xnS0jwd85lREHIsVN02e1tfO102BCpAD3Zb2P3s4zi1o5oPsXycIhuDVoILVM8())), m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(-1));
            return 1;
        })));
    }

    public CompletableFuture m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class_2172.method_9264(((List)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc.getRegistry()).stream().filter(m$$EXhOqVmfGEfzvnY5kFMpwUvR6UAiXmNm6OreroFRvSo3VcovtRobmkPnaamZaZSvIjBRdypvatHxMtyExbC4XlVb2eoNhvejC -> {
            boolean bl;
            try {
                bl = m$$EXhOqVmfGEfzvnY5kFMpwUvR6UAiXmNm6OreroFRvSo3VcovtRobmkPnaamZaZSvIjBRdypvatHxMtyExbC4XlVb2eoNhvejC.m$$R8IzWpNb5quz4Jq0IEsSGanjR6tnZmJakNW5BCLuHjqyvxKQXxtCnxaTtWtwpscYwr5AVJBSiASsOOctW16NIqQORd20KajEf() == this.m$$tYPCqVTEwMHSL5qKxLiYhldokGzlMNeiNGBEB1zIT52A6PRFVcAOnt31hzq5jJFpcXnfmstTgVcRfzXy3WjSOcGi4CsN2w8sJ;
            } catch (class_151 class_1512) {
                throw m$$yG7Vzn7UI3rX3AW1QetNZ1G1mwmbS3FV2xQUWBUSh6rFC9CJ6JnYCV1D0IlfuXaCj8eV1eoOwyYwQa6gHrql94o7iXneNX3PQ.a((Exception)((Object)class_1512));
            }
            return bl;
        }).map(m$$ai2OPmCv1Ik4Bf9MmMIhWdABomxdU9F78feCd0tTx0o2LclrgFD4fPbSdLMlzTFtzsZYcmSUSC7Yf9GKFuBGWqaoZ9eM43gC5::getName), (SuggestionsBuilder)suggestionsBuilder);
    }

    public static String m$$LIJvyFjo9H3UHpm096Ee0TnIDWRvpTKaiPRDacy4QOSr3wd7aGeOchtBzEVIX02gVFjHFaLZSfVPR5PaWYT1MXNqnDoaMihp8(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{95, -19, 53, -28, -24, 84, -111, 79, 34, 17, -71, 85, 47, -126, -60, 25, 28, 54};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 18]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public String m$$PDGdGO4cel3EgxdSiyQRYUtO2rjKzJMWTYO08WrbbOejXhJfxgYs2CgxiSm3t8FLc3SULtimqD4FCG3xI2XIW5lutCX38s0Lg(String string, int n) {
        return string.replace("%s", this.m$$tYPCqVTEwMHSL5qKxLiYhldokGzlMNeiNGBEB1zIT52A6PRFVcAOnt31hzq5jJFpcXnfmstTgVcRfzXy3WjSOcGi4CsN2w8sJ.m$$7domiMXdP0AbzmZJ7wjieTXY5vmFwYXsruP6zKV15BUAanluXAqEOE56sPKf3Br0YMXeXKtHMYWPWEutVduERBQ5oeKao7I9E()).replace("%S", m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.m$$kTxNO7bxOV7y8wK9SPrd5LIxH5FNuf0Ft3pd0g4UJb31q1GzlkxuhREyKEVW4hQbIzBrXCkIpsREzH7FxtYlJ7vjanvefIL3i(this.m$$tYPCqVTEwMHSL5qKxLiYhldokGzlMNeiNGBEB1zIT52A6PRFVcAOnt31hzq5jJFpcXnfmstTgVcRfzXy3WjSOcGi4CsN2w8sJ.m$$7domiMXdP0AbzmZJ7wjieTXY5vmFwYXsruP6zKV15BUAanluXAqEOE56sPKf3Br0YMXeXKtHMYWPWEutVduERBQ5oeKao7I9E()));
    }
}

