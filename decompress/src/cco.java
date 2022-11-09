import java.util.concurrent.Executor;
import com.integrity.annotations.PaiConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

final class cco implements oen
{
    final /* synthetic */ ofn a;
    final /* synthetic */ ccs b;
    
    public cco(final ccs b, final ofn a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        this.a.a(t);
    }
    
    @PaiConfiguration(continueOnFailure = false, modeFallback = false)
    public void c(final Void void1) {
        synchronized (this.b.f) {
            this.b.v.i(hwm.d);
            this.b.n.a(cfd.e);
            final ccs b = this.b;
            b.g.b(b.b().b);
            final ccs b2 = this.b;
            b2.g.f = niz.i(b2.m.d);
            this.b.g.e();
            final ccs b3 = this.b;
            if (b3.h.i()) {
                ofi.w(b3.q.b(b3.m.y, b3.l.f()), new ccp(b3, 1), odx.a);
            }
            if (this.b.t.g()) {
                ((buk)this.b.t.c()).b();
            }
            final cxo a = cwv.a;
            this.b.j(2);
            this.a.o(null);
        }
    }
}
