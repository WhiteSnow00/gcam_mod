import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class ro extends rp
{
    public ro(final se se) {
        super(se);
    }
    
    @Override
    public final int a(final View view) {
        return se.bm(view) + ((sf)view.getLayoutParams()).bottomMargin;
    }
    
    @Override
    public final int b(final View view) {
        final sf sf = (sf)view.getLayoutParams();
        return se.ba(view) + sf.topMargin + sf.bottomMargin;
    }
    
    @Override
    public final int c(final View view) {
        final sf sf = (sf)view.getLayoutParams();
        return se.bb(view) + sf.leftMargin + sf.rightMargin;
    }
    
    @Override
    public final int d(final View view) {
        return se.bp(view) - ((sf)view.getLayoutParams()).topMargin;
    }
    
    @Override
    public final int e() {
        return this.a.D;
    }
    
    @Override
    public final int f() {
        final se a = this.a;
        return a.D - a.an();
    }
    
    @Override
    public final int g() {
        return this.a.an();
    }
    
    @Override
    public final int h() {
        return this.a.B;
    }
    
    @Override
    public final int i() {
        return this.a.A;
    }
    
    @Override
    public final int j() {
        return this.a.aq();
    }
    
    @Override
    public final int k() {
        final se a = this.a;
        return a.D - a.aq() - this.a.an();
    }
    
    @Override
    public final int l(final View view) {
        this.a.bg(view, this.c);
        return this.c.bottom;
    }
    
    @Override
    public final int m(final View view) {
        this.a.bg(view, this.c);
        return this.c.top;
    }
    
    @Override
    public final void n(final int n) {
        this.a.aD(n);
    }
}
