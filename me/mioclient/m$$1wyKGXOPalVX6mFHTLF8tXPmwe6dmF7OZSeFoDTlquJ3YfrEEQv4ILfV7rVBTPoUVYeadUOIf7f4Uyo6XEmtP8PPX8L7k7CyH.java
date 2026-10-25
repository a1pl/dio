package me.mioclient;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import me.mioclient.m$$1wyKGXOPalVX6mFHTLF8tXPmwe6dmF7OZSeFoDTlquJ3YfrEEQv4ILfV7rVBTPoUVYeadUOIf7f4Uyo6XEmtP8PPX8L7k7CyH$m$;
import me.mioclient.m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7;
import me.mioclient.m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$hIqlec2HWKmOxXuYwUjZfqC5dJZrkdE4BmcD2jBLVxSiyNm77YIJLT48MICqMc4DTFNuGrXg6Zf6ritDs9caELbFT7xf3fpQ4;
import me.mioclient.m$$jARXSm9Zvo9clqrEuF5M77jY6zdKvJiIL9VftZhFdlILXQqiZKxCoPEW9gb5FOWw9KKcjODlkrsK6XglTRWkkqtsKvpHSOnmB;
import me.mioclient.m$$o9KnW2MTccRKxZGkWclRZ9HW4sqPswFNkcPZUnXj5DablLCPAZZwsAtZ3D5estpOqXmV6079OOLGE4wgGERNEl7cvfJ5XPERD;
import me.mioclient.m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV;
import me.mioclient.m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m$$1wyKGXOPalVX6mFHTLF8tXPmwe6dmF7OZSeFoDTlquJ3YfrEEQv4ILfV7rVBTPoUVYeadUOIf7f4Uyo6XEmtP8PPX8L7k7CyH
implements m$$jARXSm9Zvo9clqrEuF5M77jY6zdKvJiIL9VftZhFdlILXQqiZKxCoPEW9gb5FOWw9KKcjODlkrsK6XglTRWkkqtsKvpHSOnmB {
    public final Map m$$N8QtWlvqAjF9b7bkNJpqPjgkZnrIeWCho0lqPqhgYZb8rEQsVzK13JA6s2fFjtEETYNENiRvklcfrING5GC1AvX4sMNT5zE0k = new ConcurrentHashMap();
    public final Map m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju = new ConcurrentHashMap();
    public final Map m$$RVXdTPEBtwYgCgSacl3VK6lBAUyygB1olF72V6KfrF3G8aFX6KxoRVFhQIsgPbfpQfwCwmxBF9XUM4yTtoMPBC0d6RvccDjm1 = new ConcurrentHashMap();
    public final List m$$hbpSAO8YrfjFQ3hDvGB1czBsMba2J3FvLoj8OY4AaBeawpWo3snlTKPnByukxuzxXBg724dNMUbwrf22JNTV82RHUm3pFOjtl = new ArrayList();
    public static int \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 1879563154;

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(List list, m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV) {
        int n;
        for (n = 0; n < list.size() && m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV.m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G() <= ((m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV)list.get(n)).m$$D3v71mugQrHeDKLmMzhi1aMSzx5DHixAq0tQB2QojiFIWxk9skSP3Vqlod9KusTpb4AHqnCJjncdjnKXDEFr2rHyaqVO1EB1G(); ++n) {
        }
        list.add(n, m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV);
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV, boolean bl) {
        if (bl) {
            if (m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV.m$$eFwtC2D8xVvGfAuNJmqkhba3Jd3bKPD7MxqLMSJ9wE1cMERxEKN7uYcTY6iPzWDwsRN22kim8MLq5qcn9fS6ChF2w3zImNpY4()) {
                this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$RVXdTPEBtwYgCgSacl3VK6lBAUyygB1olF72V6KfrF3G8aFX6KxoRVFhQIsgPbfpQfwCwmxBF9XUM4yTtoMPBC0d6RvccDjm1.computeIfAbsent(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV.m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f(), clazz -> new CopyOnWriteArrayList()), m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV);
            }
        } else {
            this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$RVXdTPEBtwYgCgSacl3VK6lBAUyygB1olF72V6KfrF3G8aFX6KxoRVFhQIsgPbfpQfwCwmxBF9XUM4yTtoMPBC0d6RvccDjm1.computeIfAbsent(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV.m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f(), clazz -> new CopyOnWriteArrayList()), m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV);
        }
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(List list, boolean bl) {
        for (m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV : list) {
            this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV, bl);
        }
    }

    public List m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Class clazz, Object object) {
        Function<Object, List> function = object2 -> {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(copyOnWriteArrayList, clazz, object);
            return copyOnWriteArrayList;
        };
        if (object == null) {
            return this.m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju.computeIfAbsent(clazz, function);
        }
        for (Object k : this.m$$N8QtWlvqAjF9b7bkNJpqPjgkZnrIeWCho0lqPqhgYZb8rEQsVzK13JA6s2fFjtEETYNENiRvklcfrING5GC1AvX4sMNT5zE0k.keySet()) {
            if (k != object) continue;
            return (List)this.m$$N8QtWlvqAjF9b7bkNJpqPjgkZnrIeWCho0lqPqhgYZb8rEQsVzK13JA6s2fFjtEETYNENiRvklcfrING5GC1AvX4sMNT5zE0k.get(object);
        }
        List list = function.apply(object);
        this.m$$N8QtWlvqAjF9b7bkNJpqPjgkZnrIeWCho0lqPqhgYZb8rEQsVzK13JA6s2fFjtEETYNENiRvklcfrING5GC1AvX4sMNT5zE0k.put(object, list);
        return list;
    }

    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(List list, Class clazz, Object object) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (!this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(method)) continue;
            list.add(new m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7(this.m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP(clazz), clazz, object, method));
        }
        if (clazz.getSuperclass() != null) {
            this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(list, clazz.getSuperclass(), object);
        }
    }

    public boolean m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(Method method) {
        if (!method.isAnnotationPresent(m$$zU7OG2ZmK3j9w8beuBv9r3hTHBLd8MHcotjd4QIayurkpjBcjhRL3g219V8VLsf8LdcQyyCXjUaBV0FuuWwWXyGBmC841lZ62.class)) {
            return false;
        }
        if (method.getReturnType() != Void.TYPE) {
            return false;
        }
        if (method.getParameterCount() != 1) {
            return false;
        }
        return !method.getParameters()[0].getType().isPrimitive();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(String string, m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8) {
        List list = this.m$$hbpSAO8YrfjFQ3hDvGB1czBsMba2J3FvLoj8OY4AaBeawpWo3snlTKPnByukxuzxXBg724dNMUbwrf22JNTV82RHUm3pFOjtl;
        synchronized (list) {
            this.m$$hbpSAO8YrfjFQ3hDvGB1czBsMba2J3FvLoj8OY4AaBeawpWo3snlTKPnByukxuzxXBg724dNMUbwrf22JNTV82RHUm3pFOjtl.add(new m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(string, m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8));
        }
    }

    @Override
    public m$$o9KnW2MTccRKxZGkWclRZ9HW4sqPswFNkcPZUnXj5DablLCPAZZwsAtZ3D5estpOqXmV6079OOLGE4wgGERNEl7cvfJ5XPERD m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$o9KnW2MTccRKxZGkWclRZ9HW4sqPswFNkcPZUnXj5DablLCPAZZwsAtZ3D5estpOqXmV6079OOLGE4wgGERNEl7cvfJ5XPERD m$$o9KnW2MTccRKxZGkWclRZ9HW4sqPswFNkcPZUnXj5DablLCPAZZwsAtZ3D5estpOqXmV6079OOLGE4wgGERNEl7cvfJ5XPERD) {
        List list = (List)this.m$$RVXdTPEBtwYgCgSacl3VK6lBAUyygB1olF72V6KfrF3G8aFX6KxoRVFhQIsgPbfpQfwCwmxBF9XUM4yTtoMPBC0d6RvccDjm1.get(m$$o9KnW2MTccRKxZGkWclRZ9HW4sqPswFNkcPZUnXj5DablLCPAZZwsAtZ3D5estpOqXmV6079OOLGE4wgGERNEl7cvfJ5XPERD.getClass());
        if (list != null) {
            m$$o9KnW2MTccRKxZGkWclRZ9HW4sqPswFNkcPZUnXj5DablLCPAZZwsAtZ3D5estpOqXmV6079OOLGE4wgGERNEl7cvfJ5XPERD.m$$fpGL7c3hh9Wq0GjZGbUWsMGOqxjqgcrE05H4OUl0FpiGYoHnjcDrxjKurfxMvIVKaJ4GAuaRgVOLd2AOlBDxzNHQjDNpEjvwE(false);
            for (m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV : list) {
                m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV.m$$QvRaL3MEcHB7Zw6LGTIHIgvyXHcz8dO9xk0sWjrde2rwFR60mWOLQMrTPpwb4OJmQcdBNqDjLnGqj0kB8VPJVjAK0CML3JdS2(m$$o9KnW2MTccRKxZGkWclRZ9HW4sqPswFNkcPZUnXj5DablLCPAZZwsAtZ3D5estpOqXmV6079OOLGE4wgGERNEl7cvfJ5XPERD);
                if (!m$$o9KnW2MTccRKxZGkWclRZ9HW4sqPswFNkcPZUnXj5DablLCPAZZwsAtZ3D5estpOqXmV6079OOLGE4wgGERNEl7cvfJ5XPERD.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) continue;
                break;
            }
        }
        return m$$o9KnW2MTccRKxZGkWclRZ9HW4sqPswFNkcPZUnXj5DablLCPAZZwsAtZ3D5estpOqXmV6079OOLGE4wgGERNEl7cvfJ5XPERD;
    }

    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV) {
        this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV, false);
    }

    @Override
    public void m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(Class clazz) {
        this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(clazz, null), true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public m$$XN78nNeZjPTeXY4OmSZaTp8RNyi0kf5F8BF5I2LLxAAYFDkO2sbkKWNc6k19Opvzwhxd3Oax1dTChf5ejqDos90b2KqVlQRf7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP(Class clazz) {
        List list = this.m$$hbpSAO8YrfjFQ3hDvGB1czBsMba2J3FvLoj8OY4AaBeawpWo3snlTKPnByukxuzxXBg724dNMUbwrf22JNTV82RHUm3pFOjtl;
        synchronized (list) {
            for (m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82 : this.m$$hbpSAO8YrfjFQ3hDvGB1czBsMba2J3FvLoj8OY4AaBeawpWo3snlTKPnByukxuzxXBg724dNMUbwrf22JNTV82RHUm3pFOjtl) {
                if (!clazz.getName().startsWith(zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82.m$$8yf8hmWcwnV115J7w4KrjVhYE8HEuE4PB5pBB8AhjESSuPrGzBSt6CuiF6rDxr5CjNTMNCqTQSyatgOBJq2g3NS6lC9onnNXL)) continue;
                return zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82.m$$T5QjgVkXokAMhZVP1TJgOUAZr1F4IkUWPcj8rW8yv2Wz0RuU9vvXdfIZ82QkLiLNQuwut5TACp7Q9GkiqTGwMA3X7exWGnKD1;
            }
        }
        throw new m$$hIqlec2HWKmOxXuYwUjZfqC5dJZrkdE4BmcD2jBLVxSiyNm77YIJLT48MICqMc4DTFNuGrXg6Zf6ritDs9caELbFT7xf3fpQ4(clazz);
    }

    @Override
    public Object m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(Object object) {
        List list = (List)this.m$$RVXdTPEBtwYgCgSacl3VK6lBAUyygB1olF72V6KfrF3G8aFX6KxoRVFhQIsgPbfpQfwCwmxBF9XUM4yTtoMPBC0d6RvccDjm1.get(object.getClass());
        if (list != null) {
            for (m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV : list) {
                m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV.m$$QvRaL3MEcHB7Zw6LGTIHIgvyXHcz8dO9xk0sWjrde2rwFR60mWOLQMrTPpwb4OJmQcdBNqDjLnGqj0kB8VPJVjAK0CML3JdS2(object);
            }
        }
        return object;
    }

    @Override
    public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV) {
        this.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV, false);
    }

    public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(List list, boolean bl) {
        for (m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV : list) {
            this.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV, bl);
        }
    }

    public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV, boolean bl) {
        List list = (List)this.m$$RVXdTPEBtwYgCgSacl3VK6lBAUyygB1olF72V6KfrF3G8aFX6KxoRVFhQIsgPbfpQfwCwmxBF9XUM4yTtoMPBC0d6RvccDjm1.get(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV.m$$c9aiG8iYOd1SQnO1wC3wtxGAQpqwAEX5QRUfqNVEY4Jdoqex9kdJR3fX7sPfImuMERRS6QuHzEBzqztmQNbQ2TI8moq3G6g7f());
        if (list != null) {
            if (bl) {
                if (m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV.m$$eFwtC2D8xVvGfAuNJmqkhba3Jd3bKPD7MxqLMSJ9wE1cMERxEKN7uYcTY6iPzWDwsRN22kim8MLq5qcn9fS6ChF2w3zImNpY4()) {
                    list.remove(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV);
                }
            } else {
                list.remove(m$$s5jc4rSJM1GZ7HlEzZSG6V51Mvu7oqeCL5gKj0yOQfi5wr0yDqXTwA2PhXbeGM485GtUkab7RM4YNOhrOCPAtGbNedPRmy1EV);
            }
        }
    }

    @Override
    public void m$$zaVZwejDS8meNrGYQgv4L3ZqA6ye47HbYtYo2r29l2q9KPGG6sqTBGr4r8MDhntTMvzqGLNWdM3EvmI46X3DNAj7mxqXfuZpc(Object object) {
        this.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(object.getClass(), object), false);
    }

    @Override
    public void m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(Class clazz) {
        this.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(clazz, null), true);
    }

    @Override
    public void m$$1jOWsTPtmbJw41RuZ4W3HsnOh1UrckOKRyWBrJ2dTlnNzMWmXIoAwZsov6KCypcHhvjIkeyolQqDs34vtSdJ8oD9yR8jOJlp0(Object object) {
        this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(object.getClass(), object), false);
    }
}

