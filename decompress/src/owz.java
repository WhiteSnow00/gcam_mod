import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class owz implements oxb
{
    public static owz a(final Callable callable) {
        phn.g(callable, "callable is null");
        final pca pca = new pca(callable);
        pip.m();
        return pca;
    }
    
    @Override
    public final void b(final oxa oxa) {
        phn.g(oxa, "observer is null");
        final oyd q = pip.q;
        phn.g(oxa, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            this.c(oxa);
        }
        catch (final NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            psn.e(t);
            final NullPointerException ex2 = new NullPointerException("subscribeActual failed");
            ex2.initCause(t);
            throw ex2;
        }
    }
    
    protected abstract void c(final oxa p0);
}
