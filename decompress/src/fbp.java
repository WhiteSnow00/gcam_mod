import java.util.Calendar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbp
{
    public static final nsd a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    
    static {
        a = nsd.g("com/google/android/apps/camera/metadata/panorama/PanoMetadata");
    }
    
    public fbp(final int n, final int n2) {
        Calendar.getInstance();
        Calendar.getInstance();
        this.b = true;
        this.c = n;
        this.d = n2;
        this.e = n;
        this.f = n2;
        this.g = true;
        this.h = false;
    }
    
    public fbp(final boolean b, final int c, final int d, final int e, final int f, final boolean h) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = false;
        this.h = h;
    }
    
    public static int a(final apf apf, final String s) {
        if (apf.e("http://ns.google.com/photos/1.0/panorama/", s)) {
            return apf.b("http://ns.google.com/photos/1.0/panorama/", s);
        }
        return 0;
    }
    
    public static boolean b(final apf apf, final String s) {
        return apf.e("http://ns.google.com/photos/1.0/panorama/", s) && (boolean)((apu)apf).l("http://ns.google.com/photos/1.0/panorama/", s, 1);
    }
    
    public static boolean c(final double n, final double n2, final double n3) {
        return Math.abs(n - n2) < n3;
    }
    
    public static void d(final apf apf, final String s) {
        if (apf.e("http://ns.google.com/photos/1.0/panorama/", s)) {
            final Calendar calendar = (Calendar)((apu)apf).l("http://ns.google.com/photos/1.0/panorama/", s, 6);
        }
    }
}
