import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kml implements oen
{
    final /* synthetic */ kmq a;
    private final /* synthetic */ int b;
    
    public kml(final kmq a) {
        this.a = a;
    }
    
    public kml(final kmq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        switch (this.b) {
            default: {
                final Iterator<Object> iterator = (Iterator<Object>)Collections.unmodifiableCollection((Collection<? extends kmj>)this.a.c).iterator();
                while (iterator.hasNext()) {
                    iterator.next().a(new IllegalStateException("Fail to start", t));
                }
                return;
            }
            case 0: {
                final Iterator<Object> iterator2 = (Iterator<Object>)Collections.unmodifiableCollection((Collection<? extends kmj>)this.a.c).iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().a(new IllegalStateException("Fail to stop", t));
                }
            }
        }
    }
}
