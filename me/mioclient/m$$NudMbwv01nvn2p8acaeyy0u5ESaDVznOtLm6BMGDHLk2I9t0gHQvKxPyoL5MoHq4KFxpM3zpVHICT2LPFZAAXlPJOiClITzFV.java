package me.mioclient;

import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$qcNVZwOl6hTO8ZDLdynSC3aYPC0Tytjx2An8dbajr1bsIp0Yug4yIM7yXRhwAqpnNEdAueNjcZnfHJGbDksR3nmc6144djOz7;
import me.mioclient.m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV {
    public static final String a;

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
                m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.a();
                char[] cArray3 = ( /* dynamic constant */ (String)m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.m$$HBo4EmP2ab42gSeaCKmVBDWFFUR0h5BcEj8zvZPvN2o5PkgitwrS9OvmWpfAiQN5iQFY2dDahJTGqHNdBa89tXmUP5jG0eNUX("u01BeTbvUfykQhA07dWs", MethodHandles.lookup(), "m$$HBo4EmP2ab42gSeaCKmVBDWFFUR0h5BcEj8zvZPvN2o5PkgitwrS9OvmWpfAiQN5iQFY2dDahJTGqHNdBa89tXmUP5jG0eNUX", m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.class, 1523079798)).toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 71;
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
                        case 0 -> 26;
                        case 1 -> 108;
                        case 2 -> 52;
                        case 3 -> 101;
                        case 4 -> 47;
                        case 5 -> 96;
                        default -> 115;
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
        long l = 5462551119383874143L;
        long l2 = 0x53990208E1BAC5CAL ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 8717814386934358132L;
        long l4 = 0x7781DB54B2E2B0D1L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)l4);
    }

    public static void a() {
        Object[] objectArray = b;
        b[0] = "\u0011\u0015\\\u001e\u001aX\u001f\u001c\u001b\u0016\u001dCR\u001dVW\u0012f)\u0002\u001c;\u0014fH G\u001e&Y\u0014\u0018+\u0014\u0004E9\u00027):A4I6?\u001a`L\"\u0000&\u001a\u0004\n;D\t\u0015aO:\"A1RH#B);q\u0013'A6\u0018{)9\u0016\u00142v.\u0005\u0002E$_\u0015>\u0003\u0000!x\u001dB\u0010\u0007\u001ec\u0019H\n\u0002GF\u0014D\u0003;\u001e";
        objectArray[1] = Long.TYPE;
        m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.c[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.c[2] = "java/lang/Integer";
        objectArray[3] = "1\u001dg\u0005b\u001d:\u0012vJ\u000f\u001d:\u000fb";
        objectArray[4] = "u%SM@~~*B\u0002=fm-KK";
        objectArray[5] = "1P8,A\u000f:_)c \u00011T-9";
        objectArray[6] = "1jH/'70,\u001d}D+lj`x!(\u000b+\u001d {us(@!$E1jH/'70,\u001d}D";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "% )vH88-\u007f\u0010|03`a(PC#\u0011-Z\u0013F%\"lv\u001fb)\u001a^VK{\f\u0010*jex>5Tw|Az5)s\u001dk\u001fk*-fz-,PTN>)=rIpa\"\u000fR!E@)\u0017,b[1)\u001bkBaG.\u001asAi]\u0010iwteS?\u001cbj\u001acy\u0002\u0010)\u001c{>jl~_< P)rM>~)woM|B";
    }

    public static String m$$HBo4EmP2ab42gSeaCKmVBDWFFUR0h5BcEj8zvZPvN2o5PkgitwrS9OvmWpfAiQN5iQFY2dDahJTGqHNdBa89tXmUP5jG0eNUX(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{62, -37, -124, -103, 32, -116, 119, 85, 38, 6, 81, -58, -27, 49, -62, 94, 87, 98, -65, 15, 55};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 21]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public static m$$qcNVZwOl6hTO8ZDLdynSC3aYPC0Tytjx2An8dbajr1bsIp0Yug4yIM7yXRhwAqpnNEdAueNjcZnfHJGbDksR3nmc6144djOz7 m$$FnM901iotyJ8np5OZHJVIeWgerQzTx4cen7MoBqv14rnLzOxeKKKjyIxTwvqoQogEuOoO6EDnpVS8XdJljF3dEl073OXGxQuk(int n) {
        return m$$NudMbwv01nvn2p8acaeyy0u5ESaDVznOtLm6BMGDHLk2I9t0gHQvKxPyoL5MoHq4KFxpM3zpVHICT2LPFZAAXlPJOiClITzFV.m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju(n);
    }

    public static m$$qcNVZwOl6hTO8ZDLdynSC3aYPC0Tytjx2An8dbajr1bsIp0Yug4yIM7yXRhwAqpnNEdAueNjcZnfHJGbDksR3nmc6144djOz7 m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju(int n) {
        return new m$$qy9qOtq6iaecUp9VtmGzGcpFKzykcXKQGQN7cgX3ftlQg8KOwhOZuGgajkStA6DMQDO0LTthWA8ejT8on8yaW48JDyWWCVG2H();
    }
}

