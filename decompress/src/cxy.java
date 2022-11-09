// 
// Decompiled by Procyon v0.6.0
// 

public final class cxy
{
    public static final cxo a;
    public static final cxo b;
    public static final cxo c;
    public static final cxm d;
    public static final cxm e;
    public static final cxm f;
    
    static {
        new cxn().a = "camera.lasagna";
        new cxn().a = "camera.lasagna_options";
        new cxn().a = "camera.lasagna_bottom_layer";
        final cxn cxn = new cxn();
        cxn.a = "camera.lasagna.hfr";
        d = cxn.f();
        final cxn cxn2 = new cxn();
        cxn2.a = "camera.lasagna.amount_sp";
        e = cxn2.e();
        final cxn cxn3 = new cxn();
        cxn3.a = "camera.lasagna.amount_sk";
        f = cxn3.e();
        final cxn cxn4 = new cxn();
        cxn4.a = "camera.lasagna.max_psl_duration";
        final Integer value = 0;
        cxn4.c = nlv.a(nqe.f(value, 11), nme.a);
        a = cxn4.a();
        final cxn cxn5 = new cxn();
        cxn5.a = "camera.lasagna.max_psl_frame_count";
        b = cxn5.a();
        final cxn cxn6 = new cxn();
        cxn6.a = "camera.lasagna.shot_type";
        cxn6.c = nlv.a(nqe.f(value, 3), nme.a);
        c = cxn6.a();
        new cxn().a = "camera.lasagna.slowraw";
    }
}
