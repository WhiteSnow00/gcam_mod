import java.util.List;
import java.util.regex.Matcher;
import android.text.TextUtils;
import android.net.Uri;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class msk
{
    private static final Pattern a;
    
    static {
        a = Pattern.compile("(\\w+).*");
    }
    
    public static nns a(final Uri uri) {
        final nnn e = nns.e();
        final String encodedFragment = uri.getEncodedFragment();
        nns nns;
        if (!TextUtils.isEmpty((CharSequence)encodedFragment) && encodedFragment.startsWith("transform=")) {
            nns = nns.i(njk.c("+").a().d(encodedFragment.substring(10)));
        }
        else {
            nns = nns.l();
        }
        for (int size = nns.size(), i = 0; i < size; ++i) {
            final String s = nns.get(i);
            final Matcher matcher = msk.a.matcher(s);
            if (!matcher.matches()) {
                final String value = String.valueOf(s);
                String concat;
                if (value.length() != 0) {
                    concat = "Invalid fragment spec: ".concat(value);
                }
                else {
                    concat = new String("Invalid fragment spec: ");
                }
                throw new IllegalArgumentException(concat);
            }
            e.g(matcher.group(1));
        }
        return e.f();
    }
    
    public static String b(final List list) {
        if (list.isEmpty()) {
            return null;
        }
        final String value = String.valueOf(nfa.g(list, "+"));
        String concat;
        if (value.length() != 0) {
            concat = "transform=".concat(value);
        }
        else {
            concat = new String("transform=");
        }
        return concat;
    }
}
