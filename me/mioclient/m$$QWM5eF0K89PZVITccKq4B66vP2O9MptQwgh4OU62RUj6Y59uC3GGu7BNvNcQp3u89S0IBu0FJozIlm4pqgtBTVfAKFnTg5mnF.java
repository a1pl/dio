package me.mioclient;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_151;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF {
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
                b = new Object[33];
                c = new String[33];
                m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.a();
                char[] cArray3 = ( /* dynamic constant */ (String)m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.m$$4FfK14x5heniVPx02l8mpt1DqQrE7gqU1O0G7sNW31TcquaibeUkAJuQRdZq2V3dzP7VSoaieoIxtGdh99x6SIMYbx5MyMPwL("258nTiLfOdgWSKbZg3zD", MethodHandles.lookup(), "m$$4FfK14x5heniVPx02l8mpt1DqQrE7gqU1O0G7sNW31TcquaibeUkAJuQRdZq2V3dzP7VSoaieoIxtGdh99x6SIMYbx5MyMPwL", m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.class, 1240352400)).toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 85;
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
                        case 0 -> 71;
                        case 1 -> 70;
                        case 2 -> 105;
                        case 3 -> 12;
                        case 4 -> 54;
                        case 5 -> 24;
                        default -> 21;
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
        long l = 3266740543700124740L;
        long l2 = 0xBB64A1A8F6B1374L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 1382276439773504706L;
        long l4 = 0x441C5866A236239AL ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)l4);
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static void a() {
        Object[] objectArray = b;
        b[0] = "\u0003I4+\f6\r@s#\u000b-@A>b4\u000e#\u0019\u007f\u0000U\u0012V\u0015J\u001c3\u0010:Oy\r\u0014m,\u001a,05k!\u0015W6\u0011\b\u0019Krr*\fX\u001eH\u0013\u000fo7\u0019#3&j)koq'\u0017\u0018by\u0017\u0015j\u001b\u0014#\u0015U\u0010,Y*\u0000/6\u0014ev+Q)\u001fKn\u00041\u000f\bmQ\u0000\u000b\r\t\u0019w(#";
        objectArray[1] = "\u00011ZJ0{\u0002?\u0002Mwy\u000e~|Jj}";
        objectArray[2] = "pS";
        objectArray[3] = Void.TYPE;
        m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.c[3] = "java/lang/Void";
        objectArray[4] = "G;m\u0014\u00061L4|[{)_3u\u0012";
        objectArray[5] = "iAB<\u001cvjO\u001a>ZyqSQ)\u001c[kAF.Wl";
        objectArray[6] = "k\u0015";
        objectArray[7] = "+\t\u0017g4\u0014 \u0006\u0006(U\u001a+\r\u0002r";
        objectArray[8] = "`02h>De\u007f\u0002`|H";
        objectArray[9] = "E\b\u0005{'\u001d0(\u000et6RM0\u001ds?\u001b%";
        objectArray[10] = Boolean.TYPE;
        m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.c[10] = "java/lang/Boolean";
        objectArray[11] = "@4r;\fUK;ctvQX:s;@UO";
        objectArray[12] = ";9+Q\u0012\u0006>v\u001bYP\n\u001e-)@I\u001b\u0002,/U]\u0002";
        objectArray[13] = "\u0013\u0014";
        objectArray[14] = "+&hm!~.iXecr\b)ny{D55{mb";
        objectArray[15] = "\u0007\u0019";
        objectArray[16] = "S7#'\u0018*]>d/\u001f1\u0010?)n\u0010\u0014k c\u0002\u0016\u0014\n\u00028'$+V:T-\u00067{ H\u001083vkI\u0006\u0018\u0012\u000e\u0000\u007f\u001f\u0018vH\u0019;0\u0017\u0013\r\u0018]x3 \n\u0001=\u00109\u0003Q\u0005>\u000f\u001a\tk\u001bi-0\u0004l'}|&-W\u001c|9#\n_`o>\u001c\u0011[ju;E4Vf|\u0002\u001c";
        objectArray[17] = Long.TYPE;
        m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.c[17] = "java/lang/Long";
        objectArray[18] = Integer.TYPE;
        m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.c[18] = "java/lang/Integer";
        objectArray[19] = "\u007fo";
        objectArray[20] = "';=\u0002\u00055yd*l\nrh/1\u001d\u0000\u0013\u0014f\u0016\u001d \"\u007f\u0003(\u00150et;,\t\u0010n\u0018\u00163\u0005\u0016g\u000e0-+\u001e\u001a\rf.R?\u0017.#\u001c-\b3\u000ff\nV?n;\u0000|\b\u00030\u0015&t\u000eQ<;2v0\r$-f\b<\u0002a;\u0000\u001e(\"\u0013-/5\u0017Q8\u000fe\u001c\\0o\nmL\u0015\u0003=;$.\t\u00140D1!\u0015\u0005.6%+P\u001e^~%\"RW'<aq\u0014o";
        objectArray[21] = "$Y6R*\u001fr\u000e=\u0016\u0011\bvP2AV\u0018\u001f\t B.\u000e/\u00056Qlv$Y6R*\u001fr\u000e=\u0016\u0011";
        objectArray[22] = "|\u0016OaCI)\u001e\u0013#/_ K+gWN6J\u000baBZL\u0017A%TZ3BIy\u00166v_\u001e$\u0017O4\u001bMb/";
        objectArray[23] = "\taeH'\u0005\u000evaC\u0017\u000e\u0004m%^\u0017_\u0018d`\u000bn\u001d\\7&3";
        objectArray[24] = "a[P#-\u0002?\u0004GM\"E.O\\<($R\u0006{<\b\u00159cE4\u0018R2[A(8Y^v^$>PHP@\n6-K\u0006Cs\u0017 hCq\f \u0004I\u0006gw\u0017Y}`\u0011)+\u0007SF\u0019/y\u000b}R\u001b\u0011%\u0013k\u0006e\u001d*V}`s\t\n$kOX6y\u000fI\u0005q}\u0018XL\r!4+\n}DC(<\u0007\u0002QL4-\u0019pEFq6i";
        objectArray[25] = "6U/L-[`\u0002$\b\u0016]`D\u001cCj_v8mI}\n=I+\u000ew\f\rT;K|B\u007f@1\u000eg2";
        objectArray[26] = "=?BRR[!(O-W^\n2E@+\u0004>7^UO\u0007*5J-";
        objectArray[27] = "0~\u0015Xc\u0005rb\f@\u001b\rdg\u000bQ\u001b\\xnN\u0004b\u001e<=\b<";
        objectArray[28] = "ls\u0007m\u0010u.o\u001euhi&l\u001edhz1t\by\u001an;1\u0013\tRn23Zp\u0010*aub";
        objectArray[29] = "H7 lc,O $gS6L5w^7(k-gz(LM1b}#>Y;'fS";
        objectArray[30] = "Z\u0017e\r}[B\ncR\u0007{\u0001\u0007?\u001f?Wr\u0017NSM\u0014w\u0011}\u0012a\u0018S\u001dE ALJ8OT}bI\nj*`{pNjWd\u001aZ+4T:aK\u0019s.CI\u000f\u001db\f^wP\u0016P,6Bq\u001dHRu\\\u0000\u001dD\u0015Ufv\u001aE\rVnl$6\tcbb\u000bC\u001c}\u001dRM]nmU]\u00131\u0016wJ_F\u000f\u0005cY\u000b\u001f>\u0000j]Pv";
        objectArray[31] = "\u0014\u0003\u000020I\b\u0014\rM.EmT\u000e47\u0010\u0004\u0002Y?s+S\u000b\u0004t(R\n\u000b\u001a3IR\u0001\f\u001c4+N\u0016\u0001c";
        Object[] objectArray2 = objectArray;
        objectArray[32] = "<E('\u0001-?Q*3y$q^7$\u0002I>\u0007#?A(pP0(y";
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Path path, byte[] byArray) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path.toFile());){
            fileOutputStream.write(byArray);
        }
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Path path, String string) {
        m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(path, string.getBytes(StandardCharsets.UTF_8));
    }

    public static Path m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Path path, String ... stringArray) {
        try {
            if (path.toFile().exists()) {
                return path;
            }
        } catch (class_151 class_1512) {
            throw m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.a(class_1512);
        }
        for (String string : stringArray) {
            String string2 = new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)String.valueOf(path)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(a);
            Path path2 = Path.of(string2, new String[0]);
            try {
                if (!path2.toFile().exists()) continue;
                return path2;
            } catch (class_151 class_1513) {
                throw m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.a(class_1513);
            }
        }
        return path;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Path path) {
        byte[] byArray;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path.toFile());
            byArray = fileInputStream.readAllBytes();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception exception) {}
            }
        }
        return byArray;
    }

    public static String m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(Path path, int n) {
        return new String(m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(path), StandardCharsets.UTF_8);
    }

    public static String m$$4FfK14x5heniVPx02l8mpt1DqQrE7gqU1O0G7sNW31TcquaibeUkAJuQRdZq2V3dzP7VSoaieoIxtGdh99x6SIMYbx5MyMPwL(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-89, 67, 71, 21, -30, 61, 107, 75, -72, 72, 24, 49, -18, -26, 92, -56, -26, -76, -20, -27, 81};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 21]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

