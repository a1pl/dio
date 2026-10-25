package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.sugar.Local;
import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import me.mioclient.m$$0rBUCLb4z9PRTb0kePvQAdhlPPJQEuWVVa3PpJJftIx31cd4y02fUIQoScUSHQB25VerK5lacGGhPoCrPkUe0SD2h4x1452PM;
import me.mioclient.m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW;
import me.mioclient.m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv;
import me.mioclient.m$$HF6xcp0tb4bRXiB1EXcTEHaNi5cBmGg2yStyyaxeBxioFrqtzkvHzkRpLiE7Erm19nrVaCKZMYCFGdtMDhWoWvb2QbVp1mQv2;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb;
import me.mioclient.m$$cHoCIJVyvve7jcDPES24ZHNm1Cu9gAMfHI6fHqyrnzgAxyh0Z1tDFI5M5AS4oa0JXzZUyDiwkf86Lzq7mfz6Ky0GC9eaNVsFO;
import me.mioclient.m$$o5Ym7YA3l6kqQzpgFcFW1QohtbfmeKt79Xp0rNwE3ZcHsXCpBoM7ENC2VTFBWIcVHYvhXdkNMb8ls60ditGQfnIpoRYq5PQfm;
import me.mioclient.m$$qZaJDe6PYrQFju6Sm5ODIk9caBggkDSd5DcMpSZBiasETHf6xFfAaBqE8UXDd2mFED2tCukh6aFD280KAh2ptVAetFGfikoix;
import me.mioclient.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml;
import me.mioclient.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$xMIRfWaNjMW8vojgdvy5yVm3ZoF8Cll0p2MkyXFhtDOyIDQBWvD9fCp0RPsOT6TBOjQ1p34m1pNjc7xwjo4B2Yv2aRPWrT2VL;
import me.mioclient.m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_310;
import net.minecraft.class_3695;
import net.minecraft.class_3965;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4599;
import net.minecraft.class_4604;
import net.minecraft.class_638;
import net.minecraft.class_757;
import net.minecraft.class_761;
import net.minecraft.class_9779;
import net.minecraft.class_9909;
import net.minecraft.class_9922;
import net.minecraft.class_9925;
import net.minecraft.class_9958;
import net.minecraft.class_9960;
import net.minecraft.class_9976;
import net.minecraft.class_9978;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_761.class})
public abstract class m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m
implements m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82,
m$$cHoCIJVyvve7jcDPES24ZHNm1Cu9gAMfHI6fHqyrnzgAxyh0Z1tDFI5M5AS4oa0JXzZUyDiwkf86Lzq7mfz6Ky0GC9eaNVsFO {
    private static final m$$0rBUCLb4z9PRTb0kePvQAdhlPPJQEuWVVa3PpJJftIx31cd4y02fUIQoScUSHQB25VerK5lacGGhPoCrPkUe0SD2h4x1452PM m$$AA5zDezRgvdLvAvLMD0KtI6WjnSlf2wMUc0Run2TsfH0Z3dQ0cOzijZbf1EnE1G9B4gPBe6clo1wAIU1wFXaUQWKO0XMAaxiq = (m$$0rBUCLb4z9PRTb0kePvQAdhlPPJQEuWVVa3PpJJftIx31cd4y02fUIQoScUSHQB25VerK5lacGGhPoCrPkUe0SD2h4x1452PM)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$0rBUCLb4z9PRTb0kePvQAdhlPPJQEuWVVa3PpJJftIx31cd4y02fUIQoScUSHQB25VerK5lacGGhPoCrPkUe0SD2h4x1452PM.class);
    private static final m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml m$$H1sMGnOyIdTrfryYhGTQSkgLM4aLdWjT3jN3D654rYEFHDvGpwLVsHPGAxvfJo3JDQXUwR18GVPpA7FmZBAdhQua4dTf53dDT = (m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml.class);
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$srZa5lBh3mT7FWlAyIHwQEFcP0TeLosKUEda6dn6WqjsYz8wLEOpI32Z1e71QXcMMwnb33ZdZO5DY9WQcmxoQI25Zna8HTjLq = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    private static final m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv m$$JjiVZC1ygplRxg22UxIbDjFnL9Vb90WokfXGw7aqGeDiRjAh0VPIhAzeuEiqgT8QMuvcl4XUfOfHtXvKl6ipSDCf2oCz2VT7w = (m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$F1XdAZcvTe42YnXOGORqVM8j1DJhgttJm6DD2b1vPhSiYLQrRCEOsRicVM8x5rm8fl4lEwtGJI16YEMlzETZOXcjKewSZ6luv.class);
    private static final m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj m$$50oHcTid7Wwqugv9tr6hJF5LFxoOHa45SqM4YGe9h0CwxncpvglE5yrxt0oY8zp3rTWf3xl7HUj3Pf6Lnaa43PT6IPYs3DkAs = (m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$zPP5X2O43bfShCisUmmK8WVN5BCtZdj5Y0pmQitJg0dES6AeNHEvtxNowkURPcUXIzxsO9Z9TwZGluxZ8EiXY9w3Pxbn8NYjj.class);
    private static final m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb m$$CBzVFRbu0Oliql2CU0KU9Fn7kTFg65zU1U3b2jW4ov2hEu2KWZbZJZ0q0ToplN0a7zHP4KhOJLg5INAl5NmaDTlxMFuhgn5xq = (m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.class);
    @Unique
    private class_4587 m$$wgCNU6gnBrMr4qCvC8KcYrNmCp0XSxYLKkMY8KmvTLjEuELgfJfpCbKfmkw8D9BGsDVRZCv67E0sLshS3FMyWpuMU0MPPby0O;
    @Shadow
    @Nullable
    private class_638 field_4085;
    @Shadow
    @Nullable
    private class_276 field_53080;
    @Shadow
    @Final
    private class_9960 field_53081;
    @Shadow
    @Final
    private class_9978 field_53077;
    @Shadow
    @Final
    private class_310 field_4088;
    @Shadow
    @Final
    private class_4599 field_20951;
    @Unique
    private Stack m$$KHvmrZhZUvwXyw6eV6NHDOSRyVwNsxh3Yy0vf3vaF9ymPpfkNj4mF9mcHxUZVXc4vUyvCmaWablHph7DNV3lKJVpBygNmq2of;
    @Unique
    private Stack m$$ymXycynkG22ax08L4sAaVkN0BkSPZZz75JnV7hY878lN521YtqgYpHj1YUSn5LmXrU6nmnWvZzKLzXQNbhm5ALS0Wu63arUMR;

    @WrapWithCondition(method={"method_62216"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/WeatherRendering;renderPrecipitation(Lnet/minecraft/world/World;Lnet/minecraft/client/render/VertexConsumerProvider;IFLnet/minecraft/util/math/Vec3d;)V")})
    private boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_9976 class_99762, class_1937 class_19372, class_4597 class_45972, int n, float f, class_243 class_2432) {
        return !m$$H1sMGnOyIdTrfryYhGTQSkgLM4aLdWjT3jN3D654rYEFHDvGpwLVsHPGAxvfJo3JDQXUwR18GVPpA7FmZBAdhQua4dTf53dDT.isToggled() || (Boolean)m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m.m$$H1sMGnOyIdTrfryYhGTQSkgLM4aLdWjT3jN3D654rYEFHDvGpwLVsHPGAxvfJo3JDQXUwR18GVPpA7FmZBAdhQua4dTf53dDT.m$$xIB8ZP0NNYt4DdM8FOaBVlSHEUH2NdTbw8Mzp7LV82kZCT43w7UHMWFUULqsU5yD7LNnwXuG4z4UO8LT1LHyctOYearqD1uIX.getValue() == false || m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m.m$$H1sMGnOyIdTrfryYhGTQSkgLM4aLdWjT3jN3D654rYEFHDvGpwLVsHPGAxvfJo3JDQXUwR18GVPpA7FmZBAdhQua4dTf53dDT.m$$vtCWz9XU0vMTxua666oju82FNje2LIVGxb4Hi3tdjvS13M1Ht4rewhSCXse8f1z62XW3mbW3Q2Nvd4tUomwXKlhNCZ368Nzwh.getValue() != m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$yXPqncXclFfnyzDJTFdvWABzj28o9FJ3ebww3r9kmeA5HqGrBCWJXrwiB1kOcaLdu4bFOFUPAYWaEZUnGRb862iAlN6cGcKgy;
    }

    @Inject(method={"render"}, at={@At(value="RETURN")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_9922 class_99222, class_9779 class_97792, boolean bl, class_4184 class_41842, class_757 class_7572, Matrix4f matrix4f, Matrix4f matrix4f2, CallbackInfo callbackInfo) {
        class_4587 class_45872 = new class_4587();
        m$$o5Ym7YA3l6kqQzpgFcFW1QohtbfmeKt79Xp0rNwE3ZcHsXCpBoM7ENC2VTFBWIcVHYvhXdkNMb8ls60ditGQfnIpoRYq5PQfm.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(() -> {
            class_45872.method_22903();
            m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_45872);
            m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1522());
            m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(1.0f, 1.0f, 1.0f, 1.0f);
            m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk = m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_45872, m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge());
            m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk);
            m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.method_1522());
            m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 = m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_45872, m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge());
            m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8);
            class_45872.method_22909();
        });
    }

    @Inject(method={"method_62214"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/BufferBuilderStorage;getEntityVertexConsumers()Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;", shift=At.Shift.BEFORE)})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_9958 class_99582, class_9779 class_97792, class_4184 class_41842, class_3695 class_36952, Matrix4f matrix4f, Matrix4f matrix4f2, class_9925 class_99252, class_9925 class_99253, boolean bl, class_4604 class_46042, class_9925 class_99254, class_9925 class_99255, CallbackInfo callbackInfo, @Local class_4587 class_45872) {
        m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW = m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(class_45872, m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge());
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$1j6Lftoh5VGhPR9gx8QueXPF6GC77KO8g8SpN8AQ0FPNI9fg7lXpPpbFSRbK41YvwoEWSA0UuegIqobPw1LKiGwGSANuSkSGo$m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW);
    }

    @WrapWithCondition(method={"method_62214"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/WorldRenderer;renderTargetBlockOutline(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/util/math/MatrixStack;Z)V")})
    private boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_761 class_7612, class_4184 class_41842, class_4597.class_4598 class_45982, class_4587 class_45872, boolean bl) {
        if (!(m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1765 instanceof class_3965)) {
            return true;
        }
        class_2338 class_23382 = ((class_3965)m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1765).method_17777();
        m$$qZaJDe6PYrQFju6Sm5ODIk9caBggkDSd5DcMpSZBiasETHf6xFfAaBqE8UXDd2mFED2tCukh6aFD280KAh2ptVAetFGfikoix m$$qZaJDe6PYrQFju6Sm5ODIk9caBggkDSd5DcMpSZBiasETHf6xFfAaBqE8UXDd2mFED2tCukh6aFD280KAh2ptVAetFGfikoix = new m$$qZaJDe6PYrQFju6Sm5ODIk9caBggkDSd5DcMpSZBiasETHf6xFfAaBqE8UXDd2mFED2tCukh6aFD280KAh2ptVAetFGfikoix(class_45872, null, class_23382, m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687.method_8320(class_23382));
        m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$qZaJDe6PYrQFju6Sm5ODIk9caBggkDSd5DcMpSZBiasETHf6xFfAaBqE8UXDd2mFED2tCukh6aFD280KAh2ptVAetFGfikoix);
        return !m$$qZaJDe6PYrQFju6Sm5ODIk9caBggkDSd5DcMpSZBiasETHf6xFfAaBqE8UXDd2mFED2tCukh6aFD280KAh2ptVAetFGfikoix.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT();
    }

    @Inject(method={"hasBlindnessOrDarkness"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_4184 class_41842, CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$srZa5lBh3mT7FWlAyIHwQEFcP0TeLosKUEda6dn6WqjsYz8wLEOpI32Z1e71QXcMMwnb33ZdZO5DY9WQcmxoQI25Zna8HTjLq.isToggled() && ((Boolean)m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m.m$$srZa5lBh3mT7FWlAyIHwQEFcP0TeLosKUEda6dn6WqjsYz8wLEOpI32Z1e71QXcMMwnb33ZdZO5DY9WQcmxoQI25Zna8HTjLq.m$$8CV8a85SDAGQio9hjG9UlxmwRlH15JeGS2zjcAGXUngaSadL0HbsuMX4F5QqsMrNaavgjkIoPILl6ufPhLHoMp4RGvJ4KG5Qq.getValue()).booleanValue()) {
            callbackInfoReturnable.setReturnValue(null);
        }
    }

    @ModifyExpressionValue(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isSpectator()Z")})
    private boolean m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9(boolean bl) {
        if (m$$JjiVZC1ygplRxg22UxIbDjFnL9Vb90WokfXGw7aqGeDiRjAh0VPIhAzeuEiqgT8QMuvcl4XUfOfHtXvKl6ipSDCf2oCz2VT7w.isToggled() || m$$AA5zDezRgvdLvAvLMD0KtI6WjnSlf2wMUc0Run2TsfH0Z3dQ0cOzijZbf1EnE1G9B4gPBe6clo1wAIU1wFXaUQWKO0XMAaxiq.isToggled() && m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1773.method_19418().method_19333()) {
            return true;
        }
        return bl;
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_9922 class_99222, class_9779 class_97792, boolean bl, class_4184 class_41842, class_757 class_7572, Matrix4f matrix4f, Matrix4f matrix4f2, CallbackInfo callbackInfo) {
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$0a6satRcVmfiZwanl0RgzcMCb0erhZREX3tKsob6XE1D4QKMc68LuPqxPdhcvQymN439ibhFWuDkCK4ezfpJrVIkGLaGWuoTq(class_97792.method_60637(false));
        this.m$$wgCNU6gnBrMr4qCvC8KcYrNmCp0XSxYLKkMY8KmvTLjEuELgfJfpCbKfmkw8D9BGsDVRZCv67E0sLshS3FMyWpuMU0MPPby0O = new class_4587();
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$wgCNU6gnBrMr4qCvC8KcYrNmCp0XSxYLKkMY8KmvTLjEuELgfJfpCbKfmkw8D9BGsDVRZCv67E0sLshS3FMyWpuMU0MPPby0O);
    }

    @Inject(method={"renderEntity"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1297 class_12972, double d, double d2, double d3, float f, class_4587 class_45872, class_4597 class_45972, CallbackInfo callbackInfo) {
        if (((Boolean)m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m.m$$srZa5lBh3mT7FWlAyIHwQEFcP0TeLosKUEda6dn6WqjsYz8wLEOpI32Z1e71QXcMMwnb33ZdZO5DY9WQcmxoQI25Zna8HTjLq.m$$OWdgXoz69uzrpyR3HdHjs20haJCueZoXAKxh2iFyqnNBSBtCDKACFhEqEGvAZ2t1jRQT0jSR0jWiNIAs25O4yyHtU69e5IqmH.getValue()).booleanValue() && m$$srZa5lBh3mT7FWlAyIHwQEFcP0TeLosKUEda6dn6WqjsYz8wLEOpI32Z1e71QXcMMwnb33ZdZO5DY9WQcmxoQI25Zna8HTjLq.m$$RTC62XVhqw1KkUj7jdwfx1CGu9l56xG0s3smzAbemPTos8feVIIe5RCmBJB2dEazz1HyQ92PIi6DKz0GqiL9yjlwRxpCL9WpB(class_12972, 1213865305 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF) + (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFFFF) ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01) || m$$CBzVFRbu0Oliql2CU0KU9Fn7kTFg65zU1U3b2jW4ov2hEu2KWZbZJZ0q0ToplN0a7zHP4KhOJLg5INAl5NmaDTlxMFuhgn5xq.m$$ZaD3M0jv7OKLL5o46rdCtPy8hIHUWkQwHiymBJrAs8Rx7AkYyizdJsbYM7bheQ2XDJQqqsI7QTERMWze3ESAiWCzZZRMyzfVV(class_12972, (0x598F ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFFFF) << 16 | 50579 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF) & 0xFFFF)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"onResized"}, at={@At(value="HEAD")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(int n, int n2, CallbackInfo callbackInfo) {
        m$$xMIRfWaNjMW8vojgdvy5yVm3ZoF8Cll0p2MkyXFhtDOyIDQBWvD9fCp0RPsOT6TBOjQ1p34m1pNjc7xwjo4B2Yv2aRPWrT2VL.m$$YoB1zQp6CLZqLUPILKdkG5c7htP3w0Fe09TqGxQfuI64WNNlavx4LTf9YPOoaJq1DPc7ubLPgNSvj61e7o3lvCrTRhHDSRp2e.method_1234(n, n2);
    }

    @ModifyVariable(method={"getLightmapCoordinates(Lnet/minecraft/client/render/WorldRenderer$BrightnessGetter;Lnet/minecraft/world/BlockRenderView;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;)I"}, at=@At(value="STORE"), ordinal=0)
    private static int m$$fR6eEarIPxvybR1zV4KkcbhQRgMmTBM3M3Em5rMRZPJBe6vWUTmeR70l4mHSeN304bm1lz8s4uMydpwWnakD21Fe6wibSyEN1(int n) {
        if (!m$$H1sMGnOyIdTrfryYhGTQSkgLM4aLdWjT3jN3D654rYEFHDvGpwLVsHPGAxvfJo3JDQXUwR18GVPpA7FmZBAdhQua4dTf53dDT.isToggled() || m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m.m$$H1sMGnOyIdTrfryYhGTQSkgLM4aLdWjT3jN3D654rYEFHDvGpwLVsHPGAxvfJo3JDQXUwR18GVPpA7FmZBAdhQua4dTf53dDT.m$$VHJ6p64N24N0M25oyuhth5vzwp83ziTyyxtiPXTsRRYz63S3H5rRbVf1KmmwdabnyipEibARObKwHJqz6E0vTnIG1T3sVglTQ.getValue() != m$$wtn7JxsjS7H84JBFGfGgZ6oMegeFJZSHxoMCEfaZeiv3EjxaTHTEuIs2FJ0fM9t698Pz42a5yPln3q8V92JY7sEdP8sI9WPml$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$nbZFmHgYw3NH1NdZLJBaLgaMxB0PPWDFaRoqFOiOiI0BEWQJSgXJmnn2jNyYjNL1IdPart28XsNZMSxJLydPC4AuSv4YY0xrZ) {
            return Math.max(0, n);
        }
        return Math.max((Integer)m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m.m$$H1sMGnOyIdTrfryYhGTQSkgLM4aLdWjT3jN3D654rYEFHDvGpwLVsHPGAxvfJo3JDQXUwR18GVPpA7FmZBAdhQua4dTf53dDT.m$$jVxShk5rXRDfargPoj3rXr6HiV6s7n8LJQwj2QuEjOIjD2Ixc5jKkKeOUO0nzpPpAcn2OynscJX8eqb7ROYkNjbw4O3xgzx7b.getValue(), n);
    }

    @ModifyExpressionValue(method={"getEntitiesToRender"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;isThirdPerson()Z")})
    private boolean m$$aaBlY2kZSTnSIK1CuOck1jRFfz4npfVQgapsxmjpEOH3k3140z22GhCd9BxFH0wp65wK68VXMkP80vOeJVZORXkiMwdLCa3DZ(boolean bl) {
        if (m$$JjiVZC1ygplRxg22UxIbDjFnL9Vb90WokfXGw7aqGeDiRjAh0VPIhAzeuEiqgT8QMuvcl4XUfOfHtXvKl6ipSDCf2oCz2VT7w.isToggled()) {
            return true;
        }
        return bl;
    }

    @ModifyExpressionValue(method={"method_62214"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/DimensionEffects;isDarkened()Z")})
    private boolean m$$Ak2eHYNVXPpGK8pnbRug4YxH1DLIhPJTEbYJxGY0mpn9PkRvhXgzLebzvirC4RkacUFYgacnWBiWLqbtiUmwVe7wD2qf4mg8K(boolean bl) {
        if (m$$50oHcTid7Wwqugv9tr6hJF5LFxoOHa45SqM4YGe9h0CwxncpvglE5yrxt0oY8zp3rTWf3xl7HUj3Pf6Lnaa43PT6IPYs3DkAs.isToggled() && m$$50oHcTid7Wwqugv9tr6hJF5LFxoOHa45SqM4YGe9h0CwxncpvglE5yrxt0oY8zp3rTWf3xl7HUj3Pf6Lnaa43PT6IPYs3DkAs.m$$zU3wePhNR4gmSuXzKZZl8MJPvE75SFwu6DM1S0RmUS6TFJv4yFXEX74euvRKlwnmPQogu0iOp00I9KMyOosXY4mmfFK8Z2FPf((~((0x2DD0 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF) & 0xFFFF) + 1 & 0xFFFF) << 16 | (0xC066 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFFFF) & 0xFFFF)) {
            return ((m$$HF6xcp0tb4bRXiB1EXcTEHaNi5cBmGg2yStyyaxeBxioFrqtzkvHzkRpLiE7Erm19nrVaCKZMYCFGdtMDhWoWvb2QbVp1mQv2)this.field_4085).mio$getOriginalEffects().method_29993();
        }
        return bl;
    }

    @Inject(method={"renderWeather"}, at={@At(value="HEAD")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_9909 class_99092, class_243 class_2432, float f, class_9958 class_99582, CallbackInfo callbackInfo) {
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(1.0f, 1.0f, 1.0f, 0.25f);
    }

    @Inject(method={"renderWeather"}, at={@At(value="TAIL")})
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_9909 class_99092, class_243 class_2432, float f, class_9958 class_99582, CallbackInfo callbackInfo) {
        m$$3uGlxJnK4aClGtUTJNrilivx89nsebkMXbJyRBOP2jtEWWH7KSwzaq81lBq5LufZpp6LAZVOsxRmARp2KpHDZdrrgmEr6kwoo.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void m$$LGLFak5nbFECYdITscFpInQHGvLyjB6pb6cOAakiO2zDGdLGYbKOMcrVV59Rx3dlrn0ekrR2pTy57miCyeGRkPm0O0rFavrAH(CallbackInfo callbackInfo) {
        this.m$$KHvmrZhZUvwXyw6eV6NHDOSRyVwNsxh3Yy0vf3vaF9ymPpfkNj4mF9mcHxUZVXc4vUyvCmaWablHph7DNV3lKJVpBygNmq2of = new ObjectArrayList();
        this.m$$ymXycynkG22ax08L4sAaVkN0BkSPZZz75JnV7hY878lN521YtqgYpHj1YUSn5LmXrU6nmnWvZzKLzXQNbhm5ALS0Wu63arUMR = new ObjectArrayList();
    }

    @Override
    public void mio$pushFramebuffer(class_276 class_2762) {
        this.m$$KHvmrZhZUvwXyw6eV6NHDOSRyVwNsxh3Yy0vf3vaF9ymPpfkNj4mF9mcHxUZVXc4vUyvCmaWablHph7DNV3lKJVpBygNmq2of.push((Object)this.field_53080);
        this.field_53080 = class_2762;
        this.m$$ymXycynkG22ax08L4sAaVkN0BkSPZZz75JnV7hY878lN521YtqgYpHj1YUSn5LmXrU6nmnWvZzKLzXQNbhm5ALS0Wu63arUMR.push((Object)this.field_53081.field_53097);
        this.field_53081.field_53097 = () -> class_2762;
    }

    @Override
    public void mio$popFramebuffer() {
        this.field_53080 = (class_276)this.m$$KHvmrZhZUvwXyw6eV6NHDOSRyVwNsxh3Yy0vf3vaF9ymPpfkNj4mF9mcHxUZVXc4vUyvCmaWablHph7DNV3lKJVpBygNmq2of.pop();
        this.field_53081.field_53097 = (class_9925)this.m$$ymXycynkG22ax08L4sAaVkN0BkSPZZz75JnV7hY878lN521YtqgYpHj1YUSn5LmXrU6nmnWvZzKLzXQNbhm5ALS0Wu63arUMR.pop();
    }
}

