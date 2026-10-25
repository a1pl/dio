package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import java.io.FileInputStream;
import java.util.Optional;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V;
import me.mioclient.m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud;
import me.mioclient.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_2960;
import net.minecraft.class_3262;
import net.minecraft.class_3298;
import net.minecraft.class_6861;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={class_6861.class})
public class m$$a5eODVMQD2muwvTO43lZ1ucjZl4FhxrEJeevDjQD6VL7UhHsF8VVTUEVZ3pLqZMzxmOFfv70rlTc8265XS3zJfP9VIKWCCSbZ {
    @ModifyReturnValue(method={"getResource"}, at={@At(value="RETURN")})
    private Optional m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(Optional optional, @Local(argsOnly=true) class_2960 class_29602) {
        if (class_29602.method_12836().equals("mio-mount")) {
            return Optional.of(new class_3298((class_3262)new m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V(), () -> new FileInputStream(m$$ymQhoxFQNpUfiljZKL40E32iRah0Ym6lHVkh9l2zzuOHjXXWvqMrRPYqZGahbHJ0TAa6yMHrpHkpzZrfL7mr0zhEhBlr203ud.m$$dJRHlW2HKSnwTj3TMuuIfuHE1Fjk45tSF2PZfCUi5KhtXbEEYHvJf3JsC56nRF5QlgkEak3Gr2Ll3WzaExURuC4S3CWlC5SCS.resolve(class_29602.method_12832()).toFile())));
        }
        if (optional.isEmpty() && (class_29602.method_12836().equals("mio") || m$$a5eODVMQD2muwvTO43lZ1ucjZl4FhxrEJeevDjQD6VL7UhHsF8VVTUEVZ3pLqZMzxmOFfv70rlTc8265XS3zJfP9VIKWCCSbZ.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_29602)) && m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$N7Fuy59jlFJoEyUR5zFCDWMJx9PRCjnqpN1gaG8rYDZDTw1x7RtxzjXMa8GGy4p8yLZ2qzDtg0NWKT6zxXY2Dmx65cghVSHV8()) {
            String string = m$$a5eODVMQD2muwvTO43lZ1ucjZl4FhxrEJeevDjQD6VL7UhHsF8VVTUEVZ3pLqZMzxmOFfv70rlTc8265XS3zJfP9VIKWCCSbZ.m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_29602) ? "minecraft" : "mio";
            return Optional.of(new class_3298((class_3262)new m$$S23PTJI2TyjZhB6yiyPdATennVVQ0YS6T4woFfDtVQ3d74XPT5XnIc5FscJRyuJ8Wahiw3k1yoFDJNkWLrpvyiS6DrYZ1eT0V(), () -> m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.class.getClassLoader().getResourceAsStream("assets/%s/%s".formatted(string, class_29602.method_12832()))));
        }
        return optional;
    }

    private static boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2960 class_29602) {
        String string = class_29602.method_12832();
        return string.contains("/blur_mask.") || string.contains("/bloom.");
    }
}

