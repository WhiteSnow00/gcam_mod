import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public enum jlf
{
    a("BADGE", 0, "badge"), 
    b("EDIT", 1, "edit"), 
    c("INTERACT", 2, "interact"), 
    d("LAUNCH", 3, "launch");
    
    private static final Set f;
    public final String e;
    
    static {
        final jlf jlf;
        final jlf jlf2;
        final jlf jlf3;
        final HashSet set = new HashSet<String>(f = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(jlf.e, jlf2.e, jlf3.e))));
        final jlf jlf4;
        set.add(jlf4.e);
        Collections.unmodifiableSet((Set<?>)set);
    }
    
    private jlf(final String s, final int n, final String e) {
        this.e = e;
    }
    
    @Override
    public final String toString() {
        return this.e;
    }
}
