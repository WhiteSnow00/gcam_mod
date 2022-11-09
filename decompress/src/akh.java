import java.util.Arrays;
import java.util.concurrent.Executor;
import android.content.BroadcastReceiver$PendingResult;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akh extends ajf
{
    public static final Object a;
    private static akh l;
    private static akh m;
    public final Context b;
    public final ail c;
    public final WorkDatabase d;
    public final List e;
    public final ajp f;
    public final anw g;
    public boolean h;
    public BroadcastReceiver$PendingResult i;
    public final apa j;
    public volatile cxb k;
    
    static {
        aiy.b("WorkManagerImpl");
        akh.l = null;
        akh.m = null;
        a = new Object();
    }
    
    public akh(Context applicationContext, final ail c, final apa j) {
        final WorkDatabase r = WorkDatabase.r(applicationContext.getApplicationContext(), j.a, applicationContext.getResources().getBoolean(2131034158));
        final Context applicationContext2 = applicationContext.getApplicationContext();
        aiy.c(new aiy(4));
        final List<ajq> list = Arrays.asList(ajr.a(applicationContext2, this), new ako(applicationContext2, c, j, this));
        final ajp f = new ajp(applicationContext, c, j, r, list);
        applicationContext = applicationContext.getApplicationContext();
        this.b = applicationContext;
        this.c = c;
        this.j = j;
        this.d = r;
        this.e = list;
        this.f = f;
        this.g = new anw(r);
        this.h = false;
        if (!applicationContext.isDeviceProtectedStorage()) {
            j.a(new ant(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }
    
    public static akh e(final Context context) {
        synchronized (akh.a) {
            synchronized (akh.a) {
                Object o = akh.l;
                if (o != null) {
                    monitorexit(akh.a);
                }
                else {
                    o = akh.m;
                    monitorexit(akh.a);
                }
                if (o == null) {
                    o = context.getApplicationContext();
                    if (o instanceof aik) {
                        final ail a = ((aik)o).a();
                        synchronized (akh.a) {
                            final akh l = akh.l;
                            if (l != null && akh.m != null) {
                                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                            }
                            if (l == null) {
                                final Context applicationContext = ((Context)o).getApplicationContext();
                                if (akh.m == null) {
                                    akh.m = new akh(applicationContext, a, new apa(a.b));
                                }
                                akh.l = akh.m;
                            }
                            monitorexit(akh.a);
                            o = e((Context)o);
                            return (akh)o;
                        }
                    }
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                return (akh)o;
            }
        }
    }
    
    @Override
    public final oey a(final String s) {
        final aob aob = new aob(this, s);
        this.j.a.execute(aob);
        return aob.c;
    }
    
    @Override
    public final ajc b(final String s, final int n, final List list) {
        return new ajs(this, s, n, list).a();
    }
    
    @Override
    public final ajc d() {
        final anr b = anr.b("F250_WORKER_TAG", this, true);
        this.j.a(b);
        return b.d;
    }
    
    public final void f() {
        alb.a(this.b);
        final anb s = this.d.s();
        final anl anl = (anl)s;
        anl.a.g();
        final afn e = anl.e.e();
        anl.a.h();
        try {
            e.a();
            ((anl)s).a.j();
            anl.a.i();
            anl.e.f(e);
            ajr.b(this.c, this.d, this.e);
        }
        finally {
            anl.a.i();
            anl.e.f(e);
        }
    }
    
    public final void g(final String s) {
        this.i(s, null);
    }
    
    public final void h(final String s) {
        this.j.a(new aoc(this, s, false));
    }
    
    public final void i(final String s, final cxa cxa) {
        this.j.a(new aoa(this, s, cxa, null, null));
    }
}
