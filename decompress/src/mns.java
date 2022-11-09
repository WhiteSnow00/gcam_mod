import android.util.Log;
import android.database.ContentObserver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class mns implements mnp
{
    private static mns b;
    public final Context a;
    private final ContentObserver c;
    
    private mns() {
        this.a = null;
        this.c = null;
    }
    
    private mns(final Context a) {
        this.a = a;
        final mnr c = new mnr();
        this.c = c;
        a.getContentResolver().registerContentObserver(kir.a, true, (ContentObserver)c);
    }
    
    static mns a(final Context context) {
        synchronized (mns.class) {
            if (mns.b == null) {
                mns b;
                if (a.e(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    b = new mns(context);
                }
                else {
                    b = new mns();
                }
                mns.b = b;
            }
            return mns.b;
        }
    }
    
    static void d() {
        synchronized (mns.class) {
            final mns b = mns.b;
            if (b != null) {
                final Context a = b.a;
                if (a != null && b.c != null) {
                    a.getContentResolver().unregisterContentObserver(mns.b.c);
                }
            }
            mns.b = null;
        }
    }
    
    public final String c(String o) {
        if (this.a == null) {
            return null;
        }
        Object o2 = null;
        try {
            o2 = new mnq(this, (String)o);
            o2 = mit.e((mno)o2);
            return (String)o2;
        }
        catch (final SecurityException o2) {}
        catch (final IllegalStateException ex) {}
        o = String.valueOf(o);
        if (((String)o).length() != 0) {
            o = "Unable to read GServices for: ".concat((String)o);
        }
        else {
            o = new String("Unable to read GServices for: ");
        }
        Log.e("GservicesLoader", (String)o, (Throwable)o2);
        return null;
    }
}
