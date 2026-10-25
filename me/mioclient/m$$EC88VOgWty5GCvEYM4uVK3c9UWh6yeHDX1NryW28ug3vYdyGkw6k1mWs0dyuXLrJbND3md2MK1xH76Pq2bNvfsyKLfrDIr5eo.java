package me.mioclient;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import net.minecraft.class_1792;

public final class m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo
implements JsonDeserializer,
JsonSerializer {
    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[18];
        b = new String[18];
        m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.a();
        long l = 6966657324692973116L;
        long l2 = 0x15D315C30631AE9CL ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 6051434213205553495L;
        long l4 = 0x6DBC6F9B44E23763L ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)l4);
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "V\u0011-\u000e\u0016UV\u0011:R\u001aZLZ:L\u001aOK+h\u0017B\u000e";
        objectArray[1] = Integer.TYPE;
        m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b[1] = "java/lang/Integer";
        objectArray[2] = "\u0015E!\u0017(E\u0019M \\aM\u0005E\"\u0017\u0005Y\u0019D\tU*G\u0013D8";
        objectArray[3] = "kVzg_ve_=oXm(^p.WHSA:BQH2cagcwn[\rmAkCA\u0011P\u007foN\n\u0010F_N6a&__*pxbpPO5y\u00048t|2`dP~_idgO]USz0mwXTF$<aqo}%ydVg\u00016~[Mc\u000b,{\u0002hn\u0007%B[";
        objectArray[4] = Long.TYPE;
        m$$EC88VOgWty5GCvEYM4uVK3c9UWh6yeHDX1NryW28ug3vYdyGkw6k1mWs0dyuXLrJbND3md2MK1xH76Pq2bNvfsyKLfrDIr5eo.b[4] = "java/lang/Long";
        objectArray[5] = "Pi\u0010oo_^`WghD\u0013a\u001a&Cs\u00054hMagIu\u000bEEFxUs6sfv?];SgU:GgNte=pp\u007fg\u000f4Ke5FdhGEmG\u000bg\u000foQC\rhGw^|OF\\LB\u0003Ph\fOM\u0001ED\t4VA\u000fnpt`CDGrdttt~\u000bgi";
        objectArray[6] = "L~o\u0003\u00110Gq~LM9@s|\u0001Krrfi\u0007";
        objectArray[7] = "|:fbaap2g)(il:ebL}p;X)tg~9b6gzv:e\u000fi`k0s8";
        objectArray[8] = "4&4T\u000bp?)%\u001blr*\"%PW";
        objectArray[9] = "J\u0006YT\u000e!F\u000eX\u001fG)Z\u0006ZT#=F\u0007p\u001f\u001a+[\u0000U\u0016\u00004H\u001d]\u0015\u0007\rF\u0007@\u001f\u0011:";
        objectArray[10] = "\u0000E;hAe\u000bJ*' k\u0000A.}";
        objectArray[11] = "yEy5id:\u001dc#\u0005Dr]9==h\u0001MHqO+\u0004K{0c' GC\u0002Cs9bIv\u007f]:Pl\bbD\u0003\u0014luf%)q2v8^8Cu\fAv|Gd.\\H#LV\u000e4}\u0002GNpwcsGB7WY\u0005@C/TQ\u001f~0+a]\u0011QE>\u007f\"!\u0017[L?e=\u001227cv3\u0013\tuna8Qnv5xr,";
        objectArray[12] = "V!apg@\u0017 r!\u0015\u001bAuagd\u0011 \t(@d1\u0011bM~l!Viuzp\u0001]\u0005Xe|\u0007T\u0013~{R\u000f)\u0010(x+.$3mJT\u0019\u0000\u0012(\\/.]&N*q\u0012\u0003\bh\"w@\u000f&| I\u001c\u00170(^E\u0013R&NHQ3 0acn@\u000b\u0012+J%!\\\u0017#\u001a,\u0005\u0006!/}n\u0002\u0012f\u0013&~\u0012Vej}$\u0011\u0006Y-q|D\u0002e+fj\u0014m=sy/\u0013\u0015+(q\u0015";
        objectArray[13] = "SXPFTW\u0003FGXdO\u0007DQJ#_n\u0019G\\\u001fL\t\u001a\u001cEU1SXPFTW\u0003FGXd";
        objectArray[14] = "H(&7<\u0004^s.\r4\u0011P(\"a\u0006C\u001cwx\rh\u0017W38jkLNyEi1\u001f\u0016%=\u007fj\u0017,";
        objectArray[15] = "\u0006Y}+T\u001fGXnz&D\u0011\r}<WNpq4\u001bWnA\u001aQ%_~\u0006\u0011i!C^\r}D>OX\u0004kb aPyh4#\u0018qtKq\u0011gFPj4\u0007\u001cq\r^RqBMSptyD\u001f_^`{zCGH4\u0005vL\u0002^R\u0013blpH}8]\u001f[j7\u0011\u0016~\fo?ABA^\u001bb9T\u001aV!3*J\u001a\u0001XhpIJ=\u001co{\u0016[_H~&W!\u0004Zd9\u001aFF]p~&";
        objectArray[16] = "\u0013\u0011tjD\u001eQ\u0016`-x\u0016G\u0016Vi9\u001fVj&y\u0003\u0002W\r%\"\u001aH*";
        Object[] objectArray2 = objectArray;
        objectArray[17] = ",@!l\u000bB:\u001b)V\u0003W4@%:1\u0005x\u0010zV\u0002Z+\u001a/.\u0014\u0001# {=\u001dA5Gxf\u0004\u000bH";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_1792)object, type, jsonSerializationContext);
    }

    public JsonElement m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_1792 class_17922, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive((Number)class_1792.method_7880((class_1792)class_17922));
    }

    public class_1792 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return class_1792.method_7875((int)jsonElement.getAsInt());
    }
}

