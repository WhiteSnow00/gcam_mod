import java.io.IOException;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class okt extends ojf implements omk
{
    public final oky a;
    public oky b;
    public boolean c;
    
    public okt() {
        final byu c = byu.c;
        throw null;
    }
    
    public okt(final oky a) {
        this.a = a;
        this.b = (oky)a.H(4);
        this.c = false;
    }
    
    private static final void ao(final oky oky, final oky oky2) {
        omr.a.b(oky).g(oky, oky2);
    }
    
    public final void A(final oog b) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final ooh ooh = (ooh)this.b;
        final ooh c = ooh.c;
        b.getClass();
        ooh.b = b;
        ooh.a = 3;
    }
    
    public final void B(final long n) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final ooj ooj = (ooj)this.b;
        final ooj m = ooj.m;
        ooj.i();
        ooj.k.d(n);
    }
    
    public final void C(final Iterable iterable) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final pre pre = (pre)this.b;
        final pre e = pre.e;
        final olj b = pre.b;
        if (!b.c()) {
            pre.b = oky.C(b);
        }
        ojf.e(iterable, pre.b);
    }
    
    public final void D(final Iterable iterable) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final pre pre = (pre)this.b;
        final pre e = pre.e;
        final olj c = pre.c;
        if (!c.c()) {
            pre.c = oky.C(c);
        }
        ojf.e(iterable, pre.c);
    }
    
    public final pri E(final int n) {
        return ((prj)this.b).g.get(n);
    }
    
    public final pri F(final int n) {
        return ((prj)this.b).h.get(n);
    }
    
    public final pri G(final int n) {
        return ((prj)this.b).i.get(n);
    }
    
    public final pri H(final int n) {
        return ((prj)this.b).j.get(n);
    }
    
    public final pri I(final int n) {
        return ((prj)this.b).k.get(n);
    }
    
    public final pri J(final int n) {
        return ((prj)this.b).l.get(n);
    }
    
    public final pri K(final int n) {
        return ((prj)this.b).n.get(n);
    }
    
    public final void L(final Iterable iterable) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        prj.N();
        ojf.e(iterable, prj.l);
    }
    
    public final void M(final Iterable iterable) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        prj.O();
        ojf.e(iterable, prj.n);
    }
    
    public final void N(final Iterable iterable) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        final olj q = prj.q;
        if (!q.c()) {
            prj.q = oky.C(q);
        }
        ojf.e(iterable, prj.q);
    }
    
    public final void O(final Iterable iterable) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        final olj p = prj.p;
        if (!p.c()) {
            prj.p = oky.C(p);
        }
        ojf.e(iterable, prj.p);
    }
    
    public final void P(final Iterable iterable) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        prj.M();
        ojf.e(iterable, prj.k);
    }
    
    public final void Q(final Iterable iterable) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        prj.L();
        ojf.e(iterable, prj.j);
    }
    
    public final void R(final Iterable iterable) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        prj.i();
        ojf.e(iterable, prj.g);
    }
    
    public final void S(final Iterable iterable) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        prj.j();
        ojf.e(iterable, prj.h);
    }
    
    public final void T(final Iterable iterable) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        prj.K();
        ojf.e(iterable, prj.i);
    }
    
    public final void U(final long ai) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        prj.b |= 0x10000;
        prj.ai = ai;
    }
    
    public final void V(final long am) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        prj.b |= 0x100000;
        prj.am = am;
    }
    
    public final void W(final int n, final pri pri) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        pri.getClass();
        prj.N();
        prj.l.set(n, pri);
    }
    
    public final void X(final pri aj) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        prj.aj = aj;
        prj.b |= 0x20000;
    }
    
    public final void Y(final int n, final pri pri) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        pri.getClass();
        prj.O();
        prj.n.set(n, pri);
    }
    
    public final void Z(final int n, final pri pri) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        pri.getClass();
        prj.M();
        prj.k.set(n, pri);
    }
    
    public final void aa(final long al) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        prj.b |= 0x80000;
        prj.al = al;
    }
    
    public final void ab(final long ak) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        prj.b |= 0x40000;
        prj.ak = ak;
    }
    
    public final void ac(final int n, final pri pri) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        pri.getClass();
        prj.L();
        prj.j.set(n, pri);
    }
    
    public final void ad(final int n, final pri pri) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        pri.getClass();
        prj.i();
        prj.g.set(n, pri);
    }
    
    public final void ae(final int n, final pri pri) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        pri.getClass();
        prj.j();
        prj.h.set(n, pri);
    }
    
    public final void af(final int n, final pri pri) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final prj prj = (prj)this.b;
        final prj an = prj.an;
        pri.getClass();
        prj.K();
        prj.i.set(n, pri);
    }
    
    public final void ag(final int n) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final psk psk = (psk)this.b;
        final psk c = psk.c;
        final olf b = psk.b;
        if (!b.c()) {
            psk.b = oky.y(b);
        }
        psk.b.g(n);
    }
    
    public final void ah(final int n) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final psk psk = (psk)this.b;
        final psk c = psk.c;
        final olf a = psk.a;
        if (!a.c()) {
            psk.a = oky.y(a);
        }
        psk.a.g(n);
    }
    
    public final void ai(final ojw ojw) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final pst pst = (pst)this.b;
        final pst b = pst.b;
        ojw.getClass();
        final olj a = pst.a;
        if (!a.c()) {
            pst.a = oky.C(a);
        }
        pst.a.add(ojw);
    }
    
    public final void aj(final String s, final psv psv) {
        psv.getClass();
        if (this.c) {
            this.m();
            this.c = false;
        }
        final psx psx = (psx)this.b;
        final psx b = psx.b;
        final ome a = psx.a;
        if (!a.b) {
            psx.a = a.a();
        }
        psx.a.put(s, psv);
    }
    
    public final void ak(final long n) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final psz psz = (psz)this.b;
        final psz b = psz.b;
        final oli a = psz.a;
        if (!a.c()) {
            psz.a = oky.A(a);
        }
        psz.a.d(n);
    }
    
    public final void al(final Map map) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final ptb ptb = (ptb)this.b;
        final ptb e = ptb.e;
        final ome c = ptb.c;
        if (!c.b) {
            ptb.c = c.a();
        }
        ptb.c.putAll(map);
    }
    
    public final void am(final okt okt) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final mqp mqp = (mqp)this.b;
        final mqq mqq = (mqq)okt.h();
        final mqp h = mqp.h;
        mqq.getClass();
        mqp.b();
        mqp.g.add(mqq);
    }
    
    public final void an(final okt okt) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final ooy ooy = (ooy)this.b;
        final oox oox = (oox)okt.h();
        final ooy e = ooy.e;
        oox.getClass();
        final olj d = ooy.d;
        if (!d.c()) {
            ooy.d = oky.C(d);
        }
        ooy.d.add(oox);
    }
    
    public final okt g() {
        final okt okt = (okt)this.a.H(5);
        okt.o(this.i());
        return okt;
    }
    
    public final oky h() {
        final oky i = this.i();
        if (i.n()) {
            return i;
        }
        throw new onj();
    }
    
    public oky i() {
        if (this.c) {
            return this.b;
        }
        final oky b = this.b;
        omr.a.b(b).f(b);
        this.c = true;
        return this.b;
    }
    
    public void m() {
        final oky b = (oky)this.b.H(4);
        ao(b, this.b);
        this.b = b;
    }
    
    @Override
    public final boolean n() {
        throw null;
    }
    
    public final void o(final oky oky) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        ao(this.b, oky);
    }
    
    public final void p(final byte[] array, final int n, final okm okm) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        try {
            omr.a.b(this.b).i(this.b, array, 0, n, new ojl(okm));
        }
        catch (final IOException ex) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", ex);
        }
        catch (final IndexOutOfBoundsException ex2) {
            throw olm.i();
        }
        catch (final olm olm) {
            throw olm;
        }
    }
    
    public final void q(final String s) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final mor mor = (mor)this.b;
        final mor d = mor.d;
        s.getClass();
        final olj b = mor.b;
        if (!b.c()) {
            mor.b = oky.C(b);
        }
        mor.b.add(s);
    }
    
    public final void r(final String s, final mor mor) {
        s.getClass();
        mor.getClass();
        if (this.c) {
            this.m();
            this.c = false;
        }
        final mov mov = (mov)this.b;
        final mov b = mov.b;
        mov.b().put(s, mor);
    }
    
    public final void s(final float n) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final nyw nyw = (nyw)this.b;
        final nyw i = nyw.i;
        final ole d = nyw.d;
        if (!d.c()) {
            nyw.d = oky.w(d);
        }
        nyw.d.g(n);
    }
    
    public final void t(final float n) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final nyw nyw = (nyw)this.b;
        final nyw i = nyw.i;
        final ole c = nyw.c;
        if (!c.c()) {
            nyw.c = oky.w(c);
        }
        nyw.c.g(n);
    }
    
    public final void u(final ood ood) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final ooe ooe = (ooe)this.b;
        final olg b = ooe.b;
        ood.getClass();
        final olf a = ooe.a;
        if (!a.c()) {
            ooe.a = oky.y(a);
        }
        ooe.a.g(ood.v);
    }
    
    public final void v(final oog oog) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final ooe ooe = (ooe)this.b;
        final olg b = ooe.b;
        oog.getClass();
        final olj c = ooe.c;
        if (!c.c()) {
            ooe.c = oky.C(c);
        }
        ooe.c.add(oog);
    }
    
    public final void w(final ooe ooe) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final oog oog = (oog)this.b;
        final olg b = oog.b;
        ooe.getClass();
        final olj c = oog.c;
        if (!c.c()) {
            oog.c = oky.C(c);
        }
        oog.c.add(ooe);
    }
    
    public final void x(final ood ood) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final oog oog = (oog)this.b;
        final olg b = oog.b;
        ood.getClass();
        final olf a = oog.a;
        if (!a.c()) {
            oog.a = oky.y(a);
        }
        oog.a.g(ood.v);
    }
    
    public final void y(final ooe b) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final ooh ooh = (ooh)this.b;
        final ooh c = ooh.c;
        b.getClass();
        ooh.b = b;
        ooh.a = 2;
    }
    
    public final void z(final ood ood) {
        if (this.c) {
            this.m();
            this.c = false;
        }
        final ooh ooh = (ooh)this.b;
        final ooh c = ooh.c;
        ooh.b = ood.v;
        ooh.a = 1;
    }
}
