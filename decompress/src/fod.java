import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fod implements View$OnTouchListener
{
    final /* synthetic */ fol a;
    
    public fod(final fol a) {
        this.a = a;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final ess s = this.a.s;
        boolean b = false;
        if (s != null) {
            switch (motionEvent.getAction() & 0xFF) {
                case 6: {
                    s.d = false;
                    s.b.a(s.f / s.e);
                    return true;
                }
                case 5: {
                    s.e = ess.i(motionEvent);
                    return s.d = true;
                }
                case 2: {
                    if (s.d && motionEvent.getPointerCount() > 1) {
                        final float i = ess.i(motionEvent);
                        s.f = i;
                        final float e = s.e;
                        final esv b2 = s.b;
                        b2.e(i / e);
                        b2.l = true;
                        return true;
                    }
                    b = true;
                    break;
                }
                case 0: {
                    return true;
                }
            }
            return b;
        }
        return false;
    }
}
