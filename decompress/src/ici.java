import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

class ici extends ibw
{
    final /* synthetic */ icm b;
    
    public ici(final icm b) {
        this.b = b;
    }
    
    @Override
    public void a() {
        this.b.l.g();
        final icy l = this.b.l;
        if (l.k.k(cwv.H)) {
            l.H.d();
        }
        else {
            final iec i = l.i;
            final AtomicLong d = i.d;
            final jdv h = i.h;
            d.set(System.currentTimeMillis() - i.c.get() + i.d.get());
            final jdv h2 = i.h;
            long n = System.currentTimeMillis() - i.e.get() - i.d.get();
            final long n2 = i.b.get() - n;
            if (n2 > 0L) {
                final AtomicLong d2 = i.d;
                d2.set(d2.get() - n2);
                n += n2;
            }
            i.c.set(0L);
            i.b(n);
        }
        l.a.set(true);
    }
    
    @Override
    public void b() {
        this.b.i();
    }
    
    @Override
    public final void f() {
        this.b.f.pauseTimelapseRecording();
        this.b.k.t();
        final icy l = this.b.l;
        if (l.k.k(cwv.H)) {
            l.H.c();
        }
        else {
            final iec i = l.i;
            final AtomicLong c = i.c;
            final jdv h = i.h;
            c.set(System.currentTimeMillis());
        }
        l.a.set(false);
    }
    
    @Override
    public final void g() {
        this.b.f.resumeTimelapseRecording();
        this.b.k.x();
    }
}
