import android.os.Build;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ese
{
    public static final esd a;
    private static final nsd b;
    private static final Map c;
    
    static {
        b = nsd.g("com/google/android/apps/camera/legacy/lightcycle/panorama/DeviceManager");
        final Map map = c = new HashMap();
        f("LGE", "hammerhead", new esd(-1.0f, true));
        f("LGE", "g3", new esd(-1.0f, true));
        f("LGE", "b1", new esd(-1.0f, true));
        f("LGE", "b1w", new esd(-1.0f, true));
        f("HTC", "m7", new esd(56.69f, false));
        f("HTC", "m7cdtu", new esd(56.69f, false));
        f("HTC", "m7cdug", new esd(56.69f, false));
        f("HTC", "m7cdwg", new esd(56.69f, false));
        f("HTC", "m7wls", new esd(56.69f, false));
        f("HTC", "m7wlv", new esd(56.69f, false));
        f("motorola", "ghost", new esd(53.0f, false));
        f("Default", "", new esd(-1.0f, false));
        final String brand = Build.BRAND;
        final StringBuilder sb = new StringBuilder(String.valueOf(brand).length() + 11);
        sb.append("Brand : '");
        sb.append(brand);
        sb.append("' ");
        final String value = String.valueOf(sb.toString());
        final String manufacturer = Build.MANUFACTURER;
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 18 + String.valueOf(manufacturer).length());
        sb2.append(value);
        sb2.append("Manufacturer : '");
        sb2.append(manufacturer);
        sb2.append("' ");
        final String value2 = String.valueOf(sb2.toString());
        final String device = Build.DEVICE;
        final StringBuilder sb3 = new StringBuilder(String.valueOf(value2).length() + 12 + String.valueOf(device).length());
        sb3.append(value2);
        sb3.append("Device : '");
        sb3.append(device);
        sb3.append("' ");
        final String value3 = String.valueOf(sb3.toString());
        final String model = Build.MODEL;
        final StringBuilder sb4 = new StringBuilder(String.valueOf(value3).length() + 11 + String.valueOf(model).length());
        sb4.append(value3);
        sb4.append("Model : '");
        sb4.append(model);
        sb4.append("' ");
        final String value4 = String.valueOf(sb4.toString());
        final String hardware = Build.HARDWARE;
        final StringBuilder sb5 = new StringBuilder(String.valueOf(value4).length() + 14 + String.valueOf(hardware).length());
        sb5.append(value4);
        sb5.append("Hardware : '");
        sb5.append(hardware);
        sb5.append("' ");
        final String value5 = String.valueOf(sb5.toString());
        final String product = Build.PRODUCT;
        final StringBuilder sb6 = new StringBuilder(String.valueOf(value5).length() + 13 + String.valueOf(product).length());
        sb6.append(value5);
        sb6.append("Product : '");
        sb6.append(product);
        sb6.append("' ");
        final String value6 = String.valueOf(sb6.toString());
        final String board = Build.BOARD;
        String.valueOf(value6).length();
        String.valueOf(board).length();
        map.containsKey(e());
        esd a2;
        if ((a2 = map.get(e())) == null) {
            a2 = map.get("Default");
        }
        a = a2;
    }
    
    public static float a(final float n) {
        final esd a = ese.a;
        if (a.a > 0.0f) {
            return a.a;
        }
        float n2 = n;
        if (n > 160.0f) {
            a.k(ese.b.c(), "Reported FOV is larger than the maximum allowed at : %g", n, '\u0573');
            n2 = 55.0f;
        }
        return n2;
    }
    
    public static boolean b() {
        return Build.MODEL.startsWith("GalaxySZ");
    }
    
    public static boolean c() {
        return Build.MODEL.startsWith("Nexus 5");
    }
    
    public static boolean d(final double n) {
        return Math.abs(n) > 8.0;
    }
    
    private static String e() {
        final String value = String.valueOf(Build.MANUFACTURER);
        final String value2 = String.valueOf(Build.DEVICE);
        String concat;
        if (value2.length() != 0) {
            concat = value.concat(value2);
        }
        else {
            concat = new String(value);
        }
        return concat;
    }
    
    private static void f(String concat, final String s, final esd esd) {
        final Map c = ese.c;
        if (s.length() != 0) {
            concat = concat.concat(s);
        }
        else {
            concat = new String(concat);
        }
        c.put(concat, esd);
    }
}
