package me.mioclient;

import com.mojang.blaze3d.opengl.GlStateManager;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Arrays;
import java.util.List;
import me.mioclient.m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4;
import org.lwjgl.opengl.GL20C;
import org.lwjgl.opengl.GL32C;

public final class m$$4rzGEdASve2OAJIwx7ibviRce6rIrKcMqoi7mwJlN19LxakWNlZcOaSHyE6VRZ5T8e8Dvdu1Luk7kCFxEFDnxLqAjVDHSIArb {
    public static final List m$$drRamKEFYoNSWn0JcXquuSBLpOaARQW8WLek4wXjdGqZ11chwckYWLP1yq7bvtgeiiKRjyAFITgP6m6MBuANqykfdttjGVbNa = new ObjectArrayList();
    public static final m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 m$$z8hsGnJbHjJDalkFN1U8lu82AOL6H3Yp5PIwbba2tkRgzG3CiCdsoUiFEOorh58vtOApnDX7k3GNK7UISdkWoawKqXjgkks6C;
    public static final m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc;
    public static final m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 m$$VQQSW9GbXlljQWBOHxDEKQlr52IbhtvvJ7by44tphw0XqecLDFQ0OIHJupuubwT52Vv5FNxkJpdf322ud01iuJLeX88yX3FOx;
    public static final m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 m$$Qq0owXcVDhEFpEebrKqpRpUtp8xuKZ3GB17oIY7fFrsg1aG3I3LOteZ9w3EQlSpIYVSSQ9cReYXeAmo0PtpyhlVZrTlU0UZIb;
    public static final m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2;
    public static boolean m$$x8h2gtxr5tQRlrgmF9m9DWDKA206pnEeSWRf8GU3AtV7oVA2DVclr9pdJMSBFysvbtA8jaXyGECBHm1Mo73N8lXL38ZHt9CxO;

    static {
        m$$NQt2798j6vOZRlMQMSWVrj9gQpt0IiJ5SfvOefoOgbO9y2jwu2HDCktlkccFsXkZBM41wWExM9SCZbDCTUIM1K3LUATNdPJA2 = bl -> {
            if (bl) {
                GlStateManager._enableBlend();
                GL32C.glEnable((int)2848);
            } else {
                GL32C.glDisable((int)2848);
                GlStateManager._disableBlend();
            }
        };
        m$$z8hsGnJbHjJDalkFN1U8lu82AOL6H3Yp5PIwbba2tkRgzG3CiCdsoUiFEOorh58vtOApnDX7k3GNK7UISdkWoawKqXjgkks6C = bl -> {
            if (bl) {
                GlStateManager._depthMask((boolean)true);
                GlStateManager._enableDepthTest();
            } else {
                GlStateManager._depthMask((boolean)false);
                GlStateManager._disableDepthTest();
            }
        };
        m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc = bl -> {
            if (bl) {
                GlStateManager._depthMask((boolean)false);
                GlStateManager._disableDepthTest();
                GL20C.glDepthRange((double)0.0, (double)0.1);
            } else {
                GlStateManager._depthMask((boolean)true);
                GlStateManager._enableDepthTest();
                GL20C.glDepthRange((double)0.0, (double)1.0);
            }
        };
        m$$Qq0owXcVDhEFpEebrKqpRpUtp8xuKZ3GB17oIY7fFrsg1aG3I3LOteZ9w3EQlSpIYVSSQ9cReYXeAmo0PtpyhlVZrTlU0UZIb = bl -> {
            if (bl) {
                GlStateManager._enableBlend();
                GlStateManager._disableCull();
            } else {
                GlStateManager._disableBlend();
                GlStateManager._enableCull();
            }
        };
        m$$VQQSW9GbXlljQWBOHxDEKQlr52IbhtvvJ7by44tphw0XqecLDFQ0OIHJupuubwT52Vv5FNxkJpdf322ud01iuJLeX88yX3FOx = m$$Qq0owXcVDhEFpEebrKqpRpUtp8xuKZ3GB17oIY7fFrsg1aG3I3LOteZ9w3EQlSpIYVSSQ9cReYXeAmo0PtpyhlVZrTlU0UZIb.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$pWnZYORIi3zxwavtKPVsQfNxVyBb8yN9NAp9Y5weVzFVcOdZBTzE50SvOinijSLzHzMJO8TX0iBTKMNoadHWS99EFxudWPSDc);
    }

    public static void reset() {
        m$$drRamKEFYoNSWn0JcXquuSBLpOaARQW8WLek4wXjdGqZ11chwckYWLP1yq7bvtgeiiKRjyAFITgP6m6MBuANqykfdttjGVbNa.clear();
        m$$x8h2gtxr5tQRlrgmF9m9DWDKA206pnEeSWRf8GU3AtV7oVA2DVclr9pdJMSBFysvbtA8jaXyGECBHm1Mo73N8lXL38ZHt9CxO = false;
    }

    public static void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 ... m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4Array) {
        m$$drRamKEFYoNSWn0JcXquuSBLpOaARQW8WLek4wXjdGqZ11chwckYWLP1yq7bvtgeiiKRjyAFITgP6m6MBuANqykfdttjGVbNa.addAll(Arrays.asList(m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4Array));
        m$$x8h2gtxr5tQRlrgmF9m9DWDKA206pnEeSWRf8GU3AtV7oVA2DVclr9pdJMSBFysvbtA8jaXyGECBHm1Mo73N8lXL38ZHt9CxO = true;
    }

    public static void m$$PflPiH1vUXcqhm2PHR71yV2HvSE1I49t7ezfuCSHxe1eRNEDNvute14oW31A8qCsUs5TfpVZYDUYbcuzf88HgajRExqTk1pCf(boolean bl) {
        if (!m$$x8h2gtxr5tQRlrgmF9m9DWDKA206pnEeSWRf8GU3AtV7oVA2DVclr9pdJMSBFysvbtA8jaXyGECBHm1Mo73N8lXL38ZHt9CxO) {
            return;
        }
        for (m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4 : m$$drRamKEFYoNSWn0JcXquuSBLpOaARQW8WLek4wXjdGqZ11chwckYWLP1yq7bvtgeiiKRjyAFITgP6m6MBuANqykfdttjGVbNa) {
            m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4.extend(bl);
        }
    }

    public static boolean m$$HjtzBB83GH0dRXLC6D63ONdC88CsZ2SCjJzpWo5T2reDeU9L0VXYaVH7YaUlVPpuPLDn5gcuk77rLGl5TuJmR7w66WMimcId8() {
        return m$$x8h2gtxr5tQRlrgmF9m9DWDKA206pnEeSWRf8GU3AtV7oVA2DVclr9pdJMSBFysvbtA8jaXyGECBHm1Mo73N8lXL38ZHt9CxO;
    }
}

