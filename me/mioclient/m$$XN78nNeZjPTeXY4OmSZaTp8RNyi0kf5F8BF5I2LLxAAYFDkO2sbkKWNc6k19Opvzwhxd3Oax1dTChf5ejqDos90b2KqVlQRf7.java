package me.mioclient;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;
import me.mioclient.m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV;
import me.mioclient.m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7
implements m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV {
    public static boolean m$$sFR9J58TiJt4SURJ4nPz12Se4pOkKJ7iYN4CS9EKKCzEW3kX8BPpBjbC0BmWqYKthnRisC655iBqC8chjCpxsFbfOThA5LcU9;
    public static Constructor m$$Jz3nrtaDEHNswJwHLVIjIlmVHZLIhFXpLRuMvUz3KhkfMoKNyUCwYAN4g2BJ29j4ySn69veD45bDR3j6eobkveXSqv8gPIjhr;
    public static Method m$$Z6p1PE0WQlCoBrwNEgUidLY5BRitwsngzPostZUSBQdDxXJlnaVEVYGdt1NW56ABioi1FnQ1ejublzsqPvPalYFmbdgK3DVgJ;
    public final Class m$$MfEsS0FyUoStCTuZ4GI4AxTQcb2IJBaQ0hqXIaSR5LutWjbTSi5ooSFZJieCdrfWXvtwAwQu1B8fc9rBI6Znueyr6ClncP4HB;
    public final boolean m$$YKDznxDps6lS8favWHPD5kNiYYItIIQNFlgHW8hKcXS7uglYZypooNrjgsvU8SoTGEk2VAl7Ph1HnHldJyCZfpdZIgEOLRrvi;
    public final int m$$26GpwXuBQweslkdJSqOhIVNLEtPrpWEYoM9Hm54Smeqfdy61Dk0SwqwWnK4froWRM3mahiKqpBzRJXLSGGS5y16Vr6JGQRsd7;
    public Consumer m$$GVi082ZtuEf8HvU28bmo8vuJJ2ogvK9ZsjiWtW5jTpeariq0hk8tgtKxHEJlV6kK4tFsZ0HwXSUC9ifqvBsXGhUxCu6cAsYaj;

    public m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7(m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8, Class clazz, Object object, Method method) {
        this.m$$MfEsS0FyUoStCTuZ4GI4AxTQcb2IJBaQ0hqXIaSR5LutWjbTSi5ooSFZJieCdrfWXvtwAwQu1B8fc9rBI6Znueyr6ClncP4HB = method.getParameters()[0].getType();
        this.m$$YKDznxDps6lS8favWHPD5kNiYYItIIQNFlgHW8hKcXS7uglYZypooNrjgsvU8SoTGEk2VAl7Ph1HnHldJyCZfpdZIgEOLRrvi = Modifier.isStatic(method.getModifiers());
        this.m$$26GpwXuBQweslkdJSqOhIVNLEtPrpWEYoM9Hm54Smeqfdy61Dk0SwqwWnK4froWRM3mahiKqpBzRJXLSGGS5y16Vr6JGQRsd7 = method.getAnnotation(m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62.class).m$$V2Krh115dTil6CiDCChVxOfigKboUspdAAlSAGlM4OpVZIlKf1g2UO0CWiplcxxbxwWvjLygNFDkENfQ5lr9gS5JL6cOWS6qa();
        try {
            MethodType methodType;
            MethodHandle methodHandle;
            MethodHandles.Lookup lookup;
            String string = method.getName();
            if (m$$sFR9J58TiJt4SURJ4nPz12Se4pOkKJ7iYN4CS9EKKCzEW3kX8BPpBjbC0BmWqYKthnRisC655iBqC8chjCpxsFbfOThA5LcU9) {
                boolean bl = m$$Jz3nrtaDEHNswJwHLVIjIlmVHZLIhFXpLRuMvUz3KhkfMoKNyUCwYAN4g2BJ29j4ySn69veD45bDR3j6eobkveXSqv8gPIjhr.isAccessible();
                m$$Jz3nrtaDEHNswJwHLVIjIlmVHZLIhFXpLRuMvUz3KhkfMoKNyUCwYAN4g2BJ29j4ySn69veD45bDR3j6eobkveXSqv8gPIjhr.setAccessible(true);
                lookup = (MethodHandles.Lookup)m$$Jz3nrtaDEHNswJwHLVIjIlmVHZLIhFXpLRuMvUz3KhkfMoKNyUCwYAN4g2BJ29j4ySn69veD45bDR3j6eobkveXSqv8gPIjhr.newInstance(clazz);
                m$$Jz3nrtaDEHNswJwHLVIjIlmVHZLIhFXpLRuMvUz3KhkfMoKNyUCwYAN4g2BJ29j4ySn69veD45bDR3j6eobkveXSqv8gPIjhr.setAccessible(bl);
            } else {
                lookup = m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.create(m$$Z6p1PE0WQlCoBrwNEgUidLY5BRitwsngzPostZUSBQdDxXJlnaVEVYGdt1NW56ABioi1FnQ1ejublzsqPvPalYFmbdgK3DVgJ, clazz);
            }
            MethodType methodType2 = MethodType.methodType(Void.TYPE, method.getParameters()[0].getType());
            if (this.m$$YKDznxDps6lS8favWHPD5kNiYYItIIQNFlgHW8hKcXS7uglYZypooNrjgsvU8SoTGEk2VAl7Ph1HnHldJyCZfpdZIgEOLRrvi) {
                methodHandle = lookup.findStatic(clazz, string, methodType2);
                methodType = MethodType.methodType(Consumer.class);
            } else {
                methodHandle = lookup.findVirtual(clazz, string, methodType2);
                methodType = MethodType.methodType(Consumer.class, clazz);
            }
            MethodHandle methodHandle2 = LambdaMetafactory.metafactory(lookup,  /* dynamic constant */ (String)m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7.m$$LsR9O4qM0vigjB7p2f754EPLOSPEG0IgQfesBFCklcyY3uOAvimexKtIWLKU79oeLCwl9iBZ9jCDp4Mxf4znM1Ax0whrCYgtf("oBL3CUtMMYibddJwhWBV", MethodHandles.lookup(), "m$$LsR9O4qM0vigjB7p2f754EPLOSPEG0IgQfesBFCklcyY3uOAvimexKtIWLKU79oeLCwl9iBZ9jCDp4Mxf4znM1Ax0whrCYgtf", m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7.class, 2123248189), methodType, MethodType.methodType(Void.TYPE, Object.class), methodHandle, methodType2).getTarget();
            this.m$$GVi082ZtuEf8HvU28bmo8vuJJ2ogvK9ZsjiWtW5jTpeariq0hk8tgtKxHEJlV6kK4tFsZ0HwXSUC9ifqvBsXGhUxCu6cAsYaj = this.m$$YKDznxDps6lS8favWHPD5kNiYYItIIQNFlgHW8hKcXS7uglYZypooNrjgsvU8SoTGEk2VAl7Ph1HnHldJyCZfpdZIgEOLRrvi ? methodHandle2.invoke() : methodHandle2.invoke(object);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    static {
        try {
            m$$sFR9J58TiJt4SURJ4nPz12Se4pOkKJ7iYN4CS9EKKCzEW3kX8BPpBjbC0BmWqYKthnRisC655iBqC8chjCpxsFbfOThA5LcU9 = System.getProperty( /* dynamic constant */ (String)m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7.m$$LsR9O4qM0vigjB7p2f754EPLOSPEG0IgQfesBFCklcyY3uOAvimexKtIWLKU79oeLCwl9iBZ9jCDp4Mxf4znM1Ax0whrCYgtf("mFbdG4NjSehjAyjct1y1", MethodHandles.lookup(), "m$$LsR9O4qM0vigjB7p2f754EPLOSPEG0IgQfesBFCklcyY3uOAvimexKtIWLKU79oeLCwl9iBZ9jCDp4Mxf4znM1Ax0whrCYgtf", m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7.class, 767281394)).startsWith( /* dynamic constant */ (String)m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7.m$$LsR9O4qM0vigjB7p2f754EPLOSPEG0IgQfesBFCklcyY3uOAvimexKtIWLKU79oeLCwl9iBZ9jCDp4Mxf4znM1Ax0whrCYgtf("gPo9ayXHNfcYZzHMGf0k", MethodHandles.lookup(), "m$$LsR9O4qM0vigjB7p2f754EPLOSPEG0IgQfesBFCklcyY3uOAvimexKtIWLKU79oeLCwl9iBZ9jCDp4Mxf4znM1Ax0whrCYgtf", m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7.class, 866295880));
            if (m$$sFR9J58TiJt4SURJ4nPz12Se4pOkKJ7iYN4CS9EKKCzEW3kX8BPpBjbC0BmWqYKthnRisC655iBqC8chjCpxsFbfOThA5LcU9) {
                m$$Jz3nrtaDEHNswJwHLVIjIlmVHZLIhFXpLRuMvUz3KhkfMoKNyUCwYAN4g2BJ29j4ySn69veD45bDR3j6eobkveXSqv8gPIjhr = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class);
            } else {
                m$$Z6p1PE0WQlCoBrwNEgUidLY5BRitwsngzPostZUSBQdDxXJlnaVEVYGdt1NW56ABioi1FnQ1ejublzsqPvPalYFmbdgK3DVgJ = MethodHandles.class.getDeclaredMethod( /* dynamic constant */ (String)m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7.m$$LsR9O4qM0vigjB7p2f754EPLOSPEG0IgQfesBFCklcyY3uOAvimexKtIWLKU79oeLCwl9iBZ9jCDp4Mxf4znM1Ax0whrCYgtf("RUmPJlNbwUIMIh6gMW45", MethodHandles.lookup(), "m$$LsR9O4qM0vigjB7p2f754EPLOSPEG0IgQfesBFCklcyY3uOAvimexKtIWLKU79oeLCwl9iBZ9jCDp4Mxf4znM1Ax0whrCYgtf", m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7.class, 853458537), Class.class, MethodHandles.Lookup.class);
            }
        } catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
        }
    }

    @Override
    public int m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G() {
        return this.m$$26GpwXuBQweslkdJSqOhIVNLEtPrpWEYoM9Hm54Smeqfdy61Dk0SwqwWnK4froWRM3mahiKqpBzRJXLSGGS5y16Vr6JGQRsd7;
    }

    public static String m$$LsR9O4qM0vigjB7p2f754EPLOSPEG0IgQfesBFCklcyY3uOAvimexKtIWLKU79oeLCwl9iBZ9jCDp4Mxf4znM1Ax0whrCYgtf(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-96, -68, -55, -79, 85, 7, 124, 24, 86, -78, -107, -111, -30, 104, -42, -80, 96, -128, -106, -86};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 20]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    @Override
    public void m$$QvRaL3MEcHB7Zw6LGTIHIgvyXHcz8dO9xk0sWjrde2rwFR60mWOLQMrTPpwb4OJmQcdBNqDjLnGqj0kB8VPJVjAK0CML3JdS2(Object object) {
        this.m$$GVi082ZtuEf8HvU28bmo8vuJJ2ogvK9ZsjiWtW5jTpeariq0hk8tgtKxHEJlV6kK4tFsZ0HwXSUC9ifqvBsXGhUxCu6cAsYaj.accept(object);
    }

    @Override
    public Class m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f() {
        return this.m$$MfEsS0FyUoStCTuZ4GI4AxTQcb2IJBaQ0hqXIaSR5LutWjbTSi5ooSFZJieCdrfWXvtwAwQu1B8fc9rBI6Znueyr6ClncP4HB;
    }

    @Override
    public boolean m$$eFwtC2D8xVvGfAuNJmqkhba3Jd3bKPD7MxqLMSJ9wE1cMERxEKN7uYcTY6iPzWDwsRN22kim8MLq5qcn9fS6ChF2w3zImNpY4() {
        return this.m$$YKDznxDps6lS8favWHPD5kNiYYItIIQNFlgHW8hKcXS7uglYZypooNrjgsvU8SoTGEk2VAl7Ph1HnHldJyCZfpdZIgEOLRrvi;
    }
}

