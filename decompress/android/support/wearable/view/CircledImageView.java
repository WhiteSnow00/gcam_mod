// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.view;

import android.view.View$MeasureSpec;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.ArgbEvaluator;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.Paint$Cap;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

@Deprecated
public class CircledImageView extends View
{
    final RectF a;
    public int b;
    private final Paint c;
    private final vh d;
    private ColorStateList e;
    private Drawable f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private Paint$Cap m;
    private float n;
    private float o;
    private boolean p;
    private final vm q;
    private float r;
    private float s;
    private Integer t;
    private Integer u;
    private final Drawable$Callback v;
    
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
        this.o = 1.0f;
        this.p = false;
        this.r = 1.0f;
        this.s = 0.0f;
        final vf vf = new vf(this);
        this.v = (Drawable$Callback)vf;
        new vg(this);
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, ug.c);
        final Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f = drawable;
        if (drawable != null && drawable.getConstantState() != null) {
            final Drawable drawable2 = this.f.getConstantState().newDrawable(context.getResources(), context.getTheme());
            this.f = drawable2;
            this.f = drawable2.mutate();
        }
        if ((this.e = obtainStyledAttributes.getColorStateList(13)) == null) {
            this.e = ColorStateList.valueOf(17170432);
        }
        final float dimension = obtainStyledAttributes.getDimension(15, 0.0f);
        this.g = dimension;
        this.i = obtainStyledAttributes.getDimension(17, dimension);
        this.l = obtainStyledAttributes.getColor(11, -16777216);
        this.m = Paint$Cap.values()[obtainStyledAttributes.getInt(10, 0)];
        final float dimension2 = obtainStyledAttributes.getDimension(12, 0.0f);
        this.n = dimension2;
        if (dimension2 > 0.0f) {
            this.k += dimension2 / 2.0f;
        }
        final float dimension3 = obtainStyledAttributes.getDimension(14, 0.0f);
        if (dimension3 > 0.0f) {
            this.k += dimension3;
        }
        this.r = obtainStyledAttributes.getFloat(20, 0.0f);
        this.s = obtainStyledAttributes.getFloat(21, 0.0f);
        if (obtainStyledAttributes.hasValue(22)) {
            this.t = obtainStyledAttributes.getColor(22, 0);
        }
        if (obtainStyledAttributes.hasValue(28)) {
            this.u = obtainStyledAttributes.getInt(28, 0);
        }
        final float fraction = obtainStyledAttributes.getFraction(16, 1, 1, 0.0f);
        this.h = fraction;
        this.j = obtainStyledAttributes.getFraction(18, 1, 1, fraction);
        final float dimension4 = obtainStyledAttributes.getDimension(27, 0.0f);
        obtainStyledAttributes.recycle();
        this.a = new RectF();
        (this.c = new Paint()).setAntiAlias(true);
        this.d = new vh(dimension4, this.a(), this.n);
        (this.q = new vm()).setCallback((Drawable$Callback)vf);
        this.setWillNotDraw(false);
        this.d();
    }
    
    private final void d() {
        final int colorForState = this.e.getColorForState(this.getDrawableState(), this.e.getDefaultColor());
        if (colorForState != this.b) {
            this.b = colorForState;
            this.invalidate();
        }
    }
    
    public final float a() {
        float g;
        final float n = g = this.g;
        if (n <= 0.0f) {
            g = n;
            if (this.h > 0.0f) {
                g = Math.max(this.getMeasuredHeight(), this.getMeasuredWidth()) * this.h;
            }
        }
        return g - this.k;
    }
    
    public final float b() {
        float i;
        final float n = i = this.i;
        if (n <= 0.0f) {
            i = n;
            if (this.j > 0.0f) {
                i = Math.max(this.getMeasuredHeight(), this.getMeasuredWidth()) * this.j;
            }
        }
        return i - this.k;
    }
    
    public final void c() {
        final vm q = this.q;
        if (q != null) {
            q.a.cancel();
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
        if (this.p) {
            n = this.b();
        }
        else {
            n = this.a();
        }
        this.getAlpha();
        this.a.set((float)paddingLeft, (float)paddingTop, (float)(this.getWidth() - this.getPaddingRight()), (float)(this.getHeight() - this.getPaddingBottom()));
        final RectF a = this.a;
        a.set(a.centerX() - n, this.a.centerY() - n, this.a.centerX() + n, this.a.centerY() + n);
        if (this.n > 0.0f) {
            this.c.setColor(this.l);
            final Paint c = this.c;
            c.setAlpha(Math.round(c.getAlpha() * this.getAlpha()));
            this.c.setStyle(Paint$Style.STROKE);
            this.c.setStrokeWidth(this.n);
            this.c.setStrokeCap(this.m);
            canvas.drawArc(this.a, -90.0f, this.o * 360.0f, false, this.c);
        }
        this.c.setColor(this.b);
        final Paint c2 = this.c;
        c2.setAlpha(Math.round(c2.getAlpha() * this.getAlpha()));
        this.c.setStyle(Paint$Style.FILL);
        canvas.drawCircle(this.a.centerX(), this.a.centerY(), n, this.c);
        final Drawable f = this.f;
        if (f != null) {
            f.setAlpha(Math.round(this.getAlpha() * 255.0f));
            final Integer t = this.t;
            if (t != null) {
                this.f.setTint((int)t);
            }
            this.f.draw(canvas);
        }
        super.onDraw(canvas);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final Drawable f = this.f;
        if (f != null) {
            final int intrinsicWidth = f.getIntrinsicWidth();
            final int intrinsicHeight = this.f.getIntrinsicHeight();
            final int measuredWidth = this.getMeasuredWidth();
            final int measuredHeight = this.getMeasuredHeight();
            float r;
            if ((r = this.r) <= 0.0f) {
                r = 1.0f;
            }
            final float n5 = (float)intrinsicWidth;
            float n6;
            if (n5 != 0.0f) {
                n6 = measuredWidth * r / n5;
            }
            else {
                n6 = 1.0f;
            }
            final float n7 = (float)intrinsicHeight;
            float n8;
            if (n7 != 0.0f) {
                n8 = r * measuredHeight / n7;
            }
            else {
                n8 = 1.0f;
            }
            final float min = Math.min(1.0f, Math.min(n6, n8));
            final int round = Math.round(n5 * min);
            final int round2 = Math.round(min * n7);
            final int n9 = (measuredWidth - round) / 2 + Math.round(this.s * round);
            final int n10 = (measuredHeight - round2) / 2;
            this.f.setBounds(n9, n10, round + n9, round2 + n10);
        }
        super.onLayout(b, n, n2, n3, n4);
    }
    
    protected final void onMeasure(int size, int size2) {
        final float a = this.a();
        final float n = this.n;
        final vh d = this.d;
        final float a2 = d.a;
        final float b = d.b;
        final float n2 = a + n + a2 * 0.0f;
        final float n3 = n2 + n2;
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        final int mode2 = View$MeasureSpec.getMode(size2);
        size2 = View$MeasureSpec.getSize(size2);
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = (int)Math.min(n3, (float)size);
            }
            else {
                size = (int)n3;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = (int)Math.min(n3, (float)size2);
            }
            else {
                size2 = (int)n3;
            }
        }
        final Integer u = this.u;
        if (u != null) {
            switch (u) {
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
        if (b != this.p) {
            this.p = b;
            final vh d = this.d;
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
