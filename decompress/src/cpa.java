import android.view.View$OnLayoutChangeListener;
import java.util.Iterator;
import java.util.HashSet;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import java.util.Set;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpa implements cpf
{
    public final ArrayList a;
    public final AtomicInteger b;
    public final BottomBarController c;
    public final cxl d;
    public final efm e;
    public final eiq f;
    public final kjm g;
    public final iqg h;
    public final ivj i;
    public final WindowManager j;
    public krc k;
    public boolean l;
    public boolean m;
    public int n;
    public final bmz o;
    public coh p;
    private final Set q;
    private RecordSpeedSlider r;
    
    public cpa(final bmz o, final BottomBarController c, final efm e, final cxl d, final eiq f, final kjm g, final iqg h, final ivj i, final WindowManager j) {
        this.a = new ArrayList();
        this.b = new AtomicInteger(-1);
        this.q = new HashSet();
        this.k = bqx.e;
        this.o = o;
        this.c = c;
        this.e = e;
        this.d = d;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    private final void m(final int n) {
        final Iterator iterator = this.q.iterator();
        while (iterator.hasNext()) {
            ((cph)iterator.next()).a(n);
        }
    }
    
    @Override
    public final void a(final cph cph) {
        this.q.add(cph);
    }
    
    public final void b() {
        this.c.setClickable(false);
        this.h.l(false);
        this.i.F(false);
        this.f.g(2);
    }
    
    @Override
    public final void c() {
        if (this.r.getChildAt(this.n) == null) {
            return;
        }
        this.r.getChildAt(this.n).setVisibility(8);
    }
    
    @Override
    public final void d() {
        this.r.f(this.n);
    }
    
    @Override
    public final void e(final cph cph) {
        this.q.remove(cph);
    }
    
    @Override
    public final void f(final boolean m) {
        this.m = m;
    }
    
    @Override
    public final void g(final boolean b) {
        final RecordSpeedSlider r = this.r;
        if (r == null) {
            return;
        }
        if (b) {
            r.c();
            return;
        }
        r.b();
    }
    
    @Override
    public final void h(final boolean l) {
        this.l = l;
    }
    
    @Override
    public final void i() {
        if (this.r.getChildAt(this.n) == null) {
            return;
        }
        this.r.getChildAt(this.n).setVisibility(0);
    }
    
    @Override
    public final void j(final coh p) {
        this.p = p;
    }
    
    public final void k(final int n, final int n2) {
        if (this.r.k()) {
            final jcb a = jcb.a;
            switch (n - 1) {
                default: {
                    if (n2 < this.n) {
                        this.m(n2);
                        return;
                    }
                    break;
                }
                case 0: {
                    if (n2 > this.n) {
                        this.m(n2 - 1);
                        return;
                    }
                    break;
                }
            }
            return;
        }
        final jcb a2 = jcb.a;
        switch (n - 1) {
            default: {
                this.m(n2);
                return;
            }
            case 0: {
                this.m(n2 - 1);
            }
        }
    }
    
    @Override
    public final void l(final nle nle, final cov cov, final int n, int n2, final int n3, final boolean b, final int width) {
        this.r = (RecordSpeedSlider)cov;
        final int n4 = 0;
        this.g(false);
        int size = nle.r().size();
        if (n == 1) {
            size = n4;
        }
        this.n = size;
        this.l = true;
        this.m = true;
        this.a.clear();
        if (n == 1) {
            ++n2;
        }
        if (this.b.get() == -1) {
            this.b.set(n2);
        }
        this.r.getLayoutParams().width = width;
        this.r.addOnLayoutChangeListener((View$OnLayoutChangeListener)new coz(this, width, nle, n, n3, b, n2));
    }
}
