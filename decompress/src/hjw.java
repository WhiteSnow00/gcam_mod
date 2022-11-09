import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.Map;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hjw implements hkc, hkd, krc
{
    public final SharedPreferences a;
    public final Map b;
    private final cxl c;
    private final SharedPreferences$OnSharedPreferenceChangeListener d;
    private final List e;
    
    public hjw(final cxl c, final SharedPreferences a) {
        this.c = c;
        this.a = a;
        this.b = new HashMap();
        this.e = new ArrayList();
        a.registerOnSharedPreferenceChangeListener(this.d = (SharedPreferences$OnSharedPreferenceChangeListener)new hjt(this, a, c));
    }
    
    @Override
    public final klj a(final hjo hjo) {
        return this.b(hjo);
    }
    
    @Override
    public final klv b(final hjo hjo) {
        synchronized (this.b) {
            if (this.b.get(hjo.b) == null) {
                final kkz kkz = new kkz(this.c(hjo));
                this.e.add(kkz.a(new hju(this, hjo), odx.a));
                this.b.put(hjo.b, new hjv(hjo, kkz));
            }
            monitorexit(this.b);
            final hjv hjv = this.b.get(hjo.b);
            hjv.getClass();
            return hjv.b;
        }
    }
    
    @Override
    public final Object c(final hjo hjo) {
        synchronized (this) {
            final String string = this.a.getString(hjo.b, (String)null);
            monitorexit(this);
            if (string != null) {
                return hjo.a(string);
            }
            return hjo.c.a(this.c);
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            this.a.unregisterOnSharedPreferenceChangeListener(this.d);
            monitorexit(this);
            final Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((krc)iterator.next()).close();
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void d(final hjo hjo, final Object o) {
        final String b = hjo.b;
        final String b2 = hjo.b(o);
        synchronized (this) {
            this.a.edit().putString(b, b2).apply();
        }
    }
}
