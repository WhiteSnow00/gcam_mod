import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvj extends lvg implements List, lvi
{
    public lvj(final List list) {
        super(list);
    }
    
    @Override
    public final void close() {
        final Iterator iterator = super.a.iterator();
        Throwable t = null;
        while (iterator.hasNext()) {
            final lvi lvi = (lvi)iterator.next();
            if (lvi != null) {
                try {
                    lvi.close();
                }
                catch (final RuntimeException ex) {
                    if (t != null) {
                        t.addSuppressed(ex);
                    }
                    else {
                        t = ex;
                    }
                }
            }
        }
        if (t == null) {
            return;
        }
        throw t;
    }
}
