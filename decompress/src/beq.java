import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import java.util.concurrent.locks.ReentrantLock;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import android.graphics.Paint;
import java.util.concurrent.locks.Lock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class beq
{
    public static final Lock a;
    private static final Paint b;
    private static final Paint c;
    private static final Paint d;
    private static final Set e;
    
    static {
        b = new Paint(6);
        c = new Paint(7);
        Lock a2;
        if ((e = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"))).contains(Build.MODEL)) {
            a2 = new ReentrantLock();
        }
        else {
            a2 = new bep();
        }
        a = a2;
        (d = new Paint(7)).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
    }
    
    public static int a(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 7:
            case 8: {
                return 270;
            }
            case 5:
            case 6: {
                return 90;
            }
            case 3:
            case 4: {
                return 180;
            }
        }
    }
    
    public static Bitmap$Config b(final Bitmap bitmap) {
        Bitmap$Config bitmap$Config;
        if (bitmap.getConfig() != null) {
            bitmap$Config = bitmap.getConfig();
        }
        else {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        return bitmap$Config;
    }
    
    public static Bitmap c(final azk azk, final Bitmap bitmap, final int n, final int n2) {
        if (bitmap.getWidth() == n && bitmap.getHeight() == n2) {
            return bitmap;
        }
        final Matrix matrix = new Matrix();
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        float n3 = 0.0f;
        float n4;
        float n5;
        if (width * n2 > height * n) {
            n4 = n2 / (float)bitmap.getHeight();
            n3 = (n - bitmap.getWidth() * n4) * 0.5f;
            n5 = 0.0f;
        }
        else {
            n4 = n / (float)bitmap.getWidth();
            n5 = (n2 - bitmap.getHeight() * n4) * 0.5f;
        }
        matrix.setScale(n4, n4);
        matrix.postTranslate((float)(int)(n3 + 0.5f), (float)(int)(n5 + 0.5f));
        final Bitmap a = azk.a(n, n2, b(bitmap));
        h(bitmap, a);
        g(bitmap, a, matrix);
        return a;
    }
    
    public static Bitmap d(final azk azk, final Bitmap bitmap, final int n, final int n2) {
        if (bitmap.getWidth() <= n && bitmap.getHeight() <= n2) {
            return bitmap;
        }
        return f(azk, bitmap, n, n2);
    }
    
    public static Bitmap e(final azk azk, final Bitmap bitmap, int min, final int n) {
        min = Math.min(min, n);
        final float n2 = (float)min;
        final float n3 = n2 / 2.0f;
        final float n4 = (float)bitmap.getWidth();
        final float n5 = (float)bitmap.getHeight();
        final float max = Math.max(n2 / n4, n2 / n5);
        final float n6 = n4 * max;
        final float n7 = max * n5;
        final float n8 = (n2 - n6) / 2.0f;
        final float n9 = (n2 - n7) / 2.0f;
        final RectF rectF = new RectF(n8, n9, n6 + n8, n7 + n9);
        final Bitmap$Config j = j(bitmap);
        Bitmap a;
        if (j.equals((Object)bitmap.getConfig())) {
            a = bitmap;
        }
        else {
            a = azk.a(bitmap.getWidth(), bitmap.getHeight(), j);
            new Canvas(a).drawBitmap(bitmap, 0.0f, 0.0f, (Paint)null);
        }
        final Bitmap a2 = azk.a(min, min, j(bitmap));
        a2.setHasAlpha(true);
        final Lock a3 = beq.a;
        a3.lock();
        try {
            final Canvas canvas = new Canvas(a2);
            canvas.drawCircle(n3, n3, n3, beq.c);
            canvas.drawBitmap(a, (Rect)null, rectF, beq.d);
            k(canvas);
            a3.unlock();
            if (!a.equals(bitmap)) {
                azk.d(a);
            }
            return a2;
        }
        finally {
            beq.a.unlock();
        }
    }
    
    public static Bitmap f(final azk azk, final Bitmap bitmap, int round, int round2) {
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            return bitmap;
        }
        final float min = Math.min(round / (float)bitmap.getWidth(), round2 / (float)bitmap.getHeight());
        round2 = Math.round(bitmap.getWidth() * min);
        round = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round2 && bitmap.getHeight() == round) {
            return bitmap;
        }
        final Bitmap a = azk.a((int)(bitmap.getWidth() * min), (int)(bitmap.getHeight() * min), b(bitmap));
        h(bitmap, a);
        final Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        g(bitmap, a, matrix);
        return a;
    }
    
    public static void g(final Bitmap bitmap, final Bitmap bitmap2, final Matrix matrix) {
        final Lock a = beq.a;
        a.lock();
        try {
            final Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, beq.b);
            k(canvas);
            a.unlock();
        }
        finally {
            beq.a.unlock();
        }
    }
    
    public static void h(final Bitmap bitmap, final Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
    
    public static boolean i(final int n) {
        switch (n) {
            default: {
                return false;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: {
                return true;
            }
        }
    }
    
    private static Bitmap$Config j(final Bitmap bitmap) {
        if (Bitmap$Config.RGBA_F16.equals((Object)bitmap.getConfig())) {
            return Bitmap$Config.RGBA_F16;
        }
        return Bitmap$Config.ARGB_8888;
    }
    
    private static void k(final Canvas canvas) {
        canvas.setBitmap((Bitmap)null);
    }
}
