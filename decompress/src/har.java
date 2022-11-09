import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class har
{
    public static final float a(final had had, final Collection collection) {
        final Iterator iterator = collection.iterator();
        long n = Long.MAX_VALUE;
        while (iterator.hasNext()) {
            final had had2 = (had)iterator.next();
            if (had != had2) {
                final long abs = Math.abs(TimeUnit.MILLISECONDS.convert(had.a - had2.a, TimeUnit.NANOSECONDS));
                if (abs >= n) {
                    continue;
                }
                n = abs;
            }
        }
        if (n == Long.MAX_VALUE) {
            return 0.0f;
        }
        return (float)n;
    }
}
