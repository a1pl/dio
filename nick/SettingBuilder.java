package nick;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.awt.Color;
import java.io.DataInputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import net.minecraft.class_2378;
import nick.Loader;
import sun.misc.Unsafe;

public final class SettingBuilder {
    private static final int NO_PREDICATE = 0;
    private static final int SETTINGS_PREDICATE = 1;
    private static final int MODULE_PREDICATE = 2;
    private static final int COMBINED_PREDICATE = 3;
    private static final int LAMBDA_PREDICATE = 4;
    private static final int NUMBER_SETTING = 0;
    private static final int COLOR_SETTING = 1;
    private static final int BOOLEAN_SETTING = 2;
    private static final int ENUM_SETTING = 3;
    private static final int STRING_SETTING = 4;
    private static final int IDENTIFIER_SETTING = 5;
    private static final int STRING_SET_SETTING = 6;
    private static final int OBJECT_SET_SETTING = 7;
    private static final int CONSTANT_Integer = 0;
    private static final int CONSTANT_Float = 1;
    private static final int CONSTANT_Double = 2;
    private static final Map<String, List<Setting>> SETTINGS = new HashMap<String, List<Setting>>();
    private static final Map<Long, Setting> REGISTRY = new HashMap<Long, Setting>();
    private static final Class<?> SETTING_BASE;
    private static final Field _NAME;
    private static final Field _DESCRIPTOR;
    private static final Field _NAME_1;
    private static final Field _DESC_1;
    private static final Field B1;
    private static final Field B2;
    private static final Field B3;
    private static final Field B4;
    private static final Field B5;
    private static final Field B6;
    private static final Field _TI;
    private static final Field O1;
    private static final Field O2;
    private static final Field O3;
    private static final Field O4;
    private static final Field O5;
    private static final Field O6;
    private static final Field ENUM_SERIALIZER;
    private static final Field COLOR_SERIALIZER;
    private static Field _SUFFIX;
    private static Field _C_B1;
    private static Field _C_B2;
    private static Field _REGISTRY;
    private static Field _SETTINGS;
    private static final Method _PREDICATE;
    private static final Method _PREDICATE_1;
    private static final Unsafe UNSAFE;

    private static void additional() throws Throwable {
        if (_SETTINGS != null) {
            return;
        }
        _SUFFIX = Class.forName("me.mioclient.m$$bbeNkSQujnzcYBth4lKKzyLe0EkCLf6zjHcEMNTMYqdb6aTjDGp98ZxhWRq5geV7pHGfAWgyCh20GrHaP5bsZChxFRrYEKQ0q").getDeclaredField("m$$Siqxdw60dnxHxOD8uuwYiX8PVK89Zxq606yoos2T2hm2o8ThAcHt6SwQbcU63ih2Pt3VG9BWl8FAWK96c3J8pfnMWQwW1wzAb");
        Class<?> _c = Class.forName("me.mioclient.m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm");
        _C_B1 = _c.getDeclaredField("m$$FKzYq6WxUBITt44akNhEeqO8GUim57EVieKu1jHTcEm2TdtebYtfT8NxbtyKgt73I2tx9EixPiHwOs6dPaEbjXymaYxum6S86");
        _C_B2 = _c.getDeclaredField("m$$gYMc6Khfaf6sxpeK0US8NBX7CCuctT2ZE0Y9olbo9HiP36JdwWVmj3ZKZACYLNZsulb4vs7RDnk45fSzWIdVX6MMbS0cSgSBk");
        _REGISTRY = Class.forName("me.mioclient.m$$WBph0c7B9Yfm8iuQUN1x87mXXnM5VEpwOjDu2en4nUTP91vXRxsgLf1pJiQ9fPS3ViAA4Cx8ZT86kwAGMgboXtTgkfjN2VklC").getDeclaredField("m$$xQ8jgx5howJKGmMwgMbM6XY1HDJnKjLumWj5cbrlxmQsb1iu27roC6c5V6l60cyfcejJAI13OkEqUwU9B2XRuHuFcczhTmBIi");
        _SETTINGS = Class.forName("me.mioclient.m$$ZouiUFkx1xxfpBCvUWH4OdXb3qz16ogdTMDdm34jRdLOhrbTSxZZteaDPu1Hx66ZUuzeDqKBGzbTPxI2NAcrmz6IMFQwQtaGM").getDeclaredField("m$$1sOCcTvY9bKrHtctf4tJkRGMFNquAfFAGMwqcAIFd0rpqtzV2pTSoNAG8QQF3hbdZVOdsdVRRWcdbmlDGQ7YwLk1nxG3yGtjh");
    }

