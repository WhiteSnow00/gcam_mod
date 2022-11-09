import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class am
{
    final int[] a;
    public final String[] b;
    final al c;
    public final Set d;
    
    public am(final al c, final int[] a, final String[] b) {
        this.c = c;
        this.a = a;
        this.b = b;
        Set<Object> unmodifiableSet;
        if (a.length == 1) {
            final HashSet set = new HashSet();
            set.add(b[0]);
            unmodifiableSet = Collections.unmodifiableSet((Set<?>)set);
        }
        else {
            unmodifiableSet = null;
        }
        this.d = unmodifiableSet;
    }
}
