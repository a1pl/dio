package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import java.awt.Color;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$EOkWgunNz8tWK3LqzrtqZnFgHsYI74sT2yT9YKDieCxFbpkmaNEEcj3HKvCV8NBfwKD0Iu2MR6ZqHWWpV4rFvULnCpa7OEhB6;
import me.mioclient.m$$HgFFvtHL0ms9spD5OnkZDEw0j2Kzlb3x5jIdY7CrAYGEKi91rylbiyAMl10LEgqz1ErggdtAV97HBDmsrsgseTWe6gNk2PW1Z;
import me.mioclient.m$$U06wAdbal9c2tydaZHi7748TVcVwW2bZgovjk7GFooaETKTiOhGg9yB0lZ1Y8aexU4VR3M8NH2waRfLg74cum1hWwGVHrgrQm;
import me.mioclient.m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_341;
import net.minecraft.class_5225;
import net.minecraft.class_5250;
import net.minecraft.class_5348;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value={class_341.class})
public class m$$Ak2eHYNVXPpGK8pnbRug4YxH1DLIhPJTEbYJxGY0mpn9PkRvhXgzLebzvirC4RkacUFYgacnWBiWLqbtiUmwVe7wD2qf4mg8K {
    private static final String m$$7NXHiOT0tpluK4CV61R3yWSRpe7Mz97hWAiEWrWumtyWEnc0OJADHbp54seyJ331Kr9CejjUQVOAOXunGoi68nYtBf2o1ABCN = "\u00a7svo";
    private static final m$$U06wAdbal9c2tydaZHi7748TVcVwW2bZgovjk7GFooaETKTiOhGg9yB0lZ1Y8aexU4VR3M8NH2waRfLg74cum1hWwGVHrgrQm m$$FRUoLijfpaF0AscB8mUhrhNdNEblEiPOZuoJxqug1epMQkvhce1Jg2Cq3ct30g7xTvsaqo4EG8Syw6bOlNV2NSj6wmJMo13uj = (m$$U06wAdbal9c2tydaZHi7748TVcVwW2bZgovjk7GFooaETKTiOhGg9yB0lZ1Y8aexU4VR3M8NH2waRfLg74cum1hWwGVHrgrQm)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$U06wAdbal9c2tydaZHi7748TVcVwW2bZgovjk7GFooaETKTiOhGg9yB0lZ1Y8aexU4VR3M8NH2waRfLg74cum1hWwGVHrgrQm.class);
    private static final m$$EOkWgunNz8tWK3LqzrtqZnFgHsYI74sT2yT9YKDieCxFbpkmaNEEcj3HKvCV8NBfwKD0Iu2MR6ZqHWWpV4rFvULnCpa7OEhB6 m$$hKuz3sHyuVZTnb8n7ABrLHrsTSpr9CGUTJkn3dUOLdFBQSBiesoMkHtEjYtPndsXLjP4Ct7pWevav93v7X3SJcWl0SnnB9RGH = (m$$EOkWgunNz8tWK3LqzrtqZnFgHsYI74sT2yT9YKDieCxFbpkmaNEEcj3HKvCV8NBfwKD0Iu2MR6ZqHWWpV4rFvULnCpa7OEhB6)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$EOkWgunNz8tWK3LqzrtqZnFgHsYI74sT2yT9YKDieCxFbpkmaNEEcj3HKvCV8NBfwKD0Iu2MR6ZqHWWpV4rFvULnCpa7OEhB6.class);

    @ModifyExpressionValue(method={"breakRenderedChatMessageLines"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/font/TextRenderer;getTextHandler()Lnet/minecraft/client/font/TextHandler;")})
    private static class_5225 m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_5225 class_52252) {
        m$$HgFFvtHL0ms9spD5OnkZDEw0j2Kzlb3x5jIdY7CrAYGEKi91rylbiyAMl10LEgqz1ErggdtAV97HBDmsrsgseTWe6gNk2PW1Z m$$HgFFvtHL0ms9spD5OnkZDEw0j2Kzlb3x5jIdY7CrAYGEKi91rylbiyAMl10LEgqz1ErggdtAV97HBDmsrsgseTWe6gNk2PW1Z = m$$k8XynHOwrNYv11UwnJW4pEPQwRLvcjhKalvaKGCiUakDxoKNxYz2XK3sNDf7xp7L5qT2X8RvA2W774vLS2gouhOB0jdOBcOpB.m$$0EamhOBKO53b7FTInsEKAyYgGGs1ndX2QqsiesT60uJawO4khwrKtVpAJczxbf1xb9KFfXAnXjgyrkilgORYZDqRlXryxl2MO.m$$l8g3frEiHILtQcXqBlYSunqrz7m5bjp5CTDdgPHoViod6qvlthujvyfUxnbhBTmpimFWYx6qMH6ypN2AHjE3KRNWxhCXZfiX4();
        if (m$$HgFFvtHL0ms9spD5OnkZDEw0j2Kzlb3x5jIdY7CrAYGEKi91rylbiyAMl10LEgqz1ErggdtAV97HBDmsrsgseTWe6gNk2PW1Z != null && m$$hKuz3sHyuVZTnb8n7ABrLHrsTSpr9CGUTJkn3dUOLdFBQSBiesoMkHtEjYtPndsXLjP4Ct7pWevav93v7X3SJcWl0SnnB9RGH.isToggled() && ((Boolean)m$$Ak2eHYNVXPpGK8pnbRug4YxH1DLIhPJTEbYJxGY0mpn9PkRvhXgzLebzvirC4RkacUFYgacnWBiWLqbtiUmwVe7wD2qf4mg8K.m$$hKuz3sHyuVZTnb8n7ABrLHrsTSpr9CGUTJkn3dUOLdFBQSBiesoMkHtEjYtPndsXLjP4Ct7pWevav93v7X3SJcWl0SnnB9RGH.m$$O9okGkWhhuzzdHLlPvvOFCOQ8D2ERIiju6gsFUqZsXBKHmm6dbjUnF2zaLCzWYMA4KWf5971xlW6L2vWlvVazhMoJihMWT3li.getValue()).booleanValue()) {
            return m$$HgFFvtHL0ms9spD5OnkZDEw0j2Kzlb3x5jIdY7CrAYGEKi91rylbiyAMl10LEgqz1ErggdtAV97HBDmsrsgseTWe6gNk2PW1Z.m$$X8unOmnVSWmTfyp4lvPt9Hs2plmremhztnmYM0bBmzGk5XmaKF7wQqweXp6LAlX9A7kHKD787Wv4orDafRELe4jU4CjU7RIT8(1830183354);
        }
        return class_52252;
    }

    @ModifyVariable(method={"breakRenderedChatMessageLines"}, at=@At(value="HEAD"), ordinal=0, argsOnly=true)
    private static class_5348 m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_5348 class_53482) {
        if (!m$$FRUoLijfpaF0AscB8mUhrhNdNEblEiPOZuoJxqug1epMQkvhce1Jg2Cq3ct30g7xTvsaqo4EG8Syw6bOlNV2NSj6wmJMo13uj.isToggled() || !((Boolean)m$$Ak2eHYNVXPpGK8pnbRug4YxH1DLIhPJTEbYJxGY0mpn9PkRvhXgzLebzvirC4RkacUFYgacnWBiWLqbtiUmwVe7wD2qf4mg8K.m$$FRUoLijfpaF0AscB8mUhrhNdNEblEiPOZuoJxqug1epMQkvhce1Jg2Cq3ct30g7xTvsaqo4EG8Syw6bOlNV2NSj6wmJMo13uj.m$$On1M78PmVTmnRZLPvh5FZp47avB9RzRSum1d9R8nknDD8ANoZ2EkuTjBcQSijuU80JeBLxPW81VjwaUT6aWWAh3ivL74lxtaF.getValue()).booleanValue()) {
            return class_53482;
        }
        String string = class_310.method_1551().method_1548().method_1676();
        class_5250 class_52502 = class_2561.method_43473();
        class_53482.method_27658((class_25834, string2) -> {
            if (!string2.contains(string)) {
                class_52502.method_10852((class_2561)class_2561.method_43470((String)string2).method_10862(class_25834));
            } else {
                String[] stringArray;
                Pattern pattern = Pattern.compile("(?<![a-zA-Z])%s(?![a-zA-Z])".formatted(string));
                Matcher matcher = pattern.matcher(string2);
                StringBuilder stringBuilder = new StringBuilder();
                while (matcher.find()) {
                    matcher.appendReplacement(stringBuilder, m$$7NXHiOT0tpluK4CV61R3yWSRpe7Mz97hWAiEWrWumtyWEnc0OJADHbp54seyJ331Kr9CejjUQVOAOXunGoi68nYtBf2o1ABCN + matcher.group() + m$$7NXHiOT0tpluK4CV61R3yWSRpe7Mz97hWAiEWrWumtyWEnc0OJADHbp54seyJ331Kr9CejjUQVOAOXunGoi68nYtBf2o1ABCN);
                }
                matcher.appendTail(stringBuilder);
                for (String string3 : stringArray = stringBuilder.toString().split(m$$7NXHiOT0tpluK4CV61R3yWSRpe7Mz97hWAiEWrWumtyWEnc0OJADHbp54seyJ331Kr9CejjUQVOAOXunGoi68nYtBf2o1ABCN)) {
                    if (!string3.equals(string)) {
                        class_52502.method_10852((class_2561)class_2561.method_43470((String)string3).method_10862(class_25834));
                        continue;
                    }
                    Color color = (Color)m$$Ak2eHYNVXPpGK8pnbRug4YxH1DLIhPJTEbYJxGY0mpn9PkRvhXgzLebzvirC4RkacUFYgacnWBiWLqbtiUmwVe7wD2qf4mg8K.m$$FRUoLijfpaF0AscB8mUhrhNdNEblEiPOZuoJxqug1epMQkvhce1Jg2Cq3ct30g7xTvsaqo4EG8Syw6bOlNV2NSj6wmJMo13uj.m$$OiTYdnZUFeEqGY1YzgvEFMqhO8XHZwnF5ul4rBAfA2haPO9XDvzaoJ3YUqPLGWtibH08ulYxg7psn2Po5t4PEyodFTVANPjFx.getValue();
                    class_5250 class_52503 = class_2561.method_43470((String)string3).method_27694(class_25832 -> class_25832.method_36139(new Color(color.getRed(), color.getGreen(), color.getBlue(), 255).getRGB()));
                    class_52503.method_27694(class_25833 -> {
                        class_25833.method_10982(Boolean.valueOf(class_25834.method_10984()));
                        class_25833.method_10978(Boolean.valueOf(class_25834.method_10966()));
                        class_25833.method_30938(Boolean.valueOf(class_25834.method_10965()));
                        class_25833.method_36141(Boolean.valueOf(class_25834.method_10987()));
                        class_25833.method_36140(Boolean.valueOf(class_25834.method_10986()));
                        return class_25833;
                    });
                    class_52502.method_10852((class_2561)class_52503);
                }
            }
            return Optional.empty();
        }, class_2583.field_24360);
        return class_52502;
    }
}

