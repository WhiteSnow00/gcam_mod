// 
// Decompiled by Procyon v0.6.0
// 

public abstract class owt implements owv
{
    public static owt a() {
        final owt a = ozr.a;
        pip.i();
        return a;
    }
    
    public static owt d(final psq psq) {
        final ozu ozu = new ozu(psq);
        pip.i();
        return ozu;
    }
    
    public static owt e(final owv... array) {
        final ozy ozy = new ozy(array);
        pip.i();
        return ozy;
    }
    
    private final owt k(final oye oye, final oyb oyb) {
        final paa paa = new paa(this, oye, oyb);
        pip.i();
        return paa;
    }
    
    public final owt b(final oyb oyb) {
        return this.k(oyw.d, oyb);
    }
    
    public final owt c(final oye oye) {
        return this.k(oye, oyw.c);
    }
    
    public final owx f() {
        final pab pab = new pab(this);
        pip.l();
        return pab;
    }
    
    public final oxk g(final oxm oxm) {
        final peo peo = new peo(oxm, this);
        pip.o();
        return peo;
    }
    
    public final oxk h(final Object o) {
        phn.g(o, "completionValue is null");
        final pad pad = new pad(this, o);
        pip.o();
        return pad;
    }
    
    @Override
    public final void i(final owu owu) {
        phn.g(owu, "observer is null");
        try {
            final oyd t = pip.t;
            phn.g(owu, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            this.j(owu);
        }
        catch (final NullPointerException ex) {
            throw ex;
        }
        finally {
            final Throwable t2;
            psn.e(t2);
            pip.g(t2);
            final NullPointerException ex2 = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            ex2.initCause(t2);
            throw ex2;
        }
    }
    
    protected abstract void j(final owu p0);
}
