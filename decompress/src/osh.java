import java.security.GeneralSecurityException;
import android.util.Log;
import java.security.MessageDigest;
import android.view.Display$Mode;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.Iterator;
import android.util.Size;
import android.os.Build;
import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osh
{
    private static final String a;
    private static ArrayList b;
    private static final List c;
    
    static {
        a = osh.class.getSimpleName();
        osh.b = null;
        final osg osg = new osg("Micromax", null, "4560MMX", null, 217.0f, 217.0f);
        final osg osg2 = new osg("HTC", "endeavoru", "HTC One X", null, 312.0f, 312.0f);
        final osg osg3 = new osg("samsung", null, "SM-G920P", null, 575.0f, 575.0f);
        final osg osg4 = new osg("samsung", null, "SM-G930", null, 581.0f, 580.0f);
        final osg osg5 = new osg("samsung", null, "SM-G9300", null, 581.0f, 580.0f);
        final osg osg6 = new osg("samsung", null, "SM-G930A", null, 581.0f, 580.0f);
        final osg osg7 = new osg("samsung", null, "SM-G930F", null, 581.0f, 580.0f);
        final osg osg8 = new osg("samsung", null, "SM-G930P", null, 581.0f, 580.0f);
        final osg osg9 = new osg("samsung", null, "SM-G930R4", null, 581.0f, 580.0f);
        final osg osg10 = new osg("samsung", null, "SM-G930T", null, 581.0f, 580.0f);
        final osg osg11 = new osg("samsung", null, "SM-G930V", null, 581.0f, 580.0f);
        final osg osg12 = new osg("samsung", null, "SM-G930W8", null, 581.0f, 580.0f);
        final osg osg13 = new osg("samsung", null, "SM-N915FY", null, 541.0f, 541.0f);
        final osg osg14 = new osg("samsung", null, "SM-N915A", null, 541.0f, 541.0f);
        final osg osg15 = new osg("samsung", null, "SM-N915T", null, 541.0f, 541.0f);
        final osg osg16 = new osg("samsung", null, "SM-N915K", null, 541.0f, 541.0f);
        final osg osg17 = new osg("samsung", null, "SM-N915T", null, 541.0f, 541.0f);
        final osg osg18 = new osg("samsung", null, "SM-N915G", null, 541.0f, 541.0f);
        final osg osg19 = new osg("samsung", null, "SM-N915D", null, 541.0f, 541.0f);
        final osg osg20 = new osg("BLU", "BLU", "Studio 5.0 HD LTE", "qcom", 294.0f, 294.0f);
        final osg osg21 = new osg("OnePlus", "A0001", "A0001", "bacon", 401.0f, 401.0f);
        final osg osg22 = new osg("THL", "THL", "thl 5000", "mt6592", 441.0f, 441.0f);
        final Float value = 441.74f;
        final Float value2 = 0.004f;
        final osg osg23 = new osg("Google", "sailfish", "Pixel", "sailfish", value, value, value2);
        final Float value3 = 537.57f;
        final osg osg24 = new osg("Google", "marlin", "Pixel XL", "marlin", value3, value3, value2);
        final osg osg25 = new osg("Google", "walleye", null, "walleye", value, value, value2);
        final osg osg26 = new osg("Google", "taimen", null, "taimen", null, null, 0.0046f);
        final Float value4 = 522.63f;
        final Float value5 = 0.0038f;
        c = Arrays.asList(osg, osg2, osg3, osg4, osg5, osg6, osg7, osg8, osg9, osg10, osg11, osg12, osg13, osg14, osg15, osg16, osg17, osg18, osg19, osg20, osg21, osg22, osg23, osg24, osg25, osg26, new osg("Google", "21c8b5470a64adbb25bc84316cbc449361d86839", null, null, value4, value4, value5), new osg("Google", "6e2c7e24b7c7eae9fc94882c9f31befa00594872", null, null, null, null, value5), new osg("LGE", "joan", null, "joan", null, null, value5), new osg("LGE", "e44046539bb5b584279553ca6eacca937c8e16cf", null, null, null, null, value5), new osg("Lenovo", "vega", null, "vega", 537.388f, 537.882f));
    }
    
    private osh() {
    }
    
    public static osy a(final Context context) {
        final okt m = osy.e.m();
        final List c = osh.c;
        final String manufacturer = Build.MANUFACTURER;
        final String device = Build.DEVICE;
        final String model = Build.MODEL;
        final String hardware = Build.HARDWARE;
        final String b = b(device);
        final Iterator iterator = c.iterator();
        osg osg;
        List list;
        do {
            final boolean hasNext = iterator.hasNext();
            list = null;
            if (!hasNext) {
                return null;
            }
            osg = (osg)iterator.next();
        } while (!osg.a(manufacturer, device, model, hardware) && !osg.a(manufacturer, b, model, hardware));
        String.format("Found override: {MANUFACTURER=%s, DEVICE=%s, MODEL=%s, HARDWARE=%s} : x_ppi=%f, y_ppi=%f, bottom_bezel_height=%f)", osg.a, osg.b, osg.c, osg.d, osg.e, osg.f, osg.g);
        final Float e = osg.e;
        if (e != null) {
            final float floatValue = e;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final osy osy = (osy)m.b;
            osy.a |= 0x1;
            osy.b = floatValue;
        }
        final Float f = osg.f;
        if (f != null) {
            final float floatValue2 = f;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final osy osy2 = (osy)m.b;
            osy2.a |= 0x2;
            osy2.c = floatValue2;
        }
        final Float g = osg.g;
        if (g != null) {
            final float floatValue3 = g;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final osy osy3 = (osy)m.b;
            osy3.a |= 0x4;
            osy3.d = floatValue3;
        }
        if ("samsung".equals(Build.MANUFACTURER)) {
            final Display n = pqf.n(context);
            final DisplayMetrics i = pqf.m(n);
            int n2 = i.widthPixels;
            List list2;
            if (n == null) {
                list2 = list;
            }
            else {
                list2 = osh.b;
                if (list2 == null) {
                    osh.b = new ArrayList();
                    final Display$Mode[] supportedModes = n.getSupportedModes();
                    if (supportedModes != null) {
                        for (final Display$Mode display$Mode : supportedModes) {
                            osh.b.add(new Size(display$Mode.getPhysicalWidth(), display$Mode.getPhysicalHeight()));
                        }
                    }
                    list2 = osh.b;
                }
            }
            if (list2 != null) {
                for (int size = list2.size(), k = 0; k < size; ++k) {
                    final Size size2 = (Size)list2.get(k);
                    n2 = Math.max(n2, Math.max(size2.getWidth(), size2.getHeight()));
                }
                if (i.widthPixels != n2) {
                    final float n3 = i.widthPixels / (float)n2;
                    final StringBuilder sb = new StringBuilder(61);
                    sb.append("Non-native screen resolution; scaling DPI by: ");
                    sb.append(n3);
                    sb.toString();
                    final float b2 = ((osy)m.b).b;
                    if (m.c) {
                        m.m();
                        m.c = false;
                    }
                    final osy osy4 = (osy)m.b;
                    final int a = osy4.a | 0x1;
                    osy4.a = a;
                    osy4.b = b2 * n3;
                    final float c2 = osy4.c;
                    osy4.a = (a | 0x2);
                    osy4.c = c2 * n3;
                }
            }
        }
        return (osy)m.h();
    }
    
    private static String b(final String s) {
        try {
            final byte[] digest = MessageDigest.getInstance("SHA-1").digest(s.getBytes());
            final int length = digest.length;
            final StringBuilder sb = new StringBuilder(length + length);
            for (int i = 0; i < length; ++i) {
                sb.append(String.format("%02x", digest[i]));
            }
            return sb.toString();
        }
        catch (final GeneralSecurityException ex) {
            Log.e(osh.a, "SHA-256 is missing");
            return s;
        }
    }
}
