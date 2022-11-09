import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwo implements cwm
{
    private static final nsd b;
    public final eyt a;
    private final Executor c;
    private niz d;
    private niz e;
    private niz f;
    private final int g;
    
    static {
        b = nsd.g("com/google/android/apps/camera/coach/logging/FramingHintLoggingImpl");
    }
    
    public cwo(final int g, final eyt a) {
        this.d = nii.a;
        this.e = nii.a;
        this.f = nii.a;
        this.g = g;
        this.a = a;
        this.c = mcn.h("FramingHintLog");
    }
    
    @Override
    public final void a() {
        synchronized (this) {
            this.d = niz.i(new cwq(this.g, System.currentTimeMillis()));
        }
    }
    
    @Override
    public final void b() {
        synchronized (this) {
            if (this.d.g()) {
                this.a.F(((cwq)this.d.c()).a(System.currentTimeMillis()));
            }
        }
    }
    
    @Override
    public final void c(final nze nze) {
        synchronized (this) {
            if (this.e.g()) {
                ((cwp)this.e.c()).a(nze);
            }
        }
    }
    
    @Override
    public final void d() {
        synchronized (this) {
            if (this.e.g()) {
                ((cwp)this.e.c()).b(System.currentTimeMillis());
                return;
            }
            a.l(cwo.b.b(), "framing hint heed but no hint is showing.", '\u0260');
        }
    }
    
    @Override
    public final void e(final niz niz) {
        synchronized (this) {
            if (this.d.g()) {
                ((cwq)this.d.c()).b();
                final cwp cwp = new cwp(this.g, ((cwq)this.d.c()).a, System.currentTimeMillis(), niz);
                if (this.f.g()) {
                    cwp.a = niz.i((long)this.f.c());
                }
                this.e = niz.i(cwp);
                return;
            }
            a.l(cwo.b.b(), "Log framing shown hint but status info is not available.", '\u0261');
        }
    }
    
    @Override
    public final void f() {
        synchronized (this) {
            if (this.d.g()) {
                ((cwq)this.d.c()).c();
                return;
            }
            a.l(cwo.b.b(), "Update framing hint but status info is not available.", '\u0262');
        }
    }
    
    @Override
    public final void g() {
        synchronized (this) {
            if (this.e.g()) {
                this.f = niz.i(System.currentTimeMillis());
                this.c.execute(new cwn(this, ((cwp)this.e.c()).c(System.currentTimeMillis())));
                this.e = nii.a;
            }
        }
    }
}
