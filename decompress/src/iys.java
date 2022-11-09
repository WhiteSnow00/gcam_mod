import android.graphics.Canvas;
import android.animation.Animator$AnimatorListener;
import java.util.Collection;
import java.util.ArrayList;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.content.Context;
import android.view.animation.Interpolator;
import android.graphics.Paint;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iys extends View
{
    private final boolean A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private final RectF G;
    private AnimatorSet H;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public float e;
    public int f;
    public int g;
    public long h;
    public int i;
    public boolean j;
    public boolean k;
    public String l;
    public AnimatorSet m;
    public int n;
    private final int o;
    private final Paint p;
    private final Interpolator q;
    private final Interpolator r;
    private final String s;
    private final float t;
    private final float u;
    private final float v;
    private final float w;
    private final float x;
    private final float y;
    private final float z;
    
    public iys(final Context context) {
        super(context);
        boolean a = true;
        this.n = 1;
        this.B = 0;
        this.G = new RectF();
        this.h = -1L;
        this.i = -1;
        this.j = false;
        this.k = true;
        this.l = "";
        this.m = null;
        this.H = null;
        this.setVisibility(4);
        this.o = context.getResources().getDimensionPixelSize(2131166160);
        this.f = context.getResources().getDimensionPixelSize(2131166158);
        this.g = context.getResources().getDimensionPixelSize(2131166161);
        context.getResources().getDimensionPixelSize(2131166162);
        this.q = (Interpolator)new LinearInterpolator();
        this.r = AnimationUtils.loadInterpolator(this.getContext(), 17563661);
        final Paint a2 = new Paint();
        (this.a = a2).setAntiAlias(true);
        a2.setStyle(Paint$Style.STROKE);
        a2.setColor(-1);
        a2.setAlpha(51);
        (this.p = new Paint(a2)).setAlpha(255);
        final Paint b = new Paint();
        (this.b = b).setAntiAlias(true);
        b.setTextAlign(Paint$Align.CENTER);
        b.setColor(-1);
        b.setTextSize((float)context.getResources().getDimensionPixelSize(2131165365));
        b.setAlpha(179);
        final Paint c = new Paint(b);
        (this.c = c).setTextSize((float)context.getResources().getDimensionPixelSize(2131165364));
        c.setAlpha(255);
        final String string = context.getResources().getString(2131951881);
        this.s = string;
        gu.c(context, 2131296287, new iyp(this));
        final float abs = Math.abs((b.descent() + b.ascent()) / 2.0f);
        this.t = abs;
        final float measureText = b.measureText("0:00");
        final float measureText2 = b.measureText(":");
        final float measureText3 = b.measureText("0");
        this.u = measureText3;
        this.v = measureText / 2.0f;
        this.w = measureText2 / 2.0f;
        this.x = measureText3 / 2.0f;
        final float abs2 = Math.abs((c.descent() + c.ascent()) / 2.0f);
        this.y = abs2;
        final float z = (float)context.getResources().getDimensionPixelSize(2131165363);
        this.z = z;
        Math.max(context.getResources().getDimensionPixelSize(2131166159), Math.hypot(abs + abs2 + z + c.getFontMetrics().bottom, c.measureText(string) / 2.0f));
        if (context.getResources().getConfiguration().getLayoutDirection() != 1) {
            a = false;
        }
        this.A = a;
    }
    
    private final void e(final ValueAnimator valueAnimator, final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener) {
        valueAnimator.setInterpolator((TimeInterpolator)this.r);
        valueAnimator.setDuration(167L);
        valueAnimator.addUpdateListener(valueAnimator$AnimatorUpdateListener);
    }
    
    private final void f(final ValueAnimator valueAnimator, final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener) {
        valueAnimator.setInterpolator((TimeInterpolator)this.q);
        valueAnimator.setDuration(133L);
        valueAnimator.addUpdateListener(valueAnimator$AnimatorUpdateListener);
    }
    
    public final void a() {
        final AnimatorSet h = this.H;
        if (h != null && h.isRunning()) {
            this.H.cancel();
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { (float)this.g, 0.0f });
        this.f(ofFloat, (ValueAnimator$AnimatorUpdateListener)new iyo(this, 3));
        final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { 1.0f, 0.0f });
        this.f(ofFloat2, (ValueAnimator$AnimatorUpdateListener)new iyo(this, 4));
        final ArrayList list = new ArrayList();
        list.add(ofFloat);
        if (this.j) {
            list.add(ofFloat2);
        }
        (this.H = new AnimatorSet()).playTogether((Collection)list);
        this.H.addListener((Animator$AnimatorListener)new iyr(this));
        this.H.start();
    }
    
    public final void b(int min) {
        min = Math.min(100, Math.max(min, 0));
        if (min == 0) {
            final AnimatorSet h = this.H;
            if (h != null && h.isRunning()) {
                this.H.cancel();
            }
            this.B = 0;
            final AnimatorSet m = this.m;
            if (m != null && m.isRunning()) {
                this.m.cancel();
            }
            final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { this.o, this.f });
            this.e(ofInt, (ValueAnimator$AnimatorUpdateListener)new iyo(this, 1));
            final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, (float)this.g });
            this.e(ofFloat, (ValueAnimator$AnimatorUpdateListener)new iyo(this));
            final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
            this.e(ofFloat2, (ValueAnimator$AnimatorUpdateListener)new iyo(this, 2));
            final ArrayList list = new ArrayList();
            list.add(ofInt);
            list.add(ofFloat);
            if (this.j) {
                list.add(ofFloat2);
            }
            (this.m = new AnimatorSet()).playTogether((Collection)list);
            this.m.addListener((Animator$AnimatorListener)new iyq(this));
            this.m.start();
            return;
        }
        final AnimatorSet i = this.m;
        if (i != null && i.isRunning()) {
            this.m.cancel();
        }
        this.n = 4;
        this.B = (int)(min * 3.6f);
        this.invalidate();
        if (min == 100) {
            this.a();
        }
    }
    
    public final void onDraw(final Canvas canvas) {
        if (this.n == 1) {
            return;
        }
        if (this.k) {
            canvas.drawCircle((float)this.C, (float)this.D, (float)this.d, this.a);
        }
        if (this.h != -1L && this.l.length() == 4) {
            canvas.drawText(this.s, (float)this.C, this.D + this.t + this.y + this.z, this.c);
            if (this.A) {
                canvas.drawText(this.l.substring(3, 4), this.E + this.x, (float)this.D, this.b);
                canvas.drawText(this.l.substring(2, 3), this.E + this.u + this.x, (float)this.D, this.b);
                canvas.drawText(":", this.F - this.u - this.w, (float)this.D, this.b);
                canvas.drawText(this.l.substring(0, 1), this.F - this.x, (float)this.D, this.b);
            }
            else {
                canvas.drawText(this.l.substring(0, 1), this.E + this.x, (float)this.D, this.b);
                canvas.drawText(":", this.E + this.u + this.w, (float)this.D, this.b);
                canvas.drawText(this.l.substring(2, 3), this.F - this.u - this.x, (float)this.D, this.b);
                canvas.drawText(this.l.substring(3, 4), this.F - this.x, (float)this.D, this.b);
            }
        }
        else if (this.i != -1) {
            canvas.drawText(this.s, (float)this.C, this.D + this.t + this.y + this.z, this.c);
            canvas.drawText(String.valueOf(this.i), (float)this.C, (float)this.D, this.b);
        }
        else if (this.j) {
            canvas.drawText(this.s, (float)this.C, this.D + this.y, this.c);
            this.announceForAccessibility((CharSequence)this.s);
        }
        final int n = this.n;
        if (n != 4 && n != 3) {
            return;
        }
        this.a.setStrokeWidth(this.e);
        this.p.setStrokeWidth(this.e);
        final RectF g = this.G;
        final int c = this.C;
        final int d = this.d;
        final int d2 = this.D;
        g.set((float)(c - d), (float)(d2 - d), (float)(c + d), (float)(d2 + d));
        canvas.drawArc(this.G, -90.0f, (float)this.B, false, this.p);
    }
    
    public final void onLayout(final boolean b, int c, final int n, final int n2, final int n3) {
        super.onLayout(b, c, n, n2, n3);
        if (b) {
            c = (n2 - c) / 2;
            this.C = c;
            this.D = (n3 - n) / 2;
            final float n4 = (float)c;
            final float v = this.v;
            this.E = n4 - v;
            this.F = n4 + v;
        }
    }
}
