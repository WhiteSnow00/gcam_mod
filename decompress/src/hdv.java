import com.google.android.apps.camera.ui.views.CutoutBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdv
{
    public jbm a;
    public CutoutBar b;
    public boolean c;
    public final kjm d;
    public final Object e;
    public final klj f;
    public final klj g;
    public final bmz h;
    
    public hdv(final bmz h, final klv f, final klj g, final kjm d) {
        this.a = jbm.a;
        this.e = new Object();
        this.f = f;
        this.g = g;
        this.h = h;
        this.d = d;
    }
    
    public final void a(final jbm jbm) {
        if (this.b == null) {
            return;
        }
        if (!this.c || !jbm.equals(jbm.m)) {
            this.b.setVisibility(4);
            return;
        }
        final CutoutBar b = this.b;
        final cxc b2 = b.b;
        if (b2 == null) {
            a.l(CutoutBar.a.b(), "Not showing due to cutout info is null.", '\u0ba8');
            return;
        }
        b.e = b2.c;
        b.c = b2.a;
        b.d = b2.b;
        b.setVisibility(0);
        b.invalidate();
    }
}
