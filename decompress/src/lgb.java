// 
// Decompiled by Procyon v0.6.0
// 

public final class lgb extends ljr
{
    private int a;
    
    public lgb(final lju lju) {
        this(lju, 1);
    }
    
    public lgb(final lju lju, final int a) {
        super(lju);
        njo.e(a > 0, "Initial reference count must be greater than zero!");
        this.a = a;
    }
    
    @Override
    public final void close() {
        this.l();
    }
    
    public final lju k() {
        synchronized (this) {
            final int a = this.a;
            if (a > 0) {
                this.a = a + 1;
                return new lgc(this);
            }
            return null;
        }
    }
    
    public final void l() {
        synchronized (this) {
            int a = this.a;
            if (a > 0) {
                --a;
                this.a = a;
                monitorexit(this);
                if (a == 0) {
                    super.close();
                }
            }
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final niy c = nfa.c(this);
            c.e("refCount", this.a);
            c.a(super.toString());
            return c.toString();
        }
    }
}
