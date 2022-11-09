import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oxk implements oxm
{
    public static oxk g(final Throwable t) {
        phn.g(t, "exception is null");
        final pet pet = new pet(oyw.a(t));
        pip.o();
        return pet;
    }
    
    public static oxk i(final Callable callable) {
        phn.g(callable, "callable is null");
        final pfb pfb = new pfb(callable);
        pip.o();
        return pfb;
    }
    
    public static oxk j(final Object o) {
        phn.g(o, "item is null");
        final pfc pfc = new pfc(o);
        pip.o();
        return pfc;
    }
    
    public static oxk l(final oxm oxm, final oxm oxm2, final oyd oyd) {
        final pfp pfp = new pfp(new oxm[] { oxm, oxm2 }, new oyn(oyd));
        pip.o();
        return pfp;
    }
    
    public final owt a(final oyf oyf) {
        final pey pey = new pey(this, oyf);
        pip.i();
        return pey;
    }
    
    public final owt e() {
        final ozw ozw = new ozw(this);
        pip.i();
        return ozw;
    }
    
    public final owx f() {
        if (this instanceof pai) {
            final pai pai = (pai)this;
            final pag pag = new pag(pai.a, pai.b, pai.c);
            pip.l();
            return pag;
        }
        final pfm pfm = new pfm(this);
        pip.l();
        return pfm;
    }
    
    public final oxk h(final oyf oyf) {
        final pew pew = new pew(this, oyf);
        pip.o();
        return pew;
    }
    
    public final oxk k(final oyf oyf) {
        final pfe pfe = new pfe(this, oyf);
        pip.o();
        return pfe;
    }
    
    @Override
    public final void m(final oxl oxl) {
        phn.g(oxl, "observer is null");
        final oyd s = pip.s;
        phn.g(oxl, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            this.n(oxl);
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
    
    protected abstract void n(final oxl p0);
}
