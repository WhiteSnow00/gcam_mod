// 
// Decompiled by Procyon v0.6.0
// 

final class da
{
    public final Object[] a;
    public int b;
    
    public da() {
        this.a = new Object[256];
    }
    
    public final Object a() {
        int b = this.b;
        if (b > 0) {
            --b;
            final Object[] a = this.a;
            final Object o = a[b];
            a[b] = null;
            this.b = b;
            return o;
        }
        return null;
    }
    
    public final void b(final Object o) {
        final int b = this.b;
        if (b < 256) {
            this.a[b] = o;
            this.b = b + 1;
        }
    }
}
