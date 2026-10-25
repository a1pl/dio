package me.mioclient;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus;
import net.minecraft.class_151;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt
implements ArgumentType {
    public static final Collection m$$QvRaL3MEcHB7Zw6LGTIHIgvyXHcz8dO9xk0sWjrde2rwFR60mWOLQMrTPpwb4OJmQcdBNqDjLnGqj0kB8VPJVjAK0CML3JdS2;
    public final m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn;

    public m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt(m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus) {
        this.m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn = m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus;
    }

    public static m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt bool(m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus, int n) {
        return new m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt(m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus);
    }

    public static boolean getBool(CommandContext commandContext, String string, int n) {
        return (Boolean)commandContext.getArgument(string, Boolean.class);
    }

    public Boolean parse(StringReader stringReader, int n) {
        String string;
        block14: {
            boolean bl;
            block16: {
                block15: {
                    block13: {
                        block12: {
                            string = stringReader.readString();
                            try {
                                try {
                                    if (!string.equals("0") && !string.equalsIgnoreCase("false")) break block12;
                                } catch (class_151 class_1512) {
                                    throw m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.a(class_1512);
                                }
                                return false;
                            } catch (class_151 class_1513) {
                                throw m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.a(class_1513);
                            }
                        }
                        try {
                            try {
                                if (!string.equals("1") && !string.equalsIgnoreCase("true")) break block13;
                            } catch (class_151 class_1514) {
                                throw m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.a(class_1514);
                            }
                            return true;
                        } catch (class_151 class_1515) {
                            throw m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.a(class_1515);
                        }
                    }
                    try {
                        try {
                            if (!string.equalsIgnoreCase("toggle")) break block14;
                            if (((Boolean)this.m$$ncfJzBb5FwKQXF9ruIpmi5YQdWEwYrGGIFs5b1Uk2rc87vy25xjmtf9Y1cJFeYtczDmHqcjgaDkarNUZF7hjoOx0K02EXh9Pn.getValue()).booleanValue()) break block15;
                        } catch (class_151 class_1516) {
                            throw m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.a(class_1516);
                        }
                        bl = true;
                        break block16;
                    } catch (class_151 class_1517) {
                        throw m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.a(class_1517);
                    }
                }
                bl = false;
            }
            return bl;
        }
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidBool().createWithContext((ImmutableStringReader)stringReader, (Object)string);
    }

    public CompletableFuture listSuggestions(CommandContext commandContext, SuggestionsBuilder suggestionsBuilder) {
        try {
            if ("true".startsWith(suggestionsBuilder.getRemainingLowerCase())) {
                suggestionsBuilder.suggest("true");
            }
        } catch (class_151 class_1512) {
            throw m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.a(class_1512);
        }
        try {
            if ("false".startsWith(suggestionsBuilder.getRemainingLowerCase())) {
                suggestionsBuilder.suggest("false");
            }
        } catch (class_151 class_1513) {
            throw m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.a(class_1513);
        }
        try {
            if ("toggle".startsWith(suggestionsBuilder.getRemainingLowerCase())) {
                suggestionsBuilder.suggest("toggle");
            }
        } catch (class_151 class_1514) {
            throw m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.a(class_1514);
        }
        return suggestionsBuilder.buildFuture();
    }

    public Collection getExamples() {
        return m$$QvRaL3MEcHB7Zw6LGTIHIgvyXHcz8dO9xk0sWjrde2rwFR60mWOLQMrTPpwb4OJmQcdBNqDjLnGqj0kB8VPJVjAK0CML3JdS2;
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
                            m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.e = new Object[36];
                            m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.f = new String[36];
                            m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.a();
                            var17 = new String[6];
                            var15_1 = 0;
                            var14_2 =  /* dynamic constant */ (String)m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2("yYyjwizOc4hVypX5LZzM", MethodHandles.lookup(), "m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2", m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.class, 840782951);
                            var16_3 = var14_2.length();
                            var13_4 = 5;
                            var12_5 = -1;
lbl10:
                            // 2 sources

                            while (true) {
                                v0 = 7;
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
                                var14_2 =  /* dynamic constant */ (String)m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2("KSNXeOLcqMUt6pIVELb9", MethodHandles.lookup(), "m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2", m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.class, 1072756392);
                                var16_3 = var14_2.length();
                                var13_4 = 6;
                                var12_5 = -1;
lbl25:
                                // 2 sources

                                while (true) {
                                    v0 = 91;
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
                                        v15 = 34;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 118;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 51;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 51;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 86;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 31;
                                        break;
                                    }
                                    default: {
                                        v15 = 71;
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
                    m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.a = var17;
                    m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.b = new String[6];
                    var4_7 = 5766455946393918041L;
                    var10_8 = new long[21];
                    var7_9 = 0;
                    var8_10 =  /* dynamic constant */ (String)m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2("Y8C8XLcxbUTFEyLM17dB", MethodHandles.lookup(), "m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2", m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.class, 1925366742);
                    var9_11 = var8_10.length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2("aCdjiKgPDTL9w4g3aGLF", MethodHandles.lookup(), "m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2", m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.class, 648284912));
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
                        var8_10 =  /* dynamic constant */ (String)m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2("viAmRJXcci6NnAmJ3WZv", MethodHandles.lookup(), "m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2", m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.class, 1736975273);
                        var9_11 = var8_10.length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes( /* dynamic constant */ (String)m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2("MijPWExPZRriEWRt1Z45", MethodHandles.lookup(), "m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2", m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.class, 1623879719));
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
            m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.c = var10_8;
            m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.d = new Integer[21];
            m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -518583;
            break block31;
lbl145:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 1208582493465634076L;
        ** while (true)
        var0_15 = 9081908002970970539L ^ var2_14;
        m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_15);
        v22 = new String[(m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.a(29631, 4489159555875775834L) ^ m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) >>> 25 | 0];
        v22[0] = "true";
        v22[1] = "false";
        v22[2] = "toggle";
        m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.m$$QvRaL3MEcHB7Zw6LGTIHIgvyXHcz8dO9xk0sWjrde2rwFR60mWOLQMrTPpwb4OJmQcdBNqDjLnGqj0kB8VPJVjAK0CML3JdS2 = Arrays.asList(v22);
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x56EB;
        if (d[n2] == null) {
            m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "$#1?=[--2v~V5%;p4]\">rb%S )/e9[)b\u000fd7S\"?(x?Z4\u000e)x<P\">";
        objectArray[1] = "r\u001f:\r4\fy\u0010+BI\u0014j\u0017\"\u000b";
        objectArray[2] = "Vl(ANeHd2\u000e\u0003\u007fRn+R\u0012uRypc\u000f}La;T\u0001rPh\u0018U\u0014eNh";
        objectArray[3] = Boolean.TYPE;
        m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.f[3] = "java/lang/Boolean";
        objectArray[4] = "Eg)|\u0004PKnnt\u0003K\u0006o#5\u0004llOP}(\fiJn[Y]|fmU<z\u0018uPt\u0001IY2MA#|Fc}^\u001cLyaK]9~}vk&\u0018Q\u00113ws<i\u001ev@y\u0007RgR\u007fi=[JDI#.wdm]p\u0004iku_R,zx[7^\u001cx\\5F@\u0019";
        objectArray[5] = "b:=c\u0002{k4>*Avs<7,\u000b}d'~\u001e\u001bfh;7\u001f\nue0\"";
        objectArray[6] = Integer.TYPE;
        m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.f[6] = "java/lang/Integer";
        objectArray[7] = "\u001d\u000e\u0000\u000ebK\u0016\u0001\u0011A\u000eH\u0018\u0003\u0013\u000e\"";
        objectArray[8] = "\\\u001a\u0001+~#U\u0014\u0002b=.M\u001c\u000bdw%Z\u0007Bf|\"K\u0010\u0014q=\u000fP\u0018\u0001d}(|\u001a\u0002qv4K";
        objectArray[9] = "rCGEp~yLV\n\u001d~yQB";
        objectArray[10] = ":v\u001avF^1y\u000b9'P:r\u000fc";
        objectArray[11] = "}b\b1,\u0011tl\u000bxo\u001cld\u0002~%\u0017{\u007fKz9\u001d{}\u0011v.\u0010m#!f/\u001fsd\u0006\\.\u0013sl\u000b{\u0004\u0006}h\u0015k(\u0011pY\u001co$";
        objectArray[12] = ";6]\u001b$x28^Rgu*0WT-~=+\u001e|$z--QW%r\u000b-B\\'p\n<QQ,e";
        objectArray[13] = "riG&]!{gDo\u001e,coMiT'tt\u0004mH-tv^a_ b(ig]#phN[I egRMH-tv^a_ ";
        objectArray[14] = "\t\u0012[~$C\u0007\u001b\u001cv#XJ\u001aQ7 K\u000e@\u0019\\\nF\u0006\u0019%x*i)\u0016\u0017R(@,\u0003$[%@*$>~y^&@\u0010c\u001dC\u0003\u001d3u D\u00073&bxh\u000b\u001fCE\u001e\u0015\\3\u001b@uF\u0013#\u0000$+\u001d]F1|\u0004\u0018\u0011A\u0007w%_\u0017\u000f\u0004k\u0019J\u00115;b\u0015U-\u0014\u001cUx";
        objectArray[15] = "q,>'\u0003\nx\"=n@\u0007`*4h\n\fw1}l\u0016\u0006w3'`\u0001\u000bam\u0011|\u0007\tf\n=L\u0016\u0006w3'`\u0001\u000bB1<\u007f\u0007\u0001w1";
        objectArray[16] = "!\u000e0i} ?\u0006*&\u0012'9\u000e?{";
        objectArray[17] = "ux#.Pf\u0000X(!A)aV#*Es\u0015";
        objectArray[18] = "\u0005o(/\u001c\u0003\u001bg2`~\u001f\u001cz";
        objectArray[19] = "\u0000\"9vI\u001f\u000e+~~N\u0004C*3?A!85ySG!Y\u0017\"vu\u001e\u0005/N|W\u0002(5RAi\u0006%~SWI']\u0015eNIC\u001b\f!aF&^\rG)b\u0015Y\u0014'Ah6\u0002\u0010$^K<8\u000es|a1?2g-w\u0018\u0004\tfhr?\fuuoM$\b\u007foj\u0014\u0001\u0005sfSM";
        objectArray[20] = Long.TYPE;
        m$$iSDMWlE3AHiJ4bTdjDQE0wWelvq0JPNCnazOqsQcLLTAUtl7un91pbQV6tGhjmOPxxPdbFN2CHLoZaiVCwXCAEPY0OqGt7AQt.f[20] = "java/lang/Long";
        objectArray[21] = "\tYST\u0014XZHU\u0010l\nY_$R\u0003\u0018QN\u000bTl\\_Y\u000b\u0011\f[YN\u000e(R\u001fP^W\u0017\n\tPEm\u0016\u001d\u0019K\u001a\u0002M\u001cX[#";
        objectArray[22] = "q:\t\u001a T $\u0003d1W=\u0012\u0014\u00017[')\u001f\u000b\u001a]>%\u0003/7A,H@\u000f$\\x(G\t3YA";
        objectArray[23] = "'k)\fZjj|\u007f\u001da:ba*\u001f\f\u000eyp#(\u00067da3\u001faahg<\\\u000b#)asc_ dsz\f\u0004!%cCR\u0007k'}2\u0007\u00113w\f";
        objectArray[24] = "7\u000f\u0014SjKf\u0011\u001e-oXh\u0012\tVh%>\u0016\u001eK-E9\u0010\tN\u0014\u0015u\r\u001aSzDk\u0007d";
        objectArray[25] = "a84\u00005\u0014;-iKU^7/h+)^; kplO  =\u0010kI7%\u0004";
        objectArray[26] = "\u0016V<xr\u0004G\u0006ps\u000b\u0005BX3tL\u0015+\u0006/gsFN\r)}d{\u0016V<xr\u0004G\u0006ps\u000b";
        objectArray[27] = "1\u0011h65\u001dlG$*N\u0017cTn=NTt\u001ee0~\u000eaC.Pr\u0004vHk`v\u00141G\u0015m$\u001dkWj<tQ`.";
        objectArray[28] = "\u0015?;In\u0014\u0011f8\u0011\u000fA\u0004D#\u0003s(\u0015\u007f)G3G\u0011q-\u0000\u000fC\u0006{r\u0012kM\u0005;,x";
        objectArray[29] = "\fGu%j\u001eLEv.T\u0011PCB&0\u0003P?\">(\u0001\u0004Py?i\u0011=";
        objectArray[30] = "\u0001 [qKkSxWqz\\\\5\u0019kBp/%h'03*#[f\u001c?\u000e/cT<k\u0017\ni \u0000E\u00148L^\u001d\\-|L#\u0019=\u0007\u0019\u0012 GF\u0016+UZ>nR/Dx#P\r$vXKe,/n&\b{]/ba(A+(cy+I1\u0016\u0010}\u001eE?9eh\u0000:\u000f\u007f{\u001a\u0016}\u001c~HeFbS{)&\u0011~\u000b:\u0019\"\u00019\u0004D";
        objectArray[31] = "[*\fb7h\n4\u0006\u001c#{\n<\u0010R4z\u0016\"\u0011\u001cp|Z`\u000e .7\u000f |";
        objectArray[32] = "iP\u001bq9)nV\ft\u00002,R\u001bk{\u00161G\u0001\u00179\"*]Xw>$=Xa-a7(\u0006\u0004&g-?;";
        objectArray[33] = ":\r@:l\u001c=X\u000fvP\u001f>\n]f*$5\u001dXo1\t\u0019\u0004VoPZ4\t^0k\u0017#_O\u000b";
        objectArray[34] = "\u000br!4$nZ\"m?]{Q\u007f784whq7(0\u0011\fy--`t\u0007\u007f7:]";
        Object[] objectArray2 = objectArray;
        objectArray[35] = "o\bF9,fh\u000eQ<\u0015k/\u001eU;nG9\u0005[%xM?\u0018Q_,m,\u0005\u0005?+k;\u0000<etx.^Ynrb9c";
    }

    public static String m$$c9M8eiHMrPRFo9Ztv83mikFL0Nar7YnZlWNg9AT2l7jOdVezmf6xWo7N0f9b8y1HoTwQaxNXvXNtQJAcBdNkLm8MgTZcYXhy2(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-84, 32, 96, -86, 12, -71, -112, -66, 66, -40, -70, 116, -57, 38, -42, 66, -116};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 17]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

