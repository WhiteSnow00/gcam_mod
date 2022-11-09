import android.graphics.Point;
import android.content.res.Resources$Theme;
import android.view.View;
import android.view.MotionEvent;
import android.content.res.Resources;
import android.widget.ImageView;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbj
{
    public final ZoomLockView a;
    public final ImageView b;
    public final ImageView c;
    public final Resources d;
    public MotionEvent e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public final float j;
    
    public jbj(final ZoomLockView a) {
        this.a = a;
        this.b = a.b;
        this.c = a.a;
        final Resources resources = a.getResources();
        this.d = resources;
        this.j = (float)(resources.getDimensionPixelSize(2131166433) - resources.getDimensionPixelSize(2131166427) / 2 + resources.getDimensionPixelSize(2131166418));
    }
    
    public static final float c(final float n, float n2, float max) {
        final float min = Math.min(n2, max);
        max = Math.max(n2, max);
        n2 = n;
        if (n <= min) {
            n2 = min;
        }
        if (n2 >= max) {
            return max;
        }
        return n2;
    }
    
    public final void a() {
        this.e = null;
        final ZoomLockView a = this.a;
        if (a.c.isRunning()) {
            a.c.cancel();
        }
        if (a.getVisibility() != 8) {
            a.d.start();
        }
    }
    
    public final void b(final boolean b) {
        final jcb g = this.a.g;
        final Point z = jwn.Z((View)this.b);
        final float n = (float)(z.x + this.b.getWidth() / 2);
        final float n2 = (float)(z.y + this.b.getHeight() / 2);
        final jcb a = jcb.a;
        Label_0307: {
            switch (g.ordinal()) {
                default: {
                    final Point z2 = jwn.Z((View)this.c);
                    if (z2.x <= n && n <= z2.x + this.c.getWidth() && z2.y <= n2 && n2 <= z2.y + this.c.getHeight()) {
                        break;
                    }
                    break Label_0307;
                }
                case 2: {
                    if (n2 >= jwn.Z((View)this.c).y && n2 <= jwn.Z((View)this.c).y + this.c.getHeight()) {
                        break;
                    }
                    break Label_0307;
                }
                case 1: {
                    final float n3 = (float)(z.y - this.b.getHeight());
                    if (n3 <= jwn.Z((View)this.c).y && n3 >= jwn.Z((View)this.c).y - this.c.getHeight()) {
                        break;
                    }
                    break Label_0307;
                }
            }
            if (!this.i && (!this.a.c.isRunning() || b)) {
                if (!this.h) {
                    this.c.setImageDrawable(this.d.getDrawable(2131231264, (Resources$Theme)null));
                    this.h = true;
                }
                return;
            }
        }
        if (this.h) {
            this.c.setImageDrawable(this.d.getDrawable(2131231263, (Resources$Theme)null));
            this.h = false;
        }
    }
}
