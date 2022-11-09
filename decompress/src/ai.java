// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ai extends ba
{
    public ai(final aq aq) {
        super(aq);
    }
    
    public final void a(final Object o) {
        final afn e = this.e();
        try {
            this.b(e, o);
            e.b();
        }
        finally {
            this.f(e);
        }
    }
    
    protected abstract void b(final afn p0, final Object p1);
    
    public final void c(final Object o) {
        final afn e = this.e();
        try {
            this.b(e, o);
            e.b();
        }
        finally {
            this.f(e);
        }
    }
}
