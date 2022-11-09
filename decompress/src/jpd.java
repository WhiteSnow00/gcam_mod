import android.os.SystemClock;
import java.util.TimeZone;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpd
{
    public final jpg a;
    boolean b;
    public ArrayList c;
    public final boolean d;
    public String e;
    public final String f;
    public final jpa g;
    public final int h;
    public final okv i;
    public loj j;
    
    public jpd(final jpg a, final ojw e, final jpa g) {
        final okv i = (okv)ouf.j.m();
        this.i = i;
        this.b = false;
        this.c = null;
        this.d = true;
        this.a = a;
        this.f = a.j;
        this.e = null;
        this.h = a.k;
        final long currentTimeMillis = System.currentTimeMillis();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final ouf ouf = (ouf)i.b;
        ouf.a |= 0x1;
        ouf.b = currentTimeMillis;
        final long g2 = TimeZone.getDefault().getOffset(((ouf)i.b).b) / 1000;
        if (i.c) {
            i.m();
            i.c = false;
        }
        final ouf ouf2 = (ouf)i.b;
        ouf2.a |= 0x10000;
        ouf2.g = g2;
        if (loq.b(a.e)) {
            final boolean b = loq.b(a.e);
            if (i.c) {
                i.m();
                i.c = false;
            }
            final ouf ouf3 = (ouf)i.b;
            ouf3.a |= 0x800000;
            ouf3.h = b;
        }
        if (SystemClock.elapsedRealtime() != 0L) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (i.c) {
                i.m();
                i.c = false;
            }
            final ouf ouf4 = (ouf)i.b;
            ouf4.a |= 0x2;
            ouf4.c = elapsedRealtime;
        }
        if (e != null) {
            if (i.c) {
                i.m();
                i.c = false;
            }
            final ouf ouf5 = (ouf)i.b;
            ouf5.a |= 0x400;
            ouf5.e = e;
        }
        this.g = g;
    }
    
    public final jqz a() {
        if (!this.b) {
            this.b = true;
            return this.a.l.a(this);
        }
        throw new IllegalStateException("do not reuse LogEventBuilder");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ClearcutLogger.LogEventBuilder[");
        sb.append("uploadAccount: ");
        sb.append(this.e);
        sb.append(", logSourceName: ");
        sb.append(this.f);
        sb.append(", qosTier: ");
        final int h = this.h;
        String g = null;
        if (h != 0) {
            sb.append(h - 1);
            sb.append(", loggingId: null, MessageProducer: ");
            sb.append(this.g);
            sb.append(", veMessageProducer: ");
            sb.append((Object)null);
            sb.append(", testCodes: null, mendelPackages: ");
            final ArrayList c = this.c;
            if (c != null) {
                final jqp a = jpg.a;
                g = nfa.g(c, ", ");
            }
            sb.append(g);
            sb.append(", experimentIds: null, experimentTokens: null, experimentTokensBytes: ");
            final jqp a2 = jpg.a;
            sb.append("null, addPhenotype: ");
            sb.append(true);
            sb.append(", logVerifier: ");
            sb.append(this.j);
            sb.append("]");
            return sb.toString();
        }
        throw null;
    }
}
