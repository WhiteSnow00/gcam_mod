// 
// Decompiled by Procyon v0.6.0
// 

public final class oux implements ouw
{
    public static final moh a;
    public static final moh b;
    public static final moh c;
    public static final moh d;
    public static final moh e;
    
    static {
        final mof a2 = new mof(mnw.a("com.google.android.apps.camera")).b().a();
        a = a2.f("Primes__enable_battery_logging", false);
        b = a2.f("Primes__enable_crash_logging", false);
        c = a2.f("Primes__enable_memory_logging", false);
        d = a2.f("Primes__enable_package_metrics_logging", false);
        e = a2.f("Primes__enable_timer_logging", false);
    }
    
    @Override
    public final boolean a() {
        return (boolean)oux.a.e();
    }
    
    @Override
    public final boolean b() {
        return (boolean)oux.b.e();
    }
    
    @Override
    public final boolean c() {
        return (boolean)oux.c.e();
    }
    
    @Override
    public final boolean d() {
        return (boolean)oux.d.e();
    }
    
    @Override
    public final boolean e() {
        return (boolean)oux.e.e();
    }
}
