import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class ked implements keh
{
    public final Object a;
    public final kee b;
    private final Executor c;
    
    public ked(final Executor c, final kee b) {
        this.a = new Object();
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void a(final keg keg) {
        if (keg.e()) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                monitorexit(this.a);
                this.c.execute(new kec(this, keg));
            }
        }
    }
}
