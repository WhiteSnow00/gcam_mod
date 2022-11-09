import java.util.Iterator;
import android.text.TextUtils;
import android.os.PowerManager$WakeLock;
import android.os.Looper;
import java.util.ArrayList;
import android.os.Handler;
import android.content.Intent;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akz implements ajm
{
    public static final String a;
    final Context b;
    public final aon c;
    public final ajp d;
    public final akh e;
    final akq f;
    final List g;
    Intent h;
    public akx i;
    public final apa j;
    private final Handler k;
    
    static {
        a = aiy.b("SystemAlarmDispatcher");
    }
    
    public akz(final Context context) {
        final Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.f = new akq(applicationContext);
        this.c = new aon();
        final akh e = akh.e(context);
        this.e = e;
        final ajp f = e.f;
        this.d = f;
        this.j = e.j;
        f.b(this);
        this.g = new ArrayList();
        this.h = null;
        this.k = new Handler(Looper.getMainLooper());
    }
    
    @Override
    public final void a(final String s, final boolean b) {
        this.d(new akw(this, akq.d(this.b, s, b), 0));
    }
    
    public final void b() {
        if (this.k.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }
    
    public final void c() {
        aiy.a().d(new Throwable[0]);
        this.d.c(this);
        final aon c = this.c;
        if (!c.a.isShutdown()) {
            c.a.shutdownNow();
        }
        this.i = null;
    }
    
    final void d(final Runnable runnable) {
        this.k.post(runnable);
    }
    
    public final void e() {
        this.b();
        final PowerManager$WakeLock a = aod.a(this.b, "ProcessCommand");
        try {
            a.acquire();
            this.e.j.a(new akv(this));
        }
        finally {
            a.release();
        }
    }
    
    public final void f(final Intent intent, final int n) {
        final aiy a = aiy.a();
        String.format("Adding command %s (%s)", intent, n);
        a.d(new Throwable[0]);
        this.b();
        final String action = intent.getAction();
        if (TextUtils.isEmpty((CharSequence)action)) {
            aiy.a();
            aiy.g(akz.a, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            this.b();
            synchronized (this.g) {
                final Iterator iterator = this.g.iterator();
                while (iterator.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent)iterator.next()).getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", n);
        final List g = this.g;
        monitorenter(g);
        try {
            final boolean empty = this.g.isEmpty();
            this.g.add(intent);
            if (!(empty ^ true)) {
                this.e();
            }
            monitorexit(g);
        }
        finally {
            monitorexit(g);
            while (true) {}
        }
    }
}
