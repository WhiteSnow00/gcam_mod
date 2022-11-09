// 
// Decompiled by Procyon v0.6.0
// 

final class lhs implements lic
{
    private long a;
    
    public lhs() {
        this.a = 0L;
    }
    
    @Override
    public final void b(final lih lih, final Object[] array) {
        final long a = this.a;
        final lil b = lih.b;
        b.getClass();
        final lhu a2 = lhu.a(array);
        lim lim = b.b.get(a2);
        if (lim == null) {
            lim = new lij();
            b.b.put(a2, lim);
        }
        final lij lij = (lij)lim;
        lij.a += a;
    }
}
