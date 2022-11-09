import java.util.concurrent.CopyOnWriteArrayList;
import java.util.EnumSet;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpg
{
    @Deprecated
    public static final jqp a;
    public static final String[] b;
    public static final List c;
    public static volatile int d;
    public static final lio m;
    public final Context e;
    public final String f;
    public final EnumSet g;
    public final jpe h;
    public final List i;
    public String j;
    public int k;
    final jpl l;
    
    static {
        a = new jqp("ClearcutLogger.API", m = new jpb(), null, null);
        b = new String[0];
        c = new CopyOnWriteArrayList();
        jpg.d = -1;
    }
    
    public jpg(final Context context, final String s) {
        this(context, s, jpf.e, jpl.b(context), new jpp(context));
    }
    
    public jpg(final Context context, final String j, final EnumSet g, final jpl l, final jpe h) {
        this.i = new CopyOnWriteArrayList();
        this.k = 1;
        if (!g.contains(jpf.d)) {
            jvu.c(true, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        if (!g.equals(jpf.g) && !g.equals(jpf.e) && !g.equals(jpf.f)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or PIILevel.DEIDENTIFIED");
        }
        this.e = context.getApplicationContext();
        this.f = context.getPackageName();
        this.j = j;
        this.g = g;
        this.l = l;
        this.k = 1;
        this.h = h;
    }
    
    public final jpd a(final byte[] array) {
        ojw t;
        if (array != null) {
            t = ojw.t(array);
        }
        else {
            t = null;
        }
        return new jpd(this, t, null);
    }
    
    public final boolean b() {
        return this.g.equals(jpf.f);
    }
}
