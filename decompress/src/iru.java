import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iru
{
    public final klj a;
    public final hjx b;
    public final efm c;
    public final Context d;
    public final Executor e;
    public final String f;
    public final String g;
    public final boolean h;
    public irf i;
    public irf j;
    public irf k;
    public irf l;
    public irf m;
    public irf n;
    public irf o;
    public boolean p;
    public final bmz q;
    private irf r;
    
    public iru(final Context d, final klj a, final hjx b, final efm c, final Executor e, final bmz q, final cxl cxl) {
        this.p = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.q = q;
        this.h = cxl.k(cxr.at);
        this.f = d.getResources().getString(2131951988);
        this.g = d.getResources().getString(2131951989);
        this.e = e;
    }
    
    public final void a() {
        this.c.h(this.i);
    }
    
    public final void b() {
        final irf o = this.o;
        if (o != null) {
            this.c.h(o);
        }
    }
    
    public final void c() {
        this.c.h(this.j);
    }
    
    public final void d() {
        final irf r = this.r;
        if (r != null) {
            this.c.h(r);
        }
    }
    
    public final void e() {
        this.c.e(this.i);
    }
    
    public final void f() {
        this.c.e(this.j);
    }
    
    public final void g(final hzf hzf, final boolean b) {
        monitorenter(this);
        try {
            this.d();
            final hzf a = hzf.a;
            switch (hzf.ordinal()) {
                case 6:
                case 7: {
                    if (b) {
                        this.c.e(this.l);
                        this.r = this.l;
                        monitorexit(this);
                        return;
                    }
                    this.c.e(this.m);
                    this.r = this.m;
                    break;
                }
                case 5: {
                    this.c.e(this.k);
                    this.r = this.k;
                    monitorexit(this);
                    return;
                }
                case 4: {
                    this.c.e(this.j);
                    this.r = this.j;
                    monitorexit(this);
                    return;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
