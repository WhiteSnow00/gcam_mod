import android.hardware.camera2.CameraCharacteristics;
import java.util.Locale;
import java.util.Arrays;
import android.hardware.camera2.CameraManager;
import android.os.Trace;
import android.os.SystemClock;
import android.content.Context;
import android.util.ArrayMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xv
{
    public final yh a;
    public final ArrayMap b;
    private final Context c;
    
    public xv(final Context c, final yj yj, final yh a) {
        yj.getClass();
        a.getClass();
        this.c = c;
        this.a = a;
        this.b = new ArrayMap();
    }
    
    public final xs a(final String s, final boolean b) {
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        final StringBuilder sb = new StringBuilder();
        sb.append("Camera-");
        sb.append(s);
        sb.append("#readCameraMetadata");
        final String string = sb.toString();
        try {
            Trace.beginSection(string);
            try {
                final Object systemService = this.c.getSystemService("camera");
                if (systemService != null) {
                    final CameraCharacteristics cameraCharacteristics = ((CameraManager)systemService).getCameraCharacteristics(s);
                    cameraCharacteristics.getClass();
                    final xs xs = new xs(s, cameraCharacteristics);
                    final long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    String s2;
                    if (!b) {
                        s2 = "";
                    }
                    else {
                        s2 = " (redacted)";
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Loaded metadata for ");
                    sb2.append((Object)xh.b(s));
                    sb2.append(" in ");
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("%.");
                    sb3.append(3);
                    sb3.append("f ms");
                    final String string2 = sb3.toString();
                    final double n = (double)(elapsedRealtimeNanos2 - elapsedRealtimeNanos);
                    Double.isNaN(n);
                    final String format = String.format(null, string2, Arrays.copyOf(new Object[] { n / 1000000.0 }, 1));
                    format.getClass();
                    sb2.append(format);
                    sb2.append(s2);
                    sb2.toString();
                    return xs;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            }
            finally {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to load metadata for ");
                sb4.append((Object)xh.b(s));
                sb4.append('!');
                final Throwable t;
                throw new IllegalStateException(sb4.toString(), t);
            }
        }
        finally {
            Trace.endSection();
        }
    }
}
