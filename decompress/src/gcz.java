import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.List;
import java.util.Collection;
import java.util.Map;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

final class gcz implements krc
{
    final /* synthetic */ gda a;
    final /* synthetic */ gdb b;
    
    public gcz(final gdb b, final gda a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void close() {
        final gdb b = this.b;
        final gda a = this.a;
        final Object a2 = b.a;
        monitorenter(a2);
        try {
            final Iterator iterator = a.d.iterator();
            while (iterator.hasNext()) {
                b.b.remove(iterator.next());
            }
            ofi.w(ofi.k(gdd.a(Collections.unmodifiableMap((Map<?, ?>)a.c).values()), gdd.a(Collections.unmodifiableList((List<?>)a.g))), new gdc(b.c, a), odx.a);
            monitorexit(a2);
        }
        finally {
            monitorexit(a2);
            while (true) {}
        }
    }
}
