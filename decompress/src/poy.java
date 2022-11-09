// 
// Decompiled by Procyon v0.6.0
// 

public abstract class poy extends pns implements poj, por
{
    public ppb b;
    
    @Override
    public final ppd ck() {
        return null;
    }
    
    @Override
    public final boolean cl() {
        return true;
    }
    
    @Override
    public final void d() {
        final ppb b = this.b;
        if (b == null) {
            plr.e();
        }
        Object v;
        do {
            v = b.v();
            if (v instanceof poy) {
                if (v == this) {
                    continue;
                }
            }
            else if (v instanceof por && ((por)v).ck() != null) {
                Object f;
                pqb pqb;
                ppw ppw2;
                do {
                    f = this.f();
                    if (f instanceof pqb) {
                        final ppw a = ((pqb)f).a;
                        return;
                    }
                    if (f == this) {
                        final ppw ppw = (ppw)f;
                        return;
                    }
                    if (f == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                    }
                    ppw2 = (ppw)f;
                    if ((pqb = (pqb)ppw2.e.a) != null) {
                        continue;
                    }
                    pqb = new pqb(ppw2);
                    ppw2.e.b(pqb);
                } while (!super.c.c(f, pqb));
                ppw2.j();
            }
        } while (!b.c.c(v, ppc.f));
    }
    
    public final ppb e() {
        final ppb b = this.b;
        if (b == null) {
            plr.e();
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(poe.a(this));
        sb.append('@');
        sb.append(poe.b(this));
        sb.append("[job@");
        final ppb b = this.b;
        if (b == null) {
            plr.e();
        }
        sb.append(poe.b(b));
        sb.append(']');
        return sb.toString();
    }
}
