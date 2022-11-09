import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class paj extends AtomicInteger implements owy, pam, pss
{
    private static final long serialVersionUID = -3511336836796789179L;
    final pal a;
    final oyf b;
    final int c;
    final int d;
    pss e;
    int f;
    ozd g;
    volatile boolean h;
    volatile boolean i;
    final phg j;
    volatile boolean k;
    int l;
    
    public paj(final oyf b) {
        this.b = b;
        this.c = 2;
        this.d = 2;
        this.a = new pal(this);
        this.j = new phg();
    }
    
    @Override
    public final void bY(final pss e) {
        if (phe.h(this.e, e)) {
            this.e = e;
            if (e instanceof oza) {
                final oza oza = (oza)e;
                final int k = oza.k();
                if (k == 1) {
                    this.l = 1;
                    this.g = oza;
                    this.h = true;
                    this.h();
                    this.f();
                    return;
                }
                if (k == 2) {
                    this.l = 2;
                    this.g = oza;
                    this.h();
                    e.cb(this.c);
                    return;
                }
            }
            this.g = new pfs(this.c);
            this.h();
            e.cb(this.c);
        }
    }
    
    @Override
    public final void cc() {
        this.h = true;
        this.f();
    }
    
    @Override
    public final void ce(final Object o) {
        if (this.l != 2 && !this.g.j(o)) {
            this.e.a();
            this.cd(new IllegalStateException("Queue full?!"));
            return;
        }
        this.f();
    }
    
    public abstract void f();
    
    @Override
    public final void g() {
        this.k = false;
        this.f();
    }
    
    public abstract void h();
}
