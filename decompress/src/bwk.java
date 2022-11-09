import android.content.res.Configuration;
import android.widget.FrameLayout$LayoutParams;
import android.view.animation.AnimationUtils;
import android.animation.AnimatorInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.LinearLayout;
import android.view.animation.Interpolator;
import android.animation.AnimatorSet;
import android.widget.TextView;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bwk extends FrameLayout
{
    public final TextView a;
    public final TextView b;
    public final AnimatorSet c;
    public final AnimatorSet d;
    public final Interpolator e;
    public final Interpolator f;
    public AnimatorSet g;
    private final LinearLayout h;
    
    public bwk(final Context context) {
        super(context);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(2131623971, (ViewGroup)this);
        final jea a = jea.a((View)this);
        this.h = (LinearLayout)a.c(2131427439);
        this.a = (TextView)a.c(2131427440);
        this.b = (TextView)a.c(2131427438);
        this.c = (AnimatorSet)AnimatorInflater.loadAnimator(this.getContext(), 2130837513);
        this.d = (AnimatorSet)AnimatorInflater.loadAnimator(this.getContext(), 2130837512);
        this.e = AnimationUtils.loadInterpolator(context, 17563661);
        this.f = AnimationUtils.loadInterpolator(context, 17563662);
        final int orientation = context.getResources().getConfiguration().orientation;
        this.b();
    }
    
    final void b() {
        ((FrameLayout$LayoutParams)this.h.getLayoutParams()).gravity = 17;
        this.forceLayout();
    }
    
    protected final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final int orientation = configuration.orientation;
        this.b();
    }
}
