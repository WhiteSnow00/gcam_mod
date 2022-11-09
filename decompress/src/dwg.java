import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;

// 
// Decompiled by Procyon v0.6.0
// 

final class dwg
{
    public final RawWriteView a;
    public final FrameMetadata b;
    public final SpatialGainMap c;
    public final AeShotParams d;
    public final float e;
    
    public dwg() {
    }
    
    public dwg(final RawWriteView a, final FrameMetadata b, final SpatialGainMap c, final AeShotParams d, final float e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof dwg) {
            final dwg dwg = (dwg)o;
            if (this.a.equals(dwg.a) && this.b.equals(dwg.b) && this.c.equals(dwg.c) && this.d.equals(dwg.d) && Float.floatToIntBits(this.e) == Float.floatToIntBits(dwg.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ Float.floatToIntBits(this.e);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final float e = this.e;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 111 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length());
        sb.append("HdrPlusViewfinderFrame{rawWriteView=");
        sb.append(value);
        sb.append(", metadata=");
        sb.append(value2);
        sb.append(", spatialGainMap=");
        sb.append(value3);
        sb.append(", aeShotParams=");
        sb.append(value4);
        sb.append(", viewfinderTet=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
