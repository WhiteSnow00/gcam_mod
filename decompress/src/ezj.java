import android.content.res.Resources$Theme;
import android.content.res.Resources;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezj implements hpc
{
    public final AtomicBoolean a;
    public hph b;
    public hpg c;
    public final flo d;
    public final ScheduledExecutorService e;
    public final hkg f;
    public final bxu g;
    public boolean h;
    public ScheduledFuture i;
    public boolean j;
    private final Resources k;
    private final duq l;
    private krc m;
    private final duo n;
    
    public ezj(final Resources k, final flo d, final ScheduledExecutorService e, final duq l, final hkg f, final bxu g) {
        this.n = new ezi(this);
        this.k = k;
        this.d = d;
        this.e = e;
        this.a = new AtomicBoolean(false);
        this.l = l;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void a() {
        final ScheduledFuture i = this.i;
        if (i != null) {
            i.cancel(true);
        }
    }
    
    @Override
    public final void b(final hph b) {
        this.b = b;
        final hpf a = hpg.a();
        a.b = this.k.getString(2131951755);
        a.c = this.k.getDrawable(2131231444, (Resources$Theme)null);
        a.h = new ezg(this, 1);
        a.d = new ezg(this);
        a.g = new ezg(this, 2);
        this.c = a.a();
    }
    
    @Override
    public final void t() {
        this.a.set(false);
        try (final krc m = this.m) {}
    }
    
    @Override
    public final void u() {
        this.m = this.l.d(this.n);
    }
}
