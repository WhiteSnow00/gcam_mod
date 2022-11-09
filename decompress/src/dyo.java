import java.util.Collection;
import java.util.List;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.RawReadView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyo
{
    public final RawReadView a;
    public final ShotMetadata b;
    public final nns c;
    
    public dyo() {
    }
    
    public dyo(final RawReadView a, final ShotMetadata b, final nns c) {
        if (a == null) {
            throw new NullPointerException("Null rawImage");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null shotMetadata");
        }
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null payloadTimestamps");
    }
    
    public static dyo a(final RawReadView rawReadView, final ShotMetadata shotMetadata, final List list) {
        return new dyo(rawReadView, shotMetadata, nns.j(list));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof dyo) {
            final dyo dyo = (dyo)o;
            if (this.a.equals(dyo.a) && this.b.equals(dyo.b) && nqb.t(this.c, dyo.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 55 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("InputData{rawImage=");
        sb.append(value);
        sb.append(", shotMetadata=");
        sb.append(value2);
        sb.append(", payloadTimestamps=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
