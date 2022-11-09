// 
// Decompiled by Procyon v0.6.0
// 

public final class njd extends niz
{
    private static final long serialVersionUID = 0L;
    public final Object a;
    
    public njd(final Object a) {
        this.a = a;
    }
    
    @Override
    public final niz a(final niz niz) {
        niz.getClass();
        return this;
    }
    
    @Override
    public final niz b(final nir nir) {
        final Object a = nir.a(this.a);
        a.getClass();
        return new njd(a);
    }
    
    @Override
    public final Object c() {
        return this.a;
    }
    
    @Override
    public final Object d(final njp njp) {
        return this.a;
    }
    
    @Override
    public final Object e(final Object o) {
        o.getClass();
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof njd && this.a.equals(((njd)o).a);
    }
    
    @Override
    public final Object f() {
        return this.a;
    }
    
    @Override
    public final boolean g() {
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 13);
        sb.append("Optional.of(");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
}
