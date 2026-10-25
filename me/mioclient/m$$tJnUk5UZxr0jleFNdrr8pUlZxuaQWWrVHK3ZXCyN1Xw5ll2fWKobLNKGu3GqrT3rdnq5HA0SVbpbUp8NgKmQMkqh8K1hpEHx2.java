package me.mioclient;

import com.mojang.blaze3d.vertex.VertexFormat;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.Color;
import java.util.Comparator;
import java.util.List;
import me.mioclient.m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y;
import me.mioclient.m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45;
import me.mioclient.m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN;
import me.mioclient.m$$hXF9Wica9zBZra21yH7jvRILZV3NL1s1tn9k83EJ1cXMIssxQ12KyDEFnOA2kEduqS1D7d6n67KLulHSKFZhhzV5bniUilG1G;
import me.mioclient.m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA;
import me.mioclient.m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_290;
import net.minecraft.class_4587;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL32C;

public final class m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public static final m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP = m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y.m$$0ly4isl9mzmwmWPbHwURy1txlOD9vXveQrqodCESzpEM1DuvZ52j6LTeqldbZZy89V2Hgudo82FPF5ov7e6wtubTXjTdLf8ng();
    public static final m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB = m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y.m$$0ly4isl9mzmwmWPbHwURy1txlOD9vXveQrqodCESzpEM1DuvZ52j6LTeqldbZZy89V2Hgudo82FPF5ov7e6wtubTXjTdLf8ng();
    public static final List m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ = new ObjectArrayList();

    static {
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.class);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(VertexFormat.class_5596.field_27382, class_290.field_1576);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(VertexFormat.class_5596.field_29344, class_290.field_1576);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4587 class_45872, class_238 class_2383, Color color, float f) {
        if (color.getAlpha() == 0) {
            return;
        }
        if (f <= 0.0f) {
            return;
        }
        m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ.add(m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_45872, class_2383, m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(color), f));
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8) {
        Matrix4f matrix4f = m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$47intHn7pQnresgcjyBQNFrnG2bD6It91S8u1EoxsBu535T0LYjAaSqlAJUNjhygU6PE8KATWamVaUs9km1zRS5zfxULalLbb;
        Matrix3f matrix3f = m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$4mV71x6TnDXp6oZYX54aoSNictrBDI242SullAd3twzyQU7YpzqCpbyYiEIZ6ULJjlaj8sd1F2jHeQqsBmV9gsu7MgM3UtgyL;
        float f = (float)(m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$i4yGEMk3sa48YZRGIaX8lxM7aqv99Ac60qplWkw6khqrYq0VpaQbkFhEIFiAsvsU1KNZorRlyuuBC3sdnnFDIZqxG0ePzAx2U.field_1323 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10216());
        float f2 = (float)(m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$i4yGEMk3sa48YZRGIaX8lxM7aqv99Ac60qplWkw6khqrYq0VpaQbkFhEIFiAsvsU1KNZorRlyuuBC3sdnnFDIZqxG0ePzAx2U.field_1322 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10214());
        float f3 = (float)(m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$i4yGEMk3sa48YZRGIaX8lxM7aqv99Ac60qplWkw6khqrYq0VpaQbkFhEIFiAsvsU1KNZorRlyuuBC3sdnnFDIZqxG0ePzAx2U.field_1321 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10215());
        float f4 = (float)(m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$i4yGEMk3sa48YZRGIaX8lxM7aqv99Ac60qplWkw6khqrYq0VpaQbkFhEIFiAsvsU1KNZorRlyuuBC3sdnnFDIZqxG0ePzAx2U.field_1320 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10216());
        float f5 = (float)(m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$i4yGEMk3sa48YZRGIaX8lxM7aqv99Ac60qplWkw6khqrYq0VpaQbkFhEIFiAsvsU1KNZorRlyuuBC3sdnnFDIZqxG0ePzAx2U.field_1325 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10214());
        float f6 = (float)(m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$i4yGEMk3sa48YZRGIaX8lxM7aqv99Ac60qplWkw6khqrYq0VpaQbkFhEIFiAsvsU1KNZorRlyuuBC3sdnnFDIZqxG0ePzAx2U.field_1324 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10215());
        int n = m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$EKAr7sgIHDfloeMQ3kzG7A2hJVLrt3UXGVdSxR2nm43EXAz9LxMfeat4WgQLZ8BbXGdxPIj34G5TtaGmkEcu3pZZAEzeaIv3y.hashCode();
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f, f2, f3).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f4, f2, f3).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f, f2, f3).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f, f5, f3).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f, f2, f3).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f, f2, f6).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f4, f2, f3).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f4, f5, f3).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f4, f5, f3).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f, f5, f3).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f, f5, f3).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f, f5, f6).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f, f5, f6).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f, f2, f6).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f, f2, f6).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f4, f2, f6).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f4, f2, f6).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f4, f2, f3).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f, f5, f6).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f4, f5, f6).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f4, f2, f6).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f4, f5, f6).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f4, f5, f3).method_39415(n);
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.method_22918(matrix4f, f4, f5, f6).method_39415(n);
    }

    @m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62(m$$V2Krh115dTil6CiDCChVxOfigKboUspdAAlSAGlM4OpVZIlKf1g2UO0CWiplcxxbxwWvjLygNFDkENfQ5lr9gS5JL6cOWS6qa=-9999)
    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk) {
        m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB();
        GL20.glDepthRange((double)0.0, (double)0.1);
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB();
        GL20.glDepthRange((double)0.0, (double)1.0);
    }

    public static Color m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Color color, float[] fArray) {
        return new Color((int)((float)color.getRed() * fArray[0]), (int)((float)color.getGreen() * fArray[1]), (int)((float)color.getBlue() * fArray[2]), (int)((float)color.getAlpha() * fArray[3]));
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4587 class_45872, class_238 class_2383, Color color) {
        if (color.getAlpha() == 0) {
            return;
        }
        float f = (float)(class_2383.field_1323 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10216());
        float f2 = (float)(class_2383.field_1322 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10214());
        float f3 = (float)(class_2383.field_1321 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10215());
        float f4 = (float)(class_2383.field_1320 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10216());
        float f5 = (float)(class_2383.field_1325 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10214());
        float f6 = (float)(class_2383.field_1324 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10215());
        int n = m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(color).hashCode();
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f2, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f2, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f2, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f2, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f5, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f5, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f5, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f5, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f2, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f5, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f5, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f2, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f2, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f5, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f5, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f2, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f2, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f2, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f5, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f5, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f2, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f2, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f5, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f5, f3).method_39415(n);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4587 class_45872, class_2338 class_23382, Color color) {
        m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_45872, new class_238(class_23382), color);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4587 class_45872, class_2338 class_23382, Color color, float f) {
        m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_45872, new class_238(class_23382), color, f);
    }

    public static void m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB() {
        m$$hXF9Wica9zBZra21yH7jvRILZV3NL1s1tn9k83EJ1cXMIssxQ12KyDEFnOA2kEduqS1D7d6n67KLulHSKFZhhzV5bniUilG1G.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$ex3E9Uqnm2SKgma03Hg9rvx8doMjvmpmicFgFPPSvJbpSVtUiB288ay3TQPlokB079oXcR0hq3QYBKq8XunpwhpYLDQXsKClT());
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.m$$zPcIAFBcd6UcuqQvRCrqNzWJkbTDnGIFde1HeInyvQMygaChyIfFfSVrf7ynroMxuheKMmOFt6fJC7fVIZA3DCWtlDAcGJuqY();
        m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ.sort(Comparator.comparing(m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 -> Float.valueOf(m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$ijYY4Qc5t83GePie1NGe2e8S2E8kHEm71L7eaMZKUdAEcIK8WRmCEbOCBZ9zi5GXGeBdex25R8JAjbPLwzQVnisaDli5hKFRH)));
        float f = 0.0f;
        for (m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82 : m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ) {
            if (m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82.m$$ijYY4Qc5t83GePie1NGe2e8S2E8kHEm71L7eaMZKUdAEcIK8WRmCEbOCBZ9zi5GXGeBdex25R8JAjbPLwzQVnisaDli5hKFRH != f) {
                m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$Tgq0ztYyeblZflLJ3YaWeIMwrPk1UBnIby8sM7FmZY2AtMPwc74W8b6Ro3RM9cutkIX4QMvj2D1YGxAPmgZS3xx5olprJX105();
            }
            f = m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82.m$$ijYY4Qc5t83GePie1NGe2e8S2E8kHEm71L7eaMZKUdAEcIK8WRmCEbOCBZ9zi5GXGeBdex25R8JAjbPLwzQVnisaDli5hKFRH;
            m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz(f);
            m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82);
        }
        m$$QVP0gsk24pxeOcZvnlzUlD3LSGBhLe4F0OXwLtOjzsXyY08fhghD3115va3GhCiRHon80thqRx0oww0Oq7tXaCyfBnfDRX0FQ.clear();
        m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$Tgq0ztYyeblZflLJ3YaWeIMwrPk1UBnIby8sM7FmZY2AtMPwc74W8b6Ro3RM9cutkIX4QMvj2D1YGxAPmgZS3xx5olprJX105();
    }

    public static void m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz(float f) {
        GL32C.glLineWidth((float)f);
        GL32C.glEnable((int)2848);
        GL32C.glHint((int)3154, (int)4354);
    }

    public static void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_4587 class_45872, class_238 class_2383, Color color) {
        if (color.getAlpha() == 0) {
            return;
        }
        float f = (float)(class_2383.field_1323 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10216());
        float f2 = (float)(class_2383.field_1322 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10214());
        float f3 = (float)(class_2383.field_1321 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10215());
        float f4 = (float)(class_2383.field_1320 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10216());
        float f5 = (float)(class_2383.field_1325 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10214());
        float f6 = (float)(class_2383.field_1324 - m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10215());
        int n = color.hashCode();
        int n2 = m$$g0hR7aOQHlJBpl52uHWuGTyo4ItjfIDYiBPoRi0jHn6KYFHC8W1cpUPjgW3MGo2rN5K178DEpfjyhUDFqjFHrBsnh8hwGH0yN.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(color, 0);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f2, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f2, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f2, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f2, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f2, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f5, f3).method_39415(n2);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f5, f3).method_39415(n2);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f2, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f2, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f5, f3).method_39415(n2);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f5, f6).method_39415(n2);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f2, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f2, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f2, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f4, f5, f6).method_39415(n2);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f5, f6).method_39415(n2);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f2, f3).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f2, f6).method_39415(n);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f5, f6).method_39415(n2);
        m$$6mO8kXVXkUPXbA8q17xu4RscWY4QvXSlt7pSjF6cXlchsnn22GaQXQt5F4Oy9J7ZAHf8zCuh8p7v0IEDTfyQ18GgL2MVg26EP.method_22918(class_45872.method_23760().method_23761(), f, f5, f3).method_39415(n2);
    }

    public static Color m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(Color color) {
        return m$$tJnUk5UZxr0jleFNdrr8pUlZxuaQWWrVHK3ZXCyN1Xw5ll2fWKobLNKGu3GqrT3rdnq5HA0SVbpbUp8NgKmQMkqh8K1hpEHx2.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(color, m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg());
    }

    public static void m$$Tgq0ztYyeblZflLJ3YaWeIMwrPk1UBnIby8sM7FmZY2AtMPwc74W8b6Ro3RM9cutkIX4QMvj2D1YGxAPmgZS3xx5olprJX105() {
        m$$hXF9Wica9zBZra21yH7jvRILZV3NL1s1tn9k83EJ1cXMIssxQ12KyDEFnOA2kEduqS1D7d6n67KLulHSKFZhhzV5bniUilG1G.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA());
        m$$qhfCqjzFIQILsfncqBUVE9H3iH2d53pzDvoIVgVUZ4nkJH6erOsOfu1fRawJOp51HU3FDgr44LRcaA9BDI4ctgQcPwZbLPgTB.m$$zPcIAFBcd6UcuqQvRCrqNzWJkbTDnGIFde1HeInyvQMygaChyIfFfSVrf7ynroMxuheKMmOFt6fJC7fVIZA3DCWtlDAcGJuqY();
        GL32C.glLineWidth((float)1.0f);
    }
}

