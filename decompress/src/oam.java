// 
// Decompiled by Procyon v0.6.0
// 

public enum oam implements olb
{
    @Deprecated
    A("WHITE_BALANCE_AUTO", 26, 24), 
    @Deprecated
    B("WHITE_BALANCE_CLOUDY", 27, 25), 
    @Deprecated
    C("WHITE_BALANCE_SUNNY", 28, 26), 
    @Deprecated
    D("WHITE_BALANCE_INCANDESCENT", 29, 27), 
    @Deprecated
    E("WHITE_BALANCE_FLUORESCENT", 30, 28), 
    F("BEAUTIFICATION_ON_LIGHT", 31, 29), 
    G("BEAUTIFICATION_ON_STRONG", 32, 30), 
    H("BEAUTIFICATION_OFF", 33, 31), 
    I("AF_ON", 34, 32), 
    J("AF_ON_LOCKED", 35, 33), 
    K("AF_OFF_NEAR", 36, 34), 
    L("AF_OFF_FAR", 37, 35), 
    M("AF_OFF_INFINITY", 38, 45), 
    N("IMAX_AUDIO_ON", 39, 36), 
    O("IMAX_AUDIO_OFF", 40, 37), 
    P("SELECTED", 41, 38), 
    Q("UNSELECTED", 42, 39), 
    R("HORIZONTAL_PHOTO_SPHERE", 43, 40), 
    S("VERTICAL_PHOTO_SPHERE", 44, 41), 
    T("WIDE_ANGLE_PHOTO_SPHERE", 45, 42), 
    U("FISH_EYE_PHOTO_SPHERE", 46, 43), 
    V("PHOTO_SPHERE", 47, 44), 
    W("SIXTEEN_BY_NINE", 48, 46), 
    X("FOUR_BY_THREE", 49, 47), 
    Y("RES_1080P", 50, 49), 
    Z("RES_2160P", 51, 50), 
    a("UNKNOWN", 0, 0), 
    aa("PR_ON", 52, 51), 
    ab("PR_OFF", 53, 52), 
    ac("ASTRO_OFF", 54, 53), 
    ad("ASTRO_AUTO", 55, 54), 
    ae("MIC_INPUT_PHONE", 56, 56), 
    af("MIC_INPUT_EXT_WIRED", 57, 57), 
    ag("MIC_INPUT_EXT_BLUETOOTH", 58, 58), 
    ah("SWISS_OFF", 59, 59), 
    ai("SWISS_ON", 60, 60), 
    b("TIMER_ZERO_SECONDS", 1, 1), 
    c("TIMER_THREE_SECONDS", 2, 2), 
    d("TIMER_TEN_SECONDS", 3, 3), 
    e("TIMER_AUTO", 4, 4), 
    f("HDR_AUTO", 5, 5), 
    g("HDR_ON", 6, 6), 
    h("HDR_OFF", 7, 7), 
    i("HDR_READY", 8, 8), 
    j("PHOTO_FLASH_ON", 9, 9), 
    k("PHOTO_FLASH_OFF", 10, 10), 
    l("PHOTO_FLASH_AUTO", 11, 11), 
    m("PHOTO_FLASH_GRAYED", 12, 12), 
    n("PHOTO_FLASH_UNGRAYED", 13, 13), 
    o("PHOTO_FLASH_NS", 14, 55), 
    p("VIDEO_FLASH_ON", 15, 14), 
    q("VIDEO_FLASH_OFF", 16, 15), 
    r("MICROVIDEO_ON", 17, 16), 
    s("MICROVIDEO_AUTO", 18, 17), 
    t("MICROVIDEO_OFF", 19, 18), 
    @Deprecated
    u("EXT_MICROPHONE_ON", 20, 19), 
    @Deprecated
    v("EXT_MICROPHONE_OFF", 21, 20), 
    w("FPS_AUTO", 22, 21), 
    x("FPS_24", 23, 48), 
    y("FPS_30", 24, 22), 
    z("FPS_60", 25, 23);
    
    public final int aj;
    
    private oam(final String s, final int n, final int aj) {
        this.aj = aj;
    }
    
    public static oam b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 60: {
                return oam.ai;
            }
            case 59: {
                return oam.ah;
            }
            case 58: {
                return oam.ag;
            }
            case 57: {
                return oam.af;
            }
            case 56: {
                return oam.ae;
            }
            case 55: {
                return oam.o;
            }
            case 54: {
                return oam.ad;
            }
            case 53: {
                return oam.ac;
            }
            case 52: {
                return oam.ab;
            }
            case 51: {
                return oam.aa;
            }
            case 50: {
                return oam.Z;
            }
            case 49: {
                return oam.Y;
            }
            case 48: {
                return oam.x;
            }
            case 47: {
                return oam.X;
            }
            case 46: {
                return oam.W;
            }
            case 45: {
                return oam.M;
            }
            case 44: {
                return oam.V;
            }
            case 43: {
                return oam.U;
            }
            case 42: {
                return oam.T;
            }
            case 41: {
                return oam.S;
            }
            case 40: {
                return oam.R;
            }
            case 39: {
                return oam.Q;
            }
            case 38: {
                return oam.P;
            }
            case 37: {
                return oam.O;
            }
            case 36: {
                return oam.N;
            }
            case 35: {
                return oam.L;
            }
            case 34: {
                return oam.K;
            }
            case 33: {
                return oam.J;
            }
            case 32: {
                return oam.I;
            }
            case 31: {
                return oam.H;
            }
            case 30: {
                return oam.G;
            }
            case 29: {
                return oam.F;
            }
            case 28: {
                return oam.E;
            }
            case 27: {
                return oam.D;
            }
            case 26: {
                return oam.C;
            }
            case 25: {
                return oam.B;
            }
            case 24: {
                return oam.A;
            }
            case 23: {
                return oam.z;
            }
            case 22: {
                return oam.y;
            }
            case 21: {
                return oam.w;
            }
            case 20: {
                return oam.v;
            }
            case 19: {
                return oam.u;
            }
            case 18: {
                return oam.t;
            }
            case 17: {
                return oam.s;
            }
            case 16: {
                return oam.r;
            }
            case 15: {
                return oam.q;
            }
            case 14: {
                return oam.p;
            }
            case 13: {
                return oam.n;
            }
            case 12: {
                return oam.m;
            }
            case 11: {
                return oam.l;
            }
            case 10: {
                return oam.k;
            }
            case 9: {
                return oam.j;
            }
            case 8: {
                return oam.i;
            }
            case 7: {
                return oam.h;
            }
            case 6: {
                return oam.g;
            }
            case 5: {
                return oam.f;
            }
            case 4: {
                return oam.e;
            }
            case 3: {
                return oam.d;
            }
            case 2: {
                return oam.c;
            }
            case 1: {
                return oam.b;
            }
            case 0: {
                return oam.a;
            }
        }
    }
    
    public static old c() {
        return oah.g;
    }
    
    @Override
    public final int a() {
        return this.aj;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.aj);
    }
}
