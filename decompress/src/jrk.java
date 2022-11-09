import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class jrk extends jrj
{
    protected final kej a;
    
    public jrk(final int n, final kej a) {
        super(n);
        this.a = a;
    }
    
    protected abstract void c(final jsm p0);
    
    @Override
    public final void d(final Status status) {
        this.a.c(new jqq(status));
    }
    
    @Override
    public final void e(final Exception ex) {
        this.a.c(ex);
    }
    
    @Override
    public final void f(final jsm jsm) {
        try {
            this.c(jsm);
        }
        catch (final RuntimeException ex) {
            this.e(ex);
        }
        catch (final RemoteException ex2) {
            this.d(jrp.h(ex2));
        }
        catch (final DeadObjectException ex3) {
            this.d(jrp.h((RemoteException)ex3));
            throw ex3;
        }
    }
    
    @Override
    public void g(final jsd jsd, final boolean b) {
    }
}
