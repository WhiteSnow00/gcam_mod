import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnf
{
    public final lfo a;
    public final Object b;
    public ofn c;
    private final deq d;
    private final Executor e;
    
    public bnf(final deq d, final lfo a, final Executor e) {
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = new Object();
    }
    
    public final oey a() {
        Object o = this.b;
        synchronized (o) {
            boolean b;
            if (this.c == null) {
                this.c = ofn.f();
                b = true;
            }
            else {
                b = false;
            }
            final ofn c = this.c;
            monitorexit(o);
            if (b) {
                o = this.d.b();
                ofi.h((oey)o).c(new bnd(this, (oey)o), this.e);
            }
            return c;
        }
    }
}
