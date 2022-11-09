import java.util.concurrent.TimeUnit;
import java.util.Collection;
import java.util.Iterator;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kuq implements ktc
{
    public final Object a;
    public kun b;
    public final List c;
    private final kue d;
    private final kuu e;
    private final Executor f;
    private final kso g;
    private final kse h;
    private final krr i;
    private final kuf j;
    private final deh k;
    private final ktj l;
    
    public kuq(final ktj l, final deh k, final kue d, final Executor f, final kuu e, final kso g, final kse h, final krr krr, final kuf j) {
        this.a = new Object();
        this.c = new ArrayList();
        this.l = l;
        this.k = k;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = krr.a("VirtualCameraMgr");
        this.j = j;
    }
    
    private final void f(final lfj lfj, final ktb ktb) {
        synchronized (this.a) {
            final kun b = this.b;
            if (b != null) {
                if (b.a.equals(lfj)) {
                    if (ktb != null) {
                        final krr i = this.i;
                        final String value = String.valueOf(b);
                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 46);
                        sb.append("Attaching listener to existing CameraSession: ");
                        sb.append(value);
                        i.b(sb.toString());
                        b.e(ktb);
                    }
                    else {
                        final krr j = this.i;
                        final String value2 = String.valueOf(b);
                        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 39);
                        sb2.append("Has existing CameraSession. Noop Open: ");
                        sb2.append(value2);
                        j.b(sb2.toString());
                    }
                    return;
                }
                this.c.add(b);
                b.f();
                this.b = null;
            }
            final kue d = this.d;
            Object b2 = d.b;
            synchronized (b2) {
                final boolean a = d.d.a();
                monitorexit(b2);
                if (a) {
                    if (ktb != null) {
                        final Executor f = this.f;
                        b2 = new kuj(ktb, 1);
                        f.execute((Runnable)b2);
                    }
                    this.i.b("WakeLock is yet to be acquired. Cannot open.");
                    return;
                }
                final ktj l = this.l;
                final String a2 = lfj.a;
                final Handler handler = (Handler)l.a.get();
                handler.getClass();
                final Executor executor = (Executor)l.b.get();
                executor.getClass();
                b2 = ((egk)l.c).a();
                final ktm ktm = (ktm)l.d.get();
                ktm.getClass();
                final kse kse = (kse)l.e.get();
                kse.getClass();
                a2.getClass();
                b2 = new kun(lfj, this, new kti(handler, executor, (CameraManager)b2, ktm, kse, a2), this.e, this.f, this.g, this.i, this.h, this.j, this.d.a());
                synchronized (b2) {
                    Label_0672: {
                        if (!((kun)b2).g && !((kun)b2).e) {
                            if (!((kun)b2).f) {
                                ((kun)b2).g = true;
                                monitorexit(b2);
                                final krr d2 = ((kun)b2).d;
                                final String value3 = String.valueOf(b2);
                                final StringBuilder sb3 = new StringBuilder(String.valueOf(value3).length() + 8);
                                sb3.append(value3);
                                sb3.append(" Opening");
                                d2.b(sb3.toString());
                                ((kun)b2).b.e((ktb)b2);
                                final ktd c = ((kun)b2).c;
                                Object g = ((kti)c).g;
                                synchronized (g) {
                                    if (!((kti)c).k && !((kti)c).l) {
                                        ((kti)c).k = true;
                                        monitorexit(g);
                                        final Executor d3 = ((kti)c).d;
                                        g = new kte((kti)c);
                                        d3.execute((Runnable)g);
                                    }
                                    break Label_0672;
                                }
                            }
                        }
                        monitorexit(b2);
                    }
                    if (ktb != null) {
                        ((kun)b2).e(ktb);
                    }
                    this.b = (kun)b2;
                    monitorexit(this.a);
                    this.k.a(lfj);
                }
            }
        }
    }
    
    @Override
    public final void a() {
        final Object a = this.a;
        monitorenter(a);
        try {
            final kun b = this.b;
            if (b != null) {
                this.c.add(b);
                this.b = null;
            }
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ((kun)iterator.next()).f();
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void b() {
        final Object a = this.a;
        monitorenter(a);
        try {
            final kun b = this.b;
            if (b != null) {
                this.c.add(b);
                this.b = null;
            }
            monitorexit(a);
            while (true) {
                Object a2 = this.a;
                synchronized (a2) {
                    final nns j = nns.j(this.c);
                    monitorexit(a2);
                    for (int size = j.size(), i = 0; i < size; ++i) {
                        a2 = j.get(i);
                        try {
                            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
                            ((kun)a2).f();
                            final ktd c = ((kun)a2).c;
                            synchronized (((kti)c).g) {
                                if (!((kti)c).k) {
                                    monitorexit(((kti)c).g);
                                }
                                else {
                                    monitorexit(((kti)c).g);
                                    ((kti)c).j.await(1500L, milliseconds);
                                }
                                ((kun)a2).b.b.await(1500L, milliseconds);
                            }
                        }
                        catch (final InterruptedException ex) {
                            final krr k = this.i;
                            final String value = String.valueOf(a2);
                            a2 = new StringBuilder(String.valueOf(value).length() + 40);
                            ((StringBuilder)a2).append("Warning: Failed to synchronously close ");
                            ((StringBuilder)a2).append(value);
                            ((StringBuilder)a2).append(".");
                            k.i(((StringBuilder)a2).toString(), ex);
                        }
                    }
                    if (j.isEmpty()) {
                        return;
                    }
                    continue;
                }
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void c(final lfj lfj, final ktb ktb) {
        this.f(lfj, ktb);
    }
    
    @Override
    public final void d(final lfj lfj) {
        this.f(lfj, null);
    }
    
    public final void e(final kun kun) {
        synchronized (this.a) {
            if (this.b == kun) {
                this.b = null;
            }
            if (!this.c.contains(kun)) {
                this.c.add(kun);
            }
        }
    }
}
