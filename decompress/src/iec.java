import android.text.format.DateUtils;
import android.content.Context;
import android.view.View;
import java.util.Timer;
import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iec
{
    public final AtomicLong a;
    public final AtomicLong b;
    public final AtomicLong c;
    public final AtomicLong d;
    public final AtomicLong e;
    public final idy f;
    public final Resources g;
    public final jdv h;
    public ixx i;
    public Timer j;
    public View k;
    public boolean l;
    public boolean m;
    private final kjm n;
    
    public iec(final Context context, final idy f, final kjm n, final jdv h) {
        this.a = new AtomicLong(0L);
        this.b = new AtomicLong(0L);
        this.c = new AtomicLong(0L);
        this.d = new AtomicLong(0L);
        this.e = new AtomicLong(0L);
        this.f = f;
        this.n = n;
        this.h = h;
        this.g = context.getResources();
    }
    
    public final void a() {
        this.l = false;
        this.m = false;
        this.b.set(0L);
        this.a.set(0L);
        final idy f = this.f;
        f.a();
        f.d(DateUtils.formatElapsedTime(0L));
        f.c(DateUtils.formatElapsedTime(0L));
        this.e.set(0L);
        this.d.set(0L);
        this.c.set(0L);
    }
    
    public final void b(final long n) {
        this.n.b(new iea(this, n));
    }
}
