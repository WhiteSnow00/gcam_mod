import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfb implements gfg
{
    public final hii a;
    private final gfg b;
    
    public gfb(final gfg b, final hii a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final klj a() {
        return this.b.a();
    }
    
    @Override
    public final klj b() {
        return this.b.b();
    }
    
    @Override
    public final void c(final gff gff, final gen gen) {
        final hhy b = gen.b;
        try {
            final hii a = this.a;
            synchronized (a) {
                if (!a.c) {
                    a.b.add(b);
                    monitorexit(a);
                    b.p().d(new gfa(this, b), odx.a);
                    this.b.c(gff, gen);
                    return;
                }
                throw new IllegalStateException("Attempting to add shot after pipeline was shutdown!");
            }
        }
        catch (final IllegalStateException ex) {
            throw new kuw("ShotPipeline not available", ex);
        }
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("delegate", this.b);
        return c.toString();
    }
}
