import java.util.Iterator;
import java.util.List;
import android.hardware.HardwareBuffer;
import android.graphics.Rect;
import com.google.android.libraries.lens.lenslite.api.ImageProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class euh implements ImageProxy
{
    private final lju a;
    
    public euh(final lju a) {
        this.a = a;
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    @Override
    public final Rect getCropRect() {
        return this.a.e();
    }
    
    @Override
    public final int getFormat() {
        return this.a.a();
    }
    
    @Override
    public final HardwareBuffer getHardwareBuffer() {
        return this.a.f();
    }
    
    @Override
    public final int getHeight() {
        return this.a.b();
    }
    
    @Override
    public final List getPlanes() {
        final List h = this.a.h();
        final nnn nnn = new nnn();
        final Iterator iterator = h.iterator();
        while (iterator.hasNext()) {
            nnn.g(new eug((ljt)iterator.next()));
        }
        return nnn.f();
    }
    
    @Override
    public final long getTimestamp() {
        return this.a.d();
    }
    
    @Override
    public final int getWidth() {
        return this.a.c();
    }
    
    @Override
    public final void setCropRect(final Rect rect) {
        this.a.i(rect);
    }
}
