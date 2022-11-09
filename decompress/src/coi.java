import com.google.android.apps.camera.camcorder.ui.modeslider.ModeSlider;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class coi implements cou
{
    final /* synthetic */ coj a;
    
    public coi(final coj a) {
        this.a = a;
    }
    
    @Override
    public final void a(final View view, final boolean b) {
        final ModeSlider modeSlider = (ModeSlider)view;
        final jbm a = modeSlider.a(modeSlider.a.get());
        if (!this.a.j(a)) {
            if (b) {
                this.a.a();
            }
            return;
        }
        this.a.g(a);
    }
    
    @Override
    public final void b(final boolean b) {
        if (b) {
            final coj a = this.a;
            a.b.setClickable(false);
            a.g.l(false);
            a.h.F(false);
            a.d.g(2);
        }
    }
}
