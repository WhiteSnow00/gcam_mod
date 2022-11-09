import java.util.ArrayList;
import java.util.List;
import com.google.android.libraries.camera.jni.graphics.HardwareBuffers;
import android.graphics.Rect;
import com.google.android.libraries.camera.jni.graphics.HardwarePixels;
import android.hardware.HardwareBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgy implements lju
{
    private final HardwareBuffer a;
    private final long b;
    private final HardwarePixels c;
    private volatile Rect d;
    
    public lgy(final HardwareBuffer a, final long b) {
        a.getClass();
        this.a = a;
        HardwarePixels c;
        if (HardwareBuffers.lockingIsSupported()) {
            njo.p(HardwareBuffers.lockingIsSupported(), "Locking is not supported on this build!");
            c = new HardwarePixels(a);
        }
        else {
            c = null;
        }
        this.c = c;
        this.b = b;
        this.d = new Rect(0, 0, a.getWidth(), a.getHeight());
    }
    
    @Override
    public final int a() {
        switch (this.a.getFormat()) {
            default: {
                return 34;
            }
            case 35: {
                return 35;
            }
            case 1:
            case 2: {
                return 1;
            }
        }
    }
    
    @Override
    public final int b() {
        return this.a.getHeight();
    }
    
    @Override
    public final int c() {
        return this.a.getWidth();
    }
    
    @Override
    public final void close() {
        try (final HardwarePixels c = this.c) {}
        synchronized (this.a) {
            this.a.close();
        }
    }
    
    @Override
    public final long d() {
        return this.b;
    }
    
    @Override
    public final Rect e() {
        return new Rect(this.d);
    }
    
    @Override
    public final HardwareBuffer f() {
        synchronized (this.a) {
            if (this.a.isClosed()) {
                return null;
            }
            return HardwareBuffers.fork(this.a);
        }
    }
    
    @Override
    public final lfa g() {
        return lfa.a();
    }
    
    @Override
    public final List h() {
        final HardwarePixels c = this.c;
        List<E> l;
        if (c != null) {
            final int nativePlaneCount = HardwarePixels.nativePlaneCount(c.b);
            if (nativePlaneCount < 0) {
                throw new UnsupportedOperationException("This Android version does not support image plane access!");
            }
            l = new ArrayList(nativePlaneCount);
            for (int i = 0; i < nativePlaneCount; ++i) {
                l.add((E)new lgz(c, i, c.a.getHeight()));
            }
        }
        else {
            l = nns.l();
        }
        return l;
    }
    
    @Override
    public final void i(final Rect rect) {
        this.d = new Rect(rect);
    }
}
