import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kiz implements krc
{
    public final krc a;
    public int b;
    public final kkf c;
    public final Object d;
    public final Runnable e;
    public boolean f;
    
    public kiz(final krc a, final Executor executor, final kkf c) {
        this.f = false;
        this.a = a;
        this.c = c;
        this.d = new Object();
        this.b = 0;
        this.e = new kja(new kix(this), executor);
    }
    
    public final krc a() {
        synchronized (this.d) {
            if (this.f) {
                return null;
            }
            ++this.b;
            final kkf c = this.c;
            if (c != null) {
                c.a();
            }
            monitorexit(this.d);
            return new kiy(this);
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            this.f = true;
            final kkf c = this.c;
            if (c != null) {
                c.a();
            }
            monitorexit(this.d);
            this.a.close();
        }
    }
}
