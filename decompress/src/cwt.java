// 
// Decompiled by Procyon v0.6.0
// 

public final class cwt
{
    public static final cxo a;
    public static final cxm b;
    public static final cxm c;
    public static final cxm d;
    public static final cxm e;
    public static final cxm f;
    
    static {
        final cxn cxn = new cxn();
        cxn.a = "camera.advice";
        b = cxn.c();
        final cxn cxn2 = new cxn();
        cxn2.a = "camera.advice.dirtylens";
        c = cxn2.f();
        final cxn cxn3 = new cxn();
        cxn3.a = "camera.advice.distance";
        d = cxn3.c();
        final cxn cxn4 = new cxn();
        cxn4.a = "advice_total_exposure_threshold_front";
        e = cxn4.e();
        final cxn cxn5 = new cxn();
        cxn5.a = "advice_total_exposure_threshold_rear";
        f = cxn5.e();
        final cxn cxn6 = new cxn();
        cxn6.a = "dirty_lens_detector_timeout";
        a = cxn6.a();
        new cxn().a = "camera.advice.dld_log";
    }
}
