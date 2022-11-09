import android.view.View;
import android.view.ViewParent;
import android.view.MotionEvent;
import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

final class qr implements Runnable
{
    final /* synthetic */ qs a;
    private final /* synthetic */ int b;
    
    public qr(final qs a) {
        this.a = a;
    }
    
    public qr(final qs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final ViewParent parent = this.a.c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                return;
            }
            case 0: {
                final qs a = this.a;
                a.d();
                final View c = a.c;
                if (c.isEnabled()) {
                    if (!c.isLongClickable()) {
                        if (a.b()) {
                            c.getParent().requestDisallowInterceptTouchEvent(true);
                            final long uptimeMillis = SystemClock.uptimeMillis();
                            final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            c.onTouchEvent(obtain);
                            obtain.recycle();
                            a.d = true;
                        }
                    }
                }
            }
        }
    }
}
