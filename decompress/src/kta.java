import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kta implements ktb
{
    final List a;
    
    public kta(final List a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((ktb)iterator.next()).a();
        }
    }
    
    @Override
    public final void b() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((ktb)iterator.next()).b();
        }
    }
    
    @Override
    public final void c(final kst kst) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((ktb)iterator.next()).c(kst);
        }
    }
    
    @Override
    public final void d(final ljg ljg) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((ktb)iterator.next()).d(ljg);
        }
    }
}
