import java.util.List;
import java.util.Collection;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ako implements ajq, ale, ajm
{
    Boolean a;
    private final Context b;
    private final akh c;
    private final alf d;
    private final Set e;
    private final akn f;
    private boolean g;
    private final Object h;
    
    static {
        aiy.b("GreedyScheduler");
    }
    
    public ako(final Context b, final ail ail, final apa apa, final akh c) {
        this.e = new HashSet();
        this.b = b;
        this.c = c;
        this.d = new alf(b, apa, this);
        this.f = new akn(this, ail.f);
        this.h = new Object();
    }
    
    private final void g() {
        this.a = anx.a(this.b);
    }
    
    private final void h() {
        if (!this.g) {
            this.c.f.b(this);
            this.g = true;
        }
    }
    
    @Override
    public final void a(final String s, final boolean b) {
        final Object h = this.h;
        monitorenter(h);
        try {
            for (final ana ana : this.e) {
                if (ana.a.equals(s)) {
                    final aiy a = aiy.a();
                    String.format("Stopping tracking for %s", s);
                    a.d(new Throwable[0]);
                    this.e.remove(ana);
                    this.d.a(this.e);
                    break;
                }
            }
            monitorexit(h);
        }
        finally {
            monitorexit(h);
            while (true) {}
        }
    }
    
    @Override
    public final void b(final String s) {
        if (this.a == null) {
            this.g();
        }
        if (!this.a) {
            aiy.a();
            aiy.f(new Throwable[0]);
            return;
        }
        this.h();
        final aiy a = aiy.a();
        String.format("Cancelling work ID %s", s);
        a.d(new Throwable[0]);
        final akn f = this.f;
        if (f != null) {
            final Runnable runnable = f.b.remove(s);
            if (runnable != null) {
                f.c.a(runnable);
            }
        }
        this.c.h(s);
    }
    
    @Override
    public final void c(ana... h) {
        if (this.a == null) {
            this.g();
        }
        if (!this.a) {
            aiy.a();
            aiy.f(new Throwable[0]);
            return;
        }
        this.h();
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        for (final ana ana : h) {
            final long a = ana.a();
            final long currentTimeMillis = System.currentTimeMillis();
            if (ana.p == 1) {
                if (currentTimeMillis < a) {
                    final akn f = this.f;
                    if (f != null) {
                        final Runnable runnable = f.b.remove(ana.a);
                        if (runnable != null) {
                            f.c.a(runnable);
                        }
                        final akm akm = new akm(f, ana);
                        f.b.put(ana.a, akm);
                        f.c.a.postDelayed((Runnable)akm, ana.a() - System.currentTimeMillis());
                    }
                }
                else if (ana.b()) {
                    final ain j = ana.i;
                    if (j.c) {
                        final aiy a2 = aiy.a();
                        String.format("Ignoring WorkSpec %s, Requires device idle.", ana);
                        a2.d(new Throwable[0]);
                    }
                    else if (j.a()) {
                        final aiy a3 = aiy.a();
                        String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", ana);
                        a3.d(new Throwable[0]);
                    }
                    else {
                        set.add(ana);
                        set2.add(ana.a);
                    }
                }
                else {
                    final aiy a4 = aiy.a();
                    String.format("Starting work for %s", ana.a);
                    a4.d(new Throwable[0]);
                    this.c.g(ana.a);
                }
            }
        }
        h = (ana[])this.h;
        monitorenter(h);
        try {
            if (!set.isEmpty()) {
                final aiy a5 = aiy.a();
                String.format("Starting tracking for [%s]", TextUtils.join((CharSequence)",", (Iterable)set2));
                a5.d(new Throwable[0]);
                this.e.addAll(set);
                this.d.a(this.e);
            }
            monitorexit(h);
        }
        finally {
            monitorexit(h);
            while (true) {}
        }
    }
    
    @Override
    public final boolean d() {
        return false;
    }
    
    @Override
    public final void e(final List list) {
        for (final String s : list) {
            final aiy a = aiy.a();
            String.format("Constraints met: Scheduling work ID %s", s);
            a.d(new Throwable[0]);
            this.c.g(s);
        }
    }
    
    @Override
    public final void f(final List list) {
        for (final String s : list) {
            final aiy a = aiy.a();
            String.format("Constraints not met: Cancelling work ID %s", s);
            a.d(new Throwable[0]);
            this.c.h(s);
        }
    }
}
