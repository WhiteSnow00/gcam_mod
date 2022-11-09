// 
// Decompiled by Procyon v0.6.0
// 

final class nqp extends nns
{
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;
    
    public nqp(final Object[] a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean bO() {
        return true;
    }
    
    @Override
    public final Object get(final int n) {
        njo.v(n, this.c);
        return this.a[n + n + this.b];
    }
    
    @Override
    public final int size() {
        return this.c;
    }
}
