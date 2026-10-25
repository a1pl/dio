package me.mioclient.mixin;

import me.mioclient.m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS;
import me.mioclient.m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.mixin.m$$eBa87i2SOiKLAoeT3VEMXrClW6Fx4WytLGlhf2SKSZfzhb4YmigAkXEyCuECJ62Fic92B6IkSgtv0dOZ7JwQZnaLQbghEwB4Q;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_743;
import net.minecraft.class_744;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_743.class})
public class m$$1kRxp1daRLBEMNSJJORUbv8eub5FnNUnFzca1AJ16dQ64XHuQWdpLpJKoMtJp9QCoUV55XmTRz1Ry9O3lqn0iS3iurLJmPjHX
extends class_744 {
    private static final m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb m$$PvLhzRxnXahWquRo2pmocAU4oLGoEEFc2bQBdu0i6Zzn3NjlhRPHO9Bv1n0Dz467Z0KirS7W68rg3w4ogIVO0hvTZ0NxP8tyI = (m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb.class);
    @Shadow
    @Final
    private class_315 field_3902;

    @Inject(method={"tick"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$tW5sHtYZnngGdeXOj8DBtaupPoGjWfKYmu8mXr2utdnztu5NgRaFonzYKcvVYRdrFYC8OV95DFNRacMZ686Jdmh3hfmd4Pi8x(CallbackInfo callbackInfo) {
        m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS = new m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8((class_744)((class_743)this));
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS);
        if (m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS = new m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS(m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS.m$$9NWQSo1a918DHETTVagKIMqwUKV0elTVoEZoZecaBKXokyqcKRrS150b45gHctfqmUgd94NQWQs7i7NCoo8w1KeNyfjtXZHnt());
            m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS);
            callbackInfo.cancel();
        }
    }

    @Inject(method={"tick"}, at={@At(value="TAIL")})
    private void m$$zdzs89YFekBv8KLGae1MVDQVoFjk0F54IA5Y9iRtDbmE451u5jlwHwpccmDRAQwtimiOdEtwCyvBAkHmMUND2L6XupLm3aIk9(CallbackInfo callbackInfo) {
        m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS = new m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS((class_744)((class_743)this));
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$adM2mmKxuICWH4dFdP7fsiYAg05Dbrxu4yrDlp1ropnHVPJHX1GhQflHlJqDWcEmyiWU17woLGg3mQ7WiSZWDQgf4igVRfFSS);
    }

    @Redirect(method={"tick"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/option/KeyBinding;isPressed()Z"), require=0)
    private boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_304 class_3042) {
        if (m$$PvLhzRxnXahWquRo2pmocAU4oLGoEEFc2bQBdu0i6Zzn3NjlhRPHO9Bv1n0Dz467Z0KirS7W68rg3w4ogIVO0hvTZ0NxP8tyI.isToggled() && m$$PvLhzRxnXahWquRo2pmocAU4oLGoEEFc2bQBdu0i6Zzn3NjlhRPHO9Bv1n0Dz467Z0KirS7W68rg3w4ogIVO0hvTZ0NxP8tyI.m$$DnTtAGADHIAOAb63nB8aB2RkQEk2C8Cd5UjC1nCMsmkB6i8AZULdtarTBVqeEAnvBlXnk47U0TqE3tbEW4fHZN2uDbHVXUsH2(-1079769213) && ((Boolean)m$$1kRxp1daRLBEMNSJJORUbv8eub5FnNUnFzca1AJ16dQ64XHuQWdpLpJKoMtJp9QCoUV55XmTRz1Ry9O3lqn0iS3iurLJmPjHX.m$$PvLhzRxnXahWquRo2pmocAU4oLGoEEFc2bQBdu0i6Zzn3NjlhRPHO9Bv1n0Dz467Z0KirS7W68rg3w4ogIVO0hvTZ0NxP8tyI.m$$SnLViiJV3bKOzzfmadt6dUZ6cUL89HHidEfYvWAJXQYHio7QMBkwoFJKbO3d4VEcJB8ecAVLyvkjIWvkc6NPgI83VOcv8051L.getValue()).booleanValue() && class_3042 != this.field_3902.field_1832) {
            int n = ((m$$eBa87i2SOiKLAoeT3VEMXrClW6Fx4WytLGlhf2SKSZfzhb4YmigAkXEyCuECJ62Fic92B6IkSgtv0dOZ7JwQZnaLQbghEwB4Q)class_3042).getKey().method_1444();
            long l = class_310.method_1551().method_22683().method_4490();
            if (n == -1) {
                return class_3042.method_1434();
            }
            return GLFW.glfwGetKey((long)l, (int)n) == 1;
        }
        return class_3042.method_1434();
    }
}

