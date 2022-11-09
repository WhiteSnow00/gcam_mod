// 
// Decompiled by Procyon v0.6.0
// 

final class lwy implements Runnable
{
    final /* synthetic */ lva a;
    final /* synthetic */ lxh b;
    final /* synthetic */ lva c;
    final /* synthetic */ lxh d;
    
    public lwy(final lxh d, final lva a, final lxh b, final lva c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final Object a = this.d.a;
        if (a != null) {
            lxh.j(a, this.a, this.b);
            return;
        }
        final lwi b = this.d.b;
        final lva c = this.c;
        final lxh b2 = this.b;
        try {
            b2.k(c.a(b));
        }
        catch (final lwi lwi) {
            b2.l(lwi);
        }
        finally {
            final Throwable t;
            b2.l(lwi.a(t));
        }
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.d);
        final String value2 = String.valueOf(this.a);
        final String value3 = String.valueOf(this.c);
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
