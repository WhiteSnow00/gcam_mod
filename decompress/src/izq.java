import android.widget.LinearLayout;
import com.google.android.apps.camera.ui.elapsedtimeui.LongPressElapsedTimeView;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izq implements jap
{
    private final ims a;
    private final ims b;
    private final pii c;
    private final cxl d;
    
    public izq(final ims a, final ims b, final pii c, final cxl d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a() {
        final jea c = ((ixw)this.c.get()).c;
        final ElapsedTimerView elapsedTimerView = (ElapsedTimerView)c.c(2131427578);
        final LongPressElapsedTimeView longPressElapsedTimeView = (LongPressElapsedTimeView)c.c(2131427714);
        if (this.d.k(cxw.n)) {
            this.b.i(longPressElapsedTimeView);
        }
        else {
            this.b.i(elapsedTimerView);
        }
        this.a.i(elapsedTimerView);
    }
}
