import j$.time.temporal.TemporalAmount;
import java.util.concurrent.atomic.AtomicBoolean;
import j$.time.Instant;

// 
// Decompiled by Procyon v0.6.0
// 

class dcc
{
    public final long a;
    public boolean b;
    public Instant c;
    final /* synthetic */ dce d;
    private final hin e;
    private final Instant f;
    private final hio g;
    private final AtomicBoolean h;
    private Instant i;
    private int j;
    private ksh k;
    private ksj l;
    
    public dcc(final dce d, final hin e, final Instant instant, final hio g) {
        this.d = d;
        this.h = new AtomicBoolean(false);
        this.b = false;
        this.i = Instant.MIN;
        this.j = 0;
        this.k = ksh.b;
        this.l = ksj.a;
        this.a = e.b;
        this.e = e;
        this.f = instant;
        this.g = g;
        this.c = instant;
    }
    
    public void a() {
        final Instant instant = this.d.f.instant();
        this.c(instant, "CANCELED");
        if (this.h.compareAndSet(false, true)) {
            this.d.h.b(this.a, instant);
            return;
        }
        this.d("canceled");
    }
    
    public void b(final String s) {
        this.c(this.d.f.instant(), s);
    }
    
    public void c(final Instant c, final String s) {
        this.c = c;
        if (!this.h.get()) {
            this.d.h.c(this.a, c, s);
            return;
        }
        this.e(s);
    }
    
    protected final void d(final String s) {
        this.d.d.h(ksc.c("%s() on shot %d (%s), but it was already finished.", s, this.a, this.e));
    }
    
    protected final void e(final String s) {
        this.d.d.g(ksc.c("On shot %d (%s) tried to log '%s', but shot was already finished.", this.a, this.e, s));
    }
    
    public void f(final Integer n) {
        ++this.j;
        final Instant instant = this.d.f.instant();
        this.c = instant;
        if (n != null) {
            this.l.c(n);
        }
        if (instant.isAfter(this.i)) {
            final krr d = this.d.d;
            final String value = String.valueOf(this.e);
            final int j = this.j;
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 29);
            sb.append("onShotProgress ");
            sb.append(value);
            sb.append(" (");
            sb.append(j);
            sb.append(")");
            d.b(sb.toString());
            this.i = instant.plus((TemporalAmount)dce.b);
            if (!this.h.get()) {
                this.d.h.d(this.a, instant);
                return;
            }
            this.d("makingProgress");
        }
    }
    
    public void g(final Instant instant) {
        if (!this.h.get()) {
            this.b = true;
            this.d.h.f(this.a, instant);
            return;
        }
        this.d("markStuck");
    }
    
    public void h() {
        final Instant instant = this.d.f.instant();
        this.c(instant, "PERSISTED");
        this.k.a();
        this.k = ksh.b;
        if (this.h.compareAndSet(false, true)) {
            this.d.h.g(this.a, instant);
            return;
        }
        this.d("persisted");
    }
    
    public void i() {
        if (!this.h.get()) {
            this.d.h.h(this.e, this.f, this.g);
            final kse e = this.d.e;
            final long a = this.a;
            final StringBuilder sb = new StringBuilder(26);
            sb.append("Shot #");
            sb.append(a);
            this.k = e.a(sb.toString());
            final kse e2 = this.d.e;
            final long a2 = this.a;
            final StringBuilder sb2 = new StringBuilder(34);
            sb2.append("ShotProgress #");
            sb2.append(a2);
            this.l = e2.b(sb2.toString());
            return;
        }
        this.d("started");
    }
}
