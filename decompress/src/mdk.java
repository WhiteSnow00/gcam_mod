import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mdk extends lvh implements mde
{
    public final mdj a;
    public final AtomicBoolean b;
    
    public mdk(final mde mde) {
        this.b = new AtomicBoolean(true);
        this.a = new mdj(mde);
    }
    
    public mdk(final mdj a) {
        this.b = new AtomicBoolean(true);
        this.a = a;
    }
    
    @Override
    protected final lwk b() {
        this.b.set(false);
        final mdj a = this.a;
        final int decrementAndGet = a.a.decrementAndGet();
        lwk lwk;
        if (decrementAndGet == 0) {
            final boolean c = a.c;
            lwk = a.b.a();
        }
        else {
            if (decrementAndGet < 0) {
                throw new IllegalStateException("Reference count dropped below zero");
            }
            lwk = lwj.a;
        }
        return lwk;
    }
    
    @Override
    public final Object bF() {
        throw null;
    }
    
    @Override
    protected final void bG() {
        this.b.set(false);
        final mdj a = this.a;
        final int decrementAndGet = a.a.decrementAndGet();
        if (decrementAndGet == 0) {
            final boolean c = a.c;
            a.b.close();
            return;
        }
        if (decrementAndGet >= 0) {
            return;
        }
        throw new IllegalStateException("Reference count dropped below zero");
    }
    
    @Override
    public final Object c() {
        if (this.b.get()) {
            return this.a.b.c();
        }
        throw new mdh();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 13);
        sb.append("ref-counted[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
