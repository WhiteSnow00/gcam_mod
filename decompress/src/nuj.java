import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nuj
{
    private static String a;
    private static String b;
    private static String c;
    private static final String[] d;
    
    static {
        nuj.a = "nut";
        nuj.b = "com.google.common.flogger.backend.google.GooglePlatform";
        nuj.c = "com.google.common.flogger.backend.system.DefaultPlatform";
        d = new String[] { "nut", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform" };
    }
    
    public static long a() {
        return nuh.a.b();
    }
    
    public static ntl c(final String s) {
        return nuh.a.d(s);
    }
    
    public static ntp e() {
        return h().a();
    }
    
    public static nui f() {
        return nuh.a.g();
    }
    
    public static nvb h() {
        return nuh.a.i();
    }
    
    public static nvk j() {
        return h().b();
    }
    
    public static String k() {
        return nuh.a.l();
    }
    
    public static boolean m(final String s, final Level level, final boolean b) {
        h().c(s, level, b);
        return false;
    }
    
    protected long b() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
    
    protected abstract ntl d(final String p0);
    
    protected abstract nui g();
    
    protected nvb i() {
        return nvd.a;
    }
    
    protected abstract String l();
}
