import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class hjk implements klv
{
    protected final hjx a;
    protected final String b;
    
    public hjk(final hjx a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        kri.getClass();
        executor.getClass();
        final hjj hjj = new hjj(this, kri, executor);
        this.a.f(hjj);
        hjj.a(this.b);
        return hjj;
    }
    
    @Override
    public final Object aQ() {
        final Object c = this.c();
        if (c == null) {
            final String value = String.valueOf(this.b);
            String concat;
            if (value.length() != 0) {
                concat = "Null value for setting: ".concat(value);
            }
            else {
                concat = new String("Null value for setting: ");
            }
            throw new NullPointerException(concat);
        }
        return c;
    }
    
    protected abstract Object c();
}
