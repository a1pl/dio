package nick;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.SecureClassLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import nick.Hash;

public final class MioClassLoader
extends SecureClassLoader {
    private static final Map<Long, byte[]> DATA = new HashMap<Long, byte[]>(){
        {
            this.put(-1156854636071942612L, MioClassLoader.read("mio/-1156854636071942612.bin"));
            this.put(-202295177518396515L, MioClassLoader.read("mio/-202295177518396515.bin"));
            this.put(-2037366403957045892L, MioClassLoader.read("mio/-2037366403957045892.bin"));
            this.put(-2051135075305702010L, MioClassLoader.read("mio/-2051135075305702010.bin"));
            this.put(-2236490846758828587L, MioClassLoader.read("mio/-2236490846758828587.bin"));
            this.put(-2587742845299202020L, MioClassLoader.read("mio/-2587742845299202020.bin"));
            this.put(-3196439585737283335L, MioClassLoader.read("mio/-3196439585737283335.bin"));
            this.put(-3477212311278526151L, MioClassLoader.read("mio/-3477212311278526151.bin"));
            this.put(-3566755497116400425L, MioClassLoader.read("mio/-3566755497116400425.bin"));
            this.put(-4045037417574934788L, MioClassLoader.read("mio/-4045037417574934788.bin"));
            this.put(-5184565472326166436L, MioClassLoader.read("mio/-5184565472326166436.bin"));
            this.put(-5625967054364314949L, MioClassLoader.read("mio/-5625967054364314949.bin"));
            this.put(-6862787127220354815L, MioClassLoader.read("mio/-6862787127220354815.bin"));
            this.put(-7023810658846360874L, MioClassLoader.read("mio/-7023810658846360874.bin"));
            this.put(-7090278656847170995L, MioClassLoader.read("mio/-7090278656847170995.bin"));
            this.put(-7183123058599273620L, MioClassLoader.read("mio/-7183123058599273620.bin"));
            this.put(-7341433280440695994L, MioClassLoader.read("mio/-7341433280440695994.bin"));
            this.put(-7680579496922721047L, MioClassLoader.read("mio/-7680579496922721047.bin"));
            this.put(-7964734080343971309L, MioClassLoader.read("mio/-7964734080343971309.bin"));
            this.put(-8099616702159452490L, MioClassLoader.read("mio/-8099616702159452490.bin"));
            this.put(-8195265773805934756L, MioClassLoader.read("mio/-8195265773805934756.bin"));
            this.put(-8198470913248626461L, MioClassLoader.read("mio/-8198470913248626461.bin"));
            this.put(-8381037589029380890L, MioClassLoader.read("mio/-8381037589029380890.bin"));
            this.put(1539974198544823836L, MioClassLoader.read("mio/1539974198544823836.bin"));
            this.put(1663163836379652005L, MioClassLoader.read("mio/1663163836379652005.bin"));
            this.put(1790238393984445022L, MioClassLoader.read("mio/1790238393984445022.bin"));
            this.put(1896199715147295766L, MioClassLoader.read("mio/1896199715147295766.bin"));
            this.put(2068539170343643742L, MioClassLoader.read("mio/2068539170343643742.bin"));
            this.put(2138326405829089144L, MioClassLoader.read("mio/2138326405829089144.bin"));
            this.put(217053583388222802L, MioClassLoader.read("mio/217053583388222802.bin"));
            this.put(312442932223993734L, MioClassLoader.read("mio/312442932223993734.bin"));
            this.put(340059997659842985L, MioClassLoader.read("mio/340059997659842985.bin"));
            this.put(3744080819900926215L, MioClassLoader.read("mio/3744080819900926215.bin"));
            this.put(4170052429374349922L, MioClassLoader.read("mio/4170052429374349922.bin"));
            this.put(450073944724737926L, MioClassLoader.read("mio/450073944724737926.bin"));
            this.put(4745936108167237997L, MioClassLoader.read("mio/4745936108167237997.bin"));
            this.put(5683599352333742209L, MioClassLoader.read("mio/5683599352333742209.bin"));
            this.put(5685221327652941277L, MioClassLoader.read("mio/5685221327652941277.bin"));
            this.put(6262805706691898965L, MioClassLoader.read("mio/6262805706691898965.bin"));
            this.put(6356538713265320868L, MioClassLoader.read("mio/6356538713265320868.bin"));
            this.put(6362189062087683333L, MioClassLoader.read("mio/6362189062087683333.bin"));
            this.put(6385281682528407296L, MioClassLoader.read("mio/6385281682528407296.bin"));
            this.put(6520430417310117223L, MioClassLoader.read("mio/6520430417310117223.bin"));
            this.put(6735045970717493054L, MioClassLoader.read("mio/6735045970717493054.bin"));
            this.put(6758778778841188374L, MioClassLoader.read("mio/6758778778841188374.bin"));
            this.put(719574448491822624L, MioClassLoader.read("mio/719574448491822624.bin"));
            this.put(7486200784412077737L, MioClassLoader.read("mio/7486200784412077737.bin"));
            this.put(7532973076254138070L, MioClassLoader.read("mio/7532973076254138070.bin"));
            this.put(7949560956520799428L, MioClassLoader.read("mio/7949560956520799428.bin"));
            this.put(8325382314658498605L, MioClassLoader.read("mio/8325382314658498605.bin"));
            this.put(8480236269238451330L, MioClassLoader.read("mio/8480236269238451330.bin"));
            this.put(8810857770749952228L, MioClassLoader.read("mio/8810857770749952228.bin"));
            this.put(8818174620704159780L, MioClassLoader.read("mio/8818174620704159780.bin"));
            this.put(9098684348202532870L, MioClassLoader.read("mio/9098684348202532870.bin"));
        }
    };
    private final ClassLoader loader;

    public MioClassLoader(ClassLoader parent, ClassLoader original) {
        super(parent);
        this.loader = original;
    }

    @Override
    public Class<?> loadClass(String klass) throws ClassNotFoundException {
        return this.loader.loadClass(klass);
    }

    @Override
    public URL getResource(String string) {
        return this.loader.getResource(string);
    }

    @Override
    public InputStream getResourceAsStream(String string) {
        long hash = Hash.hash(string.getBytes(StandardCharsets.UTF_8));
        if (DATA.containsKey(hash)) {
            return new ByteArrayInputStream(DATA.get(hash));
        }
        return this.loader.getResourceAsStream(string);
    }

    private static byte[] read(String path) {
        byte[] byArray;
        block8: {
            InputStream is = MioClassLoader.class.getClassLoader().getResourceAsStream(path);
            try {
                byArray = Objects.requireNonNull(is).readAllBytes();
                if (is == null) break block8;
            } catch (Throwable throwable) {
                try {
                    if (is != null) {
                        try {
                            is.close();
                        } catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                } catch (Throwable _t) {
                    _t.printStackTrace(System.err);
                    throw new RuntimeException();
                }
            }
            is.close();
        }
        return byArray;
    }
}

