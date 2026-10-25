package me.mioclient;

import io.netty.channel.ChannelHandlerContext;
import java.io.DataInputStream;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.util.List;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8;
import me.mioclient.m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS;
import me.mioclient.m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS$m$;
import me.mioclient.m$$NZHRg5d0rm56HQtulA07c8vvktPmjN8V7EmSIQZ8CSFc7WrC7lPiS83oh6HzAT7g2I23bIuPHm975NKgqHKIFrLoaKzUwvSms;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm;
import me.mioclient.m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr;
import net.minecraft.class_151;

/*
 * Uses jvm11+ dynamic constants - pseudocode provided - see https://www.benf.org/other/cfr/dynamic-constants.html
 */
public class m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig
implements m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS {
    public String username;
    public String m$$J9D4TqnFiml8HyBRc6s3OsS2VRbx3r9TVIkHLvy6c7cXdv1Qhdcpl43sfEvKwYdXD0JV6ekWAF0Tl50fpknbiOqPNP9Ddp9gj;
    public int m$$QBsEoWaqzElltTD8Cx75GrI9PX1APsUomFw9DJF0raqpYnjvCyLbdHMirnBLv3GR62IuPo0wmLee9bs6AnpVMweaP6AYmiuOn;
    public int m$$pPemcSBT6laakuliCvefPE4g0Yj8VrQeG9DCXXTWYiFUH2ysTQaYHWXI0TUpjb0fnyJBhIF4vy63I4Qx5GgrYpQ7lU2p3UOGu;
    public int m$$dq933EWOCAbl6aWfnTuk5qKRsFs2i3Bn3otrKqUnulX9mSysVz65mIIDJx0R3j27ytQpuqe6Ahe6CKZS91w5IftDG3uxqhdJz;

    public m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig() {
    }

    public m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig(String string, int n, int n2, int n3) {
        this.m$$J9D4TqnFiml8HyBRc6s3OsS2VRbx3r9TVIkHLvy6c7cXdv1Qhdcpl43sfEvKwYdXD0JV6ekWAF0Tl50fpknbiOqPNP9Ddp9gj = string;
        this.m$$QBsEoWaqzElltTD8Cx75GrI9PX1APsUomFw9DJF0raqpYnjvCyLbdHMirnBLv3GR62IuPo0wmLee9bs6AnpVMweaP6AYmiuOn = n;
        this.m$$pPemcSBT6laakuliCvefPE4g0Yj8VrQeG9DCXXTWYiFUH2ysTQaYHWXI0TUpjb0fnyJBhIF4vy63I4Qx5GgrYpQ7lU2p3UOGu = n2;
        this.m$$dq933EWOCAbl6aWfnTuk5qKRsFs2i3Bn3otrKqUnulX9mSysVz65mIIDJx0R3j27ytQpuqe6Ahe6CKZS91w5IftDG3uxqhdJz = n3;
    }

    public m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig(String string, String string2, int n, int n2, int n3) {
        this(string2, n, n2, n3);
        this.username = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(ChannelHandlerContext channelHandlerContext) {
        block5: {
            try {
                m$$NZHRg5d0rm56HQtulA07c8vvktPmjN8V7EmSIQZ8CSFc7WrC7lPiS83oh6HzAT7g2I23bIuPHm975NKgqHKIFrLoaKzUwvSms m$$NZHRg5d0rm56HQtulA07c8vvktPmjN8V7EmSIQZ8CSFc7WrC7lPiS83oh6HzAT7g2I23bIuPHm975NKgqHKIFrLoaKzUwvSms = new m$$NZHRg5d0rm56HQtulA07c8vvktPmjN8V7EmSIQZ8CSFc7WrC7lPiS83oh6HzAT7g2I23bIuPHm975NKgqHKIFrLoaKzUwvSms(this.username, this.m$$J9D4TqnFiml8HyBRc6s3OsS2VRbx3r9TVIkHLvy6c7cXdv1Qhdcpl43sfEvKwYdXD0JV6ekWAF0Tl50fpknbiOqPNP9Ddp9gj, this.m$$QBsEoWaqzElltTD8Cx75GrI9PX1APsUomFw9DJF0raqpYnjvCyLbdHMirnBLv3GR62IuPo0wmLee9bs6AnpVMweaP6AYmiuOn, this.m$$pPemcSBT6laakuliCvefPE4g0Yj8VrQeG9DCXXTWYiFUH2ysTQaYHWXI0TUpjb0fnyJBhIF4vy63I4Qx5GgrYpQ7lU2p3UOGu, this.m$$dq933EWOCAbl6aWfnTuk5qKRsFs2i3Bn3otrKqUnulX9mSysVz65mIIDJx0R3j27ytQpuqe6Ahe6CKZS91w5IftDG3uxqhdJz);
                m$$NZHRg5d0rm56HQtulA07c8vvktPmjN8V7EmSIQZ8CSFc7WrC7lPiS83oh6HzAT7g2I23bIuPHm975NKgqHKIFrLoaKzUwvSms.reset(-857537868);
                m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8 m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8 = new m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8(m$$NZHRg5d0rm56HQtulA07c8vvktPmjN8V7EmSIQZ8CSFc7WrC7lPiS83oh6HzAT7g2I23bIuPHm975NKgqHKIFrLoaKzUwvSms);
                m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8);
                if (m$$A0LKal7zWjQEm7QEhY13c8IZPg8BIRxDaJbRwvtzKNOzY1Zdyzjrov9clN9YEX2jDPXIz4HcTSu1Ea6ZvOJgLtijbFiI8TkF8.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) break block5;
                List list = m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM.m$$6cV2y53kPo3T5CqmjGzW4ub8hWhJgTaoJ2lmQ30r5ABPHEjBUskzoXuCEXNopqxQlSqzeycUxpUemo9OPFOt8t2v4nzhiIcds(-228630002);
                synchronized (list) {
                    m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$m5Dix4XlWuR80x1BSbQAX1J58UDglFJ7IQtxnM8eKeJZeqcP0jEay5kmVh1w06IxS6tOZdry8Tm2IkGuA7FQsMACWOJ16wzrM.m$$6cV2y53kPo3T5CqmjGzW4ub8hWhJgTaoJ2lmQ30r5ABPHEjBUskzoXuCEXNopqxQlSqzeycUxpUemo9OPFOt8t2v4nzhiIcds(-228630002).add(m$$NZHRg5d0rm56HQtulA07c8vvktPmjN8V7EmSIQZ8CSFc7WrC7lPiS83oh6HzAT7g2I23bIuPHm975NKgqHKIFrLoaKzUwvSms);
                }
            } catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(byte[] byArray, int n) {
        DataInputStream dataInputStream = this.m$$VNUxFdmTkySgC55SUm8AuE43GkoYdtoEdVCYZ8rZWUZMa5Mi3mcSOtw0aV4xhExsIlyZfemYIoxfdc4tghJwIOe7MEV6NfTGW(byArray);
        m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig = new m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig(dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt());
        return m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig;
    }

    @Override
    public byte[] m$$hMTBTUjMqExxvG5onCLFCGdCJAEZnuiCgBOlbCY7Hj7Pq4xgpywXm76h4tTUpcnqt5P775xvu3X5CCEZ7o5riE6AWY4V8FmUJ() {
        String string;
        m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS$m$.zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82;
        m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS$m$.zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8 zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F83 = this.m$$cHoCIJVyvve7jcDPES24ZHNm1Cu9gAMfHI6fHqyrnzgAxyh0Z1tDFI5M5AS4oa0JXzZUyDiwkf86Lzq7mfz6Ky0GC9eaNVsFO();
        try {
            zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82 = zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F83;
            string = this.username == null ? "" : this.username;
        } catch (class_151 class_1512) {
            throw m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.a(class_1512);
        }
        zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F82.writeUTF(string);
        zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F83.writeUTF(this.m$$J9D4TqnFiml8HyBRc6s3OsS2VRbx3r9TVIkHLvy6c7cXdv1Qhdcpl43sfEvKwYdXD0JV6ekWAF0Tl50fpknbiOqPNP9Ddp9gj);
        zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F83.writeInt(this.m$$QBsEoWaqzElltTD8Cx75GrI9PX1APsUomFw9DJF0raqpYnjvCyLbdHMirnBLv3GR62IuPo0wmLee9bs6AnpVMweaP6AYmiuOn);
        zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F83.writeInt(this.m$$pPemcSBT6laakuliCvefPE4g0Yj8VrQeG9DCXXTWYiFUH2ysTQaYHWXI0TUpjb0fnyJBhIF4vy63I4Qx5GgrYpQ7lU2p3UOGu);
        zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F83.writeInt(this.m$$dq933EWOCAbl6aWfnTuk5qKRsFs2i3Bn3otrKqUnulX9mSysVz65mIIDJx0R3j27ytQpuqe6Ahe6CKZS91w5IftDG3uxqhdJz);
        return zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F83.m$$1Buj1OSvBZHv8Ql13dg32ayI8tlXylIbPBNBYQ39GJGbN7zIF0cXahEJZUKUvEMUbfb3Jbi8mLELbRmtsV5C4YybfScBaWGK7();
    }

    @Override
    public short m$$Q75n5RmileGubHNqHGkJbYJ4Ow77tcQUkQSnSDzxJKuW6aW10e6T4w5Fd51GppdbFva1PrakU08a1M2eeKksAAVw5xT7meZ1z() {
        return 6;
    }

    @Override
    public /* synthetic */ m$$Fu58t8WTdTmvaYFdgIS3HaBALq1mYDUb3EpS1Ab82yFINGKxjW815Ga0CTpYIGEwwSBNybUlwsPuW15Wi1tWF5rvhkuroZTbS m$$U07Rr2ofjRcmUA6QhPzXslXNOFufwtMiGJG8TZchIFZaWxl3hMhO2YZrsAsNAVIaRCanwYWuiNYgWd6uEu76NduHoJDwCl2Hk(byte[] byArray) {
        return this.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(byArray, 1706265693);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                block10: {
                    block9: {
                        m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.e = new Object[33];
                        m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.f = new String[33];
                        m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.b();
                        var8 = 1506539663743300639L;
                        var14_1 = new long[23];
                        var11_2 = 0;
                        var12_3 =  /* dynamic constant */ (String)m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ("dSwyvmq6tGMHgpcvPjd6", MethodHandles.lookup(), "m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ", m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.class, 0x23232EE);
                        var13_4 = var12_3.length();
                        var10_5 = 0;
                        while (true) {
                            var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes( /* dynamic constant */ (String)m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ("ONKz2h3aWWUoSu0Dp1Ck", MethodHandles.lookup(), "m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ", m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.class, 2142258421));
                            v0 = var14_1;
                            v1 = var11_2++;
                            v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                            v3 = -1;
                            break block9;
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            var12_3 =  /* dynamic constant */ (String)m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ("xZT9PkiE9HHF8daqy0H6", MethodHandles.lookup(), "m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ", m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.class, 2094481721);
                            var13_4 = var12_3.length();
                            var10_5 = 0;
                            while (true) {
                                var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes( /* dynamic constant */ (String)m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ("XaeZ4lW5AYUhO6oKLWdk", MethodHandles.lookup(), "m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ", m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.class, 1104234645));
                                v0 = var14_1;
                                v1 = var11_2++;
                                v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                                v3 = 0;
                                break block9;
                                break;
                            }
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            break block10;
                            break;
                        }
                    }
                    v4 = v2 ^ var8;
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl41:
                        // 1 sources

                        ** continue;
                    }
                }
                m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.a = var14_1;
                m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.b = new Integer[23];
                m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = 124014;
                var0_7 = 6975400412123799633L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 =  /* dynamic constant */ (String)m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ("ev2a3AohfmfYldRZjteC", MethodHandles.lookup(), "m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ", m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.class, 2079707293);
                var5_11 = var4_10.length();
                var2_12 = 0;
                while (true) {
                    break block11;
                    break;
                }
lbl54:
                // 1 sources

                while (true) {
                    var6_8[v5] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block12;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes( /* dynamic constant */ (String)m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ("rSCpC4vl9GoJnjua479Q", MethodHandles.lookup(), "m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ", m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.class, 168506941));
            v5 = var3_9++;
            ** while (true)
        }
        m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.c = var6_8;
        m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.d = new Long[3];
        m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 = m$$aQUrnHgQ4P5mUnhhYgwrErEZIvH9DLiW0RrUi3vK6zfV3JP2Be4S0ZHFoW3EkLUIdgAARup6WhiNqsROa2btmTe8xq4qh4qHm.V9y8y0zJiI5B9Ooztn5kcBFNarFH2rOqtmLoVH0m1k7bU325LsgtHLd7cejQZhhWJ9oIcO4zq8cCsZKNdBkYCTZ1olOZuDzr0j3Z((long)5816154896815984599L);
    }

    public static class_151 a(class_151 class_1512) {
        return class_1512;
    }

    public static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4DD3;
        if (b[n2] == null) {
            m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.b[n2] = (int)(a[n2] ^ l);
        }
        return b[n2];
    }

    public static long b(int n, long l) {
        int n2 = (n ^ (int)l ^ 0x15A0) & Short.MAX_VALUE;
        if (d[n2] == null) {
            m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.d[n2] = c[n2] ^ l;
        }
        return d[n2];
    }

    public static void b() {
        Object[] objectArray = e;
        e[0] = "\u000eK\u000bF\u0004Y\u0000BLN\u0003BMC\u0001\u000f\fg6\\Kc\ngW~\u0010F8X\u000bF|L\u001aD&\\`q$@+\u0017ag\u0004aS|W~\u0004\u0005\u0015e\u0013Q\u000b`Pdu\u0019/SW}\u0015q%p\fy\u0016n\u0006z6gAL,w1[U\u001d:^\n`TX?y\u0002\u001cG_\u0000b\u0006\u0016]ZYG\u000b\u001aTc\u0000";
        objectArray[1] = Long.TYPE;
        m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.f[1] = "java/lang/Long";
        objectArray[2] = Integer.TYPE;
        m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.f[2] = "java/lang/Integer";
        objectArray[3] = "\\?#q~ZR6dyyA\u001f7)8#e\u00041W^%F\u00008Zk\\EI6oZ{\u0005G-ee/\fH-g~&Q|\u000b<kr\u0006|\u00034Lsae<bk\\Sb>UFoFsh`) |\t7\\ourT\f4/g`g?f_YlT2h/\u007fc[\u001dtuNeAjDup";
        objectArray[4] = "\u000e\u0007";
        objectArray[5] = "R\u0002e*JL\\\u000b\"\"MW\u0011\nocNov\u0013\u001d.\u0017o\\=\u001c\u0001\u0016nf)\u007f-\u0015Bz\u0010\bwd\u0014w,<\u0013vU]\r)~ko^\u0006\u007f?UIk*r1tti\u0001\bqmPZ/;&jFz#\u0007\u0011\u0013W\u00060\u0011\u0014S\u001bf%\u001a5n\u0010\u0007\u0015\u0005\bbuK\u0011\u0003\u0003\u0011j}\u0012\"\u0003{";
        objectArray[6] = Boolean.TYPE;
        m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.f[6] = "java/lang/Boolean";
        objectArray[7] = "\u0003O\u001ccb\u0004\rF[ke\u001f@G\u0016*3 [oddZ:<lSjd8:\u0018\u0000\\H\u0013^DeYJ)\u0004P\nL|\u001b!Xf{i\u00129e\u00059B%\u0006\u001e\u0002Z[&\u0001a\u007f6QZ\u001bpHmjRV\u001epWd9VD\\CsZ\u0019G\\];)\u0016zJXc1*\u0018@fa>!E\u0005Ah";
        objectArray[8] = ";c0\tOj%k*F-v\"v";
        objectArray[9] = "\u001eT|D^X\u0010];LYC]\\v\r\u0006@\nz\u0015qxg\u0012]\u0004q\u0001Z5y\u0006eq\u000f\u0007i\u0002D@REU?o\u0000x)b7oXs']#\\}\u0004*W lrf\u0005\u0005\u001beQaDC\u0004kcg\u001cd\u0004pRV\u0017d\u001d`Q\u0000\u0015\u0005\u0007PX\u0001+t?]g\u000f#a\n\u0011{\u0000\u0018\u0006\u0011P\u007f";
        objectArray[10] = "l\n/:QQg\u0005>u0_l\u000e:/";
        objectArray[11] = "\u0007nWv76\tg\u0010~0-Df]?\u0010\u0003\"Y\u001e.:i\u0018fL-\u0016\b\u001e~\u0015Znn\t3\u000fm5-:f\u0013Uf\u000f]N\u0014H\u0017\b03:H\u0018:]\\\u000bXi5:b*#m6\u0002=1a\u001f\r]lKRlj\bB\fK\u00164S<LU\u0015>\u001bC2R\u0018+&d\u0018P$\f\u001d}*v-";
        objectArray[12] = Void.TYPE;
        m$$4P5kZB2s1bWwKpxlbFl0vwhy89ywjb1dMQ1we3MY9PdTTfowKfSdXZxsB2m57I8mQsbGeV93pUVekCNYehe3hVjGyiYPp0Iig.f[12] = "java/lang/Void";
        objectArray[13] = ";0L%DR>\u007f~%\u001eZ\u0018?J1\u001eh%#_%\u0007";
        objectArray[14] = "\u0012)i:>A\u001c .29ZQ!cs\u0011[Jt3o\u0000z\u001b\u0018*!6w9( \u001e\u0004\u001d7-\u0005\u0016\u001b_N!\u001e\u0013\u0002LL\t7\u0004fo\u001dtu.\u0011g1\u000b\f/=yG}r\u00106\u001e<\u00187\u000e\u001ei:;0\u0004\u0015`\u0006.\u0012; ]/9\u0010fby\u0016}3\u0000\u0011\u001b\r:/<\"\\\u0010\u0016\u00135\u0004";
        objectArray[15] = "W\u0013";
        objectArray[16] = "S.IY=_X!X\u0016@GK&Q_";
        objectArray[17] = "\u0007:,R\u001aH\t3kZ\u001dSD2&\u001b5R_gv\u0007$s\u000e\u000boI\u0012~,;ev \u0014\">@~?V[2[{&EY\u001arlBf\bg0F5n$\u0018IG\u0019pRn7x\u0012\u0017)\u000brf:`/(ul1i\u0013=WS\u0004T:*U\u000eFp\u0003nvh5\u0012\u0018)jT\u0006U\u0005\u0005V] \u0003\u0007{&E\u0006^\r\u001aZ\f!^-+1i\u001fV=l:Q\u001bJ\u001dgV|\u0004F\u001bn@Z\u001ah\u0013\u0013C\f\u0019\u00112\u001e`I+n\u0005:A\f=\u00152gujKK\u000e9[LCM\\5uXAs\u0000-c\f?\u007f\u000fhuj)k/\u001acE\u0002T\\1A\u000f+\u001f=fD\u0007";
        objectArray[18] = "\u0017\u000b";
        objectArray[19] = "WED\u00010\u001e]\u001d\u0011\u001a_\u0010A\fx\u0007\u0015/\u0000Lq\u00040O\u0013rl\u0010=\nUGu'\u000e\t(QV(\u00029*pCF`\u0016\u0010jA\u0000#\u0014\u000b\u0010Q\u0007n-,r\u0014F/\t\u000f~p$977}`D'\u0017\\x[#=\u001e*\\o\u001ddN.zu10\u0005R\u001cuKa<T`L6\u00197WOoz4\u0016SL\u0014\u001c>\u0012\u001fK*C&\u0011R]\u001b\u00012K\t \u0010\u001f1\u000e\u0002K\u001aGd\u0015m";
        objectArray[20] = "]J\u0006>;\u0013\u0014\f_xP\u0010\u0001\u0018Q\u00076\u0016lHD\"o\u0017]\nPx4j";
        objectArray[21] = "<t\u001a\u0014h,v`ML\u0006/+\"5:8:{R2OA(Kp97<:k~\u0019H:pIB\u001c;Z\tz\u007f\u0015\u001aivg_\u0016\u0014T+yu)\u0004V3F\u007f\n4a{\\5.\u001bi79>72j\bcBOOK\u0018~2,\u001eF&EK+\tj\u0001\\gM\u0019IrIe\t0t\u0016Bn/t:,ew\u0016Egu`gs";
        objectArray[22] = "EbUJk;T&QL\u00059\u0002r\u0007xx>\u0017\u0019eLO\u000en \u000ekae\u00152Q\t?5_\u001f\u000eNa\f_:\u007fX]\u0016h\u0014ok>ma\u001cqXCc\\\u001fp\nn\fG>spW\u0001m\u0003@\u007f@\u0001D0T\tG6On[vH\u0018D\u0004[N~\u0002\u0013\u0015\u0002ct6@\u0005Uxl\u0003a\u001d\u00012n?\u00102\u0000Td;\\5>";
        objectArray[23] = "l\u001cu 3|h\u0019%(\u0002g)\r!\u0007eIDc\u00146||h\u001e(,NZHzp{PBCDs\f\u007f3jh\u000f)BC;O\n>sxcS%\u000erse\u0019\u0018~~NK`w\u0002?K^\u001d-.:@US\u0018\u001asNd^))2<AS3xglw\u001f\t6:MN\u0010'.D\\~o\rGi>nY$ xzj_J";
        objectArray[24] = "e\u0000zm+E;\u0017;.\u0011Ru^=\u007fO\r(O8wIPb.>_hR;=qK-J3BcKqu6.jsS\r=\u0017Z/)Md;ILQz;8^orE>\"~_\\g\u001f\u0015{man=)zf|F2/slLZ<\u00152SIy\u001e\u000e3h+Ie\u0014qtpv2\u001ex\u0014(N=M~%jZg\u0016\u0003)oK4\u000ecj|Y`r";
        objectArray[25] = "\b\u0015Z^:E\\OZb^\t\u0017B\u0016Zrz\u00073Z(1\u007f\u0001\u0000\u001b\u0004=[\r8)$iB(2]\u0018GA\u001a\u0017#\u0005^x^\u0017^\u0001?R;I]_DC\t\u000e'&l\u0007\r\u001f\u0005;RX\u0006-%Sgy\r5[\u0010y\b\r9\u001c0C~\n8\u00043Kd4K\u0000\u0006Gj\u001b>\u0015\u00188Z] g[1U\f\u0017\u0018\u001ajZ\u001fr^\u001bd\u0007\u001bC\u001c\u000f>\\f";
        objectArray[26] = "u\u001c\\MY>q\u0019\fEh%0\r=l50RM\u0006v\u000b1GN(\u0017U\u001bADSc\u0015\r \u001a,I\u000f\u0011p]\u0004g\u0004\u001eWp1\u001a\u0012\u0012C|1o\u0001}Y@XO\u0003\u001b[]\u001c\u0012\u0001\u001e Q\u0003g\u0018;]E\u0012x\u0006-yp\"M\u0018.pJ_V\u0007 ^^\"m\u0005\u007fYl=\u0014..@n<*\u0003#\"M]L\t'nJc\u001bS{dJ\u001aR\u0015\"\"!";
        objectArray[27] = "E\bAoU,TLEi;4TUVzz-R4\u0013n_tS\u0005Qz\u0005/.\u0004Pf\u0004wE[Qu_K";
        objectArray[28] = "4QxK\u001d`%\u0015|Msx%\fo^.[\u0011myK\u000ewb\u0017yX\u0011~_]iBL;4\u0002hQ\u0017\u0007";
        objectArray[29] = "0*e[\u0001^w/cUnV\"|\bX$ic<\u0001[\u0001\tp\u0002\u001cO\fL67\u0005x?OK!&w3\u007fI\u00003\u0019QPs\u001a1_\u0012Rh`!X_kO\u0002d\u0019\u001eOl\u000e\u0000{\bqT\r\u0010\u001b\u0016Q?\b+|\fXI,\u001fBU\bM\n\u0005n\u0001C1l\u0005\u0014Pz7\u0010<i(q4?\u001f%Q\neme_\u0014Rc.Z\u001aWX3o _\u000f^pP";
        objectArray[30] = "J\u0000^s\u007fH\t\u0013L'\u0003A\u001b\u0012\"!:CJAXdbE\t~\u001exaQ\u0012OC!dAw";
        objectArray[31] = "JhY\u0003\u001e7\u0003.\u0000Eu4\u0016:\u000e&)\u0000{9\u001a\u0006\u0005s\u00019\t\u0019\fN";
        Object[] objectArray2 = objectArray;
        objectArray[32] = "\u00165QV,K^kSU\u0013\u000bK\u007fC\u0010\u0013H_`\u0011\u0011\"\nK:Jl#\u000bW;\u0012\u0007|\nD`.";
    }

    public static String m$$jcTxTtTW0EItZLmPC1dBFRjMQMD8HYSL7XzG98G6zopCaNSGW622oY1MOigZkcvnzZWgPwutZX6qnFiZSNb4w4MJoZwfqSqtQ(MethodHandles.Lookup lookup, String string, Class clazz, int n) {
        try {
            byte[] byArray = (byte[])m$$c5dTOPIoKYHlg1kptMhOnLQynW6NLvDrpHtETrLNXPAjQ4hP6jxIbCphyVULsZGKECPuXYawZA6I9xGLVpuh4lH4oW7iwpOEr.m$$pTTKHpSuw5J3gbHYzQW8ZInMziIWQhcirMhd9LwUvq97vxPZzeU32NE8AgigeLpbjFlUWGMACm0tMpg4JbMWmhRBiwtt8HL94(n);
            byte[] byArray2 = new byte[]{108, 98, -126, -79, 64, 116, 20, -123, -96, 25, 17, -34, 112, -125, 66, -95};
            for (int i = 0; i < byArray.length; ++i) {
                byArray[i] = (byte)(byArray[i] ^ byArray2[i % 16]);
            }
            return new String(byArray, StandardCharsets.UTF_8);
        } catch (Throwable throwable) {
            return "";
        }
    }
}

