import java.util.Map;
import java.util.Set;
import android.hardware.camera2.CameraCharacteristics$Key;
import android.util.ArrayMap;
import android.hardware.camera2.CameraCharacteristics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xs implements xi
{
    public final String a;
    public final CameraCharacteristics b;
    private final ArrayMap c;
    private final pik d;
    private final pik e;
    private final pik f;
    
    public xs(final String a, final CameraCharacteristics b) {
        this.a = a;
        this.b = b;
        this.c = new ArrayMap();
        pip.d(new xr(this, 1));
        this.d = pip.d(new xr(this, 3));
        pip.d(new xr(this, 4));
        this.e = pip.d(new xr(this));
        pip.d(new xr(this, 2));
        this.f = pip.d(new xr(this, 5));
    }
    
    @Override
    public final Object a(final CameraCharacteristics$Key cameraCharacteristics$Key) {
        cameraCharacteristics$Key.getClass();
        Object o = this.c;
        synchronized (o) {
            final Object value = this.c.get((Object)cameraCharacteristics$Key);
            monitorexit(o);
            o = value;
            if (value == null) {
                o = this.b.get(cameraCharacteristics$Key);
                if (o != null) {
                    synchronized (this.c) {
                        ((Map<CameraCharacteristics$Key, ArrayMap>)this.c).put(cameraCharacteristics$Key, (ArrayMap)o);
                    }
                }
            }
            return o;
        }
    }
    
    @Override
    public final Set b() {
        return (Set)this.e.a();
    }
    
    @Override
    public final Set c() {
        return (Set)this.d.a();
    }
    
    @Override
    public final Set d() {
        return (Set)this.f.a();
    }
}
