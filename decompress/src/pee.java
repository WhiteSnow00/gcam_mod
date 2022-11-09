// 
// Decompiled by Procyon v0.6.0
// 

public final class pee extends owx
{
    final php b;
    final int c;
    
    public pee(final php b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    protected final void k(final psr psr) {
        final pec pec = new pec(psr, this.b.a(), this.c);
        psr.bY(pec);
        final php b = this.b;
        final peb[] b2 = pec.b;
        if (b.c(b2)) {
            final int length = b2.length;
            final psr[] array = new psr[length];
            final int n = 0;
            for (int i = 0; i < length; ++i) {
                final peb peb = b2[i];
                final pdx pdx = (pdx)b;
                array[i] = pau.m(peb, pdx.b, Integer.MAX_VALUE, pdx.c);
            }
            final php a = ((pdx)b).a;
            if (a.c(array)) {
                final psr[] array2 = new psr[length];
                final pej pej = (pej)a;
                final oxj b3 = pej.b;
                if (b3 instanceof pgp) {
                    ((pgp)b3).b(length, new peg(pej, array, array2));
                }
                else {
                    for (int j = n; j < length; ++j) {
                        pej.b(j, array, array2, pej.b.a());
                    }
                }
                final php a2 = pej.a;
                if (a2.c(array2)) {
                    final pea pea = (pea)a2;
                    pea.a.j(new pdz(array2, pea.c));
                }
            }
        }
    }
}
