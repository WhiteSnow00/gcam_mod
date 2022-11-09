import android.view.ViewGroup$LayoutParams;
import android.util.Size;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.support.constraint.ConstraintLayout;
import j$.time.Duration;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hti
{
    public final RoundedThumbnailView a;
    public final Duration b;
    public jcb c;
    public ConstraintLayout d;
    private final njp e;
    private final ViewGroup f;
    
    public hti(final Context context, final njp e, final RoundedThumbnailView a) {
        this.c = jcb.a;
        this.e = e;
        this.a = a;
        this.f = (ViewGroup)a.getParent();
        this.b = Duration.ofMillis((long)context.getResources().getInteger(2131492979));
    }
    
    public final void a(final View view) {
        if (view.getParent() == this.d) {
            final Rect rect = new Rect();
            final ins b = ((inw)this.e.a()).b;
            final Rect i = b.i;
            final Size b2 = b.b;
            final Point point = new Point();
            final jcb a = jcb.a;
            switch (this.c.ordinal()) {
                default: {
                    point.x = i.left;
                    point.y = i.top;
                    break;
                }
                case 2: {
                    point.x = i.top;
                    point.y = b2.getWidth() - i.left - i.width();
                    break;
                }
                case 1: {
                    point.x = b2.getHeight() - i.height();
                    point.y = i.left;
                    break;
                }
            }
            final int width = this.f.getWidth();
            final int width2 = this.a.getWidth();
            final int height = this.f.getHeight();
            final int height2 = this.a.getHeight();
            rect.left = point.x + this.f.getLeft() + (width - width2) / 2;
            rect.top = point.y + this.f.getTop() + (height - height2) / 2;
            rect.right = rect.left + this.a.getWidth();
            rect.bottom = rect.top + this.a.getHeight();
            final ct ct = new ct();
            ct.d(this.d);
            ct.e(view.getId(), 6, 0, 6, rect.left);
            ct.e(view.getId(), 3, 0, 3, rect.top);
            ct.b(this.d);
        }
    }
    
    final void b(final ConstraintLayout d) {
        final htg htg = new htg(this, d);
        if (this.a.getLeft() != 0 && this.a.getTop() != 0 && this.a.getRight() != 0 && this.a.getBottom() != 0) {
            if (this.a.getParent() != d) {
                this.d = d;
                final RoundedThumbnailView roundedThumbnailView = (RoundedThumbnailView)d.findViewById(2131428061);
                this.a((View)roundedThumbnailView);
                final int indexOfChild = ((ViewGroup)roundedThumbnailView.getParent()).indexOfChild((View)roundedThumbnailView);
                final ViewGroup$LayoutParams layoutParams = roundedThumbnailView.getLayoutParams();
                d.removeView((View)roundedThumbnailView);
                this.f.removeView((View)this.a);
                this.a.setRotation((float)jvu.p(this.c));
                this.a.setShrinkTouchArea(true);
                d.addView((View)this.a, indexOfChild, layoutParams);
            }
            return;
        }
        this.a.post((Runnable)htg);
    }
}
