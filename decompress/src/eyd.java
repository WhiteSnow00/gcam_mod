import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.location.Location;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class eyd implements eya, exn, ewr, ews
{
    private static final nsd g;
    public final Context a;
    public final hkc b;
    public final pii c;
    public final kse d;
    public final Executor e;
    public oey f;
    private final kjm h;
    
    static {
        g = nsd.g("com/google/android/apps/camera/location/LocationProviderImpl");
    }
    
    public eyd(final Context a, final hkc b, final pii c, final kjm h, final kse d, final Executor e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.d = d;
        this.e = e;
    }
    
    private final oey e(final oey oey) {
        return odg.i(oey, emt.c, this.e);
    }
    
    @Override
    public final void a() {
        this.f = ofi.r(new eyc(this), this.e);
    }
    
    @Override
    public final void b() {
        final oey f = this.f;
        if (f != null) {
            knf.f(f, eyb.a, this.h);
        }
    }
    
    @Override
    public final btl c() {
        final oey f = this.f;
        if (f == null) {
            return btl.a();
        }
        return new btl(this.e(f), 1000L);
    }
    
    @Override
    public final niz d() {
        if (this.f == null) {
            return nii.a;
        }
        try {
            try {
                this.d.f("Location#getCurrent");
                final niz h = niz.h(this.e(this.f).get(1000L, TimeUnit.MILLISECONDS));
                this.d.g();
                return h;
            }
            finally {}
        }
        catch (final TimeoutException ex) {}
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex2) {}
        final TimeoutException ex;
        eyd.g.c().h(ex).E(1466).o("Failed to get current location.");
        this.d.g();
        return nii.a;
        this.d.g();
    }
}
