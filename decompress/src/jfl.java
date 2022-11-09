import android.graphics.Rect;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.VideoView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfl implements jfg
{
    public final jff a;
    public final jej b;
    public final jew c;
    public final View d;
    public final int e;
    public VideoView f;
    public ImageButton g;
    public ImageButton h;
    public TextView i;
    public TextView j;
    public SeekBar k;
    public View l;
    public boolean m;
    public boolean n;
    public View o;
    private final boolean p;
    
    public jfl(final jff a, final jej b, final jew c, final View d, final boolean p5) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.p = p5;
        this.e = d.getResources().getInteger(17694720);
    }
    
    @Override
    public final void a(final int max) {
        this.i.setText((CharSequence)leg.f(max));
        this.k.setMax(max);
    }
    
    @Override
    public final void b(final int progress) {
        this.j.setText((CharSequence)leg.f(progress));
        this.k.setProgress(progress);
    }
    
    @Override
    public final void c() {
        this.n = true;
        if (!this.p) {
            this.l.animate().alpha(1.0f).setDuration((long)this.e).withStartAction((Runnable)new jfj(this, 3)).start();
        }
        if (this.m) {
            this.h.setVisibility(8);
            this.g.animate().alpha(1.0f).setDuration((long)this.e).withStartAction((Runnable)new jfj(this, 4)).start();
            return;
        }
        this.g.setVisibility(8);
        this.h.animate().alpha(1.0f).setDuration((long)this.e).withStartAction((Runnable)new jfj(this, 5)).start();
    }
    
    public final void d(final Rect rect) {
        this.o.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
