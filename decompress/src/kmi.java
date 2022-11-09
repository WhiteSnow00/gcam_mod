import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kmi implements klv
{
    private final klv a;
    private final klj b;
    
    protected kmi(final klv a) {
        this.a = a;
        this.b = klq.j(a, new kmh(this));
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.b.a(kri, executor);
    }
    
    @Override
    public Object aQ() {
        return this.b.aQ();
    }
    
    @Override
    public final void aR(final Object o) {
        final klv a = this.a;
        o.getClass();
        final Object c = this.c(o);
        if (c != null) {
            a.aR(c);
            return;
        }
        final String value = String.valueOf(o);
        final String name = this.getClass().getName();
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 64 + String.valueOf(name).length());
        sb.append("Transforming output value: ");
        sb.append(value);
        sb.append(" resulted in a null input value for: ");
        sb.append(name);
        throw new NullPointerException(sb.toString());
    }
    
    protected abstract Object b(final Object p0);
    
    protected abstract Object c(final Object p0);
}
