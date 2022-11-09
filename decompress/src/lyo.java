import java.util.concurrent.Callable;
import com.google.android.libraries.oliveoil.gl.EGLImage;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lyo extends lyv
{
    public lyo(final lyp lyp, final lwh lwh) {
        super(lyp, lwh);
    }
    
    public static lyo b(final lyp lyp, final EGLImage eglImage) {
        if (eglImage.a() != 35 && eglImage.a() != 34) {
            return new lyo(lyp, lyv.h(lyp, new lyn(lyp, eglImage)));
        }
        final lzn b = lzn.b(lyp, eglImage);
        return d(mga.g(man.d(b.a, b.c(), ((maj)b.j()).b, ((maj)b.j()).c)));
    }
    
    public static lyo c(final lyp lyp, final mde mde, final lvk lvk) {
        return new lyo(lyp, lyp.d().i(new lyi(lvk), new lyl(mde, lvk)));
    }
    
    public static lyo d(final mde mde) {
        final lyp a = ((man)mde.c()).a;
        return new lyo(a, lyv.h(a, new lym(mde)));
    }
    
    public static lyo e(final lyp lyp, final lxx lxx) {
        return d(mga.g(man.c(lyp, lxx)));
    }
    
    public final void f(final mcz mcz) {
        this.i(new lyj(mcz), new lyk(mcz));
    }
}
