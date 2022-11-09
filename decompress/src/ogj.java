import android.util.Log;
import android.os.Looper;
import com.google.geo.lightfield.processing.ProgressCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ogj implements ProgressCallback
{
    public static boolean a;
    public final ProgressCallback b;
    public ogi c;
    public Looper d;
    private float e;
    private float f;
    
    static {
        ogj.a = false;
    }
    
    public ogj(final ProgressCallback b) {
        this.e = 0.0f;
        this.f = 1.0f;
        this.b = b;
    }
    
    public final void a() {
        if (ogj.a) {
            final ogi c = this.c;
            if (c != null) {
                ogj.a = false;
                c.sendMessage(c.obtainMessage(2));
                try {
                    this.d.getThread().join();
                }
                catch (final InterruptedException ex) {
                    Log.e("ProgressInterpolator", ex.getMessage());
                }
                this.c = null;
            }
        }
    }
    
    @Override
    public final void setProgress(float b) {
        final ogi c = this.c;
        if (c == null) {
            return;
        }
        b = b * this.f + this.e;
        c.b = b;
        final ProgressCallback progressCallback = (ProgressCallback)c.a.get();
        if (progressCallback != null) {
            progressCallback.setProgress(c.c);
        }
        if (b == 1.0f) {
            this.a();
        }
    }
    
    @Override
    public final void setRange(final float e, final float n) {
        this.e = e;
        this.f = n - e;
    }
    
    @Override
    public final boolean wasCancelled() {
        return false;
    }
}
