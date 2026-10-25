package me.mioclient;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.mioclient.m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0$m$;
import me.mioclient.m$$OlOETRt7oZvmainNofqaNttZ2YNIewbgIN9aQ0T6pK8aK5BidlUzKXyMxJ4LN39tnZL4SVJJhQ8Wu7AdAxfSR46YYRsGHkekr;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$Siqxdw60dnxHxOD8uuwYiX8PVK89Zxq606yoos2T2hm2o8ThAcHt6SwQbcU63ih2Pt3VG9BWl8FAWK96c3J8pfnMWQwW1wzAb;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN;
import net.minecraft.class_151;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_2596;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_5684;
import net.minecraft.class_9276;
import net.minecraft.class_9334;
import net.minecraft.class_9837;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0
extends Record
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82,
class_5684 {
    public final List m$$RX0c98kkkwmy2b01cV6EONYw3RhK32F30CtxdtlS2rE3Fy9APcFk9gDOQVv2s5ha6xw0Msji7NjzcOVORasfg4c7awqZRwxEW;
    public final class_9276 m$$w2WXVSYM1E9jrEYncRoWASc2qtymRh4xPuRvBxMNZmnMoXOWWGteUkUtKiP25x8bUDxAOgr3tP6wFmFAQKW7dLxmEyweQ0VSR;
    public final class_1735 m$$GSL432cmL41aIjOLEEZT3WP0BYpJUcYgd9RQr8v0EhvCA1O4DaQXw2zWENlMDXa1hz83C7yb5QINwtwgBma5hrBcnPAS7MAdP;

    public m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0(List list, class_9276 class_92762, class_1735 class_17352) {
        this.m$$RX0c98kkkwmy2b01cV6EONYw3RhK32F30CtxdtlS2rE3Fy9APcFk9gDOQVv2s5ha6xw0Msji7NjzcOVORasfg4c7awqZRwxEW = list;
        this.m$$w2WXVSYM1E9jrEYncRoWASc2qtymRh4xPuRvBxMNZmnMoXOWWGteUkUtKiP25x8bUDxAOgr3tP6wFmFAQKW7dLxmEyweQ0VSR = class_92762;
        this.m$$GSL432cmL41aIjOLEEZT3WP0BYpJUcYgd9RQr8v0EhvCA1O4DaQXw2zWENlMDXa1hz83C7yb5QINwtwgBma5hrBcnPAS7MAdP = class_17352;
    }

    public static m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0 m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_1735 class_17352, int n) {
        CallSite callSite = m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a("\u00c9", (Object)class_17352, (long)2173148453544306L);
        class_9276 class_92762 = (class_9276)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a("\u00c9", (Object)callSite, (Object)class_9334.field_49650, (long)2884031131318821L);
        try {
            if (class_92762 == null) {
                return null;
            }
        } catch (class_151 class_1512) {
            throw m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a(class_1512);
        }
        ArrayList<m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8> arrayList = new ArrayList<m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8>();
        int n2 = 0;
        Iterator iterator = m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a("\u00c9", (Object)class_92762, (long)2265457027432102L).iterator();
        while (iterator.hasNext()) {
            boolean bl;
            class_1799 class_17992;
            block9: {
                block8: {
                    class_17992 = (class_1799)iterator.next();
                    try {
                        try {
                            if (m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a("\u00c9", (Object)class_92762, (long)3778927689543571L) == false || m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a("\u00c9", (Object)class_92762, (long)2006209960938465L) != n2) break block8;
                        } catch (class_151 class_1513) {
                            throw m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a(class_1513);
                        }
                        bl = true;
                        break block9;
                    } catch (class_151 class_1514) {
                        throw m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a(class_1514);
                    }
                }
                bl = false;
            }
            boolean bl2 = bl;
            arrayList.add(new m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_17992, bl2));
            ++n2;
        }
        return new m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0(arrayList, class_92762, class_17352);
    }

    public void method_32666(class_327 class_3272, int n, int n2, int n3, int n4, class_332 class_3322) {
        int n5 = m$$OlOETRt7oZvmainNofqaNttZ2YNIewbgIN9aQ0T6pK8aK5BidlUzKXyMxJ4LN39tnZL4SVJJhQ8Wu7AdAxfSR46YYRsGHkekr.m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A;
        int n6 = m$$OlOETRt7oZvmainNofqaNttZ2YNIewbgIN9aQ0T6pK8aK5BidlUzKXyMxJ4LN39tnZL4SVJJhQ8Wu7AdAxfSR46YYRsGHkekr.m$$zDyq70LCQSrMsuArsOUOomKMmzyFjFpqsoUJhC3DWdjVJtUCd3Vh6TEUQ5OjCdG6tCap8wEwv1zQSPuzDW7Pjp2xM1NnkUtn9;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = ((m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a(1822, 7903063538839931841L) ^ 0xCF1D7) >>> 3 | 0xE0000000) ^ 0x800678EB;
        if (this.m$$RX0c98kkkwmy2b01cV6EONYw3RhK32F30CtxdtlS2rE3Fy9APcFk9gDOQVv2s5ha6xw0Msji7NjzcOVORasfg4c7awqZRwxEW.size() > 961724465) {
            n10 = -1006452906;
        }
        for (m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82 : this.m$$RX0c98kkkwmy2b01cV6EONYw3RhK32F30CtxdtlS2rE3Fy9APcFk9gDOQVv2s5ha6xw0Msji7NjzcOVORasfg4c7awqZRwxEW) {
            int n11;
            int n12;
            block14: {
                n12 = n + -1006452948 * n7;
                n11 = n2 + 1110429236 * n8;
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (n5 < n12 || n5 > n12 + -1376320061) break block14;
                                } catch (class_151 class_1512) {
                                    throw m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a(class_1512);
                                }
                                if (n6 < n11) break block14;
                            } catch (class_151 class_1513) {
                                throw m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a(class_1513);
                            }
                            if (n6 > n11 + -1862135443) break block14;
                        } catch (class_151 class_1514) {
                            throw m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a(class_1514);
                        }
                        if (m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a("\u00c9", (Object)this.m$$w2WXVSYM1E9jrEYncRoWASc2qtymRh4xPuRvBxMNZmnMoXOWWGteUkUtKiP25x8bUDxAOgr3tP6wFmFAQKW7dLxmEyweQ0VSR, (long)2006209960938465L) == n9) break block14;
                    } catch (class_151 class_1515) {
                        throw m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a(class_1515);
                    }
                    m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a("\u00fb", (Object)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a("\u00c9", (Object)this.m$$GSL432cmL41aIjOLEEZT3WP0BYpJUcYgd9RQr8v0EhvCA1O4DaQXw2zWENlMDXa1hz83C7yb5QINwtwgBma5hrBcnPAS7MAdP, (long)2173148453544306L), (int)n9, (long)3724750507319856L);
                    m$$Siqxdw60dnxHxOD8uuwYiX8PVK89Zxq606yoos2T2hm2o8ThAcHt6SwQbcU63ih2Pt3VG9BWl8FAWK96c3J8pfnMWQwW1wzAb.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_2596)new class_9837(this.m$$GSL432cmL41aIjOLEEZT3WP0BYpJUcYgd9RQr8v0EhvCA1O4DaQXw2zWENlMDXa1hz83C7yb5QINwtwgBma5hrBcnPAS7MAdP.field_7874, n9));
                } catch (class_151 class_1516) {
                    throw m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a(class_1516);
                }
            }
            if (zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82.m$$LqUTHLS1NCO65KDPRdsIyGRpex8K2ygAKv1H7GVfadTqqvrFELPPbGQjmkUWocJU0R0LbQXGxFMY0DplUShVZtDHhfI36SURG()) {
                float f = (float)(System.currentTimeMillis() % m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.b(21178, 4656182500521605240L)) / 4.0212284E-35f;
                if (f >= 2.1609828E-14f) {
                    f = 1.9981028f - f;
                }
                Color color = m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Color.red, Color.red.darker(), f);
                class_3322.method_51448().method_22903();
                class_3322.method_51448().method_46416(0.0f, 0.0f, -3.4435124E-28f);
                class_3322.method_51433(m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1772, "x", n12 + -1862135427, n11 + 1, color.hashCode(), true);
                class_3322.method_51448().method_22909();
            }
            m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a("\u00c9", (Object)class_3322, (Object)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a("\u00c9", (Object)zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82, (long)2685434554973312L), (int)(n12 + (((int)(m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.b(3179, 3226290161607452330L) - 44877L) ^ 0xFFFB) << 16 | (int)(m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.b(11652, 4164563605500561218L) - 65531L) ^ 0xAF4D)), (int)(n11 + -1006452918), (long)2920665088301521L);
            m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a("\u00c9", (Object)class_3322, (Object)class_3272, (Object)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a("\u00c9", (Object)zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82, (long)2685434554973312L), (int)(n12 + (((int)(m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.b(27120, 1125602056045151027L) - 44877L) ^ 0xFFFB) << 16 | (int)(m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.b(22067, 34947593935584502L) - 65531L) ^ 0xAF4D)), (int)(n11 + 1110385403), (long)3108417376608372L);
            ++n9;
            if (++n7 != n10) continue;
            n7 = 0;
            ++n8;
        }
    }

    public int method_32661(class_327 class_3272) {
        int n = 769671722;
        if (this.m$$RX0c98kkkwmy2b01cV6EONYw3RhK32F30CtxdtlS2rE3Fy9APcFk9gDOQVv2s5ha6xw0Msji7NjzcOVORasfg4c7awqZRwxEW.size() > 550645586) {
            n = 2079733242;
        }
        return (int)(Math.ceil((float)this.m$$RX0c98kkkwmy2b01cV6EONYw3RhK32F30CtxdtlS2rE3Fy9APcFk9gDOQVv2s5ha6xw0Msji7NjzcOVORasfg4c7awqZRwxEW.size() / (float)n) * Double.longBitsToDouble(m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.b(31657, 3843878703428096365L))) + 2079733246;
    }

    public int method_32664(class_327 class_3272) {
        int n = 550645575;
        if (this.m$$RX0c98kkkwmy2b01cV6EONYw3RhK32F30CtxdtlS2rE3Fy9APcFk9gDOQVv2s5ha6xw0Msji7NjzcOVORasfg4c7awqZRwxEW.size() > 1110429232) {
            n = 961724455;
        }
        return n * 769671739 + -1006452918;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.class, "a;b;c", "m$$RX0c98kkkwmy2b01cV6EONYw3RhK32F30CtxdtlS2rE3Fy9APcFk9gDOQVv2s5ha6xw0Msji7NjzcOVORasfg4c7awqZRwxEW", "m$$w2WXVSYM1E9jrEYncRoWASc2qtymRh4xPuRvBxMNZmnMoXOWWGteUkUtKiP25x8bUDxAOgr3tP6wFmFAQKW7dLxmEyweQ0VSR", "m$$GSL432cmL41aIjOLEEZT3WP0BYpJUcYgd9RQr8v0EhvCA1O4DaQXw2zWENlMDXa1hz83C7yb5QINwtwgBma5hrBcnPAS7MAdP"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.class, "a;b;c", "m$$RX0c98kkkwmy2b01cV6EONYw3RhK32F30CtxdtlS2rE3Fy9APcFk9gDOQVv2s5ha6xw0Msji7NjzcOVORasfg4c7awqZRwxEW", "m$$w2WXVSYM1E9jrEYncRoWASc2qtymRh4xPuRvBxMNZmnMoXOWWGteUkUtKiP25x8bUDxAOgr3tP6wFmFAQKW7dLxmEyweQ0VSR", "m$$GSL432cmL41aIjOLEEZT3WP0BYpJUcYgd9RQr8v0EhvCA1O4DaQXw2zWENlMDXa1hz83C7yb5QINwtwgBma5hrBcnPAS7MAdP"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.class, "a;b;c", "m$$RX0c98kkkwmy2b01cV6EONYw3RhK32F30CtxdtlS2rE3Fy9APcFk9gDOQVv2s5ha6xw0Msji7NjzcOVORasfg4c7awqZRwxEW", "m$$w2WXVSYM1E9jrEYncRoWASc2qtymRh4xPuRvBxMNZmnMoXOWWGteUkUtKiP25x8bUDxAOgr3tP6wFmFAQKW7dLxmEyweQ0VSR", "m$$GSL432cmL41aIjOLEEZT3WP0BYpJUcYgd9RQr8v0EhvCA1O4DaQXw2zWENlMDXa1hz83C7yb5QINwtwgBma5hrBcnPAS7MAdP"}, this, object);
    }

    public List m$$eQ46oJ6epuzGWtkSFs8Zf3DT1EEYygxUf3v1K5eE6PsgpB68eWAR7NHzOAtkAq67klJnhUhdyAJ4icT6mc02xfTRXpXdvEeae(int n) {
        return this.m$$RX0c98kkkwmy2b01cV6EONYw3RhK32F30CtxdtlS2rE3Fy9APcFk9gDOQVv2s5ha6xw0Msji7NjzcOVORasfg4c7awqZRwxEW;
    }

    public class_9276 m$$1BHn5ZOdz8i9iByUtO1efPbQddzXKP5KHfCJSizu6UlVSAjQujtIIVD8wLfNfZKmKuhjb2ZYsuXIt363RR5WpTzNOZ2UpwjKx(int n) {
        return this.m$$w2WXVSYM1E9jrEYncRoWASc2qtymRh4xPuRvBxMNZmnMoXOWWGteUkUtKiP25x8bUDxAOgr3tP6wFmFAQKW7dLxmEyweQ0VSR;
    }

    public class_1735 m$$OfR1G1SAYLmuMKcWmy0Y3Ww8SkUYJ52ZUDSXfhBty13Tm0dPuyv2yXpUqB1lCFpoqmjfF9k80NuarK5NWg4smpYNruecOoYeh(int n) {
        return this.m$$GSL432cmL41aIjOLEEZT3WP0BYpJUcYgd9RQr8v0EhvCA1O4DaQXw2zWENlMDXa1hz83C7yb5QINwtwgBma5hrBcnPAS7MAdP;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    block14: {
                        m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.g = new Object[57];
                        m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.h = new String[57];
                        m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.a();
                        var8 = 4770974171096745964L;
                        var14_1 = new long[75];
                        var11_2 = 0;
                        var12_3 =  /* dynamic constant */ (String)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n("P0r8NTrg4OKLMJkKDLd7", MethodHandles.lookup(), "m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n", m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.class, 812191490);
                        var13_4 = var12_3.length();
                        var10_5 = 0;
                        while (true) {
                            var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes( /* dynamic constant */ (String)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n("L5VE7Dg1jqbFoDhPFtKF", MethodHandles.lookup(), "m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n", m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.class, 1629811585));
                            v0 = var14_1;
                            v1 = var11_2++;
                            v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                            v3 = -1;
                            break block14;
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            var12_3 =  /* dynamic constant */ (String)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n("VsszbKc8Wg88HLAj2zxq", MethodHandles.lookup(), "m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n", m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.class, 2019536142);
                            var13_4 = var12_3.length();
                            var10_5 = 0;
                            while (true) {
                                var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes( /* dynamic constant */ (String)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n("ShheCN0HzYYR9GFduAet", MethodHandles.lookup(), "m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n", m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.class, 1427780283));
                                v0 = var14_1;
                                v1 = var11_2++;
                                v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                                v3 = 0;
                                break block14;
                                break;
                            }
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            break block15;
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
                m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.c = var14_1;
                m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.d = new Integer[75];
                m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -282803;
                var0_7 = 4034679311507373250L;
                var6_8 = new long[7];
                var3_9 = 0;
                var4_10 =  /* dynamic constant */ (String)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n("u9kLlWIXO2t8DSCkBxt1", MethodHandles.lookup(), "m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n", m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.class, 292243345);
                var5_11 = var4_10.length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes( /* dynamic constant */ (String)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n("7yYA8BPbmHwKl40iz92Y", MethodHandles.lookup(), "m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n", m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.class, 1021771135));
                    v5 = var6_8;
                    v6 = var3_9++;
                    v7 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v8 = -1;
                    break block16;
                    break;
                }
lbl59:
                // 1 sources

                while (true) {
                    v5[v6] = v9;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 =  /* dynamic constant */ (String)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n("AyKnQweVhVUaphFbQQ9S", MethodHandles.lookup(), "m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n", m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.class, 275470646);
                    var5_11 = var4_10.length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes( /* dynamic constant */ (String)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n("A3y3NN8oNrYKiNOTxAch", MethodHandles.lookup(), "m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n", m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.class, 243624495));
                        v5 = var6_8;
                        v6 = var3_9++;
                        v7 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v8 = 0;
                        break block16;
                        break;
                    }
                    break;
                }
lbl72:
                // 1 sources

                while (true) {
                    v5[v6] = v9;
                    if (var2_12 < var5_11) ** continue;
                    break block17;
                    break;
                }
            }
            v9 = v7 ^ var0_7;
            switch (v8) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl83:
                // 1 sources

                ** continue;
            }
        }
        m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.e = var6_8;
        m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.f = new Long[7];
        m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.b(17919, 4958267763250687800L));
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4CE7;
        if (d[n2] == null) {
            m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x2AC7) & Short.MAX_VALUE;
        if (f[n2] == null) {
            m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.f[n2] = e[n2] ^ l;
        }
        return f[n2];
    }

    public static void a() {
        Object[] objectArray = g;
        g[0] = "9\u00029^h\u0016'\n#\u0011\u000f\u00176\u0011.K)\u0011";
        objectArray[1] = Boolean.TYPE;
        m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.h[1] = "java/lang/Boolean";
        objectArray[2] = "9>\u0000\u0005Hl9>\u0017YDc#u\u0017GDv$\u0004M\u0019\u00123";
        objectArray[3] = Integer.TYPE;
        m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.h[3] = "java/lang/Integer";
        objectArray[4] = "x\u0014@\u0004\t\u0014x\u0014WX\u0005\u001bb_WF\u0005\u000ee.\u0005\u001d]D";
        objectArray[5] = "\u000e|nS<\u0004\u000e|y\u000f0\u000b\u00147y\u00110\u001e\u0013F#Nb\\";
        objectArray[6] = "}<\f6;Bv3\u001dyZL}8\u0019#";
        objectArray[7] = "R]AA!&R]V\u001d-)H\u0016V\u0003-<Og\u0004X\u007fz";
        objectArray[8] = "<HR\u0004\u0012\u00177GCKu\u000f3[E\u0007P\u001e";
        objectArray[9] = "KkDRm\u0002Uc^\u001d\u000f\u001eR~";
        objectArray[10] = "\u0019bCLD\u000f\u0017k\u0004DC\u0014ZjI\u0005L1!u\u0003iJ1@WXLx\u000e\u001co4FZ\u00121u({d\u0016<>)mD7DU\u001ftDS\u0002L[[K6GM=\u0013o\u0005@T]{e&\u001bP^dF,!N\tFl!&r\u001d\u0017z\b\u001dI\u001cR\u007f/\u00155\u000fU@4\u0011?\u0015P\u0019\u0011\u001c3\u001ci@";
        objectArray[11] = Long.TYPE;
        m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.h[11] = "java/lang/Long";
        objectArray[12] = "\\T|I|(R];A{3\u001f\\v\u0000Q\u0005ce(J|,\\I!nS\u000bBI1^P\u0012^U<Bw>Kt8qb\t`\b\u0001hw\u0013v_\u0004qW fP0RD h}\u0006EX+\u0007R8K$&Tdk\u001c  HfjvQ>`V\u000bM%%E\t>a%3\\y\u001baz%}\u007f>^%c\\\u0015v^`>Vt\n\u0017G>vEary6f\u0002jJ}*F\t\u0006gb&@\u0000\u0010A|\bH}\u0013\u0017\u007fqip0RM\u000e^T\u0011\u0017[ui\t%q-+UW\u000bW%-\u0007[%C'\u0013[C3\u0017Y\u001fT\u0006%qO\u000btt3^d4\u0007_\u0011\u0014M\u007ff\b\u0014\u001c";
        objectArray[13] = "\u0012u*w\u0017m\u0012u=+\u001bb\b>=5\u001bw\u000fOmjH";
        objectArray[14] = Void.TYPE;
        m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.h[14] = "java/lang/Void";
        objectArray[15] = "\u0007K2p\u001f+\u0007K%,\u0013$\u001d\u0000%2\u00131\u001aqrkJu";
        objectArray[16] = "\\n^\u001c>IWaOSC\\E{M\u0010";
        objectArray[17] = "'\nq4Sw'\nfh_x=Afv_m:06(\t";
        objectArray[18] = Float.TYPE;
        m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.h[18] = "java/lang/Float";
        objectArray[19] = "5\u000fIb=\u0017>\u0000X-U\u00170\u000fK";
        objectArray[20] = "\u0007M\f'7\u0006\tDK/0\u001dDE\u0006n\r\u0000\u001bPF=hY\u000eFZ\u0002&&.\u0010W?)0\u0003p\u001a\u001a\b\"R\u0011x2/_Z\u001e[%1\u001aX|\u0010\"3[\u0005\u0010v\"\u001f\n\"\\\u0014\u0019)8\bKw|m\u0000\u0002\u001ar>m?-\u0011`\u001d2Q,iu\u0001g_\t\u001bhr.\u000f\u0004eu\u001b)>[_X\u000b<";
        objectArray[21] = "(&aM]y(&v\u0011Qv2mv\u000fQc5\u001c'V\t&";
        objectArray[22] = "GtE\u0018^\u000fL{TW#\u0017_|]\u001e";
        objectArray[23] = "#+pcQ\u007f#+g?]p9`g!]e>\u00111x\u000f!";
        objectArray[24] = "^RYb6$CG\u0001@w)[A";
        objectArray[25] = "_m\r@<:Tb\u001c\u000fV9@n\u0017D";
        objectArray[26] = Double.TYPE;
        m$$DBRTznikmxsJFLsxczEUodnfbyzEjUwNQ9SLbTGnVUBgWabvQgYLTaMl6cjo1aeU985gyW8RDyQgYi0bt8lE0tmHIEobLNlz0.h[26] = "java/lang/Double";
        objectArray[27] = "=93ce\u000e66\",\u0006\u0003#0";
        objectArray[28] = "d\u0006n}5X1\u001fd<PO0\u0007ij<}cB73`*g\u0010vc2X/\u00023tP";
        objectArray[29] = "\u0004FX^nT\u000e[ZU\rL\u0000CACa~W\u0005\u0010\u001c6)\u0004\u0001\u0018T2F\u000eBN\u001d\r";
        objectArray[30] = "Ye:9Ma\u00001\u007f7(=\t\"\"9D\u000f[`}a(cZ;{`Q>\u0007ns^";
        objectArray[31] = "\"\u001cPCs\u001a(\u0001RH\u0010\u0002&\u0019I^|0w[\u0015\u0000.g \u0017B](\u0003qZKS\u0010\f9\u000eM\u0001t]t\u0007C9{\u0015 \u0001\u0011]*X)\u000f)P.^;ZFZm\bre";
        objectArray[32] = "lx56 \f9a?wE\u001b8y2!))h:n||~hab\"%Gmzb(E";
        objectArray[33] = "- kE7N-rh]FL$cuT< - kE7N-rh]F";
        objectArray[34] = "f8JyID\")\u0016!0]$-\u000frL[\"@\u001e|B@c!O$\u000e<";
        objectArray[35] = "=\r{\u001e\u000bh=_x\u0006zf4Of)\u001dj04<\t\u0005h?Ft\u001b@\u007f]";
        objectArray[36] = "\u000eO0\u00185]J^l@L^QEbzvNOYm\b>\\\nN\u000f";
        objectArray[37] = "\u0019>Bm[\u001bHf\u000e\u0011\u0000\u0013\t\u001f]a\u001cz\u000b$\r+\u0001FKh\b\u0011";
        objectArray[38] = "\u0011`mXnmQ 4M^0\r0ZR:\u000fO`go\u001a:}cIv\u0006\flNk\u007f1\u001fKsKr<%EUE_\u0004*q`Xnn\u0018\u001fDJ@:e_$iW3lYPS\u0002,/\u007fbcX\u0013*hLi^\f\u0004|EI\u007f\u0018\u0005MRL\u000b\u0007)DWk`:1gcuY<\u001f`\u007fg2ekD%4K86\u0011-\n";
        objectArray[39] = "h\u0006\tj6M(FP\u007f\u0006\u0010tV*y[)\u0018>59@>\u001fDSCJ-\u0002\u0016\u0015Aw:\u0002\u0002\u0003p66b\u000b\u0001IE\u000ba:QOX\u001b1\u00162y\u007f\u000b\"4#D^-257bc\u0016\u0005%\tkD(` VDl,\b5\u001eNC$`6\u0016d[.8$<|J58\u0014/;8.\u0005 !\u0000\u007f\be@\u000f<?D`z";
        objectArray[40] = "\u0011Y7\u001a\u0000\u0016L\u0004b\u0012>\nG\u001b2DR8\u0017Wl\u0012\u0002o\u0011\u001eoMNRG\u001d=Q>SI^0_^\f\u0017\u000b<#";
        objectArray[41] = "LUt'n\u0005\u0000V+x\u0016Q\u0010D{\"zc@\u0001'\u007f)4F\u0006~|(M\u001b[+t\u0016\u000e\u0016Gu'dF\u0004\u0002bE,_\u0002Vy7dMGA\u001b,(\r\r\u0007t&k[D8";
        objectArray[42] = "\u0000}Z\u0012cc\n`X\u0019\u0000{\u0004xC\u000flIS>\u0012P1\u001e\u0000:\u001a\u0018?q\nyLQ\u0000";
        objectArray[43] = "\u001dr.\nX[\u0011|%G6N\ni>\u001bPY+r!\u001bsD\u0013w%\r6\u0015O.xNI\u0015\u0010.'v";
        objectArray[44] = "j;\u001aJA\\&8E\u00159\b6*\u0015OU:foI\u0013\u0000m0?IKA\b)7HD9Ve3L\u0016@\u000b8fD(\u0003\u0006$8\u0017ZK\u0014a/u\u0012R\u001254\u0007Z@W\"V\u001c\u0016\u0000\u001dd9\u0016UVT[";
        objectArray[45] = "#4i\u000f\u001d\u0017rl%s@\u001b8/\u001bOEO*/{\u0010\u001b\u001a&S";
        objectArray[46] = "j\u0003xVbXh\u0005&T\u0001E`\u001f\u000bI}_Z\u0004\u000fLfMzc{C~Jd\u00113Q;]\u0006\b3Ce\u001cbY~Jk$";
        objectArray[47] = "2lp75\u0007bi{y\t\u000bs+i:x\u0001\u0012W \u001dx!#<E#p1d7}'l\u0011o[P8`\u0017fMv&N\u001f\u001bN %7>\u0016me\u0017H\t2L \u00013>oxFwm\u00021V`\u007fkP=xt}U\f%n \u0003Y\u0003`xF\u0015M#\u0012ni>rP9L#\u001791nI+Gg^4m|!h\u0000fe\u001b.7W/8t$t\u0001f\u0007";
        objectArray[48] = "@{9I^1C;kH=dGa83\\|[[05Z}Jc:y\r8\u001d;o\u0006\rg\u001ddW\u0018Rc\u0019?=\u000bW`_\u0007";
        objectArray[49] = "\"\u0018<8\u0015\u0015x\u001as4.q,\u000035\u0016]_\u0010Byd\u001eZ\u0016q8H\u0012~\u001aI\nhFg?C~Thd\rf\u0000Iq]If}M\u0010w,8~\u0013kf\u001e\u007f\u0004jC\"\u001an&w}}\u0011\\\u0006\u001fH\\\u001aDx\\V-\u001aH?|l[\u001dI'\u007fdA#:#JhO\fO6T\u0017\u007fJQD\u001e\u0017 M;;\u001eH \u0012\u0003~EPs\u0013q6W\u0015dq";
        objectArray[50] = "03^tZo|0\u0001+\";l\"QqN\t<g\r*\u0012^h'HlA#b:Jg\"";
        objectArray[51] = "P\u0017.\u0007a@\u001c\u0014qX\u0019\u0014\f\u0006!\u0002u&\\C}^\"q\n\u0013}\u0006a\u0014\u0013\u001b|\t\u0019\u001f\u0007\u0017!\bb\b]C}e#\u001a\u001e\u0014#\u0017k\b[\u0003A_r\u000e\u000f\u00183\u0017`K\u0018z{\u000ef\u001f\u0003\b3\u001c#\ba\u0003<X#\u0010]Cp]\u0019K\n\u0005/\u0007k\u0003\u0018@8e";
        objectArray[52] = "[pI]iH\u0004<\u000b\u0007\u0005\u0014X}WPi&\u000b8\t\f:q\u000e?R\u000e;\bSb\u0007\u0006\u0005K^~YUw\u0003L;N7lO\fq\bXf\fZ87";
        objectArray[53] = "+j>91j~s4xT}\u007fk9.8O,.gwe\u0018kjds5$+&aI";
        objectArray[54] = "\u000bU`X\u000bd\u000eN`Rk<J\\*U\u0017:L1;[\u0019!\rPj\u0003U]";
        objectArray[55] = "$Y\u0012\u0014J5`HNL3$vM-JPtx]M\u0015\u000e!t!T\u000b\u000ew{\u001d\u0014G\u000bM";
        Object[] objectArray2 = objectArray;
        objectArray[56] = "$M\u0002|\u000f\f~\u001a_z?\u000b+\u0014\u0007F^\u000f%L[,M\n&\nc'P\u0003\u007fM\t4U\u00009u";
    }

    public static String m$$YRFoaQAua1XQ8O2VDPTDcMuMOnd7Uq1fHEiayZCz0VZ5ZKmgPsrUHPMxSJJyj2EO0vek0hmzimbBImTI9Cfd6fY0dg56eQb7n(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{27, 10, 121, 122, -91, 38, -85, -99, -69, -89, 68, 60, 62};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 13]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

