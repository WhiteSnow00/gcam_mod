import android.os.Message;
import android.os.Looper;
import com.google.geo.lightfield.processing.ProgressCallback;
import java.lang.ref.WeakReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ogi extends Handler
{
    public final WeakReference a;
    public float b;
    public float c;
    
    public ogi(final ProgressCallback progressCallback, final Looper looper) {
        super(looper);
        this.b = 0.0f;
        this.c = 0.0f;
        this.a = new WeakReference((T)progressCallback);
    }
    
    public final void a() {
        this.sendMessageDelayed(this.obtainMessage(1, 0, 0), 250L);
    }
    
    public final void handleMessage(final Message message) {
        if (message.what == 2) {
            this.removeMessages(1);
            ogj.a = false;
            Looper.myLooper().quitSafely();
            return;
        }
        final ProgressCallback progressCallback = (ProgressCallback)this.a.get();
        if (progressCallback == null) {
            return;
        }
        float progress = 0.0f;
        Label_0135: {
            if ((!Float.isNaN(this.c) && this.c != 0.0f) || this.b <= 0.0f) {
                final float b = this.b;
                if (b < 0.99f) {
                    final float n = (1.0f - b) * 0.75f + 0.05f * b;
                    final float c = this.c;
                    progress = Math.max(c, n * c + b * (1.0f - n));
                    this.c = progress;
                    break Label_0135;
                }
            }
            progress = this.b;
            this.c = progress;
        }
        progressCallback.setProgress(progress);
        this.a();
    }
}
