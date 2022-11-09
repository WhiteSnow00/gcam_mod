import android.os.SystemClock;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mgu
{
    public final mgs a;
    public final pii b;
    public final mmh c;
    public final pii d;
    public final mfb e;
    private final mem f;
    private final Executor g;
    
    public mgu(final mgs a, final pii b, final mem f, final mmi mmi, final pii pii, final mfb e, final Executor g, final oui oui, final pii pii2) {
        this.a = a;
        this.f = f;
        this.b = b;
        this.g = g;
        this.d = new mli(pii, 1);
        final Context a2 = ((egg)mmi.a).a();
        final Executor executor = (Executor)mmi.b.get();
        executor.getClass();
        this.c = new mmh(a2, executor, (mml)mmi.c.get(), oui, pii2);
        this.e = e;
    }
    
    public final oey a(final mgr mgr) {
        if (this.f.b) {
            return ofi.l();
        }
        return ofi.p(new mgt(this, mgr), this.g);
    }
    
    public final boolean b(final String s) {
        Label_0165: {
            if (this.f.b) {
                final long a = -1L;
                break Label_0165;
            }
            final mmh c = this.c;
            final mmd c2 = c.c;
            final int intValue = (int)c2.b.get();
            if (intValue == 0) {
                final long a = -1L;
                break Label_0165;
            }
            Label_0131: {
                if (intValue == Integer.MAX_VALUE) {
                    break Label_0131;
                }
                Object o = c2.a;
                synchronized (o) {
                    if (c2.d < intValue) {
                        monitorexit(o);
                    }
                    else {
                        final long e = c2.e;
                        monitorexit(o);
                        o = c2.c;
                        if (SystemClock.elapsedRealtime() - e <= 1000L) {
                            final long a = -1L;
                            return a != -1L;
                        }
                    }
                    final int d = c.d;
                    o = c.b;
                    long a;
                    if (d != 3) {
                        a = -1L;
                    }
                    else {
                        a = ((mmm)o).a(s);
                    }
                    return a != -1L;
                }
            }
        }
    }
}
