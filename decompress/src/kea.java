import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class kea implements keh
{
    public final Object a;
    public final keb b;
    private final Executor c;
    
    public kea(final Executor c, final keb b) {
        this.a = new Object();
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void a(final keg keg) {
        if (!keg.e() && !((kem)keg).d) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                monitorexit(this.a);
                this.c.execute(new kdz(this, keg));
            }
        }
    }
}
