// 
// Decompiled by Procyon v0.6.0
// 

public final class pej extends php
{
    final php a;
    final oxj b;
    final int c;
    
    public pej(final php a, final oxj b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final int a() {
        return ((pea)this.a).b;
    }
    
    final void b(final int n, final psr[] array, final psr[] array2, final oxi oxi) {
        final psr psr = array[n];
        final pfs pfs = new pfs(this.c);
        if (psr instanceof oyx) {
            array2[n] = new peh((oyx)psr, this.c, pfs, oxi);
            return;
        }
        array2[n] = new pei(psr, this.c, pfs, oxi);
    }
}
