package me.mioclient;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Stream;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS;
import me.mioclient.m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw;
import me.mioclient.m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN;
import me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP;
import me.mioclient.m$$SyNr9C8dWqJg6VdbHL7kYfVmVwglSAxJTcs9lCtOM56jL280GMTyIe5Ii91cPIxP1TvSSDHgebxECtkpqaG12L2IZ5liKPIZf;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$ba3EwXzFDjrxDqwzVX7D1F3qaenqkJMoDymqcU6KW3nba2QV3KmV8O5GW3q72w5HxuNXLDbeUcoGgGxuZYsYE7N0JdbYSWAg3;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb;
import me.mioclient.m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52;
import me.mioclient.m$$lMcRaO6wUA7fAq8C7rFSq6SVNuoqQtLQGzyaCnOHIe10D09EEzkVXti2Z1Ro7PTzSKG2TM62uUCjhbwAwI3SMx0tXfi2U0vYY;
import net.minecraft.class_2172;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2564;
import net.minecraft.class_5250;
import net.minecraft.class_642;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0
extends m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP {
    public m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0() {
        super("waypoints");
        this.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("wp");
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
                                m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.k = new Object[104];
                                m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.l = new String[104];
                                m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.e();
                                var21 = new String[35];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW("2HuODw5fiM3gn7cv4sfC", MethodHandles.lookup(), "m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW", m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.class, 2107382497);
                                var20_3 = var18_2.length();
                                var17_4 = 12;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 19;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW("7rlsc7tUs2qqTpbzU1bs", MethodHandles.lookup(), "m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW", m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.class, 312271462);
                                    var20_3 = var18_2.length();
                                    var17_4 = 6;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 118;
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
                                            v15 = 94;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 25;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 12;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 25;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 45;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 51;
                                            break;
                                        }
                                        default: {
                                            v15 = 46;
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
                        m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.c = var21;
                        m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.d = new String[35];
                        var8_7 = 6926989336878534645L;
                        var14_8 = new long[70];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW("qOwYvIRoZyOaxndesibs", MethodHandles.lookup(), "m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW", m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.class, 1189195184);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW("xDC7X4NHQ8p5fVfAOMZ3", MethodHandles.lookup(), "m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW", m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.class, 670442065));
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
                            var12_10 =  /* dynamic constant */ (String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW("QU1FMMhGuyj3YPC3W9id", MethodHandles.lookup(), "m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW", m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.class, 1061940158);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW("PFL1ZfQrYjRYUBiiJgsH", MethodHandles.lookup(), "m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW", m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.class, 1704205255));
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
                m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.e = var14_8;
                m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.f = new Integer[70];
                m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -726102;
                var0_14 = 976476338443819265L;
                var6_15 = new long[11];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW("MmaNvoCrprN4H8XhXcCZ", MethodHandles.lookup(), "m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW", m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.class, 558611950);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW("KJDWmhtkGZvp0cdrhI96", MethodHandles.lookup(), "m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW", m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.class, 620679826));
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
                    var4_17 =  /* dynamic constant */ (String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW("21NVZV0dU2lQgEYiXXNU", MethodHandles.lookup(), "m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW", m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.class, 2073734617);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW("NM0rPc4KOKqZVm6T1prq", MethodHandles.lookup(), "m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW", m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.class, 538997339));
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
        m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.i = var6_15;
        m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.j = new Long[11];
        m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)1809368557593331554L);
    }

    public static void e() {
        Object[] objectArray = k;
        k[0] = "vhs$d\u001exa4,c\u00055`ym9\u0017Hd,9L#\u007fh\u0004&NChA)+96a\\\u000e\u00115\u0017CD+<l!_?4;X\u0017RYo/o5zJ7\u007f[\u0001h<l\u0000{\u0006P\\k.bBAz\n _'aK\u0017,B\u0002ny\u0010?~<Uf\u000e\u0005T\u001dUo\u001b&~9X=>\u0000=";
        objectArray[1] = Integer.TYPE;
        m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.l[1] = "java/lang/Integer";
        objectArray[2] = "\u0018$G\f>~\u0013+VCCf\u0000,_\n";
        objectArray[3] = "3VjY\b!:Xi\u0010K,\"P`\u0016\u0001'5K)\u0014\n $\\\u007f\u0003K\r?Tj\u0016\u000b*\u0013Vi\u0003\u00006$";
        objectArray[4] = "Z#OUyNQ,^\u001a\u0014NQ1J";
        objectArray[5] = "\b6<X\u0004\\\u00039-\u0017eR\b2)M";
        objectArray[6] = "[\u001d14\u001bdU\u0014v<\u001c\u007f\u0018\u0015;};rY*y8\u0017L\u0005\u0001p/\u0004h~7g\u0012EI\u0007\bF4\u001dyN\u001fS*FqO\b*\u0011\u001aIL\u0013w8Da\u0005\u001b/;7iD6e\u0001\u000b8\u0001\u0011I.\u0013:A\t/\u0010\n3T\u0019U7\u0013:n\u001b}\u00008@\u0006\u001f/8Gqq\r\\\u0016@<p\u0017f:\u0005";
        objectArray[7] = "ax>/@Qax)sL^{3)mLK|Bx4\u001b\t";
        objectArray[8] = Void.TYPE;
        m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.l[8] = "java/lang/Void";
        objectArray[9] = "\u001a[<3\u00190\u0014R{;\u001e+YS6z#&9L+\u001dH; OX9F\t\u0013\\Z\u0012G4.XD3&(\u0010RA\u001f\b\u0015#]ag\u001c\u001c\u0003q_kF5;\f*n7\u0012#G[;E\u0016\u001e\u0007#= \u0016\u000fn#\n\u0006\f$zZ9\u0015=\u000f{Q*\u001b/\u0006_UoB\u0013EwHk\u001c6<n[\u0004\u0016";
        objectArray[10] = "qP6!q[\u007fYq)v@2X<hty\u007fgy\u0003.CIt/*YE$v/>^gm\u0003K\u001aVAsDI8Te[Oa-[ZS}Q))\u0004X\u0005!\t]Nwc@8q\u0006F\u0004J#/dHOK\u0007_\u0006Hx.~ma__p.ouk|+\u001fUL,A@*q\u0006I\u0005n\u0015A";
        objectArray[11] = "4z\u000bN\u0015\u0011:sLF\u0012\nwr\u0001\u0007\u0015\u001a\u000ew@M,(\u001a\\b\u0011\u0010\u00133RDsI53-joD\f\u000fX\u0011[\u0019H=xLb\u001b/`ZMvD\u001cn&\u0013[\u0017'\u0018~u[\u0006\u0014j(VU\b0\u0013vrp\u001d\u0019\b,SO\f\u00073n@k2N\u001cT\u0012r93\u0018Hiu\u00179\u000e-]\u0016N";
        objectArray[12] = "(iW,\n_&`\u0010$\rDka]eTB\u0016e\b\u000f5Fq5O;\u0017G!40+\u0002suK!4\u0015y7Y\u00159'c\u000bk\u0016;\u0013z.>\t((B o0\u0018-F\tx2%7Q\u0015:(\"\u0019y3o\u000007I/HI\fZy3c\u001e*\u000fD\u000e>\u001b1U\u007f0KHtQ\t\u0003E4-\u0010";
        objectArray[13] = Boolean.TYPE;
        m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.l[13] = "java/lang/Boolean";
        objectArray[14] = "dk\u001d1?<dk\nm33~ \ns3&yQ\\-ge";
        objectArray[15] = "E{Y\u001f\u0007xKr\u001e\u0017\u0000c\u0006sSV!.~z\u0010\u0005=._F<\"]zFU-C%srK!\bWA_tD>\nu~j\u001c!\n~Zq91X%ppC?8/RX\"\u001e4qKK\u001f!8{jS\u000f*>/o{\u0000\u0011[MC'21\u0007~AS\u0014%;b\u007fv\u0004\u001e<.Of9$>";
        objectArray[16] = "\u0014xcJAeaXhEP*\u001c@{BYct";
        objectArray[17] = "0tQ\u0001,\u001f0tF] \u0010*?FC \u0005-N\u0012\u001bw";
        objectArray[18] = "Fd8\u0001\u0019kFd/]\u0015d\\//C\u0015q[^~\u001bG";
        objectArray[19] = "2'O-qY2'Xq}V(lXo}C/\u001d\t6*\u0004";
        objectArray[20] = "\f7|$LZ\u0012?fk!@\n:o&\u0016F\t8";
        objectArray[21] = "?@\u0011\u0018\u0007q1IV\u0010\u0000j|H\u001bQWW\u001a@W>\tl<b\f&YR\u0011r\u000b\u0000\u001d[\u0013NJ34(dH\t\u0018\\-7\u0012[/\r{\u0016lG<7/;D{$7g\u0002\u0014J!\u001dq\u0004\u001dPM\u000fJkBq\u0018),\u0017ggEZm\"\u0015h\u0010XQ\u001amQ#7'%a^G\t}5Ri\u0005$";
        objectArray[22] = "+Yfz\u0004\n5Q|5i\u0010,HqiK\u000b.J";
        objectArray[23] = "M\u0018\u0002#'\rS\u0010\u0018lo\rI\u001a\u0000+f\u0016\t?\u0001,j\fN\u0016\u001a";
        objectArray[24] = ":shs\u0014^${r<I_\"w\u007f\u007f\u0014x$`{sW";
        objectArray[25] = "\u000fk(9hU\u0011c2v\nI\u0016~";
        objectArray[26] = "Q!l<2d$\u0001g3#+Y\u0019t4*b1";
        objectArray[27] = "dG\u00035Q$mI\u0000|\u0012)uA\tzX\"bZ@yI\"kL\u000bi\u0012\u0019bY\u001brN.ci\u001c|I&bF\u001aYI\"kL\u000bi";
        objectArray[28] = " i_'\n\u000e)g\\nI\u00031oUh\u0003\b&t\u001ck\u0012\b/bW{I-*rW{\u0006\r\u0002tU|\n\u0004-rp|\u000e\r'c@";
        objectArray[29] = "I*Q\u0013\u0007@@$RZDMX,[\\\u000eFO7\u0012N\u001fHM OI\u0003@DkoH\rHO6HT\u0005Az7SK\u0003KO7";
        objectArray[30] = "\u001b7\u001f\u00001f\u00129\u001cIrk\n1\u0015O8`\u001d*\\O.n\r5\u0017@(zV\u000b\u0006\\5g\u001f\u0019\u0000I)d\u001d6\u0006z%y\u001d";
        objectArray[31] = "$rfg\u0012\u0017-|e.Q\u001a5tl(\u001b\u0011\"o%(\r\u001f2pn'\u000b\u000bi\\y.\n\u0015\"s\u007f\u001d\u0006\b\"";
        objectArray[32] = "\fz\u001bBR\b\u0002s\\JU\u0013Or\u0011\u000bJ\u0004/IoXt\u000bWwa`\u0003=%SQVU4\",Tvk$QKL[Q\u001fS^[\u0017_\u0005\u0000uG\u001eY\u0014(o\u0005vN\u0000Uf|b\f\u001e9M]Xz\u0016\u0011q{j_&\u0014z{EX=\u000fy}e|\u0005%tF}\b\t\f|\u0003\u001e\u000fS\u0005uzU\f";
        objectArray[33] = "#{\to7!*u\n&t,2}\u0003 >'%fJ\u00025#-u\n%";
        objectArray[34] = "\u00108&86a\u00196%qul\u0001>,w?g\u0016%et.g\u001f3.duO\u00010>{>`\u0007\u0015>\u007f7j\u0016%";
        objectArray[35] = "wR\n1`\u0016\u0002r\u0001>qYc|\n5u\u0003\u0017";
        objectArray[36] = "O A\u0018\u0011\u000fQ([WY\u000fK\"C\u0010P\u0014\u000b\u0011E\u001c[\u0013F C\u001c";
        objectArray[37] = "\u0016\u0006q\u0006&b\b\u000ekIGg\b\u000eh\ti{";
        objectArray[38] = "\u0017\rt\u0016G\u0012\u0019\u00043\u001e@\tT\u0005~_M(\rY\u001d\u001d[OH\"+\u0017e\u000f*<7N^\u0011#\fb>W\u0018\u000b8\"5\u007f8;<\u0002+m.1\u001e)+b2\u0003\u001f1\u0011bJN*\u0013\u0014vM;\u0005)MZH\u001024+]\u0004\f>\r1B\u0013\u000e\u0002(8[\u001c\u000b\u00121Kc\u0005\u0013+ MF\t(\u0012n\u0011L";
        objectArray[39] = "#[\u001d\u0017\bG#[\nK\u0004H9\u0010\nU\u0004]>a[\bR\u001c";
        objectArray[40] = "\u0015n\u0016a\u0002^\u001c`\u0015(AS\u0004h\u001c.\u000bX\u0013sU<\u001aV\u0011d\b;\u0006^\u0018/(:\bV\u0013r\u000f&\u0000_\u0005C\u000e&\u0003U\u0013s";
        objectArray[41] = "X'\u00102ReF/\n}\u001f\u007f\\%\u0013!\u000eu\\2H\u0010\u0013}B*\u0003'\u001dr^# &\be@#";
        objectArray[42] = "\u0015\u001cw/Os\u0015\u001c`sC|\u000fW`mCi\b&52\u0016";
        objectArray[43] = "/A\u0013m\u001c6/A\u00041\u001095\n\u0004/\u0010,2{QwC";
        objectArray[44] = "^u+%W\u0000+U *FOVM3-O\u0006>";
        objectArray[45] = "\n@W\u0002Ty\u0004I\u0010\nSbIH]K\\G2W\u0017'ZGSuL\u0002hx\u000fM \bJd\"W<5t`/\u001c=#TAWw\u000b:T%\u0011nO\u0015[@To)]\u007fsSvI5uP\brJ*VZ2l\u001d\b|W5P\tYj~\u000ek\b\u001coY\u0006\u0017\u001b\u001bPB\u0002\u001d\u0001\u001e\tg\u000f\u0011\b'P";
        objectArray[46] = Long.TYPE;
        m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.l[46] = "java/lang/Long";
        objectArray[47] = "L\u0004\\Le@G\u000bM\u0003\bDG\u0017yH:YC\u000bIH";
        objectArray[48] = "P\u001fh\u001eN&S\u0017$\u0003)0\u000e*1\u0019D6\"\u0007-\u000b)u\u0018P.\u0001Cv\u0010\u001c3f";
        objectArray[49] = "\u000b\bOO\u00065\u0018H\u0000\u0001:'\bOePU)\u001eOEL:%^\u000fUL^2UQ\u0005=";
        objectArray[50] = "y\u001e\u001aJA\u001ft@\u0016Q%\nxD\u000bD_daC\u0015PI\nw]\u0014X%\u0004'M\u0014M^\tyA\u000f)";
        objectArray[51] = "DC\t\u0001NHI\u001d\u0005\u001a*_E\u0006\u0018\u0003LXX}\u0004\\GP@\u0006\t\u0002KK$";
        objectArray[52] = "W{3hUaT;>c9zP{/uUH\u00046r)\t\u001fV|0*\u0003c\u0002|v-9";
        objectArray[53] = "'\u0002\u001a\buf~\u0005\u001a6nv;\u000f\fGd\u0017GF+GD&,#\u0015OTa'\u001b\u0011StjK6\u000e_rc]\u0010\u0010qz\u001e^F\u0013\b[\u0013}\u0003!wl7\\F7\f[jh ARg4F\u0006IT58h\u0012Kji ~F5ffeh #rF\u0017~\u000f\bM5<\\E!\u0006TkYMq\fi()\u0004\u0015\roa.}\u000bG5%h\u0010JI{1\u0017D\u0000\bs=}G\bDnZkEOQ1(g\u0006HK\u000b";
        objectArray[54] = "\u001e#D\\]\u0011\u001a?P\u0003d\u0016\f7R\u001e\u0018\u0016\u0007Z_\n\n\u001a\u001d*AY\u000eJ|<E\u000e\u001e\u0001\u00114S\u0006\u000b{";
        objectArray[55] = "*G\u0018'Ls.[\fxue(S\u0003\u0018\u0013e%D\u001fu\u001bs-Qe~\tt2D\bv\u001f|'>";
        objectArray[56] = "KrBk\u0015<O4@:%gO6X4IU\u0018u\u0006b\u001e\u0002\u001b;\u0006+Bh\u00183J6%k\u001a0\u0000c\u001bo\\2QS";
        objectArray[57] = "=_)&`Aj@!w\u001eImC#-r{<\u0004\u007fu&,9N}2yF:F1/\u001eE8E{z A~G*J";
        objectArray[58] = "TFa\tSY\u0004AcD>\f\u0011\u0007l\u0004O\u0006p{%#O&A\u0010@\u001dG6\u0006\u001bx\u0019[\u0016\rwU\u0006W\u0010\u0004as\u0018y\u0018yb%\u001b\u00009tA`)\u007f\u000eP`%?\u00049\rTCIZ\u0005SzeA\\W_TqCb\u000bGB%=n\u0004\u0002TC+z$pBl\u0000EW[`&)\u000e6\fe.yC\u0015\u0003So\u0006\\\u0018V\u001a\u001e\u0018A\u0000YB!\u001cN\n_+";
        objectArray[59] = "Lwt7n#Mq=0\u0017(\u001biOsx:\u0013x`u\u0017~\u0007+~n}}\u000fgc\t-7Gum`};\u0013~\u00062w7Jzyo+w\u0019\u0015";
        objectArray[60] = "W\u001bF]t\u0006\u0011\u0015\u001b\b\u0015\rF\u0000\u001f\ny?\u0017A@V)hW\rA\tj\u0005\u0013\u0002\u0018\u0014\u0015";
        objectArray[61] = "\u000e\u0010#e%r\u0003N/~Ar\tT2k-\t\u0000N.=\u007fv\u0005M%~AiPC-b:d\u000eO6\u0006";
        objectArray[62] = "k[2n`@oT8h\t\u0004wK4gr\u0003q$8kdBi@d`3\u0002\nE$cm\u00165A+ik\u007f";
        objectArray[63] = "juwMT1=j\u007f\u001c*9:i}FF\u000bl-$\u001f\u0011\\nd#YM6mloD*a7\u007fq_G6(w !";
        objectArray[64] = "\u0011~m|n`\u001c ag\n~\u00188\u0000pgp\u001c:=&ea\u000b@`!gx\u0015;m\u007fkcq";
        objectArray[65] = "\u0005\u0017J:\n\u0010\u0006\u001f\u0006'm\u0011[\u0000\b+\f\u001cGf\u000b=\\\u000bW\u0007\u0006'T\u001e<W\u0012|\u0001\u0019B\u0004\u001bs\u001fz";
        objectArray[66] = "\u0019-=Td\u0001N1d\u0002\u0015\u0002\u000bs\u0001_$\fY6\u0014\u007fl\tWg\u0002\ru\u001be\u0004\u001eX\u007f\u000bM\u000fej.\u001fV\r&i\\XZn?pJ\u001chfe\u000b^\u001b^\u0002\u0002QZ\u0005L\u0000awm)xccXj\"\u001d\u001c\u001dr|\u0006}'cXv\u0018D`kmO<]\u0000'Wi\u001b\u0019\u0001cR$$nc\u001c2,\u0016\u0019'=X/\u001eU:Z";
        objectArray[67] = "\u00078\u0014 }\u0000\t4]~C\u001a\u0014r,\u0013~G`\u0002+\u000b\u007f\u0003g\u001c\t{\u0003/q=\u00159\u001c\u000eR7+\u0005sDT\"R\u0005#4t\u0001\u00160\u007f c4\u0006\t\u001aA\\&?3\u0004\u0011\u0001/\u000f2*:y<\u0007\u0004\u001cDvb\u0012\u0006~\u000ew\u0000\u0001\u0000?\u0007F/\u0016\u0010|\u0003\u0002\u00041s{!E\u001a\t \u0007G\b\u0015#B~\u001fR2\u0013/)\u0000Zcm";
        objectArray[68] = "&BV\u0001}\u00188P\u000b\u0006\u001f\u0013o\u0003g\u0005F\u0014,qXhx\u0015\nj[jA.zsyWX+\n}A\u0001QJ\u0002LfgG\u001d!\u001fAg/\u0007=\u0015dJ',>r\nFa&/Azj/L\u001aL\u007fY[0\u001aRDEcK\u001ffp@ /r`XYf*\fP~q$&|BKgP\u0010\u0000c\u00028.\u0010}CXF}\u0019r];";
        objectArray[69] = "\u001b2n(.\u0002V1t%T\u0017\u0007rB\u007fk(Qdx)6(@;B\u000ej+K\u0006m\u0017/\u0016{\u0018X\t)\u001cT\"Z&\u001b0dnC\u0015?\u0012j\u0010M.\u000b\u0002Oe\u007f\u000245\u0011\u000fM=/;P\u0018V\u0019\u0015\u001bq\u0015v!+#t#~\u0001\u0005\u001dt2!:\u0019\u000f\u0014`Y+)2L\u001cS8\u001f\u0016\u0011\u001e|Gk\u0014R<!8e\u0018\u001bb\u001f~hI[,\u007f!.\u0015A^.!j\u001eH }(e\u0000+";
        objectArray[70] = "v}\u001f\u001cA2r;\u001dMqir9\u0005C\u001d[&}U\u0019K\f\"%\u000fH\u000fau:\u0007\u0019qe'?]\u0014Oaa=\f$";
        objectArray[71] = "sdi\u0011Ua#ck\\85{u{\u001bQ5\u001a0g_@6p3o\u0013]Qxpk^\u0001;|l\u007f\u00018";
        objectArray[72] = "[]4+|J^^?hBOXC9j9XY=:p\"\u000e\u000bB?s)M5";
        objectArray[73] = "0\u0004KoJG3\f\u0007r-@p\b\u001csVlf\u0013\u0012m@f`\u000e\u0018\u0017\u0014\\7\r\u0012}\u0017T{\u0010u&K\u0013e\u0016\u000buB\u001c{u";
        objectArray[74] = "7`Y\u00192Q)~\u001d\u001b]J;bbI=Ska\u001d\u0014a\u00138\u000eS\u0014cO4p\u0000\u001dlQW";
        objectArray[75] = "\u0010\u001170\u0015x\u0007\u0014tzgs\u0011\u0016o,\u000bAGU6r]\u0016\u0011Q3!\u0016r\u0006Zmqg+\u001c\u0000c5\n|\u0003\b2KZv\u0016\u0006q&\ri\u001eW\u000f";
        objectArray[76] = "h\u001f;`Z!f\u0013r>d;{U\u0007g#\u0001\u0006\"\u0005L+,;F\u0007L;<n2\u0004>\u000e'\u001b=siX#m\u001f\u000bF\t55I-l_&h5\rz\u001f .\u001e {\n\u0000\u0016+\u001dk\u000b4j\u0017\u0004?98\u0005;-[5\u001c/\u0014(g\u001cn\u0006\u001f)p\u0001\u0015\u001b&\u001ds\u0014\u0018%\u001e\"ET\u0000\r\u001a,\u0002]bl\t0b\u0002$0\u0013Bi\u001f!oC>=\u001fghy";
        objectArray[77] = "\u0019S+fbpXPt#\fk\t\u0007>g}ah{w@}AY\u0010\u0012~uQ\u001e\u001b*ziq\u0015w\u0007eew\u001ca!{K\u007fabwx2^lA2JMiH`w\\6^\u0015T\u0011*hbKz7\"n0GT# Pl_Bw^\\c\u001aT\u0011HHChB>cw0C`tJ<Q\u0014e|\u001a1nOG2wfqG\u0016L#05UY,|viO+r!mvC\u0010'djc%";
        objectArray[78] = "Sfx\u0007C\u0005\u0003azJ.P\u0016'ZO\u0011o@1`\u0019LoQnZ>\u0010lZSu'UQjM@9S[EwB\u0016awu;[%EU{EU\u001eqE^0g2Nr\u0000ZU\rU|AMN)o\\`@n\u0011Qdevf1\u007fZeg9\ncH\u00055A\u001bSu]IK\beQ\u0000KdwSI\u0004sv\bLDQ:\u0007I\u0015TBm<\u001cPSW\u000b";
        objectArray[79] = "\u0005,C5Z\t\u0002:\u0011r!Q\u0017k\u0005\u0013a{| G4dEd\u001e\u0011\u0011ls{&06lxI\u001cA{\u001fwF9?.Z\u007f\n\u000b5%g_E|\u0002\u0010CT\n\n\u0017\u0006G_I(BudWXxG\u0014Cz[!\f\u0017xt\\&\r\u0011eS]\u000b0(@V\u0004\n\u0003\nFvJx\u001b\u0016~q\u007f\u001f&K\u0018\b\u00007\u000e+GN\\-|uSS]6\u001a\"O\n\u000bG";
        objectArray[80] = "Hu\u0014O{\bVkPM\u0014\u0000E~HZy;F\u001bWGv\u0003DuAYw\u000b(*I\u001ax\u0019Vy@\u0015fz";
        objectArray[81] = "z&\u00068F;$hKm-1e#\u0017;BJz&\u00068F;$hKm-";
        objectArray[82] = "\u0018xl\u0013g)H\u007fn^\np\u000bzn\u0006g\u007f\r\u0015*\u00124a\u0016\u007f)\u001ax|qp(X6r\n,n\u000er\u0019\u0010jz\u0007c&\u0014ep\u0001\n";
        objectArray[83] = "\u0000\u0015\u0003}=z\u0004\u001a\t{T9\u0001\u0007\f\u001929\f\u0010\u0010t:/\u0004\u0005j\u007f((\u001b\u0010\u0007w> \u000ej";
        objectArray[84] = "K3(\u0007\u000f O<\"\u0001frZ!*\u001e\u001arQL'\n\b~K<9Y\f.**=\u000e\u001ceG\"+\u0006\t\u001f";
        objectArray[85] = " zt<t#.v=bJ930T\u00006\u0015~u72t#fs\\\u001f =\"&\\\u001a\u0014-SlS8v\ffz5:\n,`WD.\u0001\u0005MrIg/3pVF\u0012 5beL/1cb,Le\u000f#E]K\u001c-3&[12\u0004lzFM\u00052'Ssl\u0003&\u0017uPsa\u0001#MBD^s`$l\u007f>,&xv\rg;bg{gd3.z\u001c";
        objectArray[86] = "\u0011J*&\t\u001c\b\u0004`#fH\u0006\n8{\nzZLf fMU\u001b;x\u001d@\u000b\u0017 \u001c\u001c\\U\t'q]R\u001b\u001dX`^\u0013\fL*l\u001d\u0014\u0016v";
        objectArray[87] = "@O.,o\u0004\u0019H.\u0012t\u0014\\H\nlzFM|\u000er@{.N!xzFHQ*\"z\u0004\u000eh~mKs\u001bM|i,\u0003>\u000f5w D5b\u000e[acNv}xQY\u000fZ\n^sq,i'h}\u0002OM?Rk@\u0014O\"*Re9Byjj@ a)iI\u0004\u0016N\u0004~rr4wE+-\u0003\u0000B%tk_\u001a0|c/@\u0017Z\u007fkc]p";
        objectArray[88] = "X!\u000eck\u000f[)B~\f\u000b\u0006*Urp\u0019\f<0|l\b\u001b2T!7X\u0007P\tj2\u001d\u0006:\nb~\u0000a";
        objectArray[89] = "uK.\u007f6\u000b%L,2[^0\n#r*TQvjU*t`\u001d\u000fk\"d'\u00167o>D,z\u001ap2B%l<n\u001cJXojmekUL/_\u001a\\qmjIak,Y\f??Wrw*79\u0005~Y>5\u0007YfOjK\u000bV#Y\f]\u001fvQO#v \u0005zmi_kd-ha\u000f2VcV<?bQa\u001bQm\"F#\u001f;i>R|&o4:Cz\u001d:q=V\u001c";
        objectArray[90] = "W\u0015\u0000\u0013dLDUO]XT\u0015\u0002\u0002\u001c)^t~K;)~E\u0015.\u0005!n\u0002\u001e\u0016\u0001=N\tr;\u001e1H\u0000d\u001d\u0000\u001f@}gK\u0003fapD\u000e1\u0019VTeK'ba\tQ-Q<]W\u007f\u000bY:\u000f[Q\u001f[\u0004SCGK%\b\\\u0006Q-3\u001c|tG\u0002\u0018#\u000f_eH1hn\b`@a R[W\u001c\u000f6LZ_p\u0019?__D\u0002\b;\u0000[.";
        objectArray[91] = "\u0019!g\u0010\u00012\u001c\"lS?&\u0010$\u007fBE,\u0011.\u0007DR&\u001a;:\u0012P7\rAiK_vI>lHT5w";
        objectArray[92] = "#9v\u001f\u0001^ 1:\u0002fOb,)\u001bf\rkv0\u0000\f\u000ec:-g\u001bH$09\u0018\u0004EqyH";
        objectArray[93] = "?YJF\u0012%1U\u0003\u0018,?,\u0013PIV5MOSBj\u0001l\u0004P^j\u001b|UI{w\u0003X]Q\u007fTf[u}zQ\u0007OfNGw8fb\u000f[tg:G|IsjjAShK(OR\u000b\u0014MeyOIm\u0013`~Yit\u00131eMv\u0019m\u0010l\\X\\qcourdKd[\u000f\u000b$\u0015f;OADJ gU3\u001d]dxXY\u001eU(e?";
        objectArray[94] = "Cr`,.\u0014Ze!+Q\u0003\u0016%b,n\u001a\u00026\u0019\u001a??Zi\u00019\u0010\u0014]4`\n+\u000fP1\u001b\u001b+\u0019V6b\u000f\u001f\u001c\u0005D>\r.\u0016@0\u001c: \u000b\nv$7\u000e\fy{\u001dm\u000e*\u007fk0\n!\u0006hS\u00179*Y\\o \u000e2;tv!)>=`r&.7\u0016\u0006`f),:k2\u0005Tn\u0000Ckg+`\f\n5Ymm]J{92+\u0001P\t2/.^\u0000uf/hY:";
        objectArray[95] = "\u001d|\u0012_D=\u0013p[\u0001z-Of-T\u001f/\"#\u001a\u0003\u0002%H \u0012O\u001fB";
        objectArray[96] = "\u0019o\u001bP@zNp\u0013\u0001>rIs\u0011[R@\u00184M\u0003\u0005\u0017M7\u000b\u0004\u000e)Iq\tU>";
        objectArray[97] = "\u0006[ne%@\u0018E*gJI\u001aO8g/2\u0006\u000b8m.I\u000bU4vJ";
        objectArray[98] = "d\u0005\u0011cyRu\u0001Ng\u0013Gf/\u001b~~ '\u0002\u000f9|_z^Oj\u0013\u001b|\u0012CjlF R\u0010\u0005";
        objectArray[99] = ">;\u001akk3>k\u001c \u000f\u0017qzAk7;\u0002j0'Ex\u0007l\u0003fit#`;TI :E1 u\u000e9w\u0014^h\u0017\u00003\u0014#lv*VJ 2\r;d\rZK%\u007f`\u001cxV\u001b k.X>.\u0001`6&}0p`:a]\n\u0006g;y^\u0002\u001cYH}k\u000e\u0012v=huq\"0#\u001aq;,l\u001b$f7ytq#3r0y\u0011|u.*\u000b";
        objectArray[100] = "\\;v\u0018T=R7?Fj'OqRBU\u0018\u0019gh\u0014\b\u0018\b8R3T\u001b\u0003\u0005}*\u0011&3\u001bH4\u0017,\u001c!J\u001b%\u0000,mS(\u0001\"\"\u0013]\u001352\u0007fo?\n\u0005Y\f]\u0000\u0011\u000b\u0018\u001bF$++9\u0016f\u001c\u0015\u0013< n<;-<11\u0007'?\\cI\u0016\u0017\u0002\u0004\u001fC\u0005!&Y\u001dlz[$]1l\u0004\b-R/\u000fCVy\u0013/o\u001c\u0010%\t]1A\u000b:\u0005fd\u0004\f/c";
        objectArray[101] = "\u0019P\u007f\u0011OI\u0017\\6OqS\n\u001a^\u001d\u0015nGv?\r,fMOf\u0016Knfl9J\u0000h\u001cvx(<\u000fg\n7\u000fN[TX{8*vV[?\u001e+pkz@\r\fJK\u000f:\u0014.\r\u001f\u007f6\n:M{M;/\u001fNxdW?,gL]{\u0001\u001f\u0006\u0016vi\u001a\u0013lkF\u007f/\u0012\u000f^}hsHG\u0018Na\u0019KOTS\u0006J\u0000\b^QlI\bDC67\u0015OZEHd\u001c@D&";
        objectArray[102] = "3\u001cJ\u0014GM>BF\u000f#J4fF\f_63L\u001c\u001cLD-RX\u001e#";
        Object[] objectArray2 = objectArray;
        objectArray[103] = "2}xr\b*<q1,64vGf\u007fY1`w\u0001!Pkax\u007frYd\u007f\u001b";
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6BD3;
        if (f[n2] == null) {
            m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }

    public static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x2DB4) & Short.MAX_VALUE;
        if (j[n2] == null) {
            m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.j[n2] = i[n2] ^ l;
        }
        return j[n2];
    }

    public static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public void exec(LiteralArgumentBuilder literalArgumentBuilder) {
        try {
            ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("add").then(((RequiredArgumentBuilder)me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("name", (ArgumentType)StringArgumentType.string()).then(((RequiredArgumentBuilder)me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("pos", new m$$Ktu8r6XVKuu1kvzwbvlYQTCms7n0YDHROvXbvnWyiig6Prsv5H9pshJcz5tAzcCPbFcJm2sllbAuv8SWs55ONCfPu0NEhKgiN()).executes(commandContext -> {
                String string = (String)commandContext.getArgument("name", String.class);
                class_243 class_2432 = (class_243)commandContext.getArgument("pos", class_243.class);
                String string2 = m$$SyNr9C8dWqJg6VdbHL7kYfVmVwglSAxJTcs9lCtOM56jL280GMTyIe5Ii91cPIxP1TvSSDHgebxECtkpqaG12L2IZ5liKPIZf.m$$qPHGOo3wMyWQeREOHiDuEDzS586KuvKmsC9DAfNcv3vSjh9EcEnczg66Mkk73WjFhnxTQHoiyRLonDDkij7EwIoJy7oUWMLPR(441516802).m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N().toLowerCase();
                m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 = new m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52(string, class_2432, string2, m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO(-1435993114));
                m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$KcR3pBYeC19Y8Qn24indLRONxtu1ZvZo2PE2v8ul82ZzltR8FJAWeplACK8Oq7tOudLlx9JIpSawiPQjobfcAoy7mrQnRdGnh.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52, -500751825);
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.b((int)3371, (int)11637)).method_10852(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52.m$$IY50PTNA4tWJl1HXAkpsWybaNO83dt7OhCDWsz4WSbcCQ6lpZyOf1yjxaMIjbNW3F4wL5yGVdJtpvysZ7t2RT90VuLljL08CF()).method_27693(" has been created"), -1);
                return 1;
            })).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("dimension", new m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz(m$$lMcRaO6wUA7fAq8C7rFSq6SVNuoqQtLQGzyaCnOHIe10D09EEzkVXti2Z1Ro7PTzSKG2TM62uUCjhbwAwI3SMx0tXfi2U0vYY.class, "dimension")).executes(commandContext -> {
                String string = (String)commandContext.getArgument("name", String.class);
                class_243 class_2432 = (class_243)commandContext.getArgument("pos", class_243.class);
                m$$lMcRaO6wUA7fAq8C7rFSq6SVNuoqQtLQGzyaCnOHIe10D09EEzkVXti2Z1Ro7PTzSKG2TM62uUCjhbwAwI3SMx0tXfi2U0vYY m$$lMcRaO6wUA7fAq8C7rFSq6SVNuoqQtLQGzyaCnOHIe10D09EEzkVXti2Z1Ro7PTzSKG2TM62uUCjhbwAwI3SMx0tXfi2U0vYY = (m$$lMcRaO6wUA7fAq8C7rFSq6SVNuoqQtLQGzyaCnOHIe10D09EEzkVXti2Z1Ro7PTzSKG2TM62uUCjhbwAwI3SMx0tXfi2U0vYY)commandContext.getArgument("dimension", m$$lMcRaO6wUA7fAq8C7rFSq6SVNuoqQtLQGzyaCnOHIe10D09EEzkVXti2Z1Ro7PTzSKG2TM62uUCjhbwAwI3SMx0tXfi2U0vYY.class);
                m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 = new m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52(string, class_2432, m$$lMcRaO6wUA7fAq8C7rFSq6SVNuoqQtLQGzyaCnOHIe10D09EEzkVXti2Z1Ro7PTzSKG2TM62uUCjhbwAwI3SMx0tXfi2U0vYY.m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N().toLowerCase(), m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO(-1435993114));
                m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$KcR3pBYeC19Y8Qn24indLRONxtu1ZvZo2PE2v8ul82ZzltR8FJAWeplACK8Oq7tOudLlx9JIpSawiPQjobfcAoy7mrQnRdGnh.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52, -500751825);
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.b((int)3371, (int)11637)).method_10852(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52.m$$IY50PTNA4tWJl1HXAkpsWybaNO83dt7OhCDWsz4WSbcCQ6lpZyOf1yjxaMIjbNW3F4wL5yGVdJtpvysZ7t2RT90VuLljL08CF()).method_27693(" has been created"), -1);
                return 1;
            })))).executes(commandContext -> {
                String string = (String)commandContext.getArgument("name", String.class);
                String string2 = m$$SyNr9C8dWqJg6VdbHL7kYfVmVwglSAxJTcs9lCtOM56jL280GMTyIe5Ii91cPIxP1TvSSDHgebxECtkpqaG12L2IZ5liKPIZf.m$$qPHGOo3wMyWQeREOHiDuEDzS586KuvKmsC9DAfNcv3vSjh9EcEnczg66Mkk73WjFhnxTQHoiyRLonDDkij7EwIoJy7oUWMLPR(441516802).m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N().toLowerCase();
                class_243 class_2432 = m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_19538();
                m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 = new m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52(string, class_2432, string2, m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO(-1435993114));
                m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$KcR3pBYeC19Y8Qn24indLRONxtu1ZvZo2PE2v8ul82ZzltR8FJAWeplACK8Oq7tOudLlx9JIpSawiPQjobfcAoy7mrQnRdGnh.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52, -500751825);
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.b((int)3366, (int)16127)).method_10852(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52.m$$IY50PTNA4tWJl1HXAkpsWybaNO83dt7OhCDWsz4WSbcCQ6lpZyOf1yjxaMIjbNW3F4wL5yGVdJtpvysZ7t2RT90VuLljL08CF()).method_27693(" has been created"), -1);
                return 1;
            })))).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8("remove", "delete", "del").then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("server", (ArgumentType)StringArgumentType.string()).suggests(m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0::m$$0a6satRcVmfiZwanl0RgzcMCb0erhZREX3tKsob6XE1D4QKMc68LuPqxPdhcvQymN439ibhFWuDkCK4ezfpJrVIkGLaGWuoTq).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("name", (ArgumentType)StringArgumentType.string()).suggests(m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0::m$$q60MFbe6wdivWp4kRCKnlZZPlYEn3tV4kfyfYvLxmOjTDK7AxLlTtFsQ579mT62x8LKzvOCLsSewKyc0PBtW1vCddwE5OeN7R).executes(commandContext -> {
                String string = (String)commandContext.getArgument("name", String.class);
                String string2 = (String)commandContext.getArgument("server", String.class);
                ((List)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$KcR3pBYeC19Y8Qn24indLRONxtu1ZvZo2PE2v8ul82ZzltR8FJAWeplACK8Oq7tOudLlx9JIpSawiPQjobfcAoy7mrQnRdGnh.getRegistry()).removeIf(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 -> {
                    boolean bl;
                    block5: {
                        block4: {
                            try {
                                try {
                                    if (!string2.equalsIgnoreCase(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52.m$$QVtAia2d6wqgYIbi52YLVyDxVn4Xqn0lHxwCAxCQZfL1mggBCDbauqIys7u8I3MwRINJog1O4dF8mRHSpsDgiUdCbDv7CwZVA(1540327435)) || !string.equalsIgnoreCase(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52.getName())) break block4;
                                } catch (IllegalArgumentException illegalArgumentException) {
                                    throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
                                }
                                bl = true;
                                break block5;
                            } catch (IllegalArgumentException illegalArgumentException) {
                                throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
                            }
                        }
                        bl = false;
                    }
                    return bl;
                });
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.b((int)3371, (int)11637)).method_27693(string).method_27693(" has been removed"), -1);
                return 1;
            }))))).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("rename").then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("server", (ArgumentType)StringArgumentType.string()).suggests(m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0::m$$0a6satRcVmfiZwanl0RgzcMCb0erhZREX3tKsob6XE1D4QKMc68LuPqxPdhcvQymN439ibhFWuDkCK4ezfpJrVIkGLaGWuoTq).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("name", (ArgumentType)StringArgumentType.string()).suggests(m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0::m$$q60MFbe6wdivWp4kRCKnlZZPlYEn3tV4kfyfYvLxmOjTDK7AxLlTtFsQ579mT62x8LKzvOCLsSewKyc0PBtW1vCddwE5OeN7R).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("target", (ArgumentType)StringArgumentType.string()).executes(commandContext -> {
                String string = (String)commandContext.getArgument("name", String.class);
                String string2 = (String)commandContext.getArgument("server", String.class);
                String string3 = (String)commandContext.getArgument("target", String.class);
                Predicate<m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52> predicate = m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 -> {
                    boolean bl;
                    block5: {
                        block4: {
                            try {
                                try {
                                    if (!string2.equalsIgnoreCase(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52.m$$QVtAia2d6wqgYIbi52YLVyDxVn4Xqn0lHxwCAxCQZfL1mggBCDbauqIys7u8I3MwRINJog1O4dF8mRHSpsDgiUdCbDv7CwZVA(1540327435)) || !string.equalsIgnoreCase(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52.getName())) break block4;
                                } catch (IllegalArgumentException illegalArgumentException) {
                                    throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
                                }
                                bl = true;
                                break block5;
                            } catch (IllegalArgumentException illegalArgumentException) {
                                throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
                            }
                        }
                        bl = false;
                    }
                    return bl;
                };
                m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x522 = m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$KcR3pBYeC19Y8Qn24indLRONxtu1ZvZo2PE2v8ul82ZzltR8FJAWeplACK8Oq7tOudLlx9JIpSawiPQjobfcAoy7mrQnRdGnh.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(predicate).orElse(null);
                try {
                    if (m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x522 == null) {
                        m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2561.method_30163((String)"Waypoint not found"), -1);
                        return 1;
                    }
                } catch (IllegalArgumentException illegalArgumentException) {
                    throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
                }
                ((List)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$KcR3pBYeC19Y8Qn24indLRONxtu1ZvZo2PE2v8ul82ZzltR8FJAWeplACK8Oq7tOudLlx9JIpSawiPQjobfcAoy7mrQnRdGnh.getRegistry()).removeIf(predicate);
                ((List)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$KcR3pBYeC19Y8Qn24indLRONxtu1ZvZo2PE2v8ul82ZzltR8FJAWeplACK8Oq7tOudLlx9JIpSawiPQjobfcAoy7mrQnRdGnh.getRegistry()).add(new m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52(string3, m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x522.m$$MmOWYSOFGzd7MFWj1CN4bqDL9c4u2nALecj8gf3p7DGpsvqojqfVIZWagb5fN5UnZJgQYJpebmp8YnczmCDWWyxNzohO8VRkf(-664058064), m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x522.m$$kergExhnNSd3krNItbrWSQPjjSp4SBFVuUGQukSjnU4wP52pGeW8bvhDozGe08i7qxrA72vnRX7cmzM5IBdkcpU1gBIHo6S80(1224732480), m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x522.m$$QVtAia2d6wqgYIbi52YLVyDxVn4Xqn0lHxwCAxCQZfL1mggBCDbauqIys7u8I3MwRINJog1O4dF8mRHSpsDgiUdCbDv7CwZVA(1540327435)));
                class_5250 class_52502 = class_2561.method_43470((String)m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.b((int)3371, (int)11637));
                class_52502 = class_52502.method_27693(string);
                class_52502 = class_52502.method_27693(" has been renamed to");
                class_52502 = class_52502.method_27693(string3);
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_52502, -1);
                return 1;
            })))))).then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("list").executes(commandContext -> {
                List<class_2561> list = ((List)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$KcR3pBYeC19Y8Qn24indLRONxtu1ZvZo2PE2v8ul82ZzltR8FJAWeplACK8Oq7tOudLlx9JIpSawiPQjobfcAoy7mrQnRdGnh.getRegistry()).stream().sorted(Comparator.comparing(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52::isToggled).reversed()).map(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52::m$$IY50PTNA4tWJl1HXAkpsWybaNO83dt7OhCDWsz4WSbcCQ6lpZyOf1yjxaMIjbNW3F4wL5yGVdJtpvysZ7t2RT90VuLljL08CF).toList();
                class_5250 class_52502 = class_2561.method_43473();
                class_52502.method_27693("Waypoints list: ");
                class_52502.method_10852(class_2564.method_37112(list, (class_2561)class_2561.method_43470((String)", ")));
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_52502, -1);
                return 1;
            }));
            literalArgumentBuilder.then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.literal("toggle").then(me.mioclient.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP.argument("name", (ArgumentType)StringArgumentType.string()).suggests(m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0::m$$q60MFbe6wdivWp4kRCKnlZZPlYEn3tV4kfyfYvLxmOjTDK7AxLlTtFsQ579mT62x8LKzvOCLsSewKyc0PBtW1vCddwE5OeN7R).executes(commandContext -> {
                String string;
                Object[] objectArray;
                String string2;
                boolean bl;
                m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x522;
                String string3 = (String)commandContext.getArgument("name", String.class);
                String string4 = m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO((((m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.b(7614, 4061193717163554379L) >>> 17 | 0x6CD0000) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) - 28028 << 7 | 0x66) ^ 0x776D7C00);
                Predicate<m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52> predicate = m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 -> {
                    boolean bl;
                    block5: {
                        block4: {
                            try {
                                try {
                                    if (!string4.equalsIgnoreCase(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52.m$$QVtAia2d6wqgYIbi52YLVyDxVn4Xqn0lHxwCAxCQZfL1mggBCDbauqIys7u8I3MwRINJog1O4dF8mRHSpsDgiUdCbDv7CwZVA(1540327435)) || !string3.equalsIgnoreCase(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52.getName())) break block4;
                                } catch (IllegalArgumentException illegalArgumentException) {
                                    throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
                                }
                                bl = true;
                                break block5;
                            } catch (IllegalArgumentException illegalArgumentException) {
                                throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
                            }
                        }
                        bl = false;
                    }
                    return bl;
                };
                m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x523 = m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$KcR3pBYeC19Y8Qn24indLRONxtu1ZvZo2PE2v8ul82ZzltR8FJAWeplACK8Oq7tOudLlx9JIpSawiPQjobfcAoy7mrQnRdGnh.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(predicate).orElse(null);
                try {
                    if (m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x523 == null) {
                        m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2561.method_30163((String)"Waypoint not found"), -1);
                        return 1;
                    }
                } catch (IllegalArgumentException illegalArgumentException) {
                    throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
                }
                try {
                    m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x522 = m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x523;
                    bl = !m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x523.isToggled();
                } catch (IllegalArgumentException illegalArgumentException) {
                    throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
                }
                try {
                    m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x522.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(bl, -1780824764);
                    string2 = "Made the waypoint %s %s.";
                    Object[] objectArray2 = new Object[2];
                    objectArray2[0] = string3;
                    Object[] objectArray3 = objectArray2;
                    objectArray = objectArray2;
                    int n = 1;
                    string = m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x523.isToggled() ? "visible" : "invisible";
                } catch (IllegalArgumentException illegalArgumentException) {
                    throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
                }
                objectArray3[n] = string;
                String string5 = string2.formatted(objectArray);
                m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2561)class_2561.method_43470((String)string5), -1);
                return 1;
            })));
            if (m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$BwEiPcdKHeam8Th0opyulrerFft2CdWz9fdwcP2Qplk3IYuKZt2JqwHabX9voGHQZ7psnWWdR9JO4Jg1hAXQx3x8cDnLYPk4u.m$$T5QjgVkXokAMhZVP1TJgOUAZr1F4IkUWPcj8rW8yv2Wz0RuU9vvXdfIZ82QkLiLNQuwut5TACp7Q9GkiqTGwMA3X7exWGnKD1()) {
                this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(new m$$ba3EwXzFDjrxDqwzVX7D1F3qaenqkJMoDymqcU6KW3nba2QV3KmV8O5GW3q72w5HxuNXLDbeUcoGgGxuZYsYE7N0JdbYSWAg3(), literalArgumentBuilder);
                this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(new m$$GuNjZHMsCJwJnaLnSowhAkk1wtmpeBCSGAukx2ecbnubRQIa4P5tOGoQShUalia7COHg8JbM0yMoGzz6qI5I9hg3vbWfmmbnS(), literalArgumentBuilder);
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
        }
    }

    public static String m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52) {
        String string = m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52.m$$QVtAia2d6wqgYIbi52YLVyDxVn4Xqn0lHxwCAxCQZfL1mggBCDbauqIys7u8I3MwRINJog1O4dF8mRHSpsDgiUdCbDv7CwZVA(1540327435).toLowerCase();
        try {
            if (string.contains(":")) {
                return new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\"\u0001\"");
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
        }
        return string;
    }

    public static CompletableFuture m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder, String string) {
        Stream<String> stream = ((List)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$KcR3pBYeC19Y8Qn24indLRONxtu1ZvZo2PE2v8ul82ZzltR8FJAWeplACK8Oq7tOudLlx9JIpSawiPQjobfcAoy7mrQnRdGnh.getRegistry()).stream().filter(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 -> m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52.m$$QVtAia2d6wqgYIbi52YLVyDxVn4Xqn0lHxwCAxCQZfL1mggBCDbauqIys7u8I3MwRINJog1O4dF8mRHSpsDgiUdCbDv7CwZVA(1540327435).equalsIgnoreCase(string)).map(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52::getName);
        return class_2172.method_9264(stream, (SuggestionsBuilder)suggestionsBuilder);
    }

    public static CompletableFuture m$$q60MFbe6wdivWp4kRCKnlZZPlYEn3tV4kfyfYvLxmOjTDK7AxLlTtFsQ579mT62x8LKzvOCLsSewKyc0PBtW1vCddwE5OeN7R(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        String string;
        try {
            string = (String)commandContext.getArgument("server", String.class);
        } catch (IllegalArgumentException illegalArgumentException) {
            string = m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO(-1435993114);
        }
        return m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(commandContext, suggestionsBuilder, string);
    }

    public static class_243 m$$ZaD3M0jv7OKLL5o46rdCtPy8hIHUWkQwHiymBJrAs8Rx7AkYyizdJsbYM7bheQ2XDJQqqsI7QTERMWze3ESAiWCzZZRMyzfVV(CommandContext commandContext, int n) {
        String string = (String)commandContext.getArgument("name", String.class);
        m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52 m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x522 = m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$KcR3pBYeC19Y8Qn24indLRONxtu1ZvZo2PE2v8ul82ZzltR8FJAWeplACK8Oq7tOudLlx9JIpSawiPQjobfcAoy7mrQnRdGnh.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((T m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52) -> m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x52.m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf(string, m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO(-1435993114))).orElse(null);
        try {
            if (m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x522 == null) {
                return null;
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
        }
        return m$$cUw1Gfu22JqlKrPTm5plYd8EyeqPxNQEATXPCSKvsPLOywkjL74BIoX0Ams6t5jZnPsyvVWJlntjrCuaqzk0MxiCz6htRz4jb.m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T(m$$idWhenPVCCG2lmjMaP5Kj2OL8rVG4xe6dgiAgQ9EhU8b796xkYAaPxzj37svtNJiWSagQ3vlpyjqeHN0EK7QEMAWLVkGW2x522, ((((0x915AD4F6 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) >>> 7 | (0x915AD4F6 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) << 25) ^ n) >>> 3 | (((0x915AD4F6 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) >>> 7 | (0x915AD4F6 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) << 25) ^ n) << 29) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01);
    }

    public static String m$$pGvcv5DChYKVvlbcv0ig8c4vP3wRCcu1s53F7xm9tMZCAxS6N0bHiwbGDjATQjrd27urHrplwo0KUAz4pspXYdsP4nvIdkBLO(int n) {
        class_642 class_6422;
        block7: {
            class_6422 = m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.field_3944.method_45734();
            try {
                if (class_6422 == null) {
                    return "singleplayer";
                }
            } catch (IllegalArgumentException illegalArgumentException) {
                throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
            }
            String[] stringArray = class_6422.field_3761.split(":");
            try {
                try {
                    if (stringArray.length != ((1629427546 - (((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF) << 2) ^ n) - (((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF) << 1) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) - ((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF) || !stringArray[1].equalsIgnoreCase("25565")) break block7;
                } catch (IllegalArgumentException illegalArgumentException) {
                    throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
                }
                return stringArray[0];
            } catch (IllegalArgumentException illegalArgumentException) {
                throw m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0.a(illegalArgumentException);
            }
        }
        return class_6422.field_3761;
    }

    public static String m$$StnCpxhkKqrkEGhS76W1vVXhTxIj2C92RdoQYKrTrrZjYjbWMVq3MKgM0APwqLgOh91eUzqnF9BBYVJmUuRbsHJKla3RGqEjW(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-69, -43, -38, -76, -110, 16, -67, 85, 102, -85, -86, -44, 10, 16};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 14]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public static CompletableFuture m$$0a6satRcVmfiZwanl0RgzcMCb0erhZREX3tKsob6XE1D4QKMc68LuPqxPdhcvQymN439ibhFWuDkCK4ezfpJrVIkGLaGWuoTq(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class_2172.method_9264(((List)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$KcR3pBYeC19Y8Qn24indLRONxtu1ZvZo2PE2v8ul82ZzltR8FJAWeplACK8Oq7tOudLlx9JIpSawiPQjobfcAoy7mrQnRdGnh.getRegistry()).stream().map(m$$4fSiqpARdeYoC2sLtb4GzQSX8fXIvuaPD2irUfIT2fbDaGj6Vps11IvwKQ6go3ZwWiRVzFJeOsutMvsMNkSLYlNbFosHC0cI0::m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8).distinct(), (SuggestionsBuilder)suggestionsBuilder);
    }
}

