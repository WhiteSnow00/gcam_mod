import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class rn extends rp
{
    public rn(final se se) {
        super(se);
    }
    
    @Override
    public final int a(final View view) {
        return se.bo(view) + ((sf)view.getLayoutParams()).rightMargin;
    }
    
    @Override
    public final int b(final View view) {
        final sf sf = (sf)view.getLayoutParams();
        return se.bb(view) + sf.leftMargin + sf.rightMargin;
    }
    
    @Override
    public final int c(final View view) {
        final sf sf = (sf)view.getLayoutParams();
        return se.ba(view) + sf.topMargin + sf.bottomMargin;
    }
    
    @Override
    public final int d(final View view) {
        return se.bn(view) - ((sf)view.getLayoutParams()).leftMargin;
    }
    
    @Override
    public final int e() {
        return this.a.C;
    }
    
    @Override
    public final int f() {
        final se a = this.a;
        return a.C - a.ap();
    }
    
    @Override
    public final int g() {
        return this.a.ap();
    }
    
    @Override
    public final int h() {
        return this.a.A;
    }
    
    @Override
    public final int i() {
        return this.a.B;
    }
    
    @Override
    public final int j() {
        return this.a.ao();
    }
    
    @Override
    public final int k() {
        final se a = this.a;
        return a.C - a.ao() - this.a.ap();
    }
    
    @Override
    public final int l(final View view) {
        this.a.bg(view, this.c);
        return this.c.right;
    }
    
    @Override
    public final int m(final View view) {
        this.a.bg(view, this.c);
        return this.c.left;
    }
    
    @Override
    public final void n(final int n) {
        this.a.aC(n);
    }
}
