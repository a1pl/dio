package me.mioclient;

import java.util.Iterator;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import net.minecraft.class_1293;
import net.minecraft.class_151;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2244;
import net.minecraft.class_2480;
import net.minecraft.class_3489;
import net.minecraft.class_6880;
import net.minecraft.class_9334;

public final class m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA {
    public m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA() {
        throw new AssertionError();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[26];
        b = new String[26];
        m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a();
        long l = 3061012305085213218L;
        long l2 = 0xBBFE9A57C6451EC1L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 1846423997751486402L;
        long l4 = 0x3DB0B880835418D3L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)l4);
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "\u0012\u001co\u007f\u000fz\u0012\u001cx#\u0003u\bWx=\u0003`\u000f&*f[*";
        objectArray[1] = "\"O30\u001f+\"O$l\u0013$8\u0004$r\u00131?uq&Dp";
        objectArray[2] = Boolean.TYPE;
        m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b[2] = "java/lang/Boolean";
        objectArray[3] = "\u0019H\u001eWj)\u0019H\t\u000bf&\u0003\u0003\t\u0015f3\u0004r[N3w";
        objectArray[4] = ";7d`\u0014\u000f;7s<\u0018\u0000!|s\"\u0018\u0015&\r\"|M^";
        objectArray[5] = "g?ID\u001fXi6\u000eL\u0018C$7C\r\u0017f_(\ta\u0011f>\nRD#Yb2>N\u0001EO(\"s?ABc#e\u001f`:\b\u0015|\u001f\u0004|\u0011QS\u0010a9\u00107\u001b4R>\tWs>qe\rTl\u001d{_\u0013\u0003N7vX/\u0017\u001f!_c\u0014\u0016Z$xkh\u0005]\u001bcob\u001fXBFbn\u0016a\u001b";
        objectArray[6] = Long.TYPE;
        m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b[6] = "java/lang/Long";
        objectArray[7] = Integer.TYPE;
        m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.b[7] = "java/lang/Integer";
        objectArray[8] = "@wOdez@wX8iuZ<X&i`]M\u0002y;\"";
        objectArray[9] = "\u001au\tl91\u0004}\u0013#^0\u0015f\u001eyx6";
        objectArray[10] = "UB\u001fd\n\bUB\b8\u0006\u0007O\t\b&\u0006\u0012HxZrSS";
        objectArray[11] = "u\u0007\u0005eq\u007fk\u000f\u001f*\u0013cl\u0012";
        objectArray[12] = "Ss_g\b\bSsH;\u0004\u0007I8H%\u0004\u0012NI\u001a{\\R";
        objectArray[13] = "\u00174%ma\u000b\u0017421m\u0004\r\u007f2/m\u0011\n\u000eg{4R";
        objectArray[14] = "<|:n)-7s+!H#<x/{";
        objectArray[15] = "Rd'\b\u0014q\\m`\u0000\u0013j\u0011l-A\u000ekMQb3KFNDS!\nr}vQ\u000f\f]^fK,\ni|3G6\u0018|UkG(6FKK?/KOslS*LWS7\u007f\u0011\u001b)HtfQ\nHF4m\f\u000by\tK|\u0017\u0014Smwh\u000e\u0012ZO7A\u0016KuXF\\\u000f\u0013oJ7f\u0015J";
        objectArray[16] = ";\u000f\u001fU)Wc\u001cG\u0012EKl\u001d=F5W\u0005_\u001aE{D\u007f\u0016\u001dG4+";
        objectArray[17] = "\\)4\f\u0010_\u0002x!\u0001)[\u000e;+\u0002EiS\u007fwT)\u0001\u0019<7[IS\u0007= e";
        objectArray[18] = "\u00033th\u0013*@bq#s\u001d\u000ez-kK1}j\\'9rxlof\u0015~\\`WT5*EE] \t\u0004Fwx^\u0014\u001d\u007f3x#\u0010|UV& N\u0007DdaZ7/\u0000`px*\u0011_kBXB$~`Z&\u0001:\u000f`Va!\u0000ygWy\"\bcY$}\u0017\u0004mvQh\t{]0O\u001aO/O4o|LrO3\u001d'\u0011}M1#'By\u0006\u000b";
        objectArray[19] = "SmEbZ;\u0012)@<&$\u000eoDjJ\u0016^.\u001b<&p\u000f\"D5\u001a~\u0018y\u0014\r";
        objectArray[20] = "i/m/Ral>)PP7s!7<bg0qjn5d3%3hL*}8<P\f;a\u007f?*E<c0P";
        objectArray[21] = "&jFQ]9#{\u0002._o<d\u001cBm9y9D\u0015:{,8E_T=.y{\u0017[l~k\u0001^\\n1\u0004";
        objectArray[22] = "kV\u000b'M@2L\u0014i&[<N\u00190Jin\r@n&\u0005a@\u0007.^X3N\u001bW";
        objectArray[23] = "c\u0003f\u001ck\b1\u001dg\u000bU\t \u0014g\t)\u000f&y#\t1\u00160\u0005{\u001aiQ\\";
        objectArray[24] = "\u001cTA[\u0019eKPXK$;Y\u0005\u007fL@\u0006\u0014i\u001e\\y\u000e\u001ePGG\u001e\u00065s\u0018\u001bU\u0000OiYyig4\u0015\u0016^\u001b3\u0007GZi\u007f\u001e\u0005D\u001eO~\u00188ea\\Y\"\u0018\u0010\u001bE{eL`\u0017[o%(R\u001a~J&+{vny\u000f\u001fBZPJnEiHKF\u00048Y^~Gg\rbI\"B0HV@\u0019G!\f)\u0018L[7LHF\u001dN:u";
        Object[] objectArray2 = objectArray;
        objectArray[25] = "}IX?z|%Z\u0000x\u0016f.P@A\u007f1r\u0019Yqno._<";
    }

    public static boolean m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_1799 class_17992, class_6880 class_68802) {
        Iterator iterator = m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("x", (Object)class_17992, (long)1743610114061330L), (long)1261746924606396L).iterator();
        while (iterator.hasNext()) {
            class_1293 class_12932 = (class_1293)iterator.next();
            try {
                if (m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_12932, (long)1394609329121258L) != class_68802) continue;
                return true;
            } catch (class_151 class_1512) {
                throw m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(class_1512);
            }
        }
        return false;
    }

    public static boolean m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP(class_1792 class_17922) {
        boolean bl;
        block4: {
            block3: {
                if (class_17922 instanceof class_1747) {
                    class_1747 class_17472 = (class_1747)class_17922;
                    try {
                        if (!(m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_17472, (long)1566007688933093L) instanceof class_2480)) break block3;
                        bl = true;
                        break block4;
                    } catch (class_151 class_1512) {
                        throw m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(class_1512);
                    }
                }
            }
            bl = false;
        }
        return bl;
    }

    public static boolean m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T(class_1792 class_17922, int n) {
        boolean bl;
        block4: {
            block3: {
                if (class_17922 instanceof class_1747) {
                    class_1747 class_17472 = (class_1747)class_17922;
                    try {
                        if (!(m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_17472, (long)1566007688933093L) instanceof class_2244)) break block3;
                        bl = true;
                        break block4;
                    } catch (class_151 class_1512) {
                        throw m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a(class_1512);
                    }
                }
            }
            bl = false;
        }
        return bl;
    }

    public static boolean m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz(class_1799 class_17992, int n) {
        return (boolean)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_17992, (Object)class_3489.field_42612, (long)1481605934984498L);
    }

    public static boolean m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI(class_1799 class_17992, int n) {
        return (boolean)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_17992, (Object)class_3489.field_42611, (long)1481605934984498L);
    }

    public static boolean m$$q60MFbe6wdivWp4kRCKnlZZPlYEn3tV4kfyfYvLxmOjTDK7AxLlTtFsQ579mT62x8LKzvOCLsSewKyc0PBtW1vCddwE5OeN7R(class_1799 class_17992, int n) {
        return (boolean)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_17992, (Object)class_3489.field_42614, (long)1481605934984498L);
    }

    public static boolean m$$0a6satRcVmfiZwanl0RgzcMCb0erhZREX3tKsob6XE1D4QKMc68LuPqxPdhcvQymN439ibhFWuDkCK4ezfpJrVIkGLaGWuoTq(class_1799 class_17992, int n) {
        return (boolean)m$$MfRTOhBxzbi1CGIejwKs0bpdFpj9DBNoozyoo3I03AveGQj5H4xUXEU9aDe5IOz3hCBH0zoHl1GDDYBIFO2QwsMhqSBG6p6AA.a("A", (Object)class_17992, (Object)class_9334.field_50075, (long)1444689320589704L);
    }
}

