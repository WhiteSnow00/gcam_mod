import java.util.concurrent.Callable;
import com.google.android.libraries.oliveoil.gl.EGLImage;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lzn extends lyv
{
    private lzn(final lyp lyp, final lwh lwh) {
        super(lyp, lwh);
    }
    
    public static lzn b(final lyp lyp, final EGLImage eglImage) {
        final lvk b = eglImage.b();
        final lzn lzn = new lzn(lyp, lyv.h(lyp, new lzm(lyp, new lxy(b), b)));
        lzn.i(new lyf(lzn), new lye(eglImage)).h(lvm.a);
        return lzn;
    }
    
    public final lxx c() {
        return ((maj)this.j()).g;
    }
    
    @Override
    public final String toString() {
        final String simpleName = this.getClass().getSimpleName();
        final int hashCode = this.hashCode();
        final String value = String.valueOf(this.c());
        final StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 21 + String.valueOf(value).length());
        sb.append(simpleName);
        sb.append("@");
        sb.append(hashCode);
        sb.append("[layout=");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
