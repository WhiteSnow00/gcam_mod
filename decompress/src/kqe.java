import android.util.Log;
import android.media.MediaRecorder;
import android.media.MediaRecorder$OnErrorListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class kqe implements MediaRecorder$OnErrorListener
{
    final /* synthetic */ kqf a;
    
    public kqe(final kqf a) {
        this.a = a;
    }
    
    public final void onError(final MediaRecorder mediaRecorder, final int n, final int n2) {
        if (n == 1) {
            final StringBuilder sb = new StringBuilder(47);
            sb.append("MEDIA_RECORDER_ERROR_UNKNOWN: extra=");
            sb.append(n2);
            Log.e("VidRecMedRec", sb.toString());
        }
        else if (n == 100) {
            final StringBuilder sb2 = new StringBuilder(42);
            sb2.append("MEDIA_ERROR_SERVER_DIED: extra=");
            sb2.append(n2);
            Log.e("VidRecMedRec", sb2.toString());
        }
        else {
            if (n2 == -1007) {
                final StringBuilder sb3 = new StringBuilder(57);
                sb3.append("MEDIA_ERROR_MALFORMED: what=");
                sb3.append(n);
                sb3.append(" extra=-1007");
                Log.e("VidRecMedRec", sb3.toString());
                return;
            }
            final StringBuilder sb4 = new StringBuilder(57);
            sb4.append("MediaRecorder onError: what=");
            sb4.append(n);
            sb4.append(" extra=");
            sb4.append(n2);
            Log.e("VidRecMedRec", sb4.toString());
        }
        this.a.c.a();
    }
}
