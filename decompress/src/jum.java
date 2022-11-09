import java.util.Collection;
import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.Parcel;
import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import android.os.IBinder;
import android.os.Bundle;
import android.content.ServiceConnection;
import android.util.Log;
import android.os.Looper;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jum
{
    private static final jpu[] a;
    jvi b;
    public final Context c;
    final Handler d;
    public final Object e;
    public final Object f;
    protected juh g;
    public final ArrayList h;
    public int i;
    public final int j;
    public volatile String k;
    public jps l;
    public boolean m;
    public volatile jus n;
    protected final AtomicInteger o;
    public final juy p;
    public final juz q;
    public jvo r;
    private volatile String s;
    private final jvc t;
    private IInterface u;
    private jui v;
    private final String w;
    
    static {
        a = new jpu[0];
    }
    
    protected jum(final Context c, final Looper looper, final jvc t, final jpx jpx, final int j, final juy p8, final juz q, final String w) {
        this.s = null;
        this.e = new Object();
        this.f = new Object();
        this.h = new ArrayList();
        this.i = 1;
        this.l = null;
        this.m = false;
        this.n = null;
        this.o = new AtomicInteger(0);
        jvu.j(c, "Context must not be null");
        this.c = c;
        jvu.j(looper, "Looper must not be null");
        jvu.j(t, "Supervisor must not be null");
        this.t = t;
        jvu.j(jpx, "API availability must not be null");
        this.d = new juf(this, looper);
        this.j = j;
        this.p = p8;
        this.q = q;
        this.w = w;
    }
    
    private final void H(int i, final IInterface u) {
        boolean b = true;
        if (i == 4 != (u != null)) {
            b = false;
        }
        jvu.b(b);
        synchronized (this.e) {
            this.i = i;
            this.u = u;
            switch (i) {
                case 4: {
                    jvu.a(u);
                    System.currentTimeMillis();
                    break;
                }
                case 2:
                case 3: {
                    final jui v = this.v;
                    if (v != null) {
                        final jvi b2 = this.b;
                        if (b2 != null) {
                            final String a = b2.a;
                            final String b3 = b2.b;
                            i = a.length();
                            final StringBuilder sb = new StringBuilder(i + 70 + b3.length());
                            sb.append("Calling connect() while still connected, missing disconnect() for ");
                            sb.append(a);
                            sb.append(" on ");
                            sb.append(b3);
                            Log.e("GmsClient", sb.toString());
                            final jvc t = this.t;
                            final jvi b4 = this.b;
                            final String a2 = b4.a;
                            final String b5 = b4.b;
                            i = b4.c;
                            this.v();
                            t.a(a2, b5, (ServiceConnection)v, this.b.d);
                            this.o.incrementAndGet();
                        }
                    }
                    final jui v2 = new jui(this, this.o.get());
                    this.v = v2;
                    final jvi b6 = new jvi(this.w(), this.e(), this.B());
                    this.b = b6;
                    if (b6.d && this.a() < 17895000) {
                        final String a3 = this.b.a;
                        String concat;
                        if (a3.length() != 0) {
                            concat = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(a3);
                        }
                        else {
                            concat = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                        }
                        throw new IllegalStateException(concat);
                    }
                    final jvc t2 = this.t;
                    final jvi b7 = this.b;
                    final String a4 = b7.a;
                    final String b8 = b7.b;
                    i = b7.c;
                    final String v3 = this.v();
                    final jvb jvb = new jvb(a4, b8, this.b.d);
                    Object o = t2.c;
                    synchronized (o) {
                        jvd jvd = t2.c.get(jvb);
                        if (jvd == null) {
                            jvd = new jvd(t2, jvb);
                            jvd.d((ServiceConnection)v2, (ServiceConnection)v2);
                            jvd.a(v3);
                            t2.c.put(jvb, jvd);
                        }
                        else {
                            t2.e.removeMessages(0, (Object)jvb);
                            if (jvd.b((ServiceConnection)v2)) {
                                final String value = String.valueOf(jvb);
                                i = String.valueOf(value).length();
                                final StringBuilder sb2 = new StringBuilder(i + 81);
                                sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                                sb2.append(value);
                                throw new IllegalStateException(sb2.toString());
                            }
                            jvd.d((ServiceConnection)v2, (ServiceConnection)v2);
                            switch (jvd.b) {
                                case 2: {
                                    jvd.a(v3);
                                    break;
                                }
                                case 1: {
                                    ((ServiceConnection)v2).onServiceConnected(jvd.f, jvd.d);
                                    break;
                                }
                            }
                        }
                        final boolean c = jvd.c;
                        monitorexit(o);
                        if (!c) {
                            o = this.b;
                            final String a5 = ((jvi)o).a;
                            o = ((jvi)o).b;
                            final int length = a5.length();
                            i = ((String)o).length();
                            final StringBuilder sb3 = new StringBuilder(length + 34 + i);
                            sb3.append("unable to connect to service: ");
                            sb3.append(a5);
                            sb3.append(" on ");
                            sb3.append((String)o);
                            Log.e("GmsClient", sb3.toString());
                            this.G(16, this.o.get());
                            break;
                        }
                        break;
                    }
                }
                case 1: {
                    final jui v4 = this.v;
                    if (v4 != null) {
                        final jvc t3 = this.t;
                        final jvi b9 = this.b;
                        final String a6 = b9.a;
                        final String b10 = b9.b;
                        i = b9.c;
                        this.v();
                        t3.a(a6, b10, (ServiceConnection)v4, this.b.d);
                        this.v = null;
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public final boolean A(final int n, final int n2, final IInterface interface1) {
        synchronized (this.e) {
            if (this.i != n) {
                return false;
            }
            this.H(n2, interface1);
            return true;
        }
    }
    
    protected boolean B() {
        return false;
    }
    
    public final boolean C() {
        return this.n != null;
    }
    
    public boolean D() {
        return false;
    }
    
    public jpu[] E() {
        throw null;
    }
    
    protected final void G(final int n, final int n2) {
        final Handler d = this.d;
        d.sendMessage(d.obtainMessage(7, n2, -1, (Object)new jul(this, n)));
    }
    
    public int a() {
        throw null;
    }
    
    protected Bundle b() {
        return new Bundle();
    }
    
    protected abstract IInterface c(final IBinder p0);
    
    protected abstract String d();
    
    protected abstract String e();
    
    public jpu[] f() {
        return jum.a;
    }
    
    public final String g() {
        return this.s;
    }
    
    public void i(final juh g) {
        jvu.j(g, "Connection progress callbacks cannot be null.");
        this.g = g;
        this.H(2, null);
    }
    
    public void j() {
        this.o.incrementAndGet();
        final ArrayList h = this.h;
        monitorenter(h);
        try {
            for (int size = this.h.size(), i = 0; i < size; ++i) {
                ((jug)this.h.get(i)).e();
            }
            this.h.clear();
            monitorexit(h);
            synchronized (this.f) {
                this.r = null;
                monitorexit(this.f);
                this.H(1, null);
            }
        }
        finally {
            monitorexit(h);
            while (true) {}
        }
    }
    
    public final void k(final String s) {
        this.s = s;
        this.j();
    }
    
    public final boolean l() {
        synchronized (this.e) {
            return this.i == 4;
        }
    }
    
    public final boolean m() {
        synchronized (this.e) {
            final int i = this.i;
            boolean b = true;
            if (i != 2) {
                if (i != 3) {
                    b = false;
                }
            }
            return b;
        }
    }
    
    public boolean n() {
        return true;
    }
    
    public boolean o() {
        return false;
    }
    
    public final jpu[] p() {
        final jus n = this.n;
        if (n == null) {
            return null;
        }
        return n.b;
    }
    
    public final void q(final jsl jsl) {
        jsl.a.j.o.post((Runnable)new jsk(jsl));
    }
    
    public final void r() {
        if (this.l() && this.b != null) {
            return;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }
    
    public final void s(final jvk ex, Set obtain) {
        final Bundle b = this.b();
        final jux jux = new jux(this.j, this.k);
        jux.d = this.c.getPackageName();
        jux.g = b;
        if (obtain != null) {
            jux.f = (Scope[])((Collection)obtain).toArray(new Scope[((Collection)obtain).size()]);
        }
        if (this.o()) {
            Account t;
            if ((t = this.t()) == null) {
                t = new Account("<<default account>>", "com.google");
            }
            jux.h = t;
            if (ex != null) {
                jux.e = ((bje)ex).a;
            }
        }
        jux.i = this.E();
        jux.j = this.f();
        if (this.D()) {
            jux.m = true;
        }
        try {
            synchronized (this.f) {
                final jvo r = this.r;
                if (r != null) {
                    final jvn jvn = new jvn(this, this.o.get());
                    final Parcel obtain2 = Parcel.obtain();
                    obtain = Parcel.obtain();
                    try {
                        obtain2.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        obtain2.writeStrongBinder((IBinder)jvn);
                        obtain2.writeInt(1);
                        ul.a(jux, obtain2, 0);
                        r.a.transact(46, obtain2, obtain, 0);
                        obtain.readException();
                        return;
                    }
                    finally {
                        obtain.recycle();
                        obtain2.recycle();
                    }
                }
                Log.w("GmsClient", "mServiceBroker is null, client disconnected");
            }
        }
        catch (final RuntimeException ex) {
            goto Label_0284;
        }
        catch (final RemoteException ex2) {}
        catch (final SecurityException ex3) {
            throw ex3;
        }
        catch (final DeadObjectException ex4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)ex4);
            final Handler d = this.d;
            d.sendMessage(d.obtainMessage(6, this.o.get(), 3));
        }
    }
    
    public Account t() {
        throw null;
    }
    
    public final IInterface u() {
        synchronized (this.e) {
            if (this.i != 5) {
                this.x();
                final IInterface u = this.u;
                jvu.j(u, "Client is connected but service is null");
                return u;
            }
            throw new DeadObjectException();
        }
    }
    
    protected final String v() {
        String s;
        if ((s = this.w) == null) {
            s = this.c.getClass().getName();
        }
        return s;
    }
    
    protected String w() {
        return "com.google.android.gms";
    }
    
    public final void x() {
        if (this.l()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
    
    protected void y(final int n, final IBinder binder, final Bundle bundle, final int n2) {
        final Handler d = this.d;
        d.sendMessage(d.obtainMessage(1, n2, -1, (Object)new juk(this, n, binder, bundle)));
    }
    
    protected final void z(final juh g, final int n, final PendingIntent pendingIntent) {
        this.g = g;
        final Handler d = this.d;
        d.sendMessage(d.obtainMessage(3, this.o.get(), n, (Object)pendingIntent));
    }
}
