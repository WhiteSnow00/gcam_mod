import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class qn extends aak
{
    final /* synthetic */ qq a;
    
    public qn(final qq a) {
        this.a = a;
    }
    
    @Override
    public final void a(final RecyclerView recyclerView, int n, int computeHorizontalScrollRange) {
        final qq a = this.a;
        final int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        final int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        n = a.l.computeVerticalScrollRange();
        final int k = a.k;
        a.m = (n - k > 0 && k >= a.a);
        computeHorizontalScrollRange = a.l.computeHorizontalScrollRange();
        final int j = a.j;
        final boolean n2 = computeHorizontalScrollRange - j > 0 && j >= a.a;
        a.n = n2;
        if (!a.m) {
            if (!n2) {
                if (a.o != 0) {
                    a.b(0);
                }
                return;
            }
        }
        else {
            final float n3 = (float)k;
            a.e = (int)(n3 * (computeVerticalScrollOffset + n3 / 2.0f) / n);
            a.d = Math.min(k, k * k / n);
        }
        if (a.n) {
            final float n4 = (float)j;
            a.h = (int)(n4 * (computeHorizontalScrollOffset + n4 / 2.0f) / computeHorizontalScrollRange);
            a.g = Math.min(j, j * j / computeHorizontalScrollRange);
        }
        n = a.o;
        if (n == 0 || n == 1) {
            a.b(1);
        }
    }
}
