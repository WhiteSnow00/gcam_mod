import android.util.Log;
import android.os.RemoteException;
import android.os.Parcelable;
import android.os.Bundle;
import java.util.ArrayDeque;
import android.content.Context;
import java.util.Queue;
import com.google.lens.sdk.PendingIntentConsumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpf implements lpg
{
    public final lph a;
    public PendingIntentConsumer b;
    private final Queue c;
    
    public lpf(final Context context, final lpc lpc) {
        this.c = new ArrayDeque();
        this.a = new lpo(context, this, lpc);
    }
    
    private final boolean g() {
        final jkz a = this.a();
        return (a.a & 0x2) != 0x0 && this.a.a() >= a.c;
    }
    
    public final jkz a() {
        lpy.b();
        lpy.c(this.a.f(), "getServerFlags() called before ready.");
        if (!this.a.f()) {
            return jkz.f;
        }
        final lph a = this.a;
        lpy.b();
        final lpo lpo = (lpo)a;
        lpy.c(lpo.l(), "Attempted to use ServerFlags before ready.");
        return lpo.f;
    }
    
    public final void b() {
        while (this.c.peek() != null) {
            this.c.remove().a(this.a.g());
        }
    }
    
    public final boolean c(Bundle ex) {
        lpy.b();
        if (!this.a.f()) {
            return false;
        }
        final okv okv = (okv)jkr.c.m();
        if (okv.c) {
            okv.m();
            okv.c = false;
        }
        final jkr jkr = (jkr)okv.b;
        jkr.b = 341;
        jkr.a |= 0x1;
        final jkr jkr2 = (jkr)okv.h();
        ex = (SecurityException)new jkp((Parcelable)ex);
        try {
            this.a.c(jkr2.g(), (jkp)ex);
            return true;
        }
        catch (final SecurityException ex) {}
        catch (final RemoteException ex2) {}
        Log.e("LensServiceBridge", "Failed to inject image.", (Throwable)ex);
        return false;
    }
    
    public final void d(final lpe lpe) {
        lpy.b();
        if (!this.a.f() && !this.a.e()) {
            this.c.add(lpe);
            final lpo lpo = (lpo)this.a;
            if (!lpo.j() && !lpo.k()) {
                lpo.m();
            }
            return;
        }
        lpe.a(this.a.g());
    }
    
    public final int e() {
        lpy.b();
        if (!this.a.f()) {
            return this.a.g();
        }
        if (this.g()) {
            return 2;
        }
        return 13;
    }
    
    public final int f() {
        lpy.b();
        if (!this.a.f()) {
            return this.a.g();
        }
        if (this.g()) {
            final jkz a = this.a();
            if ((a.a & 0x8) != 0x0 && this.a.a() >= a.e) {
                return 2;
            }
        }
        return 13;
    }
}
