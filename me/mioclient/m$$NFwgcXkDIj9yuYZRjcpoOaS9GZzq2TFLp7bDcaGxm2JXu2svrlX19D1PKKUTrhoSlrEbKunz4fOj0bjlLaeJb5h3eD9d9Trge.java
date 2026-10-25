package me.mioclient;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import me.mioclient.m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y;
import me.mioclient.m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45;
import me.mioclient.m$$hXF9Wica9zBZra21yH7jvRILZV3NL1s1tn9k83EJ1cXMIssxQ12KyDEFnOA2kEduqS1D7d6n67KLulHSKFZhhzV5bniUilG1G;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL32C;

public final class m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public static final m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y m$$YkyyJIBLlDS6eDphfBDFBaffPthycUjQSAlfDrKB9xraKoZgQP9iFQ7gv9H4RzK8tCKzz8zACnSRKfYa98xO3HgpIfGYIMOlS = m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y.m$$0ly4isl9mzmwmWPbHwURy1txlOD9vXveQrqodCESzpEM1DuvZ52j6LTeqldbZZy89V2Hgudo82FPF5ov7e6wtubTXjTdLf8ng();
    public static class_4587 m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS;

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo) {
        m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo.m$$VqDc0eTAgzOPC4IU6WwZsiqEa0qk7QNmclpi6XPMtzLLBOqLUU9iWXMcrWVjw6jLdGlqrsVBwx7XuPXLTWk6HGDHuk8aGSTUx());
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_243 class_2432, Color color) {
        class_4184 class_41842 = m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1773.method_19418();
        class_243 class_2433 = new class_243(0.0, 0.0, 1.0);
        class_2433 = class_2433.method_1037(-((float)Math.toRadians(class_41842.method_19329())));
        class_2433 = class_2433.method_1024(-((float)Math.toRadians(class_41842.method_19330())));
        class_2433 = class_2433.method_1019(m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326());
        m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2433, class_2432, color);
    }

    public static Vector3f m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(float f, float f2, float f3) {
        Vector3f vector3f = new Vector3f(f, f2, f3);
        Matrix4f matrix4f = m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS.method_23760().method_23761();
        Matrix4f matrix4f2 = RenderSystem.getProjectionMatrix();
        Matrix4f matrix4f3 = new Matrix4f((Matrix4fc)matrix4f2).mul((Matrix4fc)matrix4f);
        Matrix4f matrix4f4 = new Matrix4f((Matrix4fc)matrix4f3).invert();
        Vector4f vector4f = matrix4f3.transform(new Vector4f((Vector3fc)vector3f, 1.0f));
        if (vector4f.w < 0.0f) {
            Vector2f vector2f = new Vector2f(vector4f.x, vector4f.y).div(vector4f.w).normalize();
            if (vector2f.x == 0.0f || vector2f.y == 0.0f) {
                return vector3f;
            }
            float f4 = Math.min(1.0f / Math.abs(vector2f.x), 1.0f / Math.abs(vector2f.y));
            Vector2f vector2f2 = new Vector2f(vector2f.x * f4, vector2f.y * f4);
            Vector4f vector4f2 = new Vector4f(vector2f2.x, vector2f2.y, vector4f.z / vector4f.w, 1.0f);
            vector4f2.mul((Matrix4fc)matrix4f4);
            if (vector4f2.w == 0.0f) {
                return vector3f;
            }
            Vector3f vector3f2 = new Vector3f(vector4f2.x, vector4f2.y, vector4f2.z).div(vector4f2.w);
            return vector3f2;
        }
        return vector3f;
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_243 class_2432, class_243 class_2433, Color color) {
        m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350, color, true, false);
        m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2433.field_1352, class_2433.field_1351, class_2433.field_1350, color, true, true);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(double d, double d2, double d3, Color color) {
        m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(d, d2, d3, color, false, false);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(double d, double d2, double d3, Color color, boolean bl, boolean bl2) {
        if (bl) {
            d = (float)(d - m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10216());
            d2 = (float)(d2 - m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10214());
            d3 = (float)(d3 - m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1561().field_4686.method_19326().method_10215());
        }
        if (bl2) {
            Vector3f vector3f = m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((float)d, (float)d2, (float)d3);
            d = vector3f.x;
            d2 = vector3f.y;
            d3 = vector3f.z;
        }
        m$$YkyyJIBLlDS6eDphfBDFBaffPthycUjQSAlfDrKB9xraKoZgQP9iFQ7gv9H4RzK8tCKzz8zACnSRKfYa98xO3HgpIfGYIMOlS.method_56824(m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS.method_23760(), (float)d, (float)d2, (float)d3).method_39415(color.hashCode());
    }

    public static void m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(class_4587 class_45872) {
        m$$YkyyJIBLlDS6eDphfBDFBaffPthycUjQSAlfDrKB9xraKoZgQP9iFQ7gv9H4RzK8tCKzz8zACnSRKfYa98xO3HgpIfGYIMOlS.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(VertexFormat.class_5596.field_29344, class_290.field_1576);
        m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS = class_45872;
    }

    public static void m$$0cBEPKLQ6ab3e3WeUfQruAmLQn3tNYkGsamIWSNohC86wrKuXbylyfyX42FkUVrpNF7Wyrt5ZwJsA75e04SfeymRi5xbu8gbI(float f) {
        GL32C.glLineWidth((float)f);
        GL32C.glLineWidth((float)f);
        GL32C.glEnable((int)2848);
        m$$hXF9Wica9zBZra21yH7jvRILZV3NL1s1tn9k83EJ1cXMIssxQ12KyDEFnOA2kEduqS1D7d6n67KLulHSKFZhhzV5bniUilG1G.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA());
        m$$YkyyJIBLlDS6eDphfBDFBaffPthycUjQSAlfDrKB9xraKoZgQP9iFQ7gv9H4RzK8tCKzz8zACnSRKfYa98xO3HgpIfGYIMOlS.m$$zPcIAFBcd6UcuqQvRCrqNzWJkbTDnGIFde1HeInyvQMygaChyIfFfSVrf7ynroMxuheKMmOFt6fJC7fVIZA3DCWtlDAcGJuqY();
        GL32C.glLineWidth((float)1.0f);
    }
}

