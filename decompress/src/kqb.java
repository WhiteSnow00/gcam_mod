import android.media.MediaRecorder;
import android.media.MediaRecorder$OnInfoListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class kqb implements MediaRecorder$OnInfoListener
{
    final /* synthetic */ kqc a;
    private boolean b;
    private boolean c;
    
    public kqb(final kqc a) {
        this.a = a;
    }
    
    public final void onInfo(final MediaRecorder mediaRecorder, final int n, final int n2) {
        if (n == 801) {
            if (!this.c) {
                this.c = true;
                this.a.a.f();
            }
        }
        else if (n == 800) {
            if (!this.b) {
                this.b = true;
                this.a.a.d();
            }
        }
        else {
            if (n == 802) {
                this.a.a.e();
                return;
            }
            if (n == 803) {
                this.a.a.g();
            }
        }
    }
}
