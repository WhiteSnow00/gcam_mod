import android.view.View;
import com.google.android.apps.camera.uiutils.ReplaceableView;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class heg implements het
{
    public final int a;
    public boolean b;
    private final kjm c;
    private final klj d;
    private hei e;
    private klj f;
    private klj g;
    private klj h;
    private int i;
    private hej j;
    private jcd k;
    
    public heg(final kjm c, final cxl cxl, final klv d) {
        this.c = c;
        this.d = d;
        if (cxl.k(cxr.ad)) {
            this.a = (int)cxl.a(cxr.h).c();
            return;
        }
        this.a = ((int)cxl.a(cxr.f).c() | 0xFF000000);
    }
    
    @Override
    public final oey a() {
        final jcd k = this.k;
        nov.z(k);
        k.a();
        final hei e = this.e;
        nov.z(e);
        e.setVisibility(8);
        final oey d = hei.d();
        d.d(new aas(13), odx.a);
        return d;
    }
    
    @Override
    public final oey b() {
        if (this.d.aQ() == jbm.m) {
            final jcd k = this.k;
            nov.z(k);
            k.b(this.i);
        }
        else {
            final jcd i = this.k;
            nov.z(i);
            i.c();
        }
        final hei e = this.e;
        nov.z(e);
        e.setVisibility(0);
        return hei.d();
    }
    
    public final void c() {
        if (this.b) {
            final jbm jbm = (jbm)this.d.aQ();
            final jbm c = jbm.c;
            boolean b = false;
            final boolean b2 = jbm == c || jbm == jbm.i;
            if (jbm != jbm.b && jbm != jbm.h) {
                if (jbm == jbm.g) {
                    b = true;
                }
            }
            else {
                b = true;
            }
            final jbm m = jbm.m;
            if ((b2 && ((String)((kkz)this.f).d).equals("torch")) || (b && ((String)((kkz)this.g).d).equals("on")) || (jbm == m && ((String)((kkz)this.h).d).equals("torch"))) {
                this.j.b();
                return;
            }
        }
        this.j.d();
    }
    
    @Override
    public final void d(final hej j, final kjk kjk, final ReplaceableView replaceableView, final heu heu, final jcd k, final klj f, final klj g, final klj h, final klj klj) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.k = k;
        this.i = heu.a();
        (this.e = new hei(replaceableView.getContext())).setBackgroundColor(this.a);
        replaceableView.a((View)this.e);
        (this.j = j).f();
        kjk.c(this.f.a(new hef(this, 2), this.c));
        kjk.c(g.a(new hef(this, 3), this.c));
        kjk.c(h.a(new hef(this, 4), this.c));
        kjk.c(this.d.a(new hef(this), this.c));
        kjk.c(klj.a(new hef(this, 1), this.c));
    }
}
