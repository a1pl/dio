package me.mioclient;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$Sc5Y8o1OuTYi4MLSAIzNFnbvTemFJeRD22TFG7uOgMnyNPvZDugsMZ660XsEQfte53ZKf9nmzu99eawHc57GerNGzGULX3ff9;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC;
import me.mioclient.m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus;
import me.mioclient.m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt;
import me.mioclient.m$$imIrh6eW4tGxtkMZGLEtSalH1H0P64VQc2l8GR9G3f854a1jkvYqEMV1zVkLHM08qzoqihcP4n55y5jaFxd8VgsmdF2SzZMQO;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import me.mioclient.m$$tQzKMxUjFH9uRZjhKMcY8q3DfZQwOe8agGk67vEKJw2wSstcz0mKFZVYsuXcd2YFZodE1Ei2NQ5XNaRInXnVLJh5iWz2Xs1sd;
import me.mioclient.m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM;
import net.minecraft.class_151;
import net.minecraft.class_2172;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI
implements ArgumentType,
m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public final String m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM;
    public final m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt;
    public static final String c;

    public m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI(m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM, String string) {
        this.m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM = string;
        this.m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt = m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block20: {
                block19: {
                    block21: {
                        break block21;
lbl1:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.f = new Object[91];
                    m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.g = new String[91];
                    m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.a();
                    v0 = ( /* dynamic constant */ (String)m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.m$$NCAENHzNJGB6e77fwiL8A6u6THHjFQ450nc4UykMgrg2nrI2B5cxil5W49es0WugTqEfFtSrmvfIDtNwwH2lugX3zQY4HWNml("rLktc53HadwH5DlRK5KS", MethodHandles.lookup(), "m$$NCAENHzNJGB6e77fwiL8A6u6THHjFQ450nc4UykMgrg2nrI2B5cxil5W49es0WugTqEfFtSrmvfIDtNwwH2lugX3zQY4HWNml", m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.class, 1234117369)).toCharArray();
                    v1 = v0.length;
                    var12 = 0;
                    v2 = 16;
                    v3 = v0;
                    v4 = v1;
                    if (v1 > 1) ** GOTO lbl58
                    do {
                        v5 = v2;
                        v3 = v3;
                        v6 = v3;
                        v7 = v2;
                        v8 = var12;
                        while (true) {
                            switch (var12 % 7) {
                                case 0: {
                                    v9 = 85;
                                    break;
                                }
                                case 1: {
                                    v9 = 51;
                                    break;
                                }
                                case 2: {
                                    v9 = 23;
                                    break;
                                }
                                case 3: {
                                    v9 = 4;
                                    break;
                                }
                                case 4: {
                                    v9 = 39;
                                    break;
                                }
                                case 5: {
                                    v9 = 42;
                                    break;
                                }
                                default: {
                                    v9 = 41;
                                }
                            }
                            v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                            ++var12;
                            v2 = v5;
                            if (v5 != 0) break;
                            v5 = v2;
                            v3 = v3;
                            v8 = v2;
                            v6 = v3;
                            v7 = v2;
                        }
lbl58:
                        // 2 sources

                        v10 = v3;
                        v4 = v4;
                    } while (v4 > var12);
                    ** while (true)
                    m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.c = new String(v10).intern();
                    var4_1 = 3848815003256248640L;
                    var10_2 = new long[55];
                    var7_3 = 0;
                    var8_4 =  /* dynamic constant */ (String)m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.m$$NCAENHzNJGB6e77fwiL8A6u6THHjFQ450nc4UykMgrg2nrI2B5cxil5W49es0WugTqEfFtSrmvfIDtNwwH2lugX3zQY4HWNml("q1tw7TVVciwW0LGiJjf3", MethodHandles.lookup(), "m$$NCAENHzNJGB6e77fwiL8A6u6THHjFQ450nc4UykMgrg2nrI2B5cxil5W49es0WugTqEfFtSrmvfIDtNwwH2lugX3zQY4HWNml", m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.class, 416630421);
                    var9_5 = var8_4.length();
                    var6_6 = 0;
                    while (true) {
                        var11_7 = var8_4.substring(var6_6, var6_6 += 8).getBytes( /* dynamic constant */ (String)m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.m$$NCAENHzNJGB6e77fwiL8A6u6THHjFQ450nc4UykMgrg2nrI2B5cxil5W49es0WugTqEfFtSrmvfIDtNwwH2lugX3zQY4HWNml("LZcTFMwKOPy4RxErWG1J", MethodHandles.lookup(), "m$$NCAENHzNJGB6e77fwiL8A6u6THHjFQ450nc4UykMgrg2nrI2B5cxil5W49es0WugTqEfFtSrmvfIDtNwwH2lugX3zQY4HWNml", m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.class, 891089182));
                        v11 = var10_2;
                        v12 = var7_3++;
                        v13 = ((long)var11_7[0] & 255L) << 56 | ((long)var11_7[1] & 255L) << 48 | ((long)var11_7[2] & 255L) << 40 | ((long)var11_7[3] & 255L) << 32 | ((long)var11_7[4] & 255L) << 24 | ((long)var11_7[5] & 255L) << 16 | ((long)var11_7[6] & 255L) << 8 | (long)var11_7[7] & 255L;
                        v14 = -1;
                        break block19;
                        break;
                    }
lbl79:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var6_6 < var9_5) ** continue;
                        var8_4 =  /* dynamic constant */ (String)m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.m$$NCAENHzNJGB6e77fwiL8A6u6THHjFQ450nc4UykMgrg2nrI2B5cxil5W49es0WugTqEfFtSrmvfIDtNwwH2lugX3zQY4HWNml("EQLBEZc1duJ5PIuTqA8e", MethodHandles.lookup(), "m$$NCAENHzNJGB6e77fwiL8A6u6THHjFQ450nc4UykMgrg2nrI2B5cxil5W49es0WugTqEfFtSrmvfIDtNwwH2lugX3zQY4HWNml", m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.class, 960326328);
                        var9_5 = var8_4.length();
                        var6_6 = 0;
                        while (true) {
                            var11_7 = var8_4.substring(var6_6, var6_6 += 8).getBytes( /* dynamic constant */ (String)m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.m$$NCAENHzNJGB6e77fwiL8A6u6THHjFQ450nc4UykMgrg2nrI2B5cxil5W49es0WugTqEfFtSrmvfIDtNwwH2lugX3zQY4HWNml("hInaeVhYr1EVu4ACK4TJ", MethodHandles.lookup(), "m$$NCAENHzNJGB6e77fwiL8A6u6THHjFQ450nc4UykMgrg2nrI2B5cxil5W49es0WugTqEfFtSrmvfIDtNwwH2lugX3zQY4HWNml", m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.class, 473358890));
                            v11 = var10_2;
                            v12 = var7_3++;
                            v13 = ((long)var11_7[0] & 255L) << 56 | ((long)var11_7[1] & 255L) << 48 | ((long)var11_7[2] & 255L) << 40 | ((long)var11_7[3] & 255L) << 32 | ((long)var11_7[4] & 255L) << 24 | ((long)var11_7[5] & 255L) << 16 | ((long)var11_7[6] & 255L) << 8 | (long)var11_7[7] & 255L;
                            v14 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl92:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var6_6 < var9_5) ** continue;
                        break block20;
                        break;
                    }
                }
                v15 = v13 ^ var4_1;
                switch (v14) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl103:
                    // 1 sources

                    ** continue;
                }
            }
            m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.d = var10_2;
            m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.e = new Integer[55];
            m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 862584;
            break block22;
