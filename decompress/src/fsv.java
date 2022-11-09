import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsv implements fey
{
    final /* synthetic */ fte a;
    
    public fsv(final fte a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final nqe nqe) {
        if (this.a.d.isEmpty()) {
            return nqe.c(this.a.a.a() - 1500000000L).n(nqe);
        }
        final Iterator iterator = this.a.d.iterator();
        while (iterator.hasNext()) {
            if (((fta)iterator.next()).d.n(nqe)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean b(final nqe nqe) {
        final Iterator iterator = this.a.e.iterator();
        while (iterator.hasNext()) {
            if (((fsz)iterator.next()).c().n(nqe)) {
                return true;
            }
        }
        return false;
    }
}
