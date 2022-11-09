import android.view.MotionEvent;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import android.content.Context;
import com.google.android.apps.camera.ui.layout.GcaLayout;

// 
// Decompiled by Procyon v0.6.0
// 

final class hei extends GcaLayout
{
    public hei(final Context context) {
        super(context);
        this.setTag((Object)this.toString());
        this.setVisibility(8);
    }
    
    public static final oey d() {
        final ofn f = ofn.f();
        Choreographer.getInstance().postFrameCallback((Choreographer$FrameCallback)new heh(f));
        return f;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return true;
    }
}
