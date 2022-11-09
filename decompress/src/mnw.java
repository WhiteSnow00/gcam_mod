import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnw
{
    private static final yu a;
    
    static {
        a = new yu();
    }
    
    public static Uri a(final String s) {
        synchronized (mnw.class) {
            final yu a = mnw.a;
            final Uri uri = (Uri)a.get(s);
            Uri uri2;
            if (uri == null) {
                final String value = String.valueOf(Uri.encode(s));
                String concat;
                if (value.length() != 0) {
                    concat = "content://com.google.android.gms.phenotype/".concat(value);
                }
                else {
                    concat = new String("content://com.google.android.gms.phenotype/");
                }
                final Uri parse = Uri.parse(concat);
                a.put(s, parse);
                uri2 = parse;
            }
            else {
                uri2 = uri;
            }
            return uri2;
        }
    }
}
