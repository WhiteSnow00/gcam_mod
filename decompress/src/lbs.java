import java.util.Iterator;
import java.util.ArrayList;
import android.os.Handler;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class lbs extends lcz
{
    private final lfg e;
    private final Set f;
    private final kwv g;
    
    public lbs(final lfg e, final kwg kwg, final ldy ldy, final ldj ldj, final krr krr, final kse kse) {
        super(e.L(), kwg.b, ldy, ldj, krr, kse);
        this.e = e;
        this.f = kwg.h;
        this.g = kwg.c;
    }
    
    private static final void c(final leo leo, final kws kws) {
        leo.b(kws.a, kws.b);
    }
    
    @Override
    protected final void a(final ljg ljg, final lcd d, final List list, final Handler handler) {
        try {
            final ArrayList b = new ArrayList(((nql)list).c);
            final nrw t = ((nns)list).t();
            while (t.hasNext()) {
                final ljo a = t.next().a();
                a.getClass();
                b.add(a);
            }
            final ljp ljp = new ljp();
            ljp.c = new kjh(handler);
            ljp.b = b;
            final leo h = ljg.h(this.g.a);
            final Set q = kxc.q(this.e.y());
            final nns b2 = this.g.b;
            final int size = b2.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                final kws kws = b2.get(i);
                if (q.contains(kws.a())) {
                    c(h, kws);
                }
            }
            for (final kws kws2 : this.f) {
                if (q.contains(kws2.a())) {
                    c(h, kws2);
                }
            }
            ljp.e = h.a();
            int n2;
            if (this.a == kwr.b) {
                n2 = 1;
            }
            else {
                n2 = n;
            }
            ljp.a = n2;
            if (d == null) {
                throw new NullPointerException("Null stateCallback");
            }
            ljp.d = d;
            final Integer a2 = ljp.a;
            if (a2 != null && ljp.b != null && ljp.c != null && ljp.d != null && ljp.e != null) {
                ljg.c(new ljq(a2, ljp.b, ljp.c, ljp.d, ljp.e));
                return;
            }
            final StringBuilder sb = new StringBuilder();
            if (ljp.a == null) {
                sb.append(" sessionType");
            }
            if (ljp.b == null) {
                sb.append(" outputConfigurations");
            }
            if (ljp.c == null) {
                sb.append(" executor");
            }
            if (ljp.d == null) {
                sb.append(" stateCallback");
            }
            if (ljp.e == null) {
                sb.append(" sessionParameters");
            }
            final String value = String.valueOf(sb);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(value);
            throw new IllegalStateException(sb2.toString());
        }
        finally {
            final krr b3 = this.b;
            final String value2 = String.valueOf(d);
            final StringBuilder sb3 = new StringBuilder(String.valueOf(value2).length() + 35);
            sb3.append("Unable to createCaptureSession for ");
            sb3.append(value2);
            final Throwable t2;
            b3.i(sb3.toString(), t2);
            d.b();
        }
    }
}
