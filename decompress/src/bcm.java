import android.net.Uri;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcm implements bbw
{
    private static final Set a;
    private final bcl b;
    
    static {
        a = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList("file", "android.resource", "content")));
    }
    
    public bcm(final bcl b) {
        this.b = b;
    }
}
