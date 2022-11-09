import java.util.Collection;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class dcb implements brj
{
    final /* synthetic */ dce a;
    
    public dcb(final dce a) {
        this.a = a;
    }
    
    @Override
    public final void a(Throwable a) {
        this.a.d.h("Uncaught exception. Annotating all active shots.");
        a = (Throwable)this.a;
        ((dce)a).d.b("annotateAllActiveShots begin");
        synchronized (a) {
            final HashSet set = new HashSet(((dce)a).i.keySet());
            monitorexit(a);
            ((dce)a).h.i(set, ((dce)a).f.instant());
            ((dce)a).d.b("annotateAllActiveShots end");
        }
    }
}
