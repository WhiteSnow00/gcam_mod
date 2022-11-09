import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pai extends oxk
{
    public final owx a;
    public final Callable b;
    public final oyc c;
    
    public pai(final owx a, final Callable b, final oyc c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    protected final void n(final oxl oxl) {
        try {
            final Object call = this.b.call();
            phn.g(call, "The initialSupplier returned a null value");
            this.a.i(new pah(oxl, call, this.c));
        }
        finally {
            final Throwable t;
            oyk.h(t, oxl);
        }
    }
}
