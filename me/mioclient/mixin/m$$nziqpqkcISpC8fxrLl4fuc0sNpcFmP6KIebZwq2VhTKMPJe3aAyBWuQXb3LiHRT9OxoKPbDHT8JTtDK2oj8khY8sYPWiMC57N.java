package me.mioclient.mixin;

import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb;
import me.mioclient.m$$pnt6LUs5uRi3djZcBRBpySsv4Zz1FaZy32nH0v10mXpDMPRqcx0e5QjQsVzwEcpfkaF9OkyePnlh0NPQWwDktOsyKThjEnomU$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk;
import me.mioclient.m$$pnt6LUs5uRi3djZcBRBpySsv4Zz1FaZy32nH0v10mXpDMPRqcx0e5QjQsVzwEcpfkaF9OkyePnlh0NPQWwDktOsyKThjEnomU$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import net.minecraft.class_10017;
import net.minecraft.class_10932;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_4538;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_746;
import net.minecraft.class_898;
import org.joml.Quaternionf;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_898.class})
public class m$$nziqpqkcISpC8fxrLl4fuc0sNpcFmP6KIebZwq2VhTKMPJe3aAyBWuQXb3LiHRT9OxoKPbDHT8JTtDK2oj8khY8sYPWiMC57N {
    private static final m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    private static final m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb m$$o7NbnOIjaECyMmKYx5DiZB0PBhO73e9kmc954AaJu8d8gBLyycPZikGVhIXboqmmmrWzu4AbLX436sJzavCoEt02H3eqUFDSZ = (m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.class);

