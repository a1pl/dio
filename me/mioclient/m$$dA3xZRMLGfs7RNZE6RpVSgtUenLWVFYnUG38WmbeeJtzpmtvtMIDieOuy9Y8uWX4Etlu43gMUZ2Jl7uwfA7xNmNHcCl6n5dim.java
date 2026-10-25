package me.mioclient;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim$m$;
import net.minecraft.class_2561;
import net.minecraft.class_410;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim
extends class_410 {
    public m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim(Runnable runnable) {
        super((BooleanConsumer)new m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(runnable), (class_2561)class_2561.method_43470((String)"Confirm Disconnect"), (class_2561)class_2561.method_43470((String)"Are you sure that you want to disconnect?"));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim.c = new Object[5];
            m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim.d = new String[5];
            m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim.a();
            var13 = new String[2];
            var11_1 = 0;
            var10_2 =  /* dynamic constant */ (String)m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim.m$$UMfqZKKS6IdFsaWklpuzhqFI4rIiiZOnRpUOhvwuYMgGjSlYfAWQtr4pqw3WnNZqtJNhxI1Y5jjapsHKqwvxExELFMmSXaFjb("KglBJG8OSO2T2lSWwiev", MethodHandles.lookup(), "m$$UMfqZKKS6IdFsaWklpuzhqFI4rIiiZOnRpUOhvwuYMgGjSlYfAWQtr4pqw3WnNZqtJNhxI1Y5jjapsHKqwvxExELFMmSXaFjb", m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim.class, 52230085);
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
                v3 = 114;
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
                        v10 = 98;
                        break;
                    }
                    case 1: {
                        v10 = 18;
                        break;
                    }
                    case 2: {
                        v10 = 43;
                        break;
                    }
                    case 3: {
                        v10 = 124;
                        break;
                    }
                    case 4: {
                        v10 = 81;
                        break;
                    }
                    case 5: {
                        v10 = 76;
                        break;
                    }
                    default: {
                        v10 = 48;
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

        m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim.a = var13;
        m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim.b = new String[2];
        var6_7 = 114743282614593542L;
        var4_8 = -1182969281979399658L ^ var6_7;
        m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)var4_8;
        var2_9 = 2394672858407203414L;
        var0_10 = 7904140225443996792L ^ var2_9;
        m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_10);
    }

    public static void a() {
        Object[] objectArray = c;
        c[0] = "\f>1\u0006\u0011\u000e\u00027v\u000e\u0016\u0015O6;O\u001904)q#\u001f0U\u000b*\u0006-\u000f\t3F\f\u000f\u0013$)Z11\u0017)b['\u00116Q\tm>\u0011R\u0017\u0010)\u0011\u001e7R\u0011OY:\u0004U\b/10'\u000e\f,.\u0013-4\u0012{\f9 3.o]/\t\b\u0015n\u0018*.\u0000i}\u001f\u00155\u0004cg\u001aL\u0010\ton#\u0015";
        objectArray[1] = Long.TYPE;
        m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim.d[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$dA3xZRMLGfs7RNZE6RpVSgtUenLWVFYnUG38WmbeeJtzpmtvtMIDieOuy9Y8uWX4Etlu43gMUZ2Jl7uwfA7xNmNHcCl6n5dim.d[2] = "java/lang/Integer";
        objectArray[3] = "~`hAD\u001euoy\u000e%\u0010~d}T";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "t2w\u0011z('a&(E n?f\u0010iS~N*b*Vx}kN&rtEYnrkQO-R\\hcjSOEQ'j.K${B4-\u0015_jpsWlw.tbuqIq\u007fPU\u0019|PtH+Zb!tDlzXWsEtyPMM6pL\\CbCeR#s$]\u0017\u0011*+'s-\u0011d{ \u000f.XpcdhpY*m\u001f";
    }

    public static String m$$UMfqZKKS6IdFsaWklpuzhqFI4rIiiZOnRpUOhvwuYMgGjSlYfAWQtr4pqw3WnNZqtJNhxI1Y5jjapsHKqwvxExELFMmSXaFjb(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{115, -66, 116, 77, 72, -56, 44, -78, -101, 42, -119, 82};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 12]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

