import java.util.concurrent.TimeUnit;
import j$.util.function.Predicate;
import j$.util.Collection$_EL;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import j$.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.Map;
import j$.time.Clock;
import java.util.concurrent.atomic.AtomicBoolean;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

final class dce implements dck
{
    static final Duration a;
    static final Duration b;
    public final AtomicBoolean c;
    public final krr d;
    public final kse e;
    public final Clock f;
    public final Duration g;
    public final dcj h;
    public final Map i;
    private final AtomicBoolean k;
    private final kjm l;
    private final ScheduledExecutorService m;
    
    static {
        a = Duration.ofSeconds(5L);
        b = Duration.ofSeconds(2L);
    }
    
    public dce(final brk brk, final kjm l, final krr krr, final kse e, final Clock f, final Duration g, final ScheduledExecutorService m, final dcj h) {
        this.c = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.i = new HashMap();
        this.l = l;
        this.d = krr.a("ShotTracker");
        this.e = e;
        this.f = f;
        this.g = g;
        this.m = m;
        this.h = h;
        brk.a(new dcb(this));
    }
    
    private final void k(final long n) {
        synchronized (this) {
            this.i.remove(n);
        }
    }
    
    public final dcc a(final long n) {
        synchronized (this) {
            final dcc dcc = this.i.get(n);
            monitorexit(this);
            if (dcc != null) {
                return dcc;
            }
            return new dcd(this, n);
        }
    }
    
    @Override
    public final void b() {
        if (this.k.compareAndSet(false, true)) {
            this.d.f("running checkForLostShotsAndNotifyIfFound");
            final Instant instant = this.f.instant();
            try {
                final List list = this.h.a().get();
                final HashSet set = new HashSet();
                synchronized (this) {
                    for (final long longValue : list) {
                        final Map i = this.i;
                        final Long value = longValue;
                        if (!i.containsKey(value)) {
                            set.add(value);
                        }
                    }
                    monitorexit(this);
                    for (final Long n : set) {
                        this.d.b(ksc.c("marking shot %d as newly lost", n));
                        this.h.e(n, instant);
                    }
                    final int size = set.size();
                }
            }
            catch (final InterruptedException instant) {}
            catch (final ExecutionException ex) {}
            final krr d = this.d;
            final String value2 = String.valueOf(instant);
            final StringBuilder sb = new StringBuilder(String.valueOf(value2).length() + 46);
            sb.append("best effort failed to fetch unfinished shots: ");
            sb.append(value2);
            d.h(sb.toString());
            final int size = 0;
            if (size > 0) {
                this.d.h(ksc.c("Detected %d newly lost shots", size));
                this.j();
            }
            return;
        }
        this.d.b("oneShotCheckForLostShotsAndNotifyIfFound (requested but already done)");
    }
    
    @Override
    public final void c(final long n, final String s) {
        this.a(n).b(s);
    }
    
    @Override
    public final void d(final long n, final String s) {
        final Instant instant = this.f.instant();
        synchronized (this) {
            final ArrayList list = new ArrayList(this.i.keySet());
            monitorexit(this);
            Collection$_EL.removeIf((Collection)list, (Predicate)new dca(n));
            this.m.execute(new dbz(this, list, n, instant, s));
        }
    }
    
    @Override
    public final void e(final long n) {
        final krr d = this.d;
        final StringBuilder sb = new StringBuilder(35);
        sb.append("onShotCanceled ");
        sb.append(n);
        d.b(sb.toString());
        this.a(n).a();
        this.k(n);
    }
    
    @Override
    public final void f(final long n, final Integer n2) {
        this.a(n).f(n2);
    }
    
    @Override
    public final void g(final long n) {
        final krr d = this.d;
        final StringBuilder sb = new StringBuilder(36);
        sb.append("onShotPersisted ");
        sb.append(n);
        d.b(sb.toString());
        this.a(n).h();
        this.k(n);
    }
    
    @Override
    public final void h(final hin hin, final hio hio) {
        final krr d = this.d;
        final String value = String.valueOf(hin);
        final String value2 = String.valueOf(hio);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 15 + String.valueOf(value2).length());
        sb.append("onShotStarted ");
        sb.append(value);
        sb.append(" ");
        sb.append(value2);
        d.b(sb.toString());
        synchronized (this) {
            final dcc dcc = this.i.get(hin.b);
            dcc dcc3;
            if (dcc == null) {
                final dcc dcc2 = new dcc(this, hin, this.f.instant(), hio);
                final boolean empty = this.i.isEmpty();
                this.i.put(hin.b, dcc2);
                if (empty && this.c.compareAndSet(false, true)) {
                    this.i(0);
                }
                monitorexit(this);
                dcc3 = dcc2;
            }
            else {
                monitorexit(this);
                final String value3 = String.valueOf(hin);
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value3).length() + 40);
                sb2.append("create() on a shot that already exists: ");
                sb2.append(value3);
                dcc.b(sb2.toString());
                dcc3 = dcc;
            }
            dcc3.i();
        }
    }
    
    final void i(final int n) {
        this.m.schedule(new dby(this, n), dce.a.getSeconds(), TimeUnit.SECONDS);
    }
    
    final void j() {
        final krr d = this.d;
        final boolean c = kjm.c();
        final StringBuilder sb = new StringBuilder(17);
        sb.append("mainThread? ");
        sb.append(c);
        d.b(sb.toString());
        this.l.b(new dbx(this));
    }
}
