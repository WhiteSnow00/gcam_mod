import java.util.concurrent.TimeUnit;
import android.graphics.Rect;
import java.util.Arrays;
import java.util.ArrayList;
import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Deque;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffv implements ffs
{
    public static final nsd a;
    public final AtomicLong b;
    public final Object c;
    public egv d;
    private final dpy e;
    private final jcx f;
    private final kre g;
    private final Set h;
    private final List i;
    private final AtomicLong j;
    private final lgr k;
    private final boolean l;
    private final kse m;
    private final Map n;
    private final liz o;
    private final Deque p;
    private int q;
    private lgq r;
    private boolean s;
    private gzn t;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/encoder/EisFrameFeederImpl");
    }
    
    public ffv(final kre g, final jcx f, final dpy e, final lfg lfg, final lgr k, final cxl cxl, final liz o, final kse m) {
        this.h = new HashSet();
        this.i = new LinkedList();
        this.b = new AtomicLong();
        this.j = new AtomicLong();
        this.n = new HashMap();
        this.c = new Object();
        this.p = new ArrayDeque();
        boolean l = false;
        this.s = false;
        this.t = null;
        this.u = 0L;
        this.v = 0L;
        this.w = -1L;
        this.x = -1L;
        this.y = -1L;
        this.g = g;
        this.e = e;
        this.f = f;
        this.k = k;
        this.o = o;
        if (lfg.l() == lfu.a) {
            l = true;
        }
        this.l = l;
        final cxo a = cxw.a;
        cxl.b();
        this.m = m;
    }
    
    private final void g(final long n) {
        final Iterator iterator = this.h.iterator();
        while (iterator.hasNext()) {
            ((ffr)iterator.next()).a(n);
        }
    }
    
    private final void h(final gzn gzn) {
        final long b = gzn.b;
        final long c = gzn.c;
        final long d = gzn.d;
        Rect rect;
        if ((rect = gzn.n) == null) {
            rect = gzn.s;
        }
        final long n = gzn.s.height();
        final long n2 = rect.height() * d / n;
        final long n3 = d * rect.top / n + b + c / 2L;
        this.n.put(n3, b);
        final int width = rect.width();
        final int width2 = gzn.s.width();
        final SizeF sizeF = (SizeF)this.f.a(gzn.a).m(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        sizeF.getClass();
        final float n4 = width / (float)width2 * (sizeF.getWidth() / gzn.g);
        final float[] array = new float[this.q * 9];
        final Object c2 = this.c;
        monitorenter(c2);
        try {
            final egv d2 = this.d;
            long g2;
            if (d2 != null) {
                d2.d(gzn.s.width(), gzn.s.height());
                this.d.e(rect.width(), rect.height());
                final egv d3 = this.d;
                final kre g = this.g;
                g2 = d3.g(null, g.a, g.b, n3, n3, c, n2, n4, 1.0f, n4, null, null, array);
            }
            else {
                ffv.a.b().E(1628).o("processCameraMetadata called with a null eisNativeWrapper.");
                g2 = -1L;
            }
            monitorexit(c2);
            if (g2 == -1L) {
                ++this.x;
                return;
            }
            if (g2 < -1L) {
                final long n5 = -g2;
                final Long n6 = this.n.get(n5);
                if (n6 == null) {
                    ffv.a.b().E(1632).q("eis timestamp does not exist: %d", n5);
                    return;
                }
                ++this.y;
                ffv.a.b().E(1631).w("processFrame failed and dropped stabilization for t=%d (cnt=%d)", n6, this.y);
                this.g(n6);
            }
            else {
                final Long n7 = this.n.get(g2);
                if (n7 == null) {
                    ffv.a.b().E(1630).q("processFrame returned unexpected EIS timestamp %d", g2);
                    return;
                }
                final long longValue = n7;
                final ArrayList list = new ArrayList();
                int n8;
                for (int i = 0; i < this.q; i = n8) {
                    n8 = i + 1;
                    list.add(lyb.a(Arrays.copyOfRange(array, i * 9, n8 * 9)));
                }
                final Iterator iterator = this.h.iterator();
                while (iterator.hasNext()) {
                    ((ffr)iterator.next()).b(longValue, list);
                }
                ++this.v;
                final long w = this.w;
                if (w != 0L && longValue >= w && longValue - w < 15000000000L) {
                    return;
                }
                this.n.size();
                this.w = longValue;
            }
        }
        finally {
            monitorexit(c2);
            while (true) {}
        }
    }
    
    @Override
    public final void a(final ffr ffr) {
        synchronized (this) {
            this.h.add(ffr);
        }
    }
    
    @Override
    public final void b(final long u) {
        monitorenter(this);
        try {
            if (this.s && u >= this.u) {
                this.u = u;
                final lgq r = this.r;
                if (r != null) {
                    r.b(1L + this.b.get(), u, new fft(this));
                }
                final long n = -1L + u;
                this.b.compareAndSet(0L, n);
                this.j.compareAndSet(0L, n);
                this.i.add(u);
                final long value = this.b.get();
                final long value2 = this.j.get();
                while (this.i.size() > 1) {
                    final long longValue = this.i.get(1);
                    final long value3 = this.b.get();
                    if (u < value + 1000000000L && value3 < longValue) {
                        break;
                    }
                    final long value4 = this.j.get();
                    if (u < value2 + 1000000000L && value4 < longValue) {
                        break;
                    }
                    final long longValue2 = this.i.remove(0);
                    final gzn a = this.e.a(longValue2);
                    if (a != null) {
                        this.h(a);
                        this.t = a;
                    }
                    else {
                        this.g(longValue2);
                    }
                }
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void c(final long n, final float n2, final float n3) {
        synchronized (this) {
            synchronized (this.c) {
                final egv d = this.d;
                if (d != null) {
                    d.i(n2, n3, n);
                }
                else if (!this.p.isEmpty() && this.p.getFirst().a - n >= 5000000000L) {
                    ffv.a.c().E(1639).q("Dropping lens offset at %d; should we be listening to this?", n);
                }
                else {
                    this.p.addLast(new ffu(n, n2, n3));
                }
                monitorexit(this.c);
                this.j.set(n);
            }
        }
    }
    
    @Override
    public final void d(final ffr ffr) {
        synchronized (this) {
            this.h.remove(ffr);
        }
    }
    
    @Override
    public final void e() {
        monitorenter(this);
        try {
            synchronized (this.c) {
                final liz o = this.o;
                egw egw;
                if (o.b()) {
                    egw = egw.a;
                }
                else if (o.c()) {
                    egw = egw.b;
                }
                else if (o.d()) {
                    egw = egw.c;
                }
                else if (o.e()) {
                    egw = egw.f;
                }
                else if (o.g()) {
                    egw = egw.h;
                }
                else if (o.f()) {
                    egw = egw.d;
                }
                else if (o.e) {
                    egw = egw.g;
                }
                else if (o.h) {
                    egw = egw.h;
                }
                else {
                    if (!o.h() && !o.k) {
                        throw new RuntimeException("EisFrameFeeder stabilization does not recognize this device. Aborting.");
                    }
                    egw = egw.i;
                }
                final kre g = this.g;
                final egv d = hjf.d(egw, g.a, g.b, 0.5f, this.l);
                this.d = d;
                this.q = d.b();
                d.j();
                if (!this.p.isEmpty()) {
                    final long a = this.p.getLast().a;
                    final long a2 = this.p.getFirst().a;
                    this.p.size();
                    TimeUnit.NANOSECONDS.toMillis(a - a2);
                    while (!this.p.isEmpty()) {
                        final ffu ffu = this.p.removeFirst();
                        d.i(ffu.b, ffu.c, ffu.a);
                    }
                }
                monitorexit(this.c);
                this.r = this.k.a("mv-eis");
                this.s = true;
                this.v = 0L;
                this.x = 0L;
                this.y = 0L;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void f() {
        monitorenter(this);
        try {
            this.m.f("EisFrameFeeder#stop");
            this.m.f("flushFrames");
            while (!this.i.isEmpty()) {
                final gzn a = this.e.a(this.i.remove(0));
                if (a != null) {
                    this.t = a;
                }
                gzn t;
                if ((t = a) == null) {
                    t = this.t;
                }
                if (t != null) {
                    this.h(t);
                }
            }
            final Iterator iterator = this.n.values().iterator();
            while (iterator.hasNext()) {
                this.g((long)iterator.next());
            }
            this.n.clear();
            this.m.g();
            final lgq r = this.r;
            if (r != null) {
                r.close();
                this.r = null;
            }
            synchronized (this.c) {
                final egv d = this.d;
                if (d != null) {
                    d.c();
                    this.d = null;
                }
                else {
                    ffv.a.b().E(1637).o("stop called with a null eisNativeWrapper");
                }
                monitorexit(this.c);
                this.s = false;
                this.m.g();
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
