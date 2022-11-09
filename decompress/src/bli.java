import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bli implements bkv, kri
{
    public final bke a;
    public jck b;
    public jck c;
    public ofn d;
    private final kjm e;
    private final kjk f;
    private volatile boolean g;
    private final kjf h;
    
    public bli(final kjm e, final bke a, final klj klj) {
        final kjk f = new kjk();
        this.f = f;
        this.g = true;
        this.b = null;
        this.c = null;
        this.h = new blh(this);
        this.e = e;
        this.a = a;
        f.c(klj.a(this, e));
    }
    
    @Override
    public final void b() {
        this.g = true;
    }
    
    @Override
    public final void c() {
        this.g = false;
    }
    
    @Override
    public final void close() {
        this.f.close();
    }
}
