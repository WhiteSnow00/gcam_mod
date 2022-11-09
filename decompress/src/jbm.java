// 
// Decompiled by Procyon v0.6.0
// 

public enum jbm
{
    a("UNINITIALIZED", 0, 0), 
    b("PHOTO", 1, 1), 
    c("VIDEO", 2, 2), 
    d("IMAX", 3, 3), 
    e("PHOTO_SPHERE", 4, 4), 
    f("SLOW_MOTION", 5, 5), 
    g("PORTRAIT", 6, 7), 
    h("IMAGE_INTENT", 7, 8), 
    i("VIDEO_INTENT", 8, 9), 
    j("ORNAMENT", 9, 10), 
    k("LENS", 10, 11), 
    l("MOTION_BLUR", 11, 13), 
    m("LONG_EXPOSURE", 12, 14), 
    n("TIME_LAPSE", 13, 15), 
    o("SETTINGS", 14, 16), 
    p("MORE_MODES", 15, 17), 
    q("MEASURE", 16, 18), 
    r("REWIND", 17, 19), 
    s("TIARA", 18, 20);
    
    public final int t;
    
    private jbm(final String s, final int n, final int t) {
        this.t = t;
    }
}
