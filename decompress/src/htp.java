import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htp implements htm
{
    public final htr a;
    public boolean b;
    private final kse c;
    private final hkd d;
    private final Handler e;
    
    public htp(final htr a, final kse c, final kjm kjm, final ewy ewy, final hkd d) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = kpo.d(Looper.getMainLooper());
        egz.d(kjm, ewy, new hto(this));
    }
    
    private final void g(final int n, final float n2) {
        if (this.b) {
            this.a.e(n, n2);
        }
        if (n != 2131886084 && n != 2131886107 && n != 2131886097) {
            return;
        }
        this.e.postDelayed((Runnable)new htn(this), 100L);
    }
    
    @Override
    public final void a() {
        this.a.b();
    }
    
    @Override
    public final void b(final int n) {
        this.g(n, 0.6f);
    }
    
    @Override
    public final void c(final int n) {
        this.g(n, 1.0f);
    }
    
    @Override
    public final void d() {
        this.c.f("Sounds#shutter");
        this.a.a(2131886084);
        this.c.h("Sounds#video_start");
        this.a.a(2131886106);
        this.c.g();
    }
    
    @Override
    public final void e() {
        this.a.c();
    }
    
    public final void f() {
        this.d.d(hjq.h, false);
    }
}
