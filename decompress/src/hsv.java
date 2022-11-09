import java.util.Collection;
import j$.util.Collection$_EL;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import j$.util.function.Consumer;
import android.animation.ValueAnimator;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import java.util.ArrayList;
import j$.time.Duration;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsv extends LinearLayout
{
    public final Duration a;
    public final ArrayList b;
    public final hsk c;
    public GradientDrawable d;
    public hsi e;
    public int f;
    private final boolean g;
    
    public hsv(final Context context, final boolean g) {
        super(context);
        this.f = 1;
        this.g = g;
        this.a = Duration.ofMillis((long)context.getResources().getInteger(2131492979));
        this.b = new ArrayList();
        this.c = new hsk();
    }
    
    public final int a(final int n) {
        return this.getResources().getDimensionPixelSize(n);
    }
    
    public final int b() {
        return this.a(2131166220);
    }
    
    public final int c() {
        return this.a(2131166303) + this.a(2131166304) + this.a(2131166293) + this.a(2131166302);
    }
    
    public final Animator d() {
        this.setAlpha(1.0f);
        this.h(1);
        if (this.g) {
            final hsk c = this.c;
            kjm.a();
            final ArrayList a = c.a;
            for (int size = a.size(), i = 0; i < size; ++i) {
                final hsj hsj = (hsj)a.get(i);
                if (hsj != null) {
                    hsj.d();
                }
            }
        }
        else {
            final hsk c2 = this.c;
            kjm.a();
            final ArrayList a2 = c2.a;
            for (int size2 = a2.size(), j = 0; j < size2; ++j) {
                final hsj hsj2 = (hsj)a2.get(j);
                if (hsj2 != null) {
                    hsj2.b();
                }
            }
        }
        int c3;
        if (this.g) {
            c3 = this.a(2131166303) + this.a(2131166220) / 2;
        }
        else {
            c3 = this.c();
        }
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { 0, c3 });
        ofInt.setDuration(this.a.toMillis());
        ofInt.addListener(jvh.f((Consumer)new hsu(this, 4)));
        ofInt.addListener(jvh.e((Consumer)new hsu(this, 5)));
        ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new hss(this, 2));
        return (Animator)ofInt;
    }
    
    public final void e(final int n) {
        final hsi e = this.e;
        if (e != null) {
            this.removeView((View)e);
            this.addView((View)this.e, n);
        }
    }
    
    public final void f(final boolean enabled) {
        final hsi e = this.e;
        if (e != null) {
            e.setEnabled(enabled);
        }
        Collection$_EL.stream((Collection)this.b).forEachOrdered((Consumer)new hsr(enabled));
    }
    
    public final void g(final niz niz) {
        Collection$_EL.stream((Collection)this.b).forEachOrdered((Consumer)new hsq(niz));
    }
    
    public final void h(final int f) {
        final int a = this.a(2131166299);
        this.f = f;
        if (f == 1) {
            final GradientDrawable d = this.d;
            final float n = (float)a;
            d.setCornerRadii(new float[] { n, n, n, n, 0.0f, 0.0f, 0.0f, 0.0f });
            return;
        }
        final GradientDrawable d2 = this.d;
        final float n2 = (float)a;
        d2.setCornerRadii(new float[] { n2, n2, n2, n2, n2, n2, n2, n2 });
    }
}