    public static void read() {
        try (DataInputStream dis = new DataInputStream(Objects.requireNonNull(Loader.class.getClassLoader().getResourceAsStream("mio/settings.bin")));){
            while (dis.available() != 0) {
                long mod = dis.readLong();
                String name = dis.readUTF();
                int n = dis.readInt();
                block28: for (int i = 0; i < n; ++i) {
                    Setting s = new Setting();
                    s.mod = mod;
                    s.name = name;
                    SETTINGS.computeIfAbsent(s.name, _k -> new ArrayList()).add(s);
                    s.id = dis.readLong();
                    REGISTRY.put(s.id, s);
                    s.field = dis.readBoolean() ? dis.readUTF() : null;
                    s._klass = dis.readUTF();
                    s._name = dis.readUTF();
                    s._descriptor = dis.readUTF();
                    s._name_1 = dis.readUTF();
                    s._desc_1 = dis.readUTF();
                    s.b1 = dis.readBoolean();
                    s.b2 = dis.readBoolean();
                    s.b3 = dis.readBoolean();
                    s.b4 = dis.readBoolean();
                    s.b5 = dis.readBoolean();
                    s.b6 = dis.readBoolean();
                    byte by = dis.readByte();
                    s.tag = by;
                    switch (by) {
                        case 0: {
                            NumberData data = new NumberData();
                            data.suffix = dis.readUTF();
                            switch (dis.readByte()) {
                                case 0: {
                                    data.o1 = dis.readInt();
                                    data.o2 = dis.readInt();
                                    data.o3 = dis.readInt();
                                    data.o4 = dis.readInt();
                                    data.o5 = dis.readInt();
                                    data.o6 = dis.readInt();
                                    break;
                                }
                                case 1: {
                                    data.o1 = Float.valueOf(dis.readFloat());
                                    data.o2 = Float.valueOf(dis.readFloat());
                                    data.o3 = Float.valueOf(dis.readFloat());
                                    data.o4 = Float.valueOf(dis.readFloat());
                                    data.o5 = Float.valueOf(dis.readFloat());
                                    data.o6 = Float.valueOf(dis.readFloat());
                                    break;
                                }
                                case 2: {
                                    data.o1 = dis.readDouble();
                                    data.o2 = dis.readDouble();
                                    data.o3 = dis.readDouble();
                                    data.o4 = dis.readDouble();
                                    data.o5 = dis.readDouble();
                                    data.o6 = dis.readDouble();
                                }
                            }
                            s.data = data;
                            break;
                        }
                        case 1: {
                            ColorData data = new ColorData();
                            data.o1 = new Color(dis.readInt(), true);
                            data.o2 = new Color(dis.readInt(), true);
                            data.o3 = new Color(dis.readInt(), true);
                            data.o6 = new Color(dis.readInt(), true);
                            data.b1 = dis.readBoolean();
                            data.b2 = dis.readBoolean();
                            s.data = data;
                            break;
                        }
                        case 2: {
                            Data data = new Data();
                            data.o1 = dis.readBoolean();
                            data.o2 = dis.readBoolean();
                            data.o3 = dis.readBoolean();
                            data.o6 = dis.readBoolean();
                            s.data = data;
                            break;
                        }
                        case 3: {
                            EnumData data = new EnumData();
                            data.klass = dis.readUTF().replace('/', '.');
                            Class<?> _enum = Class.forName(data.klass);
                            data.t1 = dis.readUTF();
                            Field f1 = _enum.getDeclaredField(data.t1);
                            f1.setAccessible(true);
                            data.t2 = dis.readUTF();
                            Field f2 = _enum.getDeclaredField(data.t2);
                            f2.setAccessible(true);
                            data.t3 = dis.readUTF();
                            Field f3 = _enum.getDeclaredField(data.t3);
                            f3.setAccessible(true);
                            data.t4 = dis.readUTF();
                            Field f4 = _enum.getDeclaredField(data.t4);
                            f4.setAccessible(true);
                            data.o1 = f1.get(null);
                            data.o2 = f2.get(null);
                            data.o3 = f3.get(null);
                            data.o6 = f4.get(null);
                            s.data = data;
                            break;
                        }
                        case 4: {
                            Data data = new Data();
                            data.o1 = dis.readUTF();
                            data.o2 = dis.readUTF();
                            data.o3 = dis.readUTF();
                            data.o6 = dis.readUTF();
                            s.data = data;
                            break;
                        }
                        case 5: {
                            Data data = new Data();
                            Constructor<?> c = Class.forName("me.mioclient.m$$iCDFeSaDjD17bRG5DWKR9dip3UXUSnwjyMLfFat8j2znG8ByBzU8gvqBu1Mp6ncFg5JkCgDLf6QwE2S1NrodPpRwipXuMiKAp").getDeclaredConstructor(String.class, String.class);
                            c.setAccessible(true);
                            data.o1 = c.newInstance(dis.readUTF(), dis.readUTF());
                            data.o2 = c.newInstance(dis.readUTF(), dis.readUTF());
                            data.o3 = c.newInstance(dis.readUTF(), dis.readUTF());
                            data.o6 = c.newInstance(dis.readUTF(), dis.readUTF());
                            s.data = data;
                            break;
                        }
                        case 6: {
                            Data data = new Data();
                            int size = dis.readInt();
                            data.o1 = new ObjectOpenHashSet(size);
                            data.o2 = new ObjectOpenHashSet(size);
                            data.o3 = new ObjectOpenHashSet(size);
                            data.o6 = new ObjectOpenHashSet(size);
                            s.data = data;
                            break;
                        }
                        case 7: {
                            RegistryData data = new RegistryData();
                            data.registry = (class_2378)Class.forName(dis.readUTF()).getDeclaredField(dis.readUTF()).get(null);
                            data.o1 = SettingBuilder.readSet(dis);
                            data.o2 = SettingBuilder.readSet(dis);
                            data.o3 = SettingBuilder.readSet(dis);
                            data.o6 = SettingBuilder.readSet(dis);
                            s.data = data;
                        }
                    }
                    s._ti = dis.readBoolean() ? Class.forName("me.mioclient.m$$cifDyLjhDwVc7DsvicJov1z4w8LSeSc2Sfex0PAhnjIP2XhHgs2BkQSDAhNNuatlpTbaG9XEHrL4hgna1ccB8XvriWnVKoq0N").getDeclaredField(dis.readUTF()).get(null) : null;
                    s.predicates = new ArrayList<PredicateInfo>();
                    switch (dis.readByte()) {
                        case 1: {
                            s.predicates.add(SettingBuilder.readPredicate(dis, 1));
                            continue block28;
                        }
                        case 2: {
                            s.predicates.add(SettingBuilder.readPredicate(dis, 2));
                            continue block28;
                        }
                        case 3: {
                            byte p2;
                            byte p1 = dis.readByte();
                            if (p1 == 1 || p1 == 2) {
                                s.predicates.add(SettingBuilder.readPredicate(dis, p1));
                            }
                            if ((p2 = dis.readByte()) != 1 && p2 != 2) continue block28;
                            s.predicates.add(SettingBuilder.readPredicate(dis, p2));
                        }
                    }
                }
            }
        } catch (Throwable _t) {
            _t.printStackTrace(System.err);
        }
    }