lbl109:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_8 = 1852098502714961184L;
        ** while (true)
        var0_9 = 8783255972980521139L ^ var2_8;
        m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_9);
    }

    public static m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI value(m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM, String string, int n) {
        return new m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI(m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM, string);
    }

    public static void a() {
        Object[] objectArray = f;
        f[0] = "6\fb\u0011`98\u0005%\u0019g\"u\u0004hX:\u0000\u001cZ\u00075Z\u000f\u000f\u001a\u0001\u0017}4\u000f^$\u0014H.+,:-{773t4@5)\n\u000e\rM\u001bc=)\u0013P4(\u0011 \u0017C;6\u0007%\u0016;o::#\u001ds\u001a\u0001\u001e\u0019K[8:\u001a5\u00181&1%\b6d\u001a+ \u001c\u0016y\u001e:\u0002t\u000eK1.1\u0002*@";
        objectArray[1] = "`d\u0010\u0001R`ij\u0013H\u0011mqb\u001aN[ffyS|K}je\u001a}Zngn\u000f";
        objectArray[2] = Integer.TYPE;
        m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.g[2] = "java/lang/Integer";
        objectArray[3] = "\u0004\u0012V`Mh\u000f\u001dG/0p\u001c\u001aNf";
        objectArray[4] = "']QUbB)T\u0016]eYdU[\u001c~y)\u000e\u001eSFH+MOsEj{lItMW\u000ba\u0007^>j\u0018t7~yg\u001c[<{z\u0018xl\u001c\u0001{\u001b\r\r\u000bZ|n\u001fb7`QG\u0018O,hGa\u001f\t5}:T{@=\u00003@\u001b]G@O]&z\u001b\u000exD\rs*u]d>Y=_F";
        objectArray[5] = "A6E[\u0000gH8F\u0012CjP0O\u0014\taG+\u0006\u0016\u0002fV<P\u0001CKM4E\u0014\u0003la6F\u0001\bpV";
        objectArray[6] = "I\u0003\n:\u0002&G\nM2\u0005=\n\u000b\u0000s1&Q\u000fq\u0011\u00001\u0015\u001e\\1\u001b\u000bg\u0010q\u0000#}k\u0002|5X8^W\u00128\f-p+`3\u0006z\u0010\fv3'\u0006L\u0014F\u000381~<P2\n\rt\u0013\u0015\u001f\u0013\u007f\u0012<q\"\u0011,`\u0017o\u0015,3F2t/\"{j'G%\u00063\u0012/i\u0011:>u\u0012E\u0010&";
        objectArray[7] = "\u0010Meyj|\u001eD\"qmgSEo0nt\u0017\u001f'[Dy\u001fF\u001b\u007fdV0I)Uf\u007f5\\\u001a\\k\u007f3{\u0000y7a?\u001f.dS|\u001aB\rrn{\u001el\u0018e6W\u0012@}BP*El%G;y\n|>#e\"D\u0019\u000f{J'\b\u001e9pk`\u000eP:lWu\bj\u0005e[j4K\"R6";
        objectArray[8] = "3G|\u0013*C8Hm\\MA-Cm\u0017v";
        objectArray[9] = "t0u4\u000fZ\u007f?d{nTt4`!";
        objectArray[10] = "!T\rjr+*[\u001c%\u001f+*F\b";
        objectArray[11] = ".kLr\\\u001a[KG}MU:ELvI\u000fN";
        objectArray[12] = "\u0019\u0018>!3{\u0010\u0016=hpv\b\u001e4n:}\u001f\u0005}|+s\u001d\u0012 {7{\u0014Y\u0000z9s\u001f\u0004'f1z\t";
        objectArray[13] = "}TP4\u001d\u000bc\\J{P\u0011yVS'A\u001byA\b\u0016\\\u0013gYC!R\u001c{P` G\u000beP";
        objectArray[14] = "\u00048>Y\u001cN\n1yQ\u001bUG04\u0010\u001cr-\u0010GX0\u0012(\u0015y~AC=9zp$dY*GQ\u0019W\u0018mZd;b\u0007<j{\u0004R8>\\x!`<)|\u0003\u0000OPl`V$w_)W\\\u001fL&\rhL%E\u000b\u001b^\u00066i%2JU\u001cw**Hw4d9\u0004 {\u0004f\u001djQe\u0001";
        objectArray[15] = "t]j\u0007\u001bczT-\u000f\u001cx7U`N\u0014e@L\b^\u0005yiY\u0007\u001bBVAv4&5HP`!(\u0002hx@\u0015\u00007`(\t\u001cR\u0005\\\\L\u0000,$4tYq&6al\u000b\b;J\\\\b\u0005\f\u0014uS\t#\u0010\u0018`I@r.\u001cuhTw\u0005Gdl\n3[KVr\u000ev\u0007K_[p#\u001f\u0001";
        objectArray[16] = "e^\u0017\u001aSJlP\u0014S\u0010GtX\u001dUZLcCTULBs\\\u001fZJV(u\u0015A\\Icp\bSKHc_\u000e`GUc";
        objectArray[17] = "#?<*\u0013>*1?cP3296e\u001a8%\"\u007fw\u000b6'5\"p\u0017>.~\u0002q\u00196%#%m\u0011?3\u0012$m\u00125%\"";
        objectArray[18] = ")SYu<*7[C:A:7";
        objectArray[19] = "wUiz\u0004}i]s5Y|oQ~v\u0004[iFzzG";
        objectArray[20] = "KB\u0018vl|UJ\u00029$|O@\u001a~-g\u000fs\u001cr&`BB\u001ar";
        objectArray[21] = Boolean.TYPE;
        m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.g[21] = "java/lang/Boolean";
        objectArray[22] = "8U++\u0006M6\\l#\u0001V{]!b\u001bs/{H>:H\u0013x<3=x?XN\u000b\f{mA6\u0002\tx\u0004GJ#WC2wnpXT\u0010{O1]U\u0006Cq%\u0015\u00128{C\u001c9{&E]%\u000b\u0010\fv_)\u000bgdult!s`hK'=k;hk\u0010#h=\u0005l\u0011\u0015\u0010\rC45\u000b";
        objectArray[23] = "*K}A;24Cg\u000eV(,FnCa./D";
        objectArray[24] = "lSDX\u0015Og\\U\u0017}OiSF";
        objectArray[25] = Float.TYPE;
        m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.g[25] = "java/lang/Float";
        objectArray[26] = "9\u0003S\\\u000b\u001f0\rP\u0015H\u0012(\u0005Y\u0013\u0002\u0019?\u001e\u0010\u0013\u0014\u0017/\u0001[\u001c\u0012\u0003t*R\u001d\u0007\u0004\u001b\u001eY\u0007\u000b\u00154\u0018j\u000b\u0016\u0015";
        objectArray[27] = "&8{\u0019\tT-7jVbV94";
        objectArray[28] = Double.TYPE;
        m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.g[28] = "java/lang/Double";
        objectArray[29] = "nT\b{S<`]OsT'-\\\u00022b'd{oe{%iH\u001e _b5BONi\"gU~nt\u001eD]\u0011cW<B^h}x\u0003{]IZ\u000b\u0011s\u0002RN`7G___]`ncq&j\u0007u\u0004CD\u007f1qpNfH\u0011msPSu+RrGxp\u0007qdV_\t!;eD\\H";
        objectArray[30] = "5guX@o5gb\u0004L`/,b\u001aLu(]3G\u001a4";
        objectArray[31] = "1g&TH-:h7\u001b/5>t1W\n$";
        objectArray[32] = "\u0000.\u001c\u000bg|\u001e&\u0006D\b{\u0018.\u0013\u0019";
        objectArray[33] = "\u001bE_\u001e\u0012'neT\u0011\u0003h\u000fk_\u001a\u00072{";
        objectArray[34] = "s\b!s\u0006!x\u00070<l\"l\u000b;w";
        objectArray[35] = "96)C)\u001e'>3\fa\u001e=4+Kh\u0005}\u0011*Ld\u001f:81";
        objectArray[36] = "\u000f\u0018NF\u0016&\u0001\u0011\tN\u0011=L\u0010D\u000f(\u000b\u0012\u0015PHH\u000b[$\u0006FG \u0017,5eN1ZJ\rs''/H6n\u000f>-\u0017$^M,\fI\u000e~+\u0019[L\u0016s-1\u0011\u001a,MN9(\u00141\u0012\u0019\u00191N6B>\bV>\u0018\u0013%\u001dZK\u000b\\>\u000e/\u001a\u0002D'=6\u001a\u000bM\u0015\u0007P+\u000bG<";
        objectArray[37] = "[lqA*n[lf\u001d&aA'f\u0003&tFV7\\p?";
        objectArray[38] = "tA\u000bg\u001d\u001azHLo\u001a\u00017I\u0001.\u0016/T@UpEE(gH;:\u0018~cgs\u0018\"\u007f\u001cJi\u001b\u0001MLnY.\u0017i~kA\u0005Ls@q3>:-AJ\\\u0006$}\u0016\u0011@0\u001fX}\u0011hDBOe}L\u0001\u0002.OC<!\u000fu|I?\u0007/.\\b{CF+S|l\u0003\u0001mk\u0015B\u001d";
        objectArray[39] = "p\u0018\u0004gzGy\u0016\u0007.9Ja\u001e\u000e(sAv\u0005G(eOf\u001a\f'c[=>\u0007=rOv\u0005(;p]~\u0012\u0007=CQc\u0012";
        objectArray[40] = Void.TYPE;
        m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.g[40] = "java/lang/Void";
        objectArray[41] = "\\'\f\u0006[cR.K\u000e\\x\u001f/\u0006O[ax0J]W[\u00056e\u0013Fg|\u0018e'wxb#N#\u0003D\u0001\u0012\u0014_d]RpNSu^\b\u0005\u0011\r\n9\u0005#\u0013\u0001Yzh3g&d=K\u0014I'zA\u0001zS\u0011]}X*A;\u0006b\u0004w[^Xmw:FSdkB/F-\u0000_K\u0018o:}";
        objectArray[42] = "iR\u0011p;Wg[Vx<L*Z\u001b93iQEQU5i0g\np\u0007Vl_fz%JAEzG\u001bNL\u000e{Q;o4eMH;\u000br|\tg4n7}o/\u0010]0d\u000fG\u001a~k`\fX9tQ~[z\u0013yVBO+\u0005PmyNn\u0000we\u0005]i?la\u000fGlfIl\u0003NU?";
        objectArray[43] = Long.TYPE;
        m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.g[43] = "java/lang/Long";
        objectArray[44] = "YY\u001b0\u001c<WP\\8\u001b'\u001aQ\u0011y\u001c\u0010pzP\u000e\u0014\u0017^x\u0004j\u0017\u0001s\tq\n>\u0001\rX\\-F\u0006lif3\u00029Mqy;32@\u0004_o\u000f=s\u0004w$7)a\u0004R+\u0004\u0011A\rx-C=WzRh?8w[q\u0011\u0013eeKpo&bzNZ9%#fK\\--&yU~\u001c\u0005";
        objectArray[45] = "\u0005_*r07]D\u007faI\"R\\Su5,XF\u001463uSLzu8pA (pxr[\u001cdi76?\u001ay1)4NGtq)M\u0006Rst#/PAo<IpRQr71uCBd\r";
        objectArray[46] = "\u001d\u0017\t=ie\u0012L\u001c%\u0015uEP+1qiN,L*rmIN\u001a9n%#";
        objectArray[47] = "\u0010tWKvhT6V.ih\u0016\u0010\u0000Roa.!\u0001Azeju\u0015I\u007fo\b#\u0006U7\u0005";
        objectArray[48] = ":+\u0003Kjog&CK\u0013`i\"BFTp\u0000x[Rjz`<\u0000\u0012(\u001e:+\u0003Kjog&CK\u0013";
        objectArray[49] = "\u0006*\u00021\u0011\nV+\u000e' \u0015T5><]\u001fr.\u0015!\\\u0013_5\bZFF\u0000y\u0014*\u001b\u001dWus";
        objectArray[50] = "l\u007f1P\u001a\u0016`wo\u000b'\u000b9w#C'Wli-O\u001a\u0014-m42";
        objectArray[51] = "\u000eh\u0001pJ\u001a\u000by\u0012fp\u0007\u001f)4mA8rz7ZA>o_=-5\u001a_o.F(\u001f}I\u0011I/^j8\u0000/J\u0003s}-R\u0010XsN\u001b'M^Xz\u000fH ^jX\u0015rM\rld\u0017x.#OO.h\t\u0010rf\u0017L\u001b\u0004iiIQ+RR=\"Q3\u0018h{\u0013t\u001cXlG*\u0016I\u0010T|\u001at\u001f\u0003H4p(\u0014\u001bJa\u0010lO[\b\u0005";
        objectArray[52] = "\u001d\u001f\u001e)*,\u0012\tIhQ9\u0013\u0014A\u001387E\u0011Jr()\u0010\u0016%*#4\r\u0019G|0(EsL\u007fji\u000f\fCi=(t";
        objectArray[53] = "`%iQz\u0005f?8F\u0015\u001ak&~th\u0011e0ySt\u0019l&\u0002\u0014oFf1lWdCt]iF)D4cp\u0012w\u0001\nl2Ig\u00037/sM~~";
        objectArray[54] = "RCb\u0013`_SP$\u0017_OEK6C:4UVaM3I\b^ A_";
        objectArray[55] = "i\u0010!B#\u0018pD\u007f\u0007\u001d]\u007f\u0016r\u0015fZ\u0002CpD}_s\u001e}\u0004}&i\u0010!B#\u0018pD\u007f\u0007\u001d";
        objectArray[56] = "E\u0019Q\u001c7n\u0018\u0014\u0011\u001cNc\u00180\n\u0003#e4\u001d\u0016\u0011N%\u0012H\r\u0005?x\u001f\b\r|";
        objectArray[57] = ";`E- ';q_*[3j-j\u001155'Xb\u000476-?At\u0019\u000bzlt(\u0002\u00066g\u007f.\u00115=EJ\u0002fi\u007f^uu86\u0017LEu5\u00118\\\u0019{fl}9n7\"i}x\u001c\f1+>xU\u0010!n#>\u0014)8\u0007)E\u001c\u00142\u0007v=Ht\u00144\u001d`\u001f/;0\u0006<`Kb$!xO)47=0%q6j&xT,;*&\u0001";
        objectArray[58] = "n\"bh\u0000y3*#dljc!$b\u0016\u0004oxeeVgd( alhe\u007f?c\u00115m>3\u000f";
        objectArray[59] = "i9u`i\t\u007f!&>Y\u0013>h\b5\u0007\u001a};\u00145&&Q\u001cta?5@}\fh\u000b+L6~Z&\u0014)\u0000#n\u0007\nq\u001f#e#\u0011T\u000fq>\t\u0010.\u0001\u00114+8O \u001dj2+r\u001f\u0011`\u00133b\u0014\u00174\u0016\u001bm/rV:G_\u000f.e83y\u001b\u0012y\u0006\u0016i \u001556\u0006T\u001a\u0017\u0004;\u001b-<3cg\u0014w%Oi%I,|?y\"\u0011.D";
        objectArray[60] = "=[}w,jaT'nPk6S/\u000fj`cV;~7m#VB";
        objectArray[61] = "ey(.\t.8th.p>$^p'\u0016<_yhqNg/io)L_";
        objectArray[62] = "}\u0012YXf\\9PX=m\\{a\u0014GmV}*POqHmH\u0006\\m\u0000\u0007QWM)\\?[SM*1";
        objectArray[63] = "DH\b?_\u001d[\u0013\u0002?'\u001b\u0006\u0003\u000f\u000fg<sp4/L\u001bD\u001f\u0010j|AmU#1Y&aC\fd\\\u000e\u0010JS\u0010F\u000ft\u00119\tN\u0007gIQ\u0010HNCO5%I>XA+(\u001e\u001frK9\ty2`W\u000f5VEl\u001e\u0005%D\f\u0015a\u0016\u0016b%x@\u0010,e5Ce-\u0016}/nE\u0011UH\u001fTLS+X\u001fA\u0016h";
        objectArray[64] = "T8\"\u0019L[We)\bwHPf{\u001a)OP|\u007ff\u0017YF|i\u0014\u000fC\u000be\u0012";
        objectArray[65] = "q];'\u001c]qRi@[XkKf@Y\t!U{-\u001dK 022DH{Rd!X\u0000\u0011\nf|CH`Wk<C1";
        objectArray[66] = "~A\u0011EG\u0014m\u001c\u000b\u0007 \u0013{\u0016\u001aGi\u0007pq\u0013DR\u0000d\u0003\u000b^\u001f\u0019\u001f\u0011\fI]\u0006m\t\u0016\u0004D}~A\u0011EG\u0014m\u001c\u000b\u0007 ";
        objectArray[67] = "A5\u0010Vbm\u001d:JO\u001eeN$cCunJ\"NHqAG1TU\u001e5@)D\u001fneA%R.";
        objectArray[68] = "C.EJU5E4\u0014]:\"N+DPW\u0007S9.V]qBf\u0015QJu\u0013VLS\u0005%\u0019mKD\u0001t)<V_D!R:L\u000eSN";
        objectArray[69] = ":<\n \u0017$e0\u0011)n!ur\u000f=\f{=\u0019%0\u0004\"\u0001=\u0005\u001f+-3\u0017\u00076.8\u0000\u001e\n6(\u001f\u001a;V(${4&25\u0001&\u00170\u000f2\u0005\b\u0002'W\u001e\t$g\u00001c^\b?\u0005Z0\u0011\u0018$a\u0004k_}\u00159+n\u0013z#2\n)\u00154 .6<\u0013\u000e\u001f':#//8\u0010WRW6>'\u00000\u0001%\"oj=\u000f::e\u0014-\u000f/`^";
        objectArray[70] = "m\tp>se?\u0019p7Mac\u000b.>!S?MpeMhiM)505a\f%Y&m2Mpg?9l\bNh}b|\ns+<few";
        objectArray[71] = "O\u0014Jm>>O\u0005PjE _\tlb \"2LXl<%P\u001aKptO\b\u0018\u0016k<>U\u0015VkE";
        objectArray[72] = "d\u0013PI{t6\u0003P@Epj\u0011\u000eI)B6WP\u0013EqwQQ\u001e**aP\t..|;WP\u00107(e\u0012n\u001fusu\u0010S\\4wlm";
        objectArray[73] = "x^`NE\fh^u\u0014~\u001b{SWI\u001arx^`NE\fh^u\u0014~\u001fk\u0000 \u0015\u000e\u000flX\"-";
        objectArray[74] = "j3Tni-e%\u0003/\u00126b$\u0013\u000fo=l2\u0014(s5e$oohjo3\u0001,co}_\u0004=.h=a\u001dip-\u0003n_2`/>-\u001e6yR";
        objectArray[75] = "P\u0005\u001dPm1U\u0014\u000eFW,AD\u0002W\u00065)T\u0013K/ &\u0011Td\u0007\u000f\u0015,#z\u0016\u0019\u0000\"\u0014Z>94\n!Rnp=X\u0013n\u001a5!&2\u00062 P, S*r)1\\n\u001a\u001b$\u0006\u0002G\u0015p\u0002\u001a\u000eR\u000f9S$\nG.-V\u000fQV*s\u0012Q]d4wW\r]m\u001d\t\u0002\u0015\u00176n;\n\u0011\u0006T8(\u0016Yl\b30\u0014\f\fLhpVh";
        objectArray[76] = "Vyjc\u0002x\u000b{q::;O~x6_@U8,o]0\bc{c:,T>r3Gq\\\u007f~_";
        objectArray[77] = "{Al\u001f\u0006\u001dh\u001cv]a\u0010{\nr:\u001c\u001bu\u001cu\u001d\u0000\u0013|\n\u000eZ\u001bLv\u001d`\u0019\u0010Idqe\b]N$O|\\\u0003\u000b\u001a@>\u0007\u0013\t'\u0003\u007f\u0003\nt";
        objectArray[78] = "l$\u0015}W\"4}\\z'\u007flgNuJMb~Y|'ql%O!\u001cv{!\u001e\u0011";
        objectArray[79] = "8PD4xVeX\u00058\u0014N=O~4iE,\f\u0007(m\u001187\u00124.L8JO<o@T";
        objectArray[80] = "#\u001ctNg-:H*\u000bY|%\t\u0012\u0019<z)\u0013)\u00126\u0013r\u0018t\u0014 b/\u00154\u0014Y";
        objectArray[81] = "`9\u000eh;\u0005 /\\}\u000b\u001a4{fAj\u001da4nFR1|\u0015HMR\u0005S\u000fvl1\u0006Q:Z@sG\\6e<W1Cj[Yd-{\n\fgPGW6PcS;A%R:;\u0010r9LNR\u0001r<qOD.AfZER5 =xFa\u001c{1\b9zFVmGyr\u0001{\u001aK\u00022\r\u007f.]`d\u001ecf7zs\u001b$o\f?rB`W";
        objectArray[82] = "C/\u0013Z9eF>\u0000L\u0003r\u0013><Ug`\u0013B\\Xzd\u001a\"\u0018\u0003:&~";
        objectArray[83] = " w+\tsI?%j_O~mh&AwR\u001exW\r\u0005\u0011\u001b~dL)\u001d?r\\~\tI&WV\n5g%est(~\u001c!s\t,\u001f6D-\nrd'vjp\u000bLcr{R\u0016r<yIr~G\u001drQ\f=Ylr]K\u001dc\u001au\\S\u001ek\u0000K/W+g\u000edZB5\u0018>\"D02\u001d&vzL~G w\u0016\t=G%st_.[m\u0019";
        objectArray[84] = "\u000f\u000fb h,\n\u0002!bV.ZR2H5\u0014.D*yh*'.)&-u\u00163+P-)\u0004\u0005\u001ex\u0015{\u001d&<Z\u001d\u0013\t\u0004\u0011B\u0013\u0004\u0006\u0018\u0019|8;\u000f3$);\u001bF\u0007\u001eC\u0014\u0019G74Ylq&F?#\u001c\u0002I\u00127\\4\u0014\u0011=$I+\t\u0004!1P6\u0010F1\u001dP\u00102\u001b@\u001a\u0019o9\u0011\u00071{9*\rO[r$rOA0s74K~";
        objectArray[85] = "\u0006X\u001d>\u0012(\u001f\fC{,|\u0010PEhbk\u0011L[i,']WSy\u0011d\u001cSJ\u0004";
        objectArray[86] = ">c6P\u0000\u0015%k*Tg@%{*o\u001aK+m-H\u0006C\"{V\u000f\u001d\u001c(l8L\u0016\u0019:\u0000=][\u001ez>$\t\u0005[D1fR\u0015Yyr'V\f$";
        objectArray[87] = "\r\u0018Nh\u0012f\u0016\u0010Rlu6\u0011\u0007Cc\u0018-wB\\k\f=\u0015\u0014OwDWN\tIu\u001f5\u0018\u001aU=u-\u0014\u001bJkD6\u001c\u0007N\f";
        objectArray[88] = "\t^U\t\nU\u0016\u0005_\trSK\u0015G\u001e\u0003Y*i\u000e9\u0003y\u001b\u0002k\u0007\u000bi\\\tS\u0003\u0017IWe~\u001c\u001bO^sX\u00025G#p\u000e\u0001Lf.SK33Q\nr\u000e%HfWFhS\u0016Z\thN[\u0010\b\u0005FZY.T\u001dP\u000e'\"[XFh16{*PG\u001a\t\b\u0001r\r3BiVw\u0005c\nN\u0003\u0005\rXOOZA5\r\u0015V\rAV\u0012N\\\r9";
        objectArray[89] = "\u001c1k\u000b#;Xsjn<;\u001aS6\u000b:7\u0000h=\u0001Sl\u000b5;\u0017\"1\u0006u;n";
        Object[] objectArray2 = objectArray;
        objectArray[90] = "o[$r4\tjJ7d\u000e\u0014~\u001a\u001eVK;.U'yr-\u001br\u0013Zj6.\noy23\u001f\u007f1/I\u001d>_4zr\u0010/]5Vc\u0017on6}I\u0013\f\u000elRs/lo:TL\u0018cmmRL\u0015?x9}dJ\u0015L\u001cSc\u00184_,j^\u0013*OiP4\u000b(\u000fn}L=\th0\u00147\u00035O?va\u0010)\u0007U*j\b+R5n1Hi6";
    }

    public static Exception a(Exception exception) {
        return exception;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2F70;
        if (e[n2] == null) {
            m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.e[n2] = (int)(d[n2] ^ l);
        }
        return e[n2];
    }

    public String parse(StringReader stringReader, int n) {
        String string = stringReader.getRemaining();
        stringReader.setCursor(stringReader.getTotalLength());
        return string;
    }

    public static String m$$NCAENHzNJGB6e77fwiL8A6u6THHjFQ450nc4UykMgrg2nrI2B5cxil5W49es0WugTqEfFtSrmvfIDtNwwH2lugX3zQY4HWNml(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-28, 104, 57, -124, -126, -40, -81, -70, 114, -101, -51, -78, 24};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 13]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public CompletableFuture listSuggestions(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
        try {
            m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 = me.mioclient.m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM.getOption(commandContext, this.m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt, this.m$$uTc6akMeau0KNG1T6LFzAYxf5GRLHFrJVcCCq52Tc9p6G5tbwCUZHXZjRwSPLLU1JE1y1xB88mQe8xDplBd6siGKUMVItaBgM, 448615424);
        } catch (Exception exception) {
            return Suggestions.empty();
        }
        try {
            if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus) {
                return me.mioclient.m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.bool((m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, -539536542).listSuggestions(commandContext, suggestionsBuilder);
            }
        } catch (Exception exception) {
            throw m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.a(exception);
        }
        if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR) {
            m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR = (m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
            return class_2172.method_9264(Arrays.stream((Enum[])((Enum)m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR.m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus(1264477097)).getDeclaringClass().getEnumConstants()).filter(enum_ -> {
                boolean bl;
                try {
                    bl = !m$$imIrh6eW4tGxtkMZGLEtSalH1H0P64VQc2l8GR9G3f854a1jkvYqEMV1zVkLHM08qzoqihcP4n55y5jaFxd8VgsmdF2SzZMQO.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP(enum_);
                } catch (class_151 class_1512) {
                    throw m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.a((Exception)((Object)class_1512));
                }
                return bl;
            }).map(enum_ -> enum_.name().toLowerCase()), (SuggestionsBuilder)suggestionsBuilder);
        }
        if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q) {
            m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q = (m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
            Number number = (Number)m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q.getValue();
            try {
                if (suggestionsBuilder.getRemaining().isBlank()) {
                    return suggestionsBuilder.suggest(String.valueOf(m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q.m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus(1264477097))).buildFuture();
                }
            } catch (Exception exception) {
                throw m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.a(exception);
            }
            try {
                if (number instanceof Float) {
                    return FloatArgumentType.floatArg((float)((Float)((Number)m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q.m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm(-993841504))).floatValue(), (float)((Float)((Number)m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q.m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR(-962905954))).floatValue()).listSuggestions(commandContext, suggestionsBuilder);
                }
            } catch (Exception exception) {
                throw m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.a(exception);
            }
            try {
                if (number instanceof Double) {
                    return DoubleArgumentType.doubleArg((double)((Double)((Number)m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q.m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm(-993841504))), (double)((Double)((Number)m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q.m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR(-962905954)))).listSuggestions(commandContext, suggestionsBuilder);
                }
            } catch (Exception exception) {
                throw m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.a(exception);
            }
            return IntegerArgumentType.integer((int)((Integer)((Number)m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q.m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm(-993841504))), (int)((Integer)((Number)m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q.m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR(-962905954)))).listSuggestions(commandContext, suggestionsBuilder);
        }
        if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr) {
            m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr = (m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
            Collection collection = m$$XtgJIsAvjy86e16siXSqddXxNMGl7umoAoNkBPxloL1Bp3tXZdDnyIg3mRW0PTv5eREbrAhprBnBvEOxQCanJTrUpI3r8TbJr.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5(-1576895433);
            if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC) {
                m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC = (m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
                m$$tQzKMxUjFH9uRZjhKMcY8q3DfZQwOe8agGk67vEKJw2wSstcz0mKFZVYsuXcd2YFZodE1Ei2NQ5XNaRInXnVLJh5iWz2Xs1sd m$$tQzKMxUjFH9uRZjhKMcY8q3DfZQwOe8agGk67vEKJw2wSstcz0mKFZVYsuXcd2YFZodE1Ei2NQ5XNaRInXnVLJh5iWz2Xs1sd = m$$tQzKMxUjFH9uRZjhKMcY8q3DfZQwOe8agGk67vEKJw2wSstcz0mKFZVYsuXcd2YFZodE1Ei2NQ5XNaRInXnVLJh5iWz2Xs1sd.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC.m$$YKijqkQLQFlJwGQrCPIf2qAeeJp0LiZ6TFS5dSgZkU3mS0GioiPLQzm08gbfsDQvbcNEGYQ9eOQB0bGLbkkn73y1F2xsqvkEt(-1186601045));
                try {
                    if (m$$tQzKMxUjFH9uRZjhKMcY8q3DfZQwOe8agGk67vEKJw2wSstcz0mKFZVYsuXcd2YFZodE1Ei2NQ5XNaRInXnVLJh5iWz2Xs1sd != m$$tQzKMxUjFH9uRZjhKMcY8q3DfZQwOe8agGk67vEKJw2wSstcz0mKFZVYsuXcd2YFZodE1Ei2NQ5XNaRInXnVLJh5iWz2Xs1sd.m$$jdxOLWRdiLxftWQKUh18YcpIz0GKCyUbO1ew13bHTKSUXDAv7U8GwVoGLYxCcFvPlGJXFBp5XPWdbXAhuNbtVjnJ36nImUHBa) {
                        collection.addAll(m$$tQzKMxUjFH9uRZjhKMcY8q3DfZQwOe8agGk67vEKJw2wSstcz0mKFZVYsuXcd2YFZodE1Ei2NQ5XNaRInXnVLJh5iWz2Xs1sd.m$$oRHJQWTrcmf8p7S7OrClvPCdl9sx2m3MiyV6YTaqEn1Mg8ahUxfHzfKu1iPlYTVDBpohy3N9exkz7FvKMSZgpqJCaBMKRYLbq());
                    }
                } catch (Exception exception) {
                    throw m$$3VG3KISYTsMktbT7hhAxpEvQralZ8HIcrcBqDM8TeoYbsxlkJmmnij29aSoazLZwU7Rnasyd8pjLDJmLpIPjpHak8rBguXNVI.a(exception);
                }
            }
            return class_2172.method_9265((Iterable)collection, (SuggestionsBuilder)suggestionsBuilder);
        }
        if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 instanceof m$$Sc5Y8o1OuTYi4MLSAIzNFnbvTemFJeRD22TFG7uOgMnyNPvZDugsMZ660XsEQfte53ZKf9nmzu99eawHc57GerNGzGULX3ff9) {
            m$$Sc5Y8o1OuTYi4MLSAIzNFnbvTemFJeRD22TFG7uOgMnyNPvZDugsMZ660XsEQfte53ZKf9nmzu99eawHc57GerNGzGULX3ff9 m$$Sc5Y8o1OuTYi4MLSAIzNFnbvTemFJeRD22TFG7uOgMnyNPvZDugsMZ660XsEQfte53ZKf9nmzu99eawHc57GerNGzGULX3ff9 = (m$$Sc5Y8o1OuTYi4MLSAIzNFnbvTemFJeRD22TFG7uOgMnyNPvZDugsMZ660XsEQfte53ZKf9nmzu99eawHc57GerNGzGULX3ff9)m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
            return class_2172.method_9264(m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$lhgqNl4i4mXKiRzhmhaAi40WDXpYdKYKzosFsaZpYCQJZVWpMhosyal5uH8Ig5NS1asLmTIHewmVGCAmz4wAvYouvSoIr1y4v.m$$aYkWP2yh6iYXz7s6hExAsjzsMiK8cPoKCPwrBSMGxnJmfxqEw8eX8qMRJZ9AgH22X0l2BA7ddMjWoKwXuJzWbAhS8GNANqe6I(1152886769).stream().map(m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp -> new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp.getName(1711056966)).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp.m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M(1859878409)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(c)), (SuggestionsBuilder)suggestionsBuilder);
        }
        return super.listSuggestions(commandContext, suggestionsBuilder);
    }
}

