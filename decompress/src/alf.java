import java.util.Iterator;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alf implements ali
{
    public final ale a;
    public final Object b;
    private final alj[] c;
    
    static {
        aiy.b("WorkConstraintsTracker");
    }
    
    public alf(Context applicationContext, final apa apa, final ale a) {
        applicationContext = applicationContext.getApplicationContext();
        this.a = a;
        this.c = new alj[] { new alg(applicationContext, apa), new alh(applicationContext, apa), new alo(applicationContext, apa), new alk(applicationContext, apa), new aln(applicationContext, apa), new alm(applicationContext, apa), new all(applicationContext, apa) };
        this.b = new Object();
    }
    
    public final void a(final Iterable iterable) {
        final Object b = this.b;
        monitorenter(b);
        try {
            final alj[] c = this.c;
            final int n = 0;
            for (int i = 0; i < 7; ++i) {
                c[i].d(null);
            }
            final alj[] c2 = this.c;
            int j = 0;
            while (j < 7) {
                final alj alj = c2[j];
                alj.a.clear();
                for (final ana ana : iterable) {
                    if (alj.b(ana)) {
                        alj.a.add(ana.a);
                    }
                }
                Label_0274: {
                    if (alj.a.isEmpty()) {
                        alj.c.f(alj);
                        break Label_0274;
                    }
                    final alu c3 = alj.c;
                    synchronized (c3.b) {
                        if (c3.c.add(alj)) {
                            if (c3.c.size() == 1) {
                                c3.d = c3.b();
                                final aiy a = aiy.a();
                                String.format("%s: initial state = %s", c3.getClass().getSimpleName(), c3.d);
                                a.d(new Throwable[0]);
                                c3.d();
                            }
                            alj.a(c3.d);
                        }
                        monitorexit(c3.b);
                        alj.e(alj.d, alj.b);
                        ++j;
                        continue;
                    }
                }
                break;
            }
            final alj[] c4 = this.c;
            for (int k = n; k < 7; ++k) {
                c4[k].d(this);
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    public final void b() {
        final Object b = this.b;
        monitorenter(b);
        try {
            final alj[] c = this.c;
            for (int i = 0; i < 7; ++i) {
                final alj alj = c[i];
                if (!alj.a.isEmpty()) {
                    alj.a.clear();
                    alj.c.f(alj);
                }
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    public final boolean c(final String s) {
        final Object b = this.b;
        monitorenter(b);
        try {
            final alj[] c = this.c;
            for (int i = 0; i < 7; ++i) {
                final alj alj = c[i];
                final Object b2 = alj.b;
                if (b2 != null && alj.c(b2) && alj.a.contains(s)) {
                    final aiy a = aiy.a();
                    String.format("Work %s constrained by %s", s, alj.getClass().getSimpleName());
                    a.d(new Throwable[0]);
                    monitorexit(b);
                    return false;
                }
            }
            monitorexit(b);
            return true;
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
}
