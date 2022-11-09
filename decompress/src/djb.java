import java.util.List;
import java.util.Collection;
import android.graphics.RectF;
import android.graphics.Rect;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djb
{
    public final nns a;
    public final float b;
    private final long c;
    
    public djb() {
    }
    
    public djb(final long c, final nns a, final float b) {
        this.c = c;
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null faces");
    }
    
    public static djb a(final ljm ljm) {
        final Long n = (Long)ljm.d(CaptureResult.SENSOR_TIMESTAMP);
        final Face[] array = (Face[])ljm.d(CaptureResult.STATISTICS_FACES);
        final Rect rect = (Rect)ljm.d(CaptureResult.SCALER_CROP_REGION);
        n.getClass();
        final nnn e = nns.e();
        Long n2 = n;
        if (array != null) {
            n2 = n;
            if (rect != null) {
                final int length = array.length;
                int n3 = 0;
                final Long n4 = n;
                while (true) {
                    n2 = n4;
                    if (n3 >= length) {
                        break;
                    }
                    final Rect bounds = array[n3].getBounds();
                    e.g(new RectF((bounds.left - rect.left) / (float)rect.width(), (bounds.top - rect.top) / (float)rect.height(), (bounds.right - rect.left) / (float)rect.width(), (bounds.bottom - rect.top) / (float)rect.height()));
                    ++n3;
                }
            }
        }
        float n5;
        if (rect != null) {
            n5 = rect.width() / (float)rect.height();
        }
        else {
            n5 = 1.0f;
        }
        return new djb(n2, nns.j(e.f()), n5);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof djb) {
            final djb djb = (djb)o;
            if (this.c == djb.c && nqb.t(this.a, djb.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(djb.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long c = this.c;
        return Float.floatToIntBits(this.b) ^ (((int)(c ^ c >>> 32) ^ 0xF4243) * 1000003 ^ this.a.hashCode()) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long c = this.c;
        final String value = String.valueOf(this.a);
        final float b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 98);
        sb.append("FaceMetadata{timestampNs=");
        sb.append(c);
        sb.append(", faces=");
        sb.append(value);
        sb.append(", normalizingRectAspectRatio=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
