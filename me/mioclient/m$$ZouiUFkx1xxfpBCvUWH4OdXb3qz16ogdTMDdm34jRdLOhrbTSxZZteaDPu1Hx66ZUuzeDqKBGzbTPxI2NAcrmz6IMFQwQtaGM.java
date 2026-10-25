package me.mioclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import me.mioclient.m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$9CfHjbrlg3lojvzMCur3pT97wrs5DycHxtyGDkWIYydsdQHR12da1jLKeR7NhqPxNFjETsEDoDPgJQaA8s40JZucSUhtkV6u1;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx;
import me.mioclient.m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import me.mioclient.m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN;
import me.mioclient.m$$ujXzdiEpq2EvzHWxiE4lraWreOE0xafbupuutWo7RJLutbftOxvBHaj3DZpnIIlppeyyX1q6v5wzAUQDH1pQ5mKKo1qmouiRt;
import net.minecraft.class_124;
import net.minecraft.class_151;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM
extends m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW
implements m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq,
m$$9CfHjbrlg3lojvzMCur3pT97wrs5DycHxtyGDkWIYydsdQHR12da1jLKeR7NhqPxNFjETsEDoDPgJQaA8s40JZucSUhtkV6u1,
m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82,
m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN {
    public final m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ m$$6VJBCIUJtCK1UmG823rlqYMnQEqnrOPUlVjIW4FvRdO8LuH0sJcFiCLC5YPw5KszjLTbzIbdFP1bKolNfoazSmzk77YmcOGW1;
    public final List m$$1sOCcTvY9bKrHtctf4tJkRGMFNquAfFAGMwqcAIFd0rpqtzV2pTSoNAG8QQF3hbdZVOdsdVRRWcdbmlDGQ7YwLk1nxG3yGtjh = new ArrayList();
    public final String[] m$$ngwg8fTtoOoDXHuvM7rQ6l7gngZbp1iZUdtAfFU14IzEqfuGgJFAdZPT3KarwIDr7AGhdLNcCUrLz0FBv5C6tAEQ7NAYSEl2T;
    public m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G = m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx.m$$0BYw3945tOifcplzDM5cgasrDnUyzZUR49yXdakYUr1Tz7rHz983u2lbZGdfvwYVfi5vvx6I4TAVnYd6whWPUkuMYPyF5aVGQ;
    public boolean m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi;
    public boolean m$$hDMsM3tDFnD4jD14XsgHo5oPy6uUllEoQeWknfaChhCiKma3TJQlpjRShkHrE44MJDmjpsTbFUQf5NX3NcSeqPWQDRMiIzUXA = true;
    public boolean m$$HF6xcp0tb4bRXiB1EXcTEHaNi5cBmGg2yStyyaxeBxioFrqtzkvHzkRpLiE7Erm19nrVaCKZMYCFGdtMDhWoWvb2QbVp1mQv2;
    public boolean m$$lnDF2xI8YidbRK8zBib8oQvfxCnz43Uhz3dOw8j4F2C4YWOxfO5UE5QjNx4ZhiXBvIDFC1Y5ip7irevRiUZ7hWpHoF9cwCqQL;

    public m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM(String string, String string2, m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ, String ... stringArray) {
        super(string);
        this.m$$6VJBCIUJtCK1UmG823rlqYMnQEqnrOPUlVjIW4FvRdO8LuH0sJcFiCLC5YPw5KszjLTbzIbdFP1bKolNfoazSmzk77YmcOGW1 = m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ;
        this.setDescription(string2, 1318776730);
        String[] stringArray2 = Objects.requireNonNullElseGet(stringArray, () -> new String[0]);
        this.m$$ngwg8fTtoOoDXHuvM7rQ6l7gngZbp1iZUdtAfFU14IzEqfuGgJFAdZPT3KarwIDr7AGhdLNcCUrLz0FBv5C6tAEQ7NAYSEl2T = Arrays.copyOf(stringArray2, stringArray2.length + 1);
        this.m$$ngwg8fTtoOoDXHuvM7rQ6l7gngZbp1iZUdtAfFU14IzEqfuGgJFAdZPT3KarwIDr7AGhdLNcCUrLz0FBv5C6tAEQ7NAYSEl2T[stringArray2.length] = string;
    }

    public m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM(String string, m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ, String ... stringArray) {
        this(string, "", m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ, stringArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block37: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.I = new Object[82];
                                m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.J = new String[82];
                                m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.e();
                                var21 = new String[14];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W("elKMdaBGyMxbadudo21T", MethodHandles.lookup(), "m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W", m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.class, 621067566);
                                var20_3 = var18_2.length();
                                var17_4 = 5;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 22;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W("fUPRA0pNZCuYlJQ0WRG7", MethodHandles.lookup(), "m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W", m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.class, 1805503092);
                                    var20_3 = var18_2.length();
                                    var17_4 = 2;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 20;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
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
                                    break block34;
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
                                            v15 = 66;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 39;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 107;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 98;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 127;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 17;
                                            break;
                                        }
                                        default: {
                                            v15 = 58;
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
                        m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.c = var21;
                        m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.d = new String[14];
                        var8_7 = 2760724687515390318L;
                        var14_8 = new long[48];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W("ypAjIIRT6JFGSfpNSpPS", MethodHandles.lookup(), "m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W", m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.class, 893830272);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W("sOUDL0Z2QDRo3bJs82IW", MethodHandles.lookup(), "m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W", m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.class, 1343796722));
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block35;
                            break;
                        }
lbl115:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 =  /* dynamic constant */ (String)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W("7Ke2vmJ6pN8fhMQ5kE4J", MethodHandles.lookup(), "m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W", m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.class, 762443847);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W("n61e1hoVVfKT6zGu8iSP", MethodHandles.lookup(), "m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W", m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.class, 1077252839));
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block35;
                                break;
                            }
                            break;
                        }
