import java.util.TimerTask;
import android.content.Context;
import java.util.Timer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvu implements krc
{
    public final efm a;
    public final irf b;
    public final kjm c;
    public final Object d;
    public Boolean e;
    public boolean f;
    public int g;
    private final Timer h;
    
    public gvu(final efm a, final kjm c, final Context e, final Timer h, final cxl cxl) {
        this.d = new Object();
        this.e = false;
        this.f = true;
        this.g = 1;
        this.a = a;
        this.c = c;
        this.h = h;
        final irg irg = new irg();
        irg.d = e.getResources().getString(2131952430);
        irg.e = e;
        irg.a = true;
        irg.h = 5;
        irg.g = cxl.k(cxr.at);
        this.b = irg.a();
    }
    
    public final void a() {
        if (this.g != 1) {
            this.g = 1;
            this.b();
        }
    }
    
    public final void b() {
        this.a.h(this.b);
    }
    
    public final void c(final long n) {
        synchronized (this.d) {
            if (this.f) {
                this.h.schedule(new gvt(this), n);
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.d) {
            this.h.cancel();
            this.f = false;
            this.a();
        }
    }
}
