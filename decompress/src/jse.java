import com.google.android.gms.common.api.internal.LifecycleCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jse extends jrw
{
    public final yw e;
    private final jsq g;
    
    public jse(final jsx jsx, final jsq g) {
        super(jsx, jpw.a);
        this.e = new yw();
        this.g = g;
        this.f.b(this);
    }
    
    @Override
    protected final void e(final jps jps, final int n) {
        this.g.e(jps, n);
    }
    
    @Override
    protected final void f() {
        this.g.f();
    }
    
    @Override
    public final void h() {
        this.k();
    }
    
    @Override
    public final void i() {
        super.a = true;
        this.k();
    }
    
    @Override
    public final void j() {
        super.a = false;
        final jsq g = this.g;
        synchronized (jsq.c) {
            if (g.m == this) {
                g.m = null;
                g.n.clear();
            }
        }
    }
    
    public final void k() {
        if (!this.e.isEmpty()) {
            this.g.g(this);
        }
    }
}
