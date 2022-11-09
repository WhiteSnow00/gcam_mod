import android.util.TypedValue;
import android.content.Context;
import android.view.View;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import java.util.Iterator;
import java.util.Collection;
import android.hardware.camera2.CameraCharacteristics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class leg
{
    public leg() {
    }
    
    public leg(final lfg lfg) {
        ((Integer)lfg.n(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE, 0)).intValue();
    }
    
    public static long a(final Collection collection) {
        final Iterator iterator = collection.iterator();
        long n = 0L;
        while (iterator.hasNext()) {
            final ldw ldw = (ldw)iterator.next();
            final long f = ldw.f();
            nov.C(f >= 0L, "bytesPerImage() must be >= 0", new Object[0]);
            if (!ldw.i()) {
                n += f;
            }
        }
        return n;
    }
    
    public static void b(final lda lda, final Handler handler) {
        handler.post((Runnable)new lcu(lda));
    }
    
    public static void c(final Collection collection, final Handler handler) {
        handler.post((Runnable)new lcv(collection));
    }
    
    public static boolean d(final kzl kzl, final kzl kzl2, final krr krr) {
        if (kzl2 != kzl && !kzl.d.isEmpty() && !kzl2.d.isEmpty()) {
            final Iterator<Object> iterator = kzl2.d.iterator();
            boolean b = true;
        Label_0045:
            while (iterator.hasNext()) {
                final kws kws = iterator.next();
                final Iterator<Object> iterator2 = kzl.d.iterator();
                boolean b2 = b;
                while (true) {
                    b = b2;
                    if (!iterator2.hasNext()) {
                        continue Label_0045;
                    }
                    final kws kws2 = iterator2.next();
                    if (!kws.a.equals((Object)kws2.a) || kws.b.equals(kws2.b)) {
                        continue;
                    }
                    if (krr == null) {
                        break;
                    }
                    krr.d(ksc.c("%s on %s (%s) conflicts with %s (%s)", kws2.a(), kzl, kws2.b, kzl2, kws.b));
                    b2 = false;
                }
                return false;
            }
            return b;
        }
        return true;
    }
    
    public static int e(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 323: {
                return 323;
            }
            case 322: {
                return 322;
            }
            case 321: {
                return 321;
            }
            case 320: {
                return 320;
            }
            case 319: {
                return 319;
            }
            case 318: {
                return 318;
            }
            case 317: {
                return 317;
            }
            case 316: {
                return 316;
            }
            case 315: {
                return 315;
            }
            case 314: {
                return 314;
            }
            case 313: {
                return 313;
            }
            case 312: {
                return 312;
            }
            case 311: {
                return 311;
            }
            case 310: {
                return 310;
            }
            case 309: {
                return 309;
            }
            case 308: {
                return 308;
            }
            case 307: {
                return 307;
            }
            case 306: {
                return 306;
            }
            case 305: {
                return 305;
            }
            case 304: {
                return 304;
            }
            case 303: {
                return 303;
            }
            case 302: {
                return 302;
            }
            case 301: {
                return 301;
            }
            case 300: {
                return 300;
            }
            case 299: {
                return 299;
            }
            case 298: {
                return 298;
            }
            case 297: {
                return 297;
            }
            case 296: {
                return 296;
            }
            case 295: {
                return 295;
            }
            case 294: {
                return 294;
            }
            case 293: {
                return 293;
            }
            case 292: {
                return 292;
            }
            case 291: {
                return 291;
            }
            case 290: {
                return 290;
            }
            case 289: {
                return 289;
            }
            case 288: {
                return 288;
            }
            case 287: {
                return 287;
            }
            case 286: {
                return 286;
            }
            case 285: {
                return 285;
            }
            case 284: {
                return 284;
            }
            case 283: {
                return 283;
            }
            case 282: {
                return 282;
            }
            case 281: {
                return 281;
            }
            case 280: {
                return 280;
            }
            case 279: {
                return 279;
            }
            case 278: {
                return 278;
            }
            case 277: {
                return 277;
            }
            case 276: {
                return 276;
            }
            case 273: {
                return 273;
            }
            case 271: {
                return 271;
            }
            case 270: {
                return 270;
            }
            case 269: {
                return 269;
            }
            case 268: {
                return 268;
            }
            case 267: {
                return 267;
            }
            case 266: {
                return 266;
            }
            case 265: {
                return 265;
            }
            case 264: {
                return 264;
            }
            case 263: {
                return 263;
            }
            case 262: {
                return 262;
            }
            case 261: {
                return 261;
            }
            case 260: {
                return 260;
            }
            case 259: {
                return 259;
            }
            case 256: {
                return 256;
            }
            case 255: {
                return 255;
            }
            case 254: {
                return 254;
            }
            case 253: {
                return 253;
            }
            case 251: {
                return 251;
            }
            case 250: {
                return 250;
            }
            case 249: {
                return 249;
            }
            case 248: {
                return 248;
            }
            case 247: {
                return 247;
            }
            case 246: {
                return 246;
            }
            case 245: {
                return 245;
            }
            case 244: {
                return 244;
            }
            case 243: {
                return 243;
            }
            case 242: {
                return 242;
            }
            case 241: {
                return 241;
            }
            case 240: {
                return 240;
            }
            case 239: {
                return 239;
            }
            case 238: {
                return 238;
            }
            case 233: {
                return 233;
            }
            case 232: {
                return 232;
            }
            case 231: {
                return 231;
            }
            case 228: {
                return 228;
            }
            case 227: {
                return 227;
            }
            case 223: {
                return 223;
            }
            case 221: {
                return 221;
            }
            case 220: {
                return 220;
            }
            case 219: {
                return 219;
            }
            case 218: {
                return 218;
            }
            case 206: {
                return 206;
            }
            case 205: {
                return 205;
            }
            case 204: {
                return 204;
            }
            case 203: {
                return 203;
            }
            case 202: {
                return 202;
            }
            case 200: {
                return 200;
            }
            case 194: {
                return 194;
            }
            case 189: {
                return 189;
            }
            case 188: {
                return 188;
            }
            case 187: {
                return 187;
            }
            case 186: {
                return 186;
            }
            case 185: {
                return 185;
            }
            case 184: {
                return 184;
            }
            case 183: {
                return 183;
            }
            case 182: {
                return 182;
            }
            case 181: {
                return 181;
            }
            case 180: {
                return 180;
            }
            case 154: {
                return 154;
            }
            case 153: {
                return 153;
            }
            case 152: {
                return 152;
            }
            case 151: {
                return 151;
            }
            case 150: {
                return 150;
            }
            case 148: {
                return 148;
            }
            case 146: {
                return 146;
            }
            case 145: {
                return 145;
            }
            case 143: {
                return 143;
            }
            case 142: {
                return 142;
            }
            case 141: {
                return 141;
            }
            case 136: {
                return 136;
            }
            case 135: {
                return 135;
            }
            case 134: {
                return 134;
            }
            case 133: {
                return 133;
            }
            case 132: {
                return 132;
            }
            case 126: {
                return 126;
            }
            case 123: {
                return 123;
            }
            case 122: {
                return 122;
            }
            case 121: {
                return 121;
            }
            case 120: {
                return 120;
            }
            case 119: {
                return 119;
            }
            case 118: {
                return 118;
            }
            case 117: {
                return 117;
            }
            case 116: {
                return 116;
            }
            case 115: {
                return 115;
            }
            case 113: {
                return 113;
            }
            case 111: {
                return 111;
            }
            case 110: {
                return 110;
            }
            case 108: {
                return 108;
            }
            case 107: {
                return 107;
            }
            case 106: {
                return 106;
            }
            case 105: {
                return 105;
            }
            case 104: {
                return 104;
            }
            case 103: {
                return 103;
            }
            case 102: {
                return 102;
            }
            case 100: {
                return 100;
            }
            case 99: {
                return 99;
            }
            case 98: {
                return 98;
            }
            case 97: {
                return 97;
            }
            case 96: {
                return 96;
            }
            case 95: {
                return 95;
            }
            case 94: {
                return 94;
            }
            case 88: {
                return 88;
            }
            case 85: {
                return 85;
            }
            case 84: {
                return 84;
            }
            case 82: {
                return 82;
            }
            case 79: {
                return 79;
            }
            case 78: {
                return 78;
            }
            case 77: {
                return 77;
            }
            case 76: {
                return 76;
            }
            case 74: {
                return 74;
            }
            case 72: {
                return 72;
            }
            case 68: {
                return 68;
            }
            case 67: {
                return 67;
            }
            case 64: {
                return 64;
            }
            case 63: {
                return 63;
            }
            case 60: {
                return 60;
            }
            case 58: {
                return 58;
            }
            case 57: {
                return 57;
            }
            case 51: {
                return 51;
            }
            case 49: {
                return 49;
            }
            case 48: {
                return 48;
            }
            case 47: {
                return 47;
            }
            case 44: {
                return 44;
            }
            case 43: {
                return 43;
            }
            case 42: {
                return 42;
            }
            case 39: {
                return 39;
            }
            case 38: {
                return 38;
            }
            case 35: {
                return 35;
            }
            case 33: {
                return 33;
            }
            case 32: {
                return 32;
            }
            case 30: {
                return 30;
            }
            case 29: {
                return 29;
            }
            case 26: {
                return 26;
            }
            case 24: {
                return 24;
            }
            case 18: {
                return 18;
            }
            case 16: {
                return 16;
            }
            case 14: {
                return 14;
            }
            case 7: {
                return 7;
            }
            case 1: {
                return 1;
            }
        }
    }
    
    public static String f(long hours) {
        final long n = TimeUnit.MILLISECONDS.toSeconds(hours) % TimeUnit.MINUTES.toSeconds(1L);
        final long n2 = TimeUnit.MILLISECONDS.toMinutes(hours) % TimeUnit.HOURS.toMinutes(1L);
        hours = TimeUnit.MILLISECONDS.toHours(hours);
        if (hours > 0L) {
            return String.format("%1d:%02d:%02d", hours, n2, n);
        }
        return String.format("%1d:%02d", n2, n);
    }
    
    public static int g(final View view) {
        return neu.c(view, 2130968857);
    }
    
    public static int h(final View view) {
        return neu.c(view, 2130968875);
    }
    
    public static int i(final View view) {
        return neu.c(view, 2130968878);
    }
    
    public static int j(final View view) {
        return neu.c(view, 2130968883);
    }
    
    public static int k(final View view) {
        return neu.c(view, 2130968900);
    }
    
    public static int l(final View view) {
        return lrx.b(2131165589, view.getContext());
    }
    
    public static int m(final View view) {
        return neu.c(view, 2130968909);
    }
    
    public static int n(final Context context, final int n) {
        final TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(n, typedValue, true)) {
            return 0;
        }
        return typedValue.resourceId;
    }
}
