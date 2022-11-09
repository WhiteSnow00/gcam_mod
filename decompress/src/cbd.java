import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbd extends ivr
{
    final /* synthetic */ cbh a;
    
    public cbd(final cbh a) {
        this.a = a;
    }
    
    @Override
    public final void onShutterButtonClick() {
        if (this.a.i.a()) {
            final Iterator iterator = this.a.f.iterator();
            while (iterator.hasNext()) {
                ((ceh)iterator.next()).k(false);
            }
            if (this.a.m.k(cxr.ar)) {
                this.a.h.A(false);
            }
        }
    }
    
    @Override
    public final void onShutterButtonDown() {
        if (!this.a.i.a()) {
            final Iterator iterator = this.a.f.iterator();
            while (iterator.hasNext()) {
                ((ceh)iterator.next()).k(false);
            }
        }
    }
}
