import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.SeekBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pd extends SeekBar
{
    private final pe a;
    
    public pd(final Context context, final AttributeSet set) {
        super(context, set, 2130969620);
        tj.d((View)this, this.getContext());
        (this.a = new pe(this)).a(set, 2130969620);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final pe a = this.a;
        final Drawable c = a.c;
        if (c != null && c.isStateful() && c.setState(a.b.getDrawableState())) {
            a.b.invalidateDrawable(c);
        }
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable c = this.a.c;
        if (c != null) {
            c.jumpToCurrentState();
        }
    }
    
    protected final void onDraw(final Canvas canvas) {
        monitorenter(this);
        try {
            super.onDraw(canvas);
            final pe a = this.a;
            if (a.c != null) {
                final int max = a.b.getMax();
                int n = 1;
                if (max > 1) {
                    final int intrinsicWidth = a.c.getIntrinsicWidth();
                    final int intrinsicHeight = a.c.getIntrinsicHeight();
                    int n2;
                    if (intrinsicWidth >= 0) {
                        n2 = intrinsicWidth >> 1;
                    }
                    else {
                        n2 = 1;
                    }
                    if (intrinsicHeight >= 0) {
                        n = intrinsicHeight >> 1;
                    }
                    a.c.setBounds(-n2, -n, n2, n);
                    final float n3 = (a.b.getWidth() - a.b.getPaddingLeft() - a.b.getPaddingRight()) / (float)max;
                    final int save = canvas.save();
                    canvas.translate((float)a.b.getPaddingLeft(), (float)(a.b.getHeight() / 2));
                    for (int i = 0; i <= max; ++i) {
                        a.c.draw(canvas);
                        canvas.translate(n3, 0.0f);
                    }
                    canvas.restoreToCount(save);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
