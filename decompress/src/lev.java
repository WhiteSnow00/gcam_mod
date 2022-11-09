import android.media.ImageReader$OnImageAvailableListener;
import android.os.Handler;
import android.media.Image;
import android.view.Surface;
import android.media.ImageReader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lev implements ljx
{
    private final Object a;
    private final ImageReader b;
    private final boolean c;
    
    public lev(final ImageReader b, final boolean c) {
        this.a = new Object();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final int a() {
        synchronized (this.a) {
            return this.b.getHeight();
        }
    }
    
    @Override
    public final int b() {
        synchronized (this.a) {
            return this.b.getImageFormat();
        }
    }
    
    @Override
    public final int c() {
        synchronized (this.a) {
            return this.b.getMaxImages();
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.a) {
            this.b.close();
        }
    }
    
    @Override
    public final int d() {
        synchronized (this.a) {
            return this.b.getWidth();
        }
    }
    
    @Override
    public final Surface e() {
        synchronized (this.a) {
            return this.b.getSurface();
        }
    }
    
    @Override
    public final lju f() {
        synchronized (this.a) {
            final Image acquireLatestImage = this.b.acquireLatestImage();
            if (acquireLatestImage == null) {
                return null;
            }
            return new let(acquireLatestImage);
        }
    }
    
    @Override
    public final lju g() {
        synchronized (this.a) {
            final Image acquireNextImage = this.b.acquireNextImage();
            if (acquireNextImage == null) {
                return null;
            }
            return new let(acquireNextImage);
        }
    }
    
    @Override
    public final void h() {
        synchronized (this.a) {
            if (this.c) {
                this.b.discardFreeBuffers();
            }
            else {
                try {
                    jlm.a(this.b);
                }
                catch (final RuntimeException ex) {}
            }
        }
    }
    
    @Override
    public final void i(final ljw ljw, final Handler handler) {
        synchronized (this.a) {
            this.b.setOnImageAvailableListener((ImageReader$OnImageAvailableListener)new leu(ljw), handler);
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this.a) {
            final niy c = nfa.c(this.b);
            monitorexit(this.a);
            c.e("width", this.d());
            c.e("height", this.a());
            c.b("format", lou.f(this.b()));
            c.e("max images", this.c());
            return c.toString();
        }
    }
}
