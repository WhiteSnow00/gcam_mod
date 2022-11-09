// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oxc implements oxf
{
    public static oxc a(final oxe oxe) {
        final pcm pcm = new pcm(oxe);
        pip.k();
        return pcm;
    }
    
    public final oxc cf(final oxj oxj) {
        phn.g(oxj, "scheduler is null");
        final pdr pdr = new pdr(this, oxj);
        pip.k();
        return pdr;
    }
    
    public final oxc d(final oxj oxj) {
        final int a = owx.a;
        phn.h(a, "bufferSize");
        final pdb pdb = new pdb(this, oxj, a);
        pip.k();
        return pdb;
    }
    
    @Override
    public final void f(final oxg oxg) {
        phn.g(oxg, "observer is null");
        try {
            final oyd r = pip.r;
            phn.g(oxg, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.g(oxg);
        }
        catch (final NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t;
            psn.e(t);
            pip.g(t);
            final NullPointerException ex2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            ex2.initCause(t);
            throw ex2;
        }
    }
    
    protected abstract void g(final oxg p0);
    
    public final owx h() {
        final paw paw = new paw(this);
        final int a = owx.a;
        phn.h(a, "capacity");
        final pbb pbb = new pbb(paw, a);
        pip.l();
        return pbb;
    }
    
    public final oxc i(final oye oye, final oye oye2) {
        final pcq pcq = new pcq(this, oye, oye2);
        pip.k();
        return pcq;
    }
    
    public final void j(final oye oye, final oye oye2) {
        phn.g(oye2, "onError is null");
        this.f(new ozj(oye, oye2));
    }
}
