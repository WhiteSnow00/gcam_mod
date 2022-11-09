import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class fug implements fus
{
    final /* synthetic */ Object a;
    final /* synthetic */ AtomicBoolean b;
    final /* synthetic */ fus c;
    final /* synthetic */ fuh d;
    
    public fug(final fuh d, final Object a, final AtomicBoolean b, final fus c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        this.d.b.removeCallbacksAndMessages(this.a);
        if (!this.b.getAndSet(true)) {
            this.c.a();
        }
    }
    
    @Override
    public final void b(final Throwable t) {
        this.d.b.removeCallbacksAndMessages(this.a);
        if (!this.b.getAndSet(true)) {
            this.c.b(t);
            return;
        }
        a.m(fuh.a.b(), "HDR+ also failed after timeout", '\u06fd', t);
    }
    
    @Override
    public final void c(final lju lju) {
        this.d.b.removeCallbacksAndMessages(this.a);
        if (!this.b.getAndSet(true)) {
            this.c.c(lju);
            return;
        }
        lju.close();
    }
}
