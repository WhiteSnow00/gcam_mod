import java.util.Iterator;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class moj implements mnp
{
    private static final Map a;
    private final SharedPreferences b;
    private final SharedPreferences$OnSharedPreferenceChangeListener c;
    
    static {
        a = new yu();
    }
    
    static void a() {
        synchronized (moj.class) {
            final Map a = moj.a;
            final Iterator iterator = a.values().iterator();
            if (!iterator.hasNext()) {
                a.clear();
                return;
            }
            final moj moj = (moj)iterator.next();
            final SharedPreferences b = moj.b;
            final SharedPreferences$OnSharedPreferenceChangeListener c = moj.c;
            throw null;
        }
    }
    
    static moj c() {
        final int a = loq.a;
        throw null;
    }
    
    @Override
    public final Object b(final String s) {
        throw null;
    }
}
