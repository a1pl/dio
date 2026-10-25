package me.mioclient;

import net.minecraft.class_151;

public interface m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN {
    static {
        E = new Object[8];
        F = new String[8];
        m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.a();
    }

    public static class_151 f(class_151 class_1512) {
        return class_1512;
    }

    public static void a() {
        Object[] objectArray = E;
        E[0] = "3\\N)wT=U\t!pOpTD`p|1v\u0007|yU\u0018w\u0003\u0013*\u000f0v4\u0016yJ.c\u0017\f.\u000bm}:\u0006j}\u0013}\u0012\u0005|\r1\u000b\u00023zJ\u001ar\u000e+XU\u000ep\u0015\nXo6W3%rP\u0011p\u0001qS\u000e\tT\u0013\u0006F\u00039C\"\u0012&H\u000eL\u0017\u0014ys4|Q\rsCnmW\u0003P";
        objectArray[1] = Boolean.TYPE;
        m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.F[1] = "java/lang/Boolean";
        objectArray[2] = Void.TYPE;
        m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.F[2] = "java/lang/Void";
        objectArray[3] = "\",~!x7)#on\u00199\"(k4";
        objectArray[4] = "<#\u00157Td,oQS\bw*vE7\t\u0016hfAh\u001d}7$S.d";
        objectArray[5] = "\u0012D+9\u0005\u0005\u0002\bo]T\f#\u001f~2Q\u001a\u0013x(`_\t\u0015\u0004)$\u000e\u0010\u007f";
        objectArray[6] = "(\u00023LR\u00118Nw(\u000f\u0005,TmEbZ<P2Q\t\u0005~Bt(";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "QOaI04A\u0003%-ej\u0010\u0014\u001b`r\rl2$m:\u0005v\u0014\u000bvG?Y\u0003*Q<\u0007N\u001e\u0003hL\nU#\u0007NE9s3bKc#l>6s^y\u0006:=Q{\u001aq\u0019\u0019\u007f_'\u00071\u0003Ic\u0000e\u000f4mF\u0014\u0002(#S;;Q\u001a\u0016\u001cA\"\rI8A~\u0004[=g\u0010<6\\,[\u0014y(\u0007\n0K;:As";
    }

    public void enable();

    public void disable();

    default public void m$$oHEzCXIwH2KBoXSOqmxyt4IzePMDDaXTkMwGH1nkmXEeVV72AntsTEbJZWi3JPlkNQtgHNZ6Spv3ueaE9Il92kdvJoF454xhW() {
        block3: {
            block2: {
                try {
                    if (!this.isToggled()) break block2;
                    this.disable();
                    break block3;
                } catch (class_151 class_1512) {
                    throw m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.f(class_1512);
                }
            }
            this.enable();
        }
    }

    default public void m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(boolean bl) {
        try {
            if (this.isToggled() != bl) {
                this.m$$oHEzCXIwH2KBoXSOqmxyt4IzePMDDaXTkMwGH1nkmXEeVV72AntsTEbJZWi3JPlkNQtgHNZ6Spv3ueaE9Il92kdvJoF454xhW();
            }
        } catch (class_151 class_1512) {
            throw m$$nGoOg8gnFNcW44nOTRgqpZwH003DZBtFMDrAb6o2bwdqDKnoFnPIuNFThnSalkOIa5M5WmsBX8gzBV8sPuwPgHjE1Imx0T7GN.f(class_1512);
        }
    }

    public boolean isToggled();
}

