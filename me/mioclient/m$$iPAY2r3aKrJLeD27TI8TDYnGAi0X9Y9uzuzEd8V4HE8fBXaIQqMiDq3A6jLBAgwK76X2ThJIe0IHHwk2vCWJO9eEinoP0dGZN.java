package me.mioclient;

import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_1102;
import net.minecraft.class_1113;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_3419;
import net.minecraft.class_4228;
import net.minecraft.class_4237;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN
extends class_1102 {
    public InputStream m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG;

    public m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(class_243 class_2432, InputStream inputStream) {
        super(class_2960.method_60655((String)(m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$N7Fuy59jlFJoEyUR5zFCDWMJx9PRCjnqpN1gaG8rYDZDTw1x7RtxzjXMa8GGy4p8yLZ2qzDtg0NWKT6zxXY2Dmx65cghVSHV8() ? "mioloader" : "mio"), (String)"sound"), class_3419.field_15250, class_1113.method_43221());
        this.field_5439 = class_2432.field_1352;
        this.field_5450 = class_2432.field_1351;
        this.field_5449 = class_2432.field_1350;
        this.m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG = inputStream;
    }

    public m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN(InputStream inputStream) {
        super(class_2960.method_60655((String)(m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$N7Fuy59jlFJoEyUR5zFCDWMJx9PRCjnqpN1gaG8rYDZDTw1x7RtxzjXMa8GGy4p8yLZ2qzDtg0NWKT6zxXY2Dmx65cghVSHV8() ? "mioloader" : "mio"), (String)"sound"), class_3419.field_15250, class_1113.method_43221());
        this.m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG = inputStream;
        this.field_18936 = true;
        this.field_5439 = 0.0;
        this.field_5450 = 0.0;
        this.field_5449 = -1.0;
    }

    /*
     * Exception decompiling
     */
    static {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: CONTINUE without a while class org.benf.cfr.reader.bytecode.analysis.parse.statement.AssignmentSimple
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getTargetStartBlock(GotoStatement.java:102)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getStructuredStatement(GotoStatement.java:116)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.getStructuredStatementPlaceHolder(Op03SimpleStatement.java:550)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:727)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:851)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:279)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:202)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:538)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:368)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:190)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:90)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static void a() {
        Object[] objectArray = e;
        e[0] = "=Bp\u0003)\u000e6MaLC\r\"Aj\u0007";
        objectArray[1] = Long.TYPE;
        m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.f[1] = "java/lang/Long";
        objectArray[2] = Double.TYPE;
        m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.f[2] = "java/lang/Double";
        objectArray[3] = "av\f%\u0016A\u007f~\u0016j[[et\u000f6JQecT\u0007WY{{\u001f0YVgr<1LAyr";
        objectArray[4] = "Jp~4\u001e\u0005A\u007fo{d\u0001R~\u007f4R\u0005E";
        objectArray[5] = "X\u001fV\n]\u0012S\u0010GE<\u001cX\u001bC\u001f";
        objectArray[6] = "Fx:s\u007f\u0011Hq}{x\n\u0005p0:w/~ozVq/\u001fM!sC\u0010CuMya\fnoQD_\bc$PR\u007f)\u001bOfK\u007fM]V\"dp(\u0018WD,T\u001b\u001fN$D^8DJ'[}2~TpyW?yhd(A\u0016BSemD1J/vj{*N%lo\"\u000fC)eV{";
        objectArray[7] = Integer.TYPE;
        m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.f[7] = "java/lang/Integer";
        objectArray[8] = "T(+XH5\u0011(a<Sh\f(P]Kt6 V[Je\u000e*\u001a\u0005\u000eoT.}\fElQG#_Gt[+w\fJuj";
        objectArray[9] = "/<n^{6ca{[\u0014\u0019\"|!H,5QlP\u0004^vTjcErzpf[wR.iCQ\u0003n\u0000jqt}s\u0019S5t\u0000wxyP*\u0003)\u0003hbmyP+,f|[M\u0015smN{% RfV\u0005f>#fZBF\u0004Ua[ZE\fO_(^p\u0000Ap]Kn\u007fq6C9-~s3x^$5p6\u0011\u0004}%r=t\\n~#\r";
        objectArray[10] = "[bc_$\u0002\u001a<!@^\u0012\bdyW22\u001cy`@3|Z>#FoC\u000f`lS^F\u0006{x@ \u0007X9g:";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "AD\f=8m\u0000\u001aN\"Bx\u001cF\n</o\u0016O<%>n\u0001Nrdx#\u0010[\u001f;zc\u0016#H?<v\u0001]\ta~i{";
    }

    public static long a(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x2C2B) & Short.MAX_VALUE;
        if (d[n2] == null) {
            m$$iPAY2r3aKrJLeD27TI8TDYnGAi0X9Y9uzuzEd8V4HE8fBXaIQqMiDq3A6jLBAgwK76X2ThJIe0IHHwk2vCWJO9eEinoP0dGZN.d[n2] = c[n2] ^ l;
        }
        return d[n2];
    }

    public static String m$$Nbrbol7dy7Buowo9xru9qy7AXULQLciuBT5EY3os1F9BtT18fNW05E3xdVOCXA1dXaY4rmpLpWguUygF3EVGfAP5eXMYL36yz(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{61, -126, -87, 58, 96, 56, 114, -125};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 8]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }

    public CompletableFuture getAudioStream(class_4237 class_42372, class_2960 class_29602, boolean bl) {
        try {
            return CompletableFuture.completedFuture(new class_4228(this.m$$RNsrWst7yAKMYKwpXYjjrYCF7BTC277WfK5cGU0p9qBzCp4ZE7ez02R6bq1lqp6vFKFlaek80XCHYdJ6DBOGMVriozri7vyQG));
        } catch (Exception exception) {
            return CompletableFuture.failedFuture(exception);
        }
    }
}

