package me.mioclient;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$YsXNhQ7xCZVKwqTEQDjU3IULYhwMUtShwWKmtnE03pp8J2HmsN6t6yvCXj8TY2M4sTpzceyZAZEmcxBpeGeZlPP5vz4VJnzfl;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_151;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_3532;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo
extends Record
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82 {
    public final class_2350 m$$v0TInftxVsgsBc9fWpjtf6jZIyF4Wug4lMMralyeYL9E0erAf8NGBlQCsUV9ZnwHBk18zbeoCCwSDYKXZidCiGXW2vOScCVIO;
    public final class_243 m$$SyNCzvSTsrzVVSbvetDFgBufDAG5fr0aJ7QutnxVLgqNrnx5q591eCYu6uywU8yLExWRD1xB0Ii93EGarZCgmEKEHmXgMLs2C;
    public final class_265 m$$iljTM6MHfrVVxEdYGWjF6MrbKatSaWdqjh8Mcp8qUSEKEECIoWPz5T7k7dL8WTcXGad1W7SfoRatI8O4rs9yWedhOu3Febb9Q;

    public m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo(class_2350 class_23502, class_243 class_2432, class_265 class_2652) {
        this.m$$v0TInftxVsgsBc9fWpjtf6jZIyF4Wug4lMMralyeYL9E0erAf8NGBlQCsUV9ZnwHBk18zbeoCCwSDYKXZidCiGXW2vOScCVIO = class_23502;
        this.m$$SyNCzvSTsrzVVSbvetDFgBufDAG5fr0aJ7QutnxVLgqNrnx5q591eCYu6uywU8yLExWRD1xB0Ii93EGarZCgmEKEHmXgMLs2C = class_2432;
        this.m$$iljTM6MHfrVVxEdYGWjF6MrbKatSaWdqjh8Mcp8qUSEKEECIoWPz5T7k7dL8WTcXGad1W7SfoRatI8O4rs9yWedhOu3Febb9Q = class_2652;
    }

    public static m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$YsXNhQ7xCZVKwqTEQDjU3IULYhwMUtShwWKmtnE03pp8J2HmsN6t6yvCXj8TY2M4sTpzceyZAZEmcxBpeGeZlPP5vz4VJnzfl m$$YsXNhQ7xCZVKwqTEQDjU3IULYhwMUtShwWKmtnE03pp8J2HmsN6t6yvCXj8TY2M4sTpzceyZAZEmcxBpeGeZlPP5vz4VJnzfl, boolean bl) {
        class_243 class_2432;
        class_2350 class_23502 = m$$YsXNhQ7xCZVKwqTEQDjU3IULYhwMUtShwWKmtnE03pp8J2HmsN6t6yvCXj8TY2M4sTpzceyZAZEmcxBpeGeZlPP5vz4VJnzfl.m$$JtS6y3OKtFrQBGPhp1gae1DLvN1o1q0CdA2l8YvkOM7MOgIwqYlQCSkJtW7xplPv6MutK1dKT8LRXJ59kItBpnJbycC0MEz7C(-247158279);
        try {
            class_2432 = bl ? m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1(m$$YsXNhQ7xCZVKwqTEQDjU3IULYhwMUtShwWKmtnE03pp8J2HmsN6t6yvCXj8TY2M4sTpzceyZAZEmcxBpeGeZlPP5vz4VJnzfl.m$$jdxOLWRdiLxftWQKUh18YcpIz0GKCyUbO1ew13bHTKSUXDAv7U8GwVoGLYxCcFvPlGJXFBp5XPWdbXAhuNbtVjnJ36nImUHBa(65787460).method_10093(class_23502), 162674694) : m$$YsXNhQ7xCZVKwqTEQDjU3IULYhwMUtShwWKmtnE03pp8J2HmsN6t6yvCXj8TY2M4sTpzceyZAZEmcxBpeGeZlPP5vz4VJnzfl.m$$jdxOLWRdiLxftWQKUh18YcpIz0GKCyUbO1ew13bHTKSUXDAv7U8GwVoGLYxCcFvPlGJXFBp5XPWdbXAhuNbtVjnJ36nImUHBa(-570944470).method_10093(class_23502).method_46558();
        } catch (class_151 class_1512) {
            throw m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.a(class_1512);
        }
        class_243 class_2433 = class_2432;
        CallSite callSite = m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.a("\u00a2", (Object)m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.a("\u00a2", (Object)m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687, (Object)m$$YsXNhQ7xCZVKwqTEQDjU3IULYhwMUtShwWKmtnE03pp8J2HmsN6t6yvCXj8TY2M4sTpzceyZAZEmcxBpeGeZlPP5vz4VJnzfl.m$$jdxOLWRdiLxftWQKUh18YcpIz0GKCyUbO1ew13bHTKSUXDAv7U8GwVoGLYxCcFvPlGJXFBp5XPWdbXAhuNbtVjnJ36nImUHBa(853153086).method_10093(class_23502), (long)1904858070402375L), (Object)m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687, (Object)class_2338.field_10980, (long)1212777907416433L);
        return new m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo(class_23502, class_2433, (class_265)callSite);
    }

    public static class_243 m$$iundE9ZEO8yjuOY1ZivHkqcAs5RAg0wVllkVa4AODnyFqfDKm4i4a2wOkFTmfCv1HvHI0IQGbqKHT8dT1vYIxcWfGc2MU8jk1(class_2338 class_23382, int n) {
        return new class_243(class_3532.method_15350((double)m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.a("\u00a2", (Object)m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)1701304810701173L), (double)class_23382.method_10263(), (double)(class_23382.method_10263() + 1)), (double)class_23382.method_10264(), class_3532.method_15350((double)m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.a("\u00a2", (Object)m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724, (long)2106346809602596L), (double)class_23382.method_10260(), (double)(class_23382.method_10260() + 1)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.class, "a;b;c", "m$$v0TInftxVsgsBc9fWpjtf6jZIyF4Wug4lMMralyeYL9E0erAf8NGBlQCsUV9ZnwHBk18zbeoCCwSDYKXZidCiGXW2vOScCVIO", "m$$SyNCzvSTsrzVVSbvetDFgBufDAG5fr0aJ7QutnxVLgqNrnx5q591eCYu6uywU8yLExWRD1xB0Ii93EGarZCgmEKEHmXgMLs2C", "m$$iljTM6MHfrVVxEdYGWjF6MrbKatSaWdqjh8Mcp8qUSEKEECIoWPz5T7k7dL8WTcXGad1W7SfoRatI8O4rs9yWedhOu3Febb9Q"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.class, "a;b;c", "m$$v0TInftxVsgsBc9fWpjtf6jZIyF4Wug4lMMralyeYL9E0erAf8NGBlQCsUV9ZnwHBk18zbeoCCwSDYKXZidCiGXW2vOScCVIO", "m$$SyNCzvSTsrzVVSbvetDFgBufDAG5fr0aJ7QutnxVLgqNrnx5q591eCYu6uywU8yLExWRD1xB0Ii93EGarZCgmEKEHmXgMLs2C", "m$$iljTM6MHfrVVxEdYGWjF6MrbKatSaWdqjh8Mcp8qUSEKEECIoWPz5T7k7dL8WTcXGad1W7SfoRatI8O4rs9yWedhOu3Febb9Q"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.class, "a;b;c", "m$$v0TInftxVsgsBc9fWpjtf6jZIyF4Wug4lMMralyeYL9E0erAf8NGBlQCsUV9ZnwHBk18zbeoCCwSDYKXZidCiGXW2vOScCVIO", "m$$SyNCzvSTsrzVVSbvetDFgBufDAG5fr0aJ7QutnxVLgqNrnx5q591eCYu6uywU8yLExWRD1xB0Ii93EGarZCgmEKEHmXgMLs2C", "m$$iljTM6MHfrVVxEdYGWjF6MrbKatSaWdqjh8Mcp8qUSEKEECIoWPz5T7k7dL8WTcXGad1W7SfoRatI8O4rs9yWedhOu3Febb9Q"}, this, object);
    }

    public class_2350 m$$JtS6y3OKtFrQBGPhp1gae1DLvN1o1q0CdA2l8YvkOM7MOgIwqYlQCSkJtW7xplPv6MutK1dKT8LRXJ59kItBpnJbycC0MEz7C(int n) {
        return this.m$$v0TInftxVsgsBc9fWpjtf6jZIyF4Wug4lMMralyeYL9E0erAf8NGBlQCsUV9ZnwHBk18zbeoCCwSDYKXZidCiGXW2vOScCVIO;
    }

    public class_243 m$$hnelLjRLYFs7MtErv7d53L0idRqPohzdHK0QXYxkwI4rhoKl6rn9RX8AlyqZzl5F4CsqFhZR9zjkje1wzHGHDJb7d961qsjNz(int n) {
        return this.m$$SyNCzvSTsrzVVSbvetDFgBufDAG5fr0aJ7QutnxVLgqNrnx5q591eCYu6uywU8yLExWRD1xB0Ii93EGarZCgmEKEHmXgMLs2C;
    }

    public class_265 m$$wzBQz6hNIl4pyF8VmfdSlNIMFierWF5E7tq7k0hMH60sFHcUeSZmS2KSdDIc3HYUuEAkQhsy8m67tjENjKa4SdgOQfmJRgmJ7(int n) {
        return this.m$$iljTM6MHfrVVxEdYGWjF6MrbKatSaWdqjh8Mcp8qUSEKEECIoWPz5T7k7dL8WTcXGad1W7SfoRatI8O4rs9yWedhOu3Febb9Q;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.e = new Object[30];
                    m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.f = new String[30];
                    m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.a();
                    var4 = 6935228278959348285L;
                    var10_1 = new long[30];
                    var7_2 = 0;
                    var8_3 =  /* dynamic constant */ (String)m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.m$$GiUIE7OfNblcX29yTqQNmI1EMdGzzST5RviutfWF2OA2njPutIr61XEWkVZdCtrEOyV2clALcir8133nfdcKrIhA73j7WPJ8N("1e2mDGl7AKeKn9FIIraz", MethodHandles.lookup(), "m$$GiUIE7OfNblcX29yTqQNmI1EMdGzzST5RviutfWF2OA2njPutIr61XEWkVZdCtrEOyV2clALcir8133nfdcKrIhA73j7WPJ8N", m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.class, 1056048035);
                    var9_4 = var8_3.length();
                    var6_5 = 0;
                    while (true) {
                        var11_6 = var8_3.substring(var6_5, var6_5 += 8).getBytes( /* dynamic constant */ (String)m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.m$$GiUIE7OfNblcX29yTqQNmI1EMdGzzST5RviutfWF2OA2njPutIr61XEWkVZdCtrEOyV2clALcir8133nfdcKrIhA73j7WPJ8N("0voOLVa4WUog6sA4LO4I", MethodHandles.lookup(), "m$$GiUIE7OfNblcX29yTqQNmI1EMdGzzST5RviutfWF2OA2njPutIr61XEWkVZdCtrEOyV2clALcir8133nfdcKrIhA73j7WPJ8N", m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.class, 950542268));
                        v0 = var10_1;
                        v1 = var7_2++;
                        v2 = ((long)var11_6[0] & 255L) << 56 | ((long)var11_6[1] & 255L) << 48 | ((long)var11_6[2] & 255L) << 40 | ((long)var11_6[3] & 255L) << 32 | ((long)var11_6[4] & 255L) << 24 | ((long)var11_6[5] & 255L) << 16 | ((long)var11_6[6] & 255L) << 8 | (long)var11_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl17:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var6_5 < var9_4) ** continue;
                        var8_3 =  /* dynamic constant */ (String)m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.m$$GiUIE7OfNblcX29yTqQNmI1EMdGzzST5RviutfWF2OA2njPutIr61XEWkVZdCtrEOyV2clALcir8133nfdcKrIhA73j7WPJ8N("J39C3QSLXPp9KCfSY8Xv", MethodHandles.lookup(), "m$$GiUIE7OfNblcX29yTqQNmI1EMdGzzST5RviutfWF2OA2njPutIr61XEWkVZdCtrEOyV2clALcir8133nfdcKrIhA73j7WPJ8N", m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.class, 904642709);
                        var9_4 = var8_3.length();
                        var6_5 = 0;
                        while (true) {
                            var11_6 = var8_3.substring(var6_5, var6_5 += 8).getBytes( /* dynamic constant */ (String)m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.m$$GiUIE7OfNblcX29yTqQNmI1EMdGzzST5RviutfWF2OA2njPutIr61XEWkVZdCtrEOyV2clALcir8133nfdcKrIhA73j7WPJ8N("m7I9Iq2ujGMrplct2lkx", MethodHandles.lookup(), "m$$GiUIE7OfNblcX29yTqQNmI1EMdGzzST5RviutfWF2OA2njPutIr61XEWkVZdCtrEOyV2clALcir8133nfdcKrIhA73j7WPJ8N", m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.class, 355855684));
                            v0 = var10_1;
                            v1 = var7_2++;
                            v2 = ((long)var11_6[0] & 255L) << 56 | ((long)var11_6[1] & 255L) << 48 | ((long)var11_6[2] & 255L) << 40 | ((long)var11_6[3] & 255L) << 32 | ((long)var11_6[4] & 255L) << 24 | ((long)var11_6[5] & 255L) << 16 | ((long)var11_6[6] & 255L) << 8 | (long)var11_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var6_5 < var9_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var4;
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
            m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.c = var10_1;
            m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.d = new Integer[30];
            m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = -417165;
            break block10;
lbl47:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_7 = 9131148686794625714L;
        ** while (true)
        var0_8 = 7922425177110410248L ^ var2_7;
        m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)var0_8);
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3E9E;
        if (d[n2] == null) {
            m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.d[n2] = (int)(c[n2] ^ l);
        }
        return d[n2];
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "p\u0018(?@kp\u0018?cLdjS?}Lqm\"o$\u001e0";
        objectArray[1] = Double.TYPE;
        m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.f[1] = "java/lang/Double";
        objectArray[2] = "q\reP{{q\rr\fwtkFr\u0012wal7#M%*";
        objectArray[3] = Integer.TYPE;
        m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.f[3] = "java/lang/Integer";
        objectArray[4] = "\u0005\u0011R<\u0019s\u0005\u0011E`\u0015|\u001fZE~\u0015i\u0018+\u0011&B";
        objectArray[5] = "t\u000f\u0006XYfz\u0006AP^}7\u0007\f\u0011QXL\u0018F}WX-:\u001dXegq\u0002qRG{\\\u0018moy\u007fQSlyY^)8Z`Y:o!\u001eOV_* x\u0007rl-9\u0018oxOv=\u001bp[EL#LRqHK\u001fX\u0003gap$YFbFxXJA]]|RPD\u0004xq^Y}]";
        objectArray[6] = Long.TYPE;
        m$$GV15UTw3kLR82oGsw8ilqJtqU0uksvKxjy2ODAb5LdqeTy7Zjx5GibtnFYsv7NGRRKVFwnGcNFD9tFMvcaMtT6ADY4sJHJppo.f[6] = "java/lang/Long";
        objectArray[7] = "\u0005Ma\u000eP2\u000bD&\u0006W)FEkG`.0f'2\u000e%+r\u0019(N,<m\u001e'S\b[a\u001a/`5\u001fe\u001a\u0017j5\u001f\u007f\u0004\u000eM3-\u0018|\u0013Ie\"\u001a\u0007\u000eJ\u0013^\\y\u001aO\u001e0Bw7`o%\u001c<7I'\u000bM69x\u0007-E,\u001b{-\ro*9U\r8\u001d9\u0019\r\u000b\"F5\u0005U";
        objectArray[8] = "uj\u0001TA\u0017uj\u0016\bM\u0018o!\u0016\u0016M\rhPGI\u0019N";
        objectArray[9] = ";\u001eBk\u0004-;\u001eU7\b\"!UU)\b7&$\u0004sQt";
        objectArray[10] = "Ua\bX`bUa\u001f\u0004lmO*\u001f\u001alxH[MO?9";
        objectArray[11] = ";;\u0012tV ;;\u0005(Z/!p\u00056Z:&\u0001Tl\u000e";
        objectArray[12] = ">{:\rU'>{-QY($0-OY=#A|\u0017\u000b";
        objectArray[13] = "\u007f\u0012CK\u000f\u0013q\u001b\u0004C\b\b<\u001aI\u0002!*#B8r\u0011Oy;?\u001eT\u0013U\u0004\u001a\u001e\u000f\u0010c=\u0019W3Lg\u001c\u001eP-\u0004x\u000e_i\"=pB!B\u0017\u0019F\u000eZ|\f\u0004'0\u0004D\u0012\u0012T.\u001ePQ2U%?m0:e\u0019*E(:VN\u0019`+\nq\u0016 R2JS34\u0012\u00156Z=\u001dV\t";
        objectArray[14] = "\".Z\u0002\u0004\u0018\".M^\b\u00178eM@\b\u0002?\u0014\u0018\u001fQ";
        objectArray[15] = "\"\u001f2T\u0012s)\u0010#\u001bs}\"\u001b'A";
        objectArray[16] = "\u001b$b#)%Iut*W=\niN5\ffW~K\n+\u0016\\\u001cF\u0006\u000f8^|c :aj\u0001r\u000fn?\u001f<4\u0002;\u0011\u001c!<\u0018);a\u00003\f\u00107g:u\u00183\u0001m\u001eo\u000b+\u0007\u00195t-\u000f&\u0018\u0000q5\u0014aJ\u0006Py\u0013\u0002v\u00071x4\u0019Z\u000ft/\u00152W.Gq\u0012\u0015TzGIm<\u0017tjr5%Iz\ft3 G~ap9)]E";
        objectArray[17] = "\u0006`[)N*\u0005z\u00066\",UyZ,N\u001e\u0002;\u0000q\u001aI\u00079A{\u001f,\u0007>Q!\"pW8[zFsD?^K\u001d/\\=B'\u001cx\u0001t:";
        objectArray[18] = "\u001a\t\u000er1+\u0019\u001a\tw\u0000*N\u001aStl\u0018\u001a^\u000b\";O\u001e\u0002Kr;\"\u001a\bBh\u0000vL[R\"du_\\W\u0013";
        objectArray[19] = "7adry%9h|\n{7 9bfIcab82\u001ecg6dqq #g5\n'a38~ed%bi\u00053%5=\"jpadlY<1q;'6\u007fu j\\";
        objectArray[20] = "`p&4R02!0=,(q=*2\\\n\u0019N\u00122M\t-\u007f4\u0001u\u000e\u0000qqn}&%P:fc\u000e\u0016`\u00154kt0nqeF\r\u0001R\u0013\u0003|\u0001\u0014ow\u0003\u001c\u0002\"O/\u0011h\u001c-Z#\u0010R\u00159^\n\u000eb\u0007%,\u0018\u0006s!7A\u0001>Q\u000b7m\u0016<J\u000ff/.\u001fI\u0010\u001d[!^\u0016)l .eN02.HgCp< ,dPw9\u0011";
        objectArray[21] = "hxq[E\rkkv^t\f<k,]\u0018>m)q\u0007Diai#\\\t\f6j(Dt";
        objectArray[22] = "?@eM\u000fn2@5Z~i\"\bjL\u0018`C\u0015Y|9<\u007fFvv/5\\Euq\u001duemp\f$Ea\u001cto\u001ahmzb\r7KBBz\u007f\u0007bBgn\r\u001f0g\u001etv\u001dBRAez\u00005NZKpFMWkaH=LR\u0014gmGr_e{Z!bAO1t#<lG21Gc3E:UDp4@\u000b\u000b\u001a=?B0S\u0003c1$;O\u0011jsAlL\u001ar\u000e";
        objectArray[23] = "6\u0004\u001al\u000e\n5\u0017\u001di?\u000bb\u0017GjS96S\u001d3\u0003n5\u000f\u0016<YUm\u0016H2?";
        objectArray[24] = "VX@\u007fD\u0016\u0006JFuu\u001d\u0000MJ~\u0019/W\n\u0011 JxT\nEx\u000e\u0017\u0017N\u0014)u";
        objectArray[25] = "\u001cn\t\u0011\u00072\u001f}\u000e\u001463H}T\u0017Z\u0001\u001c9\u000eN\rV\u001fe\u0005APmG|[O6";
        objectArray[26] = "!ckL\u007f\u001a#xy^\u0019(+w2W!\u0004XgC\u001bSG]apZ\u007fKymHh_\u001f`HB\u001cc1czgb~(Z>g\u001fzIp[9\u001c$2ai~f]\u001a%moD@$zf]d(\u0011[mE\u001ak\u000f*mI]K5\\jHEH=FT;A}1H{NTcNx=P&%\u0018qfpZ!\u001f%=\u0002\u001c}G+`9Dd\u0019%\u0006";
        objectArray[27] = "ic\u0005}?{hxTrDd5c\u000f$(Vh$U{D87\"\u000er ;$%\u000bCzd9}\u0003 y~dbo";
        objectArray[28] = "M$`M>,N7gH\u000f-\u00197=Kc\u001fMsg\u00127HN/l\u001dis\u001662\u0013\u000f";
        Object[] objectArray2 = objectArray;
        objectArray[29] = "k\"n<\u007f`;0h6Nk=7d=\"Yjp?`w\u000eipk;5a*4:jN";
    }

    public static String m$$GiUIE7OfNblcX29yTqQNmI1EMdGzzST5RviutfWF2OA2njPutIr61XEWkVZdCtrEOyV2clALcir8133nfdcKrIhA73j7WPJ8N(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{34, -53, 35, -42, -70, -69, 110, -51};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 8]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

