import java.util.ArrayList;
import android.os.CountDownTimer;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezv implements krc
{
    public final kjm a;
    public final List b;
    public irf c;
    public irf d;
    public irf e;
    public irf f;
    public irf g;
    public irf h;
    public final dgn i;
    public final iru j;
    public final oey k;
    public final Context l;
    public irf m;
    private final efm n;
    private final boolean o;
    private CountDownTimer p;
    private boolean q;
    
    public ezv(final Context l, final kjm a, final efm n, final dgn i, final iru j, final oey k, final cxl cxl) {
        this.b = new ArrayList();
        this.q = false;
        this.l = l;
        this.a = a;
        this.n = n;
        this.i = i;
        this.j = j;
        this.k = k;
        this.o = cxl.k(cxr.at);
    }
    
    public final void a() {
        final CountDownTimer p = this.p;
        if (p != null) {
            p.onFinish();
            this.p.cancel();
        }
        this.d();
    }
    
    public final void b() {
        synchronized (this) {
            this.q = false;
            this.d();
        }
    }
    
    public final void c() {
        synchronized (this) {
            this.q = true;
        }
    }
    
    @Override
    public final void close() {
        this.b();
    }
    
    public final void d() {
        final irf m = this.m;
        if (m != null) {
            this.n.h(m);
            this.m = null;
        }
    }
    
    public final void e(final float n) {
        if (n == 0.0f) {
            this.f(this.g);
            return;
        }
        if (n == 1.0f) {
            this.d();
        }
    }
    
    public final void f(irf m) {
        final irf i = this.m;
        this.m = m;
        if (i != null && !m.equals(i)) {
            this.n.h(i);
        }
        synchronized (this) {
            if (this.q) {
                m = this.m;
                if (m != null) {
                    this.n.e(m);
                }
            }
        }
    }
    
    public final void g() {
        final boi boi = (boi)knf.d(this.k);
        if (boi != null) {
            boi.b();
        }
        if (this.i.p()) {
            this.j.a();
        }
        (this.p = new ezu(this)).start();
    }
    
    public final irf h(final String d, final int b, final int h) {
        final irg irg = new irg();
        irg.d = d;
        irg.e = this.l;
        irg.h = h;
        irg.g = this.o;
        if (b == -1) {
            irg.a = true;
        }
        else {
            irg.a = false;
            irg.b = b;
        }
        return irg.a();
    }
}
