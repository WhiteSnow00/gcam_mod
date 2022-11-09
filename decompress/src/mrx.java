import android.content.Context;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import android.accounts.Account;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrx
{
    public static final Pattern a;
    static final Account b;
    public static final Set c;
    public static final Set d;
    
    static {
        a = Pattern.compile("[a-z]+(_[a-z]+)*");
        b = mrt.a;
        c = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));
        d = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
    }
    
    public static mrw a(final Context context) {
        return new mrw(context);
    }
}
