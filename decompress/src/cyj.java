// 
// Decompiled by Procyon v0.6.0
// 

public final class cyj
{
    public static final cxo a;
    public static final cxo b;
    public static final cxo c;
    public static final cxo d;
    
    static {
        new cxn().a = "camera.swiss_enabled.RESTART";
        new cxn().a = "swiss_use_darwinn_tpu_delegate.RESTART";
        new cxn().a = "swiss_controller_use_darwinn_tpu_delegate.RESTART";
        new cxn().a = "camera.swiss_setting_force_on";
        new cxn().a = "camera.swiss_debug";
        final cxn cxn = new cxn();
        cxn.a = "camera.swiss_tooltip_max_count";
        a = cxn.a();
        final cxn cxn2 = new cxn();
        cxn2.a = "swiss_suggesstion_min_sample";
        b = cxn2.a();
        final cxn cxn3 = new cxn();
        cxn3.a = "swiss_suggestion_sampling_period_ms";
        c = cxn3.a();
        final cxn cxn4 = new cxn();
        cxn4.a = "swiss_suggestion_sample_timeout_ms";
        d = cxn4.a();
    }
}
