import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import android.accounts.Account;

// 
// Decompiled by Procyon v0.6.0
// 

public final class juq
{
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final kdf g;
    public Integer h;
    
    public juq(final Account a, Set a2, final String e, final String f, final kdf g) {
        this.a = a;
        Set<Object> b;
        if (a2 == null) {
            b = Collections.emptySet();
        }
        else {
            b = Collections.unmodifiableSet((Set<?>)a2);
        }
        this.b = b;
        final Map<Object, Object> emptyMap = (Map<Object, Object>)Collections.emptyMap();
        this.d = emptyMap;
        this.e = e;
        this.f = f;
        this.g = g;
        final HashSet set = new HashSet(b);
        final Iterator<Object> iterator = (Iterator<Object>)emptyMap.values().iterator();
        while (iterator.hasNext()) {
            a2 = iterator.next().a;
            set.addAll(null);
        }
        this.c = Collections.unmodifiableSet((Set<?>)set);
    }
}
