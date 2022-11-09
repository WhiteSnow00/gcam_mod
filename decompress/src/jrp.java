import com.google.android.gms.common.api.Status;
import android.os.RemoteException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jrp
{
    public final int c;
    
    public jrp(final int c) {
        this.c = c;
    }
    
    public static Status h(final RemoteException ex) {
        final StringBuilder sb = new StringBuilder();
        sb.append(ex.getClass().getSimpleName());
        sb.append(": ");
        sb.append(ex.getLocalizedMessage());
        return new Status(19, sb.toString());
    }
    
    public abstract void d(final Status p0);
    
    public abstract void e(final Exception p0);
    
    public abstract void f(final jsm p0);
    
    public abstract void g(final jsd p0, final boolean p1);
}
