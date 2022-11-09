import java.util.Collection;
import java.util.Collections;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nuk
{
    private static final Set a;
    
    static {
        ntz.a(a = Collections.singleton(nsh.a));
    }
    
    public static String a(final ntk ntk) {
        return ntn.b(ntk.l());
    }
    
    public static boolean b(final ntk ntk, final nug nug, final Set set) {
        return ntk.k() != null || nug.a() > set.size() || !set.containsAll(nug.b());
    }
    
    public static void c(final nug nug, final ntw ntw, final StringBuilder sb) {
        final ntj ntj = new ntj(sb);
        nug.c(ntw, ntj);
        if (ntj.c) {
            ntj.b.append(ntj.a);
        }
    }
}
