// 
// Decompiled by Procyon v0.6.0
// 

public final class kkf implements krc
{
    public final Object a;
    public Runnable b;
    private final kkd c;
    private final Runnable d;
    
    public kkf(final kkd c) {
        this.c = c;
        this.a = new Object();
        this.d = new kke(this);
    }
    
    public final void a() {
        synchronized (this.a) {
            this.b = null;
            this.c.b();
        }
    }
    
    public final void b(final Runnable b) {
        synchronized (this.a) {
            this.b = b;
            this.c.execute(this.d);
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b = null;
            }
            monitorexit(this.a);
            this.c.close();
        }
    }
}
