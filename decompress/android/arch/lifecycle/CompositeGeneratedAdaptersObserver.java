// 
// Decompiled by Procyon v0.6.0
// 

package android.arch.lifecycle;

public class CompositeGeneratedAdaptersObserver implements j
{
    private final f[] a;
    
    public CompositeGeneratedAdaptersObserver(final f[] a) {
        this.a = a;
    }
    
    @Override
    public final void a(final k k, final g g) {
        new gz();
        final f[] a = this.a;
        final int length = a.length;
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            a[i].a();
        }
        final f[] a2 = this.a;
        for (int length2 = a2.length, j = n; j < length2; ++j) {
            a2[j].a();
        }
    }
}
