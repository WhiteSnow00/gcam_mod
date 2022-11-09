import java.util.Map;
import android.os.Trace;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xq
{
    public final xu a;
    private final xv b;
    
    public xq(final xu a, final xv b) {
        a.getClass();
        b.getClass();
        this.a = a;
        this.b = b;
    }
    
    public final xi a(final String s) {
        s.getClass();
        final xv b = this.b;
        s.getClass();
        final StringBuilder sb = new StringBuilder();
        sb.append("Camera-");
        sb.append(s);
        sb.append("#awaitMetadata");
        final String string = sb.toString();
        try {
            Trace.beginSection(string);
            synchronized (b.b) {
                final xi xi = (xi)b.b.get((Object)s);
                xi a;
                if (xi != null) {
                    monitorexit(b.b);
                    a = xi;
                }
                else {
                    final yh a2 = b.a;
                    if (!a2.b) {
                        Trace.beginSection("CXCP#checkCameraPermission");
                        if (xn.a(a2.a, "android.permission.CAMERA") == 0) {
                            a2.b = true;
                        }
                        Trace.endSection();
                    }
                    if (!a2.b) {
                        monitorexit(b.b);
                        a = b.a(s, true);
                    }
                    else {
                        final xs a3 = b.a(s, false);
                        ((Map<String, xs>)b.b).put(s, a3);
                        monitorexit(b.b);
                        a = a3;
                    }
                }
                return a;
            }
        }
        finally {
            Trace.endSection();
        }
    }
}
