import android.os.StrictMode$ThreadPolicy;
import java.util.Collections;
import android.util.Log;
import android.database.sqlite.SQLiteException;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.database.ContentObserver;
import android.net.Uri;
import android.content.ContentResolver;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnm implements mnp
{
    public static final String[] a;
    private static final Map d;
    public final ContentResolver b;
    public final Uri c;
    private final ContentObserver e;
    private final Object f;
    private volatile Map g;
    private final List h;
    
    static {
        d = new yu();
        a = new String[] { "key", "value" };
    }
    
    private mnm(final ContentResolver b, final Uri c) {
        final mnl e = new mnl(this);
        this.e = e;
        this.f = new Object();
        this.h = new ArrayList();
        b.getClass();
        c.getClass();
        (this.b = b).registerContentObserver(this.c = c, false, (ContentObserver)e);
    }
    
    public static mnm a(final ContentResolver contentResolver, final Uri uri) {
        synchronized (mnm.class) {
            final Map d = mnm.d;
            final mnm mnm = d.get(uri);
            mnm mnm3;
            if (mnm == null) {
                try {
                    final mnm mnm2 = new mnm(contentResolver, uri);
                    try {
                        d.put(uri, mnm2);
                    }
                    catch (final SecurityException ex) {}
                    mnm3 = mnm2;
                }
                catch (final SecurityException ex2) {
                    mnm3 = mnm;
                }
            }
            else {
                mnm3 = mnm;
            }
            return mnm3;
        }
    }
    
    static void c() {
        monitorenter(mnm.class);
        try {
            for (final mnm mnm : mnm.d.values()) {
                mnm.b.unregisterContentObserver(mnm.e);
            }
            mnm.d.clear();
            monitorexit(mnm.class);
        }
        finally {
            monitorexit(mnm.class);
            while (true) {}
        }
    }
    
    public static void e(final Uri uri) {
        synchronized (mnm.class) {
            final mnm mnm = mnm.d.get(uri);
            if (mnm != null) {
                mnm.d();
            }
        }
    }
    
    public final void d() {
        final Object f = this.f;
        monitorenter(f);
        try {
            this.g = null;
            moh.g();
            monitorexit(f);
            synchronized (this) {
                final Iterator iterator = this.h.iterator();
                while (iterator.hasNext()) {
                    ((mnn)iterator.next()).a();
                }
            }
        }
        finally {
            monitorexit(f);
            while (true) {}
        }
    }
}
