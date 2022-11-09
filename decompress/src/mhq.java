import java.util.Set;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class mhq implements UncaughtExceptionHandler
{
    final /* synthetic */ mhr a;
    private final UncaughtExceptionHandler b;
    
    public mhq(final mhr a, final UncaughtExceptionHandler b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        try {
            while (true) {
                try {
                    final mhr a = this.a;
                    final String name = thread.getName();
                    String i = t.getClass().getName();
                    for (Throwable t2 = t.getCause(); t2 != null && t2 != t2.getCause(); t2 = t2.getCause()) {
                        i = t2.getClass().getName();
                    }
                    final okt g = a.g();
                    if (g.c) {
                        g.m();
                        g.c = false;
                    }
                    final psc psc = (psc)g.b;
                    final psc l = psc.l;
                    name.getClass();
                    psc.a |= 0x8;
                    psc.e = name;
                    final Class<? extends Throwable> class1 = t.getClass();
                    int n;
                    if (class1 == OutOfMemoryError.class) {
                        n = 3;
                    }
                    else if (NullPointerException.class.isAssignableFrom(class1)) {
                        n = 2;
                    }
                    else if (RuntimeException.class.isAssignableFrom(class1)) {
                        n = 4;
                    }
                    else if (Error.class.isAssignableFrom(class1)) {
                        n = 5;
                    }
                    else {
                        n = 1;
                    }
                    if (g.c) {
                        g.m();
                        g.c = false;
                    }
                    final psc psc2 = (psc)g.b;
                    psc2.f = n - 1;
                    final int a2 = psc2.a | 0x10;
                    psc2.a = a2;
                    i.getClass();
                    psc2.a = (a2 | 0x80);
                    psc2.i = i;
                    final okt m = ocd.d.m();
                    final okt a3 = oce.a(t);
                    if (m.c) {
                        m.m();
                        m.c = false;
                    }
                    final ocd ocd = (ocd)m.b;
                    final occ b = (occ)a3.h();
                    b.getClass();
                    ocd.b = b;
                    ocd.a |= 0x1;
                    for (Throwable cause = t; cause.getCause() != null; cause = cause.getCause()) {
                        final okt a4 = oce.a(cause.getCause());
                        if (m.c) {
                            m.m();
                            m.c = false;
                        }
                        final ocd ocd2 = (ocd)m.b;
                        final occ occ = (occ)a4.h();
                        occ.getClass();
                        ocd2.b();
                        ocd2.c.add(occ);
                    }
                    if (g.c) {
                        g.m();
                        g.c = false;
                    }
                    final psc psc3 = (psc)g.b;
                    final ocd j = (ocd)m.h();
                    j.getClass();
                    psc3.j = j;
                    psc3.a |= 0x100;
                    try {
                        final Long a5 = ofz.a(ofy.a(t));
                        if (a5 != null) {
                            final long longValue = a5;
                            if (g.c) {
                                g.m();
                                g.c = false;
                            }
                            final psc psc4 = (psc)g.b;
                            psc4.a |= 0x20;
                            psc4.g = longValue;
                        }
                        final StringBuilder sb = new StringBuilder();
                        mrm.g(t, sb, new HashSet(), null);
                        final Long a6 = ofz.a(sb.toString());
                        if (a6 != null) {
                            final long longValue2 = a6;
                            if (g.c) {
                                g.m();
                                g.c = false;
                            }
                            final psc psc5 = (psc)g.b;
                            psc5.a |= 0x40;
                            psc5.h = longValue2;
                        }
                    }
                    catch (final RuntimeException ex) {
                        a.m(mhr.a.c(), "Failed to generate hashed stack trace.", '\u0c21', ex);
                    }
                    a.e((psc)g.h());
                    final UncaughtExceptionHandler b2 = this.b;
                    if (b2 != null) {
                        b2.uncaughtException(thread, t);
                    }
                }
                finally {
                    final UncaughtExceptionHandler b3 = this.b;
                    Label_0817: {
                        if (b3 != null) {
                            b3.uncaughtException(thread, t);
                            break Label_0817;
                        }
                        break Label_0817;
                    }
                    while (true) {}
                    continue;
                }
                break;
            }
        }
        catch (final Exception ex2) {}
    }
}
