import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import com.google.mediapipe.framework.TextureFrame;

// 
// Decompiled by Procyon v0.6.0
// 

final class djv
{
    public final long a;
    public final ofn b;
    public final Object c;
    public boolean d;
    public TextureFrame e;
    public man f;
    final /* synthetic */ djw g;
    
    public djv(final djw g, final long a) {
        this.g = g;
        this.b = ofn.f();
        this.c = new Object();
        this.d = false;
        this.e = null;
        this.f = null;
        this.a = a;
    }
    
    final man a() {
        synchronized (this.c) {
            if (this.d) {
                return null;
            }
            monitorexit(this.c);
            try {
                this.b.get(100L, TimeUnit.MILLISECONDS);
                goto Label_0069;
            }
            catch (final TimeoutException o) {
                djw.a.c().E(797).q("Timeout in processing frame %d", this.a);
            }
            catch (final ExecutionException o) {
                throw new AssertionError((Object)"Unhandled exception");
            }
            catch (final InterruptedException ex) {}
            try {
                if (this.d) {
                    return null;
                }
                return this.f;
            }
            finally {}
            throw new AssertionError((Object)"Unhandled exception");
        }
    }
    
    final void b() {
        synchronized (this.c) {
            this.d = true;
            final TextureFrame e = this.e;
            if (e != null) {
                e.release();
            }
            try (final man f = this.f) {}
        }
    }
}
