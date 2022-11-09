import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izi implements jap
{
    private final Set a;
    private boolean b;
    
    public izi(final Set a) {
        this.a = a;
        this.b = false;
    }
    
    @Override
    public final void a() {
        kjm.a();
        if (!this.b) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((jap)iterator.next()).a();
            }
            this.b = true;
        }
    }
}
