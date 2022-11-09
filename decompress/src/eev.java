import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eev implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public eev(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final eat a() {
        final Context a = ((eft)this.a).a();
        final hwy hwy = (hwy)this.b.get();
        return new eat(a, hwy, ((hxa)this.c.get()).a(hwy), (Set)this.d.get());
    }
}
