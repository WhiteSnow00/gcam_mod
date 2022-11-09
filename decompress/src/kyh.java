import android.util.Log;
import java.util.Iterator;
import android.hardware.camera2.CaptureRequest$Key;
import java.util.Collection;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyh
{
    public final Set a;
    private final Map b;
    private final Set c;
    
    public kyh(final Map b, final Set c, final Set a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public static kyh a(final kyh kyh) {
        return new kyh(new HashMap(kyh.b), new HashSet(kyh.c), new HashSet(kyh.a));
    }
    
    public final kyi b() {
        return new kyi(new HashSet(this.b.values()), new HashSet(this.c), new HashSet(this.a));
    }
    
    public final void c() {
        this.a.clear();
    }
    
    public final void d(final CaptureRequest$Key captureRequest$Key, final Object o) {
        this.b.put(captureRequest$Key, kxc.p(captureRequest$Key, o));
    }
    
    public final void e(final Set set) {
        for (final kws kws : set) {
            this.b.put(kws.a, kws);
        }
    }
    
    public final void f(final kzl kzl) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            final kzl kzl2 = (kzl)iterator.next();
            if (!leg.d(kzl, kzl2, null)) {
                final String value = String.valueOf(kzl2);
                final String value2 = String.valueOf(kzl);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 36 + String.valueOf(value2).length());
                sb.append("Removing ");
                sb.append(value);
                sb.append(" because it conflicts with ");
                sb.append(value2);
                Log.w("pck", sb.toString());
                iterator.remove();
            }
        }
        this.a.add(kzl);
    }
    
    public final void g(final kxc kxc) {
        this.c.add(kxc);
    }
}