    @Inject(method={"renderShadow"}, at={@At(value="HEAD")}, cancellable=true)
    private static void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_4587 class_45872, class_4597 class_45972, class_10017 class_100172, float f, class_4538 class_45382, float f2, CallbackInfo callbackInfo) {
        if (m$$o7NbnOIjaECyMmKYx5DiZB0PBhO73e9kmc954AaJu8d8gBLyycPZikGVhIXboqmmmrWzu4AbLX436sJzavCoEt02H3eqUFDSZ.m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus(m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_100172), -1609117443)) {
            callbackInfo.cancel();
        }
        if (m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$JtS6y3OKtFrQBGPhp1gae1DLvN1o1q0CdA2l8YvkOM7MOgIwqYlQCSkJtW7xplPv6MutK1dKT8LRXJ59kItBpnJbycC0MEz7C.m$$a3qcWmacuu2a0vwsi4RmEzyQiHzp11joDO1Au10HYlzWmTi190jlMmGksXtwEoS0Xwa30eShEpoVX5zKeDnZ5HRhYLkYky0Pt || m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$yp7iZnx7E3XH20JF3j5YOzOGlG6MJvIXU69n5JmdYEmmc9wC0hxGBLZ3fyMFoxbpqSchermwQWz1NPCKMicLqiWI3LUac21Vd(851919102)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"render(Lnet/minecraft/entity/Entity;DDDFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="HEAD")}, cancellable=true)
    public void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1297 class_12972, double d, double d2, double d3, float f, class_4587 class_45872, class_4597 class_45972, int n, CallbackInfo callbackInfo) {
        m$$pnt6LUs5uRi3djZcBRBpySsv4Zz1FaZy32nH0v10mXpDMPRqcx0e5QjQsVzwEcpfkaF9OkyePnlh0NPQWwDktOsyKThjEnomU$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk m$$pnt6LUs5uRi3djZcBRBpySsv4Zz1FaZy32nH0v10mXpDMPRqcx0e5QjQsVzwEcpfkaF9OkyePnlh0NPQWwDktOsyKThjEnomU$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk = m$$pnt6LUs5uRi3djZcBRBpySsv4Zz1FaZy32nH0v10mXpDMPRqcx0e5QjQsVzwEcpfkaF9OkyePnlh0NPQWwDktOsyKThjEnomU$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_12972, class_45872, class_45972);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$pnt6LUs5uRi3djZcBRBpySsv4Zz1FaZy32nH0v10mXpDMPRqcx0e5QjQsVzwEcpfkaF9OkyePnlh0NPQWwDktOsyKThjEnomU$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk);
        if (m$$pnt6LUs5uRi3djZcBRBpySsv4Zz1FaZy32nH0v10mXpDMPRqcx0e5QjQsVzwEcpfkaF9OkyePnlh0NPQWwDktOsyKThjEnomU$m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT() || class_12972 == null) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"render(Lnet/minecraft/entity/Entity;DDDFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="RETURN")})
    public void m$$mxmQX5hox2xjlqJLqeOvwQPWw9WJpPYLpjooKpGENTSQ7j6n9A1BL4KWCvUAEeSQRlP7NeTZrGNFIgg0ZShxWRMjK5p4jBs5S(class_1297 class_12972, double d, double d2, double d3, float f, class_4587 class_45872, class_4597 class_45972, int n, CallbackInfo callbackInfo) {
        m$$pnt6LUs5uRi3djZcBRBpySsv4Zz1FaZy32nH0v10mXpDMPRqcx0e5QjQsVzwEcpfkaF9OkyePnlh0NPQWwDktOsyKThjEnomU$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$pnt6LUs5uRi3djZcBRBpySsv4Zz1FaZy32nH0v10mXpDMPRqcx0e5QjQsVzwEcpfkaF9OkyePnlh0NPQWwDktOsyKThjEnomU$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 = m$$pnt6LUs5uRi3djZcBRBpySsv4Zz1FaZy32nH0v10mXpDMPRqcx0e5QjQsVzwEcpfkaF9OkyePnlh0NPQWwDktOsyKThjEnomU$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_12972, class_45872, class_45972);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$pnt6LUs5uRi3djZcBRBpySsv4Zz1FaZy32nH0v10mXpDMPRqcx0e5QjQsVzwEcpfkaF9OkyePnlh0NPQWwDktOsyKThjEnomU$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8);
    }

    @Inject(method={"renderFire"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_4587 class_45872, class_4597 class_45972, class_10017 class_100172, Quaternionf quaternionf, CallbackInfo callbackInfo) {
        class_1297 class_12972 = m$$F1Y0ILIopL3Cl5IPpyeRxv5yv5EOm3L85cPTPOeChjxA5zRVphzIw4dhsrkNgcMwZoNGmMIQe9jUGYdNA8VksQZt1yIyo35QT.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_100172);
        if (m$$o7NbnOIjaECyMmKYx5DiZB0PBhO73e9kmc954AaJu8d8gBLyycPZikGVhIXboqmmmrWzu4AbLX436sJzavCoEt02H3eqUFDSZ.m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus(class_12972, -1609117443)) {
            callbackInfo.cancel();
        }
        if (m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.isToggled() && ((Boolean)m$$nziqpqkcISpC8fxrLl4fuc0sNpcFmP6KIebZwq2VhTKMPJe3aAyBWuQXb3LiHRT9OxoKPbDHT8JTtDK2oj8khY8sYPWiMC57N.m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$tPvXj3kNeRYQm2WjSmRDnwDcK6qCHa8hfmqpfZwqO4XZI4ex1JksUcEvmo77iC0WLPttrBTpvfmYCuMfqY5ZNgTnMpUqhp8WE.getValue()).booleanValue() && (((Boolean)m$$nziqpqkcISpC8fxrLl4fuc0sNpcFmP6KIebZwq2VhTKMPJe3aAyBWuQXb3LiHRT9OxoKPbDHT8JTtDK2oj8khY8sYPWiMC57N.m$$efZx5bnEk1lm3D90ko0qwxulyPjxwjQH3CZAMM8r9KHjHBpvWl8T7WUfyLVY1V6KXBAGOtflpLChA5RVPHlk9L2KxY8uZ176v.m$$95SfqwcotBQngm462IPliKLKISEl3ap17eWp9y71J9vh4inMuWHWzhOwt4s4FTpkcoBIy8S3kJROOtomqatF9TOBhVAqSKmwv.getValue()).booleanValue() || class_12972 instanceof class_746 || class_12972 instanceof class_1511)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderHitbox"}, at={@At(value="HEAD")}, cancellable=true)
    private static void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_4587 class_45872, class_4588 class_45882, class_10932 class_109322, CallbackInfo callbackInfo) {
        if (m$$TZgQYOfileYzvjsLQ9Fdn0ZKXPPt43hknZD3yHKHsxHe8L6WDDVm4dArbek1an6T0zOqDEhIQb67DoIQhI3hLliFn0go1enFb.m$$dGYcRLFI24LZN4QtTvULJkQEBOXpr5mDGCnPMtBo0sbBPDg0yHMn0jvpWBFWVpXtgp0ZlbfoQszcf9J3cbv6W6ppR6j18Sx57) {
            callbackInfo.cancel();
        }
    }
}

