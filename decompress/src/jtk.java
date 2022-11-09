// 
// Decompiled by Procyon v0.6.0
// 

public final class jtk
{
    public jtm a;
    public jtm b;
    public jtd c;
    public int d;
    private final Runnable e;
    
    public jtk() {
        this.e = iey.j;
    }
    
    public final jtl a() {
        final jtm a = this.a;
        final boolean b = true;
        jvu.c(a != null, "Must set register function");
        jvu.c(this.b != null, "Must set unregister function");
        jvu.c(this.c != null && b, "Must set holder");
        jvu.j(this.c.b, "Key must not be null");
        return new jtl(new jti(this, this.c, this.d), new jtx(this), this.e);
    }
}
