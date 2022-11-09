import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lkr
{
    public final llz a;
    public final lkh b;
    public final llb c;
    public final Executor d;
    public final kse e;
    public final krr f;
    private final lke g;
    
    public lkr(final llz a, final lke g, final lkh b, final llb c, final Executor d, final kse e, final krr krr) {
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = krr.a("MediaGroup");
    }
    
    public final void a(final lly lly, final ljz ljz, final lkp lkp, final lkd lkd) {
        final lke g = this.g;
        final llk a = llk.a(lkd.e.i().e);
        final StringBuilder sb = new StringBuilder();
        String s;
        if (a.b()) {
            s = g.a.b;
        }
        else if (a.c()) {
            s = g.a.c;
        }
        else {
            s = g.a.a;
        }
        sb.append(s);
        final Date date = new Date(lkp.b);
        Object o = g.a.j;
        synchronized (o) {
            final String format = ((DateFormat)o).format(date);
            monitorexit(o);
            sb.append(format);
            if (!lkp.c.isEmpty()) {
                sb.append(".");
                sb.append(lkp.c);
            }
            final Integer n = (Integer)((lka)ljz).a.get((Object)lkd);
            int intValue;
            if (n == null) {
                intValue = 0;
            }
            else {
                intValue = n;
            }
            if (intValue > 0) {
                final String c = njo.c(Integer.toString(intValue), g.a.g);
                if (g.a.i && !lkp.c.isEmpty()) {
                    sb.append("-");
                    sb.append(c);
                }
                else {
                    sb.append(".");
                    sb.append(g.a.e);
                    sb.append(c);
                }
            }
            if (!lkd.c.isEmpty()) {
                sb.append(".");
                sb.append(lkd.c);
            }
            if (lkp.e.size() > 1 && intValue > 0 && lkd == lkp.d) {
                sb.append(".");
                sb.append(g.a.f);
            }
            final String string = sb.toString();
            o = lkd.e.i();
            final krr f = this.f;
            final String c2 = ((lmf)o).c();
            final String value = String.valueOf(lkp);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 29 + String.valueOf(string).length() + String.valueOf(value).length());
            sb2.append("Renaming ");
            sb2.append(c2);
            sb2.append(" to ");
            sb2.append(string);
            sb2.append(" based on info: ");
            sb2.append(value);
            f.b(sb2.toString());
            lly.b(lkd.e, lmf.a(((lmf)o).a, ((lmf)o).b, string, ((lmf)o).d, ((lmf)o).e), lkd.d);
        }
    }
}
