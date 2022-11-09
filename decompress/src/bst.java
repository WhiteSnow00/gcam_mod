// 
// Decompiled by Procyon v0.6.0
// 

public final class bst
{
    public final ofn a;
    private long b;
    
    public bst(final int n) {
        njo.d(true);
        this.a = ofn.f();
        this.b = n;
    }
    
    public final void a() {
        synchronized (this) {
            final long b = this.b - 1L;
            this.b = b;
            if (b <= 0L) {
                this.a.o(null);
            }
        }
    }
}
