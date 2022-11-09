import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;
import java.util.List;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlq
{
    public String a;
    public String b;
    public String c;
    public String d;
    
    public static String a(final Object o, final int n) {
        if (n > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (o == null) {
            return "";
        }
        if (o instanceof String) {
            if (TextUtils.isEmpty((CharSequence)o)) {
                return "";
            }
            return o.toString();
        }
        else if (o instanceof Integer) {
            if ((int)o == 0) {
                return "";
            }
            return o.toString();
        }
        else if (o instanceof Long) {
            if ((long)o == 0L) {
                return "";
            }
            return o.toString();
        }
        else if (o instanceof Double) {
            if ((double)o == 0.0) {
                return "";
            }
            return o.toString();
        }
        else if (o instanceof Boolean) {
            if (!(boolean)o) {
                return "";
            }
            return o.toString();
        }
        else {
            if (o instanceof List) {
                final StringBuilder sb = new StringBuilder();
                if (n > 0) {
                    sb.append("[");
                }
                final List list = (List)o;
                final int length = sb.length();
                for (final Object next : list) {
                    if (sb.length() > length) {
                        sb.append(", ");
                    }
                    sb.append(a(next, n + 1));
                }
                if (n > 0) {
                    sb.append("]");
                }
                return sb.toString();
            }
            if (o instanceof Map) {
                final StringBuilder sb2 = new StringBuilder();
                final Iterator iterator2 = new TreeMap((Map)o).entrySet().iterator();
                int n2 = 0;
                int length2 = 0;
                while (iterator2.hasNext()) {
                    final Map.Entry<K, Object> entry = (Map.Entry<K, Object>)iterator2.next();
                    final String a = a(entry.getValue(), n + 1);
                    if (!TextUtils.isEmpty((CharSequence)a)) {
                        if (n > 0 && n2 == 0) {
                            sb2.append("{");
                            length2 = sb2.length();
                            n2 = 1;
                        }
                        if (sb2.length() > length2) {
                            sb2.append(", ");
                        }
                        sb2.append((String)entry.getKey());
                        sb2.append('=');
                        sb2.append(a);
                    }
                }
                if (n2 != 0) {
                    sb2.append("}");
                }
                return sb2.toString();
            }
            return o.toString();
        }
    }
    
    @Override
    public final String toString() {
        final HashMap hashMap = new HashMap();
        hashMap.put("appName", this.a);
        hashMap.put("appVersion", this.b);
        hashMap.put("appId", this.c);
        hashMap.put("appInstallerId", this.d);
        return a(hashMap, 0);
    }
}
