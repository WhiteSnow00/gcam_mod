import java.util.Iterator;
import android.content.Context;
import android.view.OrientationEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class lis extends OrientationEventListener
{
    final /* synthetic */ lit a;
    
    public lis(final lit a, final Context context) {
        this.a = a;
        super(context);
    }
    
    public final void onOrientationChanged(final int u) {
        final lit a = this.a;
        if (u < 0) {
            return;
        }
        final Object c = a.c;
        monitorenter(c);
        try {
            final Iterator iterator = a.b.iterator();
            boolean b;
            while (true) {
                final boolean hasNext = iterator.hasNext();
                b = false;
                if (hasNext) {
                    final cpl cpl = (cpl)iterator.next();
                    synchronized (cpl.a.v) {
                        final cpr a2 = cpl.a;
                        if (a2.n == null || !a2.r.equals(cql.b)) {
                            continue;
                        }
                        if (!cpl.a.j.get()) {
                            continue;
                        }
                        final cpr a3 = cpl.a;
                        final int u2 = a3.u;
                        if (u2 == -1) {
                            a3.u = u;
                        }
                        else {
                            final int abs = Math.abs(u - u2);
                            if (abs > 60 && abs < 300) {
                                cpl.a.f();
                                final clq x = cpl.a.x;
                                if (x != null) {
                                    x.a(cql.a, false);
                                }
                                final cpr a4 = cpl.a;
                                a4.k(a4.q);
                            }
                            else {
                                final ihl y = cpl.a.y;
                                synchronized (y.d) {
                                    final ihn c2 = y.c;
                                    monitorexit(y.d);
                                    if (abs > 20 && abs < 340) {
                                        if (c2.equals(ihn.d)) {
                                            continue;
                                        }
                                        cpl.a.y.a(ihn.d);
                                        final cpr a5 = cpl.a;
                                        a5.k(a5.p);
                                    }
                                    else {
                                        if (c2.equals(ihn.c)) {
                                            continue;
                                        }
                                        cpl.a.y.a(ihn.c);
                                        cpl.a.b();
                                    }
                                }
                            }
                        }
                        continue;
                    }
                    break;
                }
                break;
            }
            if (u < 360) {
                b = true;
            }
            njo.d(b);
            final int abs2 = Math.abs(u - a.g.e);
            kra g;
            if (Math.min(abs2, 360 - abs2) >= 50) {
                g = kra.b((u + 45) / 90 * 90 % 360);
            }
            else {
                g = a.g;
            }
            if (g == a.g) {
                monitorexit(c);
                return;
            }
            a.g = g;
            final Iterator iterator2 = a.a.iterator();
            while (iterator2.hasNext()) {
                a.e.execute(new lir((liq)iterator2.next(), g));
            }
            monitorexit(c);
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
}
