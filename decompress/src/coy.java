import android.animation.LayoutTransition;
import java.util.concurrent.Executor;
import android.animation.LayoutTransition$TransitionListener;
import android.animation.AnimatorInflater;
import android.view.View;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coy implements cou
{
    final /* synthetic */ RecordSpeedSlider a;
    public final /* synthetic */ coz b;
    
    public coy(final coz b, final RecordSpeedSlider a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final View view, final boolean b) {
        final RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider)view;
        final coz b2 = this.b;
        if (b2.d) {
            if (b2.f.b.get() != recordSpeedSlider.a()) {
                this.b.f.g(false);
                this.b.f.b.set(recordSpeedSlider.a());
            }
            else {
                final cpa f = this.b.f;
                f.c.setClickable(true);
                f.h.l(true);
                f.i.F(true);
                f.f.g(1);
            }
            final coz b3 = this.b;
            b3.f.k(b3.g, recordSpeedSlider.a());
        }
        if (recordSpeedSlider.k()) {
            final int a = recordSpeedSlider.a();
            final cpa f2 = this.b.f;
            if (a == f2.n) {
                f2.b();
                this.b.f.g(false);
                final LayoutTransition layoutTransition = recordSpeedSlider.getLayoutTransition();
                layoutTransition.setAnimator(3, AnimatorInflater.loadAnimator(recordSpeedSlider.getContext(), 2130837511));
                layoutTransition.addTransitionListener((LayoutTransition$TransitionListener)new cox(this));
                recordSpeedSlider.getLayoutParams().width = this.b.a;
                recordSpeedSlider.removeAllViews();
                return;
            }
        }
        if (b) {
            final int e = recordSpeedSlider.e(recordSpeedSlider.a());
            final View child = recordSpeedSlider.getChildAt(recordSpeedSlider.a());
            final String s = this.b.b.d(e).get(2);
            final cpa f3 = this.b.f;
            if (f3.l) {
                if (!(boolean)f3.a.get(e)) {
                    child.requestLayout();
                    f3.k.close();
                    final jcb a2 = jcb.a(f3.j.getDefaultDisplay(), child.getContext());
                    final int dimensionPixelSize = child.getResources().getDimensionPixelSize(2131166199);
                    iwg iwg = null;
                    switch (a2.ordinal()) {
                        default: {
                            return;
                        }
                        case 2: {
                            iwg = new iwg(s);
                            iwg.h(child, dimensionPixelSize);
                            iwg.r();
                            break;
                        }
                        case 1: {
                            iwg = new iwg(s);
                            iwg.i(child, dimensionPixelSize);
                            iwg.q();
                            break;
                        }
                        case 0: {
                            iwg = new iwg(s);
                            iwg.o(child);
                            iwg.p();
                            break;
                        }
                    }
                    iwg.h = f3.d.k(cxr.at);
                    iwg.u();
                    iwg.k();
                    iwg.f = true;
                    iwg.c = 300;
                    iwg.d = 2300;
                    iwg.m = 5;
                    iwg.f(new cow(f3, e), f3.g);
                    iwg.v();
                    iwg.i = f3.e;
                    f3.k = iwg.a();
                    f3.o.i().c(f3.k);
                }
            }
        }
    }
    
    @Override
    public final void b(final boolean b) {
        this.b.f.b.set(this.a.a());
        if (b) {
            final coz b2 = this.b;
            if (b2.d) {
                b2.f.b();
            }
        }
    }
}
