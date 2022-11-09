import android.view.MotionEvent;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hco extends jwn
{
    final /* synthetic */ View$OnTouchListener a;
    final /* synthetic */ hcp b;
    
    public hco(final hcp b, final View$OnTouchListener a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean a(final MotionEvent motionEvent) {
        return nns.o(0, 2, 1).contains(motionEvent.getActionMasked());
    }
    
    @Override
    public final boolean b(final jdh jdh) {
        this.b.m.post((Runnable)new hcn(this, this.a, jdh));
        return false;
    }
}
