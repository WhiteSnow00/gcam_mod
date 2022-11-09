import android.media.Image;
import android.media.ImageWriter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ley implements krc
{
    private final Object a;
    private final ImageWriter b;
    private final int c;
    
    public ley(final ImageWriter b) {
        this.a = new Object();
        this.b = b;
        this.c = b.getFormat();
        b.getMaxImages();
    }
    
    public final void a(final lju lju, final long timestamp) {
        synchronized (this.a) {
            final Image image = (Image)lfe.d(lju);
            try {
                image.setTimestamp(timestamp);
                this.b.queueInputImage(image);
                monitorexit(this.a);
                lju.close();
            }
            catch (final IllegalStateException ex) {
                throw new kuw(ex);
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.a) {
            this.b.close();
        }
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("format", lou.f(this.c));
        return c.toString();
    }
}
