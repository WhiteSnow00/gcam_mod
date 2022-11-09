import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public class kcw
{
    protected final String a;
    protected long b;
    protected final jqt c;
    
    public kcw(final jqt c, final String a) {
        this.c = c;
        this.a = a;
        synchronized (jty.a) {
            monitorexit(jty.a);
            this.b = 2000L;
        }
    }
    
    private final boolean e(final int n) {
        if (n <= 0) {
            final String value = String.valueOf(this.a);
            String concat;
            if (value.length() != 0) {
                concat = "No more attempts remaining, giving up for ".concat(value);
            }
            else {
                concat = new String("No more attempts remaining, giving up for ");
            }
            Log.w("PhenotypeFlagCommitter", concat);
            return false;
        }
        final kcj c = this.c(this.a);
        if (c == null) {
            return false;
        }
        this.d();
        final String a = c.a;
        if (a != null && !a.isEmpty()) {
            final keg j = this.c.j(c.a);
            try {
                lwt.n(j, this.b, TimeUnit.MILLISECONDS);
                mnm.e(mnw.a(this.a));
                return true;
            }
            catch (final TimeoutException j) {}
            catch (final InterruptedException j) {}
            catch (final ExecutionException ex) {}
            final String a2 = this.a;
            final StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 41);
            sb.append("Committing snapshot for ");
            sb.append(a2);
            sb.append(" failed, retrying");
            Log.w("PhenotypeFlagCommitter", sb.toString(), (Throwable)j);
            return this.e(n - 1);
        }
        return true;
    }
    
    @Deprecated
    protected void a() {
        throw new IllegalStateException("Requires implementation");
    }
    
    public final void b() {
        this.e(3);
    }
    
    protected final kcj c(final String s) {
        Object k = this.c.k(s, "");
        try {
            k = lwt.n((keg)k, this.b, TimeUnit.MILLISECONDS);
            return (kcj)k;
        }
        catch (final TimeoutException k) {}
        catch (final InterruptedException k) {}
        catch (final ExecutionException ex) {}
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 31);
        sb.append("Retrieving snapshot for ");
        sb.append(s);
        sb.append(" failed");
        Log.e("PhenotypeFlagCommitter", sb.toString(), (Throwable)k);
        return null;
    }
    
    protected void d() {
        this.a();
    }
}
