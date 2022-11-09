import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class dls implements dky
{
    final /* synthetic */ dlu a;
    
    public dls(final dlu a) {
        this.a = a;
    }
    
    @Override
    public final void c() {
        final Iterator iterator = this.a.a.iterator();
        while (iterator.hasNext()) {
            ((dky)iterator.next()).c();
        }
    }
    
    @Override
    public final void d(final lfg lfg, final boa boa) {
        final Iterator iterator = this.a.a.iterator();
        while (iterator.hasNext()) {
            ((dky)iterator.next()).d(lfg, boa);
        }
    }
}
