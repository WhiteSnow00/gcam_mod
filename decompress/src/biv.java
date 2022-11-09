import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import android.os.Looper;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class biv
{
    public static final char[] a;
    public static final char[] b;
    private static volatile Handler c;
    
    static {
        a = "0123456789abcdef".toCharArray();
        b = new char[64];
    }
    
    private biv() {
    }
    
    public static int a(final Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            }
            catch (final NullPointerException ex) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        final String value = String.valueOf(bitmap);
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final String value2 = String.valueOf(bitmap.getConfig());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 66 + String.valueOf(value2).length());
        sb.append("Cannot obtain size for recycled Bitmap: ");
        sb.append(value);
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(value2);
        throw new IllegalStateException(sb.toString());
    }
    
    public static int b(final int n, final int n2, Bitmap$Config argb_8888) {
        if (argb_8888 == null) {
            argb_8888 = Bitmap$Config.ARGB_8888;
        }
        int n3 = 0;
        switch (biu.a[argb_8888.ordinal()]) {
            default: {
                n3 = 4;
                break;
            }
            case 4: {
                n3 = 8;
                break;
            }
            case 2:
            case 3: {
                n3 = 2;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
        }
        return n * n2 * n3;
    }
    
    public static int c(final float n) {
        return d(Float.floatToIntBits(n), 17);
    }
    
    public static int d(final int n, final int n2) {
        return n2 * 31 + n;
    }
    
    public static int e(final Object o, final int n) {
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        return d(hashCode, n);
    }
    
    public static Handler f() {
        if (biv.c == null) {
            synchronized (biv.class) {
                if (biv.c == null) {
                    biv.c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return biv.c;
    }
    
    public static List g(final Collection collection) {
        final ArrayList list = new ArrayList(collection.size());
        for (final Object next : collection) {
            if (next != null) {
                list.add(next);
            }
        }
        return list;
    }
    
    public static Queue h(final int n) {
        return new ArrayDeque(n);
    }
    
    public static void i() {
        if (n()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }
    
    public static void j(final Runnable runnable) {
        f().post(runnable);
    }
    
    public static boolean k(final Object o, final Object o2) {
        if (o == null) {
            return o2 == null;
        }
        if (o instanceof bbr) {
            return ((bbr)o).a();
        }
        return o.equals(o2);
    }
    
    public static boolean l(final Object o, final Object o2) {
        boolean equals;
        if (o == null) {
            if (o2 == null) {
                return true;
            }
            equals = false;
        }
        else {
            equals = o.equals(o2);
        }
        return equals;
    }
    
    public static boolean m() {
        return !n();
    }
    
    public static boolean n() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
    
    public static boolean o(final int n, final int n2) {
        return p(n) && p(n2);
    }
    
    private static boolean p(final int n) {
        return n > 0 || n == Integer.MIN_VALUE;
    }
}
