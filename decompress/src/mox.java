import android.util.Log;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

final class mox implements mpc
{
    public static volatile int a;
    public static volatile niz b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final mqh f;
    private final mqh g;
    
    static {
        mox.a = 0;
        mox.b = null;
    }
    
    public mox(final boolean c, final boolean d, final boolean e, final mqh f, final mqh g) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final Object a(mny ex, String concat, final String s) {
        ex = (IOException)mpi.c.a((mny)ex, (String)concat, this.e, mow.a).g(s);
        if (ex == null) {
            return null;
        }
        try {
            ex = (IOException)this.g.a(ex);
            return ex;
        }
        catch (final IOException ex) {}
        catch (final ClassCastException ex2) {}
        if (s.length() != 0) {
            concat = "Invalid Phenotype flag value for flag ".concat(s);
        }
        else {
            concat = new String("Invalid Phenotype flag value for flag ");
        }
        Log.e("PhenotypeCombinedFlags", (String)concat, (Throwable)ex);
        return null;
    }
}
