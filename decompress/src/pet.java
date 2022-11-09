import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pet extends oxk
{
    final Callable a;
    
    public pet(final Callable a) {
        this.a = a;
    }
    
    @Override
    protected final void n(final oxl oxl) {
        final Throwable t;
        try {
            phn.g(((oyt)this.a).a, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        finally {
            psn.e(t);
        }
        oyk.h(t, oxl);
    }
}
