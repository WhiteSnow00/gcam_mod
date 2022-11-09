// 
// Decompiled by Procyon v0.6.0
// 

public class ppw
{
    public final pnf c;
    public final pnf d;
    public final pnf e;
    
    public ppw() {
        this.c = plv.g(this);
        this.d = plv.g(this);
        this.e = plv.g(null);
    }
    
    public boolean cm() {
        return this.f() instanceof pqb;
    }
    
    public final Object f() {
        final pnf c = this.c;
        Object a;
        while (true) {
            a = c.a;
            if (!(a instanceof pqa)) {
                break;
            }
            ((pqa)a).a(this);
        }
        return a;
    }
    
    public final ppw g() {
        return ppv.a(this.f());
    }
    
    public final ppw h() {
        final ppw j = this.j();
        if (j != null) {
            return j;
        }
        ppw ppw;
        for (ppw = (ppw)this.d.a; ppw.cm(); ppw = (ppw)ppw.d.a) {}
        return ppw;
    }
    
    public final void i(final ppw ppw) {
        final pnf d = ppw.d;
        while (true) {
            final ppw ppw2 = (ppw)d.a;
            if (this.f() != ppw) {
                return;
            }
            if (ppw.d.c(ppw2, this)) {
                if (this.cm()) {
                    ppw.j();
                }
            }
        }
    }
    
    public final ppw j() {
    Label_0000:
        while (true) {
            ppw ppw2;
            final ppw ppw = ppw2 = (ppw)this.d.a;
            ppw ppw3 = null;
            Object a = null;
            Block_5: {
                while (true) {
                    a = ppw2.c.a;
                    if (a == this) {
                        break;
                    }
                    if (this.cm()) {
                        return null;
                    }
                    if (a == null) {
                        return ppw2;
                    }
                    if (a instanceof pqa) {
                        break Block_5;
                    }
                    if (a instanceof pqb) {
                        if (ppw3 != null) {
                            if (!ppw3.c.c(ppw2, ((pqb)a).a)) {
                                continue Label_0000;
                            }
                            ppw2 = ppw3;
                            ppw3 = null;
                        }
                        else {
                            ppw2 = (ppw)ppw2.d.a;
                        }
                    }
                    else {
                        final ppw ppw4 = (ppw)a;
                        ppw3 = ppw2;
                        ppw2 = ppw4;
                    }
                }
                if (ppw == ppw2) {
                    return ppw2;
                }
                if (this.d.c(ppw, ppw2)) {
                    return ppw2;
                }
                continue;
            }
            ((pqa)a).a(ppw2);
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
