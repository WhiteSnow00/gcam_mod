import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsc implements fqx
{
    private final fva a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final AtomicReference f;
    
    public fsc(final fva a, final int b, final int c, final int d, final int e) {
        this.f = new AtomicReference((V)fqw.a);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final int a() {
        int n;
        if (this.a.a() == 2) {
            n = this.d;
        }
        else if (this.a.a() != 1) {
            n = this.c;
        }
        else {
            n = 0;
        }
        int n2 = n;
        if (this.f.get() == fqw.b) {
            n2 = n + this.e;
        }
        return Math.max(this.b - n2, 1);
    }
    
    @Override
    public final int b() {
        return this.b + 1;
    }
    
    @Override
    public final void c(final fqw fqw) {
        this.f.set(fqw);
    }
}
