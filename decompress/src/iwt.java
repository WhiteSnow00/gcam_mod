import android.view.View$MeasureSpec;
import java.util.Iterator;
import android.view.View$OnClickListener;
import android.graphics.Canvas;
import android.view.Display;
import android.view.WindowManager;
import android.graphics.Point;
import android.content.res.Resources;
import android.graphics.PathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.Paint$Style;
import java.util.Collections;
import java.util.ArrayList;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Path;
import android.hardware.display.DisplayManager$DisplayListener;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import android.graphics.Paint;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

final class iwt extends ViewGroup implements AutoCloseable
{
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private boolean G;
    private int H;
    private int I;
    private final boolean J;
    public final int[] a;
    public final Paint b;
    public final Paint c;
    public final List d;
    public final AtomicInteger e;
    public PopupWindow f;
    public boolean g;
    public Runnable h;
    public View i;
    public int j;
    public View k;
    public Rect l;
    public int m;
    public int n;
    public int o;
    public final Object p;
    public long q;
    public long r;
    public long s;
    public List t;
    public final List u;
    public final DisplayManager$DisplayListener v;
    private final Path w;
    private final RectF x;
    private final int y;
    private final int z;
    
    public iwt(final Context context, final boolean j) {
        super(context);
        this.d = Collections.synchronizedList(new ArrayList<Object>());
        this.e = new AtomicInteger(Integer.MIN_VALUE);
        this.p = new Object();
        this.u = new ArrayList();
        this.v = (DisplayManager$DisplayListener)new iws(this);
        this.J = j;
        this.a = new int[2];
        this.w = new Path();
        this.x = new RectF();
        final Paint b = new Paint();
        this.b = b;
        final Paint c = new Paint();
        this.c = c;
        final Resources resources = context.getResources();
        int n;
        if (j) {
            n = 2131166351;
        }
        else {
            n = 2131166352;
        }
        this.z = resources.getDimensionPixelSize(n);
        final Resources resources2 = context.getResources();
        int n2;
        if (!j) {
            n2 = 2131166360;
        }
        else {
            n2 = 2131166359;
        }
        this.y = resources2.getDimensionPixelSize(n2);
        context.getResources().getDimensionPixelSize(2131166357);
        this.A = context.getResources().getDimensionPixelSize(2131166358);
        this.B = context.getResources().getDimensionPixelSize(2131166354);
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166355);
        this.C = dimensionPixelSize;
        final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131166356);
        this.D = context.getResources().getDimensionPixelSize(2131166347);
        final Resources resources3 = context.getResources();
        int n3;
        if (!j) {
            n3 = 2131166346;
        }
        else {
            n3 = 2131166345;
        }
        this.E = resources3.getDimensionPixelSize(n3);
        final Resources resources4 = context.getResources();
        int n4;
        if (!j) {
            n4 = 2131166350;
        }
        else {
            n4 = 2131166349;
        }
        this.F = resources4.getDimensionPixelSize(n4);
        int color;
        if (j) {
            color = neu.c((View)this, 2130968909);
        }
        else {
            color = aai.b(context, 2131101472);
        }
        final int b2 = aai.b(context, 2131101475);
        b.setStyle(Paint$Style.FILL);
        b.setColor(color);
        b.setAntiAlias(true);
        final float n5 = (float)dimensionPixelSize;
        b.setShadowLayer((float)dimensionPixelSize2, n5, n5, b2);
        c.set(b);
        if (j) {
            c.setPathEffect((PathEffect)new CornerPathEffect((float)this.getResources().getDimensionPixelSize(2131166348)));
        }
        this.g = true;
        this.q = 0L;
    }
    
    private static int c(final int n, final int n2, final int n3) {
        return Math.min(n3, Math.max(n2, n));
    }
    
    private final Point d() {
        final Display defaultDisplay = ((WindowManager)this.getContext().getSystemService("window")).getDefaultDisplay();
        final Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }
    
    private final void e(final Canvas canvas) {
        this.getLocationOnScreen(this.a);
        canvas.save();
        if (iwb.s(this.j)) {
            canvas.translate((float)(this.B - this.a[0]), 0.0f);
        }
        else {
            final int j = this.j;
            if (j == 5 || j == 6) {
                canvas.translate(0.0f, (float)(this.B - this.a[1]));
            }
        }
        canvas.drawPath(this.w, this.c);
        canvas.restore();
    }
    
    public final int a() {
        final View k = this.k;
        if (k != null && k.getDisplay() != null) {
            return this.e.getAndSet(jcb.a(this.k.getDisplay(), this.k.getContext()).e);
        }
        return this.e.get();
    }
    
    public final void b(final boolean b) {
        if (!b) {
            this.setVisibility(4);
        }
        this.clearAnimation();
        final PopupWindow f = this.f;
        if (f != null) {
            f.dismiss();
            return;
        }
        this.setVisibility(4);
    }
    
    public final void close() {
        this.b(false);
        this.setOnClickListener((View$OnClickListener)null);
        this.removeAllViews();
        this.d.clear();
        final PopupWindow f = this.f;
        if (f != null) {
            f.dismiss();
        }
        this.f = null;
        this.i = null;
        this.k = null;
        this.setVisibility(8);
        final Iterator iterator = this.u.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
        this.u.clear();
    }
    
    protected final void onDraw(final Canvas canvas) {
        if (this.getVisibility() != 0) {
            return;
        }
        canvas.save();
        final int j = this.j;
        if (j == 2 || j == 6) {
            this.e(canvas);
        }
        final RectF x = this.x;
        final float n = (float)this.F;
        canvas.drawRoundRect(x, n, n, this.b);
        final int i = this.j;
        if (i == 1 || i == 5) {
            this.e(canvas);
        }
        canvas.restore();
    }
    
    protected final void onLayout(final boolean b, int n, int n2, int n3, int n4) {
        final View i = this.i;
        final int n5 = 0;
        if (i != null) {
            final int z = this.z;
            final int j = this.j;
            int d;
            if (j == 6) {
                d = this.D;
            }
            else {
                d = 0;
            }
            final int y = this.y;
            int d2;
            if (j == 2) {
                d2 = this.D;
            }
            else {
                d2 = 0;
            }
            int d3;
            if (j == 5) {
                d3 = this.D;
            }
            else {
                d3 = 0;
            }
            int d4;
            if (j == 1) {
                d4 = this.D;
            }
            else {
                d4 = 0;
            }
            i.layout(d + z, d2 + y, n3 - n - z - d3, n4 - n2 - y - d4);
        }
        final Point d5 = this.d();
        n4 = d5.x;
        final int y2 = d5.y;
        switch (this.j) {
            default: {
                throw new IllegalStateException();
            }
            case 6: {
                n3 = this.l.left;
                n = this.l.width();
                n2 = this.B;
                n = n4 - n3 - n - n2;
                n2 = y2 - (n2 + n2);
                break;
            }
            case 5: {
                n = this.l.left;
                n2 = this.B;
                n -= n2;
                n2 = y2 - (n2 + n2);
                break;
            }
            case 2: {
                n = this.B;
                n = n4 - (n + n);
                n2 = y2 - this.l.top - this.l.height() - this.B;
                break;
            }
            case 1: {
                n = this.B;
                n = n4 - (n + n);
                n2 = this.l.top - this.B;
                break;
            }
        }
        this.measure(View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(n2, Integer.MIN_VALUE));
        n3 = this.l.left;
        final int top = this.l.top;
        final PopupWindow f = this.f;
        if (f == null) {
            n3 = 0;
            n4 = 0;
        }
        else {
            final int measuredWidth = this.getMeasuredWidth();
            final int measuredHeight = this.getMeasuredHeight();
            n = this.j;
            if (n == 1) {
                n2 = -measuredHeight - this.o - this.A;
                n = 0;
            }
            else if (n == 2) {
                n2 = this.l.height() + this.o + this.A;
                n = 0;
            }
            else if (n == 5) {
                n = -measuredWidth - this.n;
                n2 = (this.l.height() - measuredHeight) / 2;
            }
            else if (n == 6) {
                n = this.l.width() + this.n;
                n2 = (this.l.height() - measuredHeight) / 2;
            }
            else {
                n = 0;
                n2 = 0;
            }
            final int f2 = ik.f((View)this);
            if (iwb.s(this.j)) {
                n2 += top;
                switch (this.m) {
                    default: {
                        throw new IllegalStateException();
                    }
                    case 3: {
                        if (f2 == 1) {
                            n = n3;
                            break;
                        }
                        n = n3 + this.l.width() - measuredWidth;
                        break;
                    }
                    case 2: {
                        n = n3 + (this.l.width() - measuredWidth) / 2;
                        break;
                    }
                    case 1: {
                        if (f2 == 1) {
                            n = n3 + this.l.width() - measuredWidth;
                            break;
                        }
                        n = n3;
                        break;
                    }
                }
            }
            else {
                n += n3;
                n2 += top;
            }
            n3 = this.B;
            n4 = c(n, n3, n4 - n3 - measuredWidth);
            n = this.B;
            n3 = c(n2, n, y2 - n - measuredHeight);
            f.update(n4, n3, measuredWidth, measuredHeight, true);
        }
        Label_0851: {
            switch (this.m) {
                default: {
                    n = 0;
                    n2 = 0;
                    break Label_0851;
                }
                case 3: {
                    final int width = this.l.width();
                    n2 = this.E;
                    n = this.B;
                    n = width - n2 / 2 - (n + n);
                    break;
                }
                case 2: {
                    n = this.l.width() / 2;
                    n2 = this.l.height() / 2;
                    break Label_0851;
                }
                case 1: {
                    n2 = this.E;
                    n = this.B;
                    n = n2 / 2 + (n + n);
                    break;
                }
            }
            n2 = 0;
        }
        int n6 = n;
        if (ik.f((View)this) == 1) {
            n6 = this.l.width() - n;
        }
        final int left = this.l.left;
        n = this.l.top;
        if (jvu.v((View)this)) {
            final int[] w = jvu.w(this.getRootView());
            final int h = this.H;
            final int h2 = w[0];
            if (h + n4 != h2) {
                n4 = this.I;
                final int k = w[1];
                if (n4 + n3 != k) {
                    this.H = h2;
                    this.I = k;
                }
            }
        }
        n3 = n6 + left + this.H;
        n2 = n2 + n + this.I;
        if (this.J) {
            n = this.getResources().getDimensionPixelSize(2131166353);
        }
        else {
            n = n5;
        }
        this.w.reset();
        n4 = this.j;
        if (n4 == 1) {
            this.w.moveTo((float)(n3 - this.B - this.E / 2), this.x.bottom);
            this.w.rLineTo((float)this.E, 0.0f);
            this.w.rLineTo((float)(-this.E / 2), (float)this.D);
            this.w.rLineTo((float)(-this.E / 2), (float)(-this.D));
            this.w.close();
            return;
        }
        if (n4 == 2) {
            this.w.moveTo((float)(n3 - this.B + this.E / 2), this.x.top);
            this.w.rLineTo((float)(-this.E), 0.0f);
            this.w.rLineTo((float)(this.E / 2), (float)(-this.D));
            this.w.rLineTo((float)(this.E / 2), (float)this.D);
            this.w.close();
            return;
        }
        if (n4 == 5) {
            this.w.moveTo(this.x.right - n, (float)(n2 - this.B - this.E / 2));
            this.w.rLineTo(0.0f, (float)this.E);
            this.w.rLineTo((float)this.D, (float)(-this.E / 2));
            this.w.rLineTo((float)(-this.D), (float)(-this.E / 2));
            this.w.close();
            return;
        }
        if (n4 == 6) {
            this.w.moveTo(this.x.left + n, (float)(n2 - this.B + this.E / 2));
            this.w.rLineTo(0.0f, (float)(-this.E));
            this.w.rLineTo((float)(-this.D), (float)(this.E / 2));
            this.w.rLineTo((float)this.D, (float)(this.E / 2));
            this.w.close();
        }
    }
    
    protected final void onMeasure(int n, int n2) {
        if (!this.G) {
            final int j = this.j;
            if (j != 0) {
                this.j = iwb.r(j, (View)this);
                this.G = true;
            }
        }
        final int size = View$MeasureSpec.getSize(n);
        n2 = View$MeasureSpec.getSize(n2);
        final int z = this.z;
        n = this.C;
        final int n3 = size - (z + z) - n;
        final int y = this.y;
        final int n4 = n2 - (y + y) - n;
        Label_0135: {
            if (iwb.s(this.j)) {
                n = n4 - this.D;
                n2 = n3;
            }
            else {
                final int i = this.j;
                if (i != 5) {
                    n2 = n3;
                    n = n4;
                    if (i != 6) {
                        break Label_0135;
                    }
                }
                n2 = n3 - this.D;
                n = n4;
            }
        }
        final int min = Math.min((int)(float)this.d().x, n2);
        final View k = this.i;
        final int n5 = 0;
        if (k != null) {
            k.measure(View$MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(n, 0));
            if (this.i.getMeasuredHeight() > n) {
                this.i.measure(View$MeasureSpec.makeMeasureSpec(n2, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE));
            }
        }
        final View l = this.i;
        if (l != null) {
            final int measuredWidth = l.getMeasuredWidth();
            final int z2 = this.z;
            final int measuredHeight = this.i.getMeasuredHeight();
            n2 = this.y;
            final RectF x = this.x;
            final int m = this.j;
            float n6 = 0.0f;
            float n7;
            if (m == 6) {
                n7 = (float)this.D;
            }
            else {
                n7 = 0.0f;
            }
            if (m == 2) {
                n6 = (float)this.D;
            }
            if (m == 6) {
                n = this.D;
            }
            else {
                n = 0;
            }
            final float n8 = (float)(measuredWidth + (z2 + z2) + n);
            if (m == 2) {
                n = this.D;
            }
            else {
                n = n5;
            }
            x.set(n7, n6, n8, (float)(measuredHeight + (n2 + n2) + n));
        }
        final int n9 = (int)this.x.width() + this.C;
        final int n10 = (int)this.x.height() + this.C;
        Label_0451: {
            if (iwb.s(this.j)) {
                n2 = n10 + this.D;
                n = n9;
            }
            else {
                final int j2 = this.j;
                if (j2 != 5) {
                    n = n9;
                    n2 = n10;
                    if (j2 != 6) {
                        break Label_0451;
                    }
                }
                n = n9 + this.D;
                n2 = n10;
            }
        }
        this.setMeasuredDimension(n, n2);
    }
}
