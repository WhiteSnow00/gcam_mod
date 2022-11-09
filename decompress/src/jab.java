import java.util.concurrent.Executor;
import com.google.android.apps.camera.ui.mars.MarsSwitch;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jab implements jap
{
    public final Context a;
    public final iph b;
    public final cxl c;
    public final pii d;
    public final kjm e;
    public final kse f;
    public MarsSwitch g;
    public final ewy h;
    private final jbm i;
    private final hkd j;
    private final Executor k;
    
    public jab(final Context a, final jbm i, final iph b, final hkd j, final cxl c, final pii d, final kjm e, final Executor k, final kse f, final ewy h) {
        this.a = a;
        this.i = i;
        this.b = b;
        this.j = j;
        this.c = c;
        this.d = d;
        this.e = e;
        this.k = k;
        this.f = f;
        this.h = h;
    }
    
    @Override
    public final void a() {
        this.j.d(hjq.R, false);
        if (this.c.k(cxr.bi) && this.i != jbm.h && this.i != jbm.i) {
            ofi.w(iph.a(this.k, this.a), new jaa(this), this.k);
        }
    }
}
