import com.google.android.gms.common.api.internal.BasePendingResult;
import android.util.Log;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrl extends jrp
{
    protected final jrs a;
    
    public jrl(final int n, final jrs a) {
        super(n);
        this.a = a;
    }
    
    @Override
    public final void d(final Status status) {
        try {
            this.a.f(status);
        }
        catch (final IllegalStateException ex) {
            Log.w("ApiCallRunner", "Exception reporting failure", (Throwable)ex);
        }
    }
    
    @Override
    public final void e(final Exception ex) {
        final String simpleName = ex.getClass().getSimpleName();
        final String localizedMessage = ex.getLocalizedMessage();
        final StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        final Status status = new Status(10, sb.toString());
        try {
            this.a.f(status);
        }
        catch (final IllegalStateException ex2) {
            Log.w("ApiCallRunner", "Exception reporting failure", (Throwable)ex2);
        }
    }
    
    @Override
    public final void f(final jsm jsm) {
        try {
            this.a.e(jsm.b);
        }
        catch (final RuntimeException ex) {
            this.e(ex);
        }
    }
    
    @Override
    public final void g(final jsd jsd, final boolean b) {
        final jrs a = this.a;
        jsd.a.put(a, b);
        a.l(new jsb(jsd, a));
    }
}
