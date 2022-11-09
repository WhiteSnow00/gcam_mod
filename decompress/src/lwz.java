import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lwz implements Runnable
{
    final /* synthetic */ lwl a;
    final /* synthetic */ Executor b;
    final /* synthetic */ lxh c;
    final /* synthetic */ lxh d;
    final /* synthetic */ lza e;
    
    public lwz(final lxh d, final lwl a, final Executor b, final lxh c, final lza e, final byte[] array, final byte[] array2) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
    }
    
    @Override
    public final void run() {
        final Object a = this.d.a;
        if (a != null) {
            lxh.n(a, this.a, this.b, this.c);
            return;
        }
        this.c.l(this.d.b);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.d);
        final String value2 = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 6 + String.valueOf(value2).length());
        sb.append(value);
        sb.append("then[");
        sb.append(value2);
        sb.append("]");
        return sb.toString();
    }
}
