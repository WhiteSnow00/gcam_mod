import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fhf implements fhb
{
    private static final nsd t;
    private final AtomicLong A;
    private final AtomicLong B;
    private final AtomicLong C;
    private final AtomicLong D;
    private final AtomicLong E;
    private final AtomicLong F;
    private final AtomicLong G;
    private final AtomicLong H;
    private dsc I;
    private final AtomicInteger J;
    private long K;
    private List L;
    private final jdr M;
    public final fev a;
    public final fha b;
    public final fgk c;
    public final Handler d;
    public final Handler e;
    public final niz f;
    public volatile boolean g;
    public final AtomicLong h;
    public final AtomicLong i;
    public final AtomicLong j;
    public final AtomicLong k;
    public final AtomicInteger l;
    public final AtomicInteger m;
    public final lyp n;
    public final fhj o;
    public lzr p;
    public maq q;
    public boolean r;
    public boolean s;
    private final AtomicBoolean u;
    private final niz v;
    private final lyb w;
    private final fgj x;
    private ffy y;
    private volatile fhi z;
    
    static {
        t = nsd.g("com/google/android/apps/camera/microvideo/encoder/VideoTrackSamplerImpl");
    }
    
    public fhf(final dsd dsd, final fev a, final fha b, final fgj x, final fgk c, final niz f, final fhl fhl, final cxl cxl) {
        this.M = jxc.m((int)TimeUnit.SECONDS.convert(3000000L, TimeUnit.MICROSECONDS) * 60);
        this.u = new AtomicBoolean(false);
        this.w = lyb.b();
        this.g = false;
        this.A = new AtomicLong();
        this.B = new AtomicLong();
        this.h = new AtomicLong();
        this.i = new AtomicLong();
        this.j = new AtomicLong();
        this.C = new AtomicLong();
        this.D = new AtomicLong();
        this.E = new AtomicLong();
        this.F = new AtomicLong();
        this.k = new AtomicLong();
        this.G = new AtomicLong();
        this.H = new AtomicLong();
        this.l = new AtomicInteger();
        this.m = new AtomicInteger();
        this.J = new AtomicInteger();
        this.r = false;
        this.s = false;
        this.K = 0L;
        this.L = new ArrayList();
        final cxo a2 = cxw.a;
        cxl.e();
        this.a = a;
        this.b = b;
        this.x = x;
        this.c = c;
        this.e = kpo.e(new kjk(), "mv-vid-encode");
        this.d = kpo.e(new kjk(), "mv-vid-update");
        this.f = f;
        cxl.b();
        final lyp a3 = dsd.a("stabilized-vid-track");
        this.n = a3;
        cxl.b();
        this.o = new fhj(a3);
        final dsc i = new dsc(a3, 1);
        this.I = i;
        this.p = i.a();
        this.q = this.I.b(Collections.singletonList(lyb.b()));
        niz v;
        if (!fhl.b.c(fhl.c.l())) {
            v = nii.a;
        }
        else {
            v = niz.i(fhl.a);
        }
        this.v = v;
        cxl.b();
        final cxo a4 = cxr.a;
        cxl.c();
    }
    
    private final ffw i(final long n) {
        synchronized (this.M) {
            krc krc = this.M.a(n);
            if (krc == null) {
                krc = new ffw(n, ofn.f(), ofn.f());
                this.M.e(n, (Object)krc);
            }
            return (ffw)krc;
        }
    }
    
    private final void j() {
        this.s = false;
        this.c.b(false);
        this.h();
        this.A.set(0L);
        this.B.set(0L);
        this.h.set(0L);
        this.i.set(0L);
        this.C.set(0L);
        this.E.set(0L);
        this.F.set(0L);
    }
    
    @Override
    public final void a(final long n) {
        this.i(n).b.cancel(true);
        this.d.post((Runnable)new fhd(this, 4));
    }
    
    @Override
    public final void b(final long n, final List list) {
        if (this.g) {
            return;
        }
        this.i(n).b.o(list);
        this.d.post((Runnable)new fhd(this, 4));
    }
    
    @Override
    public final void c(final lup lup, final ffy y) {
        synchronized (this) {
            this.y = y;
            this.x.b(lup, this.n, new fhe(this, y), this.e);
            this.c.b(true);
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            if (this.g) {
                a.l(fhf.t.c(), "Trying to close after handler shutdown", '\u067e');
                monitorexit(this);
                return;
            }
            final Iterator iterator = this.a.f(this.K).iterator();
            while (iterator.hasNext()) {
                ((ffs)this.f.c()).b((long)iterator.next());
                this.d();
            }
            this.d.post((Runnable)new fhd(this, 1));
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void d() {
        if (this.g) {
            return;
        }
        this.d.post((Runnable)new fhd(this, 4));
    }
    
    @Override
    public final void e() {
        if (this.g) {
            a.l(fhf.t.c(), "Trying to start after handler shutdown", '\u0687');
            return;
        }
        this.d.post((Runnable)new fhd(this, 3));
    }
    
    public final void f() {
        if (this.u.getAndSet(true)) {
            a.l(fhf.t.c(), "Shutdown already called. Skipping additional requests.", '\u0686');
            return;
        }
        this.h();
        final fgj x = this.x;
        oey oey;
        if (x != null) {
            oey = x.a();
        }
        else {
            oey = ofi.n(null);
        }
        flj.a("VideoTrackSampler", oey);
        oey.d(new fhd(this, 2), odx.a);
    }
    
    public final void g() {
        if (Thread.currentThread().getId() != this.d.getLooper().getThread().getId()) {
            a.l(fhf.t.c(), "Sampling video on a non-video-encoder thread", '\u0688');
        }
        final long a = this.a.a();
        if (a != -1L) {
            this.G.set(a);
        }
        final ffy y = this.y;
        if (this.x.c() && y != null) {
            if (this.s) {
                final lju b = this.a.b(this.K);
                Label_0136: {
                    if (b == null) {
                        break Label_0136;
                    }
                    try {
                        this.H.set(b.d());
                        break Label_0136;
                    }
                    finally {
                        if (b != null) {
                            try {
                                b.close();
                            }
                            finally {
                                final Throwable t;
                                final Throwable t2;
                                t.addSuppressed(t2);
                            }
                        }
                        long convert;
                        ffx a2 = null;
                        long d = 0L;
                        boolean d2;
                        ffw i;
                        boolean b2;
                        long d3;
                        ffx ffx;
                        long convert2;
                        boolean b3;
                        List<Object> unmodifiableList;
                        lyb w;
                        ArrayList<lyb> list;
                        int n;
                        Object o;
                        List<lyb> list2;
                        lyb lyb;
                        Iterator<lyb> iterator;
                        int size;
                        dsc k;
                        long d4;
                        fha b4;
                        boolean b5;
                        Label_0950:Block_17_Outer:
                        while (true) {
                            Block_22: {
                                while (true) {
                                Label_0280:
                                    while (true) {
                                        Label_0935:Label_0233_Outer:
                                        while (true) {
                                            Block_13: {
                                                while (true) {
                                                Block_10:
                                                    while (true) {
                                                        iftrue(Label_0156:)(!this.r);
                                                        break Block_10;
                                                        iftrue(Label_0950:)(!this.r);
                                                        break Block_22;
                                                        continue Label_0935;
                                                        a2 = y.a(convert);
                                                        iftrue(Label_0280:)(!a2.b());
                                                        break Block_13;
                                                        iftrue(Label_0157:)(b != null);
                                                        continue Label_0233_Outer;
                                                    }
                                                    this.j();
                                                    this.f();
                                                    return;
                                                    Label_0157: {
                                                        d = b.d();
                                                    }
                                                    convert = TimeUnit.MICROSECONDS.convert(d, TimeUnit.NANOSECONDS);
                                                    iftrue(Label_0233:)(this.C.get() > 0L && d - this.C.get() <= 5000000000L && d >= this.C.get());
                                                    this.C.set(d);
                                                    this.h();
                                                    continue Block_17_Outer;
                                                }
                                                Label_0156: {
                                                    return;
                                                }
                                            }
                                            this.K = d;
                                            this.d.post((Runnable)new fhd(this, 4));
                                            break Label_0280;
                                            Label_0362: {
                                                b2 = (d2 && !i.b.isCancelled());
                                            }
                                            d3 = b.d();
                                            try {
                                                ffx = (ffx)ofi.u(i.c);
                                                convert2 = TimeUnit.MICROSECONDS.convert(i.a, TimeUnit.NANOSECONDS);
                                                if ((ffx.a & 0x1) != 0x0) {
                                                    new fhr(convert2, 1);
                                                    flj.b();
                                                    b3 = (b2 || this.v.g());
                                                    if (b3) {
                                                        if (b2) {
                                                            unmodifiableList = (List)ofi.u(i.b);
                                                        }
                                                        else {
                                                            w = this.w;
                                                            list = new ArrayList<lyb>(1);
                                                            for (int j = n; j <= 0; ++j) {
                                                                o = (new Object[] { w })[j];
                                                                o.getClass();
                                                                list.add((lyb)o);
                                                            }
                                                            unmodifiableList = Collections.unmodifiableList((List<?>)list);
                                                        }
                                                        this.L = unmodifiableList;
                                                        list2 = (List<lyb>)unmodifiableList;
                                                        if (this.v.g()) {
                                                            list2 = new ArrayList<lyb>(unmodifiableList.size());
                                                            lyb = (lyb)this.v.c();
                                                            iterator = unmodifiableList.iterator();
                                                            while (iterator.hasNext()) {
                                                                list2.add(iterator.next().c(lyb));
                                                            }
                                                        }
                                                        size = list2.size();
                                                        k = this.I;
                                                        if (k == null || k.a != size) {
                                                            this.I = new dsc(this.n, size);
                                                            this.p.close();
                                                            this.p = this.I.a();
                                                        }
                                                        this.q.close();
                                                        this.q = this.I.b(list2);
                                                    }
                                                    this.J.incrementAndGet();
                                                    this.K = i.a;
                                                    if (b3) {
                                                        this.x.e(b, new fhc(this));
                                                    }
                                                    else {
                                                        this.x.d(b);
                                                    }
                                                    this.B.incrementAndGet();
                                                    d4 = b.d();
                                                    b4 = this.b;
                                                    if (b4 != null) {
                                                        if (d2) {
                                                            b4.e(d4, this.L);
                                                            this.E.incrementAndGet();
                                                        }
                                                        else {
                                                            b4.d(d4);
                                                            this.F.incrementAndGet();
                                                        }
                                                    }
                                                    this.d.post((Runnable)new fhd(this, 4));
                                                }
                                                else {
                                                    this.A.incrementAndGet();
                                                    this.D.set(d3);
                                                }
                                                if (ffx.c()) {
                                                    this.j();
                                                }
                                                break Label_0950;
                                            }
                                            catch (final ExecutionException ex) {
                                                throw new AssertionError((Object)"Future expected to be in done state but was not.");
                                            }
                                            continue Label_0935;
                                        }
                                        b.close();
                                        return;
                                        iftrue(Label_0362:)(!i.c.isCancelled());
                                        continue Block_17_Outer;
                                    }
                                    i = this.i(d);
                                    i.c.o(a2);
                                    d2 = a2.d();
                                    n = 0;
                                    b5 = (d2 && !i.b.isDone());
                                    iftrue(Label_0935:)(!i.c.isDone() || b5);
                                    continue;
                                }
                            }
                            this.j();
                            this.f();
                            continue Label_0950;
                        }
                    }
                }
            }
        }
    }
    
    public final void h() {
        this.A.get();
        this.B.get();
        this.h.get();
        this.i.get();
        this.j.get();
        this.E.get();
        this.F.get();
        this.G.get();
        this.H.get();
        this.D.get();
        this.l.get();
    }
}
