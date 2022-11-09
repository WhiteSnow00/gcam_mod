import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pck extends AtomicReference implements oxd, oxp
{
    private static final long serialVersionUID = -3434801548987643227L;
    final oxg a;
    
    public pck(final oxg a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        throw null;
    }
    
    @Override
    public final void b(final Throwable t) {
        Throwable t2;
        if (t == null) {
            t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        else {
            t2 = t;
        }
        if (!this.ca()) {
            try {
                this.a.b(t2);
                return;
            }
            finally {
                oyj.g(this);
            }
        }
        pip.g(t);
    }
    
    @Override
    public final void bX() {
        oyj.g(this);
    }
    
    @Override
    public final void c(final Object o) {
        if (!this.ca()) {
            this.a.e(o);
        }
    }
    
    @Override
    public final boolean ca() {
        return oyj.c(this.get());
    }
    
    @Override
    public final String toString() {
        return String.format("%s{%s}", this.getClass().getSimpleName(), super.toString());
    }
}
