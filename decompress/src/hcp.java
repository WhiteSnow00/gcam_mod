import android.view.ViewGroup;
import android.graphics.Shader;
import java.util.Collection;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.AnimatorSet;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup$LayoutParams;
import android.support.constraint.Guideline;
import android.os.Looper;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.os.Handler;
import com.google.android.apps.camera.rewind.ui.RewindControllerView;
import com.google.android.apps.camera.rewind.ui.RewindPreview;
import android.view.WindowManager;
import android.content.Context;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcp extends hda
{
    public static final nsd b;
    private static final Duration p;
    public final Context c;
    public final njp d;
    public final WindowManager e;
    public final htm f;
    public final jdj g;
    public RewindPreview h;
    public RewindControllerView i;
    public final hbv j;
    public final hcq k;
    public final ixx l;
    public final Handler m;
    public hcz n;
    public jwn o;
    private final BottomBarController q;
    private final BottomBarListener r;
    
    static {
        b = nsd.g("com/google/android/apps/camera/rewind/RewindControllerImpl");
        p = Duration.ofMillis(250L);
    }
    
    public hcp(final Context c, final njp d, final hbv j, final BottomBarController q, final iqg iqg, final hcq k, final ixx l, final WindowManager e, final htm f, final jdj g) {
        this.m = kpo.d(Looper.getMainLooper());
        this.c = c;
        this.d = d;
        this.j = j;
        this.q = q;
        this.k = k;
        this.l = l;
        this.e = e;
        this.f = f;
        this.g = g;
        this.r = new hck(iqg);
    }
    
    public static void w(final Guideline guideline, final int a) {
        final cr layoutParams = (cr)guideline.getLayoutParams();
        layoutParams.a = a;
        guideline.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    @Override
    public final void br() {
    }
    
    public final void bs() {
        this.q.removeListener(this.r);
        this.n.b();
    }
    
    public final void bt() {
        this.q.addListener(this.r);
        this.n.a();
    }
    
    @Override
    public final void close() {
    }
    
    public final void m() {
    }
    
    public final void o() {
    }
    
    @Override
    public final boolean q() {
        return false;
    }
    
    public final AnimatorSet u(final Animator$AnimatorListener... array) {
        final inw inw = (inw)this.d.a();
        final int width = inw.b.b.getWidth();
        final float n = (float)inw.b.b.getHeight();
        final AnimatorSet set = new AnimatorSet();
        set.setDuration(hcp.p.toMillis());
        set.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        final RewindPreview h = this.h;
        final float n2 = -(float)width;
        int i = 0;
        final nns p = nns.p(ObjectAnimator.ofFloat((Object)h, "translationX", new float[] { n2, 0.0f }), ObjectAnimator.ofFloat((Object)this.i.findViewById(2131427733), "alpha", new float[] { 0.0f, 1.0f }), ObjectAnimator.ofFloat((Object)this.i.findViewById(2131427739), "translationY", new float[] { n, 0.0f }), ObjectAnimator.ofFloat((Object)this.i.findViewById(2131427737), "translationY", new float[] { n, 0.0f }));
        while (i <= 0) {
            set.addListener(array[i]);
            ++i;
        }
        set.playTogether((Collection)p);
        return set;
    }
    
    public final hc v(final hdb hdb) {
        final hb hb = new hb(this.c.getResources(), hdb.d());
        final float dimension = this.c.getResources().getDimension(2131165798);
        if (hb.d != dimension) {
            if (hc.c(dimension)) {
                hb.b.setShader((Shader)hb.c);
            }
            else {
                hb.b.setShader((Shader)null);
            }
            hb.d = dimension;
            hb.invalidateSelf();
        }
        return hb;
    }
    
    @Override
    public final void x(final ViewGroup viewGroup, final ViewGroup viewGroup2) {
        this.h = (RewindPreview)viewGroup;
        this.i = (RewindControllerView)viewGroup2;
        (this.n = new hbu(this, this.l.e, this.h, this.i)).f();
    }
    
    @Override
    public final void y(final jcb jcb) {
        final RewindPreview h = this.h;
        if (h != null) {
            h.a = jcb;
            h.a();
        }
        final RewindControllerView i = this.i;
        if (i != null) {
            i.a = jcb;
            i.a();
        }
    }
}
