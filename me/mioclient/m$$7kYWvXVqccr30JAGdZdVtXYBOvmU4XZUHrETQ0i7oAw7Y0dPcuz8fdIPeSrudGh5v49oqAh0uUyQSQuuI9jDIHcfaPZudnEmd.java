package me.mioclient;

import com.mojang.blaze3d.textures.GpuTexture;
import it.unimi.dsi.fastutil.chars.AbstractChar2ObjectMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectOpenHashMap;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import javax.imageio.ImageIO;
import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$EOkWgunNz8tWK3LqzrtqZnFgHsYI74sT2yT9YKDieCxFbpkmaNEEcj3HKvCV8NBfwKD0Iu2MR6ZqHWWpV4rFvULnCpa7OEhB6;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import me.mioclient.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import org.lwjgl.BufferUtils;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd {
    public static m$$EOkWgunNz8tWK3LqzrtqZnFgHsYI74sT2yT9YKDieCxFbpkmaNEEcj3HKvCV8NBfwKD0Iu2MR6ZqHWWpV4rFvULnCpa7OEhB6 m$$ukPtbytnnVDaHhpNdD4jhnxHWG3MdOp9PkszxMstVt4vnnCXkN8cL9RMCnyd9qdSYDzuJAnTLBEv2SEvzd6qObCFvgPqpOYWk;
    public final Font m$$OfIrIDn5cgloolWBl7xZfGMoiRfLYEFClQzqw9VXpXmdJmUSkiUDCDS1vvSee5NrCGbLfcFrQPBE7eyX5HGxsS2XEz5mNjjvz;
    public final boolean m$$Pfy2pugLuUHmEnMriRTceVvq0BtETMDIngL3E6CncvDKwvmLd32cXne9by0ugxvhyG31jYsJiCCVd0j2e4u9RXAeKti3Rnts2;
    public final boolean m$$rFW2LAoYJfhu66gHeEpAa4rIC2dkoDuKWDKSXApFLbkN6PkQPyUckM0iji1gTTbJ2J37mTRxwCdN3U5csbDQIz85eT1xn7OvN;
    public final AbstractChar2ObjectMap m$$zVdD1tLr0PByrKoyaZrXTmjMUEwJIAKlkqjXxL05YlMrlmEiUbkvWuPeye1RtFnBqadlPcjhMvDgZkUWQ95gVHAvwVyrj6r0S = new Char2ObjectOpenHashMap();
    public int m$$lI71PgduX0kcnvSPp71sNOdqr6xh6gbHrW043VE8vfy9nimSwMLYxdYwovISze3zkzht9Dfwe86j10zywf3oHlIAWsly09UjF;
    public int m$$yS2UWAtJA57McDZWqBNttkJtMEdiQviqpwpT7mWd2AeNeEnZUb1V4snIyLb07lCwD85bb90WBwU8p3RCkNz5e4cbrCW7d5xl5 = -1;
    public BufferedImage m$$HxqNsCgO3deNUzkvLLtnXw7bRY9VTuJb3jqFeiDSUQZrgNOr8kz5J5uS4U1I5U4L862BEPjXBgr7lH06laGITsBbbJOTaO2r5;
    public class_1044 m$$HDUd2YZYUWT4Mt9uZbKE2QUnCkNKgOYFT8T0bhiaYf8uYaQrdwdqw0luoVwhmlsqvSCTSMlzkqu46UGWEn5kbkoDST4da1Ld4;
    public GpuTexture m$$jXlp80tGxJF3fUjoiCaRjmWxu59jkCF2LYT0n5sQvFYoAcNPkxLd6b5clhVvml4PzlhHbFmh2wEIS07nH2EqtMYMXMrO3wSsx;

    public static String m$$M2458eFog8mePdvb6Jy7SxJlrNkREJ0WaaD9GjlSlJSJ0wAn70ma5shZ0qS4GlqliVsqq7rhRtdLNjZ1j6t8IAgGWVaDk08h6(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{55, -18, 37, -107, -34, -53, -94, 24, 91, -102, -127, 107, -121};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 13]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd(Font font, boolean bl, boolean bl2) {
        this.m$$OfIrIDn5cgloolWBl7xZfGMoiRfLYEFClQzqw9VXpXmdJmUSkiUDCDS1vvSee5NrCGbLfcFrQPBE7eyX5HGxsS2XEz5mNjjvz = font;
        this.m$$Pfy2pugLuUHmEnMriRTceVvq0BtETMDIngL3E6CncvDKwvmLd32cXne9by0ugxvhyG31jYsJiCCVd0j2e4u9RXAeKti3Rnts2 = bl;
        this.m$$rFW2LAoYJfhu66gHeEpAa4rIC2dkoDuKWDKSXApFLbkN6PkQPyUckM0iji1gTTbJ2J37mTRxwCdN3U5csbDQIz85eT1xn7OvN = bl2;
    }

    static {
        \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)6515001164456638975L);
        m$$ukPtbytnnVDaHhpNdD4jhnxHWG3MdOp9PkszxMstVt4vnnCXkN8cL9RMCnyd9qdSYDzuJAnTLBEv2SEvzd6qObCFvgPqpOYWk = (m$$EOkWgunNz8tWK3LqzrtqZnFgHsYI74sT2yT9YKDieCxFbpkmaNEEcj3HKvCV8NBfwKD0Iu2MR6ZqHWWpV4rFvULnCpa7OEhB6)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$EOkWgunNz8tWK3LqzrtqZnFgHsYI74sT2yT9YKDieCxFbpkmaNEEcj3HKvCV8NBfwKD0Iu2MR6ZqHWWpV4rFvULnCpa7OEhB6.class);
    }

    public float m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_4587 class_45872, class_4588 class_45882, char c, float f, float f2, float f3, float f4, float f5, float f6) {
        m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 = (m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8)this.m$$zVdD1tLr0PByrKoyaZrXTmjMUEwJIAKlkqjXxL05YlMrlmEiUbkvWuPeye1RtFnBqadlPcjhMvDgZkUWQ95gVHAvwVyrj6r0S.get(c);
        if (m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 == null) {
            return 0.0f;
        }
        f3 *= m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg()[0];
        f5 *= m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg()[1];
        f4 *= m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg()[2];
        f6 *= m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg()[3];
        float f7 = (float)m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$QBsEoWaqzElltTD8Cx75GrI9PX1APsUomFw9DJF0raqpYnjvCyLbdHMirnBLv3GR62IuPo0wmLee9bs6AnpVMweaP6AYmiuOn / (float)this.m$$lI71PgduX0kcnvSPp71sNOdqr6xh6gbHrW043VE8vfy9nimSwMLYxdYwovISze3zkzht9Dfwe86j10zywf3oHlIAWsly09UjF;
        float f8 = (float)m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$pPemcSBT6laakuliCvefPE4g0Yj8VrQeG9DCXXTWYiFUH2ysTQaYHWXI0TUpjb0fnyJBhIF4vy63I4Qx5GgrYpQ7lU2p3UOGu / (float)this.m$$lI71PgduX0kcnvSPp71sNOdqr6xh6gbHrW043VE8vfy9nimSwMLYxdYwovISze3zkzht9Dfwe86j10zywf3oHlIAWsly09UjF;
        float f9 = (float)m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$vkLTYmql3gT2WDkcu7FB90q68NMsU9nqPbeit6YQhfZo0BxZ7yVGpwWwO50LTOJFNq3HgNdoAxsLi0fXRTJZ2s3DlIucgWqBS / (float)this.m$$lI71PgduX0kcnvSPp71sNOdqr6xh6gbHrW043VE8vfy9nimSwMLYxdYwovISze3zkzht9Dfwe86j10zywf3oHlIAWsly09UjF;
        float f10 = (float)m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$pdiFvTRR66VDFJcdKHKocE6oznDebrKBAYK9S0Q575vIpbqBcFWTldpJ5ANqLiTzg9E8PF4fQxwKzePyz5FSxTGUAwDanHiUC / (float)this.m$$lI71PgduX0kcnvSPp71sNOdqr6xh6gbHrW043VE8vfy9nimSwMLYxdYwovISze3zkzht9Dfwe86j10zywf3oHlIAWsly09UjF;
        float f11 = m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$vkLTYmql3gT2WDkcu7FB90q68NMsU9nqPbeit6YQhfZo0BxZ7yVGpwWwO50LTOJFNq3HgNdoAxsLi0fXRTJZ2s3DlIucgWqBS;
        float f12 = m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$pdiFvTRR66VDFJcdKHKocE6oznDebrKBAYK9S0Q575vIpbqBcFWTldpJ5ANqLiTzg9E8PF4fQxwKzePyz5FSxTGUAwDanHiUC;
        class_45882.method_22918(class_45872.method_23760().method_23761(), f, f2 + f12, (float)m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5()).method_22915(f3, f5, f4, f6).method_22913(f7, f8 + f10);
        class_45882.method_22918(class_45872.method_23760().method_23761(), f + f11, f2 + f12, (float)m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5()).method_22915(f3, f5, f4, f6).method_22913(f7 + f9, f8 + f10);
        class_45882.method_22918(class_45872.method_23760().method_23761(), f + f11, f2, (float)m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5()).method_22915(f3, f5, f4, f6).method_22913(f7 + f9, f8);
        class_45882.method_22918(class_45872.method_23760().method_23761(), f, f2, (float)m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.m$$ty8j281AWhyS6juWYgQRe3g46vmEb30N5W6RwRXKdu1bUL1m0WCODcdJb12mdBO9O3MG2dOBThvdqiWzz7ueXcBHiTbBQtPM5()).method_22915(f3, f5, f4, f6).method_22913(f7, f8);
        return f11 - 8.0f;
    }

    public void m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(Collection collection, int n) {
        double d = -1.0;
        double d2 = -1.0;
        AffineTransform affineTransform = new AffineTransform();
        FontRenderContext fontRenderContext = new FontRenderContext(affineTransform, this.m$$Pfy2pugLuUHmEnMriRTceVvq0BtETMDIngL3E6CncvDKwvmLd32cXne9by0ugxvhyG31jYsJiCCVd0j2e4u9RXAeKti3Rnts2, this.m$$rFW2LAoYJfhu66gHeEpAa4rIC2dkoDuKWDKSXApFLbkN6PkQPyUckM0iji1gTTbJ2J37mTRxwCdN3U5csbDQIz85eT1xn7OvN);
        Object object = collection.iterator();
        while (object.hasNext()) {
            char c = ((Character)object.next()).charValue();
            Rectangle2D rectangle2D = this.m$$OfIrIDn5cgloolWBl7xZfGMoiRfLYEFClQzqw9VXpXmdJmUSkiUDCDS1vvSee5NrCGbLfcFrQPBE7eyX5HGxsS2XEz5mNjjvz.getStringBounds(Character.toString(c), fontRenderContext);
            if (d < rectangle2D.getWidth()) {
                d = rectangle2D.getWidth();
            }
            if (!(d2 < rectangle2D.getHeight())) continue;
            d2 = rectangle2D.getHeight();
        }
        this.m$$lI71PgduX0kcnvSPp71sNOdqr6xh6gbHrW043VE8vfy9nimSwMLYxdYwovISze3zkzht9Dfwe86j10zywf3oHlIAWsly09UjF = (int)Math.ceil(Math.max(Math.ceil(Math.sqrt((d += 2.0) * d * (double)collection.size()) / d), Math.ceil(Math.sqrt((d2 += 2.0) * d2 * (double)collection.size()) / d2)) * Math.max(d, d2)) + 1;
        this.m$$HxqNsCgO3deNUzkvLLtnXw7bRY9VTuJb3jqFeiDSUQZrgNOr8kz5J5uS4U1I5U4L862BEPjXBgr7lH06laGITsBbbJOTaO2r5 = new BufferedImage(this.m$$lI71PgduX0kcnvSPp71sNOdqr6xh6gbHrW043VE8vfy9nimSwMLYxdYwovISze3zkzht9Dfwe86j10zywf3oHlIAWsly09UjF, this.m$$lI71PgduX0kcnvSPp71sNOdqr6xh6gbHrW043VE8vfy9nimSwMLYxdYwovISze3zkzht9Dfwe86j10zywf3oHlIAWsly09UjF, ((2146225137 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) ^ n + 31) >>> 13 | (2146225137 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) ^ n + 31) << 19) ^ 0x53D960AC);
        object = this.m$$HxqNsCgO3deNUzkvLLtnXw7bRY9VTuJb3jqFeiDSUQZrgNOr8kz5J5uS4U1I5U4L862BEPjXBgr7lH06laGITsBbbJOTaO2r5.createGraphics();
        ((Graphics)object).setFont(this.m$$OfIrIDn5cgloolWBl7xZfGMoiRfLYEFClQzqw9VXpXmdJmUSkiUDCDS1vvSee5NrCGbLfcFrQPBE7eyX5HGxsS2XEz5mNjjvz);
        ((Graphics)object).setColor(new Color((376178783 + (~n & \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) ^ n >>> 3) - 1332052588, (-1559492938 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & ~n) ^ ~n) - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & n), Integer.reverseBytes(((-1089025460 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) >>> 6 | -1089025460 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 - n) << 26) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 + n) - n) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01, 0));
        ((Graphics)object).fillRect(0, 0, this.m$$lI71PgduX0kcnvSPp71sNOdqr6xh6gbHrW043VE8vfy9nimSwMLYxdYwovISze3zkzht9Dfwe86j10zywf3oHlIAWsly09UjF, this.m$$lI71PgduX0kcnvSPp71sNOdqr6xh6gbHrW043VE8vfy9nimSwMLYxdYwovISze3zkzht9Dfwe86j10zywf3oHlIAWsly09UjF);
        ((Graphics)object).setColor(Color.white);
        if (((Boolean)m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd.m$$ukPtbytnnVDaHhpNdD4jhnxHWG3MdOp9PkszxMstVt4vnnCXkN8cL9RMCnyd9qdSYDzuJAnTLBEv2SEvzd6qObCFvgPqpOYWk.m$$I38cgQOt7amRD7uis1wrNu1m0jliImspxPhagBb1LMplReHI1raBCDQGglCXHyPbytLAZvSyC9k4zqAw0sX29of66SZBfhBXe.getValue()).booleanValue() && m$$ukPtbytnnVDaHhpNdD4jhnxHWG3MdOp9PkszxMstVt4vnnCXkN8cL9RMCnyd9qdSYDzuJAnTLBEv2SEvzd6qObCFvgPqpOYWk.isToggled()) {
            ((Graphics2D)object).setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
            ((Graphics2D)object).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            ((Graphics2D)object).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        } else {
            ((Graphics2D)object).setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, this.m$$rFW2LAoYJfhu66gHeEpAa4rIC2dkoDuKWDKSXApFLbkN6PkQPyUckM0iji1gTTbJ2J37mTRxwCdN3U5csbDQIz85eT1xn7OvN ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
            ((Graphics2D)object).setRenderingHint(RenderingHints.KEY_ANTIALIASING, this.m$$Pfy2pugLuUHmEnMriRTceVvq0BtETMDIngL3E6CncvDKwvmLd32cXne9by0ugxvhyG31jYsJiCCVd0j2e4u9RXAeKti3Rnts2 ? RenderingHints.VALUE_ANTIALIAS_OFF : RenderingHints.VALUE_ANTIALIAS_ON);
            ((Graphics2D)object).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, this.m$$Pfy2pugLuUHmEnMriRTceVvq0BtETMDIngL3E6CncvDKwvmLd32cXne9by0ugxvhyG31jYsJiCCVd0j2e4u9RXAeKti3Rnts2 ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        }
        FontMetrics fontMetrics = ((Graphics)object).getFontMetrics();
        int n2 = 0;
        int n3 = 0;
        int n4 = 1;
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            char c = ((Character)iterator.next()).charValue();
            m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 = new m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8();
            Rectangle2D rectangle2D = fontMetrics.getStringBounds(Character.toString(c), (Graphics)object);
            m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$vkLTYmql3gT2WDkcu7FB90q68NMsU9nqPbeit6YQhfZo0BxZ7yVGpwWwO50LTOJFNq3HgNdoAxsLi0fXRTJZ2s3DlIucgWqBS = rectangle2D.getBounds().width + ((0x1010005 + (n & 3) ^ 0) - (n & 0x10000) ^ 0x1000000);
            m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$pdiFvTRR66VDFJcdKHKocE6oznDebrKBAYK9S0Q575vIpbqBcFWTldpJ5ANqLiTzg9E8PF4fQxwKzePyz5FSxTGUAwDanHiUC = rectangle2D.getBounds().height;
            if (n3 + m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$vkLTYmql3gT2WDkcu7FB90q68NMsU9nqPbeit6YQhfZo0BxZ7yVGpwWwO50LTOJFNq3HgNdoAxsLi0fXRTJZ2s3DlIucgWqBS >= this.m$$lI71PgduX0kcnvSPp71sNOdqr6xh6gbHrW043VE8vfy9nimSwMLYxdYwovISze3zkzht9Dfwe86j10zywf3oHlIAWsly09UjF) {
                n3 = 0;
                n4 += n2;
                n2 = 0;
            }
            m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$QBsEoWaqzElltTD8Cx75GrI9PX1APsUomFw9DJF0raqpYnjvCyLbdHMirnBLv3GR62IuPo0wmLee9bs6AnpVMweaP6AYmiuOn = n3;
            m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$pPemcSBT6laakuliCvefPE4g0Yj8VrQeG9DCXXTWYiFUH2ysTQaYHWXI0TUpjb0fnyJBhIF4vy63I4Qx5GgrYpQ7lU2p3UOGu = n4;
            if (m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$pdiFvTRR66VDFJcdKHKocE6oznDebrKBAYK9S0Q575vIpbqBcFWTldpJ5ANqLiTzg9E8PF4fQxwKzePyz5FSxTGUAwDanHiUC > this.m$$yS2UWAtJA57McDZWqBNttkJtMEdiQviqpwpT7mWd2AeNeEnZUb1V4snIyLb07lCwD85bb90WBwU8p3RCkNz5e4cbrCW7d5xl5) {
                this.m$$yS2UWAtJA57McDZWqBNttkJtMEdiQviqpwpT7mWd2AeNeEnZUb1V4snIyLb07lCwD85bb90WBwU8p3RCkNz5e4cbrCW7d5xl5 = m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$pdiFvTRR66VDFJcdKHKocE6oznDebrKBAYK9S0Q575vIpbqBcFWTldpJ5ANqLiTzg9E8PF4fQxwKzePyz5FSxTGUAwDanHiUC;
            }
            if (m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$pdiFvTRR66VDFJcdKHKocE6oznDebrKBAYK9S0Q575vIpbqBcFWTldpJ5ANqLiTzg9E8PF4fQxwKzePyz5FSxTGUAwDanHiUC > n2) {
                n2 = m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$pdiFvTRR66VDFJcdKHKocE6oznDebrKBAYK9S0Q575vIpbqBcFWTldpJ5ANqLiTzg9E8PF4fQxwKzePyz5FSxTGUAwDanHiUC;
            }
            ((Graphics2D)object).drawString(Character.toString(c), n3 + (((-1297283689 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) ^ 0xF) >>> 10 | (-1297283689 + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 ^ n) ^ 0xF) << 22) - (n << 14) ^ 0x29ECB04D), n4 + fontMetrics.getAscent());
            n3 += m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$vkLTYmql3gT2WDkcu7FB90q68NMsU9nqPbeit6YQhfZo0BxZ7yVGpwWwO50LTOJFNq3HgNdoAxsLi0fXRTJZ2s3DlIucgWqBS;
            this.m$$zVdD1tLr0PByrKoyaZrXTmjMUEwJIAKlkqjXxL05YlMrlmEiUbkvWuPeye1RtFnBqadlPcjhMvDgZkUWQ95gVHAvwVyrj6r0S.put(c, (Object)m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8);
        }
        this.m$$HxqNsCgO3deNUzkvLLtnXw7bRY9VTuJb3jqFeiDSUQZrgNOr8kz5J5uS4U1I5U4L862BEPjXBgr7lH06laGITsBbbJOTaO2r5.flush();
        ((Graphics)object).dispose();
    }

    public float m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(char c, int n) {
        if (!this.m$$zVdD1tLr0PByrKoyaZrXTmjMUEwJIAKlkqjXxL05YlMrlmEiUbkvWuPeye1RtFnBqadlPcjhMvDgZkUWQ95gVHAvwVyrj6r0S.containsKey(c)) {
            c = (char)((0x100001D + (n & 3) ^ 0) - (n & 0x10000) ^ 0x1000000);
        }
        return ((m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8)this.m$$zVdD1tLr0PByrKoyaZrXTmjMUEwJIAKlkqjXxL05YlMrlmEiUbkvWuPeye1RtFnBqadlPcjhMvDgZkUWQ95gVHAvwVyrj6r0S.get((char)c)).m$$vkLTYmql3gT2WDkcu7FB90q68NMsU9nqPbeit6YQhfZo0BxZ7yVGpwWwO50LTOJFNq3HgNdoAxsLi0fXRTJZ2s3DlIucgWqBS;
    }

    public class_1044 m$$8YWcgCWPNWLtrm0zlh7U0BHv0QHuoyEQYOHJRnFsge4CTQrxPT8RQN5PVf4m8AJtgwYBwktZfKGJT61Goe7diF8puPEQ2Njyz(int n) {
        return this.m$$HDUd2YZYUWT4Mt9uZbKE2QUnCkNKgOYFT8T0bhiaYf8uYaQrdwdqw0luoVwhmlsqvSCTSMlzkqu46UGWEn5kbkoDST4da1Ld4;
    }

    public int m$$x27oHsgaXeAkzzHq04XTQaqpnYLA6MgVlnMT4XZJpVYPl7aCCcJD7vVXpEWd7pViPMHShWvDu5CzJg3N5vBPeLLs4q862QrN4(int n) {
        return this.m$$yS2UWAtJA57McDZWqBNttkJtMEdiQviqpwpT7mWd2AeNeEnZUb1V4snIyLb07lCwD85bb90WBwU8p3RCkNz5e4cbrCW7d5xl5;
    }

    public boolean m$$TC8ZQRbsir9EWTYvrvU9N2x2kbxZBV4XKhHanFuPFZ4Fr2Fqfi5uf0RnDQvuJfNWL5wJ0SmkAbSas8nIWbTQKrhzR2kV46cAt(int n) {
        return this.m$$Pfy2pugLuUHmEnMriRTceVvq0BtETMDIngL3E6CncvDKwvmLd32cXne9by0ugxvhyG31jYsJiCCVd0j2e4u9RXAeKti3Rnts2;
    }

    public boolean m$$GUIQZaF1m35w9VO0foJFVgUYjDen85opCVbDiVtMv2vGNkO92NaRsBGyEzEBlL0n2MWwe9l0qynm2jTVWnGcBTPEPpJPvdLW4(int n) {
        return this.m$$rFW2LAoYJfhu66gHeEpAa4rIC2dkoDuKWDKSXApFLbkN6PkQPyUckM0iji1gTTbJ2J37mTRxwCdN3U5csbDQIz85eT1xn7OvN;
    }

    public void m$$Pb25YBAsMHqxlJu0wva2Op3aMDFFcWmLMAocy06r51lhKWCeDuXDQmZ4O2eaAWdehGEXQku9NkBIj0lzMRdXFgJEKn8nnIxB6(int n) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write((RenderedImage)this.m$$HxqNsCgO3deNUzkvLLtnXw7bRY9VTuJb3jqFeiDSUQZrgNOr8kz5J5uS4U1I5U4L862BEPjXBgr7lH06laGITsBbbJOTaO2r5,  /* dynamic constant */ (String)m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd.m$$M2458eFog8mePdvb6Jy7SxJlrNkREJ0WaaD9GjlSlJSJ0wAn70ma5shZ0qS4GlqliVsqq7rhRtdLNjZ1j6t8IAgGWVaDk08h6("zDUCk6NkSNyJsCNBvKpR", MethodHandles.lookup(), "m$$M2458eFog8mePdvb6Jy7SxJlrNkREJ0WaaD9GjlSlJSJ0wAn70ma5shZ0qS4GlqliVsqq7rhRtdLNjZ1j6t8IAgGWVaDk08h6", m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd.class, 1230093523), byteArrayOutputStream);
            byte[] byArray = byteArrayOutputStream.toByteArray();
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)byArray.length).put(byArray);
            byteBuffer.flip();
            this.m$$HDUd2YZYUWT4Mt9uZbKE2QUnCkNKgOYFT8T0bhiaYf8uYaQrdwdqw0luoVwhmlsqvSCTSMlzkqu46UGWEn5kbkoDST4da1Ld4 = new class_1043(() ->  /* dynamic constant */ (String)m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd.m$$M2458eFog8mePdvb6Jy7SxJlrNkREJ0WaaD9GjlSlJSJ0wAn70ma5shZ0qS4GlqliVsqq7rhRtdLNjZ1j6t8IAgGWVaDk08h6("IxU1zHQf3agGrohV7fLo", MethodHandles.lookup(), "m$$M2458eFog8mePdvb6Jy7SxJlrNkREJ0WaaD9GjlSlJSJ0wAn70ma5shZ0qS4GlqliVsqq7rhRtdLNjZ1j6t8IAgGWVaDk08h6", m$$7kYWvXVqccr30JAGdZdVtXYBOvmU4XZUHrETQ0i7oAw7Y0dPcuz8fdIPeSrudGh5v49oqAh0uUyQSQuuI9jDIHcfaPZudnEmd.class, 2121377242), class_1011.method_4324((ByteBuffer)byteBuffer));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void m$$ZYYlIvDvbgSsCChKU3PTYvJ4AEm3b2bJJODnelAcWgfVx3SYeFH4KZYvJ34GDm2x7Rus5iIhxp1cW6Bl0JpWQO7sRIt3Gb21I(int n) {
        this.m$$HDUd2YZYUWT4Mt9uZbKE2QUnCkNKgOYFT8T0bhiaYf8uYaQrdwdqw0luoVwhmlsqvSCTSMlzkqu46UGWEn5kbkoDST4da1Ld4.close();
        this.m$$zVdD1tLr0PByrKoyaZrXTmjMUEwJIAKlkqjXxL05YlMrlmEiUbkvWuPeye1RtFnBqadlPcjhMvDgZkUWQ95gVHAvwVyrj6r0S.clear();
    }
}