    private static ObjectOpenHashSet<Object> readSet(DataInputStream dis) throws Throwable {
        ObjectOpenHashSet set = new ObjectOpenHashSet();
        int n = dis.readInt();
        for (int i = 0; i < n; ++i) {
            set.add(Class.forName(dis.readUTF()).getDeclaredField(dis.readUTF()).get(null));
        }
        return set;
    }

    private static PredicateInfo readPredicate(DataInputStream dis, int type) throws Throwable {
        if (type == 1) {
            SettingPredicate predicate = new SettingPredicate();
            predicate.keys = new long[dis.readInt()];
            long[] keys = predicate.keys;
            int n = keys.length;
            for (int i = 0; i < n; ++i) {
                keys[i] = dis.readLong();
            }
            return predicate;
        }
        if (type == 2) {
            ModulePredicate predicate = new ModulePredicate();
            predicate.klass = dis.readUTF();
            return predicate;
        }
        throw new RuntimeException();
    }

    public static void apply(Object module) throws Throwable {
        for (Setting setting : Objects.requireNonNull(SETTINGS.get(module.getClass().getName().replace('.', '/')))) {
            setting.build(module);
        }
    }

    static {
        try {
            SETTING_BASE = Class.forName("me.mioclient.m$$mgj7lOGjbnPkgEMabAelHtQHhlNSKm4rB7epPogjFfmhcDSq5Doh6VS98DnS8jwTu7f191DoI4u6rdhssxqxTfuBNqXyIciF5");
            _NAME = SETTING_BASE.getSuperclass().getDeclaredField("m$$O9VdgwS9wXKP3mnKZ1KdZUVz9Vwj3LdbVtkSdiroNC62Xn4MV8zFUlZfcUhSVlBMxXP8Gewc5Zk9ECiiiMcWUuWhslR9gxNVP");
            _DESCRIPTOR = SETTING_BASE.getSuperclass().getDeclaredField("m$$3p7t07HFfQhhPeIzo51Vrab0JGrwd73SFr7EoQwxr1Mfye8wukWbKzL1WDMjaVxhZRFes7nnqRkUFwpugSRswrnx4a7uuTY3T");
            _NAME_1 = SETTING_BASE.getDeclaredField("m$$IyoRfaeG3yovvcHOxK7B1pYmorxgLs4zyp5HhBzkha6j3c0bEbrNzXy37iVwa1wq0Ix8baJna1XcbYJK0g0a5zGuCO27Foycw");
            _DESC_1 = SETTING_BASE.getDeclaredField("m$$OP6Dr3WWtrpSPLrSF0Na9qjHAU34ted0vBc1kys8PWvD0h7kAlrakpAI3aWW81LqaWElzL2BzXT86EjninJAOhz9Y7GPTddD5");
            B1 = SETTING_BASE.getDeclaredField("m$$QzyO75BWAHSyMpKH6o7M5DpYvhzz6EIFlyvNoxPBj1nFx2ShOGUecYvOWZjPNmLYde5ZzjmORxDuEj2OkaAUMxUHQnzDWXBVC");
            B2 = SETTING_BASE.getDeclaredField("m$$mnZejGOgCQYU2UIr4G6zPn0WzKvUzmyvVEY33Zan33t8dwg5r63MqjTB3q8GgNLbNWtL0Mh0CRAgyXiNYIy3BaHF3R6LysHr4");
            B3 = SETTING_BASE.getDeclaredField("m$$Acb9DDGp8gFXR1M59PbDsxkwOawJjPp3MoP1sL3EuyeLZ4m0Xcv82AuflY0qNm1HJwoHwJdjbTiy7ykdOfol8Z6A0LdGHcYw5");
            B4 = SETTING_BASE.getDeclaredField("m$$Acb9DDGp8gFXR1M59PbDsxkwOawJjPp3MoP1sL3EuyeLZ4m0Xcv82AuflY0qNm1HJwoHwJdjbTiy7ykdOfol8Z6A0LdGHcYw5");
            B5 = SETTING_BASE.getDeclaredField("m$$t7mZbcePeohYJO1LNWJPcGR0lHp6FltYaOu3iv5uMlUX60J7qfaOcvjQjr62okw7AoViZ5S0i8RFjWrQm3N6tolrq02uXkAC8");
            B6 = SETTING_BASE.getDeclaredField("m$$UKyfoCPadqRSMOhOjp5UyeDaZkSPWbc7C4pxfUgnJRcqEjG5PdOdWcfHMu1DersCrtZK9WSKjwpwXCiHRLbhTe06WrBEG4csd");
            _TI = SETTING_BASE.getDeclaredField("m$$hJejIIy30k9dvIqbtuR8qxsPXMM81zRi5PA6PBN1VI2tX7958oQjdWKfKZrxhCLDaQ8jO9PbTsDXXB5GsJgtLl2gKbBCnfwLF");
            _PREDICATE = SETTING_BASE.getDeclaredMethod("m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8", new Class[]{SETTING_BASE.arrayType()});
            _PREDICATE_1 = SETTING_BASE.getDeclaredMethod("m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW", Predicate.class, Integer.TYPE);
            O1 = SETTING_BASE.getDeclaredField("m$$UD7ROvfds8eSLXTG6vFB5dMAk03jHsUBu1KaB53SssE88CDOeckX81eRT6PjPm2YrQ9SGBl2MktJN9NQCcSyIDqosm1lM6S7x");
            O2 = SETTING_BASE.getDeclaredField("m$$2IKqjxM5CCie1feTOyNzeD5vWgFFfvJQ7T4SMJyImuhiOyHyEyeD36Lvf9fAz6LUqaIZCIjmQqDutGRG8Qj9ZrxNuC8B5LQFl");
            O3 = SETTING_BASE.getDeclaredField("m$$dCZTfMRVfeYPXsQeXSgP82nfd4ik2eYhWMntsOvAPNzaKYWGiQ9Sqmfu4Y8s7YKzCxysFYeRLCLO0gQ6XwtJw62fTTTmt4ofQ");
            O4 = SETTING_BASE.getDeclaredField("m$$QWM5eF0K89PZVITccKq4B66vP2O9MptQwgh4OU62RUj6Y59uC3GGu7BNvNcQp3u89S0IBu0FJozIlm4pqgtBTVfAKFnTg5mnF");
            O5 = SETTING_BASE.getDeclaredField("m$$imIrh6eW4tGxtkMZGLEtSalH1H0P64VQc2l8GR9G3f854a1jkvYqEMV1zVkLHM08qzoqihcP4n55y5jaFxd8VgsmdF2SzZMQO");
            O6 = SETTING_BASE.getDeclaredField("m$$CuxPDbeLNAusVP7lqYtDMb84xFpfVpDCqKX0mYwKMg4JWoQwSF3fWsPlLY5qC1a61Q0bLiZTxRe5vHWbKsnSLINXdBbSPlgad");
            ENUM_SERIALIZER = Class.forName("me.mioclient.m$$Ls9RIwOD9TTRE3MpdbVXPuFDiWW4Q5x12iHpULh2HCc954cwwVX4QUml5gWiofVItBVvqzIkoRcnRd1OS8i0ZOKrSvkjd2WJR").getDeclaredField("m$$cr1cUwlXRwlij0FDPBwDumNZtQe5dZUYMwStzZlYNBu9dRJEQrtYU22mu3knmGhhSAobASlR6ckvjozWrz8lteaYivYVxYUry");
            COLOR_SERIALIZER = Class.forName("me.mioclient.m$$CJMBtkzetTALNFlOt42e4JEAl3OddaiftiuchJen5PkaOjV01NuV6QgHJa9S0NJleFdab3OrAOeanaqvXjpq4L2rr13aJDSVm").getDeclaredField("m$$IIZdnPWN4OUIzHUCS7SVLSgvpwboCyz161a2ICRwBI0V7TIFlu3BALprZ8VlzUH1pDnvoOtajj7XGQgVOSeIlUSoTFv8MFQqt");
            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            UNSAFE = (Unsafe)f.get(null);
        } catch (Throwable _t) {
            throw new RuntimeException(_t);
        }
        SettingBuilder.read();
        List<Setting> settings = SETTINGS.get("me/mioclient/m$$qwqWzyCszuRg2E95uXVMRo5uOT52nW9izE922Hv3zqQJ8rd9MT28W4Os2lAog1zlGfmrhT8VOP3DrzSMAnwIBylr5iOdsLbLc");
        Setting s = new Setting();
        s.field = "m$$WF6H8u1DNyQghkdcxFXY5FM9IOiGtsJqLrRMIKwDvWd2C42iDgWuBv8YP6ZVD5tfYeNZPvki8jgyZ6Duos9RsNqTCPApQGAqf";
        s._name = "Snow";
        s._name_1 = "Snow";
        s.name = "Snow";
        s._klass = "me/mioclient/m$$fiYtL4wupaCq0ZXNpLGDIXeBpdaxQjEl11X8wPEtDFV8ma5LDmu3LQ8PEZAffyJ1gzjlPx6Dnyql3o5hu2w19Zk62m9SBHgus";
        s._desc_1 = "Snow";
        s._descriptor = "Snow";
        s.predicates = List.of();
        s.data = new Data();
        s.data.o1 = true;
        s.data.o2 = true;
        s.data.o3 = true;
        s.data.o6 = true;
        settings.add(s);
    }

