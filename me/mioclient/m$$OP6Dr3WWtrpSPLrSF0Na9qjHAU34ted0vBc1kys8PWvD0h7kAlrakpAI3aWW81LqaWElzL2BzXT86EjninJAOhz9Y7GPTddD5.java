package me.mioclient;

import java.io.ByteArrayOutputStream;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5 {
    public static byte[] m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn(byte[] byArray, int n) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Inflater inflater = new Inflater();
            inflater.setInput(byArray);
            byte[] byArray2 = new byte[(m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.a(30540, 8878660278448310556L) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & n) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) ^ (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 | n)];
            while (!inflater.finished()) {
                int n2 = inflater.inflate(byArray2);
                try {
                    if (n2 == 0) {
                        break;
                    }
                } catch (Exception exception) {
                    throw m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.a(exception);
                }
                byteArrayOutputStream.write(byArray2, 0, n2);
            }
            inflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception exception) {
            throw new RuntimeException();
        }
    }

    public static byte[] m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(byte[] byArray, int n) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(n);
        deflater.setInput(byArray);
        deflater.finish();
        byte[] byArray2 = new byte[((int)(m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.b(19681, 5957318466201119950L) - 6264L) ^ 0x7104) << 16 | 0x2000];
        while (!deflater.finished()) {
            int n2 = deflater.deflate(byArray2);
            byteArrayOutputStream.write(byArray2, 0, n2);
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                block10: {
                    block9: {
                        m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.e = new Object[27];
                        m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.f = new String[27];
                        m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.a();
                        var8 = 3844325632963328673L;
                        var14_1 = new long[6];
                        var11_2 = 0;
                        var12_3 =  /* dynamic constant */ (String)m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm("Obimn15ikn5DO5x1i7fm", MethodHandles.lookup(), "m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm", m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.class, 1668446654);
                        var13_4 = var12_3.length();
                        var10_5 = 0;
                        while (true) {
                            var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes( /* dynamic constant */ (String)m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm("HDjhW8imGDlbSqnHcXwF", MethodHandles.lookup(), "m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm", m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.class, 1562133589));
                            v0 = var14_1;
                            v1 = var11_2++;
                            v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                            v3 = -1;
                            break block9;
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            var12_3 =  /* dynamic constant */ (String)m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm("1BD2cvbaYoFWL2dgeKyN", MethodHandles.lookup(), "m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm", m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.class, 1353875755);
                            var13_4 = var12_3.length();
                            var10_5 = 0;
                            while (true) {
                                var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes( /* dynamic constant */ (String)m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm("tBfvN5xmQbxXNxgUrVlH", MethodHandles.lookup(), "m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm", m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.class, 1643601259));
                                v0 = var14_1;
                                v1 = var11_2++;
                                v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                                v3 = 0;
                                break block9;
                                break;
                            }
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            break block10;
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
                m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.a = var14_1;
                m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.b = new Integer[6];
                m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -995799;
                var0_7 = 7775180416041817339L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 =  /* dynamic constant */ (String)m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm("Sk1QgUCAqcp0NydYOqNh", MethodHandles.lookup(), "m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm", m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.class, 1257666138);
                var5_11 = var4_10.length();
                var2_12 = 0;
                while (true) {
                    break block11;
                    break;
                }
lbl54:
                // 1 sources

                while (true) {
                    var6_8[v5] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block12;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes( /* dynamic constant */ (String)m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm("Jo1OF5dXqbD0A7fnAn0M", MethodHandles.lookup(), "m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm", m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.class, 1619921334));
            v5 = var3_9++;
            ** while (true)
        }
        m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.c = var6_8;
        m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.d = new Long[3];
        m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)1925115634465281330L);
    }

    public static Exception a(Exception exception) {
        return exception;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3E54;
        if (b[n2] == null) {
            m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x202D) & Short.MAX_VALUE;
        if (d[n2] == null) {
            m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.d[n2] = c[n2] ^ l;
        }
        return d[n2];
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "\"q\u0010\nV+'>$\u0012\f'\tb\u0014\n\u0001\r=d\u0016\u001e\f\u0011<b\u0003\n\u0015";
        objectArray[1] = "\u0003\"";
        objectArray[2] = "hx";
        objectArray[3] = Integer.TYPE;
        m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.f[3] = "java/lang/Integer";
        objectArray[4] = Void.TYPE;
        m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.f[4] = "java/lang/Void";
        objectArray[5] = "t\\i\u001di|jTsR=`n\u0013V\u0012!e\u007fIz\u000e";
        objectArray[6] = ".\u0016";
        objectArray[7] = Boolean.TYPE;
        m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.f[7] = "java/lang/Boolean";
        objectArray[8] = "Ck";
        objectArray[9] = "\u0010\rn:\bF\u000e\u0005tu\\Z\nB\\>@_\u001b\u0018})";
        objectArray[10] = "V$";
        objectArray[11] = "\u001bG";
        objectArray[12] = "].sF\t9S'4N\u000e\"\u001e&y\u000f\u0001\u0007e93c\u0007\u0007\u0004\u001bhF58X#\u0004L\u0017$u9\u0018q) xr\u0019g\t\u0001\u0000\u0019/~\teF\u0000kQ\u0006\u0000\u0003\u0001\r\u0019\"3\u0004\u0018mq(\u0010_\u001cnn\u000b\u001ae\u00029L!\u0017b>-\u001d7>Y\u0005,X2\u0019Qy?_\r\u0002Us%ZT'X\u007f,c\r";
        objectArray[13] = Long.TYPE;
        m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5.f[13] = "java/lang/Long";
        objectArray[14] = "b\u0007\u0001sJki\b\u0010<+eb\u0003\u0014f";
        objectArray[15] = "\u001cYTf\"jB\u0003\u001b6[tM\u0018%o#r\\d[rfjI\u001b\\1!d _\t5>mGU\u0007`1\u000f";
        objectArray[16] = "H2\u00114<\u001c\u00067M0C\u001f\u0017:@&#qM1\u001d8!\u0016G?H7C";
        objectArray[17] = "F\u0010=A\n\t\b\u0015aEu\n\u0019\u0018lS\u0015\t\u0014~0IE\u0016\t\u00023V\u001bZx";
        objectArray[18] = "\u000e@8;Z{@\u001d,=kC\u000fSr!So|C\u0003m!,yE0,\r ]I\b\u001e-tDl\u0002j\u0011ZG^'\u0014\fC~\u001a'i\b\"T\u007fyjVYEM>\u0010/q\u0001I/22O^B\u001d\u0012Zz\u007fI\u0005l\u0019d\u000eI\t+9^xN\b3:Vbp{7\u000fZl_\u000e\"\u0011%\\\u0019\u0010PZ}B\u00198*\u000b\"CPBj\u0002o\u0006\u001e<i\u0015bP\"";
        objectArray[19] = "`\\5OR?.YiK-?8^\u0005\u001d@n;Pb\u0017N;42";
        objectArray[20] = "o\f|b\u007f\u001dn\u0016,SfB\u001a\u001c1>S_*\u0004<S%^m\b$,\"\u001d*\u0006M";
        objectArray[21] = "Pb=\u001bo\u0016\u000e8rK\u0016\u001d\r9l\u000fv\u001e\u0000_0\u0015&\u0001\u001d#3\nxMl";
        objectArray[22] = "\"-\nLD\u001b|wE\u001c=\u001fx~^JA\u0013\u001e/A\u001eX\u0017a(\u0002YV~$yH\u001b\u0001\u0000'nEM=";
        objectArray[23] = "-!Ap\u0000?,;\u0011A\u001a}s<\u001dAZ|/%\u0019>]?h+p{\fu*|\u000ex\u001bx|@J(\u0017?.>I?\u001ai\u0012{\u001d}\u0000euq\u0013(\u000f\u0007";
        objectArray[24] = "z-\u001bt}>4(Gp\u0002()?j{z.8C\u0014f?6-<\u0013%x8DxF!g1#rHthS";
        objectArray[25] = "\u0002u@\u0002_Y\\/\u000fR&QX$pVK\u0000[*\u0017\\EUTH";
        Object[] objectArray2 = objectArray;
        objectArray[26] = "rBpIgU<G,M\u0018T!B$IdUL\u0013;\u001d}Q3\u0014xZs8vE2\u0018$FuR?N\u0018";
    }

    public static String m$$YT8DJFynkiR3BoCHfI7PPRZB4z6lfK9zsAJByNmVKR98E7bsLWG0ZnN3O9HfBSJmPz6kKukLJQ74ICGRKh93967PNpqvIsQtm(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{30, 27, 98, -49, 66, -103, -45, -88, -39, 21, 83, -55};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 12]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

