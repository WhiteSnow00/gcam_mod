import android.hardware.Camera;
import android.os.Handler;
import android.hardware.Camera$PreviewCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class arx implements Camera$PreviewCallback
{
    public final esl a;
    private final Handler b;
    
    private arx(final Handler b, final esl a) {
        this.b = b;
        this.a = a;
    }
    
    public static arx a(final Handler handler, final esl esl) {
        if (handler != null && esl != null) {
            return new arx(handler, esl);
        }
        return null;
    }
    
    public final void onPreviewFrame(final byte[] array, final Camera camera) {
        this.b.post((Runnable)new arw(this, array));
    }
}
