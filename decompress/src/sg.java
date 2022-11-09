import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class sg
{
    public RecyclerView a;
    public final aak b;
    
    public sg() {
        this.b = new ta(this);
    }
    
    public abstract View c(final se p0);
    
    public abstract int[] d(final se p0, final View p1);
    
    public final void f() {
        final RecyclerView a = this.a;
        if (a == null) {
            return;
        }
        final se l = a.l;
        if (l == null) {
            return;
        }
        final View c = this.c(l);
        if (c == null) {
            return;
        }
        final int[] d = this.d(l, c);
        final int n = 0;
        int n2 = d[0];
        if (n2 == 0) {
            if (d[1] == 0) {
                return;
            }
            n2 = n;
        }
        this.a.S(n2, d[1]);
    }
}
