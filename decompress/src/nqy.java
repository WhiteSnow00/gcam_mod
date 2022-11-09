import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nqy extends noi
{
    final transient Object a;
    private transient int b;
    
    public nqy(final Object a) {
        a.getClass();
        this.a = a;
    }
    
    public nqy(final Object a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final nns C() {
        return nns.m(this.a);
    }
    
    @Override
    public final nrv bN() {
        return new noy(this.a);
    }
    
    @Override
    public final boolean bO() {
        return false;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.equals(o);
    }
    
    @Override
    public final int hashCode() {
        int b;
        if ((b = this.b) == 0) {
            b = this.a.hashCode();
            this.b = b;
        }
        return b;
    }
    
    @Override
    public final int size() {
        return 1;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
    
    @Override
    public final boolean w() {
        return this.b != 0;
    }
    
    @Override
    public final int x(final Object[] array, final int n) {
        array[n] = this.a;
        return n + 1;
    }
}
