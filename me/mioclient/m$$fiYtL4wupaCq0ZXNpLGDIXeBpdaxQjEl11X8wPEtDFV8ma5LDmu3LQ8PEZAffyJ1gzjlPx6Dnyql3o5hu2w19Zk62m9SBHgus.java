package me.mioclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import net.minecraft.class_151;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus
extends m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 {
    public m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus(String string, Boolean bl, Predicate predicate) {
        super(string, bl, predicate);
    }

    public m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus(String string, Boolean bl) {
        super(string, bl);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.g = new Object[17];
            m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.h = new String[17];
            m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.e();
            var13 = new String[3];
            var11_1 = 0;
            var10_2 =  /* dynamic constant */ (String)m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.m$$QT5L5xQ1KlgrESiryAjDoT3klhfd7LcTHPHEUX4XfwQfkaBpgR7olCWgBz3ndjBkWzzmBO2BLIaLrYSbzf71Qx0NgFA6ITpMt("UKH94wTYqWZiaxzFgCaJ", MethodHandles.lookup(), "m$$QT5L5xQ1KlgrESiryAjDoT3klhfd7LcTHPHEUX4XfwQfkaBpgR7olCWgBz3ndjBkWzzmBO2BLIaLrYSbzf71Qx0NgFA6ITpMt", m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.class, 646511363);
            var12_3 = var10_2.length();
            var9_4 = 5;
            var8_5 = -1;
lbl10:
            // 2 sources

            while (true) {
                v0 = ++var8_5;
                v1 = var10_2.substring(v0, v0 + var9_4).toCharArray();
                v2 = v1.length;
                var14_6 = 0;
                v3 = 85;
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
                        v10 = 55;
                        break;
                    }
                    case 1: {
                        v10 = 19;
                        break;
                    }
                    case 2: {
                        v10 = 17;
                        break;
                    }
                    case 3: {
                        v10 = 100;
                        break;
                    }
                    case 4: {
                        v10 = 62;
                        break;
                    }
                    case 5: {
                        v10 = 2;
                        break;
                    }
                    default: {
                        v10 = 93;
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

        m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.c = var13;
        m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.d = new String[3];
        var6_7 = 7804515237602350450L;
        var4_8 = 840758135400612688L ^ var6_7;
        m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)var4_8;
        var2_9 = 7877844586970918867L;
        var0_10 = 1920140338543595405L ^ var2_9;
        m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_10);
    }

    public static void e() {
        Object[] objectArray = g;
        g[0] = "\u007ftN1O)q}\t9H2<|DxG\u0017Gc\u000e\u0014A\u0017&AU1s(zy9;Q4Wc%\u0006o0Z($\u0010O\u0011\"C\u0012\tOudZV&@\u0010![0nd#&BP\u0006n\u0000}FS\u0019M\nGX\u0004;g\u0007@d\u0010jq.{_\u0011/t\ts#\u0002(K\u0012w)\u0018-\u00127z%\u0011\u0014K";
        objectArray[1] = Long.TYPE;
        m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.h[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.h[2] = "java/lang/Integer";
        objectArray[3] = "\u000fw\u0004\u0010X\"\u0001~C\u0018_9L\u007f\u000eY\\*\b%F2v'\u0000|z\u0016V\b/sH<T!*f{5Y!,Aa\u0010\u0005? %O\ra\"\u0005xl\u001b\\%\u0001Vy\f\u0004\t\rz\u001c+btZVD.\t'\u0015F_JW|[#n\u0012xy\u0017$X\u0019Y>\u0011j[\u0005e+\u0017Pd\fi4+qC;\u0004";
        objectArray[4] = "wofn*\u0013|`w!K\u001dwks{";
        objectArray[5] = Void.TYPE;
        m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.h[5] = "java/lang/Void";
        objectArray[6] = "\u001d\u0015\u0015qsY\u0016\u001a\u0004>\u001fZ\u0018\u0018\u0006q3";
        objectArray[7] = Boolean.TYPE;
        m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.h[7] = "java/lang/Boolean";
        objectArray[8] = ")bmmVZ\"m|\"+B1juk";
        objectArray[9] = "\n=RXy%\u00065S\u00130-\u001a=QXT9\u0006<z\u001a{'\f<K";
        objectArray[10] = "Cg\u0000xw@\u0000)\u0010;MIUt_i\u000f~\u0001i\u0003k\u000b`%`\"e\u001c@\u001a`+`(s\u0010g\u0000;\u001f}\u0019=\u0007M\u0010S\u000b*9w\"r\b\u0019\u0013B\u000fM7f\u0002a=W\u0003\u0015\u001ck G\u001a\u00008w\u001dQ\u0006\u0001=h0s\u001f!-{1f\u0006<&E\u0011i;b9y\bA\u0016g\u0013y\u0002v\u001cg8\u0007wQ\u0015)\u0002:/@Iha<.GD!\u0002uq\u0012\u0000X";
        objectArray[11] = "<\ts_ur-Vu R\u007f-_}\u0018~\f=.1j=\t;\u001dpF1-7%Bfe4\u0012/6ZK7 \nHGR\u000ed\n5C3$\u0001T6\u001dH53\u0013Ld`q7\u0002ny^.<0N\u0011k\u000f7(0Ru~7$wrO\b0%oqG\u0012\u000eVkDK\u001c!#~Z4,g=\f[16=\u000fuL3%\\U4I2#5\tnPkN";
        objectArray[12] = "s\u001e\u0000(8L0P\u0010k\u0002O$]?>f]$![*nQ*\u001c\u0003;2\u0010I";
        objectArray[13] = "\u0007x\fO\u001dH\u0000%\u0001\fr\u0015@>\u0003V\t9V%\rH\u001f3P8\u00072LC_>\u0005\u0002K\u001eR}j\u000fN\bS$W\u000e\u000f\u0015\u0003C";
        objectArray[14] = "\u001f\u001bG8\f\u0014Q\u0013\u0013<5\u0012D\u0015M,\\\u001e}\u001bM<Xx\u001eNY+RE\u001f\u000fD{5";
        objectArray[15] = "\u0005D7<&\"KLc8\u001f0PI$(X 9\u0010e5u)\u0004\u0011$(%N\u0005D7<&\"KLc8\u001f";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "\u001b\\t/EMTGjz.LH]Q0dDBEu\"H#\u0018\u001dh!I\u001e\u0019\\uq.";
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    @Override
    public JsonElement toJson() {
        return new JsonPrimitive((Boolean)this.getValue());
    }

    @Override
    public void fromJson(JsonElement jsonElement) {
        this.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(jsonElement.getAsBoolean());
    }

    @Override
    public void m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(String string) {
        block16: {
            block15: {
                block12: {
                    boolean bl;
                    m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus;
                    block14: {
                        block13: {
                            try {
                                try {
                                    if (!"toggle".equalsIgnoreCase(string)) break block12;
                                    m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus = this;
                                    if (((Boolean)this.getValue()).booleanValue()) break block13;
                                } catch (class_151 class_1512) {
                                    throw m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.a(class_1512);
                                }
                                bl = true;
                                break block14;
                            } catch (class_151 class_1513) {
                                throw m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.a(class_1513);
                            }
                        }
                        bl = false;
                    }
                    m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(bl);
                    break block16;
                }
                try {
                    try {
                        if (!string.equals("0") && !string.equalsIgnoreCase("false")) break block15;
                    } catch (class_151 class_1514) {
                        throw m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.a(class_1514);
                    }
                    this.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(false);
                    break block16;
                } catch (class_151 class_1515) {
                    throw m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.a(class_1515);
                }
            }
            try {
                try {
                    if (!string.equals("1") && !string.equalsIgnoreCase("true")) break block16;
                } catch (class_151 class_1516) {
                    throw m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.a(class_1516);
                }
                this.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(true);
            } catch (class_151 class_1517) {
                throw m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus.a(class_1517);
            }
        }
    }

    public static String m$$QT5L5xQ1KlgrESiryAjDoT3klhfd7LcTHPHEUX4XfwQfkaBpgR7olCWgBz3ndjBkWzzmBO2BLIaLrYSbzf71Qx0NgFA6ITpMt(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{15, 23, 94, -58, 12, 18, -40, -101, -84, -118, 61, -21, -101, 49, 124, -36, 90, -128, 115};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 19]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

