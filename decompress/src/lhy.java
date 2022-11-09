import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class lhy implements lic
{
    private double[] a;
    private int b;
    
    public lhy() {
        this.b = 0;
        this.a = new double[5];
    }
    
    @Override
    public final void b(final lih lih, final Object[] array) {
        for (int i = 0; i < this.b; ++i) {
            final double c = this.a[i];
            final lil b = lih.b;
            b.getClass();
            final lhu a = lhu.a(array);
            final lim lim = b.b.get(a);
            if (lim == null) {
                b.b.put(a, new lik(c));
            }
            else {
                final lik lik = (lik)lim;
                final double a2 = lik.a + 1.0;
                lik.a = a2;
                lik.e = c;
                if (c < lik.b) {
                    lik.b = c;
                }
                else if (c > lik.c) {
                    lik.c = c;
                }
                lik.d = lik.d * ((-1.0 + a2) / a2) + c / a2;
            }
        }
    }
    
    @Override
    public final String toString() {
        return Arrays.toString(this.a);
    }
}
