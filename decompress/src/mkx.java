import java.util.Iterator;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mkx extends mep
{
    final /* synthetic */ njk d;
    
    public mkx(final oui oui, final Context context, final njk d) {
        this.d = d;
        super("StorageMetric", oui, context);
    }
    
    @Override
    public final noi a(final psp psp) {
        final nog d = noi.D();
        psj psj;
        if ((psj = psp.i) == null) {
            psj = psj.k;
        }
        final Iterator<Object> iterator = psj.j.iterator();
        while (iterator.hasNext()) {
            d.i(this.d.f(iterator.next().b));
        }
        return d.f();
    }
}
