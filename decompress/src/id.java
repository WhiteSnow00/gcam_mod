// 
// Decompiled by Procyon v0.6.0
// 

public final class id
{
    private int a;
    private int b;
    
    public final int a() {
        return this.a | this.b;
    }
    
    public final void b(final int n, final int n2) {
        if (n2 == 1) {
            this.b = n;
            return;
        }
        this.a = n;
    }
    
    public final void c(final int n) {
        if (n == 1) {
            this.b = 0;
            return;
        }
        this.a = 0;
    }
}
