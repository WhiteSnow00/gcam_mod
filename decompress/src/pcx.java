// 
// Decompiled by Procyon v0.6.0
// 

public final class pcx extends oxc
{
    final Object[] a;
    
    public pcx(final Object[] a) {
        this.a = a;
    }
    
    public final void g(final oxg oxg) {
        final ozg ozg = new ozg(oxg, this.a);
        oxg.bV(ozg);
        if (!ozg.d) {
            final Object[] b = ozg.b;
            for (int n = 0; n < 2 && !ozg.e; ++n) {
                final Object o = b[n];
                if (o == null) {
                    final oxg a = ozg.a;
                    final StringBuilder sb = new StringBuilder(40);
                    sb.append("The element at index ");
                    sb.append(n);
                    sb.append(" is null");
                    a.b(new NullPointerException(sb.toString()));
                    return;
                }
                ozg.a.e(o);
            }
            if (!ozg.e) {
                ozg.a.bU();
            }
        }
    }
}
