import java.util.concurrent.Executor;
import com.google.android.apps.camera.evcomp.EvCompView;

// 
// Decompiled by Procyon v0.6.0
// 

public class dhf extends dgz
{
    public final EvCompView a;
    public final pii b;
    public final klv c;
    public final klv d;
    public final klv e;
    public int f;
    public int g;
    public float h;
    public final niz i;
    public final klv j;
    public final int k;
    public final Runnable l;
    public float m;
    public float n;
    private final klv o;
    private final klv p;
    private final klv q;
    
    public dhf(final pii b, final EvCompView a, final int k, final klv o, final klv p9, final klv q, final klv e, final dgm dgm, final niz i) {
        final Boolean value = true;
        final kkz j = new kkz(value);
        this.j = j;
        this.l = new dha(this);
        this.b = b;
        this.a = a;
        this.k = k;
        this.e = e;
        this.o = o;
        this.p = p9;
        this.q = q;
        this.c = dgm.a;
        this.d = dgm.c;
        this.i = i;
        j.aR(value);
        this.m = -1.0f;
        this.n = -1.0f;
    }
    
    public final void i() {
        if (((dgj)this.e.aQ()).equals(dgj.a)) {
            this.j();
        }
        else {
            njo.o(true);
            final klv p = this.p;
            final Float value = -1.0f;
            p.aR(value);
            this.q.aR(value);
            this.m = -1.0f;
            this.n = -1.0f;
            ofi.w(((grn)((njd)this.i).a).e(), new dhb(this), kjm.a);
        }
        this.j.aR(true);
    }
    
    public final void j() {
        this.a.f(0.5f);
        this.l(0.5f, dgl.a);
    }
    
    public final void k() {
        if (((dgj)this.e.aQ()).equals(dgj.a)) {
            this.a.f(0.5f);
            this.l(0.5f, dgl.a);
        }
        else {
            ((grn)((njd)this.i).a).g();
        }
        this.j.aR(true);
    }
    
    public final void l(final float j, final dgl dgl) {
        if (j > 1.0f || j < 0.0f) {
            return;
        }
        if (this.e.aQ() == dgj.a) {
            njo.e(dgl.equals(dgl.a), "Single knob ev slider should have only one control(for brightness).");
            if (((grn)((njd)this.i).a).j()) {
                this.a.g(j);
                if (j != (float)((kkz)this.p).d) {
                    this.p.aR(j);
                }
            }
            else {
                final int round = Math.round(this.g * j);
                final int f = this.f;
                final int n = round + f;
                this.a.g((this.g * j + f) * this.h);
                if (n != (int)((kkz)this.o).d) {
                    this.o.aR(n);
                }
            }
            return;
        }
        final dgl a = dgl.a;
        switch (dgl.ordinal()) {
            case 1: {
                final EvCompView a2 = this.a;
                a2.j = j;
                a2.f.setContentDescription((CharSequence)a2.getResources().getString(2131952629, new Object[] { String.valueOf(a2.j) }));
                if (j == (float)((kkz)this.q).d) {
                    return;
                }
                this.q.aR(j);
                if ((float)((kkz)this.p).d == -1.0f) {
                    this.p.aR(this.m);
                    return;
                }
                break;
            }
            case 0: {
                this.a.g(j);
                if (j == (float)((kkz)this.p).d) {
                    return;
                }
                this.p.aR(j);
                if ((float)((kkz)this.q).d == -1.0f) {
                    this.q.aR(this.n);
                    break;
                }
                break;
            }
        }
    }
}
