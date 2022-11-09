// 
// Decompiled by Procyon v0.6.0
// 

public final class nuy implements nuo
{
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private volatile nuz e;
    
    public nuy() {
        this("", true, true, false);
    }
    
    public nuy(final String a, final boolean b, final boolean c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final ntl a(final String s) {
        if (this.d && s.contains(".")) {
            final nuz e;
            if ((e = this.e) == null) {
                synchronized (this) {
                    if (this.e == null) {
                        this.e = new nuz(this.a, null, this.b, this.c, false);
                    }
                }
            }
            return e;
        }
        return new nva(this.a, s, this.b, this.c);
    }
}
