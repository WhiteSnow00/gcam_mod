import java.util.Iterator;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.List;
import android.content.SharedPreferences;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hka extends hjx
{
    private static final nsd a;
    private final Object b;
    private final Context c;
    private final String d;
    private final SharedPreferences e;
    private final List f;
    private final List g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/settings/SettingsManagerConcrete");
    }
    
    public hka(final Context c, final SharedPreferences e) {
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.b = new Object();
        this.c = c;
        this.d = c.getPackageName();
        this.e = e;
        this.f(new hjz(c));
    }
    
    @Override
    public final int a(final String s) {
        synchronized (this.b) {
            return this.b(s, 0);
        }
    }
    
    @Override
    public final int b(String q, final Integer n) {
        synchronized (this.b) {
            q = this.q(q, Integer.toString(n));
            if (q == null) {
                return n;
            }
            return Integer.parseInt(q);
        }
    }
    
    @Override
    public final long c(String q) {
        synchronized (this.b) {
            final Long value = 0L;
            synchronized (this.b) {
                q = this.q(q, Long.toString(value));
                long n;
                if (q == null) {
                    n = value;
                    monitorexit(this.b);
                }
                else {
                    n = Long.parseLong(q);
                }
                return n;
            }
        }
    }
    
    @Override
    public final SharedPreferences d() {
        synchronized (this.b) {
            return this.e;
        }
    }
    
    @Override
    public final String e(final String s) {
        final Object b = this.b;
        monitorenter(b);
        try {
            try {
                final String string = this.e.getString(s, (String)null);
                monitorexit(b);
                return string;
            }
            finally {
                monitorexit(b);
            }
        }
        catch (final ClassCastException ex) {}
    }
    
    @Override
    public final void f(final hja hja) {
        nov.z(this.b);
        nov.z(this.g);
        nov.z(this.e);
        final Object b = this.b;
        monitorenter(b);
        Label_0099: {
            if (hja == null) {
                break Label_0099;
            }
            try {
                if (this.f.contains(hja)) {
                    monitorexit(b);
                    return;
                }
                this.f.add(hja);
                final hjy hjy = new hjy(hja);
                this.g.add(hjy);
                this.e.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)hjy);
                monitorexit(b);
            }
            finally {
                monitorexit(b);
                throw new IllegalArgumentException("OnSettingChangedListener cannot be null.");
            }
        }
    }
    
    @Override
    public final void g(final String s) {
        synchronized (this.b) {
            this.e.edit().remove(s).apply();
        }
    }
    
    @Override
    public final void h(final hja hja) {
        nov.z(this.b);
        nov.z(this.g);
        nov.z(this.e);
        synchronized (this.b) {
            if (!this.f.contains(hja)) {
                return;
            }
            final int index = this.f.indexOf(hja);
            this.f.remove(hja);
            final SharedPreferences$OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener = this.g.get(index);
            this.g.remove(index);
            this.e.unregisterOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListener);
        }
    }
    
    @Override
    public final void i(final String s, final int n) {
        synchronized (this.b) {
            this.k(s, Integer.toString(n));
        }
    }
    
    @Override
    public final void j(final String s, final long n) {
        synchronized (this.b) {
            this.k(s, Long.toString(n));
        }
    }
    
    @Override
    public final void k(final String s, final String s2) {
        synchronized (this.b) {
            this.e.edit().putString(s, s2).apply();
        }
    }
    
    @Override
    public final void l(final String s, final boolean b) {
        final Object b2 = this.b;
        monitorenter(b2);
        String s2 = "1";
        if (!b) {
            s2 = "0";
        }
        try {
            this.k(s, s2);
        }
        finally {
            monitorexit(b2);
        }
    }
    
    @Override
    public final boolean m(final String s) {
        synchronized (this.b) {
            return this.o(s);
        }
    }
    
    @Override
    public final boolean n(final String s) {
        synchronized (this.b) {
            return this.e.contains(s);
        }
    }
    
    @Override
    public final boolean o(String q) {
        synchronized (this.b) {
            q = this.q(q, "0");
            boolean b = false;
            if (q == null) {
                return false;
            }
            if (Integer.parseInt(q) != 0) {
                b = true;
            }
            return b;
        }
    }
    
    @Override
    public final SharedPreferences p() {
        final Object b = this.b;
        monitorenter(b);
        try {
            final SharedPreferences sharedPreferences = this.c.getSharedPreferences(String.valueOf(this.d).concat("_preferences_camera"), 0);
            final Iterator iterator = this.g.iterator();
            while (iterator.hasNext()) {
                sharedPreferences.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)iterator.next());
            }
            monitorexit(b);
            return sharedPreferences;
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    public final String q(final String s, final String s2) {
        final Object b = this.b;
        monitorenter(b);
        try {
            try {
                final String string = this.e.getString(s, s2);
                monitorexit(b);
                return string;
            }
            finally {
                monitorexit(b);
            }
        }
        catch (final ClassCastException ex) {}
    }
}
