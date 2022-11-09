import java.util.Set;
import java.util.List;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lag implements krc
{
    private final lax a;
    private final kjk b;
    private final lhc c;
    private final lav d;
    private final Runnable e;
    private boolean f;
    private boolean g;
    
    public lag(final lay lay, final law law, final lhc c, final Runnable e, final lcr lcr, final lar lar) {
        this.f = false;
        this.g = false;
        this.c = c;
        this.e = e;
        final kjk b = new kjk();
        this.b = b;
        final kwg a = ((kys)lay.a).a();
        final kzx kzx = (kzx)lay.b.get();
        kzx.getClass();
        final Object value = lay.c.get();
        final kxp kxp = (kxp)lay.d.get();
        kxp.getClass();
        final kyb kyb = (kyb)lay.e.get();
        kyb.getClass();
        final kxc kxc = (kxc)lay.f.get();
        kxc.getClass();
        final lax a2 = new lax(a, kzx, (kyd)value, kxp, kyb, kxc, lcr, lar, null, null);
        this.a = a2;
        final kxo kxo = (kxo)law.a.get();
        kxo.getClass();
        b.c(this.d = new lav(kxo, ((kyq)law.b).a(), ((krp)law.c).a(), ((kys)law.d).a(), a2, lar));
    }
    
    public final kvq a() {
        synchronized (this) {
            if (!this.f) {
                return this.d.a();
            }
            throw new kuw("getConfig3ABuilder() cannot be called after the session is closed.");
        }
    }
    
    public final kyh b() {
        synchronized (this) {
            if (!this.f) {
                return this.a.a();
            }
            throw new kuw("getRequestBuilder() cannot be called after the session is closed.");
        }
    }
    
    public final oey c(final kwx kwx, final boolean b) {
        synchronized (this) {
            if (!this.f) {
                return this.d.b(kwx, b);
            }
            throw new kuw("trigger3A() cannot be called after the session is closed.");
        }
    }
    
    @Override
    public final void close() {
        this.d.a.shutdownNow();
        synchronized (this) {
            if (this.g) {
                try {
                    this.a.f(this.b().b());
                    this.g = false;
                }
                catch (final kuw kuw) {
                    final String value = String.valueOf(kuw);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 40);
                    sb.append("Failed to resume last repeating request ");
                    sb.append(value);
                    Log.e("CAM_RequestProcessorSess", sb.toString());
                }
            }
            this.f = true;
            monitorexit(this);
            this.b.close();
            this.c.close();
            final Runnable e = this.e;
            if (e != null) {
                e.run();
            }
        }
    }
    
    public final oey d(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        synchronized (this) {
            if (!this.f) {
                return this.d.c(b, b2, b3, b4);
            }
            throw new kuw("unlock3A() cannot be called after the session is closed.");
        }
    }
    
    public final oey e(final kvr kvr, final boolean b) {
        synchronized (this) {
            if (!this.f) {
                return this.d.d(kvr, b);
            }
            throw new kuw("update3A() cannot be called after the session is closed.");
        }
    }
    
    public final void f() {
        synchronized (this) {
            if (!this.f) {
                this.a.c();
                return;
            }
            throw new kuw("abortCaptures() cannot be called after the session is closed.");
        }
    }
    
    public final void g() {
        synchronized (this) {
            if (!this.f) {
                this.g = true;
                this.a.d();
                return;
            }
            throw new kuw("stopRepeating() cannot be called after the session is closed.");
        }
    }
    
    public final void h(final List list, final List list2) {
        synchronized (this) {
            if (!this.f) {
                this.a.e(list, list2);
                return;
            }
            throw new kuw("submit() cannot be called after the session is closed.");
        }
    }
    
    public final void i(final kyi kyi) {
        synchronized (this) {
            if (!this.f) {
                this.a.f(kyi);
                return;
            }
            throw new kuw("setRepeating() cannot be called after the session is closed.");
        }
    }
    
    public final void j(final kyi kyi, final Set set) {
        synchronized (this) {
            if (!this.f) {
                this.a.g(kyi, set);
                return;
            }
            throw new kuw("submit() cannot be called after the session is closed.");
        }
    }
    
    public final oey k(final kvr kvr) {
        synchronized (this) {
            if (!this.f) {
                return this.d.e(kvr);
            }
            throw new kuw("lock3AImmediately() with config3a cannot be called after the session is closed.");
        }
    }
    
    public final void l(final kvr kvr) {
        synchronized (this) {
            if (!this.f) {
                this.d.f(kvr);
                return;
            }
            throw new kuw("updateConfig3AWithLocksRetained() cannot be called after the session is closed.");
        }
    }
    
    public final void m(final Set set, final kxc kxc) {
        synchronized (this) {
            if (!this.f) {
                final kyh a = this.a.a();
                a.e(set);
                a.g(kxc);
                this.a.h(a.b());
                return;
            }
            throw new kuw("submit(parameters, listener) cannot be called after the session is closed.");
        }
    }
}
