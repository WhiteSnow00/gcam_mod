// 
// Decompiled by Procyon v0.6.0
// 

final class lxb implements Runnable
{
    private final Object a;
    private final lxh b;
    private final lva c;
    private final /* synthetic */ int d;
    
    public lxb(final Object a, final lva c, final lxh b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public lxb(final Object a, final lva c, final lxh b, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        switch (this.d) {
            default: {
                final Object a = this.a;
                final lva c = this.c;
                final lxh b = this.b;
                try {
                    b.k(c.a(a));
                    return;
                }
                catch (final lwi lwi) {
                    b.l(lwi);
                    return;
                }
                finally {
                    final Throwable t;
                    b.l(lwi.a(t));
                    return;
                }
                break;
            }
            case 0: {
                lxh.j(this.a, this.c, this.b);
            }
        }
    }
    
    @Override
    public final String toString() {
        switch (this.d) {
            default: {
                return this.c.toString();
            }
            case 0: {
                return this.c.toString();
            }
        }
    }
}
