import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ra
{
    public rp a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    
    public ra() {
        this.d();
    }
    
    public final void a() {
        int c;
        if (this.d) {
            c = this.a.f();
        }
        else {
            c = this.a.j();
        }
        this.c = c;
    }
    
    public final void b(final View view, final int b) {
        if (this.d) {
            this.c = this.a.a(view) + this.a.o();
        }
        else {
            this.c = this.a.d(view);
        }
        this.b = b;
    }
    
    public final void c(final View view, int b) {
        final int o = this.a.o();
        if (o >= 0) {
            this.b(view, b);
            return;
        }
        this.b = b;
        if (this.d) {
            b = this.a.f() - o - this.a.a(view);
            this.c = this.a.f() - b;
            if (b > 0) {
                final int b2 = this.a.b(view);
                final int c = this.c;
                final int j = this.a.j();
                final int n = c - b2 - (j + Math.min(this.a.d(view) - j, 0));
                if (n < 0) {
                    this.c += Math.min(b, -n);
                }
            }
        }
        else {
            final int d = this.a.d(view);
            b = d - this.a.j();
            this.c = d;
            if (b > 0) {
                final int n2 = this.a.f() - Math.min(0, this.a.f() - o - this.a.a(view)) - (d + this.a.b(view));
                if (n2 < 0) {
                    this.c -= Math.min(b, -n2);
                }
            }
        }
    }
    
    public final void d() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AnchorInfo{mPosition=");
        sb.append(this.b);
        sb.append(", mCoordinate=");
        sb.append(this.c);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.d);
        sb.append(", mValid=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
