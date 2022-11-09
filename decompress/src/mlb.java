import android.app.Activity;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mlb extends mrm implements mfl, mgx
{
    public static final long a;
    public final mgu b;
    public final Application c;
    public final oui d;
    public final mlx e;
    private final mfp f;
    private final Executor g;
    
    static {
        a = TimeUnit.HOURS.toMillis(12L);
    }
    
    public mlb(final mgv mgv, final Context context, final mfp f, final Executor g, final oui d, final mlx e, final pii pii) {
        this.b = mgv.a(g, d, pii);
        this.g = g;
        this.c = (Application)context;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void c(final Activity activity) {
        this.f.b(this);
        ofi.r(new mla(this), this.g);
    }
    
    @Override
    public final void k() {
        this.f.a(this);
    }
}
