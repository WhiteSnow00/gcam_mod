import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pjk implements Serializable, pjq
{
    private final pjq a;
    private final pjn b;
    
    public pjk(final pjq a, final pjn b) {
        a.getClass();
        b.getClass();
        this.a = a;
        this.b = b;
    }
    
    private final int c() {
        int n = 2;
        pjk pjk = this;
        while (true) {
            pjq a;
            if (!((a = pjk.a) instanceof pjk)) {
                a = null;
            }
            pjk = (pjk)a;
            if (pjk == null) {
                break;
            }
            ++n;
        }
        return n;
    }
    
    private final boolean f(final pjn pjn) {
        return plr.b(this.b(pjn.c()), pjn);
    }
    
    private final Object writeReplace() {
        final int c = this.c();
        final pjq[] array = new pjq[c];
        final plt plt = new plt();
        plt.a = 0;
        this.a(piu.a, new pjj(array, plt));
        if (plt.a == c) {
            return new pji(array);
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    @Override
    public final Object a(final Object o, final plc plc) {
        return plc.a(this.a.a(o, plc), this.b);
    }
    
    @Override
    public final pjn b(final pjo pjo) {
        pjk pjk = this;
        while (true) {
            final pjn b = pjk.b.b(pjo);
            if (b != null) {
                return b;
            }
            final pjq a = pjk.a;
            if (!(a instanceof pjk)) {
                return a.b(pjo);
            }
            pjk = (pjk)a;
        }
    }
    
    @Override
    public final pjq cg(final pjo pjo) {
        if (this.b.b(pjo) != null) {
            return this.a;
        }
        final pjq cg = this.a.cg(pjo);
        Object b;
        if (cg != this.a) {
            if (cg == pjr.a) {
                b = this.b;
            }
            else {
                b = new pjk(cg, this.b);
            }
        }
        else {
            b = this;
        }
        return (pjq)b;
    }
    
    @Override
    public final pjq ch(final pjq pjq) {
        pjq.getClass();
        return pjv.g(this, pjq);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this != o) {
            if (o instanceof pjk) {
                final pjk pjk = (pjk)o;
                if (pjk.c() == this.c()) {
                    pjk pjk2 = this;
                    while (pjk.f(pjk2.b)) {
                        final pjq a = pjk2.a;
                        if (a instanceof pjk) {
                            pjk2 = (pjk)a;
                        }
                        else {
                            if (a == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            }
                            if (pjk.f((pjn)a)) {
                                return b;
                            }
                            break;
                        }
                    }
                    return false;
                }
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append((String)this.a("", pjp.b));
        sb.append("]");
        return sb.toString();
    }
}
