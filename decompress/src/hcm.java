import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.rewind.RewindThumbnailScrollView;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hcm implements View$OnTouchListener
{
    final /* synthetic */ RewindThumbnailScrollView a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    private float d;
    private int e;
    
    public hcm(final RewindThumbnailScrollView a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = -1.0f;
        this.e = -1;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            default: {
                return false;
            }
            case 2: {
                if (this.d == -1.0f) {
                    this.d = motionEvent.getX() - jvu.u(5.0f);
                    this.e = this.a.a();
                }
                final int b = this.a.b();
                this.a.smoothScrollTo(Math.min(b, Math.max(0, (int)(this.e * b / (float)this.b + (this.d - motionEvent.getX()) * b / this.c))), 0);
                break;
            }
            case 1: {
                this.d = -1.0f;
                this.e = -1;
                break;
            }
            case 0: {
                this.d = motionEvent.getX();
                this.e = this.a.a();
                break;
            }
        }
        return true;
    }
}
