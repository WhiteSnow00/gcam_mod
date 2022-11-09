// 
// Decompiled by Procyon v0.6.0
// 

public final class pnb
{
    private final pnf[] a;
    
    public pnb(final int n) {
        final pnf[] a = new pnf[n];
        for (int i = 0; i < n; ++i) {
            a[i] = plv.g(null);
        }
        this.a = a;
    }
    
    public final pnf a(final int n) {
        return this.a[n];
    }
}
