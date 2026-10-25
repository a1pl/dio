package me.mioclient;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import me.mioclient.m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$2qErw1H3B7hswOELuKyRsyvbxRPeGh63NPU5RSdfJqpCWaJkfS4hSbNAViYHk3CEtWN2lZ05QNPhusCos8D2FINNWybSc104h;
import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$4rzGEdASve2OAJIwx7ibviRce6rIrKcMqoi7mwJlN19LxakWNlZcOaSHyE6VRZ5T8e8Dvdu1Luk7kCFxEFDnxLqAjVDHSIArb;
import me.mioclient.m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu;
import me.mioclient.m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT;
import me.mioclient.m$$LJhdoWhAbaYPKpepd15lX8TdbpFURsg82QJMhFxPKkGBOib32hAk52WA5k1MaXOpDXHjRegrSKslfbF97f86FKWrOwS4dVBkp;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$S6pjT3LMgZUuwtTIlHrN0Ko9uzCTDbTvpS5fceqBjEqEjllFYGfVsIPpBOXVHhdUkQuqRw6JmI7KHNS2uAHK1hM59Bcq8Rejb;
import me.mioclient.m$$Tgq0ztYyeblZflLJ3YaWeIMwrPk1UBnIby8sM7FmZY2AtMPwc74W8b6Ro3RM9cutkIX4QMvj2D1YGxAPmgZS3xx5olprJX105;
import me.mioclient.m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y;
import me.mioclient.m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45;
import me.mioclient.m$$hXF9Wica9zBZra21yH7jvRILZV3NL1s1tn9k83EJ1cXMIssxQ12KyDEFnOA2kEduqS1D7d6n67KLulHSKFZhhzV5bniUilG1G;
import me.mioclient.m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62;
import net.minecraft.class_10017;
import net.minecraft.class_10034;
import net.minecraft.class_10055;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_583;
import net.minecraft.class_620;
import net.minecraft.class_622;
import net.minecraft.class_897;
import net.minecraft.class_922;
import org.lwjgl.opengl.GL32C;

