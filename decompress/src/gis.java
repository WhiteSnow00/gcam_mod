import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gis
{
    public static final nnx a;
    public final gjm b;
    public final gjm c;
    public final gjm d;
    public final gjm e;
    public final gjm f;
    public final gjm g;
    public final gjm h;
    public final gjm i;
    public final gjm j;
    public final gjm k;
    public final gjm l;
    public final gjm m;
    public final gjm n;
    public final gjm o;
    public final gjm p;
    public final gjm q;
    public final gjm r;
    public final gjm s;
    private final cxl t;
    private final niz u;
    
    static {
        a = nnx.r(gjp.x, new gjn(gjp.x, 2131231446, 2131952026, 2131952027), gjp.y, new gjn(gjp.y, 2131231292, 2131952020, 2131952021), gjp.z, new gjn(gjp.z, 2131231435, 2131952022, 2131952023), gjp.A, new gjn(gjp.A, 2131231437, 2131952024, 2131952025));
    }
    
    public gis(final cxl t, final niz u) {
        this.t = t;
        this.u = u;
        this.b = gjm.a(gjo.b, 2131952079, 2131952089, nns.o(new gjn(gjp.h, 2131231253, 2131952082, 2131952083), new gjn(gjp.f, 2131231255, 2131952084, 2131952085), new gjn(gjp.g, 2131231251, 2131952080, 2131952081)));
        this.c = gjm.a(gjo.c, 2131952568, 2131952569, nns.n(new gjn(gjp.Y, 2131231310, 2131952570, 2131952570), new gjn(gjp.X, 2131231312, 2131952571, 2131952571)));
        this.d = this.c(gjo.d);
        gjm e;
        if (t.j(cya.c)) {
            e = this.c(gjo.e);
        }
        else {
            final gjo e2 = gjo.e;
            int n;
            if (!t.k(cxs.W)) {
                n = 2131231261;
            }
            else {
                n = 2131231462;
            }
            final nnn nnn = new nnn();
            final boolean k = t.k(cxs.W);
            final gjp i = gjp.k;
            int n2;
            if (k) {
                n2 = 2131951805;
            }
            else {
                n2 = 2131952108;
            }
            nnn.g(new gjn(i, n, n2, 2131952107));
            int n3;
            int n4;
            if (k) {
                nnn.g(new gjn(gjp.m, 2131231209, 2131951803, 2131952011));
                n3 = 2131952297;
                n4 = 2131952298;
            }
            else {
                n3 = 2131952106;
                n4 = 2131952112;
            }
            int n5;
            if (!k) {
                n5 = 2131952111;
            }
            else {
                n5 = 2131952109;
            }
            nnn.g(new gjn(gjp.j, 2131231262, n5, 2131952110));
            e = gjm.a(e2, n3, n4, nnn.f());
        }
        this.e = e;
        this.f = this.d(gjo.f);
        this.g = e(gjo.g);
        gjm h;
        if (t.j(cya.c)) {
            h = e(gjo.h);
        }
        else {
            h = this.d(gjo.h);
        }
        this.h = h;
        this.i = gjm.a(gjo.i, 2131952250, 2131952243, nns.o(new gjn(gjp.t, 2131231582, 2131952244, 2131952245), new gjn(gjp.s, 2131231499, 2131952241, 2131952242), new gjn(gjp.r, 2131231583, 2131952247, 2131952248)));
        this.j = gjm.a(gjo.o, 2131951993, 2131951994, nns.o(new gjn(gjp.F, 2131231237, 2131951996, 2131951995), new gjn(gjp.D, 2131231238, 2131951998, 2131951997), new gjn(gjp.E, 2131231239, 2131952000, 2131951999)));
        this.k = gjm.a(gjo.p, 2131952181, 2131952181, nns.p(new gjn(gjp.J, 2131231502, 2131952185, 2131952185), new gjn(gjp.G, 2131231502, 2131952182, 2131952182), new gjn(gjp.H, 2131231502, 2131952183, 2131952183), new gjn(gjp.I, 2131231502, 2131952184, 2131952184)));
        this.l = gjm.a(gjo.q, 2131951735, 2131951724, nns.o(new gjn(gjp.O, 2131231457, 2131951733, 2131951731), new gjn(gjp.Q, 2131231496, 2131951730, 2131951729), new gjn(gjp.R, 2131231510, 2131951726, 2131951725)));
        final nnn nnn2 = new nnn();
        nnn2.g(new gjn(gjp.O, 2131231457, 2131951733, 2131951731));
        nnn2.g(new gjn(gjp.Q, 2131231510, 2131951730, 2131951729));
        nnn2.g(new gjn(gjp.R, 2131231487, 2131951726, 2131951725));
        if (t.k(cxk.e)) {
            nnn2.g(new gjn(gjp.S, 2131231487, 2131951728, 2131951727));
        }
        this.m = gjm.a(gjo.q, 2131951735, 2131951724, nnn2.f());
        this.n = gjm.a(gjo.s, 2131952116, 2131952116, nns.n(new gjn(gjp.U, 2131231494, 2131952117, 2131952118), new gjn(gjp.T, 2131231495, 2131952119, 2131952120)));
        this.o = gjm.a(gjo.C, 2131951742, 2131951742, nns.n(new gjn(gjp.V, 2131231308, 2131952642, 2131952643), new gjn(gjp.W, 2131231309, 2131952018, 2131952019)));
        this.p = gjm.a(gjo.B, 2131952421, 2131952422, nns.q(new gjn(gjp.ad, 2131231586, 2131952375, 2131952377), new gjn(gjp.Z, 2131231505, 2131952381, 2131952382), new gjn(gjp.aa, 2131231507, 2131952384, 2131952385), new gjn(gjp.ab, 2131231509, 2131952386, 2131952387), new gjn(gjp.ac, 2131231503, 2131952379, 2131952380)));
        this.q = gjm.a(gjo.u, 2131951745, 2131951751, nns.n(new gjn(gjp.L, 2131231442, 2131951750, 2131951749), new gjn(gjp.K, 2131231441, 2131951744, 2131951743)));
        gjm a;
        if (u.g()) {
            a = gjm.a(gjo.v, ((hyn)u.c()).e(), ((hyn)u.c()).d(), nns.n(new gjn(gjp.N, ((hyn)u.c()).b(), ((hyn)u.c()).g(), ((hyn)u.c()).f()), new gjn(gjp.M, ((hyn)u.c()).c(), ((hyn)u.c()).i(), ((hyn)u.c()).h())));
        }
        else {
            a = null;
        }
        this.r = a;
        this.s = gjm.a(gjo.t, 2131952788, 2131952791, nns.n(new gjn(gjp.B, 2131231241, 2131952792, 2131952793), new gjn(gjp.C, 2131231185, 2131952789, 2131952790)));
    }
    
    private final gjm c(final gjo gjo) {
        int n;
        if (!this.t.k(cxs.W)) {
            n = 2131231473;
        }
        else {
            n = 2131231462;
        }
        final nnn nnn = new nnn();
        final boolean k = this.t.k(cxs.W);
        final gjp i = gjp.k;
        int n2;
        if (k) {
            n2 = 2131951805;
        }
        else {
            n2 = 2131951804;
        }
        nnn.g(new gjn(i, n, n2, 2131952013));
        int n3;
        int n4;
        if (!k) {
            nnn.g(new gjn(gjp.l, 2131231472, 2131951802, 2131952008));
            n3 = 2131952010;
            n4 = 2131952016;
        }
        else {
            nnn.g(new gjn(gjp.m, 2131231209, 2131951803, 2131952011));
            n3 = 2131952297;
            n4 = 2131952298;
        }
        int n5;
        if (!k) {
            n5 = 2131951806;
        }
        else {
            n5 = 2131951807;
        }
        nnn.g(new gjn(gjp.j, 2131231474, n5, 2131952015));
        return gjm.a(gjo, n3, n4, nnn.f());
    }
    
    private final gjm d(final gjo gjo) {
        if (this.t.j(cya.c)) {
            return gjm.a(gjo, 2131952106, 2131952112, nns.n(new gjn(gjp.q, 2131231261, 2131952108, 2131952107), new gjn(gjp.p, 2131231262, 2131952111, 2131952110)));
        }
        return gjm.a(gjo, 2131952106, 2131952112, nns.n(new gjn(gjp.q, 2131231261, 2131952108, 2131952107), new gjn(gjp.p, 2131231262, 2131952111, 2131952110)));
    }
    
    private static final gjm e(final gjo gjo) {
        return gjm.a(gjo, 2131952010, 2131952016, nns.n(new gjn(gjp.q, 2131231473, 2131951804, 2131952013), new gjn(gjp.p, 2131231474, 2131951806, 2131952015)));
    }
    
    public final gjm a(final boolean b) {
        final ArrayList list = new ArrayList();
        list.add(new gjn(gjp.b, 2131231546, 2131952732, 2131952733));
        if (b) {
            list.add(new gjn(gjp.e, 2131231651, 2131952729, 2131952730));
        }
        list.add(new gjn(gjp.c, 2131231544, 2131952726, 2131952728));
        list.add(new gjn(gjp.d, 2131231543, 2131952723, 2131952725));
        return gjm.a(gjo.a, 2131952731, 2131952734, nns.j(list));
    }
    
    public final gjm b() {
        final cxl t = this.t;
        final cxo a = cwv.a;
        t.e();
        return gjm.a(gjo.r, 2131951971, 2131951978, nns.n(new gjn(gjp.v, 2131231581, 2131951977, 2131951975), new gjn(gjp.u, 2131231579, 2131951974, 2131951972)));
    }
}
