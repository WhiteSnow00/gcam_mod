import java.util.Collection;
import java.util.Locale;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzo
{
    public final lhl a;
    public final Set b;
    private final ldy c;
    private final kzz d;
    private final kse e;
    private final krr f;
    
    public kzo(final ldy c, final lhl a, final kzz d, final krr krr, final kse e) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = krr.a("FrameStreamMap");
        this.b = new HashSet();
    }
    
    private final njp c(final long n, final int n2, final noi noi) {
        return nov.F(new kzn(this, noi, n, n2));
    }
    
    private final noi d(final Set set) {
        if (set.isEmpty()) {
            return nqr.a;
        }
        final nog d = noi.D();
        for (final kws kws : set) {
            if (!this.d.a(kws.a)) {
                d.g(kws);
            }
            else {
                final krr f = this.f;
                final String value = String.valueOf(kws.a);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 32);
                sb.append("Ignoring blacklisted parameter: ");
                sb.append(value);
                f.f(sb.toString());
            }
        }
        return d.f();
    }
    
    public final kzl a(final kwz kwz, final Set set) {
        this.e.f("createFrameStream");
        final long a = this.a.a();
        final ldw ldw = (ldw)kwz;
        final long f = ldw.f();
        final boolean i = ldw.i();
        long f2 = 0L;
        nov.C(f >= 0L, "bytesPerImage() must be >= 0", new Object[0]);
        final boolean b = kwz instanceof ldk;
        int e;
        if (b) {
            e = ((ldk)kwz).e;
            nov.C(e > 0, "Stream capacity must be > 0", new Object[0]);
        }
        else {
            e = Integer.MAX_VALUE;
        }
        int min;
        if (f == 0L && e == Integer.MAX_VALUE) {
            min = -1;
        }
        else {
            int n;
            if (f > 0L && !i) {
                n = (int)(a / f);
            }
            else {
                n = Integer.MAX_VALUE;
            }
            min = Math.min(n, e);
        }
        if (!ldw.i()) {
            f2 = ldw.f();
        }
        noi noi;
        if (b) {
            noi = noi.H(kwz);
        }
        else {
            noi = nqr.a;
        }
        final noi d = this.d(set);
        final noi h = noi.H(kwz);
        noi noi2;
        if (kwz instanceof ldm) {
            noi2 = noi.H(kwz);
        }
        else {
            noi2 = nqr.a;
        }
        final kzl kzl = new kzl(h, noi, noi2, d, min, this.c(f2, min, noi));
        this.e.g();
        this.b.add(kzl);
        final krr f3 = this.f;
        final Locale root = Locale.ROOT;
        final double n2 = (double)kzl.f;
        Double.isNaN(n2);
        final double n3 = n2 / 1048576.0;
        String string;
        if (min >= 0 && min != Integer.MAX_VALUE) {
            final int e2 = kzl.e;
            final StringBuilder sb = new StringBuilder(28);
            sb.append(" with ");
            sb.append(e2);
            sb.append(" frames max");
            string = sb.toString();
        }
        else {
            string = "";
        }
        f3.f(String.format(root, "Created %-10s from [%s] %6.2f MiB/frame%s", kzl, kwz, n3, string));
        return kzl;
    }
    
    public final kzl b(final Set set, final Set set2) {
        this.e.f("createFrameStream");
        final noi f = noi.F(set);
        final ldy c = this.c;
        for (final kwz kwz : set) {
            kwz.getClass();
            njo.e(c.a.contains(kwz), String.valueOf(kwz.toString()).concat(" is not available on this FrameServer."));
        }
        final long a = this.a.a();
        final long a2 = leg.a(f);
        final Iterator<Object> iterator2 = f.iterator();
        int min = Integer.MAX_VALUE;
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            boolean b = true;
            if (!hasNext) {
                break;
            }
            final kwz kwz2 = iterator2.next();
            if (!(kwz2 instanceof ldk)) {
                continue;
            }
            final int e = ((ldk)kwz2).e;
            if (e <= 0) {
                b = false;
            }
            nov.C(b, "Stream capacity must be > 0", new Object[0]);
            min = Math.min(min, e);
        }
        int min2;
        if (a2 <= 0L && min == Integer.MAX_VALUE) {
            min2 = -1;
        }
        else {
            int n;
            if (a2 > 0L) {
                n = (int)(a / a2);
            }
            else {
                n = Integer.MAX_VALUE;
            }
            min2 = Math.min(n, min);
        }
        final long a3 = leg.a(set);
        final nog d = noi.D();
        for (final kwz kwz3 : set) {
            if (kwz3 instanceof ldk) {
                d.g(kwz3);
            }
        }
        final noi f2 = d.f();
        final noi d2 = this.d(set2);
        final nog d3 = noi.D();
        for (final kwz kwz4 : set) {
            if (kwz4 instanceof ldm) {
                d3.g(kwz4);
            }
        }
        final kzl kzl = new kzl(f, f2, d3.f(), d2, min2, this.c(a3, min2, f2));
        this.e.g();
        this.b.add(kzl);
        final krr f3 = this.f;
        final Locale root = Locale.ROOT;
        final double n2 = (double)kzl.f;
        Double.isNaN(n2);
        final double n3 = n2 / 1048576.0;
        String string;
        if (min2 >= 0 && min2 != Integer.MAX_VALUE) {
            final int e2 = kzl.e;
            final StringBuilder sb = new StringBuilder(28);
            sb.append(" with ");
            sb.append(e2);
            sb.append(" frames max");
            string = sb.toString();
        }
        else {
            string = "";
        }
        f3.f(String.format(root, "Created %-10s from %s %.2f MiB/frame%s", kzl, f, n3, string));
        return kzl;
    }
}
