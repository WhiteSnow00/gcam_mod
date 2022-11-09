import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class alt implements Runnable
{
    final /* synthetic */ List a;
    final /* synthetic */ alu b;
    
    public alt(final alu b, final List a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((alc)iterator.next()).a(this.b.d);
        }
    }
}
