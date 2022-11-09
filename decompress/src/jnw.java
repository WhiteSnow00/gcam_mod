import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import java.util.Locale;
import android.content.pm.PackageManager$NameNotFoundException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnw extends jmc
{
    protected String a;
    protected String c;
    protected boolean d;
    protected int e;
    public boolean f;
    public boolean g;
    
    public jnw(final jmf jmf) {
        super(jmf);
    }
    
    @Override
    protected final void a() {
        final Context d = this.d();
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = d.getPackageManager().getApplicationInfo(d.getPackageName(), 128);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            this.u("PackageManager doesn't know about the app package", ex);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            this.t("Couldn't get ApplicationInfo to load global config");
            return;
        }
        final Bundle metaData = applicationInfo.metaData;
        if (metaData != null) {
            final int int1 = metaData.getInt("com.google.android.gms.analytics.globalConfigResource");
            if (int1 > 0) {
                final jmf b = super.b;
                final jnf j = lfe.j(int1, new jne(b), new jmb(b));
                if (j != null) {
                    this.q("Loading global XML config values");
                    final String a = j.a;
                    if (a != null) {
                        this.m("XML config - app name", this.c = a);
                    }
                    final String b2 = j.b;
                    if (b2 != null) {
                        this.m("XML config - app version", this.a = b2);
                    }
                    final String c = j.c;
                    boolean g = false;
                    if (c != null) {
                        final String lowerCase = c.toLowerCase(Locale.US);
                        int n;
                        if ("verbose".equals(lowerCase)) {
                            n = 0;
                        }
                        else if ("info".equals(lowerCase)) {
                            n = 1;
                        }
                        else if ("warning".equals(lowerCase)) {
                            n = 2;
                        }
                        else if ("error".equals(lowerCase)) {
                            n = 3;
                        }
                        else {
                            n = -1;
                        }
                        if (n >= 0) {
                            this.r("XML config - log level", n);
                        }
                    }
                    final int d2 = j.d;
                    if (d2 >= 0) {
                        this.e = d2;
                        this.d = true;
                        this.m("XML config - dispatch period (sec)", d2);
                    }
                    final int e = j.e;
                    if (e != -1) {
                        if (e != 0) {
                            g = true;
                        }
                        this.g = g;
                        this.f = true;
                        this.m("XML config - dry run", g);
                    }
                }
            }
        }
    }
}
