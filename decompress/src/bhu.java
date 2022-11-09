import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bhu implements bhy
{
    private bhj a;
    
    public bhu() {
        if (biv.o(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }
    
    @Override
    public final bhj c() {
        return this.a;
    }
    
    @Override
    public final void d(final bhx bhx) {
        bhx.g(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    @Override
    public final void e(final Drawable drawable) {
    }
    
    @Override
    public final void f(final Drawable drawable) {
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final void h() {
    }
    
    @Override
    public final void i() {
    }
    
    @Override
    public final void j(final bhx bhx) {
    }
    
    @Override
    public final void k(final bhj a) {
        this.a = a;
    }
}
