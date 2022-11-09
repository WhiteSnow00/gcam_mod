import android.os.Looper;
import android.app.AppOpsManager;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxc
{
    public static final jxh a(final Context context, final jxg jxg) {
        final jxh jxh = new jxh();
        final int b = jxg.b(context);
        jxh.b = b;
        if (b != 0) {
            jxh.c = 1;
        }
        else if ((jxh.a = jxg.a(context)) != 0) {
            jxh.c = -1;
        }
        return jxh;
    }
    
    public static boolean b(final Context context, final int n) {
        if (!c(context, n, "com.google.android.gms")) {
            return false;
        }
        final PackageManager packageManager = context.getPackageManager();
        try {
            return jqh.a(context).b(packageManager.getPackageInfo("com.google.android.gms", 64));
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    public static boolean c(final Context context, final int n, final String s) {
        final jwt b = jwu.b(context);
        boolean b2;
        try {
            final AppOpsManager appOpsManager = (AppOpsManager)b.a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(n, s);
            b2 = true;
        }
        catch (final SecurityException ex) {
            b2 = false;
        }
        return b2;
    }
    
    public static boolean d() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
    
    public static int e(final int n) {
        if (n == -1) {
            return -1;
        }
        return n / 1000;
    }
    
    public static float f(final long n) {
        return n / 1000.0f;
    }
    
    public static int g(final double n) {
        return (int)(n * 1000.0);
    }
    
    public static int h(final long n) {
        return (int)(n / 1000L);
    }
    
    public static int i(final int n) {
        return n * 1000;
    }
    
    public static long j(final int n) {
        return n * 1000000L;
    }
    
    public static long k(final long n) {
        return n / 1000000L;
    }
    
    public static jdr l(final jds jds) {
        return new jdr(jds);
    }
    
    public static jdr m(final int n) {
        return new jdr(new jdt(n));
    }
    
    public static void n(final float[] array, final jdl jdl) {
        njo.d(array.length == 3);
        final float n = array[0];
        final float n2 = array[1];
        final float n3 = array[2];
        final float n4 = n * n + n2 * n2 + n3 * n3;
        double cos;
        if (n4 > 0.0f) {
            final double sqrt = Math.sqrt(n4);
            final double n5 = 0.5 * sqrt;
            final double n6 = Math.sin(n5) / sqrt;
            final double n7 = n;
            Double.isNaN(n7);
            jdl.a = n7 * n6;
            final double n8 = n2;
            Double.isNaN(n8);
            jdl.b = n8 * n6;
            final double n9 = n3;
            Double.isNaN(n9);
            jdl.c = n9 * n6;
            cos = Math.cos(n5);
        }
        else {
            final double n10 = n;
            Double.isNaN(n10);
            jdl.a = n10 * 0.5;
            final double n11 = n2;
            Double.isNaN(n11);
            jdl.b = n11 * 0.5;
            final double n12 = n3;
            Double.isNaN(n12);
            jdl.c = n12 * 0.5;
            cos = 1.0;
        }
        jdl.d = cos;
    }
}
