package me.mioclient;

import me.mioclient.m$$O2cV3NVCvIOmlIYg0Cw9ezc05YGGUeG5VGCA1CLjoeKVEDupXn9zApW1D5cQwdkkueHzLoLXbgnSXslhArBKOUYLl6ZzgTom5;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import net.minecraft.class_151;
import net.minecraft.class_1921;
import net.minecraft.class_287;
import net.minecraft.class_4597;
import net.minecraft.class_9801;

public final class m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf
implements m$$O2cV3NVCvIOmlIYg0Cw9ezc05YGGUeG5VGCA1CLjoeKVEDupXn9zApW1D5cQwdkkueHzLoLXbgnSXslhArBKOUYLl6ZzgTom5 {
    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[22];
        b = new String[22];
        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a();
        long l = 3697049118950867585L;
        long l2 = 0x6F717DE1FC3D7AD3L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 7729017108808552470L;
        long l4 = 0x3DF139E68279A943L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)l4);
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "\u0010a,i\u0001.\u0010a;5\r!\n*;+\r4\r[j\u007f[";
        objectArray[1] = "d\u0018.\u0005t\u0003d\u00189Yx\f~S9Gx\u0019y\"c\u0013)[";
        objectArray[2] = Void.TYPE;
        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b[2] = "java/lang/Void";
        objectArray[3] = "AyL\u0007\u001d\u0006Op\u000b\u000f\u001a\u001d\u0002qFN\u00158yn\f\"\u00138\u0018LW\u0007!\u0007Dt;\r\u0003\u001bin'0=\u001fd%&&\u001d>\u001cN\u0010?\u001dZZWT\u0010\u0012?\u001fV2X6\f\u0018OR0</CKQ/\u001f%yU\u0006\r5(~i\u0012\\#\u0001ER\u0013\u0019&&M.\u0000\u001e\u0019=I$\u001a\u001b@\u0018D(\u0013\"\u0019";
        objectArray[4] = Long.TYPE;
        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b[4] = "java/lang/Long";
        objectArray[5] = Integer.TYPE;
        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b[5] = "java/lang/Integer";
        objectArray[6] = "17C\u001eVF/?YQ1G>$T\u000b\u0017A";
        objectArray[7] = Boolean.TYPE;
        m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.b[7] = "java/lang/Boolean";
        objectArray[8] = "ZB=fgiDJ')\u001ayD";
        objectArray[9] = "\u0005>\u0004,\u000eB\u001b6\u001ecmV\u001f";
        objectArray[10] = "N9p,Q?E6ac01N=e9";
        objectArray[11] = "J~\u0001WhUTv\u001b\u0018\u0015EQj\u0012X%EDR\u0016F";
        objectArray[12] = ":ZM\u001e\u001b#4S\n\u0016\u001c8yRGW\"\u0006\u0015\u000f\u0011J1\u001a=\\U1\u001a\u000f\u0003g3#\u0003=\u0010q+\u0002!\"\u0007|U13\b9V/\u0016\u001d\u001b\u0001y6G186R\r\u0011\u0007\r\u001f\t/C\u0018u&yS\u0007\u0017'\u0000R6J:\u000b\u0007O\u00165(x'i6C+ \u000eQ\u0005F\u0014\u0016aqT9#\u0016a\u000b 8\u0014";
        objectArray[13] = "N\u0017k'3t\u001d\bd)\nj\u001b\u0017P.zvrQ{|u{JPr3l\n";
        objectArray[14] = "*=\u0016\u001cO\u000bseX\u0001w\u0000hi\u0012\u0004\u000b\u0006n\u0004T\u0016\n\u0005-z\u0007\t\u0005\u000b\u0014";
        objectArray[15] = "81\u0016\u0006#,mu\u001d\u0003L)k.\u0017\u0019!S9$\u0014\u001f7j>uN\u001cLli/\b\u001cuk8u\u000bg";
        objectArray[16] = "F\u0006|;\b%\u0007\u0005{>l,\u0014\t\u001c(\u0010OGA94T%\u001e\u0019w)l";
        objectArray[17] = "\f\u0012|dG\u0016F\u0006:c5x\u0007\t4~\rTt\u0019E2\u007f\u0017q\u001fvsS\u001bU\u0013NAsOL6D5OaO\u0004aKRxv@a6V\u0019\\%?5\bbM\u0017xOqJ\t\u0013imltV\u0018[M\u0004Aw\u0013C3G_\u0006\u0013Otgep\u0014Nldmj*=hQad\u0005H}O\u001eTCV\u000f\u000fW\fCk5X\u0017]I\u00044KOY\u0002a~EXKx";
        objectArray[18] = "J+\u0002 RM\u001b=\u0001O\u000e\u0010X,\u001e#<C\u001csHskD\u001cv\u0010?[\u000fD4\u0005O";
        objectArray[19] = "\u0005@\u0007G=\u0015IW\u001eIE\u001e\u0019\u0001\u0013P4\u0014x}Zw44I\u0016?I<$\u000e\u001d\u0007M \u0004\u0005q*R,\u0002\fg\fL\u0002\nqdZO{+|G\u001f}\u0004\u001cXfZk\u007f+\u0005R<\u001d!\u0017[|\u001a\u0015'EWR\u000e\u0017\u0019\u0019ODZi\u0015\u0016\nR<\u007f\u00016xD\u0013T>ESfY}u$\u0004cQ-+\u001cNBX\u001dz\nM-XK}JUV\u001d_,\u001f5";
        objectArray[20] = "t\u000e(N\"_?Vj[R\u0004)QiJRV+\u000e#G)\u0013?_v'";
        Object[] objectArray2 = objectArray;
        objectArray[21] = "a\u00005km12\u001f:eT)0\u000b4\u000fk 9\u000336lqc\u0000H";
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_287 class_2872) {
        try {
            if (class_2872 == null) {
                return;
            }
        } catch (class_151 class_1512) {
            throw m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(class_1512);
        }
        class_9801 class_98012 = class_2872.method_60794();
        try {
            if (class_98012 == null) {
                return;
            }
        } catch (class_151 class_1513) {
            throw m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(class_1513);
        }
        class_98012.close();
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4597 class_45972) {
        if (!(class_45972 instanceof class_4597.class_4598)) {
            return;
        }
        class_4597.class_4598 class_45982 = (class_4597.class_4598)class_45972;
        try {
            if (class_45982.field_52158 != null) {
                this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_287)class_45982.field_52157.remove(class_45982.field_52158));
                class_45982.field_52158 = null;
            }
        } catch (class_151 class_1512) {
            throw m$$PJB0r9CVjc6BhCTXPPqqGNHqSnPC6BADniLeoWVFU4CtamnbuAH6L0j9qF0tekWmU9HGPpuFZ4pVU0YlYnf5fZ6N7JQZ64CKf.a(class_1512);
        }
        for (class_1921 class_19212 : class_45982.field_20953.keySet()) {
            class_287 class_2872 = (class_287)class_45982.field_52157.remove(class_19212);
            this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2872);
        }
    }
}

