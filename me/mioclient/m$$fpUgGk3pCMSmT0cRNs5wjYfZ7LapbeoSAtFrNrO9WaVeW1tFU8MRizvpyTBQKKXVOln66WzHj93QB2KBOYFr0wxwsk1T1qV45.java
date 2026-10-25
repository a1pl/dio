package me.mioclient;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.function.BiFunction;
import java.util.function.Function;
import me.mioclient.m$$JlYob76ykoMYqistvhNZuEP7xnUGSAcaXHGcexagaXNJtTSNPFeKBxUddkfGqw5q7ABj6BYiKfSRBFu6wCjSPV2OCqELITSzy;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_1044;
import net.minecraft.class_10799;
import net.minecraft.class_156;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4668;
import net.minecraft.class_9851;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public final class m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45 {
    public static final int m$$XaCUZ0h4Sfi1cgQN9hNMmkpayc9ahOOLDHTsEP8cW3xT1lKSLuDdr8ac191gFJ74Cs7bW8n3K5klBMx9zIl3HDdbmrt7F4awl = 786432;
    public static final int m$$8W3zfLYfMdtCK61oMumlmAUU32Z5ijMRrZnqgMViTgxaNWKz6qxC60QeK1ZFKJce5Ck1yZhNOeQbmUUYjr94Gd1KJVGts0Ic7 = 1536;
    public static final Function m$$9NWQSo1a918DHETTVagKIMqwUKV0elTVoEZoZecaBKXokyqcKRrS150b45gHctfqmUgd94NQWQs7i7NCoo8w1KeNyfjtXZHnt = class_156.method_34866(class_29602 -> m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8( /* dynamic constant */ (String)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh("64imRoJR8yoyNw47K6IP", MethodHandles.lookup(), "m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh", m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.class, 1242549336), class_29602));
    public static final Function m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl = class_156.method_34866(class_29602 -> {
        class_1921.class_4688 class_46882 = m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$RSe7Gv90IvcdOonjKf94UcQbbBDAMGUrwuc1Wi8oj1gXUXwKD7Tem14VLjFFNDltAAWki0NMiZ2JZqlGUeKEikIk62MMn1J16().method_34577((class_4668.class_5939)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_29602, class_9851.field_52396, false)).method_23608(class_4668.field_21383).method_23611(class_4668.field_21385).method_23617(true);
        return class_1921.method_24049((String)( /* dynamic constant */ (String)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh("9XhdAJJQUtos0UJkWFAq", MethodHandles.lookup(), "m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh", m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.class, 1509414839)), (int)1536, (boolean)true, (boolean)false, (RenderPipeline)m$$JlYob76ykoMYqistvhNZuEP7xnUGSAcaXHGcexagaXNJtTSNPFeKBxUddkfGqw5q7ABj6BYiKfSRBFu6wCjSPV2OCqELITSzy.m$$oRsPOxEzXI6zmMx5y4AhbH8XQspiGNTZrZp22tezksjg6xH1VDe0ZHN8tz3FKPV7qXncaUBLPYjrkF1plyEPXtHYjxCgzwHP5, (class_1921.class_4688)class_46882);
    });
    public static final Function m$$i6zAWzvAvxtGBakAMZhDHKw70Tg5GbQLWyljf1ChJ6oLfTfGLogiAAkU7ealKKP3OQekQcvv9gJHSnt6BxOnxEaEOs2YcyDpB = class_156.method_34866(class_29602 -> {
        class_1921.class_4688 class_46882 = m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$RSe7Gv90IvcdOonjKf94UcQbbBDAMGUrwuc1Wi8oj1gXUXwKD7Tem14VLjFFNDltAAWki0NMiZ2JZqlGUeKEikIk62MMn1J16().method_34577((class_4668.class_5939)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_29602, class_9851.field_52395, false)).method_23617(false);
        return class_1921.method_24048((String)( /* dynamic constant */ (String)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh("84Mob6fxcx5CThVdyi4t", MethodHandles.lookup(), "m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh", m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.class, 1449952820)), (int)786432, (RenderPipeline)m$$JlYob76ykoMYqistvhNZuEP7xnUGSAcaXHGcexagaXNJtTSNPFeKBxUddkfGqw5q7ABj6BYiKfSRBFu6wCjSPV2OCqELITSzy.m$$0D4UhiR3b81IFcbqRbXTUYu3F2ZuNij5x7VoQlzKir5KJeN6YEGRFq4JcU3qvyzhgdjQSZ5VVIggxr0De01bePG76QQCKH0FG, (class_1921.class_4688)class_46882);
    });
    public static final BiFunction m$$ITvaiL89DphIfe0Epjfanx98bHBBVd8yseRP7GMWIfjXyZbkVy0t9xaVUfxXjpt5jEwR13pKYBfQPhhjSYDlZc0h0zOwb0S5t = class_156.method_34865((gpuTexture, bl) -> {
        class_1921.class_4688 class_46882 = m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$RSe7Gv90IvcdOonjKf94UcQbbBDAMGUrwuc1Wi8oj1gXUXwKD7Tem14VLjFFNDltAAWki0NMiZ2JZqlGUeKEikIk62MMn1J16().method_34577(m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(gpuTexture, (boolean)bl)).method_23617(false);
        return class_1921.method_24048((String)( /* dynamic constant */ (String)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh("P2pjMAFt4XgQccZVal5v", MethodHandles.lookup(), "m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh", m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.class, 1714943644)), (int)786432, (RenderPipeline)class_10799.field_56883, (class_1921.class_4688)class_46882);
    });
    public static final BiFunction m$$89KUPBmglFbIumfZDBkDSS2a0yQdgUClluONpCxgKE83LeqP1ZnyE51hLsyEVrfDfsoebC3LYvayFzSxY68lBgIniiJXSMQFs = class_156.method_34865((class_29602, bl) -> {
        class_1921.class_4688 class_46882 = m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$RSe7Gv90IvcdOonjKf94UcQbbBDAMGUrwuc1Wi8oj1gXUXwKD7Tem14VLjFFNDltAAWki0NMiZ2JZqlGUeKEikIk62MMn1J16().method_34577(m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_29602, (boolean)bl)).method_23617(false);
        return class_1921.method_24048((String)( /* dynamic constant */ (String)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh("foJklz0oWGZRYmqFgcnA", MethodHandles.lookup(), "m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh", m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.class, 582009463)), (int)786432, (RenderPipeline)class_10799.field_56883, (class_1921.class_4688)class_46882);
    });
    public static final class_1921 m$$pvIvFMXRUTJ8dgkZsnzxA0DZuw4wqtRsqFoZ9mnVn4jDArZk2NwY6plqoEV1GtE7QMYGfFHRRHf4UmG4utALbii5AhpWQXy0z = class_1921.method_24048((String)( /* dynamic constant */ (String)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh("y9CuPn9EVzUHXeEgLGdF", MethodHandles.lookup(), "m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh", m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.class, 824441551)), (int)786432, (RenderPipeline)m$$JlYob76ykoMYqistvhNZuEP7xnUGSAcaXHGcexagaXNJtTSNPFeKBxUddkfGqw5q7ABj6BYiKfSRBFu6wCjSPV2OCqELITSzy.m$$9sP6FTRPpeFrqLW1fjiwQaWxnnzsH7fCmsDHrQrj92fEq0XahFzAWYSV5V8S398wkDdaycnNBLxYMcacVm4MC3v9UlNK4h4VB, (class_1921.class_4688)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$hkHS6mEomh80YwSdD0jkkg6PDhbZyRavfotlPrU1SbtIc9sSBoJ1eikvTp2qgL1engOZRvQRSDEz5ksNxvtv3l65xCCmLYOP7());
    public static final class_1921 m$$JlXT0s5U4zTOmVfzlSAwEPBRd8FtaQtMLSTZC8r5abmvtUnYqfI4FhsEQ5H4pVnUyeB5K3qK1z0yYM3XXWNCDpLBQsgjENMG9 = class_1921.method_24048((String)( /* dynamic constant */ (String)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh("IKwyN44LkNV7WCkTtl2j", MethodHandles.lookup(), "m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh", m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.class, 1373743974)), (int)1536, (RenderPipeline)m$$JlYob76ykoMYqistvhNZuEP7xnUGSAcaXHGcexagaXNJtTSNPFeKBxUddkfGqw5q7ABj6BYiKfSRBFu6wCjSPV2OCqELITSzy.m$$Namit6arBE9jZPXFh1prfRb2p1xvaBNLpPqjae0JGh5Qj4UYsmhdJ6LuJEb7BZcYbK7P6iWubxA4Cnm4D52RebVBjMfyEnpXE, (class_1921.class_4688)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$hkHS6mEomh80YwSdD0jkkg6PDhbZyRavfotlPrU1SbtIc9sSBoJ1eikvTp2qgL1engOZRvQRSDEz5ksNxvtv3l65xCCmLYOP7());
    public static final class_1921 m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR = class_1921.method_24048((String)( /* dynamic constant */ (String)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh("zWuCBM8srvwCE3Cbpx65", MethodHandles.lookup(), "m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh", m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.class, 1797063618)), (int)1536, (RenderPipeline)m$$JlYob76ykoMYqistvhNZuEP7xnUGSAcaXHGcexagaXNJtTSNPFeKBxUddkfGqw5q7ABj6BYiKfSRBFu6wCjSPV2OCqELITSzy.m$$usXG571P78ZIDUX65juViIw7w4boKMgEkX4P6fOPBmvx5mXSJxOvxaxnFmVjj9DSu4AaMaLB4ApZGKVzJFeuD8I8BJiZkZasq, (class_1921.class_4688)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$hkHS6mEomh80YwSdD0jkkg6PDhbZyRavfotlPrU1SbtIc9sSBoJ1eikvTp2qgL1engOZRvQRSDEz5ksNxvtv3l65xCCmLYOP7());
    public static final class_1921 m$$Q60NwpX5crKBVe0NTEFmRtXQsQdVCRv8mQ8MvNe16Xe87e9OQDmFLZ3doXEg0Y7Zs8SYeknLpvH924iqybOnJEKKCKrgOhxKI = class_1921.method_24048((String)( /* dynamic constant */ (String)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh("NoS7L8MD9X8bJYEB2Oef", MethodHandles.lookup(), "m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh", m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.class, 596626946)), (int)256, (RenderPipeline)m$$JlYob76ykoMYqistvhNZuEP7xnUGSAcaXHGcexagaXNJtTSNPFeKBxUddkfGqw5q7ABj6BYiKfSRBFu6wCjSPV2OCqELITSzy.m$$g6Dn7Ov1gtJ7sfC6Zf2ThJriD7Wv4hZPAY6rRM15YO3g2PbPUwyzA7Q7MF0SCIkcBCkuw55I5g5haoL9D2wc6KudN5F5VGxgq, (class_1921.class_4688)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$hkHS6mEomh80YwSdD0jkkg6PDhbZyRavfotlPrU1SbtIc9sSBoJ1eikvTp2qgL1engOZRvQRSDEz5ksNxvtv3l65xCCmLYOP7());

    public static String m$$aE4d0SMriHfNwk8CHJhASxIOOnz0LGrHOoyxVy5guMcnZ1whM16OGxdxkqR2PBUaOrIlWEzau6STIWBqSw2OzMkX2caIeZIUh(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{-82, -44, -37, -88, -79, 22, -79, -24, 52};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 9]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public static class_1921.class_4688 m$$hkHS6mEomh80YwSdD0jkkg6PDhbZyRavfotlPrU1SbtIc9sSBoJ1eikvTp2qgL1engOZRvQRSDEz5ksNxvtv3l65xCCmLYOP7() {
        return m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$RSe7Gv90IvcdOonjKf94UcQbbBDAMGUrwuc1Wi8oj1gXUXwKD7Tem14VLjFFNDltAAWki0NMiZ2JZqlGUeKEikIk62MMn1J16().method_23617(false);
    }

    public static class_4668.class_4683 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2960 class_29602, class_9851 class_98512, boolean bl) {
        return new class_4668.class_4683(class_29602, class_98512, bl);
    }

    public static class_1921 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2960 class_29602) {
        return (class_1921)m$$9NWQSo1a918DHETTVagKIMqwUKV0elTVoEZoZecaBKXokyqcKRrS150b45gHctfqmUgd94NQWQs7i7NCoo8w1KeNyfjtXZHnt.apply(class_29602);
    }

    public static class_1921 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(GpuTexture gpuTexture, boolean bl) {
        return (class_1921)m$$ITvaiL89DphIfe0Epjfanx98bHBBVd8yseRP7GMWIfjXyZbkVy0t9xaVUfxXjpt5jEwR13pKYBfQPhhjSYDlZc0h0zOwb0S5t.apply(gpuTexture, bl);
    }

    public static class_1921.class_4687 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(String string, class_2960 class_29602) {
        class_1921.class_4688 class_46882 = m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$RSe7Gv90IvcdOonjKf94UcQbbBDAMGUrwuc1Wi8oj1gXUXwKD7Tem14VLjFFNDltAAWki0NMiZ2JZqlGUeKEikIk62MMn1J16().method_34577((class_4668.class_5939)m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_29602, class_9851.field_52396, false)).method_23608(class_4668.field_21383).method_23611(class_4668.field_21385).method_23607(class_4668.field_22241).method_23617(true);
        return class_1921.method_24049((String)string, (int)1536, (boolean)true, (boolean)true, (RenderPipeline)m$$JlYob76ykoMYqistvhNZuEP7xnUGSAcaXHGcexagaXNJtTSNPFeKBxUddkfGqw5q7ABj6BYiKfSRBFu6wCjSPV2OCqELITSzy.m$$2LqcC9xdmICn9YlLUBcW10ZLhkMgoeefsjWkNKU4tHvplcdK1UVa8rX3HoyPnJUJURjS8XjlbGIjuQVFAbuTZhmXBSl7Z4d5o, (class_1921.class_4688)class_46882);
    }

    public static class_1921 m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_2960 class_29602, boolean bl) {
        return (class_1921)m$$89KUPBmglFbIumfZDBkDSS2a0yQdgUClluONpCxgKE83LeqP1ZnyE51hLsyEVrfDfsoebC3LYvayFzSxY68lBgIniiJXSMQFs.apply(class_29602, bl);
    }

    public static class_1921 m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(class_2960 class_29602) {
        return (class_1921)m$$i6zAWzvAvxtGBakAMZhDHKw70Tg5GbQLWyljf1ChJ6oLfTfGLogiAAkU7ealKKP3OQekQcvv9gJHSnt6BxOnxEaEOs2YcyDpB.apply(class_29602);
    }

    public static class_1921 m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_2960 class_29602) {
        return (class_1921)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.apply(class_29602);
    }

    public static class_4668.class_5939 m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(GpuTexture gpuTexture, boolean bl) {
        return new class_4668.class_5939(() -> {
            if (bl) {
                GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
            } else {
                GlStateManager._texParameter((int)3553, (int)10240, (int)9728);
            }
            RenderSystem.setShaderTexture((int)0, (GpuTexture)gpuTexture);
        }, () -> {});
    }

    public static class_4668.class_5939 m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_2960 class_29602, boolean bl) {
        class_1044 class_10442 = class_310.method_1551().method_1531().method_4619(class_29602);
        return m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(class_10442.method_68004(), bl);
    }

    public static class_1921 m$$2clVljJRCQJbjif7omdchwHlBlBYJC5Nbtb7D33CeWvguFfuXUWrhxP60dJIXZZxzAev05L11xOoChOQF7omcBuSzZ9Ioc8oa() {
        return m$$Q60NwpX5crKBVe0NTEFmRtXQsQdVCRv8mQ8MvNe16Xe87e9OQDmFLZ3doXEg0Y7Zs8SYeknLpvH924iqybOnJEKKCKrgOhxKI;
    }

    public static class_1921 m$$ex3E9Uqnm2SKgma03Hg9rvx8doMjvmpmicFgFPPSvJbpSVtUiB288ay3TQPlokB079oXcR0hq3QYBKq8XunpwhpYLDQXsKClT() {
        return m$$JlXT0s5U4zTOmVfzlSAwEPBRd8FtaQtMLSTZC8r5abmvtUnYqfI4FhsEQ5H4pVnUyeB5K3qK1z0yYM3XXWNCDpLBQsgjENMG9;
    }

    public static class_1921 m$$IqA9eTODQODqKnmjp1YKvoX78844y2boIQ3dD0Wp2TL2PaXokZ9iQj6kvTyqOovHbiayK8l1XdEyAUcDGznvR7qZexHWtEmIA() {
        return m$$lBMmZ3EFGsIOfhaVQz008Yv3NuM6ysFzSUvg2E3fVP8L6apEGJgU39OqRFrMeP68AR630GRDxDz6biVuU6CvLHs1diCRSWaKR;
    }

    public static class_1921 m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(class_2960 class_29602) {
        return m$$fpUgGk3pCMSmT0cRNs5wjYfZ7LapbeoSAtFrNrO9WaVeW1tFU8MRizvpyTBQKKXVOln66WzHj93QB2KBOYFr0wxwsk1T1qV45.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_29602, true);
    }

    public static class_1921.class_4688.class_4689 m$$RSe7Gv90IvcdOonjKf94UcQbbBDAMGUrwuc1Wi8oj1gXUXwKD7Tem14VLjFFNDltAAWki0NMiZ2JZqlGUeKEikIk62MMn1J16() {
        return class_1921.class_4688.method_23598();
    }

    public static class_1921 m$$tjFXe97uNc2AC6AdkNJ3RB6mWdEdDPxZwYLOLd785PnWZ7vnsdhG81QEo4IOTpr6394y7SxzldYBwYmKObrDPu2kNgDwI8IaP() {
        return m$$pvIvFMXRUTJ8dgkZsnzxA0DZuw4wqtRsqFoZ9mnVn4jDArZk2NwY6plqoEV1GtE7QMYGfFHRRHf4UmG4utALbii5AhpWQXy0z;
    }
}

