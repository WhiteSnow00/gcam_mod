import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class kkq implements kkp
{
    public kkq() {
    }
    
    @Override
    public final void a(final krc krc) {
        krc.close();
    }
    
    @Override
    public final void b(final Iterable iterable) {
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            ((krc)iterator.next()).close();
        }
    }
}
