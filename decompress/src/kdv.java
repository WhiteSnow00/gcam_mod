import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdv implements keh
{
    public final Object a;
    public final ken b;
    private final Executor c;
    
    public kdv(final Executor c, final ken b) {
        this.a = new Object();
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void a(final keg keg) {
        if (((kem)keg).d) {
            synchronized (this.a) {
                monitorexit(this.a);
                this.c.execute(new kdu(this));
            }
        }
    }
}
