import android.view.KeyEvent;
import android.content.IntentFilter;
import java.util.Iterator;
import android.content.Context;
import android.content.BroadcastReceiver;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eiq implements exn, exl, exj, exm, evz, ewa
{
    public static final nsd a;
    public final Set b;
    public final Set c;
    public final eyt d;
    public final Object e;
    public int f;
    private final hlj g;
    private final nlf h;
    private final klv i;
    private final klv j;
    private final klv k;
    private final klv l;
    private final klv m;
    private final klv n;
    private final cxl o;
    private final Executor p;
    private final aec q;
    private boolean r;
    private final BroadcastReceiver s;
    
    static {
        a = nsd.g("com/google/android/apps/camera/keycontrol/KeyController");
    }
    
    public eiq(final hlj g, final Context context, final nlf h, final klv i, final klv j, final klv k, final klv l, final klv m, final klv n, final cxl o, final eyt d, final Executor p12) {
        this.b = nrr.m();
        this.c = nrr.m();
        this.e = new Object();
        this.s = new eio(this);
        this.g = g;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.h = h;
        this.d = d;
        this.p = p12;
        this.q = aec.a(context);
    }
    
    private final boolean j(final int n, final boolean b) {
        final eik a = eik.a;
        final hli a2 = hli.a;
        final int ordinal = ((hli)this.g.aQ()).ordinal();
        boolean b2 = false;
        switch (ordinal) {
            default: {
                return false;
            }
            case 3: {
                return true;
            }
            case 2: {
                return false;
            }
            case 1: {
                if (n == 25) {
                    synchronized (this.e) {
                        final Iterator iterator = this.b.iterator();
                        while (iterator.hasNext()) {
                            ((eip)iterator.next()).f(b);
                        }
                        return true;
                    }
                }
                synchronized (this.e) {
                    final Iterator iterator2 = this.b.iterator();
                    while (iterator2.hasNext()) {
                        ((eip)iterator2.next()).e(b);
                    }
                    return true;
                }
            }
            case 0: {
                final Object e = this.e;
                monitorenter(e);
                try {
                    final Iterator iterator3 = this.b.iterator();
                    while (iterator3.hasNext()) {
                        ((eip)iterator3.next()).d(b);
                        b2 = true;
                    }
                    monitorexit(e);
                    return b2;
                }
                finally {
                    monitorexit(e);
                    while (true) {}
                }
                break;
            }
        }
    }
    
    public final void a(final eip eip) {
        this.p.execute(new ein(this, eip, 1));
    }
    
    public final void b(final eip eip) {
        this.p.execute(new ein(this, eip));
    }
    
    @Override
    public final void bj() {
        this.h.k(this.i.aQ(), eik.a);
        this.h.k(this.j.aQ(), eik.b);
        this.h.k(this.k.aQ(), eik.c);
        this.h.k(this.l.aQ(), eik.d);
        this.h.k(this.m.aQ(), eik.e);
        this.h.k(this.n.aQ(), eik.f);
    }
    
    @Override
    public final void bk() {
        this.q.b(this.s, new IntentFilter("com.google.android.apps.camera.remotecontrol.remotekey"));
    }
    
    @Override
    public final void e() {
        this.q.c(this.s);
    }
    
    @Override
    public final boolean f(final int n, final KeyEvent keyEvent) {
        if (n == 22) {
            this.h(true);
            return true;
        }
        final cxl o = this.o;
        final cxo a = cxr.a;
        o.b();
        if (this.f == 3) {
            return false;
        }
        if (keyEvent.getRepeatCount() == 0) {
            this.r = false;
        }
        return this.f == 2 || this.r || ((n == 24 || n == 25 || n == 27) && this.j(n, true));
    }
    
    public final void g(int f) {
        this.f = f;
        final boolean r = this.r;
        if (f == 2) {
            f = 1;
        }
        else {
            f = 0;
        }
        this.r = ((f | (r ? 1 : 0)) != 0x0);
    }
    
    public final void h(final boolean b) {
        final Object e = this.e;
        monitorenter(e);
        try {
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((eip)iterator.next()).a(b);
            }
            monitorexit(e);
        }
        finally {
            monitorexit(e);
            while (true) {}
        }
    }
    
    @Override
    public final boolean i(final int n) {
        if (n == 22) {
            this.h(false);
            return true;
        }
        final cxl o = this.o;
        final cxo a = cxr.a;
        o.b();
        final int f = this.f;
        return f != 3 && (f == 2 || this.r || ((n == 24 || n == 25 || n == 27) && this.j(n, false)));
    }
}
