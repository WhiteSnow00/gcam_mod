import android.util.ArrayMap;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnm
{
    public final hkd a;
    public final Map b;
    public final String[] c;
    public final String[] d;
    private final Context e;
    private final hkc f;
    private final String[] g;
    
    public bnm(final Context e, final hkc f, final hkd a) {
        this.b = (Map)new ArrayMap();
        final String[] d = { "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION" };
        this.d = d;
        final String[] g = { "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE" };
        this.g = g;
        this.e = e;
        this.f = f;
        this.a = a;
        final String[] c = new String[6];
        System.arraycopy(g, 0, this.c = c, 0, 4);
        System.arraycopy(d, 0, c, 4, 2);
    }
    
    private final boolean f(final String[] array) {
        for (final String s : array) {
            if (!this.b.containsKey(s) || !(boolean)this.b.get(s)) {
                return false;
            }
        }
        return true;
    }
    
    public final void a() {
        this.a.d(hjq.a, false);
    }
    
    public final boolean b(final String s) {
        return this.e.checkSelfPermission(s) == 0;
    }
    
    final boolean c() {
        return this.f(this.g);
    }
    
    final boolean d() {
        return this.f(this.d);
    }
    
    final boolean e() {
        return (boolean)this.f.c(hjq.P);
    }
}
