package me.mioclient;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T$m$;
import net.minecraft.class_2561;
import net.minecraft.class_410;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T
extends class_410 {
    public m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T() {
        super((BooleanConsumer)new m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(), (class_2561)class_2561.method_43470((String)"Confirm Game Close"), (class_2561)class_2561.method_43470((String)"Are you sure that you want to close minecraft?"));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T.c = new Object[5];
            m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T.d = new String[5];
            m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T.a();
            var13 = new String[2];
            var11_1 = 0;
            var10_2 =  /* dynamic constant */ (String)m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T.m$$wmQKYWp4aICBPELEKmkLP29XcV7PycyYDqLdb1kZIma3sZDSSyIYzrVgMnRFgjRsZC7uJpMRM4D5VvksyoK6SPalqFlYlefLK("kxhMi13rcAfd51PYZPAl", MethodHandles.lookup(), "m$$wmQKYWp4aICBPELEKmkLP29XcV7PycyYDqLdb1kZIma3sZDSSyIYzrVgMnRFgjRsZC7uJpMRM4D5VvksyoK6SPalqFlYlefLK", m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T.class, 1891288806);
            var12_3 = var10_2.length();
            var9_4 = 18;
            var8_5 = -1;
lbl10:
            // 2 sources

            while (true) {
                v0 = ++var8_5;
                v1 = var10_2.substring(v0, v0 + var9_4).toCharArray();
                v2 = v1.length;
                var14_6 = 0;
                v3 = 23;
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
                        v10 = 75;
                        break;
                    }
                    case 1: {
                        v10 = 12;
                        break;
                    }
                    case 2: {
                        v10 = 53;
                        break;
                    }
                    case 3: {
                        v10 = 127;
                        break;
                    }
                    case 4: {
                        v10 = 118;
                        break;
                    }
                    case 5: {
                        v10 = 48;
                        break;
                    }
                    default: {
                        v10 = 79;
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

        m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T.a = var13;
        m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T.b = new String[2];
        var6_7 = 3795393909221866535L;
        var4_8 = 8460265787575540268L ^ var6_7;
        m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)var4_8;
        var2_9 = 7608677828741679206L;
        var0_10 = 1471457384463028333L ^ var2_9;
        m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_10);
    }

    public static void a() {
        Object[] objectArray = c;
        c[0] = "\fz^guZ\u0002s\u0019orAOrT.}d4m\u001eB{dUOEgI[\tw)mkG$m5PUC)&4FubQM\u0002_u\u0006\u0017TFpzcRU 8^PUL@PTs\u000eHCOwy4V\u0014m]t3j\u0000<K]\bQ\u0001yNz\u0000-\u0012~qa\u0004'\b{(D\t+\u0001Bq";
        objectArray[1] = Long.TYPE;
        m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T.d[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T.d[2] = "java/lang/Integer";
        objectArray[3] = "\u0014Jt\u0010\u0001\u0000\u001fEe_`\u000e\u0014Na\u0005";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "A2X\u0017\u00126Y&\\t1\u007fSd\u0013L\u001d\fC\u0015_>^\tE&\u001e\u0012R-I\u001e,2\u00064l\u0014X\u000e(7^1&\u00131\u000e\u001a1[\u0017P$\u007foXI+5M(\"0\u0003qI9\u0000-=.B\u000b E\b\u000fI\u0013^\u0006\u0016~I\u001f\u0019&,\bN\u001e\u0001%$\u0012pm\u0005\u0010(\u001c_\u0018\u0010\u000eW,\u0019\u0006bMVwL7\r\u0013\br\u001dT[\tQ~X$\f\u000f\u00143\"";
    }

    public static String m$$wmQKYWp4aICBPELEKmkLP29XcV7PycyYDqLdb1kZIma3sZDSSyIYzrVgMnRFgjRsZC7uJpMRM4D5VvksyoK6SPalqFlYlefLK(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{109, -66, 34, 73, 98, -87, -75, 97};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 8]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

