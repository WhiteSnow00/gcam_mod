import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbk
{
    public static final Set a;
    public static final Set b;
    public static final pky c;
    
    static {
        final Set set = a = pjf.t(new mvt[] { mvt.c, mvt.d, mvt.e });
        final mvt g = mvt.g;
        set.getClass();
        final LinkedHashSet b2 = new LinkedHashSet(pjf.a(set.size() + 1));
        b2.addAll(set);
        b2.add((Object)g);
        b = b2;
        c = mwi.t;
    }
}
