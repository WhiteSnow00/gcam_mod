import java.util.Locale;
import java.util.Arrays;
import android.hardware.camera2.CaptureRequest$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kws
{
    public final CaptureRequest$Key a;
    public final Object b;
    
    public kws(final CaptureRequest$Key a, final Object b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final String a() {
        return this.a.getName();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof kws)) {
            return false;
        }
        final kws kws = (kws)o;
        return nqb.E(this.a.getName(), kws.a.getName()) && nqb.E(this.b, kws.b);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a.getName(), this.b });
    }
    
    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "%s: %s", this.a.getName(), this.b);
    }
}
