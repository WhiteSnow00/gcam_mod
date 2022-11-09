import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcd implements kvu
{
    final /* synthetic */ fsb a;
    private final /* synthetic */ int b;
    
    public hcd(final fsb a) {
        this.a = a;
    }
    
    public hcd(final fsb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final lbe a(final Collection collection) {
        switch (this.b) {
            default: {
                final ArrayList list = new ArrayList(collection);
                return (lbe)list.get(this.a.a(list));
            }
            case 0: {
                final ArrayList list2 = new ArrayList(collection);
                return (lbe)list2.get(this.a.a(list2));
            }
        }
    }
}
