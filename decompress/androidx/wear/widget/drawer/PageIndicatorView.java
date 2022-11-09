// 
// Decompiled by Procyon v0.6.0
// 

package androidx.wear.widget.drawer;

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

public class PageIndicatorView extends View implements agj
{
    public int a;
    public int b;
    public boolean c;
    private final Paint d;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private int h;
    private float i;
    private float j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private float o;
    private float p;
    private float q;
    private int r;
    private int s;
    private int t;
    private int u;
    
    public PageIndicatorView(final Context context) {
        this(context, null);
    }
    
    public PageIndicatorView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public PageIndicatorView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, ahd.b, n, 2132018601);
        this.h = obtainStyledAttributes.getDimensionPixelOffset(25, 0);
        this.i = obtainStyledAttributes.getDimension(19, 0.0f);
        this.j = obtainStyledAttributes.getDimension(20, 0.0f);
        this.k = obtainStyledAttributes.getColor(13, 0);
        this.l = obtainStyledAttributes.getColor(14, 0);
        this.a = obtainStyledAttributes.getInt(16, 0);
        this.b = obtainStyledAttributes.getInt(17, 0);
        this.n = obtainStyledAttributes.getInt(15, 0);
        this.m = obtainStyledAttributes.getBoolean(18, false);
        this.o = obtainStyledAttributes.getDimension(22, 0.0f);
        this.p = obtainStyledAttributes.getDimension(23, 0.0f);
        this.q = obtainStyledAttributes.getDimension(24, 0.0f);
        this.r = obtainStyledAttributes.getColor(21, 0);
        obtainStyledAttributes.recycle();
        final Paint d = new Paint(1);
        (this.d = d).setColor(this.k);
        d.setStyle(Paint$Style.FILL);
        final Paint f = new Paint(1);
        (this.f = f).setColor(this.l);
        f.setStyle(Paint$Style.FILL);
        final Paint e = new Paint(1);
        this.e = e;
        final Paint g = new Paint(1);
        this.g = g;
        this.u = 0;
        if (this.isInEditMode()) {
            this.s = 5;
            this.t = 2;
            this.m = false;
        }
        if (this.m) {
            this.c = false;
            this.animate().alpha(0.0f).setStartDelay(2000L).setDuration((long)this.b).start();
        }
        else {
            this.animate().cancel();
            this.setAlpha(1.0f);
        }
        d(d, e, this.i, this.q, this.k, this.r);
        d(f, g, this.j, this.q, this.l, this.r);
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
    
    public final void a(final int u) {
        if (this.u != u) {
            this.u = u;
            if (this.m && u == 0) {
                if (this.c) {
                    this.c(this.a);
                    return;
                }
                this.c = true;
                this.animate().cancel();
                this.animate().alpha(1.0f).setStartDelay(0L).setDuration((long)this.n).setListener((Animator$AnimatorListener)new ahl(this)).start();
            }
        }
    }
    
    public final void b(final int n, final float n2) {
        if (this.m && this.u == 1) {
            if (n2 != 0.0f) {
                if (!this.c) {
                    this.c = true;
                    this.animate().cancel();
                    this.animate().alpha(1.0f).setStartDelay(0L).setDuration((long)this.n).start();
                }
            }
            else if (this.c) {
                this.c(0L);
            }
        }
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.s > 1) {
            final int paddingLeft = this.getPaddingLeft();
            final int h = this.h;
            final int height = this.getHeight();
            canvas.save();
            canvas.translate(paddingLeft + h / 2.0f, height / 2.0f);
            for (int i = 0; i < this.s; ++i) {
                if (i == this.t) {
                    canvas.drawCircle(this.o, this.p, this.j + this.q, this.g);
                    canvas.drawCircle(0.0f, 0.0f, this.j, this.f);
                }
                else {
                    canvas.drawCircle(this.o, this.p, this.i + this.q, this.e);
                    canvas.drawCircle(0.0f, 0.0f, this.i, this.d);
                }
                canvas.translate((float)this.h, 0.0f);
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
            size = this.s * this.h + this.getPaddingLeft() + this.getPaddingRight();
        }
        int size2;
        if (View$MeasureSpec.getMode(n2) == 1073741824) {
            size2 = View$MeasureSpec.getSize(n2);
        }
        else {
            final float i = this.i;
            final float q = this.q;
            final float max = Math.max(i + q, this.j + q);
            size2 = (int)((int)Math.ceil(max + max) + this.p) + this.getPaddingTop() + this.getPaddingBottom();
        }
        this.setMeasuredDimension(resolveSizeAndState(size, n, 0), resolveSizeAndState(size2, n2, 0));
    }
}
