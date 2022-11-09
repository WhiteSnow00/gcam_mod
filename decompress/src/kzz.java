import android.hardware.camera2.CaptureRequest$Key;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzz
{
    private final Set a;
    private final Set b;
    private final Set c;
    private final Set d;
    private final Set e;
    private final krr f;
    
    public kzz(final Set set, final Set set2, final Set set3, final Set set4, final krr krr) {
        this.b = noi.F(set);
        this.c = noi.F(set2);
        this.d = noi.F(set4);
        this.e = noi.F(set3);
        this.f = krr.a("ParamBlkList");
        final nog d = noi.D();
        d.i(set);
        d.i(set3);
        d.i(set4);
        d.i(set2);
        this.a = d.f();
    }
    
    final boolean a(final CaptureRequest$Key captureRequest$Key) {
        if (this.a.contains(captureRequest$Key)) {
            kzy kzy;
            if (this.b.contains(captureRequest$Key)) {
                kzy = kzy.a;
            }
            else if (this.c.contains(captureRequest$Key)) {
                kzy = kzy.d;
            }
            else if (this.d.contains(captureRequest$Key)) {
                kzy = kzy.c;
            }
            else if (this.e.contains(captureRequest$Key)) {
                kzy = kzy.b;
            }
            else {
                nov.A(this.a.contains(captureRequest$Key) ^ true);
                kzy = null;
            }
            kzy.getClass();
            final krr f = this.f;
            final String name = captureRequest$Key.getName();
            final String f2 = kzy.f;
            final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 45 + String.valueOf(f2).length());
            sb.append("Trying to update a blacklisted parameter : ");
            sb.append(name);
            sb.append(". ");
            sb.append(f2);
            f.h(sb.toString());
            return true;
        }
        return false;
    }
}
