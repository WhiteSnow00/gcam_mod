import android.content.Context;
import android.provider.MediaStore$Video$Media;
import android.provider.MediaStore$Images$Media;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxm implements oun
{
    private final pii a;
    
    public hxm(final pii a) {
        this.a = a;
    }
    
    public final llb a() {
        final Context a = ((egg)this.a).a();
        final SimpleDateFormat j = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.US);
        j.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        final lla lla = new lla();
        lla.a = "IMG_";
        lla.b = "IMG_";
        lla.c = "VID_";
        lla.d = "_tmp.";
        lla.c();
        lla.b();
        lla.a(4);
        lla.d(false);
        lla.e(false);
        lla.j = j;
        lla.g();
        lla.n = "";
        lla.h();
        lla.f();
        lla.q = true;
        lla.r = 0L;
        lla.l = a;
        lla.a = "PXL_";
        lla.b = "PXL_";
        lla.c = "PXL_";
        lla.d = "_PXL_";
        lla.c();
        lla.b();
        lla.a(2);
        lla.d(true);
        lla.e(true);
        lla.g();
        lla.n = "media";
        lla.h();
        lla.f();
        final Context l = lla.l;
        if (l != null) {
            final llt a2 = llu.a(l);
            a2.g(MediaStore$Images$Media.EXTERNAL_CONTENT_URI);
            a2.h(MediaStore$Video$Media.EXTERNAL_CONTENT_URI);
            a2.c = "_display_name";
            a2.f();
            a2.b();
            a2.f = "relative_path";
            a2.c();
            a2.d(1);
            a2.e(3);
            lla.p = a2.a();
            if (lla.k == null) {
                lla.k = nqq.a;
            }
            final String a3 = lla.a;
            if (a3 != null) {
                final String b = lla.b;
                if (b != null) {
                    final String c = lla.c;
                    if (c != null) {
                        final String d = lla.d;
                        if (d != null) {
                            final String e = lla.e;
                            if (e != null) {
                                final String f = lla.f;
                                if (f != null) {
                                    final Integer g = lla.g;
                                    if (g != null && lla.h != null && lla.i != null && lla.j != null && lla.l != null && lla.m != null && lla.n != null && lla.o != null && lla.p != null && lla.q != null && lla.r != null) {
                                        if (lla.s != null) {
                                            return new llb(a3, b, c, d, e, f, g, lla.h, lla.i, lla.j, lla.k, lla.l, lla.m, lla.n, lla.o, lla.p, lla.q, lla.r, lla.s);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final StringBuilder sb = new StringBuilder();
            if (lla.a == null) {
                sb.append(" filenameDefaultPrefix");
            }
            if (lla.b == null) {
                sb.append(" filenameImagePrefix");
            }
            if (lla.c == null) {
                sb.append(" filenameVideoPrefix");
            }
            if (lla.d == null) {
                sb.append(" filenameTmpPrefix");
            }
            if (lla.e == null) {
                sb.append(" filenameBurstTagPrefix");
            }
            if (lla.f == null) {
                sb.append(" filenameBurstPrimaryTag");
            }
            if (lla.g == null) {
                sb.append(" filenameBurstDigitCount");
            }
            if (lla.h == null) {
                sb.append(" filenameBurstTagRequired");
            }
            if (lla.i == null) {
                sb.append(" filenameBurstUseGroupTag");
            }
            if (lla.j == null) {
                sb.append(" filenameGroupFormat");
            }
            if (lla.l == null) {
                sb.append(" storageContext");
            }
            if (lla.m == null) {
                sb.append(" storageCacheSubpath");
            }
            if (lla.n == null) {
                sb.append(" storageDataSubpath");
            }
            if (lla.o == null) {
                sb.append(" storageDcimSubpath");
            }
            if (lla.p == null) {
                sb.append(" defaultContentResolverApi");
            }
            if (lla.q == null) {
                sb.append(" notifyChangeOnPublish");
            }
            if (lla.r == null) {
                sb.append(" notifyChangeTimeoutMs");
            }
            if (lla.s == null) {
                sb.append(" storageAutoPublishTimeoutMs");
            }
            final String value = String.valueOf(sb);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(value);
            throw new IllegalStateException(sb2.toString());
        }
        throw new IllegalStateException("Property \"storageContext\" has not been set");
    }
}
