// 
// Decompiled by Procyon v0.6.0
// 

public final class nql extends nns
{
    static final nns a;
    final transient Object[] b;
    public final transient int c;
    
    static {
        a = new nql(new Object[0], 0);
    }
    
    public nql(final Object[] b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object[] A() {
        return this.b;
    }
    
    @Override
    public final boolean bO() {
        return false;
    }
    
    @Override
    public final Object get(final int n) {
        njo.v(n, this.c);
        final Object o = this.b[n];
        o.getClass();
        return o;
    }
    
    @Override
    public final int size() {
        return this.c;
    }
    
    @Override
    public final int x(final Object[] array, final int n) {
        System.arraycopy(this.b, 0, array, n, this.c);
        return n + this.c;
    }
    
    @Override
    public final int y() {
        return this.c;
    }
    
    @Override
    public final int z() {
        return 0;
    }
}
