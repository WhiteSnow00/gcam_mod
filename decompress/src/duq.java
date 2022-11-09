import android.hardware.camera2.TotalCaptureResult;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import j$.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class duq
{
    public final kkz a;
    public final klj b;
    public final Supplier c;
    public final kkz d;
    public boolean e;
    private final cxl f;
    private boolean g;
    private boolean h;
    private boolean i;
    private long j;
    private final List k;
    private final klj l;
    private final hkc m;
    private final klj n;
    private final klj o;
    private final hbm p;
    private final dug q;
    private boolean r;
    
    public duq(final cxl f, final klj klj, final klj n, final klj o, final Supplier c, final hbm p10, final hkc m, final bqz bqz, final kjm kjm, final dug q) {
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = -1L;
        this.k = new CopyOnWriteArrayList();
        final Boolean value = false;
        final kkz a = new kkz(value);
        this.a = a;
        final kkz d = new kkz(value);
        this.d = d;
        this.f = f;
        this.m = m;
        this.n = n;
        this.c = c;
        this.o = o;
        this.p = p10;
        this.b = klq.d(klj, a, d);
        this.q = q;
        final cxo a2 = cxs.a;
        f.b();
        this.l = new dup(this, klj, n);
        if (f.k(cxs.W)) {
            bqz.b.c(n.a(new dun(this, c), kjm));
        }
    }
    
    private final void r(final boolean h, boolean b, final lfu lfu, final boolean b2, final boolean b3) {
        monitorenter(this);
        try {
            if (this.q.g) {
                this.h = h;
                final boolean equals = lfu.equals(lfu.a);
                final boolean b4 = false;
                if (equals || ((Integer)this.m.c(hjq.N)).equals(egz.f(1)) || this.p.a) {
                    this.h = false;
                    b = false;
                }
                final Iterator iterator = this.k.iterator();
                while (iterator.hasNext()) {
                    ((duo)iterator.next()).b(this.h && !b3);
                }
                boolean b5 = b;
                if (!b2) {
                    this.h = false;
                    b5 = false;
                }
                boolean h2;
                if ((float)this.o.aQ() < 1.0f) {
                    h2 = this.h;
                    this.h = false;
                    this.j = SystemClock.elapsedRealtimeNanos();
                    b5 = false;
                }
                else if (this.j > -1L && TimeUnit.NANOSECONDS.toSeconds(SystemClock.elapsedRealtimeNanos() - this.j) < 3L) {
                    this.h = false;
                    b5 = false;
                    h2 = b4;
                }
                else {
                    this.j = -1L;
                    h2 = b4;
                }
                final boolean h3 = this.q.h;
                if (b3) {
                    this.i = this.h;
                }
                final Iterator iterator2 = this.k.iterator();
                while (iterator2.hasNext()) {
                    ((duo)iterator2.next()).a(this.h, b5, h2, b3 ^ true);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final klj a() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final klj b() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public final klj c() {
        synchronized (this) {
            return this.l;
        }
    }
    
    public final krc d(final duo duo) {
        synchronized (this) {
            if (!this.k.contains(duo)) {
                this.k.add(duo);
                return new dum(this, duo);
            }
            return new kqz();
        }
    }
    
    public final void e(final gen gen) {
        if (this.d.d) {
            final huz k = gen.b.k();
            final okt m = nxn.e.m();
            final boolean booleanValue = (boolean)this.a().aQ();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nxn nxn = (nxn)m.b;
            nxn.a |= 0x1;
            nxn.b = booleanValue;
            final boolean booleanValue2 = (boolean)((kkz)this.b()).d;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nxn nxn2 = (nxn)m.b;
            nxn2.a |= 0x2;
            nxn2.c = booleanValue2;
            final float floatValue = (float)this.n.aQ();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nxn nxn3 = (nxn)m.b;
            nxn3.a |= 0x4;
            nxn3.d = floatValue;
            k.d((nxn)m.h());
        }
    }
    
    public final void f(final boolean b, final lfu lfu, final boolean b2, final boolean b3) {
        synchronized (this) {
            this.r(b, false, lfu, b2, b3);
        }
    }
    
    public final void g(final ljm ljm, final boolean b, final boolean b2, final lfu lfu, final boolean b3) {
        synchronized (this) {
            if (!this.r) {
                final Long n = (Long)ljm.d(TotalCaptureResult.SENSOR_EXPOSURE_TIME);
                final Integer n2 = (Integer)ljm.d(TotalCaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                final Integer n3 = (Integer)ljm.d(TotalCaptureResult.SENSOR_SENSITIVITY);
                nov.z(n);
                final long longValue = n;
                nov.z(n2);
                final int intValue = n2;
                nov.z(n3);
                boolean b4 = false;
                boolean b5 = false;
                Label_0141: {
                    if (longValue * 1.0E-6f * n3 * intValue > cxv.a(this.f, lfu) * 0.9f) {
                        if (b) {
                            b4 = true;
                            b5 = false;
                            break Label_0141;
                        }
                        if (b2) {
                            b4 = false;
                            b5 = true;
                            break Label_0141;
                        }
                    }
                    b4 = false;
                    b5 = false;
                }
                this.r(b4, b5, lfu, b3, false);
            }
        }
    }
    
    public final void h(final duo duo) {
        synchronized (this) {
            this.k.remove(duo);
        }
    }
    
    public final void i(final boolean b) {
        synchronized (this) {
            this.d.aR(b);
        }
    }
    
    public final void j(final boolean e) {
        synchronized (this) {
            this.e = e;
        }
    }
    
    public final void k(final boolean r) {
        synchronized (this) {
            this.r = r;
        }
    }
    
    public final void l(final boolean g) {
        monitorenter(this);
        try {
            if (!(this.g = g)) {
                final Iterator iterator = this.k.iterator();
                while (iterator.hasNext()) {
                    ((duo)iterator.next()).c();
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean m() {
        synchronized (this) {
            return this.h;
        }
    }
    
    public final boolean n() {
        synchronized (this) {
            return this.i;
        }
    }
    
    public final boolean o() {
        synchronized (this) {
            return this.g;
        }
    }
    
    public final void p() {
        monitorenter(this);
        try {
            final Iterator iterator = this.k.iterator();
            while (iterator.hasNext()) {
                ((duo)iterator.next()).d();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void q() {
        synchronized (this) {
            final cxl f = this.f;
            final cxo a = cxs.a;
            f.b();
        }
    }
}
