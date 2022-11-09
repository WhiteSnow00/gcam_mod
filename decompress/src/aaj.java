import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import android.graphics.Canvas;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class aaj
{
    public static Context j(final Context context) {
        return context.createDeviceProtectedStorageContext();
    }
    
    public static File k(final Context context) {
        return context.getDataDir();
    }
    
    public static String l(final byte[] array) {
        final StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 4; ++i) {
            sb.append(String.format("%02x", array[i]));
        }
        return sb.toString();
    }
    
    public static boolean m(final byte[] array, final byte[] array2) {
        if (array2 == null) {
            return false;
        }
        if (array.length >= array2.length) {
            for (int i = 0; i < array2.length; ++i) {
                if (array[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static long[] n(final Object o) {
        if (o instanceof int[]) {
            final int[] array = (int[])o;
            final long[] array2 = new long[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        if (o instanceof long[]) {
            return (long[])o;
        }
        return null;
    }
    
    public void f(final Canvas canvas) {
    }
    
    public void o(final Rect rect, final View view, final RecyclerView recyclerView) {
        ((sf)view.getLayoutParams()).a();
        rect.set(0, 0, 0, 0);
    }
}
