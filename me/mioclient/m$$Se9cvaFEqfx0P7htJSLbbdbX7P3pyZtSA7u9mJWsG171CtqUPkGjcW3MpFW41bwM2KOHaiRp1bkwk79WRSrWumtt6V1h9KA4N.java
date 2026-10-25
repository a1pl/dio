package me.mioclient;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.bytes.ByteArrayDecoder;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.List;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$sSdRNBqZNHoqsKVByCECd7grCnLGU1zp1qeCyBi8XkVbONQvHsqwLHireaR1oRSy2Yyy9IS7ZIkLS4QyGBDiCK0dGbtvVmubn;
import net.minecraft.class_151;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N
extends ByteArrayDecoder {
    public void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) {
        int n = byteBuf.readableBytes();
        try {
            if (n <= 0) {
                return;
            }
        } catch (class_151 class_1512) {
            throw m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N.a(class_1512);
        }
        byte[] byArray = new byte[n];
        byteBuf.readBytes(byArray);
        byte[] byArray2 = m$$sSdRNBqZNHoqsKVByCECd7grCnLGU1zp1qeCyBi8XkVbONQvHsqwLHireaR1oRSy2Yyy9IS7ZIkLS4QyGBDiCK0dGbtvVmubn.m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc(byArray, 849129109);
        list.add(Unpooled.copiedBuffer((byte[])byArray2));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = new Object[23];
        d = new String[23];
        m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N.a();
        long l = 8098707008182078139L;
        long[] lArray = new long[2];
        int n = 0;
        String string =  /* dynamic constant */ (String)m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N.m$$fUEJH1FxFmqctvvt260fl2KkvFuiCYEYO3c2orhtn47Rq1GHjlshXYYAxkaNROD8UggafKKZAIuPIp7oatDoWn34xmK0Fd7fa("551LLNheitOSDrLlHnsF", MethodHandles.lookup(), "m$$fUEJH1FxFmqctvvt260fl2KkvFuiCYEYO3c2orhtn47Rq1GHjlshXYYAxkaNROD8UggafKKZAIuPIp7oatDoWn34xmK0Fd7fa", m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N.class, 975223147);
        int n2 = string.length();
        int n3 = 0;
        do {
            byte[] byArray = string.substring(n3, n3 += 8).getBytes( /* dynamic constant */ (String)m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N.m$$fUEJH1FxFmqctvvt260fl2KkvFuiCYEYO3c2orhtn47Rq1GHjlshXYYAxkaNROD8UggafKKZAIuPIp7oatDoWn34xmK0Fd7fa("h9iGEYHB3WJlBGS4un3X", MethodHandles.lookup(), "m$$fUEJH1FxFmqctvvt260fl2KkvFuiCYEYO3c2orhtn47Rq1GHjlshXYYAxkaNROD8UggafKKZAIuPIp7oatDoWn34xmK0Fd7fa", m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N.class, 1805353772));
            int n4 = n++;
            lArray[n4] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l;
        } while (n3 < n2);
        a = lArray;
        b = new Integer[2];
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 788719;
        long l2 = 3425591017641330589L;
        long l3 = 0x36F131DEF6E14A10L ^ l2;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)l3);
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x268F;
        if (b[n2] == null) {
            m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    public static void a() {
        Object[] objectArray = c;
        c[0] = "JjwN9JDc0F>Q\tb}\u0007\u0003@\u001el/B\u0016`Vi!\u0013\u0000\u0012O{\u0013p\u001cGEk;{gu\u0014\u007f y$vf8,\u001a=op|\u001e\u0012g\u0014d{(v\u0000N`e:tchWI\u000e\u0017aGPBkh\u001fmFf\u000bSaGLx2\u0014iru\\+t%HS{ouaM\u001eD\u0018\u0017\u001e";
        objectArray[1] = "c\u0019o$Nu~\u000fo)C`d\u0018$&\u0005Bb\u0017/$NmB\u0017/.Gdx5.$_dr\u0002";
        objectArray[2] = "_8\u0010C~\u0012B.\u0010On\u0000P2L\u0003Y\u001fB2|X}";
        objectArray[3] = ".U\nKGg0]\u0010\u0004%{7@";
        objectArray[4] = Void.TYPE;
        m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N.d[4] = "java/lang/Void";
        objectArray[5] = "/x8O\\\u00072n8CL\u0015 rd\u000fl\u001d6xyM\\\u0017";
        objectArray[6] = "/\u0003";
        objectArray[7] = "n1\u001a/(@`8]'/[-9\u0010f2|g\u0006z\u00000uM\u001c[32dU\u0016M\u0001\u0004lgcS0\u0002AO\u0013as;_2%Q\u00018mjll)\u0017ML\u001ae4\t\\r#x\n(]f5fs.}P-\u0006\u001b8V:\u001dgu\u001bfh\u0018gv\u0010VD\u0016p+\u0002d30s 5YU9A /";
        objectArray[8] = "X\u000f";
        objectArray[9] = Integer.TYPE;
        m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N.d[9] = "java/lang/Integer";
        objectArray[10] = "?\u001d";
        objectArray[11] = "\u0019I";
        objectArray[12] = "\u0005C6ZU\u007f\u000eL'\u00154q\u0005G#O";
        objectArray[13] = Boolean.TYPE;
        m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N.d[13] = "java/lang/Boolean";
        objectArray[14] = "a\u0016M:\u0005Eo\u001f\n2\u0002^\"\u001eGs\r{Y\u0001\r\u001f\u000b{8#V:9Dd\u001b:0\u001bXI\u0001&\r%\\DJ'\u001b\u0005}<!\u0011\u0002\u0005\u0019z8U-\n|?93e.O8 S\r$lc$P\u0012\u0007fY:\u00070-k^\u0006\u0013a;Be=\u0012$>emA\u0001#\u0001~iK\u001b&X[dG\u0012\u001f\u0001";
        objectArray[15] = Long.TYPE;
        m$$Se9cvaFEqfx0P7htJSLbbdbX7P3pyZtSA7u9mJWsG171CtqUPkGjcW3MpFW41bwM2KOHaiRp1bkwk79WRSrWumtt6V1h9KA4N.d[15] = "java/lang/Long";
        objectArray[16] = "\u0011EwZ\t{\u0014X>\u00160yEU\",A\u007fEGNV\tqLG/\u0017L`\u0016<w\u001f\t?\u0011Dr\u0002@s(";
        objectArray[17] = "\u0000,\b:]\u007f^?K5`\u001e\u0000%GzX2s566*qv3\u0005w\u0006}R?=E&)K\u001a71\u001a\u0007H(\u0012O\u0007\u001eql\u00122\u0003\u007f[\tL1]\u0004J;\u000bK$,\u000e?\u001ai9\u0012Q4(IQ'p?07\u00129\u0001?<p2\u0003w8=h1\u000bm\u0006Nl\u0004\u0007c);y\u001axSo%\u000b\t=\u000eh\u0006n\u000b#\u000f>w5\u0004-O*\u001c1\u0007&ST";
        objectArray[18] = "\tZc\tn@\u0011H/s`\\\u0007F}\u001e\f\b\u0000\u001daJpK\u0015\\as5HU\u001d(\u000b0U\u001cQ\u0011IcO\u0001G,K7P\t!*BvUS\u001cjMaSl";
        objectArray[19] = "\u0019p\u001368\u007f^lM \u0000$EwM6l\u0005_aB6zO\u00126^?{.SsOe\u0000v[6\u0010bxsF\u007f\\[";
        objectArray[20] = "k9UpkDh.Zh\n\u0010zyW\u007fT')8GZQE38clE$\u000f:[*NN\u0004,l({\u0018jje|[\t\u00072\u001fl0D2o\\'I-\u0019\u001a\u001bms)\u001c\u001a_*pE\u0013\u0019Epv)\u0013+WoE1\u0010\nIS18(0d*4%m\u0019c_hJ3%\\Fd\b\u0004-N\u0016:L$1^w{\t5k%(n\u0018(+N,m\u00134U\u0015/x\u0011-4TjiKV";
        objectArray[21] = "BRq\u001bf$@\u0006n\u0013\u0000p\u0014Q\u000fFc}\u0007O>\nz \u0011=>\u001d:%\u001e\u0004t\u0014fsx";
        Object[] objectArray2 = objectArray;
        objectArray[22] = "Oo7a\u0007@Jr~->B\u001b\u007fb4T\\\u001b\\\u007f!SCv(j0@F\u001d,i;\\8";
    }

    public static String m$$fUEJH1FxFmqctvvt260fl2KkvFuiCYEYO3c2orhtn47Rq1GHjlshXYYAxkaNROD8UggafKKZAIuPIp7oatDoWn34xmK0Fd7fa(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-33, -49, -46, 19, -74, 64, -54, -46, 99, 12, -17, -70};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 12]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

