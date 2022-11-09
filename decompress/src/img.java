import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import android.view.View;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.os.Handler;
import android.widget.TextView;
import android.view.ViewGroup;
import com.google.android.apps.camera.ui.widget.TracedFrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class img extends TracedFrameLayout
{
    public int a;
    public imf b;
    public final ViewGroup c;
    private final TextView d;
    private final Handler e;
    
    public img(final FrameLayout c) {
        super(c.getContext());
        this.a = 0;
        this.e = new ime(this);
        this.c = (ViewGroup)c;
        this.setTag((Object)"countdown");
        final TextView d = new TextView(c.getContext(), (AttributeSet)null, 2132017530);
        jwn.ac((View)d);
        (this.d = d).setTextAppearance(2132017530);
        d.setGravity(17);
        this.addView((View)d);
    }
    
    public final void a() {
        if (this.a > 0) {
            this.a = 0;
            this.e.removeMessages(1);
            this.c.removeView((View)this);
        }
    }
    
    public final void b(final boolean b, final int a) {
        this.a = a;
        final imf b2 = this.b;
        if (b2 != null) {
            final imb imb = (imb)b2;
            final imc f = imb.f;
            if (f != null) {
                if (b) {
                    f.z();
                }
                else {
                    f.C(a);
                }
                if (a == 0) {
                    imb.f.y();
                }
                else {
                    if (imb.e.g() && !imb.b.k()) {
                        final cxl c = imb.c;
                        final cxo a2 = cxr.a;
                        c.e();
                    }
                    a.l(imb.a.b(), "Should not fire Led indicator", '\u0ad7');
                }
            }
        }
        if (a == 0) {
            this.c.removeView((View)this);
            return;
        }
        this.d.setText((CharSequence)String.format(this.getResources().getConfiguration().locale, "%d", a));
        this.c();
        this.e.sendEmptyMessageDelayed(1, 1000L);
    }
    
    public final void c() {
        final int measuredWidth = this.d.getMeasuredWidth();
        final int measuredHeight = this.d.getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            this.d.setScaleX(1.0f);
            this.d.setScaleY(1.0f);
            this.d.setPivotX((float)(measuredWidth >> 1));
            this.d.setPivotY((float)(measuredHeight >> 1));
            this.d.setAlpha(1.0f);
            this.d.animate().scaleX(1.375f).scaleY(1.375f).alpha(0.0f).setDuration(800L).start();
            return;
        }
        Choreographer.getInstance().postFrameCallback((Choreographer$FrameCallback)new imd(this));
    }
    
    public final boolean d() {
        return this.a > 0;
    }
}
