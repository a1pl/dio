package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import java.io.InputStream;
import java.util.Map;
import me.mioclient.m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V;
import me.mioclient.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_10151;
import net.minecraft.class_2960;
import net.minecraft.class_3262;
import net.minecraft.class_3298;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={class_10151.class})
public class m$$TsJy3WWLeAePOfRZfhS4Y8r1160D025QybouBn2RPqhL4TxXTX91AL3EqEz94nEUquywEYBB0MQUQOc4veVrsE7dV0bwIs145 {
    @ModifyExpressionValue(method={"prepare(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/util/profiler/Profiler;)Lnet/minecraft/client/gl/ShaderLoader$Definitions;"}, at={@At(value="INVOKE", target="Lnet/minecraft/resource/ResourceManager;findResources(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;")})
    private Map m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(Map map) {
        if (map.keySet().stream().noneMatch(class_29602 -> class_29602.toString().contains("mio_lightmap"))) {
            m$$TsJy3WWLeAePOfRZfhS4Y8r1160D025QybouBn2RPqhL4TxXTX91AL3EqEz94nEUquywEYBB0MQUQOc4veVrsE7dV0bwIs145.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(map, "shaders/core/mio_lightmap");
        }
        if (map.keySet().stream().noneMatch(class_29602 -> class_29602.toString().contains("mio_pos_tex_color"))) {
            m$$TsJy3WWLeAePOfRZfhS4Y8r1160D025QybouBn2RPqhL4TxXTX91AL3EqEz94nEUquywEYBB0MQUQOc4veVrsE7dV0bwIs145.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(map, "shaders/core/mio_pos_tex_color");
        }
        if (map.keySet().stream().noneMatch(class_29602 -> class_29602.toString().contains("shaders/program/blur_mask.fsh"))) {
            m$$TsJy3WWLeAePOfRZfhS4Y8r1160D025QybouBn2RPqhL4TxXTX91AL3EqEz94nEUquywEYBB0MQUQOc4veVrsE7dV0bwIs145.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(map, "shaders/program/blur_mask");
        }
        if (map.keySet().stream().noneMatch(class_29602 -> class_29602.toString().contains("shaders/program/bloom.fsh"))) {
            m$$TsJy3WWLeAePOfRZfhS4Y8r1160D025QybouBn2RPqhL4TxXTX91AL3EqEz94nEUquywEYBB0MQUQOc4veVrsE7dV0bwIs145.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(map, "shaders/program/bloom");
        }
        return map;
    }

    @ModifyExpressionValue(method={"prepare(Lnet/minecraft/resource/ResourceManager;Lnet/minecraft/util/profiler/Profiler;)Lnet/minecraft/client/gl/ShaderLoader$Definitions;"}, at={@At(value="INVOKE", target="Lnet/minecraft/resource/ResourceFinder;findResources(Lnet/minecraft/resource/ResourceManager;)Ljava/util/Map;")})
    private Map m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(Map map) {
        if (map.keySet().stream().noneMatch(class_29602 -> class_29602.toString().equals("post_effect/blur_mask.json"))) {
            m$$TsJy3WWLeAePOfRZfhS4Y8r1160D025QybouBn2RPqhL4TxXTX91AL3EqEz94nEUquywEYBB0MQUQOc4veVrsE7dV0bwIs145.m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(map, "post_effect/blur_mask.json");
        }
        if (map.keySet().stream().noneMatch(class_29602 -> class_29602.toString().equals("post_effect/bloom.json"))) {
            m$$TsJy3WWLeAePOfRZfhS4Y8r1160D025QybouBn2RPqhL4TxXTX91AL3EqEz94nEUquywEYBB0MQUQOc4veVrsE7dV0bwIs145.m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(map, "post_effect/bloom.json");
        }
        return map;
    }

    @Unique
    private static void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(Map map, String string) {
        String[] stringArray;
        for (String string2 : stringArray = new String[]{"fsh", "vsh", "json"}) {
            InputStream inputStream = m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.class.getClassLoader().getResourceAsStream("assets/minecraft/%s.%s".formatted(string, string2));
            if (inputStream == null) continue;
            try {
                inputStream.close();
            } catch (Exception exception) {
                // empty catch block
            }
            m$$TsJy3WWLeAePOfRZfhS4Y8r1160D025QybouBn2RPqhL4TxXTX91AL3EqEz94nEUquywEYBB0MQUQOc4veVrsE7dV0bwIs145.m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(map, "%s.%s".formatted(string, string2));
        }
    }

    @Unique
    private static void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(Map map, String string) {
        class_3298 class_32982 = new class_3298((class_3262)new m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V(), () -> m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.class.getClassLoader().getResourceAsStream("assets/minecraft/" + string));
        map.put(class_2960.method_60655((String)"minecraft", (String)string), class_32982);
    }
}

