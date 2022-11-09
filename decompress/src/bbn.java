import java.util.Collections;
import java.util.HashMap;
import android.text.TextUtils;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbn
{
    public static final Map a;
    private static final String b;
    
    static {
        String b2 = System.getProperty("http.agent");
        if (!TextUtils.isEmpty((CharSequence)b2)) {
            final int length = b2.length();
            final StringBuilder sb = new StringBuilder(b2.length());
            for (int i = 0; i < length; ++i) {
                final char char1 = b2.charAt(i);
                Label_0090: {
                    char c;
                    if ((c = char1) <= '\u001f') {
                        if (char1 != '\t') {
                            break Label_0090;
                        }
                        c = '\t';
                    }
                    if (c < '\u007f') {
                        sb.append(c);
                        continue;
                    }
                }
                sb.append('?');
            }
            b2 = sb.toString();
        }
        b = b2;
        final HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty((CharSequence)b2)) {
            hashMap.put("User-Agent", Collections.singletonList(new bbo(b2)));
        }
        a = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
