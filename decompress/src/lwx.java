// 
// Decompiled by Procyon v0.6.0
// 

final class lwx implements Runnable
{
    final /* synthetic */ lva a;
    final /* synthetic */ lxh b;
    final /* synthetic */ lxh c;
    
    public lwx(final lxh c, final lva a, final lxh b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final Object a = this.c.a;
        if (a != null) {
            lxh.j(a, this.a, this.b);
            return;
        }
        this.b.l(this.c.b);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 6 + String.valueOf(value2).length());
        sb.append(value);
        sb.append("then[");
        sb.append(value2);
        sb.append("]");
        return sb.toString();
    }
}
