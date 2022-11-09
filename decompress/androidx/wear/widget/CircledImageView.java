// 
// Decompiled by Procyon v0.6.0
// 

package androidx.wear.widget;

import android.view.View$MeasureSpec;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.ArgbEvaluator;
import android.graphics.Paint$Cap;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class CircledImageView extends View
{
    public int a;
    private final RectF b;
    private final Paint c;
    private final ahh d;
    private final ahj e;
    private final Drawable$Callback f;
    private ColorStateList g;
    private Drawable h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private int n;
    private Paint$Cap o;
    private float p;
    private float q;
    private boolean r;
    private float s;
    private float t;
    private Integer u;
    private Integer v;
    
    static {
        new ArgbEvaluator();
    }
    
    public CircledImageView(final Context context) {
        this(context, null);
    }
    
    public CircledImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CircledImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        new Rect();
        final ahf ahf = new ahf(this);
        this.f = (Drawable$Callback)ahf;
        this.q = 1.0f;
        this.r = false;
        this.s = 1.0f;
        this.t = 0.0f;
        new ahg(this);
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, ahd.a);
        ik.E(this, context, ahd.a, set, obtainStyledAttributes, 0, 0);
        final Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.h = drawable;
        if (drawable != null && drawable.getConstantState() != null) {
            final Drawable drawable2 = this.h.getConstantState().newDrawable(context.getResources(), context.getTheme());
            this.h = drawable2;
            this.h = drawable2.mutate();
        }
        if ((this.g = obtainStyledAttributes.getColorStateList(4)) == null) {
            this.g = ColorStateList.valueOf(context.getColor(17170432));
        }
        final float dimension = obtainStyledAttributes.getDimension(5, 0.0f);
        this.i = dimension;
        this.k = obtainStyledAttributes.getDimension(7, dimension);
        this.n = obtainStyledAttributes.getColor(2, -16777216);
        this.o = Paint$Cap.values()[obtainStyledAttributes.getInt(1, 0)];
        final float dimension2 = obtainStyledAttributes.getDimension(3, 0.0f);
        this.p = dimension2;
        if (dimension2 > 0.0f) {
            this.m += dimension2 / 2.0f;
        }
        final float dimension3 = obtainStyledAttributes.getDimension(25, 0.0f);
        if (dimension3 > 0.0f) {
            this.m += dimension3;
        }
        this.s = obtainStyledAttributes.getFloat(23, 0.0f);
        this.t = obtainStyledAttributes.getFloat(24, 0.0f);
        if (obtainStyledAttributes.hasValue(26)) {
            this.u = obtainStyledAttributes.getColor(26, 0);
        }
        if (obtainStyledAttributes.hasValue(19)) {
            this.v = obtainStyledAttributes.getInt(19, 0);
        }
        final float fraction = obtainStyledAttributes.getFraction(6, 1, 1, 0.0f);
        this.j = fraction;
        this.l = obtainStyledAttributes.getFraction(8, 1, 1, fraction);
        final float dimension4 = obtainStyledAttributes.getDimension(9, 0.0f);
        obtainStyledAttributes.recycle();
        this.b = new RectF();
        (this.c = new Paint()).setAntiAlias(true);
        this.d = new ahh(dimension4, this.a(), this.p);
        (this.e = new ahj()).setCallback((Drawable$Callback)ahf);
        this.setWillNotDraw(false);
        this.d();
    }
    
    private final void d() {
        final int colorForState = this.g.getColorForState(this.getDrawableState(), this.g.getDefaultColor());
        if (colorForState != this.a) {
            this.a = colorForState;
            this.invalidate();
        }
    }
    
    public final float a() {
        float i;
        final float n = i = this.i;
        if (n <= 0.0f) {
            i = n;
            if (this.j > 0.0f) {
                i = Math.max(this.getMeasuredHeight(), this.getMeasuredWidth()) * this.j;
            }
        }
        return i - this.m;
    }
    
    public final float b() {
        float k;
        final float n = k = this.k;
        if (n <= 0.0f) {
            k = n;
            if (this.l > 0.0f) {
                k = Math.max(this.getMeasuredHeight(), this.getMeasuredWidth()) * this.l;
            }
        }
        return k - this.m;
    }
    
    public final void c() {
        final ahj e = this.e;
        if (e != null) {
            e.a.cancel();
        }
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        this.d();
    }
    
    protected final void onDraw(final Canvas canvas) {
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        float n;
        if (this.r) {
            n = this.b();
        }
        else {
            n = this.a();
        }
        this.getAlpha();
        if (this.p > 0.0f) {
            this.b.set((float)paddingLeft, (float)paddingTop, (float)(this.getWidth() - this.getPaddingRight()), (float)(this.getHeight() - this.getPaddingBottom()));
            final RectF b = this.b;
            b.set(b.centerX() - n, this.b.centerY() - n, this.b.centerX() + n, this.b.centerY() + n);
            this.c.setColor(this.n);
            final Paint c = this.c;
            c.setAlpha(Math.round(c.getAlpha() * this.getAlpha()));
            this.c.setStyle(Paint$Style.STROKE);
            this.c.setStrokeWidth(this.p);
            this.c.setStrokeCap(this.o);
            canvas.drawArc(this.b, -90.0f, this.q * 360.0f, false, this.c);
        }
        this.b.set((float)paddingLeft, (float)paddingTop, (float)(this.getWidth() - this.getPaddingRight()), (float)(this.getHeight() - this.getPaddingBottom()));
        this.c.setColor(this.a);
        final Paint c2 = this.c;
        c2.setAlpha(Math.round(c2.getAlpha() * this.getAlpha()));
        this.c.setStyle(Paint$Style.FILL);
        canvas.drawCircle(this.b.centerX(), this.b.centerY(), n, this.c);
        final Drawable h = this.h;
        if (h != null) {
            h.setAlpha(Math.round(this.getAlpha() * 255.0f));
            final Integer u = this.u;
            if (u != null) {
                this.h.setTint((int)u);
            }
            this.h.draw(canvas);
        }
        super.onDraw(canvas);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final Drawable h = this.h;
        if (h != null) {
            final int intrinsicWidth = h.getIntrinsicWidth();
            final int intrinsicHeight = this.h.getIntrinsicHeight();
            final int measuredWidth = this.getMeasuredWidth();
            final int measuredHeight = this.getMeasuredHeight();
            float s;
            if ((s = this.s) <= 0.0f) {
                s = 1.0f;
            }
            final float n5 = (float)intrinsicWidth;
            float n6;
            if (n5 != 0.0f) {
                n6 = measuredWidth * s / n5;
            }
            else {
                n6 = 1.0f;
            }
            final float n7 = (float)intrinsicHeight;
            float n8;
            if (n7 != 0.0f) {
                n8 = s * measuredHeight / n7;
            }
            else {
                n8 = 1.0f;
            }
            final float min = Math.min(1.0f, Math.min(n6, n8));
            final int round = Math.round(n5 * min);
            final int round2 = Math.round(min * n7);
            final int n9 = (measuredWidth - round) / 2 + Math.round(this.t * round);
            final int n10 = (measuredHeight - round2) / 2;
            this.h.setBounds(n9, n10, round + n9, round2 + n10);
        }
        super.onLayout(b, n, n2, n3, n4);
    }
    
    protected final void onMeasure(int size, int size2) {
        final float a = this.a();
        final float p2 = this.p;
        final ahh d = this.d;
        final float a2 = d.a;
        final float b = d.b;
        final float n = a + p2 + a2 * 0.0f;
        final float n2 = n + n;
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        final int mode2 = View$MeasureSpec.getMode(size2);
        size2 = View$MeasureSpec.getSize(size2);
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = (int)Math.min(n2, (float)size);
            }
            else {
                size = (int)n2;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = (int)Math.min(n2, (float)size2);
            }
            else {
                size2 = (int)n2;
            }
        }
        final Integer v = this.v;
        if (v != null) {
            switch (v) {
                case 2: {
                    size2 = size;
                    break;
                }
                case 1: {
                    size = size2;
                    break;
                }
            }
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(size, 1073741824), View$MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
    
    protected final boolean onSetAlpha(final int n) {
        return true;
    }
    
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        if (n == n3 && n2 == n4) {
            return;
        }
        this.d.a(this.getPaddingLeft(), this.getPaddingTop(), n - this.getPaddingRight(), n2 - this.getPaddingBottom());
    }
    
    protected final void onVisibilityChanged(final View view, final int n) {
        super.onVisibilityChanged(view, n);
        this.c();
    }
    
    protected final void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
        this.c();
    }
    
    public final void setPadding(final int n, final int n2, final int n3, final int n4) {
        if (n != this.getPaddingLeft() || n2 != this.getPaddingTop() || n3 != this.getPaddingRight() || n4 != this.getPaddingBottom()) {
            this.d.a(n, n2, this.getWidth() - n3, this.getHeight() - n4);
        }
        super.setPadding(n, n2, n3, n4);
    }
    
    public final void setPressed(final boolean b) {
        super.setPressed(b);
        if (b != this.r) {
            this.r = b;
            final ahh d = this.d;
            float c;
            if (b) {
                c = this.b();
            }
            else {
                c = this.a();
            }
            d.c = c;
            d.b();
            this.invalidate();
        }
    }
}
