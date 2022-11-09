import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kmg implements klj
{
    private final klj a;
    private final klj b;
    
    protected kmg(final klj a) {
        this.a = a;
        this.b = kld.c(new kmf(this, a));
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.b.a(kri, executor);
    }
    
    @Override
    public final Object aQ() {
        return this.b.aQ();
    }
    
    protected abstract Object c(final Object p0);
    
    public final Object h(final Object o) {
        if (o == null) {
            final String value = String.valueOf(this.a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 29);
            sb.append("Input: ");
            sb.append(value);
            sb.append(" returned a null value");
            throw new NullPointerException(sb.toString());
        }
        final Object c = this.c(o);
        if (c != null) {
            return c;
        }
        final String value2 = String.valueOf(o);
        final String name = this.getClass().getName();
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 58 + String.valueOf(name).length());
        sb2.append("Transforming input value: ");
        sb2.append(value2);
        sb2.append(" resulted in a null output for: ");
        sb2.append(name);
        throw new NullPointerException(sb2.toString());
    }
}
