import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cle implements ckz
{
    private final ckz a;
    private boolean b;
    private final Object c;
    private int d;
    
    public cle(final ckz a) {
        this.d = 2;
        this.b = false;
        this.c = new Object();
        this.a = a;
    }
    
    @Override
    public final oey a() {
        synchronized (this.c) {
            final int d = this.d;
            if (d == 1) {
                return ofi.m(new IllegalStateException("has been closed."));
            }
            if (d == 3) {
                return ofi.m(new IllegalStateException("there is already a snapshot request in flight."));
            }
            njo.o(d == 2);
            this.d = 3;
            final oey a = this.a.a();
            a.d(new cld(this, 1), odx.a);
            return a;
        }
    }
    
    @Override
    public final oey b(final lfu lfu, final kra kra) {
        synchronized (this.c) {
            final int d = this.d;
            boolean b = true;
            if (d == 1) {
                return ofi.m(new IllegalStateException("has been closed."));
            }
            if (d == 3) {
                return ofi.m(new IllegalStateException("there is already a snapshot request in flight."));
            }
            if (d != 2) {
                b = false;
            }
            njo.o(b);
            this.d = 3;
            final oey b2 = this.a.b(lfu, kra);
            b2.d(new cld(this), odx.a);
            return b2;
        }
    }
    
    public final void c() {
        synchronized (this.c) {
            if (this.d != 2) {
                this.d = 2;
                if (this.b) {
                    this.close();
                }
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.c) {
            final int d = this.d;
            if (d == 1) {
                return;
            }
            if (d == 3) {
                this.b = true;
                return;
            }
            this.a.close();
            this.d = 1;
            this.b = false;
        }
    }
}
