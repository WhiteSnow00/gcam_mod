import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

@pka(b = "com.google.android.libraries.camera.camerapipe.CameraPipeCameraHardwareManager$allCameraIds$1", c = "CameraPipeCameraHardwareManager.kt", d = "invokeSuspend", e = { 110, 119 })
final class kqh extends pke implements plc
{
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ kqi e;
    private /* synthetic */ Object g;
    
    public kqh(final kqi e, final pjl pjl) {
        this.e = e;
        super(pjl);
    }
    
    @Override
    public final Object a(final Object o, final Object o2) {
        return ((kqh)this.c(o, (pjl)o2)).b(piu.a);
    }
    
    public final Object b(Object c) {
        final pjs a = pjs.a;
        while (true) {
            Object b = null;
            kqh kqh = null;
            Label_0388: {
                List f = null;
                pmn pmn2 = null;
                Label_0203: {
                    final Object a2;
                    final pmn g;
                    switch (this.d) {
                        default: {
                            final Object c2 = this.c;
                            b = this.b;
                            a2 = this.a;
                            g = (pmn)this.g;
                            pip.b(c);
                            kqh = this;
                            c = c2;
                            break;
                        }
                        case 1: {
                            f = (List)this.a;
                            final pmn pmn = (pmn)this.g;
                            pip.b(c);
                            pmn2 = pmn;
                            break Label_0203;
                        }
                        case 0: {
                            pip.b(c);
                            final pmn g2 = (pmn)this.g;
                            f = this.e.f();
                            this.g = g2;
                            this.a = f;
                            this.d = 1;
                            if (f instanceof Collection && f.isEmpty()) {
                                c = piu.a;
                            }
                            else if ((c = g2.b(f.iterator(), this)) != pjs.a) {
                                c = piu.a;
                            }
                            if (c != a) {
                                pmn2 = g2;
                                break Label_0203;
                            }
                            return a;
                        }
                    }
                    while (((Iterator)c).hasNext()) {
                        final String a3 = ((Iterator<xh>)c).next().a;
                        if (!((Set)a2).contains(a3)) {
                            ((Set)a2).add(a3);
                            final lfj b2 = lfj.b(a3);
                            kqh.g = g;
                            kqh.a = a2;
                            kqh.b = b;
                            kqh.c = c;
                            kqh.d = 2;
                            if (g.a(b2, kqh) != a) {
                                continue;
                            }
                            return a;
                        }
                    }
                    break Label_0388;
                }
                final ArrayList list = new ArrayList(pjf.o(f));
                final Iterator iterator = f.iterator();
                while (iterator.hasNext()) {
                    list.add((Object)((lfj)iterator.next()).a);
                }
                Object a2 = new LinkedHashSet(list);
                b = f.iterator();
                kqh = this;
                pmn g = pmn2;
            }
            if (((Iterator)b).hasNext()) {
                c = kqh.e.a.a(kqm.a((lfj)((Iterator)b).next())).b().iterator();
                continue;
            }
            break;
        }
        return piu.a;
    }
    
    @Override
    public final pjl c(final Object g, final pjl pjl) {
        pjl.getClass();
        final kqh kqh = new kqh(this.e, pjl);
        kqh.g = g;
        return kqh;
    }
}
