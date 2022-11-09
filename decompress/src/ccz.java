import java.util.concurrent.Executor;
import java.util.concurrent.ExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccz implements krc
{
    public static final nsd a;
    public oey b;
    public cil c;
    public final Object d;
    private final cip e;
    private final cfm f;
    private final cfs g;
    private final kse h;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/VideoRecorderProvider");
    }
    
    public ccz(final cbn cbn, final cfm f, final cfs g, final kse h) {
        this.d = new Object();
        this.e = cbn.c;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    private final void c() {
        synchronized (this.d) {
            final cil c = this.c;
            if (c != null) {
                c.close();
                this.c = null;
            }
            final oey b = this.b;
            if (b != null) {
                b.cancel(true);
                this.b = null;
            }
        }
    }
    
    public final cil a(final cfo cfo) {
        Label_0106: {
            try {
                this.h.f("VRP#getNew");
                synchronized (this.d) {
                    final cil cil = this.b(cfo).get();
                    monitorexit(this.d);
                    this.h.g();
                    return cil;
                }
            }
            catch (final ExecutionException ex) {}
            catch (final InterruptedException ex2) {}
            finally {
                break Label_0106;
            }
            ccz.a.b().h((Throwable)cfo).E(371).o("Error creating video recorder: ");
            this.h.g();
            return null;
        }
        this.h.g();
    }
    
    final oey b(final cfo cfo) {
        synchronized (this.d) {
            this.c();
            final cip e = this.e;
            final cfs g = this.g;
            final cfg a = this.f.a();
            Object o = e.o;
            synchronized (o) {
                if (e.r) {
                    e.r = false;
                    e.j.a(cic.d).c(e);
                    e.q = ((cja)e.b).a();
                }
                monitorexit(o);
                o = new cio(e, g, cfo, a);
                ofi.w(this.b = ofi.r((odo)o, e.h.a()), new ccy(this), odx.a);
                return this.b;
            }
        }
    }
    
    @Override
    public final void close() {
        this.c();
    }
}
