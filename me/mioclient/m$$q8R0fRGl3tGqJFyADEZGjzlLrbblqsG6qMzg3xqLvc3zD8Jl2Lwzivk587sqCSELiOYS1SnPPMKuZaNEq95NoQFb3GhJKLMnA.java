package me.mioclient;

import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import me.mioclient.m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y;
import me.mioclient.m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45;
import me.mioclient.m$$hXF9Wica9zBZra21yH7jvRILZV3NL1s1tn9k83EJ1cXMIssxQ12KyDEFnOA2kEduqS1D7d6n67KLulHSKFZhhzV5bniUilG1G;
import me.mioclient.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB;
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_4587;
import net.minecraft.class_5481;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11C;

public class m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA {
    public static final m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV = m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y.m$$0ly4isl9mzmwmWPbHwURy1txlOD9vXveQrqodCESzpEM1DuvZ52j6LTeqldbZZy89V2Hgudo82FPF5ov7e6wtubTXjTdLf8ng();
    public static final m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m = m$$URmAkB1gzEbp8basfn0vsne4s2gkDNZKNzGARF9S5Owfpc9XVHZ7dIICKUPBg5EvuVdaNw81BvSmvCDjbFwRyexjITVNaEs2y.m$$0ly4isl9mzmwmWPbHwURy1txlOD9vXveQrqodCESzpEM1DuvZ52j6LTeqldbZZy89V2Hgudo82FPF5ov7e6wtubTXjTdLf8ng();
    public static float m$$c9jMbh1IiMTQCK9gtzGzmtRJWOHNyvtwv63vKB8VWyFFRbuOOxz3IzKGfz0bWCYpEFddpIzL6jSeJHHuWBLKPZQyHokMEeEqE = 1.0f;

