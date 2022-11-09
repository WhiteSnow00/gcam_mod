import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cex
{
    public static kre a(final kmv kmv, final List list) {
        final kre kre = new kre(0, 0);
        final Iterator iterator = list.iterator();
        kre kre2 = kre;
        while (iterator.hasNext()) {
            final kre kre3 = (kre)iterator.next();
            if (kre3.a >= 300 && kre3.b >= 300 && kqp.g(kre3).equals(kqp.g(kmv.c())) && (kre2.b() == 0L || kre3.b() < kre2.b())) {
                kre2 = kre3;
            }
        }
        return kre2;
    }
}
