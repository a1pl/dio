package me.mioclient;

import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$oRHJQWTrcmf8p7S7OrClvPCdl9sx2m3MiyV6YTaqEn1Mg8ahUxfHzfKu1iPlYTVDBpohy3N9exkz7FvKMSZgpqJCaBMKRYLbq {
    public static final String a;

    public static boolean m$$KCeGPpjFlC93pv5PC4KDMyL1sLbVnDLhdwHnYurFxdOM8DFVoPzclPP1PGJszh6wAsLUkaOEmgBEtT7y6U1WzwTVbLye0Hok6(int n) {
        return false;
    }

    public static String m$$Fb5jaGslvWNLEzFrpigub5HGXodKAC7WslAXIIh5GwlCBVclF0Do3o0VUsSeDffwbV21OcxUnD8EzgSFHM37eCJQD1bpYkxVt(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-24, 72, -97, -33, 79, -64, -65, 89, -58, 64, -77, -78, 11, 124, -40};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 15]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n;
            char[] cArray2;
            int n2;
            int n3;
            block11: {
                b = new Object[8];
                c = new String[8];
                m$$oRHJQWTrcmf8p7S7OrClvPCdl9sx2m3MiyV6YTaqEn1Mg8ahUxfHzfKu1iPlYTVDBpohy3N9exkz7FvKMSZgpqJCaBMKRYLbq.a();
                char[] cArray3 = ( /* dynamic constant */ (String)m$$oRHJQWTrcmf8p7S7OrClvPCdl9sx2m3MiyV6YTaqEn1Mg8ahUxfHzfKu1iPlYTVDBpohy3N9exkz7FvKMSZgpqJCaBMKRYLbq.m$$Fb5jaGslvWNLEzFrpigub5HGXodKAC7WslAXIIh5GwlCBVclF0Do3o0VUsSeDffwbV21OcxUnD8EzgSFHM37eCJQD1bpYkxVt("XFYHvAGDrWoMYs9hFCKs", MethodHandles.lookup(), "m$$Fb5jaGslvWNLEzFrpigub5HGXodKAC7WslAXIIh5GwlCBVclF0Do3o0VUsSeDffwbV21OcxUnD8EzgSFHM37eCJQD1bpYkxVt", m$$oRHJQWTrcmf8p7S7OrClvPCdl9sx2m3MiyV6YTaqEn1Mg8ahUxfHzfKu1iPlYTVDBpohy3N9exkz7FvKMSZgpqJCaBMKRYLbq.class, 2114651028)).toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 7;
                cArray2 = cArray3;
                n = n4;
                if (n4 <= 1) break block11;
                cArray = cArray2;
                n = n;
                if (n <= n3) break block12;
            }
            do {
                int n5 = n2;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n6 = n2;
                int n7 = n3;
                while (true) {
                    cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                        case 0 -> 111;
                        case 1 -> 73;
                        case 2 -> 8;
                        case 3 -> 61;
                        case 4 -> 105;
                        case 5 -> 61;
                        default -> 84;
                    })));
                    ++n3;
                    n2 = n5;
                    if (n5 != 0) break;
                    n5 = n2;
                    cArray2 = cArray2;
                    n7 = n2;
                    cArray4 = cArray2;
                    n6 = n2;
                }
                cArray = cArray2;
                n = n;
            } while (n > n3);
        }
        a = new String(cArray).intern();
        long l = 3554993667340444610L;
        long l2 = 0xD9959F3E3F6EB55BL ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 527009304684830936L;
        long l4 = 0x2D9FD1554BD35C91L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)l4);
    }

    public static void a() {
        Object[] objectArray = b;
        b[0] = "c}\u0004\u0006&Mhr\u0015IKMho\u0001";
        objectArray[1] = "h\u000f2H\u000ehc\u0000#\u0007spp\u0007*N";
        objectArray[2] = "IuzFS\u001aG|=NT\u0001\n}p\u000f[$qb:c]$\u0010@aFo\u001bLx\rLM\u0007ab\u0011qs\u0003l)\u0010gS\"\u0014B&~SFR[bQ\\#\u0017Z\u0004\u0019x\u0010\u0010Cdqr3KGgnQ9qY0L{4ve$\u001dm\u001dM^%Xh:E\"6_W!A(,Z\u000e\u0004L$%cW";
        objectArray[3] = Long.TYPE;
        m$$oRHJQWTrcmf8p7S7OrClvPCdl9sx2m3MiyV6YTaqEn1Mg8ahUxfHzfKu1iPlYTVDBpohy3N9exkz7FvKMSZgpqJCaBMKRYLbq.c[3] = "java/lang/Long";
        objectArray[4] = Integer.TYPE;
        m$$oRHJQWTrcmf8p7S7OrClvPCdl9sx2m3MiyV6YTaqEn1Mg8ahUxfHzfKu1iPlYTVDBpohy3N9exkz7FvKMSZgpqJCaBMKRYLbq.c[4] = "java/lang/Integer";
        objectArray[5] = "&wZ\n}\u0015-xKE\u001c\u001b&sO\u001f";
        objectArray[6] = "e3;d\u0013rhj9Y\u0012esE=<\u0011\u00020i>(\u0013?m2n>|n9li6\fc`nT";
        Object[] objectArray2 = objectArray;
        objectArray[7] = ">\u0013)^Vbe\u0002lC7X6\u0012$H\u000ftE\u0002U\u0004}7@\u0004fEQ;d\b^wqo}-T\u0003MA~\u001fq}PXG[q\u0000T9m>/\u0003\nB|\fhysj8\by[nTg\u0003K{\u0006aF\bS\u0005E\u007f7\b_BeEA\u000f^ZfM[1-^SAU\u001eXKM>eXF9\r``\u001dxXYl9\n\u0014\u0002\nja^,\u0007\b8~c";
    }

    public static boolean m$$XftmB67EIcBOopmHasfYf4J5CMrNHnLr6BuJmzAcoBHw9rM3EIg4HDsVlSp5sWpefAcfg3jE3VY621853YWALj2be5DbIx3za(int n) {
        return m$$oRHJQWTrcmf8p7S7OrClvPCdl9sx2m3MiyV6YTaqEn1Mg8ahUxfHzfKu1iPlYTVDBpohy3N9exkz7FvKMSZgpqJCaBMKRYLbq.m$$KCeGPpjFlC93pv5PC4KDMyL1sLbVnDLhdwHnYurFxdOM8DFVoPzclPP1PGJszh6wAsLUkaOEmgBEtT7y6U1WzwTVbLye0Hok6(n);
    }
}

