// 
// Decompiled by Procyon v0.6.0
// 

final class lvu implements Runnable
{
    final /* synthetic */ lwi a;
    final /* synthetic */ lvv b;
    
    public lvu(final lvv b, final lwi a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            final lvv b = this.b;
            b.d.a(this.a, b.e, b.a);
        }
        finally {
            final lwi lwi;
            lwi a = lwi;
            if (lwi != this.a) {
                a = lwi.a(lwi);
                a.addSuppressed(this.a);
            }
            this.b.a(a);
        }
    }
    
    @Override
    public final String toString() {
        return this.b.d.toString();
    }
}
