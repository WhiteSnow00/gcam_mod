import android.net.Uri;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnt
{
    private final Map a;
    
    public mnt(final Map a) {
        this.a = a;
    }
    
    public final String a(final Uri uri, final String s, String s2) {
        if (uri == null) {
            return null;
        }
        final Map map = this.a.get(uri.toString());
        if (map == null) {
            return null;
        }
        if (s != null) {
            s2 = String.valueOf(s2);
            if (s2.length() != 0) {
                s2 = s.concat(s2);
            }
            else {
                s2 = new String(s);
            }
        }
        return (String)map.get(s2);
    }
}
