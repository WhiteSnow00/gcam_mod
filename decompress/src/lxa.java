import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lxa implements Runnable
{
    final /* synthetic */ lwl a;
    final /* synthetic */ Executor b;
    final /* synthetic */ lxh c;
    final /* synthetic */ lwl d;
    final /* synthetic */ lxh e;
    final /* synthetic */ lza f;
    
    public lxa(final lxh e, final lwl a, final Executor b, final lxh c, final lza f, final lwl d, final byte[] array, final byte[] array2) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
    }
    
    @Override
    public final void run() {
        final Object a = this.e.a;
        if (a != null) {
            lxh.n(a, this.a, this.b, this.c);
            return;
        }
        final lwi b = this.e.b;
        final lwl d = this.d;
        final Executor b2 = this.b;
        final lxh c = this.c;
        try {
            d.a(b, b2).c(odx.a, new lxf(c), new lxe(c)).h(lvm.a);
        }
        catch (final lwi lwi) {
            c.l(lwi);
        }
        finally {
            final Throwable t;
            c.l(lwi.a(t));
        }
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.e);
        final String value2 = String.valueOf(this.a);
        final String value3 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 8 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append(value);
        sb.append("then[");
        sb.append(value2);
        sb.append(", ");
        sb.append(value3);
        sb.append("]");
        return sb.toString();
    }
}
