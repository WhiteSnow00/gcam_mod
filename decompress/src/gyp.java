import android.graphics.Rect;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gyp implements Runnable
{
    protected final gxz c;
    protected final Executor d;
    protected final long e;
    protected final gyb f;
    protected final hhy g;
    protected final int h;
    
    public gyp(final gyb f, final Executor d, final gxz c, final int h, final hhy g) {
        this.f = f;
        this.e = f.a.d();
        this.d = d;
        this.c = c;
        this.h = h;
        this.g = g;
    }
    
    public static final Rect h(final int n, final int n2, final Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, n, n2);
        }
        final Rect rect2 = new Rect(rect);
        if (rect.top > rect.bottom || rect.left > rect.right || rect.width() <= 0 || rect.height() <= 0) {
            return new Rect(0, 0, 0, 0);
        }
        rect2.left = Math.max(rect2.left, 0);
        rect2.top = Math.max(rect2.top, 0);
        rect2.right = Math.max(Math.min(rect2.right, n), rect2.left);
        rect2.bottom = Math.max(Math.min(rect2.bottom, n2), rect2.top);
        if (rect2.width() > 0 && rect2.height() > 0) {
            return rect2;
        }
        return new Rect(0, 0, 0, 0);
    }
    
    public static final Rect i(final lju lju, final Rect rect) {
        return h(lju.c(), lju.b(), rect);
    }
    
    public final void j(final long n, final gym gym, final int n2) {
        ((gxp)this.c).k.c(new gyn(n, gym, n2));
    }
}
