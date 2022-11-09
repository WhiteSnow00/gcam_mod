import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcv
{
    public final cxl a;
    public boolean b;
    private final Executor c;
    private final hyl d;
    
    public fcv(final hyl d, final cxl a, final Executor c) {
        this.b = true;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public final void a() {
        knf.f(this.d.a(), new fcu(this), this.c);
    }
    
    public final boolean b() {
        synchronized (this) {
            return this.b;
        }
    }
}
