import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class pbr implements owy, pss
{
    final psr a;
    pss b;
    boolean c;
    
    public pbr(final psr a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.b.a();
    }
    
    @Override
    public final void bY(final pss b) {
        if (phe.h(this.b, b)) {
            this.b = b;
            this.a.bY(this);
        }
    }
    
    @Override
    public final void cb(final long n) {
        this.b.cb(n);
    }
    
    @Override
    public final void cc() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.cc();
    }
    
    @Override
    public final void cd(final Throwable t) {
        if (this.c) {
            pip.g(t);
            return;
        }
        this.c = true;
        this.a.cd(t);
    }
    
    @Override
    public final void ce(final Object o) {
        if (!this.c) {
            try {
                final pim pim = (pim)o;
                pim.getClass();
                if (!((List)pim.a).isEmpty()) {
                    this.a.ce(o);
                    return;
                }
                this.c = true;
                this.b.a();
                this.a.cc();
            }
            finally {
                final Throwable t;
                psn.e(t);
                this.b.a();
                this.cd(t);
            }
        }
    }
}
