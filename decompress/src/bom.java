import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bom implements boi
{
    public final Set a;
    public final kjk b;
    private klj c;
    private klj d;
    private klj e;
    private klj f;
    private boolean g;
    private final nir h;
    
    public bom(final Set a, final kjk b) {
        this.h = new bol();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a() {
        return (int)this.c.aQ();
    }
    
    @Override
    public final void b() {
        this.g = false;
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((bov)iterator.next()).c();
        }
    }
    
    @Override
    public final void c() {
        this.g = true;
    }
    
    @Override
    public final void d(final lfj lfj) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((bov)iterator.next()).d(lfj);
        }
    }
    
    @Override
    public final void e(final csd csd) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((bov)iterator.next()).e(csd.a);
        }
    }
    
    @Override
    public final void f(final gyb gyb) {
        if (this.g) {
            if (!(boolean)this.f.aQ()) {
                gyb.a.close();
                return;
            }
            final lgb lgb = new lgb(gyb.a, this.a.size());
            for (final bov bov : this.a) {
                if ((boolean)bov.b().a().aQ() && bov instanceof bos) {
                    gyb.c(new lgc(lgb), gyb);
                    ((bos)bov).a();
                }
                else {
                    lgb.l();
                }
            }
        }
    }
    
    @Override
    public final void g(final gyb gyb) {
        if (this.g && this.i()) {
            final lgb lgb = new lgb(gyb.a, this.a.size());
            for (final bov bov : this.a) {
                if ((boolean)bov.b().a().aQ() && bov instanceof bou) {
                    ((bou)bov).a(gyb.c(new lgc(lgb), gyb));
                }
                else {
                    lgb.l();
                }
            }
            return;
        }
        gyb.a.close();
    }
    
    @Override
    public final void h(final ljm ljm) {
        if (this.g) {
            if (!(boolean)this.e.aQ()) {
                return;
            }
            for (final bov bov : this.a) {
                if ((boolean)bov.b().a().aQ() && bov instanceof bot) {
                    ((bot)bov).a(ljm);
                }
            }
        }
    }
    
    @Override
    public final boolean i() {
        return (boolean)this.d.aQ();
    }
    
    @Override
    public final void j(final bpa bpa) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((bov)iterator.next()).f(bpa);
        }
    }
    
    public final void k() {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        final ArrayList list4 = new ArrayList();
        final Boolean value = false;
        list2.add(klq.g(value));
        list3.add(klq.g(value));
        list4.add(klq.g(value));
        for (final bov bov : this.a) {
            final bor b = bov.b();
            if (bov instanceof bou) {
                list2.add(b.a());
                if (!(boolean)b.a().aQ()) {
                    continue;
                }
                list.add(b.b());
            }
            else if (bov instanceof bot) {
                list3.add(b.a());
                if (!(boolean)b.a().aQ()) {
                    continue;
                }
                list.add(b.b());
            }
            else {
                if (!(bov instanceof bos)) {
                    continue;
                }
                list4.add(b.a());
            }
        }
        this.c = klq.j(klq.a(list), this.h);
        this.d = klq.h(list2);
        this.e = klq.h(list3);
        this.f = klq.h(list4);
        final klj c = this.c;
        c.getClass();
        nvb.g(new boj(c));
        final klj d = this.d;
        d.getClass();
        nvb.g(new boj(d, 1));
        final klj e = this.e;
        e.getClass();
        nvb.g(new boj(e, 1));
        final klj f = this.f;
        f.getClass();
        nvb.g(new boj(f, 1));
    }
}
