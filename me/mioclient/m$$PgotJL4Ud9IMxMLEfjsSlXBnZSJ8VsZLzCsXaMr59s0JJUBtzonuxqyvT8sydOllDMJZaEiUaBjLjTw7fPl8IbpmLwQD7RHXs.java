package me.mioclient;

import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_151;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs {
    public final List m$$8K5EVjQQRFadoST22RCx0nWWABjz8BwpOrTubyWO77INh40TPMoKM8Z1uZzca984BYoR8nnMx1wmnS0BxPxVhZD2rhjUOo7Oc = Collections.synchronizedList(new ArrayList());
    public final int m$$e6ZUo1gOVrqaQwJ3mTe8it7nWuyGBy2wVcjlmcttb6btkD3Uwp23KdNBYATfgoJ2KD6TRQcQPXfB8FtrMqROVuuliljDkfElJ;
    public final int m$$7zIhH8pDMLUqya95tmYRyqaN0uNzh62dzgYC22TCv4yHyse6OvmAYbPMn8DeE5eUQ8rEGCJXephJAmokN4Io39BQBLLCscm6s;

    public m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs(int n) {
        this(1000, n);
    }

    public m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs(int n, int n2) {
        this.m$$e6ZUo1gOVrqaQwJ3mTe8it7nWuyGBy2wVcjlmcttb6btkD3Uwp23KdNBYATfgoJ2KD6TRQcQPXfB8FtrMqROVuuliljDkfElJ = n;
        this.m$$7zIhH8pDMLUqya95tmYRyqaN0uNzh62dzgYC22TCv4yHyse6OvmAYbPMn8DeE5eUQ8rEGCJXephJAmokN4Io39BQBLLCscm6s = n2;
    }

    public void m$$anQgqriaBTYOeDTxR8sXUQneys6LZGXnYZi6iqePufsEec7xA39u0nasz0xaiHqKDUrO7ztkFJU08nnxzzsYxT1tfT4WQIRew(int n) {
        this.m$$8K5EVjQQRFadoST22RCx0nWWABjz8BwpOrTubyWO77INh40TPMoKM8Z1uZzca984BYoR8nnMx1wmnS0BxPxVhZD2rhjUOo7Oc.add(System.currentTimeMillis());
    }

    public boolean m$$E6thHTtGu7CePmTeVCWXGyPVW6IbqbzBFd7Wqo41OLOL9ljSaNXYmrA5aLVLG1oCi3Sj5Y0F8dzmoE2YiIEBmaOhYz08farC6(int n) {
        boolean bl;
        try {
            bl = this.m$$8K5EVjQQRFadoST22RCx0nWWABjz8BwpOrTubyWO77INh40TPMoKM8Z1uZzca984BYoR8nnMx1wmnS0BxPxVhZD2rhjUOo7Oc.size() > this.m$$7zIhH8pDMLUqya95tmYRyqaN0uNzh62dzgYC22TCv4yHyse6OvmAYbPMn8DeE5eUQ8rEGCJXephJAmokN4Io39BQBLLCscm6s;
        } catch (class_151 class_1512) {
            throw m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.a(class_1512);
        }
        return bl;
    }

    public void m$$iK6ojmsjDNEfehmBJkR8efXe0k29iZK9M1HuGOgHvoFklU83Vci7MNcwW7P3gtkK3Ua45fjgDZ0yKF1C6PN1Lot0NAPgbDj2j(int n) {
        this.m$$8K5EVjQQRFadoST22RCx0nWWABjz8BwpOrTubyWO77INh40TPMoKM8Z1uZzca984BYoR8nnMx1wmnS0BxPxVhZD2rhjUOo7Oc.removeIf(l -> {
            boolean bl;
            try {
                bl = System.currentTimeMillis() > l + (long)this.m$$e6ZUo1gOVrqaQwJ3mTe8it7nWuyGBy2wVcjlmcttb6btkD3Uwp23KdNBYATfgoJ2KD6TRQcQPXfB8FtrMqROVuuliljDkfElJ;
            } catch (class_151 class_1512) {
                throw m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.a(class_1512);
            }
            return bl;
        });
    }

    public void m$$8Bm4UPmKd41vpxP368fjeVYfJ9YwShsr4iIJwWY4SMjndAIm2xvRPBBgVkbMv9lml1qBune9KLTTjGcYlyFP53Aa8pgUXJipU(int n) {
        this.m$$8K5EVjQQRFadoST22RCx0nWWABjz8BwpOrTubyWO77INh40TPMoKM8Z1uZzca984BYoR8nnMx1wmnS0BxPxVhZD2rhjUOo7Oc.clear();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.c = new Object[20];
                    m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.d = new String[20];
                    m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.a();
                    var4 = 7512365610978754879L;
                    var10_1 = new long[5];
                    var7_2 = 0;
                    var8_3 =  /* dynamic constant */ (String)m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.m$$uEka5OX93OKNMmLiz6XuXjkP1yFHZRFmZWFmEGjSBTxL1rc7EE59Nizb1ugdG7ZZgOk4uy5yacrRwTvCIvsu2wBFa2KP6GkbI("rUjiXK4uI8q3h1lc6XnT", MethodHandles.lookup(), "m$$uEka5OX93OKNMmLiz6XuXjkP1yFHZRFmZWFmEGjSBTxL1rc7EE59Nizb1ugdG7ZZgOk4uy5yacrRwTvCIvsu2wBFa2KP6GkbI", m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.class, 667306640);
                    var9_4 = var8_3.length();
                    var6_5 = 0;
                    while (true) {
                        var11_6 = var8_3.substring(var6_5, var6_5 += 8).getBytes( /* dynamic constant */ (String)m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.m$$uEka5OX93OKNMmLiz6XuXjkP1yFHZRFmZWFmEGjSBTxL1rc7EE59Nizb1ugdG7ZZgOk4uy5yacrRwTvCIvsu2wBFa2KP6GkbI("Fm65CMc8nfQAcLup02Tz", MethodHandles.lookup(), "m$$uEka5OX93OKNMmLiz6XuXjkP1yFHZRFmZWFmEGjSBTxL1rc7EE59Nizb1ugdG7ZZgOk4uy5yacrRwTvCIvsu2wBFa2KP6GkbI", m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.class, 2047797036));
                        v0 = var10_1;
                        v1 = var7_2++;
                        v2 = ((long)var11_6[0] & 255L) << 56 | ((long)var11_6[1] & 255L) << 48 | ((long)var11_6[2] & 255L) << 40 | ((long)var11_6[3] & 255L) << 32 | ((long)var11_6[4] & 255L) << 24 | ((long)var11_6[5] & 255L) << 16 | ((long)var11_6[6] & 255L) << 8 | (long)var11_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var6_5 < var9_4) ** continue;
                        var8_3 =  /* dynamic constant */ (String)m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.m$$uEka5OX93OKNMmLiz6XuXjkP1yFHZRFmZWFmEGjSBTxL1rc7EE59Nizb1ugdG7ZZgOk4uy5yacrRwTvCIvsu2wBFa2KP6GkbI("PXUgFxAhq9tQynPSIESc", MethodHandles.lookup(), "m$$uEka5OX93OKNMmLiz6XuXjkP1yFHZRFmZWFmEGjSBTxL1rc7EE59Nizb1ugdG7ZZgOk4uy5yacrRwTvCIvsu2wBFa2KP6GkbI", m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.class, 2133843175);
                        var9_4 = var8_3.length();
                        var6_5 = 0;
                        while (true) {
                            var11_6 = var8_3.substring(var6_5, var6_5 += 8).getBytes( /* dynamic constant */ (String)m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.m$$uEka5OX93OKNMmLiz6XuXjkP1yFHZRFmZWFmEGjSBTxL1rc7EE59Nizb1ugdG7ZZgOk4uy5yacrRwTvCIvsu2wBFa2KP6GkbI("odSA7mgJ27r3TsI6eTYj", MethodHandles.lookup(), "m$$uEka5OX93OKNMmLiz6XuXjkP1yFHZRFmZWFmEGjSBTxL1rc7EE59Nizb1ugdG7ZZgOk4uy5yacrRwTvCIvsu2wBFa2KP6GkbI", m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.class, 922918022));
                            v0 = var10_1;
                            v1 = var7_2++;
                            v2 = ((long)var11_6[0] & 255L) << 56 | ((long)var11_6[1] & 255L) << 48 | ((long)var11_6[2] & 255L) << 40 | ((long)var11_6[3] & 255L) << 32 | ((long)var11_6[4] & 255L) << 24 | ((long)var11_6[5] & 255L) << 16 | ((long)var11_6[6] & 255L) << 8 | (long)var11_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var6_5 < var9_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var4;
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl41:
                    // 1 sources

                    ** continue;
                }
            }
            m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.a = var10_1;
            m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.b = new Integer[5];
            m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 686036;
            break block10;
lbl47:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_7 = 3724405631491865522L;
        ** while (true)
        var0_8 = 2975949709913585425L ^ var2_7;
        m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_8);
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A17;
        if (b[n2] == null) {
            m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    public static void a() {
        Object[] objectArray = c;
        c[0] = "d \u001b3\u000ebo/\n|la`&";
        objectArray[1] = Long.TYPE;
        m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.d[1] = "java/lang/Long";
        objectArray[2] = "\t^\u001f&F;\u0002Q\u000ei;.\u0010K\f*";
        objectArray[3] = "\u001f\u0010\fD'\t\u0001\u0018\u0016\u000bE\u0015\u0006\u0005";
        objectArray[4] = "=\u001b3&6~6\u0014\"iWp=\u001f&3";
        objectArray[5] = Boolean.TYPE;
        m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.d[5] = "java/lang/Boolean";
        objectArray[6] = "*xqxt94pk7<9.zsp5\"nIu|>%#xs|";
        objectArray[7] = Integer.TYPE;
        m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.d[7] = "java/lang/Integer";
        objectArray[8] = Void.TYPE;
        m$$PgotJL4Ud9IMxMLEfjsSlXBnZSJ8VsZLzCsXaMr59s0JJUBtzonuxqyvT8sydOllDMJZaEiUaBjLjTw7fPl8IbpmLwQD7RHXs.d[8] = "java/lang/Void";
        objectArray[9] = "PF)S\t,^On[\u000e7\u0013N#\u001a\u0001\u0012hQiv\u0007\u0012\ts2S5-UK^Y\u00171xQBd)5u\u001aCr\t\u0014\rquk\tpKh1D\u0006\u0015\u000eiW\f\"&\tp7d(\u0005Rt4{\u000b\u000fhjcY!\u0002oVw\b7+TmvM2\f\\\u0011eJ\r\u0017X\u001b\u007fOT2U\u0017vv\r";
        objectArray[10] = "\u0012\u001c<HM\u0003\f\u0014&\u0007 \u0019\u0014\u0011/J\u0017\u001f\u0017\u00139";
        objectArray[11] = "\u001d\u0011\u000fh\u001cb\u0017R`u\u0015}\u0010\u0006'e| \u0004Z\u0000l\u0017u\u000f\u0006^\u000b\fc\u0002\b\u0000p\u0006 m";
        objectArray[12] = "~1r3#L)rn%\u001d\u001b `b4\u001dNxmvr\"\u0001\u007fhsN";
        objectArray[13] = "u\u0015\u001a}t\u000e-\u001aOf\u001e7zUCp&\u001b\tE2<TX\fC\u0001}xT(O9OX\u00001j3;d.2X\u0016Ey7\u000b\u001c\u00168}V!yH;#-0K\u000fAZ\u0005tO\u001ecG;+D,C/\u000e\nO4=l\u0010{O8zL*\rH9bO\"\u0017vJfz.\u0019Y?sdQ)\u001f!\u0001'\u0000zD\u0014jr\u000b&\u001as<qU7\u001eBgs\u0017-$";
        objectArray[14] = "zV:PiE5\u0003aZ\u0017\u00074Y3Wm\u001b#^*Z{8$D$7-@<Bf\u000bz\u0003 TX\r+\u00058\u0001dZh\u0019.?";
        objectArray[15] = "&p+\u001d(\u0011q37\u000b\u0016Wq)5\u001e{lrLn\f)Ba<i_oS\u001cw\"\u0001fSpq5\u0007l-";
        objectArray[16] = "?N6\u0018\u0017A5\rY\u001f\u0010\\ j0\u001f\nWO\r0J\u0017]$X;\u0016I:";
        objectArray[17] = "\u001c\u0003S8{RUYF:\u0011BX\u0018B2wUy\u0003]2THA\u0006Y$\u0011\u0010LSX8zEG\u000f\u0006_";
        objectArray[18] = "\u0015p,\u0006O<B30\u0010qiC U@\u0018l^r,C\u000bmELn\u000b\u0010pQ h\u001c\u0016z/";
        Object[] objectArray2 = objectArray;
        objectArray[19] = ">p\fG{7i3\u0010QEpe>\u0018:xd80O\u000b#fz*u";
    }

    public static String m$$uEka5OX93OKNMmLiz6XuXjkP1yFHZRFmZWFmEGjSBTxL1rc7EE59Nizb1ugdG7ZZgOk4uy5yacrRwTvCIvsu2wBFa2KP6GkbI(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-111, 58, 39, 101, 39, 111, -120, 60, 117, 73, -46, 122, 123, -86, 90, -35, 80, -18, -62};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 19]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

