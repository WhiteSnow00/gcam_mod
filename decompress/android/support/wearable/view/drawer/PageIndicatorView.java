// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.view.drawer;

import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.animation.Animator$AnimatorListener;
import android.graphics.Shader;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.content.res.TypedArray;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

@Deprecated
public class PageIndicatorView extends View implements agj
{
    public int a;
    public int b;
    public boolean c;
    private int d;
    private float e;
    private float f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private float k;
    private float l;
    private float m;
    private int n;
    private int o;
    private int p;
    private int q;
    private final Paint r;
    private final Paint s;
    private final Paint t;
    private final Paint u;
    
    public PageIndicatorView(final Context context) {
        this(context, null);
    }
    
    public PageIndicatorView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public PageIndicatorView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, ug.f, n, 2132017565);
        this.d = obtainStyledAttributes.getDimensionPixelOffset(12, 0);
        this.e = obtainStyledAttributes.getDimension(6, 0.0f);
        this.f = obtainStyledAttributes.getDimension(7, 0.0f);
        this.g = obtainStyledAttributes.getColor(0, 0);
        this.h = obtainStyledAttributes.getColor(1, 0);
        this.a = obtainStyledAttributes.getInt(3, 0);
        this.b = obtainStyledAttributes.getInt(4, 0);
        this.j = obtainStyledAttributes.getInt(2, 0);
        this.i = obtainStyledAttributes.getBoolean(5, false);
        this.k = obtainStyledAttributes.getDimension(9, 0.0f);
        this.l = obtainStyledAttributes.getDimension(10, 0.0f);
        this.m = obtainStyledAttributes.getDimension(11, 0.0f);
        this.n = obtainStyledAttributes.getColor(8, 0);
        obtainStyledAttributes.recycle();
        final Paint r = new Paint(1);
        (this.r = r).setColor(this.g);
        r.setStyle(Paint$Style.FILL);
        final Paint t = new Paint(1);
        (this.t = t).setColor(this.h);
        t.setStyle(Paint$Style.FILL);
        final Paint s = new Paint(1);
        this.s = s;
        final Paint u = new Paint(1);
        this.u = u;
        this.q = 0;
        if (this.isInEditMode()) {
            this.o = 5;
            this.p = 2;
            this.i = false;
        }
        if (this.i) {
            this.c = false;
            this.animate().alpha(0.0f).setStartDelay(2000L).setDuration((long)this.b).start();
        }
        else {
            this.animate().cancel();
            this.setAlpha(1.0f);
        }
        d(r, s, this.e, this.m, this.g, this.n);
        d(t, u, this.f, this.m, this.h, this.n);
    }
    
    private final void c(final long startDelay) {
        this.c = false;
        this.animate().cancel();
        this.animate().alpha(0.0f).setStartDelay(startDelay).setDuration((long)this.b).start();
    }
    
    private static final void d(final Paint paint, final Paint paint2, float n, float n2, final int color, final int n3) {
        n2 += n;
        n /= n2;
        paint2.setShader((Shader)new RadialGradient(0.0f, 0.0f, n2, new int[] { n3, n3, 0 }, new float[] { 0.0f, n, 1.0f }, Shader$TileMode.CLAMP));
        paint.setColor(color);
        paint.setStyle(Paint$Style.FILL);
    }
    
    public final void a(final int q) {
        if (this.q != q) {
            this.q = q;
            if (this.i && q == 0) {
                if (this.c) {
                    this.c(this.a);
                    return;
                }
                this.c = true;
                this.animate().cancel();
                this.animate().alpha(1.0f).setStartDelay(0L).setDuration((long)this.j).setListener((Animator$AnimatorListener)new vt(this)).start();
            }
        }
    }
    
    public final void b(final int n, final float n2) {
        if (this.i && this.q == 1) {
            if (n2 != 0.0f) {
                if (!this.c) {
                    this.c = true;
                    this.animate().cancel();
                    this.animate().alpha(1.0f).setStartDelay(0L).setDuration((long)this.j).start();
                }
            }
            else if (this.c) {
                this.c(0L);
            }
        }
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.o > 1) {
            final int paddingLeft = this.getPaddingLeft();
            final int d = this.d;
            final int height = this.getHeight();
            canvas.save();
            canvas.translate(paddingLeft + d / 2.0f, height / 2.0f);
            for (int i = 0; i < this.o; ++i) {
                if (i == this.p) {
                    canvas.drawCircle(this.k, this.l, this.f + this.m, this.u);
                    canvas.drawCircle(0.0f, 0.0f, this.f, this.t);
                }
                else {
                    canvas.drawCircle(this.k, this.l, this.e + this.m, this.s);
                    canvas.drawCircle(0.0f, 0.0f, this.e, this.r);
                }
                canvas.translate((float)this.d, 0.0f);
            }
            canvas.restore();
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        int size;
        if (View$MeasureSpec.getMode(n) == 1073741824) {
            size = View$MeasureSpec.getSize(n);
        }
        else {
            size = this.o * this.d + this.getPaddingLeft() + this.getPaddingRight();
        }
        int size2;
        if (View$MeasureSpec.getMode(n2) == 1073741824) {
            size2 = View$MeasureSpec.getSize(n2);
        }
        else {
            final float e = this.e;
            final float m = this.m;
            final float max = Math.max(e + m, this.f + m);
            size2 = (int)((int)Math.ceil(max + max) + this.l) + this.getPaddingTop() + this.getPaddingBottom();
        }
        this.setMeasuredDimension(resolveSizeAndState(size, n, 0), resolveSizeAndState(size2, n2, 0));
    }
}
