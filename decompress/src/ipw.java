import java.util.Iterator;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ipw extends AnimatorListenerAdapter
{
    final /* synthetic */ iqc a;
    
    public ipw(final iqc a) {
        this.a = a;
    }
    
    public final void onAnimationEnd(Animator a) {
        this.a.e();
        a = (Animator)this.a;
        if (((iqc)a).t.g()) {
            ((Runnable)((iqc)a).t.c()).run();
            ((iqc)a).t = nii.a;
        }
        try {
            final Iterator iterator = ((iqc)a).E.iterator();
            while (iterator.hasNext()) {
                ((Runnable)iterator.next()).run();
            }
            ((iqc)a).E.clear();
        }
        finally {
            ((iqc)a).E.clear();
            while (true) {}
        }
    }
}
