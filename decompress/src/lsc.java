import android.view.MotionEvent;
import android.widget.Toast;
import com.google.android.libraries.memorymonitor.MemoryMonitorView;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsc extends GestureDetector$SimpleOnGestureListener
{
    public float a;
    public float b;
    public final /* synthetic */ MemoryMonitorView c;
    private Toast e;
    private float f;
    
    public lsc(final MemoryMonitorView c) {
        this.c = c;
    }
    
    public final void a(final String s, final Object... array) {
        final Toast e = this.e;
        if (e != null) {
            e.cancel();
        }
        (this.e = Toast.makeText(this.c.getContext(), (CharSequence)String.format(s, array), 1)).show();
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        final float a = lsa.a();
        this.a = a;
        this.b = a;
        this.f = a - MemoryMonitorView.b((double)this.c.f.c) / MemoryMonitorView.a;
        return true;
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, float max, final float n) {
        max = this.b + n / this.c.e;
        this.b = max;
        max = Math.max(this.f, Math.min(max, 1.0f));
        this.b = max;
        this.a("Target heap usage: %.2f%% (%.2f MB)", max * 100.0f, this.b * MemoryMonitorView.a);
        return true;
    }
}
