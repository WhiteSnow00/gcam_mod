import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import java.net.URI;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwo
{
    static {
        Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }
    
    public static Map a(final URI uri) {
        final Map<Object, Object> emptyMap = Collections.emptyMap();
        final String rawQuery = uri.getRawQuery();
        Map<Object, Object> map = emptyMap;
        if (rawQuery != null) {
            map = emptyMap;
            if (rawQuery.length() > 0) {
                final HashMap hashMap = new HashMap();
                final njk b = njk.b('=');
                final Iterator iterator = njk.b('&').a().d(rawQuery).iterator();
                while (true) {
                    map = hashMap;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final List f = b.f((CharSequence)iterator.next());
                    if (f.isEmpty() || f.size() > 2) {
                        throw new IllegalArgumentException("bad parameter");
                    }
                    final String b2 = b(f.get(0));
                    String b3;
                    if (f.size() == 2) {
                        b3 = b(f.get(1));
                    }
                    else {
                        b3 = null;
                    }
                    hashMap.put(b2, b3);
                }
            }
        }
        return map;
    }
    
    private static String b(String decode) {
        try {
            decode = URLDecoder.decode(decode, "UTF-8");
            return decode;
        }
        catch (final UnsupportedEncodingException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
}
