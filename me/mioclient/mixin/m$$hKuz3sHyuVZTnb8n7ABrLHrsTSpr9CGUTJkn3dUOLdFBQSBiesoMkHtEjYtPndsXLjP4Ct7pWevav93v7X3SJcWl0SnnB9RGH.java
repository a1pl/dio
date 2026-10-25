package me.mioclient.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import java.util.Optional;
import me.mioclient.m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG;
import me.mioclient.m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m;
import me.mioclient.m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV;
import me.mioclient.m$$jtFauoe6ytwsCqMVj75BsceyoIr6knC9uLcnURw4RD2c3ScSs0IdXOtbz2FAHRyXYTq2dlMXTRIYKLiwpnofwgNwlSUkmlB70;
import me.mioclient.m$$wcqY45BMnMuQggDRpZkg5JTmcoWfsq8CUVp1Z236E4JreNIM2dIqPLxB5HtAK7MVS0BkZJPrAZtun3HjpKA35J5ZqikbmdPZ0$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.mixin.m$$dqgASIaDtYYe3zYFD5wVnvar7p3RBBCX62DOFFw1NoiiZYC60ich0h1LKqIfRGasndJsEg7XDQNm5wptYmzZ4PJ3EIRktYkCT;
import net.minecraft.class_243;
import net.minecraft.class_2604;
import net.minecraft.class_2625;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2664;
import net.minecraft.class_2693;
import net.minecraft.class_2735;
import net.minecraft.class_2743;
import net.minecraft.class_310;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_634.class})
public class m$$hKuz3sHyuVZTnb8n7ABrLHrsTSpr9CGUTJkn3dUOLdFBQSBiesoMkHtEjYtPndsXLjP4Ct7pWevav93v7X3SJcWl0SnnB9RGH {
    private static m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG norender = (m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG.class);
    private static m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A velocity = (m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$4Ujmf8hdke8XTxUNLnwfq1NRD9gAfIPfkVLwKbfEKSw6mUlCLGvxUV3zVU6KIvXIbNu6CjFpBSZ91fVSt0G0cDJlaOolsab4A.class);

