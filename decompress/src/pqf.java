import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import android.view.WindowManager;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqf
{
    public static final long c(final long n, final long n2) {
        return n & ~n2;
    }
    
    public static final long d(final long n, final int n2) {
        return c(n, 1073741823L) | (long)n2;
    }
    
    public static final pnw f(final Executor executor) {
        executor.getClass();
        return new pop(executor);
    }
    
    public static final ous g(final List list, final List list2) {
        return new ous(list, list2);
    }
    
    public static final void h(final pii pii, final List list) {
        list.add(pii);
    }
    
    public static final void i(final pii pii, final List list) {
        list.add(pii);
    }
    
    public static void j(final Object o, final Class clazz) {
        if (o != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(clazz.getCanonicalName()).concat(" must be set"));
    }
    
    public static void k(final Object o) {
        if (o != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    
    public static float l(final osy osy) {
        if (osy != null && (osy.a & 0x4) != 0x0) {
            return osy.d;
        }
        return 0.003f;
    }
    
    public static DisplayMetrics m(final Display display) {
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            final int widthPixels = displayMetrics.widthPixels;
            displayMetrics.widthPixels = displayMetrics.heightPixels;
            displayMetrics.heightPixels = widthPixels;
        }
        final float xdpi = displayMetrics.xdpi;
        displayMetrics.xdpi = displayMetrics.ydpi;
        displayMetrics.ydpi = xdpi;
        return displayMetrics;
    }
    
    public static Display n(final Context context) {
        return ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
    }
    
    public static final org o(final String s, final String s2, final oqy oqy, final oqw oqw) {
        try {
            return new orb((HttpURLConnection)new URL(s).openConnection(), s2, oqy, oqw);
        }
        catch (final IOException ex) {
            throw new IllegalStateException("Http connection could not be created.", ex);
        }
        catch (final MalformedURLException ex2) {
            throw new IllegalArgumentException("Url is malformed.", ex2);
        }
    }
}
