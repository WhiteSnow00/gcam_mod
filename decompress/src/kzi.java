import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzi implements kwh
{
    public final lag a;
    private final kxw b;
    private final kse c;
    
    public kzi(final kxw b, final kse c, final lag a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final kvq a() {
        return this.a.a();
    }
    
    @Override
    public final oey b(final kvr kvr) {
        return this.a.e(kvr, false);
    }
    
    @Override
    public final List c(final List kuw) {
        this.c.f("FrameServerSession#submit(burst)");
        final ArrayList list = new ArrayList(((List)kuw).size());
        final ArrayList list2 = new ArrayList(((List)kuw).size());
        this.c.f("allocate");
        for (final kyi kyi : kuw) {
            njo.d(kyi instanceof kyi);
            list.add(this.b.b(noi.F(kyi.c)));
        }
        try {
            try {
                this.c.h("await");
                final List list3 = ofi.j(list).get();
                try {
                    final int size = list3.size();
                    final int size2 = ((List)kuw).size();
                    int i = 0;
                    njo.o(size == size2);
                    this.c.h("build_results");
                    while (i < ((List)kuw).size()) {
                        final kyi kyi2 = (kyi)((List)kuw).get(i);
                        final Set set = (Set)list3.get(i);
                        final nnt m = nnx.m(set.size());
                        for (final kzp kzp : set) {
                            final kvs k = laz.k(kzp);
                            k.getClass();
                            m.d(kzp.c, k);
                        }
                        list2.add(new kzh(m.b()));
                        ++i;
                    }
                    this.c.h("submit");
                    this.a.h((List)kuw, list3);
                    this.c.g();
                    this.c.g();
                    return list2;
                }
                catch (final kuw kuw) {}
                catch (final ExecutionException kuw) {}
                catch (final InterruptedException kuw) {}
            }
            finally {
                this.c.g();
                this.c.g();
                while (true) {}
                Label_0595: {
                    throw new kuw(kuw);
                }
                oey oey = null;
                Label_0450: {
                    while (true) {
                        final List list3;
                        Iterator iterator3 = null;
                        Iterator iterator4 = null;
                        Iterator iterator5;
                        final Set set2;
                        Iterator iterator6 = null;
                        Iterator iterator7 = null;
                        Label_0409_Outer:Block_22_Outer:
                        while (true) {
                            while (true) {
                                Label_0569: {
                                Label_0507:
                                    while (true) {
                                    Block_19:
                                        while (true) {
                                            Block_21: {
                                            Label_0474:
                                                while (true) {
                                                    while (true) {
                                                        ((kzp)iterator3.next()).g();
                                                        break Label_0474;
                                                        iftrue(Label_0595:)(!iterator4.hasNext());
                                                        break Block_21;
                                                        iftrue(Label_0500:)(!iterator5.hasNext());
                                                        oey = (oey)iterator5.next();
                                                        iftrue(Label_0409:)(oey.cancel(true) && !oey.isDone());
                                                        break Label_0450;
                                                        iftrue(Label_0409:)(!iterator3.hasNext());
                                                        continue Label_0409_Outer;
                                                    }
                                                    iterator3 = set2.iterator();
                                                    continue Label_0474;
                                                }
                                                ((kzp)iterator6.next()).g();
                                                break Label_0569;
                                            }
                                            iterator6 = ((Set)iterator4.next()).iterator();
                                            break Label_0569;
                                            iftrue(Label_0531:)(!iterator7.hasNext());
                                            break Block_19;
                                            Label_0500:
                                            iterator7 = list2.iterator();
                                            continue Label_0507;
                                            iterator5 = list.iterator();
                                            continue Block_22_Outer;
                                        }
                                        ((kzh)iterator7.next()).close();
                                        continue Label_0507;
                                    }
                                }
                                iftrue(Label_0544:)(!iterator6.hasNext());
                                continue;
                            }
                            Label_0531:
                            iftrue(Label_0595:)(list3 == null);
                            iterator4 = list3.iterator();
                            continue Label_0409_Outer;
                        }
                        list3 = null;
                        continue;
                    }
                }
                final Set set2 = (Set)knf.d(oey);
                iftrue(Label_0409:)(set2 == null);
            }
        }
        catch (final kuw kuw2) {}
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex2) {}
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    @Override
    public final kzh d(final kyi kuw) {
        this.c.f("FrameServerSession#submit(single)");
        this.c.f("allocate");
        njo.d(kuw instanceof kyi);
        final oey b = this.b.b(((kyi)kuw).c);
        nnt m = null;
        try {
            Set<?> set;
            kvs k;
            kzh kzh;
            Iterator<?> iterator2;
            Set set2;
            Iterator iterator3;
            Block_23_Outer:Block_19_Outer:
            while (true) {
                try {
                    this.c.h("await");
                    set = b.get();
                    try {
                        m = nnx.m(set.size());
                        this.c.h("build_results");
                        for (final kzp kzp : set) {
                            k = laz.k(kzp);
                            k.getClass();
                            m.d(kzp.c, k);
                        }
                        kzh = new kzh(m.b());
                        try {
                            this.c.h("submit");
                            this.a.j((kyi)kuw, set);
                            this.c.g();
                            this.c.g();
                            return kzh;
                        }
                        catch (final kuw kuw) {}
                        catch (final ExecutionException kuw) {}
                        catch (final InterruptedException ex) {}
                        break Label_0249;
                    }
                    catch (final kuw kuw) {}
                    catch (final ExecutionException kuw) {}
                    catch (final InterruptedException ex2) {}
                    kzh = null;
                }
                finally {
                    this.c.g();
                    this.c.g();
                    while (true) {}
                    iftrue(Label_0317:)(b.cancel(true) && !b.isDone());
                Label_0291:
                    while (true) {
                        Label_0268: {
                            break Label_0268;
                        Block_21_Outer:
                            while (true) {
                                ((kzp)iterator2.next()).g();
                                Label_0338: {
                                    break Label_0338;
                                    iterator3 = set2.iterator();
                                    break Label_0291;
                                    while (true) {
                                        Block_22: {
                                            while (true) {
                                                iftrue(Label_0362:)(set == null);
                                                break Block_22;
                                                ((kzp)iterator3.next()).g();
                                                break Label_0291;
                                                kzh.close();
                                                continue Block_21_Outer;
                                            }
                                            Label_0362: {
                                                throw new kuw(kuw);
                                            }
                                            kzh = null;
                                            set = (Set<?>)m;
                                            continue Block_23_Outer;
                                        }
                                        iterator2 = set.iterator();
                                        break Label_0338;
                                        Label_0317: {
                                            iftrue(Label_0327:)(kzh == null);
                                        }
                                        continue;
                                    }
                                }
                                iftrue(Label_0362:)(!iterator2.hasNext());
                                continue Block_19_Outer;
                            }
                        }
                        set2 = (Set)knf.d(b);
                        iftrue(Label_0317:)(set2 == null);
                        continue;
                    }
                    iftrue(Label_0317:)(!iterator3.hasNext());
                }
                break;
            }
        }
        catch (final kuw kuw2) {}
        catch (final ExecutionException ex3) {}
        catch (final InterruptedException ex4) {}
    }
    
    @Override
    public final oey e(final kvr kvr) {
        return this.a.k(kvr);
    }
    
    @Override
    public final kyh f() {
        return this.a.b();
    }
}
