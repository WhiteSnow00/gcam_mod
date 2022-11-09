import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class isz implements Runnable
{
    final /* synthetic */ List a;
    
    public isz(final List a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((ist)iterator.next()).a();
        }
    }
}
