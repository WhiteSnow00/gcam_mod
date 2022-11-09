import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class gc extends ge
{
    private final fo g;
    
    public gc(final int n, final int n2, final fo g, final aan aan) {
        super(n, n2, g.c, aan);
        this.g = g;
    }
    
    @Override
    public final void a() {
        super.a();
        this.g.d();
    }
    
    @Override
    public final void b() {
        if (super.f == 2) {
            final ei c = this.g.c;
            final View focus = c.O.findFocus();
            if (focus != null) {
                c.L(focus);
                if (fi.R(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Saved focused view ");
                    sb.append(focus);
                    sb.append(" for Fragment ");
                    sb.append(c);
                    sb.toString();
                }
            }
            final View z = super.a.z();
            if (z.getParent() == null) {
                this.g.a();
                z.setAlpha(0.0f);
            }
            if (z.getAlpha() == 0.0f && z.getVisibility() == 0) {
                z.setVisibility(4);
            }
            final ef r = c.R;
            float l;
            if (r == null) {
                l = 1.0f;
            }
            else {
                l = r.l;
            }
            z.setAlpha(l);
        }
    }
}
