import android.support.v7.widget.RecyclerView;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qt
{
    int a;
    int b;
    int[] c;
    int d;
    
    public final void a(final int n, final int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (n2 >= 0) {
            final int d = this.d;
            final int n3 = d + d;
            final int[] c = this.c;
            if (c == null) {
                Arrays.fill(this.c = new int[4], -1);
            }
            else {
                final int length = c.length;
                if (n3 >= length) {
                    System.arraycopy(c, 0, this.c = new int[n3 + n3], 0, length);
                }
            }
            final int[] c2 = this.c;
            c2[n3] = n;
            c2[n3 + 1] = n2;
            ++this.d;
            return;
        }
        throw new IllegalArgumentException("Pixel distance must be non-negative");
    }
    
    final void b() {
        final int[] c = this.c;
        if (c != null) {
            Arrays.fill(c, -1);
        }
        this.d = 0;
    }
    
    final void c(final RecyclerView recyclerView, final boolean z) {
        this.d = 0;
        final int[] c = this.c;
        if (c != null) {
            Arrays.fill(c, -1);
        }
        final se l = recyclerView.l;
        if (recyclerView.k != null && l != null && l.x) {
            if (z) {
                if (!recyclerView.e.k()) {
                    l.aa(recyclerView.k.a(), this);
                }
            }
            else if (!recyclerView.aa()) {
                l.Z(this.a, this.b, recyclerView.I, this);
            }
            final int d = this.d;
            if (d > l.y) {
                l.y = d;
                l.z = z;
                recyclerView.c.l();
            }
        }
    }
    
    final boolean d(final int n) {
        if (this.c != null) {
            for (int d = this.d, i = 0; i < d + d; i += 2) {
                if (this.c[i] == n) {
                    return true;
                }
            }
        }
        return false;
    }
}
