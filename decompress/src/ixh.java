import android.view.SurfaceHolder;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.content.res.Resources$Theme;
import android.view.SurfaceHolder$Callback;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import android.content.Context;
import android.view.SurfaceHolder$Callback2;
import android.widget.FrameLayout;
import android.view.SurfaceView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixh implements krc
{
    private static int i;
    public final krr a;
    public final SurfaceView b;
    public final niz c;
    public final kse d;
    public final ixs e;
    public boolean f;
    public ofn g;
    public final hwh h;
    private final FrameLayout j;
    private final SurfaceHolder$Callback2 k;
    
    static {
        ixh.i = 0;
    }
    
    public ixh(final Context context, final krq krq, final ixx ixx, final CameraActivityTiming cameraActivityTiming, final hwc hwc, final ixs e, final cxl cxl, final kse d, final niz c, final ixi ixi) {
        this.f = false;
        final FrameLayout d2 = ixx.d;
        this.j = d2;
        final SurfaceView b = new SurfaceView(context);
        this.b = b;
        this.e = e;
        this.d = d;
        this.h = (hwh)hwc.a();
        this.c = c;
        final int i = ixh.i;
        ixh.i = i + 1;
        final StringBuilder sb = new StringBuilder(23);
        sb.append("ViewfinderSV");
        sb.append(i);
        this.a = krq.a(sb.toString());
        final SurfaceHolder holder = b.getHolder();
        final niz c2 = e.c;
        this.g = ofn.f();
        holder.addCallback((SurfaceHolder$Callback)(this.k = (SurfaceHolder$Callback2)new ixg(this)));
        holder.addCallback((SurfaceHolder$Callback)ixi);
        final kre a = e.a;
        holder.setFixedSize(a.a, a.b);
        if (cxl.k(cxr.aQ) && e.b.equals(kqp.b)) {
            b.setBackground(context.getResources().getDrawable(2131231668, (Resources$Theme)null));
            b.setClipToOutline(true);
        }
        d2.addView((View)b, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        cameraActivityTiming.j(hvu.j, CameraActivityTiming.a);
    }
    
    public final void a(final String s) {
        kjm.a();
        final ofn g = this.g;
        if (g != null && !g.isDone()) {
            final krr a = this.a;
            a.getClass();
            String concat;
            if (s.length() != 0) {
                concat = "Previous request exists, returning exception. Reason: ".concat(s);
            }
            else {
                concat = new String("Previous request exists, returning exception. Reason: ");
            }
            a.b(concat);
            this.g.a(new kuw(s));
        }
    }
    
    @Override
    public final void close() {
        kjm.a();
        this.a("Closed");
        this.b.getHolder().removeCallback((SurfaceHolder$Callback)this.k);
        this.j.removeView((View)this.b);
        this.f = true;
    }
}
