import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozq extends owt
{
    final Callable a;
    
    public ozq(final Callable a) {
        this.a = a;
    }
    
    @Override
    protected final void j(final owu owu) {
        try {
            final owv owv = this.a.call();
            phn.g(owv, "The completableSupplier returned a null CompletableSource");
            owv.i(owu);
        }
        finally {
            final Throwable t;
            psn.e(t);
            oyk.f(t, owu);
        }
    }
}
