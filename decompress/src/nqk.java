// 
// Decompiled by Procyon v0.6.0
// 

public final class nqk extends nnh
{
    static final nqk a;
    final transient Object[] b;
    public final transient int c;
    public final transient nqk d;
    private final transient Object e;
    private final transient int f;
    
    static {
        a = new nqk();
    }
    
    private nqk() {
        this.e = null;
        this.b = new Object[0];
        this.f = 0;
        this.c = 0;
        this.d = this;
    }
    
    private nqk(final Object e, final Object[] b, final int c, final nqk d) {
        this.e = e;
        this.b = b;
        this.f = 1;
        this.c = c;
        this.d = d;
    }
    
    public nqk(final Object[] b, final int c) {
        this.b = b;
        this.c = c;
        this.f = 0;
        int b2;
        if (c >= 2) {
            b2 = noi.B(c);
        }
        else {
            b2 = 0;
        }
        this.e = nqq.f(b, c, b2, 0);
        this.d = new nqk(nqq.f(b, c, b2, 1), b, c, this);
    }
    
    @Override
    public final nnh a() {
        return this.d;
    }
    
    @Override
    public final noi bP() {
        return new nqn(this, this.b, this.f, this.c);
    }
    
    @Override
    public final noi bQ() {
        return new nqo(this, new nqp(this.b, this.f, this.c));
    }
    
    @Override
    public final boolean bS() {
        return false;
    }
    
    @Override
    public final Object get(final Object o) {
        return nqq.g(this.e, this.b, this.c, this.f, o);
    }
    
    public final int size() {
        return this.c;
    }
}
