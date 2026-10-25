package me.mioclient;

import me.mioclient.m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4;
import net.minecraft.class_1309;
import net.minecraft.class_1799;

public interface m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ {
    static {
        a = new Object[10];
        b = new String[10];
        m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.a();
    }

    public static void a() {
        Object[] objectArray = a;
        a[0] = "qT>p\u0004]qT),\bRk\u001f)2\bGln{iP\r";
        objectArray[1] = "~\u001an~v{~\u001ay\"ztdQy<zac +c++";
        objectArray[2] = Integer.TYPE;
        m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b[2] = "java/lang/Integer";
        objectArray[3] = "E\u000eW'\rFK\u0007\u0010/\n]\u0006\u0006]n\fBO,H\r\\Kf:2,\\x_\u0012=|1yI*\u000f\u001b,PnS\r0.\\e;2,\u0010LN\b\u0011\u00013z{>\u001d)>qJ\u001e\r\u0019)]_\b\u0003'4\u007fM.\u001c'Q\u001dF[\r0\na\u001b\u0018>\u0010\u001d^R\b\u001e+QJ\u0011\"\u000f\b=_\u007f\u0006=9.";
        objectArray[4] = Long.TYPE;
        m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ.b[4] = "java/lang/Long";
        objectArray[5] = "\tRc2\f\u0007\u0002]r}q\u0012\u0010Gp>";
        objectArray[6] = "s\u007fRJ-ixpC\u0005Lgs{G_";
        objectArray[7] = "Yw\b(mM[0L\u00185]B+\u0011t\u0007\u000f\u000fpK\u0018i\u000bA/\u000bg+LSuv!\"LT \u001fb>\\ZK";
        objectArray[8] = "\u0001\u001e \\Fz@\u0001e\u0001{{Z\u001d5R\u0016b\u007f\u0013bA6wG\u001b\u007fR'\u007f^\u0017\u0019\u0006\u0014qG\u0019&_A%^z";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "\u0019\u0005\u001fc}\u001fKB\u000ec\u0011\r_\u0006\u00056w\u001a~\u001d\u001a6T\u0007F\u0018\u001e \u0011]M\u0013\u00038.\u0004\u0018G\u001a[";
    }

    default public float m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(class_1799 class_17992, class_1309 class_13092) {
        return (float)(System.currentTimeMillis() - this.mio$getLastEatingTime()) / ((float)class_17992.method_7935(class_13092) * 50.0f + 50.0f);
    }

    public long mio$getLastEatingTime();

    public float mio$getHealthFactor();

    public boolean mio$wasCrawling();

    public void mio$setRole(m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4 var1);

    public m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4 mio$getRole();

    public boolean mio$isNextToWall();

    public int mio$getLastAttackedTicksServer();

    public void mio$resetLastAttackedServer();
}

