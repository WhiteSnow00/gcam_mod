// 
// Decompiled by Procyon v0.6.0
// 

public final class kge implements kfe
{
    private final mcn a;
    
    public kge(final mcn a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    @Override
    public final void b(final kgg kgg) {
        jqt.m(kgg);
    }
    
    @Override
    public final void c(final kgg kgg) {
        jqt.m(kgg);
    }
    
    @Override
    public final void d(final kgg kgg) {
        jqt.m(kgg);
    }
    
    @Override
    public final void e(final kgg kgg) {
        jqt.m(kgg);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((kge)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
