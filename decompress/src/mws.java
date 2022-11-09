import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mws
{
    public final mwb a;
    
    public mws(final mwb a) {
        a.getClass();
        this.a = a;
    }
    
    public final oxk a(final myz myz, final myc myc, final mxe mxe, final pky pky) {
        myz.getClass();
        myc.getClass();
        mxe.getClass();
        pky.getClass();
        return this.b(myz, myc, pjf.b(mxe), pky).k(mwh.c);
    }
    
    public final oxk b(final myz myz, final myc myc, final List list, final pky pky) {
        myz.getClass();
        myc.getClass();
        list.getClass();
        pky.getClass();
        final ArrayList list2 = new ArrayList(pjf.o(list));
        for (final mxe mxe : list) {
            list2.add(mxe.a(mxe, null, null, (mxk)pky.a(mxe.h), 767));
        }
        return this.a.c(myz, pjf.b(myc), list2).h(list2);
    }
    
    public final oxk c(final myz myz, myc d, final pky pky) {
        myz.getClass();
        d.getClass();
        pky.getClass();
        d = myc.d(d, null, null, (mxk)pky.a(d.r), 786431);
        return this.a.d(myz, d).h(d);
    }
    
    public final oxk d(final myz myz, final myd myd, final pky pky) {
        myz.getClass();
        myd.getClass();
        final myc a = myd.a;
        return oxk.l(this.c(myz, a, pky), this.b(myz, a, myd.b, pky), new mwn(mwp.a));
    }
    
    public final oxk e(final myz myz, List c, final pky pky, final pky pky2) {
        c.getClass();
        pky.getClass();
        final ArrayList list = new ArrayList(pjf.o(c));
        final Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            final myc a = ((myd)iterator.next()).a;
            list.add((Object)myc.d(a, null, null, (mxk)pky2.a(a.r), 786431));
        }
        c = plv.c(new pmw(new pmw(new pmi(pjf.m(c), mwi.e, pmu.a), new mwr(pky, 1), 1), new mwr(pky2)));
        return mvc.d(this.a.e(myz, list), new mwq(this, myz, list, c)).h(new pim(list, c));
    }
}
