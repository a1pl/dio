package me.mioclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.mojang.authlib.GameProfile;
import java.util.List;
import me.mioclient.m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb;
import me.mioclient.m$$0Vdcp8iLoj2fBQamH9Lk2iYsw1DemKaOQZ3Cgr5RFRYvAKVfkEprMNxQuoXPD2zYRRoA4mbEkBTWtt4Mpdx6av6o9z68Doyg7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8;
import me.mioclient.m$$4mV71x6TnDXp6oZYX54aoSNictrBDI242SullAd3twzyQU7YpzqCpbyYiEIZ6ULJjlaj8sd1F2jHeQqsBmV9gsu7MgM3UtgyL;
import me.mioclient.m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu;
import me.mioclient.m$$7dBQtMll6jPXZNNL0JKdy4p8eVbJZI7oOTeXRzLBqSEEEcap1JnngIGWGk1FEqPXsknugaL3HnAmbnnwAQwHFkcn4wsLUZFKH;
import me.mioclient.m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl;
import me.mioclient.m$$EXhOqVmfGEfzvnY5kFMpwUvR6UAiXmNm6OreroFRvSo3VcovtRobmkPnaamZaZSvIjBRdypvatHxMtyExbC4XlVb2eoNhvejC;
import me.mioclient.m$$Mf9n5D0hPRHoBhhOmaGXmnruuTn8sYZSX0NzU6ku5U2M6Hpr4qZRJSbXvTql6c8hzfuGbXJTjjICXICq6qnAaivTiqNNtJfKo;
import me.mioclient.m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82;
import me.mioclient.m$$Sa9EL6x1Z9Ql7bo36MeQFajuM94KyzDMfXUXVs4dWApHaRVWxAcRnYD1iRGv2o9XopoaJ0Ja6zJqvtysSRryk9tfO32Fqz1Cg;
import me.mioclient.m$$UKyfoCPadqRSMOhOjp5UyeDaZkSPWbc7C4pxfUgnJRcqEjG5PdOdWcfHMu1DersCrtZK9WSKjwpwXCiHRLbhTe06WrBEG4csd;
import me.mioclient.m$$c9jMbh1IiMTQCK9gtzGzmtRJWOHNyvtwv63vKB8VWyFFRbuOOxz3IzKGfz0bWCYpEFddpIzL6jSeJHHuWBLKPZQyHokMEeEqE;
import me.mioclient.m$$dCZTfMRVfeYPXsQeXSgP82nfd4ik2eYhWMntsOvAPNzaKYWGiQ9Sqmfu4Y8s7YKzCxysFYeRLCLO0gQ6XwtJw62fTTTmt4ofQ;
import me.mioclient.m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ;
import me.mioclient.m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4;
import me.mioclient.m$$uVIFkBgj8JoqhMxROywPx1r6LVZQKRc19yxBxNEqHA3Ps2EGBaj5ZlnsgvmZkKvPCpkSf7XRCRxqq4elhgeVa6Stb431yyTUN;
import me.mioclient.m$$xQ8jgx5howJKGmMwgMbM6XY1HDJnKjLumWj5cbrlxmQsb1iu27roC6c5V6l60cyfcejJAI13OkEqUwU9B2XRuHuFcczhTmBIi;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1656;
import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_265;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1657.class})
public abstract class m$$IdmPNGPYzocKrxl7NEZGAyTI52O49JPj6YU8mLBjmECVkiw8EP7PIFNrEDm8DArZyBQLZgQFtBqoJ4W25T2LTvQLb4y9a4WXX
extends class_1309
implements m$$hkgG1G8bNQKf8QwyD6UPaAvQHyF8tzJuMPKftefchKWSSUdcZXbutSMtwczmPVeEem54n0tznH3sGZywzcga5c9IvBYvWmDsJ {
    private static final m$$uVIFkBgj8JoqhMxROywPx1r6LVZQKRc19yxBxNEqHA3Ps2EGBaj5ZlnsgvmZkKvPCpkSf7XRCRxqq4elhgeVa6Stb431yyTUN m$$MlbGEGR6g7TmrzKeTdfsOkGvcgdBvpOgFqK4FiuZ8PQ42k9oXKZ8u7jaim3dfDBbyQYpBixFIDsr0OQ5PXF8HTS0C184M82NU = (m$$uVIFkBgj8JoqhMxROywPx1r6LVZQKRc19yxBxNEqHA3Ps2EGBaj5ZlnsgvmZkKvPCpkSf7XRCRxqq4elhgeVa6Stb431yyTUN)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$uVIFkBgj8JoqhMxROywPx1r6LVZQKRc19yxBxNEqHA3Ps2EGBaj5ZlnsgvmZkKvPCpkSf7XRCRxqq4elhgeVa6Stb431yyTUN.class);
    private static final m$$7dBQtMll6jPXZNNL0JKdy4p8eVbJZI7oOTeXRzLBqSEEEcap1JnngIGWGk1FEqPXsknugaL3HnAmbnnwAQwHFkcn4wsLUZFKH m$$epWzXO47ZorzfEbHReaKXtM1xLGKiCOl9i5QjCpLktXOoYtUWsvuJLYtKMd7vwDQnllsCfn9cPFy84CxAJ82NBiZ409okMIDR = (m$$7dBQtMll6jPXZNNL0JKdy4p8eVbJZI7oOTeXRzLBqSEEEcap1JnngIGWGk1FEqPXsknugaL3HnAmbnnwAQwHFkcn4wsLUZFKH)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$7dBQtMll6jPXZNNL0JKdy4p8eVbJZI7oOTeXRzLBqSEEEcap1JnngIGWGk1FEqPXsknugaL3HnAmbnnwAQwHFkcn4wsLUZFKH.class);
    private static final m$$Sa9EL6x1Z9Ql7bo36MeQFajuM94KyzDMfXUXVs4dWApHaRVWxAcRnYD1iRGv2o9XopoaJ0Ja6zJqvtysSRryk9tfO32Fqz1Cg m$$LuORSP6e5Zf8YQ3DBBij0z6SFEHm2YktdZDCJNooNetKoXEGM3xmQbRPxzV4kmmBdeKAsfmagJjHdr30J1iPFd4IdJ72Ry3rW = (m$$Sa9EL6x1Z9Ql7bo36MeQFajuM94KyzDMfXUXVs4dWApHaRVWxAcRnYD1iRGv2o9XopoaJ0Ja6zJqvtysSRryk9tfO32Fqz1Cg)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$Sa9EL6x1Z9Ql7bo36MeQFajuM94KyzDMfXUXVs4dWApHaRVWxAcRnYD1iRGv2o9XopoaJ0Ja6zJqvtysSRryk9tfO32Fqz1Cg.class);
    private static final m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb m$$dqgASIaDtYYe3zYFD5wVnvar7p3RBBCX62DOFFw1NoiiZYC60ich0h1LKqIfRGasndJsEg7XDQNm5wptYmzZ4PJ3EIRktYkCT = (m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$5wIwFuF0tmMIOu4SdBcAmhN0SIb0nphzj58UcJSMUYHzZcXskbyNCGn1txhKVMtVBElZEd3npLBqIv1USXEKQO2dTqvT5PGx2.m$$6fJZp9jdNDT0KjYdk0BomWa7i4ZYhmnBUwzzPxgVyIzMJiF6knxsrEudeckPQxXuwQTguWnqDttBwlOJTMJ2PvMeg7zvGRm7Q(m$$0ELvbOGPBPwaXaKT77mQlfFqgSatbg7fM0zpWHyq5c3v7FsjbOz4FVV9ktWElsESGM7r1stawHXW0J1HsxG1A9J2dEC9RkIMb.class);
    @Unique
    private long m$$x4y1blatyyRVyXKM0YH6DiW6dcPNAbce9T1RZS3afbLJqHdKjpD3P5JoNnbi1OEW1hLRvtHViNpJIdzyY2me08v7lhkJ7JZG3;
    @Unique
    private long m$$jB8bUegGwiX8os37EncQWhICHXYVjygCQp93SeCB3P1zux2vbMaCUPdV5NoOzuZ5zP13WH7VvDLBAfcOGhBaBi7uFbmswRJqq;
    @Unique
    private m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4 m$$TYnu2yLwyhqk8o4kacD7x6TtYPSUAWe2dlj1UhzrwyfntZU0bCkisgTIh0gp36MgNYkd55wdPTQIh5ZxGbxN9sCE5iHhjwFa4;
    @Unique
    private boolean m$$TWtoeQN2KKrVMfzCyoKCK5hXpn7fU6GUdUAC7SwZRnDUEowRxxNCFCbkt67IAWGLyHpkWeN8KDwpZFggiRPPyU2YEAquD0bl5;
    @Unique
    private int m$$gl3EfLevy2HeXfmH3nGBAdrJgvseio5Dg5ySK0uWKWMcq2TqrBI7zUspmnI48A87k5xeRsaIk77R8tNALW9TMZhOs90axM5Zf;
    @Unique
    private m$$Mf9n5D0hPRHoBhhOmaGXmnruuTn8sYZSX0NzU6ku5U2M6Hpr4qZRJSbXvTql6c8hzfuGbXJTjjICXICq6qnAaivTiqNNtJfKo m$$picqd9GpMczLq1X5snvuRPJGAXTe4hyoHzw5FhwPiIDmJmJDVWI6Qc1WV4A7xQZLxoTnBAzuuPeKubRJgFUDVGD64VewbZS0D;

    @Shadow
    public abstract class_1656 method_31549();

    protected m$$IdmPNGPYzocKrxl7NEZGAyTI52O49JPj6YU8mLBjmECVkiw8EP7PIFNrEDm8DArZyBQLZgQFtBqoJ4W25T2LTvQLb4y9a4WXX(class_1299 class_12992, class_1937 class_19372) {
        super(class_12992, class_19372);
    }

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1937 class_19372, class_2338 class_23382, float f, GameProfile gameProfile, CallbackInfo callbackInfo) {
        this.m$$picqd9GpMczLq1X5snvuRPJGAXTe4hyoHzw5FhwPiIDmJmJDVWI6Qc1WV4A7xQZLxoTnBAzuuPeKubRJgFUDVGD64VewbZS0D = new m$$Mf9n5D0hPRHoBhhOmaGXmnruuTn8sYZSX0NzU6ku5U2M6Hpr4qZRJSbXvTql6c8hzfuGbXJTjjICXICq6qnAaivTiqNNtJfKo();
        this.m$$picqd9GpMczLq1X5snvuRPJGAXTe4hyoHzw5FhwPiIDmJmJDVWI6Qc1WV4A7xQZLxoTnBAzuuPeKubRJgFUDVGD64VewbZS0D.m$$usnzfPeWGy6iAn1uPJLR6UgsJVhf38ORt1lPLe11bmnTdwQdPcmX3d47CHJiqfOhVCdu73R8QDlxYkQQkQDkuxD5AsqWq6mRg(m$$dCZTfMRVfeYPXsQeXSgP82nfd4ik2eYhWMntsOvAPNzaKYWGiQ9Sqmfu4Y8s7YKzCxysFYeRLCLO0gQ6XwtJw62fTTTmt4ofQ.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this), (0xF5 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFF) << 24 | (0x10 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 8 & 0xFF) << 16 | (0xC0 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFF) << 8 | 0x6B ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 24 & 0xFF);
        for (m$$EXhOqVmfGEfzvnY5kFMpwUvR6UAiXmNm6OreroFRvSo3VcovtRobmkPnaamZaZSvIjBRdypvatHxMtyExbC4XlVb2eoNhvejC m$$EXhOqVmfGEfzvnY5kFMpwUvR6UAiXmNm6OreroFRvSo3VcovtRobmkPnaamZaZSvIjBRdypvatHxMtyExbC4XlVb2eoNhvejC : (List)m$$92ZtWGBaLVSHRTL3hRebU1Mh7KniNUhcuCHIy1xIZyWqHPWE9vtxX6rWoK8rVWEEhBWksGicrQlQ5r2KIByJLaYGV3F2fyqGl.m$$vv2moGHmva8usg6yExBFD762bvfyagfxd1YZtsA0loLJrVWfJCYOyBR80w5bwATO42sZv3q10jyibSu3v5OXcS9yxvOHcHgRc.getRegistry()) {
            if (!gameProfile.getName().equalsIgnoreCase(m$$EXhOqVmfGEfzvnY5kFMpwUvR6UAiXmNm6OreroFRvSo3VcovtRobmkPnaamZaZSvIjBRdypvatHxMtyExbC4XlVb2eoNhvejC.m$$ORtGYMqDcHg4LkeoCVy3f8B7yjtDv6yLBSBeipjQ1WKWjSMjzdOyXsZ6tQwN5a4aOPfln2ifNp5caviiVwiQBuC04Qqi82nuv(((int)(86833L - (long)(\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFFFF) - (long)(\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF)) & 0xFFFF) << 16 | (int)(59942L - (long)(\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFFFF) + (long)(\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF)) & 0xFFFF))) continue;
            this.mio$setRole(m$$EXhOqVmfGEfzvnY5kFMpwUvR6UAiXmNm6OreroFRvSo3VcovtRobmkPnaamZaZSvIjBRdypvatHxMtyExbC4XlVb2eoNhvejC.m$$R8IzWpNb5quz4Jq0IEsSGanjR6tnZmJakNW5BCLuHjqyvxKQXxtCnxaTtWtwpscYwr5AVJBSiASsOOctW16NIqQORd20KajEf());
            break;
        }
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    private void m$$To3vhJ3WNHdOvPenZy6hBvuDgvoeXq6w8509uDqfBHJUZabEDFnEF0ubsZKnh9UBXReXrwigjnISrN3BxsODfNDDLhjE5DEVb(CallbackInfo callbackInfo) {
        this.m$$picqd9GpMczLq1X5snvuRPJGAXTe4hyoHzw5FhwPiIDmJmJDVWI6Qc1WV4A7xQZLxoTnBAzuuPeKubRJgFUDVGD64VewbZS0D.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(m$$dCZTfMRVfeYPXsQeXSgP82nfd4ik2eYhWMntsOvAPNzaKYWGiQ9Sqmfu4Y8s7YKzCxysFYeRLCLO0gQ6XwtJw62fTTTmt4ofQ.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this), 100L);
        if (this.method_5829().method_17940() < 1.0) {
            this.m$$x4y1blatyyRVyXKM0YH6DiW6dcPNAbce9T1RZS3afbLJqHdKjpD3P5JoNnbi1OEW1hLRvtHViNpJIdzyY2me08v7lhkJ7JZG3 = System.currentTimeMillis();
        }
        boolean bl = this.m$$TWtoeQN2KKrVMfzCyoKCK5hXpn7fU6GUdUAC7SwZRnDUEowRxxNCFCbkt67IAWGLyHpkWeN8KDwpZFggiRPPyU2YEAquD0bl5 = !this.method_37908().method_18026(this.method_5829().method_1009(1.0E-4, 0.0, 1.0E-4));
        if (!this.method_6115() || this.m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8(this.method_6030(), this) > 1.0f) {
            this.m$$jB8bUegGwiX8os37EncQWhICHXYVjygCQp93SeCB3P1zux2vbMaCUPdV5NoOzuZ5zP13WH7VvDLBAfcOGhBaBi7uFbmswRJqq = System.currentTimeMillis();
        }
    }

    @Inject(method={"clipAtLedge"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$O9moVzDFftN5fRrs8mFeaispr2yW59EvwjyNQ4XMz90mYxUR017bEu7UaiqSOBcQMeVzS2x7KPBEzxFG12JkV7LnelYHuu0Bu(CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724 == null) {
            return;
        }
        m$$4mV71x6TnDXp6oZYX54aoSNictrBDI242SullAd3twzyQU7YpzqCpbyYiEIZ6ULJjlaj8sd1F2jHeQqsBmV9gsu7MgM3UtgyL m$$4mV71x6TnDXp6oZYX54aoSNictrBDI242SullAd3twzyQU7YpzqCpbyYiEIZ6ULJjlaj8sd1F2jHeQqsBmV9gsu7MgM3UtgyL = new m$$4mV71x6TnDXp6oZYX54aoSNictrBDI242SullAd3twzyQU7YpzqCpbyYiEIZ6ULJjlaj8sd1F2jHeQqsBmV9gsu7MgM3UtgyL();
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$4mV71x6TnDXp6oZYX54aoSNictrBDI242SullAd3twzyQU7YpzqCpbyYiEIZ6ULJjlaj8sd1F2jHeQqsBmV9gsu7MgM3UtgyL);
        if (m$$4mV71x6TnDXp6oZYX54aoSNictrBDI242SullAd3twzyQU7YpzqCpbyYiEIZ6ULJjlaj8sd1F2jHeQqsBmV9gsu7MgM3UtgyL.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    @ModifyExpressionValue(method={"adjustMovementForSneaking"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;getStepHeight()F")})
    private float m$$fR6eEarIPxvybR1zV4KkcbhQRgMmTBM3M3Em5rMRZPJBe6vWUTmeR70l4mHSeN304bm1lz8s4uMydpwWnakD21Fe6wibSyEN1(float f) {
        if (m$$MlbGEGR6g7TmrzKeTdfsOkGvcgdBvpOgFqK4FiuZ8PQ42k9oXKZ8u7jaim3dfDBbyQYpBixFIDsr0OQ5PXF8HTS0C184M82NU.isToggled() && ((Boolean)m$$IdmPNGPYzocKrxl7NEZGAyTI52O49JPj6YU8mLBjmECVkiw8EP7PIFNrEDm8DArZyBQLZgQFtBqoJ4W25T2LTvQLb4y9a4WXX.m$$MlbGEGR6g7TmrzKeTdfsOkGvcgdBvpOgFqK4FiuZ8PQ42k9oXKZ8u7jaim3dfDBbyQYpBixFIDsr0OQ5PXF8HTS0C184M82NU.m$$NqqLPtmem6dEXIumT0UA1w8i3R8tGszrdSks7yPQY895jZCAHJ1DmK6VjGFo8S2OblQ3OjUv6S2IgZjHB2Kpzg4IeE4SDWJ0R.getValue()).booleanValue()) {
            class_1792 class_17922 = m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724.method_5998(class_1268.field_5808).method_7909();
            if (!(class_17922 instanceof class_1747)) {
                return f;
            }
            class_265 class_2652 = ((class_1747)class_17922).method_7711().method_9564().method_26220((class_1922)m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1687, class_2338.field_10980);
            if (class_2652 == null || class_2652.method_1110()) {
                return f;
            }
            return (float)class_2652.method_1107().method_17940();
        }
        return f;
    }

    @Inject(method={"attack"}, at={@At(value="HEAD")}, cancellable=true)
    public void m$$C7jwyCZGOGmxYHR6CinqHYKGpwwojfCUt8uyzjRA2awICUF3ogkSBtJt9OZZ5TwdqY7XMH0WNbqisrPkOMONx1NLAAWZsoOL0(class_1297 class_12972, CallbackInfo callbackInfo) {
        m$$c9jMbh1IiMTQCK9gtzGzmtRJWOHNyvtwv63vKB8VWyFFRbuOOxz3IzKGfz0bWCYpEFddpIzL6jSeJHHuWBLKPZQyHokMEeEqE m$$c9jMbh1IiMTQCK9gtzGzmtRJWOHNyvtwv63vKB8VWyFFRbuOOxz3IzKGfz0bWCYpEFddpIzL6jSeJHHuWBLKPZQyHokMEeEqE = new m$$c9jMbh1IiMTQCK9gtzGzmtRJWOHNyvtwv63vKB8VWyFFRbuOOxz3IzKGfz0bWCYpEFddpIzL6jSeJHHuWBLKPZQyHokMEeEqE(m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$sQwB8Gn4SsL46dO2Upi4yBLYPCnKWOlOaSGrxKbwA1RWaIibNyrn6OSioUC20gJrJQ0HrgfZY1nKYe7wPwvGZ4a6oZ3eJBH69, class_12972);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$c9jMbh1IiMTQCK9gtzGzmtRJWOHNyvtwv63vKB8VWyFFRbuOOxz3IzKGfz0bWCYpEFddpIzL6jSeJHHuWBLKPZQyHokMEeEqE);
        if (m$$c9jMbh1IiMTQCK9gtzGzmtRJWOHNyvtwv63vKB8VWyFFRbuOOxz3IzKGfz0bWCYpEFddpIzL6jSeJHHuWBLKPZQyHokMEeEqE.m$$NF6xtTI3OjDvBK2xdxb442FDgGTKuynfg4hYmhZivsRxXqIyqHo9S3Uggu68LNdJlD43EZq4WbHdJMPudCSa6eG0FcrLzTMhT()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"attack"}, at={@At(value="TAIL")})
    private void m$$OEp0YT29NNw42heIP0zmUASyxkpkgoNDAf3XefGfcuFiBO7f9sZHIryBvav7JKblNZDhvgVG6hujSvCycPiIiJ2hCkzUT8lyU(class_1297 class_12972, CallbackInfo callbackInfo) {
        m$$c9jMbh1IiMTQCK9gtzGzmtRJWOHNyvtwv63vKB8VWyFFRbuOOxz3IzKGfz0bWCYpEFddpIzL6jSeJHHuWBLKPZQyHokMEeEqE m$$c9jMbh1IiMTQCK9gtzGzmtRJWOHNyvtwv63vKB8VWyFFRbuOOxz3IzKGfz0bWCYpEFddpIzL6jSeJHHuWBLKPZQyHokMEeEqE = new m$$c9jMbh1IiMTQCK9gtzGzmtRJWOHNyvtwv63vKB8VWyFFRbuOOxz3IzKGfz0bWCYpEFddpIzL6jSeJHHuWBLKPZQyHokMEeEqE(m$$6xCN0fzI2F5uncZxRHx3AkJiczPA61c79E8CN3C78kbNpljeOKL9vrr5STtoLrch3djkFDiC3eHrEUDkM8nxTn3SJF3PXmbZu.m$$cLoz4UwY1GSOQzXYErRtEVYBhrEoLPlj4BbRpZV1TLY7qk3wQNZabEq1LQPwG2CSYkgd7XrSLVNpuykeq21bMvSkKk4Fe5RrY, class_12972);
        m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$YRbUM6tecPtUDY7DSPZVtONHRhV70ipxncY5snxpVCpJ34uRutjOiX7B2p7ZdwIYZ166AxTGczxhPYrwDz2CP8xzq3DMcUpFg.m$$ZuBRedSvg2vZNbjw0oWUYtMytZUDOXa47kuBcrtin8su9PIZ64xtjVRVnJRUB6pj9PyQjcOtMo33KRWCgx74W96A1HnDNJ2gM(m$$c9jMbh1IiMTQCK9gtzGzmtRJWOHNyvtwv63vKB8VWyFFRbuOOxz3IzKGfz0bWCYpEFddpIzL6jSeJHHuWBLKPZQyHokMEeEqE);
    }

    @WrapWithCondition(method={"attack"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;setVelocity(Lnet/minecraft/util/math/Vec3d;)V")})
    private boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1657 class_16572, class_243 class_2432) {
        return !m$$epWzXO47ZorzfEbHReaKXtM1xLGKiCOl9i5QjCpLktXOoYtUWsvuJLYtKMd7vwDQnllsCfn9cPFy84CxAJ82NBiZ409okMIDR.isToggled() || (Boolean)m$$IdmPNGPYzocKrxl7NEZGAyTI52O49JPj6YU8mLBjmECVkiw8EP7PIFNrEDm8DArZyBQLZgQFtBqoJ4W25T2LTvQLb4y9a4WXX.m$$epWzXO47ZorzfEbHReaKXtM1xLGKiCOl9i5QjCpLktXOoYtUWsvuJLYtKMd7vwDQnllsCfn9cPFy84CxAJ82NBiZ409okMIDR.m$$JDkF3RF9XRV85bSb9XvzkDLOLCmPJ1yyMPGQ6d3ASAs8r1g9TGM23GpfMDhzwBO9kYejCWIs6uBRJ8kLIO7Nr1ub5bqG9jLBN.getValue() == false;
    }

    @WrapWithCondition(method={"attack"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;takeKnockback(DDD)V")})
    private boolean m$$sLWT6jeaSJQCplj6UIZCOGxzBCp5guG2McQUL5IbYQpvZz7aqitOtCnf7fwF1ydJ0jFtgp29gWEVFb9oEHpUQqMkfkMNvkpgz(class_1309 class_13092, double d, double d2, double d3) {
        return !(this instanceof m$$0Vdcp8iLoj2fBQamH9Lk2iYsw1DemKaOQZ3Cgr5RFRYvAKVfkEprMNxQuoXPD2zYRRoA4mbEkBTWtt4Mpdx6av6o9z68Doyg7$m$$zuygEX3RyGt3VlqW38nhmw8TCwaq1BeiOyLA3j6XAbvXIoeC3N2X8wU8ldfYs0j6jwg2Tjra3LXe7wUZLEEazqs6nC0X8W9F8) || class_13092 != m$$RuwmWHVRItvxmMaDM8igR6sDB2JFqHNCoY5y1NrSiPSSXCNFq1zOr96XLrzw3eMOmD03qhHi90zZikPltVAfaBEzPrjsNnK82.m$$NFwgcXkDIj9yuYZRjcpoOaS9GZzq2TFLp7bDcaGxm2JXu2svrlX19D1PKKUTrhoSlrEbKunz4fOj0bjlLaeJb5h3eD9d9Trge.field_1724;
    }

    @Inject(method={"getEntityInteractionRange"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$RG8NT6WebPFijbrMTAkZxU3uH0z96Dd9wMoDjQwA4DCEI9DPAQhMhEC70vFXhwJo363xsDKe4KkDWqFNLFmbjzp1GEHRJKgEV(CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$LuORSP6e5Zf8YQ3DBBij0z6SFEHm2YktdZDCJNooNetKoXEGM3xmQbRPxzV4kmmBdeKAsfmagJjHdr30J1iPFd4IdJ72Ry3rW.isToggled()) {
            callbackInfoReturnable.setReturnValue((Object)((Float)m$$IdmPNGPYzocKrxl7NEZGAyTI52O49JPj6YU8mLBjmECVkiw8EP7PIFNrEDm8DArZyBQLZgQFtBqoJ4W25T2LTvQLb4y9a4WXX.m$$LuORSP6e5Zf8YQ3DBBij0z6SFEHm2YktdZDCJNooNetKoXEGM3xmQbRPxzV4kmmBdeKAsfmagJjHdr30J1iPFd4IdJ72Ry3rW.m$$AWSXdzEcwmycYJOgN1dcDFhFCu9RVljNZAdPI8FFn2m4VSZedtxzuxtRHeeLV8NgQ2LBNdJg9GXa9N2Ucixg2ZFeeGqd1sF5m.getValue()).doubleValue());
        }
    }

    @Inject(method={"getBlockInteractionRange"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$qtpdMhw2QlSmCHxorxwgF6r42fzxc39tGpqEUu6AYtSnEhUSsUW8rmA5qHGTxhzR0G72uLnBdFuHnO6kryAFghi7OxJn6VmFo(CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$LuORSP6e5Zf8YQ3DBBij0z6SFEHm2YktdZDCJNooNetKoXEGM3xmQbRPxzV4kmmBdeKAsfmagJjHdr30J1iPFd4IdJ72Ry3rW.isToggled()) {
            callbackInfoReturnable.setReturnValue((Object)((Float)m$$IdmPNGPYzocKrxl7NEZGAyTI52O49JPj6YU8mLBjmECVkiw8EP7PIFNrEDm8DArZyBQLZgQFtBqoJ4W25T2LTvQLb4y9a4WXX.m$$LuORSP6e5Zf8YQ3DBBij0z6SFEHm2YktdZDCJNooNetKoXEGM3xmQbRPxzV4kmmBdeKAsfmagJjHdr30J1iPFd4IdJ72Ry3rW.m$$AWSXdzEcwmycYJOgN1dcDFhFCu9RVljNZAdPI8FFn2m4VSZedtxzuxtRHeeLV8NgQ2LBNdJg9GXa9N2Ucixg2ZFeeGqd1sF5m.getValue()).doubleValue());
        }
    }

    @Inject(method={"shouldCancelInteraction"}, at={@At(value="HEAD")}, cancellable=true)
    private void m$$7NXHiOT0tpluK4CV61R3yWSRpe7Mz97hWAiEWrWumtyWEnc0OJADHbp54seyJ331Kr9CejjUQVOAOXunGoi68nYtBf2o1ABCN(CallbackInfoReturnable callbackInfoReturnable) {
        if (m$$UKyfoCPadqRSMOhOjp5UyeDaZkSPWbc7C4pxfUgnJRcqEjG5PdOdWcfHMu1DersCrtZK9WSKjwpwXCiHRLbhTe06WrBEG4csd.m$$dhMEPreXgCyCN8MEA2vaCuz99uMEwVZM6WpmsmXihq4dTelfK2k1WYuYpuBPcpn0hOx7IYFgXJMOrcxRsZuK5nPoT9aEarGMs) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    @Inject(method={"resetLastAttackedTicks"}, at={@At(value="HEAD")})
    private void m$$7NXHiOT0tpluK4CV61R3yWSRpe7Mz97hWAiEWrWumtyWEnc0OJADHbp54seyJ331Kr9CejjUQVOAOXunGoi68nYtBf2o1ABCN(CallbackInfo callbackInfo) {
        this.mio$resetLastAttackedServer();
    }

    @Inject(method={"tick"}, at={@At(value="FIELD", target="Lnet/minecraft/entity/player/PlayerEntity;lastAttackedTicks:I", ordinal=0)})
    private void m$$FRUoLijfpaF0AscB8mUhrhNdNEblEiPOZuoJxqug1epMQkvhce1Jg2Cq3ct30g7xTvsaqo4EG8Syw6bOlNV2NSj6wmJMo13uj(CallbackInfo callbackInfo) {
        if (m$$xQ8jgx5howJKGmMwgMbM6XY1HDJnKjLumWj5cbrlxmQsb1iu27roC6c5V6l60cyfcejJAI13OkEqUwU9B2XRuHuFcczhTmBIi.m$$xQ8jgx5howJKGmMwgMbM6XY1HDJnKjLumWj5cbrlxmQsb1iu27roC6c5V6l60cyfcejJAI13OkEqUwU9B2XRuHuFcczhTmBIi((0x3C49 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFFFF) << 16 | 61597 - (\u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF) & 0xFFFF)) {
            return;
        }
        ++this.m$$gl3EfLevy2HeXfmH3nGBAdrJgvseio5Dg5ySK0uWKWMcq2TqrBI7zUspmnI48A87k5xeRsaIk77R8tNALW9TMZhOs90axM5Zf;
    }

    @ModifyReturnValue(method={"getMovementSpeed"}, at={@At(value="RETURN")})
    private float m$$KgsA96MC4T4eH6W0XsD6gEUJxCz5GU4uazh6mqzZZEg5IcvKpdzsTNWdlxDRqzB2X3Og2j3TkDMOzEdzjRLwJz0tDZCIQJ5av(float f) {
        if (!this.method_37908().field_9236) {
            return f;
        }
        if (!m$$dqgASIaDtYYe3zYFD5wVnvar7p3RBBCX62DOFFw1NoiiZYC60ich0h1LKqIfRGasndJsEg7XDQNm5wptYmzZ4PJ3EIRktYkCT.isToggled() || !((Boolean)m$$IdmPNGPYzocKrxl7NEZGAyTI52O49JPj6YU8mLBjmECVkiw8EP7PIFNrEDm8DArZyBQLZgQFtBqoJ4W25T2LTvQLb4y9a4WXX.m$$dqgASIaDtYYe3zYFD5wVnvar7p3RBBCX62DOFFw1NoiiZYC60ich0h1LKqIfRGasndJsEg7XDQNm5wptYmzZ4PJ3EIRktYkCT.m$$NwROn4GHOv1VpSZzZRE8Rk4rW62yMeJqFjN2YzjlBtpvdMJXC6iku35Op6em8817rmEbth2ypLnGvf7PnyDUQdpFQwMJ7riB4.getValue()).booleanValue()) {
            return f;
        }
        float f2 = this.method_31549().method_7253();
        if (f >= f2) {
            return f;
        }
        if (this.method_5624()) {
            return f2 * 1.3000001f;
        }
        return f2;
    }

    @Override
    public long mio$getLastEatingTime() {
        return this.m$$jB8bUegGwiX8os37EncQWhICHXYVjygCQp93SeCB3P1zux2vbMaCUPdV5NoOzuZ5zP13WH7VvDLBAfcOGhBaBi7uFbmswRJqq;
    }

    @Override
    public m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4 mio$getRole() {
        return this.m$$TYnu2yLwyhqk8o4kacD7x6TtYPSUAWe2dlj1UhzrwyfntZU0bCkisgTIh0gp36MgNYkd55wdPTQIh5ZxGbxN9sCE5iHhjwFa4;
    }

    @Override
    public void mio$setRole(m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4 m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4) {
        this.m$$TYnu2yLwyhqk8o4kacD7x6TtYPSUAWe2dlj1UhzrwyfntZU0bCkisgTIh0gp36MgNYkd55wdPTQIh5ZxGbxN9sCE5iHhjwFa4 = m$$kG9s1wrlaVdbU2cFgA5ffDQT6sxm2uIwgu0Bi5RWIiSohCmlXqfmSxJjmT4liXmKXOKfuMsYhMrfIbdkdZvKtqoGAujKulNc4;
    }

    @Override
    public float mio$getHealthFactor() {
        return this.m$$picqd9GpMczLq1X5snvuRPJGAXTe4hyoHzw5FhwPiIDmJmJDVWI6Qc1WV4A7xQZLxoTnBAzuuPeKubRJgFUDVGD64VewbZS0D.m$$Cazp19oS8kw4yCtiEMq82HY6TA1uKvtsknEfeXiuL7qDlSttpvSvJa6f6Xy64eoYPoEfF4IbQgHNiJCLLTGS5FZI66syvRA7y((~((0xA554 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 & 0xFFFF) & 0xFFFF) + 1 & 0xFFFF) << 16 | (0x9AA4 ^ \u0101\u0201\u0301\u0401\u0601\u0701\u0801\u0901\u0a01\u0b01\u0e01\u0f01\u1001\u1101\u1201\u1301\u1401\u1501\u1601\u1701\u1801\u1901\u1a01\u1b01\u1c01\u1d01\u1e01\u1f01\u2101\u2201\u2301\u2401\u2501\u2701\u2801\u2901\u2a01\u2b01\u2c01\u2d01\u2e01\u2f01\u3001\u3101\u3201\u3301\u3401\u3501\u3601\u3701\u3801\u3901\u3a01\u3b01\u3c01\u3d01\u3e01\u3f01\u4001\u4101\u4201\u4301\u4401\u4501\u4601\u4701\u4801\u4901\u4a01\u4b01\u4c01\u4d01\u4e01\u4f01\u5001\u5101\u5201\u5301\u5401\u5501\u5601\u5701\u5801\u5901\u5a01\u5b01\u5c01\u5d01\u5e01\u5f01\u6001\u6101\u6201\u6301\u6401\u6501\u6601\u6701\u6801\u6901\u6a01\u6b01\u6c01\u6d01\u6e01\u6f01\u7001\u7101\u7201\u7301\u7401\u7501\u7601\u7701\u7801\u7901\u7a01\u7b01\u7c01\u7d01\u7e01\u7f01\u8001\u8101\u8201\u8301\u8401\u8501\u8601\u8701\u8801\u8901\u8a01\u8b01\u8c01\u8d01\u8e01\u8f01\u9001\u9101\u9201\u9301\u9401\u9501\u9601\u9701\u9801\u9901\u9a01\u9b01\u9c01\u9d01\u9e01\u9f01\ua001\ua101\ua201\ua301\ua401\ua501\ua601\ua701\ua801\ua901\uaa01\uab01\uac01\uad01\uae01\uaf01\ub001\ub101\ub201\ub301\ub401\ub501\ub601\ub701\ub801\ub901\uba01\ubb01\ubc01\ubd01 >>> 16 & 0xFFFF) & 0xFFFF);
    }

    @Override
    public boolean mio$isNextToWall() {
        return this.m$$TWtoeQN2KKrVMfzCyoKCK5hXpn7fU6GUdUAC7SwZRnDUEowRxxNCFCbkt67IAWGLyHpkWeN8KDwpZFggiRPPyU2YEAquD0bl5;
    }

    @Override
    public boolean mio$wasCrawling() {
        return System.currentTimeMillis() - this.m$$x4y1blatyyRVyXKM0YH6DiW6dcPNAbce9T1RZS3afbLJqHdKjpD3P5JoNnbi1OEW1hLRvtHViNpJIdzyY2me08v7lhkJ7JZG3 <= 150L;
    }

    @Override
    public int mio$getLastAttackedTicksServer() {
        return this.m$$gl3EfLevy2HeXfmH3nGBAdrJgvseio5Dg5ySK0uWKWMcq2TqrBI7zUspmnI48A87k5xeRsaIk77R8tNALW9TMZhOs90axM5Zf;
    }

    @Override
    public void mio$resetLastAttackedServer() {
        this.m$$gl3EfLevy2HeXfmH3nGBAdrJgvseio5Dg5ySK0uWKWMcq2TqrBI7zUspmnI48A87k5xeRsaIk77R8tNALW9TMZhOs90axM5Zf = 0;
    }
}

