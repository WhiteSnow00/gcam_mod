// 
// Decompiled by Procyon v0.6.0
// 

final class nlx extends nma
{
    private static final long serialVersionUID = 0L;
    
    public nlx(final Comparable comparable) {
        comparable.getClass();
        super(comparable);
    }
    
    @Override
    public final Comparable c(final nmf nmf) {
        return this.b;
    }
    
    @Override
    public final Comparable d(final nmf nmf) {
        return nmf.a(this.b);
    }
    
    @Override
    public final void e(final StringBuilder sb) {
        sb.append('(');
        sb.append(this.b);
    }
    
    @Override
    public final void f(final StringBuilder sb) {
        sb.append(this.b);
        sb.append(']');
    }
    
    @Override
    public final boolean g(final Comparable comparable) {
        return nqe.b(this.b, comparable) < 0;
    }
    
    @Override
    public final nma h(final nmf nmf) {
        final Comparable a = nmf.a(this.b);
        nma nma;
        if (a == null) {
            nma = nly.a;
        }
        else {
            nma = nma.k(a);
        }
        return nma;
    }
    
    @Override
    public final int hashCode() {
        return ~this.b.hashCode();
    }
    
    @Override
    public final nma i(final nmf nmf) {
        return this;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 2);
        sb.append("/");
        sb.append(value);
        sb.append("\\");
        return sb.toString();
    }
}
