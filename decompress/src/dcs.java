import java.util.concurrent.TimeUnit;
import android.database.sqlite.SQLiteException;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.Iterator;
import java.util.List;
import j$.time.Instant;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.debug.shottracker.db.ShotDatabase;
import j$.time.Clock;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dcs implements dcj
{
    static final Duration a;
    static final Duration b;
    static final Duration c;
    public final krr d;
    public final Clock e;
    public final boolean f;
    public ShotDatabase g;
    public dcu h;
    public ddd i;
    private final ofb j;
    private final Executor k;
    private long l;
    
    static {
        a = Duration.ofMinutes(2L);
        b = Duration.ofHours(6L);
        c = Duration.ofHours(36L);
    }
    
    public dcs(final ofb j, final Executor k, final Clock e, final boolean f, final krr krr, final pii pii) {
        this.l = dcs.a.getSeconds();
        this.d = krr.a("ShotTracker");
        this.j = j;
        this.k = k;
        this.e = e;
        this.f = f;
        k.execute(new dcr(this, krr, f, pii));
    }
    
    public static ddi j(final long b, final Instant instant, final String d) {
        final ddi ddi = new ddi();
        ddi.b = b;
        ddi.a = 0;
        ddi.c = instant.toEpochMilli();
        ddi.d = d;
        return ddi;
    }
    
    public static String k(final List list) {
        final StringBuilder sb = new StringBuilder();
        for (final ddi ddi : list) {
            sb.append(ddi.b);
            sb.append(' ');
            sb.append(Instant.ofEpochMilli(ddi.c));
            sb.append(": ");
            sb.append(ddi.d);
            sb.append('\n');
        }
        return sb.toString();
    }
    
    @Override
    public final oey a() {
        return this.j.b(new dcn(this));
    }
    
    @Override
    public final void b(final long n, final Instant instant) {
        this.k.execute(new dco(this, n, instant, 1));
    }
    
    @Override
    public final void c(final long n, final Instant instant, final String s) {
        this.k.execute(new dcp(this, n, instant, s));
    }
    
    @Override
    public final void d(final long n, final Instant instant) {
        this.k.execute(new dco(this, n, instant));
    }
    
    @Override
    public final void e(final long n, final Instant instant) {
        this.k.execute(new dco(this, n, instant, 2));
    }
    
    @Override
    public final void f(final long n, final Instant instant) {
        this.k.execute(new dco(this, n, instant, 3));
    }
    
    @Override
    public final void g(final long n, final Instant instant) {
        this.k.execute(new dco(this, n, instant, 4));
    }
    
    @Override
    public final void h(final hin hin, final Instant instant, final hio hio) {
        this.k.execute(new dcq(this, hin, instant, hio));
    }
    
    @Override
    public final void i(final Collection collection, final Instant instant) {
        this.k.execute(new dcm(this, collection, instant));
    }
    
    public final void l(final long n, final Instant instant, final String s) {
        try {
            final int a = this.h.a(n, instant.toEpochMilli());
            if (a == 1) {
                this.i.b(j(n, instant, s));
                return;
            }
            this.d.d(ksc.c("logImpl updated %d rows for id=%d with time=%s (expected 1)", a, n, instant));
        }
        catch (final SQLiteException ex) {
            this.d.e(ksc.c("SQLite error in logImpl for id=%d time=%s msg='%s'", n, instant, s), (Throwable)ex);
            if (!this.f) {
                return;
            }
            throw ex;
        }
    }
    
    public final void m() {
        this.j.d(new dcl(this), this.l, TimeUnit.SECONDS);
        this.l = dcs.b.getSeconds();
    }
}
