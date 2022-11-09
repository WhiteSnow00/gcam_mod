// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pnw extends pjg implements pjm
{
    public static final pjh c;
    
    static {
        c = new pjh(pjm.a, pmt.c);
    }
    
    public pnw() {
        super(pjm.a);
    }
    
    @Override
    public final pjn b(final pjo pjo) {
        final boolean b = pjo instanceof pjh;
        final pjn pjn = null;
        if (b) {
            final pjh pjh = (pjh)pjo;
            pjn a = pjn;
            if (pjh.b(this.c())) {
                a = pjh.a(this);
                if (!(a instanceof pjn)) {
                    return null;
                }
            }
            return a;
        }
        if (pjm.a == pjo) {
            return this;
        }
        return null;
    }
    
    @Override
    public final pjq cg(final pjo pjo) {
        if (pjo instanceof pjh) {
            final pjh pjh = (pjh)pjo;
            if (!pjh.b(this.c()) || pjh.a(this) == null) {
                return this;
            }
        }
        else if (pjm.a != pjo) {
            return this;
        }
        return pjr.a;
        a = this;
        return a;
    }
    
    public abstract void cj(final pjq p0, final Runnable p1);
    
    @Override
    public final pjl f(final pjl pjl) {
        return new ppq(this, pjl);
    }
    
    @Override
    public final void g(final pjl pjl) {
        final ppq ppq = (ppq)pjl;
        while (ppq.d.a == ppr.b) {}
        Object a;
        if (!((a = ppq.d.a) instanceof pnk)) {
            a = null;
        }
        if (a == null) {
            return;
        }
        throw null;
    }
    
    public boolean i(final pjq pjq) {
        pjq.getClass();
        return true;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(poe.a(this));
        sb.append('@');
        sb.append(poe.b(this));
        return sb.toString();
    }
}
