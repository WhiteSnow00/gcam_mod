import java.util.concurrent.Executor;
import android.widget.LinearLayout;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.Resources$Theme;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.graphics.Typeface;
import android.content.res.ColorStateList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import android.widget.ImageButton;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import android.view.View;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjj implements csc, jbv
{
    public static final nsd a;
    public final klv A;
    public final klv B;
    public final klv C;
    public final klv D;
    public final klv E;
    public final klv F;
    public final klv G;
    public final klv H;
    public final klv I;
    public klv J;
    public final hkn K;
    public final hko L;
    public final klv M;
    public final hys N;
    public final gjm O;
    public final gjm P;
    public final gjm Q;
    public final gjm R;
    public final gjm S;
    public final gjm T;
    public final gjm U;
    public final gjm V;
    public final gjm W;
    public final gjm X;
    public final gjm Y;
    public final gjm Z;
    public final nlf aA;
    public final nlf aB;
    public final nlf aC;
    public final nlf aD;
    public final nlf aE;
    public final nlf aF;
    public final nlf aG;
    public final nlf aH;
    public final nlf aI;
    public final nlf aJ;
    public final nlf aK;
    public final nlf aL;
    public final nlf aM;
    public final nlf aN;
    public final nlf aO;
    public final nlf aP;
    public gkf aQ;
    public gji aR;
    public OptionsMenuView aS;
    public View aT;
    public OptionsMenuContainer aU;
    public ImageButton aV;
    public final eyt aW;
    public final AtomicBoolean aX;
    public final efm aY;
    public final klv aZ;
    public final gjm aa;
    public final gjm ab;
    public final gjm ac;
    public final gjm ad;
    public final gjm ae;
    public final gjm af;
    public gjm ag;
    public gjm ah;
    public final gjm ai;
    public final klj aj;
    public final klj ak;
    public final klj al;
    public final klj am;
    public final boolean an;
    public final boolean ao;
    public final boolean ap;
    public boolean aq;
    public boolean ar;
    public final gjm as;
    public boolean at;
    public boolean au;
    public boolean av;
    public boolean aw;
    public boolean ax;
    public List ay;
    public final nlf az;
    public final klv b;
    public final gis ba;
    public final niz bb;
    public final niz bc;
    public final oui bd;
    public final niz be;
    public final niz bf;
    public final kjk bg;
    private boolean bh;
    private boolean bi;
    private final Set bj;
    private final dix bk;
    private final lae bl;
    public final kjm c;
    public final kse d;
    public final cxl e;
    public final dgn f;
    public final jjb g;
    public final iph h;
    public final hjx i;
    public final hkg j;
    public final boolean k;
    public final klv l;
    public final klv m;
    public final klv n;
    public final klv o;
    public final klv p;
    public final klv q;
    public final klv r;
    public final klv s;
    public final klv t;
    public final klv u;
    public final klv v;
    public final klv w;
    public final klj x;
    public final klv y;
    public final klv z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/optionsbar/OptionsBarController2");
    }
    
    public gjj(final klv b, final kjm c, final kse d, final kjk bg, final gis ba, final cxl e, final klv m, final klv aj, final klv n, final klv o, final hkn k, final hko l, final klv u, final klv v, final klv w, final klj x, final klv y, final boolean an, final klv z, final boolean ao, final klv a, final boolean ap, final klv b2, final klv c2, final klv e2, final klv i, final eyt aw, final lae bl, final hjx j, final klv g, final dgn f, final jjb g2, final iph h, final klv i2, final hkg j2, final klv h2, final boolean k2, final efm ay, final klv az, final hkc hkc, final hkd hkd, final dix bk, final niz bb, final niz bc, final oui bd, final niz bf, final hys n2, final niz be) {
        this.aw = false;
        this.bi = false;
        this.ay = new ArrayList();
        this.az = nnh.d(gjp.b, hjg.a, gjp.c, hjg.b, gjp.d, hjg.c, gjp.e, hjg.d);
        this.aA = nnh.c(gjp.h, ggz.c, gjp.f, ggz.b, gjp.g, ggz.a);
        final gjp x2 = gjp.X;
        final Boolean value = true;
        final gjp y2 = gjp.Y;
        final Boolean value2 = false;
        this.aB = nnh.b(x2, value, y2, value2);
        this.aC = nnh.d(gjp.l, "auto", gjp.k, "off", gjp.m, "ns", gjp.j, "on");
        this.aD = nnh.d(gjp.x, hjd.a, gjp.y, hjd.b, gjp.z, hjd.c, gjp.A, hjd.d);
        this.aE = nnh.b(gjp.C, hjh.b, gjp.B, hjh.a);
        this.aF = nnh.c(gjp.w, hje.c, gjp.v, hje.b, gjp.u, hje.a);
        this.aG = nnh.c(gjp.D, hjc.b.e, gjp.E, hjc.c.e, gjp.F, hjc.a.e);
        this.aH = nnh.d(gjp.G, egz.e(2), gjp.H, egz.e(3), gjp.I, egz.e(4), gjp.J, egz.e(1));
        this.aI = nnh.f(gjp.O, hjb.a.f, gjp.P, hjb.b.f, gjp.Q, hjb.c.f, gjp.R, hjb.d.f, gjp.S, hjb.e.f);
        final gjp r = gjp.r;
        final gjp s = gjp.s;
        final Integer value3 = 1;
        final gjp t = gjp.t;
        final Integer value4 = 0;
        this.aJ = nnh.c(r, 2, s, value3, t, value4);
        this.aK = nnh.f(gjp.ad, "pano_photosphere", gjp.Z, "pano_horizontal", gjp.aa, "pano_vertical", gjp.ab, "pano_wide", gjp.ac, "pano_fisheye");
        this.aL = nnh.b(gjp.V, value4, gjp.W, value3);
        this.aM = nnh.b(gjp.L, egz.f(1), gjp.K, egz.f(2));
        this.aN = nnh.b(gjp.N, hjf.a(1), gjp.M, hjf.a(2));
        this.aO = nnh.b(gjp.q, "off", gjp.p, "torch");
        this.aP = nnh.b(gjp.T, value, gjp.U, value2);
        this.bj = noi.K(gjo.c, gjo.i, gjo.t, gjo.j);
        this.aQ = gjf.a;
        this.aR = giv.a;
        this.aX = new AtomicBoolean(false);
        this.b = b;
        this.c = c;
        this.d = d;
        this.bg = bg;
        this.e = e;
        this.ba = ba;
        this.l = i;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = hkd.b(hjq.i);
        this.q = hkd.b(hjq.j);
        this.t = hkd.b(hjq.n);
        this.r = hkd.b(hjq.l);
        this.s = hkd.b(hjq.m);
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b2;
        this.C = c2;
        this.D = hkd.b(hjq.Q);
        this.E = e2;
        this.G = g;
        this.F = hkd.b(hjq.d);
        this.H = h2;
        this.M = hkd.b(hjq.N);
        this.bf = bf;
        this.N = n2;
        this.O = ba.a(false);
        this.P = ba.a(e.k(cxr.aL));
        this.Q = ba.b;
        this.R = ba.c;
        this.S = ba.d;
        this.T = ba.e;
        this.U = ba.g;
        this.V = ba.h;
        this.W = ba.f;
        this.K = k;
        this.L = l;
        this.ah = ba.b();
        this.X = ba.i;
        this.Y = ba.j;
        this.Z = ba.k;
        this.aa = ba.m;
        this.ab = ba.l;
        this.ac = ba.n;
        this.as = ba.s;
        this.ad = ba.o;
        this.ae = ba.p;
        this.af = ba.q;
        this.ai = ba.r;
        this.aj = aj;
        this.an = an;
        this.ao = ao;
        this.ap = ap;
        this.al = hkc.a(hjq.o);
        klj ak;
        if (e.k(cxs.ak)) {
            ak = hkc.a(hjq.p);
        }
        else {
            ak = klq.g(value2);
        }
        this.ak = ak;
        this.am = hkc.a(hjq.R);
        this.aW = aw;
        this.f = f;
        this.g = g2;
        this.I = i2;
        this.h = h;
        this.bl = bl;
        this.i = j;
        this.j = j2;
        this.k = k2;
        this.aY = ay;
        this.aZ = az;
        this.bk = bk;
        this.bb = bb;
        this.bc = bc;
        this.bd = bd;
        this.be = be;
    }
    
    private final void H() {
        this.aU.t();
        if (!this.bf.g()) {
            nov.A(this.C());
            return;
        }
        final flj flj = (flj)this.bf.c();
        throw null;
    }
    
    private final boolean I() {
        final jci c = this.aU.c;
        final int b = c.b;
        if (b == 0) {
            throw null;
        }
        switch (b - 1) {
            default: {
                throw new IllegalStateException("Should never be here");
            }
            case 2: {
                if (c.a.getVisibility() == 0) {
                    return true;
                }
                return false;
            }
            case 1: {
                return false;
            }
            case 0: {
                return true;
            }
        }
    }
    
    public static gjp b(final nlf nlf, final klv klv, final gjp gjp) {
        final gjp gjp2 = ((nqk)nlf).d.get(klv.aQ());
        if (gjp2 != null) {
            return gjp2;
        }
        gjj.a.c().E(1840).y("Tried to get MenuOption for property %s with value %s but value wasn't found in map. Returning default instead: %s", klv, klv.aQ(), gjp);
        return gjp;
    }
    
    static boolean x(final jbm jbm, final boolean b) {
        return jbm == jbm.b && b;
    }
    
    public final boolean A() {
        return this.aU.y();
    }
    
    public final boolean B() {
        final jbm jbm = (jbm)this.b.aQ();
        final boolean bh = this.bh;
        boolean b = false;
        if (bh) {
            if (jbm != jbm.c && jbm != jbm.i && jbm != jbm.f) {
                if (jbm == jbm.m) {
                    if (this.ar) {
                        return true;
                    }
                }
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean C() {
        return this.aU.isEnabled();
    }
    
    public final void D() {
        if ("torch".equals(((kkz)this.r).d) && this.B()) {
            this.aS.g(gjo.g);
        }
        if ("on".equals(((kkz)this.p).d) && this.y()) {
            this.aS.g(gjo.d);
        }
    }
    
    @Override
    public final void E() {
        if (!this.bf.g()) {
            return;
        }
        final flj flj = (flj)this.bf.c();
        throw null;
    }
    
    public final void F() {
        if (!this.bf.g()) {
            return;
        }
        final flj flj = (flj)this.bf.c();
        throw null;
    }
    
    public final void G(final int n, final lfu lfu, final String s) {
        lfu.getClass();
        final lfj e = this.bl.a.e(lfu);
        if (e == null) {
            a.k(gjj.a.b(), "Unable to fetch camera ID for facing value: %s", lfu, '\u0736');
            return;
        }
        final Collection w = nov.w(this.bl.a.a(e).v(256), new giz(n));
        njo.o(w.isEmpty() ^ true);
        final ArrayList list = new ArrayList<Object>(w);
        Collections.sort((List<E>)list, (Comparator<? super E>)Collections.reverseOrder((Comparator<? super T>)aab.b));
        kre kre = null;
        Label_0237: {
            if (s.equals("full")) {
                kre = list.get(0);
            }
            else {
                if (s.equals("medium")) {
                    if (list.size() > 1) {
                        list.remove(0);
                    }
                    final Iterator<kre> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        kre = iterator.next();
                        if (kre.b() < 5242880L) {
                            break Label_0237;
                        }
                    }
                }
                a.l(gjj.a.c(), "Invalid resolution setting, using default.", '\u0731');
                kre = list.get(0);
            }
        }
        final lfu a = lfu.a;
        String s2 = null;
        switch (lfu.ordinal()) {
            default: {
                a.k(gjj.a.c(), "Unsupported facing value: %s", lfu, '\u0735');
                return;
            }
            case 1: {
                s2 = "pref_camera_picturesize_back_key";
                break;
            }
            case 0: {
                s2 = "pref_camera_picturesize_front_key";
                break;
            }
        }
        this.i.k(s2, krf.d(kre));
    }
    
    @Override
    public final oey a(final lfu lfu) {
        this.j();
        return ofi.n(null);
    }
    
    public final List c(final List list) {
        final ArrayList list2 = new ArrayList();
        final nqk d = ((nqk)this.aD).d;
        for (final hjd hjd : list) {
            if (d.containsKey(hjd)) {
                list2.add(d.get(hjd));
            }
        }
        return list2;
    }
    
    public final void d(final nlf nlf, final klv klv, final gjm gjm, final boolean b) {
        if (!b) {
            return;
        }
        final gjp b2 = b(nlf, klv, gjp.a);
        if (b2 != gjp.a) {
            njo.r(b2 != null, "Property value %s is not associated with a MenuOption.", b2);
            final OptionsMenuContainer au = this.aU;
            final cxl e = this.e;
            final OptionsMenuView l = au.l();
            synchronized (l) {
                gjp o;
                if (b2 == gjp.P) {
                    o = gjp.O;
                }
                else {
                    o = b2;
                }
                l.g.put(gjm, o);
                final gkk j = new gkk(l.getContext(), gjm, o, l.d.get(gjm), l.e.get(gjm), l.f.get(gjm), e);
                ColorStateList list;
                ColorStateList list2;
                if (j.l) {
                    final int[][] array = { { 16842913 }, new int[0] };
                    list = new ColorStateList(array, new int[] { leg.j((View)j), leg.l((View)j) });
                    list2 = new ColorStateList(array, new int[] { leg.g((View)j), leg.h((View)j) });
                }
                else {
                    list = (list2 = new ColorStateList(new int[][] { new int[0] }, new int[] { 0 }));
                }
                final Typeface create = Typeface.create("google-sans-medium", 0);
                final Typeface create2 = Typeface.create("google-sans-medium", 0);
                for (int i = j.k.d.size() - 1; i >= 0; --i) {
                    final ImageButton imageButton = new ImageButton(j.n);
                    final FrameLayout frameLayout = new FrameLayout(j.n);
                    frameLayout.addView((View)imageButton, (ViewGroup$LayoutParams)new cr(-1, -1));
                    frameLayout.setId(View.generateViewId());
                    j.d.add(frameLayout);
                }
                final ct ct = new ct();
                ct.d(j);
                j.g.setText(j.k.b);
                j.g.setContentDescription((CharSequence)j.getResources().getString(j.k.c));
                if (j.l) {
                    j.g.setTextAppearance(leg.n(((View)j).getContext(), 2130969753));
                    j.g.setTextColor(neu.c((View)j, 2130968851));
                }
                else {
                    j.g.setTypeface(create);
                    j.g.setTextSize(2, 12.0f);
                    j.g.setTextColor(j.getResources().getColor(2131101040, (Resources$Theme)null));
                }
                j.g.setTextDirection(5);
                ct.e(j.g.getId(), 6, 0, 6, j.getResources().getDimensionPixelSize(2131166108));
                ct.e(j.g.getId(), 3, 0, 3, j.getResources().getDimensionPixelSize(2131166109));
                if (j.k.d.size() < 5) {
                    ct.e(j.g.getId(), 7, j.d.get(0).getId(), 6, j.getResources().getDimensionPixelSize(2131166100));
                    ct.e(j.i.getId(), 7, j.d.get(0).getId(), 6, j.getResources().getDimensionPixelSize(2131166100));
                }
                else {
                    ct.e(j.g.getId(), 7, j.d.get(j.k.d.size() - 3).getId(), 6, j.getResources().getDimensionPixelSize(2131166100));
                    ct.a(j.g.getId()).Q = 2;
                }
                ct.e(j.g.getId(), 4, j.i.getId(), 3, j.getResources().getDimensionPixelSize(2131166107));
                ct.f(j.g.getId(), -2);
                ct.g(j.g.getId(), 0);
                j.addView((View)j.g);
                final nns d = j.k.d;
                final int size = d.size();
                int k = 0;
                while (true) {
                    while (k < size) {
                        final gjn gjn = d.get(k);
                        final gjp a = gjn.a;
                        final gjp o2 = j.o;
                        ++k;
                        if (a == o2) {
                            if (gjn != null) {
                                String text;
                                if (gjn.e.isEmpty()) {
                                    text = j.getResources().getString(gjn.c);
                                }
                                else {
                                    text = gjn.e;
                                }
                                j.h.setText((CharSequence)text);
                                String contentDescription;
                                if (gjn.f.isEmpty()) {
                                    contentDescription = j.getResources().getString(gjn.d);
                                }
                                else {
                                    contentDescription = gjn.f;
                                }
                                j.h.setContentDescription((CharSequence)contentDescription);
                            }
                            if (j.l) {
                                j.h.setTextAppearance(leg.n(((View)j).getContext(), 2130969773));
                                j.h.setTextColor(leg.j((View)j));
                            }
                            else {
                                j.h.setTypeface(create2);
                                j.h.setTextSize(2, 16.0f);
                                j.h.setTextColor(j.getResources().getColor(2131101041, (Resources$Theme)null));
                            }
                            j.h.setTextDirection(5);
                            ct.f(j.h.getId(), -2);
                            ct.g(j.h.getId(), 0);
                            j.i.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
                            j.i.setOrientation(0);
                            j.i.addView((View)j.h);
                            final boolean b3 = j.k.a == gjo.o && j.m.k(cxg.f);
                            final boolean b4 = j.k.a == gjo.u && j.m.k(cxv.g);
                            final boolean b5 = j.k.a == gjo.i && j.m.k(cxw.p);
                            if (b4 || b3 || b5) {
                                final Drawable drawable = j.n.getDrawable(2131231184);
                                if (j.l && drawable != null) {
                                    drawable.setTint(leg.j((View)j));
                                }
                                j.j.setImageDrawable(drawable);
                                j.j.setBackgroundColor(0);
                                j.j.setPadding(j.getResources().getDimensionPixelSize(2131165738), 0, 0, 0);
                                j.i.addView((View)j.j);
                                final gjs q = j.q;
                                if (q != null) {
                                    j.i.setOnClickListener((View$OnClickListener)new gkj(j, q));
                                }
                            }
                            ct.f(j.i.getId(), -2);
                            ct.g(j.i.getId(), 0);
                            ct.e(j.i.getId(), 6, 0, 6, j.getResources().getDimensionPixelSize(2131166108));
                            ct.e(j.i.getId(), 4, 0, 4, j.getResources().getDimensionPixelSize(2131166109));
                            ct.e(j.i.getId(), 3, j.g.getId(), 4, j.getResources().getDimensionPixelSize(2131166107));
                            j.addView((View)j.i);
                            if (j.k.d.size() < 5) {
                                for (int n = j.k.d.size() - 1; n >= 0; --n) {
                                    final FrameLayout frameLayout2 = j.d.get(n);
                                    final ImageButton imageButton2 = (ImageButton)frameLayout2.getChildAt(0);
                                    final gjn gjn2 = j.k.d.get(n);
                                    j.e.put(gjn2.a, imageButton2);
                                    j.f.put(imageButton2, gjn2);
                                    String contentDescription2;
                                    if (gjn2.f.isEmpty()) {
                                        contentDescription2 = j.getResources().getString(gjn2.d);
                                    }
                                    else {
                                        contentDescription2 = gjn2.f;
                                    }
                                    imageButton2.setContentDescription((CharSequence)contentDescription2);
                                    imageButton2.setOnClickListener((View$OnClickListener)new gki(j, gjn2, 1));
                                    ct.f(frameLayout2.getId(), j.getResources().getDimensionPixelSize(2131166103));
                                    ct.g(frameLayout2.getId(), j.getResources().getDimensionPixelSize(2131166103));
                                    imageButton2.setImageDrawable(j.n.getDrawable(gjn2.b));
                                    imageButton2.getDrawable().setAutoMirrored(false);
                                    if (j.l) {
                                        imageButton2.setBackgroundResource(2131231665);
                                        imageButton2.setBackgroundTintList(list);
                                        imageButton2.setImageTintList(list2);
                                    }
                                    if (gjn2.a == j.o) {
                                        j.e(imageButton2);
                                    }
                                    else {
                                        j.f(imageButton2);
                                    }
                                    if (n == j.k.d.size() - 1) {
                                        ct.e(frameLayout2.getId(), 7, 0, 7, j.getResources().getDimensionPixelSize(2131166101));
                                    }
                                    final int n2 = n + 1;
                                    if (n2 < j.k.d.size()) {
                                        ct.e(frameLayout2.getId(), 7, ((FrameLayout)j.d.get(n2)).getId(), 6, 0);
                                    }
                                    ct.e(frameLayout2.getId(), 4, 0, 4, j.getResources().getDimensionPixelSize(2131166102));
                                    ct.e(frameLayout2.getId(), 3, 0, 3, j.getResources().getDimensionPixelSize(2131166102));
                                    j.addView((View)frameLayout2);
                                }
                            }
                            else {
                                njo.d(j.k.d.size() <= 6);
                                for (int n3 = j.k.d.size() - 1; n3 >= 0; --n3) {
                                    final FrameLayout frameLayout3 = j.d.get(n3);
                                    final ImageButton imageButton3 = (ImageButton)frameLayout3.getChildAt(0);
                                    final gjn gjn3 = j.k.d.get(n3);
                                    j.e.put(gjn3.a, imageButton3);
                                    j.f.put(imageButton3, gjn3);
                                    String contentDescription3;
                                    if (gjn3.f.isEmpty()) {
                                        contentDescription3 = j.getResources().getString(gjn3.d);
                                    }
                                    else {
                                        contentDescription3 = gjn3.f;
                                    }
                                    imageButton3.setContentDescription((CharSequence)contentDescription3);
                                    imageButton3.setOnClickListener((View$OnClickListener)new gki(j, gjn3));
                                    ct.f(frameLayout3.getId(), j.getResources().getDimensionPixelSize(2131166103));
                                    ct.g(frameLayout3.getId(), j.getResources().getDimensionPixelSize(2131166103));
                                    imageButton3.setImageResource(gjn3.b);
                                    imageButton3.getDrawable().setAutoMirrored(false);
                                    if (j.l) {
                                        imageButton3.setBackgroundResource(2131231665);
                                        imageButton3.setBackgroundTintList(list);
                                        imageButton3.setImageTintList(list2);
                                    }
                                    if (gjn3.a == j.o) {
                                        j.e(imageButton3);
                                    }
                                    else {
                                        j.f(imageButton3);
                                    }
                                    if (n3 != j.k.d.size() - 1 && n3 != j.k.d.size() - 4) {
                                        final int n4 = n3 + 1;
                                        if (n4 < j.k.d.size()) {
                                            ct.e(frameLayout3.getId(), 7, ((FrameLayout)j.d.get(n4)).getId(), 6, 0);
                                        }
                                    }
                                    else {
                                        ct.e(frameLayout3.getId(), 7, 0, 7, j.getResources().getDimensionPixelSize(2131166101));
                                    }
                                    if (n3 >= j.k.d.size() - 3) {
                                        ct.e(frameLayout3.getId(), 3, 0, 3, j.getResources().getDimensionPixelSize(2131166102));
                                    }
                                    else {
                                        ct.e(frameLayout3.getId(), 4, 0, 4, j.getResources().getDimensionPixelSize(2131166102));
                                        ct.e(frameLayout3.getId(), 3, j.d.get(n3 + 3).getId(), 4, 0);
                                    }
                                    j.addView((View)frameLayout3);
                                }
                            }
                            ct.b(j);
                            final LinearLayout m = l.i;
                            if (m != null) {
                                m.addView((View)j);
                                if (gjm.a == gjo.C) {
                                    l.j = j;
                                }
                            }
                            l.h.put(gjm.a, j);
                            monitorexit(l);
                            if (gjo.i.equals(gjm.a) && (gjp.r.equals(b2) || gjp.s.equals(b2))) {
                                au.w(au.e());
                            }
                            return;
                        }
                    }
                    final gjn gjn = null;
                    continue;
                }
            }
        }
        a.k(gjj.a.c(), "Property value %s is not associated with a MenuOption.", klv.aQ(), '\u0732');
    }
    
    public final void e(final gjq gjq) {
        this.aU.n(gjq);
    }
    
    public final void f() {
        if (this.aU.y()) {
            this.aU.r();
        }
    }
    
    public final void g() {
        this.aU.s();
        if (!this.bf.g()) {
            nov.A(this.C() ^ true);
            return;
        }
        final flj flj = (flj)this.bf.c();
        throw null;
    }
    
    @Deprecated
    public final void h() {
        if (this.C()) {
            return;
        }
        this.H();
    }
    
    public final void i() {
        if (!this.I()) {
            this.aU.c.c();
            this.h.b();
        }
        this.H();
    }
    
    public final void j() {
        this.g();
        if (this.I()) {
            final OptionsMenuContainer au = this.aU;
            au.c.d();
            final ArrayList k = au.k;
            for (int size = k.size(), i = 0; i < size; ++i) {
                ((gjq)k.get(i)).b();
            }
            this.h.d();
        }
    }
    
    public final void k(final klv klv, final nlf nlf, final gjm gjm) {
        final gjr gjr = this.aS.d.get(gjm);
        this.aS.d.put(gjm, new gjc(this, nlf, klv, gjm));
        if (gjr != null) {
            return;
        }
        this.bg.c(klv.a(new gix(this, nlf, klv, gjm), this.c));
        if (this.bd != null && this.bj.contains(gjm.a)) {
            this.aS.f.put(gjm, new gjb(this));
        }
        if (gjm.a == gjo.o && this.e.k(cxg.f)) {
            final dix bk = this.bk;
            if (bk != null) {
                this.aS.f(gjm, new gjd(bk));
            }
        }
        if (gjm.a == gjo.u && this.bb.g()) {
            this.aS.f(gjm, new gje(this, 1));
        }
        if (gjm.a == gjo.i && this.e.k(cxw.p)) {
            this.aS.f(gjm, new gje(this));
        }
    }
    
    public final void l() {
        if (!this.aU.y() && this.aU.isEnabled() && this.aU.l().a() > 0) {
            this.aU.v();
        }
    }
    
    public final void m(final gjq gjq) {
        this.aU.k.remove(gjq);
    }
    
    public final void n(final boolean b) {
        if (this.aX.compareAndSet(false, true)) {
            this.c.execute(new gja(this, b));
        }
    }
    
    public final void o() {
        this.N.d();
        this.t();
    }
    
    public final void p() {
        if (this.e.k(cxs.W) && this.b.aQ() == jbm.h) {
            this.aS.c(gjo.d, gjp.m);
            this.aS.c(gjo.e, gjp.m);
        }
    }
    
    public final void q(final boolean bi) {
        if (this.bi != bi) {
            this.bi = bi;
            this.v();
        }
    }
    
    public final void r(final fxu fxu) {
        final lfu l = fxu.l();
        final lfu a = lfu.a;
        final boolean b = false;
        this.ar = (l == a);
        this.bh = (fxu.G() || this.ar || b);
        this.aq = fxu.C();
        this.n(true);
    }
    
    public final void s() {
        final gjm ag = this.ag;
        if (ag != null) {
            this.aS.e(ag.a, true);
            final nns d = this.ag.d;
            final int size = d.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                final gjp a = d.get(i).a;
                if (!this.ay.contains(a)) {
                    this.aS.c(this.ag.a, a);
                }
            }
            if (this.e.k(cwv.D) && this.ag.a == gjo.k) {
                final gjm ag2 = this.ag;
                final gjp a2 = gjp.A;
                final nns d2 = ag2.d;
                for (int size2 = d2.size(), j = n; j < size2; ++j) {
                    if (((gjn)d2.get(j)).a.equals(a2)) {
                        if ((float)this.I.aQ() < 1.0f) {
                            this.aS.c(gjo.k, gjp.A);
                            return;
                        }
                        final OptionsMenuView as = this.aS;
                        final gjo k = gjo.k;
                        final gjp a3 = gjp.A;
                        synchronized (as) {
                            if (as.h.get(k) != null) {
                                final gkk gkk = as.h.get(k);
                                final ImageButton imageButton = gkk.e.get(a3);
                                imageButton.getClass();
                                if (imageButton != gkk.e.get(gkk.o)) {
                                    imageButton.setEnabled(true);
                                    imageButton.setImageAlpha(255);
                                }
                            }
                            return;
                        }
                    }
                }
            }
        }
    }
    
    public final void t() {
        if (!(boolean)this.N.b().aQ()) {
            this.aS.b(gjo.v);
            return;
        }
        this.aS.d(gjo.v);
    }
    
    public final void u() {
        if (this.aq && this.b.aQ() == jbm.m) {
            if ((float)this.I.aQ() < 1.0f) {
                this.aS.b(gjo.q);
                return;
            }
            this.aS.d(gjo.q);
        }
    }
    
    public final void v() {
        boolean b;
        if (this.ar) {
            b = ((String)((kkz)this.q).d).equals("on");
        }
        else {
            b = ((String)((kkz)this.p).d).equals("on");
        }
        if ((!b || !(boolean)((kkz)this.f.a()).d) && !ggz.a.equals(this.m.aQ()) && !(boolean)this.H.aQ() && !this.bi && !(boolean)this.N.a().aQ()) {
            this.aS.d(gjo.i);
            return;
        }
        this.aS.b(gjo.i);
    }
    
    public final void w() {
        if (!(boolean)((kkz)this.am).d && !(boolean)this.N.a().aQ()) {
            this.aS.d(gjo.c);
            return;
        }
        this.aS.b(gjo.c);
    }
    
    public final boolean y() {
        final jbm jbm = (jbm)this.b.aQ();
        final boolean bh = this.bh;
        boolean b = false;
        if (bh) {
            if (jbm != jbm.b && jbm != jbm.h) {
                if (jbm == jbm.g) {
                    return true;
                }
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean z() {
        return this.bf.g();
    }
}
