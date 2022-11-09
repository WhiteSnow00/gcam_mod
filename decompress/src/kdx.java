import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class kdx implements keh
{
    public final Object a;
    public final kdy b;
    private final Executor c;
    
    public kdx(final Executor c, final kdy b) {
        this.a = new Object();
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void a(final keg keg) {
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            monitorexit(this.a);
            this.c.execute(new kdw(this, keg));
        }
    }
}
