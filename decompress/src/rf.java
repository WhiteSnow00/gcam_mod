import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class rf implements Runnable
{
    final /* synthetic */ rj a;
    private final /* synthetic */ int b;
    
    public rf(final rj a) {
        this.a = a;
    }
    
    public rf(final rj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final ql e = this.a.e;
                if (e != null && ik.T((View)e) && this.a.e.getCount() > this.a.e.getChildCount()) {
                    final int childCount = this.a.e.getChildCount();
                    final rj a = this.a;
                    if (childCount <= a.k) {
                        a.p.setInputMethodMode(2);
                        this.a.s();
                    }
                }
                return;
            }
            case 1: {
                final View l = this.a.l;
                if (l != null && l.getWindowToken() != null) {
                    this.a.s();
                }
                return;
            }
            case 0: {
                this.a.q();
            }
        }
    }
}
