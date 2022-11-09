// 
// Decompiled by Procyon v0.6.0
// 

public final class pqa
{
    public ppw a;
    public final ppw b;
    final /* synthetic */ ppb c;
    final /* synthetic */ Object d;
    private final pnf e;
    
    public pqa() {
    }
    
    public pqa(final ppw b, final ppb c, final Object d) {
        this.c = c;
        this.d = d;
        this.e = plv.g(ppn.a);
        this.b = b;
    }
    
    public final Object a(final Object o) {
        Object o2;
        if ((o2 = this.e.a) == ppn.a) {
            o.getClass();
            Object a;
            if (this.c.v() == this.d) {
                a = null;
            }
            else {
                a = ppv.a;
            }
            final boolean a2 = pod.a;
            o2 = this.e.a;
            if (o2 == ppn.a) {
                o2 = a;
                if (!this.e.c(ppn.a, a)) {
                    o2 = this.e.a;
                }
            }
        }
        final ppw ppw = (ppw)o;
        ppw.getClass();
        ppw ppw2;
        if (o2 == null) {
            ppw2 = this.b;
        }
        else {
            ppw2 = this.a;
        }
        if (ppw2 != null && ppw.c.c(this, ppw2) && o2 == null) {
            final ppw b = this.b;
            final ppw a3 = this.a;
            a3.getClass();
            b.i(a3);
        }
        return o2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(poe.a(this));
        sb.append('@');
        sb.append(poe.b(this));
        return sb.toString();
    }
}
