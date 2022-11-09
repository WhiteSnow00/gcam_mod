// 
// Decompiled by Procyon v0.6.0
// 

public final class bij extends yu
{
    private int k;
    
    @Override
    public final void clear() {
        this.k = 0;
        super.clear();
    }
    
    @Override
    public final Object g(final int n) {
        this.k = 0;
        return super.g(n);
    }
    
    @Override
    public final Object h(final int n, final Object o) {
        this.k = 0;
        return super.h(n, o);
    }
    
    @Override
    public final int hashCode() {
        int k;
        if ((k = this.k) == 0) {
            k = super.hashCode();
            this.k = k;
        }
        return k;
    }
    
    @Override
    public final void k(final zb zb) {
        int i = 0;
        this.k = 0;
        final int j = zb.j;
        this.j(super.j + j);
        if (super.j == 0) {
            if (j > 0) {
                System.arraycopy(zb.h, 0, super.h, 0, j);
                System.arraycopy(zb.i, 0, super.i, 0, j + j);
                super.j = j;
            }
        }
        else {
            while (i < j) {
                this.put(zb.f(i), zb.i(i));
                ++i;
            }
        }
    }
    
    @Override
    public final Object put(final Object o, final Object o2) {
        this.k = 0;
        return super.put(o, o2);
    }
}
