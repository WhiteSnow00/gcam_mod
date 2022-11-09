import java.util.concurrent.atomic.AtomicLong;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import java.util.TimerTask;
import java.util.Timer;

// 
// Decompiled by Procyon v0.6.0
// 

class ick extends ibw
{
    final /* synthetic */ icm b;
    
    public ick(final icm b) {
        this.b = b;
    }
    
    @Override
    public void d() {
        final boolean k = this.b.h.k(cwv.H);
        int n = 0;
        boolean b = false;
        if (k) {
            this.b.i.v(false);
            this.b.i.l(false);
        }
        else {
            this.b.n.b();
        }
        jgu.c();
        this.b.g.d(false);
        this.b.f.startTimelapseRecording();
        this.b.k.Z();
        this.b.l.g();
        this.b.j.j();
        final icy l = this.b.l;
        if (l.k.k(cwv.H)) {
            if (l.K.a((double)l.z.aQ()) != 1.0) {
                b = true;
            }
            final imq a = imr.a();
            a.e(b);
            a.d(true);
            l.j.d(a.a());
            l.j.f();
            (l.H = ((cib)l.A).a()).e();
            return;
        }
        final iec i = l.i;
        i.a();
        final AtomicLong e = i.e;
        final jdv h = i.h;
        e.set(System.currentTimeMillis());
        (i.j = new Timer()).scheduleAtFixedRate(new ieb(i), 0L, 500L);
        final jcb a2 = jcb.a(i.f.getDisplay(), i.f.getContext());
        int dimensionPixelSize = 0;
        switch (a2.ordinal()) {
            default: {
                dimensionPixelSize = 0;
                break;
            }
            case 1:
            case 2: {
                dimensionPixelSize = i.g.getDimensionPixelSize(2131165484);
                break;
            }
            case 0: {
                final int[] array = new int[2];
                i.k.getLocationInWindow(array);
                dimensionPixelSize = array[1] + i.k.getHeight() / 2 - i.g.getDimensionPixelSize(2131165481) / 2;
                break;
            }
        }
        final int[] array2 = new int[2];
        final Object c = i.i.k.c(2131428112);
        switch (a2.ordinal()) {
            case 1:
            case 2: {
                final View view = (View)c;
                view.getLocationInWindow(array2);
                n = array2[0] + view.getWidth() / 2 - i.g.getDimensionPixelSize(2131165482) / 2;
                break;
            }
        }
        FrameLayout$LayoutParams layoutParams = null;
        switch (a2.ordinal()) {
            default: {
                layoutParams = new FrameLayout$LayoutParams(i.g.getDimensionPixelSize(2131165482), i.g.getDimensionPixelSize(2131165481), 49);
                layoutParams.topMargin = dimensionPixelSize;
                break;
            }
            case 2: {
                layoutParams = new FrameLayout$LayoutParams(i.g.getDimensionPixelSize(2131165482), i.g.getDimensionPixelSize(2131165481), 48);
                layoutParams.topMargin = dimensionPixelSize;
                layoutParams.leftMargin = n;
                break;
            }
            case 1: {
                layoutParams = new FrameLayout$LayoutParams(i.g.getDimensionPixelSize(2131165482), i.g.getDimensionPixelSize(2131165481), 80);
                layoutParams.bottomMargin = dimensionPixelSize;
                layoutParams.leftMargin = n;
                break;
            }
        }
        i.f.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        i.f.requestLayout();
        i.f.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction((Runnable)new idz(i));
    }
}
