package me.mioclient;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.ZipInputStream;
import me.mioclient.m$$CuxPDbeLNAusVP7lqYtDMb84xFpfVpDCqKX0mYwKMg4JWoQwSF3fWsPlLY5qC1a61Q0bLiZTxRe5vHWbKsnSLINXdBbSPlgad;
import me.mioclient.m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5;
import me.mioclient.m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp;
import me.mioclient.m$$tce9mr4ZBZNu84ZSVuZBEmu09wHhWpu2V9T7KiUQZav2ZtQzVs4voEWTI8aJS2Zz4Din4eb06oSumtMDJMFzLqBrjvNiKWJJU;
import me.mioclient.m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud;
import net.minecraft.class_151;
import net.minecraft.class_243;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public static final Logger m$$jpxWNhj5BbytDH7e6t3l7fSXGvEb1oaYWUacR30MzSbNi0ncWNe24lArHg7oRur1ykQkPi3wRUbPAGGFNEdZqQKgHpLMwQb8m;
    public static final String m$$ZkiUAEUQwoGWSfLpQIs0pr7PjotS8Z0b2tSkOEAzcwCLuNfin2fBAAD1y3zQUJOYtPz3DQwg6VLtxsYvHGe1bO3q0Tov45FVc;
    public final Map m$$xLUDIy13fuLF0y948HB9JfVf5io09fxb0I7jaNa7Iy5WhTXAsPDhaJwZxxlAuWpelq9purClay4GVg4vf3HR8hr8FLTZP4uI7;
    public ObjectArrayList m$$CM2rpIzQ0LPW4da2Qg6YJVMQP3QuZXYYIDG94d09Rf8lIKp0KnYFL2MKOz8mS2WdTnnECJGRfUfMwtPfuNL4BDmcnLSMf5xZP;
    public ObjectArrayList m$$R4a8XbX1pkR0UEkxhlG5CyEaw7vVExYKq84zbuHfTPqxqSFUYfs8HAj6NdB3gXMR9r3M5xV0gmOfDgx3BXamJqIK6IJW4fbHp;
    public ObjectArrayList m$$tI5q1OAgFzdWg4WL0QCRCxF0iGbNqWTpLkZYJRqIj2jgJUQ2g2kvyJl9JVuZf3ed944tprPJsPWgG7vzEFNtJhrjErmnrGQyQ;
    public ObjectArrayList m$$Oq4dKtpXgvToJzi6EEOHYECtSOzLbxr0fsjOB3R4luJnOi08M3N4QzfU3S0ZZEGmBQYM1dziaR5vSTKcSUMwqK35SEH0fFhEA;
    public ObjectArrayList m$$HrKB5coLo3L1YjxNXf4OqTJBYfRsIxVoyPS0zXN8YOLRJqNTli53rpulYT4ifstnZYFzmm053TBYBONFEEZyuPaW2Obbd2KCx;
    public ObjectArrayList m$$EJxWyyf3vLfZaKaNzOhpPMCunBS4MSMRFqNpZhynun5EvY51n4sDwVJyop0GCY6pWqcCiJKE3gcbCv5PrYTNrLxHhteWZPgJx;
    public ObjectArrayList m$$2wZDWnm1TYZ5uUsiU4rfVCfBEnrJxhd8aKVphBl3tICdQQuOwBt5l8epefOB0dH1pTXJNObdHgIVbKMsGI4rK2fbX8FhlBp0m;

    /*
     * Unable to fully structure code
     */
    public m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi() {
        block21: {
            super();
            this.m$$xLUDIy13fuLF0y948HB9JfVf5io09fxb0I7jaNa7Iy5WhTXAsPDhaJwZxxlAuWpelq9purClay4GVg4vf3HR8hr8FLTZP4uI7 = Collections.synchronizedMap(new HashMap<K, V>());
            this.m$$CM2rpIzQ0LPW4da2Qg6YJVMQP3QuZXYYIDG94d09Rf8lIKp0KnYFL2MKOz8mS2WdTnnECJGRfUfMwtPfuNL4BDmcnLSMf5xZP = new ObjectArrayList();
            this.m$$R4a8XbX1pkR0UEkxhlG5CyEaw7vVExYKq84zbuHfTPqxqSFUYfs8HAj6NdB3gXMR9r3M5xV0gmOfDgx3BXamJqIK6IJW4fbHp = new ObjectArrayList();
            this.m$$tI5q1OAgFzdWg4WL0QCRCxF0iGbNqWTpLkZYJRqIj2jgJUQ2g2kvyJl9JVuZf3ed944tprPJsPWgG7vzEFNtJhrjErmnrGQyQ = new ObjectArrayList();
            this.m$$Oq4dKtpXgvToJzi6EEOHYECtSOzLbxr0fsjOB3R4luJnOi08M3N4QzfU3S0ZZEGmBQYM1dziaR5vSTKcSUMwqK35SEH0fFhEA = new ObjectArrayList();
            this.m$$HrKB5coLo3L1YjxNXf4OqTJBYfRsIxVoyPS0zXN8YOLRJqNTli53rpulYT4ifstnZYFzmm053TBYBONFEEZyuPaW2Obbd2KCx = new ObjectArrayList();
            this.m$$EJxWyyf3vLfZaKaNzOhpPMCunBS4MSMRFqNpZhynun5EvY51n4sDwVJyop0GCY6pWqcCiJKE3gcbCv5PrYTNrLxHhteWZPgJx = new ObjectArrayList();
            this.m$$2wZDWnm1TYZ5uUsiU4rfVCfBEnrJxhd8aKVphBl3tICdQQuOwBt5l8epefOB0dH1pTXJNObdHgIVbKMsGI4rK2fbX8FhlBp0m = new ObjectArrayList();
            try {
                block22: {
                    block25: {
                        block24: {
                            var1_1 = m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud.m$$5hm9lO0iomCmizfHA8tCspx55QGaEJZaaBe1msvtkQckJCXQq78cVi0QvlWnmAMJnjl96en6XTgFNSDsabjF8aiRNHONXeeKN.resolve("killstreaks");
                            var2_3 = var1_1.toFile();
                            if (!var2_3.exists()) ** GOTO lbl20
                            if (var2_3.isDirectory()) break block21;
                            break block24;
                            catch (Exception v0) {
                                throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(v0);
                            }
                        }
                        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$jpxWNhj5BbytDH7e6t3l7fSXGvEb1oaYWUacR30MzSbNi0ncWNe24lArHg7oRur1ykQkPi3wRUbPAGGFNEdZqQKgHpLMwQb8m.info("Downloading killstreak sounds");
                        if (!var2_3.exists()) break block22;
                        break block25;
                        catch (Exception v1) {
                            throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(v1);
                        }
                    }
                    try {
                        block26: {
                            if (var2_3.delete()) break block22;
                            break block26;
                            catch (Exception v2) {
                                throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(v2);
                            }
                        }
                        throw new RuntimeException("Failed to delete invalid killstreaks file");
                    } catch (Exception v3) {
                        throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(v3);
                    }
                }
                try {
                    if (!var2_3.mkdirs()) {
                        throw new RuntimeException("Failed to create the killstreaks folder");
                    }
                } catch (Exception v4) {
                    throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(v4);
                }
                var3_4 = m$$CuxPDbeLNAusVP7lqYtDMb84xFpfVpDCqKX0mYwKMg4JWoQwSF3fWsPlLY5qC1a61Q0bLiZTxRe5vHWbKsnSLINXdBbSPlgad.m$$jEo7K9BsAz36gRbxJ6i1mDmSkJa8BzwTX7caII2qnw8vgoIevYisYjRmYdCkqs7lYHj7adVuoywOKqgS57Ow328sALR2lbOJQ("https://mioclient.me/assets/killstreaks.zip", -1486180170).header("User-Agent", "MioClient/2.0").timeout(Duration.ofSeconds(5L)).build();
                var4_5 = m$$CuxPDbeLNAusVP7lqYtDMb84xFpfVpDCqKX0mYwKMg4JWoQwSF3fWsPlLY5qC1a61Q0bLiZTxRe5vHWbKsnSLINXdBbSPlgad.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(var3_4, HttpResponse.BodyHandlers.ofByteArray());
                try {
                    if (var4_5.statusCode() != 200) {
                        throw new RuntimeException("Got invalid response code while downloading killstreak sounds (%d)".formatted(new Object[]{var4_5.statusCode()}));
                    }
                } catch (Exception v5) {
                    throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(v5);
                }
                var5_6 = (byte[])var4_5.body();
                var6_7 = new ZipInputStream(new ByteArrayInputStream(var5_6));
                while (true) {
                    block23: {
                        var7_8 = var6_7.getNextEntry();
                        if (var7_8 == null) break;
                        try {
                            block27: {
                                if (!var7_8.isDirectory()) break block23;
                                break block27;
                                catch (Exception v6) {
                                    throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(v6);
                                }
                            }
                            var1_1.resolve(var7_8.getName()).toFile().mkdirs();
                            continue;
                        } catch (Exception v7) {
                            throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(v7);
                        }
                    }
                    m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(var1_1.resolve(var7_8.getName()), var6_7.readAllBytes());
                }
                m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$jpxWNhj5BbytDH7e6t3l7fSXGvEb1oaYWUacR30MzSbNi0ncWNe24lArHg7oRur1ykQkPi3wRUbPAGGFNEdZqQKgHpLMwQb8m.info("Finished downloading killstreak sounds");
            } catch (Exception var1_2) {
                m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$jpxWNhj5BbytDH7e6t3l7fSXGvEb1oaYWUacR30MzSbNi0ncWNe24lArHg7oRur1ykQkPi3wRUbPAGGFNEdZqQKgHpLMwQb8m.error("Failed to download killstreak sounds");
                var1_2.printStackTrace();
            }
        }
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
                                m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.i = new Object[120];
                                m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.j = new String[120];
                                m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a();
                                var21 = new String[30];
                                var19_1 = 0;
                                var18_2 =  /* dynamic constant */ (String)m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA("lDy07N6FbRKKLUEFymPJ", MethodHandles.lookup(), "m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA", m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.class, 212870114);
                                var20_3 = var18_2.length();
                                var17_4 = 36;
                                var16_5 = -1;
lbl10:
                                // 2 sources

                                while (true) {
                                    v0 = 72;
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
                                    var18_2 =  /* dynamic constant */ (String)m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA("A7vQAodOwJUNUahXbMG1", MethodHandles.lookup(), "m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA", m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.class, 1322919560);
                                    var20_3 = var18_2.length();
                                    var17_4 = 13;
                                    var16_5 = -1;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        v0 = 36;
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
                                            v15 = 28;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 83;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 127;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 64;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 23;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 40;
                                            break;
                                        }
                                        default: {
                                            v15 = 57;
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
                        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.c = var21;
                        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.d = new String[30];
                        var8_7 = 1089368748271168359L;
                        var14_8 = new long[63];
                        var11_9 = 0;
                        var12_10 =  /* dynamic constant */ (String)m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA("pd2I1RhQ5f2o0Bz7BzCm", MethodHandles.lookup(), "m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA", m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.class, 42500882);
                        var13_11 = var12_10.length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA("hKjoDmv3iWKGbOAngfQP", MethodHandles.lookup(), "m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA", m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.class, 1635408268));
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
                            var12_10 =  /* dynamic constant */ (String)m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA("FpbFgtK0jsEU8tJFKhMJ", MethodHandles.lookup(), "m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA", m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.class, 2042543064);
                            var13_11 = var12_10.length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes( /* dynamic constant */ (String)m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA("DYNTzJskMxBjAeT5bays", MethodHandles.lookup(), "m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA", m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.class, 1138107537));
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
                m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.e = var14_8;
                m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.f = new Integer[63];
                m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -220799;
                var0_14 = 8628837734807501995L;
                var6_15 = new long[11];
                var3_16 = 0;
                var4_17 =  /* dynamic constant */ (String)m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA("urFVlopKhtyJq1ZrkGE3", MethodHandles.lookup(), "m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA", m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.class, 635102651);
                var5_18 = var4_17.length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA("f5gre7u6pFAnPkzAC3UK", MethodHandles.lookup(), "m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA", m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.class, 541632446));
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
                    var4_17 =  /* dynamic constant */ (String)m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA("2ZDBDzf1ziYh0ghQjaJA", MethodHandles.lookup(), "m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA", m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.class, 1221515927);
                    var5_18 = var4_17.length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes( /* dynamic constant */ (String)m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA("fMteYN8j13GyAtorIpEW", MethodHandles.lookup(), "m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA", m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.class, 9442985));
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
        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.g = var6_15;
        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.h = new Long[11];
        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)9010825713579736615L);
        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$ZkiUAEUQwoGWSfLpQIs0pr7PjotS8Z0b2tSkOEAzcwCLuNfin2fBAAD1y3zQUJOYtPz3DQwg6VLtxsYvHGe1bO3q0Tov45FVc = "https://mioclient.me/assets/killstreaks.zip";
        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.m$$jpxWNhj5BbytDH7e6t3l7fSXGvEb1oaYWUacR30MzSbNi0ncWNe24lArHg7oRur1ykQkPi3wRUbPAGGFNEdZqQKgHpLMwQb8m = LogManager.getLogger((String)"Mio Sound System");
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x2302) & Short.MAX_VALUE;
        if (h[n2] == null) {
            m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.h[n2] = g[n2] ^ l;
        }
        return h[n2];
    }

    public static void a() {
        Object[] objectArray = i;
        i[0] = "'D1]\u0013C)MvU\u0014XdL;\u0014\u0018v\u0007EoJK\u001c{br\u00014A-f]I\u0016{,\u0019pS\u0015X\u001eITc N:{Q{\u000b\u0015 EK\t0c~Dpf\b}.\u0013+z>F\u000bx+RJ\u001b\u001c`Gv\u000f[}Jy\u0006/V&ys\u0005\tv}YXAM\u001fxVFV\rX>n/x\u0013";
        objectArray[1] = "l>\u001d\b:7b7Z\u0000=,/6\u0017A:\u001bE\u001dV62\u001ck\u001f\u0002R1\nFnw2\u0018\n8?Z\u0015`\rY\u000e`\u000b$2x\u0016\u007f\u0003\u00159ucYW)6Fcq\u001c\u0011\"TcT\u0013\"\u001atj~\u0015e6b\u001dTP\u00193B<w)5nP,vW\u0000iO)\\\u0001\u0003(S,Z\u0015\u000b-L2x$#";
        objectArray[2] = "'Nnhhl)G)`owdFd!HD~@+nI2&\u001eqbk10L+}wi\u0002\\\b@id;@u=b7/m90lD&q\nvNexl\u0018V62%y\u0019pB4\u0013]vqvdxR6Vg0\u001b}\u0004okj\u0005h+lSg>c#]IW.H-2nV>x\u0002u4";
        objectArray[3] = Float.TYPE;
        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.j[3] = "java/lang/Float";
        objectArray[4] = Void.TYPE;
        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.j[4] = "java/lang/Void";
        objectArray[5] = "32\u0011LbD32\u0006\u0010nK)y\u0006\u000en^.\bWV<";
        objectArray[6] = ">\u0016{_t@ \u001ea\u0010\tP ";
        objectArray[7] = "n3V'gSp;Lh:Rv7A+gup E'$";
        objectArray[8] = "Ru-ORzL}7\u0000\u001azVw/G\u0013a\u0016D)K\u0018f[u/K";
        objectArray[9] = "i\ru.BGw\u0005oa#Bw\u0005l!\r^";
        objectArray[10] = "W=Kr~q\\2Z=\u001f\u007fW9^g";
        objectArray[11] = "5;*\u001f\t(+30PA(19(\u0017H3q\u001c)\u0010D)652";
        objectArray[12] = "\ndP\u0013\u0019\u0016\u0014lJ\\z\u0002\u0010";
        objectArray[13] = "[\f3p4;P\u0003\"?I#C\u0004+v";
        objectArray[14] = "zd2@\u001fn\u000fD9O\u000e!nJ2D\n{\u001a";
        objectArray[15] = "\u0017kd\u000b\u0005q\u0012$T\u0003G}";
        objectArray[16] = Boolean.TYPE;
        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.j[16] = "java/lang/Boolean";
        objectArray[17] = "hvd;aQf\u007f#3fJ+~nrYiH&/\u00108u=*\u001a\f^wQp)\u001dy\nG%| X\fJ*\u0007&|ort\"bGk3!\u0018\u0003b\b\\&s#K\rBT?aJps])\u0007x\rp+s\u00058wGfz\u0010BQ\u007fZ&;<Ntt>\u0014\\hcR\u0001\u0010fjb&'8N";
        objectArray[18] = "\u0004\b_&!e\u0007\u0006\u0007!fg\u000bGy&{c";
        objectArray[19] = "OE";
        objectArray[20] = "\u0019qt)\u0014(\u0017`{b[4\u0019dtn\u001b?Xo|`A2XO|`\u0012=\u0004";
        objectArray[21] = "Ct\u0018H;S6Q\u001d\u0007\u000b[t]I";
        objectArray[22] = "\u0017ql\u0003\u0017O\u0013ll\u0012\nOPc#\u0005\rS\nl.X\u0016D\u0014`!\u0002\n\b1g(\u0013\u001aR?w0\u0017\u0000j\u0017v6";
        objectArray[23] = ",?\\,;\u000327FcZ\u0014,;I9f";
        objectArray[24] = "\\Y";
        objectArray[25] = "?\u0013\u0007&8!0\u0006_/b;%\\93b?\u0007\u0017\u00027y!&\u0017";
        objectArray[26] = Integer.TYPE;
        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.j[26] = "java/lang/Integer";
        objectArray[27] = "\u0019Zri\"#\u0012Uc&E!\u0007^cm~";
        objectArray[28] = "eF7ib2{N-&6.\u007f\t\u001ba<\u000eaW4|\u001f3}B e";
        objectArray[29] = "\\\u0012p\u0007wCB\u001ajH#_F]\\\u000f)sX\u0007t\u001f";
        objectArray[30] = "\u0000z\u0011\u0014\u000bY\u000foI\u001dQC\u001a5/\u0001QG8~\u0016\u0000@D\u001e?%\u0000L[\u000e~\u0015";
        objectArray[31] = " >b}+@#2q2AA8>`ujZ";
        objectArray[32] = "\u001a\u001f\u00118ZR\u0015\nI1\u0000H\u0000P/-\u0000L\"\u001b\u0016,\u0011O\u0004";
        objectArray[33] = "\u0014\u001e\rS5W\n\u0016\u0017\u001cXM\u0012\u0013\u001eQoK\u0011\u0011\b";
        objectArray[34] = "\u0007^";
        objectArray[35] = "5.c\u0006h/:;;\u000f25/a]\u001321\r*f\u0017)/,*1%)%&\u0007t\t\"-:=f";
        objectArray[36] = "Q\b2\u001b\u00161^\u001dj\u0012L+KG\f\u000eL/i\f7\nW1H\f`8W;B!%\u0014\\3^\u001b";
        objectArray[37] = Long.TYPE;
        m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.j[37] = "java/lang/Long";
        objectArray[38] = ";5])%\n5<\u001a!\"\u0011x=W`\u000f\u0010.\u00007&))\u0018\u0011\u00067\u001a5a<\u0002\u001d8!\u001b2Kp4#&6%4\b&'\u001b+t!<!\u001b>#x/\u0001?\"3\u001f#e6$7\u001c\t\u001a\tF5\u000fT7fB\u0015|\u0007\u001a9)\u0010473e\u0005\f\u001b\u0007\u001d#\u001d\u0017\u0000,\u0018\b\u0017\u0006.6\u0006<\u0014%(";
        objectArray[39] = "\u001eP.gw\u0004\u0015_?(\u001c\u0010\u0017T(r0\u0007\u001a";
        objectArray[40] = "\u0015\u0011/\f{~\u001b\u0018h\u0004|eV\u0019%Efr\u001dMl\u0013&K:.O\u0014*%\"'W\u0014HS=\u0019tQ+f0\u001cV\u0011g#.MUVYx-%[\u0000d#\"\u0000P\u001bDbL\u0002n$EE1L`+A#\"\u000e5%{\u007fL\u0011cQ$~+\u0001l\u0015_U29G\u001b^`:\u0006k\u0017\\x3#K+G";
        objectArray[41] = "B\u0013,\"}\u0004p0\"+:\fw+o*wMm<$~>\u001b-\u0005\u0003\u001d\u001d\u001c!k\u001b\u0014\u0005\u001cC\u001d\u0004*&Y (\t/\u0004\u0019lm\u0017~\u0007^R6\u0014\u0016\t\bom\u001b3\u0002\u0013O,u1<,N\u000b\b\u007f2#Jm\u001b=g-p1u\"1Y/0\u00122>\u001dT\u001b\u000b\n\u0015\u0013U.\u000359\u001fW6\n\u0010\u0019#Ld";
        objectArray[42] = "U&\u007ft\r\u0007Pi@{S\u001bK\u0014}gF\u000fR";
        objectArray[43] = "e\\";
        objectArray[44] = "zNi(DFqAxg)Fq\\l";
        objectArray[45] = "-%u]G_3-o\u0012\nE)'vN\u001bO)0-h\u0001X\"%gp\u0006I&(Q]\u0007N()";
        objectArray[46] = "s:e5\u0011(m2\u007fzr<i\u007fV:K/`";
        objectArray[47] = "koQ}+\u0019e~^6d\u0005kzQ:$\u000e*qY4~\u0003*QY4\u0007\bj|Q68";
        objectArray[48] = ".AZ\u0016NL H\u001d\u001eIWmIP_Fr\u0016V\u001a3@rwtA\u0016rM+L-\u001cPQ\u0006V1!nU\u000b\u001d07Ntsv\u0006.N\u00105oB\u0001Aupn$IeFwwD!oe,sG>Lo\u0016m\u0010\u001cfb\u0011Q\u0004MpK*j\u0005\bul\"\u0016\u0016\u000fJw&\u001c\f\n\u0013R+\u0010\u00053J";
        objectArray[49] = "\\U>KS\u0002WZ/\u0004>\u0006WF\u001bO\f\u001bSZ+O";
        objectArray[50] = "O\u0002\u000e&\\\u0016D\u0019\u001f<,\u0017L\u0018a,\u001d\u0014^\u001f]*\u001d\u0012Pd^s\u0014\u0000Y\u001e\u0000 JD!";
        objectArray[51] = "z$>\u0001+/gh%Y\u0012:y\"<\u000bt-\u0004&:\u001euhz;v\u0005-Q";
        objectArray[52] = "],\u00041\u0018}A4WfgxW<_XV\"\n2\u00003\u0007k\u000e#8c\u000bvTi\u0004gZh\\R";
        objectArray[53] = "\u0005-Iry*\u0005sL6\u0017>\u0014*F@s 32VdlD\u0004*M1k'\u0005(U`\u0017";
        objectArray[54] = "vwV\u0016\u0004P8'\u0013\baO62\u0001\u0005\u00044ww\u0002\u0002P\u0005)(P\u0011a";
        objectArray[55] = ";\u001f\u0003?V``\u000f\u00079:y'\u0014\u0016-AI<\u0011\u0007P[37\u0002\u0011l]31\fj";
        objectArray[56] = "\u0015\u000eRQB+@ND_\"4\u0000\u0019y{L2MlqnN1G\u000bR\u001e`\f\u0010XgB{\u0001\\SlDh2WqYh\u001fn\u0015jf\u001fA1}xV\u001fL\u0016Rh\n\u0011\u001fk\u0017\r}][n\u0017L\u000ffH,TLFzXiI\n\u0007CA\u0000Cq\u000f~K\u0000\u001c\t[\u001em3wT\fEB7l\bs!C`@JM\u001dE`FD6\u0010\u0019jL\r]APn]5";
        objectArray[57] = "Tt\u0012{a6\n+@hPi\b/\u0000x*\u0007T5B)\"}\rtMiP:V%\u0012$ad\tw\u0001\u0015";
        objectArray[58] = "(\u000e\r\u007f\u001a?,\n_-d\" \u0017L^\u0005\",\u00170~_(&\u0002J/T6yl";
        objectArray[59] = "L\fUo'T\u000fQ^e\u001e\u0016Q2Ly\u007f\fYi\u00018%\n\u000e\u0002Pq!\u001b6";
        objectArray[60] = "q\u0006f\u000f+3d\u0014m4''1\u000e\\s {X\u0001n\u000b05m\u0018[U\u0012q-<Th\u0012KM\u0015zJ={|!(D'{,#Kk\"Jw;xt ws']\b&Nv\f*{>;dFxJ\u0000GC\u0001/]%OYAWY!ym:hW\"Qg0Wf\u0001sT\u0004M{\u0002LF2\u0016\u0005y0}F}T04l~w\u0005.tfBq\u0005(z\u001dEz['0!A+E/\u000b";
        objectArray[61] = "%\u0016\u001f9\fe\"@\u001fk737P$9F\\e\u0012_,O&;A\u0001h7";
        objectArray[62] = "xU_t8?#E[rT7\u007f[G\u001bkc ONa50~\u000b6";
        objectArray[63] = "JX>5XRNCbn*PHEzmPGc[aJWNA<82\u0012R]FfaL\u0016%\u000394RR_]jj\u0016*";
        objectArray[64] = "'\u0000;@};#\u0004i\u0012\u0003'-\u000egU\u0003(s_a\u001fl=!\u0013e/";
        objectArray[65] = "w4KAU|h|P\u0019*lxrGRQ{_}VEQ\u0016t=FWQ*r=@Y*w$`US\u0016q$f[(";
        objectArray[66] = "\u000f}uPl\u0007\u00121n\bU\u001f\u001cqqv3\u0005q`<[*\u0002Mf<]$y\u00100aH.E\u00160gFU";
        objectArray[67] = ",\u001cRkd5:\nS\u007f\u0003!5\u0013Pk\u0003.&\f_fn7'\u0017Y\u0007";
        objectArray[68] = "\u001e_\u0017~'HC\u0000\u001a}\u001a\f\t\u0005\u001a%`\u0010\u001e\u0002\u0003(v2\u0011\u001bqu|\u0019\u0019\n\b%xLIcA#t\u0016\u0011\u001a\u0011'!Fx";
        objectArray[69] = "'W\u000b#OC;OXt0X\"SQJ\u0001\u001cpI\u000f!PUtX7q\\H.\u0012\u000bu\rV&)";
        objectArray[70] = "Q@\u0003\bJ\u0014DR\b3F\u0000\u0011J\u000eBLam\u0003)BlP\u0006f\u0017J|\u0017\r^\u0013V\\\u001cas\fZZ\u0015wU\u0012tRht\u0003\u0011\rseWF#rDAv\u00035\ts\u001cBeCWOBlCKQ\u001dNBWIoAVT\u00037cN\u0013Be!wnaTJ\nH\u001dJv\u0000#\u0003|\u001ds\bs\n\u0018HMX\t_X^C8JR\u001bF]\bLB\u001fV=";
        objectArray[71] = "{'`P\\Mii|D#LfeZRLLfc\u001e\u0004\u0018\u0018k!uUQ\u001cz\u0019rK\u001fJt}nSL\u001d\u000b";
        objectArray[72] = "FX\u0004sjM\u0018\u0007V`[\u0019\u0012\u001fj-c\u001f\u001a\u0002Ra5M\u001dgW\"5\u0012JV\t}g\u0001{";
        objectArray[73] = "oYOJ\u0001Kr^@\u0000yWw~N\u0001\u0014]pUU\ny\\1\u000fHK\u0016IcCL{";
        objectArray[74] = "\\\u0019\u001d7G8\f\u001dHg.,\n\u0003\t'u,\u0010\u007fOi\u0014;\t\u001b\u00019Q%l";
        objectArray[75] = "Qo\u0015\nb8\u000ep\r\t\u001en[F\u0018\u001cyoYfu\u000e.i\t|\u000e\u0013 iL\u001d\u0011\u0005~tI,N\u001afw5";
        objectArray[76] = "OdH\u0005TPLk^\u001e1G\u001a+C\u0004@M{W\n#@mJ<o\u001dH}\r7W\u0019T]\u0006[z\u0006X[\u000fM\\\u0018vSrN\n\u001b\u000fr\u007fmO)pE[L\n?\u000br\u0006xlIUNXVJAS\u001cTx^Cm@Ln\n=aO\txl+uo{nC\u0000J\u001cPL\t)\u0001}\u0007I\u0001yTLHlP\u0014MMSj1\u0001QBL6[\bK[[\u0007Q\u001bXMZe\n\u000b\\K6";
        objectArray[77] = "LF9vAs\u001d\u000f=gyb\u0010\u0005f\u007f\u0012u}\f8}G%DFpw\u0016\u0018\fGi(D!F\u000fcyy)FFb.\u0012x\u000fBs\u0016";
        objectArray[78] = "\u0006~b/\u0007\u001bW7f>?\u001dN80+D1X#>5R;^>4O\u000eK\f%a$_\u0002\b4Y%\u0002MPu60P\u0001TE";
        objectArray[79] = "f\f,\u0004|e6\byT\u0015d+\u0016BZ+$.\u00128\u0004xzjj}[-d.\u0010#\bs VU|]md,\u000b/\u0003)\u001c";
        objectArray[80] = "z\u00193TW:y\u0016%O2-/V(eUw@K\u0000S{:8D%rX8AD+\u0011W\u0004f!)j[xI\b5tbwh\u0013\u000bi\b1e\u0005zV]/B\u00174yS3R\u0018\u0010Mc$H\u00193S\r,R:(\u0017[$]\u0007-YM\u000f@\u0003%s\u000fwD\u0005q\u0012\u00023J>\u0010\u0012V\"D8\u0013(\u0003s8\u001arCR:<\u000bJI\u0003$|\u0001vO\u0003\"rz.FT$d\u00048PU0\u0003";
        objectArray[81] = "P=\u001a<'yE/\u0011\u0007+m\u0010+\u0014u<\u0001m\u0019\b|\r\u001ev\t/8q=\r/Q6v}U&$I\"3\u007f~\u000e]7(E!\u0016?\u0002\u0005g<\u001aZ\u001e~X\u001a\u0005v~ Zt\u0014`.\u001d\u00077!Y\u000b\u000fa7\u0013h\u0005\u0003|,\u0003I19E\u0018\u0011_\u0007\u001cM\u00061Y#<`'\u0003@\u001f/mzj6uz\\}\u0001g<~ME\u000b6\">Gy\r6$0<+\fh%1R \u0017y?A";
        objectArray[82] = "=+?/iw6,m)Sq{y/3\"{\u001a\u0005f\u0014\"[+n\u0003**Kle;.6kg\t\u00161:mn\u001f0/\u0014e\u0013\u001cf,mD\u001e?#\u001e\u0012s:\u001ef\biDg*\u0000~7x9\u0004&v1*5*2t\u000fv-<f\n\u0003yh*\u0000\u001c\u0017Y\u001a</7(*1\u001ee\u001ecKf\u001bmN?.+0=10qn-]3:so)>28k>Uf\"<qlibs\"yW";
        objectArray[83] = "7;\u0011AC\u00118dT\\#\u0012<O\f@Nn2cPK]\u00176g\u0002\u0019#";
        objectArray[84] = ",\u0002u`\u001eO#]0}~J-Cna\u0000]@\t2>\u001e\b+X{:\u000f0,\u0002u`\u001eO#]0}~";
        objectArray[85] = "\u0015\u0004\u001b\u00067o\u0011\u0000ITIy\u0011\u001a`\u0000,{|W\u001dR).\u0017\u0006TV8\u0016";
        objectArray[86] = "\u000346\u001d%P@i=\u0017\u001c\u0001\u0014-\u0016\u001cg\u0015\u0010>>q-UB1k\u001a|\u001cF S";
        objectArray[87] = "0s*^z\u0010/;1\u0006\u0005\u0004;/6ZB\u0014R*z[z\u0001n,z]tz0s*^z\u0010/;1\u0006\u0005";
        objectArray[88] = "xy\u001d,Ycq.\u0000{a5v=$/\u0011&V'\u001e8\u0010Zx*\u0002s\u0019'e-\r9a";
        objectArray[89] = " v0\u001f=?+m!\u0005M05]:\f1 NzbI*a!o0\u0005.Q";
        objectArray[90] = "U&4+O(U|7<4!E>\r O)U8< }5s>- ]+(slvTvC\"%rENT,46Z Tr1r4";
        objectArray[91] = "v-YEOk&)\f\u0015&y\"&^^&)*$R\u001f\u001a-{:Z$";
        objectArray[92] = "\u001f\\]G\fu\u0003D\u000e\u0010s|\tX\u0006Ts H\u0019\u0001\u0016\u0018q\u0001\u001d\u0010.H}\u001cGZ\u0012L,\u0002Oa";
        objectArray[93] = "5\u0004\u000b|A\\1\u0000Y.?H,\u0007MoD%6[\u000bt\u000fJ#\tGp?";
        objectArray[94] = ")\"\u0006\u001d_d<0\r&Spi\u001b\u0018h_7\u0014\"<JO\u001b\u001ef\u001aDS0)#\u000b@h7\u00029\u0010[M\f*\u00130cN9,jK\u001cle:&\u0006]W!?\u0003=~\u0007\u0003\u0007\u00178eZ:\u000b\u0004\rtll\u0003(\u001dCm2\u001a\u0002\u001bvU\u0016\u0007f0{i9;aO\\\u00069\u0018\u0005GMn\u0007\u0001jvG\u00070:!JA\u000764ZMJY9~fI\u001bG1E";
        objectArray[95] = "D\u001cz\u0003?;B\f~\u0013_nQQ0\u0014.d0-y3.D\u0001F\u001c\r&TFM$\t:tM!\t\u00166rD7/\b\u0018z94y\u000ba[4\u0017<9\u001el\u00106y/e[M\u0002\u001fY;g\u0013,9Q=5\u001f\u0002-S\u0003i\u0007\u0014y-\u000ffB\u0002\u001f;\u001bF0\u00140\u0010$5\u001b6z9oTL3ric1\u0010\u0005~\u000fbzC\u0016BS`:\u001dF&\u0014/d\u0014}y\u00050nFA}T.f}";
        objectArray[96] = "P%qwnPF3pc\tRU.z|tR4/e{tR\u0005pzcw.P%qwnPF3pc\t";
        objectArray[97] = "{eb/p(msc;\u00176rbh.mV.0?#/=\u007fy;2\u0017g$0d{|6m4uCs8ygc=e.xs\u0004";
        objectArray[98] = "\u0002Z`q~\u0016\u0000E9oA\rT\u0004xj=!%m>G$##\u0012Ho\u0019\u0013Aahz\r\u0014'Jpn1/!U1D-\u000f(ZSh-P&I\\Z+\u0001\u0016I],\u001f\u0012?fn-\u0000\u0004CT=s12Ct8r#'\u0007lGtyXBUEW\u0005\u000eIf?Rx\u0014!rnU&V\nOn\u0015xS\u001cXao-\u0013\nV\u0001";
        objectArray[99] = "2\u0019\b\u0011\u0013v6\u001dZCmc6\u001fX\u0002\u0000\u000f1F\b\u0019]`$\u0014D\u001dm";
        objectArray[100] = "85GK>)>%C[^|-x\u001ajou`&\u0010yd`g\u000e\r]n^y6\u0011`\u0013Y`k\"{efo\u001eGH\u001fhh\u0018\u001b~ y`d\u0011Y/ co\u001chcYZ\u000e&`\u0014TF\u001e\u0012K1AG;;{ f\u007fj\u0011\u007f\u0001Yx\u0015\u001af$FN>:\u0018'PS\u001b\u0006F3^k1=!d&04DE#in=\u007f\u001a2vdoC\u001echlT";
        objectArray[101] = "I%\n\u0012b#M!X@\u001c&G\u001f^\u0001|ZL}K\u0018|%C\"\u000e\u0005\u001c";
        objectArray[102] = "AD\u001a-\u0017D\u0010\r\u001e</A\u0017\u0005D$SS\u001d\u0013!$F\u0013O@\u001c/PQN\u007f\u0010v\u0014OH\u0014A?\u0010^p";
        objectArray[103] = "D\u000b<\u001e\u001bm\u0011K*\u0010{x\u0010L\u001e\u0007\u001ez}Qi\u0002\u0004lAWi\u0004\n\u0017L\u000bc\u000eC|\u001dBg\u001f{";
        objectArray[104] = "1pYUqC5t\u000b\u0007\u000f[#^\u0005@bQ$u\u001eK\u000fPe/\u0003\n`E7c\u0007:";
        objectArray[105] = "\u000bU\tcy\u0003\u0000R[eC\u0005M\u0007\u0019\u007f2\u000f,{PX2/\u001d\u00105f:?Z\u001b\rb&\u001fQw }*\u0019Xa\u0006c\u0004\u0011%bP`}0(A\u0015R\u0002\u0007\f`PDy0QT62'\f\u000fz\u0010:!^\u0003T\u00048\u001f\u0002\u001bBPF\u0013\r^T6P\u0007-,B\u0019{8^\u0007`SRs?Pe[\u0002/Z\u001dN\u000b} \u0005XSk\u007f*\u0007YW\b~(\u001f\b+";
        objectArray[106] = "/=uH\\\u0006-\",Vc\u0006<+iA\u0018x.,.IZ\n,~p\u0012c";
        objectArray[107] = "=W@\u0011Zm6LQ\u000b*x2CBzK2?NTFM29@/";
        objectArray[108] = "S\nF\nz'\rU\u0014\u0019Kx\u000fSD--gn\u000b\u0018\u00154)\u0003IH\u0000*\u0016";
        objectArray[109] = "3O'\u0003'|:\u0018:T\u001f?=\u001e4${!\u001a\u0006$\u0000dE-\u001e?Uc&,\u001c'\u0004\u001f";
        objectArray[110] = "\u000fZ$?VH_^qo?RRM\u00113C1\u0003\u0003p$ZUMS5:?";
        objectArray[111] = "g\u007fxEl566|TT30(8z5\"6Dr\u001eo>n/#Wk/V.~\u00183n9;,T7^";
        objectArray[112] = "\u0000]w\u0004JvB\rb\u001au|D b\u0000\u0018\u001b\u0001S>\u0003\ra_\u0000`Gu$\u0000U~\u0003\u000fzS\u000b:{";
        objectArray[113] = "Hc\u007f,S\u0005W+dt,\u0015G%s?W\u0002*:/)S\u0014\u0016<//]oKjr:WSMjt4,";
        objectArray[114] = "\u007f:a\u000b=>t!p\u0011M9}0\u000e_shi$t\u0001 6-\\d]p7!3q\u000f<3\u0011";
        objectArray[115] = "p\u0006hWOmt\u0002:\u00051qz\b4BJ\u0014sYh_\u0001{f\u000b$[1";
        objectArray[116] = "2Jo<.23\u0013m1T\\s^/\"lp\u0000N^n\u001e3\u0005Hm/2?!DU\u001d\u0012k8a_i.E;Sz\u00173\\\u0002\u0017zj7=(r$iiF9@c\u0013\u0010n}Dr1\rP\"O@\u0011ee\u0003DXo&{rDT(\u0006A\u0004CU0\u0005I\u001e}&40E\u0010RS!.: \u0014MS-2\"\u0013~(0<\"V\u001f2en=T#4eh3/";
        objectArray[117] = "j.tTm/o&+\u001bQ9c\u001edW<\u0017w.|ZQ&m4o\u001a;/w-x+";
        objectArray[118] = "|yY\u001epa?$R\u0014I'|}Z\u000e\u0012#ow_.36mq<I%0c'\u0000Mt.k\u001c";
        Object[] objectArray2 = objectArray;
        objectArray[119] = "83\u001d\u0012 N%4\u0012XX\\6$;J=^[iF\u00188\u000b08\u000f\u001c)3";
    }

    public static Exception a(Exception exception) {
        return exception;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x678;
        if (f[n2] == null) {
            m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.f[n2] = (int)(e[n2] ^ l);
        }
        return f[n2];
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp, class_243 class_2432, float f) {
        this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp).m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2432, f);
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp, float f) {
        this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp).m$$mC9dizgP2qnRzt8OpjfIEHi7UR3wfB0aIyaDlWvhi8fpy1j3kA5HSRQIBEOBebgPNgLRvwv6fVWHqImOrWGbM1qAZGqoeObmJ(f);
    }

    public m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp) {
        try {
            if (m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp == null) {
                return m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5.m$$Mc7X6Qt1KuGyMzXi7QSjV3Z4HuzRa8xhMTo17hiYDHLVT2PUqgOGgudljFr8kFmnQ86Yf02lz7XqIzd3h4M1JaCnIBO4fc1KZ;
            }
        } catch (RuntimeException runtimeException) {
            throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(runtimeException);
        }
        return this.m$$xLUDIy13fuLF0y948HB9JfVf5io09fxb0I7jaNa7Iy5WhTXAsPDhaJwZxxlAuWpelq9purClay4GVg4vf3HR8hr8FLTZP4uI7.entrySet().stream().filter(entry -> {
            boolean bl;
            block11: {
                block10: {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (entry.getKey() == null || ((m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp)((Object)((Object)entry.getKey()))).getName(1711056966) == null) break block10;
                                    } catch (RuntimeException runtimeException) {
                                        throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(runtimeException);
                                    }
                                    if (((m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp)((Object)((Object)entry.getKey()))).m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M(1859878409) == null) break block10;
                                } catch (RuntimeException runtimeException) {
                                    throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(runtimeException);
                                }
                                if (!((m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp)((Object)((Object)entry.getKey()))).getName(1711056966).equals(m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp.getName(1711056966))) break block10;
                            } catch (RuntimeException runtimeException) {
                                throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(runtimeException);
                            }
                            if (!((m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp)((Object)((Object)entry.getKey()))).m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M(1859878409).equals(m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp.m$$GRfkiQOGdhc6l7JU4eYkQXxnRmBksLgA571WX6khYEh6fOvU485230Ctq73q1ObupqxSr0m79jkYgL1WaY84e7GjSi2lhnH5M(1859878409))) break block10;
                        } catch (RuntimeException runtimeException) {
                            throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(runtimeException);
                        }
                        bl = true;
                        break block11;
                    } catch (RuntimeException runtimeException) {
                        throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(runtimeException);
                    }
                }
                bl = false;
            }
            return bl;
        }).map(Map.Entry::getValue).findAny().orElse(m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5.m$$Mc7X6Qt1KuGyMzXi7QSjV3Z4HuzRa8xhMTo17hiYDHLVT2PUqgOGgudljFr8kFmnQ86Yf02lz7XqIzd3h4M1JaCnIBO4fc1KZ);
    }

    public Set m$$aYkWP2yh6iYXz7s6hExAsjzsMiK8cPoKCPwrBSMGxnJmfxqEw8eX8qMRJZ9AgH22X0l2BA7ddMjWoKwXuJzWbAhS8GNANqe6I(int n) {
        return this.m$$xLUDIy13fuLF0y948HB9JfVf5io09fxb0I7jaNa7Iy5WhTXAsPDhaJwZxxlAuWpelq9purClay4GVg4vf3HR8hr8FLTZP4uI7.keySet();
    }

    public void m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8(int n) {
        try {
            this.m$$CM2rpIzQ0LPW4da2Qg6YJVMQP3QuZXYYIDG94d09Rf8lIKp0KnYFL2MKOz8mS2WdTnnECJGRfUfMwtPfuNL4BDmcnLSMf5xZP = this.m$$fvzzHYTjsKWBDM77t9b3904akFFdzK3lRqaqlt0DLSqxUX7lWgy8in9vohT3zCVMFUzqgCJHaaFwpqUsPAUyKSVeuTjaOYfY7("doublekill_2", Integer.reverse(((0xE857F93 ^ n - 37) + 43 << 16 | (0xE857F93 ^ n - 37) + 43 >>> 16) ^ 0x2587268F) - 37);
            this.m$$R4a8XbX1pkR0UEkxhlG5CyEaw7vVExYKq84zbuHfTPqxqSFUYfs8HAj6NdB3gXMR9r3M5xV0gmOfDgx3BXamJqIK6IJW4fbHp = this.m$$fvzzHYTjsKWBDM77t9b3904akFFdzK3lRqaqlt0DLSqxUX7lWgy8in9vohT3zCVMFUzqgCJHaaFwpqUsPAUyKSVeuTjaOYfY7("triplekill_3", Integer.reverseBytes(((-785380693 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) >>> 6 | -785380693 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) << 26) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) - n) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01);
            this.m$$tI5q1OAgFzdWg4WL0QCRCxF0iGbNqWTpLkZYJRqIj2jgJUQ2g2kvyJl9JVuZf3ed944tprPJsPWgG7vzEFNtJhrjErmnrGQyQ = this.m$$fvzzHYTjsKWBDM77t9b3904akFFdzK3lRqaqlt0DLSqxUX7lWgy8in9vohT3zCVMFUzqgCJHaaFwpqUsPAUyKSVeuTjaOYfY7("dominating_4", (-1651658266 + (~n & \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) ^ n >>> 3) - -1776510568);
            this.m$$Oq4dKtpXgvToJzi6EEOHYECtSOzLbxr0fsjOB3R4luJnOi08M3N4QzfU3S0ZZEGmBQYM1dziaR5vSTKcSUMwqK35SEH0fFhEA = this.m$$fvzzHYTjsKWBDM77t9b3904akFFdzK3lRqaqlt0DLSqxUX7lWgy8in9vohT3zCVMFUzqgCJHaaFwpqUsPAUyKSVeuTjaOYfY7("megakill_5", Integer.reverseBytes(((-785380693 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) >>> 6 | -785380693 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) << 26) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) - n) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01);
            this.m$$HrKB5coLo3L1YjxNXf4OqTJBYfRsIxVoyPS0zXN8YOLRJqNTli53rpulYT4ifstnZYFzmm053TBYBONFEEZyuPaW2Obbd2KCx = this.m$$fvzzHYTjsKWBDM77t9b3904akFFdzK3lRqaqlt0DLSqxUX7lWgy8in9vohT3zCVMFUzqgCJHaaFwpqUsPAUyKSVeuTjaOYfY7("unstoppable_6", ((-541491483 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) ^ n + 31) >>> 13 | (-541491483 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) ^ n + 31) << 19) ^ 0x25872677);
            this.m$$EJxWyyf3vLfZaKaNzOhpPMCunBS4MSMRFqNpZhynun5EvY51n4sDwVJyop0GCY6pWqcCiJKE3gcbCv5PrYTNrLxHhteWZPgJx = this.m$$fvzzHYTjsKWBDM77t9b3904akFFdzK3lRqaqlt0DLSqxUX7lWgy8in9vohT3zCVMFUzqgCJHaaFwpqUsPAUyKSVeuTjaOYfY7("wickedsick_7", (-1651658266 + (~n & \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) ^ n >>> 3) - -1776510568);
            this.m$$2wZDWnm1TYZ5uUsiU4rfVCfBEnrJxhd8aKVphBl3tICdQQuOwBt5l8epefOB0dH1pTXJNObdHgIVbKMsGI4rK2fbX8FhlBp0m = this.m$$fvzzHYTjsKWBDM77t9b3904akFFdzK3lRqaqlt0DLSqxUX7lWgy8in9vohT3zCVMFUzqgCJHaaFwpqUsPAUyKSVeuTjaOYfY7("monsterkill_8up", ((-1147946096 + n >>> 15 | -1147946096 + n << 17) ^ n >>> 4) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01);
        } catch (Exception exception) {
            m$$jpxWNhj5BbytDH7e6t3l7fSXGvEb1oaYWUacR30MzSbNi0ncWNe24lArHg7oRur1ykQkPi3wRUbPAGGFNEdZqQKgHpLMwQb8m.warn("Failed to load killstreak sounds");
        }
    }

    public static String m$$sz1bYYS218XAm7mdIn8Oskj2dDKKAVYw0q8KrhG1L0yvtr4WTzavOMvv7pabRwSMjb7BjHwzymwwLDQ5TurnZYiFDVYEzRkkA(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{100, 12, 67, -26, 111, 36, -20, -28, 17, 84, 113};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 11]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public void m$$xBOjxMwp7z6xnEiXr8JJTXHXcdvwxiW6xmx9UUWhIbMfHjtfQC4lMcz4Gt8q0fvJDVw1aoLL7IekzxLvkhRrFIZKpArSGHOSD(String string, int n) {
        Path path = m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud.m$$5hm9lO0iomCmizfHA8tCspx55QGaEJZaaBe1msvtkQckJCXQq78cVi0QvlWnmAMJnjl96en6XTgFNSDsabjF8aiRNHONXeeKN.resolve(string);
        for (File file : path.toFile().listFiles()) {
            try {
                if (file.isDirectory()) {
                    continue;
                }
            } catch (Exception exception) {
                throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(exception);
            }
            try {
                if (!file.getName().endsWith(".ogg")) {
                    continue;
                }
            } catch (Exception exception) {
                throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(exception);
            }
            try {
                byte[] byArray = m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(file.toPath());
                String string2 = file.getName().replace(".ogg", "");
                this.m$$xLUDIy13fuLF0y948HB9JfVf5io09fxb0I7jaNa7Iy5WhTXAsPDhaJwZxxlAuWpelq9purClay4GVg4vf3HR8hr8FLTZP4uI7.put(new m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp(string, string2), new m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5(byArray));
            } catch (Exception exception) {
                try {
                    if (exception instanceof class_151) {
                        m$$jpxWNhj5BbytDH7e6t3l7fSXGvEb1oaYWUacR30MzSbNi0ncWNe24lArHg7oRur1ykQkPi3wRUbPAGGFNEdZqQKgHpLMwQb8m.warn("Failed to load sound: %s".formatted(exception.getMessage()));
                        continue;
                    }
                } catch (Exception exception2) {
                    throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(exception2);
                }
                Object[] objectArray = new Object[Integer.reverseBytes(((-1035575313 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) >>> 6 | -1035575313 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) << 26) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) - n) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01];
                objectArray[0] = file.getName();
                objectArray[1] = exception.toString();
                m$$jpxWNhj5BbytDH7e6t3l7fSXGvEb1oaYWUacR30MzSbNi0ncWNe24lArHg7oRur1ykQkPi3wRUbPAGGFNEdZqQKgHpLMwQb8m.warn("Failed to load sound %s: %s".formatted(objectArray));
            }
        }
    }

    /*
     * Exception decompiling
     */
    public m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5 m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB(int var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 3[SWITCH]
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

    public void m$$ijYY4Qc5t83GePie1NGe2e8S2E8kHEm71L7eaMZKUdAEcIK8WRmCEbOCBZ9zi5GXGeBdex25R8JAjbPLwzQVnisaDli5hKFRH(int n) {
        this.m$$IfFacYpBdqOS4djmddqunVcOknusXgANMpma852R1wtxsiurQCP9WJEFKdnFVsZR8NzcmSfWPeXkBJ4NUWmv31r8mUW9cPSL8(Integer.reverse((0x2788B383 ^ n << 3) + 2459430 ^ n) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01);
        this.m$$xLUDIy13fuLF0y948HB9JfVf5io09fxb0I7jaNa7Iy5WhTXAsPDhaJwZxxlAuWpelq9purClay4GVg4vf3HR8hr8FLTZP4uI7.clear();
        this.m$$xLUDIy13fuLF0y948HB9JfVf5io09fxb0I7jaNa7Iy5WhTXAsPDhaJwZxxlAuWpelq9purClay4GVg4vf3HR8hr8FLTZP4uI7.put(m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp.m$$Bx1xIYJFKqTVThJ0txXtzcIQZx1r3zSeybrmlAYJ928kuDiPW59cRE89eBLyJud1RKJ3i9IqHmlWsaoi7yxBK6Xv2JpPSV7T9, m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5.m$$Mc7X6Qt1KuGyMzXi7QSjV3Z4HuzRa8xhMTo17hiYDHLVT2PUqgOGgudljFr8kFmnQ86Yf02lz7XqIzd3h4M1JaCnIBO4fc1KZ);
        for (m$$tce9mr4ZBZNu84ZSVuZBEmu09wHhWpu2V9T7KiUQZav2ZtQzVs4voEWTI8aJS2Zz4Din4eb06oSumtMDJMFzLqBrjvNiKWJJU m$$tce9mr4ZBZNu84ZSVuZBEmu09wHhWpu2V9T7KiUQZav2ZtQzVs4voEWTI8aJS2Zz4Din4eb06oSumtMDJMFzLqBrjvNiKWJJU : m$$tce9mr4ZBZNu84ZSVuZBEmu09wHhWpu2V9T7KiUQZav2ZtQzVs4voEWTI8aJS2Zz4Din4eb06oSumtMDJMFzLqBrjvNiKWJJU.values()) {
            try {
                String string = new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)m$$tce9mr4ZBZNu84ZSVuZBEmu09wHhWpu2V9T7KiUQZav2ZtQzVs4voEWTI8aJS2Zz4Din4eb06oSumtMDJMFzLqBrjvNiKWJJU.m$$qwtAUM7ZmCS2ArPs1AagDtWjysxOQu8YdoXzZud0ViUGbafiT1VrOFg0Id3t4nxR3T1ojGwLNi082uLJLn9F6O1tQRgHo6zog().getName(Integer.reverseBytes(((425135166 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) >>> 6 | 425135166 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) << 26) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) - n) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01)).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("/assets/mio/sounds/\u0001.ogg");
                InputStream inputStream = this.getClass().getResourceAsStream(string);
                try {
                    if (inputStream == null) {
                        throw new FileNotFoundException(string);
                    }
                } catch (Exception exception) {
                    throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(exception);
                }
                byte[] byArray = inputStream.readAllBytes();
                this.m$$xLUDIy13fuLF0y948HB9JfVf5io09fxb0I7jaNa7Iy5WhTXAsPDhaJwZxxlAuWpelq9purClay4GVg4vf3HR8hr8FLTZP4uI7.put(m$$tce9mr4ZBZNu84ZSVuZBEmu09wHhWpu2V9T7KiUQZav2ZtQzVs4voEWTI8aJS2Zz4Din4eb06oSumtMDJMFzLqBrjvNiKWJJU.m$$qwtAUM7ZmCS2ArPs1AagDtWjysxOQu8YdoXzZud0ViUGbafiT1VrOFg0Id3t4nxR3T1ojGwLNi082uLJLn9F6O1tQRgHo6zog(), new m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5(byArray));
            } catch (Exception exception) {
                // empty catch block
            }
        }
        for (File file : m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud.m$$5hm9lO0iomCmizfHA8tCspx55QGaEJZaaBe1msvtkQckJCXQq78cVi0QvlWnmAMJnjl96en6XTgFNSDsabjF8aiRNHONXeeKN.toFile().listFiles()) {
            try {
                if (!file.isDirectory()) {
                    continue;
                }
            } catch (Exception exception) {
                throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(exception);
            }
            try {
                if (file.getName().equalsIgnoreCase("killstreaks")) {
                    continue;
                }
            } catch (Exception exception) {
                throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(exception);
            }
            this.m$$xBOjxMwp7z6xnEiXr8JJTXHXcdvwxiW6xmx9UUWhIbMfHjtfQC4lMcz4Gt8q0fvJDVw1aoLL7IekzxLvkhRrFIZKpArSGHOSD(file.getName(), ((-1019086264 + n >>> 15 | -1019086264 + n << 17) ^ n >>> 4) - \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01);
        }
    }

    public ObjectArrayList m$$fvzzHYTjsKWBDM77t9b3904akFFdzK3lRqaqlt0DLSqxUX7lWgy8in9vohT3zCVMFUzqgCJHaaFwpqUsPAUyKSVeuTjaOYfY7(String string, int n) {
        ObjectArrayList objectArrayList = new ObjectArrayList();
        File file = m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud.m$$5hm9lO0iomCmizfHA8tCspx55QGaEJZaaBe1msvtkQckJCXQq78cVi0QvlWnmAMJnjl96en6XTgFNSDsabjF8aiRNHONXeeKN.resolve("killstreaks").resolve(string).toFile();
        if (!file.exists()) {
            m$$jpxWNhj5BbytDH7e6t3l7fSXGvEb1oaYWUacR30MzSbNi0ncWNe24lArHg7oRur1ykQkPi3wRUbPAGGFNEdZqQKgHpLMwQb8m.warn("Folder %s doesn't exist, ignoring".formatted(file.getName()));
            try {
                file.mkdir();
            } catch (Exception exception) {
                // empty catch block
            }
            return objectArrayList;
        }
        try {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("mio-fabric/killstreaks/%s isn't a folder".formatted(file.getName()));
            }
        } catch (Exception exception) {
            throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(exception);
        }
        for (File file2 : Objects.requireNonNull(file.listFiles())) {
            block14: {
                try {
                    try {
                        if (file2.isDirectory()) continue;
                        if (file2.getName().endsWith(".ogg")) break block14;
                    } catch (Exception exception) {
                        throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(exception);
                    }
                    Object[] objectArray = new Object[((706205498 - (((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF) << 2) ^ n) - (((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF) << 1) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) - ((\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) & 0xFF)];
                    objectArray[0] = string;
                    objectArray[1] = file2.getName();
                    m$$jpxWNhj5BbytDH7e6t3l7fSXGvEb1oaYWUacR30MzSbNi0ncWNe24lArHg7oRur1ykQkPi3wRUbPAGGFNEdZqQKgHpLMwQb8m.warn("Ignoring mio-fabric/killstreaks/%s/%s. Only .ogg sounds are supported".formatted(objectArray));
                    continue;
                } catch (Exception exception) {
                    throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(exception);
                }
            }
            objectArrayList.add((Object)new m$$IG4kkkH1l51gj2zgkxvjHwHEhgqk58c4eFy5mGlZJsOf2GXS71oRYuC7Yv6twg2yvSf3QVDjjiOCkiRdtHcXHTdcm7oUtSBp5(m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(file2.toPath())));
        }
        try {
            if (objectArrayList.isEmpty()) {
                m$$jpxWNhj5BbytDH7e6t3l7fSXGvEb1oaYWUacR30MzSbNi0ncWNe24lArHg7oRur1ykQkPi3wRUbPAGGFNEdZqQKgHpLMwQb8m.warn(new m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((Object)string).m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk("No sounds were registered for \u0001"));
            }
        } catch (Exception exception) {
            throw m$$bZMdpz101Cm1NmgGBylWf8ocotThKSZbpZNKq9jdT9JO4eoVrQd24JDjAY4b07VAXFuw7kf6UzlXl5sZ7xGq732wYfwttO0Hi.a(exception);
        }
        return objectArrayList;
    }
}

