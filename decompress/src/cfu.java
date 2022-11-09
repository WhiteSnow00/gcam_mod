// 
// Decompiled by Procyon v0.6.0
// 

public final class cfu
{
    private final int[] a;
    
    public cfu() {
        this.a = new int[2];
    }
    
    public final int a(final int n) {
        return this.a[n - 1];
    }
    
    public final void b(int n) {
        final int[] a = this.a;
        --n;
        ++a[n];
    }
}
