import android.graphics.drawable.Drawable$Callback;
import android.view.Gravity;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutCompat;

// 
// Decompiled by Procyon v0.6.0
// 

public class nej extends LinearLayoutCompat
{
    protected boolean a;
    boolean b;
    private Drawable c;
    private final Rect d;
    private final Rect e;
    private int i;
    
    public nej(final Context context) {
        this(context, null);
    }
    
    public nej(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public nej(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = new Rect();
        this.e = new Rect();
        this.i = 119;
        this.a = true;
        this.b = false;
        final TypedArray a = nem.a(context, set, nel.a, n, 0, new int[0]);
        this.i = a.getInt(1, this.i);
        final Drawable drawable = a.getDrawable(0);
        if (drawable != null) {
            this.setForeground(drawable);
        }
        this.a = a.getBoolean(2, true);
        a.recycle();
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final Drawable c = this.c;
        if (c != null) {
            if (this.b) {
                this.b = false;
                final Rect d = this.d;
                final Rect e = this.e;
                final int n = this.getRight() - this.getLeft();
                final int n2 = this.getBottom() - this.getTop();
                if (this.a) {
                    d.set(0, 0, n, n2);
                }
                else {
                    d.set(this.getPaddingLeft(), this.getPaddingTop(), n - this.getPaddingRight(), n2 - this.getPaddingBottom());
                }
                Gravity.apply(this.i, c.getIntrinsicWidth(), c.getIntrinsicHeight(), d, e);
                c.setBounds(e);
            }
            c.draw(canvas);
        }
    }
    
    public final void drawableHotspotChanged(final float n, final float n2) {
        super.drawableHotspotChanged(n, n2);
        final Drawable c = this.c;
        if (c != null) {
            c.setHotspot(n, n2);
        }
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable c = this.c;
        if (c != null && c.isStateful()) {
            this.c.setState(this.getDrawableState());
        }
    }
    
    public final Drawable getForeground() {
        return this.c;
    }
    
    public final int getForegroundGravity() {
        return this.i;
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable c = this.c;
        if (c != null) {
            c.jumpToCurrentState();
        }
    }
    
    @Override
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.b |= b;
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.b = true;
    }
    
    public final void setForeground(final Drawable c) {
        final Drawable c2 = this.c;
        if (c2 != c) {
            if (c2 != null) {
                c2.setCallback((Drawable$Callback)null);
                this.unscheduleDrawable(this.c);
            }
            if ((this.c = c) != null) {
                this.setWillNotDraw(false);
                c.setCallback((Drawable$Callback)this);
                if (c.isStateful()) {
                    c.setState(this.getDrawableState());
                }
                if (this.i == 119) {
                    c.getPadding(new Rect());
                }
            }
            else {
                this.setWillNotDraw(true);
            }
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public final void setForegroundGravity(int i) {
        if (this.i != i) {
            int n = i;
            if ((0x800007 & i) == 0x0) {
                n = (i | 0x800003);
            }
            i = n;
            if ((n & 0x70) == 0x0) {
                i = (n | 0x30);
            }
            this.i = i;
            if (i == 119 && this.c != null) {
                this.c.getPadding(new Rect());
            }
            this.requestLayout();
        }
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c;
    }
}
