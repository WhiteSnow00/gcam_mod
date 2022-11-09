import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cde implements kow
{
    private final cjl A;
    private final ivj B;
    public final ihp a;
    public final String b;
    public final cmw c;
    public final ims d;
    public final jjb e;
    public final gjj f;
    public final cfz g;
    public final crg h;
    public final cbo i;
    public final liz j;
    public final niz k;
    public final clu l;
    public final ckv m;
    public final cfm n;
    public final kjm o;
    public bqo p;
    public jbm q;
    public cnb r;
    public cfo s;
    private final Resources t;
    private final ElapsedTimerView u;
    private final cnc v;
    private final BottomBarController w;
    private final iqg x;
    private final irw y;
    private final iru z;
    
    public cde(final ihp a, final ixw ixw, final Resources t, final cnc v, final cmw c, final BottomBarController w, final ims d, final jjb e, final iqg x, final irw y, final iru z, final cjl a2, final gjj f, final cfz g, final crg h, final cbo i, final liz j, final ivj b, final niz k, final clu l, final ckv m, final cfm n, final kjm o) {
        this.t = t;
        this.a = a;
        this.v = v;
        this.c = c;
        this.w = w;
        this.d = d;
        this.e = e;
        this.x = x;
        this.y = y;
        this.z = z;
        this.f = f;
        this.A = a2;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.B = b;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.u = (ElapsedTimerView)ixw.c.c(2131427578);
        this.b = t.getString(2131952779);
    }
    
    public static List b(final List list) {
        final ArrayList list2 = new ArrayList();
        for (final kmt kmt : list) {
            final kmt a = kmt.a;
            niz niz = null;
            switch (kmt.ordinal()) {
                default: {
                    niz = nii.a;
                    break;
                }
                case 3: {
                    niz = niz.i(hjd.d);
                    break;
                }
                case 2:
                case 5: {
                    niz = niz.i(hjd.c);
                    break;
                }
                case 1:
                case 4: {
                    niz = niz.i(hjd.b);
                    break;
                }
                case 0: {
                    niz = niz.i(hjd.a);
                    break;
                }
            }
            if (niz.g()) {
                list2.add(niz.c());
            }
        }
        Collections.sort((List<Comparable>)list2);
        return list2;
    }
    
    @Override
    public final void aU(final kov kov) {
        final irw y = this.y;
        final kov a = kov.a;
        irv irv = null;
        switch (kov.ordinal()) {
            default: {
                irv = irv.e;
                break;
            }
            case 5:
            case 6:
            case 7:
            case 9: {
                irv = irv.e;
                break;
            }
            case 4: {
                irv = irv.a;
                break;
            }
            case 2:
            case 8: {
                irv = irv.f;
                break;
            }
            case 1:
            case 3: {
                irv = irv.b;
                break;
            }
            case 0: {
                irv = irv.c;
                break;
            }
        }
        y.a(irv);
    }
    
    public final void c(final bqo bqo, final jbm q) {
        this.p = bqo;
        this.q = q;
        this.r = this.v.a(q);
        this.A.a = this.q;
        this.g.d = bqo;
    }
    
    public final void d(final boolean b) {
        final cfz g = this.g;
        if (b) {
            g.c.execute(new cfy(g, 4));
            return;
        }
        g.c.execute(new cfy(g, 5));
    }
    
    public final void e() {
        this.z.d();
    }
    
    public final void f() {
        mcn.n().execute(new cda(this, 1));
    }
    
    public final void g() {
        mcn.n().execute(new cda(this));
    }
    
    public final void h() {
        if (this.A.b().g()) {
            this.h.h((lfu)this.A.b().c());
        }
    }
    
    public final void i() {
        this.e.y(nii.a, false);
        final cfz g = this.g;
        g.c.execute(new cfy(g, 1));
        ((bsa)this.p).r();
        if (this.u.getVisibility() != 8) {
            this.u.setVisibility(8);
        }
        this.e.o();
    }
    
    public final void j(final boolean b) {
        mcn.n().execute(new cdc(this, b));
    }
    
    public final void k(final boolean snapshotButtonClickEnabled) {
        this.w.setSnapshotButtonClickEnabled(snapshotButtonClickEnabled);
    }
    
    public final void l(final boolean b) {
        this.B.H(b);
    }
    
    public final void m(final boolean b) {
        if (this.A.l()) {
            this.x.l(true);
        }
        this.a.e(false);
        this.d.a(b);
        if (this.k.g() && this.n(this.q)) {
            if (this.l.a().equals(clp.b)) {
                ((cor)this.k.c()).f(b);
            }
            ((cor)this.k.c()).d(true);
        }
    }
    
    public final boolean n(final jbm jbm) {
        final boolean g = this.k.g();
        boolean b = false;
        if (g) {
            if (!jbm.equals(jbm.c) && !jbm.equals(jbm.f)) {
                if (jbm.equals(jbm.n)) {
                    return true;
                }
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final int o() {
        return this.r.j();
    }
}
