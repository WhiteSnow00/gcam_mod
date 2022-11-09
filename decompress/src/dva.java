import com.google.googlex.gcam.BurstSpec;
import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dva implements duz
{
    private final Set a;
    
    public dva(final Set a) {
        a.size();
        this.a = a;
    }
    
    @Override
    public final void d(final him him) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((duz)iterator.next()).d(him);
        }
    }
    
    @Override
    public final void e(final dxh dxh, final kvs kvs) {
        for (final duz duz : this.a) {
            final kvs a = kvs.a();
            if (a != null) {
                duz.e(dxh, a);
            }
        }
    }
    
    @Override
    public final void f(final dxh dxh, final BurstSpec burstSpec, final ljm ljm) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((duz)iterator.next()).f(dxh, burstSpec, ljm);
        }
    }
    
    @Override
    public final void g(final him him) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((duz)iterator.next()).g(him);
        }
    }
    
    @Override
    public final void h(final dxh dxh) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((duz)iterator.next()).h(dxh);
        }
    }
    
    @Override
    public final void i(final dxh dxh) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((duz)iterator.next()).i(dxh);
        }
    }
}
