import android.media.Image$Plane;
import java.util.Arrays;
import java.util.List;
import android.hardware.HardwareBuffer;
import android.graphics.Rect;
import android.media.Image;

// 
// Decompiled by Procyon v0.6.0
// 

public final class let implements lju, ljc
{
    public final int a;
    public final int b;
    public final int c;
    private final Object d;
    private final Image e;
    private final long f;
    private volatile nns g;
    private Rect h;
    
    public let(final Image e) {
        this.d = new Object();
        this.e = e;
        this.a = e.getFormat();
        this.b = e.getWidth();
        this.c = e.getHeight();
        this.f = e.getTimestamp();
    }
    
    @Override
    public final int a() {
        return this.a;
    }
    
    @Override
    public final int b() {
        return this.c;
    }
    
    @Override
    public final int c() {
        return this.b;
    }
    
    @Override
    public final void close() {
        synchronized (this.d) {
            this.e.close();
        }
    }
    
    @Override
    public final long d() {
        return this.f;
    }
    
    @Override
    public final Rect e() {
        final Object d = this.d;
        monitorenter(d);
        try {
            try {
                final Rect cropRect = this.e.getCropRect();
                this.h = cropRect;
                monitorexit(d);
                return cropRect;
            }
            finally {
                monitorexit(d);
            }
        }
        catch (final IllegalStateException ex) {}
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof lju)) {
            return false;
        }
        final lju lju = (lju)o;
        return lju.a() == this.a && lju.c() == this.b && lju.b() == this.c && lju.d() == this.f;
    }
    
    @Override
    public final HardwareBuffer f() {
        try {
            synchronized (this.d) {
                return this.e.getHardwareBuffer();
            }
        }
        catch (final IllegalStateException ex) {}
        catch (final NoSuchMethodError noSuchMethodError) {}
        return null;
    }
    
    @Override
    public final lfa g() {
        synchronized (this.d) {
            return new lfa(this.e);
        }
    }
    
    @Override
    public final List h() {
        return this.k();
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.f });
    }
    
    @Override
    public final void i(final Rect rect) {
        synchronized (this.d) {
            this.h = rect;
            try {
                this.e.setCropRect(rect);
            }
            catch (final IllegalStateException ex) {}
        }
    }
    
    public final nns k() {
        final nns g = this.g;
        if (g == null) {
            synchronized (this.d) {
                if (this.g == null) {
                    final Image$Plane[] planes = this.e.getPlanes();
                    nns g2;
                    if (planes == null) {
                        g2 = nns.l();
                    }
                    else {
                        final nnn nnn = new nnn();
                        for (int length = planes.length, i = 0; i < length; ++i) {
                            nnn.g(new les(planes[i]));
                        }
                        g2 = nnn.f();
                    }
                    this.g = g2;
                }
            }
        }
        return g;
    }
    
    @Override
    public final String toString() {
        final String f = lou.f(this.a);
        final int b = this.b;
        final long f2 = this.f;
        final StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 39);
        sb.append("Image-");
        sb.append(f);
        sb.append("w");
        sb.append(b);
        sb.append("-");
        sb.append(f2);
        return sb.toString();
    }
}
