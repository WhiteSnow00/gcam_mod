import java.util.Iterator;
import java.util.List;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lon
{
    private final loh a;
    private final Map b;
    private final lok c;
    private final lne d;
    private final int e;
    private final ArrayDeque f;
    
    public lon(final loh a, final Map b, final lok c, final lne d, final int e, final ArrayDeque f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final okt okt) {
        final int a = ((ooj)okt.b).a;
        final int n = 2;
        final int n2 = 0;
        if ((a & 0x40) == 0x0) {
            if (okt.c) {
                okt.m();
                okt.c = false;
            }
            final ooj ooj = (ooj)okt.b;
            ooj.h = phn.j(2);
            ooj.a |= 0x40;
        }
        final Throwable t = (Throwable)this.d.c.e(new Throwable());
        final StringWriter stringWriter = new StringWriter();
        t.printStackTrace(new PrintWriter(stringWriter));
        final String string = stringWriter.toString();
        final int length = string.length();
        final long b = ovb.a.b().b();
        int n3 = length;
        if (b < length) {
            n3 = length;
            if (b >= 0L) {
                n3 = (int)b;
            }
        }
        final String substring = string.substring(0, n3);
        if (okt.c) {
            okt.m();
            okt.c = false;
        }
        final ooj ooj2 = (ooj)okt.b;
        substring.getClass();
        ooj2.a |= 0x800;
        ooj2.l = substring;
        final ooj ooj3 = (ooj)okt.h();
        final long d = ooj3.d;
        int k = phn.k(ooj3.h);
        if (k == 0) {
            k = n;
        }
        final lom lom = new lom(d, k);
        final long a2 = ovb.a.b().a();
        synchronized (this.b) {
            final Long n4 = this.b.get(lom);
            final long currentTimeMillis = System.currentTimeMillis();
            int n5;
            if (n4 != null && a2 > 0L) {
                if (n4 + a2 < currentTimeMillis) {
                    n5 = 1;
                }
                else {
                    n5 = n2;
                }
            }
            else {
                n5 = 1;
            }
            if (n5 != 0) {
                this.b.put(lom, currentTimeMillis);
            }
            monitorexit(this.b);
            if (n5 != 0) {
                this.c.a(ooj3);
            }
        }
    }
    
    public final okt b(final int n) {
        final okt m = ooj.m.m();
        final String packageName = this.d.a.getPackageName();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final ooj ooj = (ooj)m.b;
        packageName.getClass();
        ooj.a |= 0x1;
        ooj.b = packageName;
        final int a = this.a.a(this.d.a);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final ooj ooj2 = (ooj)m.b;
        ooj2.a |= 0x2;
        ooj2.c = a;
        ooj.j(ooj2);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final ooj ooj3 = (ooj)m.b;
        final int a2 = ooj3.a | 0x8;
        ooj3.a = a2;
        ooj3.e = -2032180703L;
        final int e = this.e;
        ooj3.a = (a2 | 0x10);
        ooj3.f = e;
        final nnn e2 = nns.e();
        final Iterator descendingIterator = this.f.descendingIterator();
        while (descendingIterator.hasNext()) {
            e2.g((long)((lnk)descendingIterator.next()).e);
        }
        final nns f = e2.f();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final ooj ooj4 = (ooj)m.b;
        ooj4.i();
        ojf.e(f, ooj4.k);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final ooj ooj5 = (ooj)m.b;
        ooj5.h = phn.j(n);
        ooj5.a |= 0x40;
        return m;
    }
}
