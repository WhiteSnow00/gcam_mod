import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class pbg extends AtomicInteger implements owy
{
    private static final long serialVersionUID = -7098360935104053232L;
    final psr a;
    final phd b;
    final psq c;
    long d;
    long e;
    
    public pbg(final psr a, final phd b, final psq c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = Long.MAX_VALUE;
    }
    
    @Override
    public final void bY(final pss pss) {
        this.b.i(pss);
    }
    
    @Override
    public final void cc() {
        final long d = this.d;
        if (d != Long.MAX_VALUE) {
            this.d = -1L + d;
        }
        if (d != 0L) {
            this.d();
            return;
        }
        this.a.cc();
    }
    
    @Override
    public final void cd(final Throwable t) {
        this.a.cd(t);
    }
    
    @Override
    public final void ce(final Object o) {
        ++this.e;
        this.a.ce(o);
    }
    
    final void d() {
        if (this.getAndIncrement() == 0) {
            int addAndGet = 1;
            while (!this.b.j) {
                final long e = this.e;
                if (e != 0L) {
                    this.e = 0L;
                    this.b.h(e);
                }
                this.c.j(this);
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
    }
}
