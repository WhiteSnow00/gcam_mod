import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbj implements nar
{
    public final mza a;
    public final mws b;
    public final naq c;
    public final mys d;
    public final nbp e;
    public final mwb f;
    public final lmy g;
    public final mwm h;
    public final mwu i;
    
    public nbj(final mza a, final mws b, final naq c, final mys d, final nbp e, final mwu i, final mwb f, final lmy g, final mwm h) {
        a.getClass();
        b.getClass();
        c.getClass();
        d.getClass();
        e.getClass();
        i.getClass();
        f.getClass();
        g.getClass();
        h.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final oxk a(final myz myz, final myd myd) {
        myd.getClass();
        final myc a = myd.a;
        while (true) {
            for (final Object next : myd.b) {
                final mxe mxe = (mxe)next;
                if (mxe.b != muu.c) {
                    if (mxe.h.d == mus.c && nbk.b.contains(mxe.h.e)) {
                        if (mxe.h.e != mvt.g || mxe.f != null) {
                            continue;
                        }
                    }
                    final mxe mxe2 = (mxe)next;
                    String s;
                    if (a.c() == null) {
                        s = "Requested upload with no partition locator";
                    }
                    else if (a.r.d != mus.c) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Resource airlock state invalid ");
                        sb.append(a.r.d);
                        s = sb.toString();
                    }
                    else if (!nbk.a.contains(a.r.e)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Resource upload state invalid ");
                        sb2.append(a.r.e);
                        s = sb2.toString();
                    }
                    else {
                        if (mxe2 == null) {
                            final mza a2 = this.a;
                            myd.getClass();
                            a2.getClass();
                            final myc a3 = myd.a;
                            final List b = myd.b;
                            final ArrayList list = new ArrayList();
                            for (final Object next2 : b) {
                                if (((mxe)next2).b == muu.a) {
                                    list.add(next2);
                                }
                            }
                            final List b2 = myd.b;
                            final ArrayList list2 = new ArrayList();
                            for (final Object next3 : b2) {
                                if (((mxe)next3).b == muu.b) {
                                    list2.add(next3);
                                }
                            }
                            final List b3 = myd.b;
                            final ArrayList list3 = new ArrayList();
                            for (final Object next4 : b3) {
                                if (((mxe)next4).b == muu.c) {
                                    list3.add(next4);
                                }
                            }
                            final List b4 = myd.b;
                            final ArrayList list4 = new ArrayList(pjf.o(b4));
                            final Iterator iterator5 = b4.iterator();
                            while (iterator5.hasNext()) {
                                list4.add((Object)((mxe)iterator5.next()).i);
                            }
                            final oxk oxk = oxk.j(new nbu(myz, a3, list, list2, list3, list4, a2));
                            return oxk.h(new nbd(this, 1)).h(new nbd(this)).h(new nbd(this, 2)).h(new nbd(this, 3)).k(mwh.h).h(new nbe(this, myz));
                        }
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Annotachment state invalid ");
                        sb3.append(mxe2.h);
                        s = sb3.toString();
                    }
                    final oxk oxk = this.b.d(myz, myd, mwi.p).h(new nas(s, this, myz, a, mxe2));
                    return oxk.h(new nbd(this, 1)).h(new nbd(this)).h(new nbd(this, 2)).h(new nbd(this, 3)).k(mwh.h).h(new nbe(this, myz));
                }
            }
            Object next = null;
            continue;
        }
    }
    
    public final owt b(final nbu nbu) {
        return this.b.d(nbu.a, new myd(nbu.b, pjf.i(nbu.c, nbu.d)), mwi.s).e();
    }
}
