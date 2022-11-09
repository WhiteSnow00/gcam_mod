import com.google.android.apps.camera.smarts.SmartsUiGleamingView;
import com.google.android.apps.camera.smarts.SmartsChipView;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View$OnLayoutChangeListener;
import com.google.android.apps.camera.uiutils.ReplaceableView;
import java.util.Iterator;
import java.util.concurrent.Executor;
import android.graphics.Point;
import android.graphics.RectF;
import java.util.HashMap;
import android.graphics.Matrix;
import java.util.Map;
import android.os.Handler;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnr implements hoy, hlz, exl, exh, exj, exe
{
    public static final nsd a;
    private final kjk A;
    private boolean B;
    private View C;
    private View D;
    private gkw E;
    public final kjm b;
    public final Handler c;
    public final hhu d;
    public final blc e;
    public final klv f;
    public final klj g;
    public final Map h;
    public final kse i;
    public final hoj j;
    public final Matrix k;
    public final ofn l;
    public jbm m;
    public lfu n;
    public lfg o;
    public boolean p;
    public int q;
    public boolean r;
    public int s;
    public long t;
    public int u;
    public int v;
    public int w;
    private final klv x;
    private final hma y;
    private final hnx z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/smarts/SmartsControllerImpl");
    }
    
    public hnr(final hma y, final hoj j, final hnx z, final kjm b, final Handler c, final hhu d, final pii pii, final klv f, final klv x, final klj g, final kse i) {
        this.l = ofn.f();
        this.y = y;
        this.j = j;
        this.z = z;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (blc)pii.get();
        this.f = f;
        this.x = x;
        this.g = g;
        this.i = i;
        this.h = new HashMap();
        this.m = jbm.a;
        this.n = lfu.b;
        this.p = false;
        this.q = 0;
        this.B = false;
        this.r = false;
        this.s = 0;
        this.t = 0L;
        this.w = 0;
        this.k = new Matrix();
        this.A = new kjk();
    }
    
    public static final boolean k(final hjg hjg) {
        return !hjg.equals(hjg.a);
    }
    
    private static final RectF m(final View view) {
        final Point y = jwn.Y(view);
        return new RectF((float)y.x, (float)y.y, (float)(y.x + view.getWidth()), (float)(y.y + view.getHeight()));
    }
    
    @Override
    public final void bh() {
        njo.o(this.r ^ true);
        this.h(hms.b);
        this.A.close();
    }
    
    @Override
    public final void bi() {
        this.r = false;
        this.h(hms.a);
        final hoj j = this.j;
        j.f.b(new hof(j));
    }
    
    @Override
    public final void bj() {
        this.i.f("smartsProcessor#resume");
        this.h(hms.c);
        this.i.g();
        this.r = true;
    }
    
    @Override
    public final void bk() {
        kjm.a();
        if (!this.B) {
            final hna hna = new hna(this, 2);
            this.e.a(hna);
            this.A.c(new hmw(this, hna));
            this.A.c(this.f.a(new hmx(this, 1), this.b));
            this.A.c(this.g.a(new hmx(this, 2), this.b));
            this.B = true;
        }
    }
    
    @Override
    public final void e(final lfg lfg) {
        this.b.b(new hnc(this, lfg));
    }
    
    @Override
    public final void f(final ljm ljm) {
        this.b.b(new hnd(this, ljm));
    }
    
    @Override
    public final void g(final lbe lbe, final kwz kwz) {
        kwp.l(lbe, new hmz(this, kwz));
    }
    
    public final void h(final hno hno) {
        final Iterator iterator = this.h.values().iterator();
        while (iterator.hasNext()) {
            hno.a(iterator.next());
        }
    }
    
    public final void i() {
        kjm.a();
        final boolean p = this.q > 0;
        if (this.p != p) {
            this.p = p;
            this.h(new hmy(this, 2));
            if (this.p) {
                final hnx z = this.z;
                kjm.a();
                z.d();
                z.j = true;
                return;
            }
            final hnx z2 = this.z;
            kjm.a();
            z2.j = false;
        }
    }
    
    public final void j() {
        kjm.a();
        final int w = (this.E.f().e + 90) % 360;
        this.w = w;
        int u = this.u;
        final int v = this.v;
        final int n = w % 180;
        int n2;
        if (n != 0) {
            n2 = u;
        }
        else {
            n2 = v;
        }
        if (n != 0) {
            u = v;
        }
        final RectF m = m(this.D);
        final RectF i = m(this.C);
        final Matrix matrix = new Matrix();
        final float n3 = (float)u;
        final float n4 = (float)n2;
        matrix.postScale(m.width() / n3, m.height() / n4);
        matrix.postTranslate(m.left - i.left, m.top - i.top);
        this.k.reset();
        this.k.postTranslate(-m.left, -m.top);
        this.k.postScale(n3 / m.width(), n4 / m.height());
    }
    
    @Override
    public final void l(final gkw gkw, final ReplaceableView replaceableView, final View c, View inflate, final efm d) {
        kjm.a();
        this.E = gkw;
        this.C = c;
        (this.D = inflate).addOnLayoutChangeListener((View$OnLayoutChangeListener)new hnl(this));
        try {
            final hoj j = this.j;
            inflate = LayoutInflater.from(replaceableView.getContext()).inflate(2131624155, (ViewGroup)replaceableView.getParent(), false);
            replaceableView.a(inflate);
            final FrameLayout frameLayout = (FrameLayout)inflate;
            j.a = (SmartsChipView)frameLayout.findViewById(2131427965);
            j.b = (SmartsUiGleamingView)frameLayout.findViewById(2131427624);
            j.c = gkw;
            j.d = d;
            j.e = new HashMap();
            this.l.o(true);
            final hnq hnq = new hnq(this);
            this.d.a(hnq);
            this.A.c(new hmv(this, hnq));
            this.A.c(this.y.a(this));
            this.A.c(this.x.a(new hmx(this), mcn.n()));
        }
        finally {
            this.l.o(true);
        }
    }
}
