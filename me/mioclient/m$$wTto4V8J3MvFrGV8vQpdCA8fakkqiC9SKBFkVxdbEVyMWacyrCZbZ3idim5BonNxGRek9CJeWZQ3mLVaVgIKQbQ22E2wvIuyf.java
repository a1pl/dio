package me.mioclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$Jq4VaepZnFmEW0Wd27xBLp5R1WsLFj5OUKdOBpeCkJTC888xDPzT8BbBgw0WBEPEeqFa4pPjnSN4jHhPnQEde79scBOviU0zJ;
import me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_151;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf {
    public static final m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf m$$urlp8zak6sgmAMc2ctdG4dOGVUBLKZb1qa9MIVhqvjZ7Q3xeQUIgIWVAximw2eGIdLS0emhil4NhaPxSYaeaypqZndM8Ic2go;

    public void m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(JsonObject jsonObject, int n) {
        for (JsonElement jsonElement : jsonObject.asMap().values()) {
            if (!(jsonElement instanceof JsonObject)) continue;
            JsonObject jsonObject2 = (JsonObject)jsonElement;
            try {
                jsonObject2.remove("key");
                if (!jsonObject2.has("settings")) {
                    continue;
                }
            } catch (class_151 class_1512) {
                throw m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a(class_1512);
            }
            JsonElement jsonElement2 = jsonObject2.get("settings");
            try {
                if (!jsonElement2.isJsonObject()) {
                    continue;
                }
            } catch (class_151 class_1513) {
                throw m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a(class_1513);
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            for (Map.Entry entry : jsonElement2.getAsJsonObject().asMap().entrySet()) {
                try {
                    if (!((JsonElement)entry.getValue()).isJsonObject()) continue;
                    arrayList.add((String)entry.getKey());
                } catch (class_151 class_1514) {
                    throw m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a(class_1514);
                }
            }
            for (String string : arrayList) {
                jsonElement2.getAsJsonObject().remove(string);
            }
        }
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(JsonObject jsonObject, Predicate predicate) {
        for (String string : jsonObject.asMap().keySet()) {
            boolean bl;
            JsonObject jsonObject2;
            block21: {
                Object object = jsonObject.get(string);
                if (!(object instanceof JsonObject)) continue;
                jsonObject2 = (JsonObject)object;
                object = m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$pjpeQua4PAB6Zbpcv5B1EK6PACkuUkszPZ6igJ4EheKtCpGOS5rhssN6LeWpAJuyJeZRtolTY1xU3jouBuH7hlh4UdEG0zCIQ.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM -> m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM.getConfigName().equals(string));
                try {
                    if (((Optional)object).isEmpty()) {
                        continue;
                    }
                } catch (class_151 class_1512) {
                    throw m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a(class_1512);
                }
                bl = predicate.test((m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM)((Optional)object).get());
                try {
                    try {
                        if (bl && !(((Optional)object).orElse(null) instanceof m$$Jq4VaepZnFmEW0Wd27xBLp5R1WsLFj5OUKdOBpeCkJTC888xDPzT8BbBgw0WBEPEeqFa4pPjnSN4jHhPnQEde79scBOviU0zJ)) break block21;
                    } catch (class_151 class_1513) {
                        throw m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a(class_1513);
                    }
                    jsonObject2.remove("enabled");
                } catch (class_151 class_1514) {
                    throw m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a(class_1514);
                }
            }
            try {
                jsonObject2.remove("key");
                if (!jsonObject2.has("settings")) {
                    continue;
                }
            } catch (class_151 class_1515) {
                throw m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a(class_1515);
            }
            JsonElement jsonElement = jsonObject2.get("settings");
            try {
                if (!jsonElement.isJsonObject()) {
                    continue;
                }
            } catch (class_151 class_1516) {
                throw m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a(class_1516);
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            for (Map.Entry entry : jsonElement.getAsJsonObject().asMap().entrySet()) {
                try {
                    if (bl) {
                        break;
                    }
                } catch (class_151 class_1517) {
                    throw m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a(class_1517);
                }
                try {
                    if (this.m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN((String)entry.getKey(), (JsonElement)entry.getValue(), 370745905)) continue;
                    arrayList.add((String)entry.getKey());
                } catch (class_151 class_1518) {
                    throw m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a(class_1518);
                }
            }
            for (String string2 : arrayList) {
                jsonElement.getAsJsonObject().remove(string2);
            }
        }
    }

    public void m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(JsonObject jsonObject, int n) {
        for (JsonElement jsonElement : jsonObject.asMap().values()) {
            if (!(jsonElement instanceof JsonObject)) continue;
            JsonObject jsonObject2 = (JsonObject)jsonElement;
            jsonObject2.remove("enabled");
            jsonObject2.remove("settings");
        }
    }

    public boolean m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(String string, JsonElement jsonElement, int n) {
        block4: {
            try {
                try {
                    if (!string.equalsIgnoreCase("render") && !string.equalsIgnoreCase("linewidth")) break block4;
                } catch (class_151 class_1512) {
                    throw m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a(class_1512);
                }
                return true;
            } catch (class_151 class_1513) {
                throw m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a(class_1513);
            }
        }
        return jsonElement.isJsonObject();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.e = new Object[45];
                            m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.f = new String[45];
                            m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a();
                            var17 = new String[8];
                            var15_1 = 0;
                            var14_2 =  /* dynamic constant */ (String)m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns("AYc0qze9FciaiQUjyyNE", MethodHandles.lookup(), "m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns", m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.class, 1356094100);
                            var16_3 = var14_2.length();
                            var13_4 = 7;
                            var12_5 = -1;
lbl10:
                            // 2 sources

                            while (true) {
                                v0 = 124;
                                v1 = ++var12_5;
                                v2 = var14_2.substring(v1, v1 + var13_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v4.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                var14_2 =  /* dynamic constant */ (String)m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns("dl2ODIApCbSYAbuJwWNC", MethodHandles.lookup(), "m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns", m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.class, 1786593102);
                                var16_3 = var14_2.length();
                                var13_4 = 8;
                                var12_5 = -1;
lbl25:
                                // 2 sources

                                while (true) {
                                    v0 = 55;
                                    v5 = ++var12_5;
                                    v2 = var14_2.substring(v5, v5 + var13_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl31:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v4.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                break block28;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var18_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl88
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var18_6;
                            while (true) {
                                switch (var18_6 % 7) {
                                    case 0: {
                                        v15 = 122;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 94;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 41;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 13;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 83;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 119;
                                        break;
                                    }
                                    default: {
                                        v15 = 127;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var18_6;
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
                        } while (v10 > var18_6);
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
                    m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.a = var17;
                    m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.b = new String[8];
                    var4_7 = 6431576295339904218L;
                    var10_8 = new long[12];
                    var7_9 = 0;
                    var8_10 =  /* dynamic constant */ (String)m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns("6zUnMMFgaj7XgvYmBsP7", MethodHandles.lookup(), "m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns", m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.class, 1434128683);
                    var9_11 = var8_10.length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns("WoPmJuEPoe7nEXUx2Kn8", MethodHandles.lookup(), "m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns", m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.class, 449494134));
                        v17 = var10_8;
                        v18 = var7_9++;
                        v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                        v20 = -1;
                        break block29;
                        break;
                    }
lbl115:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        var8_10 =  /* dynamic constant */ (String)m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns("p1MsOJJdG73fy99Bhtd4", MethodHandles.lookup(), "m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns", m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.class, 2040953119);
                        var9_11 = var8_10.length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns("jRr5T904qlCsXziStG2t", MethodHandles.lookup(), "m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns", m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.class, 1012585555));
                            v17 = var10_8;
                            v18 = var7_9++;
                            v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                            v20 = 0;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl128:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        break block30;
                        break;
                    }
                }
                v21 = v19 ^ var4_7;
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
            m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.c = var10_8;
            m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.d = new Integer[12];
            m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 666715;
            break block31;
lbl145:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 5246008588264783151L;
        ** while (true)
        var0_15 = 4801836423418171024L ^ var2_14;
        m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_15);
        m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.m$$urlp8zak6sgmAMc2ctdG4dOGVUBLKZb1qa9MIVhqvjZ7Q3xeQUIgIWVAximw2eGIdLS0emhil4NhaPxSYaeaypqZndM8Ic2go = new m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf();
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xFE1;
        if (d[n2] == null) {
            m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "\u0012C@\u0005\u001ds\fKZJzr\u001dPW\u0010\\t";
        objectArray[1] = Boolean.TYPE;
        m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.f[1] = "java/lang/Boolean";
        objectArray[2] = "PI)!Y\u001fNA3n4\u0005VD:#\u0003\u0003UF";
        objectArray[3] = "v\"\u0017E}G}-\u0006\n\u001cIv&\u0002P";
        objectArray[4] = "]+#BU`Q#\"\t\u001chM+ Bx|Q*\u0001\u000eXj]0";
        objectArray[5] = "Wdl;\f\u0015Ilvto\u0001M";
        objectArray[6] = "C\u00055b\n*H\n$-w2[\r-d";
        objectArray[7] = "\u001b\u0000\\L\tn\u0017\b]\u0007@f\u000b\u0000_L$r\u0017\u0001t\u000e\u000bl\u001d\u0001E";
        objectArray[8] = "jgQR-!dn\u0016Z*:)o[\u001b\u001e!rk*y/66z\u0007Y4\fDt*h\fzHf']w?}3IP#*SO;[)}3h-[\b\u0001op\u001dk\u00176]X\u000bZ%\nWwNw<x1X*J>+Cs4}\u00034eV/G\r|IC\u001cM)41K2y\u00159Vv\u001ex\t";
        objectArray[9] = "&Q0if\u00178Y*&\u0007\u00128Y)f)\u000e";
        objectArray[10] = "x\u001e)Qylf\u00163\u001e\u0004|f";
        objectArray[11] = "4\"]`\u00053**G/M30 _hD(p\u0013YdO/=\"_d";
        objectArray[12] = "\u0002\u007fth\u0002\t\fv3`\u0005\u0012Aw~!R/'\u007f2N\f\u0014\u0001]iV\\*,Mnp\u0018#.q/C1PYwlhYU\n->_\b\u0003+S\"L2W\u0006{\u001eT2\u001f?+/Q\u0018\t9\"5=\n2V}\u0014h,T*X\u00025_\u0015\u001f*\r`])'R4S2_\u0018^;7\f\u0005\bm\fu!";
        objectArray[13] = "0\u0018\u007f+\u0013\u0010.\u0010edp\u0004*]L$I\u0017#";
        objectArray[14] = "YcxVySWj?^~H\u001akr\u001fgh@ibm(v\u0007K }b{b> j`XwGn]qW_w?x)o\u007fD\u0010PFDPd\u0013miqcg5Bb\u007fnd\f\byX]kcy\u007fRz~\u0011iuW\rE\u001c^Gfe5;wF]ba\u001fpA^e4d~\"KBO#Bv";
        objectArray[15] = Integer.TYPE;
        m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.f[15] = "java/lang/Integer";
        objectArray[16] = " 9l\u001fV\b>1vP4\u00149,";
        objectArray[17] = "\u001fo&@\u0006]\u0011faH\u0001F\\g,\t\u000ec'xfe\bcFZ=@:\\\u001abQJ\u0018@7xMw&D:3La\u0006eBXzx\u0006\u0001\u0004A>W\tdA@X\u001f-WFY8w't\u001d];h\u0004~'ClJ.s \u007fx\u001b8Z\u001bDy^=}\u00138jY\u0002f\u00172p\\[C\u001a>ye\u0002";
        objectArray[18] = Long.TYPE;
        m$$wTto4V8J3MvFrGV8vQpdCA8fakkqiC9SKBFkVxdbEVyMWacyrCZbZ3idim5BonNxGRek9CJeWZQ3mLVaVgIKQbQ22E2wvIuyf.f[18] = "java/lang/Long";
        objectArray[19] = "?.*sv}`\"%0H,l9L60*k{.0v `E";
        objectArray[20] = ".\u0004q\u001cd'j\u00158\u0006\\>m\u0007;\u000b 8kj%\u00109b*\u0001>Z&_";
        objectArray[21] = "\u000e\u0005>]$3\u000f\b-D\u001f9^\u001b\u0005Ey8R\b\bKz;3[p[\u007ffYXuY{V";
        objectArray[22] = "\t61\"W\u0018Faz6)FU B4X)\u0002$h3\u0017K\u0004bb8)";
        objectArray[23] = "x9t8%\u00057n?,[[$/\u001a*?I$S~;2^w1x}8UI";
        objectArray[24] = "t|E8\u001ex8%P3b8!#G;\u0019Fr\u007f\\h\u001d\u007f(w\n-b";
        objectArray[25] = "\u0011|;h)(B|do\u00149W\u0001yqr\u001fF!o}hX\u0015~3um>\u0015y?g\u0014";
        objectArray[26] = "\u0013\fh`.i\u001bT`.Bu\u0005^hx>s\u00033vc')BXm)8\u0014";
        objectArray[27] = "\u0004sv=\u0011\u0019[\u007fy~/FAUu:SV:!-sL^\\!*\u007f^'";
        objectArray[28] = "`\u000e\u001eN\u00014{D\u0001sZ6\u007f:\u0016\u0003F_=AJ\u0010C9=FF\u0002:";
        objectArray[29] = "Kvug\u0015v\u0011n!4~3\u0019w6VD7\u001dft4Bq\u0017mJoC~\u0017u,oDr\u0005\f";
        objectArray[30] = "\u0012A;\u0004\u0019\u0001ZZd\u000b}]\u000e\u001dv\u0010\fWoa?7\fw^\nZ\t\u0004g\u0019\u0001b\r\u0018G\u0012mO\u0012\u0014A\u001b{i\f:Ifx?\u000fChk[z=<_Oz?+Gh\u0012NY]\u0019TL`\u007fU\u001f\u0006@NkW!ZXX?)-U\u001dNY?9uoXv\u0014\u0006\u0006Dz<=Mg\u0013\u007f4mBB\u001d\u0000oT\u0018ZIS\u0004S\u0016^]\u000f:\f\u001aQ\u001e1";
        objectArray[31] = "\u0010N\u0011z}-JFG?\u0002uV\u001b\r-~sPv\u00136g)\u0011\u001d\b|x\u0014";
        objectArray[32] = "\u0014\u0016<IB G\u0016cN\u007f?DULL=+NOB]\u001d=BU\u0005\r\u000f.K\u0017{V\u0002!U)";
        objectArray[33] = "?+0lLesr%g08na\u0014oL[<~\u007f|\b#xo6f0";
        objectArray[34] = "\u007f<Ij6\u0012dvVWk\u0014k2,mu\u0010qpNk3\u001azN";
        objectArray[35] = "Q b%>g\u000e,mf\u0000>\u0015\u0006`!mYU3m0>;Sug;\u0000c\u0017\"ndbeQ(eZ";
        objectArray[36] = "x~U\u0001`/#sZ\u001f^89KB\u001b^myqE\u001f`! dNc";
        objectArray[37] = "\u0006e\u0014\u0013\u0010\u001c]h\u001b\r.\rQijM\u0010\u001b\\%\u0000N\u0015\u0019X\u0015WN\u0017\u001c\u0001e\u0004NH\u001b<";
        objectArray[38] = "ygvF(hs\"xNR\\#(w]jpP8\u0006\u0011\u00183U>5P4?q2\rb\u0014kh\u0017\u0007\u0016(Ek%\"h5\\Ra\"\u00151=x\u0004|\u0016oFi6;l\u0016n-2*N\u000bPr9\u0018nceS2\u0000\u0010 {\"2\fW\u0000AT5\rO\u0003IN\u000b~K6E@$\u000b^(:pb\u0015,9},09\u0015-{i&GE33y3v\u0014h`tY";
        objectArray[39] = "\rGIP\u001faGU\r\u0012mi\u0010\u0015\u00133$]\u0006CI\u0002.v~}\u001f'W3`xB7!]Zv;\nU\\\rhC\u0016\u001fqNt\u001e[30|tB\u0005'\\Ux+\u0012(mp@I\"Snxs;\u0004\u0012O\u0003\u0007\"Q1l~x\u001fS,L|F\u0011Q\u0013Gc{5Z\u0000A]_\u00153U`sk4kQ2EYB\u0001R7G]rVR5B\u0004\u0002\u0005RjE9\u001b\n\\gV\bJQ\u000fj<\u0000OZ\u000euZ\u0000HV\u001c\f";
        objectArray[40] = "_\u001bg\u0011@7\u0004\u0016h\u000f~3\b\u000e~\r\u0013IYU`\u0013N#ZPb\u0017~tZRgN\u000e'Z\r`s";
        objectArray[41] = "*pL\n@\u001cf)Y\u0001<Op7I\u0015gOjK\f\n\f\\.3H\u001bEF\u0016";
        objectArray[42] = "o\u0014Ep\t\u00074\u0019Jn7\u0019<\u001f;.\t\u00005TQ-\f\u00021d\u0002/\u0006\u001a,\u0002\u0002(\n\bU";
        objectArray[43] = "\u0005t&T,\u0010\u0006q$P\u001c\u0017@76Pg;V,8Nq1P124 D@*o^#AB._\r!KZ39\r&GHJ";
        Object[] objectArray2 = objectArray;
        objectArray[44] = "\u0018\u001dE11\u0005\u0010EM\u007f]\u0011\u001eN?z%\u0011\u0018\u001c]|c\u001b\u0013\"\u0006}l\u001b\u000bD\u0006z`\tr";
    }

    public static String m$$GSXAHSHOm8XVt7ozOKoAv4mmBrukkHifKwcmetpDggI6DSm4rz1R3oEYPylNyfCDdhYYpwF5eiQ4FrBNgoCYjEj3H50y6Hzns(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{17, 58, -98, -121, 69, 29, -104, 53, 24, 82, -61, 74, 97, 6, 63, 43, 115, -56, 48};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 19]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

