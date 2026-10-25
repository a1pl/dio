package me.mioclient;

import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q;
import me.mioclient.m$$AwsNiv9iA8itUPdTlLWesJhrdQCmL2EYWRrBQIdkQaiL5mWESEIZ7BF4gpdKmD0bAT5uYQ0cX7AFN4LYYAEo6sCndjuCL73C5;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_2561;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
final class m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1
extends m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q {
    public m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1(String string2) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.e = new Object[9];
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.h = new String[9];
            m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.d();
            var5 = new String[2];
            var3_1 = 0;
            var2_2 =  /* dynamic constant */ (String)m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.m$$NONe1USdzYISn5jO0R8awjtbhRk5P8e73QpqiTr3wjmv60Watnb0D1aZYITRG3ATrePVulIjkePMgVgG8pwNJtwVQ8yfO39e8("khGcOj6QtZwTbB1gPkGC", MethodHandles.lookup(), "m$$NONe1USdzYISn5jO0R8awjtbhRk5P8e73QpqiTr3wjmv60Watnb0D1aZYITRG3ATrePVulIjkePMgVgG8pwNJtwVQ8yfO39e8", m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.class, 1595589173);
            var4_3 = var2_2.length();
            var1_4 = 6;
            var0_5 = -1;
lbl10:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl12:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 88;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl70
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 59;
                            break;
                        }
                        case 1: {
                            v11 = 57;
                            break;
                        }
                        case 2: {
                            v11 = 68;
                            break;
                        }
                        case 3: {
                            v11 = 91;
                            break;
                        }
                        case 4: {
                            v11 = 59;
                            break;
                        }
                        case 5: {
                            v11 = 86;
                            break;
                        }
                        default: {
                            v11 = 72;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl70:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.c = var5;
        m$$6XfEwkwxHDwAkgNvm5FxEdkdXwCQ6hp5MWDXjt9xbqpsouBGhbk0zB7treCXRPFAm3E44BEZdb72xwpzJQOBEGn5IV5lMEc3q$1.d = new String[2];
    }

    public static void d() {
        Object[] objectArray = e;
        e[0] = "<\\JS\u001f#<\\]\u000f\u0013,&\u0017]\u0011\u00139!f\rLB";
        objectArray[1] = "y:sVH9y:d\nD6cqd\u0014D#d\u00004J\u0015";
        objectArray[2] = "\u0002\u0012]\"|u\t\u001dLm\u0001m\u001a\u001aE$";
        objectArray[3] = "^A]\u0005$\u0012^AJY(\u001dD\nJG(\bC{\u001b\u001e\u007fJ";
        objectArray[4] = "my\u0010\u001aAXmy\u0007FMWw2\u0007XMBpCQ\u0006\u0019\u0001";
        objectArray[5] = "rd\u0001\u0015a\u001fyk\u0010Z\u0000\u0011r`\u0014\u0000";
        objectArray[6] = ":WJ|f\u0003:\r^\u0002fP\u007fWAnT\u0004>\u000b\u0016\u0002:\u0003`K\u001f{:Ay\u000b&";
        objectArray[7] = "HoLVC%H-U\u0016z9\u001c-OM\u0016\u000bHo\u0010\u0014ze\b5C\u0010\u0006$\u00101\u0017*";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "<C$sSYlHst9Ek[z/Uw:\u001c&w\u0001 ?^~$\u0003\\~Fzp9\u001azH{)A^eL*H";
    }

    @Override
    public class_2561 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$AwsNiv9iA8itUPdTlLWesJhrdQCmL2EYWRrBQIdkQaiL5mWESEIZ7BF4gpdKmD0bAT5uYQ0cX7AFN4LYYAEo6sCndjuCL73C5 m$$AwsNiv9iA8itUPdTlLWesJhrdQCmL2EYWRrBQIdkQaiL5mWESEIZ7BF4gpdKmD0bAT5uYQ0cX7AFN4LYYAEo6sCndjuCL73C5) {
        return class_2561.method_43470((String)("Hello " + m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1548().method_1676() + " :')"));
    }

    public static String m$$NONe1USdzYISn5jO0R8awjtbhRk5P8e73QpqiTr3wjmv60Watnb0D1aZYITRG3ATrePVulIjkePMgVgG8pwNJtwVQ8yfO39e8(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{126, -96, 95, 69, 56, 29, 62, 73, 59, 77};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 10]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

