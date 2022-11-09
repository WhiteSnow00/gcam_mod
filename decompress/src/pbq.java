import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pbq extends pae
{
    final oyd c;
    final Callable d;
    
    public pbq(final owx owx, final Callable d, final oyd c) {
        super(owx);
        this.c = c;
        this.d = d;
    }
    
    @Override
    protected final void k(final psr psr) {
        try {
            final Object a = ((oyt)this.d).a;
            phn.g(a, "The seed supplied is null");
            this.b.i(new pbp(psr, this.c, a, owx.a));
        }
        finally {
            final Throwable t;
            psn.e(t);
            phb.f(t, psr);
        }
    }
}