lbl128:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block36;
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
                m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.k = var14_8;
                m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.l = new Integer[48];
                m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -670072;
                var0_14 = 2155135694132305030L;
                var6_15 = new long[11];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W("SsfMvdYcuRvSx67Q1Mo0", MethodHandles.lookup(), "m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W", m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.class, 497919221);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W("nqH0nikM31TrYJZVw61M", MethodHandles.lookup(), "m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W", m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.class, 1156330973));
                    v22 = var6_15;
                    v23 = var3_16++;
                    v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v25 = -1;
                    break block37;
                    break;
                }
lbl157:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 =  /* dynamic constant */ (String)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W("Oh3eMMhCRKRgREkBG8u7", MethodHandles.lookup(), "m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W", m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.class, 1583354316);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W("g4sPg6uwLlY3CTDIsh6m", MethodHandles.lookup(), "m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W", m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.class, 1484535919));
                        v22 = var6_15;
                        v23 = var3_16++;
                        v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v25 = 0;
                        break block37;
                        break;
                    }
                    break;
                }
lbl170:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    break block38;
                    break;
                }
            }
            v26 = v24 ^ var0_14;
            switch (v25) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl181:
                // 1 sources

                ** continue;
            }
        }
        m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.s = var6_15;
        m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.t = new Long[11];
        m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)8766188544585346237L);
    }

    public static void e() {
        Object[] objectArray = I;
        I[0] = "\b\u001eL)BH\u0016\u0016Vf-O\u0010\u001eC;";
        objectArray[1] = ":\u0016\u000e\u0011\u0002\u007fO6\u0005\u001e\u00130.8\u000e\u0015\u0017jZ";
        objectArray[2] = Integer.TYPE;
        m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.J[2] = "java/lang/Integer";
        objectArray[3] = "5ZX%&\n@zS*7E!tX!3\u001fU";
        objectArray[4] = "nYA@\u0007\u0017pQ[\u000ff\u0000n]TUZ";
        objectArray[5] = "\u0012\u0012X\u007fI_\u0019\u001dI0(Q\u0012\u0016Mj";
        objectArray[6] = "{\nX&J<e\u0002Bi\u0002<\u007f\bZ.\u000b'?8[7\u0014%x\u000e\\";
        objectArray[7] = "KT\u0004\u0002),E]C\n.7\b\\\u000eK\u0016\rsIl\u000b-\u0017MHy\b\u0003v\u0013b\u007f\u0002x\u0002St\u001e\\\u0007(IhN\u001b/\u0006Bgi6\u001a{Tk}:\u001a\u000eG\u0004g\u0006s.Ebe\u001b7sGg\u001e\u0017(\u0006^Bc\u00039\u0019@TG6\t,^WN\ft7AY`\u0018\t\fC\u0006g*\u0016uhW~(\u0017";
        objectArray[8] = "\u0001BqH1\f\nM`\u0007L\u0014\u0019JiN";
        objectArray[9] = Void.TYPE;
        m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.J[9] = "java/lang/Void";
        objectArray[10] = "@4lO8HN=+G?S\u0003<f\u0006\u000bHX8\u0017d:_\u001c):D!en'\u0017u\u0019\u0013b5\u001a@bVW`tM6Cy\u001c\u0006F<\u0014\u0019;\u0010F\u001dhE# v\u0002_w\u000b6G0c}$sj)\u0011\u001b\u000b\u0017W+Bi \t`\u0016]O\u0005\u0012Z\u0018\u0015c\u0010!P<]\u001b\u0018\u000fd\u0000P|%#e\u001c";
        objectArray[11] = ")\u0017wg\\\u0013'\u001e0o[\bj\u001f}.\\J>3\u000epC=2\n-Mw\u001d/3\u0014P]8\f9.=\u0005(#G\u001ehd0\u0013\u000b5`SM\u0007\u001a\u0013<Z0\"&?My\u0013#\u001b\u0018K^)s\u00178f~7\u0014A\u0016[P\u0017\u0015\u0011/|\f\u001b\u000e:\ndAJ\u0006\n\u0016dM9%7\u0016y\u0007%'\u000b\u001dzw";
        objectArray[12] = "\fZ\\nn\u0010\u0002S\u001bfi\u000bORV'j\u0018\u000b\b\u001eL@\u0015\u0003Q\"h`:,^\u0010Bb\u0013)K#Ko\u0013/l9n3\r#\b\u0017sW\u0010\u0006U4ej\u0017\u0002{!r2;\u000eWDUTFY{\u001cP?\u0015\u0016k\u00074aNX\u000e6lNK\u0014\t\u0000go\f\u0012G\u0003{S\u0019\u0014}<r_\u0006(\\\u001bE2";
        objectArray[13] = Boolean.TYPE;
        m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.J[13] = "java/lang/Boolean";
        objectArray[14] = "6\u001f\blZ\u0000(\u0017\u0012#8\u001c/\n";
        objectArray[15] = "qDZL4l\u007fM\u001dD3w2LP\u0005ltej3y\u0012S}M\"yknZi m\u001b;hy$L*f*E\u0019gjLFr\u0011g2GHM\u0005T\u00170EG\u0006d\u0018Rj\u0015=m;U+S\"c\tSst\"x8bxt;h;4z\u0015!X25Dd\u0019U\r;Lq,\u0019\u00114w\u00167X\u0015";
        objectArray[16] = "B>\nvKyL7M~Lb\u00016\u0000?CGz)JSEG\u001b\u000b\u0011vwxG3}|Udj)aAk`gb`WKA\u001f\tVNK%Y\u0010\u0012aD@\u001c\u0011t)`s\u001b\b\u0014AjP@\f\u0017^IZz\u0012@|cW}.T-u~F\u0015UhpYNiFoOBJc\\j\u0016gGoUSO";
        objectArray[17] = Long.TYPE;
        m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.J[17] = "java/lang/Long";
        objectArray[18] = "IH=B9eE@<\tpmYH>B\u0014yEI\u001f\u000e4oIS";
        objectArray[19] = "o.\u0007?}8c&\u0006t40\u007f.\u0004?P$c//}\u007f:i/\u001e";
        objectArray[20] = "ef{K:eko<C=~&nq\u0002\u0006GrV7R 3=I>h\u0000rjk\u0002u'\\0F1\u0014:Hn5-~7bkN\u001f_7~K6\u0013\\5Sr`\u0000h0CAK\u0017m<GxZ7A9kqIlUffbv\u0002|\u0016HBJ\u0012\u0015\u0010NJg\u001b\u001e\u0000i;Ica1n:::_+";
        objectArray[21] = "J\u0014]g5\rT\u001cG(}\rN\u0016_ot\u0016\u000e3^hx\fI\u001aE";
        objectArray[22] = "w*\u0006@U\u0004i\"\u001c\u000f2\u0005x9\u0011U\u0014\u0003";
        objectArray[23] = "bL{J|@lE<B{[!Dq\u0003%\u001dG_&vz{yE;^q}Y`\u0002\u0014#k@Ocn}A@O<CA\u001f7q\"Vrk_y\u0016}'x{N>BvZ8\u001bmpr[[Dl\u001ft^6O\u001ftF{Z~\u001bs[~gD9` A9Z\u0012@$wd_\f\u0012^\u001bK@\u0007hd";
        objectArray[24] = "gk\u0015{\u0014gibRs\u0013|$c\u001f2\u0013OeA\\.\u001afL@XAI<dAoD\u001ayzTL^M89JaT\tNGJIW\u001f>e<Ya\u0019yNEUy;fZGNX;\\b`hw\u0011cEGZ#0=]cHT%0mty@E{Z{LF\u001a@`K\n_\u0010p:Z\fQ3";
        objectArray[25] = "0\u0013V\u0002\u0012\u001d>\u001a\u0011\n\u0015\u0006s\u001b\\K.?'#\u001a\u001b\bKh<\u0013!(\n?\u001e/<\u000f$e3\u001c]\u00120;@\u00007\u001f\u001a>;2\u0016\u001f\u0006\u001eC>\u0015\u001d+'\u0015-!\u0018;\u0014>:$\u0014?-/\u001a\b\u0011\u0013$<A\u001cN\u001e7\u0003/5>0\u0017??\\86\u001f\u00126W(\u0011n<N(\u0019\u0016oO\u0017\u0016\u0003V0R\\\u0015\u000e\u000b:3 \\)\u000b\u001a\u0002K9\u0017\u0003\nE@\u0001\u0013\u001f*N,,\f\u0013,G:\n\u0012=$:9\\\u0011D\u00057\u001a\u0019#;2\u0013;\\5@\u0005N\u000f:C\u001e9\u0010!\u001cK\u0018k\u001c\u000f\bI&7\u0004\u0019\\7*8A\u000f:!>\u00183\u0019\u0015\n\u0001k\u0018;_#J\nO>W";
        objectArray[26] = "E!Y5\u001cFN.Hz|_B\"J&";
        objectArray[27] = "#;H\u0004^_(4YK9]=?Y\u0000\u0002";
        objectArray[28] = "gdA\f-elkPCAfbiR\fm";
        objectArray[29] = "\u00021\u0000;:`\f+\u0016l_g\u0005>#.8v\u0004(\u0007%_3\u0016c\u0010>?5\u0010kGT>hV3\u0002m2wQ-{j<w\t*\u001b:>o\u0013R";
        objectArray[30] = "P\u001fP8C\u0016^HN><\u0001\u0002^mxU\u0005\t\"\u0010o^\u0000\u0016]Oi^\u001co\u001bXkUA\u001f]A\u007fRzQAXbD\u001a\u0001C@x<";
        objectArray[31] = " uX#\u0011H`:R+vC<(g:K\u001fUew\f*Mw_y(\u000b|JA\u007f/\u0010YB]W(Mc]eT&JDJ>w\u001a\u000e\u001a i\u0005\t\u0007iIN} ,Wn[w\bNKieb=\u0007Z-KF\u000f\rYMv\u000b|\u0012ez;[!\u0011\u001a(N\n\u0007,B{vT\u001f\u0006[YG\u000bBO_ym\u00002\tFmj;s\u001bDj}D,\u001dDv\u0004";
        objectArray[32] = "\f)6T\u000bR\u0007/:_kVMd\u001eh\u0010I>38\u0011\u001az\"\r\u0015m\u0014K1\u0019&L\u0011b*\u0006{d7x[w{q\u0005p\\#\u000bsSKP1\u000e\\ K]\u001a\t\u0011\u0006AYr\u001e\u0010\u0001JX,=VUM/\u000b\nJ\u0002^\u0002x|~ s0$\u0006\u0010'y&\u0007\u0001p\u0011R\u0006:>OTM\u0010\u0011\u000b.RJ\b!\u007f^\u0014S\u001c&D\u0017\u0012Z\bs4Q\u000bN\u000fH";
        objectArray[33] = "\rP3}:MR\u0015da\u0003L\u0018\ffFxE\u0004kobo\u001f\r\u0007;8iGbU`}cZ\u0002\u0005bey\"";
        objectArray[34] = "iw\tSW\\)8\u0003[0]4z!UV\\8i,[U_Y;\u0015\u0003[X9=\u0013\u000b\f2";
        objectArray[35] = "h\u0014\u0004O\u000eofC\u001aIql:U/\u0018\u001eb,U\u000f\u0004q:.@\u001cN\u0001|7T\u001bu\u0018:>\u0015O\fH<m\u0011u";
        objectArray[36] = "D6iOd\u0012S5`C\rH\u0007f\fG2wQp6\u0011ow@/\f63tK\u0012#/vI{\f\u00161pCT6\u0014\u001eBodz\r-fMj\u0004\u0003\u0016R]Oq1:mj\u0011\u001b\u0003\u0005vdP\f\u0018!LDq\u00018\u0019r|t709\\Bt&o\u0002@P\u0014t\u0017\u0013pmL\b\u001d\u0000FI\u0011\n2\u007f<@I0(\u0000cFI,QAnTK21\u0011lLQJ";
        objectArray[37] = ";Ji|^90Lew>=z\u0007#o\u0000#?WAm`=8JIyW>2\u0013AiL3\u0013`q>S\"6yAKnc*h`aTf\u0006f\"J\u0002\u0001\u0015np8\u000e\u001c+sbvf46@e_O=\u0010\u0017 7_26eD{r;\u001dh'kL6.iaX\u007f;\u0019orIa%1wb\u0006\u0007!?B vA8+E\u001b7S:,RdhU:0+";
        objectArray[38] = ",\u0006xF* |\u0000+B\u00108#S|\nW7E\u0004w\u0011o)4Qm\u0011kY|Fx\u0013+):_l\u0014\u0010";
        objectArray[39] = "E&\fmQ@\u0006y\t1o\u0000\u0015d~c\u0014\u0010\u0002yJr\u000e\u001c\u001e\u0018\u000fq^\u0010\u0012x\twVGx!Kg\u0006@\bgRs\u0001{F{Kn\u0017\u001b\u0016ySto";
        objectArray[40] = "1\u0005Kdt,?RUb\u000b'hu\\7a$c8\u0004=r vXT?j:\u000e";
        objectArray[41] = "\u0019~zI6\u0013Je/\u0014PJ\\(9B\u000e}\u000fi)g\u000b\u001f\u0015i\rQ\u001f~)k5\u0017\u0014\u0014\"}\u0002\u0015!BL;\u000bA\u0001S!cqQj\u001e\u0014>2\u001a\u0013w?KuP)s:K1\u0017*\u001f5H+M,s5z9R\u001fk6['nkb\u000ea\n\u0017n\u007fKH\rb2\u0010\u0015t2{>R\"| +kI\u001b{;Z>S\u001b\u007fK\u00153V\u0010|+E1N\n\u0004";
        objectArray[42] = "\u000b_[\"|LXD\u000e\u007f\u001a\u0015N\t8=P*\u000fI1>uJ\u001cw,*x\u000fZB5\u001dK\f'T\u0016\u0012G<%u\u0003|%\u0013\u001fo\u0001:f\u0011\u0004\u0015\u0011=+(#wT|j\f\u0000{0\u001e|28x ~b\u0012S}\u001b\u0019x\u001b%Y/'!K!\u007f5\u000bu\u0000]\u00195q$9[e\f\f\\2XJ/@!\u0016\tZ\u001a1t\f\t^j{|\u001b\u001dU\u001b.f\u001b\u0019%";
        objectArray[43] = "}iYow\t-o\nkM\u0011h=J:1\u0017nP^*<\u001eo+In\"\t\u0014";
        objectArray[44] = "$PJ\u000etU/VF\u0005\u0014Qe\u001deL+n3\u000b_\u001avn\"Te=*m)iJ$oP\u0019w\u007f:iZ6M}\u0015[v\u0006\u0001d&\u007fT\b\u007fj\u001dKD-\nX1tss`j\u000eo}2wq*U]\u0013zQ\u0012ke\u0016LY2E[\u0016]\u0006\tYIv\u000f~\u0018it.st\u000b_Psq[t-M X\u0003\u0004kT4_8Mm] \nH\u000btI'1U\u0015fN)P^\u0013jEI";
        objectArray[45] = "m0p/+Fcgn)TO5a`{%i?|kt2FR`ehiN-b8r8*kth|oZ-m|{T\u00141tam4D3l{\u0015";
        objectArray[46] = "\u0018<X,&D\u0016kF*YI\\]Ny6LJm)'4J]xVx2JA\u0001";
        objectArray[47] = "0\\3qT\u0012j\fdl4\u0012|\u001dcr\u000b\u000bh\u000e\u0018DZ.0Q\u0000gu\u00057\faTN\u001e:\t\u001aEN\b<\u000ecQz\ro|?SK\u0007*\b\u001ddE\u001a`N%ik\u001d\u0013C\u001c3k;\u0015S1TD\u0017\u0002k\u0016gOH6W!PW*\u001eN w[,\nJ'pR\u0007lXgwI+\u0001\n\u0004\n\t\baZ2j\u000f\u000ei\rXjY\u001c+Q=0\tK61";
        objectArray[48] = "wz\u0014v\u0019/y`\u0002!|(puo$\u0003pws\u000f\"\u0005x \u0019\u0003\u007f\u0010|suW%\u0016$\u001c'\f`\u001c9|w\u000ex\u0006A";
        objectArray[49] = "ZT+\t4[T\u00035\u000fKP\u00035=\\$S\bidP2W\u001d\t4R*Me";
        objectArray[50] = "*\u000b\u001aps^$\\\u0004v\fOsL\u0006%mIi[\u0011J<CvW\f$|\f|_ksu[|\r\u001b5lO{6Z'nHlI\u0005!nT\u0015";
        objectArray[51] = "h\u007fo\u0015\u001fT<%iMpWieJS+D~xeGp\u0005{(hB\u0010\u0003} ?(";
        objectArray[52] = "?ISr\u0012n|\u0016V.,:o\u000b+xI8\u0002J\u0012 G?bL\u0014(\u0010U";
        objectArray[53] = "-U W`-#\u0002>Q\u001f&t$0\u0016v+v\u0005QS|8r\u00101\u0003~ hh";
        objectArray[54] = "%*\u0015$+N2n\u000b3PS&#\u0018JkS ,\u0014;>I (d";
        objectArray[55] = "vMq\\*\u000f&K\"X\u0010\u001fs\u0018\u0018Yi\u001fvOh\u001fp\u000bqt#\u0006{\to\u0005v\u001c{\r\u001fJ{\u0019p\u000e\u007f\u001ay\u0001jv";
        objectArray[56] = "_2ykK\u000bQ(o<.\nY-\u00029QT_;b?W\\\bQnbBX[=:8D\u00004";
        objectArray[57] = "\u0017AY\u000b\u000f<N\bX\u001ct)\u0004\u001cR?=\u001d\u0012J\b\u000e76jt^+Nstq\u0003;8\u001dN\u007fz\u0006L\u001c\u0019a\u0002\u001a\u00061Z}_W*ph}\u0003\t>\u001cAqj\u001e1-dI\b.J.lzz\b\u000b\u000f\u0017\u000ec](,jq^_5\fhOP]\n\u0007wrtV\u0019\u0001IVT?L gbugKqY\nL\u000bE&G\f3^\r%A\u000bC\u0018\u00141F0\u000e\u0018E'BP\b\u001eMp(";
        objectArray[58] = "@f\u001e.(ZK`\u0012%H^\u0001+2\u0012\u0015Kck\t\b+Jvh'iu`pb\\\u001d5v\u0011<#7/jA{\u000b\u0019$efV>d2irZ>\u0011!\u0006hfW1#`j{\u0013l!e\u0011w\f\u00198@lc\u001d\u0006&VHV-38UAlP('[ox-\u0013%\u0004hJ2j\u000eUqH3TyVO}\u0015+&POalm1RD<\u001c+(FC\u0007\u00015:AMf\n36J-";
        objectArray[59] = "{mxz\u00172+k+~-1\u007f1v8@K)2z9]:|(z=-z\u007f6k?R%y6wF";
        objectArray[60] = "-lmUs\u000f}j>QI\u001f(9\u0004R/\u001d;%u\u00075\u001d?U5\u0004+\f=*j\u0002+\u0010D";
        objectArray[61] = "\u001a-c9(%NweaG&\u001b7F\u007f\r.\u0011/bm!IG&m~>6\u0018 mbG";
        objectArray[62] = "mpe47;kvmc]%9k)2\u001a5P424\"+!a(4&[mpe47;kvmc]";
        objectArray[63] = "\u0005=rLX`Zx%Pas\rD9R\u0007\u000f\u0006`.\b\u000ecR:(Pa";
        objectArray[64] = "&il\u001bzo&?\u001c\u001egz;Eru:{.?z\u001a?r{=\u001cLyk#9l\n`\u007f$\u0002&\fd?,m#\u00051=J";
        objectArray[65] = "\u001dk>\u00015o\u0016m2\nUk\\&r\u0015\u0017\\\b;.\u0017\u0013B,2\u000f\u0019\u0004b\u00132\u0006\u001c0Q\u00195-G\u0007_\u0010o*1\bq\u0002x\u0014\u000b:P\u0001K>>\u0017o>4/\u001d%u\nG1\u00178e\u0013R\u0015\u000b\u0005s\u000fS\u0010\u0014(Q\u0016s\u0000\u0007)D\u000fn\u000b9\tK20\u0014\u0005\u0010c\u001f5>\u0005\u001aT\u00155\u0015{5c\u001bq,\u001eo3LlL";
        objectArray[66] = "1\u001a\u00162(\u0018lL\u0016#S\u0016:G\u000b0\u0014\u0006S\u001a\u000f4:S#\\\u0016 =h1\u001a\u00162(\u0018lL\u0016#S";
        objectArray[67] = "8VB)R\u00026\u0001\\/-\u0014j\u0004RhQ\u0003}k\u0003bN\u000f`\u0005C-D\u0007\u0007RJzDUw\u0014SnCn6\u0006QiT\u0011i\u0000Qu-";
        objectArray[68] = "Z\"/i`\u000b\u001f;w8\u000f\u0018\r 1cu\u000f&>*Dr\u0006\u0004\u0014(yb-\r%L9i\t\u001f)=ls\t\u001bYp31X\u001f9tr>Y`b*ip\u0012\u001170itb";
        objectArray[69] = "\fs\u00000\u0003\u001b_.Qk;\u001a\u0007p\u0011a|\nn%\u0001nA\u001d\u0011z\u0007n]d\fs\u00000\u0003\u001b_.Qk;";
        objectArray[70] = "n4l\u00177\u0001`cr\u0011H\u0002<u\\K&\nQ4b\u001c#\u000712d\u0014tm";
        objectArray[71] = "6\f>S2b8\u0016(\u0004We1\u0003\u001dF0t0\u00159MW1\"^.V77$Vy<jsl\u0004/\\ludSE\u00024u=\u0017%R6m'o";
        objectArray[72] = "h\u0003!;9M<Y'cVNi\u0019\u0004}\u0017Gxet\u007f?H?\u00152f+O\u0004";
        objectArray[73] = "NL*g\u0012TY\b4piOIN\u001dd\u0019S \u00046k\u0013V_[0k\u000f/";
        objectArray[74] = "{p\u000f<O=pv\u00037/9:=\u000f;^3[AF\u001c^\u0013j*#\"V\u0003-!\u001b&J#&M69F%/[\u0010'h-RXF$\u0011\f_{\u0003\u0016n;{ZF\u0000\u0015\f&n vK0x@\u0006~Mbtn\u0012|s>lxF\u0002\u007f1)n \u0014k\u0011[x\u000f?TbpZE\u0016\u001f\u0003'_MFO1}j\u001d#\u0015a*w}+N.lq\u001c H\"g\u0011";
        objectArray[75] = "\u001d~`l\u000e_]1jdiT\u0001#]T\u0004{L^ZC'\u0000\u0017t\u007f1*I|ig2+s\u007fP}b\u001b~OE[1%]\u001cTMQ\t\rtPRq\u001bAdNh]ThU4FP;VRu|n*T\u0015kaK'\u0000\u007fFgn\u0004A\u001cW8N\u0018|sbd`6\u000bLcf=\u0010s`f3\rPHDf8}\u0016QPa\u0003<\u0004SWv|c\u0002SK\u000f";
        objectArray[76] = "\f[|)3L_@)tU\u0015I\rt)\u0012/\u001e}\u001570\u001a'^qr\u000f\r7\u001d\u0012p\u0015\u000b\u0003f-r\b\n\u000eB\n\b\u000f\u0001:k7\to\u001c9E+\r'5:D\u001d\n29\u001as6,+N&j<3>0\u0005_/\n6\u001d\u0014F)\u0012,<\u001e\u001aq5)+\tc},\u0019A\u0014{})\u00122\u0001YuKn\u0016\u000e^=:;\f\u000eZMu6\t\u0005Y-%4\u0011\u001f!";
        objectArray[77] = "dmS\u001b\u0014sf0IJpeqqJWp7obQV\u0001bubU&Kjbv^W\u001epbr.";
        objectArray[78] = "^\u0017d\u001f\u0003 PV}Hx\f\u0005V4^@ vFE\u00122cs@vS\u001eoWLNa>;NiD\u0015\u0002\u0015M[ak\u001f\ft\u001fa\u0016\u001bm^z?\u0015E\u0016OHxo<>\u000bLiM!\u0000TG[mI5uLC\u0013\n+\u0004LOT*\u0011rKNL)\u0019hu=H\u001c\u0015fZH]\u0002jV\u001cV/\u0012)RAeRCi\rU\u0004\u0016\u0001;]\u001ctP\u0018/Z'";
        objectArray[79] = "mGb/\u0001\u001fc]txd\u0018jHA:\u0003\tk^e1dLy\u0015r*\u0004J\u007f\u001d%@\u0006\u0016j\u0018!?UK;C\u0019~\u0007\bf\\y.\u0005\u0010|$";
        objectArray[80] = "Y\u0002qu)5W\u0018g\"L;[\u001a\n'3jY\u000bj!5b\u000ea;w.!K\u001edq.=2";
        Object[] objectArray2 = objectArray;
        objectArray[81] = "\u0018\u0005?%4aBUh8TaTD-`lA6\u00029`+h\u0019\u0016\u000b&hg\"#\u001780V*00\u000f\u0019bC\u0014\nb7j\t\u0006\u0005 \u0010t\u001d/6\u0002\u0018GG!$\u001a0X\u0004&/\u0007i;I\r\b`ntH,\u0017,*C3,/\u00059{;\u0019?f\fN\u00047m \u001fh\u0014\u0017\u0019c\u0013i>W\u000e^i{I\u0003>>o}ATT";
    }

    public static long e(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x186C) & Short.MAX_VALUE;
        if (t[n2] == null) {
            m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.t[n2] = s[n2] ^ l;
        }
        return t[n2];
    }

    public m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 add(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5) {
        this.register(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, -1563008479);
        return m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
    }

    public m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 add(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF52) {
        int n = this.m$$1sOCcTvY9bKrHtctf4tJkRGMFNquAfFAGMwqcAIFd0rpqtzV2pTSoNAG8QQF3hbdZVOdsdVRRWcdbmlDGQ7YwLk1nxG3yGtjh.indexOf(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF52) + 1;
        this.m$$1sOCcTvY9bKrHtctf4tJkRGMFNquAfFAGMwqcAIFd0rpqtzV2pTSoNAG8QQF3hbdZVOdsdVRRWcdbmlDGQ7YwLk1nxG3yGtjh.add(n, m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5);
        return m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
    }

    public static Exception b(Exception exception) {
        return exception;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4661;
        if (m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.l[n2] == null) {
            m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.l[n2] = (int)(k[n2] ^ l);
        }
        return m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.l[n2];
    }

    public boolean register(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, int n) {
        return this.m$$1sOCcTvY9bKrHtctf4tJkRGMFNquAfFAGMwqcAIFd0rpqtzV2pTSoNAG8QQF3hbdZVOdsdVRRWcdbmlDGQ7YwLk1nxG3yGtjh.add(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5);
    }

    @Override
    public void enable() {
        try {
            if (this.isToggled()) {
                return;
            }
        } catch (class_151 class_1512) {
            throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b((Exception)((Object)class_1512));
        }
        this.m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi = true;
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$1jOWsTPtmbJw41RuZ4W3HsnOh1UrckOKRyWBrJ2dTlnNzMWmXIoAwZsov6KCypcHhvjIkeyolQqDs34vtSdJ8oD9yR8jOJlp0(this);
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(new m$$ujXzdiEpq2EvzHWxiE4lraWreOE0xafbupuutWo7RJLutbftOxvBHaj3DZpnIIlppeyyX1q6v5wzAUQDH1pQ5mKKo1qmouiRt(this));
        this.onToggle();
        this.onEnable();
    }

    public boolean unregister(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5, int n) {
        return this.m$$1sOCcTvY9bKrHtctf4tJkRGMFNquAfFAGMwqcAIFd0rpqtzV2pTSoNAG8QQF3hbdZVOdsdVRRWcdbmlDGQ7YwLk1nxG3yGtjh.remove(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5);
    }

    public String[] getAliases(int n) {
        return this.m$$ngwg8fTtoOoDXHuvM7rQ6l7gngZbp1iZUdtAfFU14IzEqfuGgJFAdZPT3KarwIDr7AGhdLNcCUrLz0FBv5C6tAEQ7NAYSEl2T;
    }

    public String getInfo() {
        return null;
    }

    public m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ getCategory(int n) {
        return this.m$$6VJBCIUJtCK1UmG823rlqYMnQEqnrOPUlVjIW4FvRdO8LuH0sJcFiCLC5YPw5KszjLTbzIbdFP1bKolNfoazSmzk77YmcOGW1;
    }

    @Override
    public void disable() {
        try {
            if (!this.isToggled()) {
                return;
            }
        } catch (class_151 class_1512) {
            throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b((Exception)((Object)class_1512));
        }
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc(this);
        this.m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi = false;
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(new m$$ujXzdiEpq2EvzHWxiE4lraWreOE0xafbupuutWo7RJLutbftOxvBHaj3DZpnIIlppeyyX1q6v5wzAUQDH1pQ5mKKo1qmouiRt(this));
        this.onToggle();
        this.onDisable();
    }

    @Override
    public JsonElement toJson() {
        JsonObject jsonObject = new JsonObject();
        try {
            if (!this.m$$lnDF2xI8YidbRK8zBib8oQvfxCnz43Uhz3dOw8j4F2C4YWOxfO5UE5QjNx4ZhiXBvIDFC1Y5ip7irevRiUZ7hWpHoF9cwCqQL) {
                jsonObject.addProperty("enabled", Boolean.valueOf(this.m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi));
            }
        } catch (class_151 class_1512) {
            throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b((Exception)((Object)class_1512));
        }
        jsonObject.addProperty("key", (Number)this.m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G.m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG(384967730));
        jsonObject.addProperty("state", this.m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q().m$$q60MFbe6wdivWp4kRCKnlZZPlYEn3tV4kfyfYvLxmOjTDK7AxLlTtFsQ579mT62x8LKzvOCLsSewKyc0PBtW1vCddwE5OeN7R());
        jsonObject.addProperty("mouse", Boolean.valueOf(this.m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G.m$$0a6satRcVmfiZwanl0RgzcMCb0erhZREX3tKsob6XE1D4QKMc68LuPqxPdhcvQymN439ibhFWuDkCK4ezfpJrVIkGLaGWuoTq(-216992309)));
        jsonObject.addProperty("drawn", Boolean.valueOf(this.m$$hDMsM3tDFnD4jD14XsgHo5oPy6uUllEoQeWknfaChhCiKma3TJQlpjRShkHrE44MJDmjpsTbFUQf5NX3NcSeqPWQDRMiIzUXA));
        JsonObject jsonObject2 = new JsonObject();
        for (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 : this.getRegistry(2052655641)) {
            try {
                try {
                    if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.m$$VQeBiYQFF92st4KpYnl7JJZWvgzGjBP4Dd9SFTh4QWYtzxAIcX5Qp3MUZowrwkKm0ljNF9ZAlkex9P3KyEVeoeW2idm8qJEa8(2007789403) || m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.m$$Tp51MiDFTcoSJbuRRMLenwZQdb3MEigl4jR2DPp48e6CyGQBNjRyvWDB0eqiQwyt5GuEswUz86lKb7hko40B9MRlczgUxuAK8(-456119050)) continue;
                } catch (class_151 class_1513) {
                    throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b((Exception)((Object)class_1513));
                }
                jsonObject2.add(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.getConfigName(), m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.toJson());
            } catch (class_151 class_1514) {
                throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b((Exception)((Object)class_1514));
            }
        }
        jsonObject.add("settings", (JsonElement)jsonObject2);
        return jsonObject;
    }

    @Override
    public void fromJson(JsonElement jsonElement) {
        block21: {
            if (jsonElement instanceof JsonObject) {
                Object object;
                JsonObject jsonObject = (JsonObject)jsonElement;
                if (jsonObject.has("settings") && (object = jsonObject.get("settings")) instanceof JsonObject) {
                    JsonObject jsonObject2 = (JsonObject)object;
                    for (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 : this.getRegistry(2052655641)) {
                        try {
                            if (m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.m$$Tp51MiDFTcoSJbuRRMLenwZQdb3MEigl4jR2DPp48e6CyGQBNjRyvWDB0eqiQwyt5GuEswUz86lKb7hko40B9MRlczgUxuAK8(-456119050)) {
                                continue;
                            }
                        } catch (Exception exception) {
                            throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b(exception);
                        }
                        if (!jsonObject2.has(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.getConfigName())) continue;
                        try {
                            m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.fromJson(jsonObject2.get(m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5.getConfigName()));
                        } catch (Exception exception) {}
                    }
                }
                try {
                    if (jsonObject.has("drawn")) {
                        this.setDrawn(jsonObject.get("drawn").getAsBoolean(), 1704271651);
                    }
                } catch (Exception exception) {
                    throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b(exception);
                }
                try {
                    if (jsonObject.has("key")) {
                        this.modifyKeybind(m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx -> {
                            m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
                            m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx2;
                            try {
                                m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx2 = m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(jsonObject.get("key").getAsInt(), -568655793);
                                m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 = jsonObject.has("state") ? m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T(jsonObject.get("state").getAsString()) : m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$02HvsQoTvlnydRVIW36DOf6IhnOfidT08XwqgDPPCZ2Wtgkecu728WgtTm98aq9fJSSTUWNTNQhmlG5n6sGg1XkvY5K4DiROq;
                            } catch (class_151 class_1512) {
                                throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b((Exception)((Object)class_1512));
                            }
                            return m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx2.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8);
                        }, 2093059128);
                    }
                } catch (Exception exception) {
                    throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b(exception);
                }
                try {
                    if (jsonObject.has("mouse")) {
                        this.modifyKeybind(m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx -> m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(jsonObject.get("mouse").getAsBoolean(), -1087390544), 2093059128);
                    }
                } catch (Exception exception) {
                    throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b(exception);
                }
                try {
                    try {
                        if (!jsonObject.has("enabled") || this.m$$lnDF2xI8YidbRK8zBib8oQvfxCnz43Uhz3dOw8j4F2C4YWOxfO5UE5QjNx4ZhiXBvIDFC1Y5ip7irevRiUZ7hWpHoF9cwCqQL) break block21;
                    } catch (Exception exception) {
                        throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b(exception);
                    }
                    this.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(jsonObject.get("enabled").getAsBoolean());
                } catch (Exception exception) {
                    throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b(exception);
                }
            }
        }
    }

    public static String m$$cfFoLgFoV3Q6dZpmkfqDLgbDuq6K2m0MLehJS5vZP7pjFziUNfG0L7R3hTQGXgg6QimEOFTIFxvHUVet4GQuuEp809jk1YM5W(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-63, 113, 47, -31, -35, -55, -46, -104, 125, 54, 124, -95};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 12]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public List getRegistry(int n) {
        return this.m$$1sOCcTvY9bKrHtctf4tJkRGMFNquAfFAGMwqcAIFd0rpqtzV2pTSoNAG8QQF3hbdZVOdsdVRRWcdbmlDGQ7YwLk1nxG3yGtjh;
    }

    public String getInfoString(int n) {
        String string;
        String string2;
        try {
            string2 = m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$geQKLVjlkrAKXPkFgab0AEr3si4KEMw5steSSgsByzWw6ZDxQ8cScAgJmhq4jgU2WEcnO6cjSczPmyYtiVSanllCBiKiu73ok.m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(this, (-1210257795 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & ~n) ^ ~n) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & n));
            string = this.getInfo() != null ? new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)String.valueOf(class_124.field_1080)).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)this.getInfo()).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)String.valueOf(class_124.field_1068)).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)String.valueOf(class_124.field_1080)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\u0001 [\u0001\u0001\u0001]") : "";
        } catch (class_151 class_1512) {
            throw m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.b((Exception)((Object)class_1512));
        }
        return new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string2).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\u0001\u0001");
    }

    public void ignoreState(int n) {
        this.m$$lnDF2xI8YidbRK8zBib8oQvfxCnz43Uhz3dOw8j4F2C4YWOxfO5UE5QjNx4ZhiXBvIDFC1Y5ip7irevRiUZ7hWpHoF9cwCqQL = true;
    }

    public void modifyKeybind(Function function, int n) {
        this.m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G = (m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx)function.apply(this.m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G);
    }

    @Override
    public String getConfigName() {
        return this.getName();
    }

    @Override
    public boolean isToggled() {
        return this.m$$iihzjWso3GlHrfYtFLMllrZvFCKCzkix9FbRi71YjhHPuc9ASP9xV99niQlvyZOPERU8gzmNrJKTwPJLQ5nTs3JnXuXAOSZFi;
    }

    public void onToggle() {
    }

    public boolean isDrawn() {
        return this.m$$hDMsM3tDFnD4jD14XsgHo5oPy6uUllEoQeWknfaChhCiKma3TJQlpjRShkHrE44MJDmjpsTbFUQf5NX3NcSeqPWQDRMiIzUXA;
    }

    public void setDrawn(boolean bl, int n) {
        this.m$$hDMsM3tDFnD4jD14XsgHo5oPy6uUllEoQeWknfaChhCiKma3TJQlpjRShkHrE44MJDmjpsTbFUQf5NX3NcSeqPWQDRMiIzUXA = bl;
    }

    public void setWip(boolean bl, int n) {
        this.m$$HF6xcp0tb4bRXiB1EXcTEHaNi5cBmGg2yStyyaxeBxioFrqtzkvHzkRpLiE7Erm19nrVaCKZMYCFGdtMDhWoWvb2QbVp1mQv2 = bl;
    }

    public m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx getKeybind() {
        return this.m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G;
    }

    public void setKeybind(m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx, int n) {
        this.m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G = m$$UMzUbts95JkNSxbhWStV8Ed2iBf6xXdhcMJydtC5FzfYzcUNcIIHBKoMpYbgjayJ9s5ljuWZEBJIG3CDBdN8Sc3J6Gbd29oyx;
    }

    public boolean isWip(int n) {
        return this.m$$HF6xcp0tb4bRXiB1EXcTEHaNi5cBmGg2yStyyaxeBxioFrqtzkvHzkRpLiE7Erm19nrVaCKZMYCFGdtMDhWoWvb2QbVp1mQv2;
    }

    public void onDisable() {
    }

    public void onEnable() {
    }
}

