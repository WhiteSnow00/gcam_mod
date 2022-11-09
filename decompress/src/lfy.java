import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.locks.LockSupport;
import java.util.ArrayList;
import android.hardware.camera2.CameraAccessException;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lfy implements lfo
{
    private final krr a;
    private final pnf b;
    private final lfn c;
    private final kse d;
    private final xq e;
    
    public lfy(final xq e, final lfn c, final kse d, final krr krr) {
        c.getClass();
        d.getClass();
        this.e = e;
        this.c = c;
        this.d = d;
        final krr a = krr.a("VerifiedCamLstPrdr");
        a.getClass();
        this.a = a;
        this.b = plv.g(null);
    }
    
    private final lfx c() {
        this.d.f("verifyCameras");
        try {
            final xq e = this.e;
            Object o = null;
            final xp xp = new xp(e, null);
            final Thread currentThread = Thread.currentThread();
            final pol a = ppg.b.a();
            Object b = new pni(pnv.c(a), currentThread, a);
            pqj.b(xp, b, (pjl)b);
            try {
                final pol a2 = ((pni)b).a;
                if (a2 != null) {
                    pol.r(a2);
                }
                try {
                    while (!Thread.interrupted()) {
                        final pol a3 = ((pni)b).a;
                        long j;
                        if (a3 != null) {
                            j = a3.j();
                        }
                        else {
                            j = Long.MAX_VALUE;
                        }
                        if (((ppb)b).D()) {
                            final pol a4 = ((pni)b).a;
                            if (a4 != null) {
                                pol.q(a4);
                            }
                            b = ppc.b(((ppb)b).v());
                            if (b instanceof pnq) {
                                o = b;
                            }
                            final pnq pnq = (pnq)o;
                            if (pnq != null) {
                                throw pnq.b;
                            }
                            final List list = (List)b;
                            if (list.isEmpty()) {
                                this.a.d("No cameras available!");
                                throw new lfq();
                            }
                            b = new LinkedHashSet();
                            final LinkedHashSet set = new LinkedHashSet();
                            final Iterator iterator = list.iterator();
                            while (iterator.hasNext()) {
                                final String a5 = ((xh)iterator.next()).a;
                                try {
                                    final Set b2 = this.e.a(a5).b();
                                    final Iterator iterator2 = b2.iterator();
                                    while (iterator2.hasNext()) {
                                        final String a6 = ((xh)iterator2.next()).a;
                                        if (((Set)b).contains(xh.a(a6))) {
                                            ((Set)b).add(xh.a(a5));
                                        }
                                        else {
                                            try {
                                                this.e.a(a6);
                                            }
                                            catch (final CameraAccessException ex) {
                                                final lfk a7 = lfl.a();
                                                a7.b(a6);
                                                a7.c(ex.getReason());
                                                set.add(a7.a());
                                                ((Set)b).add(xh.a(a5));
                                                ((Set)b).addAll(b2);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                catch (final CameraAccessException ex2) {
                                    final lfk a8 = lfl.a();
                                    a8.b(a5);
                                    a8.c(ex2.getReason());
                                    set.add(a8.a());
                                    ((Set)b).add(xh.a(a5));
                                    continue;
                                }
                                break;
                            }
                            if (!set.isEmpty()) {
                                this.c.as(pjf.j(set));
                            }
                            final List k = pjf.k(list);
                            k.removeAll((Collection)b);
                            if (!k.isEmpty()) {
                                b = new ArrayList(k.size());
                                final Iterator iterator3 = k.iterator();
                                while (iterator3.hasNext()) {
                                    ((Collection)b).add(lfj.b(((xh)iterator3.next()).a));
                                }
                                final lfx lfx = new lfx((List)b, pjf.j(set));
                                this.d.g();
                                return lfx;
                            }
                            this.a.b("No working cameras available!");
                            b = new lfm(pjf.j(set));
                            throw b;
                        }
                        else {
                            LockSupport.parkNanos(b, j);
                        }
                    }
                    final InterruptedException ex3 = new InterruptedException();
                    ((ppb)b).C(ex3);
                    throw ex3;
                }
                finally {
                    final pol a9 = ((pni)b).a;
                    if (a9 != null) {
                        pol.q(a9);
                    }
                }
            }
            finally {}
        }
        catch (final CameraAccessException ex4) {}
        finally {
            this.d.g();
            while (true) {}
        }
    }
    
    @Override
    public final List a() {
        final lfx c = this.c();
        final pnf b = this.b;
        final int a = png.a;
        b.a = c;
        return c.a;
    }
    
    @Override
    public final List b() {
        final lfx lfx = (lfx)this.b.a;
        if (lfx != null) {
            final List b = lfx.b;
            if (b != null) {
                return b;
            }
        }
        return pja.a;
    }
}
