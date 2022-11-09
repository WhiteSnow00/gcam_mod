import java.util.Iterator;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mjx extends mep
{
    final /* synthetic */ njk d;
    
    public mjx(final oui oui, final Context context, final njk d) {
        this.d = d;
        super("NetworkMetric", oui, context);
    }
    
    @Override
    public final noi a(final psp psp) {
        final nog d = noi.D();
        prq prq;
        if ((prq = psp.f) == null) {
            prq = prq.b;
        }
        final Iterator<Object> iterator = prq.a.iterator();
        while (iterator.hasNext()) {
            d.i(this.d.d(iterator.next().d));
        }
        return d.f();
    }
}
