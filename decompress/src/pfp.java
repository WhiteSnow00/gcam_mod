// 
// Decompiled by Procyon v0.6.0
// 

public final class pfp extends oxk
{
    final oxm[] a;
    final oyf b;
    
    public pfp(final oxm[] a, final oyf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected final void n(final oxl oxl) {
        final oxm[] a = this.a;
        final pfn pfn = new pfn(oxl, this.b);
        oxl.bV(pfn);
        for (int n = 0; n < 2 && pfn.get() > 0; ++n) {
            final oxm oxm = a[n];
            if (oxm == null) {
                pfn.b(new NullPointerException("One of the sources is null"), n);
                return;
            }
            oxm.m(pfn.c[n]);
        }
    }
}