    static {
        m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(VertexFormat.class_5596.field_27382, class_290.field_1576);
        m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(VertexFormat.class_5596.field_29344, class_290.field_1576);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4587 class_45872, String string, int n, int n2, int n3, boolean bl) {
        class_310.method_1551().field_1772.method_27521(string, (float)n, (float)n2, n3, bl, class_45872.method_23760().method_23761(), m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.m$$0EamhOBKO53b7FTInsEKAyYgGGs1ndX2QqsiesT60uJawO4khwrKtVpAJczxbf1xb9KFfXAnXjgyrkilgORYZDqRlXryxl2MO.m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4().m$$0xL93CWXWidqH1qjkzS4fx8z1UEcvehtQyD7PIyX5Nrbqu7DGi4odMlUb09IEaHU7vaDVtsZ86wuyftV7ctWAC116YGmet2xZ(-301556930), class_327.class_6415.field_33993, 0, 0xF000F0);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Matrix4f matrix4f, float f, float f2, float f3, float f4, int ... nArray) {
        if (nArray.length < 2) {
            return;
        }
        float[][] fArray = new float[nArray.length][4];
        for (int i = 0; i < nArray.length; ++i) {
            fArray[i] = new float[]{(float)(nArray[i] >> 24 & 0xFF) / 255.0f, (float)(nArray[i] >> 16 & 0xFF) / 255.0f, (float)(nArray[i] >> 8 & 0xFF) / 255.0f, (float)(nArray[i] & 0xFF) / 255.0f};
        }
        float f5 = f3 / (float)nArray.length;
        for (int i = 1; i < nArray.length; ++i) {
            float f6 = i == nArray.length - 1 ? f3 : f5 * (float)i;
            m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.method_22918(matrix4f, f + f6, f2, 0.0f).method_22915(fArray[i][1], fArray[i][2], fArray[i][3], fArray[i][0]);
            m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.method_22918(matrix4f, f + f5 * (float)(i - 1), f2, 0.0f).method_22915(fArray[i - 1][1], fArray[i - 1][2], fArray[i - 1][3], fArray[i - 1][0]);
            m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.method_22918(matrix4f, f + f5 * (float)(i - 1), f2 + f4, 0.0f).method_22915(fArray[i - 1][1], fArray[i - 1][2], fArray[i - 1][3], fArray[i - 1][0]);
            m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.method_22918(matrix4f, f + f6, f2 + f4, 0.0f).method_22915(fArray[i][1], fArray[i][2], fArray[i][3], fArray[i][0]);
        }
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4587 class_45872, float f, float f2, float f3, float f4, int n, int n2) {
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_45872.method_23760().method_23761(), f, f2, f3, f4, n, n, n2, n2);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, Color color) {
        int n = color.hashCode();
        float f6 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f8 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f9 = (float)(n & 0xFF) / 255.0f;
        if (f6 == 0.0f) {
            return;
        }
        m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m.method_22918(class_45872.method_23760().method_23761(), f, f4, 0.0f).method_22915(f7, f8, f9, f6);
        m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m.method_22918(class_45872.method_23760().method_23761(), f3, f4, 0.0f).method_22915(f7, f8, f9, f6);
        m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m.method_22918(class_45872.method_23760().method_23761(), f3, f4, 0.0f).method_22915(f7, f8, f9, f6);
        m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m.method_22918(class_45872.method_23760().method_23761(), f3, f2, 0.0f).method_22915(f7, f8, f9, f6);
        m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m.method_22918(class_45872.method_23760().method_23761(), f3, f2, 0.0f).method_22915(f7, f8, f9, f6);
        m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m.method_22918(class_45872.method_23760().method_23761(), f, f2, 0.0f).method_22915(f7, f8, f9, f6);
        m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m.method_22918(class_45872.method_23760().method_23761(), f, f2, 0.0f).method_22915(f7, f8, f9, f6);
        m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m.method_22918(class_45872.method_23760().method_23761(), f, f4, 0.0f).method_22915(f7, f8, f9, f6);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4587 class_45872, class_5481 class_54812, int n, int n2, int n3, boolean bl) {
        class_310.method_1551().field_1772.method_22942(class_54812, (float)n, (float)n2, n3, bl, class_45872.method_23760().method_23761(), m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.m$$0EamhOBKO53b7FTInsEKAyYgGGs1ndX2QqsiesT60uJawO4khwrKtVpAJczxbf1xb9KFfXAnXjgyrkilgORYZDqRlXryxl2MO.m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4().m$$0xL93CWXWidqH1qjkzS4fx8z1UEcvehtQyD7PIyX5Nrbqu7DGi4odMlUb09IEaHU7vaDVtsZ86wuyftV7ctWAC116YGmet2xZ(-301556930), class_327.class_6415.field_33993, 0, 0xF000F0);
    }

    public static void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Matrix4f matrix4f, float f, float f2, float f3, float f4, int n, int n2, int n3, int n4) {
        m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.method_22918(matrix4f, f, f2 + f4, 0.0f).method_39415(n4);
        m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_39415(n3);
        m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.method_22918(matrix4f, f + f3, f2, 0.0f).method_39415(n2);
        m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.method_22918(matrix4f, f, f2, 0.0f).method_39415(n);
    }

    public static void m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(class_4587 class_45872, float f, float f2, float f3, float f4, Color color) {
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T(class_45872, f, f3, f2 + f4, f3 + f4, color);
    }

    public static void m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB() {
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz(true);
    }

    public static void m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP(class_4587 class_45872, float f, float f2, float f3, float f4, Color color) {
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(class_45872, f, f3, f2, 1.0f, color);
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(class_45872, f3, f2, f4, 1.0f, color);
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(class_45872, f, f3, f4, 1.0f, color);
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(class_45872, f, f2, f4, 1.0f, color);
    }

    public static void m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T(class_4587 class_45872, float f, float f2, float f3, float f4, Color color) {
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_45872, f, f2, f3, f4, color.hashCode());
    }

    public static void m$$VBwkgcl0rGho4ES7mWprsV2OzLphg9yLQNRYmPzcShJubmrcnxC6FlBD3OHXQSj46PZsrAly6NUrLD5MSMQardKMRD4yJDNDz(boolean bl) {
        m$$hXF9Wica9zBZra21yH7jvRILZV3NL1s1tn9k83EJ1cXMIssxQ12KyDEFnOA2kEduqS1D7d6n67KLulHSKFZhhzV5bniUilG1G.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_1921.method_51784());
        m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.m$$zPcIAFBcd6UcuqQvRCrqNzWJkbTDnGIFde1HeInyvQMygaChyIfFfSVrf7ynroMxuheKMmOFt6fJC7fVIZA3DCWtlDAcGJuqY();
        m$$hXF9Wica9zBZra21yH7jvRILZV3NL1s1tn9k83EJ1cXMIssxQ12KyDEFnOA2kEduqS1D7d6n67KLulHSKFZhhzV5bniUilG1G.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA());
        GL11C.glLineWidth((float)m$$c9jMbh1IiMTQCK9gtzGzmtRJWOHNyvtwv63vKB8VWyFFRbuOOxz3IzKGfz0bWCYpEFddpIzL6jSeJHHuWBLKPZQyHokMEeEqE);
        m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m.m$$zPcIAFBcd6UcuqQvRCrqNzWJkbTDnGIFde1HeInyvQMygaChyIfFfSVrf7ynroMxuheKMmOFt6fJC7fVIZA3DCWtlDAcGJuqY();
        GL11C.glLineWidth((float)1.0f);
        if (bl) {
            m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.m$$0EamhOBKO53b7FTInsEKAyYgGGs1ndX2QqsiesT60uJawO4khwrKtVpAJczxbf1xb9KFfXAnXjgyrkilgORYZDqRlXryxl2MO.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB();
        }
    }

    public static void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_4587 class_45872, float f, float f2, float f3, float f4, int n, int n2) {
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_45872.method_23760().method_23761(), f, f2, f3, f4, n, n2, n2, n);
    }

    public static void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_4587 class_45872, float f, float f2, float f3, float f4, int n) {
        float f5 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n & 0xFF) / 255.0f;
        if (f5 == 0.0f) {
            return;
        }
        m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.method_22918(class_45872.method_23760().method_23761(), f, f4, 0.0f).method_22915(f6, f7, f8, f5);
        m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.method_22918(class_45872.method_23760().method_23761(), f3, f4, 0.0f).method_22915(f6, f7, f8, f5);
        m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.method_22918(class_45872.method_23760().method_23761(), f3, f2, 0.0f).method_22915(f6, f7, f8, f5);
        m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV.method_22918(class_45872.method_23760().method_23761(), f, f2, 0.0f).method_22915(f6, f7, f8, f5);
    }

    public static void m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(class_4587 class_45872, float f, float f2, float f3, float f4, Color color) {
        m$$q8R0fRGl3tGqJFyADEZGjzlLrbblqsG6qMzg3xqLvc3zD8Jl2Lwzivk587sqCSELiOYS1SnPPMKuZaNEq95NoQFb3GhJKLMnA.m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T(class_45872, f, f2 + f4, f + f4, f3, color);
    }
}

