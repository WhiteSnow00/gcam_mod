import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyg implements eyu
{
    private final List a;
    
    public eyg(final List a) {
        this.a = a;
    }
    
    @Override
    public final void a(final nxt nxt) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((eyu)iterator.next()).a(nxt);
        }
    }
}
