import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mdc implements mde
{
    private final AtomicReference a;
    private final lxh b;
    private final lwk c;
    
    public mdc(final Object o) {
        final lxh i = lxh.i();
        this.b = i;
        this.c = lwk.i(i);
        o.getClass();
        this.a = new AtomicReference((V)o);
    }
    
    @Override
    public final lwk a() {
        final Object d = this.d();
        if (d != null) {
            final lxh b = this.b;
            ((luy)d).a().c(odx.a, new lwp(b), new lwo(b)).h(lvm.a);
        }
        return this.c;
    }
    
    @Override
    public final Object bF() {
        final Object d = this.d();
        if (d != null) {
            this.b.k(luz.a);
            lwt.f(this.c);
            return d;
        }
        throw new mdh();
    }
    
    @Override
    public final Object c() {
        final Object value = this.a.get();
        if (value != null) {
            return value;
        }
        throw new mdh();
    }
    
    @Override
    public final void close() {
        lwt.f(this.a());
    }
    
    protected final Object d() {
        return this.a.getAndSet(null);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a.get());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 14);
        sb.append("single-owner[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
