import java.util.Arrays;
import java.util.Locale;
import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public final class liz
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    
    private liz(final long n) {
        final boolean b = true;
        this.a = (n == -8977428044353436645L);
        this.m = (n == 2353878190013225779L);
        this.l = (n == 5177423953723387160L);
        this.n = (n == 1998349393618216766L);
        this.o = (n == -3048193804805810922L);
        this.b = (n == -1134170917312626182L);
        this.p = (n == 7819589124620182093L);
        this.c = (n == 1863053326329578117L);
        this.q = (n == -6540513541338685385L);
        this.r = (n == 8020350475331722164L);
        this.s = (n == 4736388726057620427L);
        this.d = (n == 1128693008105137506L);
        this.e = (n == 8617630140713188829L);
        this.f = (n == -2165063365505996463L);
        this.g = (n == -6176613516764112573L);
        this.t = (n == 8476275058780644385L);
        this.h = (n == -5619725207126906835L);
        this.u = (n == -1152407906810979636L);
        this.i = (n == 4003097551557419468L);
        this.j = (n == -3704938238089310216L);
        this.k = (n == -1280572264377593363L && b);
    }
    
    public static liz a() {
        final String manufacturer = Build.MANUFACTURER;
        final String device = Build.DEVICE;
        final String fingerprint = Build.FINGERPRINT;
        final String i = i(manufacturer);
        final String j = i(device);
        final String k = i(fingerprint);
        liz liz;
        if (!j.startsWith("GENERIC") && !k.startsWith("GENERIC") && !k.contains("SDK_") && !k.contains("_SDK")) {
            final StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 34 + String.valueOf(i).length());
            sb.append("G1V5VHBME0Mq6trmUxb9Q9URJXm0Sof1|");
            sb.append(j);
            sb.append("|");
            sb.append(i);
            final String string = sb.toString();
            final nwd a = nwf.a();
            final String upperCase = string.toUpperCase(Locale.ROOT);
            final int length = upperCase.length();
            final int n = length + length;
            final int n2 = 1;
            njo.g(n >= 0, "expectedInputSize must be >= 0 but was %s", n);
            final och a2 = ((nwa)a).a();
            final int length2 = upperCase.length();
            int l = 0;
            while (l < length2) {
                final char char1 = upperCase.charAt(l);
                final nvz nvz = (nvz)a2;
                nvz.a.putChar(char1);
                try {
                    ((nvz)a2).a(((nvz)a2).a.array());
                    nvz.a.clear();
                    ++l;
                    continue;
                }
                finally {
                    nvz.a.clear();
                }
                break;
            }
            final nwg nwg = (nwg)a2;
            nwg.b();
            nwg.d = true;
            nwc nwc;
            if (nwg.c == nwg.b.getDigestLength()) {
                nwc = nwc.e(nwg.b.digest());
            }
            else {
                nwc = nwc.e(Arrays.copyOf(nwg.b.digest(), nwg.c));
            }
            final nwb nwb = (nwb)nwc;
            final int length3 = nwb.a.length;
            njo.q(length3 >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length3);
            long n3 = nwb.a[0] & 0xFF;
            for (int n4 = n2; n4 < Math.min(nwb.a.length, 8); ++n4) {
                n3 |= ((long)nwb.a[n4] & 0xFFL) << n4 * 8;
            }
            liz = new liz(n3);
        }
        else {
            liz = new liz(-8977428044353436645L);
        }
        return liz;
    }
    
    private static String i(String upperCase) {
        if (upperCase == null) {
            upperCase = "unknown";
        }
        else {
            upperCase = upperCase.toUpperCase(Locale.ROOT);
        }
        return upperCase;
    }
    
    public final boolean b() {
        return this.m || this.l;
    }
    
    public final boolean c() {
        return this.n || this.o;
    }
    
    public final boolean d() {
        return this.p || this.b;
    }
    
    public final boolean e() {
        return this.r || this.s || this.d;
    }
    
    public final boolean f() {
        return this.c || this.q;
    }
    
    public final boolean g() {
        return this.f || this.g;
    }
    
    public final boolean h() {
        return this.t || this.u || this.i || this.j;
    }
}
