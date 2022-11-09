import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nhf implements nhr
{
    private final nhr a;
    private final UUID b;
    private final String c;
    
    public nhf(final String c, final UUID b) {
        c.getClass();
        this.c = c;
        this.a = null;
        this.b = b;
    }
    
    public nhf(final String c, final nhr a) {
        c.getClass();
        this.c = c;
        this.a = a;
        this.b = a.c();
    }
    
    @Override
    public final nhr a() {
        return this.a;
    }
    
    @Override
    public final String b() {
        return this.c;
    }
    
    @Override
    public final UUID c() {
        return this.b;
    }
    
    @Override
    public final void close() {
        nhz.e(this);
    }
    
    @Override
    public final String toString() {
        return nhz.d(this);
    }
}
