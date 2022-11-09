// 
// Decompiled by Procyon v0.6.0
// 

public final class pnv
{
    public static final boolean a;
    
    static {
        final String a2 = pqg.a("kotlinx.coroutines.scheduler");
        boolean a3 = true;
        Label_0090: {
            if (a2 != null) {
                switch (a2.hashCode()) {
                    case 109935: {
                        if (a2.equals("off")) {
                            a3 = false;
                            break Label_0090;
                        }
                        break;
                    }
                    case 3551: {
                        if (a2.equals("on")) {
                            break Label_0090;
                        }
                        break;
                    }
                    case 0: {
                        if (a2.equals("")) {
                            break Label_0090;
                        }
                        break;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("System property 'kotlinx.coroutines.scheduler' has unrecognized value '");
                sb.append(a2);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        a = a3;
    }
    
    public static final String a(final pjq pjq) {
        pjq.getClass();
        if (!pod.a) {
            return null;
        }
        final pnz pnz = (pnz)pjq.b(pnz.b);
        if (pnz != null) {
            final poa poa = (poa)pjq.b(poa.b);
            String a;
            if (poa != null) {
                a = poa.a;
            }
            else {
                a = "coroutine";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append('#');
            sb.append(pnz.a);
            return sb.toString();
        }
        return null;
    }
    
    public static final ppj b(pjl pjl, final pjq a, final Object d) {
        pjl.getClass();
        a.getClass();
        final boolean b = pjl instanceof pjz;
        final ppj ppj = null;
        if (!b) {
            return null;
        }
        if (a.b(ppk.a) != null) {
            while (true) {
                pjz g;
                do {
                    pjl.getClass();
                    ppj ppj2;
                    if (pjl instanceof pog) {
                        ppj2 = ppj;
                    }
                    else {
                        g = ((pjz)pjl).g();
                        if (g != null) {
                            pjl = (pjl)g;
                            continue;
                        }
                        ppj2 = ppj;
                    }
                    if (ppj2 != null) {
                        a.getClass();
                        ppj2.a = a;
                        ppj2.d = d;
                    }
                    return ppj2;
                } while (!(g instanceof ppj));
                ppj ppj2 = (ppj)g;
                continue;
            }
        }
        return null;
    }
    
    public static final pjq c(final pjq pjq) {
        pjq ch;
        if (pod.a) {
            ch = pjq.ch(new pnz(pod.c.incrementAndGet()));
        }
        else {
            ch = pjq;
        }
        if (pjq != poi.a && pjq.b(pjm.a) == null) {
            return ch.ch(poi.a);
        }
        return ch;
    }
}
