package me.mioclient;

import java.io.DataOutput;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import org.jetbrains.annotations.NotNull;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO
implements DataOutput {
    public int m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi;

    public int m$$RJm5GKAYSsUuTHL0X1xLuUMpNRUi9saH2ApMODc1Qc8TZGyMNz8Hq0k6kxFRpRa2PGEL2I47y0M0ZCKbsK6X5ZS5cfQWuuZhD(int n) {
        return this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi;
    }

    @Override
    public void write(int n) {
        ++this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi;
    }

    @Override
    public void write(byte[] byArray) {
        this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi += byArray.length;
    }

    @Override
    public void write(byte @NotNull [] byArray, int n, int n2) {
        this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi += n2;
    }

    @Override
    public void writeBoolean(boolean bl) {
        ++this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi;
    }

    @Override
    public void writeByte(int n) {
        ++this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi;
    }

    @Override
    public void writeShort(int n) {
        this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi += 2;
    }

    @Override
    public void writeChar(int n) {
        this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi += 2;
    }

    @Override
    public void writeInt(int n) {
        this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi += 4;
    }

    @Override
    public void writeLong(long l) {
        this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi += 8;
    }

    @Override
    public void writeFloat(float f) {
        this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi += 4;
    }

    @Override
    public void writeDouble(double d) {
        this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi += 8;
    }

    @Override
    public void writeBytes(String string) {
        this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi += string.length();
    }

    @Override
    public void writeChars(String string) {
        this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi += string.getBytes().length;
    }

    @Override
    public void writeUTF(@NotNull String string) {
        this.m$$M0Q2Jbb6XA3KnAx7Jnx1DXhPA1rRfhXQtCdpu5mUb1Xc0VcXpWITCXoHv8ZOSGMLilCui1LhfY9WLHVm8Jv6q04OV1q2smHbi += string.getBytes().length;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                block10: {
                    block9: {
                        m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.e = new Object[9];
                        m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.f = new String[9];
                        m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.a();
                        var8 = 6518004838746705715L;
                        var14_1 = new long[29];
                        var11_2 = 0;
                        var12_3 =  /* dynamic constant */ (String)m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546("YIjgYiBcIMlYR0rcz5as", MethodHandles.lookup(), "m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546", m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.class, 132034376);
                        var13_4 = var12_3.length();
                        var10_5 = 0;
                        while (true) {
                            var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes( /* dynamic constant */ (String)m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546("FzfOwUBvtmvmHnVQCyyS", MethodHandles.lookup(), "m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546", m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.class, 1941928543));
                            v0 = var14_1;
                            v1 = var11_2++;
                            v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                            v3 = -1;
                            break block9;
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            var12_3 =  /* dynamic constant */ (String)m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546("jtzpnPsmZcnvp2HlIHkg", MethodHandles.lookup(), "m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546", m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.class, 2038105233);
                            var13_4 = var12_3.length();
                            var10_5 = 0;
                            while (true) {
                                var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes( /* dynamic constant */ (String)m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546("O2Fjku3o1bRDUhWcMeCU", MethodHandles.lookup(), "m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546", m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.class, 1826319572));
                                v0 = var14_1;
                                v1 = var11_2++;
                                v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                                v3 = 0;
                                break block9;
                                break;
                            }
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            break block10;
                            break;
                        }
                    }
                    v4 = v2 ^ var8;
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
                m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.a = var14_1;
                m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.b = new Integer[29];
                m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -180270;
                var0_7 = 754275826782788440L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 =  /* dynamic constant */ (String)m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546("rdZBNd3WdpcWzfc5HuIP", MethodHandles.lookup(), "m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546", m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.class, 1289060131);
                var5_11 = var4_10.length();
                var2_12 = 0;
                while (true) {
                    break block11;
                    break;
                }
lbl54:
                // 1 sources

                while (true) {
                    var6_8[v5] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block12;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes( /* dynamic constant */ (String)m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546("ESerk7GgNE0iTUUGxSyJ", MethodHandles.lookup(), "m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546", m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.class, 611408526));
            v5 = var3_9++;
            ** while (true)
        }
        m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.c = var6_8;
        m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.d = new Long[3];
        m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)5110122922277528034L);
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7DCD;
        if (b[n2] == null) {
            m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x7A92) & Short.MAX_VALUE;
        if (d[n2] == null) {
            m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.d[n2] = c[n2] ^ l;
        }
        return d[n2];
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "1NmX=\u0006:A|\u0017@\u001e)Fu^";
        objectArray[1] = "s/";
        objectArray[2] = "\u0004m!{o\u0014\ndfsh\u000fGe+2g*<za^a*]X:{S\u0015\u0001`Vqq\t,zJLO\r!1KZo,YZ}CoH\u001fC9l`-ZB_$D\u001e][?LN=\u0006_<Sm7<AkqG:;}\u007f Q\u0013\u0000F~eT4\b:mbk/\f0wg2\n\u0001<~^k";
        objectArray[3] = Long.TYPE;
        m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.f[3] = "java/lang/Long";
        objectArray[4] = Integer.TYPE;
        m$$3CbcjM1f57OTnwHs9q8HjXDwiq52B7LNbGeGj1jwEDp9ossfTS4hwcsZQhwHSOvi06DLDoRQZl3jS42bFV1KCqDSV1BvqCZoO.f[4] = "java/lang/Integer";
        objectArray[5] = "Xs\u0019UQJS|\b\u001a0DXw\f@";
        objectArray[6] = "c\u0011w36|6\u0010,Vjqi\u001ak6\u000e&rLr/~y1\u0012nV";
        objectArray[7] = "\u0012g,*\ntJ9~{fU\u001axr2^yih\u0003~,:ln0?\u00006Hb\b\r bQG\u0002y\u001cLRu'\u0007\u0001Uk1'z\u00054ATyy[OPf>\u0003\"g\u0014b/!?YKi\u001d\u0001Wljb\u0005\u007f\u0014r\u001bb\t84Hme\b 7@w[{$\u0002Lyt\u000e1\u001c3I2\u0010C\\aAl (\u00033JxBy\u001b2Np2&XlR\t";
        Object[] objectArray2 = objectArray;
        objectArray[8] = "ic2\t*1<bil}<yM#\u0010\u007f*\u0005>hS+=f66S)Q";
    }

    public static String m$$m0bg0kVXnQvQIKudkKURa6AomPpDFsuSi10Lu4MUOb5yKVNVQGEdo72ojjbrMSoUUoZQW0tjufhyoeMZcgml9QUp6I3iyr546(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-119, 33, -114, 36, 60, -106, 109, -47, -97, -27, -36, -83, -84, -101, 82, -110, -88, 86, 119, 17};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 20]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

