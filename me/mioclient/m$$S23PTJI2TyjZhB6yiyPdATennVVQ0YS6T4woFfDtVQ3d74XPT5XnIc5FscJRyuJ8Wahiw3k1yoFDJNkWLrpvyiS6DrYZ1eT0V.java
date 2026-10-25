package me.mioclient;

import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.Set;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_3262;
import net.minecraft.class_3264;
import net.minecraft.class_5352;
import net.minecraft.class_7367;
import net.minecraft.class_7677;
import net.minecraft.class_9224;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V
implements class_3262 {
    public class_9224 m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H = new class_9224("mio", (class_2561)class_2561.method_43470((String)"mio"), class_5352.field_25348, Optional.empty());

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V.c = new Object[11];
            m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V.d = new String[11];
            m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V.a();
            var13 = new String[2];
            var11_1 = 0;
            var10_2 =  /* dynamic constant */ (String)m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V.m$$v0EaqSd0PqDViqaaR0Njy0FCWVSr8nybsZQXniFiLwDsr7Kow37sx0MdLs3SmcAwwhTC8Kt9cU5kMDJhRxrelIXmK8OATbOC2("61MiJEhMiuVLtFmqO2gh", MethodHandles.lookup(), "m$$v0EaqSd0PqDViqaaR0Njy0FCWVSr8nybsZQXniFiLwDsr7Kow37sx0MdLs3SmcAwwhTC8Kt9cU5kMDJhRxrelIXmK8OATbOC2", m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V.class, 842577271);
            var12_3 = var10_2.length();
            var9_4 = 3;
            var8_5 = -1;
lbl10:
            // 2 sources

            while (true) {
                v0 = ++var8_5;
                v1 = var10_2.substring(v0, v0 + var9_4).toCharArray();
                v2 = v1.length;
                var14_6 = 0;
                v3 = 82;
                v4 = v1;
                v5 = v2;
                if (v2 > 1) ** GOTO lbl66
                break block12;
                break;
            }
lbl24:
            // 1 sources

            while (true) {
                var9_4 = var10_2.charAt(var8_5);
                ** continue;
                break;
            }
        }
        do {
            v6 = v3;
            v4 = v4;
            v7 = v4;
            v8 = v3;
            v9 = var14_6;
            while (true) {
                switch (var14_6 % 7) {
                    case 0: {
                        v10 = 81;
                        break;
                    }
                    case 1: {
                        v10 = 107;
                        break;
                    }
                    case 2: {
                        v10 = 65;
                        break;
                    }
                    case 3: {
                        v10 = 52;
                        break;
                    }
                    case 4: {
                        v10 = 46;
                        break;
                    }
                    case 5: {
                        v10 = 26;
                        break;
                    }
                    default: {
                        v10 = 12;
                    }
                }
                v7[v9] = (char)(v7[v9] ^ (v8 ^ v10));
                ++var14_6;
                v3 = v6;
                if (v6 != 0) break;
                v6 = v3;
                v4 = v4;
                v9 = v3;
                v7 = v4;
                v8 = v3;
            }
lbl66:
            // 2 sources

            v11 = v4;
            v5 = v5;
        } while (v5 > var14_6);
        var13[var11_1++] = new String(v11).intern();
        ** while ((var8_5 += var9_4) < var12_3)
lbl74:
        // 1 sources

        m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V.a = var13;
        m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V.b = new String[2];
        var6_7 = 1636830667703738602L;
        var4_8 = -1068415592476429701L ^ var6_7;
        m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)var4_8;
        var2_9 = 4317883766379535984L;
        var0_10 = 2350507187500915215L ^ var2_9;
        m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_10);
    }

    public static void a() {
        Object[] objectArray = c;
        c[0] = "D8\u001bD\u0018[J1\\L\u001f@\u00070\u0011\r\u0010e|/[a\u0016e\u001d\r\u0000D$ZA5lN\u0006Fl/ps8Badqe\u0018c\u0019\u000fG|\u0018\u0007_\u0016\u0003S\u0017b\u001a\u0017e\u001b3Q\u001d\u000e\u0005s9rF\n\u0006l\u001ax|\u0014QN0u{(E\u001f&\\@\u0013DZ#{HoW]\u001c`LeMXEEAiDa\u001c";
        objectArray[1] = Long.TYPE;
        m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V.d[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V.d[2] = "java/lang/Integer";
        objectArray[3] = "\u001c\u0007mk9\u0007\u0002\u000fw$X\u0002\u0002\u000ftdv\u001e";
        objectArray[4] = "sK\u001dG#;sK\n\u001b/4i\u0000\n\u0005/!nq[\\xc";
        objectArray[5] = "\u000fi*lL\u000f\u0004f;#1\u0017\u0017a2j";
        objectArray[6] = "\u0014G\bdP\u0002\u0014G\u001f8\\\r\u000e\f\u001f&\\\u0018\t}Ix\b[";
        objectArray[7] = "uP\\HB\t~_M\u0007#\u0007uTI]";
        objectArray[8] = "rm1dKExv9\u0016{\u0012f#x.WavR4\\\u0014dpaup\u0018@|YGPLYYS3lbZkvMq{c/v0u\u001aIJ(3+aXxoIRI\u001c|~kOwCwLK'Bb|T5d\\\u0013|XrDfe{YjGn\u007fE*nrbqj_{l\u001dA,A\t/IM/kplD\u001bv\u00130f^\u0012ntdnZN\u0017";
        objectArray[9] = "/c`\n\u0017\u0015~hbN,\u001cpu\"\u0005,K{3 OH\u001ap1dt";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "S?I+h7\u001b'\u001b>\u00154\u0004=G)y\u0006Uz\u001bq-QU{Kts4\u0012=_4\u0015m\u0007#\u0016!.)\u000f\"]N";
    }

    public void close() {
    }

    public class_7367 method_14405(class_3264 class_32642, class_2960 class_29602) {
        return null;
    }

    public Object method_14407(class_7677 class_76772) {
        return null;
    }

    public void method_14408(class_3264 class_32642, String string, String string2, class_3262.class_7664 class_76642) {
    }

    public class_7367 method_14410(String ... stringArray) {
        return null;
    }

    public Set method_14406(class_3264 class_32642) {
        return null;
    }

    public class_9224 method_56926() {
        return this.m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H;
    }

    public static String m$$v0EaqSd0PqDViqaaR0Njy0FCWVSr8nybsZQXniFiLwDsr7Kow37sx0MdLs3SmcAwwhTC8Kt9cU5kMDJhRxrelIXmK8OATbOC2(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{121, 21, 39, -121, 122, -75, -28, 24, -27, -30, 26, 51, -46, 48};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 14]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

