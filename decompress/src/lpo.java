import android.os.IInterface;
import android.os.IBinder;
import android.content.ComponentName;
import android.util.Log;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.ExecutorService;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import android.content.Context;
import java.util.concurrent.Executor;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpo extends jkm implements ServiceConnection, lph
{
    public final Executor a;
    public final Context b;
    public final lpg c;
    public int d;
    public int e;
    public jkz f;
    public jky g;
    public int h;
    public jkk i;
    public jkl j;
    private final Executor k;
    private final lpc l;
    
    public lpo(final Context b, final lpg c, final lpc l) {
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor(abf.a);
        this.a = new lpn(new Handler(Looper.getMainLooper()));
        this.d = 1;
        this.h = 1;
        this.b = b;
        this.c = c;
        this.l = l;
        this.k = singleThreadExecutor;
    }
    
    private static boolean n(final int n) {
        return n == 6 || n == 7 || n == 8;
    }
    
    private static boolean o(final int n) {
        return n == 5;
    }
    
    public final int a() {
        lpy.b();
        lpy.c(this.l(), "Attempted to use lensServiceSession before ready.");
        return this.e;
    }
    
    public final void b(final byte[] array, final jkp jkp) {
        this.a.execute(new lpm(this, array, jkp));
    }
    
    public final void c(final byte[] array, final jkp jkp) {
        lpy.b();
        lpy.c(this.f(), "Attempted to use lensServiceSession before ready.");
        final jkl j = this.j;
        lpy.d(j);
        final Parcel a = j.a();
        a.writeByteArray(array);
        bjg.c(a, (Parcelable)jkp);
        j.A(2, a);
    }
    
    public final void d() {
        lpy.b();
        lpy.c(this.f(), "Attempted to handover when not ready.");
        Object j = jkr.c.m();
        if (((okt)j).c) {
            ((okt)j).m();
            ((okt)j).c = false;
        }
        final jkr jkr = (jkr)((okv)j).b;
        jkr.b = 99;
        jkr.a |= 0x1;
        final okk a = jlb.a;
        final okt m = jlc.c.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final jlc jlc = (jlc)m.b;
        jlc.a |= 0x1;
        jlc.b = true;
        ((okv)j).ap(a, m.h());
        final jkr jkr2 = (jkr)((okt)j).h();
        Label_0170: {
            try {
                j = this.j;
                lpy.d(j);
                ((jkl)j).e(jkr2.g());
                break Label_0170;
            }
            catch (final SecurityException j) {}
            catch (final RemoteException ex) {}
            Log.e("LensServiceConnImpl", "Unable to stop Lens service session.", (Throwable)j);
        }
        this.h = 12;
        this.i(8);
    }
    
    public final boolean e() {
        lpy.b();
        return n(this.d);
    }
    
    public final boolean f() {
        lpy.b();
        return o(this.d);
    }
    
    public final int g() {
        lpy.b();
        final boolean f = this.f();
        boolean b = true;
        if (!f) {
            b = (this.e() && b);
        }
        lpy.c(b, "Attempted to use ServerFlags before ready or dead.");
        return this.h;
    }
    
    public final void h() {
        lpy.b();
        if (this.j == null) {
            this.h = 11;
            this.i(7);
            return;
        }
        this.h = 11;
        this.i(8);
    }
    
    public final void i(final int d) {
        lpy.b();
        String.format("Transitioning from state %s to %s.", this.d, d);
        final int d2 = this.d;
        this.d = d;
        if (o(d) && !o(d2)) {
            final lpg c = this.c;
            lpy.b();
            ((lpf)c).b();
        }
        if (n(d) && !n(d2)) {
            final lpg c2 = this.c;
            lpy.b();
            ((lpf)c2).b();
        }
    }
    
    public final boolean j() {
        return this.d == 2;
    }
    
    public final boolean k() {
        final int d = this.d;
        return d == 3 || d == 4 || d == 5 || d == 7 || d == 8;
    }
    
    public final boolean l() {
        final int d = this.d;
        return d == 5 || d == 8;
    }
    
    public final void m() {
        lpy.b();
        if (!this.j() && !this.k()) {
            this.i(2);
            this.l.a(new lpi(this));
        }
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        lpy.b();
        jkk i;
        if (binder == null) {
            i = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            if (queryLocalInterface instanceof jkk) {
                i = (jkk)queryLocalInterface;
            }
            else {
                i = new jkk(binder);
            }
        }
        this.i = i;
        this.k.execute(new lpk(this, i));
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        lpy.b();
        this.h = 11;
        this.i(7);
    }
}
