import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrn extends jrj
{
    private final jtu a;
    private final kej b;
    
    public jrn(final int n, final jtu a, final kej b) {
        super(n);
        this.b = b;
        this.a = a;
        if (n == 2 && a.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
    
    @Override
    public final boolean a(final jsm jsm) {
        return this.a.b;
    }
    
    @Override
    public final jpu[] b(final jsm jsm) {
        return this.a.a;
    }
    
    @Override
    public final void d(final Status status) {
        this.b.c(jvh.a(status));
    }
    
    @Override
    public final void e(final Exception ex) {
        this.b.c(ex);
    }
    
    @Override
    public final void f(final jsm jsm) {
        try {
            this.a.d.a.a(jsm.b, this.b);
        }
        catch (final RuntimeException ex) {
            this.e(ex);
        }
        catch (final RemoteException ex2) {
            this.d(jrp.h(ex2));
        }
        catch (final DeadObjectException ex3) {
            throw ex3;
        }
    }
    
    @Override
    public final void g(final jsd jsd, final boolean b) {
        final kej b2 = this.b;
        jsd.b.put(b2, b);
        b2.a.f(new jsc(jsd, b2));
    }
}
