// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lvh implements luy
{
    private final Object a;
    private volatile lwk b;
    
    public lvh() {
        this.a = new Object();
        this.b = null;
    }
    
    @Override
    public final lwk a() {
        final lwk b;
        if ((b = this.b) == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    this.b = this.b();
                }
            }
        }
        return b;
    }
    
    protected abstract lwk b();
    
    protected abstract void bG();
    
    @Override
    public final void close() {
        final lwk b = this.b;
        if (b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    this.bG();
                    this.b = lwj.a;
                }
            }
        }
        lwt.f(b);
    }
}