    @Inject(method={"onExplosion"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/util/thread/ThreadExecutor;)V", shift=At.Shift.AFTER)}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2664 class_26642, CallbackInfo callbackInfo) {
        m$$jtFauoe6ytwsCqMVj75BsceyoIr6knC9uLcnURw4RD2c3ScSs0IdXOtbz2FAHRyXYTq2dlMXTRIYKLiwpnofwgNwlSUkmlB70 m$$jtFauoe6ytwsCqMVj75BsceyoIr6knC9uLcnURw4RD2c3ScSs0IdXOtbz2FAHRyXYTq2dlMXTRIYKLiwpnofwgNwlSUkmlB70 = new m$$jtFauoe6ytwsCqMVj75BsceyoIr6knC9uLcnURw4RD2c3ScSs0IdXOtbz2FAHRyXYTq2dlMXTRIYKLiwpnofwgNwlSUkmlB70(class_26642);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$jtFauoe6ytwsCqMVj75BsceyoIr6knC9uLcnURw4RD2c3ScSs0IdXOtbz2FAHRyXYTq2dlMXTRIYKLiwpnofwgNwlSUkmlB70);
        if (m$$jtFauoe6ytwsCqMVj75BsceyoIr6knC9uLcnURw4RD2c3ScSs0IdXOtbz2FAHRyXYTq2dlMXTRIYKLiwpnofwgNwlSUkmlB70.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        } else {
            m$$dqgASIaDtYYe3zYFD5wVnvar7p3RBBCX62DOFFw1NoiiZYC60ich0h1LKqIfRGasndJsEg7XDQNm5wptYmzZ4PJ3EIRktYkCT m$$dqgASIaDtYYe3zYFD5wVnvar7p3RBBCX62DOFFw1NoiiZYC60ich0h1LKqIfRGasndJsEg7XDQNm5wptYmzZ4PJ3EIRktYkCT = (m$$dqgASIaDtYYe3zYFD5wVnvar7p3RBBCX62DOFFw1NoiiZYC60ich0h1LKqIfRGasndJsEg7XDQNm5wptYmzZ4PJ3EIRktYkCT)class_26642;
            class_243 class_2432 = new class_243((double)m$$jtFauoe6ytwsCqMVj75BsceyoIr6knC9uLcnURw4RD2c3ScSs0IdXOtbz2FAHRyXYTq2dlMXTRIYKLiwpnofwgNwlSUkmlB70.m$$5yEd24roNrYdn4OBBabSnCzvNNLSRr9HkKUKA1dvFdFMw3XOYgOf1xNCSMM7QQ4hUm48htyEzsiwsQ6JmmGQmRwza0ea9tlDB(), (double)m$$jtFauoe6ytwsCqMVj75BsceyoIr6knC9uLcnURw4RD2c3ScSs0IdXOtbz2FAHRyXYTq2dlMXTRIYKLiwpnofwgNwlSUkmlB70.m$$HEIkjFSwst8n7ELevJ3jFv29SZXjrTHxloyX37oXX2GtbyyXVJP3iw16NGxOoaYXRlUlmobwmhGZMLWb3qhzoeFMoK4t4Y3kU(), (double)m$$jtFauoe6ytwsCqMVj75BsceyoIr6knC9uLcnURw4RD2c3ScSs0IdXOtbz2FAHRyXYTq2dlMXTRIYKLiwpnofwgNwlSUkmlB70.m$$Vl4BAJAIIcPGRphk2mA6TYjdtW0hDkxUlUgPAQoPIYdXAI4WXwsOXVVhd7H0VlJRPkwA1FKgyhWW90JsXR8xv5PM0wY1EKcVJ());
            m$$dqgASIaDtYYe3zYFD5wVnvar7p3RBBCX62DOFFw1NoiiZYC60ich0h1LKqIfRGasndJsEg7XDQNm5wptYmzZ4PJ3EIRktYkCT.setVelocity(Optional.of(class_2432));
        }
    }

    @Inject(method={"onEntityVelocityUpdate"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/util/thread/ThreadExecutor;)V", shift=At.Shift.AFTER)}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2743 class_27432, CallbackInfo callbackInfo) {
        if (velocity.m$$1eopWVIiUL4NZ8iXZjiq2At3OEiBRLIl086gkuFHxx2m90nKGNCsLpVCIi0pWU6LNzAj5Wv5eOrg7o4jDk5faDx8zgKoPWg9c(-254364651) && class_27432.method_11818() == class_310.method_1551().field_1724.method_5628()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"onEntitySpawn"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2604 class_26042, CallbackInfo callbackInfo) {
        if (!norender.isToggled()) {
            return;
        }
        if (class_26042 != null && class_26042.method_11169() != null && norender.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_26042.method_11169()) && m$$hKuz3sHyuVZTnb8n7ABrLHrsTSpr9CGUTJkn3dUOLdFBQSBiesoMkHtEjYtPndsXLjP4Ct7pWevav93v7X3SJcWl0SnnB9RGH.norender.m$$dVejJzFE3HDX0MNEYJsfYkIkTScuv2iiXq3TBXINFjrNYTP7QZ7iVnvZex9sorufyK22OKSu4xQ6aL6cr2IpCYlTcMCCkYDgS.getValue() == m$$L6oCxohTw3BvQ5RgtUJE4xR3AMMyNFK4rUsWUp8GROKI7f5fWToF1rrT0JkcwuZ867kZLUt8KUgh0w33g8oOS17bLchYziWTG$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$8ylYmAda90E8bPDRzjbYp9Dg98kKpyMiaUnpQU4wywaZvp8NHstsF8s1yDzD3qZFkVRlZer2FZzl5zwdH58fhigaP64INAZd6) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"onUpdateSelectedSlot"}, at={@At(value="INVOKE", target="Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/util/thread/ThreadExecutor;)V", shift=At.Shift.AFTER)}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2735 class_27352, CallbackInfo callbackInfo) {
        m$$wcqY45BMnMuQggDRpZkg5JTmcoWfsq8CUVp1Z236E4JreNIM2dIqPLxB5HtAK7MVS0BkZJPrAZtun3HjpKA35J5ZqikbmdPZ0$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 m$$wcqY45BMnMuQggDRpZkg5JTmcoWfsq8CUVp1Z236E4JreNIM2dIqPLxB5HtAK7MVS0BkZJPrAZtun3HjpKA35J5ZqikbmdPZ0$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 = new m$$wcqY45BMnMuQggDRpZkg5JTmcoWfsq8CUVp1Z236E4JreNIM2dIqPLxB5HtAK7MVS0BkZJPrAZtun3HjpKA35J5ZqikbmdPZ0$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_27352.comp_3325());
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$wcqY45BMnMuQggDRpZkg5JTmcoWfsq8CUVp1Z236E4JreNIM2dIqPLxB5HtAK7MVS0BkZJPrAZtun3HjpKA35J5ZqikbmdPZ0$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8);
        if (m$$wcqY45BMnMuQggDRpZkg5JTmcoWfsq8CUVp1Z236E4JreNIM2dIqPLxB5HtAK7MVS0BkZJPrAZtun3HjpKA35J5ZqikbmdPZ0$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"onBlockUpdate"}, at={@At(value="TAIL")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2626 class_26262, CallbackInfo callbackInfo) {
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(new m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV());
    }

    @Inject(method={"onChunkDeltaUpdate"}, at={@At(value="TAIL")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2637 class_26372, CallbackInfo callbackInfo) {
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(new m$$ZE9Ndgp6bmoaClc0bwEjfETLbLbvC54HRhT42bvwOY0rrhLDXpepLVAaXkivlO1Atz8Saii0Tv024r8rJCGhnEzi0S7HJksnV());
    }

    @Inject(method={"onSignEditorOpen"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;openEditSignScreen(Lnet/minecraft/block/entity/SignBlockEntity;Z)V", shift=At.Shift.BEFORE)}, cancellable=true)
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_2693 class_26932, CallbackInfo callbackInfo, @Local class_2625 class_26252) {
        m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m = new m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m(class_26932.method_11677(), class_26252, class_26932.method_49995());
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m);
        if (m$$Rz7rTOxzJtAHeolGrpbhGD7NZB2cqcQulNkBOx8PlTv0L9prn1xndHl0prIjTW6WnUoEtI11hLgXRGXcNBsGNAQud04rkuj9m.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }
}

