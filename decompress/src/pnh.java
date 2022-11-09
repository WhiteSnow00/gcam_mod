// 
// Decompiled by Procyon v0.6.0
// 

public class pnh extends ppb implements pou, pjl, pob
{
    private final pjq a;
    
    public pnh(final pjq pjq) {
        pjq.getClass();
        this.A((pou)pjq.b(pou.b));
        this.a = pjq.ch(this);
    }
    
    @Override
    public final pjq d() {
        return this.a;
    }
    
    @Override
    public final void e(Object w) {
        w = this.w(plv.e(w));
        if (w == ppc.b) {
            return;
        }
        this.j(w);
    }
    
    @Override
    protected final String h() {
        final StringBuilder sb = new StringBuilder();
        sb.append(poe.a(this));
        sb.append(" was cancelled");
        return sb.toString();
    }
    
    @Override
    public final String i() {
        final String a = pnv.a(this.a);
        if (a != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append('\"');
            sb.append(a);
            sb.append("\":");
            sb.append(poe.a(this));
            return sb.toString();
        }
        return poe.a(this);
    }
    
    protected void j(final Object o) {
        this.f(o);
    }
    
    @Override
    public final void k(final Throwable t) {
        poe.d(this.a, t);
    }
    
    @Override
    protected final void l(final Object o) {
        if (o instanceof pnq) {
            final pnq pnq = (pnq)o;
            final Throwable b = pnq.b;
            pnq.a.a();
        }
    }
}
