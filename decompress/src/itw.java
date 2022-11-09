import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.animation.Animator;
import android.support.constraint.ConstraintLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class itw extends ConstraintLayout
{
    private Animator d;
    public TextView e;
    public TextView f;
    
    public itw(final Context context) {
        super(context);
    }
    
    public itw(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void e(final boolean b) {
        if (b) {
            this.f.setEnabled(true);
        }
        else {
            this.f.setEnabled(false);
        }
        final Animator d = this.d;
        if (d != null) {
            d.end();
        }
        ObjectAnimator d2;
        if (b) {
            d2 = ObjectAnimator.ofFloat((Object)this, "alpha", new float[] { 0.0f, 1.0f });
        }
        else {
            d2 = ObjectAnimator.ofFloat((Object)this, "alpha", new float[] { 1.0f, 0.0f });
        }
        d2.setDuration(217L);
        if (b) {
            d2.addListener((Animator$AnimatorListener)new itu(this));
        }
        else {
            d2.addListener((Animator$AnimatorListener)new itv(this));
        }
        ((Animator)d2).start();
        this.d = (Animator)d2;
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624055, (ViewGroup)this, true);
        this.setLayerType(1, (Paint)null);
        this.e = (TextView)this.findViewById(2131427525);
        this.f = (TextView)this.findViewById(2131427477);
    }
}
