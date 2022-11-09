import android.os.RemoteException;
import android.os.IBinder;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dff implements dfl
{
    private final dfb a;
    private final klj b;
    private final krc c;
    private final krc d;
    private final krr e;
    private final dfg f;
    private final kri g;
    private final kri h;
    private boolean i;
    private final Object j;
    
    public dff(final dfb a, final dfg f, final klv klv, final krq krq, final Executor executor) {
        this.j = new Object();
        this.a = a;
        this.f = f;
        final klj i = klq.i(f.b, f.c);
        this.b = i;
        (this.e = krq.a("ElmyraConnH")).f("ElmyraConnectionHandler created.");
        final dfd g = new dfd(this);
        this.g = g;
        final dfe h = new dfe(this, klv);
        this.h = h;
        this.c = klv.a(g, executor);
        this.d = i.a(h, executor);
    }
    
    private final void b() {
        synchronized (this.j) {
            if (this.i) {
                return;
            }
            this.e.f("ElmyraClient unbinding from service.");
            synchronized (this.a.c) {
                monitorexit(this.a.c);
                final dfb a = this.a;
                final Object c = a.c;
                synchronized (this.a.c) {
                    a.e = null;
                    final ngw g = a.g;
                    if (g == null) {
                        dfb.a.c().E(761).o("Service is null, should try to reconnect");
                        monitorexit(this.a.c);
                    }
                    else {
                        try {
                            g.e(a.f, null);
                        }
                        catch (final RemoteException ex) {
                            dfb.a.b().h((Throwable)ex).E(760).r("Failed to %s listener", "unregister");
                        }
                    }
                }
            }
        }
    }
    
    public final void a(final jbm jbm) {
        final krr e = this.e;
        final String value = String.valueOf(jbm);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 24);
        sb.append("ApplicationMode is now: ");
        sb.append(value);
        e.f(sb.toString());
        final dfg f = this.f;
        f.a();
        f.b();
        this.b();
    }
    
    @Override
    public final void close() {
        synchronized (this.j) {
            if (this.i) {
                return;
            }
            this.c.close();
            this.d.close();
            synchronized (this.j) {
                if (this.i) {
                    monitorexit(this.j);
                }
                else {
                    this.b();
                    monitorexit(this.j);
                }
                this.i = true;
            }
        }
    }
}
