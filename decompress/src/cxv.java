// 
// Decompiled by Procyon v0.6.0
// 

public final class cxv
{
    public static final cxm a;
    public static final cxm b;
    public static final cxm c;
    public static final cxm d;
    public static final cxm e;
    public static final cxm f;
    public static final cxm g;
    
    static {
        final cxn cxn = new cxn();
        cxn.a = "camera.enable_cuttlef";
        a = cxn.f();
        final cxn cxn2 = new cxn();
        cxn2.a = "total_exposure_threshold_front";
        b = cxn2.e();
        final cxn cxn3 = new cxn();
        cxn3.a = "total_exposure_threshold_rear";
        c = cxn3.e();
        final cxn cxn4 = new cxn();
        cxn4.a = "camera.promote_night_sight";
        d = cxn4.f();
        final cxn cxn5 = new cxn();
        cxn5.a = "camera.cuttle.glpreview";
        e = cxn5.f();
        final cxn cxn6 = new cxn();
        cxn6.a = "camera.cuttle.sky_eager_init";
        f = cxn6.f();
        final cxn cxn7 = new cxn();
        cxn7.a = "camera.cuttleface_edu";
        g = cxn7.f();
    }
    
    public static float a(final cxl cxl, final lfu lfu) {
        Float n;
        if (lfu == lfu.a) {
            n = (Float)cxl.g(cxv.b).c();
        }
        else {
            n = (Float)cxl.g(cxv.c).c();
        }
        return n;
    }
    
    public static float b(final cxl cxl, final lfu lfu) {
        float n;
        if (lfu == lfu.a) {
            n = 0.9f;
        }
        else {
            n = 0.8f;
        }
        return a(cxl, lfu) * n;
    }
}
