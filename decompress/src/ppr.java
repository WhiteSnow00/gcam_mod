import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppr
{
    public static final pqe a;
    public static final pqe b;
    
    static {
        a = new pqe("UNDEFINED");
        b = new pqe("REUSABLE_CLAIMED");
    }
    
    public static final void a(pjl pjl, final Object o) {
        pjl.getClass();
        if (pjl instanceof ppq) {
            final ppq ppq = (ppq)pjl;
            pjl = (pjl)plv.e(o);
            if (ppq.e.i(ppq.d())) {
                ppq.b = pjl;
                ppq.a = 1;
                ppq.e.cj(ppq.d(), ppq);
                return;
            }
            final boolean a = pod.a;
            final pol a2 = ppg.b.a();
            if (a2.o()) {
                ppq.b = pjl;
                ppq.a = 1;
                a2.l(ppq);
                return;
            }
            a2.m(true);
            try {
                pjq d = ppq.d().b(pou.b);
                Label_0238: {
                    if (d != null && !((pou)d).r()) {
                        final CancellationException n = ((pou)d).n();
                        ppq.i(pjl);
                        ppq.e(pip.a(n));
                        break Label_0238;
                    }
                    pjl = ppq.f;
                    Object o2 = ppq.c;
                    d = pjl.d();
                    o2 = pqh.b(d, o2);
                    if (o2 != pqh.a) {
                        pjl = pnv.b(pjl, d, o2);
                    }
                    else {
                        pjl = null;
                    }
                    try {
                        ppq.f.e(o);
                        if (pjl == null || ((ppj)pjl).G()) {
                            pqh.c(d, o2);
                        }
                        while (a2.p()) {}
                        a2.k(true);
                        return;
                    }
                    finally {
                        if (pjl == null || ((ppj)pjl).G()) {
                            pqh.c(d, o2);
                        }
                    }
                }
            }
            finally {
                try {
                    final Throwable t;
                    ppq.j(t, null);
                }
                finally {
                    a2.k(true);
                }
            }
        }
        pjl.e(o);
    }
}
