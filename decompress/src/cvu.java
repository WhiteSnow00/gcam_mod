import android.content.res.Resources$Theme;
import java.util.concurrent.ScheduledExecutorService;
import android.content.res.Resources;
import android.view.View$OnClickListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvu extends how
{
    public final Context a;
    public final hdo b;
    public final eyt c;
    public final cvx d;
    public final boolean e;
    public final View$OnClickListener f;
    public final View$OnClickListener g;
    public niz h;
    private final Resources j;
    private final dlc k;
    
    public cvu(final cvx d, final Context a, final hdo b, final niz niz, final eyt c, final ScheduledExecutorService scheduledExecutorService, final cxl cxl) {
        super(scheduledExecutorService);
        this.f = (View$OnClickListener)new cvt(this, 1);
        this.g = (View$OnClickListener)new cvt(this);
        this.h = nii.a;
        this.d = d;
        this.a = a;
        this.j = a.getResources();
        this.c = c;
        njo.o(true);
        this.k = (dlc)((njd)niz).a;
        this.b = b;
        this.e = cxl.k(cww.l);
    }
    
    @Override
    protected final hov d() {
        final hou a = hov.a();
        final hpf a2 = hpg.a();
        a2.b = this.j.getString(2131952597);
        a2.c = this.j.getDrawable(2131231567, (Resources$Theme)null);
        final cvx d = this.d;
        d.getClass();
        a2.g = new cvs(d, 1);
        a2.d(6000L);
        a2.h = new cvr(this, 1);
        a2.d = new cvr(this);
        final cvx d2 = this.d;
        d2.getClass();
        a2.i = new cvs(d2);
        a.a = a2.a();
        return a.a();
    }
    
    @Override
    protected final boolean e(final ljm ljm) {
        if (this.k.e()) {
            return false;
        }
        this.d.d(fja.a(this.k.d()).b);
        return this.d.f();
    }
    
    @Override
    public final void t() {
        super.t();
        this.d.e();
        if (this.h.g() && this.e) {
            ((cvv)this.h.c()).a();
        }
    }
}
