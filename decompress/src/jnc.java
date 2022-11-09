// 
// Decompiled by Procyon v0.6.0
// 

public final class jnc
{
    private final Object a;
    private final Object b;
    
    private jnc(final Object a) {
        this.b = new Object();
        this.a = a;
    }
    
    static jnc b(final Object o) {
        return new jnc(o);
    }
    
    public final Object a() {
        synchronized (this.b) {
            monitorexit(this.b);
            return this.a;
        }
    }
}
