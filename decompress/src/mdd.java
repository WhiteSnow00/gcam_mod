import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class mdd implements mde
{
    private final AtomicReference a;
    
    public mdd(final Object o) {
        o.getClass();
        this.a = new AtomicReference((V)o);
    }
    
    @Override
    public final lwk a() {
        this.close();
        return lwj.a;
    }
    
    protected abstract void b(final Object p0);
    
    @Override
    public final Object bF() {
        throw null;
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
        final Object andSet = this.a.getAndSet(null);
        if (andSet != null) {
            this.b(andSet);
        }
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
