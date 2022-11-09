import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fnn extends BottomBarListener
{
    final /* synthetic */ fol a;
    
    public fnn(final fol a) {
        this.a = a;
    }
    
    @Override
    public final void onCancelButtonPressed() {
        this.a.y();
    }
    
    @Override
    public final void onRetakeButtonPressed() {
        final fol a = this.a;
        ++a.N;
        if (a.q == 0) {
            a.l(fol.b.b(), "Can't undo capture, no images captured.", '\u06aa');
            return;
        }
        if (esh.r() && this.a.i.b.g().a() != 8) {
            final fol a2 = this.a;
            final int q = a2.q;
            if (q > 0) {
                a2.q = q - 1;
                a2.r.d();
                this.a.C.sendEmptyMessage(101);
            }
            final fol a3 = this.a;
            if (a3.q == 0) {
                a3.v();
            }
            return;
        }
        a.l(fol.b.b(), "Can't undo capture, LightCycle not ready to undo.", '\u06a9');
    }
}
