package me.mioclient;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm;
import me.mioclient.m$$I0KWdaca8oT9GEVjgh3sxEPxtmT6ZRjPVL1CqqGYd5TBBjQ1T7O9AbNs0sySzUBCsOJdjggDRoKZ2U7i5mHhfNAJxbYXmZi9u;
import me.mioclient.m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR;
import me.mioclient.m$$OL1V89XVQZMWcBgjrexzXvHxCsfSQA4Wmo1bWT4Z948qhxryG2P18A1P8YL7stDph9qtQiQgZTxNW34jKGOH8fWwTRlxR3VsK;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$VqDc0eTAgzOPC4IU6WwZsiqEa0qk7QNmclpi6XPMtzLLBOqLUU9iWXMcrWVjw6jLdGlqrsVBwx7XuPXLTWk6HGDHuk8aGSTUx;
import me.mioclient.m$$VsGnPlMiaRwU6egffgLPoztoFs9ltcxbqpmKM9tVWVAnOLc9RDaxZHNvjn5CEU4F9uYfzG3TwY6d1bvC06AbuPljluzwD2TnR;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$f8T8GWPhDPDMtx3fBplF4NTRqxg1etjT16xWIEBogaj1W2wsOrFfWayMboHAsqwbMwmiYmU6YhH8DfTShcB8rmiKFh9ZZB5NK;
import me.mioclient.m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN;
import me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5;
import me.mioclient.m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA;
import me.mioclient.m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_124;
import net.minecraft.class_151;
import net.minecraft.class_1921;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_7833;
import org.joml.Quaternionfc;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH
extends m$$VsGnPlMiaRwU6egffgLPoztoFs9ltcxbqpmKM9tVWVAnOLc9RDaxZHNvjn5CEU4F9uYfzG3TwY6d1bvC06AbuPljluzwD2TnR {
    public static final m$$I0KWdaca8oT9GEVjgh3sxEPxtmT6ZRjPVL1CqqGYd5TBBjQ1T7O9AbNs0sySzUBCsOJdjggDRoKZ2U7i5mHhfNAJxbYXmZi9u m$$VmyTpwAF92USap7B9M2YUAhHwzkDvITPv3Od3Zy4MMFmNdIntOLiENCcNh2rfIgq9Kv2SD6lE0HCvgi05hsItgz0clBETxKXU;
    public static final class_2960 m$$Pb25YBAsMHqxlJu0wva2Op3aMDFFcWmLMAocy06r51lhKWCeDuXDQmZ4O2eaAWdehGEXQku9NkBIj0lzMRdXFgJEKn8nnIxB6;
    public static final float m$$8YWcgCWPNWLtrm0zlh7U0BHv0QHuoyEQYOHJRnFsge4CTQrxPT8RQN5PVf4m8AJtgwYBwktZfKGJT61Goe7diF8puPEQ2Njyz;
    public static final float m$$x27oHsgaXeAkzzHq04XTQaqpnYLA6MgVlnMT4XZJpVYPl7aCCcJD7vVXpEWd7pViPMHShWvDu5CzJg3N5vBPeLLs4q862QrN4;
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$TC8ZQRbsir9EWTYvrvU9N2x2kbxZBV4XKhHanFuPFZ4Fr2Fqfi5uf0RnDQvuJfNWL5wJ0SmkAbSas8nIWbTQKrhzR2kV46cAt = this.add(new m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR("Pointer", m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$X8unOmnVSWmTfyp4lvPt9Hs2plmremhztnmYM0bBmzGk5XmaKF7wQqweXp6LAlX9A7kHKD787Wv4orDafRELe4jU4CjU7RIT8));
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$GUIQZaF1m35w9VO0foJFVgUYjDen85opCVbDiVtMv2vGNkO92NaRsBGyEzEBlL0n2MWwe9l0qynm2jTVWnGcBTPEPpJPvdLW4 = this.add(new m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q("Width", Float.valueOf(76.0f), Float.valueOf(50.0f), Float.valueOf(500.0f)));
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$Cv0TJNyLYOju08ira6Gjb6kV2OBgmIlGpBfz9Gld7rjFArKHO0m0CiAYps12PnsYVru6zufsGOCPfo9ErjVHdlGWuEctlmWg6 = this.add(new m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q("Height", Float.valueOf(76.0f), Float.valueOf(50.0f), Float.valueOf(250.0f)));
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$rZaEJBNcuQjwtmGxfNaaBLHiymjqSPLaBYrDSVLO9JfKnaQWMEedyS28r7TdJKCQW83Cfz1onmpsM1BlnhyxjpL9dKx4NMRNU = this.add(new m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm("Pointer", Color.white));
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$ygRdBEgkmKUIzCahMIbDED2f0igxsto0SrJjgmAvLsaI4qeirRTUlGKDTcaqUiHf83axF4wpmxVsyO8mJvmhRMfCdz72uvSJg = this.add(new m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm("Background", new Color(10, 10, 10, 50)));
    public final m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5 m$$rTNLyvY5d4WuV7da2DKcHbXikTEIerK6DTMOwQ4nJs0QCfANhS0182TM7NtNb4BFC7FgFPTM5ocnCEzozBxy1vCiUg2QBN25W = this.add(new m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm("Outline", new Color(10, 10, 10, 100)));

    public m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH() {
        super("Map", "minimap");
        this.m$$rZaEJBNcuQjwtmGxfNaaBLHiymjqSPLaBYrDSVLO9JfKnaQWMEedyS28r7TdJKCQW83Cfz1onmpsM1BlnhyxjpL9dKx4NMRNU.m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI("PointerColor", -1852756390);
        this.m$$rZaEJBNcuQjwtmGxfNaaBLHiymjqSPLaBYrDSVLO9JfKnaQWMEedyS28r7TdJKCQW83Cfz1onmpsM1BlnhyxjpL9dKx4NMRNU.m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN(-96690866);
        this.setDescription(new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)String.valueOf(class_124.field_1054)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("\u0001Primarily used for NewChunks"), 1318776730);
        m$$OL1V89XVQZMWcBgjrexzXvHxCsfSQA4Wmo1bWT4Z948qhxryG2P18A1P8YL7stDph9qtQiQgZTxNW34jKGOH8fWwTRlxR3VsK m$$OL1V89XVQZMWcBgjrexzXvHxCsfSQA4Wmo1bWT4Z948qhxryG2P18A1P8YL7stDph9qtQiQgZTxNW34jKGOH8fWwTRlxR3VsK = new m$$OL1V89XVQZMWcBgjrexzXvHxCsfSQA4Wmo1bWT4Z948qhxryG2P18A1P8YL7stDph9qtQiQgZTxNW34jKGOH8fWwTRlxR3VsK(this);
        m$$OL1V89XVQZMWcBgjrexzXvHxCsfSQA4Wmo1bWT4Z948qhxryG2P18A1P8YL7stDph9qtQiQgZTxNW34jKGOH8fWwTRlxR3VsK.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(this);
        this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$OL1V89XVQZMWcBgjrexzXvHxCsfSQA4Wmo1bWT4Z948qhxryG2P18A1P8YL7stDph9qtQiQgZTxNW34jKGOH8fWwTRlxR3VsK);
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
                                m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.w = new Object[83];
                                m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.x = new String[83];
                                m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.g();
                                var21 = new String[12];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX("HrZS1LKiVmEu8eRfXzGf", MethodHandles.lookup(), "m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX", m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.class, 562283218);
                                var20_3 = var18_2.length();
                                var17_4 = 7;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 42;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX("IaTMnX7wmik8vtUuvJfK", MethodHandles.lookup(), "m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX", m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.class, 1415718486);
                                    var20_3 = var18_2.length();
                                    var17_4 = 5;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 27;
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
                                            v15 = 59;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 103;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 106;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 127;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 65;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 36;
                                            break;
                                        }
                                        default: {
                                            v15 = 44;
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
                        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.g = var21;
                        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.h = new String[12];
                        var8_7 = 3742756435108653102L;
                        var14_8 = new long[142];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX("GSFjUe6pieLLORUcLcRs", MethodHandles.lookup(), "m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX", m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.class, 2113611359);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX("Ouit2ZrMRyTPBtpxwqwq", MethodHandles.lookup(), "m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX", m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.class, 786789155));
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
                            var12_10 =  /* dynamic constant */ (String)m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX("bVgJmIfA60AcWdQwi4q6", MethodHandles.lookup(), "m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX", m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.class, 2022438145);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX("6icUIoLckI9nsKbq4Ukb", MethodHandles.lookup(), "m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX", m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.class, 1117914107));
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
                m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m = var14_8;
                m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.n = new Integer[142];
                m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 116983;
                var0_14 = 3030244099393089284L;
                var6_15 = new long[18];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX("A0L9L1knK960x9nRSneH", MethodHandles.lookup(), "m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX", m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.class, 1635054629);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX("hXj0Q4vn4bVs0yW4y2Dg", MethodHandles.lookup(), "m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX", m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.class, 2130258133));
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
                    var4_17 =  /* dynamic constant */ (String)m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX("DygMpNa2VAylTyyJzX50", MethodHandles.lookup(), "m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX", m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.class, 150497533);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX("m6alBXeLTddDdjxjtYiC", MethodHandles.lookup(), "m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX", m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.class, 1223621824));
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
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.q = var6_15;
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.r = new Long[18];
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)5868476484173223685L);
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$x27oHsgaXeAkzzHq04XTQaqpnYLA6MgVlnMT4XZJpVYPl7aCCcJD7vVXpEWd7pViPMHShWvDu5CzJg3N5vBPeLLs4q862QrN4 = 8.0f;
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$8YWcgCWPNWLtrm0zlh7U0BHv0QHuoyEQYOHJRnFsge4CTQrxPT8RQN5PVf4m8AJtgwYBwktZfKGJT61Goe7diF8puPEQ2Njyz = 16.0f;
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$VmyTpwAF92USap7B9M2YUAhHwzkDvITPv3Od3Zy4MMFmNdIntOLiENCcNh2rfIgq9Kv2SD6lE0HCvgi05hsItgz0clBETxKXU = (m$$I0KWdaca8oT9GEVjgh3sxEPxtmT6ZRjPVL1CqqGYd5TBBjQ1T7O9AbNs0sySzUBCsOJdjggDRoKZ2U7i5mHhfNAJxbYXmZi9u)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$I0KWdaca8oT9GEVjgh3sxEPxtmT6ZRjPVL1CqqGYd5TBBjQ1T7O9AbNs0sySzUBCsOJdjggDRoKZ2U7i5mHhfNAJxbYXmZi9u.class);
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$Pb25YBAsMHqxlJu0wva2Op3aMDFFcWmLMAocy06r51lhKWCeDuXDQmZ4O2eaAWdehGEXQku9NkBIj0lzMRdXFgJEKn8nnIxB6 = class_2960.method_60655((String)m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.d((int)-23767, (int)15226), (String)"textures/nav.png");
    }

    public static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7869;
        if (m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.n[n2] == null) {
            m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.n[n2] = (int)(m[n2] ^ l);
        }
        return m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.n[n2];
    }

    public static long f(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x6B29) & Short.MAX_VALUE;
        if (r[n2] == null) {
            m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.r[n2] = q[n2] ^ l;
        }
        return r[n2];
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static void g() {
        Object[] objectArray = w;
        w[0] = "\u0014v\"\u001aY\u0013\u001fy3U1\u0013\u0011v ";
        objectArray[1] = Integer.TYPE;
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.x[1] = "java/lang/Integer";
        objectArray[2] = Float.TYPE;
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.x[2] = "java/lang/Float";
        objectArray[3] = "HE?q\u0006#FLxy\u00018\u000bM58\u000e\u001dpR\u007fT\b\u001d\u0011p$q:\"MHH{\u0018>`RTF&:m\u0019UP\u0006\u001b\u0015rcI\u0006\u007fSk'f\t\u001a\u0016jA.-)\u0011s!F'\nJw\"Y\u0004\u0000piu{.\rwUa*8$Ln`o=\u0003D\u0012sh\u0002\u0018@\u0018im[=M\u0014`T\u0002";
        objectArray[4] = Long.TYPE;
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.x[4] = "java/lang/Long";
        objectArray[5] = "9my[\u0003\b9mn\u0007\u000f\u0007#&n\u0019\u000f\u0012$W?LXQ";
        objectArray[6] = ">91s\fw56 <qo&1)u";
        objectArray[7] = "4s8\u001bE/:z\u007f\u0013B4w{2RA'3!z9k*;xF\u001dK\u0005\u0014wt7I,\u0011bG>D,\u0017E]\u001b\u00182\u001b!s\u0006|/>|P\u0010A(:RE\u0007\u0019\u00046~  \u007fyaRx%\u0014*.BcAJq`'R\u0019et, d\u0012D3*ng\u000ex&,TX\u0007t9\u0010u\u007f0\u0019";
        objectArray[8] = "\u0010\u0005n]\u0011w\u001b\n\u007f\u0012py\u0010\u0001{H";
        objectArray[9] = "uk,\u001b\u0017\u0014uk;G\u001b\u001bo ;Y\u001b\u000ehQk\u0006H";
        objectArray[10] = "O\n?D\u000f\"Q\u0002%\u000bG\"K\b=LN9\u000b-<KB#L\u0004'";
        objectArray[11] = Void.TYPE;
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.x[11] = "java/lang/Void";
        objectArray[12] = "\u001aO\u0007\u001c\u0019l\u001aO\u0010@\u0015c\u0000\u0004\u0010^\u0015v\u0007uG\u0003L1";
        objectArray[13] = "@r\u0006\u0011uN]g^34CEa";
        objectArray[14] = "X'n+\u0018\u0007X'yw\u0014\bBlyi\u0014\u001dE\u001d.0MY";
        objectArray[15] = ";u;0\u0005_9krO\u001aQ b.p\u0006_:a?";
        objectArray[16] = "\b\u0011foo\u0012\b\u0011q3c\u001d\u0012Zq-c\b\u0015+%t5";
        objectArray[17] = "\u001a`q1@<\u0013nrx\u00031\u0015nfz\u001e7W`lzC4\u0015![s~'\u0018{yRL=\u0018hym";
        objectArray[18] = ">UEbd|>UR>hs$\u001eR hf#o\u0006t:&";
        objectArray[19] = "Ap\u0000CBJCnI<]DZg\u0015\u0003AJ@d";
        objectArray[20] = "AWf2\u0002PO^!:\u0005K\u0002_l{1PY[\u001d\u0019\u0000G\u001dJ09\u001b}oD\u001d\b#\u000bcV\u0010=XNV\u0003~0\f[x\u007f\f;\u0006\f\u0018X\u001a;'pD@*\u000b8Gvh<:\n{|Gy\u0017\u0013\t\u001ah\u001d*\u0011ZhC\u0003\u001d,ENf\u0018'\"\rbs+-\u0006E\u001a{\u0005\u0019:H}F)\u0018&";
        objectArray[21] = "\"I\bsBc,@O{ExaA\u0002:}B\u001aT`zFX$Uuyh9z\u007fss\u0013M:i\u0012-lg uBjDI+zeGq4=vqKqA.\u0019kw\u0018a,\u007fij\\<.z\u0012fCI7_orRV)IKGbc7JB}\u001fx(DlibC*\u001bk[}:\u0001JrY|";
        objectArray[22] = "\u0014Ed~\f$\nM~1k%\u001bVskM#";
        objectArray[23] = Boolean.TYPE;
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.x[23] = "java/lang/Boolean";
        objectArray[24] = "ZG\u000b\u000e`PTNL\u0006gK\u0019O\u0001G@\u000f|uA\u0002j^\u000fMqZNzaHB\u000b:LOgu\u001b}Rc\u0014\u007f1coan\u0014 xNp{AV]}uHtR]\bx\u001bd\u0001GL\u0007Q\\0sjuaV,C[]EB'[P|x\u00176>V\u0002Om\u000boqvh]\u0001PgZxLZ|";
        objectArray[25] = "?+.\u001f}&!#4P\u001f:&>";
        objectArray[26] = "kaJJ\u0000Seh\rB\u0007H(i@\u0003\u0010\u0004?HWU\u001fXi=TJQiSI\u0017tZYSiTS\u0010h1M]WP^r]=nQv2@4B=S14\u0014L#JtCVM!FaH3R#VR5-n(fuF\tU\u0004\r?L\u000fc\u001c}IP\u000eu/dJvV\u0010\u0006EkO6}!";
        objectArray[27] = "@{\u001716@@{\u0000m:OZ0\u0000s:Z]AR&i\u001a";
        objectArray[28] = "e5N 1?k<\t(6$&=Di>h\\h'\u001a\b8L\u0000$\u0000,(;6\"=4\u0016<\u001e4\u001f)(oa\u000592\u00049f\u0018\u001a\u0011\u0015J?\u0007,2a_b\u0017>\u0017\"N67,!\u001dj?(\f+!\u007f2-:59Q=5{\u00018@h$+\f\u0003`3\"u*=a\u001b&%a\nR\u0012U\u0003\u0013";
        objectArray[29] = "Tg\\E1dZn\u001bM6\u007f\u0017oV\f3^\fu>A/?\u0001q&N\b}~t\u0019O\u0001ozN4I\bnH[\u0014\u007f\u0019g\nT\u001cN\u001fA`a\u0005m-DZC\u0016BhJ`V3j\rIR5\u0014|)\\\u0001[ y\u001b}X6$b/LSg%Y\nR][\u0001o)]z6$a OMq9^,";
        objectArray[30] = "\u000b\u0019,B\u000eK~41WVi?9)QC";
        objectArray[31] = "(4\"\u0001gm(45]kb2\u007f5Ckw5\u000ea\u001b<";
        objectArray[32] = "lx~M3Wgwo\u0002YTs{dI";
        objectArray[33] = Double.TYPE;
        m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.x[33] = "java/lang/Double";
        objectArray[34] = "FKJ\r\u0014\u0017MD[Bw\u001aXB";
        objectArray[35] = "f4UU\u001djf4B\t\u0011e|\u007fB\u0017\u0011p{\u000e\u0013OC";
        objectArray[36] = "\tVB\u0013\u007f<\u0007\u0011YL\u00194ZUEEu\u0006\r\u0014\u001f\u0013!Q\bML\u001fulL\u0015ZD\u0019jPPAOx`LV^\" o\t\u0019\u001cEtoHK%\u001b'o\u0007\u0010BO'.U)\u001cO~iRJW\u0019&<7\u0010HE!4T[\u001e\u001dtQ\u000e\u0017\u001b\u0012 6Z\u0017Z@\u0019h\t\u0017\u0015\u001b~<\tVG\" o\t\u0019\u001cEtoHK%\u001b'o\u0007\u0010BO'.U)\u001aDykMK\u001aFb.7";
        objectArray[37] = "l\u0005sqA05\u0005s{1o1\u001bkp]]eV0,\t\ne\nl/Ti.\\4z1";
        objectArray[38] = "q]f_0'0I;R\u000f5$Cw\u000fH%M\u001ax\u000fi\"4Mu\u0010eKq]f_0'0I;R\u000f";
        objectArray[39] = "u\"-\u001a{\u000ev6;':\u0000\u007f <`*i\"06\u001f!\nifnJD\u0007d!l\u0018#\u0004p7Q";
        objectArray[40] = "\u00144\u0015&\u001f!\u00114\u0006#\u007f!\u0010p\b\"\u0013\u0013G6Y}@D\u0014a\u0004tE'\u0010eRx\u007f{\u001blR?\u001d{\u0019w\u0017E";
        objectArray[41] = "Z|}\u007f\\e[aty,=Vzxx@\u000f\u000b=\"!,a\u00058(&K5\u0005yz\u001f";
        objectArray[42] = "=C/,`U3\u00044s\u0006]n@(zjo>\u0005t <8<Z('|Z<X3b\u0006";
        objectArray[43] = "\u0002#\u0001|\u001eK\u0002)\u001cf%GNf\u0001bi`Y%#5\u001dp\t\u0001 `xE\u0019%A]La/v\u0014COY.$1hLk]\u0003 s\u007f\u001d\u0003.\u0013mJ]\u0013\u0007$s\\z\u0013\u0007\u0011HdA//!}e\\25K^wH^\u00111|{G={Jnjx9\u0006\"wee9\bC<e_3&\"\f\u001c\u001c\\zCkH\u001c\u001d(zlFS\u001f6\u0015cEN\u0018J";
        objectArray[44] = "9\n3\u0004y17M([\u001f9j\t4Rs\u000b=Hn\u0004#\\>Kj\u0005&;jK+W\u001fe9Kd\fx19\n65&b9EmRrbx\u0017T\f!b7L3X!#eum\u000b!l>\u00129\u000b`>\u0007J2U%&eJ0N`\\";
        objectArray[45] = "\u0011S m*jMT{)Vj\u0000\u0011 y\u001cBt~\\KhfF\u0006u)\tbqSAh+FIyAtmsjl{]-fI|GI\u0010hLv(,)uo@Hx'k]SiBj5b^EL,wjs'M'uP\u0000Jm\u0014te\u0002%\u007fn3wSuc3UM\u0000hx+?CWY\u0012ju@\u0000'~+a\u001d\r\u0018+h1\u001c\u0004\u007f\u007fhpN='t65V_'v-p,";
        objectArray[46] = "lLv6\u0012\u001biLe3r\u001bh\bk2\u001e)?N:mI~:\u0012ko\b\u001c:\u0010p*r";
        objectArray[47] = "\u0006<fnu\u001c\u0018= >\u001aAKq/-kK*\rf\nkk\u001bf\u00034c{\\m;0\u007f[W\u0001\u0016/s]^\u001701]U#\u0014f2$t.7#\u0000[C\n\u0016f\u0016 tW\"\u0000`~H\t\f&hx\u001a\u0005\"2jFF\u001d4f\u0014JIX\"\u0000\u0002^i*4/)a\u001a\u0001\u0016e\u0000*{V\u0013mP{^\u0002=-mzC\u000b;]?*[\t7f!f\u0019\t]";
        objectArray[48] = "7j\u0006]H%b8\u0014M\">0'\u000bSN\fdjW\r\u0012[m9\u0013RRa49\u0013X\"";
        objectArray[49] = "\u0003P\u0016\u001aUn\u0006P\u0005\u001f5n\u0007\u0014\u000b\u001eY\\VVW@\u000b\u000bS\u0005\fAPh\u0018ST\u001452\u0007\u000fS\u001cVyQW\u0006y\ff\rP\u000e\u001aG0U\u0005kFSkP\u0012\tFQp\u0015h";
        objectArray[50] = "\u0007\u0007U6\u0017&\u0006\u001a\\0g~\u000b\u0001P1\u000bLVF\nfg\"XC\u0000o\u0000vX\u0002RV";
        objectArray[51] = "s{^Ts\u0014poHi\"\u0017zm^7%\u0017`i\"P!\u0014%aA\u001bwLp\u0004";
        objectArray[52] = " \u0013E&5V|H\u001b1Y\u0015 \bj2\"\u00057\u0015^#8\t+t\u001a%5Sr\u0018[1h^MM\u0018aiW*\u0019\u0018 ;nr\u0012Fe#\fr\u0010] Y";
        objectArray[53] = "\u0005-|;\u0011\b\b2j$}\u0013K\u007fLw\u00177+(<s3-\u001c9^!2<\u0003\nA\u000e\u0019\u001d7hm\u0011>*\u0005n`/6I-4X-\u0007\n&n8\u0006:\u000b\u000boX/\u001a\u001a\u0019nk\u0015-\u0004\u0001(s\n\u0006\b+\u0014A\b\u0001\u0012))9q9\u0014\u00012Yp\u0012\t+\u001d~0D\u0016\u000bh<'1)\u0004\u0013xJDHYc8-\u0010H\u00181\u0001+\u0007\u0013\u0007#<*\u001a\u001a\u0001S";
        objectArray[54] = "m\u0001!K\u00172k\u0017v\no8a\fq\t\u000e%`<u\u001a\u0015/k\u000b\u0018L\u0002%>\u0015{\u0007T}kpt\u0018\u0014)y\u0019v\u0010\u00053\u0006";
        objectArray[55] = "\u0003\u0010&0\b0P\n|0y=[\rz\u0017\u001e1_v#bGm\u000b\u0011wb\u0006?2";
        objectArray[56] = "Wv(]j:Xu5Z\u00164Kx#Ij2M\u00157Am'\bj6K'j7";
        objectArray[57] = "3aZ\u001dLWof\u0001Y0W\"#\u0004-Wua?\r\u0004~teP^^VuRU\r\u001bH`qOZZ\u000b~\\E\u001e,u~tF\b\\W\bdp\u000e\u001b|qhh,\u0004hssI,>PTUf\u0006\u0001wsg2'_oWuE2R_@DQR\u0019hOqW\r\"R\u007f7N\u0007\u0012\bn1@$b\t\f0?[\u0005]\fqmb_^\nqs\u0007\u0003YQ5\u000f";
        objectArray[58] = ")\u0010#)zd+Fm\u007fEi(\u0011\\++8;\u00019w,c\u007f}ax}\u007f8\u0018=\u007f&;D";
        objectArray[59] = "(v\f\"\"\u0013)|Fo\u001d\f/l1=m\u0010FxG/s\u0006}f\u000bmsl";
        objectArray[60] = "GE\u0018\u0012;^FX\u0011\u0014K\u0006KC\u001d\u0015'4\u001b\u0005@LucGE\u0018\u0012;^FX\u0011\u0014KZ\u0018\u0001MK,\u000e\u0018@\u001fr";
        objectArray[61] = "f\u0014K s\u00135\u000e\u0011 \u0002\u0011:\u000e-!n~nLI|;\u0019:L\b.\u0002";
        objectArray[62] = "+\u001dx\u0006s\u0015.\u001dk\u0003\u0013\u0015/Ye\u0002\u007f'x\u001f4].p{Hb]v\u00130\u001e:\b\u0013I/B=\u0000p\u0002y\u001ahe*\u001d%\u001d`\u0006aK}H\u0005Zu\u0010x_gZw\u000b=%";
        objectArray[63] = "!2QXjZ!8LBQVmwe\u0012#}\u007f\u0004AE\u0003^}1CD,C0)n\u00170Z\u000e<L\u0016\u0013\u0002*\u0005Qa\u0010|\u001e>gn\u0010L\u00064Mm\u0013X~bSv\u0014N\u001f\u0000PG7s\b\tiz\u0017]:dI\u0019/\u000f1dSTml};zw*\b\u0019cTLo\f;\u0005\u0015dh}&\u0005g(h\r\u007fk\u0013O<\r>9*H2B<'EG1_;[";
        objectArray[64] = "\u000b4\u00017&\tR4\u0001=VVV*\u00196:d\u0002gBkh3\\)\u001bkk\u0003^3\u0001.V";
        objectArray[65] = "Uv'ME\u001aKwa\u001d*G\u0018;n\u000e[MyG')[mH,B\u0017S}\u000f'z\u0013O]\u0004KW\fC[\r]q\u0012mSp^'\u0011\u0014r}}b#kEY\\'5\u0010r\u0004hACNNZFgKH\u001cVhsIv@N~'7zO\u000bhA!noy~n\nQ\u001cR\\$#\u001a}\u0005Y,s\u0014]S&z\u001e\u001a\u001aHy\u001c\u0012PGTg!\u0013MNR\u0017-\u0015\u0016NEz~\u000fLN4(z\u0013\u0010XV(x\bU\"";
        objectArray[66] = "\u00181|SU\u0012\u00060:\u0003:OU|5\u0010KE4\u0000|7Ke\u0005k\u0019\tCuB`!\r_UI\f\f\u0012SS@\u001a*\f}[=\u0019|\u000f\u0004z0:9={M\u0014\u001b|+\u0000zI/\u001a]^F\u0017\u0001<UX\u0014\u001b/(WfH\u00039|)jGF/\u001a?~g495\u0014A\u0014\u001f\u001b\u007f=\nuH\u001ewm\u0004U\u001ea!\u0000\n\u0012\u0005>GTWMA5$\u001f\u0001\u0015\u0014P~\u0000]\u0012\u001c35V\u0005Gyo!\r\u0000P\u001bo#\u0016E*";
        objectArray[67] = "u3s\u000b0%p3`\u000eP%qwn\u000f<\u0017&1?Pa@#mnR*\"#ou\u0017P";
        objectArray[68] = "V\u007fBd\u0012\u0014Wu\b)-\rUnE\u0016\u0010\u0019UxPoG\u0014Jt9";
        objectArray[69] = "i8;9\u000e\u0014lx'81?~l6\u0006X\u0012kd+\"\\\u0012\u00028x`\u0001Qelx!Sh;?xn\b\u000fo?9<1Q<?vgV\u0005<~$^\u000e\u000eb;<<\u000e\fy~F";
        objectArray[70] = "U\u0019E\u00149FV\rS)gGG,XU}}\\(]No];_\u0007\u00176\u0018\\\u000b\u0007Vd!\u0002\u000b^\u0011cBI]\u0006D\u0006";
        objectArray[71] = "\u0002V\u0017[unQLM[\u0004l^LdMinU0\u0012\t:3\nWF\t{a3";
        objectArray[72] = "\u001d>`3!\u0015B}`\"B\u001d\u00148b+./B}>s|x\u0018>g,2E\u0019#n*B";
        objectArray[73] = "A\u001bMb0~F\u0002V&\r$C\u0001X\u0016l<_;P\u0010j=N\u0003Z\\7;X\u0007]`o,U\u00047:o<KX\u00077j>@g";
        objectArray[74] = "\u0004CZ1n{]BSq\u0005^\u000f_[:=r|O*vO1yI\u00197c=]E!\u0005CiD`+q\u007fGGR\u000e\u000fb^~\u0016\u000erf?TsPq8DEA\u0017\u000bAl\u0001E\u0006)\\R^N4\t4g\u007fE,wwy\u000eE 0WCxB!(TKb|R,aGlS'9\u007f8\\\u00159K?{BN\u0001wglOMkr;>\u000e\u0017\f&;\u007f\\.";
        objectArray[75] = "@\u001d\u007f>S0\u001c\u001a$z/:\u0010\u000f\u0019(K(\u0010sz3B3\u0014\n->]?}";
        objectArray[76] = "b\u0002\u0017\u0016F\u0001lE\fI \t1\u0001\u0010@L;aDL\u001b\u0010l5E\rD@\t0E\u001eA ";
        objectArray[77] = "vO\u0003wj\u0010|S\u0005h\u0007\u0014 T\u001atk&s\u0010D.:qqR\u0016.8\u001d0FK#\u0007M7DG,k\f#\u0019J\u0013<\u00164L\u0017r6\n2Sz";
        objectArray[78] = "Qi:'c'\\v,8\u000f<\u001f;:,k!\u0003e.51\"\\r\u000e\u0013dcXk+\u001935tX\u0019\u000bE\u001dpE-ov0\u0002R\u0006\bo Mu\u0015iVbCz\u001e\u000bN6rH\u0019\u001f\u007f8Vh};@\u0018_S\u001cnb<Sv#jI9ZO7\r^0^~6.v\u000bU{\u0002fN2\tx V6g\r'~1bgLuG5k<Q}6$}?\n\u0017";
        objectArray[79] = "^\\\n0wHEU\u0002q\u000eVIA\u00031\u000ePZE\u000br>]_G\u0000MhTDV[}eQF]d+lJW\u0006T&iH\\9";
        objectArray[80] = "vm.R\u0003f%wtRrd*wXZ\u000ffG2,\u0000B2 f,A\u0010\u000b";
        objectArray[81] = "\u0002\f\u0000vEi\u0013\u001a\u0003-/}MD\u0017i^w,8^N^W\u001dS;pVGZX\u0003tJgQ4.kFaX\"\buhi%!^v\u0011H(\u0002\u001bDn\u007f\f#^R\u0015HQ\u00178$Kt\u000f9\u001e,M&\u0003\u0017\n.sz\u001b\u0001^P\u007fu^\u00178FkU,\u0001\u0017mT&\u0007#]D\u001fGP&U\u0014Oq\u001a\u0018^}O{\u0007\u0002epD'\u0011\n\u0004rShQh";
        Object[] objectArray2 = objectArray;
        objectArray[82] = "/\u0014%+o04\u001d-j\u0016%$\u0010/Vp,5\u001etf})7\u0015K0t2&N{=q0-q";
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_332 class_3322) {
        Color color;
        Object object;
        float[] fArray = this.m$$VQeBiYQFF92st4KpYnl7JJZWvgzGjBP4Dd9SFTh4QWYtzxAIcX5Qp3MUZowrwkKm0ljNF9ZAlkex9P3KyEVeoeW2idm8qJEa8.m$$7Szu3mFkgE9FG0XDs2uxckwjp09CFsjILzFW0WG16lyf4hYxoXZ9ZVf9QEBKvatVEz9tWtFO3X6nFHKv1b1Ue9udJaIxFIm9Y();
        try {
            if (fArray == null) {
                return;
            }
        } catch (class_151 class_1512) {
            throw m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.a(class_1512);
        }
        float f = m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg()[3];
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(1.0f, 1.0f, 1.0f, 1.0f);
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB();
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(Float.intBitsToFloat(m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.c(3584, 6698260997044368898L) ^ 0xF33CA54 ^ 0x61E6794A ^ 0x8799E52A), 1.0f, 1.0f, f);
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$zk9yJWy8Cs7ANpEvtMQRvXlCNCRZxhr8NIJq4X4tBdUww03OfaeRoPvEO3Lsg2nQnPW0c4J89vLKpg6dBYgD5lOlMLOn22lUv.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_3322.method_51448(), -1.0f, -1.0f, ((Float)this.m$$GUIQZaF1m35w9VO0foJFVgUYjDen85opCVbDiVtMv2vGNkO92NaRsBGyEzEBlL0n2MWwe9l0qynm2jTVWnGcBTPEPpJPvdLW4.getValue()).floatValue(), ((Float)this.m$$Cv0TJNyLYOju08ira6Gjb6kV2OBgmIlGpBfz9Gld7rjFArKHO0m0CiAYps12PnsYVru6zufsGOCPfo9ErjVHdlGWuEctlmWg6.getValue()).floatValue(), (Color)this.m$$ygRdBEgkmKUIzCahMIbDED2f0igxsto0SrJjgmAvLsaI4qeirRTUlGKDTcaqUiHf83axF4wpmxVsyO8mJvmhRMfCdz72uvSJg.getValue());
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$zk9yJWy8Cs7ANpEvtMQRvXlCNCRZxhr8NIJq4X4tBdUww03OfaeRoPvEO3Lsg2nQnPW0c4J89vLKpg6dBYgD5lOlMLOn22lUv.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_3322.method_51448(), -2.0f, -2.0f, ((Float)this.m$$GUIQZaF1m35w9VO0foJFVgUYjDen85opCVbDiVtMv2vGNkO92NaRsBGyEzEBlL0n2MWwe9l0qynm2jTVWnGcBTPEPpJPvdLW4.getValue()).floatValue(), ((Float)this.m$$Cv0TJNyLYOju08ira6Gjb6kV2OBgmIlGpBfz9Gld7rjFArKHO0m0CiAYps12PnsYVru6zufsGOCPfo9ErjVHdlGWuEctlmWg6.getValue()).floatValue(), (Color)this.m$$rTNLyvY5d4WuV7da2DKcHbXikTEIerK6DTMOwQ4nJs0QCfANhS0182TM7NtNb4BFC7FgFPTM5ocnCEzozBxy1vCiUg2QBN25W.getValue());
        float f2 = ((Float)this.m$$GUIQZaF1m35w9VO0foJFVgUYjDen85opCVbDiVtMv2vGNkO92NaRsBGyEzEBlL0n2MWwe9l0qynm2jTVWnGcBTPEPpJPvdLW4.getValue()).floatValue() / 2.0f;
        float f3 = ((Float)this.m$$Cv0TJNyLYOju08ira6Gjb6kV2OBgmIlGpBfz9Gld7rjFArKHO0m0CiAYps12PnsYVru6zufsGOCPfo9ErjVHdlGWuEctlmWg6.getValue()).floatValue() / 2.0f;
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(f2, f3, 0.0f);
        for (Object object2 : m$$VmyTpwAF92USap7B9M2YUAhHwzkDvITPv3Od3Zy4MMFmNdIntOLiENCcNh2rfIgq9Kv2SD6lE0HCvgi05hsItgz0clBETxKXU.m$$G2zF6WceZe4baduxyzL7iaGon6J9cVsAIGWmENIwOgoMJc71qVMuVSrgnHAZKZNfs7k9v4x7qt4W4hXWs3P0vl67rV7D1FoVE(-1172166126)) {
            object = new class_1923((class_2338)object2);
            try {
                if (!this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_1923)object)) {
                    continue;
                }
            } catch (class_151 class_1513) {
                throw m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.a(class_1513);
            }
            color = m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Color)m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$VmyTpwAF92USap7B9M2YUAhHwzkDvITPv3Od3Zy4MMFmNdIntOLiENCcNh2rfIgq9Kv2SD6lE0HCvgi05hsItgz0clBETxKXU.m$$z5GrFUygeCzbUsKLcR8YwmKvFturo6gadIFf6SY3Lq9FgExgUVfOD33YcHERsN9YVWAF9K6Xd5CWl1jpFjzvhUd7F1Xo55N0q.getValue(), 0.4f);
            this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_3322, (class_1923)object, color);
        }
        for (Object object2 : m$$VmyTpwAF92USap7B9M2YUAhHwzkDvITPv3Od3Zy4MMFmNdIntOLiENCcNh2rfIgq9Kv2SD6lE0HCvgi05hsItgz0clBETxKXU.m$$sfDJ3gQ10ZcCRdUosg3YaKE4fGbsDfClaA7ARwR7ilaigwyEVwqPyEcLIkEmSyHvXw9ZZb4SCxVmW98jGRSDPsHOSJ18HuYdP(541930061)) {
            try {
                if (!this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(((m$$f8T8GWPhDPDMtx3fBplF4NTRqxg1etjT16xWIEBogaj1W2wsOrFfWayMboHAsqwbMwmiYmU6YhH8DfTShcB8rmiKFh9ZZB5NK)object2).m$$E5bIDs51FSsbWcGBlQHLlcX3dSKTj5imC7BoQortI51DOud4Qmodv5bWXznszHsvDOHJtlFr03LjniP2gwDFwr1hd35eDWkHq(1358519400))) {
                    continue;
                }
            } catch (class_151 class_1514) {
                throw m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.a(class_1514);
            }
            try {
                if (((m$$f8T8GWPhDPDMtx3fBplF4NTRqxg1etjT16xWIEBogaj1W2wsOrFfWayMboHAsqwbMwmiYmU6YhH8DfTShcB8rmiKFh9ZZB5NK)object2).m$$urlp8zak6sgmAMc2ctdG4dOGVUBLKZb1qa9MIVhqvjZ7Q3xeQUIgIWVAximw2eGIdLS0emhil4NhaPxSYaeaypqZndM8Ic2go(1537750178).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$VmyTpwAF92USap7B9M2YUAhHwzkDvITPv3Od3Zy4MMFmNdIntOLiENCcNh2rfIgq9Kv2SD6lE0HCvgi05hsItgz0clBETxKXU) == null) {
                    continue;
                }
            } catch (class_151 class_1515) {
                throw m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.a(class_1515);
            }
            object = ((m$$f8T8GWPhDPDMtx3fBplF4NTRqxg1etjT16xWIEBogaj1W2wsOrFfWayMboHAsqwbMwmiYmU6YhH8DfTShcB8rmiKFh9ZZB5NK)object2).m$$urlp8zak6sgmAMc2ctdG4dOGVUBLKZb1qa9MIVhqvjZ7Q3xeQUIgIWVAximw2eGIdLS0emhil4NhaPxSYaeaypqZndM8Ic2go(1537750178).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$VmyTpwAF92USap7B9M2YUAhHwzkDvITPv3Od3Zy4MMFmNdIntOLiENCcNh2rfIgq9Kv2SD6lE0HCvgi05hsItgz0clBETxKXU)[0];
            object = m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Color)object, 0.25f);
            color = ((m$$f8T8GWPhDPDMtx3fBplF4NTRqxg1etjT16xWIEBogaj1W2wsOrFfWayMboHAsqwbMwmiYmU6YhH8DfTShcB8rmiKFh9ZZB5NK)object2).m$$E5bIDs51FSsbWcGBlQHLlcX3dSKTj5imC7BoQortI51DOud4Qmodv5bWXznszHsvDOHJtlFr03LjniP2gwDFwr1hd35eDWkHq(1358519400);
            this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_3322, (class_1923)color, (Color)object);
        }
        class_3322.method_51448().method_22909();
        m$$VqDc0eTAgzOPC4IU6WwZsiqEa0qk7QNmclpi6XPMtzLLBOqLUU9iWXMcrWVjw6jLdGlqrsVBwx7XuPXLTWk6HGDHuk8aGSTUx.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((int)this.m$$VQeBiYQFF92st4KpYnl7JJZWvgzGjBP4Dd9SFTh4QWYtzxAIcX5Qp3MUZowrwkKm0ljNF9ZAlkex9P3KyEVeoeW2idm8qJEa8.m$$Naq2n8qHnw6QoQuCqBFiLzERx3f4d5zRruSiIUe8YrdSEGtMxgAIxwcSzE5rtZnJp0XEAf5WeDZKOtPa4w0oxxctw1IYlalZz(), (int)this.m$$VQeBiYQFF92st4KpYnl7JJZWvgzGjBP4Dd9SFTh4QWYtzxAIcX5Qp3MUZowrwkKm0ljNF9ZAlkex9P3KyEVeoeW2idm8qJEa8.m$$HQ3EsFFigVVutXSLnmqxmrgG8AhpcKc51HdHnP0WCmcxxZMDPTMMrxcopeMMzJGmucK0crGP29QZz9yXxPEzS7ova2hpGUeVw(), (int)fArray[0], (int)fArray[1]);
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB();
        m$$VqDc0eTAgzOPC4IU6WwZsiqEa0qk7QNmclpi6XPMtzLLBOqLUU9iWXMcrWVjw6jLdGlqrsVBwx7XuPXLTWk6HGDHuk8aGSTUx.m$$4hK25LEh1BdQnL69CCiLgnpW0Sh96VcoYzmroVK2yyX0PDQVK8Tns4ICGi7CuZNlZENlzoSVMMZdFHfY5k8o0kFCBYVVaX0qq();
        this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_3322, f2, f3);
    }

    public boolean m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_1923 class_19232) {
        boolean bl;
        int n = (int)Math.ceil(Math.hypot(((Float)this.m$$GUIQZaF1m35w9VO0foJFVgUYjDen85opCVbDiVtMv2vGNkO92NaRsBGyEzEBlL0n2MWwe9l0qynm2jTVWnGcBTPEPpJPvdLW4.getValue()).floatValue(), ((Float)this.m$$Cv0TJNyLYOju08ira6Gjb6kV2OBgmIlGpBfz9Gld7rjFArKHO0m0CiAYps12PnsYVru6zufsGOCPfo9ErjVHdlGWuEctlmWg6.getValue()).floatValue()) / 16.0);
        try {
            bl = class_19232.method_52566(m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_31476()) <= n * n;
        } catch (class_151 class_1512) {
            throw m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.a(class_1512);
        }
        return bl;
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_332 class_3322, float f, float f2) {
        block6: {
            block5: {
                try {
                    class_3322.method_51448().method_22903();
                    class_3322.method_51448().method_46416(f, f2, 0.0f);
                    if (this.m$$TC8ZQRbsir9EWTYvrvU9N2x2kbxZBV4XKhHanFuPFZ4Fr2Fqfi5uf0RnDQvuJfNWL5wJ0SmkAbSas8nIWbTQKrhzR2kV46cAt.getValue() != m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$aEgxNtMVNjphLBQrmvyUvW0K519c6iekmUvy31GHwJ5qzQZnx9FdBwmvAFAf9tzfLSqkjeVBHPFLEB5FqGM2euewX24PmOfAQ) break block5;
                    class_3322.method_25294(-1, -1, 1, 1, ((Color)this.m$$rZaEJBNcuQjwtmGxfNaaBLHiymjqSPLaBYrDSVLO9JfKnaQWMEedyS28r7TdJKCQW83Cfz1onmpsM1BlnhyxjpL9dKx4NMRNU.getValue()).hashCode());
                    break block6;
                } catch (class_151 class_1512) {
                    throw m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.a(class_1512);
                }
            }
            try {
                if (this.m$$TC8ZQRbsir9EWTYvrvU9N2x2kbxZBV4XKhHanFuPFZ4Fr2Fqfi5uf0RnDQvuJfNWL5wJ0SmkAbSas8nIWbTQKrhzR2kV46cAt.getValue() == m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$X8unOmnVSWmTfyp4lvPt9Hs2plmremhztnmYM0bBmzGk5XmaKF7wQqweXp6LAlX9A7kHKD787Wv4orDafRELe4jU4CjU7RIT8) {
                    class_3322.method_51448().method_22905(0.05f, 0.05f, 1.0f);
                    class_3322.method_51448().method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees(45.0f + m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1773.method_19418().method_19330()));
                    GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
                    m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk((float)((Color)this.m$$rZaEJBNcuQjwtmGxfNaaBLHiymjqSPLaBYrDSVLO9JfKnaQWMEedyS28r7TdJKCQW83Cfz1onmpsM1BlnhyxjpL9dKx4NMRNU.getValue()).getRed() / 255.0f, (float)((Color)this.m$$rZaEJBNcuQjwtmGxfNaaBLHiymjqSPLaBYrDSVLO9JfKnaQWMEedyS28r7TdJKCQW83Cfz1onmpsM1BlnhyxjpL9dKx4NMRNU.getValue()).getGreen() / 255.0f, (float)((Color)this.m$$rZaEJBNcuQjwtmGxfNaaBLHiymjqSPLaBYrDSVLO9JfKnaQWMEedyS28r7TdJKCQW83Cfz1onmpsM1BlnhyxjpL9dKx4NMRNU.getValue()).getBlue() / 255.0f, 1.0f);
                    class_3322.method_25290(class_1921::method_62277, m$$Pb25YBAsMHqxlJu0wva2Op3aMDFFcWmLMAocy06r51lhKWCeDuXDQmZ4O2eaAWdehGEXQku9NkBIj0lzMRdXFgJEKn8nnIxB6, -128, -128, 0.0f, 0.0f, 256, 256, 256, 256);
                    class_3322.method_51452();
                    m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(Float.intBitsToFloat((((m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.c(32081, 4865652114792187238L) >>> 5 | 0xE0000000) ^ 0xE6794A80) - 62101 >>> 11 | 0x3F800000) ^ 0xC3CC), 1.0f, 1.0f, 1.0f);
                    GlStateManager._texParameter((int)3553, (int)10240, (int)9728);
                }
            } catch (class_151 class_1513) {
                throw m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.a(class_1513);
            }
        }
        class_3322.method_51448().method_22909();
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_332 class_3322, class_1923 class_19232, Color color) {
        class_243 class_2432 = m$$y89L3rvdo90m8UUMsS3eUm0tyT7I9p9btYYI8J4DPeTo70pkJvrG2jHzgLWuJjT1IIAZsBmrm19HkDuAOTjRFXLr27oymKRZH.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1773.method_19418().method_19326();
        float f = (float)(class_2432.field_1352 - (double)class_19232.method_8326()) / 2.0f - 8.0f;
        float f2 = (float)(class_2432.field_1350 - (double)class_19232.method_8328()) / 2.0f - 8.0f;
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(f, f2, 0.0f);
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T(class_3322.method_51448(), 0.0f, 0.0f, 8.0f, 8.0f, color);
        class_3322.method_51448().method_22909();
    }

    @Override
    public float[] m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI() {
        return new float[]{((Float)this.m$$GUIQZaF1m35w9VO0foJFVgUYjDen85opCVbDiVtMv2vGNkO92NaRsBGyEzEBlL0n2MWwe9l0qynm2jTVWnGcBTPEPpJPvdLW4.getValue()).floatValue(), ((Float)this.m$$Cv0TJNyLYOju08ira6Gjb6kV2OBgmIlGpBfz9Gld7rjFArKHO0m0CiAYps12PnsYVru6zufsGOCPfo9ErjVHdlGWuEctlmWg6.getValue()).floatValue()};
    }

    public static String m$$AMw6wM9tffqAE3SAmKJGFOlv0eU24eKsJ8DI4OPaeO3njAhpzoewx9LdWQFY2j6qejasZ8RU2YgnSjMpUU8vctXQlRq62NnrX(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{119, 79, 41, 10, -78, 77, -125, 47, 43, 91, -37, -63, 100, -110, -100, 55, -101, -113, 80, -121, 123};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 21]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

