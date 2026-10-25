package me.mioclient;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu;
import me.mioclient.m$$9NFH4EUHl8oPJ7PQb9O53MXTzJw4cAzBSg2Utl5roVK9YFPjFttRqx9guvXWFS8s1qhSwjeGtvAenEofIhyOnjqTUdEvhUPyO;
import me.mioclient.m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$i2CswpEpUFXqIhC1UG4rnMhlSFUaEy6zBcg2FaUerrBEh86Cv5NKUdX1WmsoXFyYKTO1nS6T0sQ2BJbyp5mBe1EyEiOx2pKyo;
import me.mioclient.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import me.mioclient.m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62;
import net.minecraft.class_1044;
import net.minecraft.class_151;
import net.minecraft.class_2960;
import net.minecraft.class_310;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL
extends m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM {
    public static final class_2960 m$$Yke0ZtTYpTLjcXfMwRd4UM6uXw1Iokynfm1jM2PLDoUhdxevm9h6VgHDh6qXNSLS6EJKxRIuDAAOmIvNKdguDaID0AxDUigGj;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$8W3bTTWMptVUnrKgYwE2ZiZFqFJoNY0PFrxYmqu1ABm9AAjpgwjJFvwZfzlX4w50F9SLEL0dCC7m7O9cuYTZKHEyQol4By6jU;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$J6aXhyepA3OcrEtKM7mSZXlnt8uafpdEAE1JOOUQe8hB8PI4FRbdZ3nTpvzmPIt8DKD6TYlhrOThhuJlCd0uT7pfzZEU0NZm7;

    public m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL() {
        super("Glint", "Changes your enchantment glint's color.", m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ.m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr, new String[0]);
        m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.Xx3bJrDrRb9yiyRyGdbDeP54LarzgFWfCZfTLoRwpO8Unt9v2uefnlVtxpsFnGNmh763TSApbXpcY9ELTWzI4uurJwUuJUC6zT1l(this);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.m = new Object[42];
                                m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.n = new String[42];
                                m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.f();
                                var21 = new String[4];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt("YjYDUPQKGUlaazXe2xHp", MethodHandles.lookup(), "m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt", m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.class, 845112178);
                                var20_3 = var18_2.length();
                                var17_4 = 9;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 43;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block28;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 =  /* dynamic constant */ (String)m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt("tBM4sO2OWJp12eTPa80h", MethodHandles.lookup(), "m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt", m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.class, 575956401);
                                    var20_3 = var18_2.length();
                                    var17_4 = 5;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 81;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block28;
                                        break;
                                    }
                                    break;
                                }
lbl31:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block29;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl88
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 30;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 126;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 88;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 14;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 96;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 29;
                                            break;
                                        }
                                        default: {
                                            v15 = 98;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
                                    v8 = v11;
                                    if (v11 != 0) break;
                                    v11 = v8;
                                    v9 = v9;
                                    v14 = v8;
                                    v12 = v9;
                                    v13 = v8;
                                }
lbl88:
                                // 2 sources

                                v16 = v9;
                                v10 = v10;
                            } while (v10 > var22_6);
                            v4 = new String(v16);
                            switch (v3) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl98:
                                // 1 sources

                                ** continue;
                            }
                        }
                        m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.e = var21;
                        m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.f = new String[4];
                        var8_7 = 6625865915335390321L;
                        var14_8 = new long[50];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt("J3P5oriMmjumTMPwXFVV", MethodHandles.lookup(), "m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt", m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.class, 2138030922);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt("DwvTuwJgXxdwwRpZR8iH", MethodHandles.lookup(), "m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt", m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.class, 937741913));
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block30;
                            break;
                        }
lbl115:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 =  /* dynamic constant */ (String)m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt("4T4jUYRh1VcYOt3us5W4", MethodHandles.lookup(), "m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt", m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.class, 1242448909);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt("Fz8oHafh5wLdwWikoVVd", MethodHandles.lookup(), "m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt", m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.class, 578534074));
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block30;
                                break;
                            }
                            break;
                        }
lbl128:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block31;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
                    switch (v20) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl139:
                        // 1 sources

                        ** continue;
                    }
                }
                m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.g = var14_8;
                m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.h = new Integer[50];
                m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 765750;
                var0_14 = 1615256122635567357L;
                var6_15 = new long[3];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt("VV90H9hRSAhfiNcj10Gt", MethodHandles.lookup(), "m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt", m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.class, 1007919979);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    break block32;
                    break;
                }
