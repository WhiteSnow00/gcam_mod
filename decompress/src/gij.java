import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gij
{
    public final lgg a;
    public final kre b;
    public final Rect c;
    private final lgg d;
    
    public gij(final lgg a, final lgg d, final kre b, final Rect c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public static gij a(final lfg lfg, final kre kre, final int n) {
        final List v = lfg.v(n);
        if (!v.isEmpty()) {
            njo.o(v.isEmpty() ^ true);
            final Iterator iterator = v.iterator();
            kre kre2 = null;
            long n2 = Long.MAX_VALUE;
            while (iterator.hasNext()) {
                final kre kre3 = (kre)iterator.next();
                final long b = kre3.b();
                if (kre3.a >= kre.a && kre3.b >= kre.b && b < n2) {
                    kre2 = kre3;
                    n2 = b;
                }
            }
            kre c;
            if ((c = kre2) == null) {
                c = krf.c(v);
            }
            return new gij(new lgg(n, c), new lgg(n, krf.c(v)), kre, kqp.g(kre).c(new Rect(0, 0, c.a, c.b)));
        }
        final StringBuilder sb = new StringBuilder(50);
        sb.append("No picture sizes supported for format: ");
        sb.append(n);
        throw new gii(sb.toString());
    }
    
    public final kre b() {
        return this.d.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof gij)) {
            return false;
        }
        final gij gij = (gij)o;
        return this.b.equals(gij.b) && this.d.equals(gij.d) && this.a.equals(gij.a) && this.c.equals((Object)gij.c);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.d, this.a, this.c });
    }
    
    @Override
    public final String toString() {
        final niy d = nfa.d("PictureSizeCalculator.Configuration");
        d.b("desired size", this.b);
        d.b("large image reader", this.a);
        d.b("full-size image reader", this.d);
        d.b("crop", this.c);
        return d.toString();
    }
}
