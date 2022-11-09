import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcz implements fda
{
    public static final nsd a;
    public final List b;
    public final List c;
    public final Object d;
    public volatile int e;
    private final klv f;
    private final klv g;
    private final fcv h;
    private final cxl i;
    private final hys j;
    private volatile feb k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/MicrovideoAppController");
    }
    
    public fcz(final klv f, final klv g, final fcv h, final hys j, final cxl i) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new Object();
        this.e = 1;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = j;
        this.i = i;
    }
    
    public final fee a() {
        synchronized (this.d) {
            if (this.b.isEmpty()) {
                return null;
            }
            return (fee)nov.d(this.b);
        }
    }
    
    @Override
    public final oaf b() {
        final fee a = this.a();
        if (a == null) {
            return null;
        }
        final okt m = oaf.m.m();
        final int b = hjf.b((int)this.f.aQ());
        final int n = 3;
        int n2 = 0;
        switch (b - 1) {
            default: {
                n2 = 4;
                break;
            }
            case 1: {
                n2 = 3;
                break;
            }
            case 0: {
                n2 = 2;
                break;
            }
        }
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oaf oaf = (oaf)m.b;
        oaf.h = n2 - 1;
        oaf.a |= 0x40;
        int n3;
        if (!a.b.c()) {
            n3 = n;
        }
        else {
            n3 = 5;
        }
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oaf oaf2 = (oaf)m.b;
        oaf2.l = n3 - 1;
        oaf2.a |= 0x200;
        return (oaf)m.h();
    }
    
    @Override
    public final void c() {
        final fee a = this.a();
        if (a != null) {
            Object o = a.b;
            final long a2 = ((fkh)o).b.a();
            synchronized (o) {
                ((fkh)o).g = TimeUnit.NANOSECONDS.toMicros(a2);
                int i = 0;
                ((fkh)o).f = false;
                final ArrayList n = nqb.n(((fkh)o).e);
                monitorexit(o);
                o = ((fkh)o).a;
                final StringBuilder sb = new StringBuilder(40);
                sb.append("onLongPressEnded at ");
                sb.append(a2);
                ((krr)o).b(sb.toString());
                while (i < n.size()) {
                    ((fkg)n.get(i)).c(TimeUnit.NANOSECONDS.toMicros(a2));
                    ++i;
                }
            }
        }
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void e() {
        SystemClock.elapsedRealtime();
        final cxl i = this.i;
        final cxo a = cxw.a;
        i.e();
        this.h.a();
    }
    
    @Override
    public final void f() {
        final cxl i = this.i;
        final cxo a = cxw.a;
        i.e();
    }
    
    @Override
    public final void g(final boolean b) {
        final fee a = this.a();
        if (a != null) {
            a.a.a(b);
        }
        if (b) {
            this.h.a();
        }
    }
    
    public final boolean h() {
        monitorenter(this);
        try {
            final feb k = this.k;
            if (k == null) {
                monitorexit(this);
                return false;
            }
            final fee a = this.a();
            while (true) {
                Label_0076: {
                    if (a == null) {
                        break Label_0076;
                    }
                    final fzp fzp = (fzp)a.c.aQ();
                    if (!fzp.equals(fzp.b) && !fzp.equals(fzp.d) && !fzp.equals(fzp.c)) {
                        break Label_0076;
                    }
                    monitorexit(this);
                    return false;
                }
                if (!(boolean)this.g.aQ() && !(boolean)this.j.a().aQ() && k.a()) {
                    monitorexit(this);
                    return true;
                }
                continue;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void i(final int e) {
        this.e = e;
    }
    
    @Override
    public final void j(final feb k) {
        synchronized (this) {
            if (this.k == null) {
                this.k = k;
                return;
            }
            a.l(fcz.a.c(), "Cannot attach UI controller when already attached!", '\u05f5');
        }
    }
    
    @Override
    public final void k(final feb feb) {
        synchronized (this) {
            if (this.k == feb) {
                this.k = null;
                return;
            }
            a.l(fcz.a.c(), "Cannot detach UI controller. Values mismatch.", '\u05f7');
        }
    }
}
