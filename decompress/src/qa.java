import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class qa implements Runnable
{
    final /* synthetic */ ArrayList a;
    final /* synthetic */ sa b;
    private final /* synthetic */ int c;
    
    public qa(final sa b, final ArrayList a) {
        this.b = b;
        this.a = a;
    }
    
    public qa(final sa b, final ArrayList a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        final int n = 0;
        final int n2 = 0;
        int i = 0;
        switch (c) {
            default: {
                final ArrayList a = this.a;
                for (int size = a.size(), j = n2; j < size; ++j) {
                    final st st = (st)a.get(j);
                    final sa b = this.b;
                    final View a2 = st.a;
                    final ViewPropertyAnimator animate = a2.animate();
                    b.i.add(st);
                    animate.alpha(1.0f).setDuration(120L).setListener((Animator$AnimatorListener)new qc(b, st, a2, animate)).start();
                }
                this.a.clear();
                this.b.f.remove(this.a);
                return;
            }
            case 1: {
                for (ArrayList a3 = this.a; i < a3.size(); ++i) {
                    final qh qh = (qh)a3.get(i);
                    final sa b2 = this.b;
                    final st a4 = qh.a;
                    final int b3 = qh.b;
                    final int c2 = qh.c;
                    final int d = qh.d;
                    final int e = qh.e;
                    final View a5 = a4.a;
                    final int n3 = d - b3;
                    final int n4 = e - c2;
                    if (n3 != 0) {
                        a5.animate().translationX(0.0f);
                    }
                    if (n4 != 0) {
                        a5.animate().translationY(0.0f);
                    }
                    final ViewPropertyAnimator animate2 = a5.animate();
                    b2.j.add(a4);
                    animate2.setDuration(250L).setListener((Animator$AnimatorListener)new qd(b2, a4, n3, a5, n4, animate2)).start();
                }
                this.a.clear();
                this.b.g.remove(this.a);
                return;
            }
            case 0: {
                final ArrayList a6 = this.a;
                for (int size2 = a6.size(), k = n; k < size2; ++k) {
                    final qg qg = (qg)a6.get(k);
                    final sa b4 = this.b;
                    final st a7 = qg.a;
                    View a8 = null;
                    View a9;
                    if (a7 == null) {
                        a9 = null;
                    }
                    else {
                        a9 = a7.a;
                    }
                    final st b5 = qg.b;
                    if (b5 != null) {
                        a8 = b5.a;
                    }
                    if (a9 != null) {
                        final ViewPropertyAnimator setDuration = a9.animate().setDuration(250L);
                        b4.l.add(qg.a);
                        setDuration.translationX((float)(qg.e - qg.c));
                        setDuration.translationY((float)(qg.f - qg.d));
                        setDuration.alpha(0.0f).setListener((Animator$AnimatorListener)new qe(b4, qg, setDuration, a9)).start();
                    }
                    if (a8 != null) {
                        final ViewPropertyAnimator animate3 = a8.animate();
                        b4.l.add(qg.b);
                        animate3.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener((Animator$AnimatorListener)new qf(b4, qg, animate3, a8)).start();
                    }
                }
                this.a.clear();
                this.b.h.remove(this.a);
            }
        }
    }
}
