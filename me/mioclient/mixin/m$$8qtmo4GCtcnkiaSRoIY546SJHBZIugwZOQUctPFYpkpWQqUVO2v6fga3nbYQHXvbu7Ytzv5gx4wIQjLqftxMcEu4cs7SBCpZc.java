package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.sugar.Local;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$DLEjZxfWMFQ7X7wBivstINmdj9C5GZxZqcsA7tMsEfz7mvFPbhKVRIxnjvwb6yw8CIBeeAHWNEy9ueNaHmIGvJZ0O7xMaM2Mo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$DLEjZxfWMFQ7X7wBivstINmdj9C5GZxZqcsA7tMsEfz7mvFPbhKVRIxnjvwb6yw8CIBeeAHWNEy9ueNaHmIGvJZ0O7xMaM2Mo$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$DNu4i7fgBiloaRBFv7j2VlGPGkXxcjDRQ2dO3h2XGwMUvG27tJQkoZZNbX7VeNQNnIvDh7d1VPlWPbJpVBHGE1C9wTY1xzfzu;
import me.mioclient.m$$HEIkjFSwst8n7ELevJ3jFv29SZXjrTHxloyX37oXX2GtbyyXVJP3iw16NGxOoaYXRlUlmobwmhGZMLWb3qhzoeFMoK4t4Y3kU;
import me.mioclient.m$$JSSjUdAY9DqW9Y071y4yUuo9h5m2AdoMEbLyMaLrVR48VF740rDEtFfAMmSki2q8WV0mS3BV400REOm32KKgB5UgJntJ6aU2Q;
import me.mioclient.m$$JWkE1vFfNBqsaajSliM41PCH12JzaVx7aOFnkJ8MGcJusUH5vklvWPh36kE7OpUjZt6VAgAWcOqtHPG9t22Y4WDHmf4U3vtyX;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$QHoubbS4V8hHj7hWjOASof7dGrOfMKeUMphGGrxTvCc8If8awgLffQClpSyZoIIfh6VAciaAiSq1yBpGP7vlWkMLr3v2Zwoi1;
import me.mioclient.m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$Vl4BAJAIIcPGRphk2mA6TYjdtW0hDkxUlUgPAQoPIYdXAI4WXwsOXVVhd7H0VlJRPkwA1FKgyhWW90JsXR8xv5PM0wY1EKcVJ;
import me.mioclient.m$$iJ7uNmrRD5QI50YOWLrbGAcPU0swK0ZZrfUZqQfygnbBzDV3wpAZLikgIWLyGLv0xgcVyjoFDI9C5BHbn8JCpYpxqVqofRs7J;
import me.mioclient.m$$mX1FqMWwTWRwklTGgChscPRawoeRFgadk86TvHELxA58u2dGUj6boG8Ug1eafb82lU18gk3oR4aH8eKbDaTlVL2IGaWLPaonI;
import me.mioclient.m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T;
import me.mioclient.m$$qwqWzyCszuRg2E95uXVMRo5uOT52nW9izE922Hv3zqQJ8rd9MT28W4Os2lAog1zlGfmrhT8VOP3DrzSMAnwIBylr5iOdsLbLc;
import me.mioclient.m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju;
import net.minecraft.class_1041;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_437;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_310.class})
public class m$$8qtmo4GCtcnkiaSRoIY546SJHBZIugwZOQUctPFYpkpWQqUVO2v6fga3nbYQHXvbu7Ytzv5gx4wIQjLqftxMcEu4cs7SBCpZc {
    private static final m$$qwqWzyCszuRg2E95uXVMRo5uOT52nW9izE922Hv3zqQJ8rd9MT28W4Os2lAog1zlGfmrhT8VOP3DrzSMAnwIBylr5iOdsLbLc m$$Jb4pzF2T09XJpvfhBGLde2zFP97oUtmQ6R4KqQZGbutWNu79caJfjtBRz8VtELImFxXjjtQ44VlXDr37lG4c3vtzOeNllowgU = (m$$qwqWzyCszuRg2E95uXVMRo5uOT52nW9izE922Hv3zqQJ8rd9MT28W4Os2lAog1zlGfmrhT8VOP3DrzSMAnwIBylr5iOdsLbLc)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$qwqWzyCszuRg2E95uXVMRo5uOT52nW9izE922Hv3zqQJ8rd9MT28W4Os2lAog1zlGfmrhT8VOP3DrzSMAnwIBylr5iOdsLbLc.class);
    private static final m$$QHoubbS4V8hHj7hWjOASof7dGrOfMKeUMphGGrxTvCc8If8awgLffQClpSyZoIIfh6VAciaAiSq1yBpGP7vlWkMLr3v2Zwoi1 m$$E6LrOXbosraNXy3a8iPwVVpAbvSU01pWqsuzk6jQ4dDqqyDggD4C7uqOFYx9cIY2UxB73zupFlQCAuZYK1qzBUPmNl9wLrbCs = (m$$QHoubbS4V8hHj7hWjOASof7dGrOfMKeUMphGGrxTvCc8If8awgLffQClpSyZoIIfh6VAciaAiSq1yBpGP7vlWkMLr3v2Zwoi1)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$QHoubbS4V8hHj7hWjOASof7dGrOfMKeUMphGGrxTvCc8If8awgLffQClpSyZoIIfh6VAciaAiSq1yBpGP7vlWkMLr3v2Zwoi1.class);
    private static final m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m = (m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$QgS4ytB491MfSIAJRu84lYlaGrgZBBnZ0h6PPDLB7aUN8qkAaDOnj4JWFDUmh4d9dkidU7QIJcPPv5pSbYoWGyrATFenk0GnS.class);
    private static final m$$mX1FqMWwTWRwklTGgChscPRawoeRFgadk86TvHELxA58u2dGUj6boG8Ug1eafb82lU18gk3oR4aH8eKbDaTlVL2IGaWLPaonI m$$x5qoiQ1Y7bIEQuB1oKyt41a6PID3OCX9gwMA5Y90mu34iLAyCZPLPEIooAS0zTfIbWJXgV0AGzM7GGUtPP4gE2DGkF5esSLw9 = (m$$mX1FqMWwTWRwklTGgChscPRawoeRFgadk86TvHELxA58u2dGUj6boG8Ug1eafb82lU18gk3oR4aH8eKbDaTlVL2IGaWLPaonI)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$mX1FqMWwTWRwklTGgChscPRawoeRFgadk86TvHELxA58u2dGUj6boG8Ug1eafb82lU18gk3oR4aH8eKbDaTlVL2IGaWLPaonI.class);
    private static final m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju m$$Ld0Jp3TfdrSc3yMFCm4maVBBz01Ta76LnwBXVN7DWYBtOE1PuZARPMEH0waEktNdQTljtLH5AYtUhUSBA8zWsNyQ4MIXXZEgb = (m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$y9DltqYTcck5lHmxoXbH6bZh1JIBsV9cGoeGckOFkblOtul0srYNJ2qGI2uQmAOcF6qXajZkPWaDPr2zjA26VdpC8BB5k3mju.class);
    private static final m$$DNu4i7fgBiloaRBFv7j2VlGPGkXxcjDRQ2dO3h2XGwMUvG27tJQkoZZNbX7VeNQNnIvDh7d1VPlWPbJpVBHGE1C9wTY1xzfzu m$$8ThfDQHSFd6C3u6wzYae6DSpyKgempIifKwaALYHqkNsDw8CyzEPO8KNL0zsZ5XQyfXdt7kUksVVD8SC1WaHDqLJ11mVjJJcO = (m$$DNu4i7fgBiloaRBFv7j2VlGPGkXxcjDRQ2dO3h2XGwMUvG27tJQkoZZNbX7VeNQNnIvDh7d1VPlWPbJpVBHGE1C9wTY1xzfzu)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$DNu4i7fgBiloaRBFv7j2VlGPGkXxcjDRQ2dO3h2XGwMUvG27tJQkoZZNbX7VeNQNnIvDh7d1VPlWPbJpVBHGE1C9wTY1xzfzu.class);
    private static final m$$iJ7uNmrRD5QI50YOWLrbGAcPU0swK0ZZrfUZqQfygnbBzDV3wpAZLikgIWLyGLv0xgcVyjoFDI9C5BHbn8JCpYpxqVqofRs7J m$$gWZhIn4h1VWLprEPqX1wgSNXgQix4f2JDdgp3dDLC7tEYmIGiIswZSRYEerUn51IdFNux4NSCGJf5ESks40Z3EgMlNHqsUIiQ = (m$$iJ7uNmrRD5QI50YOWLrbGAcPU0swK0ZZrfUZqQfygnbBzDV3wpAZLikgIWLyGLv0xgcVyjoFDI9C5BHbn8JCpYpxqVqofRs7J)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$iJ7uNmrRD5QI50YOWLrbGAcPU0swK0ZZrfUZqQfygnbBzDV3wpAZLikgIWLyGLv0xgcVyjoFDI9C5BHbn8JCpYpxqVqofRs7J.class);
    private static final m$$JWkE1vFfNBqsaajSliM41PCH12JzaVx7aOFnkJ8MGcJusUH5vklvWPh36kE7OpUjZt6VAgAWcOqtHPG9t22Y4WDHmf4U3vtyX m$$XqzMkFtuP1SsitlibhoN437A11qi9JdfmfSwJtJvod49LxjCdO6uQgzdQ4H1W2wqTC8wlF7a3ZcxIjs2TQxVrfKPtue55Bcml = (m$$JWkE1vFfNBqsaajSliM41PCH12JzaVx7aOFnkJ8MGcJusUH5vklvWPh36kE7OpUjZt6VAgAWcOqtHPG9t22Y4WDHmf4U3vtyX)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$JWkE1vFfNBqsaajSliM41PCH12JzaVx7aOFnkJ8MGcJusUH5vklvWPh36kE7OpUjZt6VAgAWcOqtHPG9t22Y4WDHmf4U3vtyX.class);
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$nieyLzekvrijjghRe2mKX51miWlhke3SK26gO3qA8vQcf5oQdLA7CAnbO83DaKkDwrqFTJgXNOkvvtcQGeiuvO8z308jEHILV = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    @Unique
    private class_437 m$$P49vLWkAEayAKx7gjdklEZKDj6QRGoF0oxYGuHl3MdSdMI14q5XfLk8HYoZ6Fr3gI7z22sAWu8ZbsrgYxywTZB093IeSYHYJw;
    @Shadow
    public int field_1771;
    @Shadow
    @Final
    public class_315 field_1690;
    @Shadow
    @Nullable
    public class_437 field_1755;
    @Shadow
    @Final
    private class_1041 field_1704;
    private static boolean m$$p0s2UuOis81Dna729hSP2zXfbH5I0mvS15zw0m6BGur4N9LKKpcUxtrRZhRfb320HhLmAFdF0iUDssQn9XbtyRbKNLRzjrUW9 = false;

    @Inject(method={"doAttack()Z"}, at={@At(value="HEAD")})
    public void m$$aaBlY2kZSTnSIK1CuOck1jRFfz4npfVQgapsxmjpEOH3k3140z22GhCd9BxFH0wp65wK68VXMkP80vOeJVZORXkiMwdLCa3DZ(CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$Ld0Jp3TfdrSc3yMFCm4maVBBz01Ta76LnwBXVN7DWYBtOE1PuZARPMEH0waEktNdQTljtLH5AYtUhUSBA8zWsNyQ4MIXXZEgb.isToggled() || m$$8ThfDQHSFd6C3u6wzYae6DSpyKgempIifKwaALYHqkNsDw8CyzEPO8KNL0zsZ5XQyfXdt7kUksVVD8SC1WaHDqLJ11mVjJJcO.isToggled()) {
            this.field_1771 = 0;
        }
    }

    @Inject(method={"stop"}, at={@At(value="HEAD")})
    public void m$$O9moVzDFftN5fRrs8mFeaispr2yW59EvwjyNQ4XMz90mYxUR017bEu7UaiqSOBcQMeVzS2x7KPBEzxFG12JkV7LnelYHuu0Bu(CallbackInfo callbackInfo) {
        if (!m$$p0s2UuOis81Dna729hSP2zXfbH5I0mvS15zw0m6BGur4N9LKKpcUxtrRZhRfb320HhLmAFdF0iUDssQn9XbtyRbKNLRzjrUW9 && m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$HAOsLBln67ivaO05OnnNGcKBhsRJUSgJDKvKWsdSjDfYhVLWwp217mEcD1XbMfZvXQ0OHszvhVyEuQzElIpaUNNUIup75goW4 != null) {
            m$$p0s2UuOis81Dna729hSP2zXfbH5I0mvS15zw0m6BGur4N9LKKpcUxtrRZhRfb320HhLmAFdF0iUDssQn9XbtyRbKNLRzjrUW9 = true;
            m$$Jb4pzF2T09XJpvfhBGLde2zFP97oUtmQ6R4KqQZGbutWNu79caJfjtBRz8VtELImFxXjjtQ44VlXDr37lG4c3vtzOeNllowgU.disable();
            m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$HAOsLBln67ivaO05OnnNGcKBhsRJUSgJDKvKWsdSjDfYhVLWwp217mEcD1XbMfZvXQ0OHszvhVyEuQzElIpaUNNUIup75goW4.m$$sG1kYme00hRMtILzdLCYk1TAIRecxTRj7gTK3VlZgOXTy42ELPkTAkpFc8XUwUtARcGeseqFXe2lEcVU2V2E90oP7poPlndEn(1117214782);
        }
    }

    @Inject(method={"disconnect(Lnet/minecraft/client/gui/screen/Screen;)V"}, at={@At(value="HEAD")})
    public void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_437 class_4372, CallbackInfo callbackInfo) {
        m$$JSSjUdAY9DqW9Y071y4yUuo9h5m2AdoMEbLyMaLrVR48VF740rDEtFfAMmSki2q8WV0mS3BV400REOm32KKgB5UgJntJ6aU2Q m$$JSSjUdAY9DqW9Y071y4yUuo9h5m2AdoMEbLyMaLrVR48VF740rDEtFfAMmSki2q8WV0mS3BV400REOm32KKgB5UgJntJ6aU2Q = new m$$JSSjUdAY9DqW9Y071y4yUuo9h5m2AdoMEbLyMaLrVR48VF740rDEtFfAMmSki2q8WV0mS3BV400REOm32KKgB5UgJntJ6aU2Q();
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$JSSjUdAY9DqW9Y071y4yUuo9h5m2AdoMEbLyMaLrVR48VF740rDEtFfAMmSki2q8WV0mS3BV400REOm32KKgB5UgJntJ6aU2Q);
    }

    @ModifyExpressionValue(method={"handleBlockBreaking"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z")})
    public boolean m$$NtFIT6zaieEXzonXBenBHliG2woXkNgJjt4X3OkMyxQvkprFTKxt7G9OnHROZGaijRc67jurn4oNhpQ3ClXIfJPZ6vQ1PDJfh(boolean bl) {
        return !m$$E6LrOXbosraNXy3a8iPwVVpAbvSU01pWqsuzk6jQ4dDqqyDggD4C7uqOFYx9cIY2UxB73zupFlQCAuZYK1qzBUPmNl9wLrbCs.isToggled() && bl;
    }

    @ModifyExpressionValue(method={"doItemUse"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerInteractionManager;isBreakingBlock()Z")}, require=0)
    public boolean m$$xywraAZxC3SLTK96kRMh7cNwSD2Qss427nzq1UR3Z9S4o6PGrAwjB8O8EYshNcTMnJ5qfU8pieX9vBUb7H3pYPGCsdMFmmZaL(boolean bl) {
        if (m$$E6LrOXbosraNXy3a8iPwVVpAbvSU01pWqsuzk6jQ4dDqqyDggD4C7uqOFYx9cIY2UxB73zupFlQCAuZYK1qzBUPmNl9wLrbCs.isToggled()) {
            return false;
        }
        return bl;
    }

    @Inject(method={"setScreen"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_437 class_4372, CallbackInfo callbackInfo) {
        this.m$$P49vLWkAEayAKx7gjdklEZKDj6QRGoF0oxYGuHl3MdSdMI14q5XfLk8HYoZ6Fr3gI7z22sAWu8ZbsrgYxywTZB093IeSYHYJw = this.field_1755;
        m$$DLEjZxfWMFQ7X7wBivstINmdj9C5GZxZqcsA7tMsEfz7mvFPbhKVRIxnjvwb6yw8CIBeeAHWNEy9ueNaHmIGvJZ0O7xMaM2Mo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$DLEjZxfWMFQ7X7wBivstINmdj9C5GZxZqcsA7tMsEfz7mvFPbhKVRIxnjvwb6yw8CIBeeAHWNEy9ueNaHmIGvJZ0O7xMaM2Mo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk = new m$$DLEjZxfWMFQ7X7wBivstINmdj9C5GZxZqcsA7tMsEfz7mvFPbhKVRIxnjvwb6yw8CIBeeAHWNEy9ueNaHmIGvJZ0O7xMaM2Mo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(this.m$$P49vLWkAEayAKx7gjdklEZKDj6QRGoF0oxYGuHl3MdSdMI14q5XfLk8HYoZ6Fr3gI7z22sAWu8ZbsrgYxywTZB093IeSYHYJw, class_4372);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$DLEjZxfWMFQ7X7wBivstINmdj9C5GZxZqcsA7tMsEfz7mvFPbhKVRIxnjvwb6yw8CIBeeAHWNEy9ueNaHmIGvJZ0O7xMaM2Mo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk);
        if (m$$DLEjZxfWMFQ7X7wBivstINmdj9C5GZxZqcsA7tMsEfz7mvFPbhKVRIxnjvwb6yw8CIBeeAHWNEy9ueNaHmIGvJZ0O7xMaM2Mo$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"setScreen"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/screen/Screen;init(Lnet/minecraft/client/MinecraftClient;II)V", shift=At.Shift.AFTER)}, cancellable=true)
    private void m$$si2aX2X8Dch8BrpPv8C89mK3tHVjy6by3nrWOWcgTRS3w0VNjCaT6TzOK1vZM0JWisN0y7s9j2U6LywGMjYOWySMMEgPZT7WH(class_437 class_4372, CallbackInfo callbackInfo) {
        m$$DLEjZxfWMFQ7X7wBivstINmdj9C5GZxZqcsA7tMsEfz7mvFPbhKVRIxnjvwb6yw8CIBeeAHWNEy9ueNaHmIGvJZ0O7xMaM2Mo$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$DLEjZxfWMFQ7X7wBivstINmdj9C5GZxZqcsA7tMsEfz7mvFPbhKVRIxnjvwb6yw8CIBeeAHWNEy9ueNaHmIGvJZ0O7xMaM2Mo$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 = new m$$DLEjZxfWMFQ7X7wBivstINmdj9C5GZxZqcsA7tMsEfz7mvFPbhKVRIxnjvwb6yw8CIBeeAHWNEy9ueNaHmIGvJZ0O7xMaM2Mo$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.m$$P49vLWkAEayAKx7gjdklEZKDj6QRGoF0oxYGuHl3MdSdMI14q5XfLk8HYoZ6Fr3gI7z22sAWu8ZbsrgYxywTZB093IeSYHYJw, class_4372);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$DLEjZxfWMFQ7X7wBivstINmdj9C5GZxZqcsA7tMsEfz7mvFPbhKVRIxnjvwb6yw8CIBeeAHWNEy9ueNaHmIGvJZ0O7xMaM2Mo$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8);
        if (m$$DLEjZxfWMFQ7X7wBivstINmdj9C5GZxZqcsA7tMsEfz7mvFPbhKVRIxnjvwb6yw8CIBeeAHWNEy9ueNaHmIGvJZ0O7xMaM2Mo$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    private void m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9(CallbackInfo callbackInfo) {
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$HEIkjFSwst8n7ELevJ3jFv29SZXjrTHxloyX37oXX2GtbyyXVJP3iw16NGxOoaYXRlUlmobwmhGZMLWb3qhzoeFMoK4t4Y3kU.m$$70hPjECouuztKtUinGZdZurLmzj7k3ie7vCxGzEgtdghlihiyghTAd6pO8qct7cQVQtzz04mySXiIiQOCngvyUqqtHVxZd3Ee);
    }

    @ModifyExpressionValue(method={"handleInputEvents"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z")})
    private boolean m$$h6YK9QjDoMTr6MXOhtlGTjBp7y0YtqKAgZLe07Ls67QzPUmzRr17jYrMRTv0uHNS5s8YWDE9aAK2nmZbLbd8ZKM3Ox497EJfz(boolean bl) {
        if (m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m.m$$9lzjmr725ZHh3u0dUw5ckmNTq66VA6aEHWK7yYFrbBttpIlK9BowYKkpdS5ZchtbAqCFKiFyZZYTauL6utMyQwHiPn9XpOAIW(-2071065447) && m$$7pn9m3SvmzsnfBGVgTiVRsrl8Qhr7yHXKusRbFTx3LhENpcdvXE6FJsokvTwGy6jKXL6BpnpqOSJLP9qbbSve4plZ4AvHPR2m.isToggled()) {
            return false;
        }
        return bl;
    }

    @WrapWithCondition(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/MinecraftClient;scheduleStop()V")})
    private boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_310 class_3102) {
        if (!m$$x5qoiQ1Y7bIEQuB1oKyt41a6PID3OCX9gwMA5Y90mu34iLAyCZPLPEIooAS0zTfIbWJXgV0AGzM7GGUtPP4gE2DGkF5esSLw9.isToggled() || !((Boolean)m$$8qtmo4GCtcnkiaSRoIY546SJHBZIugwZOQUctPFYpkpWQqUVO2v6fga3nbYQHXvbu7Ytzv5gx4wIQjLqftxMcEu4cs7SBCpZc.m$$x5qoiQ1Y7bIEQuB1oKyt41a6PID3OCX9gwMA5Y90mu34iLAyCZPLPEIooAS0zTfIbWJXgV0AGzM7GGUtPP4gE2DGkF5esSLw9.m$$naHQHOfCnkd0jHfRN9E2fBtpWP7zJXMxTUvPDUcavWUkhNuFicAJ1jNzwszHCjnCT3ZgOvjO5Sy6MJ73T3F2ttZqPQYoHSTtZ.getValue()).booleanValue()) {
            return true;
        }
        if (!(class_3102.field_1755 instanceof m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T)) {
            class_3102.method_1507((class_437)new m$$n9NkfsXOwqNYH8JzNAJEWv9zCtO9G5NrzEOnrBGzq4VI6aZ3Nmb6xhfgEt5RliDATeQQFwfHbFodCrZfc3K9sjp7nfaeAtF1T());
        }
        return false;
    }

    @Inject(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/MinecraftClient;runTasks()V", shift=At.Shift.AFTER)})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(boolean bl, CallbackInfo callbackInfo, @Local int n) {
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(new m$$Vl4BAJAIIcPGRphk2mA6TYjdtW0hDkxUlUgPAQoPIYdXAI4WXwsOXVVhd7H0VlJRPkwA1FKgyhWW90JsXR8xv5PM0wY1EKcVJ(n >= 1));
    }

    @ModifyExpressionValue(method={"handleInputEvents"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z")})
    private boolean m$$fR6eEarIPxvybR1zV4KkcbhQRgMmTBM3M3Em5rMRZPJBe6vWUTmeR70l4mHSeN304bm1lz8s4uMydpwWnakD21Fe6wibSyEN1(boolean bl) {
        if (m$$gWZhIn4h1VWLprEPqX1wgSNXgQix4f2JDdgp3dDLC7tEYmIGiIswZSRYEerUn51IdFNux4NSCGJf5ESks40Z3EgMlNHqsUIiQ.isToggled() && ((Boolean)m$$8qtmo4GCtcnkiaSRoIY546SJHBZIugwZOQUctPFYpkpWQqUVO2v6fga3nbYQHXvbu7Ytzv5gx4wIQjLqftxMcEu4cs7SBCpZc.m$$gWZhIn4h1VWLprEPqX1wgSNXgQix4f2JDdgp3dDLC7tEYmIGiIswZSRYEerUn51IdFNux4NSCGJf5ESks40Z3EgMlNHqsUIiQ.m$$44qo7JXnr8AsUsi2K70pRRJVNOMwN3A94wlHseHq6THgqFgHbLqAJOREab8C9XJYgq0gFpRT3ab3D6G1K3Rg8Q9hJjEOWUhhm.getValue()).booleanValue()) {
            return false;
        }
        return bl;
    }

    @Inject(method={"doItemUse"}, at={@At(value="HEAD")})
    private void m$$RG8NT6WebPFijbrMTAkZxU3uH0z96Dd9wMoDjQwA4DCEI9DPAQhMhEC70vFXhwJo363xsDKe4KkDWqFNLFmbjzp1GEHRJKgEV(CallbackInfo callbackInfo) {
        m$$XqzMkFtuP1SsitlibhoN437A11qi9JdfmfSwJtJvod49LxjCdO6uQgzdQ4H1W2wqTC8wlF7a3ZcxIjs2TQxVrfKPtue55Bcml.m$$lCJ99GNF5nE0KyGBDwkn9VbCwKXGYLSNfZD9coSpBtt28mlPmW1LuZEfvB3rbiOrL185Py6Q0aa3MwQYIknccd4mN3rbCY0Tb(-947204066);
    }

    @ModifyExpressionValue(method={"doItemUse"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isRiding()Z")})
    private boolean m$$KgsA96MC4T4eH6W0XsD6gEUJxCz5GU4uazh6mqzZZEg5IcvKpdzsTNWdlxDRqzB2X3Og2j3TkDMOzEdzjRLwJz0tDZCIQJ5av(boolean bl) {
        if (m$$E6LrOXbosraNXy3a8iPwVVpAbvSU01pWqsuzk6jQ4dDqqyDggD4C7uqOFYx9cIY2UxB73zupFlQCAuZYK1qzBUPmNl9wLrbCs.isToggled()) {
            return false;
        }
        return bl;
    }

    @ModifyExpressionValue(method={"doAttack"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isRiding()Z")})
    private boolean m$$bhjmIQJ3z9GdMzjNLx0s0qiWLozkMDSSmjPx8lqlfaVFoMnTejLBQyrZKbp8kinqb4190vFHMH2GRYh4QHxskU6uUoO0z66vW(boolean bl) {
        if (m$$E6LrOXbosraNXy3a8iPwVVpAbvSU01pWqsuzk6jQ4dDqqyDggD4C7uqOFYx9cIY2UxB73zupFlQCAuZYK1qzBUPmNl9wLrbCs.isToggled()) {
            return false;
        }
        return bl;
    }

    @Inject(method={"hasOutline"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1297 class_12972, CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$nieyLzekvrijjghRe2mKX51miWlhke3SK26gO3qA8vQcf5oQdLA7CAnbO83DaKkDwrqFTJgXNOkvvtcQGeiuvO8z308jEHILV.isToggled() && ((Boolean)m$$8qtmo4GCtcnkiaSRoIY546SJHBZIugwZOQUctPFYpkpWQqUVO2v6fga3nbYQHXvbu7Ytzv5gx4wIQjLqftxMcEu4cs7SBCpZc.m$$nieyLzekvrijjghRe2mKX51miWlhke3SK26gO3qA8vQcf5oQdLA7CAnbO83DaKkDwrqFTJgXNOkvvtcQGeiuvO8z308jEHILV.m$$WINVdYfliRfMT2IOyugZG80gaThkUZr8tPGjBdiKF3wjDY5Hg1i9A8Zm9E8MvyzHJWoK883yP6ctXxqTOD0xgmdmtD5MUCPIV.getValue()).booleanValue()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
}

