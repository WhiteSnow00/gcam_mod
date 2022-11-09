import androidx.viewpager2.widget.ViewPager2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agv extends afo
{
    final /* synthetic */ ViewPager2 a;
    
    public agv(final ViewPager2 a) {
        this.a = a;
    }
    
    @Override
    public final CharSequence b() {
        return "androidx.viewpager.widget.ViewPager";
    }
    
    @Override
    public final void g(final jc jc) {
        if (!this.a.i) {
            jc.j(iz.c);
            jc.j(iz.b);
            jc.i(false);
        }
    }
    
    @Override
    public final boolean o(final int n) {
        return (n == 8192 || n == 4096) && !this.a.i;
    }
    
    @Override
    public final boolean p() {
        return true;
    }
    
    @Override
    public final void s(final int n) {
        if (this.o(n)) {
            return;
        }
        throw new IllegalStateException();
    }
}