public class m$$T15vd92SGo4ioRoaknO5bXBgWzPiXSnJlOFM04YEWPn30wyjgOVG4gmnZO4ZEF8MXmaeyWCS6Mv4Mrp9fXCbvhHQRondDFj3n
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public static final m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y m$$xEte45wk0NIx0JPzdqpWIzMz2VtkITqCOJ7246Cle0S0BrOBmjQZzC6MFtHg7GvEpErQES6dUOvzeqo0hzaYmRuiwCbdBRFFJ = m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y.m$$0ly4isl9mzmwmWPbHwURy1txlOD9vXveQrqodCESzpEM1DuvZ52j6LTeqldbZZy89V2Hgudo82FPF5ov7e6wtubTXjTdLf8ng().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(VertexFormat.class_5596.field_27382, class_290.field_1576);
    public static final m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y m$$E5JKhJ8EhDZt1xQeUgqjC3TL2kGTmA2ppjYqCYSZ58MtGWCwBvKaXbQVD0yujwmkHlfFnH0JnfRAubRLoJRYfaQsLVNpbBorD = m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y.m$$0ly4isl9mzmwmWPbHwURy1txlOD9vXveQrqodCESzpEM1DuvZ52j6LTeqldbZZy89V2Hgudo82FPF5ov7e6wtubTXjTdLf8ng().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(VertexFormat.class_5596.field_29344, class_290.field_1576);
    public static final m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y m$$3gcpf9Ky33GcHWHq8tC78GGNMP1b1SdSd4tJEWjtLYR5QEQWvbWMzkHm7ShyBZXB35NGoqKr7JkeLhefQi7LXJgZhpznIzsqN = m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y.m$$0ly4isl9mzmwmWPbHwURy1txlOD9vXveQrqodCESzpEM1DuvZ52j6LTeqldbZZy89V2Hgudo82FPF5ov7e6wtubTXjTdLf8ng().m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(VertexFormat.class_5596.field_27382, class_290.field_1585);
    public static final m$$Tgq0ztYyeblZflLJ3YaWeIMwrPk1UBnIby8sM7FmZY2AtMPwc74W8b6Ro3RM9cutkIX4QMvj2D1YGxAPmgZS3xx5olprJX105 m$$GaQVh8h3M2jkViVsHncVRsxLo5hklicn348yniYlmmkTzJ3bwPnOip66sXH2R5HYEPIM4QinqqyunNM3zUuxEDYbKOXQ6LDDl = new m$$Tgq0ztYyeblZflLJ3YaWeIMwrPk1UBnIby8sM7FmZY2AtMPwc74W8b6Ro3RM9cutkIX4QMvj2D1YGxAPmgZS3xx5olprJX105();
    public static boolean m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ;

    public m$$T15vd92SGo4ioRoaknO5bXBgWzPiXSnJlOFM04YEWPn30wyjgOVG4gmnZO4ZEF8MXmaeyWCS6Mv4Mrp9fXCbvhHQRondDFj3n() {
        throw new AssertionError();
    }

    static {
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(m$$T15vd92SGo4ioRoaknO5bXBgWzPiXSnJlOFM04YEWPn30wyjgOVG4gmnZO4ZEF8MXmaeyWCS6Mv4Mrp9fXCbvhHQRondDFj3n.class);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4587 class_45872, class_1297 class_12972) {
        m$$GaQVh8h3M2jkViVsHncVRsxLo5hklicn348yniYlmmkTzJ3bwPnOip66sXH2R5HYEPIM4QinqqyunNM3zUuxEDYbKOXQ6LDDl.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_45872);
        class_243 class_2432 = m$$T15vd92SGo4ioRoaknO5bXBgWzPiXSnJlOFM04YEWPn30wyjgOVG4gmnZO4ZEF8MXmaeyWCS6Mv4Mrp9fXCbvhHQRondDFj3n.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1773.method_19418().method_19326();
        float f = m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge();
        if (class_12972 instanceof m$$2qErw1H3B7hswOELuKyRsyvbxRPeGh63NPU5RSdfJqpCWaJkfS4hSbNAViYHk3CEtWN2lZ05QNPhusCos8D2FINNWybSc104h) {
            f = 1.0f;
        }
        double d = class_3532.method_16436((double)f, (double)class_12972.field_6038, (double)class_12972.method_23317()) - class_2432.field_1352;
        double d2 = class_3532.method_16436((double)f, (double)class_12972.field_5971, (double)class_12972.method_23318()) - class_2432.field_1351;
        double d3 = class_3532.method_16436((double)f, (double)class_12972.field_5989, (double)class_12972.method_23321()) - class_2432.field_1350;
        class_897 class_8972 = m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().method_3953(class_12972);
        class_10017 class_100172 = class_8972.method_62425(class_12972, f);
        m$$T15vd92SGo4ioRoaknO5bXBgWzPiXSnJlOFM04YEWPn30wyjgOVG4gmnZO4ZEF8MXmaeyWCS6Mv4Mrp9fXCbvhHQRondDFj3n.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_100172);
        class_243 class_2433 = class_8972.method_23169(class_100172);
        double d4 = d + class_2433.method_10216();
        double d5 = d2 + class_2433.method_10214();
        double d6 = d3 + class_2433.method_10215();
        class_45872.method_22903();
        class_45872.method_22904(d4, d5, d6);
        m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ = true;
        class_8972.method_3936(class_100172, class_45872, (class_4597)m$$LJhdoWhAbaYPKpepd15lX8TdbpFURsg82QJMhFxPKkGBOib32hAk52WA5k1MaXOpDXHjRegrSKslfbF97f86FKWrOwS4dVBkp.m$$tadIc0miU0GKBGnr1k1V3uZPkzWZ8ycs8gFfAukzGwOYX6BbJEAEsPzp9YUiQwAcqONxpAF7Fhp9zmmuG9IqxQqwzC6RyjyE2, 0);
        m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ = false;
        class_45872.method_22909();
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Color color, Color color2) {
        m$$GaQVh8h3M2jkViVsHncVRsxLo5hklicn348yniYlmmkTzJ3bwPnOip66sXH2R5HYEPIM4QinqqyunNM3zUuxEDYbKOXQ6LDDl.m$$0a6satRcVmfiZwanl0RgzcMCb0erhZREX3tKsob6XE1D4QKMc68LuPqxPdhcvQymN439ibhFWuDkCK4ezfpJrVIkGLaGWuoTq(color2);
        m$$GaQVh8h3M2jkViVsHncVRsxLo5hklicn348yniYlmmkTzJ3bwPnOip66sXH2R5HYEPIM4QinqqyunNM3zUuxEDYbKOXQ6LDDl.m$$q60MFbe6wdivWp4kRCKnlZZPlYEn3tV4kfyfYvLxmOjTDK7AxLlTtFsQ579mT62x8LKzvOCLsSewKyc0PBtW1vCddwE5OeN7R(color);
    }

    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62
    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$S6pjT3LMgZUuwtTIlHrN0Ko9uzCTDbTvpS5fceqBjEqEjllFYGfVsIPpBOXVHhdUkQuqRw6JmI7KHNS2uAHK1hM59Bcq8Rejb m$$S6pjT3LMgZUuwtTIlHrN0Ko9uzCTDbTvpS5fceqBjEqEjllFYGfVsIPpBOXVHhdUkQuqRw6JmI7KHNS2uAHK1hM59Bcq8Rejb) {
        class_620 class_6202;
        if (!m$$T15vd92SGo4ioRoaknO5bXBgWzPiXSnJlOFM04YEWPn30wyjgOVG4gmnZO4ZEF8MXmaeyWCS6Mv4Mrp9fXCbvhHQRondDFj3n.m$$gBZrJHVB95uSF86fYGkSXayDfoy6524TpXYJtg8PqOd8PtNe1p2LOC9DGsUio8RzZC0QLPbvE9jb0ZloygzRVH4QKihpogQHC()) {
            return;
        }
        class_897 class_8972 = m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().method_3953((class_1297)m$$S6pjT3LMgZUuwtTIlHrN0Ko9uzCTDbTvpS5fceqBjEqEjllFYGfVsIPpBOXVHhdUkQuqRw6JmI7KHNS2uAHK1hM59Bcq8Rejb.m$$v0LuFswFKQSjXtMCGtrAVQ8FU1mS3wOgcAMnRVV2dc7usGG9qPXQwUcgmJ0Oqrezxi8gDPdDQtOfNCOkrMEdPHBkFRT8Pcknm());
        if (!(class_8972 instanceof class_922)) {
            return;
        }
        class_922 class_9222 = (class_922)class_8972;
        class_583 class_5832 = class_9222.method_4038();
        if (class_5832 instanceof class_620) {
            class_6202 = (class_620)class_5832;
            boolean bl = class_6202.field_27529.field_38456 = m$$S6pjT3LMgZUuwtTIlHrN0Ko9uzCTDbTvpS5fceqBjEqEjllFYGfVsIPpBOXVHhdUkQuqRw6JmI7KHNS2uAHK1hM59Bcq8Rejb.m$$VQQSW9GbXlljQWBOHxDEKQlr52IbhtvvJ7by44tphw0XqecLDFQ0OIHJupuubwT52Vv5FNxkJpdf322ud01iuJLeX88yX3FOx() == m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$sQwB8Gn4SsL46dO2Upi4yBLYPCnKWOlOaSGrxKbwA1RWaIibNyrn6OSioUC20gJrJQ0HrgfZY1nKYe7wPwvGZ4a6oZ3eJBH69;
        }
        if (class_5832 instanceof class_622) {
            class_6202 = (class_622)class_5832;
            class_6202.field_52945.field_38456 = m$$S6pjT3LMgZUuwtTIlHrN0Ko9uzCTDbTvpS5fceqBjEqEjllFYGfVsIPpBOXVHhdUkQuqRw6JmI7KHNS2uAHK1hM59Bcq8Rejb.m$$VQQSW9GbXlljQWBOHxDEKQlr52IbhtvvJ7by44tphw0XqecLDFQ0OIHJupuubwT52Vv5FNxkJpdf322ud01iuJLeX88yX3FOx() == m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$sQwB8Gn4SsL46dO2Upi4yBLYPCnKWOlOaSGrxKbwA1RWaIibNyrn6OSioUC20gJrJQ0HrgfZY1nKYe7wPwvGZ4a6oZ3eJBH69;
        }
    }

    public static void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_10017 class_100172) {
        class_10034 class_100342;
        class_100172.field_53335 = false;
        class_100172.field_53337 = null;
        class_100172.field_53324 = null;
        if (class_100172 instanceof class_10034) {
            class_100342 = (class_10034)class_100172;
            class_100342.field_55309 = class_1799.field_8037;
            class_100342.field_53418 = class_1799.field_8037;
            class_100342.field_53419 = class_1799.field_8037;
            class_100342.field_53420 = class_1799.field_8037;
        }
        if (class_100172 instanceof class_10055) {
            class_100342 = (class_10055)class_100172;
            boolean bl = !(m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_10017)class_100342) instanceof m$$2qErw1H3B7hswOELuKyRsyvbxRPeGh63NPU5RSdfJqpCWaJkfS4hSbNAViYHk3CEtWN2lZ05QNPhusCos8D2FINNWybSc104h);
            class_100342.field_53532 = false;
            class_100342.field_53543 = bl;
            class_100342.field_53544 = bl;
            class_100342.field_53545 = bl;
            class_100342.field_53546 = bl;
            class_100342.field_53530 = bl;
            class_100342.field_53531 = bl;
        }
    }

    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62(m$$V2Krh115dTil6CiDCChVxOfigKboUspdAAlSAGlM4OpVZIlKf1g2UO0CWiplcxxbxwWvjLygNFDkENfQ5lr9gS5JL6cOWS6qa=-9999)
    public static void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk) {
        m$$T15vd92SGo4ioRoaknO5bXBgWzPiXSnJlOFM04YEWPn30wyjgOVG4gmnZO4ZEF8MXmaeyWCS6Mv4Mrp9fXCbvhHQRondDFj3n.m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO();
    }

    public static void m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(double d) {
        m$$GaQVh8h3M2jkViVsHncVRsxLo5hklicn348yniYlmmkTzJ3bwPnOip66sXH2R5HYEPIM4QinqqyunNM3zUuxEDYbKOXQ6LDDl.m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf((float)d);
    }

    public static void m$$7JJuLGWfAcxlaixtJCI2nIliq8FFjM2Yipq1wHwOY4t0Wo86zToPIaI3ikJDLyADIEkY6z8tnwkrbPgAFo3yhGKASuwrTt4LO() {
        m$$4rzGEdASve2OAJIwx7ibviRce6rIrKcMqoi7mwJlN19LxakWNlZcOaSHyE6VRZ5T8e8Dvdu1Luk7kCFxEFDnxLqAjVDHSIArb.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$4rzGEdASve2OAJIwx7ibviRce6rIrKcMqoi7mwJlN19LxakWNlZcOaSHyE6VRZ5T8e8Dvdu1Luk7kCFxEFDnxLqAjVDHSIArb.m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2, m$$4rzGEdASve2OAJIwx7ibviRce6rIrKcMqoi7mwJlN19LxakWNlZcOaSHyE6VRZ5T8e8Dvdu1Luk7kCFxEFDnxLqAjVDHSIArb.m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc);
        GL32C.glEnable((int)2848);
        GL32C.glLineWidth((float)m$$GaQVh8h3M2jkViVsHncVRsxLo5hklicn348yniYlmmkTzJ3bwPnOip66sXH2R5HYEPIM4QinqqyunNM3zUuxEDYbKOXQ6LDDl.m$$hn7VeD1Knn6e2RiKjgdLVBztu5wgfP99ezY6n4TYcWiKneUTVX6Rdp5axip4P1KaAQjlUUWQAcQ59bAHu0iUOEUPCG1kYWzl0());
        m$$hXF9Wica9zBZra21yH7jvRILZV3NL1s1tn9k83EJ1cXMIssxQ12KyDEFnOA2kEduqS1D7d6n67KLulHSKFZhhzV5bniUilG1G.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_1921.method_51784());
        m$$xEte45wk0NIx0JPzdqpWIzMz2VtkITqCOJ7246Cle0S0BrOBmjQZzC6MFtHg7GvEpErQES6dUOvzeqo0hzaYmRuiwCbdBRFFJ.m$$zPcIAFBcd6UcuqQvRCrqNzWJkbTDnGIFde1HeInyvQMygaChyIfFfSVrf7ynroMxuheKMmOFt6fJC7fVIZA3DCWtlDAcGJuqY();
        m$$hXF9Wica9zBZra21yH7jvRILZV3NL1s1tn9k83EJ1cXMIssxQ12KyDEFnOA2kEduqS1D7d6n67KLulHSKFZhhzV5bniUilG1G.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$tjFXe97uNc2AC6AdkNJ3RB6mWdEdDPxZwYLOLd785PnWZ7vnsdhG81QEo4IOTpr6394y7SxzldYBwYmKObrDPu2kNgDwI8IaP());
        m$$E5JKhJ8EhDZt1xQeUgqjC3TL2kGTmA2ppjYqCYSZ58MtGWCwBvKaXbQVD0yujwmkHlfFnH0JnfRAubRLoJRYfaQsLVNpbBorD.m$$zPcIAFBcd6UcuqQvRCrqNzWJkbTDnGIFde1HeInyvQMygaChyIfFfSVrf7ynroMxuheKMmOFt6fJC7fVIZA3DCWtlDAcGJuqY();
        RenderSystem.lineWidth((float)1.0f);
        m$$4rzGEdASve2OAJIwx7ibviRce6rIrKcMqoi7mwJlN19LxakWNlZcOaSHyE6VRZ5T8e8Dvdu1Luk7kCFxEFDnxLqAjVDHSIArb.reset();
    }

    public static boolean m$$gBZrJHVB95uSF86fYGkSXayDfoy6524TpXYJtg8PqOd8PtNe1p2LOC9DGsUio8RzZC0QLPbvE9jb0ZloygzRVH4QKihpogQHC() {
        return m$$kNEGcrz1kHDXQgy2b1kwkUs7oKrlyxckaDo0nEhwzIGkjMZG8Ue4KR3yAsShfnaS7O8uf0T5xHr3PRwlUCxuJ7SHTQZEnAQwJ;
    }
}

