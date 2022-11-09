import java.util.List;
import android.hardware.camera2.CaptureResult$Key;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public class leq implements lji
{
    private final CaptureResult a;
    private final Map b;
    
    public leq(final CaptureResult a) {
        this.b = (Map)new ConcurrentHashMap();
        this.a = a;
    }
    
    @Override
    public final int a() {
        return this.a.getSequenceId();
    }
    
    @Override
    public final long b() {
        return this.a.getFrameNumber();
    }
    
    @Override
    public final ljh c() {
        return new len(this.a.getRequest());
    }
    
    @Override
    public final Object d(final CaptureResult$Key captureResult$Key) {
        lep lep = this.b.get(captureResult$Key);
        if (lep == null) {
            synchronized (this.b) {
                lep = this.b.get(captureResult$Key);
                lep lep2;
                if (lep == null) {
                    lep = new lep(this.a, captureResult$Key);
                    this.b.put(captureResult$Key, lep);
                    lep2 = lep;
                }
                else {
                    lep2 = lep;
                }
                monitorexit(this.b);
                lep = lep2;
            }
        }
        final Object d;
        if ((d = lep.d) == lep.a) {
            synchronized (lep) {
                if (lep.d == lep.a) {
                    lep.d = lep.b.get(lep.c);
                }
            }
        }
        return d;
    }
    
    @Override
    public final String e() {
        try {
            return (String)CaptureResult.class.getDeclaredMethod("getCameraId", (Class<?>[])new Class[0]).invoke(this.a, new Object[0]);
        }
        catch (final ReflectiveOperationException ex) {
            return null;
        }
    }
    
    @Override
    public final List f() {
        return this.a.getKeys();
    }
}
