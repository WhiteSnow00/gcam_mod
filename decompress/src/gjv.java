import android.animation.ValueAnimator;
import android.util.Property;
import java.util.List;
import j$.util.stream.Collectors;
import j$.util.function.Function;
import j$.util.Collection$_EL;
import java.util.Collection;
import android.animation.AnimatorSet;
import j$.util.function.Consumer;
import android.animation.PropertyValuesHolder;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.widget.RelativeLayout;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import android.widget.FrameLayout;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjv
{
    public final View a;
    public final boolean b;
    public final int c;
    private final OptionsMenuContainer d;
    private final FrameLayout e;
    private final noi f;
    private final jcb g;
    private final boolean h;
    private final int i;
    private final View j;
    
    public gjv(final OptionsMenuContainer d, final boolean b, final boolean h, final View j) {
        this.d = d;
        final FrameLayout d2 = d.d();
        d2.getClass();
        this.e = d2;
        final View b2 = d.b();
        b2.getClass();
        this.a = b2;
        final OptionsMenuView l = d.l();
        l.getClass();
        final RelativeLayout k = d.k();
        k.getClass();
        final View a = d.a();
        a.getClass();
        this.f = noi.J(l, k, a);
        this.g = d.b;
        this.b = b;
        this.h = h;
        this.j = j;
        final int n = 4;
        int c;
        if (!b) {
            c = 4;
        }
        else {
            c = 0;
        }
        this.c = c;
        int i = n;
        if (!b) {
            i = 0;
        }
        this.i = i;
    }
    
    public final Animator a() {
        final nnn nnn = new nnn();
        final boolean b = this.b;
        final float n = 0.0f;
        float n2;
        if (!b) {
            n2 = 1.0f;
        }
        else {
            n2 = 0.0f;
        }
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.e, View.ALPHA, new float[] { 1.0f - n2, n2 });
        ((ValueAnimator)ofFloat).setDuration(50L);
        ((ValueAnimator)ofFloat).setInterpolator((TimeInterpolator)new adh());
        ((ValueAnimator)ofFloat).addListener((Animator$AnimatorListener)new jcc((View)this.e, this.i));
        nnn.g(ofFloat);
        final jcb a = jcb.a;
        int n3 = 0;
        switch (this.g.ordinal()) {
            default: {
                n3 = jvu.w(this.j)[1] - jvu.w(this.a)[1] + (this.j.getHeight() - this.a.getHeight()) / 2;
                break;
            }
            case 2: {
                n3 = -(jvu.w(this.j)[0] - jvu.w(this.a)[0] + (this.j.getWidth() - this.a.getWidth()) / 2);
                break;
            }
            case 1: {
                n3 = jvu.w(this.j)[0] - jvu.w(this.a)[0] + (this.j.getWidth() - this.a.getWidth()) / 2;
                break;
            }
        }
        float n4;
        if (!this.b) {
            n4 = n;
        }
        else {
            n4 = 1.0f;
        }
        final float n5 = 1.0f - n4;
        final View a2 = this.a;
        final PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.ALPHA, new float[] { n5, n4 });
        final PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[] { n5, n4 });
        final PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[] { n5, n4 });
        final Property translation_Y = View.TRANSLATION_Y;
        final float n6 = (float)n3;
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)a2, new PropertyValuesHolder[] { ofFloat2, ofFloat3, ofFloat4, PropertyValuesHolder.ofFloat(translation_Y, new float[] { (1.0f - n5) * n6, n6 * n5 }) });
        ofPropertyValuesHolder.setDuration(250L);
        ofPropertyValuesHolder.setInterpolator((TimeInterpolator)new adh());
        ofPropertyValuesHolder.addListener((Animator$AnimatorListener)new jcc(this.a, this.c));
        if (!this.h) {
            ofPropertyValuesHolder.addListener((Animator$AnimatorListener)new jbw((View)this.d));
        }
        ofPropertyValuesHolder.addListener(jvh.e((Consumer)new gjt(this)));
        nnn.g(ofPropertyValuesHolder);
        if (!this.h) {
            final AnimatorSet set = new AnimatorSet();
            set.playTogether((Collection)Collection$_EL.stream((Collection)this.f).map((Function)new gju(this)).collect(Collectors.toList()));
            nnn.g(set);
        }
        final AnimatorSet set2 = new AnimatorSet();
        List list;
        if (this.b) {
            list = nnn.f();
        }
        else {
            list = nqb.r(nnn.f());
        }
        set2.playSequentially(list);
        if (this.b) {
            set2.addListener(jvh.f((Consumer)new gjt(this, 1)));
        }
        return (Animator)set2;
    }
}
