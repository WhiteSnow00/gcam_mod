import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kue
{
    public static final kud a;
    public final Object b;
    public final krr c;
    public kjk d;
    private final ScheduledExecutorService e;
    private final kud f;
    private kiz g;
    
    static {
        a = kud.a(false);
    }
    
    public kue(final ScheduledExecutorService e, final krr krr, final niz niz) {
        this.b = new Object();
        this.e = e;
        final krr a = krr.a("CamDeviceWakelock");
        this.c = a;
        final kud f = (kud)niz.e(kue.a);
        this.f = f;
        final kjk d = new kjk();
        this.d = d;
        this.g = this.c(d);
        final String value = String.valueOf(f);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 12);
        sb.append("Configured: ");
        sb.append(value);
        a.b(sb.toString());
    }
    
    private final kiz c(final kjk kjk) {
        synchronized (this.b) {
            if (this.f.a) {
                return new kiz(kjk, odx.a, null);
            }
            return new kiz(kjk, odx.a, new kkf(new kkd(this.e, 1000L, TimeUnit.MILLISECONDS)));
        }
    }
    
    public final kjk a() {
        synchronized (this.b) {
            return this.d.b();
        }
    }
    
    public final krc b(final String s) {
        synchronized (this.b) {
            krc krc;
            if ((krc = this.g.a()) == null) {
                final krr c = this.c;
                final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 60);
                sb.append("Failed to acquire token requested by:");
                sb.append(s);
                sb.append("; creating new wakelock");
                c.f(sb.toString());
                final kjk d = new kjk();
                this.d = d;
                final kiz c2 = this.c(d);
                this.g = c2;
                krc = c2.a();
                krc.getClass();
            }
            final krr c3 = this.c;
            final String value = String.valueOf(s);
            String concat;
            if (value.length() != 0) {
                concat = "Acquired by ".concat(value);
            }
            else {
                concat = new String("Acquired by ");
            }
            c3.b(concat);
            return new kuc(this, s, krc);
        }
    }
}
