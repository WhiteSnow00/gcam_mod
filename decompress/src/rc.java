import android.view.View;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rc
{
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public List l;
    public boolean m;
    
    public rc() {
        this.a = true;
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.l = null;
    }
    
    public final View a(final sk sk) {
        final List l = this.l;
        if (l != null) {
            for (int size = l.size(), i = 0; i < size; ++i) {
                final View a = this.l.get(i).a;
                final sf sf = (sf)a.getLayoutParams();
                if (!sf.c()) {
                    if (this.d == sf.a()) {
                        this.c(a);
                        return a;
                    }
                }
            }
            return null;
        }
        final View c = sk.c(this.d);
        this.d += this.e;
        return c;
    }
    
    public final void b() {
        this.c(null);
    }
    
    public final void c(final View view) {
        final int size = this.l.size();
        View view2 = null;
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < size; ++i) {
            final View a = this.l.get(i).a;
            final sf sf = (sf)a.getLayoutParams();
            if (a != view) {
                if (!sf.c()) {
                    final int n2 = (sf.a() - this.d) * this.e;
                    if (n2 >= 0) {
                        if (n2 < n) {
                            if (n2 == 0) {
                                view2 = a;
                                break;
                            }
                            view2 = a;
                            n = n2;
                        }
                    }
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
            return;
        }
        this.d = ((sf)view2.getLayoutParams()).a();
    }
    
    public final boolean d(final sq sq) {
        final int d = this.d;
        return d >= 0 && d < sq.a();
    }
}
