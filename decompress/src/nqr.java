import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nqr extends noi
{
    public static final nqr a;
    private static final Object[] e;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    private final transient int f;
    private final transient int g;
    
    static {
        final Object[] array = e = new Object[0];
        a = new nqr(array, 0, array, 0, 0);
    }
    
    public nqr(final Object[] b, final int c, final Object[] d, final int f, final int g) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object[] A() {
        return this.b;
    }
    
    @Override
    public final nns C() {
        return nns.h(this.b, this.g);
    }
    
    @Override
    public final nrv bN() {
        return this.v().t();
    }
    
    @Override
    public final boolean bO() {
        return false;
    }
    
    @Override
    public final boolean contains(final Object o) {
        final Object[] d = this.d;
        if (o == null || d.length == 0) {
            return false;
        }
        int k = nov.k(o);
        while (true) {
            k &= this.f;
            final Object o2 = d[k];
            if (o2 == null) {
                return false;
            }
            if (o2.equals(o)) {
                return true;
            }
            ++k;
        }
    }
    
    @Override
    public final int hashCode() {
        return this.c;
    }
    
    @Override
    public final int size() {
        return this.g;
    }
    
    @Override
    public final boolean w() {
        return true;
    }
    
    @Override
    public final int x(final Object[] array, final int n) {
        System.arraycopy(this.b, 0, array, n, this.g);
        return n + this.g;
    }
    
    @Override
    public final int y() {
        return this.g;
    }
    
    @Override
    public final int z() {
        return 0;
    }
}
