// 
// Decompiled by Procyon v0.6.0
// 

public final class ovd implements ovc
{
    public static final moh a;
    public static final moh b;
    public static final moh c;
    public static final moh d;
    public static final moh e;
    public static final moh f;
    
    static {
        final mof a2 = new mof(mnw.a("com.google.android.libraries.consentverifier")).b().a();
        a = a2.f("CollectionBasisVerifierFeatures__enable_all_features", true);
        b = a2.f("CollectionBasisVerifierFeatures__enable_logging", false);
        c = a2.f("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false);
        d = a2.d("CollectionBasisVerifierFeatures__failure_log_cooldown_period_ms", 86400000L);
        e = a2.d("CollectionBasisVerifierFeatures__max_stack_trace_size", 1000L);
        f = a2.d("CollectionBasisVerifierFeatures__min_app_version_code_to_log", -1L);
        a2.f("CollectionBasisVerifierFeatures__use_packed_proto", true);
    }
    
    @Override
    public final long a() {
        return (long)ovd.d.e();
    }
    
    @Override
    public final long b() {
        return (long)ovd.e.e();
    }
    
    @Override
    public final long c() {
        return (long)ovd.f.e();
    }
    
    @Override
    public final boolean d() {
        return (boolean)ovd.a.e();
    }
    
    @Override
    public final boolean e() {
        return (boolean)ovd.b.e();
    }
    
    @Override
    public final boolean f() {
        return (boolean)ovd.c.e();
    }
}
