import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import android.content.pm.PackageManager;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpc
{
    public static final String a;
    public static final String b;
    public static final List c;
    private static final lpz i;
    public final Context d;
    public final PackageManager e;
    public final List f;
    public lpz g;
    public boolean h;
    
    static {
        a = String.format("content://%s/publicvalue/lens_oem_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");
        b = String.format("content://%s/publicvalue/ar_stickers_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");
        c = Collections.unmodifiableList((List<?>)Arrays.asList("Google"));
        final okt m = lpz.f.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final lpz lpz = (lpz)m.b;
        final int a2 = 0x1 | lpz.a;
        lpz.a = a2;
        lpz.b = "1.2.1";
        final int a3 = a2 | 0x2;
        lpz.a = a3;
        lpz.c = "";
        lpz.d = -1;
        final int a4 = a3 | 0x4;
        lpz.a = a4;
        lpz.e = -1;
        lpz.a = (a4 | 0x8);
        i = (lpz)m.h();
    }
    
    public lpc(final Context d) {
        final PackageManager packageManager = d.getPackageManager();
        this.f = new ArrayList();
        this.d = d;
        this.e = packageManager;
        this.h = false;
        final lpz i = lpc.i;
        this.g = i;
        try {
            final PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.googlequicksearchbox", 0);
            if (packageInfo != null) {
                final okt okt = (okt)i.H(5);
                okt.o(i);
                final String versionName = packageInfo.versionName;
                if (okt.c) {
                    okt.m();
                    okt.c = false;
                }
                final lpz lpz = (lpz)okt.b;
                final lpz f = lpz.f;
                versionName.getClass();
                lpz.a |= 0x2;
                lpz.c = versionName;
                this.g = (lpz)okt.h();
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.w("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
        }
        new lpb(this).execute((Object[])new Void[0]);
    }
    
    public final void a(final loz loz) {
        if (this.h) {
            loz.a(this.g);
            return;
        }
        this.f.add(loz);
    }
}
