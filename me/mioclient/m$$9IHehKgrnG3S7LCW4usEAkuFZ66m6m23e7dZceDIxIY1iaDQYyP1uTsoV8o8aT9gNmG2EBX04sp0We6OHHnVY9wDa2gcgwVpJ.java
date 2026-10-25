package me.mioclient;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import me.mioclient.m$$9CfHjbrlg3lojvzMCur3pT97wrs5DycHxtyGDkWIYydsdQHR12da1jLKeR7NhqPxNFjETsEDoDPgJQaA8s40JZucSUhtkV6u1;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import net.minecraft.class_151;

public abstract class m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ
implements m$$9CfHjbrlg3lojvzMCur3pT97wrs5DycHxtyGDkWIYydsdQHR12da1jLKeR7NhqPxNFjETsEDoDPgJQaA8s40JZucSUhtkV6u1 {
    public final Collection m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB;

    public m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ(Collection collection) {
        this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB = collection;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        k = new Object[16];
        l = new String[16];
        m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a();
        long l = 2440113942945561265L;
        long l2 = 0xE1CB3BEEECB238DFL ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 3225022839967310682L;
        long l4 = 0x66D755CB0FD9B0CFL ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)l4);
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static void a() {
        Object[] objectArray = k;
        k[0] = "iOrO\u000b\u0011wGh\u0000l\u0010f\\eZJ\u0016";
        objectArray[1] = Boolean.TYPE;
        m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.l[1] = "java/lang/Boolean";
        objectArray[2] = "\u0017!pVHX\t)j\u0019\u0000X\u0013#r^\tCS\u0010tR\u0002D\u001e!rR";
        objectArray[3] = "3q`vyo8~q9\u0018a3uuc";
        objectArray[4] = "\u00189\u000fx\u0016(\u00061\u00157{2\u001e4\u001czL4\u001d6";
        objectArray[5] = "F-}\n\u0014kH$:\u0002\u0013p\u0005%wC\u001cU~:=/\u001aU\u001f\u0018f\n(jC \n\u0000\nvn:\u0016=4rcq\u0017+\u0014S\u001b\u001a!2\u00147]\u0003e\u001d\u001bR\u0018\u0002\u0003U?a\u001f\u001bc=5BD\u001f`\"\u0016H~\u00017\u0000<Ey=#Q*lB\u0006\"\u0014/KJz1\u0013\u0010PNp+\u0016IuC|\"/\u0010";
        objectArray[6] = Long.TYPE;
        m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.l[6] = "java/lang/Long";
        objectArray[7] = Integer.TYPE;
        m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.l[7] = "java/lang/Integer";
        objectArray[8] = "{l\r=wJed\u0017r\u0016Oed\u001428S";
        objectArray[9] = "C\u000bh1!2\u0014\u00105A0`\u0006=i1,\tD\u00174|6p\u001aJ{.P";
        objectArray[10] = "W3czjQ\u00047ra\fB\u00031`\u001e6R\u00153pc`Z\u00163\u001c'`\u000eS,ey=A\u0001J";
        objectArray[11] = "\u001ck\u0005Ft%H8@X\fxLQAPwfN,\u0017Xtf\"oABvg\u0018;\u0012\u0007h\u001f";
        objectArray[12] = "vWE~j\u000f/\tL?\u0012\u00171\u0007Y*n\u00117j\u001d3~\u0006<QJ(#v";
        objectArray[13] = "X{H={~\u001drK?\u0004ORhG*<c!x6fN $~\u0005'b,\u0000r=\u0015Bx\u0019W7a~V\u001ae\u0012\u001fcO#!\u0012bg.\tDLa9U\u0018v\u000b\u001b@}\\r\u001a9]C\u0003y(\u00195v\"r0gvhSr< VR%u=8UZ?KN<`V1d;)~)\u0001\"%[8i\u001fd\u0006>4x\u001a)wfmn\u0013 \u00169uq\u0018\u0019";
        objectArray[14] = "q\u0012b&\u001e\u001e%A'8fI*P`-f\u001auVf$\\N&\u0013x\\";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "|v\"b&N+m\u007f\u00121\u00182zN(;\u000e;j3~3\r;\u0006";
    }

    public Optional m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Predicate predicate) {
        for (Object e : this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB) {
            try {
                if (!predicate.test(e)) continue;
                return Optional.of(e);
            } catch (class_151 class_1512) {
                throw m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a(class_1512);
            }
        }
        return Optional.empty();
    }

    public Object m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(Predicate predicate, int n) {
        for (Object e : this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB) {
            try {
                if (!predicate.test(e)) continue;
                return e;
            } catch (class_151 class_1512) {
                throw m$$9IHehKgrnG3S7LCW4usEAkuFZ66m6m23e7dZceDIxIY1iaDQYyP1uTsoV8o8aT9gNmG2EBX04sp0We6OHHnVY9wDa2gcgwVpJ.a(class_1512);
            }
        }
        return null;
    }

    @Override
    public Collection getRegistry() {
        return this.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB;
    }
}

