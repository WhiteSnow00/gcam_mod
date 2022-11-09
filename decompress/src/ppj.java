// 
// Decompiled by Procyon v0.6.0
// 

public final class ppj extends pqc
{
    public pjq a;
    public Object d;
    
    public ppj(final pjq pjq, final pjl pjl) {
        pjq.getClass();
        pjq ch = pjq;
        if (pjq.b(ppk.a) == null) {
            ch = pjq.ch(ppk.a);
        }
        super(ch, pjl);
    }
    
    public final boolean G() {
        if (this.a == null) {
            return false;
        }
        this.a = null;
        this.d = null;
        return true;
    }
    
    @Override
    protected final void j(Object b) {
        final pjq a = this.a;
        final Object o = null;
        if (a != null) {
            pqh.c(a, this.d);
            this.a = null;
            this.d = null;
        }
        final Object d = plv.d(b, this.e);
        final pjl e = this.e;
        final pjq d2 = e.d();
        final Object b2 = pqh.b(d2, null);
        if (b2 != pqh.a) {
            b = pnv.b(e, d2, b2);
        }
        else {
            b = o;
        }
        try {
            this.e.e(d);
            if (b != null && !((ppj)b).G()) {
                return;
            }
            pqh.c(d2, b2);
        }
        finally {
            if (b == null || ((ppj)b).G()) {
                pqh.c(d2, b2);
            }
        }
    }
}
