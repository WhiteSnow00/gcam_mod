import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BasePendingResult;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jrs extends BasePendingResult implements jrt
{
    protected jrs(final jqw jqw) {
        jvu.j(jqw, "GoogleApiClient must not be null");
        super(jqw);
    }
    
    private final void d(final RemoteException ex) {
        this.f(new Status(8, ex.getLocalizedMessage(), null));
    }
    
    protected abstract void b(final jqj p0);
    
    public final void e(final jqj jqj) {
        try {
            this.b(jqj);
        }
        catch (final RemoteException ex) {
            this.d(ex);
        }
        catch (final DeadObjectException ex2) {
            this.d((RemoteException)ex2);
            throw ex2;
        }
    }
    
    public final void f(final Status status) {
        jvu.c(status.b() ^ true, "Failed result must not be success");
        this.j(this.a(status));
    }
}
