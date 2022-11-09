// 
// Decompiled by Procyon v0.6.0
// 

public final class igp implements krc
{
    public final dpy a;
    private final dtb b;
    private final dqg c;
    
    public igp(final dtb b, final dqg c, final dpy a) {
        this.b = b;
        this.c = c;
        this.a = a;
        c.e("tracking-meta");
    }
    
    public final void a() {
        synchronized (this) {
            this.b.c();
        }
    }
    
    public final boolean b(final kre kre, final long n) {
        synchronized (this) {
            final kre kre2 = new kre(kre.a, kre.b);
            if (!this.b.e()) {
                this.b.f(kre2, "trk-gyro-session");
            }
            if (!this.b.e()) {
                return false;
            }
            this.b.b(n, this.a.a(n));
            return true;
        }
    }
    
    public final float[] c(final long n) {
        synchronized (this) {
            if (!this.b.e()) {
                monitorexit(this);
                return new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f };
            }
            return this.b.b(n, this.a.a(n)).get(0).d();
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.c.f("tracking-meta");
        }
    }
}
