import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import android.view.View$AccessibilityDelegate;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector;
import android.content.res.Resources$Theme;
import com.google.android.apps.camera.zoomui.ZoomUi;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbb implements jap
{
    private final jjb a;
    private final pii b;
    private final Context c;
    
    public jbb(final jjb a, final pii b, final Context c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        final ZoomUi zoomUi = (ZoomUi)((ixw)this.b.get()).c.c(2131428221);
        final jjb a = this.a;
        final Context c = this.c;
        final jjq jjq = (jjq)a;
        jjq.H = zoomUi;
        final boolean k = jjq.c.k(cxr.at);
        zoomUi.d = k;
        if (!(zoomUi.n().h = k)) {
            final Drawable a2 = aah.a(zoomUi.getContext(), 2131231342);
            if (a2 != null) {
                a2.setTint(zoomUi.getResources().getColor(2131101492, (Resources$Theme)null));
                zoomUi.g().setThumb(a2);
            }
            final Drawable a3 = aah.a(zoomUi.getContext(), 2131231091);
            if (a3 != null) {
                a3.setTint(zoomUi.getResources().getColor(2131101505, (Resources$Theme)null));
                zoomUi.f().setBackground(a3);
            }
        }
        zoomUi.p(jjq.L, jjq.m);
        jjq.B = zoomUi.c();
        jjq.C = zoomUi.d();
        jjq.F = zoomUi.n();
        jjq.G = zoomUi.g();
        jjq.E = c.getResources();
        jjq.I = new jin(jjq.n, jjq.g, jjq.f, jjq.e, jjq.b, jjq.m);
        jjq.z = new jii(zoomUi, jjq.h, jjq.g, jjq.k, jjq.b, jjq.n, jjq.c, jjq.o, jjq.I, jjq.u);
        jjq.y = new jil(zoomUi, jjq.z);
        jjq.R();
        jjq.N();
        jjq.O(jjq.B, false);
        jjq.O(jjq.C, true);
        if (jjq.L) {
            jjq.N = false;
            jjq.M = false;
            jjq.G.setOnTouchListener((View$OnTouchListener)new jjh(jjq, new GestureDetector(jjq.H.g().getContext(), (GestureDetector$OnGestureListener)new jjm(jjq))));
        }
        final jjj jjj = new jjj(jjq, 1);
        final jjj jjj2 = new jjj(jjq);
        jjq.d.c(jjq.g.a(jjj, jjq.w));
        jjq.d.c(jjq.e.a(jjj2, jjq.w));
        jjq.d.c(jjq.f.a(jjj2, jjq.w));
        jjq.G.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new jjn(jjq));
        jjq.G.setAccessibilityDelegate((View$AccessibilityDelegate)new jjo(jjq));
        if (jjq.T.g()) {
            ((hpj)jjq.T.c()).c();
        }
        jjq.y.f();
        if (jjq.l) {
            jjq.L = false;
            jjq.H.p(false, jjq.m);
            jjq.z.w = false;
        }
        final MainActivityLayout mainActivityLayout = (MainActivityLayout)((ixw)this.b.get()).c.c(2131427411);
        mainActivityLayout.g = zoomUi;
        mainActivityLayout.q();
    }
}
