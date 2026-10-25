package me.mioclient;

import java.util.function.Consumer;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import net.minecraft.class_151;

abstract class m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW {
    public boolean m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi;
    public Object m$$2IKqjxM5CCie1feTOyNzeD5vWgFFfvJQ7T4SMJyImuhiOyHyEyeD36Lvf9fAz6LUqaIZCIjmQqDutGRG8Qj9ZrxNuC8B5LQFl;

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = new Object[8];
        b = new String[8];
        m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a();
        long l = 6651602567525645417L;
        long l2 = 0x67A1C094DF80AA40L ^ l;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = (int)l2;
        long l3 = 8368363838015742303L;
        long l4 = 0x459F55AAD67CDA8FL ^ l3;
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)l4);
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "\u0004C-fo!\nJjnh:GK'/g\u001f<TmCa\u001f]v6fS \u0001NZlq<,TFQO8!\u001fGGo\u0019Ytq^o}\u001fm5q`\u0018ZlS9D+]u3QN\b\u0006q0Nm\u0002<oglG\u000f;Ss=Q&\u0000hrxT\u0001\b\u0014a\u007fk\u001a\f\u001e{z2?\u0001\u0012rCk";
        objectArray[1] = Long.TYPE;
        m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b[2] = "java/lang/Integer";
        objectArray[3] = "l%h\u0011\u001d~r-r^U~h'j\u0019\\e(\u0007q\u001e@~k!l";
        objectArray[4] = "s*&_aPx%7\u0010\u0000^s.3J";
        objectArray[5] = Void.TYPE;
        m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.b[5] = "java/lang/Void";
        objectArray[6] = "=T}=DQ;\u001a*\u0000s\u001ev\u001b68_mfjzJ\u001ch`Y;f\u0010Lla\tFDUIk}zjV{N\u0003gso?N~c\u0012EZ\u0010}=iThW\u0007DA\u0010lF%Y\u007fOgt\u00051Jnll{rT\u001fl`<Rnika$QfsU\u0012 dj}zg5z\u0015M<yG}PTf\u0012|?T\u001f\u0007\u0011}bBLn\u0011;`T/";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "(g\u00076cDmz\u00116\nUyj\u00151v<)1@xlP`:\u0018r\n\u0007l0BtkYb}\u0011I";
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Consumer consumer) {
        try {
            if (this.m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi) {
                consumer.accept(this.m$$2IKqjxM5CCie1feTOyNzeD5vWgFFfvJQ7T4SMJyImuhiOyHyEyeD36Lvf9fAz6LUqaIZCIjmQqDutGRG8Qj9ZrxNuC8B5LQFl);
            }
        } catch (class_151 class_1512) {
            throw m$$2UyzJFIF77aod6TQnZB1rgtJiCbc68Kq2sKIayYQ30RJ8NV8uINSKQU4UdHqpeQTy81WwSzcLGdkUCEzuWBHIJvSfRBPS3J2F$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.a(class_1512);
        }
        this.m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi = false;
    }

    public void m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM(Object object) {
        this.m$$2IKqjxM5CCie1feTOyNzeD5vWgFFfvJQ7T4SMJyImuhiOyHyEyeD36Lvf9fAz6LUqaIZCIjmQqDutGRG8Qj9ZrxNuC8B5LQFl = object;
        this.m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi = true;
    }
}

