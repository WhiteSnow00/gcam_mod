import android.os.SystemClock;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmf
{
    private static volatile jmf h;
    public final Context a;
    public final Context b;
    public final jmv c;
    public final jnj d;
    public final jna e;
    public final jno f;
    public final jwm g;
    private final jlw i;
    private final jma j;
    private final jnw k;
    
    protected jmf(final jmg jmg) {
        final Context a = jmg.a;
        jvu.j(a, "Application context can't be null");
        final Context b = jmg.b;
        jvu.a(b);
        this.a = a;
        this.b = b;
        this.g = jwm.a;
        this.c = new jmv(this);
        final jnj d = new jnj(this);
        d.A();
        this.d = d;
        final jnj d2 = this.d();
        final String a2 = jmd.a;
        final StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 134);
        sb.append("Google Analytics ");
        sb.append(a2);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        d2.w(4, sb.toString(), null, null, null);
        final jno f = new jno(this);
        f.A();
        this.f = f;
        final jnw k = new jnw(this);
        k.A();
        this.k = k;
        final jma j = new jma(this);
        final jmu jmu = new jmu(this);
        final jlx jlx = new jlx(this);
        final jmo jmo = new jmo(this);
        final jmz jmz = new jmz(this);
        jvu.a(a);
        if (jlw.a == null) {
            synchronized (jlw.class) {
                if (jlw.a == null) {
                    jlw.a = new jlw(a);
                }
            }
        }
        final jlw a3 = jlw.a;
        a3.c = new jme(this);
        this.i = a3;
        final jlo jlo = new jlo(this);
        jmu.A();
        jlx.A();
        jmo.A();
        jmz.A();
        final jna e = new jna(this);
        e.A();
        this.e = e;
        j.A();
        this.j = j;
        final jnw e2 = jlo.a.e();
        e2.z();
        e2.z();
        if (e2.f) {
            e2.z();
            final boolean g = e2.g;
        }
        e2.z();
        final jmt a4 = j.a;
        a4.z();
        jvu.g(a4.a ^ true, "Analytics backend already started");
        a4.a = true;
        a4.e().b(new jmr(a4));
    }
    
    public static jmf c(final Context context) {
        jvu.a(context);
        if (jmf.h == null) {
            synchronized (jmf.class) {
                if (jmf.h == null) {
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    final jmf jmf = jmf.h = new jmf(new jmg(context));
                    jlo.a();
                    final long n = SystemClock.elapsedRealtime() - elapsedRealtime;
                    final long longValue = (long)jnd.B.a();
                    if (n > longValue) {
                        jmf.d().v("Slow initialization (ms)", n, longValue);
                    }
                }
            }
        }
        return jmf.h;
    }
    
    public static final void f(final jmc jmc) {
        jvu.j(jmc, "Analytics service not created/initialized");
        jvu.c(jmc.B(), "Analytics service not initialized");
    }
    
    public final jlw a() {
        jvu.a(this.i);
        return this.i;
    }
    
    public final jma b() {
        f(this.j);
        return this.j;
    }
    
    public final jnj d() {
        f(this.d);
        return this.d;
    }
    
    public final jnw e() {
        f(this.k);
        return this.k;
    }
}
