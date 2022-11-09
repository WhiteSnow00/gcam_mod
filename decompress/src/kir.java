import android.database.ContentObserver;
import android.database.Cursor;
import java.util.TreeMap;
import java.util.Map;
import android.content.ContentResolver;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kir
{
    public static final Uri a;
    public static final Uri b;
    public static final Pattern c;
    public static final Pattern d;
    public static final AtomicBoolean e;
    static HashMap f;
    static final HashMap g;
    static final HashMap h;
    public static final HashMap i;
    static final HashMap j;
    static final String[] k;
    private static Object l;
    private static boolean m;
    
    static {
        a = Uri.parse("content://com.google.android.gsf.gservices");
        b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        e = new AtomicBoolean();
        g = new HashMap();
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        k = new String[0];
    }
    
    public static int a(final ContentResolver contentResolver, final String s, int n) {
        final Object c = c(contentResolver);
        final Integer n2 = (Integer)b(kir.h, s, n);
        if (n2 != null) {
            return n2;
        }
        final String f = f(contentResolver, s);
        Integer value = null;
        Label_0063: {
            if (f == null) {
                value = n2;
                break Label_0063;
            }
            try {
                final int int1 = Integer.parseInt(f);
                value = int1;
                n = int1;
            }
            catch (final NumberFormatException ex) {
                value = n2;
            }
        }
        e(c, kir.h, s, value);
        return n;
    }
    
    public static Object b(final HashMap hashMap, final String s, Object o) {
        synchronized (kir.class) {
            if (hashMap.containsKey(s)) {
                final Object value = hashMap.get(s);
                if (value != null) {
                    o = value;
                }
                return o;
            }
            return null;
        }
    }
    
    public static Object c(final ContentResolver contentResolver) {
        synchronized (kir.class) {
            g(contentResolver);
            return kir.l;
        }
    }
    
    public static Map d(ContentResolver query, final String... array) {
        query = (ContentResolver)query.query(kir.b, (String[])null, (String)null, array, (String)null);
        final TreeMap treeMap = new TreeMap();
        if (query != null) {
            try {
                while (((Cursor)query).moveToNext()) {
                    treeMap.put(((Cursor)query).getString(0), ((Cursor)query).getString(1));
                }
                return treeMap;
            }
            finally {
                ((Cursor)query).close();
            }
        }
        return treeMap;
    }
    
    public static void e(final Object o, final HashMap hashMap, final String s, final Object o2) {
        synchronized (kir.class) {
            if (o == kir.l) {
                hashMap.put(s, o2);
                kir.f.remove(s);
            }
        }
    }
    
    public static String f(final ContentResolver contentResolver, final String s) {
        monitorenter(kir.class);
        try {
            g(contentResolver);
            final Object l = kir.l;
            final boolean containsKey = kir.f.containsKey(s);
            final String s2 = null;
            final String s3 = null;
            if (containsKey) {
                String s4 = kir.f.get(s);
                if (s4 == null) {
                    s4 = s3;
                }
                monitorexit(kir.class);
                return s4;
            }
            final int length = kir.k.length;
            monitorexit(kir.class);
            final Cursor query = contentResolver.query(kir.a, (String[])null, (String)null, new String[] { s }, (String)null);
            if (query == null) {
                return null;
            }
            try {
                String s5;
                if (!query.moveToFirst()) {
                    h(l, s, null);
                    s5 = s2;
                }
                else {
                    final String string = query.getString(1);
                    if ((s5 = string) != null) {
                        s5 = string;
                        if (string.equals(null)) {
                            s5 = null;
                        }
                    }
                    h(l, s, s5);
                    if (s5 == null) {
                        s5 = s2;
                    }
                }
                return s5;
            }
            finally {
                query.close();
            }
        }
        finally {
            monitorexit(kir.class);
            while (true) {}
        }
    }
    
    private static void g(final ContentResolver contentResolver) {
        if (kir.f == null) {
            kir.e.set(false);
            kir.f = new HashMap();
            kir.l = new Object();
            kir.m = false;
            contentResolver.registerContentObserver(kir.a, true, (ContentObserver)new kiq());
            return;
        }
        if (kir.e.getAndSet(false)) {
            kir.f.clear();
            kir.g.clear();
            kir.h.clear();
            kir.i.clear();
            kir.j.clear();
            kir.l = new Object();
            kir.m = false;
        }
    }
    
    private static void h(final Object o, final String s, final String s2) {
        synchronized (kir.class) {
            if (o == kir.l) {
                kir.f.put(s, s2);
            }
        }
    }
}
