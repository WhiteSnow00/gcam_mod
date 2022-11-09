import android.animation.Animator$AnimatorListener;
import j$.util.function.Consumer;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvh
{
    public jvh() {
    }
    
    public jvh(final cxl cxl) {
        final cxm a = cyl.a;
        cxl.b();
    }
    
    public jvh(final String s) {
        if (s.length() <= 23) {
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", s, 23));
    }
    
    public jvh(String[] array) {
        array = array;
        new ArrayList();
        new HashMap();
    }
    
    public static jqq a(final Status status) {
        if (status.i != null) {
            return new jrd(status);
        }
        return new jqq(status);
    }
    
    public static void b(final Status status, final kej kej) {
        c(status, null, kej);
    }
    
    public static void c(final Status status, final Object o, final kej kej) {
        if (status.b()) {
            kej.b(o);
            return;
        }
        kej.a(new jqq(status));
    }
    
    public static Bitmap d(final Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable).getBitmap();
        }
        final int max = Math.max(1, drawable.getIntrinsicWidth());
        final int max2 = Math.max(1, drawable.getIntrinsicHeight());
        final Bitmap bitmap = Bitmap.createBitmap(max, max2, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, max, max2);
        drawable.draw(canvas);
        return bitmap;
    }
    
    public static Animator$AnimatorListener e(final Consumer consumer) {
        return (Animator$AnimatorListener)new jbn(consumer);
    }
    
    public static Animator$AnimatorListener f(final Consumer consumer) {
        return (Animator$AnimatorListener)new jbo(consumer);
    }
}
