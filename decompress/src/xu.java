import java.io.Serializable;
import java.util.ArrayList;
import android.hardware.camera2.CameraAccessException;
import android.util.Log;
import android.hardware.camera2.CameraManager;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xu
{
    public final yj a;
    public final Object b;
    public List c;
    private final pii d;
    
    public xu(final pii d, final yj a) {
        a.getClass();
        this.d = d;
        this.a = a;
        this.b = new Object();
    }
    
    public final List a() {
        Object o = this.b;
        monitorenter(o);
        try {
            final List c = this.c;
            monitorexit(o);
            final List list = null;
            if (c == null) {
                o = null;
            }
            else {
                o = (c.isEmpty() ^ true);
            }
            if (plr.b(o, true)) {
                return c;
            }
            o = this.d.get();
            try {
                o = ((CameraManager)o).getCameraIdList();
            }
            catch (CameraAccessException o) {
                Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", (Throwable)o);
                o = null;
            }
            int i = 0;
            Object value;
            if (o == null) {
                value = null;
            }
            else {
                value = (((Throwable)o).length == 0);
            }
            if (plr.b(value, true)) {
                Log.w("CXCP", "Failed to query CameraManager#getCameraIdList: No values returned.");
            }
            if (o == null) {
                o = list;
            }
            else {
                final int length = ((Throwable)o).length;
                final ArrayList list2 = new ArrayList(length);
                while (i < length) {
                    final String s = o[i];
                    s.getClass();
                    s.getClass();
                    list2.add((Object)xh.a(s));
                    ++i;
                }
                o = list2;
            }
            Serializable a = (Serializable)o;
            if (o == null) {
                a = pja.a;
            }
            return (List)a;
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
