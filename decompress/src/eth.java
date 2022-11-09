import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import android.os.SystemClock;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eth implements gxc
{
    private static final nsd c;
    public final LocalSessionStorage a;
    public final AtomicBoolean b;
    private final String d;
    private final File e;
    private final String f;
    private final Semaphore g;
    private volatile boolean h;
    private final List i;
    private final eyt j;
    private final drs k;
    private final int l;
    private final dqx m;
    
    static {
        c = nsd.g("com/google/android/apps/camera/legacy/lightcycle/panorama/processing/LightCycleStitchTask");
    }
    
    public eth(final LocalSessionStorage a, final eyt j, final drs k, final dqx m) {
        this.g = new Semaphore(0);
        this.h = false;
        this.b = new AtomicBoolean();
        this.a = a;
        this.j = j;
        this.d = a.e;
        this.e = a.b.d.a();
        this.f = a.b.s();
        this.l = a.j;
        this.k = k;
        this.m = m;
        this.i = new ArrayList();
    }
    
    @Override
    public final String b() {
        final String value = String.valueOf(this.a.b.h());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 21);
        sb.append("LightCycleStitchTask-");
        sb.append(value);
        return sb.toString();
    }
    
    @Override
    public final void c(final kqq kqq) {
        kqq.getClass();
        this.i.add(kqq);
    }
    
    @Override
    public final void d(Context b) {
        this.b.set(false);
        try {
            this.h();
            final int b2 = esh.b();
            final File e = this.e;
            final long length = e.length();
            this.a.b.b(krd.b);
            esh.c.put(b2, new etg(this, length, e));
            final long uptimeMillis = SystemClock.uptimeMillis();
            esh.x(b2);
            final Map b3 = eue.b(this.a.h);
            final float a = eue.a(b3);
            int l = this.l;
            final int n = 2;
            boolean b4 = false;
            Label_0129: {
                if (l == 2) {
                    if (a == 360.0f) {
                        l = 2;
                        b4 = true;
                        break Label_0129;
                    }
                    l = 2;
                }
                b4 = false;
            }
            final boolean b5 = (l == 1 && a >= 70.0f) || b4;
            final long uptimeMillis2 = SystemClock.uptimeMillis();
            final int i = this.l;
            final int n2 = 12;
            int n3;
            int n4;
            if (i == 2) {
                n3 = n;
                n4 = n2;
            }
            else if (i == 3) {
                n3 = 3;
                n4 = n2;
            }
            else if (i == 5) {
                n3 = 5;
                n4 = n2;
            }
            else if (i == 4) {
                n3 = 4;
                n4 = n2;
            }
            else {
                n4 = 6;
                n3 = 1;
            }
            final eyt j = this.j;
            this.f.concat(".jpg");
            j.al(n4, n3, (uptimeMillis2 - uptimeMillis) * 0.001f, a);
            final boolean b6 = this.l == 1 || b4;
            final him h = this.a.b.h();
            final niz b7 = this.m.b(h);
            niz niz = nii.a;
            if (b7.g()) {
                final long a2 = ((dqu)b7.c()).a.a;
                final niz a3 = this.k.a(a2);
                if (a3.g()) {
                    niz = niz.i(((drk)a3.c()).c());
                }
                else {
                    eth.c.b().E(1412).q("special type not found for mediastore id = %d", a2);
                }
            }
            else {
                a.k(eth.c.b(), "no processing media found for shot %s", h, '\u0583');
            }
            eue.c(this.e.getPath(), b3, this.d, b5, b6, niz, this.a.b.d(), this.l == 1);
            synchronized (this.b) {
                this.b.set(true);
                this.a.b.B();
                this.a.b.G();
                final Iterator<Object> iterator = nns.j(this.i).iterator();
                while (iterator.hasNext()) {
                    iterator.next().a(this);
                }
            }
        }
        finally {
            b = (Context)this.b;
            monitorenter(b);
            try {
                this.b.set(true);
                this.a.b.B();
                this.a.b.G();
                final Iterator<Object> iterator2 = nns.j(this.i).iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().a(this);
                }
                monitorexit(b);
            }
            finally {
                monitorexit(b);
                while (true) {}
            }
        }
    }
    
    @Override
    public final void e(final kqq kqq) {
        kqq.getClass();
        this.i.remove(kqq);
    }
    
    @Override
    public final void f() {
        synchronized (this) {
            this.h = false;
            this.g.release();
        }
    }
    
    @Override
    public final void g() {
        synchronized (this) {
            this.g.drainPermits();
            this.h = true;
        }
    }
    
    public final void h() {
        if (this.h) {
            try {
                this.g.acquire();
            }
            catch (final InterruptedException ex) {
                a.m(eth.c.c(), "Failed to acquire waitLock.", '\u0585', ex);
            }
        }
    }
}
