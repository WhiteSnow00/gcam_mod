import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.Set;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmr implements mmw
{
    public final Application a;
    public final Set b;
    private final Set c;
    
    public mmr(final Context context, final Set c, final Set b) {
        this.a = (Application)context;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void a(final psp psp) {
        psc psc;
        if ((psc = psp.g) == null) {
            psc = psc.l;
        }
        if ((psc.a & 0x1) != 0x0 && !this.c.isEmpty() && !this.b.isEmpty()) {
            final nnn e = nns.e();
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                e.g(((mmu)iterator.next()).a());
            }
            ofi.v(odg.h(ofi.s(e.f()), new mmq(this, psp), odx.a));
        }
    }
}
