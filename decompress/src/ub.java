import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ub
{
    final ua a;
    final tz b;
    
    public ub(final ua a) {
        this.a = a;
        this.b = new tz();
    }
    
    public final View a(int i, final int n, final int n2, final int n3) {
        final int d = this.a.d();
        final int c = this.a.c();
        int n4;
        if (n > i) {
            n4 = 1;
        }
        else {
            n4 = -1;
        }
        View view = null;
        while (i != n) {
            final View e = this.a.e(i);
            this.b.c(d, c, this.a.b(e), this.a.a(e));
            this.b.b();
            this.b.a(n2);
            if (this.b.d()) {
                return e;
            }
            this.b.b();
            this.b.a(n3);
            if (this.b.d()) {
                view = e;
            }
            i += n4;
        }
        return view;
    }
    
    public final boolean b(final View view) {
        this.b.c(this.a.d(), this.a.c(), this.a.b(view), this.a.a(view));
        this.b.b();
        this.b.a(24579);
        return this.b.d();
    }
}