    private static final class Setting {
        public Object instance;
        public Data data;
        public int tag;
        public long mod;
        public String name;
        public long id;
        public String field;
        public String _klass;
        public String _name;
        public String _descriptor;
        public String _name_1;
        public String _desc_1;
        public boolean b1;
        public boolean b2;
        public boolean b3;
        public boolean b4;
        public boolean b5;
        public boolean b6;
        public Object _ti;
        public List<PredicateInfo> predicates;

        private Setting() {
        }

        public static void set(Field field, Object inst, Object r) {
            UNSAFE.putObject(inst, UNSAFE.objectFieldOffset(field), r);
        }

        public void build(Object module) throws Throwable {
            if (this.instance != null) {
                return;
            }
            SettingBuilder.additional();
            List settings = (List)_SETTINGS.get(module);
            if (this.field != null) {
                Field f;
                try {
                    f = module.getClass().getDeclaredField(this.field);
                } catch (Throwable _t) {
                    f = module.getClass().getSuperclass().getDeclaredField(this.field);
                }
                f.setAccessible(true);
                Iterator<PredicateInfo> o = f.get(module);
                if (o != null) {
                    this.instance = o;
                    return;
                }
            }
            Object inst = this.instance = UNSAFE.allocateInstance(Class.forName(this._klass.replace('/', '.')));
            Setting.set(_NAME, inst, this._name);
            Setting.set(_DESCRIPTOR, inst, this._descriptor);
            Setting.set(_NAME_1, inst, this._name_1);
            Setting.set(_DESC_1, inst, this._desc_1);
            B1.set(inst, this.b1);
            B2.set(inst, this.b2);
            B3.set(inst, this.b3);
            B4.set(inst, this.b4);
            B5.set(inst, this.b5);
            B6.set(inst, this.b6);
            _TI.set(inst, this._ti);
            O1.set(inst, this.data.o1);
            O2.set(inst, this.data.o2);
            O3.set(inst, this.data.o3);
            O4.set(inst, this.data.o4);
            O5.set(inst, this.data.o5);
            O6.set(inst, this.data.o6);
            if (this.tag == 3) {
                Setting.set(ENUM_SERIALIZER, inst, ENUM_SERIALIZER.getType().getDeclaredConstructor(Class.class).newInstance(Class.forName(((EnumData)this.data).klass.replace('/', '.'))));
            } else if (this.tag == 1) {
                Setting.set(COLOR_SERIALIZER, inst, COLOR_SERIALIZER.getType().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            for (PredicateInfo info : this.predicates) {
                if (info instanceof ModulePredicate) {
                    ModulePredicate mp = (ModulePredicate)info;
                    _PREDICATE_1.invoke(inst, (Predicate)Class.forName(mp.klass.replace('/', '.')).getDeclaredConstructor(module.getClass()).newInstance(module), 0);
                    continue;
                }
                if (info instanceof SettingPredicate) {
                    SettingPredicate sp = (SettingPredicate)info;
                    Object[] arr = (Object[])Array.newInstance(SETTING_BASE, sp.keys.length);
                    for (long l : sp.keys) {
                        Setting _s = REGISTRY.get(l);
                        _s.build(module);
                        arr[i] = _s.instance;
                    }
                    _PREDICATE.invoke(inst, new Object[]{arr});
                    continue;
                }
                throw new RuntimeException();
            }
            Data data = this.data;
            if (data instanceof NumberData) {
                NumberData nd = (NumberData)data;
                _SUFFIX.set(inst, nd.suffix);
            } else {
                data = this.data;
                if (data instanceof ColorData) {
                    ColorData cd = (ColorData)data;
                    _C_B1.set(inst, cd.b1);
                    _C_B2.set(inst, cd.b2);
                } else {
                    data = this.data;
                    if (data instanceof RegistryData) {
                        RegistryData rd = (RegistryData)data;
                        Setting.set(_REGISTRY, inst, rd.registry);
                    }
                }
            }
            if (this.field != null) {
                Field f = module.getClass().getDeclaredField(this.field);
                f.setAccessible(true);
                f.set(module, inst);
                settings.add(this.instance);
            }
        }

        public String toString() {
            return this.field;
        }
    }

    private static final class NumberData
    extends Data {
        public String suffix;

        private NumberData() {
        }
    }

    private static class Data {
        public Object o1;
        public Object o2;
        public Object o3;
        public Object o4;
        public Object o5;
        public Object o6;

        Data() {
        }
    }

    private static final class ColorData
    extends Data {
        public boolean b1;
        public boolean b2;

        private ColorData() {
        }
    }

    public static final class EnumData
    extends Data {
        public String klass;
        public String t1;
        public String t2;
        public String t3;
        public String t4;
    }

    private static final class RegistryData
    extends Data {
        public class_2378<?> registry;

        private RegistryData() {
        }
    }

    private static class PredicateInfo {
        private PredicateInfo() {
        }
    }

    private static final class SettingPredicate
    extends PredicateInfo {
        public long[] keys;

        private SettingPredicate() {
        }
    }

    private static final class ModulePredicate
    extends PredicateInfo {
        public String klass;

        private ModulePredicate() {
        }
    }
}

