import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rt
{
    public final /* synthetic */ RecyclerView a;
    
    public rt(final RecyclerView a) {
        this.a = a;
    }
    
    public final void a(final st st, final rz rz, final rz rz2) {
        final RecyclerView a = this.a;
        st.l(false);
        final sa b = a.B;
        Label_0101: {
            if (rz != null) {
                final int a2 = rz.a;
                final int a3 = rz2.a;
                if (a2 != a3 || rz.b != rz2.b) {
                    if (b.k(st, a2, rz.b, a3, rz2.b)) {
                        break Label_0101;
                    }
                    return;
                }
            }
            b.j(st);
            st.a.setAlpha(0.0f);
            b.c.add(st);
        }
        a.K();
    }
    
    public final void b(final st st, final rz rz, final rz rz2) {
        this.a.c.k(st);
        final RecyclerView a = this.a;
        a.m(st);
        st.l(false);
        final sa b = a.B;
        final int a2 = rz.a;
        final int b2 = rz.b;
        final View a3 = st.a;
        int n;
        if (rz2 == null) {
            n = a3.getLeft();
        }
        else {
            n = rz2.a;
        }
        int n2;
        if (rz2 == null) {
            n2 = a3.getTop();
        }
        else {
            n2 = rz2.b;
        }
        if (!st.t() && (a2 != n || b2 != n2)) {
            a3.layout(n, n2, a3.getWidth() + n, a3.getHeight() + n2);
            if (!b.k(st, a2, b2, n, n2)) {
                return;
            }
        }
        else {
            b.j(st);
            b.b.add(st);
        }
        a.K();
    }
    
    public final void c(final st st) {
        final RecyclerView a = this.a;
        a.l.aJ(st.a, a.c);
    }
}