lbl152:
                // 1 sources

                while (true) {
                    var6_15[v22] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block33;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt("VgeHVyFmYPuiU0zG3brT", MethodHandles.lookup(), "m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt", m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.class, 1074451002));
            v22 = var3_16++;
            ** while (true)
        }
        m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.i = var6_15;
        m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.j = new Long[3];
        m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)4950185612351512830L);
        m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.m$$Yke0ZtTYpTLjcXfMwRd4UM6uXw1Iokynfm1jM2PLDoUhdxevm9h6VgHDh6qXNSLS6EJKxRIuDAAOmIvNKdguDaID0AxDUigGj = class_2960.method_60655((String)"mio-mount", (String)"textures/shine.png");
    }

    public static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7E51;
        if (h[n2] == null) {
            m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.h[n2] = (int)(g[n2] ^ l);
        }
        return h[n2];
    }

    public static long c(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x7C16) & Short.MAX_VALUE;
        if (j[n2] == null) {
            m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.j[n2] = i[n2] ^ l;
        }
        return j[n2];
    }

    public static void f() {
        Object[] objectArray = m;
        m[0] = "_u,yk\u0012Tz=6\f\u0010Aq=}7";
        objectArray[1] = Integer.TYPE;
        m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.n[1] = "java/lang/Integer";
        objectArray[2] = "Tm\u001afI\u0006Zd]nN\u001d\u0017e\u0010/I[z{C{e\u0019lNlzi\u0001z9aL\u0014\u001bWE\\gs/liqr\u0016\u0013{kS9f\blmFyb,Q0\u0002HV\\wCaoxXneGdx/@Q\u007f_oXW[\u0002_\u0010\u001ah:vAB\u0010I=YIEX|qqbo\u0011\u000bx\u007frO";
        objectArray[3] = Float.TYPE;
        m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.n[3] = "java/lang/Float";
        objectArray[4] = Void.TYPE;
        m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.n[4] = "java/lang/Void";
        objectArray[5] = "!?\u001aF9m/6]N>vb7\u0010\u000f\u0000q\u0016>xo\u0002F\u0007o\u007fr`Z\u007f\u0015bI 1\"\u001ebN o\u0015\u0012w\u001eha\u0000>uYcw\nl\u0003\u0018\u0013C%9dJhw~\u001bEiaz?\u0018f\u001c\u001fT\u0001\u0019lq\u0015U\u0018\u001dmO\u00164#\u0014_g\u001bg\u00190SN\u0014w\u0004\u0011aN\u0007m\u001c\u0019\u0007s\u001c";
        objectArray[6] = "Xjqrv\u0005Se`=\u001e\u0005]js";
        objectArray[7] = "bK\u001b'(`lB\\//{!C\u0011n,he\u0019Y\u0005\u0006em@e!&JBOW\u000b$cGZd\u0002)cA}~'u}M\u0019P:\u0011`hDs,,gljf;tK`F\u0003\u001c\u001267j[\u0019yexz@}'>6\u001fq%\b;z\u0018G.)||VD2\u0015izl{;\u0019vFM\\\ft";
        objectArray[8] = "u8b\u0006Hu~7sI){u<w\u0013";
        objectArray[9] = "y4NT=dw=\t\\:\u007f:<D\u001d5ZA#\u000eq3Z \u0001UT\u0001e|99^#yQ#%c\u001d}\\h$u=\\$\u0003\u0012l=8b\u001aVC2]'\u001b0\u000b\u0016n \u0002Pc\u001cM{\u0006S|?GA\u0018\u0004^\u0015JF$\u0010\u000f\u0003c}\u001f\u0011J\u0006Duc\u0002M9_qi\u0018H`z|e\u0011q9";
        objectArray[10] = Long.TYPE;
        m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.n[10] = "java/lang/Long";
        objectArray[11] = "\u007f5\u000f?\u0004 \u007f5\u0018c\b/e~\u0018}\b:b\u000fI(_y";
        objectArray[12] = "\u0005#|{\u000fb\u000e,m4rz\u001d+d}";
        objectArray[13] = "\u007f+!\u0005\u0001=\u007f+6Y\r2e`6G\r'b\u0011d\u001bX`";
        objectArray[14] = "+):OO>\"'9\u0006\f3$'-\u0004\u00115f22\u0019V$:#$Oe!=\u00122\u0019V$:#";
        objectArray[15] = Boolean.TYPE;
        m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.n[15] = "java/lang/Boolean";
        objectArray[16] = "}j)6x~`\u007fq\u00149sxy";
        objectArray[17] = "\u0016z?\t=O\u0016z(U1@\f1(K1U\u000b@x\u0016`";
        objectArray[18] = "xs!\u0019\u0014Gxs6E\u0018Hb86[\u0018]eId\u0007O\u001e";
        objectArray[19] = "1 -Ts\u00028..\u001d0\u000f>.:\u001f-\t|<9\tj\b?<n({\u00036*2)g\u001e&*-";
        objectArray[20] = ")z\u0016;m\u0006'sQ3j\u001djr\u001cr='\u0002W\f\u0013Q!('W\u0006N^\u0014NZoK\\wR`\u0002~#3+[\u0017~+\u0017x\n\u0003p\u0005qmW\u0000OP\u001dYh<B\u001d0MI.=\u000e1i`\u0001B:|l\t'l:3u]\u0011p\u001f\u0005zV\u0013k\u000f\rwA\u0019j\u00035Km2A\u001f,Jh/K";
        objectArray[21] = "\u0011ZLs\u0018^\u001fS\u000b{\u001fERRF:GI?qRx\u000bxNyWk\u001fR&G0V\t\u0002=T(w\u0012K,~T/\u0012\u0006EzZ]?\u0002?\bZu\u0013\u007f\fS\b{>z0\u0006\u0014l\u0003\u0004/k\u0016q=C\u001fWQz\u001bZ:{\u000b]BT4M'K5Z1\u0007\ff%_Ol(XBa$R\u0000D\u0004";
        objectArray[22] = "@\u0005\u001b\u0001^\u001dZ@Gf^E^&J\u0002BN\"\u0004@\r^@PE\u001b[?";
        objectArray[23] = "\n\u0002HI+\u0003J\u0003I\u001b\u0016\u0017V\u0018\u0011\u0013z%\u0005TIL*r\n\u001d\nI}\bV\u0003N\u0018\u0016";
        objectArray[24] = "\u0014\u0005^0:\u001dT\u0004_b\u0007\tH\u001f\u0007jk;\u0019^]2\u0007\u0005T\u0011VdwUH\r\u001d\rn\u001dWR\u000e}>\u0001K\u0019g6<P_Y\u0002dz\u001c\u001dc";
        objectArray[25] = "\u0017S| 1R\u001d\u0013!)\rF\u0010\u0014B(a)\u0001\u000bs$n[@P%E";
        objectArray[26] = ": K b_0n\u001bs\r\u0003<mF}a1h,\u001d#\r\nip\u001aps\f#}C\u001a";
        objectArray[27] = "\u0005u3G\u001c=Li\"Ub?\u0010)-t\u0005e\u007f4\u0005B+(\u0007; c\b*~;.\u0000\u0007\u0016Y^,{\u000bjvw0e2eWl\u000exX#Zz\u007fG\r=}h1h\u0003!mg\u0015\\36wf6B]>mE-\u0006\u000b6bx(H\u001d\u001d\u007f| b_e{zt\u0003R!uA\u0015\u0003\u00060{G\u00169XfMe3\u0007\u001e&GfO\u0002YfF?*P\u001f*\u0004\u0005";
        objectArray[28] = "!y\tUk\u000f{;\u0011\u001b\u0011U6-\u001bkTK_:\u0007k_VV=\u0019k(\fJz\u0014gv\r}Y\n\u0019lm~e6@H]Eb\u001dIx{za0FRUs:'eHTbc!|qSZ{6\u001b-uXM\u001eEiKFk5zH^'G+\u001cW[Al\u0002\u007fNiV[>FPBGQ2'mSq`\u0018U,\b'\u0001\u0007DzQysF\u001f,0 =\nGm\u000ef}\u0000D\u0011";
        objectArray[29] = "\f!1]\u0017 \u0006oa\u000ex|\nl<\u0000\u0014N^-a^xrV}f\bAx\u0018-5g";
        objectArray[30] = "G{[[1`A1V\u0002[{F?Z\u00007I\u0017}\u0003V[.\u0017\u007fE\u0004:pM~\u0007gjx\u0012~\u0007\u0016*y\u0013,:";
        objectArray[31] = "O\u001102b\u0011\n\u0011i9\u0013&\u0001Sd\ti:\u000b2dzb\u0017\u00002\u007f\u0004\u007f\u001c=\u0005Vv/2\u0018\u0012|$])\u001f#\\%O2\u00162q3TF,\u000erzmL\f\u0005`-w(\r\u0018v0]\u0010>.k+,HJ4U\u0002k\u001c!\u0010e\u001a\";54Q9RJ\f\u0015t\tl+\f*S\u0000-\u0004-QjK-MJ\u0018sw\"\r\u0001\u0013\u000ep(J\u000bRk\"n\u0006Ih";
        objectArray[32] = "x\u0018j\u0002Fob]6e]<d\b(\u001eJQf\u00069\u0004D#']oe[2q\u00041\u0017\u001ai'e";
        objectArray[33] = "\n2\u0017]\u000bY\u000b%L\u0013iGP)d\f\u0015]j2`\t\u000eOJUR\u000e\u0002GU'\u0013UT&\fi_\r\u0015\u0018J)U\u000ei";
        objectArray[34] = "z\u00174\u001b\u0000\u0018pWi\u0012<\f}P\u001f\u0004Q\u000ev,,\u001dW\u0002s^mF\u0001c";
        objectArray[35] = "b/\u001a#@\u0015 \"N<;\u001022-1_\u00022NMc\u0000\u000f\"rB#K\u0004_";
        objectArray[36] = "\u0012|)E\u001c`W|pNmY\u001dt'MUundV\u0001'6kbe@\u000b:On]r+nVKW\u0006\u0017@Uyrx\nYl=r\u0005\u000e8FX,\u0006PCWjk|)k\u0013nz^4ULeH~\\`mnP\u0000\u001f~\u001cn\\G?Dji]_<LpW.[\t@~x[N\u0017?N>E<R?\u0014zsC\r?R8\u0017@\u000elMfe\u0001U:,";
        objectArray[37] = "(\bn4z$vRov\u0019 uH2,u\u0012&\flv$E(J,3(5\"V6*\u0019ufJ*zi\u007fzP3K)y$K1*w#%\tR";
        objectArray[38] = "~tbn_#w(k` :\u007fm\\`I-\u007fk[mP=okj\u0000\\\"ypdr\u001dy/\u00116y[|ykjg\u001f-\u0012*<<Z{wxzp\u0018A";
        objectArray[39] = "^p\n\n6\\\np^\u0000HT\u001f5j(\u0011jl({\u001b\u0018UW{m.\u0002vsix<\u000bhWc\tK\t[SeJ\u000f\n\u000eYh\bM4ISf\f!1\\X]x?\u0011\ttXt35INd^\u000e\u0014\f\tGJL\u0006wCzv\t$_\b#\u000e\f$\t\nxI3\f\\c)\u0004\u0000\u0018\n}^Dq%MSdVHp\fZ\u007f4";
        objectArray[40] = ",D\u0000\u000f3v&\u0004]\u0006\u000fb+\u0003.\u000er`F\u0003\u0007\u0001nn4B\\W\u000f";
        Object[] objectArray2 = objectArray;
        objectArray[41] = "\u000be(BB$\u0011 t%Yw\u0017uj^NP\u0018d}^#f\nsqFQ'Q%\u0010Y@q\b{b\u0018\u001b'i";
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62(m$$V2Krh115dTil6CiDCChVxOfigKboUspdAAlSAGlM4OpVZIlKf1g2UO0CWiplcxxbxwWvjLygNFDkENfQ5lr9gS5JL6cOWS6qa=100)
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$9NFH4EUHl8oPJ7PQb9O53MXTzJw4cAzBSg2Utl5roVK9YFPjFttRqx9guvXWFS8s1qhSwjeGtvAenEofIhyOnjqTUdEvhUPyO m$$9NFH4EUHl8oPJ7PQb9O53MXTzJw4cAzBSg2Utl5roVK9YFPjFttRqx9guvXWFS8s1qhSwjeGtvAenEofIhyOnjqTUdEvhUPyO) {
        try {
            if (m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.m$$3gAvoKHheKqBNavJhpWc8US32intTsPUmtMkceNfqfYJKX2l6CODwm1YTbXQZDhT8obUpZhcU3fGPiy46wk4ePNd91B32OwXw) {
                return;
            }
        } catch (class_151 class_1512) {
            throw m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.a(class_1512);
        }
        if (m$$9NFH4EUHl8oPJ7PQb9O53MXTzJw4cAzBSg2Utl5roVK9YFPjFttRqx9guvXWFS8s1qhSwjeGtvAenEofIhyOnjqTUdEvhUPyO.m$$VQQSW9GbXlljQWBOHxDEKQlr52IbhtvvJ7by44tphw0XqecLDFQ0OIHJupuubwT52Vv5FNxkJpdf322ud01iuJLeX88yX3FOx() == m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$sQwB8Gn4SsL46dO2Upi4yBLYPCnKWOlOaSGrxKbwA1RWaIibNyrn6OSioUC20gJrJQ0HrgfZY1nKYe7wPwvGZ4a6oZ3eJBH69) {
            Color color = (Color)this.m$$8W3bTTWMptVUnrKgYwE2ZiZFqFJoNY0PFrxYmqu1ABm9AAjpgwjJFvwZfzlX4w50F9SLEL0dCC7m7O9cuYTZKHEyQol4By6jU.getValue();
            class_1044 class_10442 = class_310.method_1551().method_1531().method_4619(m$$Yke0ZtTYpTLjcXfMwRd4UM6uXw1Iokynfm1jM2PLDoUhdxevm9h6VgHDh6qXNSLS6EJKxRIuDAAOmIvNKdguDaID0AxDUigGj);
            class_10442.method_4527(true, false);
            RenderSystem.setShaderTexture((int)0, (GpuTexture)class_10442.method_68004());
            m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, 1.0f);
        } else {
            m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$i2CswpEpUFXqIhC1UG4rnMhlSFUaEy6zBcg2FaUerrBEh86Cv5NKUdX1WmsoXFyYKTO1nS6T0sQ2BJbyp5mBe1EyEiOx2pKyo m$$i2CswpEpUFXqIhC1UG4rnMhlSFUaEy6zBcg2FaUerrBEh86Cv5NKUdX1WmsoXFyYKTO1nS6T0sQ2BJbyp5mBe1EyEiOx2pKyo) {
        try {
            if (m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.m$$3gAvoKHheKqBNavJhpWc8US32intTsPUmtMkceNfqfYJKX2l6CODwm1YTbXQZDhT8obUpZhcU3fGPiy46wk4ePNd91B32OwXw) {
                return;
            }
        } catch (class_151 class_1512) {
            throw m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.a(class_1512);
        }
        m$$i2CswpEpUFXqIhC1UG4rnMhlSFUaEy6zBcg2FaUerrBEh86Cv5NKUdX1WmsoXFyYKTO1nS6T0sQ2BJbyp5mBe1EyEiOx2pKyo.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ(6.25f * m$$PsZdLDRDK5KY0X3OVbp3nDVepmYHC58cLdAr3uF673CAicPa8u2AqB1xsBR7OVMCXZEWTGYdF6oNkLKeUjgeDuHKUeWoPC3XL.m$$hDMsM3tDFnD4jD14XsgHo5oPy6uUllEoQeWknfaChhCiKma3TJQlpjRShkHrE44MJDmjpsTbFUQf5NX3NcSeqPWQDRMiIzUXA((Integer)this.m$$J6aXhyepA3OcrEtKM7mSZXlnt8uafpdEAE1JOOUQe8hB8PI4FRbdZ3nTpvzmPIt8DKD6TYlhrOThhuJlCd0uT7pfzZEU0NZm7.getValue(), 900289333));
    }

    /*
     * Exception decompiling
     */
    public static float m$$hDMsM3tDFnD4jD14XsgHo5oPy6uUllEoQeWknfaChhCiKma3TJQlpjRShkHrE44MJDmjpsTbFUQf5NX3NcSeqPWQDRMiIzUXA(int var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:851)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:279)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:202)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:538)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:368)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:190)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:90)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static String m$$JLCGpxEmNYU4weO45wzd5VkqzhikIumi7YG9TX6g2euCknJ7om5mGIBAbq8iX7OgZIbKRKq9sM7SxWOjzHyh5aCT8kxQdXgjt(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-41, -110, 81, -89, -53, -120, -41, 121, 126, -37, -120, 45, -51, -29, 36, 39, -75, 17, -115};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 19]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

