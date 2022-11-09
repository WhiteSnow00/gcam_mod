// 
// Decompiled by Procyon v0.6.0
// 

public final class nii extends niz
{
    public static final nii a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new nii();
    }
    
    private nii() {
    }
    
    private Object readResolve() {
        return nii.a;
    }
    
    @Override
    public final niz a(final niz niz) {
        niz.getClass();
        return niz;
    }
    
    @Override
    public final niz b(final nir nir) {
        nir.getClass();
        return nii.a;
    }
    
    @Override
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
    
    @Override
    public final Object d(final njp njp) {
        return njp.a();
    }
    
    @Override
    public final Object e(final Object o) {
        o.getClass();
        return o;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this;
    }
    
    @Override
    public final Object f() {
        return null;
    }
    
    @Override
    public final boolean g() {
        return false;
    }
    
    @Override
    public final int hashCode() {
        return 2040732332;
    }
    
    @Override
    public final String toString() {
        return "Optional.absent()";
    }
}
